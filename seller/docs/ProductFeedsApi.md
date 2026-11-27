# ProductFeedsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProductFeed**](ProductFeedsApi.md#createProductFeed) | **POST** /v1/product-feeds | Create a hosted product feed for a channel. Returns its secret URL.
[**createProductFeedRotate**](ProductFeedsApi.md#createProductFeedRotate) | **POST** /v1/product-feeds/{id}/rotate | Rotate the feed token. The old URL stops answering immediately; paste the new one into the channel.
[**deleteProductFeed**](ProductFeedsApi.md#deleteProductFeed) | **DELETE** /v1/product-feeds/{id} | Delete a feed. Its URL stops answering immediately.
[**getProductFeedReport**](ProductFeedsApi.md#getProductFeedReport) | **GET** /v1/product-feeds/{id}/report | Validate a feed: per-item errors (held back) and warnings (sent, limited reach), plus sample rendered items.
[**listProductFeeds**](ProductFeedsApi.md#listProductFeeds) | **GET** /v1/product-feeds | List your hosted product feeds (Google Merchant Center, Meta catalogue, TikTok catalog) with their URLs and last-fetch stats.
[**updateProductFeed**](ProductFeedsApi.md#updateProductFeed) | **PATCH** /v1/product-feeds/{id} | Edit a feed: name, default format, enabled, listing filters, output settings.


<a name="createProductFeed"></a>
# **createProductFeed**
> ListProductFeedsItem createProductFeed()

Create a hosted product feed for a channel. Returns its secret URL.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ProductFeedsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ProductFeedsApi apiInstance = new ProductFeedsApi(defaultClient);
    try {
      ListProductFeedsItem result = apiInstance.createProductFeed();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductFeedsApi#createProductFeed");
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

**ListProductFeedsItem**

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

<a name="createProductFeedRotate"></a>
# **createProductFeedRotate**
> ListProductFeedsItem createProductFeedRotate(id)

Rotate the feed token. The old URL stops answering immediately; paste the new one into the channel.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ProductFeedsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ProductFeedsApi apiInstance = new ProductFeedsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      ListProductFeedsItem result = apiInstance.createProductFeedRotate(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductFeedsApi#createProductFeedRotate");
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

**ListProductFeedsItem**

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

<a name="deleteProductFeed"></a>
# **deleteProductFeed**
> OkResponse deleteProductFeed(id)

Delete a feed. Its URL stops answering immediately.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ProductFeedsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ProductFeedsApi apiInstance = new ProductFeedsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      OkResponse result = apiInstance.deleteProductFeed(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductFeedsApi#deleteProductFeed");
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

**OkResponse**

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

<a name="getProductFeedReport"></a>
# **getProductFeedReport**
> GetProductFeedReportResponse getProductFeedReport(id)

Validate a feed: per-item errors (held back) and warnings (sent, limited reach), plus sample rendered items.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ProductFeedsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ProductFeedsApi apiInstance = new ProductFeedsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      GetProductFeedReportResponse result = apiInstance.getProductFeedReport(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductFeedsApi#getProductFeedReport");
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

**GetProductFeedReportResponse**

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

<a name="listProductFeeds"></a>
# **listProductFeeds**
> ListProductFeedsResponse listProductFeeds()

List your hosted product feeds (Google Merchant Center, Meta catalogue, TikTok catalog) with their URLs and last-fetch stats.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ProductFeedsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ProductFeedsApi apiInstance = new ProductFeedsApi(defaultClient);
    try {
      ListProductFeedsResponse result = apiInstance.listProductFeeds();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductFeedsApi#listProductFeeds");
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

**ListProductFeedsResponse**

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

<a name="updateProductFeed"></a>
# **updateProductFeed**
> ListProductFeedsItem updateProductFeed(id)

Edit a feed: name, default format, enabled, listing filters, output settings.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ProductFeedsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ProductFeedsApi apiInstance = new ProductFeedsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      ListProductFeedsItem result = apiInstance.updateProductFeed(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductFeedsApi#updateProductFeed");
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

**ListProductFeedsItem**

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

