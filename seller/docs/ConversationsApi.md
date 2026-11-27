# ConversationsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConversationMessage**](ConversationsApi.md#createConversationMessage) | **POST** /v1/conversations/{id}/messages | Reply to the buyer, on the marketplace the conversation is on (Crossly marketplace: straight into the thread). The message is in the thread at once with deliveryStatus &#39;sending&#39;; it settles to &#39;sent&#39; or &#39;failed&#39;. reply_not_supported when the thread cannot take a reply (a no-reply sender, a platform with no reply wire).
[**listConversationMessages**](ConversationsApi.md#listConversationMessages) | **GET** /v1/conversations/{id}/messages | A conversation&#39;s messages, oldest first. sender is buyer | seller; a reply you sent shows deliveryStatus sending → sent | failed. since (ISO 8601): only messages sent at or after it.
[**listConversations**](ConversationsApi.md#listConversations) | **GET** /v1/conversations | List buyer conversations, newest activity first. orderId: the conversation(s) about that order (same platform, its listing, its buyer). listingId: about that listing. updatedSince (ISO 8601): only threads with activity at or after it, for polling. search: contains-match on the buyer username or the subject (case-insensitive). Pair with the message.received webhook.


<a name="createConversationMessage"></a>
# **createConversationMessage**
> CreateConversationMessageResponse createConversationMessage(id, createConversationMessageRequest)

Reply to the buyer, on the marketplace the conversation is on (Crossly marketplace: straight into the thread). The message is in the thread at once with deliveryStatus &#39;sending&#39;; it settles to &#39;sent&#39; or &#39;failed&#39;. reply_not_supported when the thread cannot take a reply (a no-reply sender, a platform with no reply wire).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ConversationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ConversationsApi apiInstance = new ConversationsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    CreateConversationMessageRequest createConversationMessageRequest = new CreateConversationMessageRequest(); // CreateConversationMessageRequest | 
    try {
      CreateConversationMessageResponse result = apiInstance.createConversationMessage(id, createConversationMessageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#createConversationMessage");
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
 **createConversationMessageRequest** | **CreateConversationMessageRequest**|  |

### Return type

**CreateConversationMessageResponse**

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

<a name="listConversationMessages"></a>
# **listConversationMessages**
> ListConversationMessagesResponse listConversationMessages(id, page, limit, since)

A conversation&#39;s messages, oldest first. sender is buyer | seller; a reply you sent shows deliveryStatus sending → sent | failed. since (ISO 8601): only messages sent at or after it.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ConversationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ConversationsApi apiInstance = new ConversationsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    Integer page = 1; // Integer | 
    Integer limit = 50; // Integer | 
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | 
    try {
      ListConversationMessagesResponse result = apiInstance.listConversationMessages(id, page, limit, since);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#listConversationMessages");
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
 **page** | **Integer**|  | [optional] [default to 1]
 **limit** | **Integer**|  | [optional] [default to 50]
 **since** | **OffsetDateTime**|  | [optional]

### Return type

**ListConversationMessagesResponse**

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

<a name="listConversations"></a>
# **listConversations**
> ListConversationsResponse listConversations(page, limit, orderId, listingId, platform, updatedSince, search)

List buyer conversations, newest activity first. orderId: the conversation(s) about that order (same platform, its listing, its buyer). listingId: about that listing. updatedSince (ISO 8601): only threads with activity at or after it, for polling. search: contains-match on the buyer username or the subject (case-insensitive). Pair with the message.received webhook.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ConversationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ConversationsApi apiInstance = new ConversationsApi(defaultClient);
    Integer page = 1; // Integer | 
    Integer limit = 25; // Integer | 
    UUID orderId = UUID.randomUUID(); // UUID | 
    UUID listingId = UUID.randomUUID(); // UUID | 
    String platform = "platform_example"; // String | 
    OffsetDateTime updatedSince = OffsetDateTime.now(); // OffsetDateTime | 
    String search = "search_example"; // String | Contains-match (case-insensitive) on the buyer username or the thread subject.
    try {
      ListConversationsResponse result = apiInstance.listConversations(page, limit, orderId, listingId, platform, updatedSince, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ConversationsApi#listConversations");
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
 **orderId** | **UUID**|  | [optional]
 **listingId** | **UUID**|  | [optional]
 **platform** | **String**|  | [optional]
 **updatedSince** | **OffsetDateTime**|  | [optional]
 **search** | **String**| Contains-match (case-insensitive) on the buyer username or the thread subject. | [optional]

### Return type

**ListConversationsResponse**

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

