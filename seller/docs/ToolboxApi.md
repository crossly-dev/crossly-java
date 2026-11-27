# ToolboxApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createToolboxAsset**](ToolboxApi.md#createToolboxAsset) | **POST** /v1/toolbox/assets | Publish an asset (place nodes). Scanned (lint, text, credits, uploads) then reviewed. Free by default; paid needs Pro and a verified identity.
[**createToolboxAssetPurchase**](ToolboxApi.md#createToolboxAssetPurchase) | **POST** /v1/toolbox/assets/{assetId}/purchase | Open a Crossly checkout for a paid asset. Nothing is charged here: a person pays at checkoutUrl. The author earns 80% of net; the licence is use in your own experiences.
[**createToolboxAssetRetire**](ToolboxApi.md#createToolboxAssetRetire) | **POST** /v1/toolbox/assets/{assetId}/retire | Take an asset off the store for good. Licences already sold keep working.
[**createToolboxAssetUse**](ToolboxApi.md#createToolboxAssetUse) | **POST** /v1/toolbox/assets/{assetId}/use | Get the asset&#39;s nodes stamped with its id for a place you can edit; insert:true also inserts them into the place&#39;s live session. Paid assets need the experience owner&#39;s licence.
[**createToolboxAssetVersion**](ToolboxApi.md#createToolboxAssetVersion) | **POST** /v1/toolbox/assets/{assetId}/versions | A new version (reviewed); the live one keeps serving until it is approved.
[**createToolboxPurchaseRefund**](ToolboxApi.md#createToolboxPurchaseRefund) | **POST** /v1/toolbox/purchases/{purchaseId}/refund | Refund a licence within 14 days while no published version of yours uses the asset. Ends the licence; the author&#39;s share is reversed.
[**deleteToolboxAssetRatingMine**](ToolboxApi.md#deleteToolboxAssetRatingMine) | **DELETE** /v1/toolbox/assets/{assetId}/ratings/mine | Remove your rating of an asset.
[**getToolboxAsset**](ToolboxApi.md#getToolboxAsset) | **GET** /v1/toolbox/assets/{assetId} | One asset: versions, credits (assets it includes), licence, contents, your purchase.
[**getToolboxAssetRating**](ToolboxApi.md#getToolboxAssetRating) | **GET** /v1/toolbox/assets/{assetId}/ratings | Ratings of an asset: average stars, breakdown, recent reviews, yours, and whether you may rate it.
[**getToolboxPurchase**](ToolboxApi.md#getToolboxPurchase) | **GET** /v1/toolbox/purchases/{purchaseId} | A purchase: status, price, tax, refundable until.
[**listToolboxAssets**](ToolboxApi.md#listToolboxAssets) | **GET** /v1/toolbox/assets | Search the Toolbox: models, scripts, sounds, images, packages. Free and paid; &#x60;owned&#x60; says whether you may insert it now.
[**listToolboxLibrary**](ToolboxApi.md#listToolboxLibrary) | **GET** /v1/toolbox/library | Assets you may insert: licences you bought, your own, free ones you used.
[**listToolboxMine**](ToolboxApi.md#listToolboxMine) | **GET** /v1/toolbox/mine | Your published assets: review state, reviewer note, what each earned you.
[**listToolboxSales**](ToolboxApi.md#listToolboxSales) | **GET** /v1/toolbox/sales | Your Toolbox sales: gross, net, your 80% share after refunds. Never who bought.
[**updateToolboxAsset**](ToolboxApi.md#updateToolboxAsset) | **PATCH** /v1/toolbox/assets/{assetId} | Edit name, description, tags, thumbnail or price.
[**updateToolboxAssetRatingMine**](ToolboxApi.md#updateToolboxAssetRatingMine) | **PUT** /v1/toolbox/assets/{assetId}/ratings/mine | Rate an asset you bought or installed: 1–5 stars and an optional review (1000 characters). Not your own.


<a name="createToolboxAsset"></a>
# **createToolboxAsset**
> ToolboxAssetResponse createToolboxAsset()

Publish an asset (place nodes). Scanned (lint, text, credits, uploads) then reviewed. Free by default; paid needs Pro and a verified identity.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ToolboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ToolboxApi apiInstance = new ToolboxApi(defaultClient);
    try {
      ToolboxAssetResponse result = apiInstance.createToolboxAsset();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolboxApi#createToolboxAsset");
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

**ToolboxAssetResponse**

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

<a name="createToolboxAssetPurchase"></a>
# **createToolboxAssetPurchase**
> GetToolboxPurchaseResponse createToolboxAssetPurchase(assetId)

Open a Crossly checkout for a paid asset. Nothing is charged here: a person pays at checkoutUrl. The author earns 80% of net; the licence is use in your own experiences.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ToolboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ToolboxApi apiInstance = new ToolboxApi(defaultClient);
    String assetId = "assetId_example"; // String | 
    try {
      GetToolboxPurchaseResponse result = apiInstance.createToolboxAssetPurchase(assetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolboxApi#createToolboxAssetPurchase");
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
 **assetId** | **String**|  |

### Return type

**GetToolboxPurchaseResponse**

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

<a name="createToolboxAssetRetire"></a>
# **createToolboxAssetRetire**
> ToolboxAssetResponse createToolboxAssetRetire(assetId)

Take an asset off the store for good. Licences already sold keep working.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ToolboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ToolboxApi apiInstance = new ToolboxApi(defaultClient);
    String assetId = "assetId_example"; // String | 
    try {
      ToolboxAssetResponse result = apiInstance.createToolboxAssetRetire(assetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolboxApi#createToolboxAssetRetire");
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
 **assetId** | **String**|  |

### Return type

**ToolboxAssetResponse**

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

<a name="createToolboxAssetUse"></a>
# **createToolboxAssetUse**
> CreateToolboxAssetUseResponse createToolboxAssetUse(assetId)

Get the asset&#39;s nodes stamped with its id for a place you can edit; insert:true also inserts them into the place&#39;s live session. Paid assets need the experience owner&#39;s licence.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ToolboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ToolboxApi apiInstance = new ToolboxApi(defaultClient);
    String assetId = "assetId_example"; // String | 
    try {
      CreateToolboxAssetUseResponse result = apiInstance.createToolboxAssetUse(assetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolboxApi#createToolboxAssetUse");
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
 **assetId** | **String**|  |

### Return type

**CreateToolboxAssetUseResponse**

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

<a name="createToolboxAssetVersion"></a>
# **createToolboxAssetVersion**
> ToolboxAssetResponse createToolboxAssetVersion(assetId)

A new version (reviewed); the live one keeps serving until it is approved.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ToolboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ToolboxApi apiInstance = new ToolboxApi(defaultClient);
    String assetId = "assetId_example"; // String | 
    try {
      ToolboxAssetResponse result = apiInstance.createToolboxAssetVersion(assetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolboxApi#createToolboxAssetVersion");
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
 **assetId** | **String**|  |

### Return type

**ToolboxAssetResponse**

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

<a name="createToolboxPurchaseRefund"></a>
# **createToolboxPurchaseRefund**
> CreateWorldMeReceiptRefundResponse createToolboxPurchaseRefund(purchaseId)

Refund a licence within 14 days while no published version of yours uses the asset. Ends the licence; the author&#39;s share is reversed.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ToolboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ToolboxApi apiInstance = new ToolboxApi(defaultClient);
    String purchaseId = "purchaseId_example"; // String | 
    try {
      CreateWorldMeReceiptRefundResponse result = apiInstance.createToolboxPurchaseRefund(purchaseId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolboxApi#createToolboxPurchaseRefund");
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
 **purchaseId** | **String**|  |

### Return type

**CreateWorldMeReceiptRefundResponse**

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

<a name="deleteToolboxAssetRatingMine"></a>
# **deleteToolboxAssetRatingMine**
> DeleteSpatialSceneGrantResponse deleteToolboxAssetRatingMine(assetId)

Remove your rating of an asset.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ToolboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ToolboxApi apiInstance = new ToolboxApi(defaultClient);
    String assetId = "assetId_example"; // String | 
    try {
      DeleteSpatialSceneGrantResponse result = apiInstance.deleteToolboxAssetRatingMine(assetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolboxApi#deleteToolboxAssetRatingMine");
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
 **assetId** | **String**|  |

### Return type

**DeleteSpatialSceneGrantResponse**

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

<a name="getToolboxAsset"></a>
# **getToolboxAsset**
> GetToolboxAssetResponse getToolboxAsset(assetId)

One asset: versions, credits (assets it includes), licence, contents, your purchase.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ToolboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ToolboxApi apiInstance = new ToolboxApi(defaultClient);
    String assetId = "assetId_example"; // String | 
    try {
      GetToolboxAssetResponse result = apiInstance.getToolboxAsset(assetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolboxApi#getToolboxAsset");
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
 **assetId** | **String**|  |

### Return type

**GetToolboxAssetResponse**

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

<a name="getToolboxAssetRating"></a>
# **getToolboxAssetRating**
> GetToolboxAssetRatingResponse getToolboxAssetRating(assetId)

Ratings of an asset: average stars, breakdown, recent reviews, yours, and whether you may rate it.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ToolboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ToolboxApi apiInstance = new ToolboxApi(defaultClient);
    String assetId = "assetId_example"; // String | 
    try {
      GetToolboxAssetRatingResponse result = apiInstance.getToolboxAssetRating(assetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolboxApi#getToolboxAssetRating");
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
 **assetId** | **String**|  |

### Return type

**GetToolboxAssetRatingResponse**

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

<a name="getToolboxPurchase"></a>
# **getToolboxPurchase**
> GetToolboxPurchaseResponse getToolboxPurchase(purchaseId)

A purchase: status, price, tax, refundable until.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ToolboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ToolboxApi apiInstance = new ToolboxApi(defaultClient);
    String purchaseId = "purchaseId_example"; // String | 
    try {
      GetToolboxPurchaseResponse result = apiInstance.getToolboxPurchase(purchaseId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolboxApi#getToolboxPurchase");
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
 **purchaseId** | **String**|  |

### Return type

**GetToolboxPurchaseResponse**

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

<a name="listToolboxAssets"></a>
# **listToolboxAssets**
> ListToolboxAssetsResponse listToolboxAssets()

Search the Toolbox: models, scripts, sounds, images, packages. Free and paid; &#x60;owned&#x60; says whether you may insert it now.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ToolboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ToolboxApi apiInstance = new ToolboxApi(defaultClient);
    try {
      ListToolboxAssetsResponse result = apiInstance.listToolboxAssets();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolboxApi#listToolboxAssets");
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

**ListToolboxAssetsResponse**

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

<a name="listToolboxLibrary"></a>
# **listToolboxLibrary**
> ListToolboxLibraryResponse listToolboxLibrary()

Assets you may insert: licences you bought, your own, free ones you used.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ToolboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ToolboxApi apiInstance = new ToolboxApi(defaultClient);
    try {
      ListToolboxLibraryResponse result = apiInstance.listToolboxLibrary();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolboxApi#listToolboxLibrary");
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

**ListToolboxLibraryResponse**

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

<a name="listToolboxMine"></a>
# **listToolboxMine**
> ListToolboxMineResponse listToolboxMine()

Your published assets: review state, reviewer note, what each earned you.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ToolboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ToolboxApi apiInstance = new ToolboxApi(defaultClient);
    try {
      ListToolboxMineResponse result = apiInstance.listToolboxMine();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolboxApi#listToolboxMine");
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

**ListToolboxMineResponse**

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

<a name="listToolboxSales"></a>
# **listToolboxSales**
> ListToolboxSalesResponse listToolboxSales()

Your Toolbox sales: gross, net, your 80% share after refunds. Never who bought.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ToolboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ToolboxApi apiInstance = new ToolboxApi(defaultClient);
    try {
      ListToolboxSalesResponse result = apiInstance.listToolboxSales();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolboxApi#listToolboxSales");
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

**ListToolboxSalesResponse**

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

<a name="updateToolboxAsset"></a>
# **updateToolboxAsset**
> ToolboxAssetResponse updateToolboxAsset(assetId)

Edit name, description, tags, thumbnail or price.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ToolboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ToolboxApi apiInstance = new ToolboxApi(defaultClient);
    String assetId = "assetId_example"; // String | 
    try {
      ToolboxAssetResponse result = apiInstance.updateToolboxAsset(assetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolboxApi#updateToolboxAsset");
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
 **assetId** | **String**|  |

### Return type

**ToolboxAssetResponse**

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

<a name="updateToolboxAssetRatingMine"></a>
# **updateToolboxAssetRatingMine**
> UpdateToolboxAssetRatingMineResponse updateToolboxAssetRatingMine(assetId)

Rate an asset you bought or installed: 1–5 stars and an optional review (1000 characters). Not your own.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ToolboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ToolboxApi apiInstance = new ToolboxApi(defaultClient);
    String assetId = "assetId_example"; // String | 
    try {
      UpdateToolboxAssetRatingMineResponse result = apiInstance.updateToolboxAssetRatingMine(assetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ToolboxApi#updateToolboxAssetRatingMine");
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
 **assetId** | **String**|  |

### Return type

**UpdateToolboxAssetRatingMineResponse**

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

