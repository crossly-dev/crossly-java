# CompWatchlistsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCompWatchlist**](CompWatchlistsApi.md#createCompWatchlist) | **POST** /v1/comp-watchlists | Create a sold-comp watchlist.
[**createCompWatchlistScrape**](CompWatchlistsApi.md#createCompWatchlistScrape) | **POST** /v1/comp-watchlists/{id}/scrape | Manually trigger a watchlist scrape.
[**deleteCompWatchlist**](CompWatchlistsApi.md#deleteCompWatchlist) | **DELETE** /v1/comp-watchlists/{id} | Delete a sold-comp watchlist.
[**listCompWatchlistRecent**](CompWatchlistsApi.md#listCompWatchlistRecent) | **GET** /v1/comp-watchlists/{id}/recent | Recent external sold comps matching this watchlist.
[**listCompWatchlists**](CompWatchlistsApi.md#listCompWatchlists) | **GET** /v1/comp-watchlists | List the seller&#39;s sold-comp watchlists.


<a name="createCompWatchlist"></a>
# **createCompWatchlist**
> CreateCompWatchlistResponse createCompWatchlist()

Create a sold-comp watchlist.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CompWatchlistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CompWatchlistsApi apiInstance = new CompWatchlistsApi(defaultClient);
    try {
      CreateCompWatchlistResponse result = apiInstance.createCompWatchlist();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompWatchlistsApi#createCompWatchlist");
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

[**CreateCompWatchlistResponse**](CreateCompWatchlistResponse.md)

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

<a name="createCompWatchlistScrape"></a>
# **createCompWatchlistScrape**
> CreateCompWatchlistScrapeResponse createCompWatchlistScrape(id)

Manually trigger a watchlist scrape.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CompWatchlistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CompWatchlistsApi apiInstance = new CompWatchlistsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateCompWatchlistScrapeResponse result = apiInstance.createCompWatchlistScrape(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompWatchlistsApi#createCompWatchlistScrape");
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

[**CreateCompWatchlistScrapeResponse**](CreateCompWatchlistScrapeResponse.md)

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

<a name="deleteCompWatchlist"></a>
# **deleteCompWatchlist**
> DeleteCompWatchlistResponse deleteCompWatchlist(id)

Delete a sold-comp watchlist.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CompWatchlistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CompWatchlistsApi apiInstance = new CompWatchlistsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      DeleteCompWatchlistResponse result = apiInstance.deleteCompWatchlist(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompWatchlistsApi#deleteCompWatchlist");
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

[**DeleteCompWatchlistResponse**](DeleteCompWatchlistResponse.md)

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

<a name="listCompWatchlistRecent"></a>
# **listCompWatchlistRecent**
> V1List listCompWatchlistRecent(id)

Recent external sold comps matching this watchlist.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CompWatchlistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CompWatchlistsApi apiInstance = new CompWatchlistsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      V1List result = apiInstance.listCompWatchlistRecent(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompWatchlistsApi#listCompWatchlistRecent");
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

<a name="listCompWatchlists"></a>
# **listCompWatchlists**
> V1List listCompWatchlists()

List the seller&#39;s sold-comp watchlists.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CompWatchlistsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CompWatchlistsApi apiInstance = new CompWatchlistsApi(defaultClient);
    try {
      V1List result = apiInstance.listCompWatchlists();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CompWatchlistsApi#listCompWatchlists");
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

