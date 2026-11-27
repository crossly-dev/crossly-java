# CreatorStudioApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCreatorCardSet**](CreatorStudioApi.md#createCreatorCardSet) | **POST** /v1/creator/cards/sets | Start a card set: a game id (3-24 of a-z, 0-9, -), a set code (MG1) and a name. Answers a starter draft that already passes conformance. Paid seller plans only.
[**createCreatorCardSetArt**](CreatorStudioApi.md#createCreatorCardSetArt) | **POST** /v1/creator/cards/sets/{id}/art/{slug} | One card&#39;s art: a PNG (base64, at most 1 MB and 2048 px), scanned and stored until the version is approved.
[**createCreatorCardSetCheck**](CreatorStudioApi.md#createCreatorCardSetCheck) | **POST** /v1/creator/cards/sets/{id}/check | The full check publish runs: draft issues, tcgStaticConformance and bot-vs-bot games of the set.
[**createCreatorCardSetPublish**](CreatorStudioApi.md#createCreatorCardSetPublish) | **POST** /v1/creator/cards/sets/{id}/publish | Publish: the set must pass its check; it is packaged (game.json, cards.json, the designer rules, art) and submitted as a new immutable version for review, through the same intake as a hand-made card game.
[**createCreatorCreationSubmit**](CreatorStudioApi.md#createCreatorCreationSubmit) | **POST** /v1/creator/creations/{format}/{id}/submit | Send one creation to review through its format&#39;s own submit (wearable, model, decor, interactive, card: its whole set). Games are published from world-kit.
[**createCreatorImport**](CreatorStudioApi.md#createCreatorImport) | **POST** /v1/creator/imports | Validate a filled-in template (manifest text, CSV text, every path in the upload): issues with file, line and column, and a preview. Creates nothing.
[**createCreatorImportCommit**](CreatorStudioApi.md#createCreatorImportCommit) | **POST** /v1/creator/imports/{id}/commit | Create the drafts of a validated template upload (drafts only; nothing is submitted to review).
[**createCreatorItemModel**](CreatorStudioApi.md#createCreatorItemModel) | **POST** /v1/creator/items/models | Upload a .glb (base64, 4 MB): validated, measured and stored (quarantined until approved). An over-budget model is refused with every failing number.
[**createCreatorItemModelCheck**](CreatorStudioApi.md#createCreatorItemModelCheck) | **POST** /v1/creator/items/models/check | The budget report for a .glb (base64), storing nothing: every limit (triangles, draw calls, texture edge per phone/desktop; size, nodes, meshes, images, animations; bones for wearables) with pass/fail, problems and LOD suggestions.
[**createCreatorItemModelSubmit**](CreatorStudioApi.md#createCreatorItemModelSubmit) | **POST** /v1/creator/items/models/{id}/submit | Send an uploaded model to art review.
[**createCreatorItemPreview**](CreatorStudioApi.md#createCreatorItemPreview) | **POST** /v1/creator/items/previews | Upload a preview PNG (base64, at most 1 MB and 2048 px): parsed, scanned and stored on the Crossly CDN; answers its https URL.
[**createCreatorItemWearable**](CreatorStudioApi.md#createCreatorItemWearable) | **POST** /v1/creator/items/wearables | Start a wearable from a template: slug, name, colourways (panel -&gt; #rrggbb), a COSM price and optional edition size. Text is filtered; answers the automated checks. Paid seller plans only.
[**createCreatorItemWearableSubmit**](CreatorStudioApi.md#createCreatorItemWearableSubmit) | **POST** /v1/creator/items/wearables/{id}/submit | Submit a wearable whose checks pass: each colourway becomes a COSM design (inactive) filed for review. Needs an https preview image (POST /v1/creator/items/previews).
[**createCreatorReviewHide**](CreatorStudioApi.md#createCreatorReviewHide) | **POST** /v1/creator/reviews/{reviewId}/hide | Hide a buyer review from your public page (it is kept, and its rating still counts).
[**createCreatorReviewReply**](CreatorStudioApi.md#createCreatorReviewReply) | **POST** /v1/creator/reviews/{reviewId}/reply | Reply to a buyer review of your creation (or change your reply).
[**createCreatorReviewReport**](CreatorStudioApi.md#createCreatorReviewReport) | **POST** /v1/creator/reviews/{reviewId}/report | Report a buyer review to Crossly (abuse, spam, not a real buyer).
[**createCreatorReviewUnhide**](CreatorStudioApi.md#createCreatorReviewUnhide) | **POST** /v1/creator/reviews/{reviewId}/unhide | Show a hidden buyer review on your page again.
[**deleteCreatorCardSet**](CreatorStudioApi.md#deleteCreatorCardSet) | **DELETE** /v1/creator/cards/sets/{id} | Delete a set draft that was never published.
[**deleteCreatorItemModel**](CreatorStudioApi.md#deleteCreatorItemModel) | **DELETE** /v1/creator/items/models/{id} | Delete a draft or rejected model.
[**deleteCreatorItemWearable**](CreatorStudioApi.md#deleteCreatorItemWearable) | **DELETE** /v1/creator/items/wearables/{id} | Delete a draft wearable.
[**getCreatorCardSet**](CreatorStudioApi.md#getCreatorCardSet) | **GET** /v1/creator/cards/sets/{id} | One set draft with its check: draft issues by field and tcgStaticConformance problems.
[**getCreatorCardSetProgress**](CreatorStudioApi.md#getCreatorCardSetProgress) | **GET** /v1/creator/cards/sets/{id}/progress | A set&#39;s three steps: live on COSM, the mint threshold toward NFTs, and the print-run cost (trading_cards estimate) against production funding banked.
[**getCreatorCollection**](CreatorStudioApi.md#getCreatorCollection) | **GET** /v1/creator/collections/{collectionId} | One collection (a card set, a launch or a claimed contract): its six-stage road to the chain, the launch (phase timeline, proceeds, recent mints), sales by marketplace, royalty estimate, holders, its cards or creations with their earnings, holder perks set at mint, and which actions apply.
[**getCreatorCollectionPerk**](CreatorStudioApi.md#getCreatorCollectionPerk) | **GET** /v1/creator/collections/{collectionId}/perks | A collection&#39;s holder perks (percent off at your shop, early access, a World item, a loyalty tier), whether they can be edited, and why not (a card set not started yet, a contract claimed from elsewhere).
[**getCreatorCreation**](CreatorStudioApi.md#getCreatorCreation) | **GET** /v1/creator/creations/{format}/{id} | One creation: its status timeline and review history, the files it uses, where it sells, its sales, its buyer reviews and its mint status.
[**getCreatorCreationStatus**](CreatorStudioApi.md#getCreatorCreationStatus) | **GET** /v1/creator/creations/{format}/{id}/status | Where one creation stands: its status, the reviewer&#39;s last note and its status timeline.
[**getCreatorEarningExport**](CreatorStudioApi.md#getCreatorEarningExport) | **GET** /v1/creator/earnings/export | Download your creator earnings: format&#x3D;csv (every ledger row for the filter) or format&#x3D;pdf (a statement with per-rail totals for the same filter: rail, source, group, gameId, state; period defaults to this month).
[**getCreatorEarningReconcile**](CreatorStudioApi.md#getCreatorEarningReconcile) | **GET** /v1/creator/earnings/reconcile | Reconcile your creator earnings: every source recomputed directly from its own ledger, side by side with the earnings view. ok is true when every source matches.
[**getCreatorImport**](CreatorStudioApi.md#getCreatorImport) | **GET** /v1/creator/imports/{id} | A stored template validation.
[**getCreatorItemModel**](CreatorStudioApi.md#getCreatorItemModel) | **GET** /v1/creator/items/models/{id} | One of your models with its budget report.
[**getCreatorItemTemplate**](CreatorStudioApi.md#getCreatorItemTemplate) | **GET** /v1/creator/items/templates | Wearable templates: each garment the Crossly avatar wears, its recolourable panels, default colours and measured cost (triangles, draw calls, bones, bytes, phone LOD), plus the per-wearable budget.
[**getCreatorItemWearable**](CreatorStudioApi.md#getCreatorItemWearable) | **GET** /v1/creator/items/wearables/{id} | One of your wearables with its checks, review state and note.
[**getCreatorMinting**](CreatorStudioApi.md#getCreatorMinting) | **GET** /v1/creator/minting | Everything you take on chain as collection rows with a six-stage status (designed, eligible, drafted, deploying, live, ended): gettingReady and launched. Game items (source game_item: tradeable game products, NFT declarations for your games) carry href and gameId.
[**getCreatorOverview**](CreatorStudioApi.md#getCreatorOverview) | **GET** /v1/creator/overview | Creator Studio overview: earnings this month and last by rail, live creations, review queue, publish lock and next steps.
[**getCreatorTemplate**](CreatorStudioApi.md#getCreatorTemplate) | **GET** /v1/creator/templates/{format} | The template files for a format (wearable, model, decor, interactive, card_set): crossly-creation.json, creations.csv where it applies, and a README.
[**getCreatorTemplateZip**](CreatorStudioApi.md#getCreatorTemplateZip) | **GET** /v1/creator/templates/{format}/zip | A format&#39;s template as a .zip download (the same files as GET /templates/:format, plus its empty folders).
[**listCreatorCardSets**](CreatorStudioApi.md#listCreatorCardSets) | **GET** /v1/creator/cards/sets | Your card set drafts, each with its road from COSM to print: live on COSM, the mint threshold (collectors, packs opened, resales) and the print-run cost against what NFT sales have banked.
[**listCreatorCreationReviews**](CreatorStudioApi.md#listCreatorCreationReviews) | **GET** /v1/creator/creations/{format}/{id}/reviews | Buyer reviews of one creation, newest first (hidden ones included).
[**listCreatorCreations**](CreatorStudioApi.md#listCreatorCreations) | **GET** /v1/creator/creations | Every creation of your shop in one list: wearables, 3D objects, decor, interactive objects, each card of your card sets, Classic games and card games, with status, collection, rating, earnings and mint status.
[**listCreatorEarningTrend**](CreatorStudioApi.md#listCreatorEarningTrend) | **GET** /v1/creator/earnings/trend | Your creator earnings over time: net (available + paid) per day, week or month (UTC) and rail, for the same filter as the ledger. meta.totals holds the per-rail and per-source totals of that filter.
[**listCreatorEarnings**](CreatorStudioApi.md#listCreatorEarnings) | **GET** /v1/creator/earnings | Your creator earnings ledger across every rail (cash, COSM, CBX), newest first. Each row names the source ledger row it is. meta.totals holds per-rail and per-source totals for the same filter; meta.nextCursor pages.
[**listCreatorItemModels**](CreatorStudioApi.md#listCreatorItemModels) | **GET** /v1/creator/items/models | Your uploaded 3D models with their budget reports and review state.
[**listCreatorItemWearables**](CreatorStudioApi.md#listCreatorItemWearables) | **GET** /v1/creator/items/wearables | Your wearables: drafts, in review, live or with changes requested, each with its automated checks and per-colourway designs.
[**listCreatorItems**](CreatorStudioApi.md#listCreatorItems) | **GET** /v1/creator/items | Every creation of your shop — wearables, decor, uploaded 3D models, interactive objects, Classic games, card games (incl. unpublished designer sets), physical runs — with status, price and earnings.
[**listCreatorReviews**](CreatorStudioApi.md#listCreatorReviews) | **GET** /v1/creator/reviews | Every creator submission (items, interactive objects, Classic games, card games) and its review decision with the reviewer note.
[**updateCreatorCardSet**](CreatorStudioApi.md#updateCreatorCardSet) | **PUT** /v1/creator/cards/sets/{id} | Save the whole draft: cards (name, type, rarity, rules text, flavour, power/draw/guard), COSM prices and supply, frame colours, print plan. Every word goes through the text filter. Art is merged: a card without &#x60;art&#x60; (or with art as read) keeps its stored art, &#x60;art: null&#x60; clears it; only the art upload sets art. Answers the check.
[**updateCreatorCollectionPerk**](CreatorStudioApi.md#updateCreatorCollectionPerk) | **PUT** /v1/creator/collections/{collectionId}/perks | Replace a collection&#39;s holder perks: &#x60;{ perks: [...] }&#x60;, at most one of each type: percent_off { percent 1-50 }, early_access { hours 1-720 }, world_item { creationRef, name }, loyalty_tier { tierId, tierName } (one of your loyalty tiers), each with an optional note. 409 when the collection has no launch yet.
[**updateCreatorItemWearable**](CreatorStudioApi.md#updateCreatorItemWearable) | **PATCH** /v1/creator/items/wearables/{id} | Edit a draft wearable (name, description, colourways, price, edition). Submitted wearables are frozen.


<a name="createCreatorCardSet"></a>
# **createCreatorCardSet**
> CreatorCardSetResponse createCreatorCardSet()

Start a card set: a game id (3-24 of a-z, 0-9, -), a set code (MG1) and a name. Answers a starter draft that already passes conformance. Paid seller plans only.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    try {
      CreatorCardSetResponse result = apiInstance.createCreatorCardSet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#createCreatorCardSet");
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

**CreatorCardSetResponse**

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

<a name="createCreatorCardSetArt"></a>
# **createCreatorCardSetArt**
> CreatorCardSetResponse createCreatorCardSetArt(id, slug)

One card&#39;s art: a PNG (base64, at most 1 MB and 2048 px), scanned and stored until the version is approved.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    String id = "id_example"; // String | 
    String slug = "slug_example"; // String | 
    try {
      CreatorCardSetResponse result = apiInstance.createCreatorCardSetArt(id, slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#createCreatorCardSetArt");
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
 **slug** | **String**|  |

### Return type

**CreatorCardSetResponse**

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

<a name="createCreatorCardSetCheck"></a>
# **createCreatorCardSetCheck**
> CreatorCardSetResponse createCreatorCardSetCheck(id)

The full check publish runs: draft issues, tcgStaticConformance and bot-vs-bot games of the set.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreatorCardSetResponse result = apiInstance.createCreatorCardSetCheck(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#createCreatorCardSetCheck");
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

**CreatorCardSetResponse**

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

<a name="createCreatorCardSetPublish"></a>
# **createCreatorCardSetPublish**
> CreateCreatorCardSetPublishResponse createCreatorCardSetPublish(id)

Publish: the set must pass its check; it is packaged (game.json, cards.json, the designer rules, art) and submitted as a new immutable version for review, through the same intake as a hand-made card game.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateCreatorCardSetPublishResponse result = apiInstance.createCreatorCardSetPublish(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#createCreatorCardSetPublish");
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

**CreateCreatorCardSetPublishResponse**

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

<a name="createCreatorCreationSubmit"></a>
# **createCreatorCreationSubmit**
> CreateCreatorCreationSubmitResponse createCreatorCreationSubmit(format, id)

Send one creation to review through its format&#39;s own submit (wearable, model, decor, interactive, card: its whole set). Games are published from world-kit.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    String format = "format_example"; // String | 
    String id = "id_example"; // String | 
    try {
      CreateCreatorCreationSubmitResponse result = apiInstance.createCreatorCreationSubmit(format, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#createCreatorCreationSubmit");
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
 **format** | **String**|  |
 **id** | **String**|  |

### Return type

**CreateCreatorCreationSubmitResponse**

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

<a name="createCreatorImport"></a>
# **createCreatorImport**
> GetCreatorImportResponse createCreatorImport()

Validate a filled-in template (manifest text, CSV text, every path in the upload): issues with file, line and column, and a preview. Creates nothing.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    try {
      GetCreatorImportResponse result = apiInstance.createCreatorImport();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#createCreatorImport");
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

**GetCreatorImportResponse**

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

<a name="createCreatorImportCommit"></a>
# **createCreatorImportCommit**
> CreateCreatorImportCommitResponse createCreatorImportCommit(id)

Create the drafts of a validated template upload (drafts only; nothing is submitted to review).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateCreatorImportCommitResponse result = apiInstance.createCreatorImportCommit(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#createCreatorImportCommit");
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

**CreateCreatorImportCommitResponse**

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

<a name="createCreatorItemModel"></a>
# **createCreatorItemModel**
> CreatorItemModelResponse createCreatorItemModel()

Upload a .glb (base64, 4 MB): validated, measured and stored (quarantined until approved). An over-budget model is refused with every failing number.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    try {
      CreatorItemModelResponse result = apiInstance.createCreatorItemModel();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#createCreatorItemModel");
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

**CreatorItemModelResponse**

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

<a name="createCreatorItemModelCheck"></a>
# **createCreatorItemModelCheck**
> CreateCreatorItemModelCheckResponse createCreatorItemModelCheck()

The budget report for a .glb (base64), storing nothing: every limit (triangles, draw calls, texture edge per phone/desktop; size, nodes, meshes, images, animations; bones for wearables) with pass/fail, problems and LOD suggestions.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    try {
      CreateCreatorItemModelCheckResponse result = apiInstance.createCreatorItemModelCheck();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#createCreatorItemModelCheck");
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

**CreateCreatorItemModelCheckResponse**

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

<a name="createCreatorItemModelSubmit"></a>
# **createCreatorItemModelSubmit**
> CreatorItemModelResponse createCreatorItemModelSubmit(id)

Send an uploaded model to art review.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreatorItemModelResponse result = apiInstance.createCreatorItemModelSubmit(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#createCreatorItemModelSubmit");
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

**CreatorItemModelResponse**

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

<a name="createCreatorItemPreview"></a>
# **createCreatorItemPreview**
> CreateCreatorItemPreviewResponse createCreatorItemPreview()

Upload a preview PNG (base64, at most 1 MB and 2048 px): parsed, scanned and stored on the Crossly CDN; answers its https URL.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    try {
      CreateCreatorItemPreviewResponse result = apiInstance.createCreatorItemPreview();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#createCreatorItemPreview");
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

**CreateCreatorItemPreviewResponse**

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

<a name="createCreatorItemWearable"></a>
# **createCreatorItemWearable**
> CreatorItemWearableResponse createCreatorItemWearable()

Start a wearable from a template: slug, name, colourways (panel -&gt; #rrggbb), a COSM price and optional edition size. Text is filtered; answers the automated checks. Paid seller plans only.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    try {
      CreatorItemWearableResponse result = apiInstance.createCreatorItemWearable();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#createCreatorItemWearable");
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

**CreatorItemWearableResponse**

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

<a name="createCreatorItemWearableSubmit"></a>
# **createCreatorItemWearableSubmit**
> CreatorItemWearableResponse createCreatorItemWearableSubmit(id)

Submit a wearable whose checks pass: each colourway becomes a COSM design (inactive) filed for review. Needs an https preview image (POST /v1/creator/items/previews).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreatorItemWearableResponse result = apiInstance.createCreatorItemWearableSubmit(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#createCreatorItemWearableSubmit");
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

**CreatorItemWearableResponse**

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

<a name="createCreatorReviewHide"></a>
# **createCreatorReviewHide**
> CreatorReviewResponse createCreatorReviewHide(reviewId)

Hide a buyer review from your public page (it is kept, and its rating still counts).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    String reviewId = "reviewId_example"; // String | 
    try {
      CreatorReviewResponse result = apiInstance.createCreatorReviewHide(reviewId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#createCreatorReviewHide");
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
 **reviewId** | **String**|  |

### Return type

**CreatorReviewResponse**

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

<a name="createCreatorReviewReply"></a>
# **createCreatorReviewReply**
> CreatorReviewResponse createCreatorReviewReply(reviewId)

Reply to a buyer review of your creation (or change your reply).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    String reviewId = "reviewId_example"; // String | 
    try {
      CreatorReviewResponse result = apiInstance.createCreatorReviewReply(reviewId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#createCreatorReviewReply");
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
 **reviewId** | **String**|  |

### Return type

**CreatorReviewResponse**

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

<a name="createCreatorReviewReport"></a>
# **createCreatorReviewReport**
> CreatorReviewResponse createCreatorReviewReport(reviewId)

Report a buyer review to Crossly (abuse, spam, not a real buyer).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    String reviewId = "reviewId_example"; // String | 
    try {
      CreatorReviewResponse result = apiInstance.createCreatorReviewReport(reviewId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#createCreatorReviewReport");
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
 **reviewId** | **String**|  |

### Return type

**CreatorReviewResponse**

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

<a name="createCreatorReviewUnhide"></a>
# **createCreatorReviewUnhide**
> CreatorReviewResponse createCreatorReviewUnhide(reviewId)

Show a hidden buyer review on your page again.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    String reviewId = "reviewId_example"; // String | 
    try {
      CreatorReviewResponse result = apiInstance.createCreatorReviewUnhide(reviewId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#createCreatorReviewUnhide");
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
 **reviewId** | **String**|  |

### Return type

**CreatorReviewResponse**

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

<a name="deleteCreatorCardSet"></a>
# **deleteCreatorCardSet**
> deleteCreatorCardSet(id)

Delete a set draft that was never published.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.deleteCreatorCardSet(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#deleteCreatorCardSet");
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

null (empty response body)

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content — the request succeeded and there is no body. |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="deleteCreatorItemModel"></a>
# **deleteCreatorItemModel**
> deleteCreatorItemModel(id)

Delete a draft or rejected model.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.deleteCreatorItemModel(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#deleteCreatorItemModel");
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

null (empty response body)

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content — the request succeeded and there is no body. |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="deleteCreatorItemWearable"></a>
# **deleteCreatorItemWearable**
> deleteCreatorItemWearable(id)

Delete a draft wearable.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.deleteCreatorItemWearable(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#deleteCreatorItemWearable");
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

null (empty response body)

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content — the request succeeded and there is no body. |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="getCreatorCardSet"></a>
# **getCreatorCardSet**
> CreatorCardSetResponse getCreatorCardSet(id)

One set draft with its check: draft issues by field and tcgStaticConformance problems.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreatorCardSetResponse result = apiInstance.getCreatorCardSet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#getCreatorCardSet");
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

**CreatorCardSetResponse**

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

<a name="getCreatorCardSetProgress"></a>
# **getCreatorCardSetProgress**
> GetCreatorCardSetProgressResponse getCreatorCardSetProgress(id)

A set&#39;s three steps: live on COSM, the mint threshold toward NFTs, and the print-run cost (trading_cards estimate) against production funding banked.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetCreatorCardSetProgressResponse result = apiInstance.getCreatorCardSetProgress(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#getCreatorCardSetProgress");
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

**GetCreatorCardSetProgressResponse**

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

<a name="getCreatorCollection"></a>
# **getCreatorCollection**
> GetCreatorCollectionResponse getCreatorCollection(collectionId)

One collection (a card set, a launch or a claimed contract): its six-stage road to the chain, the launch (phase timeline, proceeds, recent mints), sales by marketplace, royalty estimate, holders, its cards or creations with their earnings, holder perks set at mint, and which actions apply.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    String collectionId = "collectionId_example"; // String | 
    try {
      GetCreatorCollectionResponse result = apiInstance.getCreatorCollection(collectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#getCreatorCollection");
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
 **collectionId** | **String**|  |

### Return type

**GetCreatorCollectionResponse**

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

<a name="getCreatorCollectionPerk"></a>
# **getCreatorCollectionPerk**
> GetCreatorCollectionPerkResponse getCreatorCollectionPerk(collectionId)

A collection&#39;s holder perks (percent off at your shop, early access, a World item, a loyalty tier), whether they can be edited, and why not (a card set not started yet, a contract claimed from elsewhere).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    String collectionId = "collectionId_example"; // String | 
    try {
      GetCreatorCollectionPerkResponse result = apiInstance.getCreatorCollectionPerk(collectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#getCreatorCollectionPerk");
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
 **collectionId** | **String**|  |

### Return type

**GetCreatorCollectionPerkResponse**

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

<a name="getCreatorCreation"></a>
# **getCreatorCreation**
> GetCreatorCreationResponse getCreatorCreation(format, id)

One creation: its status timeline and review history, the files it uses, where it sells, its sales, its buyer reviews and its mint status.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    String format = "format_example"; // String | 
    String id = "id_example"; // String | 
    try {
      GetCreatorCreationResponse result = apiInstance.getCreatorCreation(format, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#getCreatorCreation");
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
 **format** | **String**|  |
 **id** | **String**|  |

### Return type

**GetCreatorCreationResponse**

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

<a name="getCreatorCreationStatus"></a>
# **getCreatorCreationStatus**
> GetCreatorCreationStatusResponse getCreatorCreationStatus(format, id)

Where one creation stands: its status, the reviewer&#39;s last note and its status timeline.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    String format = "format_example"; // String | 
    String id = "id_example"; // String | 
    try {
      GetCreatorCreationStatusResponse result = apiInstance.getCreatorCreationStatus(format, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#getCreatorCreationStatus");
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
 **format** | **String**|  |
 **id** | **String**|  |

### Return type

**GetCreatorCreationStatusResponse**

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

<a name="getCreatorEarningExport"></a>
# **getCreatorEarningExport**
> String getCreatorEarningExport(format, rail, source, state, group, gameId, from, to)

Download your creator earnings: format&#x3D;csv (every ledger row for the filter) or format&#x3D;pdf (a statement with per-rail totals for the same filter: rail, source, group, gameId, state; period defaults to this month).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    String format = "csv"; // String | 
    String rail = "cash"; // String | 
    String source = "item_sale"; // String | 
    String state = "available"; // String | 
    String group = "creator"; // String | 
    UUID gameId = UUID.randomUUID(); // UUID | 
    OffsetDateTime from = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime to = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      String result = apiInstance.getCreatorEarningExport(format, rail, source, state, group, gameId, from, to);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#getCreatorEarningExport");
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
 **format** | **String**|  | [optional] [enum: csv, pdf]
 **rail** | **String**|  | [optional] [enum: cash, cosm, cbx]
 **source** | **String**|  | [optional] [enum: item_sale, classic_store, vault_creator_code, item_royalty, card_sale, resale_royalty, production_royalty, world_pass, world_product, world_subscription, world_private_server, world_paid_access, world_commerce_affiliate, toolbox_asset, creator_rewards, world_ads]
 **state** | **String**|  | [optional] [enum: available, paid, reversed]
 **group** | **String**|  | [optional] [enum: creator, carnival, toolbox, rewards, physical, items, cards, collections, royalties]
 **gameId** | **UUID**|  | [optional]
 **from** | **OffsetDateTime**|  | [optional]
 **to** | **OffsetDateTime**|  | [optional]

### Return type

**String**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/csv, application/pdf, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The file in the requested &#x60;format&#x60;: a CSV file or a PDF document. |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="getCreatorEarningReconcile"></a>
# **getCreatorEarningReconcile**
> GetCreatorEarningReconcileResponse getCreatorEarningReconcile()

Reconcile your creator earnings: every source recomputed directly from its own ledger, side by side with the earnings view. ok is true when every source matches.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    try {
      GetCreatorEarningReconcileResponse result = apiInstance.getCreatorEarningReconcile();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#getCreatorEarningReconcile");
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

**GetCreatorEarningReconcileResponse**

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

<a name="getCreatorImport"></a>
# **getCreatorImport**
> GetCreatorImportResponse getCreatorImport(id)

A stored template validation.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetCreatorImportResponse result = apiInstance.getCreatorImport(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#getCreatorImport");
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

**GetCreatorImportResponse**

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

<a name="getCreatorItemModel"></a>
# **getCreatorItemModel**
> CreatorItemModelResponse getCreatorItemModel(id)

One of your models with its budget report.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreatorItemModelResponse result = apiInstance.getCreatorItemModel(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#getCreatorItemModel");
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

**CreatorItemModelResponse**

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

<a name="getCreatorItemTemplate"></a>
# **getCreatorItemTemplate**
> GetCreatorItemTemplateResponse getCreatorItemTemplate()

Wearable templates: each garment the Crossly avatar wears, its recolourable panels, default colours and measured cost (triangles, draw calls, bones, bytes, phone LOD), plus the per-wearable budget.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    try {
      GetCreatorItemTemplateResponse result = apiInstance.getCreatorItemTemplate();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#getCreatorItemTemplate");
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

**GetCreatorItemTemplateResponse**

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

<a name="getCreatorItemWearable"></a>
# **getCreatorItemWearable**
> CreatorItemWearableResponse getCreatorItemWearable(id)

One of your wearables with its checks, review state and note.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreatorItemWearableResponse result = apiInstance.getCreatorItemWearable(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#getCreatorItemWearable");
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

**CreatorItemWearableResponse**

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

<a name="getCreatorMinting"></a>
# **getCreatorMinting**
> GetCreatorMintingResponse getCreatorMinting()

Everything you take on chain as collection rows with a six-stage status (designed, eligible, drafted, deploying, live, ended): gettingReady and launched. Game items (source game_item: tradeable game products, NFT declarations for your games) carry href and gameId.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    try {
      GetCreatorMintingResponse result = apiInstance.getCreatorMinting();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#getCreatorMinting");
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

**GetCreatorMintingResponse**

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

<a name="getCreatorOverview"></a>
# **getCreatorOverview**
> GetCreatorOverviewResponse getCreatorOverview()

Creator Studio overview: earnings this month and last by rail, live creations, review queue, publish lock and next steps.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    try {
      GetCreatorOverviewResponse result = apiInstance.getCreatorOverview();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#getCreatorOverview");
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

**GetCreatorOverviewResponse**

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

<a name="getCreatorTemplate"></a>
# **getCreatorTemplate**
> GetCreatorTemplateResponse getCreatorTemplate(format)

The template files for a format (wearable, model, decor, interactive, card_set): crossly-creation.json, creations.csv where it applies, and a README.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    String format = "format_example"; // String | 
    try {
      GetCreatorTemplateResponse result = apiInstance.getCreatorTemplate(format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#getCreatorTemplate");
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
 **format** | **String**|  |

### Return type

**GetCreatorTemplateResponse**

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

<a name="getCreatorTemplateZip"></a>
# **getCreatorTemplateZip**
> File getCreatorTemplateZip(format)

A format&#39;s template as a .zip download (the same files as GET /templates/:format, plus its empty folders).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    String format = "format_example"; // String | 
    try {
      File result = apiInstance.getCreatorTemplateZip(format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#getCreatorTemplateZip");
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
 **format** | **String**|  |

### Return type

**File**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/zip, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A ZIP archive. |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="listCreatorCardSets"></a>
# **listCreatorCardSets**
> ListCreatorCardSetsResponse listCreatorCardSets()

Your card set drafts, each with its road from COSM to print: live on COSM, the mint threshold (collectors, packs opened, resales) and the print-run cost against what NFT sales have banked.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    try {
      ListCreatorCardSetsResponse result = apiInstance.listCreatorCardSets();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#listCreatorCardSets");
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

**ListCreatorCardSetsResponse**

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

<a name="listCreatorCreationReviews"></a>
# **listCreatorCreationReviews**
> ListCreatorCreationReviewsResponse listCreatorCreationReviews(format, id)

Buyer reviews of one creation, newest first (hidden ones included).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    String format = "format_example"; // String | 
    String id = "id_example"; // String | 
    try {
      ListCreatorCreationReviewsResponse result = apiInstance.listCreatorCreationReviews(format, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#listCreatorCreationReviews");
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
 **format** | **String**|  |
 **id** | **String**|  |

### Return type

**ListCreatorCreationReviewsResponse**

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

<a name="listCreatorCreations"></a>
# **listCreatorCreations**
> ListCreatorCreationsResponse listCreatorCreations()

Every creation of your shop in one list: wearables, 3D objects, decor, interactive objects, each card of your card sets, Classic games and card games, with status, collection, rating, earnings and mint status.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    try {
      ListCreatorCreationsResponse result = apiInstance.listCreatorCreations();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#listCreatorCreations");
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

**ListCreatorCreationsResponse**

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

<a name="listCreatorEarningTrend"></a>
# **listCreatorEarningTrend**
> ListCreatorEarningTrendResponse listCreatorEarningTrend(bucket, rail, group, gameId, from, to)

Your creator earnings over time: net (available + paid) per day, week or month (UTC) and rail, for the same filter as the ledger. meta.totals holds the per-rail and per-source totals of that filter.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    String bucket = "day"; // String | 
    String rail = "cash"; // String | 
    String group = "creator"; // String | 
    UUID gameId = UUID.randomUUID(); // UUID | 
    OffsetDateTime from = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime to = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      ListCreatorEarningTrendResponse result = apiInstance.listCreatorEarningTrend(bucket, rail, group, gameId, from, to);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#listCreatorEarningTrend");
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
 **bucket** | **String**|  | [optional] [enum: day, week, month]
 **rail** | **String**|  | [optional] [enum: cash, cosm, cbx]
 **group** | **String**|  | [optional] [enum: creator, carnival, toolbox, rewards, physical, items, cards, collections, royalties]
 **gameId** | **UUID**|  | [optional]
 **from** | **OffsetDateTime**|  | [optional]
 **to** | **OffsetDateTime**|  | [optional]

### Return type

**ListCreatorEarningTrendResponse**

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

<a name="listCreatorEarnings"></a>
# **listCreatorEarnings**
> ListCreatorEarningsResponse listCreatorEarnings(rail, source, group, gameId, state, from, to, cursor, limit)

Your creator earnings ledger across every rail (cash, COSM, CBX), newest first. Each row names the source ledger row it is. meta.totals holds per-rail and per-source totals for the same filter; meta.nextCursor pages.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    String rail = "cash"; // String | 
    String source = "item_sale"; // String | 
    String group = "creator"; // String | 
    UUID gameId = UUID.randomUUID(); // UUID | 
    String state = "available"; // String | 
    OffsetDateTime from = OffsetDateTime.now(); // OffsetDateTime | 
    OffsetDateTime to = OffsetDateTime.now(); // OffsetDateTime | 
    String cursor = "cursor_example"; // String | 
    Integer limit = 56; // Integer | 
    try {
      ListCreatorEarningsResponse result = apiInstance.listCreatorEarnings(rail, source, group, gameId, state, from, to, cursor, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#listCreatorEarnings");
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
 **rail** | **String**|  | [optional] [enum: cash, cosm, cbx]
 **source** | **String**|  | [optional] [enum: item_sale, classic_store, vault_creator_code, item_royalty, card_sale, resale_royalty, production_royalty, world_pass, world_product, world_subscription, world_private_server, world_paid_access, world_commerce_affiliate, toolbox_asset, creator_rewards, world_ads]
 **group** | **String**|  | [optional] [enum: creator, carnival, toolbox, rewards, physical, items, cards, collections, royalties]
 **gameId** | **UUID**|  | [optional]
 **state** | **String**|  | [optional] [enum: available, paid, reversed]
 **from** | **OffsetDateTime**|  | [optional]
 **to** | **OffsetDateTime**|  | [optional]
 **cursor** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]

### Return type

**ListCreatorEarningsResponse**

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

<a name="listCreatorItemModels"></a>
# **listCreatorItemModels**
> ListCreatorItemModelsResponse listCreatorItemModels()

Your uploaded 3D models with their budget reports and review state.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    try {
      ListCreatorItemModelsResponse result = apiInstance.listCreatorItemModels();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#listCreatorItemModels");
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

**ListCreatorItemModelsResponse**

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

<a name="listCreatorItemWearables"></a>
# **listCreatorItemWearables**
> ListCreatorItemWearablesResponse listCreatorItemWearables()

Your wearables: drafts, in review, live or with changes requested, each with its automated checks and per-colourway designs.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    try {
      ListCreatorItemWearablesResponse result = apiInstance.listCreatorItemWearables();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#listCreatorItemWearables");
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

**ListCreatorItemWearablesResponse**

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

<a name="listCreatorItems"></a>
# **listCreatorItems**
> ListCreatorItemsResponse listCreatorItems(kind, status, rail)

Every creation of your shop — wearables, decor, uploaded 3D models, interactive objects, Classic games, card games (incl. unpublished designer sets), physical runs — with status, price and earnings.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    String kind = "wearable"; // String | 
    String status = "draft"; // String | 
    String rail = "cash"; // String | 
    try {
      ListCreatorItemsResponse result = apiInstance.listCreatorItems(kind, status, rail);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#listCreatorItems");
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
 **kind** | **String**|  | [optional] [enum: wearable, decor, model, interactive, classic_game, card_game, physical_run]
 **status** | **String**|  | [optional] [enum: draft, in_review, changes_requested, live, rejected, retired]
 **rail** | **String**|  | [optional] [enum: cash, cosm]

### Return type

**ListCreatorItemsResponse**

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

<a name="listCreatorReviews"></a>
# **listCreatorReviews**
> ListCreatorReviewsResponse listCreatorReviews(kind, state, limit)

Every creator submission (items, interactive objects, Classic games, card games) and its review decision with the reviewer note.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    String kind = "item"; // String | 
    String state = "in_review"; // String | 
    Integer limit = 56; // Integer | 
    try {
      ListCreatorReviewsResponse result = apiInstance.listCreatorReviews(kind, state, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#listCreatorReviews");
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
 **kind** | **String**|  | [optional] [enum: item, interactive, classic_game, card_game, model, toolbox]
 **state** | **String**|  | [optional] [enum: in_review, approved, rejected, withdrawn, superseded]
 **limit** | **Integer**|  | [optional]

### Return type

**ListCreatorReviewsResponse**

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

<a name="updateCreatorCardSet"></a>
# **updateCreatorCardSet**
> CreatorCardSetResponse updateCreatorCardSet(id)

Save the whole draft: cards (name, type, rarity, rules text, flavour, power/draw/guard), COSM prices and supply, frame colours, print plan. Every word goes through the text filter. Art is merged: a card without &#x60;art&#x60; (or with art as read) keeps its stored art, &#x60;art: null&#x60; clears it; only the art upload sets art. Answers the check.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreatorCardSetResponse result = apiInstance.updateCreatorCardSet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#updateCreatorCardSet");
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

**CreatorCardSetResponse**

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

<a name="updateCreatorCollectionPerk"></a>
# **updateCreatorCollectionPerk**
> GetCreatorCollectionPerkResponse updateCreatorCollectionPerk(collectionId)

Replace a collection&#39;s holder perks: &#x60;{ perks: [...] }&#x60;, at most one of each type: percent_off { percent 1-50 }, early_access { hours 1-720 }, world_item { creationRef, name }, loyalty_tier { tierId, tierName } (one of your loyalty tiers), each with an optional note. 409 when the collection has no launch yet.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    String collectionId = "collectionId_example"; // String | 
    try {
      GetCreatorCollectionPerkResponse result = apiInstance.updateCreatorCollectionPerk(collectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#updateCreatorCollectionPerk");
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
 **collectionId** | **String**|  |

### Return type

**GetCreatorCollectionPerkResponse**

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

<a name="updateCreatorItemWearable"></a>
# **updateCreatorItemWearable**
> CreatorItemWearableResponse updateCreatorItemWearable(id)

Edit a draft wearable (name, description, colourways, price, edition). Submitted wearables are frozen.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorStudioApi apiInstance = new CreatorStudioApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreatorItemWearableResponse result = apiInstance.updateCreatorItemWearable(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorStudioApi#updateCreatorItemWearable");
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

**CreatorItemWearableResponse**

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

