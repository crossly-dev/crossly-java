package net.crossly.webhooks.spring;

import jakarta.servlet.http.HttpServletRequest;
import net.crossly.webhooks.CrosslyWebhookFilter;
import net.crossly.webhooks.CrosslyWebhooks;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.server.ResponseStatusException;

import java.nio.charset.StandardCharsets;

/**
 * Spring MVC argument resolver for {@link CrosslyWebhook @CrosslyWebhook} parameters: reads the raw request body,
 * verifies its {@code Crossly-Signature}, and passes the verified JSON ({@code String}) or bytes ({@code byte[]}) to
 * the handler. A request that does not verify is refused with 400 before the handler runs.
 *
 * Register it from a {@code WebMvcConfigurer}:
 *
 * <pre>{@code
 * public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
 *   resolvers.add(new CrosslyWebhookArgumentResolver(System.getenv("CROSSLY_WEBHOOK_SECRET")));
 * }
 * }</pre>
 *
 * then take the event as a handler parameter annotated {@code @CrosslyWebhook String event}.
 *
 * When {@link CrosslyWebhookFilter} already verified the request, its result is reused. Spring Framework 6 (Boot 3);
 * the SDK does not bring Spring.
 */
public class CrosslyWebhookArgumentResolver implements HandlerMethodArgumentResolver {

  private final String secret;
  private final int toleranceSeconds;

  public CrosslyWebhookArgumentResolver(String secret) {
    this(secret, CrosslyWebhooks.DEFAULT_TOLERANCE_SECONDS);
  }

  public CrosslyWebhookArgumentResolver(String secret, int toleranceSeconds) {
    if (secret == null || secret.isEmpty()) {
      throw new IllegalArgumentException("A webhook signing secret is required (Settings -> Webhooks).");
    }
    this.secret = secret;
    this.toleranceSeconds = toleranceSeconds;
  }

  @Override
  public boolean supportsParameter(MethodParameter parameter) {
    Class<?> type = parameter.getParameterType();
    return parameter.hasParameterAnnotation(CrosslyWebhook.class) && (type == String.class || type == byte[].class);
  }

  @Override
  public Object resolveArgument(
      MethodParameter parameter,
      ModelAndViewContainer mavContainer,
      NativeWebRequest webRequest,
      WebDataBinderFactory binderFactory)
      throws Exception {
    HttpServletRequest request = webRequest.getNativeRequest(HttpServletRequest.class);
    if (request == null) {
      throw new IllegalStateException("@CrosslyWebhook needs a servlet request");
    }
    boolean bytes = parameter.getParameterType() == byte[].class;
    Object verified = request.getAttribute(CrosslyWebhookFilter.BODY_ATTRIBUTE);
    if (verified instanceof String) {
      String body = (String) verified;
      return bytes ? body.getBytes(StandardCharsets.UTF_8) : body;
    }
    byte[] raw = CrosslyWebhookFilter.readBody(request.getInputStream(), CrosslyWebhookFilter.DEFAULT_MAX_BYTES);
    if (raw == null) {
      throw new ResponseStatusException(HttpStatus.PAYLOAD_TOO_LARGE, "payload_too_large");
    }
    try {
      String body = CrosslyWebhooks.verify(raw, request.getHeader("Crossly-Signature"), secret, toleranceSeconds, null);
      request.setAttribute(CrosslyWebhookFilter.BODY_ATTRIBUTE, body);
      return bytes ? raw : body;
    } catch (CrosslyWebhooks.VerificationException e) {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.reason, e);
    }
  }
}
