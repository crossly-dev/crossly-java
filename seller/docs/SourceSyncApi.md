# SourceSyncApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSourceSyncSync**](SourceSyncApi.md#createSourceSyncSync) | **POST** /v1/source-sync/{platform}/sync | Reconcile a store now: re-read its whole catalogue and apply every change (runs in the background; 202).
[**getSourceSyncLocation**](SourceSyncApi.md#getSourceSyncLocation) | **GET** /v1/source-sync/{platform}/locations | POS only (lightspeed_r, lightspeed_x, square): the shops/outlets/locations on the account and which one Crossly syncs stock and sales with.
[**listSourceSync**](SourceSyncApi.md#listSourceSync) | **GET** /v1/source-sync | List source-capable stores with their continuous-sync settings and status.
[**listSourceSyncEvents**](SourceSyncApi.md#listSourceSyncEvents) | **GET** /v1/source-sync/events | Recent source-sync activity: each webhook delivery and reconcile change, with its outcome.
[**updateSourceSync**](SourceSyncApi.md#updateSourceSync) | **PATCH** /v1/source-sync/{platform} | Update a store&#39;s source-sync settings: on/off, source-owned fields, deletion handling, auto-export channels.
[**updateSourceSyncLocation**](SourceSyncApi.md#updateSourceSyncLocation) | **PUT** /v1/source-sync/{platform}/location | POS only: choose the shop (R-Series) / outlet (X-Series) / Square location whose stock and sales Crossly syncs. Must be one GET .../locations lists.


<a name="createSourceSyncSync"></a>
# **createSourceSyncSync**
> CreateSourceSyncSyncResponse createSourceSyncSync(platform)

Reconcile a store now: re-read its whole catalogue and apply every change (runs in the background; 202).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.SourceSyncApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    SourceSyncApi apiInstance = new SourceSyncApi(defaultClient);
    String platform = "shopify"; // String | 
    try {
      CreateSourceSyncSyncResponse result = apiInstance.createSourceSyncSync(platform);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceSyncApi#createSourceSyncSync");
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
 **platform** | **String**|  | [enum: shopify, woocommerce, bigcommerce, wix, squarespace, lightspeed_r, lightspeed_x, square]

### Return type

**CreateSourceSyncSyncResponse**

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

<a name="getSourceSyncLocation"></a>
# **getSourceSyncLocation**
> GetSourceSyncLocationResponse getSourceSyncLocation(platform)

POS only (lightspeed_r, lightspeed_x, square): the shops/outlets/locations on the account and which one Crossly syncs stock and sales with.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.SourceSyncApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    SourceSyncApi apiInstance = new SourceSyncApi(defaultClient);
    String platform = "lightspeed_r"; // String | 
    try {
      GetSourceSyncLocationResponse result = apiInstance.getSourceSyncLocation(platform);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceSyncApi#getSourceSyncLocation");
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
 **platform** | **String**|  | [enum: lightspeed_r, lightspeed_x, square]

### Return type

**GetSourceSyncLocationResponse**

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

<a name="listSourceSync"></a>
# **listSourceSync**
> ListSourceSyncResponse listSourceSync()

List source-capable stores with their continuous-sync settings and status.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.SourceSyncApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    SourceSyncApi apiInstance = new SourceSyncApi(defaultClient);
    try {
      ListSourceSyncResponse result = apiInstance.listSourceSync();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceSyncApi#listSourceSync");
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

**ListSourceSyncResponse**

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

<a name="listSourceSyncEvents"></a>
# **listSourceSyncEvents**
> ListSourceSyncEventsResponse listSourceSyncEvents(platform, limit)

Recent source-sync activity: each webhook delivery and reconcile change, with its outcome.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.SourceSyncApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    SourceSyncApi apiInstance = new SourceSyncApi(defaultClient);
    String platform = "shopify"; // String | 
    Integer limit = 56; // Integer | 
    try {
      ListSourceSyncEventsResponse result = apiInstance.listSourceSyncEvents(platform, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceSyncApi#listSourceSyncEvents");
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
 **platform** | **String**|  | [optional] [enum: shopify, woocommerce, bigcommerce, wix, squarespace, lightspeed_r, lightspeed_x, square]
 **limit** | **Integer**|  | [optional]

### Return type

**ListSourceSyncEventsResponse**

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

<a name="updateSourceSync"></a>
# **updateSourceSync**
> ListSourceSyncItem updateSourceSync(platform)

Update a store&#39;s source-sync settings: on/off, source-owned fields, deletion handling, auto-export channels.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.SourceSyncApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    SourceSyncApi apiInstance = new SourceSyncApi(defaultClient);
    String platform = "shopify"; // String | 
    try {
      ListSourceSyncItem result = apiInstance.updateSourceSync(platform);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceSyncApi#updateSourceSync");
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
 **platform** | **String**|  | [enum: shopify, woocommerce, bigcommerce, wix, squarespace, lightspeed_r, lightspeed_x, square]

### Return type

**ListSourceSyncItem**

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

<a name="updateSourceSyncLocation"></a>
# **updateSourceSyncLocation**
> GetSourceSyncLocationResponse updateSourceSyncLocation(platform, updateSourceSyncLocationRequest)

POS only: choose the shop (R-Series) / outlet (X-Series) / Square location whose stock and sales Crossly syncs. Must be one GET .../locations lists.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.SourceSyncApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    SourceSyncApi apiInstance = new SourceSyncApi(defaultClient);
    String platform = "lightspeed_r"; // String | 
    UpdateSourceSyncLocationRequest updateSourceSyncLocationRequest = new UpdateSourceSyncLocationRequest(); // UpdateSourceSyncLocationRequest | 
    try {
      GetSourceSyncLocationResponse result = apiInstance.updateSourceSyncLocation(platform, updateSourceSyncLocationRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourceSyncApi#updateSourceSyncLocation");
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
 **platform** | **String**|  | [enum: lightspeed_r, lightspeed_x, square]
 **updateSourceSyncLocationRequest** | **UpdateSourceSyncLocationRequest**|  |

### Return type

**GetSourceSyncLocationResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
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

