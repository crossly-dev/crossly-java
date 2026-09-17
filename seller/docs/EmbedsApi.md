# EmbedsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEmbedKey**](EmbedsApi.md#createEmbedKey) | **POST** /v1/embeds/keys | Mint a publishable key for a site.
[**deleteEmbedKey**](EmbedsApi.md#deleteEmbedKey) | **DELETE** /v1/embeds/keys/{id} | Revoke a publishable key.
[**listEmbedKeys**](EmbedsApi.md#listEmbedKeys) | **GET** /v1/embeds/keys | Your publishable keys.


<a name="createEmbedKey"></a>
# **createEmbedKey**
> CreateEmbedKeyResponse createEmbedKey(inlineObject3)

Mint a publishable key for a site.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.EmbedsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    EmbedsApi apiInstance = new EmbedsApi(defaultClient);
    InlineObject3 inlineObject3 = new InlineObject3(); // InlineObject3 | 
    try {
      CreateEmbedKeyResponse result = apiInstance.createEmbedKey(inlineObject3);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmbedsApi#createEmbedKey");
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
 **inlineObject3** | [**InlineObject3**](InlineObject3.md)|  |

### Return type

[**CreateEmbedKeyResponse**](CreateEmbedKeyResponse.md)

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

<a name="deleteEmbedKey"></a>
# **deleteEmbedKey**
> deleteEmbedKey(id)

Revoke a publishable key.

Takes effect immediately. Any site still using it will show an empty catalog, so replace the key in the page before revoking the old one.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.EmbedsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    EmbedsApi apiInstance = new EmbedsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.deleteEmbedKey(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmbedsApi#deleteEmbedKey");
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

null (empty response body)

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content — the request succeeded and there is no body. |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="listEmbedKeys"></a>
# **listEmbedKeys**
> V1List listEmbedKeys()

Your publishable keys.

Publishable keys are safe to put in a public web page — they can read your own active listings and start a checkout, and nothing else. The key is shown in full because it is not a secret.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.EmbedsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    EmbedsApi apiInstance = new EmbedsApi(defaultClient);
    try {
      V1List result = apiInstance.listEmbedKeys();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EmbedsApi#listEmbedKeys");
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

