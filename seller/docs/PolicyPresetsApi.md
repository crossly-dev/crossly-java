# PolicyPresetsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGeoLocationCheck**](PolicyPresetsApi.md#createGeoLocationCheck) | **POST** /v1/geo/location-check | Check whether a shipping policy ships to an address.
[**createPolicyPreset**](PolicyPresetsApi.md#createPolicyPreset) | **POST** /v1/policy-presets | Create a return / shipping / payment policy preset.
[**deletePolicyPreset**](PolicyPresetsApi.md#deletePolicyPreset) | **DELETE** /v1/policy-presets/{id} | Delete a policy preset. Listings that used it switch to the default preset of its kind.
[**getPolicy**](PolicyPresetsApi.md#getPolicy) | **GET** /v1/policies | The seller&#39;s shipping / return / payment policy presets by kind, with each kind&#39;s default.
[**listPolicyPresets**](PolicyPresetsApi.md#listPolicyPresets) | **GET** /v1/policy-presets | List the seller&#39;s return / shipping / payment policy presets. meta.migrationNotices lists defaults the policy migration demoted (kind still has no default).
[**updatePolicyPreset**](PolicyPresetsApi.md#updatePolicyPreset) | **PATCH** /v1/policy-presets/{id} | Update a policy preset.


<a name="createGeoLocationCheck"></a>
# **createGeoLocationCheck**
> CreateGeoLocationCheckResponse createGeoLocationCheck()

Check whether a shipping policy ships to an address.

Pass an unsaved &#x60;policy&#x60; draft or a &#x60;presetId&#x60; (neither &#x3D; your default shipping policy), an &#x60;address&#x60;, and optionally &#x60;consolidateVia&#x60; (a ship-together hub). Returns &#x60;ships&#x60;, and when it does not: &#x60;reason&#x60;, &#x60;stage&#x60; (buyer | hub), &#x60;message&#x60; and the deciding &#x60;rule&#x60;. &#x60;partial&#x60; means a fuller address (state, ZIP) could change the answer. A draft that is not a valid shipping policy is a 422; a presetId that is not yours is a 404.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.PolicyPresetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    PolicyPresetsApi apiInstance = new PolicyPresetsApi(defaultClient);
    try {
      CreateGeoLocationCheckResponse result = apiInstance.createGeoLocationCheck();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyPresetsApi#createGeoLocationCheck");
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

**CreateGeoLocationCheckResponse**

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
import net.crossly.api.PolicyPresetsApi;

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

**CreatePolicyPresetResponse**

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

Delete a policy preset. Listings that used it switch to the default preset of its kind.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.PolicyPresetsApi;

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

**DeletePolicyPresetResponse**

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

<a name="getPolicy"></a>
# **getPolicy**
> GetPolicyResponse getPolicy()

The seller&#39;s shipping / return / payment policy presets by kind, with each kind&#39;s default.

Pass a preset &#x60;id&#x60; as &#x60;policies.shippingPresetId&#x60; / &#x60;returnPresetId&#x60; / &#x60;paymentPresetId&#x60; on POST or PATCH /v1/listings (null &#x3D; the marketplace&#39;s own default). A kind you omit uses &#x60;defaultPresetId&#x60;.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.PolicyPresetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    PolicyPresetsApi apiInstance = new PolicyPresetsApi(defaultClient);
    try {
      GetPolicyResponse result = apiInstance.getPolicy();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PolicyPresetsApi#getPolicy");
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

**GetPolicyResponse**

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
> ListPolicyPresetsResponse listPolicyPresets(kind)

List the seller&#39;s return / shipping / payment policy presets. meta.migrationNotices lists defaults the policy migration demoted (kind still has no default).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.PolicyPresetsApi;

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
      ListPolicyPresetsResponse result = apiInstance.listPolicyPresets(kind);
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

**ListPolicyPresetsResponse**

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
> CreatePolicyPresetResponse updatePolicyPreset(id)

Update a policy preset.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.PolicyPresetsApi;

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
      CreatePolicyPresetResponse result = apiInstance.updatePolicyPreset(id);
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

**CreatePolicyPresetResponse**

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

