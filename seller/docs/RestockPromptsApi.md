# RestockPromptsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRestockPromptDismiss**](RestockPromptsApi.md#createRestockPromptDismiss) | **POST** /v1/restock-prompts/{id}/dismiss | Dismiss a pending restock prompt.
[**createRestockPromptRepublish**](RestockPromptsApi.md#createRestockPromptRepublish) | **POST** /v1/restock-prompts/{id}/republish | Republish a restock prompt to platforms.
[**listRestockPrompts**](RestockPromptsApi.md#listRestockPrompts) | **GET** /v1/restock-prompts | List pending restock prompts.


<a name="createRestockPromptDismiss"></a>
# **createRestockPromptDismiss**
> CreateRestockPromptDismissResponse createRestockPromptDismiss(id)

Dismiss a pending restock prompt.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.RestockPromptsApi;

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
      CreateRestockPromptDismissResponse result = apiInstance.createRestockPromptDismiss(id);
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

[**CreateRestockPromptDismissResponse**](CreateRestockPromptDismissResponse.md)

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
import org.openapitools.client.api.RestockPromptsApi;

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

[**CreateRestockPromptRepublishResponse**](CreateRestockPromptRepublishResponse.md)

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
> V1List listRestockPrompts()

List pending restock prompts.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.RestockPromptsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    RestockPromptsApi apiInstance = new RestockPromptsApi(defaultClient);
    try {
      V1List result = apiInstance.listRestockPrompts();
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

