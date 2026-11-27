# StallsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createStallBook**](StallsApi.md#createStallBook) | **POST** /v1/stalls/book | Book and pay for a pop-up stall: { street, spotIndex, rail, unit: \&quot;day\&quot;, startDate, days } or { ..., unit: \&quot;event\&quot;, eventIds }, optional booth { canopy, pattern, lights, counter, piece } (premium values need holding; checked before paying). Paid up front; full-access token and Idempotency-Key required.
[**createStallBookingCancel**](StallsApi.md#createStallBookingCancel) | **POST** /v1/stalls/bookings/{id}/cancel | Cancel a stall before it opens: a full refund on the rail it was paid on. Final once it has opened.
[**getStallBookingCounter**](StallsApi.md#getStallBookingCounter) | **GET** /v1/stalls/bookings/{id}/counter | A stall counter: the listings you picked (in order), its booth kind and capacity.
[**getStallQuote**](StallsApi.md#getStallQuote) | **GET** /v1/stalls/quote | Quote a stall: street, spot, and either unit&#x3D;day with start (YYYY-MM-DD) and days, or unit&#x3D;event with events (comma-separated event ids). Returns the line items in cents, the rails the spot accepts and whether it is bookable.
[**getStallStreetAerial**](StallsApi.md#getStallStreetAerial) | **GET** /v1/stalls/streets/{slug}/aerial | A street from above for booking: every spot with its owner, booth size, counter capacity and price, the street events, and who is booked on each date.
[**listStallListingSearch**](StallsApi.md#listStallListingSearch) | **GET** /v1/stalls/listing-search | Search ANY of your live Crossly listings for a stall counter or convention booth: q, category, min, max (cents), street (marks what its terms allow), limit, offset.
[**listStallMine**](StallsApi.md#listStallMine) | **GET** /v1/stalls/mine | Your stall bookings, newest first, with visits, offers and sales while the stall was up.
[**listStreetEvents**](StallsApi.md#listStreetEvents) | **GET** /v1/streets/{slug}/events | Current and upcoming street events (Night Market, Swap Meet) on a street, soonest first.
[**listStreetStalls**](StallsApi.md#listStreetStalls) | **GET** /v1/streets/{slug}/stalls | Today&#39;s pop-up stalls on a street (each with its live listings, awning, sign and seller), plus the spots still free today. meta carries the street, the phase (day / night_market / swap_meet) and the free spots.
[**updateStallBooking**](StallsApi.md#updateStallBooking) | **PATCH** /v1/stalls/bookings/{id} | Change a booked stall before or while it is up: listingIds (up to 6 of your live listings), awning { colour, pattern }, booth { canopy, pattern, lights, counter, piece } (premium values need holding), sign, attendant.


<a name="createStallBook"></a>
# **createStallBook**
> CreateStallBookResponse createStallBook()

Book and pay for a pop-up stall: { street, spotIndex, rail, unit: \&quot;day\&quot;, startDate, days } or { ..., unit: \&quot;event\&quot;, eventIds }, optional booth { canopy, pattern, lights, counter, piece } (premium values need holding; checked before paying). Paid up front; full-access token and Idempotency-Key required.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StallsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StallsApi apiInstance = new StallsApi(defaultClient);
    try {
      CreateStallBookResponse result = apiInstance.createStallBook();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StallsApi#createStallBook");
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

**CreateStallBookResponse**

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

<a name="createStallBookingCancel"></a>
# **createStallBookingCancel**
> CreateStallBookingCancelResponse createStallBookingCancel(id)

Cancel a stall before it opens: a full refund on the rail it was paid on. Final once it has opened.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StallsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StallsApi apiInstance = new StallsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateStallBookingCancelResponse result = apiInstance.createStallBookingCancel(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StallsApi#createStallBookingCancel");
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

**CreateStallBookingCancelResponse**

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

<a name="getStallBookingCounter"></a>
# **getStallBookingCounter**
> GetStallBookingCounterResponse getStallBookingCounter(id)

A stall counter: the listings you picked (in order), its booth kind and capacity.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StallsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StallsApi apiInstance = new StallsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetStallBookingCounterResponse result = apiInstance.getStallBookingCounter(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StallsApi#getStallBookingCounter");
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

**GetStallBookingCounterResponse**

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

<a name="getStallQuote"></a>
# **getStallQuote**
> GetStallQuoteResponse getStallQuote(street, spot, unit, start, days, events)

Quote a stall: street, spot, and either unit&#x3D;day with start (YYYY-MM-DD) and days, or unit&#x3D;event with events (comma-separated event ids). Returns the line items in cents, the rails the spot accepts and whether it is bookable.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StallsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StallsApi apiInstance = new StallsApi(defaultClient);
    String street = "street_example"; // String | 
    Integer spot = 56; // Integer | 
    String unit = "day"; // String | 
    String start = "start_example"; // String | YYYY-MM-DD (unit=day).
    Integer days = 56; // Integer | How many days (unit=day).
    String events = "events_example"; // String | Comma-separated street event ids (unit=event).
    try {
      GetStallQuoteResponse result = apiInstance.getStallQuote(street, spot, unit, start, days, events);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StallsApi#getStallQuote");
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
 **street** | **String**|  |
 **spot** | **Integer**|  |
 **unit** | **String**|  | [optional] [enum: day, event]
 **start** | **String**| YYYY-MM-DD (unit&#x3D;day). | [optional]
 **days** | **Integer**| How many days (unit&#x3D;day). | [optional]
 **events** | **String**| Comma-separated street event ids (unit&#x3D;event). | [optional]

### Return type

**GetStallQuoteResponse**

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

<a name="getStallStreetAerial"></a>
# **getStallStreetAerial**
> GetStallStreetAerialResponse getStallStreetAerial(slug)

A street from above for booking: every spot with its owner, booth size, counter capacity and price, the street events, and who is booked on each date.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StallsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StallsApi apiInstance = new StallsApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      GetStallStreetAerialResponse result = apiInstance.getStallStreetAerial(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StallsApi#getStallStreetAerial");
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
 **slug** | **String**|  |

### Return type

**GetStallStreetAerialResponse**

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

<a name="listStallListingSearch"></a>
# **listStallListingSearch**
> ListStallListingSearchResponse listStallListingSearch()

Search ANY of your live Crossly listings for a stall counter or convention booth: q, category, min, max (cents), street (marks what its terms allow), limit, offset.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StallsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StallsApi apiInstance = new StallsApi(defaultClient);
    try {
      ListStallListingSearchResponse result = apiInstance.listStallListingSearch();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StallsApi#listStallListingSearch");
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

**ListStallListingSearchResponse**

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

<a name="listStallMine"></a>
# **listStallMine**
> ListStallMineResponse listStallMine()

Your stall bookings, newest first, with visits, offers and sales while the stall was up.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StallsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StallsApi apiInstance = new StallsApi(defaultClient);
    try {
      ListStallMineResponse result = apiInstance.listStallMine();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StallsApi#listStallMine");
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

**ListStallMineResponse**

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

<a name="listStreetEvents"></a>
# **listStreetEvents**
> ListStreetEventsResponse listStreetEvents(slug)

Current and upcoming street events (Night Market, Swap Meet) on a street, soonest first.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StallsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StallsApi apiInstance = new StallsApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      ListStreetEventsResponse result = apiInstance.listStreetEvents(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StallsApi#listStreetEvents");
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
 **slug** | **String**|  |

### Return type

**ListStreetEventsResponse**

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

<a name="listStreetStalls"></a>
# **listStreetStalls**
> ListStreetStallsResponse listStreetStalls(slug)

Today&#39;s pop-up stalls on a street (each with its live listings, awning, sign and seller), plus the spots still free today. meta carries the street, the phase (day / night_market / swap_meet) and the free spots.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StallsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StallsApi apiInstance = new StallsApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      ListStreetStallsResponse result = apiInstance.listStreetStalls(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StallsApi#listStreetStalls");
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
 **slug** | **String**|  |

### Return type

**ListStreetStallsResponse**

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

<a name="updateStallBooking"></a>
# **updateStallBooking**
> CreateStallBookResponse updateStallBooking(id)

Change a booked stall before or while it is up: listingIds (up to 6 of your live listings), awning { colour, pattern }, booth { canopy, pattern, lights, counter, piece } (premium values need holding), sign, attendant.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.StallsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    StallsApi apiInstance = new StallsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateStallBookResponse result = apiInstance.updateStallBooking(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StallsApi#updateStallBooking");
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

**CreateStallBookResponse**

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

