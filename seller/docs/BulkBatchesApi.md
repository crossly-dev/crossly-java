# BulkBatchesApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBulkBatch**](BulkBatchesApi.md#createBulkBatch) | **POST** /v1/bulk-batches | Open an empty capture batch for a preset.
[**createBulkBatchIdentify**](BulkBatchesApi.md#createBulkBatchIdentify) | **POST** /v1/bulk-batches/{id}/identify | Identify items: match to Crossly Market, Magic List, or auto (by preset). Runs in the background.
[**createBulkBatchItem**](BulkBatchesApi.md#createBulkBatchItem) | **POST** /v1/bulk-batches/{id}/items | Append one item (every photo of it, primary first).
[**createBulkBatchItemBulk**](BulkBatchesApi.md#createBulkBatchItemBulk) | **POST** /v1/bulk-batches/{id}/items/bulk | Set price/quantity/condition/status on many items.
[**createBulkBatchPublish**](BulkBatchesApi.md#createBulkBatchPublish) | **POST** /v1/bulk-batches/{id}/publish | Publish reviewed items: drafts only (default) or live on destinations; adds quantity to an existing matching listing.
[**deleteBulkBatch**](BulkBatchesApi.md#deleteBulkBatch) | **DELETE** /v1/bulk-batches/{id} | Discard a batch (listings it produced stay).
[**deleteBulkBatchItem**](BulkBatchesApi.md#deleteBulkBatchItem) | **DELETE** /v1/bulk-batches/items/{id} | Remove one unpublished item.
[**getBulkBatch**](BulkBatchesApi.md#getBulkBatch) | **GET** /v1/bulk-batches/{id} | Get one bulk batch with its items (capture order) and matched catalog rows.
[**listBulkBatches**](BulkBatchesApi.md#listBulkBatches) | **GET** /v1/bulk-batches | List recent bulk list batches, newest first.
[**updateBulkBatch**](BulkBatchesApi.md#updateBulkBatch) | **PATCH** /v1/bulk-batches/{id} | Change batch settings, or set stage \&quot;identify\&quot; when capture is done.
[**updateBulkBatchItem**](BulkBatchesApi.md#updateBulkBatchItem) | **PATCH** /v1/bulk-batches/items/{id} | Correct one item (match, title, price, photos…).


<a name="createBulkBatch"></a>
# **createBulkBatch**
> ListBulkBatchesItem createBulkBatch()

Open an empty capture batch for a preset.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.BulkBatchesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    BulkBatchesApi apiInstance = new BulkBatchesApi(defaultClient);
    try {
      ListBulkBatchesItem result = apiInstance.createBulkBatch();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkBatchesApi#createBulkBatch");
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

**ListBulkBatchesItem**

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

<a name="createBulkBatchIdentify"></a>
# **createBulkBatchIdentify**
> CreateBulkBatchIdentifyResponse createBulkBatchIdentify(id)

Identify items: match to Crossly Market, Magic List, or auto (by preset). Runs in the background.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.BulkBatchesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    BulkBatchesApi apiInstance = new BulkBatchesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateBulkBatchIdentifyResponse result = apiInstance.createBulkBatchIdentify(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkBatchesApi#createBulkBatchIdentify");
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

**CreateBulkBatchIdentifyResponse**

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

<a name="createBulkBatchItem"></a>
# **createBulkBatchItem**
> CreateBulkBatchItemResponse createBulkBatchItem(id)

Append one item (every photo of it, primary first).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.BulkBatchesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    BulkBatchesApi apiInstance = new BulkBatchesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateBulkBatchItemResponse result = apiInstance.createBulkBatchItem(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkBatchesApi#createBulkBatchItem");
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

**CreateBulkBatchItemResponse**

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

<a name="createBulkBatchItemBulk"></a>
# **createBulkBatchItemBulk**
> UpdatedResponse createBulkBatchItemBulk(id)

Set price/quantity/condition/status on many items.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.BulkBatchesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    BulkBatchesApi apiInstance = new BulkBatchesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      UpdatedResponse result = apiInstance.createBulkBatchItemBulk(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkBatchesApi#createBulkBatchItemBulk");
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

**UpdatedResponse**

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

<a name="createBulkBatchPublish"></a>
# **createBulkBatchPublish**
> CreateBulkBatchPublishResponse createBulkBatchPublish(id)

Publish reviewed items: drafts only (default) or live on destinations; adds quantity to an existing matching listing.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.BulkBatchesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    BulkBatchesApi apiInstance = new BulkBatchesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateBulkBatchPublishResponse result = apiInstance.createBulkBatchPublish(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkBatchesApi#createBulkBatchPublish");
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

**CreateBulkBatchPublishResponse**

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

<a name="deleteBulkBatch"></a>
# **deleteBulkBatch**
> OkResponse deleteBulkBatch(id)

Discard a batch (listings it produced stay).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.BulkBatchesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    BulkBatchesApi apiInstance = new BulkBatchesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      OkResponse result = apiInstance.deleteBulkBatch(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkBatchesApi#deleteBulkBatch");
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

<a name="deleteBulkBatchItem"></a>
# **deleteBulkBatchItem**
> OkResponse deleteBulkBatchItem(id)

Remove one unpublished item.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.BulkBatchesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    BulkBatchesApi apiInstance = new BulkBatchesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      OkResponse result = apiInstance.deleteBulkBatchItem(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkBatchesApi#deleteBulkBatchItem");
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

<a name="getBulkBatch"></a>
# **getBulkBatch**
> GetBulkBatchResponse getBulkBatch(id)

Get one bulk batch with its items (capture order) and matched catalog rows.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.BulkBatchesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    BulkBatchesApi apiInstance = new BulkBatchesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      GetBulkBatchResponse result = apiInstance.getBulkBatch(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkBatchesApi#getBulkBatch");
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

**GetBulkBatchResponse**

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

<a name="listBulkBatches"></a>
# **listBulkBatches**
> ListBulkBatchesResponse listBulkBatches(limit)

List recent bulk list batches, newest first.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.BulkBatchesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    BulkBatchesApi apiInstance = new BulkBatchesApi(defaultClient);
    Integer limit = 56; // Integer | 
    try {
      ListBulkBatchesResponse result = apiInstance.listBulkBatches(limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkBatchesApi#listBulkBatches");
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
 **limit** | **Integer**|  | [optional]

### Return type

**ListBulkBatchesResponse**

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

<a name="updateBulkBatch"></a>
# **updateBulkBatch**
> ListBulkBatchesItem updateBulkBatch(id)

Change batch settings, or set stage \&quot;identify\&quot; when capture is done.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.BulkBatchesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    BulkBatchesApi apiInstance = new BulkBatchesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      ListBulkBatchesItem result = apiInstance.updateBulkBatch(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkBatchesApi#updateBulkBatch");
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

**ListBulkBatchesItem**

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

<a name="updateBulkBatchItem"></a>
# **updateBulkBatchItem**
> CreateBulkBatchItemResponse updateBulkBatchItem(id)

Correct one item (match, title, price, photos…).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.BulkBatchesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    BulkBatchesApi apiInstance = new BulkBatchesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateBulkBatchItemResponse result = apiInstance.updateBulkBatchItem(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BulkBatchesApi#updateBulkBatchItem");
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

**CreateBulkBatchItemResponse**

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

