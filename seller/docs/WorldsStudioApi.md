# WorldsStudioApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorldExperienceAssetMesh**](WorldsStudioApi.md#createWorldExperienceAssetMesh) | **POST** /v1/worlds/experiences/{experienceId}/assets/meshes | Import a .glb (base64) as a MeshPart: safety parse + budgets, stored on the Crossly CDN, a phone LOD over 5k triangles, collision Box or convex Hull. Returns the asset and the MeshPart node; with placeId it is inserted into that place through its co-editing session.
[**createWorldExperienceAssetMeshCheck**](WorldsStudioApi.md#createWorldExperienceAssetMeshCheck) | **POST** /v1/worlds/experiences/{experienceId}/assets/meshes/check | Check a .glb (base64) for import without storing it: the budget report per device, plain-English errors with a fix list, whether a phone LOD will be made, mesh bounds and hull points.
[**createWorldExperiencePlaceAssistant**](WorldsStudioApi.md#createWorldExperiencePlaceAssistant) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/assistant | Ask the Studio Assistant (mode explain | edit | build): returns an explanation and a proposed change set (scripts, inserts, edits) checked against your role and linted. Nothing is applied.
[**createWorldExperiencePlaceAssistantApply**](WorldsStudioApi.md#createWorldExperiencePlaceAssistantApply) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/assistant/apply | Apply accepted Assistant changes to the place as one co-editing batch (activity via assistant, revertible). Re-checked against the place as it is now.
[**createWorldExperiencePlaceStudioEdit**](WorldsStudioApi.md#createWorldExperiencePlaceStudioEdit) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/studio/edits | Apply set / insert / move / delete steps by path as ONE batch through Team Create (live in every open Studio, one revertible activity entry). All-or-nothing: any bad step refuses the batch with every problem listed.
[**createWorldExperiencePlaceStudioInsertAsset**](WorldsStudioApi.md#createWorldExperiencePlaceStudioInsertAsset) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/studio/insert-asset | Insert a Toolbox asset under a path (default Workspace; ServerScripts for scripts). Paid assets need the experience owner&#39;s licence.
[**createWorldExperiencePlaceStudioPlaytest**](WorldsStudioApi.md#createWorldExperiencePlaceStudioPlaytest) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/studio/playtest | Cloud test: flush the session, freeze a private test version and start a fleet server for it. 201 ready (ticket) or 202 starting; outputCursor reads only this test&#39;s Output.
[**createWorldExperiencePlaceStudioPlaytestStop**](WorldsStudioApi.md#createWorldExperiencePlaceStudioPlaytestStop) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/studio/playtest/stop | Stop this place&#39;s cloud-test servers now.
[**createWorldExperiencePlaceStudioPublish**](WorldsStudioApi.md#createWorldExperiencePlaceStudioPublish) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/studio/publish | Prepare a publish from the live session: checks, details, rating answers, access. Never submits and never acknowledges the money review — the person does (or submit_worlds_publish).
[**createWorldExperiencePlaceStudioScriptCommit**](WorldsStudioApi.md#createWorldExperiencePlaceStudioScriptCommit) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/studio/script/commit | Commit your draft with a three-way merge onto the script as it is now (collaborators&#39; edits kept). 409 merge_conflict carries merged text with conflict blocks and theirs.
[**deleteWorldExperiencePlaceStudioScript**](WorldsStudioApi.md#deleteWorldExperiencePlaceStudioScript) | **DELETE** /v1/worlds/experiences/{experienceId}/places/{placeId}/studio/script | Discard your draft of a script.
[**getWorldAssistantStatus**](WorldsStudioApi.md#getWorldAssistantStatus) | **GET** /v1/worlds/assistant/status | Studio Assistant status: whether Crossly&#39;s model key is configured, whether you have your own AI key, and your plan allowance (asks left today, budget left this month).
[**getWorldExperiencePlaceStudioFind**](WorldsStudioApi.md#getWorldExperiencePlaceStudioFind) | **GET** /v1/worlds/experiences/{experienceId}/places/{placeId}/studio/find | Find instances by name (contains), exact class and/or tag.
[**getWorldExperiencePlaceStudioInstance**](WorldsStudioApi.md#getWorldExperiencePlaceStudioInstance) | **GET** /v1/worlds/experiences/{experienceId}/places/{placeId}/studio/instance | One instance by path (or session id): class, properties, attributes, tags, children. Script source is read with …/studio/script.
[**getWorldExperiencePlaceStudioOutput**](WorldsStudioApi.md#getWorldExperiencePlaceStudioOutput) | **GET** /v1/worlds/experiences/{experienceId}/places/{placeId}/studio/output | Server Output (print, warnings, errors) after a cursor: every line of cloud tests, errors of live servers (scope&#x3D;all). Kept 24 hours.
[**getWorldExperiencePlaceStudioProblem**](WorldsStudioApi.md#getWorldExperiencePlaceStudioProblem) | **GET** /v1/worlds/experiences/{experienceId}/places/{placeId}/studio/problems | The publish checks on the place as the live session holds it: script lint, budgets per device, settings, shop listings, Toolbox licences. publishable &#x3D; no errors.
[**getWorldExperiencePlaceStudioScript**](WorldsStudioApi.md#getWorldExperiencePlaceStudioScript) | **GET** /v1/worlds/experiences/{experienceId}/places/{placeId}/studio/script | A script&#39;s current source, your draft of it (if any, with whether someone committed since) and the lint of each.
[**getWorldExperiencePlaceStudioSnapshot**](WorldsStudioApi.md#getWorldExperiencePlaceStudioSnapshot) | **GET** /v1/worlds/experiences/{experienceId}/places/{placeId}/studio/snapshot | A plan (top) or front drawing of the parts under a path as SVG, with bounds, spawns and unanchored parts that will fall.
[**getWorldExperiencePlaceStudioTree**](WorldsStudioApi.md#getWorldExperiencePlaceStudioTree) | **GET** /v1/worlds/experiences/{experienceId}/places/{placeId}/studio/tree | The live instance tree (what every open Studio shows) by dotted path, depth levels down (default 3, max 12).
[**getWorldStudioClass**](WorldsStudioApi.md#getWorldStudioClass) | **GET** /v1/worlds/studio/classes | The engine&#39;s class table: insertable classes, services, and for ?name&#x3D; one class with every property, its type, default and the exact JSON a place (and a studio edit) takes.
[**listWorldExperienceAssets**](WorldsStudioApi.md#listWorldExperienceAssets) | **GET** /v1/worlds/experiences/{experienceId}/assets | Meshes imported into this experience, newest first: paths, phone LOD, bounds, hull size, budget report, moderation (pending until a reviewed publish uses them) and a URL you can load now.
[**updateWorldExperiencePlaceStudioScript**](WorldsStudioApi.md#updateWorldExperiencePlaceStudioScript) | **PUT** /v1/worlds/experiences/{experienceId}/places/{placeId}/studio/script | Save your draft of a script (the place does not change until you commit). Returns lint and the diff from the current source.


<a name="createWorldExperienceAssetMesh"></a>
# **createWorldExperienceAssetMesh**
> CreateWorldExperienceAssetMeshResponse createWorldExperienceAssetMesh(experienceId)

Import a .glb (base64) as a MeshPart: safety parse + budgets, stored on the Crossly CDN, a phone LOD over 5k triangles, collision Box or convex Hull. Returns the asset and the MeshPart node; with placeId it is inserted into that place through its co-editing session.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsStudioApi apiInstance = new WorldsStudioApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      CreateWorldExperienceAssetMeshResponse result = apiInstance.createWorldExperienceAssetMesh(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsStudioApi#createWorldExperienceAssetMesh");
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

**CreateWorldExperienceAssetMeshResponse**

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

<a name="createWorldExperienceAssetMeshCheck"></a>
# **createWorldExperienceAssetMeshCheck**
> CreateWorldExperienceAssetMeshCheckResponse createWorldExperienceAssetMeshCheck(experienceId)

Check a .glb (base64) for import without storing it: the budget report per device, plain-English errors with a fix list, whether a phone LOD will be made, mesh bounds and hull points.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsStudioApi apiInstance = new WorldsStudioApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      CreateWorldExperienceAssetMeshCheckResponse result = apiInstance.createWorldExperienceAssetMeshCheck(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsStudioApi#createWorldExperienceAssetMeshCheck");
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

**CreateWorldExperienceAssetMeshCheckResponse**

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

<a name="createWorldExperiencePlaceAssistant"></a>
# **createWorldExperiencePlaceAssistant**
> CreateWorldExperiencePlaceAssistantResponse createWorldExperiencePlaceAssistant(experienceId, placeId)

Ask the Studio Assistant (mode explain | edit | build): returns an explanation and a proposed change set (scripts, inserts, edits) checked against your role and linted. Nothing is applied.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsStudioApi apiInstance = new WorldsStudioApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    try {
      CreateWorldExperiencePlaceAssistantResponse result = apiInstance.createWorldExperiencePlaceAssistant(experienceId, placeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsStudioApi#createWorldExperiencePlaceAssistant");
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

**CreateWorldExperiencePlaceAssistantResponse**

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

<a name="createWorldExperiencePlaceAssistantApply"></a>
# **createWorldExperiencePlaceAssistantApply**
> CreateWorldExperiencePlaceAssistantApplyResponse createWorldExperiencePlaceAssistantApply(experienceId, placeId)

Apply accepted Assistant changes to the place as one co-editing batch (activity via assistant, revertible). Re-checked against the place as it is now.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsStudioApi apiInstance = new WorldsStudioApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    try {
      CreateWorldExperiencePlaceAssistantApplyResponse result = apiInstance.createWorldExperiencePlaceAssistantApply(experienceId, placeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsStudioApi#createWorldExperiencePlaceAssistantApply");
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

**CreateWorldExperiencePlaceAssistantApplyResponse**

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

<a name="createWorldExperiencePlaceStudioEdit"></a>
# **createWorldExperiencePlaceStudioEdit**
> CreateWorldExperiencePlaceStudioEditResponse createWorldExperiencePlaceStudioEdit(experienceId, placeId)

Apply set / insert / move / delete steps by path as ONE batch through Team Create (live in every open Studio, one revertible activity entry). All-or-nothing: any bad step refuses the batch with every problem listed.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsStudioApi apiInstance = new WorldsStudioApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    try {
      CreateWorldExperiencePlaceStudioEditResponse result = apiInstance.createWorldExperiencePlaceStudioEdit(experienceId, placeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsStudioApi#createWorldExperiencePlaceStudioEdit");
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

**CreateWorldExperiencePlaceStudioEditResponse**

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

<a name="createWorldExperiencePlaceStudioInsertAsset"></a>
# **createWorldExperiencePlaceStudioInsertAsset**
> CreateWorldExperiencePlaceStudioInsertAssetResponse createWorldExperiencePlaceStudioInsertAsset(experienceId, placeId)

Insert a Toolbox asset under a path (default Workspace; ServerScripts for scripts). Paid assets need the experience owner&#39;s licence.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsStudioApi apiInstance = new WorldsStudioApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    try {
      CreateWorldExperiencePlaceStudioInsertAssetResponse result = apiInstance.createWorldExperiencePlaceStudioInsertAsset(experienceId, placeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsStudioApi#createWorldExperiencePlaceStudioInsertAsset");
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

**CreateWorldExperiencePlaceStudioInsertAssetResponse**

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

<a name="createWorldExperiencePlaceStudioPlaytest"></a>
# **createWorldExperiencePlaceStudioPlaytest**
> CreateWorldExperiencePlaceStudioPlaytestResponse createWorldExperiencePlaceStudioPlaytest(experienceId, placeId)

Cloud test: flush the session, freeze a private test version and start a fleet server for it. 201 ready (ticket) or 202 starting; outputCursor reads only this test&#39;s Output.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsStudioApi apiInstance = new WorldsStudioApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    try {
      CreateWorldExperiencePlaceStudioPlaytestResponse result = apiInstance.createWorldExperiencePlaceStudioPlaytest(experienceId, placeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsStudioApi#createWorldExperiencePlaceStudioPlaytest");
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

**CreateWorldExperiencePlaceStudioPlaytestResponse**

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

<a name="createWorldExperiencePlaceStudioPlaytestStop"></a>
# **createWorldExperiencePlaceStudioPlaytestStop**
> CreateWorldExperiencePlaceStudioPlaytestStopResponse createWorldExperiencePlaceStudioPlaytestStop(experienceId, placeId)

Stop this place&#39;s cloud-test servers now.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsStudioApi apiInstance = new WorldsStudioApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    try {
      CreateWorldExperiencePlaceStudioPlaytestStopResponse result = apiInstance.createWorldExperiencePlaceStudioPlaytestStop(experienceId, placeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsStudioApi#createWorldExperiencePlaceStudioPlaytestStop");
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

**CreateWorldExperiencePlaceStudioPlaytestStopResponse**

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

<a name="createWorldExperiencePlaceStudioPublish"></a>
# **createWorldExperiencePlaceStudioPublish**
> CreateWorldExperiencePlaceStudioPublishResponse createWorldExperiencePlaceStudioPublish(experienceId, placeId)

Prepare a publish from the live session: checks, details, rating answers, access. Never submits and never acknowledges the money review — the person does (or submit_worlds_publish).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsStudioApi apiInstance = new WorldsStudioApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    try {
      CreateWorldExperiencePlaceStudioPublishResponse result = apiInstance.createWorldExperiencePlaceStudioPublish(experienceId, placeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsStudioApi#createWorldExperiencePlaceStudioPublish");
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

**CreateWorldExperiencePlaceStudioPublishResponse**

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

<a name="createWorldExperiencePlaceStudioScriptCommit"></a>
# **createWorldExperiencePlaceStudioScriptCommit**
> CreateWorldExperiencePlaceStudioScriptCommitResponse createWorldExperiencePlaceStudioScriptCommit(experienceId, placeId)

Commit your draft with a three-way merge onto the script as it is now (collaborators&#39; edits kept). 409 merge_conflict carries merged text with conflict blocks and theirs.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsStudioApi apiInstance = new WorldsStudioApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    try {
      CreateWorldExperiencePlaceStudioScriptCommitResponse result = apiInstance.createWorldExperiencePlaceStudioScriptCommit(experienceId, placeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsStudioApi#createWorldExperiencePlaceStudioScriptCommit");
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

**CreateWorldExperiencePlaceStudioScriptCommitResponse**

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

<a name="deleteWorldExperiencePlaceStudioScript"></a>
# **deleteWorldExperiencePlaceStudioScript**
> DeleteWorldExperiencePlaceCollabScriptResponse deleteWorldExperiencePlaceStudioScript(experienceId, placeId)

Discard your draft of a script.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsStudioApi apiInstance = new WorldsStudioApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    try {
      DeleteWorldExperiencePlaceCollabScriptResponse result = apiInstance.deleteWorldExperiencePlaceStudioScript(experienceId, placeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsStudioApi#deleteWorldExperiencePlaceStudioScript");
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

**DeleteWorldExperiencePlaceCollabScriptResponse**

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

<a name="getWorldAssistantStatus"></a>
# **getWorldAssistantStatus**
> GetWorldAssistantStatusResponse getWorldAssistantStatus()

Studio Assistant status: whether Crossly&#39;s model key is configured, whether you have your own AI key, and your plan allowance (asks left today, budget left this month).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsStudioApi apiInstance = new WorldsStudioApi(defaultClient);
    try {
      GetWorldAssistantStatusResponse result = apiInstance.getWorldAssistantStatus();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsStudioApi#getWorldAssistantStatus");
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

**GetWorldAssistantStatusResponse**

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

<a name="getWorldExperiencePlaceStudioFind"></a>
# **getWorldExperiencePlaceStudioFind**
> GetWorldExperiencePlaceStudioFindResponse getWorldExperiencePlaceStudioFind(experienceId, placeId)

Find instances by name (contains), exact class and/or tag.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsStudioApi apiInstance = new WorldsStudioApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    try {
      GetWorldExperiencePlaceStudioFindResponse result = apiInstance.getWorldExperiencePlaceStudioFind(experienceId, placeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsStudioApi#getWorldExperiencePlaceStudioFind");
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

**GetWorldExperiencePlaceStudioFindResponse**

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

<a name="getWorldExperiencePlaceStudioInstance"></a>
# **getWorldExperiencePlaceStudioInstance**
> GetWorldExperiencePlaceStudioInstanceResponse getWorldExperiencePlaceStudioInstance(experienceId, placeId)

One instance by path (or session id): class, properties, attributes, tags, children. Script source is read with …/studio/script.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsStudioApi apiInstance = new WorldsStudioApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    try {
      GetWorldExperiencePlaceStudioInstanceResponse result = apiInstance.getWorldExperiencePlaceStudioInstance(experienceId, placeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsStudioApi#getWorldExperiencePlaceStudioInstance");
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

**GetWorldExperiencePlaceStudioInstanceResponse**

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

<a name="getWorldExperiencePlaceStudioOutput"></a>
# **getWorldExperiencePlaceStudioOutput**
> GetWorldExperiencePlaceStudioOutputResponse getWorldExperiencePlaceStudioOutput(experienceId, placeId)

Server Output (print, warnings, errors) after a cursor: every line of cloud tests, errors of live servers (scope&#x3D;all). Kept 24 hours.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsStudioApi apiInstance = new WorldsStudioApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    try {
      GetWorldExperiencePlaceStudioOutputResponse result = apiInstance.getWorldExperiencePlaceStudioOutput(experienceId, placeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsStudioApi#getWorldExperiencePlaceStudioOutput");
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

**GetWorldExperiencePlaceStudioOutputResponse**

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

<a name="getWorldExperiencePlaceStudioProblem"></a>
# **getWorldExperiencePlaceStudioProblem**
> GetWorldExperiencePlaceStudioProblemResponse getWorldExperiencePlaceStudioProblem(experienceId, placeId)

The publish checks on the place as the live session holds it: script lint, budgets per device, settings, shop listings, Toolbox licences. publishable &#x3D; no errors.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsStudioApi apiInstance = new WorldsStudioApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    try {
      GetWorldExperiencePlaceStudioProblemResponse result = apiInstance.getWorldExperiencePlaceStudioProblem(experienceId, placeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsStudioApi#getWorldExperiencePlaceStudioProblem");
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

**GetWorldExperiencePlaceStudioProblemResponse**

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

<a name="getWorldExperiencePlaceStudioScript"></a>
# **getWorldExperiencePlaceStudioScript**
> GetWorldExperiencePlaceStudioScriptResponse getWorldExperiencePlaceStudioScript(experienceId, placeId)

A script&#39;s current source, your draft of it (if any, with whether someone committed since) and the lint of each.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsStudioApi apiInstance = new WorldsStudioApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    try {
      GetWorldExperiencePlaceStudioScriptResponse result = apiInstance.getWorldExperiencePlaceStudioScript(experienceId, placeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsStudioApi#getWorldExperiencePlaceStudioScript");
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

**GetWorldExperiencePlaceStudioScriptResponse**

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

<a name="getWorldExperiencePlaceStudioSnapshot"></a>
# **getWorldExperiencePlaceStudioSnapshot**
> GetWorldExperiencePlaceStudioSnapshotResponse getWorldExperiencePlaceStudioSnapshot(experienceId, placeId)

A plan (top) or front drawing of the parts under a path as SVG, with bounds, spawns and unanchored parts that will fall.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsStudioApi apiInstance = new WorldsStudioApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    try {
      GetWorldExperiencePlaceStudioSnapshotResponse result = apiInstance.getWorldExperiencePlaceStudioSnapshot(experienceId, placeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsStudioApi#getWorldExperiencePlaceStudioSnapshot");
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

**GetWorldExperiencePlaceStudioSnapshotResponse**

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

<a name="getWorldExperiencePlaceStudioTree"></a>
# **getWorldExperiencePlaceStudioTree**
> GetWorldExperiencePlaceStudioTreeResponse getWorldExperiencePlaceStudioTree(experienceId, placeId)

The live instance tree (what every open Studio shows) by dotted path, depth levels down (default 3, max 12).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsStudioApi apiInstance = new WorldsStudioApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    try {
      GetWorldExperiencePlaceStudioTreeResponse result = apiInstance.getWorldExperiencePlaceStudioTree(experienceId, placeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsStudioApi#getWorldExperiencePlaceStudioTree");
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

**GetWorldExperiencePlaceStudioTreeResponse**

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

<a name="getWorldStudioClass"></a>
# **getWorldStudioClass**
> GetWorldStudioClassResponse getWorldStudioClass()

The engine&#39;s class table: insertable classes, services, and for ?name&#x3D; one class with every property, its type, default and the exact JSON a place (and a studio edit) takes.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsStudioApi apiInstance = new WorldsStudioApi(defaultClient);
    try {
      GetWorldStudioClassResponse result = apiInstance.getWorldStudioClass();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsStudioApi#getWorldStudioClass");
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

**GetWorldStudioClassResponse**

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

<a name="listWorldExperienceAssets"></a>
# **listWorldExperienceAssets**
> ListWorldExperienceAssetsResponse listWorldExperienceAssets(experienceId)

Meshes imported into this experience, newest first: paths, phone LOD, bounds, hull size, budget report, moderation (pending until a reviewed publish uses them) and a URL you can load now.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsStudioApi apiInstance = new WorldsStudioApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      ListWorldExperienceAssetsResponse result = apiInstance.listWorldExperienceAssets(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsStudioApi#listWorldExperienceAssets");
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

**ListWorldExperienceAssetsResponse**

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

<a name="updateWorldExperiencePlaceStudioScript"></a>
# **updateWorldExperiencePlaceStudioScript**
> UpdateWorldExperiencePlaceStudioScriptResponse updateWorldExperiencePlaceStudioScript(experienceId, placeId)

Save your draft of a script (the place does not change until you commit). Returns lint and the diff from the current source.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsStudioApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsStudioApi apiInstance = new WorldsStudioApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    try {
      UpdateWorldExperiencePlaceStudioScriptResponse result = apiInstance.updateWorldExperiencePlaceStudioScript(experienceId, placeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsStudioApi#updateWorldExperiencePlaceStudioScript");
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

**UpdateWorldExperiencePlaceStudioScriptResponse**

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

