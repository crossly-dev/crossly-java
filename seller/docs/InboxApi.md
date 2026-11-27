# InboxApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInboxAiSuggest**](InboxApi.md#createInboxAiSuggest) | **POST** /v1/inbox/ai-suggest | AI reply suggestion for a conversation.
[**createInboxCannedResponse**](InboxApi.md#createInboxCannedResponse) | **POST** /v1/inbox/canned-responses | Create a canned response (added to the end of the list).
[**createInboxConversationBulk**](InboxApi.md#createInboxConversationBulk) | **POST** /v1/inbox/conversations/bulk | Bulk mark read / mark unread / soft-delete conversations.
[**createInboxConversationBulkAiRespond**](InboxApi.md#createInboxConversationBulkAiRespond) | **POST** /v1/inbox/conversations/bulk-ai-respond | AI reply suggestion for multiple conversations — draft or send.
[**createInboxConversationOfferAction**](InboxApi.md#createInboxConversationOfferAction) | **POST** /v1/inbox/conversations/{id}/offer-action | Accept / counter / decline an active offer on a conversation.
[**createInboxMessageTriage**](InboxApi.md#createInboxMessageTriage) | **POST** /v1/inbox/messages/{id}/triage | Manually re-triage a buyer message.
[**createInboxOffer**](InboxApi.md#createInboxOffer) | **POST** /v1/inbox/{id}/offer | Accept, counter, or decline an offer on a conversation.
[**createInboxReply**](InboxApi.md#createInboxReply) | **POST** /v1/inbox/{id}/reply | Send a reply to a conversation thread.
[**createInboxSendOffer**](InboxApi.md#createInboxSendOffer) | **POST** /v1/inbox/{id}/send-offer | Make the buyer an offer inside a conversation (seller → buyer). Only where the conversation&#39;s canSendOffer is true (Grailed today). &#x60;amount&#x60; is in the listing&#39;s currency, above 0 and below the listing price (whole dollars on Grailed). The offer is in the thread at once as a message with offerAmount + offerStatus, deliveryStatus &#39;sending&#39; until the platform confirms.
[**createVideoRequestAnswer**](InboxApi.md#createVideoRequestAnswer) | **POST** /v1/video-requests/{id}/answer | Answer a video request with a clip you uploaded (POST /v1/video-requests/upload-url, then PUT the file to uploadUrl). The buyer is notified and the clip shows on the listing.
[**createVideoRequestDecline**](InboxApi.md#createVideoRequestDecline) | **POST** /v1/video-requests/{id}/decline | Decline a video request, with an optional note to the buyer.
[**createVideoRequestUploadUrl**](InboxApi.md#createVideoRequestUploadUrl) | **POST** /v1/video-requests/upload-url | A presigned upload for a video answer: PUT the file to uploadUrl with the same Content-Type and exact Content-Length, then answer with publicUrl.
[**deleteInboxCannedResponse**](InboxApi.md#deleteInboxCannedResponse) | **DELETE** /v1/inbox/canned-responses/{id} | Delete a canned response.
[**getInbox**](InboxApi.md#getInbox) | **GET** /v1/inbox/{id} | Get one conversation with its messages and the item it is about (itemTitle, itemThumbnail, itemPrice, itemCurrency, itemUrl on the platform, listingId in Crossly, crosslyListingSlug, canSendOffer). An offer made in the thread is a message with offerAmount + offerStatus.
[**getInboxCannedResponse**](InboxApi.md#getInboxCannedResponse) | **GET** /v1/inbox/canned-responses | List canned responses in the seller&#39;s order.
[**getInboxConversationMessage**](InboxApi.md#getInboxConversationMessage) | **GET** /v1/inbox/conversations/{id}/messages | Paginated messages for a conversation.
[**getInboxConversationUnreadCount**](InboxApi.md#getInboxConversationUnreadCount) | **GET** /v1/inbox/conversations/unread-count | Unread conversation count (threads only; /v1/inbox/counts adds offers).
[**getInboxCount**](InboxApi.md#getInboxCount) | **GET** /v1/inbox/counts | Inbox badges: unread and needs-reply, split into conversations and offers.
[**listInbox**](InboxApi.md#listInbox) | **GET** /v1/inbox | List conversations. &#x60;filter&#x60; narrows to the rows GET /v1/inbox/counts counts.
[**listVideoRequests**](InboxApi.md#listVideoRequests) | **GET** /v1/video-requests | Buyers asking for a video of your items. status: open (default), answered, declined or all.
[**updateInboxCannedResponse**](InboxApi.md#updateInboxCannedResponse) | **PUT** /v1/inbox/canned-responses/{id} | Update a canned response.
[**updateInboxCannedResponseOrder**](InboxApi.md#updateInboxCannedResponseOrder) | **PUT** /v1/inbox/canned-responses/order | Reorder canned responses.
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
import net.crossly.api.InboxApi;

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

**CreateInboxAiSuggestResponse**

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

<a name="createInboxCannedResponse"></a>
# **createInboxCannedResponse**
> CreateInboxCannedResponseResponse createInboxCannedResponse()

Create a canned response (added to the end of the list).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    InboxApi apiInstance = new InboxApi(defaultClient);
    try {
      CreateInboxCannedResponseResponse result = apiInstance.createInboxCannedResponse();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#createInboxCannedResponse");
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

**CreateInboxCannedResponseResponse**

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
import net.crossly.api.InboxApi;

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

**CreateInboxConversationBulkResponse**

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
import net.crossly.api.InboxApi;

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

**CreateInboxConversationBulkAiRespondResponse**

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
> UpdateInboxConversationResponse createInboxConversationOfferAction(id)

Accept / counter / decline an active offer on a conversation.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.InboxApi;

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
      UpdateInboxConversationResponse result = apiInstance.createInboxConversationOfferAction(id);
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

**UpdateInboxConversationResponse**

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
import net.crossly.api.InboxApi;

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

**CreateInboxMessageTriageResponse**

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
import net.crossly.api.InboxApi;

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

**CreateInboxOfferResponse**

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
import net.crossly.api.InboxApi;

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

**CreateInboxReplyResponse**

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

<a name="createInboxSendOffer"></a>
# **createInboxSendOffer**
> CreateInboxSendOfferResponse createInboxSendOffer(id, createInboxSendOfferRequest)

Make the buyer an offer inside a conversation (seller → buyer). Only where the conversation&#39;s canSendOffer is true (Grailed today). &#x60;amount&#x60; is in the listing&#39;s currency, above 0 and below the listing price (whole dollars on Grailed). The offer is in the thread at once as a message with offerAmount + offerStatus, deliveryStatus &#39;sending&#39; until the platform confirms.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    InboxApi apiInstance = new InboxApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    CreateInboxSendOfferRequest createInboxSendOfferRequest = new CreateInboxSendOfferRequest(); // CreateInboxSendOfferRequest | 
    try {
      CreateInboxSendOfferResponse result = apiInstance.createInboxSendOffer(id, createInboxSendOfferRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#createInboxSendOffer");
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
 **createInboxSendOfferRequest** | **CreateInboxSendOfferRequest**|  |

### Return type

**CreateInboxSendOfferResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="createVideoRequestAnswer"></a>
# **createVideoRequestAnswer**
> CreateVideoRequestAnswerResponse createVideoRequestAnswer(id)

Answer a video request with a clip you uploaded (POST /v1/video-requests/upload-url, then PUT the file to uploadUrl). The buyer is notified and the clip shows on the listing.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    InboxApi apiInstance = new InboxApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateVideoRequestAnswerResponse result = apiInstance.createVideoRequestAnswer(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#createVideoRequestAnswer");
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

**CreateVideoRequestAnswerResponse**

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

<a name="createVideoRequestDecline"></a>
# **createVideoRequestDecline**
> CreateVideoRequestAnswerResponse createVideoRequestDecline(id)

Decline a video request, with an optional note to the buyer.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    InboxApi apiInstance = new InboxApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateVideoRequestAnswerResponse result = apiInstance.createVideoRequestDecline(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#createVideoRequestDecline");
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

**CreateVideoRequestAnswerResponse**

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

<a name="createVideoRequestUploadUrl"></a>
# **createVideoRequestUploadUrl**
> CreateVideoRequestUploadUrlResponse createVideoRequestUploadUrl()

A presigned upload for a video answer: PUT the file to uploadUrl with the same Content-Type and exact Content-Length, then answer with publicUrl.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    InboxApi apiInstance = new InboxApi(defaultClient);
    try {
      CreateVideoRequestUploadUrlResponse result = apiInstance.createVideoRequestUploadUrl();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#createVideoRequestUploadUrl");
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

**CreateVideoRequestUploadUrlResponse**

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

<a name="deleteInboxCannedResponse"></a>
# **deleteInboxCannedResponse**
> deleteInboxCannedResponse(id)

Delete a canned response.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.InboxApi;

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
      apiInstance.deleteInboxCannedResponse(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#deleteInboxCannedResponse");
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

null (empty response body)

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content — the request succeeded and there is no body. |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="getInbox"></a>
# **getInbox**
> GetInboxResponse getInbox(id)

Get one conversation with its messages and the item it is about (itemTitle, itemThumbnail, itemPrice, itemCurrency, itemUrl on the platform, listingId in Crossly, crosslyListingSlug, canSendOffer). An offer made in the thread is a message with offerAmount + offerStatus.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.InboxApi;

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

**GetInboxResponse**

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

<a name="getInboxCannedResponse"></a>
# **getInboxCannedResponse**
> GetInboxCannedResponseResponse getInboxCannedResponse()

List canned responses in the seller&#39;s order.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    InboxApi apiInstance = new InboxApi(defaultClient);
    try {
      GetInboxCannedResponseResponse result = apiInstance.getInboxCannedResponse();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#getInboxCannedResponse");
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

**GetInboxCannedResponseResponse**

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
import net.crossly.api.InboxApi;

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

**GetInboxConversationMessageResponse**

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
> CreateWeb3LaunchArtResponse getInboxConversationUnreadCount()

Unread conversation count (threads only; /v1/inbox/counts adds offers).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    InboxApi apiInstance = new InboxApi(defaultClient);
    try {
      CreateWeb3LaunchArtResponse result = apiInstance.getInboxConversationUnreadCount();
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

**CreateWeb3LaunchArtResponse**

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

<a name="getInboxCount"></a>
# **getInboxCount**
> GetInboxCountResponse getInboxCount()

Inbox badges: unread and needs-reply, split into conversations and offers.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    InboxApi apiInstance = new InboxApi(defaultClient);
    try {
      GetInboxCountResponse result = apiInstance.getInboxCount();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#getInboxCount");
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

**GetInboxCountResponse**

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
> ListInboxResponse listInbox(page, limit, filter)

List conversations. &#x60;filter&#x60; narrows to the rows GET /v1/inbox/counts counts.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.InboxApi;

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
    String filter = "unread"; // String | unread | needs_reply (services/inbox/attention.ts). Omit for all.
    try {
      ListInboxResponse result = apiInstance.listInbox(page, limit, filter);
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
 **filter** | **String**| unread | needs_reply (services/inbox/attention.ts). Omit for all. | [optional] [enum: unread, needs_reply]

### Return type

**ListInboxResponse**

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

<a name="listVideoRequests"></a>
# **listVideoRequests**
> ListVideoRequestsResponse listVideoRequests()

Buyers asking for a video of your items. status: open (default), answered, declined or all.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    InboxApi apiInstance = new InboxApi(defaultClient);
    try {
      ListVideoRequestsResponse result = apiInstance.listVideoRequests();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#listVideoRequests");
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

**ListVideoRequestsResponse**

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

<a name="updateInboxCannedResponse"></a>
# **updateInboxCannedResponse**
> CreateInboxCannedResponseResponse updateInboxCannedResponse(id)

Update a canned response.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.InboxApi;

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
      CreateInboxCannedResponseResponse result = apiInstance.updateInboxCannedResponse(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#updateInboxCannedResponse");
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

**CreateInboxCannedResponseResponse**

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

<a name="updateInboxCannedResponseOrder"></a>
# **updateInboxCannedResponseOrder**
> GetInboxCannedResponseResponse updateInboxCannedResponseOrder(updateInboxCannedResponseOrderRequest)

Reorder canned responses.

Pass EVERY canned response id in the new order (first &#x3D; top of the picker). A list with an unknown, missing or repeated id is refused with a validation error and nothing changes.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.InboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    InboxApi apiInstance = new InboxApi(defaultClient);
    UpdateInboxCannedResponseOrderRequest updateInboxCannedResponseOrderRequest = new UpdateInboxCannedResponseOrderRequest(); // UpdateInboxCannedResponseOrderRequest | 
    try {
      GetInboxCannedResponseResponse result = apiInstance.updateInboxCannedResponseOrder(updateInboxCannedResponseOrderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling InboxApi#updateInboxCannedResponseOrder");
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
 **updateInboxCannedResponseOrderRequest** | **UpdateInboxCannedResponseOrderRequest**|  |

### Return type

**GetInboxCannedResponseResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
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
import net.crossly.api.InboxApi;

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

**UpdateInboxConversationResponse**

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

