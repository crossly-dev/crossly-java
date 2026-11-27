// Print every listing in your Crossly store; pages are fetched as the loop reaches them.
//
//   <dependency><groupId>net.crossly</groupId><artifactId>crossly</artifactId></dependency>
//   CROSSLY_TOKEN=crossly_pat_... java -cp <classpath> ListListings.java

import net.crossly.Crossly;
import net.crossly.api.ListingsApi;
import net.crossly.client.CrosslyException;
import net.crossly.model.listing.ListListingsItem;
import net.crossly.model.listing.ListListingsResponse;

public class ListListings {
  public static void main(String[] args) {
    Crossly crossly = Crossly.builder().token(System.getenv("CROSSLY_TOKEN")).build();
    ListingsApi listings = crossly.api(ListingsApi::new);

    try {
      // One page, the plain generated call: (page, limit, platform, status, sku, updatedSince, kind, tag, stillLive).
      ListListingsResponse first = crossly.call(() -> listings.listListings(1, 25, null, null, null, null, null, null, null));
      System.out.println("first page: " + first.getData().size() + " listings");

      // Every page, lazily.
      Iterable<ListListingsItem> all = crossly.paginate(
          (page, limit) -> listings.listListings(page, limit, null, null, null, null, null, null, null),
          ListListingsResponse::getData);
      for (ListListingsItem item : all) {
        System.out.println(item.getId() + "  " + item.getStatus() + "  " + item.getTitle());
      }
    } catch (CrosslyException e) {
      // e.getCode() is the API's machine code; quote e.getCorrelationId() to support.
      System.err.println(e.getStatus() + " " + e.getCode() + " " + e.getMessage() + " " + e.getCorrelationId());
      System.exit(1);
    }
  }
}
