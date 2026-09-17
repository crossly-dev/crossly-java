# NetworkApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNetworkPool**](NetworkApi.md#createNetworkPool) | **POST** /v1/network/pool | Join the Crossly Network reciprocal engagement pool.
[**deleteNetworkPool**](NetworkApi.md#deleteNetworkPool) | **DELETE** /v1/network/pool | Leave the Crossly Network pool.
[**getNetworkPool**](NetworkApi.md#getNetworkPool) | **GET** /v1/network/pool | The seller&#39;s Crossly Network pool membership row.
[**getNetworkPoolSize**](NetworkApi.md#getNetworkPoolSize) | **GET** /v1/network/pool/size | Total members in the Crossly Network pool.
[**listNetworkPoolLog**](NetworkApi.md#listNetworkPoolLog) | **GET** /v1/network/pool/log | Recent engagement history — both sent and received.
[**updateNetworkPool**](NetworkApi.md#updateNetworkPool) | **PATCH** /v1/network/pool | Update per-action toggles + platforms on pool membership.


<a name="createNetworkPool"></a>
# **createNetworkPool**
> CreateNetworkPoolResponse createNetworkPool()

Join the Crossly Network reciprocal engagement pool.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.NetworkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    NetworkApi apiInstance = new NetworkApi(defaultClient);
    try {
      CreateNetworkPoolResponse result = apiInstance.createNetworkPool();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkApi#createNetworkPool");
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

[**CreateNetworkPoolResponse**](CreateNetworkPoolResponse.md)

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

<a name="deleteNetworkPool"></a>
# **deleteNetworkPool**
> DeleteNetworkPoolResponse deleteNetworkPool()

Leave the Crossly Network pool.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.NetworkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    NetworkApi apiInstance = new NetworkApi(defaultClient);
    try {
      DeleteNetworkPoolResponse result = apiInstance.deleteNetworkPool();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkApi#deleteNetworkPool");
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

[**DeleteNetworkPoolResponse**](DeleteNetworkPoolResponse.md)

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

<a name="getNetworkPool"></a>
# **getNetworkPool**
> GetNetworkPoolResponse getNetworkPool()

The seller&#39;s Crossly Network pool membership row.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.NetworkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    NetworkApi apiInstance = new NetworkApi(defaultClient);
    try {
      GetNetworkPoolResponse result = apiInstance.getNetworkPool();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkApi#getNetworkPool");
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

[**GetNetworkPoolResponse**](GetNetworkPoolResponse.md)

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

<a name="getNetworkPoolSize"></a>
# **getNetworkPoolSize**
> GetNetworkPoolSizeResponse getNetworkPoolSize()

Total members in the Crossly Network pool.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.NetworkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    NetworkApi apiInstance = new NetworkApi(defaultClient);
    try {
      GetNetworkPoolSizeResponse result = apiInstance.getNetworkPoolSize();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkApi#getNetworkPoolSize");
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

[**GetNetworkPoolSizeResponse**](GetNetworkPoolSizeResponse.md)

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

<a name="listNetworkPoolLog"></a>
# **listNetworkPoolLog**
> V1List listNetworkPoolLog(limit)

Recent engagement history — both sent and received.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.NetworkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    NetworkApi apiInstance = new NetworkApi(defaultClient);
    Integer limit = 100; // Integer | 
    try {
      V1List result = apiInstance.listNetworkPoolLog(limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkApi#listNetworkPoolLog");
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
 **limit** | **Integer**|  | [optional] [default to 100]

### Return type

[**V1List**](V1List.md)

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

<a name="updateNetworkPool"></a>
# **updateNetworkPool**
> UpdateNetworkPoolResponse updateNetworkPool()

Update per-action toggles + platforms on pool membership.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.NetworkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    NetworkApi apiInstance = new NetworkApi(defaultClient);
    try {
      UpdateNetworkPoolResponse result = apiInstance.updateNetworkPool();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkApi#updateNetworkPool");
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

[**UpdateNetworkPoolResponse**](UpdateNetworkPoolResponse.md)

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

