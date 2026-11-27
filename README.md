# Crossly Java SDK

[![ci](https://github.com/crossly-dev/crossly-java/actions/workflows/ci.yml/badge.svg)](https://github.com/crossly-dev/crossly-java/actions/workflows/ci.yml) [![release](https://github.com/crossly-dev/crossly-java/actions/workflows/release.yml/badge.svg)](https://github.com/crossly-dev/crossly-java/actions/workflows/release.yml) [![Maven Central](https://img.shields.io/maven-central/v/net.crossly/crossly)](https://central.sonatype.com/artifact/net.crossly/crossly) [![license](https://img.shields.io/badge/license-MIT-blue)](LICENSE)

Official Java clients for the [Crossly](https://crossly.net) API: list once and sell across every marketplace, read
orders, manage inventory, and receive signed webhooks. Generated from the public OpenAPI specs and released
automatically when they change, with signed build provenance.

## Install

| client | for | install |
|---|---|---|
| seller | your store: listings, crossposting, orders, analytics | `net.crossly:crossly` |
| buyer | shopping: cart, orders, wishlists, offers, cashback | `net.crossly:crossly-buyer` |

## Two clients, two credentials

| client | credential |
|---|---|
| seller | a Personal Access Token (`crossly_pat_…`, Settings → Developer) or a seller OAuth token |
| buyer | a buyer OAuth token (`crossly_oat_…`) with `buyer:*` scopes |

They are not interchangeable: a seller token is refused by the buyer API and the reverse, even for the same
Crossly account. A 401 from a call that looks right usually means the other client's token.

## First call

```xml
<dependency>
  <groupId>net.crossly</groupId>
  <artifactId>crossly</artifactId>
  <version><!-- latest release --></version>
</dependency>
```

```java
import net.crossly.Crossly;
import net.crossly.api.ListingsApi;
import net.crossly.model.listing.ListListingsItem;
import net.crossly.model.listing.ListListingsResponse;

Crossly crossly = Crossly.builder().token(System.getenv("CROSSLY_TOKEN")).build();  // crossly_pat_…
ListingsApi listings = crossly.api(ListingsApi::new);

// Every listing, page by page as the loop reaches it.
// listListings(page, limit, platform, status, sku, updatedSince, kind, tag, stillLive)
Iterable<ListListingsItem> all = crossly.paginate(
    (page, limit) -> listings.listListings(page, limit, null, null, null, null, null, null, null),
    ListListingsResponse::getData);
for (ListListingsItem item : all) {
  System.out.println(item.getId() + " " + item.getTitle() + " " + item.getStatus());
}
```

`Crossly` configures the generated `ApiClient` (bearer token, `User-Agent: crossly-java/<version>`, timeouts)
and adds what the generated code lacks: a 429, a 5xx or a dropped connection is retried with exponential
backoff that honours `Retry-After`; every POST and PATCH carries an `Idempotency-Key`, so a retried write is
applied once (`Crossly.withIdempotencyKey(key, call)` sets your own); `paginate` / `stream` walk every page.
`crossly.apiClient()` is the generated client itself. The buyer twin is `net.crossly.buyer.CrosslyBuyer`.

List calls return `{ data, pagination }` and page with `page` and `limit`. Money fields named `…_cents` are
integer cents. Generated methods throw the checked `ApiException`; wrap a call in `crossly.call(() -> …)` (pagination does it for you) to get the unchecked `net.crossly.client.CrosslyException` instead, with `getStatus()`, `getCode()` (the API's `error.code`), `getDetails()`, `getRetryAfterSeconds()` and `getCorrelationId()` for support.

## Webhooks

Crossly signs every webhook with `Crossly-Signature: t=<unix>,v1=<hex HMAC-SHA256 of "t.body">`. The verifier
ships in the seller and buyer packages and checks the signature in constant time, rejects a timestamp more than
five minutes old, and returns the parsed event:

```java
import net.crossly.webhooks.CrosslyWebhooks;

// rawBody: the exact bytes received, before any JSON parsing
try {
  String event = CrosslyWebhooks.verify(rawBody, signatureHeader, System.getenv("CROSSLY_WEBHOOK_SECRET"));
} catch (CrosslyWebhooks.VerificationException e) {
  // e.reason: malformed_header | bad_signature | timestamp_out_of_tolerance | missing_secret -> answer 400
}
```

Verify the raw bytes, not a re-serialised body. `webhooks/` holds the same verifier on its own, with the shared
test vectors every language's port is checked against on each build.

## Webhooks in Spring and Servlet apps

Spring MVC 6 / Spring Boot 3: register the argument resolver, and a handler parameter marked `@CrosslyWebhook`
receives the verified JSON (`String`) or bytes (`byte[]`). A request that does not verify is answered 400 and
never reaches the method.

```java
@Configuration
class CrosslyWebhookConfig implements WebMvcConfigurer {
  @Override
  public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
    resolvers.add(new CrosslyWebhookArgumentResolver(System.getenv("CROSSLY_WEBHOOK_SECRET")));
  }
}

@RestController
class CrosslyWebhookController {
  @PostMapping("/webhooks/crossly")
  ResponseEntity<Void> receive(@CrosslyWebhook String event) {
    // parse `event` with your own mapper; answer fast
    return ResponseEntity.noContent().build();
  }
}
```

Any Jakarta Servlet 5+ container: `net.crossly.webhooks.CrosslyWebhookFilter` answers 400 to a request that does
not verify and leaves the verified body in the `CrosslyWebhookFilter.BODY_ATTRIBUTE` request attribute (the
body also stays readable downstream).

```java
servletContext.addFilter("crossly-webhooks", new CrosslyWebhookFilter(System.getenv("CROSSLY_WEBHOOK_SECRET")))
    .addMappingForUrlPatterns(null, false, "/webhooks/crossly");
```

Neither Spring nor the Servlet API is a dependency of the SDK (they are `provided`, optional): your app brings
its own. Runnable versions of all three are in [examples/](examples).

## Where things are

| client | API classes | models | API reference pages |
|---|---|---|---|
| seller | `seller/src/main/java/net/crossly/api/` | `seller/src/main/java/net/crossly/model/<area>/` | `seller/docs/` |
| buyer | `buyer/src/main/java/net/crossly/buyer/api/` | `buyer/src/main/java/net/crossly/buyer/model/<area>/` | `buyer/docs/` |

One class per API group (`OrdersApi`, `ListingsApi`, …), one model per type, the
models grouped one folder per product area (`vault`, `world`, `order`, …). A type
several endpoints share is ONE model, named after where it first appears
(`GetOrderResponse`, `ListOrdersItem`) or, for small shared shapes such as `{ ok }`,
after its fields (`OkResponse`). Each client README lists every method.

## Versions and changelog

Semantic versioning. While the version is 0.x, a release that removes an operation or a model bumps the minor
version; anything else bumps the patch. Every [CHANGELOG](CHANGELOG.md) entry lists the operations and models
that were added, changed or removed in the specs it was generated from.

## Verifying a release

Every release artifact is built on GitHub-hosted runners by [release.yml](.github/workflows/release.yml) and
carries a signed SLSA provenance attestation:

```sh
gh attestation verify <downloaded-file> --repo crossly-dev/crossly-java
```

## Contributing

`seller/`, `buyer/` and `webhooks/` are generated, so a pull request that edits them would be overwritten by the
next release. Open an issue instead: the fix goes into the API spec or the generator, and every language picks it
up. [CONTRIBUTING.md](CONTRIBUTING.md) explains how to regenerate locally.

## More

- API reference and guides: https://crossly.net/docs
- Other languages: https://github.com/crossly-dev
- TypeScript (Node and browsers): [`@crossly/sdk`](https://github.com/crossly-dev/crossly-sdk); command line: [`@crossly/cli`](https://github.com/crossly-dev/crossly-cli); AI agents: [`@crossly/mcp`](https://github.com/crossly-dev/crossly-mcp)

## License

[MIT](LICENSE)
