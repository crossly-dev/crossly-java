# WorldsMoneyApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorldEarningPayoutAccountOnboard**](WorldsMoneyApi.md#createWorldEarningPayoutAccountOnboard) | **POST** /v1/worlds/earnings/payout-account/onboard | Start or resume Stripe onboarding for your creator payout account. Returns a one-time Stripe URL. Body: { country? } (fixed once the account exists).
[**createWorldExperienceDropTable**](WorldsMoneyApi.md#createWorldExperienceDropTable) | **POST** /v1/worlds/experiences/{experienceId}/drop-tables | Declare a drop table for a paid random item: cosmetic or in-experience outcomes only. Crossly pre-simulates and hashes it.
[**createWorldExperienceProduct**](WorldsMoneyApi.md#createWorldExperienceProduct) | **POST** /v1/worlds/experiences/{experienceId}/products | Create a product: price 50-100,000 cents (a private server may be free), optional per-country prices. Paid random items need an approved drop table and are never tradeable.
[**createWorldExperienceProductArchive**](WorldsMoneyApi.md#createWorldExperienceProductArchive) | **POST** /v1/worlds/experiences/{experienceId}/products/{productId}/archive | Take a product off sale for good. Owned passes and running subscriptions keep working.
[**createWorldExperiencePurchase**](WorldsMoneyApi.md#createWorldExperiencePurchase) | **POST** /v1/worlds/experiences/{experienceId}/purchases | Open a purchase sheet for a product (paid access, a pass…). Returns checkoutPath: the player pays only in the Crossly checkout.
[**createWorldExperienceReceiptAck**](WorldsMoneyApi.md#createWorldExperienceReceiptAck) | **POST** /v1/worlds/experiences/{experienceId}/receipts/{orderId}/ack | Acknowledge a grant your back-end made off-server. Idempotent: a second ack reports duplicate.
[**createWorldMeReceiptRefund**](WorldsMoneyApi.md#createWorldMeReceiptRefund) | **POST** /v1/worlds/me/receipts/{receiptId}/refund | Refund a developer product bought by mistake: within the self-refund window and before the experience granted it.
[**createWorldMeSubscriptionCancel**](WorldsMoneyApi.md#createWorldMeSubscriptionCancel) | **POST** /v1/worlds/me/subscriptions/{id}/cancel | Cancel: no more charges; the benefit lasts to the end of the paid month.
[**createWorldMeSubscriptionPrivateServerCode**](WorldsMoneyApi.md#createWorldMeSubscriptionPrivateServerCode) | **POST** /v1/worlds/me/subscriptions/{id}/private-server-code | A fresh access code for your private server (the previous one stops working). Join with reservedCode.
[**createWorldPurchaseCancel**](WorldsMoneyApi.md#createWorldPurchaseCancel) | **POST** /v1/worlds/purchases/{intentId}/cancel | Cancel an unpaid purchase sheet.
[**getWorldEarning**](WorldsMoneyApi.md#getWorldEarning) | **GET** /v1/worlds/earnings | Your Crossly Carnival earnings: pending, available, held, paid; next payout; what cashing out still needs.
[**getWorldEarningPayoutAccount**](WorldsMoneyApi.md#getWorldEarningPayoutAccount) | **GET** /v1/worlds/earnings/payout-account | Your creator payout account (your own, separate from any store payout account): not_started, pending, restricted, active or payouts_unavailable.
[**getWorldEconomy**](WorldsMoneyApi.md#getWorldEconomy) | **GET** /v1/worlds/economy | The published payout formula: splits, thresholds, scheduled changes (90-day notice) and guarantees.
[**getWorldExperienceRevenue**](WorldsMoneyApi.md#getWorldExperienceRevenue) | **GET** /v1/worlds/experiences/{experienceId}/revenue | Gross, tax, refunds, chargebacks, net and your share per product, plus pending / available / paid.
[**getWorldExperienceStore**](WorldsMoneyApi.md#getWorldExperienceStore) | **GET** /v1/worlds/experiences/{experienceId}/store | An experience&#39;s store as you see it: your regional price, odds for paid random items, what you own.
[**getWorldPurchase**](WorldsMoneyApi.md#getWorldPurchase) | **GET** /v1/worlds/purchases/{intentId} | A purchase sheet: item, price, tax, total, odds, status.
[**listWorldEarningAffiliate**](WorldsMoneyApi.md#listWorldEarningAffiliate) | **GET** /v1/worlds/earnings/affiliate | Real-goods orders attributed to your games: the fee, your 20% share, and whether it is posted.
[**listWorldEarningLedger**](WorldsMoneyApi.md#listWorldEarningLedger) | **GET** /v1/worlds/earnings/ledger | Your creator ledger, newest first: every earning and reversal. Cursor-paged.
[**listWorldEarningPayouts**](WorldsMoneyApi.md#listWorldEarningPayouts) | **GET** /v1/worlds/earnings/payouts | Your monthly Crossly Carnival payouts.
[**listWorldExperienceDropTables**](WorldsMoneyApi.md#listWorldExperienceDropTables) | **GET** /v1/worlds/experiences/{experienceId}/drop-tables | Declared drop tables with their odds, simulation (10^6 draws) and hash.
[**listWorldExperienceProducts**](WorldsMoneyApi.md#listWorldExperienceProducts) | **GET** /v1/worlds/experiences/{experienceId}/products | What an experience sells: passes, developer products, subscriptions, private servers, paid access (?includeArchived&#x3D;true).
[**listWorldExperienceReceipts**](WorldsMoneyApi.md#listWorldExperienceReceipts) | **GET** /v1/worlds/experiences/{experienceId}/receipts | Every purchase: orderId, sub, product, price, net, state (paid/delivered/granted/refunded/revoked). Cursor-paged; ?since&#x3D;.
[**listWorldMeSubscriptions**](WorldsMoneyApi.md#listWorldMeSubscriptions) | **GET** /v1/worlds/me/subscriptions | Your experience subscriptions and private servers.
[**updateWorldExperienceProduct**](WorldsMoneyApi.md#updateWorldExperienceProduct) | **PATCH** /v1/worlds/experiences/{experienceId}/products/{productId} | Edit a product: name, description, icon, price, regional prices, hourly limit, on/off sale. Kind and place never change.


<a name="createWorldEarningPayoutAccountOnboard"></a>
# **createWorldEarningPayoutAccountOnboard**
> CreateWorldEarningPayoutAccountOnboardResponse createWorldEarningPayoutAccountOnboard()

Start or resume Stripe onboarding for your creator payout account. Returns a one-time Stripe URL. Body: { country? } (fixed once the account exists).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsMoneyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsMoneyApi apiInstance = new WorldsMoneyApi(defaultClient);
    try {
      CreateWorldEarningPayoutAccountOnboardResponse result = apiInstance.createWorldEarningPayoutAccountOnboard();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsMoneyApi#createWorldEarningPayoutAccountOnboard");
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

**CreateWorldEarningPayoutAccountOnboardResponse**

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

<a name="createWorldExperienceDropTable"></a>
# **createWorldExperienceDropTable**
> CreateWorldExperienceDropTableResponse createWorldExperienceDropTable(experienceId)

Declare a drop table for a paid random item: cosmetic or in-experience outcomes only. Crossly pre-simulates and hashes it.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsMoneyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsMoneyApi apiInstance = new WorldsMoneyApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      CreateWorldExperienceDropTableResponse result = apiInstance.createWorldExperienceDropTable(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsMoneyApi#createWorldExperienceDropTable");
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
 **experienceId** | **String**|  |

### Return type

**CreateWorldExperienceDropTableResponse**

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

<a name="createWorldExperienceProduct"></a>
# **createWorldExperienceProduct**
> WorldExperienceProductResponse createWorldExperienceProduct(experienceId)

Create a product: price 50-100,000 cents (a private server may be free), optional per-country prices. Paid random items need an approved drop table and are never tradeable.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsMoneyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsMoneyApi apiInstance = new WorldsMoneyApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      WorldExperienceProductResponse result = apiInstance.createWorldExperienceProduct(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsMoneyApi#createWorldExperienceProduct");
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
 **experienceId** | **String**|  |

### Return type

**WorldExperienceProductResponse**

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

<a name="createWorldExperienceProductArchive"></a>
# **createWorldExperienceProductArchive**
> WorldExperienceProductResponse createWorldExperienceProductArchive(experienceId, productId)

Take a product off sale for good. Owned passes and running subscriptions keep working.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsMoneyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsMoneyApi apiInstance = new WorldsMoneyApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String productId = "productId_example"; // String | 
    try {
      WorldExperienceProductResponse result = apiInstance.createWorldExperienceProductArchive(experienceId, productId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsMoneyApi#createWorldExperienceProductArchive");
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
 **experienceId** | **String**|  |
 **productId** | **String**|  |

### Return type

**WorldExperienceProductResponse**

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

<a name="createWorldExperiencePurchase"></a>
# **createWorldExperiencePurchase**
> CreateWorldExperiencePurchaseResponse createWorldExperiencePurchase(experienceId)

Open a purchase sheet for a product (paid access, a pass…). Returns checkoutPath: the player pays only in the Crossly checkout.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsMoneyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsMoneyApi apiInstance = new WorldsMoneyApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      CreateWorldExperiencePurchaseResponse result = apiInstance.createWorldExperiencePurchase(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsMoneyApi#createWorldExperiencePurchase");
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
 **experienceId** | **String**|  |

### Return type

**CreateWorldExperiencePurchaseResponse**

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

<a name="createWorldExperienceReceiptAck"></a>
# **createWorldExperienceReceiptAck**
> CreateWorldExperienceReceiptAckResponse createWorldExperienceReceiptAck(experienceId, orderId)

Acknowledge a grant your back-end made off-server. Idempotent: a second ack reports duplicate.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsMoneyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsMoneyApi apiInstance = new WorldsMoneyApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String orderId = "orderId_example"; // String | 
    try {
      CreateWorldExperienceReceiptAckResponse result = apiInstance.createWorldExperienceReceiptAck(experienceId, orderId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsMoneyApi#createWorldExperienceReceiptAck");
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
 **experienceId** | **String**|  |
 **orderId** | **String**|  |

### Return type

**CreateWorldExperienceReceiptAckResponse**

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

<a name="createWorldMeReceiptRefund"></a>
# **createWorldMeReceiptRefund**
> CreateWorldMeReceiptRefundResponse createWorldMeReceiptRefund(receiptId)

Refund a developer product bought by mistake: within the self-refund window and before the experience granted it.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsMoneyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsMoneyApi apiInstance = new WorldsMoneyApi(defaultClient);
    String receiptId = "receiptId_example"; // String | 
    try {
      CreateWorldMeReceiptRefundResponse result = apiInstance.createWorldMeReceiptRefund(receiptId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsMoneyApi#createWorldMeReceiptRefund");
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
 **receiptId** | **String**|  |

### Return type

**CreateWorldMeReceiptRefundResponse**

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

<a name="createWorldMeSubscriptionCancel"></a>
# **createWorldMeSubscriptionCancel**
> CreateWorldMeSubscriptionCancelResponse createWorldMeSubscriptionCancel(id)

Cancel: no more charges; the benefit lasts to the end of the paid month.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsMoneyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsMoneyApi apiInstance = new WorldsMoneyApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateWorldMeSubscriptionCancelResponse result = apiInstance.createWorldMeSubscriptionCancel(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsMoneyApi#createWorldMeSubscriptionCancel");
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
 **id** | **String**|  |

### Return type

**CreateWorldMeSubscriptionCancelResponse**

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

<a name="createWorldMeSubscriptionPrivateServerCode"></a>
# **createWorldMeSubscriptionPrivateServerCode**
> CreateWorldMeSubscriptionPrivateServerCodeResponse createWorldMeSubscriptionPrivateServerCode(id)

A fresh access code for your private server (the previous one stops working). Join with reservedCode.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsMoneyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsMoneyApi apiInstance = new WorldsMoneyApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateWorldMeSubscriptionPrivateServerCodeResponse result = apiInstance.createWorldMeSubscriptionPrivateServerCode(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsMoneyApi#createWorldMeSubscriptionPrivateServerCode");
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
 **id** | **String**|  |

### Return type

**CreateWorldMeSubscriptionPrivateServerCodeResponse**

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

<a name="createWorldPurchaseCancel"></a>
# **createWorldPurchaseCancel**
> CreateWorldSpaceJoinResponse createWorldPurchaseCancel(intentId)

Cancel an unpaid purchase sheet.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsMoneyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsMoneyApi apiInstance = new WorldsMoneyApi(defaultClient);
    String intentId = "intentId_example"; // String | 
    try {
      CreateWorldSpaceJoinResponse result = apiInstance.createWorldPurchaseCancel(intentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsMoneyApi#createWorldPurchaseCancel");
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
 **intentId** | **String**|  |

### Return type

**CreateWorldSpaceJoinResponse**

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

<a name="getWorldEarning"></a>
# **getWorldEarning**
> GetWorldEarningResponse getWorldEarning()

Your Crossly Carnival earnings: pending, available, held, paid; next payout; what cashing out still needs.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsMoneyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsMoneyApi apiInstance = new WorldsMoneyApi(defaultClient);
    try {
      GetWorldEarningResponse result = apiInstance.getWorldEarning();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsMoneyApi#getWorldEarning");
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

**GetWorldEarningResponse**

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

<a name="getWorldEarningPayoutAccount"></a>
# **getWorldEarningPayoutAccount**
> GetWorldEarningPayoutAccountResponse getWorldEarningPayoutAccount()

Your creator payout account (your own, separate from any store payout account): not_started, pending, restricted, active or payouts_unavailable.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsMoneyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsMoneyApi apiInstance = new WorldsMoneyApi(defaultClient);
    try {
      GetWorldEarningPayoutAccountResponse result = apiInstance.getWorldEarningPayoutAccount();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsMoneyApi#getWorldEarningPayoutAccount");
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

**GetWorldEarningPayoutAccountResponse**

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

<a name="getWorldEconomy"></a>
# **getWorldEconomy**
> GetWorldEconomyResponse getWorldEconomy()

The published payout formula: splits, thresholds, scheduled changes (90-day notice) and guarantees.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsMoneyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsMoneyApi apiInstance = new WorldsMoneyApi(defaultClient);
    try {
      GetWorldEconomyResponse result = apiInstance.getWorldEconomy();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsMoneyApi#getWorldEconomy");
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

**GetWorldEconomyResponse**

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

<a name="getWorldExperienceRevenue"></a>
# **getWorldExperienceRevenue**
> GetWorldExperienceRevenueResponse getWorldExperienceRevenue(experienceId)

Gross, tax, refunds, chargebacks, net and your share per product, plus pending / available / paid.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsMoneyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsMoneyApi apiInstance = new WorldsMoneyApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      GetWorldExperienceRevenueResponse result = apiInstance.getWorldExperienceRevenue(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsMoneyApi#getWorldExperienceRevenue");
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
 **experienceId** | **String**|  |

### Return type

**GetWorldExperienceRevenueResponse**

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

<a name="getWorldExperienceStore"></a>
# **getWorldExperienceStore**
> GetWorldExperienceStoreResponse getWorldExperienceStore(experienceId)

An experience&#39;s store as you see it: your regional price, odds for paid random items, what you own.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsMoneyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsMoneyApi apiInstance = new WorldsMoneyApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      GetWorldExperienceStoreResponse result = apiInstance.getWorldExperienceStore(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsMoneyApi#getWorldExperienceStore");
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
 **experienceId** | **String**|  |

### Return type

**GetWorldExperienceStoreResponse**

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

<a name="getWorldPurchase"></a>
# **getWorldPurchase**
> GetWorldPurchaseResponse getWorldPurchase(intentId)

A purchase sheet: item, price, tax, total, odds, status.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsMoneyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsMoneyApi apiInstance = new WorldsMoneyApi(defaultClient);
    String intentId = "intentId_example"; // String | 
    try {
      GetWorldPurchaseResponse result = apiInstance.getWorldPurchase(intentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsMoneyApi#getWorldPurchase");
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
 **intentId** | **String**|  |

### Return type

**GetWorldPurchaseResponse**

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

<a name="listWorldEarningAffiliate"></a>
# **listWorldEarningAffiliate**
> ListWorldEarningAffiliateResponse listWorldEarningAffiliate()

Real-goods orders attributed to your games: the fee, your 20% share, and whether it is posted.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsMoneyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsMoneyApi apiInstance = new WorldsMoneyApi(defaultClient);
    try {
      ListWorldEarningAffiliateResponse result = apiInstance.listWorldEarningAffiliate();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsMoneyApi#listWorldEarningAffiliate");
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

**ListWorldEarningAffiliateResponse**

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

<a name="listWorldEarningLedger"></a>
# **listWorldEarningLedger**
> ListWorldEarningLedgerResponse listWorldEarningLedger()

Your creator ledger, newest first: every earning and reversal. Cursor-paged.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsMoneyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsMoneyApi apiInstance = new WorldsMoneyApi(defaultClient);
    try {
      ListWorldEarningLedgerResponse result = apiInstance.listWorldEarningLedger();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsMoneyApi#listWorldEarningLedger");
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

**ListWorldEarningLedgerResponse**

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

<a name="listWorldEarningPayouts"></a>
# **listWorldEarningPayouts**
> ListWorldEarningPayoutsResponse listWorldEarningPayouts()

Your monthly Crossly Carnival payouts.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsMoneyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsMoneyApi apiInstance = new WorldsMoneyApi(defaultClient);
    try {
      ListWorldEarningPayoutsResponse result = apiInstance.listWorldEarningPayouts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsMoneyApi#listWorldEarningPayouts");
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

**ListWorldEarningPayoutsResponse**

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

<a name="listWorldExperienceDropTables"></a>
# **listWorldExperienceDropTables**
> ListWorldExperienceDropTablesResponse listWorldExperienceDropTables(experienceId)

Declared drop tables with their odds, simulation (10^6 draws) and hash.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsMoneyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsMoneyApi apiInstance = new WorldsMoneyApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      ListWorldExperienceDropTablesResponse result = apiInstance.listWorldExperienceDropTables(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsMoneyApi#listWorldExperienceDropTables");
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
 **experienceId** | **String**|  |

### Return type

**ListWorldExperienceDropTablesResponse**

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

<a name="listWorldExperienceProducts"></a>
# **listWorldExperienceProducts**
> ListWorldExperienceProductsResponse listWorldExperienceProducts(experienceId)

What an experience sells: passes, developer products, subscriptions, private servers, paid access (?includeArchived&#x3D;true).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsMoneyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsMoneyApi apiInstance = new WorldsMoneyApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      ListWorldExperienceProductsResponse result = apiInstance.listWorldExperienceProducts(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsMoneyApi#listWorldExperienceProducts");
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
 **experienceId** | **String**|  |

### Return type

**ListWorldExperienceProductsResponse**

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

<a name="listWorldExperienceReceipts"></a>
# **listWorldExperienceReceipts**
> ListWorldExperienceReceiptsResponse listWorldExperienceReceipts(experienceId)

Every purchase: orderId, sub, product, price, net, state (paid/delivered/granted/refunded/revoked). Cursor-paged; ?since&#x3D;.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsMoneyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsMoneyApi apiInstance = new WorldsMoneyApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      ListWorldExperienceReceiptsResponse result = apiInstance.listWorldExperienceReceipts(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsMoneyApi#listWorldExperienceReceipts");
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
 **experienceId** | **String**|  |

### Return type

**ListWorldExperienceReceiptsResponse**

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

<a name="listWorldMeSubscriptions"></a>
# **listWorldMeSubscriptions**
> ListWorldMeSubscriptionsResponse listWorldMeSubscriptions()

Your experience subscriptions and private servers.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsMoneyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsMoneyApi apiInstance = new WorldsMoneyApi(defaultClient);
    try {
      ListWorldMeSubscriptionsResponse result = apiInstance.listWorldMeSubscriptions();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsMoneyApi#listWorldMeSubscriptions");
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

**ListWorldMeSubscriptionsResponse**

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

<a name="updateWorldExperienceProduct"></a>
# **updateWorldExperienceProduct**
> WorldExperienceProductResponse updateWorldExperienceProduct(experienceId, productId)

Edit a product: name, description, icon, price, regional prices, hourly limit, on/off sale. Kind and place never change.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsMoneyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsMoneyApi apiInstance = new WorldsMoneyApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String productId = "productId_example"; // String | 
    try {
      WorldExperienceProductResponse result = apiInstance.updateWorldExperienceProduct(experienceId, productId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsMoneyApi#updateWorldExperienceProduct");
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
 **experienceId** | **String**|  |
 **productId** | **String**|  |

### Return type

**WorldExperienceProductResponse**

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

