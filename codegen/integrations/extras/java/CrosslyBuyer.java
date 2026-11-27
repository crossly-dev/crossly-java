package net.crossly.buyer;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Stream;

import net.crossly.client.CrosslyException;
import net.crossly.client.CrosslyHttp;
import net.crossly.client.Pages;
import okhttp3.OkHttpClient;

/**
 * The Crossly buyer client: a configured {@link ApiClient} plus retries, idempotency keys, auto-pagination and
 * typed errors around the generated API classes.
 *
 * <pre>{@code
 * CrosslyBuyer crossly = CrosslyBuyer.builder().token(System.getenv("CROSSLY_TOKEN")).build();
 * BuyerApi buyer = crossly.api(BuyerApi::new);
 * }</pre>
 *
 * The seller twin is {@code net.crossly.Crossly} (same file, other package): keep the two in step.
 */
public final class CrosslyBuyer {
  /** This package's version, from the jar manifest ("dev" when run from source). */
  public static final String VERSION = versionOf(CrosslyBuyer.class);

  public static final String USER_AGENT = "crossly-java/" + VERSION;

  private final ApiClient apiClient;

  private CrosslyBuyer(Builder b) {
    if (b.token == null || b.token.trim().isEmpty()) {
      throw new IllegalArgumentException(
          "A Crossly buyer token is required: a buyer OAuth token (crossly_oat_...) with buyer:* scopes. "
              + "A seller Personal Access Token is refused by the buyer API.");
    }
    ApiClient client = new ApiClient();
    if (b.baseUrl != null) client.setBasePath(b.baseUrl);
    client.setBearerToken(b.token.trim());
    String ua = b.userAgentSuffix == null ? USER_AGENT : USER_AGENT + " " + b.userAgentSuffix;
    client.setUserAgent(ua);
    OkHttpClient http = client.getHttpClient().newBuilder()
        .connectTimeout(b.connectTimeout.toMillis(), TimeUnit.MILLISECONDS)
        .readTimeout(b.timeout.toMillis(), TimeUnit.MILLISECONDS)
        .writeTimeout(b.timeout.toMillis(), TimeUnit.MILLISECONDS)
        .addInterceptor(new CrosslyHttp(b.maxRetries, b.maxRetryAfter.toMillis(), ua))
        .build();
    client.setHttpClient(http);
    this.apiClient = client;
  }

  public static Builder builder() {
    return new Builder();
  }

  /** A client from the CROSSLY_TOKEN environment variable, with the defaults. */
  public static CrosslyBuyer fromEnv() {
    return builder().token(System.getenv("CROSSLY_TOKEN")).build();
  }

  /** The configured generated client, for anything the facade does not wrap. */
  public ApiClient apiClient() {
    return apiClient;
  }

  /** An API class on this client: {@code crossly.api(ListingsApi::new)}. */
  public <A> A api(Function<ApiClient, A> constructor) {
    return constructor.apply(apiClient);
  }

  /** Run one call, turning {@link ApiException} into the unchecked {@link CrosslyException}. */
  public <R> R call(ApiCall<R> call) {
    try {
      return call.call();
    } catch (ApiException e) {
      throw toCrossly(e);
    }
  }

  /** Every item of a list endpoint, fetched page by page as the iteration reaches it. */
  public <R, T> Iterable<T> paginate(PageCall<R> fetch, Function<R, List<T>> items) {
    return paginate(Pages.DEFAULT_LIMIT, fetch, items);
  }

  public <R, T> Iterable<T> paginate(int limit, PageCall<R> fetch, Function<R, List<T>> items) {
    return Pages.iterate(limit, fetch::fetch, items, CrosslyBuyer::translate);
  }

  /** {@link #paginate} as a lazy, sequential Stream. */
  public <R, T> Stream<T> stream(PageCall<R> fetch, Function<R, List<T>> items) {
    return stream(Pages.DEFAULT_LIMIT, fetch, items);
  }

  public <R, T> Stream<T> stream(int limit, PageCall<R> fetch, Function<R, List<T>> items) {
    return Pages.stream(limit, fetch::fetch, items, CrosslyBuyer::translate);
  }

  /**
   * Make the writes inside {@code call} (on this thread) use {@code key} as their Idempotency-Key, so a retry after a
   * crash cannot create a second order or charge. Without it every POST/PATCH already gets a fresh key per call.
   */
  public static <R> R withIdempotencyKey(String key, ApiCall<R> call) throws ApiException {
    return CrosslyHttp.withIdempotencyKey(key, call::call);
  }

  /** The typed form of a generated client failure. */
  public static CrosslyException toCrossly(ApiException e) {
    return CrosslyException.of(e.getCode(), e.getResponseBody(), e.getResponseHeaders(), e);
  }

  private static RuntimeException translate(Exception e) {
    if (e instanceof ApiException) return toCrossly((ApiException) e);
    if (e instanceof RuntimeException) return (RuntimeException) e;
    return new CrosslyException(0, "network_error", String.valueOf(e.getMessage()), null, null, null, null, e);
  }

  private static String versionOf(Class<?> c) {
    Package p = c.getPackage();
    String v = p == null ? null : p.getImplementationVersion();
    return v == null ? "dev" : v;
  }

  /** One generated-client call. */
  @FunctionalInterface
  public interface ApiCall<R> {
    R call() throws ApiException;
  }

  /** Fetch one page of a list endpoint. */
  @FunctionalInterface
  public interface PageCall<R> {
    R fetch(int page, int limit) throws ApiException;
  }

  public static final class Builder {
    private String token;
    private String baseUrl;
    private int maxRetries = 3;
    private Duration timeout = Duration.ofSeconds(30);
    private Duration connectTimeout = Duration.ofSeconds(10);
    private Duration maxRetryAfter = Duration.ofSeconds(60);
    private String userAgentSuffix;

    private Builder() {}

    /** A buyer OAuth token ({@code crossly_oat_...}) with {@code buyer:*} scopes. */
    public Builder token(String token) {
      this.token = token;
      return this;
    }

    /** Default https://crossly.net/api. */
    public Builder baseUrl(String baseUrl) {
      this.baseUrl = baseUrl;
      return this;
    }

    /** Retries after a 429, a 5xx or a connection failure (default 3; 0 turns retrying off). */
    public Builder maxRetries(int maxRetries) {
      this.maxRetries = maxRetries;
      return this;
    }

    /** Read and write timeout of each attempt (default 30 s). */
    public Builder timeout(Duration timeout) {
      this.timeout = timeout;
      return this;
    }

    /** Connect timeout of each attempt (default 10 s). */
    public Builder connectTimeout(Duration connectTimeout) {
      this.connectTimeout = connectTimeout;
      return this;
    }

    /** The longest Retry-After the client will wait out (default 60 s); a longer one is returned as the error. */
    public Builder maxRetryAfter(Duration maxRetryAfter) {
      this.maxRetryAfter = maxRetryAfter;
      return this;
    }

    /** Appended to the User-Agent, e.g. "my-app/1.4". */
    public Builder userAgent(String suffix) {
      this.userAgentSuffix = suffix;
      return this;
    }

    public CrosslyBuyer build() {
      return new CrosslyBuyer(this);
    }
  }
}
