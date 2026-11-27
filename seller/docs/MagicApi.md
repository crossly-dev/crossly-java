# MagicApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMagicAutoDecisionUndo**](MagicApi.md#createMagicAutoDecisionUndo) | **POST** /v1/magic/auto/decisions/{decisionId}/undo | Undo an automated Magic List decision, deleting its unpublished draft.
[**createMagicAutoItem**](MagicApi.md#createMagicAutoItem) | **POST** /v1/magic/auto/items | Scan one item and match it automatically (drafts only, never publishes).
[**createMagicAutoRun**](MagicApi.md#createMagicAutoRun) | **POST** /v1/magic/auto/runs/{runId} | Score a Magic List run automatically; a confident match in auto mode becomes a draft.
[**createMagicAutoRunSwipe**](MagicApi.md#createMagicAutoRunSwipe) | **POST** /v1/magic/auto/runs/{runId}/swipes | Record a seller swipe session (kept and rejected match keys) for a Magic List run.
[**createMagicScan**](MagicApi.md#createMagicScan) | **POST** /v1/magic/scan | Run a Magic List image scan.
[**createMagicScanSynthesize**](MagicApi.md#createMagicScanSynthesize) | **POST** /v1/magic/scan/{runId}/synthesize | Synthesize a draft from confirmed matches.
[**getMagicAutoSetting**](MagicApi.md#getMagicAutoSetting) | **GET** /v1/magic/auto/settings | The seller’s Magic List automated-matching mode.
[**getMagicDraft**](MagicApi.md#getMagicDraft) | **GET** /v1/magic/drafts/{draftId} | Get a synthesized Magic List draft.
[**listMagicAutoRunDecisions**](MagicApi.md#listMagicAutoRunDecisions) | **GET** /v1/magic/auto/runs/{runId}/decisions | Every match decision round (automated and seller) for a Magic List run.
[**listMagicRecent**](MagicApi.md#listMagicRecent) | **GET** /v1/magic/recent | Recent Magic List scans for this seller.
[**updateMagicAutoSetting**](MagicApi.md#updateMagicAutoSetting) | **PUT** /v1/magic/auto/settings | Set the Magic List automated-matching mode (off | auto | review_all).


<a name="createMagicAutoDecisionUndo"></a>
# **createMagicAutoDecisionUndo**
> CreateMagicAutoDecisionUndoResponse createMagicAutoDecisionUndo(decisionId)

Undo an automated Magic List decision, deleting its unpublished draft.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.MagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    MagicApi apiInstance = new MagicApi(defaultClient);
    UUID decisionId = UUID.randomUUID(); // UUID | 
    try {
      CreateMagicAutoDecisionUndoResponse result = apiInstance.createMagicAutoDecisionUndo(decisionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicApi#createMagicAutoDecisionUndo");
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
 **decisionId** | **UUID**|  |

### Return type

**CreateMagicAutoDecisionUndoResponse**

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

<a name="createMagicAutoItem"></a>
# **createMagicAutoItem**
> CreateMagicAutoItemResponse createMagicAutoItem()

Scan one item and match it automatically (drafts only, never publishes).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.MagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    MagicApi apiInstance = new MagicApi(defaultClient);
    try {
      CreateMagicAutoItemResponse result = apiInstance.createMagicAutoItem();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicApi#createMagicAutoItem");
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

**CreateMagicAutoItemResponse**

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

<a name="createMagicAutoRun"></a>
# **createMagicAutoRun**
> CreateMagicAutoRunResponse createMagicAutoRun(runId)

Score a Magic List run automatically; a confident match in auto mode becomes a draft.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.MagicApi;

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
      CreateMagicAutoRunResponse result = apiInstance.createMagicAutoRun(runId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicApi#createMagicAutoRun");
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

**CreateMagicAutoRunResponse**

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

<a name="createMagicAutoRunSwipe"></a>
# **createMagicAutoRunSwipe**
> CreateMagicAutoRunSwipeResponse createMagicAutoRunSwipe(runId)

Record a seller swipe session (kept and rejected match keys) for a Magic List run.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.MagicApi;

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
      CreateMagicAutoRunSwipeResponse result = apiInstance.createMagicAutoRunSwipe(runId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicApi#createMagicAutoRunSwipe");
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

**CreateMagicAutoRunSwipeResponse**

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
import net.crossly.api.MagicApi;

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

**CreateMagicScanResponse**

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
import net.crossly.api.MagicApi;

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

**CreateMagicScanSynthesizeResponse**

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

<a name="getMagicAutoSetting"></a>
# **getMagicAutoSetting**
> GetMagicAutoSettingResponse getMagicAutoSetting()

The seller’s Magic List automated-matching mode.

mode: off (every match is swiped by hand), auto (confident matches become DRAFTS on their own, never published, always undoable) or review_all (Crossly pre-marks its picks; the seller confirms). Default review_all.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.MagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    MagicApi apiInstance = new MagicApi(defaultClient);
    try {
      GetMagicAutoSettingResponse result = apiInstance.getMagicAutoSetting();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicApi#getMagicAutoSetting");
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

**GetMagicAutoSettingResponse**

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
import net.crossly.api.MagicApi;

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

**GetMagicDraftResponse**

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

<a name="listMagicAutoRunDecisions"></a>
# **listMagicAutoRunDecisions**
> ListMagicAutoRunDecisionsResponse listMagicAutoRunDecisions(runId)

Every match decision round (automated and seller) for a Magic List run.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.MagicApi;

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
      ListMagicAutoRunDecisionsResponse result = apiInstance.listMagicAutoRunDecisions(runId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicApi#listMagicAutoRunDecisions");
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

**ListMagicAutoRunDecisionsResponse**

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
> ListMagicRecentResponse listMagicRecent()

Recent Magic List scans for this seller.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.MagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    MagicApi apiInstance = new MagicApi(defaultClient);
    try {
      ListMagicRecentResponse result = apiInstance.listMagicRecent();
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

**ListMagicRecentResponse**

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

<a name="updateMagicAutoSetting"></a>
# **updateMagicAutoSetting**
> GetMagicAutoSettingResponse updateMagicAutoSetting(updateMagicAutoSettingRequest)

Set the Magic List automated-matching mode (off | auto | review_all).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.MagicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    MagicApi apiInstance = new MagicApi(defaultClient);
    UpdateMagicAutoSettingRequest updateMagicAutoSettingRequest = new UpdateMagicAutoSettingRequest(); // UpdateMagicAutoSettingRequest | 
    try {
      GetMagicAutoSettingResponse result = apiInstance.updateMagicAutoSetting(updateMagicAutoSettingRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MagicApi#updateMagicAutoSetting");
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
 **updateMagicAutoSettingRequest** | **UpdateMagicAutoSettingRequest**|  |

### Return type

**GetMagicAutoSettingResponse**

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

