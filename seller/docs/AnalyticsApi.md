# AnalyticsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAnalyticExperiment**](AnalyticsApi.md#createAnalyticExperiment) | **POST** /v1/analytics/experiments | Start a listing experiment. split: 2-4 live platform listings observed over the same window; sequential: one platform listing, before vs after changeAt (optionally applying a new price).
[**createAnalyticExperimentDeclare**](AnalyticsApi.md#createAnalyticExperimentDeclare) | **POST** /v1/analytics/experiments/{id}/declare | Record the outcome: a winning arm, no difference, or inconclusive. Concludes the experiment.
[**createAnalyticExperimentStop**](AnalyticsApi.md#createAnalyticExperimentStop) | **POST** /v1/analytics/experiments/{id}/stop | Stop an experiment: no more data is counted after now.
[**deleteAnalyticExperiment**](AnalyticsApi.md#deleteAnalyticExperiment) | **DELETE** /v1/analytics/experiments/{id} | Delete an experiment. The listings are untouched.
[**getAnalyticBookkeeping**](AnalyticsApi.md#getAnalyticBookkeeping) | **GET** /v1/analytics/bookkeeping | Monthly P&amp;L + per-platform breakdown for a calendar year.
[**getAnalyticByPlatform**](AnalyticsApi.md#getAnalyticByPlatform) | **GET** /v1/analytics/by-platform | Sales, net sales, fees and net profit by platform for the last N days.
[**getAnalyticCompare**](AnalyticsApi.md#getAnalyticCompare) | **GET** /v1/analytics/compare | Compare 2-4 of your listings: columns of price, quality, channels, views, favorites, offers and outcome, engagement curves, the fields that differ, and observational tests of favorite rate, view-to-offer rate and views per day.
[**getAnalyticDashboard**](AnalyticsApi.md#getAnalyticDashboard) | **GET** /v1/analytics/dashboard | Composite dashboard: KPIs + breakdowns + recent activity.
[**getAnalyticExperiment**](AnalyticsApi.md#getAnalyticExperiment) | **GET** /v1/analytics/experiments | Your listing A/B experiments, newest first, with status, days running and the current verdict.
[**getAnalyticExperimentById**](AnalyticsApi.md#getAnalyticExperimentById) | **GET** /v1/analytics/experiments/{id} | One experiment: arms with their windows, exposure and rates, the primary-metric test per arm against A, guardrail tests, the daily series and what to do next.
[**getAnalyticInventory**](AnalyticsApi.md#getAnalyticInventory) | **GET** /v1/analytics/inventory | Unsold stock: aging buckets with cost, listed value and market value, the 20 listings most in need of attention, shelf value over time, cohort sell-through at the chosen maturity, listed vs sold velocity and data health.
[**getAnalyticItem**](AnalyticsApi.md#getAnalyticItem) | **GET** /v1/analytics/items | Per-item P&amp;L for sold inventory.
[**getAnalyticItemByListingId**](AnalyticsApi.md#getAnalyticItemByListingId) | **GET** /v1/analytics/items/{listingId} | One listing in depth: channels with views, favorites and offers, the merged timeline, engagement series, price history, comps, money waterfall, days on market, offers, messages, experiments and suggestions.
[**getAnalyticMarketplace**](AnalyticsApi.md#getAnalyticMarketplace) | **GET** /v1/analytics/marketplaces | Every marketplace side by side: net sales and profit, units, ASP, take rate, margin, shipping subsidy, days to sell, sell-through, cancel and return rates, offers and engagement; with vs&#x3D;2-3 platforms, a head-to-head over listings live on all of them.
[**getAnalyticMarketplaceByPlatform**](AnalyticsApi.md#getAnalyticMarketplaceByPlatform) | **GET** /v1/analytics/marketplaces/{platform} | One marketplace in depth: its row, the money series, fee breakdown, days-to-sell and price-realization histograms, categories, top items, at-risk listings, a day-by-hour sales heatmap and offer stats.
[**getAnalyticOverview**](AnalyticsApi.md#getAnalyticOverview) | **GET** /v1/analytics/overview | KPIs with deltas (net sales, net profit, units, ASP, margin, sell-through, median days to sell, active listings, take rate), the trend series, by-marketplace split, top categories, brands and items, sell-through cohort, data health and insights.
[**getAnalyticPerformance**](AnalyticsApi.md#getAnalyticPerformance) | **GET** /v1/analytics/performance | Per-listing performance: channels, views, favorites, offers and conversations in the period, units sold, net sales and profit, margin, days to sell and a 0-100 health score, paged and sortable.
[**getAnalyticProgram**](AnalyticsApi.md#getAnalyticProgram) | **GET** /v1/analytics/programs/{program} | One program&#39;s report over a date range (default the last 30 days, at most 366): KPIs, a daily trend and a breakdown table. Money in integer cents.
[**getAnalyticSegment**](AnalyticsApi.md#getAnalyticSegment) | **GET** /v1/analytics/segments | Niches along one dimension: listed and active counts, units sold, cohort sell-through, median days to sell, net sales and profit, margin, ROI, ASP and discount from ask; rows under minN are flagged lowSample.
[**getAnalyticSegmentByKey**](AnalyticsApi.md#getAnalyticSegmentByKey) | **GET** /v1/analytics/segments/{dim}/{key} | One niche in depth: its row, series, by-marketplace split, days-to-sell histogram, price bands, top items and the 10 oldest unsold listings in it.
[**getAnalyticSummary**](AnalyticsApi.md#getAnalyticSummary) | **GET** /v1/analytics/summary | Headline KPIs for the last N days (the same numbers as the analytics overview).
[**getAnalyticTimesery**](AnalyticsApi.md#getAnalyticTimesery) | **GET** /v1/analytics/timeseries | Sales and net sales over the last N days, zero-filled, one row per calendar day.
[**getAnalyticToday**](AnalyticsApi.md#getAnalyticToday) | **GET** /v1/analytics/today | Today&#39;s checklist + 14-day activity streak.
[**listInsightByPlatform**](AnalyticsApi.md#listInsightByPlatform) | **GET** /v1/insights/by-platform | Platform velocity + margin insight (90-day window): units, net sales, median days to sell, ASP and net after the real marketplace fees.
[**updateAnalyticExperiment**](AnalyticsApi.md#updateAnalyticExperiment) | **PATCH** /v1/analytics/experiments/{id} | Rename an experiment or change its hypothesis, notes or planned end.


<a name="createAnalyticExperiment"></a>
# **createAnalyticExperiment**
> AnalyticExperimentResponse createAnalyticExperiment()

Start a listing experiment. split: 2-4 live platform listings observed over the same window; sequential: one platform listing, before vs after changeAt (optionally applying a new price).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
    try {
      AnalyticExperimentResponse result = apiInstance.createAnalyticExperiment();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApi#createAnalyticExperiment");
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

**AnalyticExperimentResponse**

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

<a name="createAnalyticExperimentDeclare"></a>
# **createAnalyticExperimentDeclare**
> AnalyticExperimentResponse createAnalyticExperimentDeclare(id)

Record the outcome: a winning arm, no difference, or inconclusive. Concludes the experiment.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
    String id = "id_example"; // String | The experiment id (a uuid; any other id is a 404).
    try {
      AnalyticExperimentResponse result = apiInstance.createAnalyticExperimentDeclare(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApi#createAnalyticExperimentDeclare");
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
 **id** | **String**| The experiment id (a uuid; any other id is a 404). |

### Return type

**AnalyticExperimentResponse**

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

<a name="createAnalyticExperimentStop"></a>
# **createAnalyticExperimentStop**
> AnalyticExperimentResponse createAnalyticExperimentStop(id)

Stop an experiment: no more data is counted after now.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
    String id = "id_example"; // String | The experiment id (a uuid; any other id is a 404).
    try {
      AnalyticExperimentResponse result = apiInstance.createAnalyticExperimentStop(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApi#createAnalyticExperimentStop");
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
 **id** | **String**| The experiment id (a uuid; any other id is a 404). |

### Return type

**AnalyticExperimentResponse**

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

<a name="deleteAnalyticExperiment"></a>
# **deleteAnalyticExperiment**
> DeleteStoryResponse deleteAnalyticExperiment(id)

Delete an experiment. The listings are untouched.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
    String id = "id_example"; // String | The experiment id (a uuid; any other id is a 404).
    try {
      DeleteStoryResponse result = apiInstance.deleteAnalyticExperiment(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApi#deleteAnalyticExperiment");
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
 **id** | **String**| The experiment id (a uuid; any other id is a 404). |

### Return type

**DeleteStoryResponse**

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

<a name="getAnalyticBookkeeping"></a>
# **getAnalyticBookkeeping**
> GetAnalyticBookkeepingResponse getAnalyticBookkeeping()

Monthly P&amp;L + per-platform breakdown for a calendar year.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
    try {
      GetAnalyticBookkeepingResponse result = apiInstance.getAnalyticBookkeeping();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApi#getAnalyticBookkeeping");
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

**GetAnalyticBookkeepingResponse**

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

<a name="getAnalyticByPlatform"></a>
# **getAnalyticByPlatform**
> GetAnalyticByPlatformResponse getAnalyticByPlatform(days, tz)

Sales, net sales, fees and net profit by platform for the last N days.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
    Integer days = 30; // Integer | Calendar days back, today included. Larger values are clamped to 365.
    String tz = "tz_example"; // String | IANA time zone for day boundaries. Default UTC.
    try {
      GetAnalyticByPlatformResponse result = apiInstance.getAnalyticByPlatform(days, tz);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApi#getAnalyticByPlatform");
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
 **days** | **Integer**| Calendar days back, today included. Larger values are clamped to 365. | [optional] [default to 30]
 **tz** | **String**| IANA time zone for day boundaries. Default UTC. | [optional]

### Return type

**GetAnalyticByPlatformResponse**

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

<a name="getAnalyticCompare"></a>
# **getAnalyticCompare**
> GetAnalyticCompareResponse getAnalyticCompare(ids, align, platform, tz)

Compare 2-4 of your listings: columns of price, quality, channels, views, favorites, offers and outcome, engagement curves, the fields that differ, and observational tests of favorite rate, view-to-offer rate and views per day.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
    String ids = "ids_example"; // String | Comma-separated listing ids, 2 to 4. The first is arm A.
    String align = "age"; // String | age = x is days since first listed (default); calendar = x is the date.
    String platform = "platform_example"; // String | Restrict engagement to one channel (platform id).
    String tz = "tz_example"; // String | IANA time zone. Default UTC.
    try {
      GetAnalyticCompareResponse result = apiInstance.getAnalyticCompare(ids, align, platform, tz);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApi#getAnalyticCompare");
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
 **ids** | **String**| Comma-separated listing ids, 2 to 4. The first is arm A. |
 **align** | **String**| age &#x3D; x is days since first listed (default); calendar &#x3D; x is the date. | [optional] [enum: age, calendar]
 **platform** | **String**| Restrict engagement to one channel (platform id). | [optional]
 **tz** | **String**| IANA time zone. Default UTC. | [optional]

### Return type

**GetAnalyticCompareResponse**

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

<a name="getAnalyticDashboard"></a>
# **getAnalyticDashboard**
> GetAnalyticDashboardResponse getAnalyticDashboard()

Composite dashboard: KPIs + breakdowns + recent activity.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
    try {
      GetAnalyticDashboardResponse result = apiInstance.getAnalyticDashboard();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApi#getAnalyticDashboard");
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

**GetAnalyticDashboardResponse**

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

<a name="getAnalyticExperiment"></a>
# **getAnalyticExperiment**
> GetAnalyticExperimentResponse getAnalyticExperiment(status, page, size)

Your listing A/B experiments, newest first, with status, days running and the current verdict.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
    String status = "all"; // String | Default all.
    Integer page = 56; // Integer | 1-indexed page. Default 1.
    Integer size = 56; // Integer | Rows per page. Default 20.
    try {
      GetAnalyticExperimentResponse result = apiInstance.getAnalyticExperiment(status, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApi#getAnalyticExperiment");
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
 **status** | **String**| Default all. | [optional] [enum: all, running, concluded, draft]
 **page** | **Integer**| 1-indexed page. Default 1. | [optional]
 **size** | **Integer**| Rows per page. Default 20. | [optional]

### Return type

**GetAnalyticExperimentResponse**

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

<a name="getAnalyticExperimentById"></a>
# **getAnalyticExperimentById**
> GetAnalyticExperimentByIdResponse getAnalyticExperimentById(id)

One experiment: arms with their windows, exposure and rates, the primary-metric test per arm against A, guardrail tests, the daily series and what to do next.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
    String id = "id_example"; // String | The experiment id (a uuid).
    try {
      GetAnalyticExperimentByIdResponse result = apiInstance.getAnalyticExperimentById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApi#getAnalyticExperimentById");
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
 **id** | **String**| The experiment id (a uuid). |

### Return type

**GetAnalyticExperimentByIdResponse**

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

<a name="getAnalyticInventory"></a>
# **getAnalyticInventory**
> GetAnalyticInventoryResponse getAnalyticInventory(range, from, to, compare, cmpFrom, cmpTo, labels, platforms, category, brand, tz, maturity)

Unsold stock: aging buckets with cost, listed value and market value, the 20 listings most in need of attention, shelf value over time, cohort sell-through at the chosen maturity, listed vs sold velocity and data health.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
    String range = "7d"; // String | Reporting window. Default 30d. custom needs from and to.
    String from = "from_example"; // String | YYYY-MM-DD, inclusive, in tz. Only with range=custom.
    String to = "to_example"; // String | YYYY-MM-DD, inclusive, in tz. Only with range=custom.
    String compare = "prev"; // String | Comparison window for deltas: prev (same length just before), yoy, none, custom (cmpFrom/cmpTo).
    String cmpFrom = "cmpFrom_example"; // String | YYYY-MM-DD. Only with compare=custom.
    String cmpTo = "cmpTo_example"; // String | YYYY-MM-DD. Only with compare=custom.
    String labels = "labels_example"; // String | Comma-separated inventory labels (any of them).
    String platforms = "platforms_example"; // String | Comma-separated platform ids.
    String category = "category_example"; // String | Canonical main-category key.
    String brand = "brand_example"; // String | Brand name.
    String tz = "tz_example"; // String | IANA time zone for day boundaries. Default UTC. An invalid name is a 400.
    Integer maturity = 30; // Integer | Days an item has to sell within to count as sold in the cohort. Default 30.
    try {
      GetAnalyticInventoryResponse result = apiInstance.getAnalyticInventory(range, from, to, compare, cmpFrom, cmpTo, labels, platforms, category, brand, tz, maturity);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApi#getAnalyticInventory");
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
 **range** | **String**| Reporting window. Default 30d. custom needs from and to. | [optional] [enum: 7d, 30d, 90d, 1y, ytd, all, custom]
 **from** | **String**| YYYY-MM-DD, inclusive, in tz. Only with range&#x3D;custom. | [optional]
 **to** | **String**| YYYY-MM-DD, inclusive, in tz. Only with range&#x3D;custom. | [optional]
 **compare** | **String**| Comparison window for deltas: prev (same length just before), yoy, none, custom (cmpFrom/cmpTo). | [optional] [enum: prev, yoy, none, custom]
 **cmpFrom** | **String**| YYYY-MM-DD. Only with compare&#x3D;custom. | [optional]
 **cmpTo** | **String**| YYYY-MM-DD. Only with compare&#x3D;custom. | [optional]
 **labels** | **String**| Comma-separated inventory labels (any of them). | [optional]
 **platforms** | **String**| Comma-separated platform ids. | [optional]
 **category** | **String**| Canonical main-category key. | [optional]
 **brand** | **String**| Brand name. | [optional]
 **tz** | **String**| IANA time zone for day boundaries. Default UTC. An invalid name is a 400. | [optional]
 **maturity** | **Integer**| Days an item has to sell within to count as sold in the cohort. Default 30. | [optional] [enum: 30, 60, 90]

### Return type

**GetAnalyticInventoryResponse**

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

<a name="getAnalyticItem"></a>
# **getAnalyticItem**
> GetAnalyticItemResponse getAnalyticItem()

Per-item P&amp;L for sold inventory.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
    try {
      GetAnalyticItemResponse result = apiInstance.getAnalyticItem();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApi#getAnalyticItem");
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

**GetAnalyticItemResponse**

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

<a name="getAnalyticItemByListingId"></a>
# **getAnalyticItemByListingId**
> GetAnalyticItemByListingIdResponse getAnalyticItemByListingId(listingId, by, tz)

One listing in depth: channels with views, favorites and offers, the merged timeline, engagement series, price history, comps, money waterfall, days on market, offers, messages, experiments and suggestions.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
    String listingId = "listingId_example"; // String | A listings.id you own (or an inventory item id with by=inventory).
    String by = "listing"; // String | inventory = the id is an inventory item id; the answer is { redirectListingId }. Default listing.
    String tz = "tz_example"; // String | IANA time zone for day boundaries. Default UTC.
    try {
      GetAnalyticItemByListingIdResponse result = apiInstance.getAnalyticItemByListingId(listingId, by, tz);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApi#getAnalyticItemByListingId");
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
 **listingId** | **String**| A listings.id you own (or an inventory item id with by&#x3D;inventory). |
 **by** | **String**| inventory &#x3D; the id is an inventory item id; the answer is { redirectListingId }. Default listing. | [optional] [enum: listing, inventory]
 **tz** | **String**| IANA time zone for day boundaries. Default UTC. | [optional]

### Return type

**GetAnalyticItemByListingIdResponse**

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

<a name="getAnalyticMarketplace"></a>
# **getAnalyticMarketplace**
> GetAnalyticMarketplaceResponse getAnalyticMarketplace(range, from, to, compare, cmpFrom, cmpTo, labels, platforms, category, brand, tz, vs, sort, dir)

Every marketplace side by side: net sales and profit, units, ASP, take rate, margin, shipping subsidy, days to sell, sell-through, cancel and return rates, offers and engagement; with vs&#x3D;2-3 platforms, a head-to-head over listings live on all of them.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
    String range = "7d"; // String | Reporting window. Default 30d. custom needs from and to.
    String from = "from_example"; // String | YYYY-MM-DD, inclusive, in tz. Only with range=custom.
    String to = "to_example"; // String | YYYY-MM-DD, inclusive, in tz. Only with range=custom.
    String compare = "prev"; // String | Comparison window for deltas: prev (same length just before), yoy, none, custom (cmpFrom/cmpTo).
    String cmpFrom = "cmpFrom_example"; // String | YYYY-MM-DD. Only with compare=custom.
    String cmpTo = "cmpTo_example"; // String | YYYY-MM-DD. Only with compare=custom.
    String labels = "labels_example"; // String | Comma-separated inventory labels (any of them).
    String platforms = "platforms_example"; // String | Comma-separated platform ids.
    String category = "category_example"; // String | Canonical main-category key.
    String brand = "brand_example"; // String | Brand name.
    String tz = "tz_example"; // String | IANA time zone for day boundaries. Default UTC. An invalid name is a 400.
    String vs = "vs_example"; // String | Comma-separated 2-3 platform ids for the head-to-head.
    String sort = "netSales"; // String | Default netSales.
    String dir = "asc"; // String | Default desc.
    try {
      GetAnalyticMarketplaceResponse result = apiInstance.getAnalyticMarketplace(range, from, to, compare, cmpFrom, cmpTo, labels, platforms, category, brand, tz, vs, sort, dir);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApi#getAnalyticMarketplace");
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
 **range** | **String**| Reporting window. Default 30d. custom needs from and to. | [optional] [enum: 7d, 30d, 90d, 1y, ytd, all, custom]
 **from** | **String**| YYYY-MM-DD, inclusive, in tz. Only with range&#x3D;custom. | [optional]
 **to** | **String**| YYYY-MM-DD, inclusive, in tz. Only with range&#x3D;custom. | [optional]
 **compare** | **String**| Comparison window for deltas: prev (same length just before), yoy, none, custom (cmpFrom/cmpTo). | [optional] [enum: prev, yoy, none, custom]
 **cmpFrom** | **String**| YYYY-MM-DD. Only with compare&#x3D;custom. | [optional]
 **cmpTo** | **String**| YYYY-MM-DD. Only with compare&#x3D;custom. | [optional]
 **labels** | **String**| Comma-separated inventory labels (any of them). | [optional]
 **platforms** | **String**| Comma-separated platform ids. | [optional]
 **category** | **String**| Canonical main-category key. | [optional]
 **brand** | **String**| Brand name. | [optional]
 **tz** | **String**| IANA time zone for day boundaries. Default UTC. An invalid name is a 400. | [optional]
 **vs** | **String**| Comma-separated 2-3 platform ids for the head-to-head. | [optional]
 **sort** | **String**| Default netSales. | [optional] [enum: netSales, netProfit, unitsSold, asp, takeRate, marginRate, shippingSubsidy, medianDaysToSell, sellThroughRate, cancelRate, returnRate, offerAcceptRate, avgOfferPctOfAsk, viewsPerListingDay, favoriteRate, platform, activeListings, staleListings]
 **dir** | **String**| Default desc. | [optional] [enum: asc, desc]

### Return type

**GetAnalyticMarketplaceResponse**

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

<a name="getAnalyticMarketplaceByPlatform"></a>
# **getAnalyticMarketplaceByPlatform**
> GetAnalyticMarketplaceByPlatformResponse getAnalyticMarketplaceByPlatform(platform, range, from, to, compare, cmpFrom, cmpTo, labels, platforms, category, brand, tz)

One marketplace in depth: its row, the money series, fee breakdown, days-to-sell and price-realization histograms, categories, top items, at-risk listings, a day-by-hour sales heatmap and offer stats.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
    String platform = "platform_example"; // String | A platform id, e.g. ebay, poshmark.
    String range = "7d"; // String | Reporting window. Default 30d. custom needs from and to.
    String from = "from_example"; // String | YYYY-MM-DD, inclusive, in tz. Only with range=custom.
    String to = "to_example"; // String | YYYY-MM-DD, inclusive, in tz. Only with range=custom.
    String compare = "prev"; // String | Comparison window for deltas: prev (same length just before), yoy, none, custom (cmpFrom/cmpTo).
    String cmpFrom = "cmpFrom_example"; // String | YYYY-MM-DD. Only with compare=custom.
    String cmpTo = "cmpTo_example"; // String | YYYY-MM-DD. Only with compare=custom.
    String labels = "labels_example"; // String | Comma-separated inventory labels (any of them).
    String platforms = "platforms_example"; // String | Comma-separated platform ids.
    String category = "category_example"; // String | Canonical main-category key.
    String brand = "brand_example"; // String | Brand name.
    String tz = "tz_example"; // String | IANA time zone for day boundaries. Default UTC. An invalid name is a 400.
    try {
      GetAnalyticMarketplaceByPlatformResponse result = apiInstance.getAnalyticMarketplaceByPlatform(platform, range, from, to, compare, cmpFrom, cmpTo, labels, platforms, category, brand, tz);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApi#getAnalyticMarketplaceByPlatform");
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
 **platform** | **String**| A platform id, e.g. ebay, poshmark. |
 **range** | **String**| Reporting window. Default 30d. custom needs from and to. | [optional] [enum: 7d, 30d, 90d, 1y, ytd, all, custom]
 **from** | **String**| YYYY-MM-DD, inclusive, in tz. Only with range&#x3D;custom. | [optional]
 **to** | **String**| YYYY-MM-DD, inclusive, in tz. Only with range&#x3D;custom. | [optional]
 **compare** | **String**| Comparison window for deltas: prev (same length just before), yoy, none, custom (cmpFrom/cmpTo). | [optional] [enum: prev, yoy, none, custom]
 **cmpFrom** | **String**| YYYY-MM-DD. Only with compare&#x3D;custom. | [optional]
 **cmpTo** | **String**| YYYY-MM-DD. Only with compare&#x3D;custom. | [optional]
 **labels** | **String**| Comma-separated inventory labels (any of them). | [optional]
 **platforms** | **String**| Comma-separated platform ids. | [optional]
 **category** | **String**| Canonical main-category key. | [optional]
 **brand** | **String**| Brand name. | [optional]
 **tz** | **String**| IANA time zone for day boundaries. Default UTC. An invalid name is a 400. | [optional]

### Return type

**GetAnalyticMarketplaceByPlatformResponse**

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

<a name="getAnalyticOverview"></a>
# **getAnalyticOverview**
> GetAnalyticOverviewResponse getAnalyticOverview(range, from, to, compare, cmpFrom, cmpTo, labels, platforms, category, brand, tz, stores)

KPIs with deltas (net sales, net profit, units, ASP, margin, sell-through, median days to sell, active listings, take rate), the trend series, by-marketplace split, top categories, brands and items, sell-through cohort, data health and insights.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
    String range = "7d"; // String | Reporting window. Default 30d. custom needs from and to.
    String from = "from_example"; // String | YYYY-MM-DD, inclusive, in tz. Only with range=custom.
    String to = "to_example"; // String | YYYY-MM-DD, inclusive, in tz. Only with range=custom.
    String compare = "prev"; // String | Comparison window for deltas: prev (same length just before), yoy, none, custom (cmpFrom/cmpTo).
    String cmpFrom = "cmpFrom_example"; // String | YYYY-MM-DD. Only with compare=custom.
    String cmpTo = "cmpTo_example"; // String | YYYY-MM-DD. Only with compare=custom.
    String labels = "labels_example"; // String | Comma-separated inventory labels (any of them).
    String platforms = "platforms_example"; // String | Comma-separated platform ids.
    String category = "category_example"; // String | Canonical main-category key.
    String brand = "brand_example"; // String | Brand name.
    String tz = "tz_example"; // String | IANA time zone for day boundaries. Default UTC. An invalid name is a 400.
    String stores = "stores_example"; // String | Comma-separated store ids.
    try {
      GetAnalyticOverviewResponse result = apiInstance.getAnalyticOverview(range, from, to, compare, cmpFrom, cmpTo, labels, platforms, category, brand, tz, stores);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApi#getAnalyticOverview");
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
 **range** | **String**| Reporting window. Default 30d. custom needs from and to. | [optional] [enum: 7d, 30d, 90d, 1y, ytd, all, custom]
 **from** | **String**| YYYY-MM-DD, inclusive, in tz. Only with range&#x3D;custom. | [optional]
 **to** | **String**| YYYY-MM-DD, inclusive, in tz. Only with range&#x3D;custom. | [optional]
 **compare** | **String**| Comparison window for deltas: prev (same length just before), yoy, none, custom (cmpFrom/cmpTo). | [optional] [enum: prev, yoy, none, custom]
 **cmpFrom** | **String**| YYYY-MM-DD. Only with compare&#x3D;custom. | [optional]
 **cmpTo** | **String**| YYYY-MM-DD. Only with compare&#x3D;custom. | [optional]
 **labels** | **String**| Comma-separated inventory labels (any of them). | [optional]
 **platforms** | **String**| Comma-separated platform ids. | [optional]
 **category** | **String**| Canonical main-category key. | [optional]
 **brand** | **String**| Brand name. | [optional]
 **tz** | **String**| IANA time zone for day boundaries. Default UTC. An invalid name is a 400. | [optional]
 **stores** | **String**| Comma-separated store ids. | [optional]

### Return type

**GetAnalyticOverviewResponse**

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

<a name="getAnalyticPerformance"></a>
# **getAnalyticPerformance**
> GetAnalyticPerformanceResponse getAnalyticPerformance(range, from, to, compare, cmpFrom, cmpTo, labels, platforms, category, brand, tz, status, q, sort, dir, page, size, minDays)

Per-listing performance: channels, views, favorites, offers and conversations in the period, units sold, net sales and profit, margin, days to sell and a 0-100 health score, paged and sortable.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
    String range = "7d"; // String | Reporting window. Default 30d. custom needs from and to.
    String from = "from_example"; // String | YYYY-MM-DD, inclusive, in tz. Only with range=custom.
    String to = "to_example"; // String | YYYY-MM-DD, inclusive, in tz. Only with range=custom.
    String compare = "prev"; // String | Comparison window for deltas: prev (same length just before), yoy, none, custom (cmpFrom/cmpTo).
    String cmpFrom = "cmpFrom_example"; // String | YYYY-MM-DD. Only with compare=custom.
    String cmpTo = "cmpTo_example"; // String | YYYY-MM-DD. Only with compare=custom.
    String labels = "labels_example"; // String | Comma-separated inventory labels (any of them).
    String platforms = "platforms_example"; // String | Comma-separated platform ids.
    String category = "category_example"; // String | Canonical main-category key.
    String brand = "brand_example"; // String | Brand name.
    String tz = "tz_example"; // String | IANA time zone for day boundaries. Default UTC. An invalid name is a 400.
    String status = "all"; // String | unsold = listed at least minDays with no completed sale.
    String q = "q_example"; // String | Title, SKU or brand contains.
    String sort = "lastActivity"; // String | Default lastActivity.
    String dir = "asc"; // String | Default desc.
    Integer page = 56; // Integer | 1-indexed page. Default 1.
    Integer size = 25; // Integer | Rows per page. Default 50.
    Integer minDays = 56; // Integer | Minimum days listed (for status=unsold). Default 0.
    try {
      GetAnalyticPerformanceResponse result = apiInstance.getAnalyticPerformance(range, from, to, compare, cmpFrom, cmpTo, labels, platforms, category, brand, tz, status, q, sort, dir, page, size, minDays);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApi#getAnalyticPerformance");
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
 **range** | **String**| Reporting window. Default 30d. custom needs from and to. | [optional] [enum: 7d, 30d, 90d, 1y, ytd, all, custom]
 **from** | **String**| YYYY-MM-DD, inclusive, in tz. Only with range&#x3D;custom. | [optional]
 **to** | **String**| YYYY-MM-DD, inclusive, in tz. Only with range&#x3D;custom. | [optional]
 **compare** | **String**| Comparison window for deltas: prev (same length just before), yoy, none, custom (cmpFrom/cmpTo). | [optional] [enum: prev, yoy, none, custom]
 **cmpFrom** | **String**| YYYY-MM-DD. Only with compare&#x3D;custom. | [optional]
 **cmpTo** | **String**| YYYY-MM-DD. Only with compare&#x3D;custom. | [optional]
 **labels** | **String**| Comma-separated inventory labels (any of them). | [optional]
 **platforms** | **String**| Comma-separated platform ids. | [optional]
 **category** | **String**| Canonical main-category key. | [optional]
 **brand** | **String**| Brand name. | [optional]
 **tz** | **String**| IANA time zone for day boundaries. Default UTC. An invalid name is a 400. | [optional]
 **status** | **String**| unsold &#x3D; listed at least minDays with no completed sale. | [optional] [enum: all, active, sold, unsold, ended]
 **q** | **String**| Title, SKU or brand contains. | [optional]
 **sort** | **String**| Default lastActivity. | [optional] [enum: lastActivity, title, price, daysListed, views, favorites, offers, unitsSold, netSales, netProfit, margin, daysToSell, health]
 **dir** | **String**| Default desc. | [optional] [enum: asc, desc]
 **page** | **Integer**| 1-indexed page. Default 1. | [optional]
 **size** | **Integer**| Rows per page. Default 50. | [optional] [enum: 25, 50, 100]
 **minDays** | **Integer**| Minimum days listed (for status&#x3D;unsold). Default 0. | [optional]

### Return type

**GetAnalyticPerformanceResponse**

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

<a name="getAnalyticProgram"></a>
# **getAnalyticProgram**
> GetAnalyticProgramResponse getAnalyticProgram(program, from, to, by)

One program&#39;s report over a date range (default the last 30 days, at most 366): KPIs, a daily trend and a breakdown table. Money in integer cents.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
    String program = "wholesale"; // String | 
    LocalDate from = LocalDate.now(); // LocalDate | First UTC day (YYYY-MM-DD), inclusive.
    LocalDate to = LocalDate.now(); // LocalDate | Last UTC day (YYYY-MM-DD), inclusive. Default today.
    String by = "by_example"; // String | Breakdown dimension, when the program offers one (worlds: showroom, property, event).
    try {
      GetAnalyticProgramResponse result = apiInstance.getAnalyticProgram(program, from, to, by);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApi#getAnalyticProgram");
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
 **program** | **String**|  | [enum: wholesale, ads, rentals, branding, events, drops, discounts, market, worlds, funding, vault, team, referrals, developer-apps]
 **from** | **LocalDate**| First UTC day (YYYY-MM-DD), inclusive. | [optional]
 **to** | **LocalDate**| Last UTC day (YYYY-MM-DD), inclusive. Default today. | [optional]
 **by** | **String**| Breakdown dimension, when the program offers one (worlds: showroom, property, event). | [optional]

### Return type

**GetAnalyticProgramResponse**

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

<a name="getAnalyticSegment"></a>
# **getAnalyticSegment**
> GetAnalyticSegmentResponse getAnalyticSegment(range, from, to, compare, cmpFrom, cmpTo, labels, platforms, category, brand, tz, dim, sort, dir, minN, q)

Niches along one dimension: listed and active counts, units sold, cohort sell-through, median days to sell, net sales and profit, margin, ROI, ASP and discount from ask; rows under minN are flagged lowSample.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
    String range = "7d"; // String | Reporting window. Default 30d. custom needs from and to.
    String from = "from_example"; // String | YYYY-MM-DD, inclusive, in tz. Only with range=custom.
    String to = "to_example"; // String | YYYY-MM-DD, inclusive, in tz. Only with range=custom.
    String compare = "prev"; // String | Comparison window for deltas: prev (same length just before), yoy, none, custom (cmpFrom/cmpTo).
    String cmpFrom = "cmpFrom_example"; // String | YYYY-MM-DD. Only with compare=custom.
    String cmpTo = "cmpTo_example"; // String | YYYY-MM-DD. Only with compare=custom.
    String labels = "labels_example"; // String | Comma-separated inventory labels (any of them).
    String platforms = "platforms_example"; // String | Comma-separated platform ids.
    String category = "category_example"; // String | Canonical main-category key.
    String brand = "brand_example"; // String | Brand name.
    String tz = "tz_example"; // String | IANA time zone for day boundaries. Default UTC. An invalid name is a 400.
    String dim = "category"; // String | category = main category; subcategory = main > sub; brand; condition; size; source = where you acquired it; department; priceBand = ask in <$10, $10-25, $25-50, $50-100, $100-250, $250+; ageBand = days live at sale or now (<7, 7-30, 30-90, 90+).
    String sort = "label"; // String | Default netSales.
    String dir = "asc"; // String | Default desc.
    Integer minN = 56; // Integer | Minimum sample for a row to count as a winner or loser. Default 3.
    String q = "q_example"; // String | Segment label contains.
    try {
      GetAnalyticSegmentResponse result = apiInstance.getAnalyticSegment(range, from, to, compare, cmpFrom, cmpTo, labels, platforms, category, brand, tz, dim, sort, dir, minN, q);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApi#getAnalyticSegment");
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
 **range** | **String**| Reporting window. Default 30d. custom needs from and to. | [optional] [enum: 7d, 30d, 90d, 1y, ytd, all, custom]
 **from** | **String**| YYYY-MM-DD, inclusive, in tz. Only with range&#x3D;custom. | [optional]
 **to** | **String**| YYYY-MM-DD, inclusive, in tz. Only with range&#x3D;custom. | [optional]
 **compare** | **String**| Comparison window for deltas: prev (same length just before), yoy, none, custom (cmpFrom/cmpTo). | [optional] [enum: prev, yoy, none, custom]
 **cmpFrom** | **String**| YYYY-MM-DD. Only with compare&#x3D;custom. | [optional]
 **cmpTo** | **String**| YYYY-MM-DD. Only with compare&#x3D;custom. | [optional]
 **labels** | **String**| Comma-separated inventory labels (any of them). | [optional]
 **platforms** | **String**| Comma-separated platform ids. | [optional]
 **category** | **String**| Canonical main-category key. | [optional]
 **brand** | **String**| Brand name. | [optional]
 **tz** | **String**| IANA time zone for day boundaries. Default UTC. An invalid name is a 400. | [optional]
 **dim** | **String**| category &#x3D; main category; subcategory &#x3D; main &gt; sub; brand; condition; size; source &#x3D; where you acquired it; department; priceBand &#x3D; ask in &lt;$10, $10-25, $25-50, $50-100, $100-250, $250+; ageBand &#x3D; days live at sale or now (&lt;7, 7-30, 30-90, 90+). | [optional] [enum: category, subcategory, brand, condition, size, source, department, priceBand, ageBand]
 **sort** | **String**| Default netSales. | [optional] [enum: label, listedCount, activeCount, unitsSold, sellThrough, medianDaysToSell, netSales, netProfit, marginRate, margin, roi, asp, share]
 **dir** | **String**| Default desc. | [optional] [enum: asc, desc]
 **minN** | **Integer**| Minimum sample for a row to count as a winner or loser. Default 3. | [optional]
 **q** | **String**| Segment label contains. | [optional]

### Return type

**GetAnalyticSegmentResponse**

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

<a name="getAnalyticSegmentByKey"></a>
# **getAnalyticSegmentByKey**
> GetAnalyticSegmentByKeyResponse getAnalyticSegmentByKey(dim, key, range, from, to, compare, cmpFrom, cmpTo, labels, platforms, category, brand, tz)

One niche in depth: its row, series, by-marketplace split, days-to-sell histogram, price bands, top items and the 10 oldest unsold listings in it.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
    String dim = "dim_example"; // String | One of category, subcategory, brand, condition, size, source, department, priceBand, ageBand. category = main category; subcategory = main > sub; brand; condition; size; source = where you acquired it; department; priceBand = ask in <$10, $10-25, $25-50, $50-100, $100-250, $250+; ageBand = days live at sale or now (<7, 7-30, 30-90, 90+).
    String key = "key_example"; // String | The segment key from a segments row (URL-encoded). A key with no data in scope is a 404.
    String range = "7d"; // String | Reporting window. Default 30d. custom needs from and to.
    String from = "from_example"; // String | YYYY-MM-DD, inclusive, in tz. Only with range=custom.
    String to = "to_example"; // String | YYYY-MM-DD, inclusive, in tz. Only with range=custom.
    String compare = "prev"; // String | Comparison window for deltas: prev (same length just before), yoy, none, custom (cmpFrom/cmpTo).
    String cmpFrom = "cmpFrom_example"; // String | YYYY-MM-DD. Only with compare=custom.
    String cmpTo = "cmpTo_example"; // String | YYYY-MM-DD. Only with compare=custom.
    String labels = "labels_example"; // String | Comma-separated inventory labels (any of them).
    String platforms = "platforms_example"; // String | Comma-separated platform ids.
    String category = "category_example"; // String | Canonical main-category key.
    String brand = "brand_example"; // String | Brand name.
    String tz = "tz_example"; // String | IANA time zone for day boundaries. Default UTC. An invalid name is a 400.
    try {
      GetAnalyticSegmentByKeyResponse result = apiInstance.getAnalyticSegmentByKey(dim, key, range, from, to, compare, cmpFrom, cmpTo, labels, platforms, category, brand, tz);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApi#getAnalyticSegmentByKey");
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
 **dim** | **String**| One of category, subcategory, brand, condition, size, source, department, priceBand, ageBand. category &#x3D; main category; subcategory &#x3D; main &gt; sub; brand; condition; size; source &#x3D; where you acquired it; department; priceBand &#x3D; ask in &lt;$10, $10-25, $25-50, $50-100, $100-250, $250+; ageBand &#x3D; days live at sale or now (&lt;7, 7-30, 30-90, 90+). |
 **key** | **String**| The segment key from a segments row (URL-encoded). A key with no data in scope is a 404. |
 **range** | **String**| Reporting window. Default 30d. custom needs from and to. | [optional] [enum: 7d, 30d, 90d, 1y, ytd, all, custom]
 **from** | **String**| YYYY-MM-DD, inclusive, in tz. Only with range&#x3D;custom. | [optional]
 **to** | **String**| YYYY-MM-DD, inclusive, in tz. Only with range&#x3D;custom. | [optional]
 **compare** | **String**| Comparison window for deltas: prev (same length just before), yoy, none, custom (cmpFrom/cmpTo). | [optional] [enum: prev, yoy, none, custom]
 **cmpFrom** | **String**| YYYY-MM-DD. Only with compare&#x3D;custom. | [optional]
 **cmpTo** | **String**| YYYY-MM-DD. Only with compare&#x3D;custom. | [optional]
 **labels** | **String**| Comma-separated inventory labels (any of them). | [optional]
 **platforms** | **String**| Comma-separated platform ids. | [optional]
 **category** | **String**| Canonical main-category key. | [optional]
 **brand** | **String**| Brand name. | [optional]
 **tz** | **String**| IANA time zone for day boundaries. Default UTC. An invalid name is a 400. | [optional]

### Return type

**GetAnalyticSegmentByKeyResponse**

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

<a name="getAnalyticSummary"></a>
# **getAnalyticSummary**
> GetAnalyticSummaryResponse getAnalyticSummary(days, tz)

Headline KPIs for the last N days (the same numbers as the analytics overview).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
    Integer days = 30; // Integer | Calendar days back, today included. Larger values are clamped to 365.
    String tz = "tz_example"; // String | IANA time zone for day boundaries. Default UTC.
    try {
      GetAnalyticSummaryResponse result = apiInstance.getAnalyticSummary(days, tz);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApi#getAnalyticSummary");
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
 **days** | **Integer**| Calendar days back, today included. Larger values are clamped to 365. | [optional] [default to 30]
 **tz** | **String**| IANA time zone for day boundaries. Default UTC. | [optional]

### Return type

**GetAnalyticSummaryResponse**

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

<a name="getAnalyticTimesery"></a>
# **getAnalyticTimesery**
> GetAnalyticTimeseryResponse getAnalyticTimesery(days, tz)

Sales and net sales over the last N days, zero-filled, one row per calendar day.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
    Integer days = 30; // Integer | Calendar days back, today included. Larger values are clamped to 365.
    String tz = "tz_example"; // String | IANA time zone for day boundaries. Default UTC.
    try {
      GetAnalyticTimeseryResponse result = apiInstance.getAnalyticTimesery(days, tz);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApi#getAnalyticTimesery");
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
 **days** | **Integer**| Calendar days back, today included. Larger values are clamped to 365. | [optional] [default to 30]
 **tz** | **String**| IANA time zone for day boundaries. Default UTC. | [optional]

### Return type

**GetAnalyticTimeseryResponse**

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

<a name="getAnalyticToday"></a>
# **getAnalyticToday**
> GetAnalyticTodayResponse getAnalyticToday()

Today&#39;s checklist + 14-day activity streak.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
    try {
      GetAnalyticTodayResponse result = apiInstance.getAnalyticToday();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApi#getAnalyticToday");
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

**GetAnalyticTodayResponse**

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

<a name="listInsightByPlatform"></a>
# **listInsightByPlatform**
> ListInsightByPlatformResponse listInsightByPlatform(tz)

Platform velocity + margin insight (90-day window): units, net sales, median days to sell, ASP and net after the real marketplace fees.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
    String tz = "tz_example"; // String | IANA time zone for day boundaries. Default UTC.
    try {
      ListInsightByPlatformResponse result = apiInstance.listInsightByPlatform(tz);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApi#listInsightByPlatform");
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
 **tz** | **String**| IANA time zone for day boundaries. Default UTC. | [optional]

### Return type

**ListInsightByPlatformResponse**

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

<a name="updateAnalyticExperiment"></a>
# **updateAnalyticExperiment**
> AnalyticExperimentResponse updateAnalyticExperiment(id)

Rename an experiment or change its hypothesis, notes or planned end.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AnalyticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AnalyticsApi apiInstance = new AnalyticsApi(defaultClient);
    String id = "id_example"; // String | The experiment id (a uuid; any other id is a 404).
    try {
      AnalyticExperimentResponse result = apiInstance.updateAnalyticExperiment(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnalyticsApi#updateAnalyticExperiment");
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
 **id** | **String**| The experiment id (a uuid; any other id is a 404). |

### Return type

**AnalyticExperimentResponse**

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

