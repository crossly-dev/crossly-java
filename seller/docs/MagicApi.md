# MagicApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMagicScan**](MagicApi.md#createMagicScan) | **POST** /v1/magic/scan | Run a Magic List image scan.
[**createMagicScanSynthesize**](MagicApi.md#createMagicScanSynthesize) | **POST** /v1/magic/scan/{runId}/synthesize | Synthesize a draft from confirmed matches.
[**getMagicDraft**](MagicApi.md#getMagicDraft) | **GET** /v1/magic/drafts/{draftId} | Get a synthesized Magic List draft.
[**listMagicRecent**](MagicApi.md#listMagicRecent) | **GET** /v1/magic/recent | Recent Magic List scans for this seller.


<a name="createMagicScan"></a>
# **createMagicScan**
> CreateMagicScanResponse createMagicScan()

Run a Magic List image scan.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.MagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    MagicApi apiInstance = new MagicApi(defaultClient);
    try {
      CreateMagicScanResponse result = apiInstance.createMagicScan();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicApi#createMagicScan");
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

[**CreateMagicScanResponse**](CreateMagicScanResponse.md)

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

<a name="createMagicScanSynthesize"></a>
# **createMagicScanSynthesize**
> CreateMagicScanSynthesizeResponse createMagicScanSynthesize(runId)

Synthesize a draft from confirmed matches.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.MagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    MagicApi apiInstance = new MagicApi(defaultClient);
    UUID runId = UUID.randomUUID(); // UUID | 
    try {
      CreateMagicScanSynthesizeResponse result = apiInstance.createMagicScanSynthesize(runId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicApi#createMagicScanSynthesize");
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
 **runId** | **UUID**|  |

### Return type

[**CreateMagicScanSynthesizeResponse**](CreateMagicScanSynthesizeResponse.md)

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

<a name="getMagicDraft"></a>
# **getMagicDraft**
> GetMagicDraftResponse getMagicDraft(draftId)

Get a synthesized Magic List draft.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.MagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    MagicApi apiInstance = new MagicApi(defaultClient);
    UUID draftId = UUID.randomUUID(); // UUID | 
    try {
      GetMagicDraftResponse result = apiInstance.getMagicDraft(draftId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicApi#getMagicDraft");
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
 **draftId** | **UUID**|  |

### Return type

[**GetMagicDraftResponse**](GetMagicDraftResponse.md)

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

<a name="listMagicRecent"></a>
# **listMagicRecent**
> V1List listMagicRecent()

Recent Magic List scans for this seller.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.MagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    MagicApi apiInstance = new MagicApi(defaultClient);
    try {
      V1List result = apiInstance.listMagicRecent();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicApi#listMagicRecent");
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

