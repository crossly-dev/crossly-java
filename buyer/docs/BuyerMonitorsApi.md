# BuyerMonitorsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBuyerMonitor**](BuyerMonitorsApi.md#createBuyerMonitor) | **POST** /v1/buyer/monitors | Watch a search, and be told when it matches.
[**deleteBuyerMonitor**](BuyerMonitorsApi.md#deleteBuyerMonitor) | **DELETE** /v1/buyer/monitors/{id} | Delete a monitor.
[**listBuyerMonitorMatches**](BuyerMonitorsApi.md#listBuyerMonitorMatches) | **GET** /v1/buyer/monitors/{id}/matches | What this monitor has matched.
[**listBuyerMonitors**](BuyerMonitorsApi.md#listBuyerMonitors) | **GET** /v1/buyer/monitors | Your monitors.
[**updateBuyerMonitor**](BuyerMonitorsApi.md#updateBuyerMonitor) | **PATCH** /v1/buyer/monitors/{id} | Pause, resume or rename a monitor.


<a name="createBuyerMonitor"></a>
# **createBuyerMonitor**
> CreateBuyerMonitorResponse createBuyerMonitor()

Watch a search, and be told when it matches.

Works immediately — there is no review step. The signing secret is returned ONCE, here; it is never readable again. The first sweep SEEDS without firing: a restock alert created while the item is already in stock has not observed a restock, and a new-listing monitor would otherwise deliver the entire back catalogue.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import org.openapitools.client.api.BuyerMonitorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerMonitorsApi apiInstance = new BuyerMonitorsApi(defaultClient);
    try {
      CreateBuyerMonitorResponse result = apiInstance.createBuyerMonitor();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerMonitorsApi#createBuyerMonitor");
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

[**CreateBuyerMonitorResponse**](CreateBuyerMonitorResponse.md)

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

<a name="deleteBuyerMonitor"></a>
# **deleteBuyerMonitor**
> deleteBuyerMonitor(id)

Delete a monitor.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import org.openapitools.client.api.BuyerMonitorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerMonitorsApi apiInstance = new BuyerMonitorsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteBuyerMonitor(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerMonitorsApi#deleteBuyerMonitor");
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

null (empty response body)

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerMonitorMatches"></a>
# **listBuyerMonitorMatches**
> V1List listBuyerMonitorMatches(id)

What this monitor has matched.

The read side of a &#x60;poll&#x60; monitor, and an audit trail for a &#x60;webhook&#x60; one — so a missed delivery does not mean lost data.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import org.openapitools.client.api.BuyerMonitorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerMonitorsApi apiInstance = new BuyerMonitorsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      V1List result = apiInstance.listBuyerMonitorMatches(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerMonitorsApi#listBuyerMonitorMatches");
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

<a name="listBuyerMonitors"></a>
# **listBuyerMonitors**
> V1List listBuyerMonitors()

Your monitors.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import org.openapitools.client.api.BuyerMonitorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerMonitorsApi apiInstance = new BuyerMonitorsApi(defaultClient);
    try {
      V1List result = apiInstance.listBuyerMonitors();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerMonitorsApi#listBuyerMonitors");
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

<a name="updateBuyerMonitor"></a>
# **updateBuyerMonitor**
> UpdateBuyerMonitorResponse updateBuyerMonitor(id)

Pause, resume or rename a monitor.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import org.openapitools.client.api.BuyerMonitorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerMonitorsApi apiInstance = new BuyerMonitorsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      UpdateBuyerMonitorResponse result = apiInstance.updateBuyerMonitor(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerMonitorsApi#updateBuyerMonitor");
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

[**UpdateBuyerMonitorResponse**](UpdateBuyerMonitorResponse.md)

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

