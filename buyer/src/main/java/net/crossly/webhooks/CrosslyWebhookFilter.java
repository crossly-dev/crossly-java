package net.crossly.webhooks;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ReadListener;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;
import jakarta.servlet.http.HttpServletResponse;

/**
 * A Jakarta Servlet filter that verifies the {@code Crossly-Signature} of every request it is mapped to.
 *
 * A request that does not verify is answered 400 with {@code {"error":{"code":"<reason>"}}} and never reaches your
 * handler. One that does carries the verified JSON body in the request attribute {@link #BODY_ATTRIBUTE}, and its
 * body stays readable downstream ({@code @RequestBody String}, {@code getReader()}), because the filter reads the raw
 * bytes once and replays them.
 *
 * <pre>{@code
 * servletContext.addFilter("crossly-webhooks", new CrosslyWebhookFilter(secret))
 *     .addMappingForUrlPatterns(null, false, "/webhooks/crossly");
 * }</pre>
 *
 * Needs jakarta.servlet 5+ (Spring Boot 3, Tomcat 10+, Jetty 11+) on the classpath; the SDK does not bring it.
 */
public class CrosslyWebhookFilter implements Filter {

  /** Request attribute holding the verified body (a String) after the filter ran. */
  public static final String BODY_ATTRIBUTE = "net.crossly.webhooks.body";

  /** Webhook bodies are small; this stops an unauthenticated caller from making the filter buffer gigabytes. */
  public static final int DEFAULT_MAX_BYTES = 5 * 1024 * 1024;

  private final String secret;
  private final int toleranceSeconds;

  public CrosslyWebhookFilter(String secret) {
    this(secret, CrosslyWebhooks.DEFAULT_TOLERANCE_SECONDS);
  }

  public CrosslyWebhookFilter(String secret, int toleranceSeconds) {
    if (secret == null || secret.isEmpty()) {
      throw new IllegalArgumentException("A webhook signing secret is required (Settings -> Webhooks).");
    }
    this.secret = secret;
    this.toleranceSeconds = toleranceSeconds;
  }

  @Override
  public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
      throws IOException, ServletException {
    if (!(req instanceof HttpServletRequest) || !(res instanceof HttpServletResponse)) {
      chain.doFilter(req, res);
      return;
    }
    HttpServletRequest http = (HttpServletRequest) req;
    HttpServletResponse out = (HttpServletResponse) res;
    byte[] raw = readBody(http.getInputStream(), DEFAULT_MAX_BYTES);
    if (raw == null) {
      reject(out, 413, "payload_too_large");
      return;
    }
    String body;
    try {
      body = CrosslyWebhooks.verify(raw, http.getHeader("Crossly-Signature"), secret, toleranceSeconds, null);
    } catch (CrosslyWebhooks.VerificationException e) {
      reject(out, 400, e.reason);
      return;
    }
    http.setAttribute(BODY_ATTRIBUTE, body);
    chain.doFilter(new CachedBody(http, raw), res);
  }

  private static void reject(HttpServletResponse out, int status, String reason) throws IOException {
    out.setStatus(status);
    out.setContentType("application/json");
    out.setCharacterEncoding("UTF-8");
    out.getWriter().write("{\"error\":{\"code\":\"" + reason + "\",\"message\":\"Crossly webhook rejected\"}}");
  }

  /** The whole stream, or null when it is longer than {@code maxBytes}. */
  public static byte[] readBody(InputStream in, int maxBytes) throws IOException {
    ByteArrayOutputStream buf = new ByteArrayOutputStream();
    byte[] chunk = new byte[8192];
    int n;
    while ((n = in.read(chunk)) != -1) {
      if (buf.size() + n > maxBytes) return null;
      buf.write(chunk, 0, n);
    }
    return buf.toByteArray();
  }

  /** The request with its body replaced by the bytes already read. */
  static final class CachedBody extends HttpServletRequestWrapper {
    private final byte[] body;

    CachedBody(HttpServletRequest request, byte[] body) {
      super(request);
      this.body = body;
    }

    @Override
    public ServletInputStream getInputStream() {
      final ByteArrayInputStream in = new ByteArrayInputStream(body);
      return new ServletInputStream() {
        @Override
        public boolean isFinished() {
          return in.available() == 0;
        }

        @Override
        public boolean isReady() {
          return true;
        }

        @Override
        public void setReadListener(ReadListener listener) {
          try {
            listener.onDataAvailable();
            listener.onAllDataRead();
          } catch (IOException e) {
            listener.onError(e);
          }
        }

        @Override
        public int read() {
          return in.read();
        }

        @Override
        public int read(byte[] b, int off, int len) {
          return in.read(b, off, len);
        }
      };
    }

    @Override
    public BufferedReader getReader() {
      return new BufferedReader(new InputStreamReader(new ByteArrayInputStream(body), StandardCharsets.UTF_8));
    }

    @Override
    public int getContentLength() {
      return body.length;
    }

    @Override
    public long getContentLengthLong() {
      return body.length;
    }
  }
}
