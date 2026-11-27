# StorefrontApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createStorefrontHighlight**](StorefrontApi.md#createStorefrontHighlight) | **POST** /v1/storefront/highlights | Create a highlight: title (up to 24 characters), optional coverUrl, and optional storyIds (your live or archived stories) to save into it. Up to 50 per store.
[**createStorefrontHighlightItem**](StorefrontApi.md#createStorefrontHighlightItem) | **POST** /v1/storefront/highlights/{id}/items | Save stories into a highlight (appended in the order given). Each is copied, so it stays after the story expires. A story already in the highlight is skipped.
[**createStorefrontProfileSuggestShelve**](StorefrontApi.md#createStorefrontProfileSuggestShelve) | **POST** /v1/storefront/profile/suggest-shelves | Profile shelves proposed from your top tags and categories (not saved).
[**createStorefrontSection**](StorefrontApi.md#createStorefrontSection) | **POST** /v1/storefront/sections | Add a section at the bottom: kind hero | listings | collections | about | policies | social | announcement | faq (default listings), with its config.
[**createStorefrontSitePreview**](StorefrontApi.md#createStorefrontSitePreview) | **POST** /v1/storefront/site/preview | Resolve an unsaved design page like the live site would: every section with its listings and extras (preview: true).
[**createStorefrontSitePublish**](StorefrontApi.md#createStorefrontSitePublish) | **POST** /v1/storefront/site/publish | Publish the draft: it becomes the live site and a publish version is kept (the last 30 versions are kept).
[**createStorefrontSiteResolve**](StorefrontApi.md#createStorefrontSiteResolve) | **POST** /v1/storefront/site/resolve | The live listings a ListingSource (manual, tags, category, smart rule or all) selects from your store, and how many match.
[**createStorefrontSiteStarter**](StorefrontApi.md#createStorefrontSiteStarter) | **POST** /v1/storefront/site/starter | Replace the draft with a starter site (vintage, sneakers, streetwear, collectibles, boutique, home, minimal, drop, general). The current draft is kept as a version first.
[**createStorefrontSiteSuggest**](StorefrontApi.md#createStorefrontSiteSuggest) | **POST** /v1/storefront/site/suggest | Auto-build: website sections proposed from your top tags and categories (not saved).
[**createStorefrontSiteVersionRestore**](StorefrontApi.md#createStorefrontSiteVersionRestore) | **POST** /v1/storefront/site/versions/{id}/restore | Copy a saved version into the draft (the current draft is kept as a version first). Publish to make it live.
[**createStorefrontTradeSitePublish**](StorefrontApi.md#createStorefrontTradeSitePublish) | **POST** /v1/storefront/trade-site/publish | Publish the trade site draft (a version is kept).
[**createStorefrontTradeSiteResolve**](StorefrontApi.md#createStorefrontTradeSiteResolve) | **POST** /v1/storefront/trade-site/resolve | The listings a ListingSource selects on your trade site: only items in your active wholesale catalogs (narrowed further by source.catalogIds), and how many match.
[**createStorefrontTradeSiteStarter**](StorefrontApi.md#createStorefrontTradeSiteStarter) | **POST** /v1/storefront/trade-site/starter | Replace the trade site draft with a trade starter (trade_classic, trade_line_sheet, trade_brand_house, trade_apply_first). The current draft is kept as a version first.
[**createStorefrontTradeSiteSuggest**](StorefrontApi.md#createStorefrontTradeSiteSuggest) | **POST** /v1/storefront/trade-site/suggest | Trade Auto-build: trade site sections proposed from your wholesale catalogs (a spotlight, a rail per catalog, terms, apply banner). Not saved.
[**deleteStorefrontHighlight**](StorefrontApi.md#deleteStorefrontHighlight) | **DELETE** /v1/storefront/highlights/{id} | Delete a highlight and its saved stories. The original stories are unaffected.
[**deleteStorefrontHighlightItem**](StorefrontApi.md#deleteStorefrontHighlightItem) | **DELETE** /v1/storefront/highlights/{id}/items/{itemId} | Remove one saved story from a highlight.
[**deleteStorefrontSection**](StorefrontApi.md#deleteStorefrontSection) | **DELETE** /v1/storefront/sections/{id} | Remove a section. Listings on a removed shelf stay live.
[**getStorefront**](StorefrontApi.md#getStorefront) | **GET** /v1/storefront | Your storefront design: banner, logo, tagline, bio, theme, SEO title and description, social links, and whether it is published.
[**getStorefrontMerch**](StorefrontApi.md#getStorefrontMerch) | **GET** /v1/storefront/merch | Your store&#39;s live listings by tag, category, condition and brand, with the price range: what product sources can select.
[**getStorefrontProfile**](StorefrontApi.md#getStorefrontProfile) | **GET** /v1/storefront/profile | Your shop profile (the Crossly Shop page): banner, logo, tagline, bio, accent, announcement, shelves, blocks and All items options.
[**getStorefrontShipping**](StorefrontApi.md#getStorefrontShipping) | **GET** /v1/storefront/shipping | Your Crossly shipping policy (domestic and international services, which countries you ship to) and your default ship-from address.
[**getStorefrontSite**](StorefrontApi.md#getStorefrontSite) | **GET** /v1/storefront/site | Your store website: the draft design, what is live, when each changed, whether the site is switched on, and its custom domain.
[**getStorefrontTradeSite**](StorefrontApi.md#getStorefrontTradeSite) | **GET** /v1/storefront/trade-site | Your store&#39;s trade (wholesale) site at /site/:slug/trade: the draft, what is live, whether it is on and its gating (public | prices_private | approved_only).
[**listStorefrontHighlights**](StorefrontApi.md#listStorefrontHighlights) | **GET** /v1/storefront/highlights | Your store’s story highlights in display order, each with its saved stories (media, overlays, product tie-in, when posted). Empty highlights included.
[**listStorefrontSections**](StorefrontApi.md#listStorefrontSections) | **GET** /v1/storefront/sections | Your storefront sections in display order: kind, title, visible, config, and listing ids for listings shelves.
[**listStorefrontSiteVersions**](StorefrontApi.md#listStorefrontSiteVersions) | **GET** /v1/storefront/site/versions | Saved versions of the website, newest first (publish, restore and template points; up to 30).
[**listStorefrontStoryArchive**](StorefrontApi.md#listStorefrontStoryArchive) | **GET** /v1/storefront/stories/archive | Your stories, live and expired, newest first: what can be saved to a highlight. Paginated: pass before &#x3D; meta.nextCursor of the previous page.
[**updateStorefront**](StorefrontApi.md#updateStorefront) | **PUT** /v1/storefront | Update your storefront design. Omitted fields are unchanged, null clears. published&#x3D;false keeps the design as a draft and buyers see the standard storefront.
[**updateStorefrontHighlight**](StorefrontApi.md#updateStorefrontHighlight) | **PATCH** /v1/storefront/highlights/{id} | Rename a highlight or change its cover (coverUrl null &#x3D; use the first story).
[**updateStorefrontHighlightItemOrder**](StorefrontApi.md#updateStorefrontHighlightItemOrder) | **PUT** /v1/storefront/highlights/{id}/items/order | Set the order of a highlight’s saved stories: every item id, first to last.
[**updateStorefrontHighlightOrder**](StorefrontApi.md#updateStorefrontHighlightOrder) | **PUT** /v1/storefront/highlights/order | Set the highlight order in one call: every highlight id, first to last.
[**updateStorefrontProfile**](StorefrontApi.md#updateStorefrontProfile) | **PUT** /v1/storefront/profile | Replace your shop profile (a complete ShopProfile). Saved straight away.
[**updateStorefrontSection**](StorefrontApi.md#updateStorefrontSection) | **PATCH** /v1/storefront/sections/{id} | Rename, show/hide, refill (listings shelves) or reconfigure a section.
[**updateStorefrontSectionReorder**](StorefrontApi.md#updateStorefrontSectionReorder) | **PUT** /v1/storefront/sections/reorder | Set the section order in one atomic call: every section id, top to bottom.
[**updateStorefrontShipping**](StorefrontApi.md#updateStorefrontShipping) | **PUT** /v1/storefront/shipping | Set your shipping policy (international.enabled, shipsTo worldwide or ISO codes, excludes) and/or your default ship-from address (any country; 422 for a sanctioned origin).
[**updateStorefrontSiteDraft**](StorefrontApi.md#updateStorefrontSiteDraft) | **PUT** /v1/storefront/site/draft | Save the website draft (a complete SiteDesign). Validated strictly (a bad field is a 400 naming its path) and sanitized; buyers see nothing until you publish.
[**updateStorefrontSiteEnabled**](StorefrontApi.md#updateStorefrontSiteEnabled) | **PUT** /v1/storefront/site/enabled | Switch the website on or off. On requires a publish first; off makes /site/:slug 404 and the custom domain show the shop profile.
[**updateStorefrontTradeSiteDraft**](StorefrontApi.md#updateStorefrontTradeSiteDraft) | **PUT** /v1/storefront/trade-site/draft | Save the trade site draft (a complete SiteDesign; trade sections included). Validated strictly and sanitized.
[**updateStorefrontTradeSiteEnabled**](StorefrontApi.md#updateStorefrontTradeSiteEnabled) | **PUT** /v1/storefront/trade-site/enabled | Switch the trade site on (needs a publish first) or off.
[**updateStorefrontTradeSiteGating**](StorefrontApi.md#updateStorefrontTradeSiteGating) | **PUT** /v1/storefront/trade-site/gating | Who sees the trade site: public (everyone, with prices), prices_private (everyone, prices for approved buyers) or approved_only (approved buyers; others get the apply page).


<a name="createStorefrontHighlight"></a>
# **createStorefrontHighlight**
> CreateStorefrontHighlightResponse createStorefrontHighlight()

Create a highlight: title (up to 24 characters), optional coverUrl, and optional storyIds (your live or archived stories) to save into it. Up to 50 per store.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    try {
      CreateStorefrontHighlightResponse result = apiInstance.createStorefrontHighlight();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#createStorefrontHighlight");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateStorefrontHighlightResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="createStorefrontHighlightItem"></a>
# **createStorefrontHighlightItem**
> StorefrontHighlightResponse createStorefrontHighlightItem(id)

Save stories into a highlight (appended in the order given). Each is copied, so it stays after the story expires. A story already in the highlight is skipped.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      StorefrontHighlightResponse result = apiInstance.createStorefrontHighlightItem(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#createStorefrontHighlightItem");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**StorefrontHighlightResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="createStorefrontProfileSuggestShelve"></a>
# **createStorefrontProfileSuggestShelve**
> CreateStorefrontProfileSuggestShelveResponse createStorefrontProfileSuggestShelve()

Profile shelves proposed from your top tags and categories (not saved).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    try {
      CreateStorefrontProfileSuggestShelveResponse result = apiInstance.createStorefrontProfileSuggestShelve();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#createStorefrontProfileSuggestShelve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateStorefrontProfileSuggestShelveResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="createStorefrontSection"></a>
# **createStorefrontSection**
> StorefrontSectionResponse createStorefrontSection()

Add a section at the bottom: kind hero | listings | collections | about | policies | social | announcement | faq (default listings), with its config.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    try {
      StorefrontSectionResponse result = apiInstance.createStorefrontSection();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#createStorefrontSection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**StorefrontSectionResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="createStorefrontSitePreview"></a>
# **createStorefrontSitePreview**
> CreateStorefrontSitePreviewResponse createStorefrontSitePreview()

Resolve an unsaved design page like the live site would: every section with its listings and extras (preview: true).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    try {
      CreateStorefrontSitePreviewResponse result = apiInstance.createStorefrontSitePreview();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#createStorefrontSitePreview");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateStorefrontSitePreviewResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="createStorefrontSitePublish"></a>
# **createStorefrontSitePublish**
> StorefrontResponse2 createStorefrontSitePublish()

Publish the draft: it becomes the live site and a publish version is kept (the last 30 versions are kept).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    try {
      StorefrontResponse2 result = apiInstance.createStorefrontSitePublish();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#createStorefrontSitePublish");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**StorefrontResponse2**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="createStorefrontSiteResolve"></a>
# **createStorefrontSiteResolve**
> CreateStorefrontSiteResolveResponse createStorefrontSiteResolve()

The live listings a ListingSource (manual, tags, category, smart rule or all) selects from your store, and how many match.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    try {
      CreateStorefrontSiteResolveResponse result = apiInstance.createStorefrontSiteResolve();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#createStorefrontSiteResolve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateStorefrontSiteResolveResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="createStorefrontSiteStarter"></a>
# **createStorefrontSiteStarter**
> StorefrontResponse2 createStorefrontSiteStarter()

Replace the draft with a starter site (vintage, sneakers, streetwear, collectibles, boutique, home, minimal, drop, general). The current draft is kept as a version first.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    try {
      StorefrontResponse2 result = apiInstance.createStorefrontSiteStarter();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#createStorefrontSiteStarter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**StorefrontResponse2**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="createStorefrontSiteSuggest"></a>
# **createStorefrontSiteSuggest**
> CreateStorefrontSiteSuggestResponse createStorefrontSiteSuggest()

Auto-build: website sections proposed from your top tags and categories (not saved).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    try {
      CreateStorefrontSiteSuggestResponse result = apiInstance.createStorefrontSiteSuggest();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#createStorefrontSiteSuggest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateStorefrontSiteSuggestResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="createStorefrontSiteVersionRestore"></a>
# **createStorefrontSiteVersionRestore**
> StorefrontResponse3 createStorefrontSiteVersionRestore(id)

Copy a saved version into the draft (the current draft is kept as a version first). Publish to make it live.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      StorefrontResponse3 result = apiInstance.createStorefrontSiteVersionRestore(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#createStorefrontSiteVersionRestore");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**StorefrontResponse3**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="createStorefrontTradeSitePublish"></a>
# **createStorefrontTradeSitePublish**
> StorefrontResponse2 createStorefrontTradeSitePublish()

Publish the trade site draft (a version is kept).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    try {
      StorefrontResponse2 result = apiInstance.createStorefrontTradeSitePublish();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#createStorefrontTradeSitePublish");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**StorefrontResponse2**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="createStorefrontTradeSiteResolve"></a>
# **createStorefrontTradeSiteResolve**
> CreateStorefrontSiteResolveResponse createStorefrontTradeSiteResolve()

The listings a ListingSource selects on your trade site: only items in your active wholesale catalogs (narrowed further by source.catalogIds), and how many match.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    try {
      CreateStorefrontSiteResolveResponse result = apiInstance.createStorefrontTradeSiteResolve();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#createStorefrontTradeSiteResolve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateStorefrontSiteResolveResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="createStorefrontTradeSiteStarter"></a>
# **createStorefrontTradeSiteStarter**
> StorefrontResponse2 createStorefrontTradeSiteStarter()

Replace the trade site draft with a trade starter (trade_classic, trade_line_sheet, trade_brand_house, trade_apply_first). The current draft is kept as a version first.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    try {
      StorefrontResponse2 result = apiInstance.createStorefrontTradeSiteStarter();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#createStorefrontTradeSiteStarter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**StorefrontResponse2**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="createStorefrontTradeSiteSuggest"></a>
# **createStorefrontTradeSiteSuggest**
> CreateStorefrontSiteSuggestResponse createStorefrontTradeSiteSuggest()

Trade Auto-build: trade site sections proposed from your wholesale catalogs (a spotlight, a rail per catalog, terms, apply banner). Not saved.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    try {
      CreateStorefrontSiteSuggestResponse result = apiInstance.createStorefrontTradeSiteSuggest();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#createStorefrontTradeSiteSuggest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateStorefrontSiteSuggestResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="deleteStorefrontHighlight"></a>
# **deleteStorefrontHighlight**
> DeleteStoryResponse deleteStorefrontHighlight(id)

Delete a highlight and its saved stories. The original stories are unaffected.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      DeleteStoryResponse result = apiInstance.deleteStorefrontHighlight(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#deleteStorefrontHighlight");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**DeleteStoryResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="deleteStorefrontHighlightItem"></a>
# **deleteStorefrontHighlightItem**
> StorefrontHighlightResponse deleteStorefrontHighlightItem(id, itemId)

Remove one saved story from a highlight.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    String id = "id_example"; // String | 
    String itemId = "itemId_example"; // String | 
    try {
      StorefrontHighlightResponse result = apiInstance.deleteStorefrontHighlightItem(id, itemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#deleteStorefrontHighlightItem");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **itemId** | **String**|  |

### Return type

**StorefrontHighlightResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="deleteStorefrontSection"></a>
# **deleteStorefrontSection**
> UpdateGroupBuyResponse deleteStorefrontSection(id)

Remove a section. Listings on a removed shelf stay live.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      UpdateGroupBuyResponse result = apiInstance.deleteStorefrontSection(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#deleteStorefrontSection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**UpdateGroupBuyResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="getStorefront"></a>
# **getStorefront**
> GetStorefrontResponse getStorefront()

Your storefront design: banner, logo, tagline, bio, theme, SEO title and description, social links, and whether it is published.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    try {
      GetStorefrontResponse result = apiInstance.getStorefront();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#getStorefront");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetStorefrontResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="getStorefrontMerch"></a>
# **getStorefrontMerch**
> GetStorefrontMerchResponse getStorefrontMerch()

Your store&#39;s live listings by tag, category, condition and brand, with the price range: what product sources can select.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    try {
      GetStorefrontMerchResponse result = apiInstance.getStorefrontMerch();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#getStorefrontMerch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetStorefrontMerchResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="getStorefrontProfile"></a>
# **getStorefrontProfile**
> GetStorefrontProfileResponse getStorefrontProfile()

Your shop profile (the Crossly Shop page): banner, logo, tagline, bio, accent, announcement, shelves, blocks and All items options.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    try {
      GetStorefrontProfileResponse result = apiInstance.getStorefrontProfile();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#getStorefrontProfile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetStorefrontProfileResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="getStorefrontShipping"></a>
# **getStorefrontShipping**
> GetStorefrontShippingResponse getStorefrontShipping()

Your Crossly shipping policy (domestic and international services, which countries you ship to) and your default ship-from address.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    try {
      GetStorefrontShippingResponse result = apiInstance.getStorefrontShipping();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#getStorefrontShipping");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetStorefrontShippingResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="getStorefrontSite"></a>
# **getStorefrontSite**
> StorefrontResponse3 getStorefrontSite()

Your store website: the draft design, what is live, when each changed, whether the site is switched on, and its custom domain.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    try {
      StorefrontResponse3 result = apiInstance.getStorefrontSite();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#getStorefrontSite");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**StorefrontResponse3**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="getStorefrontTradeSite"></a>
# **getStorefrontTradeSite**
> StorefrontResponse3 getStorefrontTradeSite()

Your store&#39;s trade (wholesale) site at /site/:slug/trade: the draft, what is live, whether it is on and its gating (public | prices_private | approved_only).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    try {
      StorefrontResponse3 result = apiInstance.getStorefrontTradeSite();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#getStorefrontTradeSite");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**StorefrontResponse3**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="listStorefrontHighlights"></a>
# **listStorefrontHighlights**
> ListStorefrontHighlightsResponse listStorefrontHighlights()

Your store’s story highlights in display order, each with its saved stories (media, overlays, product tie-in, when posted). Empty highlights included.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    try {
      ListStorefrontHighlightsResponse result = apiInstance.listStorefrontHighlights();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#listStorefrontHighlights");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListStorefrontHighlightsResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="listStorefrontSections"></a>
# **listStorefrontSections**
> StorefrontResponse4 listStorefrontSections()

Your storefront sections in display order: kind, title, visible, config, and listing ids for listings shelves.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    try {
      StorefrontResponse4 result = apiInstance.listStorefrontSections();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#listStorefrontSections");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**StorefrontResponse4**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="listStorefrontSiteVersions"></a>
# **listStorefrontSiteVersions**
> ListStorefrontSiteVersionsResponse listStorefrontSiteVersions()

Saved versions of the website, newest first (publish, restore and template points; up to 30).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    try {
      ListStorefrontSiteVersionsResponse result = apiInstance.listStorefrontSiteVersions();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#listStorefrontSiteVersions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListStorefrontSiteVersionsResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="listStorefrontStoryArchive"></a>
# **listStorefrontStoryArchive**
> ListStorefrontStoryArchiveResponse listStorefrontStoryArchive()

Your stories, live and expired, newest first: what can be saved to a highlight. Paginated: pass before &#x3D; meta.nextCursor of the previous page.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    try {
      ListStorefrontStoryArchiveResponse result = apiInstance.listStorefrontStoryArchive();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#listStorefrontStoryArchive");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListStorefrontStoryArchiveResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="updateStorefront"></a>
# **updateStorefront**
> GetStorefrontResponse updateStorefront()

Update your storefront design. Omitted fields are unchanged, null clears. published&#x3D;false keeps the design as a draft and buyers see the standard storefront.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    try {
      GetStorefrontResponse result = apiInstance.updateStorefront();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#updateStorefront");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetStorefrontResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="updateStorefrontHighlight"></a>
# **updateStorefrontHighlight**
> StorefrontHighlightResponse updateStorefrontHighlight(id)

Rename a highlight or change its cover (coverUrl null &#x3D; use the first story).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      StorefrontHighlightResponse result = apiInstance.updateStorefrontHighlight(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#updateStorefrontHighlight");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**StorefrontHighlightResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="updateStorefrontHighlightItemOrder"></a>
# **updateStorefrontHighlightItemOrder**
> StorefrontHighlightResponse updateStorefrontHighlightItemOrder(id)

Set the order of a highlight’s saved stories: every item id, first to last.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      StorefrontHighlightResponse result = apiInstance.updateStorefrontHighlightItemOrder(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#updateStorefrontHighlightItemOrder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**StorefrontHighlightResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="updateStorefrontHighlightOrder"></a>
# **updateStorefrontHighlightOrder**
> ListStorefrontHighlightsResponse updateStorefrontHighlightOrder()

Set the highlight order in one call: every highlight id, first to last.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    try {
      ListStorefrontHighlightsResponse result = apiInstance.updateStorefrontHighlightOrder();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#updateStorefrontHighlightOrder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListStorefrontHighlightsResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="updateStorefrontProfile"></a>
# **updateStorefrontProfile**
> UpdateStorefrontProfileResponse updateStorefrontProfile()

Replace your shop profile (a complete ShopProfile). Saved straight away.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    try {
      UpdateStorefrontProfileResponse result = apiInstance.updateStorefrontProfile();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#updateStorefrontProfile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**UpdateStorefrontProfileResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="updateStorefrontSection"></a>
# **updateStorefrontSection**
> StorefrontSectionResponse updateStorefrontSection(id)

Rename, show/hide, refill (listings shelves) or reconfigure a section.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      StorefrontSectionResponse result = apiInstance.updateStorefrontSection(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#updateStorefrontSection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**StorefrontSectionResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="updateStorefrontSectionReorder"></a>
# **updateStorefrontSectionReorder**
> StorefrontResponse4 updateStorefrontSectionReorder()

Set the section order in one atomic call: every section id, top to bottom.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    try {
      StorefrontResponse4 result = apiInstance.updateStorefrontSectionReorder();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#updateStorefrontSectionReorder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**StorefrontResponse4**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="updateStorefrontShipping"></a>
# **updateStorefrontShipping**
> GetStorefrontShippingResponse updateStorefrontShipping()

Set your shipping policy (international.enabled, shipsTo worldwide or ISO codes, excludes) and/or your default ship-from address (any country; 422 for a sanctioned origin).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    try {
      GetStorefrontShippingResponse result = apiInstance.updateStorefrontShipping();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#updateStorefrontShipping");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetStorefrontShippingResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="updateStorefrontSiteDraft"></a>
# **updateStorefrontSiteDraft**
> StorefrontResponse2 updateStorefrontSiteDraft()

Save the website draft (a complete SiteDesign). Validated strictly (a bad field is a 400 naming its path) and sanitized; buyers see nothing until you publish.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    try {
      StorefrontResponse2 result = apiInstance.updateStorefrontSiteDraft();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#updateStorefrontSiteDraft");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**StorefrontResponse2**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="updateStorefrontSiteEnabled"></a>
# **updateStorefrontSiteEnabled**
> StorefrontResponse3 updateStorefrontSiteEnabled()

Switch the website on or off. On requires a publish first; off makes /site/:slug 404 and the custom domain show the shop profile.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    try {
      StorefrontResponse3 result = apiInstance.updateStorefrontSiteEnabled();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#updateStorefrontSiteEnabled");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**StorefrontResponse3**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="updateStorefrontTradeSiteDraft"></a>
# **updateStorefrontTradeSiteDraft**
> StorefrontResponse2 updateStorefrontTradeSiteDraft()

Save the trade site draft (a complete SiteDesign; trade sections included). Validated strictly and sanitized.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    try {
      StorefrontResponse2 result = apiInstance.updateStorefrontTradeSiteDraft();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#updateStorefrontTradeSiteDraft");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**StorefrontResponse2**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="updateStorefrontTradeSiteEnabled"></a>
# **updateStorefrontTradeSiteEnabled**
> StorefrontResponse3 updateStorefrontTradeSiteEnabled()

Switch the trade site on (needs a publish first) or off.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    try {
      StorefrontResponse3 result = apiInstance.updateStorefrontTradeSiteEnabled();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#updateStorefrontTradeSiteEnabled");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**StorefrontResponse3**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="updateStorefrontTradeSiteGating"></a>
# **updateStorefrontTradeSiteGating**
> StorefrontResponse3 updateStorefrontTradeSiteGating()

Who sees the trade site: public (everyone, with prices), prices_private (everyone, prices for approved buyers) or approved_only (approved buyers; others get the apply page).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StorefrontApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StorefrontApi apiInstance = new StorefrontApi(defaultClient);
    try {
      StorefrontResponse3 result = apiInstance.updateStorefrontTradeSiteGating();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StorefrontApi#updateStorefrontTradeSiteGating");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**StorefrontResponse3**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

