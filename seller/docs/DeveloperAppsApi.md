# DeveloperAppsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDeveloperAppCertificationSubmit**](DeveloperAppsApi.md#createDeveloperAppCertificationSubmit) | **POST** /v1/developer/apps/{appId}/certification/submit | Send the application to Crossly review. Needs a passing conformance run on this client version and report-menu evidence.
[**createDeveloperAppCertificationWithdraw**](DeveloperAppsApi.md#createDeveloperAppCertificationWithdraw) | **POST** /v1/developer/apps/{appId}/certification/withdraw | Take the application out of review to edit it.
[**createDeveloperAppClientVersion**](DeveloperAppsApi.md#createDeveloperAppClientVersion) | **POST** /v1/developer/apps/{appId}/client-versions | Register a new release of your certified client and start its conformance run. A pass on the same major version carries the certification automatically; a new major version goes to Crossly review; a failure keeps your previous certified version.
[**createDeveloperAppClientVersionRun**](DeveloperAppsApi.md#createDeveloperAppClientVersionRun) | **POST** /v1/developer/apps/{appId}/client-versions/{versionId}/run | Start a new conformance run for a release whose run failed, expired or was aborted.
[**createDeveloperAppConformanceRun**](DeveloperAppsApi.md#createDeveloperAppConformanceRun) | **POST** /v1/developer/apps/{appId}/conformance-runs | Start a conformance run: a test experience only your app, signed in as you, can join. Join it with POST /v1/worlds/experiences/{experienceId}/join and follow the instruction.
[**createDeveloperAppConformanceRunAbort**](DeveloperAppsApi.md#createDeveloperAppConformanceRunAbort) | **POST** /v1/developer/apps/{appId}/conformance-runs/{runId}/abort | Abort an open run.
[**createDeveloperAppVerificationCheckDomain**](DeveloperAppsApi.md#createDeveloperAppVerificationCheckDomain) | **POST** /v1/developer/apps/{appId}/verification/check-domain | Look up the DNS TXT record crossly-app-verification&#x3D;&lt;token&gt; on your domain (or _crossly.&lt;domain&gt;) now.
[**createDeveloperAppVerificationSubmit**](DeveloperAppsApi.md#createDeveloperAppVerificationSubmit) | **POST** /v1/developer/apps/{appId}/verification/submit | Send the verification to Crossly review (each scope is decided separately).
[**createDeveloperAppVerificationWithdraw**](DeveloperAppsApi.md#createDeveloperAppVerificationWithdraw) | **POST** /v1/developer/apps/{appId}/verification/withdraw | Take the verification out of review to edit it.
[**getDeveloperAppCertification**](DeveloperAppsApi.md#getDeveloperAppCertification) | **GET** /v1/developer/apps/{appId}/certification | The Crossly Carnival client certification application (null until you create it): status, client, evidence, the passing run and what still blocks submission.
[**getDeveloperAppClientVersion**](DeveloperAppsApi.md#getDeveloperAppClientVersion) | **GET** /v1/developer/apps/{appId}/client-versions/{versionId} | One client release and its re-certification.
[**getDeveloperAppConformanceRun**](DeveloperAppsApi.md#getDeveloperAppConformanceRun) | **GET** /v1/developer/apps/{appId}/conformance-runs/{runId} | A run&#39;s step, instruction and every check with its verdict.
[**getDeveloperAppHealth**](DeveloperAppsApi.md#getDeveloperAppHealth) | **GET** /v1/developer/apps/{appId}/health | Your app&#39;s API health: write-request counts by status class (24 h, 7 d) across every seller using it, top error codes with advice, a retry-storm flag, the last 50 failed requests (message and correlation id only on requests made with your own account), and from Atlas: how many people authorized the app and with which scopes (counts, never who) and the token endpoint&#39;s OAuth errors by code (e.g. invalid_grant) with the latest one.
[**getDeveloperAppProfile**](DeveloperAppsApi.md#getDeveloperAppProfile) | **GET** /v1/developer/apps/{appId}/profile | Your app&#39;s public directory profile: every editable field, the listing status, what still needs review, and &#x60;preview&#x60; — the profile exactly as /seller-apps or /buyer-apps will show it.
[**getDeveloperAppReview**](DeveloperAppsApi.md#getDeveloperAppReview) | **GET** /v1/developer/apps/{appId}/review | Your app&#39;s Crossly Carnival client certification, verification and review history in one read.
[**getDeveloperAppVerification**](DeveloperAppsApi.md#getDeveloperAppVerification) | **GET** /v1/developer/apps/{appId}/verification | The app verification for worlds:publish / worlds:monetize (null until created): domain proof, policies, justifications and per-scope decisions.
[**listDeveloperAppClientVersions**](DeveloperAppsApi.md#listDeveloperAppClientVersions) | **GET** /v1/developer/apps/{appId}/client-versions | Releases of your certified client, newest first: the re-certification status (awaiting_run, running, carried, ops_review, approved, rejected, failed, superseded), the rule that decided it and its checks.
[**listDeveloperAppConformanceRuns**](DeveloperAppsApi.md#listDeveloperAppConformanceRuns) | **GET** /v1/developer/apps/{appId}/conformance-runs | Your app&#39;s conformance runs, newest first.
[**updateDeveloperAppCertification**](DeveloperAppsApi.md#updateDeveloperAppCertification) | **PUT** /v1/developer/apps/{appId}/certification | Create or edit the application: client name, platform, version, build and source URLs, description and evidence (report menu, chat, Policy UI). Changing the client clears the passing run.
[**updateDeveloperAppListing**](DeveloperAppsApi.md#updateDeveloperAppListing) | **PUT** /v1/developer/apps/{appId}/listing | Turn \&quot;Listed publicly\&quot; on or off. On: an app Crossly approved whose name, scopes and audience are unchanged is listed at once; anything else goes to review (pending_review). Off: unlisted immediately.
[**updateDeveloperAppProfile**](DeveloperAppsApi.md#updateDeveloperAppProfile) | **PATCH** /v1/developer/apps/{appId}/profile | Edit your app&#39;s directory profile: name, slug, tagline, description, longDescription (markdown), category, audience (auto|seller|buyer|both), logoUrl, bannerUrl (4:1, 1600×400), screenshots (≤6), demoVideoUrl, homepageUrl, installUrl, support/privacy/terms links, docsLinks [{label,url}] and pricingNote. Absent keys are kept, null clears. Images not on Crossly&#39;s CDN are copied onto it. Renaming a listed app or changing its audience sends it back to review.
[**updateDeveloperAppVerification**](DeveloperAppsApi.md#updateDeveloperAppVerification) | **PUT** /v1/developer/apps/{appId}/verification | Create or edit the verification: domain, requested scopes with a justification each, privacy policy, terms, support email, demo.


<a name="createDeveloperAppCertificationSubmit"></a>
# **createDeveloperAppCertificationSubmit**
> DeveloperAppCertificationResponse createDeveloperAppCertificationSubmit(appId)

Send the application to Crossly review. Needs a passing conformance run on this client version and report-menu evidence.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DeveloperAppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DeveloperAppsApi apiInstance = new DeveloperAppsApi(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      DeveloperAppCertificationResponse result = apiInstance.createDeveloperAppCertificationSubmit(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeveloperAppsApi#createDeveloperAppCertificationSubmit");
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
 **appId** | **String**|  |

### Return type

**DeveloperAppCertificationResponse**

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

<a name="createDeveloperAppCertificationWithdraw"></a>
# **createDeveloperAppCertificationWithdraw**
> DeveloperAppCertificationResponse createDeveloperAppCertificationWithdraw(appId)

Take the application out of review to edit it.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DeveloperAppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DeveloperAppsApi apiInstance = new DeveloperAppsApi(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      DeveloperAppCertificationResponse result = apiInstance.createDeveloperAppCertificationWithdraw(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeveloperAppsApi#createDeveloperAppCertificationWithdraw");
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
 **appId** | **String**|  |

### Return type

**DeveloperAppCertificationResponse**

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

<a name="createDeveloperAppClientVersion"></a>
# **createDeveloperAppClientVersion**
> CreateDeveloperAppClientVersionResponse createDeveloperAppClientVersion(appId)

Register a new release of your certified client and start its conformance run. A pass on the same major version carries the certification automatically; a new major version goes to Crossly review; a failure keeps your previous certified version.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DeveloperAppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DeveloperAppsApi apiInstance = new DeveloperAppsApi(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      CreateDeveloperAppClientVersionResponse result = apiInstance.createDeveloperAppClientVersion(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeveloperAppsApi#createDeveloperAppClientVersion");
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
 **appId** | **String**|  |

### Return type

**CreateDeveloperAppClientVersionResponse**

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

<a name="createDeveloperAppClientVersionRun"></a>
# **createDeveloperAppClientVersionRun**
> CreateDeveloperAppClientVersionResponse createDeveloperAppClientVersionRun(appId, versionId)

Start a new conformance run for a release whose run failed, expired or was aborted.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DeveloperAppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DeveloperAppsApi apiInstance = new DeveloperAppsApi(defaultClient);
    String appId = "appId_example"; // String | 
    String versionId = "versionId_example"; // String | 
    try {
      CreateDeveloperAppClientVersionResponse result = apiInstance.createDeveloperAppClientVersionRun(appId, versionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeveloperAppsApi#createDeveloperAppClientVersionRun");
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
 **appId** | **String**|  |
 **versionId** | **String**|  |

### Return type

**CreateDeveloperAppClientVersionResponse**

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

<a name="createDeveloperAppConformanceRun"></a>
# **createDeveloperAppConformanceRun**
> GetDeveloperAppConformanceRunResponse createDeveloperAppConformanceRun(appId)

Start a conformance run: a test experience only your app, signed in as you, can join. Join it with POST /v1/worlds/experiences/{experienceId}/join and follow the instruction.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DeveloperAppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DeveloperAppsApi apiInstance = new DeveloperAppsApi(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      GetDeveloperAppConformanceRunResponse result = apiInstance.createDeveloperAppConformanceRun(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeveloperAppsApi#createDeveloperAppConformanceRun");
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
 **appId** | **String**|  |

### Return type

**GetDeveloperAppConformanceRunResponse**

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

<a name="createDeveloperAppConformanceRunAbort"></a>
# **createDeveloperAppConformanceRunAbort**
> CreateDeveloperAppConformanceRunAbortResponse createDeveloperAppConformanceRunAbort(appId, runId)

Abort an open run.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DeveloperAppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DeveloperAppsApi apiInstance = new DeveloperAppsApi(defaultClient);
    String appId = "appId_example"; // String | 
    String runId = "runId_example"; // String | 
    try {
      CreateDeveloperAppConformanceRunAbortResponse result = apiInstance.createDeveloperAppConformanceRunAbort(appId, runId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeveloperAppsApi#createDeveloperAppConformanceRunAbort");
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
 **appId** | **String**|  |
 **runId** | **String**|  |

### Return type

**CreateDeveloperAppConformanceRunAbortResponse**

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

<a name="createDeveloperAppVerificationCheckDomain"></a>
# **createDeveloperAppVerificationCheckDomain**
> DeveloperAppVerificationResponse createDeveloperAppVerificationCheckDomain(appId)

Look up the DNS TXT record crossly-app-verification&#x3D;&lt;token&gt; on your domain (or _crossly.&lt;domain&gt;) now.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DeveloperAppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DeveloperAppsApi apiInstance = new DeveloperAppsApi(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      DeveloperAppVerificationResponse result = apiInstance.createDeveloperAppVerificationCheckDomain(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeveloperAppsApi#createDeveloperAppVerificationCheckDomain");
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
 **appId** | **String**|  |

### Return type

**DeveloperAppVerificationResponse**

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

<a name="createDeveloperAppVerificationSubmit"></a>
# **createDeveloperAppVerificationSubmit**
> DeveloperAppVerificationResponse createDeveloperAppVerificationSubmit(appId)

Send the verification to Crossly review (each scope is decided separately).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DeveloperAppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DeveloperAppsApi apiInstance = new DeveloperAppsApi(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      DeveloperAppVerificationResponse result = apiInstance.createDeveloperAppVerificationSubmit(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeveloperAppsApi#createDeveloperAppVerificationSubmit");
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
 **appId** | **String**|  |

### Return type

**DeveloperAppVerificationResponse**

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

<a name="createDeveloperAppVerificationWithdraw"></a>
# **createDeveloperAppVerificationWithdraw**
> DeveloperAppVerificationResponse createDeveloperAppVerificationWithdraw(appId)

Take the verification out of review to edit it.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DeveloperAppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DeveloperAppsApi apiInstance = new DeveloperAppsApi(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      DeveloperAppVerificationResponse result = apiInstance.createDeveloperAppVerificationWithdraw(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeveloperAppsApi#createDeveloperAppVerificationWithdraw");
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
 **appId** | **String**|  |

### Return type

**DeveloperAppVerificationResponse**

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

<a name="getDeveloperAppCertification"></a>
# **getDeveloperAppCertification**
> GetDeveloperAppCertificationResponse getDeveloperAppCertification(appId)

The Crossly Carnival client certification application (null until you create it): status, client, evidence, the passing run and what still blocks submission.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DeveloperAppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DeveloperAppsApi apiInstance = new DeveloperAppsApi(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      GetDeveloperAppCertificationResponse result = apiInstance.getDeveloperAppCertification(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeveloperAppsApi#getDeveloperAppCertification");
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
 **appId** | **String**|  |

### Return type

**GetDeveloperAppCertificationResponse**

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

<a name="getDeveloperAppClientVersion"></a>
# **getDeveloperAppClientVersion**
> GetDeveloperAppClientVersionResponse getDeveloperAppClientVersion(appId, versionId)

One client release and its re-certification.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DeveloperAppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DeveloperAppsApi apiInstance = new DeveloperAppsApi(defaultClient);
    String appId = "appId_example"; // String | 
    String versionId = "versionId_example"; // String | 
    try {
      GetDeveloperAppClientVersionResponse result = apiInstance.getDeveloperAppClientVersion(appId, versionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeveloperAppsApi#getDeveloperAppClientVersion");
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
 **appId** | **String**|  |
 **versionId** | **String**|  |

### Return type

**GetDeveloperAppClientVersionResponse**

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

<a name="getDeveloperAppConformanceRun"></a>
# **getDeveloperAppConformanceRun**
> GetDeveloperAppConformanceRunResponse getDeveloperAppConformanceRun(appId, runId)

A run&#39;s step, instruction and every check with its verdict.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DeveloperAppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DeveloperAppsApi apiInstance = new DeveloperAppsApi(defaultClient);
    String appId = "appId_example"; // String | 
    String runId = "runId_example"; // String | 
    try {
      GetDeveloperAppConformanceRunResponse result = apiInstance.getDeveloperAppConformanceRun(appId, runId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeveloperAppsApi#getDeveloperAppConformanceRun");
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
 **appId** | **String**|  |
 **runId** | **String**|  |

### Return type

**GetDeveloperAppConformanceRunResponse**

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

<a name="getDeveloperAppHealth"></a>
# **getDeveloperAppHealth**
> GetDeveloperAppHealthResponse getDeveloperAppHealth(appId)

Your app&#39;s API health: write-request counts by status class (24 h, 7 d) across every seller using it, top error codes with advice, a retry-storm flag, the last 50 failed requests (message and correlation id only on requests made with your own account), and from Atlas: how many people authorized the app and with which scopes (counts, never who) and the token endpoint&#39;s OAuth errors by code (e.g. invalid_grant) with the latest one.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DeveloperAppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DeveloperAppsApi apiInstance = new DeveloperAppsApi(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      GetDeveloperAppHealthResponse result = apiInstance.getDeveloperAppHealth(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeveloperAppsApi#getDeveloperAppHealth");
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
 **appId** | **String**|  |

### Return type

**GetDeveloperAppHealthResponse**

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

<a name="getDeveloperAppProfile"></a>
# **getDeveloperAppProfile**
> GetDeveloperAppProfileResponse getDeveloperAppProfile(appId)

Your app&#39;s public directory profile: every editable field, the listing status, what still needs review, and &#x60;preview&#x60; — the profile exactly as /seller-apps or /buyer-apps will show it.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DeveloperAppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DeveloperAppsApi apiInstance = new DeveloperAppsApi(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      GetDeveloperAppProfileResponse result = apiInstance.getDeveloperAppProfile(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeveloperAppsApi#getDeveloperAppProfile");
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
 **appId** | **String**|  |

### Return type

**GetDeveloperAppProfileResponse**

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

<a name="getDeveloperAppReview"></a>
# **getDeveloperAppReview**
> GetDeveloperAppReviewResponse getDeveloperAppReview(appId)

Your app&#39;s Crossly Carnival client certification, verification and review history in one read.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DeveloperAppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DeveloperAppsApi apiInstance = new DeveloperAppsApi(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      GetDeveloperAppReviewResponse result = apiInstance.getDeveloperAppReview(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeveloperAppsApi#getDeveloperAppReview");
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
 **appId** | **String**|  |

### Return type

**GetDeveloperAppReviewResponse**

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

<a name="getDeveloperAppVerification"></a>
# **getDeveloperAppVerification**
> GetDeveloperAppVerificationResponse getDeveloperAppVerification(appId)

The app verification for worlds:publish / worlds:monetize (null until created): domain proof, policies, justifications and per-scope decisions.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DeveloperAppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DeveloperAppsApi apiInstance = new DeveloperAppsApi(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      GetDeveloperAppVerificationResponse result = apiInstance.getDeveloperAppVerification(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeveloperAppsApi#getDeveloperAppVerification");
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
 **appId** | **String**|  |

### Return type

**GetDeveloperAppVerificationResponse**

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

<a name="listDeveloperAppClientVersions"></a>
# **listDeveloperAppClientVersions**
> ListDeveloperAppClientVersionsResponse listDeveloperAppClientVersions(appId)

Releases of your certified client, newest first: the re-certification status (awaiting_run, running, carried, ops_review, approved, rejected, failed, superseded), the rule that decided it and its checks.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DeveloperAppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DeveloperAppsApi apiInstance = new DeveloperAppsApi(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      ListDeveloperAppClientVersionsResponse result = apiInstance.listDeveloperAppClientVersions(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeveloperAppsApi#listDeveloperAppClientVersions");
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
 **appId** | **String**|  |

### Return type

**ListDeveloperAppClientVersionsResponse**

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

<a name="listDeveloperAppConformanceRuns"></a>
# **listDeveloperAppConformanceRuns**
> ListDeveloperAppConformanceRunsResponse listDeveloperAppConformanceRuns(appId)

Your app&#39;s conformance runs, newest first.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DeveloperAppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DeveloperAppsApi apiInstance = new DeveloperAppsApi(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      ListDeveloperAppConformanceRunsResponse result = apiInstance.listDeveloperAppConformanceRuns(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeveloperAppsApi#listDeveloperAppConformanceRuns");
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
 **appId** | **String**|  |

### Return type

**ListDeveloperAppConformanceRunsResponse**

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

<a name="updateDeveloperAppCertification"></a>
# **updateDeveloperAppCertification**
> DeveloperAppCertificationResponse updateDeveloperAppCertification(appId)

Create or edit the application: client name, platform, version, build and source URLs, description and evidence (report menu, chat, Policy UI). Changing the client clears the passing run.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DeveloperAppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DeveloperAppsApi apiInstance = new DeveloperAppsApi(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      DeveloperAppCertificationResponse result = apiInstance.updateDeveloperAppCertification(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeveloperAppsApi#updateDeveloperAppCertification");
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
 **appId** | **String**|  |

### Return type

**DeveloperAppCertificationResponse**

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

<a name="updateDeveloperAppListing"></a>
# **updateDeveloperAppListing**
> UpdateDeveloperAppListingResponse updateDeveloperAppListing(appId)

Turn \&quot;Listed publicly\&quot; on or off. On: an app Crossly approved whose name, scopes and audience are unchanged is listed at once; anything else goes to review (pending_review). Off: unlisted immediately.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DeveloperAppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DeveloperAppsApi apiInstance = new DeveloperAppsApi(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      UpdateDeveloperAppListingResponse result = apiInstance.updateDeveloperAppListing(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeveloperAppsApi#updateDeveloperAppListing");
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
 **appId** | **String**|  |

### Return type

**UpdateDeveloperAppListingResponse**

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

<a name="updateDeveloperAppProfile"></a>
# **updateDeveloperAppProfile**
> UpdateDeveloperAppProfileResponse updateDeveloperAppProfile(appId)

Edit your app&#39;s directory profile: name, slug, tagline, description, longDescription (markdown), category, audience (auto|seller|buyer|both), logoUrl, bannerUrl (4:1, 1600×400), screenshots (≤6), demoVideoUrl, homepageUrl, installUrl, support/privacy/terms links, docsLinks [{label,url}] and pricingNote. Absent keys are kept, null clears. Images not on Crossly&#39;s CDN are copied onto it. Renaming a listed app or changing its audience sends it back to review.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DeveloperAppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DeveloperAppsApi apiInstance = new DeveloperAppsApi(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      UpdateDeveloperAppProfileResponse result = apiInstance.updateDeveloperAppProfile(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeveloperAppsApi#updateDeveloperAppProfile");
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
 **appId** | **String**|  |

### Return type

**UpdateDeveloperAppProfileResponse**

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

<a name="updateDeveloperAppVerification"></a>
# **updateDeveloperAppVerification**
> DeveloperAppVerificationResponse updateDeveloperAppVerification(appId)

Create or edit the verification: domain, requested scopes with a justification each, privacy policy, terms, support email, demo.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DeveloperAppsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DeveloperAppsApi apiInstance = new DeveloperAppsApi(defaultClient);
    String appId = "appId_example"; // String | 
    try {
      DeveloperAppVerificationResponse result = apiInstance.updateDeveloperAppVerification(appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DeveloperAppsApi#updateDeveloperAppVerification");
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
 **appId** | **String**|  |

### Return type

**DeveloperAppVerificationResponse**

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

