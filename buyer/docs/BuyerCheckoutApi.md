# BuyerCheckoutApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBuyerCheckout**](BuyerCheckoutApi.md#createBuyerCheckout) | **POST** /v1/buyer/checkout | Buy a listing without being present.
[**getBuyerCheckoutControl**](BuyerCheckoutApi.md#getBuyerCheckoutControl) | **GET** /v1/buyer/checkout/controls | What this key is allowed to spend.
[**updateBuyerCheckoutControl**](BuyerCheckoutApi.md#updateBuyerCheckoutControl) | **PUT** /v1/buyer/checkout/controls | Switch this key on for spending, and set its limits.


<a name="createBuyerCheckout"></a>
# **createBuyerCheckout**
> CreateBuyerCheckoutResponse createBuyerCheckout()

Buy a listing without being present.

An Idempotency-Key header is REQUIRED — this endpoint refuses without one, because a retried request would otherwise buy the item twice and a retry is the most likely thing an automated buyer does. Derive the key from what you are buying and reuse it across retries; a fresh random value per attempt satisfies the check and keeps the bug. The item is QUOTED first and the delivered total is checked against both your maxTotalCents and this key&#39;s limits before anything is charged. A card that demands 3-D Secure cannot be charged unattended; that answers 402 with &#x60;authentication_required&#x60; and the purchase must be finished on Crossly.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import org.openapitools.client.api.BuyerCheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerCheckoutApi apiInstance = new BuyerCheckoutApi(defaultClient);
    try {
      CreateBuyerCheckoutResponse result = apiInstance.createBuyerCheckout();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerCheckoutApi#createBuyerCheckout");
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

[**CreateBuyerCheckoutResponse**](CreateBuyerCheckoutResponse.md)

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerCheckoutControl"></a>
# **getBuyerCheckoutControl**
> GetBuyerCheckoutControlResponse getBuyerCheckoutControl()

What this key is allowed to spend.

Reports the controls for the key making the call — not for your account. Every key has its own switch and its own limits.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import org.openapitools.client.api.BuyerCheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerCheckoutApi apiInstance = new BuyerCheckoutApi(defaultClient);
    try {
      GetBuyerCheckoutControlResponse result = apiInstance.getBuyerCheckoutControl();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerCheckoutApi#getBuyerCheckoutControl");
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

[**GetBuyerCheckoutControlResponse**](GetBuyerCheckoutControlResponse.md)

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="updateBuyerCheckoutControl"></a>
# **updateBuyerCheckoutControl**
> UpdateBuyerCheckoutControlResponse updateBuyerCheckoutControl()

Switch this key on for spending, and set its limits.

A key can only ever raise or lower ITS OWN limits, and only if the token already carries buyer:checkout:write. Turning it off takes effect immediately.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import org.openapitools.client.api.BuyerCheckoutApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerCheckoutApi apiInstance = new BuyerCheckoutApi(defaultClient);
    try {
      UpdateBuyerCheckoutControlResponse result = apiInstance.updateBuyerCheckoutControl();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerCheckoutApi#updateBuyerCheckoutControl");
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

[**UpdateBuyerCheckoutControlResponse**](UpdateBuyerCheckoutControlResponse.md)

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

