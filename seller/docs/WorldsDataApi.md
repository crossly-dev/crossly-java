# WorldsDataApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorldExperienceDatastoreEntryIncrement**](WorldsDataApi.md#createWorldExperienceDatastoreEntryIncrement) | **POST** /v1/worlds/experiences/{experienceId}/datastores/{store}/entries/{key}/increment | Atomically add &#x60;by&#x60; to a numeric key (absent counts as 0).
[**createWorldExperienceMemoryQueueItem**](WorldsDataApi.md#createWorldExperienceMemoryQueueItem) | **POST** /v1/worlds/experiences/{experienceId}/memory/queues/{queue}/items | Add an item to a MemoryStore queue (ttlSeconds ≤ 45 days, priority 0-1000).
[**createWorldExperienceMemoryQueueRead**](WorldsDataApi.md#createWorldExperienceMemoryQueueRead) | **POST** /v1/worlds/experiences/{experienceId}/memory/queues/{queue}/read | Read and hide up to &#x60;count&#x60; queue items for invisibilitySeconds; remove them with the readId.
[**createWorldExperienceMessaging**](WorldsDataApi.md#createWorldExperienceMessaging) | **POST** /v1/worlds/experiences/{experienceId}/messaging/{topic} | Publish a message (≤ 1 KB) to every live server of the experience subscribed to the topic.
[**createWorldExperienceOrderedEntryIncrement**](WorldsDataApi.md#createWorldExperienceOrderedEntryIncrement) | **POST** /v1/worlds/experiences/{experienceId}/ordered/{store}/entries/{key}/increment | Atomically add &#x60;by&#x60; to an OrderedStore entry.
[**deleteWorldExperienceDatastoreEntry**](WorldsDataApi.md#deleteWorldExperienceDatastoreEntry) | **DELETE** /v1/worlds/experiences/{experienceId}/datastores/{store}/entries/{key} | Remove a key (a tombstone version; history stays readable for 30 days). Honours If-Match.
[**deleteWorldExperienceMemoryMap**](WorldsDataApi.md#deleteWorldExperienceMemoryMap) | **DELETE** /v1/worlds/experiences/{experienceId}/memory/maps/{map}/{key} | Remove a hash map item.
[**deleteWorldExperienceMemoryQueueRead**](WorldsDataApi.md#deleteWorldExperienceMemoryQueueRead) | **DELETE** /v1/worlds/experiences/{experienceId}/memory/queues/{queue}/reads/{readId} | Remove the items of one read (409 if the read lapsed).
[**deleteWorldExperienceMemorySorted**](WorldsDataApi.md#deleteWorldExperienceMemorySorted) | **DELETE** /v1/worlds/experiences/{experienceId}/memory/sorted/{map}/{key} | Remove a sorted map item.
[**deleteWorldExperienceOrderedEntry**](WorldsDataApi.md#deleteWorldExperienceOrderedEntry) | **DELETE** /v1/worlds/experiences/{experienceId}/ordered/{store}/entries/{key} | Remove an OrderedStore entry.
[**getWorldExperienceDataUsage**](WorldsDataApi.md#getWorldExperienceDataUsage) | **GET** /v1/worlds/experiences/{experienceId}/data/usage | Live quotas and usage: CCU, request budgets per minute, DataStore storage, MemoryStore memory.
[**getWorldExperienceDatastoreEntry**](WorldsDataApi.md#getWorldExperienceDatastoreEntry) | **GET** /v1/worlds/experiences/{experienceId}/datastores/{store}/entries/{key} | The current value of a key: version (ETag \&quot;v&lt;n&gt;\&quot;), userIds and attributes.
[**getWorldExperienceDatastoreEntryVersion**](WorldsDataApi.md#getWorldExperienceDatastoreEntryVersion) | **GET** /v1/worlds/experiences/{experienceId}/datastores/{store}/entries/{key}/versions/{version} | One version of a key, including a removed one.
[**getWorldExperienceMemoryMap**](WorldsDataApi.md#getWorldExperienceMemoryMap) | **GET** /v1/worlds/experiences/{experienceId}/memory/maps/{map} | Items of a MemoryStore hash map (cursor-paged, unordered).
[**getWorldExperienceMemoryMapByKey**](WorldsDataApi.md#getWorldExperienceMemoryMapByKey) | **GET** /v1/worlds/experiences/{experienceId}/memory/maps/{map}/{key} | One MemoryStore hash map item with its version and expiry.
[**getWorldExperienceMemoryQueue**](WorldsDataApi.md#getWorldExperienceMemoryQueue) | **GET** /v1/worlds/experiences/{experienceId}/memory/queues/{queue} | Queue length (visible, in flight) and the head, without hiding anything.
[**getWorldExperienceMemorySorted**](WorldsDataApi.md#getWorldExperienceMemorySorted) | **GET** /v1/worlds/experiences/{experienceId}/memory/sorted/{map} | A MemoryStore sorted map in order (sortKey, then key); ?order&#x3D;&amp;cursor&#x3D;&amp;limit&#x3D;.
[**getWorldExperienceMemorySortedByKey**](WorldsDataApi.md#getWorldExperienceMemorySortedByKey) | **GET** /v1/worlds/experiences/{experienceId}/memory/sorted/{map}/{key} | One sorted map item.
[**getWorldExperienceOrdered**](WorldsDataApi.md#getWorldExperienceOrdered) | **GET** /v1/worlds/experiences/{experienceId}/ordered/{store} | An OrderedStore page ranked by value; ?order&#x3D;desc|asc&amp;min&#x3D;&amp;max&#x3D;&amp;cursor&#x3D;&amp;limit&#x3D;.
[**getWorldExperienceOrderedEntry**](WorldsDataApi.md#getWorldExperienceOrderedEntry) | **GET** /v1/worlds/experiences/{experienceId}/ordered/{store}/entries/{key} | One OrderedStore entry.
[**listWorldExperienceDatastoreEntries**](WorldsDataApi.md#listWorldExperienceDatastoreEntries) | **GET** /v1/worlds/experiences/{experienceId}/datastores/{store}/entries | Keys of a DataStore in key order; ?prefix&#x3D;&amp;scope&#x3D;&amp;cursor&#x3D;&amp;limit&#x3D;.
[**listWorldExperienceDatastoreEntryVersions**](WorldsDataApi.md#listWorldExperienceDatastoreEntryVersions) | **GET** /v1/worlds/experiences/{experienceId}/datastores/{store}/entries/{key}/versions | Versions of a key, newest first (30-day history; the current version is kept).
[**listWorldExperienceDatastores**](WorldsDataApi.md#listWorldExperienceDatastores) | **GET** /v1/worlds/experiences/{experienceId}/datastores | The DataStores of an experience, with key counts and bytes.
[**updateWorldExperienceDatastoreEntry**](WorldsDataApi.md#updateWorldExperienceDatastoreEntry) | **PUT** /v1/worlds/experiences/{experienceId}/datastores/{store}/entries/{key} | Write a new version. If-Match \&quot;v&lt;n&gt;\&quot; (or ifVersion) writes only at that version; If-None-Match: * only if absent. 412 on a mismatch.
[**updateWorldExperienceMemoryMap**](WorldsDataApi.md#updateWorldExperienceMemoryMap) | **PUT** /v1/worlds/experiences/{experienceId}/memory/maps/{map}/{key} | Set a hash map item (ttlSeconds required; ifVersion for compare-and-set).
[**updateWorldExperienceMemorySorted**](WorldsDataApi.md#updateWorldExperienceMemorySorted) | **PUT** /v1/worlds/experiences/{experienceId}/memory/sorted/{map}/{key} | Set a sorted map item (ttlSeconds, optional sortKey and ifVersion).
[**updateWorldExperienceOrderedEntry**](WorldsDataApi.md#updateWorldExperienceOrderedEntry) | **PUT** /v1/worlds/experiences/{experienceId}/ordered/{store}/entries/{key} | Set an OrderedStore entry to a whole number.


<a name="createWorldExperienceDatastoreEntryIncrement"></a>
# **createWorldExperienceDatastoreEntryIncrement**
> CreateWorldExperienceDatastoreEntryIncrementResponse createWorldExperienceDatastoreEntryIncrement(experienceId, store, key)

Atomically add &#x60;by&#x60; to a numeric key (absent counts as 0).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsDataApi apiInstance = new WorldsDataApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String store = "store_example"; // String | 
    String key = "key_example"; // String | 
    try {
      CreateWorldExperienceDatastoreEntryIncrementResponse result = apiInstance.createWorldExperienceDatastoreEntryIncrement(experienceId, store, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsDataApi#createWorldExperienceDatastoreEntryIncrement");
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
 **store** | **String**|  |
 **key** | **String**|  |

### Return type

**CreateWorldExperienceDatastoreEntryIncrementResponse**

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

<a name="createWorldExperienceMemoryQueueItem"></a>
# **createWorldExperienceMemoryQueueItem**
> CreateWorldPartyInviteResponse createWorldExperienceMemoryQueueItem(experienceId, queue)

Add an item to a MemoryStore queue (ttlSeconds ≤ 45 days, priority 0-1000).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsDataApi apiInstance = new WorldsDataApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String queue = "queue_example"; // String | 
    try {
      CreateWorldPartyInviteResponse result = apiInstance.createWorldExperienceMemoryQueueItem(experienceId, queue);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsDataApi#createWorldExperienceMemoryQueueItem");
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
 **queue** | **String**|  |

### Return type

**CreateWorldPartyInviteResponse**

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

<a name="createWorldExperienceMemoryQueueRead"></a>
# **createWorldExperienceMemoryQueueRead**
> CreateWorldExperienceMemoryQueueReadResponse createWorldExperienceMemoryQueueRead(experienceId, queue)

Read and hide up to &#x60;count&#x60; queue items for invisibilitySeconds; remove them with the readId.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsDataApi apiInstance = new WorldsDataApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String queue = "queue_example"; // String | 
    try {
      CreateWorldExperienceMemoryQueueReadResponse result = apiInstance.createWorldExperienceMemoryQueueRead(experienceId, queue);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsDataApi#createWorldExperienceMemoryQueueRead");
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
 **queue** | **String**|  |

### Return type

**CreateWorldExperienceMemoryQueueReadResponse**

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

<a name="createWorldExperienceMessaging"></a>
# **createWorldExperienceMessaging**
> CreateWorldExperienceMessagingResponse createWorldExperienceMessaging(experienceId, topic)

Publish a message (≤ 1 KB) to every live server of the experience subscribed to the topic.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsDataApi apiInstance = new WorldsDataApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String topic = "topic_example"; // String | 
    try {
      CreateWorldExperienceMessagingResponse result = apiInstance.createWorldExperienceMessaging(experienceId, topic);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsDataApi#createWorldExperienceMessaging");
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
 **topic** | **String**|  |

### Return type

**CreateWorldExperienceMessagingResponse**

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

<a name="createWorldExperienceOrderedEntryIncrement"></a>
# **createWorldExperienceOrderedEntryIncrement**
> WorldExperienceOrderedEntryResponse createWorldExperienceOrderedEntryIncrement(experienceId, store, key)

Atomically add &#x60;by&#x60; to an OrderedStore entry.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsDataApi apiInstance = new WorldsDataApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String store = "store_example"; // String | 
    String key = "key_example"; // String | 
    try {
      WorldExperienceOrderedEntryResponse result = apiInstance.createWorldExperienceOrderedEntryIncrement(experienceId, store, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsDataApi#createWorldExperienceOrderedEntryIncrement");
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
 **store** | **String**|  |
 **key** | **String**|  |

### Return type

**WorldExperienceOrderedEntryResponse**

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

<a name="deleteWorldExperienceDatastoreEntry"></a>
# **deleteWorldExperienceDatastoreEntry**
> DeleteWorldExperienceDatastoreEntryResponse deleteWorldExperienceDatastoreEntry(experienceId, store, key)

Remove a key (a tombstone version; history stays readable for 30 days). Honours If-Match.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsDataApi apiInstance = new WorldsDataApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String store = "store_example"; // String | 
    String key = "key_example"; // String | 
    try {
      DeleteWorldExperienceDatastoreEntryResponse result = apiInstance.deleteWorldExperienceDatastoreEntry(experienceId, store, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsDataApi#deleteWorldExperienceDatastoreEntry");
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
 **store** | **String**|  |
 **key** | **String**|  |

### Return type

**DeleteWorldExperienceDatastoreEntryResponse**

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

<a name="deleteWorldExperienceMemoryMap"></a>
# **deleteWorldExperienceMemoryMap**
> DeleteSpatialSceneGrantResponse deleteWorldExperienceMemoryMap(experienceId, map, key)

Remove a hash map item.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsDataApi apiInstance = new WorldsDataApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String map = "map_example"; // String | 
    String key = "key_example"; // String | 
    try {
      DeleteSpatialSceneGrantResponse result = apiInstance.deleteWorldExperienceMemoryMap(experienceId, map, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsDataApi#deleteWorldExperienceMemoryMap");
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
 **map** | **String**|  |
 **key** | **String**|  |

### Return type

**DeleteSpatialSceneGrantResponse**

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

<a name="deleteWorldExperienceMemoryQueueRead"></a>
# **deleteWorldExperienceMemoryQueueRead**
> DeleteSpatialSceneNodeResponse deleteWorldExperienceMemoryQueueRead(experienceId, queue, readId)

Remove the items of one read (409 if the read lapsed).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsDataApi apiInstance = new WorldsDataApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String queue = "queue_example"; // String | 
    String readId = "readId_example"; // String | 
    try {
      DeleteSpatialSceneNodeResponse result = apiInstance.deleteWorldExperienceMemoryQueueRead(experienceId, queue, readId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsDataApi#deleteWorldExperienceMemoryQueueRead");
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
 **queue** | **String**|  |
 **readId** | **String**|  |

### Return type

**DeleteSpatialSceneNodeResponse**

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

<a name="deleteWorldExperienceMemorySorted"></a>
# **deleteWorldExperienceMemorySorted**
> DeleteSpatialSceneGrantResponse deleteWorldExperienceMemorySorted(experienceId, map, key)

Remove a sorted map item.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsDataApi apiInstance = new WorldsDataApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String map = "map_example"; // String | 
    String key = "key_example"; // String | 
    try {
      DeleteSpatialSceneGrantResponse result = apiInstance.deleteWorldExperienceMemorySorted(experienceId, map, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsDataApi#deleteWorldExperienceMemorySorted");
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
 **map** | **String**|  |
 **key** | **String**|  |

### Return type

**DeleteSpatialSceneGrantResponse**

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

<a name="deleteWorldExperienceOrderedEntry"></a>
# **deleteWorldExperienceOrderedEntry**
> DeleteWorldExperienceOrderedEntryResponse deleteWorldExperienceOrderedEntry(experienceId, store, key)

Remove an OrderedStore entry.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsDataApi apiInstance = new WorldsDataApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String store = "store_example"; // String | 
    String key = "key_example"; // String | 
    try {
      DeleteWorldExperienceOrderedEntryResponse result = apiInstance.deleteWorldExperienceOrderedEntry(experienceId, store, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsDataApi#deleteWorldExperienceOrderedEntry");
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
 **store** | **String**|  |
 **key** | **String**|  |

### Return type

**DeleteWorldExperienceOrderedEntryResponse**

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

<a name="getWorldExperienceDataUsage"></a>
# **getWorldExperienceDataUsage**
> GetWorldExperienceDataUsageResponse getWorldExperienceDataUsage(experienceId)

Live quotas and usage: CCU, request budgets per minute, DataStore storage, MemoryStore memory.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsDataApi apiInstance = new WorldsDataApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      GetWorldExperienceDataUsageResponse result = apiInstance.getWorldExperienceDataUsage(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsDataApi#getWorldExperienceDataUsage");
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

**GetWorldExperienceDataUsageResponse**

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

<a name="getWorldExperienceDatastoreEntry"></a>
# **getWorldExperienceDatastoreEntry**
> GetWorldExperienceDatastoreEntryResponse getWorldExperienceDatastoreEntry(experienceId, store, key)

The current value of a key: version (ETag \&quot;v&lt;n&gt;\&quot;), userIds and attributes.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsDataApi apiInstance = new WorldsDataApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String store = "store_example"; // String | 
    String key = "key_example"; // String | 
    try {
      GetWorldExperienceDatastoreEntryResponse result = apiInstance.getWorldExperienceDatastoreEntry(experienceId, store, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsDataApi#getWorldExperienceDatastoreEntry");
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
 **store** | **String**|  |
 **key** | **String**|  |

### Return type

**GetWorldExperienceDatastoreEntryResponse**

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

<a name="getWorldExperienceDatastoreEntryVersion"></a>
# **getWorldExperienceDatastoreEntryVersion**
> GetWorldExperienceDatastoreEntryResponse getWorldExperienceDatastoreEntryVersion(experienceId, store, key, version)

One version of a key, including a removed one.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsDataApi apiInstance = new WorldsDataApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String store = "store_example"; // String | 
    String key = "key_example"; // String | 
    String version = "version_example"; // String | 
    try {
      GetWorldExperienceDatastoreEntryResponse result = apiInstance.getWorldExperienceDatastoreEntryVersion(experienceId, store, key, version);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsDataApi#getWorldExperienceDatastoreEntryVersion");
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
 **store** | **String**|  |
 **key** | **String**|  |
 **version** | **String**|  |

### Return type

**GetWorldExperienceDatastoreEntryResponse**

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

<a name="getWorldExperienceMemoryMap"></a>
# **getWorldExperienceMemoryMap**
> GetWorldExperienceMemoryMapResponse getWorldExperienceMemoryMap(experienceId, map)

Items of a MemoryStore hash map (cursor-paged, unordered).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsDataApi apiInstance = new WorldsDataApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String map = "map_example"; // String | 
    try {
      GetWorldExperienceMemoryMapResponse result = apiInstance.getWorldExperienceMemoryMap(experienceId, map);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsDataApi#getWorldExperienceMemoryMap");
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
 **map** | **String**|  |

### Return type

**GetWorldExperienceMemoryMapResponse**

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

<a name="getWorldExperienceMemoryMapByKey"></a>
# **getWorldExperienceMemoryMapByKey**
> GetWorldExperienceMemoryMapByKeyResponse getWorldExperienceMemoryMapByKey(experienceId, map, key)

One MemoryStore hash map item with its version and expiry.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsDataApi apiInstance = new WorldsDataApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String map = "map_example"; // String | 
    String key = "key_example"; // String | 
    try {
      GetWorldExperienceMemoryMapByKeyResponse result = apiInstance.getWorldExperienceMemoryMapByKey(experienceId, map, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsDataApi#getWorldExperienceMemoryMapByKey");
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
 **map** | **String**|  |
 **key** | **String**|  |

### Return type

**GetWorldExperienceMemoryMapByKeyResponse**

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

<a name="getWorldExperienceMemoryQueue"></a>
# **getWorldExperienceMemoryQueue**
> GetWorldExperienceMemoryQueueResponse getWorldExperienceMemoryQueue(experienceId, queue)

Queue length (visible, in flight) and the head, without hiding anything.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsDataApi apiInstance = new WorldsDataApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String queue = "queue_example"; // String | 
    try {
      GetWorldExperienceMemoryQueueResponse result = apiInstance.getWorldExperienceMemoryQueue(experienceId, queue);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsDataApi#getWorldExperienceMemoryQueue");
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
 **queue** | **String**|  |

### Return type

**GetWorldExperienceMemoryQueueResponse**

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

<a name="getWorldExperienceMemorySorted"></a>
# **getWorldExperienceMemorySorted**
> GetWorldExperienceMemoryMapResponse getWorldExperienceMemorySorted(experienceId, map)

A MemoryStore sorted map in order (sortKey, then key); ?order&#x3D;&amp;cursor&#x3D;&amp;limit&#x3D;.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsDataApi apiInstance = new WorldsDataApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String map = "map_example"; // String | 
    try {
      GetWorldExperienceMemoryMapResponse result = apiInstance.getWorldExperienceMemorySorted(experienceId, map);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsDataApi#getWorldExperienceMemorySorted");
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
 **map** | **String**|  |

### Return type

**GetWorldExperienceMemoryMapResponse**

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

<a name="getWorldExperienceMemorySortedByKey"></a>
# **getWorldExperienceMemorySortedByKey**
> GetWorldExperienceMemoryMapByKeyResponse getWorldExperienceMemorySortedByKey(experienceId, map, key)

One sorted map item.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsDataApi apiInstance = new WorldsDataApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String map = "map_example"; // String | 
    String key = "key_example"; // String | 
    try {
      GetWorldExperienceMemoryMapByKeyResponse result = apiInstance.getWorldExperienceMemorySortedByKey(experienceId, map, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsDataApi#getWorldExperienceMemorySortedByKey");
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
 **map** | **String**|  |
 **key** | **String**|  |

### Return type

**GetWorldExperienceMemoryMapByKeyResponse**

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

<a name="getWorldExperienceOrdered"></a>
# **getWorldExperienceOrdered**
> GetWorldExperienceOrderedResponse getWorldExperienceOrdered(experienceId, store)

An OrderedStore page ranked by value; ?order&#x3D;desc|asc&amp;min&#x3D;&amp;max&#x3D;&amp;cursor&#x3D;&amp;limit&#x3D;.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsDataApi apiInstance = new WorldsDataApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String store = "store_example"; // String | 
    try {
      GetWorldExperienceOrderedResponse result = apiInstance.getWorldExperienceOrdered(experienceId, store);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsDataApi#getWorldExperienceOrdered");
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
 **store** | **String**|  |

### Return type

**GetWorldExperienceOrderedResponse**

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

<a name="getWorldExperienceOrderedEntry"></a>
# **getWorldExperienceOrderedEntry**
> WorldExperienceOrderedEntryResponse getWorldExperienceOrderedEntry(experienceId, store, key)

One OrderedStore entry.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsDataApi apiInstance = new WorldsDataApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String store = "store_example"; // String | 
    String key = "key_example"; // String | 
    try {
      WorldExperienceOrderedEntryResponse result = apiInstance.getWorldExperienceOrderedEntry(experienceId, store, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsDataApi#getWorldExperienceOrderedEntry");
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
 **store** | **String**|  |
 **key** | **String**|  |

### Return type

**WorldExperienceOrderedEntryResponse**

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

<a name="listWorldExperienceDatastoreEntries"></a>
# **listWorldExperienceDatastoreEntries**
> ListWorldExperienceDatastoreEntriesResponse listWorldExperienceDatastoreEntries(experienceId, store)

Keys of a DataStore in key order; ?prefix&#x3D;&amp;scope&#x3D;&amp;cursor&#x3D;&amp;limit&#x3D;.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsDataApi apiInstance = new WorldsDataApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String store = "store_example"; // String | 
    try {
      ListWorldExperienceDatastoreEntriesResponse result = apiInstance.listWorldExperienceDatastoreEntries(experienceId, store);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsDataApi#listWorldExperienceDatastoreEntries");
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
 **store** | **String**|  |

### Return type

**ListWorldExperienceDatastoreEntriesResponse**

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

<a name="listWorldExperienceDatastoreEntryVersions"></a>
# **listWorldExperienceDatastoreEntryVersions**
> ListWorldExperienceDatastoreEntryVersionsResponse listWorldExperienceDatastoreEntryVersions(experienceId, store, key)

Versions of a key, newest first (30-day history; the current version is kept).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsDataApi apiInstance = new WorldsDataApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String store = "store_example"; // String | 
    String key = "key_example"; // String | 
    try {
      ListWorldExperienceDatastoreEntryVersionsResponse result = apiInstance.listWorldExperienceDatastoreEntryVersions(experienceId, store, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsDataApi#listWorldExperienceDatastoreEntryVersions");
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
 **store** | **String**|  |
 **key** | **String**|  |

### Return type

**ListWorldExperienceDatastoreEntryVersionsResponse**

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

<a name="listWorldExperienceDatastores"></a>
# **listWorldExperienceDatastores**
> ListWorldExperienceDatastoresResponse listWorldExperienceDatastores(experienceId)

The DataStores of an experience, with key counts and bytes.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsDataApi apiInstance = new WorldsDataApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      ListWorldExperienceDatastoresResponse result = apiInstance.listWorldExperienceDatastores(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsDataApi#listWorldExperienceDatastores");
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

**ListWorldExperienceDatastoresResponse**

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

<a name="updateWorldExperienceDatastoreEntry"></a>
# **updateWorldExperienceDatastoreEntry**
> UpdateWorldExperienceDatastoreEntryResponse updateWorldExperienceDatastoreEntry(experienceId, store, key)

Write a new version. If-Match \&quot;v&lt;n&gt;\&quot; (or ifVersion) writes only at that version; If-None-Match: * only if absent. 412 on a mismatch.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsDataApi apiInstance = new WorldsDataApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String store = "store_example"; // String | 
    String key = "key_example"; // String | 
    try {
      UpdateWorldExperienceDatastoreEntryResponse result = apiInstance.updateWorldExperienceDatastoreEntry(experienceId, store, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsDataApi#updateWorldExperienceDatastoreEntry");
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
 **store** | **String**|  |
 **key** | **String**|  |

### Return type

**UpdateWorldExperienceDatastoreEntryResponse**

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

<a name="updateWorldExperienceMemoryMap"></a>
# **updateWorldExperienceMemoryMap**
> UpdateWorldExperienceMemoryMapResponse updateWorldExperienceMemoryMap(experienceId, map, key)

Set a hash map item (ttlSeconds required; ifVersion for compare-and-set).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsDataApi apiInstance = new WorldsDataApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String map = "map_example"; // String | 
    String key = "key_example"; // String | 
    try {
      UpdateWorldExperienceMemoryMapResponse result = apiInstance.updateWorldExperienceMemoryMap(experienceId, map, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsDataApi#updateWorldExperienceMemoryMap");
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
 **map** | **String**|  |
 **key** | **String**|  |

### Return type

**UpdateWorldExperienceMemoryMapResponse**

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

<a name="updateWorldExperienceMemorySorted"></a>
# **updateWorldExperienceMemorySorted**
> UpdateWorldExperienceMemoryMapResponse updateWorldExperienceMemorySorted(experienceId, map, key)

Set a sorted map item (ttlSeconds, optional sortKey and ifVersion).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsDataApi apiInstance = new WorldsDataApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String map = "map_example"; // String | 
    String key = "key_example"; // String | 
    try {
      UpdateWorldExperienceMemoryMapResponse result = apiInstance.updateWorldExperienceMemorySorted(experienceId, map, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsDataApi#updateWorldExperienceMemorySorted");
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
 **map** | **String**|  |
 **key** | **String**|  |

### Return type

**UpdateWorldExperienceMemoryMapResponse**

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

<a name="updateWorldExperienceOrderedEntry"></a>
# **updateWorldExperienceOrderedEntry**
> WorldExperienceOrderedEntryResponse updateWorldExperienceOrderedEntry(experienceId, store, key)

Set an OrderedStore entry to a whole number.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsDataApi apiInstance = new WorldsDataApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String store = "store_example"; // String | 
    String key = "key_example"; // String | 
    try {
      WorldExperienceOrderedEntryResponse result = apiInstance.updateWorldExperienceOrderedEntry(experienceId, store, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsDataApi#updateWorldExperienceOrderedEntry");
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
 **store** | **String**|  |
 **key** | **String**|  |

### Return type

**WorldExperienceOrderedEntryResponse**

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

