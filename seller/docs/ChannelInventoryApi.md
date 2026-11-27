# ChannelInventoryApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteChannelInventory**](ChannelInventoryApi.md#deleteChannelInventory) | **DELETE** /v1/channel-inventory/{platform}/{slot} | Reset a channel&#39;s inventory controls to the default (no cap, no buffer, sync on, end on sell-out).
[**getChannelInventory**](ChannelInventoryApi.md#getChannelInventory) | **GET** /v1/channel-inventory/{platform}/{slot} | Get one channel&#39;s inventory controls.
[**listChannelInventory**](ChannelInventoryApi.md#listChannelInventory) | **GET** /v1/channel-inventory | List every sales channel with its inventory controls (cap, buffer, sync, out-of-stock action, exclusions).
[**updateChannelInventory**](ChannelInventoryApi.md#updateChannelInventory) | **PUT** /v1/channel-inventory/{platform}/{slot} | Set a channel&#39;s quantity cap, buffer, sync toggle, out-of-stock action and exclusion lists (merge write).


<a name="deleteChannelInventory"></a>
# **deleteChannelInventory**
> ListChannelInventoryItem deleteChannelInventory(platform, slot)

Reset a channel&#39;s inventory controls to the default (no cap, no buffer, sync on, end on sell-out).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ChannelInventoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ChannelInventoryApi apiInstance = new ChannelInventoryApi(defaultClient);
    String platform = "platform_example"; // String | 
    Integer slot = 56; // Integer | 
    try {
      ListChannelInventoryItem result = apiInstance.deleteChannelInventory(platform, slot);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelInventoryApi#deleteChannelInventory");
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
 **platform** | **String**|  |
 **slot** | **Integer**|  |

### Return type

**ListChannelInventoryItem**

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

<a name="getChannelInventory"></a>
# **getChannelInventory**
> ListChannelInventoryItem getChannelInventory(platform, slot)

Get one channel&#39;s inventory controls.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ChannelInventoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ChannelInventoryApi apiInstance = new ChannelInventoryApi(defaultClient);
    String platform = "platform_example"; // String | 
    Integer slot = 56; // Integer | 
    try {
      ListChannelInventoryItem result = apiInstance.getChannelInventory(platform, slot);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelInventoryApi#getChannelInventory");
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
 **platform** | **String**|  |
 **slot** | **Integer**|  |

### Return type

**ListChannelInventoryItem**

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

<a name="listChannelInventory"></a>
# **listChannelInventory**
> ListChannelInventoryResponse listChannelInventory()

List every sales channel with its inventory controls (cap, buffer, sync, out-of-stock action, exclusions).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ChannelInventoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ChannelInventoryApi apiInstance = new ChannelInventoryApi(defaultClient);
    try {
      ListChannelInventoryResponse result = apiInstance.listChannelInventory();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelInventoryApi#listChannelInventory");
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

**ListChannelInventoryResponse**

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

<a name="updateChannelInventory"></a>
# **updateChannelInventory**
> ListChannelInventoryItem updateChannelInventory(platform, slot)

Set a channel&#39;s quantity cap, buffer, sync toggle, out-of-stock action and exclusion lists (merge write).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ChannelInventoryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ChannelInventoryApi apiInstance = new ChannelInventoryApi(defaultClient);
    String platform = "platform_example"; // String | 
    Integer slot = 56; // Integer | 
    try {
      ListChannelInventoryItem result = apiInstance.updateChannelInventory(platform, slot);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChannelInventoryApi#updateChannelInventory");
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
 **platform** | **String**|  |
 **slot** | **Integer**|  |

### Return type

**ListChannelInventoryItem**

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

