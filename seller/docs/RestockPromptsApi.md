# RestockPromptsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRestockPromptDismiss**](RestockPromptsApi.md#createRestockPromptDismiss) | **POST** /v1/restock-prompts/{id}/dismiss | Dismiss a pending restock prompt.
[**createRestockPromptRepublish**](RestockPromptsApi.md#createRestockPromptRepublish) | **POST** /v1/restock-prompts/{id}/republish | Republish a restock prompt to platforms.
[**getRestockPromptSetting**](RestockPromptsApi.md#getRestockPromptSetting) | **GET** /v1/restock-prompts/settings | Whether restocked items are republished automatically.
[**listRestockPrompts**](RestockPromptsApi.md#listRestockPrompts) | **GET** /v1/restock-prompts | List pending restock prompts.
[**updateRestockPromptSetting**](RestockPromptsApi.md#updateRestockPromptSetting) | **PUT** /v1/restock-prompts/settings | Turn automatic republish of restocked items on or off.


<a name="createRestockPromptDismiss"></a>
# **createRestockPromptDismiss**
> OkResponse createRestockPromptDismiss(id)

Dismiss a pending restock prompt.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.RestockPromptsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    RestockPromptsApi apiInstance = new RestockPromptsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      OkResponse result = apiInstance.createRestockPromptDismiss(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RestockPromptsApi#createRestockPromptDismiss");
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

<a name="createRestockPromptRepublish"></a>
# **createRestockPromptRepublish**
> CreateRestockPromptRepublishResponse createRestockPromptRepublish(id)

Republish a restock prompt to platforms.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.RestockPromptsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    RestockPromptsApi apiInstance = new RestockPromptsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateRestockPromptRepublishResponse result = apiInstance.createRestockPromptRepublish(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RestockPromptsApi#createRestockPromptRepublish");
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

**CreateRestockPromptRepublishResponse**

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

<a name="getRestockPromptSetting"></a>
# **getRestockPromptSetting**
> GetRestockPromptSettingResponse getRestockPromptSetting()

Whether restocked items are republished automatically.

autoRepublish (default true): when an item that sold out comes back in stock, Crossly republishes it to the marketplaces it came off without asking. False: a restock prompt is raised instead. A listing the seller ended by hand is never republished automatically.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.RestockPromptsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    RestockPromptsApi apiInstance = new RestockPromptsApi(defaultClient);
    try {
      GetRestockPromptSettingResponse result = apiInstance.getRestockPromptSetting();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RestockPromptsApi#getRestockPromptSetting");
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

**GetRestockPromptSettingResponse**

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

<a name="listRestockPrompts"></a>
# **listRestockPrompts**
> ListRestockPromptsResponse listRestockPrompts()

List pending restock prompts.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.RestockPromptsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    RestockPromptsApi apiInstance = new RestockPromptsApi(defaultClient);
    try {
      ListRestockPromptsResponse result = apiInstance.listRestockPrompts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RestockPromptsApi#listRestockPrompts");
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

**ListRestockPromptsResponse**

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

<a name="updateRestockPromptSetting"></a>
# **updateRestockPromptSetting**
> GetRestockPromptSettingResponse updateRestockPromptSetting(getRestockPromptSettingResponse)

Turn automatic republish of restocked items on or off.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.RestockPromptsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    RestockPromptsApi apiInstance = new RestockPromptsApi(defaultClient);
    GetRestockPromptSettingResponse getRestockPromptSettingResponse = new GetRestockPromptSettingResponse(); // GetRestockPromptSettingResponse | 
    try {
      GetRestockPromptSettingResponse result = apiInstance.updateRestockPromptSetting(getRestockPromptSettingResponse);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RestockPromptsApi#updateRestockPromptSetting");
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
 **getRestockPromptSettingResponse** | **GetRestockPromptSettingResponse**|  |

### Return type

**GetRestockPromptSettingResponse**

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

