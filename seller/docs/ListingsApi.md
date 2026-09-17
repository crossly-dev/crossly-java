# ListingsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createListing**](ListingsApi.md#createListing) | **POST** /v1/listings | Create a listing and fan out crosspost jobs across platforms.
[**createListingBulkCheckStatus**](ListingsApi.md#createListingBulkCheckStatus) | **POST** /v1/listings/bulk-check-status | Check listing status on platforms
[**createListingBulkCrosspost**](ListingsApi.md#createListingBulkCrosspost) | **POST** /v1/listings/bulk-crosspost | Bulk crosspost (no delist phase)
[**createListingBulkDelete**](ListingsApi.md#createListingBulkDelete) | **POST** /v1/listings/bulk-delete | Bulk archive + delist
[**createListingBulkDelist**](ListingsApi.md#createListingBulkDelist) | **POST** /v1/listings/bulk-delist | Bulk delist from platforms
[**createListingBulkDelistPreview**](ListingsApi.md#createListingBulkDelistPreview) | **POST** /v1/listings/bulk-delist-preview | Preview which marketplaces a delist would touch
[**createListingBulkHardDelete**](ListingsApi.md#createListingBulkHardDelete) | **POST** /v1/listings/bulk-hard-delete | Permanently delete archived listings
[**createListingBulkRelist**](ListingsApi.md#createListingBulkRelist) | **POST** /v1/listings/bulk-relist | Bulk relist across platforms
[**createListingBulkUpdate**](ListingsApi.md#createListingBulkUpdate) | **POST** /v1/listings/bulk-update | Bulk update listing fields
[**createListingById**](ListingsApi.md#createListingById) | **POST** /v1/listings/by-ids | Fetch hydrated listings by ID
[**createListingCheckDuplicate**](ListingsApi.md#createListingCheckDuplicate) | **POST** /v1/listings/check-duplicates | Check whether the seller already owns something matching this title/photo, and what to do about it.
[**createListingCombine**](ListingsApi.md#createListingCombine) | **POST** /v1/listings/combine | Combine duplicate listings into one: sums their stock, delists and archives the rest.
[**createListingDiscrepancyResolve**](ListingsApi.md#createListingDiscrepancyResolve) | **POST** /v1/listings/{id}/discrepancies/{discrepancyId}/resolve | Resolve a detected marketplace-drift discrepancy: accept the platform value, push ours back, relist to apply it, or dismiss.
[**createListingImportByUrl**](ListingsApi.md#createListingImportByUrl) | **POST** /v1/listings/{id}/import-by-url | Attach a real platform listing to this listing by pasting its live URL.
[**createListingMagicFill**](ListingsApi.md#createListingMagicFill) | **POST** /v1/listings/{id}/magic-fill | Auto-fill empty fields on one platform tab from the master listing + AI/deterministic taxonomy resolution.
[**deleteListing**](ListingsApi.md#deleteListing) | **DELETE** /v1/listings/{id} | Delist a listing (optionally narrowed to specific platforms via ?platforms&#x3D;).
[**getListing**](ListingsApi.md#getListing) | **GET** /v1/listings/{id} | Get one listing with its platform rows.
[**getListingFacet**](ListingsApi.md#getListingFacet) | **GET** /v1/listings/facets | Distinct brands + categories across listings + inventory.
[**getListingSkuExist**](ListingsApi.md#getListingSkuExist) | **GET** /v1/listings/sku-exists | Check whether a SKU is already used by one of this user&#39;s items.
[**listListingDiscrepancies**](ListingsApi.md#listListingDiscrepancies) | **GET** /v1/listings/{id}/discrepancies | List detected marketplace-drift discrepancies for a listing.
[**listListingIds**](ListingsApi.md#listListingIds) | **GET** /v1/listings/ids | Filter listings → return matching id list (no pagination).
[**listListings**](ListingsApi.md#listListings) | **GET** /v1/listings | List active platform listings.
[**updateListing**](ListingsApi.md#updateListing) | **PATCH** /v1/listings/{id} | Edit a listing and fan out update jobs to existing platform listings.


<a name="createListing"></a>
# **createListing**
> CreateListingResponse createListing()

Create a listing and fan out crosspost jobs across platforms.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.ListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ListingsApi apiInstance = new ListingsApi(defaultClient);
    try {
      CreateListingResponse result = apiInstance.createListing();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListingsApi#createListing");
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

[**CreateListingResponse**](CreateListingResponse.md)

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

<a name="createListingBulkCheckStatus"></a>
# **createListingBulkCheckStatus**
> CreateListingBulkCheckStatusResponse createListingBulkCheckStatus()

Check listing status on platforms

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.ListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ListingsApi apiInstance = new ListingsApi(defaultClient);
    try {
      CreateListingBulkCheckStatusResponse result = apiInstance.createListingBulkCheckStatus();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListingsApi#createListingBulkCheckStatus");
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

[**CreateListingBulkCheckStatusResponse**](CreateListingBulkCheckStatusResponse.md)

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

<a name="createListingBulkCrosspost"></a>
# **createListingBulkCrosspost**
> CreateListingBulkCrosspostResponse createListingBulkCrosspost()

Bulk crosspost (no delist phase)

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.ListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ListingsApi apiInstance = new ListingsApi(defaultClient);
    try {
      CreateListingBulkCrosspostResponse result = apiInstance.createListingBulkCrosspost();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListingsApi#createListingBulkCrosspost");
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

[**CreateListingBulkCrosspostResponse**](CreateListingBulkCrosspostResponse.md)

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

<a name="createListingBulkDelete"></a>
# **createListingBulkDelete**
> CreateListingBulkDeleteResponse createListingBulkDelete()

Bulk archive + delist

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.ListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ListingsApi apiInstance = new ListingsApi(defaultClient);
    try {
      CreateListingBulkDeleteResponse result = apiInstance.createListingBulkDelete();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListingsApi#createListingBulkDelete");
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

[**CreateListingBulkDeleteResponse**](CreateListingBulkDeleteResponse.md)

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

<a name="createListingBulkDelist"></a>
# **createListingBulkDelist**
> CreateListingBulkDelistResponse createListingBulkDelist()

Bulk delist from platforms

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.ListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ListingsApi apiInstance = new ListingsApi(defaultClient);
    try {
      CreateListingBulkDelistResponse result = apiInstance.createListingBulkDelist();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListingsApi#createListingBulkDelist");
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

[**CreateListingBulkDelistResponse**](CreateListingBulkDelistResponse.md)

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

<a name="createListingBulkDelistPreview"></a>
# **createListingBulkDelistPreview**
> CreateListingBulkDelistPreviewResponse createListingBulkDelistPreview()

Preview which marketplaces a delist would touch

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.ListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ListingsApi apiInstance = new ListingsApi(defaultClient);
    try {
      CreateListingBulkDelistPreviewResponse result = apiInstance.createListingBulkDelistPreview();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListingsApi#createListingBulkDelistPreview");
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

[**CreateListingBulkDelistPreviewResponse**](CreateListingBulkDelistPreviewResponse.md)

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

<a name="createListingBulkHardDelete"></a>
# **createListingBulkHardDelete**
> CreateListingBulkHardDeleteResponse createListingBulkHardDelete()

Permanently delete archived listings

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.ListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ListingsApi apiInstance = new ListingsApi(defaultClient);
    try {
      CreateListingBulkHardDeleteResponse result = apiInstance.createListingBulkHardDelete();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListingsApi#createListingBulkHardDelete");
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

[**CreateListingBulkHardDeleteResponse**](CreateListingBulkHardDeleteResponse.md)

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

<a name="createListingBulkRelist"></a>
# **createListingBulkRelist**
> CreateListingBulkRelistResponse createListingBulkRelist()

Bulk relist across platforms

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.ListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ListingsApi apiInstance = new ListingsApi(defaultClient);
    try {
      CreateListingBulkRelistResponse result = apiInstance.createListingBulkRelist();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListingsApi#createListingBulkRelist");
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

[**CreateListingBulkRelistResponse**](CreateListingBulkRelistResponse.md)

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

<a name="createListingBulkUpdate"></a>
# **createListingBulkUpdate**
> CreateListingBulkUpdateResponse createListingBulkUpdate()

Bulk update listing fields

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.ListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ListingsApi apiInstance = new ListingsApi(defaultClient);
    try {
      CreateListingBulkUpdateResponse result = apiInstance.createListingBulkUpdate();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListingsApi#createListingBulkUpdate");
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

[**CreateListingBulkUpdateResponse**](CreateListingBulkUpdateResponse.md)

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

<a name="createListingById"></a>
# **createListingById**
> CreateListingByIdResponse createListingById()

Fetch hydrated listings by ID

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.ListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ListingsApi apiInstance = new ListingsApi(defaultClient);
    try {
      CreateListingByIdResponse result = apiInstance.createListingById();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListingsApi#createListingById");
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

[**CreateListingByIdResponse**](CreateListingByIdResponse.md)

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

<a name="createListingCheckDuplicate"></a>
# **createListingCheckDuplicate**
> CreateListingCheckDuplicateResponse createListingCheckDuplicate()

Check whether the seller already owns something matching this title/photo, and what to do about it.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.ListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ListingsApi apiInstance = new ListingsApi(defaultClient);
    try {
      CreateListingCheckDuplicateResponse result = apiInstance.createListingCheckDuplicate();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListingsApi#createListingCheckDuplicate");
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

[**CreateListingCheckDuplicateResponse**](CreateListingCheckDuplicateResponse.md)

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

<a name="createListingCombine"></a>
# **createListingCombine**
> CreateListingCombineResponse createListingCombine()

Combine duplicate listings into one: sums their stock, delists and archives the rest.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.ListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ListingsApi apiInstance = new ListingsApi(defaultClient);
    try {
      CreateListingCombineResponse result = apiInstance.createListingCombine();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListingsApi#createListingCombine");
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

[**CreateListingCombineResponse**](CreateListingCombineResponse.md)

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

<a name="createListingDiscrepancyResolve"></a>
# **createListingDiscrepancyResolve**
> CreateListingDiscrepancyResolveResponse createListingDiscrepancyResolve(id, discrepancyId)

Resolve a detected marketplace-drift discrepancy: accept the platform value, push ours back, relist to apply it, or dismiss.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.ListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ListingsApi apiInstance = new ListingsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    UUID discrepancyId = UUID.randomUUID(); // UUID | 
    try {
      CreateListingDiscrepancyResolveResponse result = apiInstance.createListingDiscrepancyResolve(id, discrepancyId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListingsApi#createListingDiscrepancyResolve");
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
 **discrepancyId** | **UUID**|  |

### Return type

[**CreateListingDiscrepancyResolveResponse**](CreateListingDiscrepancyResolveResponse.md)

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

<a name="createListingImportByUrl"></a>
# **createListingImportByUrl**
> CreateListingImportByUrlResponse createListingImportByUrl(id)

Attach a real platform listing to this listing by pasting its live URL.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.ListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ListingsApi apiInstance = new ListingsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateListingImportByUrlResponse result = apiInstance.createListingImportByUrl(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListingsApi#createListingImportByUrl");
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

[**CreateListingImportByUrlResponse**](CreateListingImportByUrlResponse.md)

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

<a name="createListingMagicFill"></a>
# **createListingMagicFill**
> CreateListingMagicFillResponse createListingMagicFill(id)

Auto-fill empty fields on one platform tab from the master listing + AI/deterministic taxonomy resolution.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.ListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ListingsApi apiInstance = new ListingsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateListingMagicFillResponse result = apiInstance.createListingMagicFill(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListingsApi#createListingMagicFill");
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

[**CreateListingMagicFillResponse**](CreateListingMagicFillResponse.md)

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

<a name="deleteListing"></a>
# **deleteListing**
> DeleteListingResponse deleteListing(id, platforms)

Delist a listing (optionally narrowed to specific platforms via ?platforms&#x3D;).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.ListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ListingsApi apiInstance = new ListingsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    String platforms = "platforms_example"; // String | Comma-separated platform slugs to limit the delist fan-out.
    try {
      DeleteListingResponse result = apiInstance.deleteListing(id, platforms);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListingsApi#deleteListing");
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
 **platforms** | **String**| Comma-separated platform slugs to limit the delist fan-out. | [optional]

### Return type

[**DeleteListingResponse**](DeleteListingResponse.md)

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

<a name="getListing"></a>
# **getListing**
> GetListingResponse getListing(id)

Get one listing with its platform rows.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.ListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ListingsApi apiInstance = new ListingsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      GetListingResponse result = apiInstance.getListing(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListingsApi#getListing");
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

[**GetListingResponse**](GetListingResponse.md)

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

<a name="getListingFacet"></a>
# **getListingFacet**
> GetListingFacetResponse getListingFacet()

Distinct brands + categories across listings + inventory.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.ListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ListingsApi apiInstance = new ListingsApi(defaultClient);
    try {
      GetListingFacetResponse result = apiInstance.getListingFacet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListingsApi#getListingFacet");
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

[**GetListingFacetResponse**](GetListingFacetResponse.md)

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

<a name="getListingSkuExist"></a>
# **getListingSkuExist**
> GetListingSkuExistResponse getListingSkuExist(sku)

Check whether a SKU is already used by one of this user&#39;s items.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.ListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ListingsApi apiInstance = new ListingsApi(defaultClient);
    String sku = "sku_example"; // String | 
    try {
      GetListingSkuExistResponse result = apiInstance.getListingSkuExist(sku);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListingsApi#getListingSkuExist");
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
 **sku** | **String**|  |

### Return type

[**GetListingSkuExistResponse**](GetListingSkuExistResponse.md)

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

<a name="listListingDiscrepancies"></a>
# **listListingDiscrepancies**
> V1List listListingDiscrepancies(id)

List detected marketplace-drift discrepancies for a listing.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.ListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ListingsApi apiInstance = new ListingsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      V1List result = apiInstance.listListingDiscrepancies(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListingsApi#listListingDiscrepancies");
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

<a name="listListingIds"></a>
# **listListingIds**
> V1List listListingIds()

Filter listings → return matching id list (no pagination).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.ListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ListingsApi apiInstance = new ListingsApi(defaultClient);
    try {
      V1List result = apiInstance.listListingIds();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListingsApi#listListingIds");
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

<a name="listListings"></a>
# **listListings**
> V1List listListings(page, limit, platform, status)

List active platform listings.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.ListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ListingsApi apiInstance = new ListingsApi(defaultClient);
    Integer page = 1; // Integer | 
    Integer limit = 25; // Integer | 
    String platform = "platform_example"; // String | 
    String status = "status_example"; // String | 
    try {
      V1List result = apiInstance.listListings(page, limit, platform, status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListingsApi#listListings");
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
 **platform** | **String**|  | [optional]
 **status** | **String**|  | [optional]

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

<a name="updateListing"></a>
# **updateListing**
> UpdateListingResponse updateListing(id)

Edit a listing and fan out update jobs to existing platform listings.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.ListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ListingsApi apiInstance = new ListingsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      UpdateListingResponse result = apiInstance.updateListing(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListingsApi#updateListing");
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

[**UpdateListingResponse**](UpdateListingResponse.md)

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

