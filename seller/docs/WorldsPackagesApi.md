# WorldsPackagesApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorldExperiencePlacePackage**](WorldsPackagesApi.md#createWorldExperiencePlacePackage) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/packages | Insert a copy of a package (default: the newest version, auto-update on).
[**createWorldExperiencePlacePackageUpdate**](WorldsPackagesApi.md#createWorldExperiencePlacePackageUpdate) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/packages/{nodeId}/update | Update a copy to a version (default newest). A copy edited in the place needs force: true (its edits are replaced).
[**createWorldPackage**](WorldsPackagesApi.md#createWorldPackage) | **POST** /v1/worlds/packages | Create a package (v1) from one node (place JSON) or from a node in a place — which then becomes copy v1, auto-updating.
[**createWorldPackageToolbox**](WorldsPackagesApi.md#createWorldPackageToolbox) | **POST** /v1/worlds/packages/{packageId}/toolbox | List the latest version in the Toolbox as an asset of kind package (Toolbox review and pricing rules apply).
[**createWorldPackageVersion**](WorldsPackagesApi.md#createWorldPackageVersion) | **POST** /v1/worlds/packages/{packageId}/versions | Publish a new version; every auto-updating, unmodified copy in your places is updated through its co-editing session. Returns what happened per place.
[**deleteWorldPackage**](WorldsPackagesApi.md#deleteWorldPackage) | **DELETE** /v1/worlds/packages/{packageId} | Archive a package. Copies in places keep working; they just stop receiving updates.
[**getWorldPackage**](WorldsPackagesApi.md#getWorldPackage) | **GET** /v1/worlds/packages/{packageId} | A package with its versions.
[**getWorldPackageVersion**](WorldsPackagesApi.md#getWorldPackageVersion) | **GET** /v1/worlds/packages/{packageId}/versions/{number} | One version, with its payload (one root node in place JSON).
[**listWorldExperiencePlacePackages**](WorldsPackagesApi.md#listWorldExperiencePlacePackages) | **GET** /v1/worlds/experiences/{experienceId}/places/{placeId}/packages | Package copies in a place: version, newest version, modified, auto-update.
[**listWorldPackages**](WorldsPackagesApi.md#listWorldPackages) | **GET** /v1/worlds/packages | Your package library: reusable models and modules, newest first, with how many places hold copies.
[**updateWorldExperiencePlacePackage**](WorldsPackagesApi.md#updateWorldExperiencePlacePackage) | **PATCH** /v1/worlds/experiences/{experienceId}/places/{placeId}/packages/{nodeId} | Turn auto-update on or off for one copy.
[**updateWorldPackage**](WorldsPackagesApi.md#updateWorldPackage) | **PATCH** /v1/worlds/packages/{packageId} | Rename a package or change its description.


<a name="createWorldExperiencePlacePackage"></a>
# **createWorldExperiencePlacePackage**
> CreateWorldExperiencePlacePackageResponse createWorldExperiencePlacePackage(experienceId, placeId)

Insert a copy of a package (default: the newest version, auto-update on).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsPackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsPackagesApi apiInstance = new WorldsPackagesApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    try {
      CreateWorldExperiencePlacePackageResponse result = apiInstance.createWorldExperiencePlacePackage(experienceId, placeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsPackagesApi#createWorldExperiencePlacePackage");
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
 **placeId** | **String**|  |

### Return type

**CreateWorldExperiencePlacePackageResponse**

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

<a name="createWorldExperiencePlacePackageUpdate"></a>
# **createWorldExperiencePlacePackageUpdate**
> CreateWorldExperiencePlacePackageUpdateResponse createWorldExperiencePlacePackageUpdate(experienceId, placeId, nodeId)

Update a copy to a version (default newest). A copy edited in the place needs force: true (its edits are replaced).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsPackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsPackagesApi apiInstance = new WorldsPackagesApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    String nodeId = "nodeId_example"; // String | 
    try {
      CreateWorldExperiencePlacePackageUpdateResponse result = apiInstance.createWorldExperiencePlacePackageUpdate(experienceId, placeId, nodeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsPackagesApi#createWorldExperiencePlacePackageUpdate");
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
 **placeId** | **String**|  |
 **nodeId** | **String**|  |

### Return type

**CreateWorldExperiencePlacePackageUpdateResponse**

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

<a name="createWorldPackage"></a>
# **createWorldPackage**
> GetWorldPackageResponse createWorldPackage()

Create a package (v1) from one node (place JSON) or from a node in a place — which then becomes copy v1, auto-updating.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsPackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsPackagesApi apiInstance = new WorldsPackagesApi(defaultClient);
    try {
      GetWorldPackageResponse result = apiInstance.createWorldPackage();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsPackagesApi#createWorldPackage");
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

**GetWorldPackageResponse**

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

<a name="createWorldPackageToolbox"></a>
# **createWorldPackageToolbox**
> CreateWorldPackageToolboxResponse createWorldPackageToolbox(packageId)

List the latest version in the Toolbox as an asset of kind package (Toolbox review and pricing rules apply).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsPackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsPackagesApi apiInstance = new WorldsPackagesApi(defaultClient);
    String packageId = "packageId_example"; // String | 
    try {
      CreateWorldPackageToolboxResponse result = apiInstance.createWorldPackageToolbox(packageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsPackagesApi#createWorldPackageToolbox");
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
 **packageId** | **String**|  |

### Return type

**CreateWorldPackageToolboxResponse**

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

<a name="createWorldPackageVersion"></a>
# **createWorldPackageVersion**
> CreateWorldPackageVersionResponse createWorldPackageVersion(packageId)

Publish a new version; every auto-updating, unmodified copy in your places is updated through its co-editing session. Returns what happened per place.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsPackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsPackagesApi apiInstance = new WorldsPackagesApi(defaultClient);
    String packageId = "packageId_example"; // String | 
    try {
      CreateWorldPackageVersionResponse result = apiInstance.createWorldPackageVersion(packageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsPackagesApi#createWorldPackageVersion");
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
 **packageId** | **String**|  |

### Return type

**CreateWorldPackageVersionResponse**

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

<a name="deleteWorldPackage"></a>
# **deleteWorldPackage**
> DeleteWorldPackageResponse deleteWorldPackage(packageId)

Archive a package. Copies in places keep working; they just stop receiving updates.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsPackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsPackagesApi apiInstance = new WorldsPackagesApi(defaultClient);
    String packageId = "packageId_example"; // String | 
    try {
      DeleteWorldPackageResponse result = apiInstance.deleteWorldPackage(packageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsPackagesApi#deleteWorldPackage");
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
 **packageId** | **String**|  |

### Return type

**DeleteWorldPackageResponse**

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

<a name="getWorldPackage"></a>
# **getWorldPackage**
> GetWorldPackageResponse getWorldPackage(packageId)

A package with its versions.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsPackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsPackagesApi apiInstance = new WorldsPackagesApi(defaultClient);
    String packageId = "packageId_example"; // String | 
    try {
      GetWorldPackageResponse result = apiInstance.getWorldPackage(packageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsPackagesApi#getWorldPackage");
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
 **packageId** | **String**|  |

### Return type

**GetWorldPackageResponse**

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

<a name="getWorldPackageVersion"></a>
# **getWorldPackageVersion**
> GetWorldPackageVersionResponse getWorldPackageVersion(packageId, number)

One version, with its payload (one root node in place JSON).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsPackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsPackagesApi apiInstance = new WorldsPackagesApi(defaultClient);
    String packageId = "packageId_example"; // String | 
    String number = "number_example"; // String | 
    try {
      GetWorldPackageVersionResponse result = apiInstance.getWorldPackageVersion(packageId, number);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsPackagesApi#getWorldPackageVersion");
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
 **packageId** | **String**|  |
 **number** | **String**|  |

### Return type

**GetWorldPackageVersionResponse**

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

<a name="listWorldExperiencePlacePackages"></a>
# **listWorldExperiencePlacePackages**
> ListWorldExperiencePlacePackagesResponse listWorldExperiencePlacePackages(experienceId, placeId)

Package copies in a place: version, newest version, modified, auto-update.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsPackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsPackagesApi apiInstance = new WorldsPackagesApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    try {
      ListWorldExperiencePlacePackagesResponse result = apiInstance.listWorldExperiencePlacePackages(experienceId, placeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsPackagesApi#listWorldExperiencePlacePackages");
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
 **placeId** | **String**|  |

### Return type

**ListWorldExperiencePlacePackagesResponse**

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

<a name="listWorldPackages"></a>
# **listWorldPackages**
> ListWorldPackagesResponse listWorldPackages()

Your package library: reusable models and modules, newest first, with how many places hold copies.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsPackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsPackagesApi apiInstance = new WorldsPackagesApi(defaultClient);
    try {
      ListWorldPackagesResponse result = apiInstance.listWorldPackages();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsPackagesApi#listWorldPackages");
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

**ListWorldPackagesResponse**

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

<a name="updateWorldExperiencePlacePackage"></a>
# **updateWorldExperiencePlacePackage**
> UpdateWorldExperiencePlacePackageResponse updateWorldExperiencePlacePackage(experienceId, placeId, nodeId)

Turn auto-update on or off for one copy.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsPackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsPackagesApi apiInstance = new WorldsPackagesApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    String nodeId = "nodeId_example"; // String | 
    try {
      UpdateWorldExperiencePlacePackageResponse result = apiInstance.updateWorldExperiencePlacePackage(experienceId, placeId, nodeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsPackagesApi#updateWorldExperiencePlacePackage");
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
 **placeId** | **String**|  |
 **nodeId** | **String**|  |

### Return type

**UpdateWorldExperiencePlacePackageResponse**

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

<a name="updateWorldPackage"></a>
# **updateWorldPackage**
> DeleteWorldPackageResponse updateWorldPackage(packageId)

Rename a package or change its description.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsPackagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsPackagesApi apiInstance = new WorldsPackagesApi(defaultClient);
    String packageId = "packageId_example"; // String | 
    try {
      DeleteWorldPackageResponse result = apiInstance.updateWorldPackage(packageId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsPackagesApi#updateWorldPackage");
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
 **packageId** | **String**|  |

### Return type

**DeleteWorldPackageResponse**

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

