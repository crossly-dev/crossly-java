package net.crossly.client;

import java.util.List;
import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

/**
 * A failed Crossly API call, read from the API's error envelope:
 *
 * <pre>{ "error": { "code", "message", "details" }, "correlationId" }</pre>
 *
 * {@link #getCode()} is the stable machine code to branch on ({@code validation_error}, {@code not_found},
 * {@code rate_limited}, ...); {@link #getCorrelationId()} is what Crossly support needs to find the request. A
 * request that never got a response (DNS, TLS, a timeout after every retry) has status 0 and code
 * {@code network_error}.
 *
 * Shared, byte for byte, by the seller and buyer packages.
 */
public class CrosslyException extends RuntimeException {
  private static final long serialVersionUID = 1L;

  private final int status;
  private final String code;
  private final JsonElement details;
  private final String correlationId;
  private final Long retryAfterSeconds;
  private final String responseBody;

  public CrosslyException(
      int status,
      String code,
      String message,
      JsonElement details,
      String correlationId,
      Long retryAfterSeconds,
      String responseBody,
      Throwable cause) {
    super(message, cause);
    this.status = status;
    this.code = code;
    this.details = details;
    this.correlationId = correlationId;
    this.retryAfterSeconds = retryAfterSeconds;
    this.responseBody = responseBody;
  }

  /** Build one from an HTTP status, the response body and headers (any of them may be null). */
  public static CrosslyException of(
      int status, String body, Map<String, List<String>> headers, Throwable cause) {
    String code = status == 0 ? "network_error" : "http_" + status;
    String message = null;
    JsonElement details = null;
    String correlationId = header(headers, "x-correlation-id");
    if (body != null && !body.isEmpty()) {
      try {
        JsonElement root = JsonParser.parseString(body);
        if (root.isJsonObject()) {
          JsonObject o = root.getAsJsonObject();
          if (o.has("correlationId") && o.get("correlationId").isJsonPrimitive()) {
            correlationId = o.get("correlationId").getAsString();
          }
          JsonElement e = o.get("error");
          if (e != null && e.isJsonObject()) {
            JsonObject err = e.getAsJsonObject();
            if (err.has("code") && err.get("code").isJsonPrimitive()) code = err.get("code").getAsString();
            if (err.has("message") && err.get("message").isJsonPrimitive()) message = err.get("message").getAsString();
            if (err.has("details") && !err.get("details").isJsonNull()) details = err.get("details");
          } else if (e != null && e.isJsonPrimitive()) {
            message = e.getAsString();
          }
        }
      } catch (RuntimeException notJson) {
        message = body.length() > 300 ? body.substring(0, 300) : body;
      }
    }
    if (message == null) {
      message = status == 0 ? (cause != null ? String.valueOf(cause.getMessage()) : "request failed") : "HTTP " + status;
    }
    long retryMillis = CrosslyHttp.retryAfterMillis(header(headers, "retry-after"));
    Long retryAfter = retryMillis < 0 ? null : (retryMillis + 999) / 1000;
    String full = code + ": " + message + (status > 0 ? " (HTTP " + status + ")" : "")
        + (correlationId != null ? " [correlationId " + correlationId + "]" : "");
    return new CrosslyException(status, code, full, details, correlationId, retryAfter, body, cause);
  }

  private static String header(Map<String, List<String>> headers, String name) {
    if (headers == null) return null;
    for (Map.Entry<String, List<String>> h : headers.entrySet()) {
      if (h.getKey() != null && h.getKey().equalsIgnoreCase(name) && h.getValue() != null && !h.getValue().isEmpty()) {
        return h.getValue().get(0);
      }
    }
    return null;
  }

  /** HTTP status, or 0 when no response arrived. */
  public int getStatus() {
    return status;
  }

  /** The API's machine-readable error code, e.g. {@code validation_error}. */
  public String getCode() {
    return code;
  }

  /** {@code error.details} from the envelope (field errors, limits, ...), or null. */
  public JsonElement getDetails() {
    return details;
  }

  /** Quote this to Crossly support; it threads the request through the server logs. */
  public String getCorrelationId() {
    return correlationId;
  }

  /** Seconds the API asked to wait (429 / 503), or null. */
  public Long getRetryAfterSeconds() {
    return retryAfterSeconds;
  }

  /** The raw response body, or null. */
  public String getResponseBody() {
    return responseBody;
  }
}
