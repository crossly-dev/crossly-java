# TaxApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMileage**](TaxApi.md#createMileage) | **POST** /v1/mileage | Create a mileage entry.
[**deleteMileage**](TaxApi.md#deleteMileage) | **DELETE** /v1/mileage/{id} | Delete a mileage entry.
[**getBookTaxProfile**](TaxApi.md#getBookTaxProfile) | **GET** /v1/books/tax-profile | Your tax profile: time zone for books boundaries, filing status, state, set-aside and rate assumptions, accounting method, and business name, EIN and address.
[**getMileageSummary**](TaxApi.md#getMileageSummary) | **GET** /v1/mileage/summary | Annual mileage totals + IRS deduction. Each trip is priced at the IRS rate on its own date (2026 has two rates, listed in &#x60;rates&#x60;); &#x60;ratePerMile&#x60; is the January rate.
[**getOrderSalesTax**](TaxApi.md#getOrderSalesTax) | **GET** /v1/orders/{id}/sales-tax | Who collected sales tax on one Crossly marketplace order, where, and the seller notice.
[**getTaxSalesTax**](TaxApi.md#getTaxSalesTax) | **GET** /v1/tax/sales-tax | Crossly marketplace sales Crossly did not collect sales tax on, by jurisdiction.
[**getTaxScheduleC**](TaxApi.md#getTaxScheduleC) | **GET** /v1/tax/schedule-c | Schedule C JSON for a tax year (default the current year), from the same P&amp;L as GET /v1/books: line 1 gross receipts before refunds, line 2 refunds, COGS in Part III, completed sales only. GET /v1/books has the full P&amp;L by period.
[**listMileage**](TaxApi.md#listMileage) | **GET** /v1/mileage | List mileage entries, newest trip first, paged (limit up to 500). Narrow by year and/or an inclusive from/to date range.
[**listTaxCrosslyCollects**](TaxApi.md#listTaxCrosslyCollects) | **GET** /v1/tax/crossly-collects | Where Crossly collects sales tax today (its active Stripe Tax registrations).
[**listTaxSalesTaxNotCollected**](TaxApi.md#listTaxSalesTaxNotCollected) | **GET** /v1/tax/sales-tax/not-collected | The individual Crossly sales Crossly did not collect sales tax on, newest first.
[**updateBookTaxProfile**](TaxApi.md#updateBookTaxProfile) | **PUT** /v1/books/tax-profile | Update your tax profile: time zone, filing status, state, set-aside and rate assumptions (basis points), accounting method, business name, EIN and address. Fields left out are unchanged.
[**updateMileage**](TaxApi.md#updateMileage) | **PATCH** /v1/mileage/{id} | Update a mileage entry.


<a name="createMileage"></a>
# **createMileage**
> CreateMileageResponse createMileage()

Create a mileage entry.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TaxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TaxApi apiInstance = new TaxApi(defaultClient);
    try {
      CreateMileageResponse result = apiInstance.createMileage();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxApi#createMileage");
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

**CreateMileageResponse**

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

<a name="deleteMileage"></a>
# **deleteMileage**
> OkResponse deleteMileage(id)

Delete a mileage entry.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TaxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TaxApi apiInstance = new TaxApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      OkResponse result = apiInstance.deleteMileage(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxApi#deleteMileage");
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

<a name="getBookTaxProfile"></a>
# **getBookTaxProfile**
> GetBookTaxProfileResponse getBookTaxProfile()

Your tax profile: time zone for books boundaries, filing status, state, set-aside and rate assumptions, accounting method, and business name, EIN and address.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TaxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TaxApi apiInstance = new TaxApi(defaultClient);
    try {
      GetBookTaxProfileResponse result = apiInstance.getBookTaxProfile();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxApi#getBookTaxProfile");
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

**GetBookTaxProfileResponse**

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

<a name="getMileageSummary"></a>
# **getMileageSummary**
> GetMileageSummaryResponse getMileageSummary(year)

Annual mileage totals + IRS deduction. Each trip is priced at the IRS rate on its own date (2026 has two rates, listed in &#x60;rates&#x60;); &#x60;ratePerMile&#x60; is the January rate.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TaxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TaxApi apiInstance = new TaxApi(defaultClient);
    Integer year = 56; // Integer | Calendar tax year. Default the current year.
    try {
      GetMileageSummaryResponse result = apiInstance.getMileageSummary(year);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxApi#getMileageSummary");
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
 **year** | **Integer**| Calendar tax year. Default the current year. | [optional]

### Return type

**GetMileageSummaryResponse**

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

<a name="getOrderSalesTax"></a>
# **getOrderSalesTax**
> GetOrderSalesTaxResponse getOrderSalesTax(id)

Who collected sales tax on one Crossly marketplace order, where, and the seller notice.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TaxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TaxApi apiInstance = new TaxApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      GetOrderSalesTaxResponse result = apiInstance.getOrderSalesTax(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxApi#getOrderSalesTax");
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

**GetOrderSalesTaxResponse**

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

<a name="getTaxSalesTax"></a>
# **getTaxSalesTax**
> GetTaxSalesTaxResponse getTaxSalesTax(from, to)

Crossly marketplace sales Crossly did not collect sales tax on, by jurisdiction.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TaxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TaxApi apiInstance = new TaxApi(defaultClient);
    String from = "from_example"; // String | YYYY-MM-DD, inclusive. Default 1 January this year.
    String to = "to_example"; // String | YYYY-MM-DD, inclusive. Default now.
    try {
      GetTaxSalesTaxResponse result = apiInstance.getTaxSalesTax(from, to);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxApi#getTaxSalesTax");
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
 **from** | **String**| YYYY-MM-DD, inclusive. Default 1 January this year. | [optional]
 **to** | **String**| YYYY-MM-DD, inclusive. Default now. | [optional]

### Return type

**GetTaxSalesTaxResponse**

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

<a name="getTaxScheduleC"></a>
# **getTaxScheduleC**
> GetTaxScheduleCResponse getTaxScheduleC()

Schedule C JSON for a tax year (default the current year), from the same P&amp;L as GET /v1/books: line 1 gross receipts before refunds, line 2 refunds, COGS in Part III, completed sales only. GET /v1/books has the full P&amp;L by period.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TaxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TaxApi apiInstance = new TaxApi(defaultClient);
    try {
      GetTaxScheduleCResponse result = apiInstance.getTaxScheduleC();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxApi#getTaxScheduleC");
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

**GetTaxScheduleCResponse**

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

<a name="listMileage"></a>
# **listMileage**
> ListMileageResponse listMileage(year, from, to, page, limit)

List mileage entries, newest trip first, paged (limit up to 500). Narrow by year and/or an inclusive from/to date range.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TaxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TaxApi apiInstance = new TaxApi(defaultClient);
    Integer year = 56; // Integer | Only trips dated in this calendar year.
    String from = "from_example"; // String | YYYY-MM-DD, inclusive. Only trips on or after this date. Combines with year.
    String to = "to_example"; // String | YYYY-MM-DD, inclusive. Only trips on or before this date; from <= to.
    Integer page = 56; // Integer | 1-indexed page. Default 1.
    Integer limit = 56; // Integer | Rows per page, default 100, clamped to 500.
    try {
      ListMileageResponse result = apiInstance.listMileage(year, from, to, page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxApi#listMileage");
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
 **year** | **Integer**| Only trips dated in this calendar year. | [optional]
 **from** | **String**| YYYY-MM-DD, inclusive. Only trips on or after this date. Combines with year. | [optional]
 **to** | **String**| YYYY-MM-DD, inclusive. Only trips on or before this date; from &lt;&#x3D; to. | [optional]
 **page** | **Integer**| 1-indexed page. Default 1. | [optional]
 **limit** | **Integer**| Rows per page, default 100, clamped to 500. | [optional]

### Return type

**ListMileageResponse**

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

<a name="listTaxCrosslyCollects"></a>
# **listTaxCrosslyCollects**
> ListTaxCrosslyCollectsResponse listTaxCrosslyCollects()

Where Crossly collects sales tax today (its active Stripe Tax registrations).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TaxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TaxApi apiInstance = new TaxApi(defaultClient);
    try {
      ListTaxCrosslyCollectsResponse result = apiInstance.listTaxCrosslyCollects();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxApi#listTaxCrosslyCollects");
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

**ListTaxCrosslyCollectsResponse**

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

<a name="listTaxSalesTaxNotCollected"></a>
# **listTaxSalesTaxNotCollected**
> ListTaxSalesTaxNotCollectedResponse listTaxSalesTaxNotCollected(from, to, page, limit)

The individual Crossly sales Crossly did not collect sales tax on, newest first.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TaxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TaxApi apiInstance = new TaxApi(defaultClient);
    String from = "from_example"; // String | 
    String to = "to_example"; // String | 
    Integer page = 56; // Integer | 
    Integer limit = 56; // Integer | 
    try {
      ListTaxSalesTaxNotCollectedResponse result = apiInstance.listTaxSalesTaxNotCollected(from, to, page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxApi#listTaxSalesTaxNotCollected");
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
 **from** | **String**|  | [optional]
 **to** | **String**|  | [optional]
 **page** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]

### Return type

**ListTaxSalesTaxNotCollectedResponse**

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

<a name="updateBookTaxProfile"></a>
# **updateBookTaxProfile**
> GetBookTaxProfileResponse updateBookTaxProfile()

Update your tax profile: time zone, filing status, state, set-aside and rate assumptions (basis points), accounting method, business name, EIN and address. Fields left out are unchanged.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TaxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TaxApi apiInstance = new TaxApi(defaultClient);
    try {
      GetBookTaxProfileResponse result = apiInstance.updateBookTaxProfile();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxApi#updateBookTaxProfile");
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

**GetBookTaxProfileResponse**

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

<a name="updateMileage"></a>
# **updateMileage**
> CreateMileageResponse updateMileage(id)

Update a mileage entry.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TaxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TaxApi apiInstance = new TaxApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateMileageResponse result = apiInstance.updateMileage(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxApi#updateMileage");
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

**CreateMileageResponse**

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

