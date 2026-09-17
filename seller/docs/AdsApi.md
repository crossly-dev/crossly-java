# AdsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAdOffsiteCampaign**](AdsApi.md#createAdOffsiteCampaign) | **POST** /v1/ads/offsite/campaigns | Launch an offsite campaign for an item.
[**createAdOffsiteResume**](AdsApi.md#createAdOffsiteResume) | **POST** /v1/ads/offsite/resume | Clear an auto-pause and resume offsite spend.
[**getAdOffsite**](AdsApi.md#getAdOffsite) | **GET** /v1/ads/offsite | Your offsite-ads opt-in and its terms.
[**getAdOffsiteEligibility**](AdsApi.md#getAdOffsiteEligibility) | **GET** /v1/ads/offsite/eligibility | Whether an item can run offsite, and why not.
[**getAdOffsiteReport**](AdsApi.md#getAdOffsiteReport) | **GET** /v1/ads/offsite/report | What your offsite budget bought — including the misses.
[**updateAdOffsite**](AdsApi.md#updateAdOffsite) | **PUT** /v1/ads/offsite | Turn offsite ads on or off. Yours alone to set.


<a name="createAdOffsiteCampaign"></a>
# **createAdOffsiteCampaign**
> CreateAdOffsiteCampaignResponse createAdOffsiteCampaign()

Launch an offsite campaign for an item.

Creative is built from the structured fields you pass — title, condition as you recorded it, price, image. We generate no prose and invent no claims about condition or authenticity: an ad saying \&quot;mint\&quot; or \&quot;authenticated\&quot; when your listing says neither is a misrepresentation we authored and YOU would take the dispute for. Refuses with 403 when no ad network is wired, rather than returning a campaign that does not exist — a campaign row marked live with nothing behind it would read as spending your money when it is not.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.AdsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AdsApi apiInstance = new AdsApi(defaultClient);
    try {
      CreateAdOffsiteCampaignResponse result = apiInstance.createAdOffsiteCampaign();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdsApi#createAdOffsiteCampaign");
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

[**CreateAdOffsiteCampaignResponse**](CreateAdOffsiteCampaignResponse.md)

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

<a name="createAdOffsiteResume"></a>
# **createAdOffsiteResume**
> CreateAdOffsiteResumeResponse createAdOffsiteResume()

Clear an auto-pause and resume offsite spend.

Returns 409 when you are not actually paused. The pause reason is worth reading first — resuming without changing anything will usually just trip the floor again over the next window.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.AdsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AdsApi apiInstance = new AdsApi(defaultClient);
    try {
      CreateAdOffsiteResumeResponse result = apiInstance.createAdOffsiteResume();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdsApi#createAdOffsiteResume");
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

[**CreateAdOffsiteResumeResponse**](CreateAdOffsiteResumeResponse.md)

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

<a name="getAdOffsite"></a>
# **getAdOffsite**
> GetAdOffsiteResponse getAdOffsite()

Your offsite-ads opt-in and its terms.

Offsite ads spend your CBX advertising budget on external networks — Google, Meta and similar — at our discretion. Your item gets promoted, and the traffic lands on Crossly. OFF unless you turn it on, and there is no path that enables it on your behalf. Media is passed through AT COST with a separate, disclosed management fee, so you can always see how much of your budget reached the auction. &#x60;minReturnBps&#x60; is a STOP, not a guarantee: below it, offsite spend auto-pauses and the rest of your budget reverts to on-platform placement. Nobody can honestly promise ad performance; what we can promise is that it stops.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.AdsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AdsApi apiInstance = new AdsApi(defaultClient);
    try {
      GetAdOffsiteResponse result = apiInstance.getAdOffsite();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdsApi#getAdOffsite");
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

[**GetAdOffsiteResponse**](GetAdOffsiteResponse.md)

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

<a name="getAdOffsiteEligibility"></a>
# **getAdOffsiteEligibility**
> GetAdOffsiteEligibilityResponse getAdOffsiteEligibility()

Whether an item can run offsite, and why not.

Reasons: &#x60;not_opted_in&#x60;, &#x60;auto_paused&#x60;, &#x60;network_not_allowed&#x60;, &#x60;category_not_allowlisted&#x60;, &#x60;no_adapter&#x60;, &#x60;no_budget&#x60;. The category check is an ALLOWLIST, so an unclassified category is not eligible. That is not bureaucracy: ad networks suspend the ACCOUNT over a prohibited item, and the account is one shared resource across every merchant using this — so one listing could take offsite ads away from all of them. A blocklist would fail open on the first category nobody thought of.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.AdsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AdsApi apiInstance = new AdsApi(defaultClient);
    try {
      GetAdOffsiteEligibilityResponse result = apiInstance.getAdOffsiteEligibility();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdsApi#getAdOffsiteEligibility");
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

[**GetAdOffsiteEligibilityResponse**](GetAdOffsiteEligibilityResponse.md)

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

<a name="getAdOffsiteReport"></a>
# **getAdOffsiteReport**
> GetAdOffsiteReportResponse getAdOffsiteReport()

What your offsite budget bought — including the misses.

Spend, impressions and clicks are reported whether or not anything converted. A report showing only conversions is a report nobody can audit, and this is a feature where you handed over discretion over your money. &#x60;mediaCostCents&#x60; versus &#x60;managementFeeCents&#x60; answers \&quot;how much of my budget reached the auction\&quot; — the two are recorded separately so the answer survives. &#x60;spilloverConversions&#x60; is sales your ads produced on OTHER sellers&#39; items. Reported so you can see whether offsite traffic is reaching buyers who want your item — a high spillover rate is the signal to turn it off. &#x60;returnBps&#x60; is attributed revenue as bps of spend; compare it with your &#x60;minReturnBps&#x60; floor.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.AdsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AdsApi apiInstance = new AdsApi(defaultClient);
    try {
      GetAdOffsiteReportResponse result = apiInstance.getAdOffsiteReport();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdsApi#getAdOffsiteReport");
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

[**GetAdOffsiteReportResponse**](GetAdOffsiteReportResponse.md)

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

<a name="updateAdOffsite"></a>
# **updateAdOffsite**
> UpdateAdOffsiteResponse updateAdOffsite()

Turn offsite ads on or off. Yours alone to set.

The toggle. Nothing else in the system sets &#x60;enabled&#x60; — no onboarding default, no bulk enable, no admin override. &#x60;maxOffsiteShareBps&#x60; caps how much of your budget may leave the platform, so opting in does not mean discovering the whole thing went to Google. &#x60;minReturnBps&#x60; sets the floor below which offsite spend auto-pauses: 20000 means we must return $2 of attributed revenue per $1 spent over the window. Toggling either way clears any existing auto-pause, so turning it back on later does not inherit a pause from months ago. When one of your ads brings a buyer who purchases somebody ELSE&#39;s item, that is reported to you as spillover so you can judge whether offsite traffic is reaching buyers who want YOUR item, and switch it off if not. It is not credited back — you bought clicks, which is how every ad market works.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.AdsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AdsApi apiInstance = new AdsApi(defaultClient);
    try {
      UpdateAdOffsiteResponse result = apiInstance.updateAdOffsite();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdsApi#updateAdOffsite");
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

[**UpdateAdOffsiteResponse**](UpdateAdOffsiteResponse.md)

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

