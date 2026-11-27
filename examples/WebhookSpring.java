// Receive Crossly webhooks in a Spring Boot 3 / Spring MVC 6 app: the argument resolver verifies the
// Crossly-Signature over the raw body before the handler runs, and refuses anything else with 400.
//
//   CROSSLY_WEBHOOK_SECRET=... (Settings -> Webhooks) ; point the endpoint at https://<host>/webhooks/crossly

import java.util.List;

import net.crossly.webhooks.spring.CrosslyWebhook;
import net.crossly.webhooks.spring.CrosslyWebhookArgumentResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebhookSpring {

  @Configuration
  public static class CrosslyWebhookConfig implements WebMvcConfigurer {
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
      resolvers.add(new CrosslyWebhookArgumentResolver(System.getenv("CROSSLY_WEBHOOK_SECRET")));
    }
  }

  @RestController
  public static class CrosslyWebhookController {
    @PostMapping("/webhooks/crossly")
    public ResponseEntity<Void> receive(@CrosslyWebhook String event) {
      // `event` is the verified JSON: parse it with your own mapper ({"id","type","created","data"}).
      System.out.println(event);
      // Answer fast; do slow work after replying, or Crossly retries the delivery.
      return ResponseEntity.noContent().build();
    }
  }
}
