# WorldsTeamApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorldCollaborationAccept**](WorldsTeamApi.md#createWorldCollaborationAccept) | **POST** /v1/worlds/collaborations/{experienceId}/accept | Accept an invitation.
[**createWorldCollaborationDecline**](WorldsTeamApi.md#createWorldCollaborationDecline) | **POST** /v1/worlds/collaborations/{experienceId}/decline | Decline an invitation.
[**createWorldExperienceActivityRevert**](WorldsTeamApi.md#createWorldExperienceActivityRevert) | **POST** /v1/worlds/experiences/{experienceId}/activity/{activityId}/revert | Revert an instance change: its undo is applied as a new edit by you; anything changed since by others is left alone.
[**createWorldExperienceCollaborator**](WorldsTeamApi.md#createWorldExperienceCollaborator) | **POST** /v1/worlds/experiences/{experienceId}/collaborators | Invite a Crossly handle with a role. Owner or admin; only the owner makes admins. Counts against the owner&#39;s plan cap.
[**createWorldExperiencePlaceCollabOp**](WorldsTeamApi.md#createWorldExperiencePlaceCollabOp) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/collab/ops | Apply a batch of ops (insert, delete, move, prop, attr, name, tags, world) in server order. Each op is checked against your role; a retried batch id is answered, not re-applied.
[**createWorldExperiencePlaceCollabSave**](WorldsTeamApi.md#createWorldExperiencePlaceCollabSave) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/collab/save | Write the session into the place draft now (publishing and cloud tests do this themselves).
[**createWorldExperiencePlaceCollabScriptCommit**](WorldsTeamApi.md#createWorldExperiencePlaceCollabScriptCommit) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/collab/scripts/{nodeId}/commit | Commit your draft with a three-way merge. 409 merge_conflict carries the merged text with conflict blocks and the current source.
[**deleteWorldExperienceCollaborator**](WorldsTeamApi.md#deleteWorldExperienceCollaborator) | **DELETE** /v1/worlds/experiences/{experienceId}/collaborators/{userId} | Remove a collaborator, or leave (your own user id). Their revenue share returns to the owner from next month.
[**deleteWorldExperiencePlaceCollabScript**](WorldsTeamApi.md#deleteWorldExperiencePlaceCollabScript) | **DELETE** /v1/worlds/experiences/{experienceId}/places/{placeId}/collab/scripts/{nodeId} | Discard your draft of a script.
[**getWorldExperiencePlaceCollab**](WorldsTeamApi.md#getWorldExperiencePlaceCollab) | **GET** /v1/worlds/experiences/{experienceId}/places/{placeId}/collab | The live co-editing document of a place (node ids every editor shares), its op sequence and your role.
[**getWorldExperiencePlaceCollabOp**](WorldsTeamApi.md#getWorldExperiencePlaceCollabOp) | **GET** /v1/worlds/experiences/{experienceId}/places/{placeId}/collab/ops | Ops after a sequence number, grouped by batch. 409 resync when they are no longer kept: reload the session.
[**getWorldExperienceSplit**](WorldsTeamApi.md#getWorldExperienceSplit) | **GET** /v1/worlds/experiences/{experienceId}/splits | Revenue split of the creator share: current, scheduled, history.
[**getWorldExperienceTeam**](WorldsTeamApi.md#getWorldExperienceTeam) | **GET** /v1/worlds/experiences/{experienceId}/team | The team: owner, collaborators with roles (owner, admin, editor, scripter, builder, tester, analyst), your role and permissions, the plan cap.
[**listWorldCollaborations**](WorldsTeamApi.md#listWorldCollaborations) | **GET** /v1/worlds/collaborations | Experiences you are invited to or work on, with your role.
[**listWorldExperienceActivity**](WorldsTeamApi.md#listWorldExperienceActivity) | **GET** /v1/worlds/experiences/{experienceId}/activity | Activity history, newest first: who changed what, when, from where (studio, api, mcp, cli); instance changes are revertible.
[**listWorldExperiencePlaceCollabScripts**](WorldsTeamApi.md#listWorldExperiencePlaceCollabScripts) | **GET** /v1/worlds/experiences/{experienceId}/places/{placeId}/collab/scripts | Your script drafts in this place, with whether someone committed since you started.
[**updateWorldExperienceCollaborator**](WorldsTeamApi.md#updateWorldExperienceCollaborator) | **PATCH** /v1/worlds/experiences/{experienceId}/collaborators/{userId} | Change a collaborator&#39;s role.
[**updateWorldExperiencePlaceCollabScript**](WorldsTeamApi.md#updateWorldExperiencePlaceCollabScript) | **PUT** /v1/worlds/experiences/{experienceId}/places/{placeId}/collab/scripts/{nodeId} | Save your own draft of a script (needs edit scripts).
[**updateWorldExperienceSplit**](WorldsTeamApi.md#updateWorldExperienceSplit) | **PUT** /v1/worlds/experiences/{experienceId}/splits | Owner only: split the creator share (70% of net) in basis points summing to 10000. Takes effect the 1st of next month; every party is notified. The 70% total never changes.


<a name="createWorldCollaborationAccept"></a>
# **createWorldCollaborationAccept**
> CreateWorldCollaborationAcceptResponse createWorldCollaborationAccept(experienceId)

Accept an invitation.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsTeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsTeamApi apiInstance = new WorldsTeamApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      CreateWorldCollaborationAcceptResponse result = apiInstance.createWorldCollaborationAccept(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsTeamApi#createWorldCollaborationAccept");
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

**CreateWorldCollaborationAcceptResponse**

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

<a name="createWorldCollaborationDecline"></a>
# **createWorldCollaborationDecline**
> CreateWorldCollaborationDeclineResponse createWorldCollaborationDecline(experienceId)

Decline an invitation.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsTeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsTeamApi apiInstance = new WorldsTeamApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      CreateWorldCollaborationDeclineResponse result = apiInstance.createWorldCollaborationDecline(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsTeamApi#createWorldCollaborationDecline");
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

**CreateWorldCollaborationDeclineResponse**

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

<a name="createWorldExperienceActivityRevert"></a>
# **createWorldExperienceActivityRevert**
> CreateWorldExperienceActivityRevertResponse createWorldExperienceActivityRevert(experienceId, activityId)

Revert an instance change: its undo is applied as a new edit by you; anything changed since by others is left alone.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsTeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsTeamApi apiInstance = new WorldsTeamApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String activityId = "activityId_example"; // String | 
    try {
      CreateWorldExperienceActivityRevertResponse result = apiInstance.createWorldExperienceActivityRevert(experienceId, activityId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsTeamApi#createWorldExperienceActivityRevert");
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
 **activityId** | **String**|  |

### Return type

**CreateWorldExperienceActivityRevertResponse**

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

<a name="createWorldExperienceCollaborator"></a>
# **createWorldExperienceCollaborator**
> CreateWorldExperienceCollaboratorResponse createWorldExperienceCollaborator(experienceId)

Invite a Crossly handle with a role. Owner or admin; only the owner makes admins. Counts against the owner&#39;s plan cap.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsTeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsTeamApi apiInstance = new WorldsTeamApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      CreateWorldExperienceCollaboratorResponse result = apiInstance.createWorldExperienceCollaborator(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsTeamApi#createWorldExperienceCollaborator");
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

**CreateWorldExperienceCollaboratorResponse**

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

<a name="createWorldExperiencePlaceCollabOp"></a>
# **createWorldExperiencePlaceCollabOp**
> CreateWorldExperiencePlaceCollabOpResponse createWorldExperiencePlaceCollabOp(experienceId, placeId)

Apply a batch of ops (insert, delete, move, prop, attr, name, tags, world) in server order. Each op is checked against your role; a retried batch id is answered, not re-applied.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsTeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsTeamApi apiInstance = new WorldsTeamApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    try {
      CreateWorldExperiencePlaceCollabOpResponse result = apiInstance.createWorldExperiencePlaceCollabOp(experienceId, placeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsTeamApi#createWorldExperiencePlaceCollabOp");
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

**CreateWorldExperiencePlaceCollabOpResponse**

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

<a name="createWorldExperiencePlaceCollabSave"></a>
# **createWorldExperiencePlaceCollabSave**
> CreateWorldExperiencePlaceCollabSaveResponse createWorldExperiencePlaceCollabSave(experienceId, placeId)

Write the session into the place draft now (publishing and cloud tests do this themselves).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsTeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsTeamApi apiInstance = new WorldsTeamApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    try {
      CreateWorldExperiencePlaceCollabSaveResponse result = apiInstance.createWorldExperiencePlaceCollabSave(experienceId, placeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsTeamApi#createWorldExperiencePlaceCollabSave");
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

**CreateWorldExperiencePlaceCollabSaveResponse**

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

<a name="createWorldExperiencePlaceCollabScriptCommit"></a>
# **createWorldExperiencePlaceCollabScriptCommit**
> CreateWorldExperiencePlaceCollabScriptCommitResponse createWorldExperiencePlaceCollabScriptCommit(experienceId, placeId, nodeId)

Commit your draft with a three-way merge. 409 merge_conflict carries the merged text with conflict blocks and the current source.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsTeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsTeamApi apiInstance = new WorldsTeamApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    String nodeId = "nodeId_example"; // String | 
    try {
      CreateWorldExperiencePlaceCollabScriptCommitResponse result = apiInstance.createWorldExperiencePlaceCollabScriptCommit(experienceId, placeId, nodeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsTeamApi#createWorldExperiencePlaceCollabScriptCommit");
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

**CreateWorldExperiencePlaceCollabScriptCommitResponse**

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

<a name="deleteWorldExperienceCollaborator"></a>
# **deleteWorldExperienceCollaborator**
> DeleteSpatialSceneGrantResponse deleteWorldExperienceCollaborator(experienceId, userId)

Remove a collaborator, or leave (your own user id). Their revenue share returns to the owner from next month.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsTeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsTeamApi apiInstance = new WorldsTeamApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String userId = "userId_example"; // String | 
    try {
      DeleteSpatialSceneGrantResponse result = apiInstance.deleteWorldExperienceCollaborator(experienceId, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsTeamApi#deleteWorldExperienceCollaborator");
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
 **userId** | **String**|  |

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

<a name="deleteWorldExperiencePlaceCollabScript"></a>
# **deleteWorldExperiencePlaceCollabScript**
> DeleteWorldExperiencePlaceCollabScriptResponse deleteWorldExperiencePlaceCollabScript(experienceId, placeId, nodeId)

Discard your draft of a script.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsTeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsTeamApi apiInstance = new WorldsTeamApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    String nodeId = "nodeId_example"; // String | 
    try {
      DeleteWorldExperiencePlaceCollabScriptResponse result = apiInstance.deleteWorldExperiencePlaceCollabScript(experienceId, placeId, nodeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsTeamApi#deleteWorldExperiencePlaceCollabScript");
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

<a name="getWorldExperiencePlaceCollab"></a>
# **getWorldExperiencePlaceCollab**
> GetWorldExperiencePlaceCollabResponse getWorldExperiencePlaceCollab(experienceId, placeId)

The live co-editing document of a place (node ids every editor shares), its op sequence and your role.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsTeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsTeamApi apiInstance = new WorldsTeamApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    try {
      GetWorldExperiencePlaceCollabResponse result = apiInstance.getWorldExperiencePlaceCollab(experienceId, placeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsTeamApi#getWorldExperiencePlaceCollab");
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

**GetWorldExperiencePlaceCollabResponse**

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

<a name="getWorldExperiencePlaceCollabOp"></a>
# **getWorldExperiencePlaceCollabOp**
> GetWorldExperiencePlaceCollabOpResponse getWorldExperiencePlaceCollabOp(experienceId, placeId)

Ops after a sequence number, grouped by batch. 409 resync when they are no longer kept: reload the session.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsTeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsTeamApi apiInstance = new WorldsTeamApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    try {
      GetWorldExperiencePlaceCollabOpResponse result = apiInstance.getWorldExperiencePlaceCollabOp(experienceId, placeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsTeamApi#getWorldExperiencePlaceCollabOp");
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

**GetWorldExperiencePlaceCollabOpResponse**

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

<a name="getWorldExperienceSplit"></a>
# **getWorldExperienceSplit**
> GetWorldExperienceSplitResponse getWorldExperienceSplit(experienceId)

Revenue split of the creator share: current, scheduled, history.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsTeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsTeamApi apiInstance = new WorldsTeamApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      GetWorldExperienceSplitResponse result = apiInstance.getWorldExperienceSplit(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsTeamApi#getWorldExperienceSplit");
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

**GetWorldExperienceSplitResponse**

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

<a name="getWorldExperienceTeam"></a>
# **getWorldExperienceTeam**
> GetWorldExperienceTeamResponse getWorldExperienceTeam(experienceId)

The team: owner, collaborators with roles (owner, admin, editor, scripter, builder, tester, analyst), your role and permissions, the plan cap.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsTeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsTeamApi apiInstance = new WorldsTeamApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      GetWorldExperienceTeamResponse result = apiInstance.getWorldExperienceTeam(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsTeamApi#getWorldExperienceTeam");
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

**GetWorldExperienceTeamResponse**

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

<a name="listWorldCollaborations"></a>
# **listWorldCollaborations**
> ListWorldCollaborationsResponse listWorldCollaborations()

Experiences you are invited to or work on, with your role.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsTeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsTeamApi apiInstance = new WorldsTeamApi(defaultClient);
    try {
      ListWorldCollaborationsResponse result = apiInstance.listWorldCollaborations();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsTeamApi#listWorldCollaborations");
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

**ListWorldCollaborationsResponse**

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

<a name="listWorldExperienceActivity"></a>
# **listWorldExperienceActivity**
> ListWorldExperienceActivityResponse listWorldExperienceActivity(experienceId)

Activity history, newest first: who changed what, when, from where (studio, api, mcp, cli); instance changes are revertible.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsTeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsTeamApi apiInstance = new WorldsTeamApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      ListWorldExperienceActivityResponse result = apiInstance.listWorldExperienceActivity(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsTeamApi#listWorldExperienceActivity");
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

**ListWorldExperienceActivityResponse**

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

<a name="listWorldExperiencePlaceCollabScripts"></a>
# **listWorldExperiencePlaceCollabScripts**
> ListWorldExperiencePlaceCollabScriptsResponse listWorldExperiencePlaceCollabScripts(experienceId, placeId)

Your script drafts in this place, with whether someone committed since you started.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsTeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsTeamApi apiInstance = new WorldsTeamApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    try {
      ListWorldExperiencePlaceCollabScriptsResponse result = apiInstance.listWorldExperiencePlaceCollabScripts(experienceId, placeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsTeamApi#listWorldExperiencePlaceCollabScripts");
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

**ListWorldExperiencePlaceCollabScriptsResponse**

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

<a name="updateWorldExperienceCollaborator"></a>
# **updateWorldExperienceCollaborator**
> CreateWorldExperienceCollaboratorResponse updateWorldExperienceCollaborator(experienceId, userId)

Change a collaborator&#39;s role.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsTeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsTeamApi apiInstance = new WorldsTeamApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String userId = "userId_example"; // String | 
    try {
      CreateWorldExperienceCollaboratorResponse result = apiInstance.updateWorldExperienceCollaborator(experienceId, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsTeamApi#updateWorldExperienceCollaborator");
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
 **userId** | **String**|  |

### Return type

**CreateWorldExperienceCollaboratorResponse**

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

<a name="updateWorldExperiencePlaceCollabScript"></a>
# **updateWorldExperiencePlaceCollabScript**
> UpdateWorldExperiencePlaceCollabScriptResponse updateWorldExperiencePlaceCollabScript(experienceId, placeId, nodeId)

Save your own draft of a script (needs edit scripts).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsTeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsTeamApi apiInstance = new WorldsTeamApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    String nodeId = "nodeId_example"; // String | 
    try {
      UpdateWorldExperiencePlaceCollabScriptResponse result = apiInstance.updateWorldExperiencePlaceCollabScript(experienceId, placeId, nodeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsTeamApi#updateWorldExperiencePlaceCollabScript");
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

**UpdateWorldExperiencePlaceCollabScriptResponse**

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

<a name="updateWorldExperienceSplit"></a>
# **updateWorldExperienceSplit**
> GetWorldExperienceSplitResponse updateWorldExperienceSplit(experienceId)

Owner only: split the creator share (70% of net) in basis points summing to 10000. Takes effect the 1st of next month; every party is notified. The 70% total never changes.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsTeamApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsTeamApi apiInstance = new WorldsTeamApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      GetWorldExperienceSplitResponse result = apiInstance.updateWorldExperienceSplit(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsTeamApi#updateWorldExperienceSplit");
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

**GetWorldExperienceSplitResponse**

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

