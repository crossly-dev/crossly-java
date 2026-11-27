# WorldsEngagementApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorldExperienceExperienceEvent**](WorldsEngagementApi.md#createWorldExperienceExperienceEvent) | **POST** /v1/worlds/experiences/{experienceId}/experience-events | Schedule an Experience Event shown on the game&#39;s card: title, description, start/end (5 min–14 days, ≤ 180 days ahead), thumbnail, place. With liveEventId it follows that live-ops event&#39;s schedule.
[**createWorldExperienceExperienceEventCancel**](WorldsEngagementApi.md#createWorldExperienceExperienceEventCancel) | **POST** /v1/worlds/experiences/{experienceId}/experience-events/{eventId}/cancel | Cancel an event (it disappears from the game&#39;s card; no reminder goes out).
[**createWorldExperienceExperienceEventRsvp**](WorldsEngagementApi.md#createWorldExperienceExperienceEventRsvp) | **POST** /v1/worlds/experiences/{experienceId}/experience-events/{eventId}/rsvp | RSVP (going: true) or take it back. remind: true also turns the experience&#39;s notifications on, so the 15-minute reminder can reach you.
[**createWorldExperienceNotification**](WorldsEngagementApi.md#createWorldExperienceNotification) | **POST** /v1/worlds/experiences/{experienceId}/notifications | Send an approved template to one player (sub) or up to 100 (subs). Only players who turned notifications on, 13+, not banned, at most 2 a day per player and outside their quiet hours receive it; every other send is logged as suppressed with its reason.
[**createWorldExperienceNotificationTemplateRetire**](WorldsEngagementApi.md#createWorldExperienceNotificationTemplateRetire) | **POST** /v1/worlds/experiences/{experienceId}/notification-templates/{key}/retire | Retire a template: sends by its key stop.
[**getWorldExperienceNotificationOptIn**](WorldsEngagementApi.md#getWorldExperienceNotificationOptIn) | **GET** /v1/worlds/experiences/{experienceId}/notifications/opt-in | Whether you turned this experience&#39;s notifications on.
[**getWorldExperienceNotificationReport**](WorldsEngagementApi.md#getWorldExperienceNotificationReport) | **GET** /v1/worlds/experiences/{experienceId}/notifications/report | Sends over the last N days (default 7, max 90): delivered, suppressed by reason, per template, and how many players turned notifications on.
[**listWorldExperienceEventUpcoming**](WorldsEngagementApi.md#listWorldExperienceEventUpcoming) | **GET** /v1/worlds/experience-events/upcoming | Events across public experiences in the next 7 days (and live now), soonest first — the Carnival Plaza&#39;s \&quot;Coming up\&quot; board.
[**listWorldExperienceExperienceEventUpcoming**](WorldsEngagementApi.md#listWorldExperienceExperienceEventUpcoming) | **GET** /v1/worlds/experiences/{experienceId}/experience-events/upcoming | An experience&#39;s upcoming and live events as players see them, with whether you are going.
[**listWorldExperienceExperienceEvents**](WorldsEngagementApi.md#listWorldExperienceExperienceEvents) | **GET** /v1/worlds/experiences/{experienceId}/experience-events | Your scheduled Experience Events (upcoming, live and the last 30 days) with RSVP counts.
[**listWorldExperienceNotificationTemplates**](WorldsEngagementApi.md#listWorldExperienceNotificationTemplates) | **GET** /v1/worlds/experiences/{experienceId}/notification-templates | Notification templates: key, title and body with {placeholders}, review status (approved ones can be sent).
[**listWorldMeExperienceEvents**](WorldsEngagementApi.md#listWorldMeExperienceEvents) | **GET** /v1/worlds/me/experience-events | Events you are going to that have not ended.
[**listWorldMeNotificationOptIns**](WorldsEngagementApi.md#listWorldMeNotificationOptIns) | **GET** /v1/worlds/me/notification-opt-ins | Every experience whose notifications you turned on.
[**updateWorldExperienceExperienceEvent**](WorldsEngagementApi.md#updateWorldExperienceExperienceEvent) | **PATCH** /v1/worlds/experiences/{experienceId}/experience-events/{eventId} | Change an event. A started event keeps its start; a new start time earns RSVPs a new reminder.
[**updateWorldExperienceNotificationOptIn**](WorldsEngagementApi.md#updateWorldExperienceNotificationOptIn) | **PUT** /v1/worlds/experiences/{experienceId}/notifications/opt-in | Turn this experience&#39;s notifications on or off for you. timeZone (IANA) keeps them out of your night.
[**updateWorldExperienceNotificationTemplate**](WorldsEngagementApi.md#updateWorldExperienceNotificationTemplate) | **PUT** /v1/worlds/experiences/{experienceId}/notification-templates/{key} | Create or reword a template. Clean words with no link are approved at once; anything the text filter flags, or any link, waits for Crossly review (24 h). Rewording re-reviews.


<a name="createWorldExperienceExperienceEvent"></a>
# **createWorldExperienceExperienceEvent**
> WorldExperienceExperienceEventResponse createWorldExperienceExperienceEvent(experienceId)

Schedule an Experience Event shown on the game&#39;s card: title, description, start/end (5 min–14 days, ≤ 180 days ahead), thumbnail, place. With liveEventId it follows that live-ops event&#39;s schedule.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsEngagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsEngagementApi apiInstance = new WorldsEngagementApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      WorldExperienceExperienceEventResponse result = apiInstance.createWorldExperienceExperienceEvent(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsEngagementApi#createWorldExperienceExperienceEvent");
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

**WorldExperienceExperienceEventResponse**

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

<a name="createWorldExperienceExperienceEventCancel"></a>
# **createWorldExperienceExperienceEventCancel**
> WorldExperienceExperienceEventResponse createWorldExperienceExperienceEventCancel(experienceId, eventId)

Cancel an event (it disappears from the game&#39;s card; no reminder goes out).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsEngagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsEngagementApi apiInstance = new WorldsEngagementApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String eventId = "eventId_example"; // String | 
    try {
      WorldExperienceExperienceEventResponse result = apiInstance.createWorldExperienceExperienceEventCancel(experienceId, eventId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsEngagementApi#createWorldExperienceExperienceEventCancel");
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
 **eventId** | **String**|  |

### Return type

**WorldExperienceExperienceEventResponse**

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

<a name="createWorldExperienceExperienceEventRsvp"></a>
# **createWorldExperienceExperienceEventRsvp**
> WorldExperienceExperienceEventResponse createWorldExperienceExperienceEventRsvp(experienceId, eventId)

RSVP (going: true) or take it back. remind: true also turns the experience&#39;s notifications on, so the 15-minute reminder can reach you.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsEngagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsEngagementApi apiInstance = new WorldsEngagementApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String eventId = "eventId_example"; // String | 
    try {
      WorldExperienceExperienceEventResponse result = apiInstance.createWorldExperienceExperienceEventRsvp(experienceId, eventId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsEngagementApi#createWorldExperienceExperienceEventRsvp");
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
 **eventId** | **String**|  |

### Return type

**WorldExperienceExperienceEventResponse**

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

<a name="createWorldExperienceNotification"></a>
# **createWorldExperienceNotification**
> CreateWorldExperienceNotificationResponse createWorldExperienceNotification(experienceId)

Send an approved template to one player (sub) or up to 100 (subs). Only players who turned notifications on, 13+, not banned, at most 2 a day per player and outside their quiet hours receive it; every other send is logged as suppressed with its reason.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsEngagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsEngagementApi apiInstance = new WorldsEngagementApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      CreateWorldExperienceNotificationResponse result = apiInstance.createWorldExperienceNotification(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsEngagementApi#createWorldExperienceNotification");
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

**CreateWorldExperienceNotificationResponse**

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

<a name="createWorldExperienceNotificationTemplateRetire"></a>
# **createWorldExperienceNotificationTemplateRetire**
> UpdateWorldExperienceNotificationTemplateResponse createWorldExperienceNotificationTemplateRetire(experienceId, key)

Retire a template: sends by its key stop.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsEngagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsEngagementApi apiInstance = new WorldsEngagementApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String key = "key_example"; // String | 
    try {
      UpdateWorldExperienceNotificationTemplateResponse result = apiInstance.createWorldExperienceNotificationTemplateRetire(experienceId, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsEngagementApi#createWorldExperienceNotificationTemplateRetire");
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
 **key** | **String**|  |

### Return type

**UpdateWorldExperienceNotificationTemplateResponse**

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

<a name="getWorldExperienceNotificationOptIn"></a>
# **getWorldExperienceNotificationOptIn**
> GetWorldExperienceNotificationOptInResponse getWorldExperienceNotificationOptIn(experienceId)

Whether you turned this experience&#39;s notifications on.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsEngagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsEngagementApi apiInstance = new WorldsEngagementApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      GetWorldExperienceNotificationOptInResponse result = apiInstance.getWorldExperienceNotificationOptIn(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsEngagementApi#getWorldExperienceNotificationOptIn");
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

**GetWorldExperienceNotificationOptInResponse**

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

<a name="getWorldExperienceNotificationReport"></a>
# **getWorldExperienceNotificationReport**
> GetWorldExperienceNotificationReportResponse getWorldExperienceNotificationReport(experienceId)

Sends over the last N days (default 7, max 90): delivered, suppressed by reason, per template, and how many players turned notifications on.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsEngagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsEngagementApi apiInstance = new WorldsEngagementApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      GetWorldExperienceNotificationReportResponse result = apiInstance.getWorldExperienceNotificationReport(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsEngagementApi#getWorldExperienceNotificationReport");
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

**GetWorldExperienceNotificationReportResponse**

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

<a name="listWorldExperienceEventUpcoming"></a>
# **listWorldExperienceEventUpcoming**
> ListWorldExperienceEventUpcomingResponse listWorldExperienceEventUpcoming()

Events across public experiences in the next 7 days (and live now), soonest first — the Carnival Plaza&#39;s \&quot;Coming up\&quot; board.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsEngagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsEngagementApi apiInstance = new WorldsEngagementApi(defaultClient);
    try {
      ListWorldExperienceEventUpcomingResponse result = apiInstance.listWorldExperienceEventUpcoming();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsEngagementApi#listWorldExperienceEventUpcoming");
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

**ListWorldExperienceEventUpcomingResponse**

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

<a name="listWorldExperienceExperienceEventUpcoming"></a>
# **listWorldExperienceExperienceEventUpcoming**
> ListWorldExperienceExperienceEventsResponse listWorldExperienceExperienceEventUpcoming(experienceId)

An experience&#39;s upcoming and live events as players see them, with whether you are going.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsEngagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsEngagementApi apiInstance = new WorldsEngagementApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      ListWorldExperienceExperienceEventsResponse result = apiInstance.listWorldExperienceExperienceEventUpcoming(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsEngagementApi#listWorldExperienceExperienceEventUpcoming");
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

**ListWorldExperienceExperienceEventsResponse**

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

<a name="listWorldExperienceExperienceEvents"></a>
# **listWorldExperienceExperienceEvents**
> ListWorldExperienceExperienceEventsResponse listWorldExperienceExperienceEvents(experienceId)

Your scheduled Experience Events (upcoming, live and the last 30 days) with RSVP counts.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsEngagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsEngagementApi apiInstance = new WorldsEngagementApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      ListWorldExperienceExperienceEventsResponse result = apiInstance.listWorldExperienceExperienceEvents(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsEngagementApi#listWorldExperienceExperienceEvents");
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

**ListWorldExperienceExperienceEventsResponse**

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

<a name="listWorldExperienceNotificationTemplates"></a>
# **listWorldExperienceNotificationTemplates**
> ListWorldExperienceNotificationTemplatesResponse listWorldExperienceNotificationTemplates(experienceId)

Notification templates: key, title and body with {placeholders}, review status (approved ones can be sent).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsEngagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsEngagementApi apiInstance = new WorldsEngagementApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      ListWorldExperienceNotificationTemplatesResponse result = apiInstance.listWorldExperienceNotificationTemplates(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsEngagementApi#listWorldExperienceNotificationTemplates");
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

**ListWorldExperienceNotificationTemplatesResponse**

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

<a name="listWorldMeExperienceEvents"></a>
# **listWorldMeExperienceEvents**
> ListWorldMeExperienceEventsResponse listWorldMeExperienceEvents()

Events you are going to that have not ended.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsEngagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsEngagementApi apiInstance = new WorldsEngagementApi(defaultClient);
    try {
      ListWorldMeExperienceEventsResponse result = apiInstance.listWorldMeExperienceEvents();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsEngagementApi#listWorldMeExperienceEvents");
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

**ListWorldMeExperienceEventsResponse**

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

<a name="listWorldMeNotificationOptIns"></a>
# **listWorldMeNotificationOptIns**
> ListWorldMeNotificationOptInsResponse listWorldMeNotificationOptIns()

Every experience whose notifications you turned on.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsEngagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsEngagementApi apiInstance = new WorldsEngagementApi(defaultClient);
    try {
      ListWorldMeNotificationOptInsResponse result = apiInstance.listWorldMeNotificationOptIns();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsEngagementApi#listWorldMeNotificationOptIns");
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

**ListWorldMeNotificationOptInsResponse**

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

<a name="updateWorldExperienceExperienceEvent"></a>
# **updateWorldExperienceExperienceEvent**
> WorldExperienceExperienceEventResponse updateWorldExperienceExperienceEvent(experienceId, eventId)

Change an event. A started event keeps its start; a new start time earns RSVPs a new reminder.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsEngagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsEngagementApi apiInstance = new WorldsEngagementApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String eventId = "eventId_example"; // String | 
    try {
      WorldExperienceExperienceEventResponse result = apiInstance.updateWorldExperienceExperienceEvent(experienceId, eventId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsEngagementApi#updateWorldExperienceExperienceEvent");
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
 **eventId** | **String**|  |

### Return type

**WorldExperienceExperienceEventResponse**

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

<a name="updateWorldExperienceNotificationOptIn"></a>
# **updateWorldExperienceNotificationOptIn**
> GetWorldExperienceNotificationOptInResponse updateWorldExperienceNotificationOptIn(experienceId)

Turn this experience&#39;s notifications on or off for you. timeZone (IANA) keeps them out of your night.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsEngagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsEngagementApi apiInstance = new WorldsEngagementApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      GetWorldExperienceNotificationOptInResponse result = apiInstance.updateWorldExperienceNotificationOptIn(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsEngagementApi#updateWorldExperienceNotificationOptIn");
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

**GetWorldExperienceNotificationOptInResponse**

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

<a name="updateWorldExperienceNotificationTemplate"></a>
# **updateWorldExperienceNotificationTemplate**
> UpdateWorldExperienceNotificationTemplateResponse updateWorldExperienceNotificationTemplate(experienceId, key)

Create or reword a template. Clean words with no link are approved at once; anything the text filter flags, or any link, waits for Crossly review (24 h). Rewording re-reviews.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsEngagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsEngagementApi apiInstance = new WorldsEngagementApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String key = "key_example"; // String | 
    try {
      UpdateWorldExperienceNotificationTemplateResponse result = apiInstance.updateWorldExperienceNotificationTemplate(experienceId, key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsEngagementApi#updateWorldExperienceNotificationTemplate");
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
 **key** | **String**|  |

### Return type

**UpdateWorldExperienceNotificationTemplateResponse**

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

