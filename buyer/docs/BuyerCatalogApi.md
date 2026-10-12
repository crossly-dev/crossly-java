# BuyerCatalogApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBuyerIdentify**](BuyerCatalogApi.md#createBuyerIdentify) | **POST** /v1/buyer/identify | Identify a held object and return a HUD-ready answer.
[**createBuyerLockon**](BuyerCatalogApi.md#createBuyerLockon) | **POST** /v1/buyer/lockons | Lock on to an object the buyer is holding.
[**createBuyerLockonConfirm**](BuyerCatalogApi.md#createBuyerLockonConfirm) | **POST** /v1/buyer/lockons/{id}/confirm | The buyer picked one of the candidates.
[**createBuyerLockonObserve**](BuyerCatalogApi.md#createBuyerLockonObserve) | **POST** /v1/buyer/lockons/{id}/observe | Add what this frame revealed, and get the current best answer.
[**createBuyerScan**](BuyerCatalogApi.md#createBuyerScan) | **POST** /v1/buyer/scan | Identify a physical item and find the cheapest place to buy it.
[**createBuyerScanSession**](BuyerCatalogApi.md#createBuyerScanSession) | **POST** /v1/buyer/scan/sessions | Open a Live Shop session.
[**createBuyerScanSessionEnd**](BuyerCatalogApi.md#createBuyerScanSessionEnd) | **POST** /v1/buyer/scan/sessions/{id}/end | Close a Live Shop session.
[**getBuyerAnywhere**](BuyerCatalogApi.md#getBuyerAnywhere) | **GET** /v1/buyer/anywhere | Cheapest source for an item — Crossly first, then other retailers.
[**getBuyerCatalogFacet**](BuyerCatalogApi.md#getBuyerCatalogFacet) | **GET** /v1/buyer/catalog/facets | Brands, categories and conditions that currently have stock.
[**getBuyerCatalogFx**](BuyerCatalogApi.md#getBuyerCatalogFx) | **GET** /v1/buyer/catalog/fx | Display-only exchange rates (units per 1 USD).
[**getBuyerCatalogListing**](BuyerCatalogApi.md#getBuyerCatalogListing) | **GET** /v1/buyer/catalog/listings/{slug} | One listing, in full.
[**getBuyerCatalogListingAvailability**](BuyerCatalogApi.md#getBuyerCatalogListingAvailability) | **GET** /v1/buyer/catalog/listings/{slug}/availability | Is it still buyable, and at what price.
[**getBuyerCatalogListingShipping**](BuyerCatalogApi.md#getBuyerCatalogListingShipping) | **GET** /v1/buyer/catalog/listings/{slug}/shipping | Shipping services and prices to a destination.
[**getBuyerListingLandedCost**](BuyerCatalogApi.md#getBuyerListingLandedCost) | **GET** /v1/buyer/listings/{slug}/landed-cost | Import duties, taxes and fees to a country (landed cost).
[**getBuyerScanSession**](BuyerCatalogApi.md#getBuyerScanSession) | **GET** /v1/buyer/scan/sessions/{id} | One trip and everything it found.
[**listBuyerCatalogBrowse**](BuyerCatalogApi.md#listBuyerCatalogBrowse) | **GET** /v1/buyer/catalog/browse | Browse the way the shop does — buying format, returns, size, color, sold items, Best Match.
[**listBuyerCatalogListingSoldHistory**](BuyerCatalogApi.md#listBuyerCatalogListingSoldHistory) | **GET** /v1/buyer/catalog/listings/{slug}/sold-history | What THIS listing has sold for, newest first (last 50), with the median.
[**listBuyerCatalogSearch**](BuyerCatalogApi.md#listBuyerCatalogSearch) | **GET** /v1/buyer/catalog/search | Search the Crossly catalogue.
[**listBuyerCatalogSellers**](BuyerCatalogApi.md#listBuyerCatalogSellers) | **GET** /v1/buyer/catalog/sellers | Find a seller by shop handle or shop name.
[**listBuyerScanSessions**](BuyerCatalogApi.md#listBuyerScanSessions) | **GET** /v1/buyer/scan/sessions | Your scanning trips, newest first.


<a name="createBuyerIdentify"></a>
# **createBuyerIdentify**
> CreateBuyerIdentifyResponse createBuyerIdentify()

Identify a held object and return a HUD-ready answer.

The gesture endpoint for Live Shop. Runs a cost ladder: a decoded BARCODE resolves in ~50ms for nothing; failing that, self-hosted CLIP matches the catalogue; failing that, a vision model names it (the only rung that costs anything, capped per buyer per day). &#x60;hud&#x60; is pre-formatted for a 600×600 lens — one headline, one subline, up to three fact chips and exactly ONE action, because a pinch cannot choose between buttons. A vision label is WORDS, never an identity: it names the thing so the buyer can search, and never drives a price comparison.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerCatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerCatalogApi apiInstance = new BuyerCatalogApi(defaultClient);
    try {
      CreateBuyerIdentifyResponse result = apiInstance.createBuyerIdentify();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerCatalogApi#createBuyerIdentify");
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

**CreateBuyerIdentifyResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerLockon"></a>
# **createBuyerLockon**
> CreateBuyerLockonResponse createBuyerLockon()

Lock on to an object the buyer is holding.

Open this when on-device tracking acquires an object, then post observations to it as the buyer turns the thing over. The answer improves as evidence arrives — the style code inside a shoe settles what the front of it could not.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerCatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerCatalogApi apiInstance = new BuyerCatalogApi(defaultClient);
    try {
      CreateBuyerLockonResponse result = apiInstance.createBuyerLockon();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerCatalogApi#createBuyerLockon");
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

**CreateBuyerLockonResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerLockonConfirm"></a>
# **createBuyerLockonConfirm**
> CreateBuyerLockonConfirmResponse createBuyerLockonConfirm(id)

The buyer picked one of the candidates.

Promotes a text match to a CONFIRMED identity — the strongest evidence in the system, because a person holding the object said yes. Validated against the candidates we actually offered, so it cannot be claimed about an arbitrary product.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerCatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerCatalogApi apiInstance = new BuyerCatalogApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateBuyerLockonConfirmResponse result = apiInstance.createBuyerLockonConfirm(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerCatalogApi#createBuyerLockonConfirm");
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
 **id** | **UUID**|  |

### Return type

**CreateBuyerLockonConfirmResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerLockonObserve"></a>
# **createBuyerLockonObserve**
> CreateBuyerLockonConfirmResponse createBuyerLockonObserve(id)

Add what this frame revealed, and get the current best answer.

Send only what you LEARNED: a decoded barcode, newly-read OCR text, or a frame when neither settled it. Do not post every frame — tracking and decoding happen on-device for free, and this endpoint is for evidence, not video. Evidence is RANKED (confirmed &gt; barcode &gt; ocr &gt; visual), so a late weak reading can never overwrite a strong early one. When text evidence finds several products, &#x60;candidates&#x60; comes back for the buyer to pick from — a vision label is words, and only a human confirmation turns it into an identity we will price against.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerCatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerCatalogApi apiInstance = new BuyerCatalogApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateBuyerLockonConfirmResponse result = apiInstance.createBuyerLockonObserve(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerCatalogApi#createBuyerLockonObserve");
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
 **id** | **UUID**|  |

### Return type

**CreateBuyerLockonConfirmResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerScan"></a>
# **createBuyerScan**
> CreateBuyerScanResponse createBuyerScan()

Identify a physical item and find the cheapest place to buy it.

Send a barcode identifier OR a photo. A BARCODE establishes identity, so the response carries a full price verdict across Crossly and other retailers. A PHOTO establishes resemblance only: you get visual matches from the Crossly catalogue, and a price verdict ONLY if the matched listing carries a real identifier. When it does not, &#x60;comparable&#x60; is false and there is no verdict — a price comparison built on a visual guess is a claim about a different product. Most second-hand items have no identifier by nature, so this is expected rather than a failure.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerCatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerCatalogApi apiInstance = new BuyerCatalogApi(defaultClient);
    try {
      CreateBuyerScanResponse result = apiInstance.createBuyerScan();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerCatalogApi#createBuyerScan");
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

**CreateBuyerScanResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerScanSession"></a>
# **createBuyerScanSession**
> CreateBuyerScanSessionResponse createBuyerScanSession()

Open a Live Shop session.

Call this when the glasses connect, then pass the returned id as &#x60;sessionId&#x60; on each scan. Opening a session CLOSES any other live one — a person is in one shop at a time, and two live sessions split a trip across both.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerCatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerCatalogApi apiInstance = new BuyerCatalogApi(defaultClient);
    try {
      CreateBuyerScanSessionResponse result = apiInstance.createBuyerScanSession();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerCatalogApi#createBuyerScanSession");
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

**CreateBuyerScanSessionResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerScanSessionEnd"></a>
# **createBuyerScanSessionEnd**
> CreateBuyerScanSessionEndResponse createBuyerScanSessionEnd(id)

Close a Live Shop session.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerCatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerCatalogApi apiInstance = new BuyerCatalogApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateBuyerScanSessionEndResponse result = apiInstance.createBuyerScanSessionEnd(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerCatalogApi#createBuyerScanSessionEnd");
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
 **id** | **UUID**|  |

### Return type

**CreateBuyerScanSessionEndResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerAnywhere"></a>
# **getBuyerAnywhere**
> GetBuyerAnywhereResponse getBuyerAnywhere()

Cheapest source for an item — Crossly first, then other retailers.

Answers with a VERDICT, not a list: crossly_best, offsite_cheaper, offsite_only or no_match. Offsite offers come from licensed affiliate product feeds, are ranked CHEAPEST-FIRST — commission only ever breaks a sub-$1 tie — and only appear when they beat the price you passed in. &#x60;shippingUnknown: true&#x60; means a compared price omitted postage, so present the result as \&quot;before postage\&quot; rather than as a delivered total. Crossly wins ties within $1; beyond that the honest answer wins.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerCatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerCatalogApi apiInstance = new BuyerCatalogApi(defaultClient);
    try {
      GetBuyerAnywhereResponse result = apiInstance.getBuyerAnywhere();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerCatalogApi#getBuyerAnywhere");
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

**GetBuyerAnywhereResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerCatalogFacet"></a>
# **getBuyerCatalogFacet**
> GetBuyerCatalogFacetResponse getBuyerCatalogFacet()

Brands, categories and conditions that currently have stock.

The vocabulary the search filters accept. Counts are live, so a filter built from this will never return an empty page for a value that has since sold out.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerCatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerCatalogApi apiInstance = new BuyerCatalogApi(defaultClient);
    try {
      GetBuyerCatalogFacetResponse result = apiInstance.getBuyerCatalogFacet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerCatalogApi#getBuyerCatalogFacet");
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

**GetBuyerCatalogFacetResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerCatalogFx"></a>
# **getBuyerCatalogFx**
> GetBuyerCatalogFxResponse getBuyerCatalogFx()

Display-only exchange rates (units per 1 USD).

ECB daily reference rates rebased to US dollars: &#x60;rates.EUR &#x3D; 0.92&#x60; means $1 ≈ €0.92. &#x60;asOf&#x60; is the ECB publication date (null until the first refresh). For showing an approximate price only — every Crossly price and charge is in USD, and the card issuer sets the final exchange rate.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerCatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerCatalogApi apiInstance = new BuyerCatalogApi(defaultClient);
    try {
      GetBuyerCatalogFxResponse result = apiInstance.getBuyerCatalogFx();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerCatalogApi#getBuyerCatalogFx");
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

**GetBuyerCatalogFxResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerCatalogListing"></a>
# **getBuyerCatalogListing**
> GetBuyerCatalogListingResponse getBuyerCatalogListing(slug)

One listing, in full.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerCatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerCatalogApi apiInstance = new BuyerCatalogApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      GetBuyerCatalogListingResponse result = apiInstance.getBuyerCatalogListing(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerCatalogApi#getBuyerCatalogListing");
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
 **slug** | **String**|  |

### Return type

**GetBuyerCatalogListingResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerCatalogListingAvailability"></a>
# **getBuyerCatalogListingAvailability**
> GetBuyerCatalogListingAvailabilityResponse getBuyerCatalogListingAvailability(slug)

Is it still buyable, and at what price.

The cheapest endpoint here, and the one to poll if you are going to poll — a single indexed row, no joins beyond stock, and an ETag so an unchanged answer is a 304. If you want to be TOLD instead of asking, create a monitor.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerCatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerCatalogApi apiInstance = new BuyerCatalogApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      GetBuyerCatalogListingAvailabilityResponse result = apiInstance.getBuyerCatalogListingAvailability(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerCatalogApi#getBuyerCatalogListingAvailability");
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
 **slug** | **String**|  |

### Return type

**GetBuyerCatalogListingAvailabilityResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerCatalogListingShipping"></a>
# **getBuyerCatalogListingShipping**
> GetBuyerCatalogListingShippingResponse getBuyerCatalogListingShipping(slug, zip, country, quantity)

Shipping services and prices to a destination.

Lists every shipping service the seller offers to &#x60;country&#x60; (default: the seller’s own country) with its price for &#x60;quantity&#x60; units and its delivery window in business days (handling included). &#x60;zip&#x60; is required for a domestic quote. &#x60;shipsToCountry: false&#x60; means the seller does not ship there. Pass a service &#x60;id&#x60; as &#x60;shippingServiceId&#x60; to POST /api/v1/buyer/checkout, or in &#x60;shippingServiceBySeller&#x60; to POST /api/v1/buyer/cart/quote.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerCatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerCatalogApi apiInstance = new BuyerCatalogApi(defaultClient);
    String slug = "slug_example"; // String | 
    String zip = "zip_example"; // String | 
    String country = "country_example"; // String | 
    Integer quantity = 56; // Integer | 
    try {
      GetBuyerCatalogListingShippingResponse result = apiInstance.getBuyerCatalogListingShipping(slug, zip, country, quantity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerCatalogApi#getBuyerCatalogListingShipping");
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
 **slug** | **String**|  |
 **zip** | **String**|  | [optional]
 **country** | **String**|  | [optional]
 **quantity** | **Integer**|  | [optional]

### Return type

**GetBuyerCatalogListingShippingResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerListingLandedCost"></a>
# **getBuyerListingLandedCost**
> GetBuyerListingLandedCostResponse getBuyerListingLandedCost(country, slug, postalCode, quantity)

Import duties, taxes and fees to a country (landed cost).

Quotes the import duties, import taxes and fees for this listing shipped to &#x60;country&#x60; (ISO 3166-1 alpha-2), using the cheapest shipping service the seller offers there. &#x60;status: included&#x60; means checkout charges them now and the parcel ships DDP — no bill at the door; &#x60;unavailable&#x60; means it ships DDU and &#x60;notice&#x60; says the carrier or customs may charge on delivery; &#x60;none&#x60; means the parcel does not cross a border. Amounts are US-dollar cents. Answers 503 with &#x60;missingEnv&#x60; when landed-cost quoting is not configured on this deployment.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerCatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerCatalogApi apiInstance = new BuyerCatalogApi(defaultClient);
    String country = "country_example"; // String | 
    String slug = "slug_example"; // String | 
    String postalCode = "postalCode_example"; // String | 
    Integer quantity = 56; // Integer | 
    try {
      GetBuyerListingLandedCostResponse result = apiInstance.getBuyerListingLandedCost(country, slug, postalCode, quantity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerCatalogApi#getBuyerListingLandedCost");
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
 **country** | **String**|  |
 **slug** | **String**|  |
 **postalCode** | **String**|  | [optional]
 **quantity** | **Integer**|  | [optional]

### Return type

**GetBuyerListingLandedCostResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerScanSession"></a>
# **getBuyerScanSession**
> GetBuyerScanSessionResponse getBuyerScanSession(id)

One trip and everything it found.

Verdicts are returned EXACTLY as they were given at the time, not re-priced. A history screen that silently refreshes old prices shows a saving that was never actually on offer.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerCatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerCatalogApi apiInstance = new BuyerCatalogApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      GetBuyerScanSessionResponse result = apiInstance.getBuyerScanSession(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerCatalogApi#getBuyerScanSession");
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
 **id** | **UUID**|  |

### Return type

**GetBuyerScanSessionResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerCatalogBrowse"></a>
# **listBuyerCatalogBrowse**
> ListBuyerCatalogBrowseResponse listBuyerCatalogBrowse(q, format, returns, sold, size, color, shipsTo, sort, minPriceCents, maxPriceCents, page, limit)

Browse the way the shop does — buying format, returns, size, color, sold items, Best Match.

Page-numbered and capped at 50 pages of up to 60, like the storefront. For walking the whole catalogue use /v1/buyer/catalog/search, which pages by cursor. Prices are integer CENTS (&#x60;minPriceCents&#x3D;2500&#x60; is $25.00). &#x60;sold&#x3D;true&#x60; returns recent sales of matching listings (last 90 days) with &#x60;soldPriceCents&#x60; and &#x60;soldAt&#x60;, instead of live stock.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerCatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerCatalogApi apiInstance = new BuyerCatalogApi(defaultClient);
    String q = "q_example"; // String | Free text; every word must appear in the title or brand.
    String format = "auction"; // String | auction, buy_it_now, or offers (accepts offers).
    String returns = "true"; // String | true = only listings that accept returns.
    String sold = "true"; // String | true = recent sales instead of live listings.
    String size = "size_example"; // String | Exact size, case-insensitive (M does not match XL).
    String color = "color_example"; // String | Exact colour, case-insensitive.
    String shipsTo = "shipsTo_example"; // String | ISO 3166-1 alpha-2 destination (e.g. GB): only listings whose seller ships there, decided as checkout decides it (the listing's shipping policy and its own restricted countries). An embargoed destination matches nothing. Omitted, or `any`, means no destination filter — the storefront grid defaults to the buyer's country, this endpoint does not.
    String sort = "best_match"; // String | Default best_match with q, newest without.
    Integer minPriceCents = 56; // Integer | Lowest price, in cents.
    Integer maxPriceCents = 56; // Integer | Highest price, in cents.
    Integer page = 1; // Integer | 1-indexed page.
    Integer limit = 24; // Integer | Rows per page.
    try {
      ListBuyerCatalogBrowseResponse result = apiInstance.listBuyerCatalogBrowse(q, format, returns, sold, size, color, shipsTo, sort, minPriceCents, maxPriceCents, page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerCatalogApi#listBuyerCatalogBrowse");
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
 **q** | **String**| Free text; every word must appear in the title or brand. | [optional]
 **format** | **String**| auction, buy_it_now, or offers (accepts offers). | [optional] [enum: auction, buy_it_now, offers]
 **returns** | **String**| true &#x3D; only listings that accept returns. | [optional] [enum: true, false]
 **sold** | **String**| true &#x3D; recent sales instead of live listings. | [optional] [enum: true, false]
 **size** | **String**| Exact size, case-insensitive (M does not match XL). | [optional]
 **color** | **String**| Exact colour, case-insensitive. | [optional]
 **shipsTo** | **String**| ISO 3166-1 alpha-2 destination (e.g. GB): only listings whose seller ships there, decided as checkout decides it (the listing&#39;s shipping policy and its own restricted countries). An embargoed destination matches nothing. Omitted, or &#x60;any&#x60;, means no destination filter — the storefront grid defaults to the buyer&#39;s country, this endpoint does not. | [optional]
 **sort** | **String**| Default best_match with q, newest without. | [optional] [enum: best_match, newest, price_low, price_high, popular, ending_soon]
 **minPriceCents** | **Integer**| Lowest price, in cents. | [optional]
 **maxPriceCents** | **Integer**| Highest price, in cents. | [optional]
 **page** | **Integer**| 1-indexed page. | [optional] [default to 1]
 **limit** | **Integer**| Rows per page. | [optional] [default to 24]

### Return type

**ListBuyerCatalogBrowseResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerCatalogListingSoldHistory"></a>
# **listBuyerCatalogListingSoldHistory**
> ListBuyerCatalogListingSoldHistoryResponse listBuyerCatalogListingSoldHistory(slug)

What THIS listing has sold for, newest first (last 50), with the median.

This listing only — never \&quot;similar items\&quot;, which would mean matching other listings by resemblance. Prices are per unit, in cents, excluding shipping and tax.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerCatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerCatalogApi apiInstance = new BuyerCatalogApi(defaultClient);
    String slug = "slug_example"; // String | The listing slug.
    try {
      ListBuyerCatalogListingSoldHistoryResponse result = apiInstance.listBuyerCatalogListingSoldHistory(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerCatalogApi#listBuyerCatalogListingSoldHistory");
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
 **slug** | **String**| The listing slug. |

### Return type

**ListBuyerCatalogListingSoldHistoryResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerCatalogSearch"></a>
# **listBuyerCatalogSearch**
> ListBuyerCatalogSearchResponse listBuyerCatalogSearch()

Search the Crossly catalogue.

Keyset-paginated. Pass the &#x60;nextCursor&#x60; you were given back as &#x60;cursor&#x60;; page 500 costs the same as page 1. Cursors are opaque — do not parse them. Responses carry an ETag: send it back as If-None-Match and an unchanged page answers 304, which is free. &#x60;sort&#x3D;popular&#x60; is deliberately unavailable, because a cursor into a continuously-reordering list silently skips rows.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerCatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerCatalogApi apiInstance = new BuyerCatalogApi(defaultClient);
    try {
      ListBuyerCatalogSearchResponse result = apiInstance.listBuyerCatalogSearch();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerCatalogApi#listBuyerCatalogSearch");
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

**ListBuyerCatalogSearchResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerCatalogSellers"></a>
# **listBuyerCatalogSellers**
> ListBuyerCatalogSellersResponse listBuyerCatalogSellers(q, limit)

Find a seller by shop handle or shop name.

Only shops that have listed on Crossly. Exact matches first, then prefix, then by live listing count.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerCatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerCatalogApi apiInstance = new BuyerCatalogApi(defaultClient);
    String q = "q_example"; // String | At least two characters of a handle or shop name.
    Integer limit = 12; // Integer | How many shops to return.
    try {
      ListBuyerCatalogSellersResponse result = apiInstance.listBuyerCatalogSellers(q, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerCatalogApi#listBuyerCatalogSellers");
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
 **q** | **String**| At least two characters of a handle or shop name. |
 **limit** | **Integer**| How many shops to return. | [optional] [default to 12]

### Return type

**ListBuyerCatalogSellersResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerScanSessions"></a>
# **listBuyerScanSessions**
> ListBuyerScanSessionsResponse listBuyerScanSessions()

Your scanning trips, newest first.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerCatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerCatalogApi apiInstance = new BuyerCatalogApi(defaultClient);
    try {
      ListBuyerScanSessionsResponse result = apiInstance.listBuyerScanSessions();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerCatalogApi#listBuyerScanSessions");
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

**ListBuyerScanSessionsResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

