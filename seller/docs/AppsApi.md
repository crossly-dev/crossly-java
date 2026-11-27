# AppsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getApp**](AppsApi.md#getApp) | **GET** /v1/apps/{clientId} | Get one listed app by client id or profile slug. 404 if it is not in the directory.
[**getAppEarning**](AppsApi.md#getAppEarning) | **GET** /v1/apps/{id}/earnings | Your OAuth app&#39;s revenue-share earnings: summary + ledger. Owner only.
[**getAppListingAllowance**](AppsApi.md#getAppListingAllowance) | **GET** /v1/apps/{id}/listing-allowance | Your OAuth app&#39;s listing allowance (read-only): whether staff let sellers list above their plan through it, its limitMode (separate pool or shared with the plan), limitPeriod (total or monthly), the per-seller limit and the platform scope. Owner only.
[**listApps**](AppsApi.md#listApps) | **GET** /v1/apps | Browse the public Crossly app directories: seller apps, buyer apps or both (search, category, sort, featured, paging).


<a name="getApp"></a>
# **getApp**
> ListAppsItem getApp(clientId)

Get one listed app by client id or profile slug. 404 if it is not in the directory.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AppsApi apiInstance = new AppsApi(defaultClient);
    String clientId = "clientId_example"; // String | 
    try {
      ListAppsItem result = apiInstance.getApp(clientId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#getApp");
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
 **clientId** | **String**|  |

### Return type

**ListAppsItem**

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

<a name="getAppEarning"></a>
# **getAppEarning**
> GetAppEarningResponse getAppEarning(id)

Your OAuth app&#39;s revenue-share earnings: summary + ledger. Owner only.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AppsApi apiInstance = new AppsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      GetAppEarningResponse result = apiInstance.getAppEarning(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#getAppEarning");
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

**GetAppEarningResponse**

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

<a name="getAppListingAllowance"></a>
# **getAppListingAllowance**
> GetAppListingAllowanceResponse getAppListingAllowance(id)

Your OAuth app&#39;s listing allowance (read-only): whether staff let sellers list above their plan through it, its limitMode (separate pool or shared with the plan), limitPeriod (total or monthly), the per-seller limit and the platform scope. Owner only.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AppsApi apiInstance = new AppsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      GetAppListingAllowanceResponse result = apiInstance.getAppListingAllowance(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#getAppListingAllowance");
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

**GetAppListingAllowanceResponse**

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

<a name="listApps"></a>
# **listApps**
> ListAppsResponse listApps(directory, sort, featured, category, q, limit, cursor)

Browse the public Crossly app directories: seller apps, buyer apps or both (search, category, sort, featured, paging).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AppsApi apiInstance = new AppsApi(defaultClient);
    String directory = "seller"; // String | 
    String sort = "popular"; // String | 
    String featured = "true"; // String | 
    String category = "category_example"; // String | 
    String q = "q_example"; // String | 
    Integer limit = 56; // Integer | 
    String cursor = "cursor_example"; // String | 
    try {
      ListAppsResponse result = apiInstance.listApps(directory, sort, featured, category, q, limit, cursor);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppsApi#listApps");
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
 **directory** | **String**|  | [optional] [enum: seller, buyer, all]
 **sort** | **String**|  | [optional] [enum: popular, newest, verified]
 **featured** | **String**|  | [optional] [enum: true, false]
 **category** | **String**|  | [optional]
 **q** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **cursor** | **String**|  | [optional]

### Return type

**ListAppsResponse**

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

