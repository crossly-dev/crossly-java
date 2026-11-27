# WorldsGalleryApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorldExperienceGallery**](WorldsGalleryApi.md#createWorldExperienceGallery) | **POST** /v1/worlds/experiences/{experienceId}/gallery | Add an uploaded screenshot or video (your own upload&#39;s publicUrl; a video may carry a poster image). Images are scanned at once; every item waits for a person and shows on the game&#39;s page once approved.
[**createWorldExperienceGalleryUploadUrl**](WorldsGalleryApi.md#createWorldExperienceGalleryUploadUrl) | **POST** /v1/worlds/experiences/{experienceId}/gallery/upload-url | A presigned upload for a gallery screenshot (JPEG/PNG/WebP/GIF, ≤ 10 MB) or video (MP4/QuickTime/WebM): PUT the file to uploadUrl with the same Content-Type and exact Content-Length, then add publicUrl to the gallery.
[**deleteWorldExperienceGallery**](WorldsGalleryApi.md#deleteWorldExperienceGallery) | **DELETE** /v1/worlds/experiences/{experienceId}/gallery/{mediaId} | Take an item off the game&#39;s page now.
[**getWorldExperienceGallery**](WorldsGalleryApi.md#getWorldExperienceGallery) | **GET** /v1/worlds/experiences/{experienceId}/gallery | The game&#39;s gallery: every screenshot and video with its review state (pending / approved / rejected with the reviewer&#39;s note), position and caption, plus the limits.
[**updateWorldExperienceGallery**](WorldsGalleryApi.md#updateWorldExperienceGallery) | **PATCH** /v1/worlds/experiences/{experienceId}/gallery/{mediaId} | Change an item&#39;s caption (filtered; an approved item with a new caption goes back to review).
[**updateWorldExperienceGalleryOrder**](WorldsGalleryApi.md#updateWorldExperienceGalleryOrder) | **PUT** /v1/worlds/experiences/{experienceId}/gallery/order | Set the order on the game&#39;s page: the ids you list first, the rest after in their current order.
[**updateWorldExperienceGalleryRole**](WorldsGalleryApi.md#updateWorldExperienceGalleryRole) | **PUT** /v1/worlds/experiences/{experienceId}/gallery/{mediaId}/role | Make an item the game&#39;s icon or thumbnail (an image), its trailer (a video), or put it back in the gallery. The previous holder of that role goes back to the gallery.
[**updateWorldExperienceGalleryTrailerUrl**](WorldsGalleryApi.md#updateWorldExperienceGalleryTrailerUrl) | **PUT** /v1/worlds/experiences/{experienceId}/gallery/trailer-url | Set the game&#39;s trailer to a YouTube or Vimeo video link (https; youtube.com, youtu.be, vimeo.com, player.vimeo.com only; any other host is 400 trailer_host_not_allowed). It waits for a person like any gallery item; the current trailer goes back to the gallery (an uploaded clip) or off the page (a link).


<a name="createWorldExperienceGallery"></a>
# **createWorldExperienceGallery**
> WorldExperienceGalleryResponse createWorldExperienceGallery(experienceId)

Add an uploaded screenshot or video (your own upload&#39;s publicUrl; a video may carry a poster image). Images are scanned at once; every item waits for a person and shows on the game&#39;s page once approved.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsGalleryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsGalleryApi apiInstance = new WorldsGalleryApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      WorldExperienceGalleryResponse result = apiInstance.createWorldExperienceGallery(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsGalleryApi#createWorldExperienceGallery");
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

**WorldExperienceGalleryResponse**

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

<a name="createWorldExperienceGalleryUploadUrl"></a>
# **createWorldExperienceGalleryUploadUrl**
> CreateWorldExperienceGalleryUploadUrlResponse createWorldExperienceGalleryUploadUrl(experienceId)

A presigned upload for a gallery screenshot (JPEG/PNG/WebP/GIF, ≤ 10 MB) or video (MP4/QuickTime/WebM): PUT the file to uploadUrl with the same Content-Type and exact Content-Length, then add publicUrl to the gallery.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsGalleryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsGalleryApi apiInstance = new WorldsGalleryApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      CreateWorldExperienceGalleryUploadUrlResponse result = apiInstance.createWorldExperienceGalleryUploadUrl(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsGalleryApi#createWorldExperienceGalleryUploadUrl");
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

**CreateWorldExperienceGalleryUploadUrlResponse**

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

<a name="deleteWorldExperienceGallery"></a>
# **deleteWorldExperienceGallery**
> DeleteSpatialSceneGrantResponse deleteWorldExperienceGallery(experienceId, mediaId)

Take an item off the game&#39;s page now.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsGalleryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsGalleryApi apiInstance = new WorldsGalleryApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String mediaId = "mediaId_example"; // String | 
    try {
      DeleteSpatialSceneGrantResponse result = apiInstance.deleteWorldExperienceGallery(experienceId, mediaId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsGalleryApi#deleteWorldExperienceGallery");
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
 **mediaId** | **String**|  |

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

<a name="getWorldExperienceGallery"></a>
# **getWorldExperienceGallery**
> GetWorldExperienceGalleryResponse getWorldExperienceGallery(experienceId)

The game&#39;s gallery: every screenshot and video with its review state (pending / approved / rejected with the reviewer&#39;s note), position and caption, plus the limits.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsGalleryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsGalleryApi apiInstance = new WorldsGalleryApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      GetWorldExperienceGalleryResponse result = apiInstance.getWorldExperienceGallery(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsGalleryApi#getWorldExperienceGallery");
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

**GetWorldExperienceGalleryResponse**

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

<a name="updateWorldExperienceGallery"></a>
# **updateWorldExperienceGallery**
> WorldExperienceGalleryResponse updateWorldExperienceGallery(experienceId, mediaId)

Change an item&#39;s caption (filtered; an approved item with a new caption goes back to review).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsGalleryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsGalleryApi apiInstance = new WorldsGalleryApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String mediaId = "mediaId_example"; // String | 
    try {
      WorldExperienceGalleryResponse result = apiInstance.updateWorldExperienceGallery(experienceId, mediaId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsGalleryApi#updateWorldExperienceGallery");
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
 **mediaId** | **String**|  |

### Return type

**WorldExperienceGalleryResponse**

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

<a name="updateWorldExperienceGalleryOrder"></a>
# **updateWorldExperienceGalleryOrder**
> UpdateWorldExperienceGalleryRoleResponse updateWorldExperienceGalleryOrder(experienceId)

Set the order on the game&#39;s page: the ids you list first, the rest after in their current order.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsGalleryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsGalleryApi apiInstance = new WorldsGalleryApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      UpdateWorldExperienceGalleryRoleResponse result = apiInstance.updateWorldExperienceGalleryOrder(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsGalleryApi#updateWorldExperienceGalleryOrder");
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

**UpdateWorldExperienceGalleryRoleResponse**

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

<a name="updateWorldExperienceGalleryRole"></a>
# **updateWorldExperienceGalleryRole**
> UpdateWorldExperienceGalleryRoleResponse updateWorldExperienceGalleryRole(experienceId, mediaId)

Make an item the game&#39;s icon or thumbnail (an image), its trailer (a video), or put it back in the gallery. The previous holder of that role goes back to the gallery.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsGalleryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsGalleryApi apiInstance = new WorldsGalleryApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String mediaId = "mediaId_example"; // String | 
    try {
      UpdateWorldExperienceGalleryRoleResponse result = apiInstance.updateWorldExperienceGalleryRole(experienceId, mediaId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsGalleryApi#updateWorldExperienceGalleryRole");
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
 **mediaId** | **String**|  |

### Return type

**UpdateWorldExperienceGalleryRoleResponse**

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

<a name="updateWorldExperienceGalleryTrailerUrl"></a>
# **updateWorldExperienceGalleryTrailerUrl**
> WorldExperienceGalleryResponse updateWorldExperienceGalleryTrailerUrl(experienceId)

Set the game&#39;s trailer to a YouTube or Vimeo video link (https; youtube.com, youtu.be, vimeo.com, player.vimeo.com only; any other host is 400 trailer_host_not_allowed). It waits for a person like any gallery item; the current trailer goes back to the gallery (an uploaded clip) or off the page (a link).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsGalleryApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsGalleryApi apiInstance = new WorldsGalleryApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      WorldExperienceGalleryResponse result = apiInstance.updateWorldExperienceGalleryTrailerUrl(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsGalleryApi#updateWorldExperienceGalleryTrailerUrl");
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

**WorldExperienceGalleryResponse**

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

