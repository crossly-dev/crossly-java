# DiscountsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAutomaticDiscount**](DiscountsApi.md#createAutomaticDiscount) | **POST** /v1/automatic-discounts | Create an automatic discount.
[**createAutomaticDiscountPreview**](DiscountsApi.md#createAutomaticDiscountPreview) | **POST** /v1/automatic-discounts/preview | Preview a hypothetical cart of your listings against your automatic discounts (or an unsaved draft): what each line gets.
[**createDiscountCode**](DiscountsApi.md#createDiscountCode) | **POST** /v1/discount-codes | Create a discount code: percent, fixed, free shipping, buy X get Y, spend tiers or a set price, with requirements, item scope, limits (total, per buyer, per day, budget, regions), schedule and stacking.
[**createDiscountCodeGenerate**](DiscountsApi.md#createDiscountCodeGenerate) | **POST** /v1/discount-codes/{id}/generate | Generate up to 5,000 unique single-use codes with this code’s rules (their uses count toward its limits).
[**createDiscountCodeStatus**](DiscountsApi.md#createDiscountCodeStatus) | **POST** /v1/discount-codes/{id}/status | Pause, resume (active) or archive a discount code.
[**createDiscountHolder**](DiscountsApi.md#createDiscountHolder) | **POST** /v1/discounts/holders | Create a Collection holders deal in the store (X-Storefront-Id; default store when omitted).
[**deleteAutomaticDiscount**](DiscountsApi.md#deleteAutomaticDiscount) | **DELETE** /v1/automatic-discounts/{id} | Delete an automatic discount.
[**deleteDiscountHolder**](DiscountsApi.md#deleteDiscountHolder) | **DELETE** /v1/discounts/holders/{id} | Delete a Collection holders deal. Returns &#x60;{ ok }&#x60;.
[**getDiscountCode**](DiscountsApi.md#getDiscountCode) | **GET** /v1/discount-codes/{id} | One discount code with its rules and usage.
[**getDiscountCodeShare**](DiscountsApi.md#getDiscountCodeShare) | **GET** /v1/discount-codes/{id}/share | The share link that pre-applies the code at checkout (the store page with ?code&#x3D;) and a QR code of it as a PNG data URL.
[**getDiscountHolder**](DiscountsApi.md#getDiscountHolder) | **GET** /v1/discounts/holders/{id} | One Collection holders deal with its usage (uses, cents given).
[**listAutomaticDiscounts**](DiscountsApi.md#listAutomaticDiscounts) | **GET** /v1/automatic-discounts | Your automatic discounts (buy more, save more): quantity and mixed-item tiers, scope, channels and schedule.
[**listDiscountCodeRedemptions**](DiscountsApi.md#listDiscountCodeRedemptions) | **GET** /v1/discount-codes/{id}/redemptions | A code’s usage history: orders, masked buyers, region, channel and the amount given, newest first.
[**listDiscountCodes**](DiscountsApi.md#listDiscountCodes) | **GET** /v1/discount-codes | Your discount codes: kind, status (active, scheduled, paused, expired, exhausted, archived), every rule, and usage.
[**listDiscountHolders**](DiscountsApi.md#listDiscountHolders) | **GET** /v1/discounts/holders | The store’s Collection holders deals: a percent off for buyers holding any token of a collection (by chain + contract), with scope, channels, schedule, stacking and limits.
[**updateAutomaticDiscount**](DiscountsApi.md#updateAutomaticDiscount) | **PUT** /v1/automatic-discounts/{id} | Replace an automatic discount.
[**updateDiscountCode**](DiscountsApi.md#updateDiscountCode) | **PATCH** /v1/discount-codes/{id} | Update a discount code. The code itself can be renamed only until it is first used.
[**updateDiscountHolder**](DiscountsApi.md#updateDiscountHolder) | **PUT** /v1/discounts/holders/{id} | Replace a Collection holders deal.


<a name="createAutomaticDiscount"></a>
# **createAutomaticDiscount**
> CreateAutomaticDiscountResponse createAutomaticDiscount()

Create an automatic discount.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DiscountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    try {
      CreateAutomaticDiscountResponse result = apiInstance.createAutomaticDiscount();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#createAutomaticDiscount");
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

**CreateAutomaticDiscountResponse**

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

<a name="createAutomaticDiscountPreview"></a>
# **createAutomaticDiscountPreview**
> CreateAutomaticDiscountPreviewResponse createAutomaticDiscountPreview()

Preview a hypothetical cart of your listings against your automatic discounts (or an unsaved draft): what each line gets.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DiscountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    try {
      CreateAutomaticDiscountPreviewResponse result = apiInstance.createAutomaticDiscountPreview();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#createAutomaticDiscountPreview");
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

**CreateAutomaticDiscountPreviewResponse**

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

<a name="createDiscountCode"></a>
# **createDiscountCode**
> DiscountCodeResponse createDiscountCode()

Create a discount code: percent, fixed, free shipping, buy X get Y, spend tiers or a set price, with requirements, item scope, limits (total, per buyer, per day, budget, regions), schedule and stacking.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DiscountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    try {
      DiscountCodeResponse result = apiInstance.createDiscountCode();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#createDiscountCode");
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

**DiscountCodeResponse**

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

<a name="createDiscountCodeGenerate"></a>
# **createDiscountCodeGenerate**
> CreateDiscountCodeGenerateResponse createDiscountCodeGenerate(id)

Generate up to 5,000 unique single-use codes with this code’s rules (their uses count toward its limits).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DiscountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateDiscountCodeGenerateResponse result = apiInstance.createDiscountCodeGenerate(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#createDiscountCodeGenerate");
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

**CreateDiscountCodeGenerateResponse**

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

<a name="createDiscountCodeStatus"></a>
# **createDiscountCodeStatus**
> DiscountCodeResponse createDiscountCodeStatus(id)

Pause, resume (active) or archive a discount code.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DiscountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      DiscountCodeResponse result = apiInstance.createDiscountCodeStatus(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#createDiscountCodeStatus");
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

**DiscountCodeResponse**

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

<a name="createDiscountHolder"></a>
# **createDiscountHolder**
> CreateDiscountHolderResponse createDiscountHolder()

Create a Collection holders deal in the store (X-Storefront-Id; default store when omitted).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DiscountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    try {
      CreateDiscountHolderResponse result = apiInstance.createDiscountHolder();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#createDiscountHolder");
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

**CreateDiscountHolderResponse**

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

<a name="deleteAutomaticDiscount"></a>
# **deleteAutomaticDiscount**
> UpdateGroupBuyResponse deleteAutomaticDiscount(id)

Delete an automatic discount.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DiscountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      UpdateGroupBuyResponse result = apiInstance.deleteAutomaticDiscount(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#deleteAutomaticDiscount");
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

**UpdateGroupBuyResponse**

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

<a name="deleteDiscountHolder"></a>
# **deleteDiscountHolder**
> OkResponse deleteDiscountHolder(id)

Delete a Collection holders deal. Returns &#x60;{ ok }&#x60;.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DiscountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      OkResponse result = apiInstance.deleteDiscountHolder(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#deleteDiscountHolder");
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

**OkResponse**

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

<a name="getDiscountCode"></a>
# **getDiscountCode**
> GetDiscountCodeResponse getDiscountCode(id)

One discount code with its rules and usage.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DiscountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetDiscountCodeResponse result = apiInstance.getDiscountCode(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#getDiscountCode");
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

**GetDiscountCodeResponse**

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

<a name="getDiscountCodeShare"></a>
# **getDiscountCodeShare**
> GetDiscountCodeShareResponse getDiscountCodeShare(id)

The share link that pre-applies the code at checkout (the store page with ?code&#x3D;) and a QR code of it as a PNG data URL.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DiscountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetDiscountCodeShareResponse result = apiInstance.getDiscountCodeShare(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#getDiscountCodeShare");
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

**GetDiscountCodeShareResponse**

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

<a name="getDiscountHolder"></a>
# **getDiscountHolder**
> GetDiscountHolderResponse getDiscountHolder(id)

One Collection holders deal with its usage (uses, cents given).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DiscountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      GetDiscountHolderResponse result = apiInstance.getDiscountHolder(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#getDiscountHolder");
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

**GetDiscountHolderResponse**

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

<a name="listAutomaticDiscounts"></a>
# **listAutomaticDiscounts**
> ListAutomaticDiscountsResponse listAutomaticDiscounts()

Your automatic discounts (buy more, save more): quantity and mixed-item tiers, scope, channels and schedule.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DiscountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    try {
      ListAutomaticDiscountsResponse result = apiInstance.listAutomaticDiscounts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#listAutomaticDiscounts");
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

**ListAutomaticDiscountsResponse**

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

<a name="listDiscountCodeRedemptions"></a>
# **listDiscountCodeRedemptions**
> ListDiscountCodeRedemptionsResponse listDiscountCodeRedemptions(id)

A code’s usage history: orders, masked buyers, region, channel and the amount given, newest first.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DiscountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      ListDiscountCodeRedemptionsResponse result = apiInstance.listDiscountCodeRedemptions(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#listDiscountCodeRedemptions");
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

**ListDiscountCodeRedemptionsResponse**

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

<a name="listDiscountCodes"></a>
# **listDiscountCodes**
> ListDiscountCodesResponse listDiscountCodes()

Your discount codes: kind, status (active, scheduled, paused, expired, exhausted, archived), every rule, and usage.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DiscountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    try {
      ListDiscountCodesResponse result = apiInstance.listDiscountCodes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#listDiscountCodes");
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

**ListDiscountCodesResponse**

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

<a name="listDiscountHolders"></a>
# **listDiscountHolders**
> ListDiscountHoldersResponse listDiscountHolders()

The store’s Collection holders deals: a percent off for buyers holding any token of a collection (by chain + contract), with scope, channels, schedule, stacking and limits.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DiscountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    try {
      ListDiscountHoldersResponse result = apiInstance.listDiscountHolders();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#listDiscountHolders");
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

**ListDiscountHoldersResponse**

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

<a name="updateAutomaticDiscount"></a>
# **updateAutomaticDiscount**
> CreateAutomaticDiscountResponse updateAutomaticDiscount(id)

Replace an automatic discount.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DiscountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateAutomaticDiscountResponse result = apiInstance.updateAutomaticDiscount(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#updateAutomaticDiscount");
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

**CreateAutomaticDiscountResponse**

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

<a name="updateDiscountCode"></a>
# **updateDiscountCode**
> DiscountCodeResponse updateDiscountCode(id)

Update a discount code. The code itself can be renamed only until it is first used.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DiscountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      DiscountCodeResponse result = apiInstance.updateDiscountCode(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#updateDiscountCode");
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

**DiscountCodeResponse**

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

<a name="updateDiscountHolder"></a>
# **updateDiscountHolder**
> CreateDiscountHolderResponse updateDiscountHolder(id)

Replace a Collection holders deal.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.DiscountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    DiscountsApi apiInstance = new DiscountsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateDiscountHolderResponse result = apiInstance.updateDiscountHolder(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscountsApi#updateDiscountHolder");
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

**CreateDiscountHolderResponse**

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

