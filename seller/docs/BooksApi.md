# BooksApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBookExpense**](BooksApi.md#createBookExpense) | **POST** /v1/books/expenses | Log a business expense: date, amountCents, a Schedule C category, vendor, description, receipt link, optionally recurring monthly or yearly.
[**deleteBookExpense**](BooksApi.md#deleteBookExpense) | **DELETE** /v1/books/expenses/{id} | Delete a logged expense. It leaves the P&amp;L and the exports.
[**getBook**](BooksApi.md#getBook) | **GET** /v1/books | Profit and loss for a year and period on the Schedule C lines: income, COGS, gross profit, expenses (marketplace fees, postage, mileage, your categories), net profit, monthly table, per-marketplace table with 1099-K expectations, Part III COGS, estimated tax and sales tax collected by marketplaces. Money in cents.
[**getBook1099k**](BooksApi.md#getBook1099k) | **GET** /v1/books/1099k | Per marketplace for a year: the 1099-K gross you recorded beside the gross Crossly computed, the difference, and whether a form is expected (federal: over $20,000 and over 200 transactions).
[**getBookExpense**](BooksApi.md#getBookExpense) | **GET** /v1/books/expenses | Your logged business expenses in a year and period (recurring ones expanded), with their Schedule C category. Amounts in cents.
[**getBookTaxProfile**](BooksApi.md#getBookTaxProfile) | **GET** /v1/books/tax-profile | Your tax profile: time zone for books boundaries, filing status, state, set-aside and rate assumptions, accounting method, and business name, EIN and address.
[**getBookTransaction**](BooksApi.md#getBookTransaction) | **GET** /v1/books/transactions | The sale rows behind any P&amp;L line, newest first: gross, refunded, fee and fee source, shipping, COGS, tax collected and net, in cents.
[**updateBook1099k**](BooksApi.md#updateBook1099k) | **PUT** /v1/books/1099k | Record what a marketplace reported on its 1099-K for a year (gross in cents, transactions, notes). Answers the year&#39;s reconciliation, as GET /v1/books/1099k does.
[**updateBookExpense**](BooksApi.md#updateBookExpense) | **PATCH** /v1/books/expenses/{id} | Change a logged expense.
[**updateBookTaxProfile**](BooksApi.md#updateBookTaxProfile) | **PUT** /v1/books/tax-profile | Update your tax profile: time zone, filing status, state, set-aside and rate assumptions (basis points), accounting method, business name, EIN and address. Fields left out are unchanged.


<a name="createBookExpense"></a>
# **createBookExpense**
> CreateBookExpenseResponse createBookExpense()

Log a business expense: date, amountCents, a Schedule C category, vendor, description, receipt link, optionally recurring monthly or yearly.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.BooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    BooksApi apiInstance = new BooksApi(defaultClient);
    try {
      CreateBookExpenseResponse result = apiInstance.createBookExpense();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BooksApi#createBookExpense");
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

**CreateBookExpenseResponse**

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

<a name="deleteBookExpense"></a>
# **deleteBookExpense**
> DeleteStoryResponse deleteBookExpense(id)

Delete a logged expense. It leaves the P&amp;L and the exports.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.BooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    BooksApi apiInstance = new BooksApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The expense id.
    try {
      DeleteStoryResponse result = apiInstance.deleteBookExpense(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BooksApi#deleteBookExpense");
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
 **id** | **UUID**| The expense id. |

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

<a name="getBook"></a>
# **getBook**
> GetBookResponse getBook(year, period, tz)

Profit and loss for a year and period on the Schedule C lines: income, COGS, gross profit, expenses (marketplace fees, postage, mileage, your categories), net profit, monthly table, per-marketplace table with 1099-K expectations, Part III COGS, estimated tax and sales tax collected by marketplaces. Money in cents.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.BooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    BooksApi apiInstance = new BooksApi(defaultClient);
    Integer year = 56; // Integer | Tax year. Default the current year.
    String period = "fy"; // String | fy = full year (default), ytd, q1-q4, m01-m12. Boundaries are in your tax-profile time zone.
    String tz = "tz_example"; // String | IANA zone; default your tax profile zone.
    try {
      GetBookResponse result = apiInstance.getBook(year, period, tz);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BooksApi#getBook");
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
 **year** | **Integer**| Tax year. Default the current year. | [optional]
 **period** | **String**| fy &#x3D; full year (default), ytd, q1-q4, m01-m12. Boundaries are in your tax-profile time zone. | [optional] [enum: fy, ytd, q1, q2, q3, q4, m01, m02, m03, m04, m05, m06, m07, m08, m09, m10, m11, m12]
 **tz** | **String**| IANA zone; default your tax profile zone. | [optional]

### Return type

**GetBookResponse**

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

<a name="getBook1099k"></a>
# **getBook1099k**
> GetBook1099kResponse getBook1099k(year)

Per marketplace for a year: the 1099-K gross you recorded beside the gross Crossly computed, the difference, and whether a form is expected (federal: over $20,000 and over 200 transactions).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.BooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    BooksApi apiInstance = new BooksApi(defaultClient);
    Integer year = 56; // Integer | Tax year. Default the current year.
    try {
      GetBook1099kResponse result = apiInstance.getBook1099k(year);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BooksApi#getBook1099k");
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
 **year** | **Integer**| Tax year. Default the current year. | [optional]

### Return type

**GetBook1099kResponse**

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

<a name="getBookExpense"></a>
# **getBookExpense**
> GetBookExpenseResponse getBookExpense(year, period, category, page, size)

Your logged business expenses in a year and period (recurring ones expanded), with their Schedule C category. Amounts in cents.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.BooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    BooksApi apiInstance = new BooksApi(defaultClient);
    Integer year = 56; // Integer | Tax year. Default the current year.
    String period = "fy"; // String | fy = full year (default), ytd, q1-q4, m01-m12. Boundaries are in your tax-profile time zone.
    String category = "category_example"; // String | An expense category id, e.g. supplies, postage, software_subscriptions.
    Integer page = 56; // Integer | 1-indexed page. Default 1.
    Integer size = 56; // Integer | Rows per page, at most 100. Default 25.
    try {
      GetBookExpenseResponse result = apiInstance.getBookExpense(year, period, category, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BooksApi#getBookExpense");
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
 **year** | **Integer**| Tax year. Default the current year. | [optional]
 **period** | **String**| fy &#x3D; full year (default), ytd, q1-q4, m01-m12. Boundaries are in your tax-profile time zone. | [optional] [enum: fy, ytd, q1, q2, q3, q4, m01, m02, m03, m04, m05, m06, m07, m08, m09, m10, m11, m12]
 **category** | **String**| An expense category id, e.g. supplies, postage, software_subscriptions. | [optional]
 **page** | **Integer**| 1-indexed page. Default 1. | [optional]
 **size** | **Integer**| Rows per page, at most 100. Default 25. | [optional]

### Return type

**GetBookExpenseResponse**

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
import net.crossly.api.BooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    BooksApi apiInstance = new BooksApi(defaultClient);
    try {
      GetBookTaxProfileResponse result = apiInstance.getBookTaxProfile();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BooksApi#getBookTaxProfile");
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

<a name="getBookTransaction"></a>
# **getBookTransaction**
> GetBookTransactionResponse getBookTransaction(year, period, tz, platform, status, page, size)

The sale rows behind any P&amp;L line, newest first: gross, refunded, fee and fee source, shipping, COGS, tax collected and net, in cents.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.BooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    BooksApi apiInstance = new BooksApi(defaultClient);
    Integer year = 56; // Integer | Tax year. Default the current year.
    String period = "fy"; // String | fy = full year (default), ytd, q1-q4, m01-m12. Boundaries are in your tax-profile time zone.
    String tz = "tz_example"; // String | IANA zone; default your tax profile zone.
    String platform = "platform_example"; // String | One platform id.
    String status = "completed"; // String | completed = counted in income; pending = details not in yet (no money); default all.
    Integer page = 56; // Integer | 1-indexed page. Default 1.
    Integer size = 56; // Integer | Rows per page, at most 100. Default 50.
    try {
      GetBookTransactionResponse result = apiInstance.getBookTransaction(year, period, tz, platform, status, page, size);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BooksApi#getBookTransaction");
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
 **year** | **Integer**| Tax year. Default the current year. | [optional]
 **period** | **String**| fy &#x3D; full year (default), ytd, q1-q4, m01-m12. Boundaries are in your tax-profile time zone. | [optional] [enum: fy, ytd, q1, q2, q3, q4, m01, m02, m03, m04, m05, m06, m07, m08, m09, m10, m11, m12]
 **tz** | **String**| IANA zone; default your tax profile zone. | [optional]
 **platform** | **String**| One platform id. | [optional]
 **status** | **String**| completed &#x3D; counted in income; pending &#x3D; details not in yet (no money); default all. | [optional] [enum: completed, cancelled, refunded, pending, all]
 **page** | **Integer**| 1-indexed page. Default 1. | [optional]
 **size** | **Integer**| Rows per page, at most 100. Default 50. | [optional]

### Return type

**GetBookTransactionResponse**

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

<a name="updateBook1099k"></a>
# **updateBook1099k**
> GetBook1099kResponse updateBook1099k()

Record what a marketplace reported on its 1099-K for a year (gross in cents, transactions, notes). Answers the year&#39;s reconciliation, as GET /v1/books/1099k does.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.BooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    BooksApi apiInstance = new BooksApi(defaultClient);
    try {
      GetBook1099kResponse result = apiInstance.updateBook1099k();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BooksApi#updateBook1099k");
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

**GetBook1099kResponse**

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

<a name="updateBookExpense"></a>
# **updateBookExpense**
> CreateBookExpenseResponse updateBookExpense(id)

Change a logged expense.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.BooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    BooksApi apiInstance = new BooksApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The expense id.
    try {
      CreateBookExpenseResponse result = apiInstance.updateBookExpense(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BooksApi#updateBookExpense");
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
 **id** | **UUID**| The expense id. |

### Return type

**CreateBookExpenseResponse**

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
import net.crossly.api.BooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    BooksApi apiInstance = new BooksApi(defaultClient);
    try {
      GetBookTaxProfileResponse result = apiInstance.updateBookTaxProfile();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BooksApi#updateBookTaxProfile");
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

