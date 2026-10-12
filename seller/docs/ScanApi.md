# ScanApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listScanCaptures**](ScanApi.md#listScanCaptures) | **GET** /v1/scan/captures | Your capture sessions and what they produced.
[**listScanModels**](ScanApi.md#listScanModels) | **GET** /v1/scan/models | Which items already have a 3D model.


<a name="listScanCaptures"></a>
# **listScanCaptures**
> ListScanCapturesResponse listScanCaptures(status, limit)

Your capture sessions and what they produced.

One row per scan, newest first. &#x60;status&#x60; is capturing | uploaded | processing | ready | failed | rejected; &#x60;rejectReason&#x60; says why in the same words the seller was shown. A capture that reports &#x60;ready&#x60; with no mesh is normal — most items are textured onto a known shape rather than having geometry generated, which is cheaper and looks the same. When an item that WOULD have been generated was not, &#x60;generationSkipped&#x60; says why: out of monthly allowance, too few distinct angles, or you had already had a model built from this object.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ScanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ScanApi apiInstance = new ScanApi(defaultClient);
    String status = "status_example"; // String | Filter to one status.
    Integer limit = 25; // Integer | 
    try {
      ListScanCapturesResponse result = apiInstance.listScanCaptures(status, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScanApi#listScanCaptures");
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
 **status** | **String**| Filter to one status. | [optional]
 **limit** | **Integer**|  | [optional] [default to 25]

### Return type

**ListScanCapturesResponse**

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

<a name="listScanModels"></a>
# **listScanModels**
> ListScanModelsResponse listScanModels(variantIds, inventoryItemIds)

Which items already have a 3D model.

Ask by CATALOGUE variant (&#x60;variantIds&#x60;) or by your own inventory rows (&#x60;inventoryItemIds&#x60;), comma separated, up to 200 of each. At least one is required. Returns only the ones that have a model. The two are different KINDS of answer. A catalogue model belongs to the product and is shared: a hit means your listing gets it with nothing to capture, because somebody else already paid to generate it. An inventory model belongs to one of your rows, because an object with no catalogue identity — a lamp, a one-off — is not a product anyone else can claim. &#x60;longestEdgeMm&#x60; is present only when a capture MEASURED the item against something of known size; null means the mesh has correct proportions and no real-world scale.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ScanApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ScanApi apiInstance = new ScanApi(defaultClient);
    String variantIds = "variantIds_example"; // String | Comma-separated catalogue variant ids, max 200.
    String inventoryItemIds = "inventoryItemIds_example"; // String | Comma-separated inventory item ids, max 200.
    try {
      ListScanModelsResponse result = apiInstance.listScanModels(variantIds, inventoryItemIds);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScanApi#listScanModels");
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
 **variantIds** | **String**| Comma-separated catalogue variant ids, max 200. | [optional]
 **inventoryItemIds** | **String**| Comma-separated inventory item ids, max 200. | [optional]

### Return type

**ListScanModelsResponse**

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

