package net.crossly.webhooks;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.time.Instant;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/**
 * Verify a Crossly webhook.
 *
 * <pre>
 *   Crossly-Signature: t=&lt;unix seconds&gt;,v1=&lt;hex HMAC-SHA256&gt;
 * </pre>
 *
 * signed over {@code t + "." + rawBody} with the endpoint's signing secret.
 *
 * <p>Three ways to get this wrong, all silent:
 *
 * <ol>
 *   <li>Verifying a re-serialised body. Any JSON library's parse-then-write
 *       reorders keys and reformats numbers, so genuine payloads fail and the
 *       usual fix is to stop verifying. In a servlet read the InputStream
 *       ONCE, before anything else consumes it; in Spring use
 *       {@code @RequestBody byte[]} rather than a mapped object.
 *   <li>Comparing with {@code equals}. String.equals returns early on the
 *       first differing character; {@link MessageDigest#isEqual} does not.
 *   <li>Ignoring the timestamp. Without it a captured request replays forever.
 *       The timestamp is INSIDE the signed message, so it cannot be edited to
 *       look fresh.
 * </ol>
 *
 * <p>No dependencies beyond the JDK. Deliberately returns the raw JSON rather
 * than a mapped object — this library has no opinion about your JSON mapper,
 * and adding one would make it un-droppable into half the projects that need it.
 */
public final class CrosslyWebhooks {

  public static final int DEFAULT_TOLERANCE_SECONDS = 300;

  private CrosslyWebhooks() {}

  /** Thrown when a webhook does not verify. */
  public static final class VerificationException extends Exception {
    private static final long serialVersionUID = 1L;

    /** malformed_header | bad_signature | timestamp_out_of_tolerance | missing_secret */
    public final String reason;

    VerificationException(String reason, String message) {
      super(message);
      this.reason = reason;
    }
  }

  /**
   * Verify a webhook. Returns the raw body once verified.
   *
   * <p>Throws rather than returning a boolean so a caller who forgets to check
   * a return value does not silently accept forged events.
   *
   * @param rawBody the EXACT bytes received
   * @param signatureHeader the {@code Crossly-Signature} header, verbatim
   * @param secret the endpoint's signing secret
   */
  public static String verify(
      byte[] rawBody, String signatureHeader, String secret, int toleranceSeconds, Long now)
      throws VerificationException {

    if (secret == null || secret.isEmpty()) {
      throw new VerificationException("missing_secret", "A webhook signing secret is required.");
    }
    if (signatureHeader == null || signatureHeader.isEmpty()) {
      throw new VerificationException(
          "malformed_header", "No Crossly-Signature header on the request.");
    }

    long timestamp = -1;
    boolean haveTimestamp = false;
    String provided = null;

    // Field-wise rather than one regex, so a future v2= alongside v1= does not
    // break existing verifiers — the entire reason the scheme is versioned.
    for (String part : signatureHeader.split(",")) {
      int eq = part.indexOf('=');
      if (eq < 0) continue;
      String key = part.substring(0, eq).trim();
      String value = part.substring(eq + 1).trim();

      if ("t".equals(key)) {
        try {
          timestamp = Long.parseLong(value);
          haveTimestamp = true;
        } catch (NumberFormatException e) {
          throw new VerificationException(
              "malformed_header", "Crossly-Signature carries a non-numeric timestamp.");
        }
      } else if ("v1".equals(key)) {
        provided = value;
      }
    }

    if (!haveTimestamp || provided == null || provided.isEmpty()) {
      String preview =
          signatureHeader.length() > 60 ? signatureHeader.substring(0, 60) : signatureHeader;
      throw new VerificationException(
          "malformed_header",
          "Could not parse Crossly-Signature: expected \"t=<unix>,v1=<hex>\", got \""
              + preview
              + "\".");
    }

    String body = new String(rawBody, StandardCharsets.UTF_8);
    String expected = hmacHex(secret, timestamp + "." + body);

    // MessageDigest.isEqual is the constant-time compare in the JDK. It is also
    // safe on a length mismatch, which a truncated signature produces.
    if (!MessageDigest.isEqual(
        expected.getBytes(StandardCharsets.UTF_8), provided.getBytes(StandardCharsets.UTF_8))) {
      throw new VerificationException(
          "bad_signature",
          "Signature did not match. If genuine payloads are failing, you are almost certainly "
              + "verifying a re-serialised body — pass the bytes you read off the wire.");
    }

    // Freshness AFTER the signature, so an attacker learns nothing about
    // timestamps without already holding a valid signature.
    long current = now == null ? Instant.now().getEpochSecond() : now;
    long drift = Math.abs(current - timestamp);
    if (drift > toleranceSeconds) {
      throw new VerificationException(
          "timestamp_out_of_tolerance",
          "Timestamp is "
              + drift
              + "s away from now (tolerance "
              + toleranceSeconds
              + "s). This is a replay guard — if it fires on live traffic, check your server clock.");
    }

    return body;
  }

  /** Convenience overload using the default tolerance and the system clock. */
  public static String verify(byte[] rawBody, String signatureHeader, String secret)
      throws VerificationException {
    return verify(rawBody, signatureHeader, secret, DEFAULT_TOLERANCE_SECONDS, null);
  }

  private static String hmacHex(String secret, String message) {
    try {
      Mac mac = Mac.getInstance("HmacSHA256");
      mac.init(new SecretKeySpec(secret.getBytes(StandardCharsets.UTF_8), "HmacSHA256"));
      byte[] digest = mac.doFinal(message.getBytes(StandardCharsets.UTF_8));
      StringBuilder sb = new StringBuilder(digest.length * 2);
      for (byte b : digest) {
        sb.append(Character.forDigit((b >> 4) & 0xF, 16));
        sb.append(Character.forDigit(b & 0xF, 16));
      }
      return sb.toString();
    } catch (java.security.GeneralSecurityException e) {
      // HmacSHA256 is required by every JDK; if it is absent the runtime is
      // broken in a way this library cannot sensibly report as a bad webhook.
      throw new IllegalStateException("HmacSHA256 unavailable", e);
    }
  }
}
