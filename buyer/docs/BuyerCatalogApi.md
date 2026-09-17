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
[**getBuyerCatalogListing**](BuyerCatalogApi.md#getBuyerCatalogListing) | **GET** /v1/buyer/catalog/listings/{slug} | One listing, in full.
[**getBuyerCatalogListingAvailability**](BuyerCatalogApi.md#getBuyerCatalogListingAvailability) | **GET** /v1/buyer/catalog/listings/{slug}/availability | Is it still buyable, and at what price.
[**getBuyerScanSession**](BuyerCatalogApi.md#getBuyerScanSession) | **GET** /v1/buyer/scan/sessions/{id} | One trip and everything it found.
[**listBuyerCatalogSearch**](BuyerCatalogApi.md#listBuyerCatalogSearch) | **GET** /v1/buyer/catalog/search | Search the Crossly catalogue.
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
import org.openapitools.client.api.BuyerCatalogApi;

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

[**CreateBuyerIdentifyResponse**](CreateBuyerIdentifyResponse.md)

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
import org.openapitools.client.api.BuyerCatalogApi;

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

[**CreateBuyerLockonResponse**](CreateBuyerLockonResponse.md)

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
import org.openapitools.client.api.BuyerCatalogApi;

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

[**CreateBuyerLockonConfirmResponse**](CreateBuyerLockonConfirmResponse.md)

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
> CreateBuyerLockonObserveResponse createBuyerLockonObserve(id)

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
import org.openapitools.client.api.BuyerCatalogApi;

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
      CreateBuyerLockonObserveResponse result = apiInstance.createBuyerLockonObserve(id);
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

[**CreateBuyerLockonObserveResponse**](CreateBuyerLockonObserveResponse.md)

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
import org.openapitools.client.api.BuyerCatalogApi;

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

[**CreateBuyerScanResponse**](CreateBuyerScanResponse.md)

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
import org.openapitools.client.api.BuyerCatalogApi;

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

[**CreateBuyerScanSessionResponse**](CreateBuyerScanSessionResponse.md)

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
import org.openapitools.client.api.BuyerCatalogApi;

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

[**CreateBuyerScanSessionEndResponse**](CreateBuyerScanSessionEndResponse.md)

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
import org.openapitools.client.api.BuyerCatalogApi;

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

[**GetBuyerAnywhereResponse**](GetBuyerAnywhereResponse.md)

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
import org.openapitools.client.api.BuyerCatalogApi;

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

[**GetBuyerCatalogFacetResponse**](GetBuyerCatalogFacetResponse.md)

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
import org.openapitools.client.api.BuyerCatalogApi;

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

[**GetBuyerCatalogListingResponse**](GetBuyerCatalogListingResponse.md)

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
import org.openapitools.client.api.BuyerCatalogApi;

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

[**GetBuyerCatalogListingAvailabilityResponse**](GetBuyerCatalogListingAvailabilityResponse.md)

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
import org.openapitools.client.api.BuyerCatalogApi;

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

[**GetBuyerScanSessionResponse**](GetBuyerScanSessionResponse.md)

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
> V1List listBuyerCatalogSearch()

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
import org.openapitools.client.api.BuyerCatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerCatalogApi apiInstance = new BuyerCatalogApi(defaultClient);
    try {
      V1List result = apiInstance.listBuyerCatalogSearch();
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

[**V1List**](V1List.md)

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
> V1List listBuyerScanSessions()

Your scanning trips, newest first.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import org.openapitools.client.api.BuyerCatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerCatalogApi apiInstance = new BuyerCatalogApi(defaultClient);
    try {
      V1List result = apiInstance.listBuyerScanSessions();
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

[**V1List**](V1List.md)

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

