# PolicyPresetsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPolicyPreset**](PolicyPresetsApi.md#createPolicyPreset) | **POST** /v1/policy-presets | Create a return / shipping / payment policy preset.
[**deletePolicyPreset**](PolicyPresetsApi.md#deletePolicyPreset) | **DELETE** /v1/policy-presets/{id} | Delete a policy preset.
[**listPolicyPresets**](PolicyPresetsApi.md#listPolicyPresets) | **GET** /v1/policy-presets | List the seller&#39;s return / shipping / payment policy presets.
[**updatePolicyPreset**](PolicyPresetsApi.md#updatePolicyPreset) | **PATCH** /v1/policy-presets/{id} | Update a policy preset.


<a name="createPolicyPreset"></a>
# **createPolicyPreset**
> CreatePolicyPresetResponse createPolicyPreset()

Create a return / shipping / payment policy preset.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.PolicyPresetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    PolicyPresetsApi apiInstance = new PolicyPresetsApi(defaultClient);
    try {
      CreatePolicyPresetResponse result = apiInstance.createPolicyPreset();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyPresetsApi#createPolicyPreset");
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

[**CreatePolicyPresetResponse**](CreatePolicyPresetResponse.md)

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

<a name="deletePolicyPreset"></a>
# **deletePolicyPreset**
> DeletePolicyPresetResponse deletePolicyPreset(id)

Delete a policy preset.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.PolicyPresetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    PolicyPresetsApi apiInstance = new PolicyPresetsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      DeletePolicyPresetResponse result = apiInstance.deletePolicyPreset(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyPresetsApi#deletePolicyPreset");
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

[**DeletePolicyPresetResponse**](DeletePolicyPresetResponse.md)

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

<a name="listPolicyPresets"></a>
# **listPolicyPresets**
> V1List listPolicyPresets(kind)

List the seller&#39;s return / shipping / payment policy presets.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.PolicyPresetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    PolicyPresetsApi apiInstance = new PolicyPresetsApi(defaultClient);
    String kind = "return"; // String | 
    try {
      V1List result = apiInstance.listPolicyPresets(kind);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyPresetsApi#listPolicyPresets");
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
 **kind** | **String**|  | [optional] [enum: return, shipping, payment]

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

<a name="updatePolicyPreset"></a>
# **updatePolicyPreset**
> UpdatePolicyPresetResponse updatePolicyPreset(id)

Update a policy preset.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.PolicyPresetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    PolicyPresetsApi apiInstance = new PolicyPresetsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      UpdatePolicyPresetResponse result = apiInstance.updatePolicyPreset(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyPresetsApi#updatePolicyPreset");
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

[**UpdatePolicyPresetResponse**](UpdatePolicyPresetResponse.md)

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

