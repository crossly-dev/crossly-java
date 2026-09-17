# InboxApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInboxAiSuggest**](InboxApi.md#createInboxAiSuggest) | **POST** /v1/inbox/ai-suggest | AI reply suggestion for a conversation.
[**createInboxCannedRespons**](InboxApi.md#createInboxCannedRespons) | **POST** /v1/inbox/canned-responses | Create a canned response.
[**createInboxConversationBulk**](InboxApi.md#createInboxConversationBulk) | **POST** /v1/inbox/conversations/bulk | Bulk mark read / mark unread / soft-delete conversations.
[**createInboxConversationBulkAiRespond**](InboxApi.md#createInboxConversationBulkAiRespond) | **POST** /v1/inbox/conversations/bulk-ai-respond | AI reply suggestion for multiple conversations — draft or send.
[**createInboxConversationOfferAction**](InboxApi.md#createInboxConversationOfferAction) | **POST** /v1/inbox/conversations/{id}/offer-action | Accept / counter / decline an active offer on a conversation.
[**createInboxMessageTriage**](InboxApi.md#createInboxMessageTriage) | **POST** /v1/inbox/messages/{id}/triage | Manually re-triage a buyer message.
[**createInboxOffer**](InboxApi.md#createInboxOffer) | **POST** /v1/inbox/{id}/offer | Accept, counter, or decline an offer on a conversation.
[**createInboxReply**](InboxApi.md#createInboxReply) | **POST** /v1/inbox/{id}/reply | Send a reply to a conversation thread.
[**deleteInboxCannedRespons**](InboxApi.md#deleteInboxCannedRespons) | **DELETE** /v1/inbox/canned-responses/{id} | Delete a canned response.
[**getInbox**](InboxApi.md#getInbox) | **GET** /v1/inbox/{id} | Get one conversation with its messages.
[**getInboxCannedRespons**](InboxApi.md#getInboxCannedRespons) | **GET** /v1/inbox/canned-responses | List canned responses.
[**getInboxConversationMessage**](InboxApi.md#getInboxConversationMessage) | **GET** /v1/inbox/conversations/{id}/messages | Paginated messages for a conversation.
[**getInboxConversationUnreadCount**](InboxApi.md#getInboxConversationUnreadCount) | **GET** /v1/inbox/conversations/unread-count | Sidebar badge: unread conversation count.
[**listInbox**](InboxApi.md#listInbox) | **GET** /v1/inbox | List conversations.
[**updateInboxCannedRespons**](InboxApi.md#updateInboxCannedRespons) | **PUT** /v1/inbox/canned-responses/{id} | Update a canned response.
[**updateInboxConversation**](InboxApi.md#updateInboxConversation) | **PATCH** /v1/inbox/conversations/{id} | Mark read / change status / close conversation.


<a name="createInboxAiSuggest"></a>
# **createInboxAiSuggest**
> CreateInboxAiSuggestResponse createInboxAiSuggest()

AI reply suggestion for a conversation.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    InboxApi apiInstance = new InboxApi(defaultClient);
    try {
      CreateInboxAiSuggestResponse result = apiInstance.createInboxAiSuggest();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#createInboxAiSuggest");
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

[**CreateInboxAiSuggestResponse**](CreateInboxAiSuggestResponse.md)

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

<a name="createInboxCannedRespons"></a>
# **createInboxCannedRespons**
> CreateInboxCannedResponsResponse createInboxCannedRespons()

Create a canned response.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    InboxApi apiInstance = new InboxApi(defaultClient);
    try {
      CreateInboxCannedResponsResponse result = apiInstance.createInboxCannedRespons();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#createInboxCannedRespons");
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

[**CreateInboxCannedResponsResponse**](CreateInboxCannedResponsResponse.md)

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

<a name="createInboxConversationBulk"></a>
# **createInboxConversationBulk**
> CreateInboxConversationBulkResponse createInboxConversationBulk()

Bulk mark read / mark unread / soft-delete conversations.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    InboxApi apiInstance = new InboxApi(defaultClient);
    try {
      CreateInboxConversationBulkResponse result = apiInstance.createInboxConversationBulk();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#createInboxConversationBulk");
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

[**CreateInboxConversationBulkResponse**](CreateInboxConversationBulkResponse.md)

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

<a name="createInboxConversationBulkAiRespond"></a>
# **createInboxConversationBulkAiRespond**
> CreateInboxConversationBulkAiRespondResponse createInboxConversationBulkAiRespond()

AI reply suggestion for multiple conversations — draft or send.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    InboxApi apiInstance = new InboxApi(defaultClient);
    try {
      CreateInboxConversationBulkAiRespondResponse result = apiInstance.createInboxConversationBulkAiRespond();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#createInboxConversationBulkAiRespond");
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

[**CreateInboxConversationBulkAiRespondResponse**](CreateInboxConversationBulkAiRespondResponse.md)

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

<a name="createInboxConversationOfferAction"></a>
# **createInboxConversationOfferAction**
> CreateInboxConversationOfferActionResponse createInboxConversationOfferAction(id)

Accept / counter / decline an active offer on a conversation.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    InboxApi apiInstance = new InboxApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateInboxConversationOfferActionResponse result = apiInstance.createInboxConversationOfferAction(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#createInboxConversationOfferAction");
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

[**CreateInboxConversationOfferActionResponse**](CreateInboxConversationOfferActionResponse.md)

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

<a name="createInboxMessageTriage"></a>
# **createInboxMessageTriage**
> CreateInboxMessageTriageResponse createInboxMessageTriage(id)

Manually re-triage a buyer message.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    InboxApi apiInstance = new InboxApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateInboxMessageTriageResponse result = apiInstance.createInboxMessageTriage(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#createInboxMessageTriage");
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

[**CreateInboxMessageTriageResponse**](CreateInboxMessageTriageResponse.md)

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

<a name="createInboxOffer"></a>
# **createInboxOffer**
> CreateInboxOfferResponse createInboxOffer(id)

Accept, counter, or decline an offer on a conversation.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    InboxApi apiInstance = new InboxApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateInboxOfferResponse result = apiInstance.createInboxOffer(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#createInboxOffer");
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

[**CreateInboxOfferResponse**](CreateInboxOfferResponse.md)

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

<a name="createInboxReply"></a>
# **createInboxReply**
> CreateInboxReplyResponse createInboxReply(id)

Send a reply to a conversation thread.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    InboxApi apiInstance = new InboxApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateInboxReplyResponse result = apiInstance.createInboxReply(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#createInboxReply");
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

[**CreateInboxReplyResponse**](CreateInboxReplyResponse.md)

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

<a name="deleteInboxCannedRespons"></a>
# **deleteInboxCannedRespons**
> DeleteInboxCannedResponsResponse deleteInboxCannedRespons(id)

Delete a canned response.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    InboxApi apiInstance = new InboxApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      DeleteInboxCannedResponsResponse result = apiInstance.deleteInboxCannedRespons(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#deleteInboxCannedRespons");
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

[**DeleteInboxCannedResponsResponse**](DeleteInboxCannedResponsResponse.md)

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

<a name="getInbox"></a>
# **getInbox**
> GetInboxResponse getInbox(id)

Get one conversation with its messages.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    InboxApi apiInstance = new InboxApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      GetInboxResponse result = apiInstance.getInbox(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#getInbox");
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

[**GetInboxResponse**](GetInboxResponse.md)

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

<a name="getInboxCannedRespons"></a>
# **getInboxCannedRespons**
> GetInboxCannedResponsResponse getInboxCannedRespons()

List canned responses.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    InboxApi apiInstance = new InboxApi(defaultClient);
    try {
      GetInboxCannedResponsResponse result = apiInstance.getInboxCannedRespons();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#getInboxCannedRespons");
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

[**GetInboxCannedResponsResponse**](GetInboxCannedResponsResponse.md)

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

<a name="getInboxConversationMessage"></a>
# **getInboxConversationMessage**
> GetInboxConversationMessageResponse getInboxConversationMessage(id)

Paginated messages for a conversation.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    InboxApi apiInstance = new InboxApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      GetInboxConversationMessageResponse result = apiInstance.getInboxConversationMessage(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#getInboxConversationMessage");
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

[**GetInboxConversationMessageResponse**](GetInboxConversationMessageResponse.md)

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

<a name="getInboxConversationUnreadCount"></a>
# **getInboxConversationUnreadCount**
> GetInboxConversationUnreadCountResponse getInboxConversationUnreadCount()

Sidebar badge: unread conversation count.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    InboxApi apiInstance = new InboxApi(defaultClient);
    try {
      GetInboxConversationUnreadCountResponse result = apiInstance.getInboxConversationUnreadCount();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#getInboxConversationUnreadCount");
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

[**GetInboxConversationUnreadCountResponse**](GetInboxConversationUnreadCountResponse.md)

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

<a name="listInbox"></a>
# **listInbox**
> V1List listInbox(page, limit)

List conversations.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    InboxApi apiInstance = new InboxApi(defaultClient);
    Integer page = 1; // Integer | 
    Integer limit = 25; // Integer | 
    try {
      V1List result = apiInstance.listInbox(page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#listInbox");
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

<a name="updateInboxCannedRespons"></a>
# **updateInboxCannedRespons**
> UpdateInboxCannedResponsResponse updateInboxCannedRespons(id)

Update a canned response.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    InboxApi apiInstance = new InboxApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      UpdateInboxCannedResponsResponse result = apiInstance.updateInboxCannedRespons(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#updateInboxCannedRespons");
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

[**UpdateInboxCannedResponsResponse**](UpdateInboxCannedResponsResponse.md)

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

<a name="updateInboxConversation"></a>
# **updateInboxConversation**
> UpdateInboxConversationResponse updateInboxConversation(id)

Mark read / change status / close conversation.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    InboxApi apiInstance = new InboxApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      UpdateInboxConversationResponse result = apiInstance.updateInboxConversation(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#updateInboxConversation");
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

[**UpdateInboxConversationResponse**](UpdateInboxConversationResponse.md)

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

