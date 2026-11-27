# CreatorRewardsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCreatorRewardFormula**](CreatorRewardsApi.md#getCreatorRewardFormula) | **GET** /v1/creator-rewards/formula | The Creator Rewards formula: the pool&#39;s share of Crossly&#39;s Crossly Carnival take in force, the counting rules, and any scheduled change (announced at least 90 days ahead).
[**getCreatorRewardMe**](CreatorRewardsApi.md#getCreatorRewardMe) | **GET** /v1/creator-rewards/me/{month} | One month of your Creator Rewards (YYYY-MM).
[**getPublicCreatorRewardReconciliation**](CreatorRewardsApi.md#getPublicCreatorRewardReconciliation) | **GET** /v1/public/creator-rewards/reconciliation | Public monthly reconciliation of Creator Rewards (no auth): per month the pool funded from Crossly&#39;s take, carried in, distributed, paid (from the ledger), carried over, the formula version and weights, eligible experiences and every check; plus the formula in force and scheduled changes (90-day notice).
[**listCreatorRewardMe**](CreatorRewardsApi.md#listCreatorRewardMe) | **GET** /v1/creator-rewards/me | Your Creator Rewards: each month, each experience you own or are paid for (counted minutes and players, exclusions, its amount, your part).
[**listCreatorRewardMonths**](CreatorRewardsApi.md#listCreatorRewardMonths) | **GET** /v1/creator-rewards/months | Every calculated month: Crossly&#39;s take, the funded share, the pool, what was distributed and carried, counted minutes and exclusions by reason.


<a name="getCreatorRewardFormula"></a>
# **getCreatorRewardFormula**
> GetCreatorRewardFormulaResponse getCreatorRewardFormula()

The Creator Rewards formula: the pool&#39;s share of Crossly&#39;s Crossly Carnival take in force, the counting rules, and any scheduled change (announced at least 90 days ahead).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorRewardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorRewardsApi apiInstance = new CreatorRewardsApi(defaultClient);
    try {
      GetCreatorRewardFormulaResponse result = apiInstance.getCreatorRewardFormula();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorRewardsApi#getCreatorRewardFormula");
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

**GetCreatorRewardFormulaResponse**

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

<a name="getCreatorRewardMe"></a>
# **getCreatorRewardMe**
> GetCreatorRewardMeResponse getCreatorRewardMe(month)

One month of your Creator Rewards (YYYY-MM).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorRewardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorRewardsApi apiInstance = new CreatorRewardsApi(defaultClient);
    String month = "month_example"; // String | 
    try {
      GetCreatorRewardMeResponse result = apiInstance.getCreatorRewardMe(month);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorRewardsApi#getCreatorRewardMe");
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
 **month** | **String**|  |

### Return type

**GetCreatorRewardMeResponse**

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

<a name="getPublicCreatorRewardReconciliation"></a>
# **getPublicCreatorRewardReconciliation**
> GetPublicCreatorRewardReconciliationResponse getPublicCreatorRewardReconciliation(limit)

Public monthly reconciliation of Creator Rewards (no auth): per month the pool funded from Crossly&#39;s take, carried in, distributed, paid (from the ledger), carried over, the formula version and weights, eligible experiences and every check; plus the formula in force and scheduled changes (90-day notice).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.models.*;
import net.crossly.api.CreatorRewardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");

    CreatorRewardsApi apiInstance = new CreatorRewardsApi(defaultClient);
    Integer limit = 56; // Integer | Months to return, newest first (default 24).
    try {
      GetPublicCreatorRewardReconciliationResponse result = apiInstance.getPublicCreatorRewardReconciliation(limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorRewardsApi#getPublicCreatorRewardReconciliation");
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
 **limit** | **Integer**| Months to return, newest first (default 24). | [optional]

### Return type

**GetPublicCreatorRewardReconciliationResponse**

### Authorization

No authorization required

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

<a name="listCreatorRewardMe"></a>
# **listCreatorRewardMe**
> ListCreatorRewardMeResponse listCreatorRewardMe()

Your Creator Rewards: each month, each experience you own or are paid for (counted minutes and players, exclusions, its amount, your part).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorRewardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorRewardsApi apiInstance = new CreatorRewardsApi(defaultClient);
    try {
      ListCreatorRewardMeResponse result = apiInstance.listCreatorRewardMe();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorRewardsApi#listCreatorRewardMe");
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

**ListCreatorRewardMeResponse**

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

<a name="listCreatorRewardMonths"></a>
# **listCreatorRewardMonths**
> ListCreatorRewardMonthsResponse listCreatorRewardMonths()

Every calculated month: Crossly&#39;s take, the funded share, the pool, what was distributed and carried, counted minutes and exclusions by reason.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CreatorRewardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CreatorRewardsApi apiInstance = new CreatorRewardsApi(defaultClient);
    try {
      ListCreatorRewardMonthsResponse result = apiInstance.listCreatorRewardMonths();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreatorRewardsApi#listCreatorRewardMonths");
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

**ListCreatorRewardMonthsResponse**

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

