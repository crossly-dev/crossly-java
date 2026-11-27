// Receive Crossly webhooks with any Jakarta Servlet 5+ container (Tomcat 10+, Jetty 11+): the filter verifies the
// Crossly-Signature before the servlet runs and answers 400 to anything that does not verify.

import java.io.IOException;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import net.crossly.webhooks.CrosslyWebhookFilter;

public class WebhookServlet {

  @WebListener
  public static class Setup implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
      sce.getServletContext()
          .addFilter("crossly-webhooks", new CrosslyWebhookFilter(System.getenv("CROSSLY_WEBHOOK_SECRET")))
          .addMappingForUrlPatterns(null, false, "/webhooks/crossly");
    }
  }

  @WebServlet("/webhooks/crossly")
  public static class Receiver extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
      String event = (String) req.getAttribute(CrosslyWebhookFilter.BODY_ATTRIBUTE);
      System.out.println(event);
      res.setStatus(204);
    }
  }
}
