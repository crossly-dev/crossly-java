# IntegrationsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNotificationIntegration**](IntegrationsApi.md#createNotificationIntegration) | **POST** /v1/notification-integrations | Add a Slack/Discord/Webhook destination.
[**createNotificationIntegrationTest**](IntegrationsApi.md#createNotificationIntegrationTest) | **POST** /v1/notification-integrations/{id}/test | Fire a canned test message to a notification destination.
[**deleteNotificationIntegration**](IntegrationsApi.md#deleteNotificationIntegration) | **DELETE** /v1/notification-integrations/{id} | Delete a notification destination.
[**listNotificationIntegrations**](IntegrationsApi.md#listNotificationIntegrations) | **GET** /v1/notification-integrations | List Slack/Discord/Webhook destinations for notify.* automation actions.
[**updateNotificationIntegration**](IntegrationsApi.md#updateNotificationIntegration) | **PATCH** /v1/notification-integrations/{id} | Edit a notification destination.


<a name="createNotificationIntegration"></a>
# **createNotificationIntegration**
> CreateNotificationIntegrationResponse createNotificationIntegration()

Add a Slack/Discord/Webhook destination.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.IntegrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    IntegrationsApi apiInstance = new IntegrationsApi(defaultClient);
    try {
      CreateNotificationIntegrationResponse result = apiInstance.createNotificationIntegration();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#createNotificationIntegration");
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

[**CreateNotificationIntegrationResponse**](CreateNotificationIntegrationResponse.md)

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

<a name="createNotificationIntegrationTest"></a>
# **createNotificationIntegrationTest**
> CreateNotificationIntegrationTestResponse createNotificationIntegrationTest(id)

Fire a canned test message to a notification destination.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.IntegrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    IntegrationsApi apiInstance = new IntegrationsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateNotificationIntegrationTestResponse result = apiInstance.createNotificationIntegrationTest(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#createNotificationIntegrationTest");
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

[**CreateNotificationIntegrationTestResponse**](CreateNotificationIntegrationTestResponse.md)

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

<a name="deleteNotificationIntegration"></a>
# **deleteNotificationIntegration**
> DeleteNotificationIntegrationResponse deleteNotificationIntegration(id)

Delete a notification destination.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.IntegrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    IntegrationsApi apiInstance = new IntegrationsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      DeleteNotificationIntegrationResponse result = apiInstance.deleteNotificationIntegration(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#deleteNotificationIntegration");
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

[**DeleteNotificationIntegrationResponse**](DeleteNotificationIntegrationResponse.md)

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

<a name="listNotificationIntegrations"></a>
# **listNotificationIntegrations**
> V1List listNotificationIntegrations()

List Slack/Discord/Webhook destinations for notify.* automation actions.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.IntegrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    IntegrationsApi apiInstance = new IntegrationsApi(defaultClient);
    try {
      V1List result = apiInstance.listNotificationIntegrations();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#listNotificationIntegrations");
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

<a name="updateNotificationIntegration"></a>
# **updateNotificationIntegration**
> UpdateNotificationIntegrationResponse updateNotificationIntegration(id)

Edit a notification destination.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.IntegrationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    IntegrationsApi apiInstance = new IntegrationsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      UpdateNotificationIntegrationResponse result = apiInstance.updateNotificationIntegration(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IntegrationsApi#updateNotificationIntegration");
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

[**UpdateNotificationIntegrationResponse**](UpdateNotificationIntegrationResponse.md)

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

