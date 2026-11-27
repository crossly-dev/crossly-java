# PayoutApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPayoutConnectOnboard**](PayoutApi.md#createPayoutConnectOnboard) | **POST** /v1/payout/connect/onboard | Start or resume payout-account onboarding; returns a Stripe-hosted URL.
[**createPayoutIdentityLink**](PayoutApi.md#createPayoutIdentityLink) | **POST** /v1/payouts/identity/link | Continue with Stripe: a one-time Stripe-hosted link that collects what Stripe needs.
[**createPayoutPayout**](PayoutApi.md#createPayoutPayout) | **POST** /v1/payout/payouts | Pay out now: instant (fee, minutes, to an eligible card/bank) or standard (free, manual schedule only).
[**getPayoutConnect**](PayoutApi.md#getPayoutConnect) | **GET** /v1/payout/connect | Your Stripe payout account: status, country, agreement and payout currency.
[**getPayoutEstimate**](PayoutApi.md#getPayoutEstimate) | **GET** /v1/payout/estimate | What one platform nets at a given price, after fees and shipping.
[**getPayoutGrossForNet**](PayoutApi.md#getPayoutGrossForNet) | **GET** /v1/payout/gross-for-net | The gross price needed to clear a target net on one platform.
[**getPayoutIdentity**](PayoutApi.md#getPayoutIdentity) | **GET** /v1/payouts/identity | Stripe&#39;s verification of your payout account: status and what Stripe still needs, in plain words.
[**getPayoutWallet**](PayoutApi.md#getPayoutWallet) | **GET** /v1/payout/wallet | Your payout wallet: balances, schedule, next payout, instant-payout quote, methods, payouts, transactions.
[**listPayoutCompare**](PayoutApi.md#listPayoutCompare) | **GET** /v1/payout/compare | Rank platforms by what they net at a given price. Defaults to connected ones.
[**updatePayoutSchedule**](PayoutApi.md#updatePayoutSchedule) | **PUT** /v1/payout/schedule | Change the automatic payout schedule.


<a name="createPayoutConnectOnboard"></a>
# **createPayoutConnectOnboard**
> CreatePayoutConnectOnboardResponse createPayoutConnectOnboard(createPayoutConnectOnboardRequest)

Start or resume payout-account onboarding; returns a Stripe-hosted URL.

country (ISO 3166-1 alpha-2) defaults to the storefront ship-from country, then US. Fixed once the account exists. Nothing is set up until a person completes the link.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.PayoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    PayoutApi apiInstance = new PayoutApi(defaultClient);
    CreatePayoutConnectOnboardRequest createPayoutConnectOnboardRequest = new CreatePayoutConnectOnboardRequest(); // CreatePayoutConnectOnboardRequest | 
    try {
      CreatePayoutConnectOnboardResponse result = apiInstance.createPayoutConnectOnboard(createPayoutConnectOnboardRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayoutApi#createPayoutConnectOnboard");
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
 **createPayoutConnectOnboardRequest** | **CreatePayoutConnectOnboardRequest**|  |

### Return type

**CreatePayoutConnectOnboardResponse**

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

<a name="createPayoutIdentityLink"></a>
# **createPayoutIdentityLink**
> CreatePayoutIdentityLinkResponse createPayoutIdentityLink(createPayoutConnectOnboardRequest)

Continue with Stripe: a one-time Stripe-hosted link that collects what Stripe needs.

Creates the payout account first when there is none (country: ISO alpha-2, default the ship-from country). type is account_onboarding (Stripe shows only what is outstanding) or account_update. The link expires in minutes; ask for a new one rather than storing it. Nothing changes until a person completes it.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.PayoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    PayoutApi apiInstance = new PayoutApi(defaultClient);
    CreatePayoutConnectOnboardRequest createPayoutConnectOnboardRequest = new CreatePayoutConnectOnboardRequest(); // CreatePayoutConnectOnboardRequest | 
    try {
      CreatePayoutIdentityLinkResponse result = apiInstance.createPayoutIdentityLink(createPayoutConnectOnboardRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayoutApi#createPayoutIdentityLink");
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
 **createPayoutConnectOnboardRequest** | **CreatePayoutConnectOnboardRequest**|  |

### Return type

**CreatePayoutIdentityLinkResponse**

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

<a name="createPayoutPayout"></a>
# **createPayoutPayout**
> CreatePayoutPayoutResponse createPayoutPayout(createPayoutPayoutRequest)

Pay out now: instant (fee, minutes, to an eligible card/bank) or standard (free, manual schedule only).

amountCents defaults to everything eligible. Pass idempotencyKey so a retry is the same payout. Returns { payout, feeCents }. 409 when the account cannot be paid or instant is unavailable.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.PayoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    PayoutApi apiInstance = new PayoutApi(defaultClient);
    CreatePayoutPayoutRequest createPayoutPayoutRequest = new CreatePayoutPayoutRequest(); // CreatePayoutPayoutRequest | 
    try {
      CreatePayoutPayoutResponse result = apiInstance.createPayoutPayout(createPayoutPayoutRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayoutApi#createPayoutPayout");
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
 **createPayoutPayoutRequest** | **CreatePayoutPayoutRequest**|  |

### Return type

**CreatePayoutPayoutResponse**

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

<a name="getPayoutConnect"></a>
# **getPayoutConnect**
> GetPayoutConnectResponse getPayoutConnect()

Your Stripe payout account: status, country, agreement and payout currency.

status is not_started (with defaultCountry), pending, active, restricted or payouts_unavailable. Only active can be paid; payouts_unavailable means Stripe offers no payout path to the account&#39;s country yet.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.PayoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    PayoutApi apiInstance = new PayoutApi(defaultClient);
    try {
      GetPayoutConnectResponse result = apiInstance.getPayoutConnect();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayoutApi#getPayoutConnect");
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

**GetPayoutConnectResponse**

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

<a name="getPayoutEstimate"></a>
# **getPayoutEstimate**
> GetPayoutEstimateResponse getPayoutEstimate()

What one platform nets at a given price, after fees and shipping.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.PayoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    PayoutApi apiInstance = new PayoutApi(defaultClient);
    try {
      GetPayoutEstimateResponse result = apiInstance.getPayoutEstimate();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayoutApi#getPayoutEstimate");
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

**GetPayoutEstimateResponse**

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

<a name="getPayoutGrossForNet"></a>
# **getPayoutGrossForNet**
> GetPayoutGrossForNetResponse getPayoutGrossForNet()

The gross price needed to clear a target net on one platform.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.PayoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    PayoutApi apiInstance = new PayoutApi(defaultClient);
    try {
      GetPayoutGrossForNetResponse result = apiInstance.getPayoutGrossForNet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayoutApi#getPayoutGrossForNet");
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

**GetPayoutGrossForNetResponse**

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

<a name="getPayoutIdentity"></a>
# **getPayoutIdentity**
> GetPayoutIdentityResponse getPayoutIdentity(fresh)

Stripe&#39;s verification of your payout account: status and what Stripe still needs, in plain words.

status is not_started, pending (Stripe is checking), action_required (dueNow lists what to add), verified (payouts on) or restricted (disabledReasonText says why). dueNow / dueLater / inReview are Stripe&#39;s requirement keys as plain-words lines ({ keys, label }); errors carry Stripe&#39;s reason. Cached up to 60 s; fresh&#x3D;1 re-reads Stripe. Payouts are gated on payoutsEnabled only.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.PayoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    PayoutApi apiInstance = new PayoutApi(defaultClient);
    String fresh = "0"; // String | 
    try {
      GetPayoutIdentityResponse result = apiInstance.getPayoutIdentity(fresh);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayoutApi#getPayoutIdentity");
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
 **fresh** | **String**|  | [optional] [enum: 0, 1]

### Return type

**GetPayoutIdentityResponse**

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

<a name="getPayoutWallet"></a>
# **getPayoutWallet**
> GetPayoutWalletResponse getPayoutWallet()

Your payout wallet: balances, schedule, next payout, instant-payout quote, methods, payouts, transactions.

connected:false (with defaultCountry) before onboarding. balance has availableCents, pendingCents and instantAvailableCents in the account currency. instant.available says whether an instant payout can be made now, with feeCents/netCents for the full instant-available amount and reason when not.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.PayoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    PayoutApi apiInstance = new PayoutApi(defaultClient);
    try {
      GetPayoutWalletResponse result = apiInstance.getPayoutWallet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayoutApi#getPayoutWallet");
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

**GetPayoutWalletResponse**

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

<a name="listPayoutCompare"></a>
# **listPayoutCompare**
> ListPayoutCompareResponse listPayoutCompare()

Rank platforms by what they net at a given price. Defaults to connected ones.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.PayoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    PayoutApi apiInstance = new PayoutApi(defaultClient);
    try {
      ListPayoutCompareResponse result = apiInstance.listPayoutCompare();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayoutApi#listPayoutCompare");
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

**ListPayoutCompareResponse**

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

<a name="updatePayoutSchedule"></a>
# **updatePayoutSchedule**
> UpdatePayoutScheduleResponse updatePayoutSchedule(updatePayoutScheduleRequest)

Change the automatic payout schedule.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.PayoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    PayoutApi apiInstance = new PayoutApi(defaultClient);
    UpdatePayoutScheduleRequest updatePayoutScheduleRequest = new UpdatePayoutScheduleRequest(); // UpdatePayoutScheduleRequest | 
    try {
      UpdatePayoutScheduleResponse result = apiInstance.updatePayoutSchedule(updatePayoutScheduleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PayoutApi#updatePayoutSchedule");
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
 **updatePayoutScheduleRequest** | **UpdatePayoutScheduleRequest**|  |

### Return type

**UpdatePayoutScheduleResponse**

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

