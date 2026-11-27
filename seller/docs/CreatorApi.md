# CreatorApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCreatorExperienceKey**](CreatorApi.md#createCreatorExperienceKey) | **POST** /v1/creator/experience-keys | Issue an experience API key for a back-end or CI: name, creator scopes (worlds:*, items:write — only ones your token holds), an IP allowlist (CIDRs; 0.0.0.0/0 + ::/0 for anywhere), optional experienceIds and expiresInDays. The token is in the response ONCE.
[**createCreatorExperienceKeyRotate**](CreatorApi.md#createCreatorExperienceKeyRotate) | **POST** /v1/creator/experience-keys/{id}/rotate | Rotate a key: a replacement with the same settings (its token shown ONCE); the old key keeps working for overlapHours (default 24, 0 &#x3D; revoke now, max 168).
[**deleteCreatorExperienceKey**](CreatorApi.md#deleteCreatorExperienceKey) | **DELETE** /v1/creator/experience-keys/{id} | Revoke an experience key now. Never needs a plan: a credential must always be revocable.
[**getCreatorEntitlement**](CreatorApi.md#getCreatorEntitlement) | **GET** /v1/creator/entitlements | What you can do in Creator Studio: your plan, whether you can author, grandfathering, and every limit with used and remaining. Read by web, apps, SDK and MCP alike.
[**listCreatorExperienceKeys**](CreatorApi.md#listCreatorExperienceKeys) | **GET** /v1/creator/experience-keys | Your experience API keys, newest first (never the secret). ?includeRevoked&#x3D;true for the history; ?experienceId&#x3D; for the keys that reach one game (a game&#39;s own keys are narrowed to it alone). Cursor-paged: pass pagination.nextCursor back as ?cursor&#x3D;.


<a name="createCreatorExperienceKey"></a>
# **createCreatorExperienceKey**
> CreateCreatorExperienceKeyResponse createCreatorExperienceKey()

Issue an experience API key for a back-end or CI: name, creator scopes (worlds:*, items:write — only ones your token holds), an IP allowlist (CIDRs; 0.0.0.0/0 + ::/0 for anywhere), optional experienceIds and expiresInDays. The token is in the response ONCE.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorApi apiInstance = new CreatorApi(defaultClient);
    try {
      CreateCreatorExperienceKeyResponse result = apiInstance.createCreatorExperienceKey();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorApi#createCreatorExperienceKey");
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

**CreateCreatorExperienceKeyResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Default Response |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="createCreatorExperienceKeyRotate"></a>
# **createCreatorExperienceKeyRotate**
> CreateCreatorExperienceKeyRotateResponse createCreatorExperienceKeyRotate(id)

Rotate a key: a replacement with the same settings (its token shown ONCE); the old key keeps working for overlapHours (default 24, 0 &#x3D; revoke now, max 168).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorApi apiInstance = new CreatorApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateCreatorExperienceKeyRotateResponse result = apiInstance.createCreatorExperienceKeyRotate(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorApi#createCreatorExperienceKeyRotate");
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

**CreateCreatorExperienceKeyRotateResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**201** | Default Response |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="deleteCreatorExperienceKey"></a>
# **deleteCreatorExperienceKey**
> DeleteCreatorExperienceKeyResponse deleteCreatorExperienceKey(id)

Revoke an experience key now. Never needs a plan: a credential must always be revocable.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorApi apiInstance = new CreatorApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      DeleteCreatorExperienceKeyResponse result = apiInstance.deleteCreatorExperienceKey(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorApi#deleteCreatorExperienceKey");
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

**DeleteCreatorExperienceKeyResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Default Response |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="getCreatorEntitlement"></a>
# **getCreatorEntitlement**
> GetCreatorEntitlementResponse getCreatorEntitlement()

What you can do in Creator Studio: your plan, whether you can author, grandfathering, and every limit with used and remaining. Read by web, apps, SDK and MCP alike.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorApi apiInstance = new CreatorApi(defaultClient);
    try {
      GetCreatorEntitlementResponse result = apiInstance.getCreatorEntitlement();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorApi#getCreatorEntitlement");
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

**GetCreatorEntitlementResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Default Response |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="listCreatorExperienceKeys"></a>
# **listCreatorExperienceKeys**
> ListCreatorExperienceKeysResponse listCreatorExperienceKeys()

Your experience API keys, newest first (never the secret). ?includeRevoked&#x3D;true for the history; ?experienceId&#x3D; for the keys that reach one game (a game&#39;s own keys are narrowed to it alone). Cursor-paged: pass pagination.nextCursor back as ?cursor&#x3D;.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorApi apiInstance = new CreatorApi(defaultClient);
    try {
      ListCreatorExperienceKeysResponse result = apiInstance.listCreatorExperienceKeys();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorApi#listCreatorExperienceKeys");
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

**ListCreatorExperienceKeysResponse**

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

