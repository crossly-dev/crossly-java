package net.crossly.client;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * The OkHttp interceptor behind the Crossly facade: User-Agent, Idempotency-Key and retries.
 *
 * <ul>
 *   <li>Every POST and PATCH carries an {@code Idempotency-Key} (a fresh UUID unless one was set with
 *       {@link #withIdempotencyKey}). The API replays the first response for a repeated key for 24 hours, which is
 *       what makes retrying a write safe; a few money endpoints refuse a write without one.
 *   <li>A 429, 500, 502, 503 or 504, or a connection failure, is retried up to {@code maxRetries} times with
 *       exponential backoff and jitter. A {@code Retry-After} header (seconds or an HTTP date) is honoured; one longer
 *       than {@code maxRetryAfterMillis} is not waited out, and the response is returned as is.
 * </ul>
 *
 * Shared, byte for byte, by the seller and buyer packages. It depends only on OkHttp.
 */
public final class CrosslyHttp implements Interceptor {

  public static final String IDEMPOTENCY_HEADER = "Idempotency-Key";

  private static final ThreadLocal<String> NEXT_KEY = new ThreadLocal<String>();
  private static final long BASE_DELAY_MILLIS = 500;
  private static final long MAX_DELAY_MILLIS = 20_000;

  private final int maxRetries;
  private final long maxRetryAfterMillis;
  private final String userAgent;

  public CrosslyHttp(int maxRetries, long maxRetryAfterMillis, String userAgent) {
    if (maxRetries < 0) throw new IllegalArgumentException("maxRetries must be >= 0");
    this.maxRetries = maxRetries;
    this.maxRetryAfterMillis = maxRetryAfterMillis;
    this.userAgent = userAgent;
  }

  /** A call that may throw a checked exception. */
  @FunctionalInterface
  public interface ThrowingSupplier<R, E extends Exception> {
    R get() throws E;
  }

  /**
   * Run {@code call} with {@code key} as the Idempotency-Key of the writes it makes on this thread. Use it when the
   * key must survive a process restart (derive it from your own order or job id); otherwise every write already gets
   * a fresh one.
   */
  public static <R, E extends Exception> R withIdempotencyKey(String key, ThrowingSupplier<R, E> call) throws E {
    String previous = NEXT_KEY.get();
    NEXT_KEY.set(key);
    try {
      return call.get();
    } finally {
      if (previous == null) NEXT_KEY.remove();
      else NEXT_KEY.set(previous);
    }
  }

  @Override
  public Response intercept(Chain chain) throws IOException {
    Request original = chain.request();
    Request.Builder builder = original.newBuilder();
    if (userAgent != null) builder.header("User-Agent", userAgent);
    String method = original.method();
    boolean write = "POST".equals(method) || "PATCH".equals(method);
    if (write && original.header(IDEMPOTENCY_HEADER) == null) {
      String key = NEXT_KEY.get();
      builder.header(IDEMPOTENCY_HEADER, key != null ? key : UUID.randomUUID().toString());
    }
    Request request = builder.build();

    for (int attempt = 0; ; attempt++) {
      Response response;
      try {
        response = chain.proceed(request);
      } catch (IOException e) {
        if (attempt >= maxRetries || chain.call().isCanceled()) throw e;
        sleep(backoffMillis(attempt));
        continue;
      }
      if (attempt >= maxRetries || !retryableStatus(response.code())) return response;
      long wait = retryAfterMillis(response.header("Retry-After"));
      if (wait > maxRetryAfterMillis) return response;
      if (wait < 0) wait = backoffMillis(attempt);
      response.close();
      sleep(wait);
    }
  }

  static boolean retryableStatus(int status) {
    return status == 429 || status == 500 || status == 502 || status == 503 || status == 504;
  }

  /** Full-jitter exponential backoff: a random delay in [d/2, d], d = 500 ms * 2^attempt, capped at 20 s. */
  static long backoffMillis(int attempt) {
    long d = Math.min(MAX_DELAY_MILLIS, BASE_DELAY_MILLIS << Math.min(attempt, 16));
    return d / 2 + ThreadLocalRandom.current().nextLong(d / 2 + 1);
  }

  /** Retry-After as milliseconds: delta-seconds or an HTTP date (RFC 9110). -1 when absent or unreadable. */
  public static long retryAfterMillis(String value) {
    if (value == null) return -1;
    String v = value.trim();
    if (v.isEmpty()) return -1;
    try {
      return (long) (Double.parseDouble(v) * 1000);
    } catch (NumberFormatException ignored) {
      // Not delta-seconds: try the HTTP-date form below.
    }
    try {
      long at = ZonedDateTime.parse(v, DateTimeFormatter.RFC_1123_DATE_TIME).toInstant().toEpochMilli();
      return Math.max(0, at - System.currentTimeMillis());
    } catch (RuntimeException e) {
      return -1;
    }
  }

  private static void sleep(long millis) throws IOException {
    try {
      Thread.sleep(millis);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new InterruptedIOException("interrupted while waiting to retry");
    }
  }
}
