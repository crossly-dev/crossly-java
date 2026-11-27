# GroupBuysApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGroupBuy**](GroupBuysApi.md#createGroupBuy) | **POST** /v1/group-buys | Run a group buy on a listing with stock: price tiers by committed quantity, a goal and minimum to proceed, a per-buyer max, a deadline, authorize-now or pay-now-refund-the-difference, a goal-miss policy (cancel, proceed, extend once), visibility, placement and share copy. The original body (tiers by buyer count, minBuyers, days) is still accepted.
[**createGroupBuyCancel**](GroupBuysApi.md#createGroupBuyCancel) | **POST** /v1/group-buys/{id}/cancel | Cancel a group buy: every hold is released and every charge refunded.
[**createGroupBuyClose**](GroupBuysApi.md#createGroupBuyClose) | **POST** /v1/group-buys/{id}/close | Close a group buy now: every buyer pays the price reached (the minimum and goal-miss policy still apply).
[**createGroupBuyExtend**](GroupBuysApi.md#createGroupBuyExtend) | **POST** /v1/group-buys/{id}/extend | Move the deadline later by N days (authorize-now pools run at most 6 days, pay-now pools 30).
[**createGroupBuyMessage**](GroupBuysApi.md#createGroupBuyMessage) | **POST** /v1/group-buys/{id}/message | Send a notification to every buyer committed to the group buy.
[**getGroupBuy**](GroupBuysApi.md#getGroupBuy) | **GET** /v1/group-buys/{id} | One group buy: progress towards each tier, committed buyers (masked), time left, revenue at the current tier and the activity feed.
[**getGroupBuyParticipantsCsv**](GroupBuysApi.md#getGroupBuyParticipantsCsv) | **GET** /v1/group-buys/{id}/participants.csv | Every participant of a group buy as CSV: quantity, status, amounts and ship-to.
[**listGroupBuys**](GroupBuysApi.md#listGroupBuys) | **GET** /v1/group-buys | Your group buys, open ones first: tiers, buyers joined, the price reached and when it ends.
[**updateGroupBuy**](GroupBuysApi.md#updateGroupBuy) | **PATCH** /v1/group-buys/{id} | Edit a group buy. Copy, visibility, placement and the per-buyer max change any time; tiers, goal, minimum, payment mode and goal-miss policy only before anyone commits.


<a name="createGroupBuy"></a>
# **createGroupBuy**
> CreateBreakResponse createGroupBuy()

Run a group buy on a listing with stock: price tiers by committed quantity, a goal and minimum to proceed, a per-buyer max, a deadline, authorize-now or pay-now-refund-the-difference, a goal-miss policy (cancel, proceed, extend once), visibility, placement and share copy. The original body (tiers by buyer count, minBuyers, days) is still accepted.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.GroupBuysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    GroupBuysApi apiInstance = new GroupBuysApi(defaultClient);
    try {
      CreateBreakResponse result = apiInstance.createGroupBuy();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupBuysApi#createGroupBuy");
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

**CreateBreakResponse**

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

<a name="createGroupBuyCancel"></a>
# **createGroupBuyCancel**
> CreateGroupBuyCancelResponse createGroupBuyCancel(id)

Cancel a group buy: every hold is released and every charge refunded.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.GroupBuysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    GroupBuysApi apiInstance = new GroupBuysApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateGroupBuyCancelResponse result = apiInstance.createGroupBuyCancel(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupBuysApi#createGroupBuyCancel");
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

**CreateGroupBuyCancelResponse**

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

<a name="createGroupBuyClose"></a>
# **createGroupBuyClose**
> CreateGroupBuyCloseResponse createGroupBuyClose(id)

Close a group buy now: every buyer pays the price reached (the minimum and goal-miss policy still apply).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.GroupBuysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    GroupBuysApi apiInstance = new GroupBuysApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateGroupBuyCloseResponse result = apiInstance.createGroupBuyClose(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupBuysApi#createGroupBuyClose");
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

**CreateGroupBuyCloseResponse**

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

<a name="createGroupBuyExtend"></a>
# **createGroupBuyExtend**
> CreateGroupBuyExtendResponse createGroupBuyExtend(id)

Move the deadline later by N days (authorize-now pools run at most 6 days, pay-now pools 30).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.GroupBuysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    GroupBuysApi apiInstance = new GroupBuysApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateGroupBuyExtendResponse result = apiInstance.createGroupBuyExtend(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupBuysApi#createGroupBuyExtend");
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

**CreateGroupBuyExtendResponse**

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

<a name="createGroupBuyMessage"></a>
# **createGroupBuyMessage**
> CreateGroupBuyMessageResponse createGroupBuyMessage(id)

Send a notification to every buyer committed to the group buy.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.GroupBuysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    GroupBuysApi apiInstance = new GroupBuysApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateGroupBuyMessageResponse result = apiInstance.createGroupBuyMessage(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupBuysApi#createGroupBuyMessage");
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

**CreateGroupBuyMessageResponse**

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

<a name="getGroupBuy"></a>
# **getGroupBuy**
> GetGroupBuyResponse getGroupBuy(id)

One group buy: progress towards each tier, committed buyers (masked), time left, revenue at the current tier and the activity feed.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.GroupBuysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    GroupBuysApi apiInstance = new GroupBuysApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetGroupBuyResponse result = apiInstance.getGroupBuy(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupBuysApi#getGroupBuy");
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

**GetGroupBuyResponse**

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

<a name="getGroupBuyParticipantsCsv"></a>
# **getGroupBuyParticipantsCsv**
> String getGroupBuyParticipantsCsv(id)

Every participant of a group buy as CSV: quantity, status, amounts and ship-to.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.GroupBuysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    GroupBuysApi apiInstance = new GroupBuysApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      String result = apiInstance.getGroupBuyParticipantsCsv(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupBuysApi#getGroupBuyParticipantsCsv");
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

**String**

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

<a name="listGroupBuys"></a>
# **listGroupBuys**
> ListGroupBuysResponse listGroupBuys()

Your group buys, open ones first: tiers, buyers joined, the price reached and when it ends.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.GroupBuysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    GroupBuysApi apiInstance = new GroupBuysApi(defaultClient);
    try {
      ListGroupBuysResponse result = apiInstance.listGroupBuys();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupBuysApi#listGroupBuys");
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

**ListGroupBuysResponse**

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

<a name="updateGroupBuy"></a>
# **updateGroupBuy**
> UpdateGroupBuyResponse updateGroupBuy(id)

Edit a group buy. Copy, visibility, placement and the per-buyer max change any time; tiers, goal, minimum, payment mode and goal-miss policy only before anyone commits.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.GroupBuysApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    GroupBuysApi apiInstance = new GroupBuysApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      UpdateGroupBuyResponse result = apiInstance.updateGroupBuy(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupBuysApi#updateGroupBuy");
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

**UpdateGroupBuyResponse**

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

