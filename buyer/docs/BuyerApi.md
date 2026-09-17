# BuyerApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBuyerActivity**](BuyerApi.md#createBuyerActivity) | **POST** /v1/buyer/activity | Report an item your user is looking at, and get our answer.
[**createBuyerCartItem**](BuyerApi.md#createBuyerCartItem) | **POST** /v1/buyer/cart/items | Add a listing to your cart.
[**createBuyerCartQuote**](BuyerApi.md#createBuyerCartQuote) | **POST** /v1/buyer/cart/quote | Price the cart, delivered — item, shipping, tax, total.
[**createBuyerOffer**](BuyerApi.md#createBuyerOffer) | **POST** /v1/buyer/offers | Offer a price on a listing.
[**createBuyerWishlist**](BuyerApi.md#createBuyerWishlist) | **POST** /v1/buyer/wishlists | Create a wishlist.
[**createBuyerWishlistItem**](BuyerApi.md#createBuyerWishlistItem) | **POST** /v1/buyer/wishlists/{id}/items | Add a listing to a wishlist.
[**deleteBuyerCartItem**](BuyerApi.md#deleteBuyerCartItem) | **DELETE** /v1/buyer/cart/items/{id} | Remove a line from your cart.
[**getBuyerPreference**](BuyerApi.md#getBuyerPreference) | **GET** /v1/buyer/preferences | The shopping profile derived from that activity.
[**getBuyerProfile**](BuyerApi.md#getBuyerProfile) | **GET** /v1/buyer/profile | Your Crossly shopping profile — name, email, saved address, Bucks balance.
[**listBuyerActivity**](BuyerApi.md#listBuyerActivity) | **GET** /v1/buyer/activity | What this buyer has compared lately.
[**listBuyerCart**](BuyerApi.md#listBuyerCart) | **GET** /v1/buyer/cart | What is in your Crossly cart.
[**listBuyerCashback**](BuyerApi.md#listBuyerCashback) | **GET** /v1/buyer/cashback | Your Scout cashback — pending, confirmed, paid.
[**listBuyerOrders**](BuyerApi.md#listBuyerOrders) | **GET** /v1/buyer/orders | What you have bought on Crossly, newest first.
[**listBuyerWishlistItems**](BuyerApi.md#listBuyerWishlistItems) | **GET** /v1/buyer/wishlists/{id}/items | What is on one wishlist.
[**listBuyerWishlists**](BuyerApi.md#listBuyerWishlists) | **GET** /v1/buyer/wishlists | Your wishlists.


<a name="createBuyerActivity"></a>
# **createBuyerActivity**
> CreateBuyerActivityResponse createBuyerActivity(inlineObject4)

Report an item your user is looking at, and get our answer.

Records the look and returns whether Crossly has the item and at what price. Send an identifier and a store DOMAIN — a full URL is refused. Nothing about the page itself is stored.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import org.openapitools.client.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    InlineObject4 inlineObject4 = new InlineObject4(); // InlineObject4 | 
    try {
      CreateBuyerActivityResponse result = apiInstance.createBuyerActivity(inlineObject4);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerActivity");
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
 **inlineObject4** | [**InlineObject4**](InlineObject4.md)|  |

### Return type

[**CreateBuyerActivityResponse**](CreateBuyerActivityResponse.md)

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerCartItem"></a>
# **createBuyerCartItem**
> CreateBuyerCartItemResponse createBuyerCartItem(inlineObject2)

Add a listing to your cart.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import org.openapitools.client.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    InlineObject2 inlineObject2 = new InlineObject2(); // InlineObject2 | 
    try {
      CreateBuyerCartItemResponse result = apiInstance.createBuyerCartItem(inlineObject2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerCartItem");
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
 **inlineObject2** | [**InlineObject2**](InlineObject2.md)|  |

### Return type

[**CreateBuyerCartItemResponse**](CreateBuyerCartItemResponse.md)

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerCartQuote"></a>
# **createBuyerCartQuote**
> CreateBuyerCartQuoteResponse createBuyerCartQuote()

Price the cart, delivered — item, shipping, tax, total.

Runs the real checkout cascade and returns the totals instead of charging. Nothing is purchased. &#x60;taxComplete: false&#x60; means there is no saved delivery address, so the total is a floor rather than a final figure.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import org.openapitools.client.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      CreateBuyerCartQuoteResponse result = apiInstance.createBuyerCartQuote();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerCartQuote");
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

[**CreateBuyerCartQuoteResponse**](CreateBuyerCartQuoteResponse.md)

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

<a name="createBuyerOffer"></a>
# **createBuyerOffer**
> CreateBuyerOfferResponse createBuyerOffer(inlineObject3)

Offer a price on a listing.

Sends an offer to the seller. Spends nothing — a seller accepting still leaves you to complete checkout. Offers at or above the asking price are refused; buy it instead.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import org.openapitools.client.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    InlineObject3 inlineObject3 = new InlineObject3(); // InlineObject3 | 
    try {
      CreateBuyerOfferResponse result = apiInstance.createBuyerOffer(inlineObject3);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerOffer");
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
 **inlineObject3** | [**InlineObject3**](InlineObject3.md)|  |

### Return type

[**CreateBuyerOfferResponse**](CreateBuyerOfferResponse.md)

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerWishlist"></a>
# **createBuyerWishlist**
> CreateBuyerWishlistResponse createBuyerWishlist(inlineObject)

Create a wishlist.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import org.openapitools.client.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    InlineObject inlineObject = new InlineObject(); // InlineObject | 
    try {
      CreateBuyerWishlistResponse result = apiInstance.createBuyerWishlist(inlineObject);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerWishlist");
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
 **inlineObject** | [**InlineObject**](InlineObject.md)|  |

### Return type

[**CreateBuyerWishlistResponse**](CreateBuyerWishlistResponse.md)

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerWishlistItem"></a>
# **createBuyerWishlistItem**
> CreateBuyerWishlistItemResponse createBuyerWishlistItem(id, inlineObject1)

Add a listing to a wishlist.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import org.openapitools.client.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    InlineObject1 inlineObject1 = new InlineObject1(); // InlineObject1 | 
    try {
      CreateBuyerWishlistItemResponse result = apiInstance.createBuyerWishlistItem(id, inlineObject1);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerWishlistItem");
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
 **id** | **UUID**|  |
 **inlineObject1** | [**InlineObject1**](InlineObject1.md)|  |

### Return type

[**CreateBuyerWishlistItemResponse**](CreateBuyerWishlistItemResponse.md)

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="deleteBuyerCartItem"></a>
# **deleteBuyerCartItem**
> deleteBuyerCartItem(id)

Remove a line from your cart.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import org.openapitools.client.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteBuyerCartItem(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#deleteBuyerCartItem");
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
 **id** | **UUID**|  |

### Return type

null (empty response body)

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content — the request succeeded and there is no body. |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="getBuyerPreference"></a>
# **getBuyerPreference**
> GetBuyerPreferenceResponse getBuyerPreference()

The shopping profile derived from that activity.

Derived, never declared — there is no preferences form anywhere. &#x60;matchRate&#x60; is the share of this person&#39;s searches Crossly could answer; a low number is an inventory problem, not a personalisation one, which is why it is here.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import org.openapitools.client.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      GetBuyerPreferenceResponse result = apiInstance.getBuyerPreference();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerPreference");
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

[**GetBuyerPreferenceResponse**](GetBuyerPreferenceResponse.md)

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

<a name="getBuyerProfile"></a>
# **getBuyerProfile**
> GetBuyerProfileResponse getBuyerProfile()

Your Crossly shopping profile — name, email, saved address, Bucks balance.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import org.openapitools.client.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      GetBuyerProfileResponse result = apiInstance.getBuyerProfile();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerProfile");
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

[**GetBuyerProfileResponse**](GetBuyerProfileResponse.md)

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

<a name="listBuyerActivity"></a>
# **listBuyerActivity**
> V1List listBuyerActivity()

What this buyer has compared lately.

Newest first, and only as far back as the retention window — the link between a person and a comparison is dropped after 180 days, so this thins out rather than growing forever.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import org.openapitools.client.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      V1List result = apiInstance.listBuyerActivity();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerActivity");
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

<a name="listBuyerCart"></a>
# **listBuyerCart**
> V1List listBuyerCart()

What is in your Crossly cart.

Line items with the price captured when each was added. This is NOT a quote — shipping, tax and any discounts are computed at checkout against a delivery address, and the sum of these lines is not what you will be charged.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import org.openapitools.client.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      V1List result = apiInstance.listBuyerCart();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerCart");
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

<a name="listBuyerCashback"></a>
# **listBuyerCashback**
> V1List listBuyerCashback(status, page, limit)

Your Scout cashback — pending, confirmed, paid.

Newest first. &#x60;pending&#x60; means an order was reported and the retailer&#39;s return window has not closed; nothing is paid until it does. &#x60;expired&#x60; means a click was never reported as converting, which is the ordinary outcome for most clicks.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import org.openapitools.client.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String status = "pending"; // String | 
    Integer page = 1; // Integer | 
    Integer limit = 25; // Integer | 
    try {
      V1List result = apiInstance.listBuyerCashback(status, page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerCashback");
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
 **status** | **String**|  | [optional] [enum: pending, confirmed, rejected, paid, expired]
 **page** | **Integer**|  | [optional] [default to 1]
 **limit** | **Integer**|  | [optional] [default to 25]

### Return type

[**V1List**](V1List.md)

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

<a name="listBuyerOrders"></a>
# **listBuyerOrders**
> V1List listBuyerOrders(page, limit)

What you have bought on Crossly, newest first.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import org.openapitools.client.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    Integer page = 1; // Integer | 
    Integer limit = 25; // Integer | 
    try {
      V1List result = apiInstance.listBuyerOrders(page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerOrders");
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
 **page** | **Integer**|  | [optional] [default to 1]
 **limit** | **Integer**|  | [optional] [default to 25]

### Return type

[**V1List**](V1List.md)

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

<a name="listBuyerWishlistItems"></a>
# **listBuyerWishlistItems**
> V1List listBuyerWishlistItems(id)

What is on one wishlist.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import org.openapitools.client.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      V1List result = apiInstance.listBuyerWishlistItems(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerWishlistItems");
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
 **id** | **UUID**|  |

### Return type

[**V1List**](V1List.md)

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

<a name="listBuyerWishlists"></a>
# **listBuyerWishlists**
> V1List listBuyerWishlists()

Your wishlists.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import org.openapitools.client.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      V1List result = apiInstance.listBuyerWishlists();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerWishlists");
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

