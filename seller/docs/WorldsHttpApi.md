# WorldsHttpApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorldExperienceHttpDomain**](WorldsHttpApi.md#createWorldExperienceHttpDomain) | **POST** /v1/worlds/experiences/{experienceId}/http/domains | Declare a domain server scripts may call (example.com or *.example.com). It is reviewed by a person before it works.
[**deleteWorldExperienceHttpDomain**](WorldsHttpApi.md#deleteWorldExperienceHttpDomain) | **DELETE** /v1/worlds/experiences/{experienceId}/http/domains/{domainId} | Remove a domain: scripts lose access at once.
[**deleteWorldExperienceHttpSecret**](WorldsHttpApi.md#deleteWorldExperienceHttpSecret) | **DELETE** /v1/worlds/experiences/{experienceId}/http/secrets/{name} | Delete a secret.
[**getWorldExperienceHttp**](WorldsHttpApi.md#getWorldExperienceHttp) | **GET** /v1/worlds/experiences/{experienceId}/http | Http settings: declared domains with their review state, secret names (never values), limits and rules.
[**updateWorldExperienceHttpSecret**](WorldsHttpApi.md#updateWorldExperienceHttpSecret) | **PUT** /v1/worlds/experiences/{experienceId}/http/secrets/{name} | Set a secret (UPPER_SNAKE name). Scripts reference it as Http.secret(\&quot;NAME\&quot;); the value is never returned.


<a name="createWorldExperienceHttpDomain"></a>
# **createWorldExperienceHttpDomain**
> CreateWorldExperienceHttpDomainResponse createWorldExperienceHttpDomain(experienceId)

Declare a domain server scripts may call (example.com or *.example.com). It is reviewed by a person before it works.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsHttpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsHttpApi apiInstance = new WorldsHttpApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      CreateWorldExperienceHttpDomainResponse result = apiInstance.createWorldExperienceHttpDomain(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsHttpApi#createWorldExperienceHttpDomain");
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
 **experienceId** | **String**|  |

### Return type

**CreateWorldExperienceHttpDomainResponse**

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

<a name="deleteWorldExperienceHttpDomain"></a>
# **deleteWorldExperienceHttpDomain**
> DeleteSpatialSceneGrantResponse deleteWorldExperienceHttpDomain(experienceId, domainId)

Remove a domain: scripts lose access at once.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsHttpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsHttpApi apiInstance = new WorldsHttpApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String domainId = "domainId_example"; // String | 
    try {
      DeleteSpatialSceneGrantResponse result = apiInstance.deleteWorldExperienceHttpDomain(experienceId, domainId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsHttpApi#deleteWorldExperienceHttpDomain");
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
 **experienceId** | **String**|  |
 **domainId** | **String**|  |

### Return type

**DeleteSpatialSceneGrantResponse**

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

<a name="deleteWorldExperienceHttpSecret"></a>
# **deleteWorldExperienceHttpSecret**
> DeleteSpatialSceneGrantResponse deleteWorldExperienceHttpSecret(experienceId, name)

Delete a secret.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsHttpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsHttpApi apiInstance = new WorldsHttpApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String name = "name_example"; // String | 
    try {
      DeleteSpatialSceneGrantResponse result = apiInstance.deleteWorldExperienceHttpSecret(experienceId, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsHttpApi#deleteWorldExperienceHttpSecret");
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
 **experienceId** | **String**|  |
 **name** | **String**|  |

### Return type

**DeleteSpatialSceneGrantResponse**

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

<a name="getWorldExperienceHttp"></a>
# **getWorldExperienceHttp**
> GetWorldExperienceHttpResponse getWorldExperienceHttp(experienceId)

Http settings: declared domains with their review state, secret names (never values), limits and rules.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsHttpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsHttpApi apiInstance = new WorldsHttpApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      GetWorldExperienceHttpResponse result = apiInstance.getWorldExperienceHttp(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsHttpApi#getWorldExperienceHttp");
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
 **experienceId** | **String**|  |

### Return type

**GetWorldExperienceHttpResponse**

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

<a name="updateWorldExperienceHttpSecret"></a>
# **updateWorldExperienceHttpSecret**
> UpdateWorldExperienceHttpSecretResponse updateWorldExperienceHttpSecret(experienceId, name)

Set a secret (UPPER_SNAKE name). Scripts reference it as Http.secret(\&quot;NAME\&quot;); the value is never returned.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsHttpApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsHttpApi apiInstance = new WorldsHttpApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String name = "name_example"; // String | 
    try {
      UpdateWorldExperienceHttpSecretResponse result = apiInstance.updateWorldExperienceHttpSecret(experienceId, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsHttpApi#updateWorldExperienceHttpSecret");
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
 **experienceId** | **String**|  |
 **name** | **String**|  |

### Return type

**UpdateWorldExperienceHttpSecretResponse**

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

