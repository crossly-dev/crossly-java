# ActivityApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getActionLog**](ActivityApi.md#getActionLog) | **GET** /v1/action-log/{id} | Get one action-log event by id (ownership-checked).
[**getActionLogFacet**](ActivityApi.md#getActionLogFacet) | **GET** /v1/action-log/facets | Distinct platforms / actions / categories present in the caller&#39;s action log (last 90 days) — powers filter dropdowns before you query.
[**listActionLog**](ActivityApi.md#listActionLog) | **GET** /v1/action-log | List action-log events — the semantic \&quot;what happened\&quot; record of every user + platform action. Filter by platform / action / category / status / source / target, and a since/until created_at window.
[**listActionLogCalls**](ActivityApi.md#listActionLogCalls) | **GET** /v1/action-log/{id}/calls | The outbound platform HTTP calls under an event (oldest first) — url, method, status, latency, redacted request/response bodies, proxy + recipe/hash. Answers \&quot;what was sent / what went wrong\&quot;.


<a name="getActionLog"></a>
# **getActionLog**
> GetActionLogResponse getActionLog(id)

Get one action-log event by id (ownership-checked).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.ActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ActivityApi apiInstance = new ActivityApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      GetActionLogResponse result = apiInstance.getActionLog(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#getActionLog");
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

[**GetActionLogResponse**](GetActionLogResponse.md)

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

<a name="getActionLogFacet"></a>
# **getActionLogFacet**
> GetActionLogFacetResponse getActionLogFacet()

Distinct platforms / actions / categories present in the caller&#39;s action log (last 90 days) — powers filter dropdowns before you query.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.ActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ActivityApi apiInstance = new ActivityApi(defaultClient);
    try {
      GetActionLogFacetResponse result = apiInstance.getActionLogFacet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#getActionLogFacet");
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

[**GetActionLogFacetResponse**](GetActionLogFacetResponse.md)

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

<a name="listActionLog"></a>
# **listActionLog**
> V1List listActionLog(platform, action, category, status, source, targetType, targetId, since, until, limit, offset)

List action-log events — the semantic \&quot;what happened\&quot; record of every user + platform action. Filter by platform / action / category / status / source / target, and a since/until created_at window.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.ActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ActivityApi apiInstance = new ActivityApi(defaultClient);
    String platform = "platform_example"; // String | 
    String action = "action_example"; // String | 
    String category = "category_example"; // String | 
    String status = "status_example"; // String | 
    String source = "source_example"; // String | 
    String targetType = "targetType_example"; // String | 
    String targetId = "targetId_example"; // String | 
    String since = "since_example"; // String | ISO lower bound (inclusive) on created_at.
    String until = "until_example"; // String | ISO upper bound (exclusive) on created_at.
    Integer limit = 50; // Integer | 
    Integer offset = 0; // Integer | 
    try {
      V1List result = apiInstance.listActionLog(platform, action, category, status, source, targetType, targetId, since, until, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#listActionLog");
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
 **platform** | **String**|  | [optional]
 **action** | **String**|  | [optional]
 **category** | **String**|  | [optional]
 **status** | **String**|  | [optional]
 **source** | **String**|  | [optional]
 **targetType** | **String**|  | [optional]
 **targetId** | **String**|  | [optional]
 **since** | **String**| ISO lower bound (inclusive) on created_at. | [optional]
 **until** | **String**| ISO upper bound (exclusive) on created_at. | [optional]
 **limit** | **Integer**|  | [optional] [default to 50]
 **offset** | **Integer**|  | [optional] [default to 0]

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

<a name="listActionLogCalls"></a>
# **listActionLogCalls**
> V1List listActionLogCalls(id)

The outbound platform HTTP calls under an event (oldest first) — url, method, status, latency, redacted request/response bodies, proxy + recipe/hash. Answers \&quot;what was sent / what went wrong\&quot;.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.ActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ActivityApi apiInstance = new ActivityApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      V1List result = apiInstance.listActionLogCalls(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#listActionLogCalls");
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

