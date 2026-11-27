# BillingApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBillingUpgrade**](BillingApi.md#createBillingUpgrade) | **POST** /v1/billing/upgrade | Start an upgrade to a higher plan.
[**listBillingAppAllowances**](BillingApi.md#listBillingAppAllowances) | **GET** /v1/billing/app-allowances | Your listing allowances through OAuth apps (used of limit, per app, with its platform scope).
[**listBillingPlans**](BillingApi.md#listBillingPlans) | **GET** /v1/billing/plans | List the plans with their prices, limits and features.


<a name="createBillingUpgrade"></a>
# **createBillingUpgrade**
> CreateBillingUpgradeResponse createBillingUpgrade(createBillingUpgradeRequest)

Start an upgrade to a higher plan.

Returns a Stripe Checkout URL. Nothing is charged by this call — a person completes the payment. Downgrades and cancellation are not available to a token at all; they stay with the account owner.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.BillingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    BillingApi apiInstance = new BillingApi(defaultClient);
    CreateBillingUpgradeRequest createBillingUpgradeRequest = new CreateBillingUpgradeRequest(); // CreateBillingUpgradeRequest | 
    try {
      CreateBillingUpgradeResponse result = apiInstance.createBillingUpgrade(createBillingUpgradeRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingApi#createBillingUpgrade");
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
 **createBillingUpgradeRequest** | **CreateBillingUpgradeRequest**|  |

### Return type

**CreateBillingUpgradeResponse**

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

<a name="listBillingAppAllowances"></a>
# **listBillingAppAllowances**
> ListBillingAppAllowancesResponse listBillingAppAllowances()

Your listing allowances through OAuth apps (used of limit, per app, with its platform scope).

Staff can let an OAuth app list above a seller&#39;s plan, counted apart from the plan&#39;s itemsPerMonth and only on the allowance&#39;s platforms. &#x60;label&#x60; is the sentence to show (12 of 10,000 managed by Infinity; ... this month via Infinity (resets Dec 1); or counts toward your plan for limitMode shared).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.BillingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    BillingApi apiInstance = new BillingApi(defaultClient);
    try {
      ListBillingAppAllowancesResponse result = apiInstance.listBillingAppAllowances();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingApi#listBillingAppAllowances");
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

**ListBillingAppAllowancesResponse**

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

<a name="listBillingPlans"></a>
# **listBillingPlans**
> ListBillingPlansResponse listBillingPlans()

List the plans with their prices, limits and features.

Prices are the Stripe Prices checkout charges (whole USD). A null limit means no cap.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.BillingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    BillingApi apiInstance = new BillingApi(defaultClient);
    try {
      ListBillingPlansResponse result = apiInstance.listBillingPlans();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BillingApi#listBillingPlans");
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

**ListBillingPlansResponse**

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

