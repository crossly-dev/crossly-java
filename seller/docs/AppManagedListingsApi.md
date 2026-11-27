# AppManagedListingsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createListingCommandAck**](AppManagedListingsApi.md#createListingCommandAck) | **POST** /v1/listing-commands/{id}/ack | Acknowledge a command (you will act on it). Extends its deadline: 24 h for listing commands; tracking 2 h, cancel 4 h, refund 24 h, message 1 h.
[**createListingCommandComplete**](AppManagedListingsApi.md#createListingCommandComplete) | **POST** /v1/listing-commands/{id}/complete | Report a command done on the marketplace. relist: newExternalId when a new id was issued; refund_order: platformRefundId + amount (required); submit_tracking: trackingNumber/carrier as the marketplace holds them; message_buyer: platformMessageId.
[**createListingCommandFail**](AppManagedListingsApi.md#createListingCommandFail) | **POST** /v1/listing-commands/{id}/fail | Report a command failed, with a reason the seller will see.
[**createListingEvent**](AppManagedListingsApi.md#createListingEvent) | **POST** /v1/listings/{id}/events | Report a marketplace event (item.updated / ended / sold / relisted) for a listing your app manages.
[**createListingEvent2**](AppManagedListingsApi.md#createListingEvent2) | **POST** /v1/listings/events | Report up to 100 marketplace events keyed by platform + externalId. One bad event never fails the rest.
[**createListingLink**](AppManagedListingsApi.md#createListingLink) | **POST** /v1/listings/link | Link a live marketplace listing your app already manages into Crossly (no re-listing). Idempotent.
[**createListingLinkBulk**](AppManagedListingsApi.md#createListingLinkBulk) | **POST** /v1/listings/link/bulk | Link up to 100 live marketplace listings. Each item succeeds or fails on its own; re-sending is safe.
[**createListingPlatformReclone**](AppManagedListingsApi.md#createListingPlatformReclone) | **POST** /v1/listings/{id}/platforms/{platform}/reclone | End this marketplace item and relist it under Crossly. Requires consent: true.
[**createListingPlatformRecloneCancel**](AppManagedListingsApi.md#createListingPlatformRecloneCancel) | **POST** /v1/listings/{id}/platforms/{platform}/reclone/cancel | Cancel a relist still waiting for you to end the old item.
[**createListingPlatformRecloneSellerEnded**](AppManagedListingsApi.md#createListingPlatformRecloneSellerEnded) | **POST** /v1/listings/{id}/platforms/{platform}/reclone/seller-ended | You ended the old item on the marketplace yourself (Done).
[**createListingPlatformTakeOver**](AppManagedListingsApi.md#createListingPlatformTakeOver) | **POST** /v1/listings/{id}/platforms/{platform}/take-over | Take over an app-managed item: Crossly acts on the marketplace itself (needs your own connection).
[**createListingUnlink**](AppManagedListingsApi.md#createListingUnlink) | **POST** /v1/listings/{id}/unlink | Stop the app managing this listing. It stays live everywhere; the app&#39;s Crossly Shop fee ends for future sales.
[**createOrderEvent**](AppManagedListingsApi.md#createOrderEvent) | **POST** /v1/orders/events | Report up to 100 order events (shipped, cancelled, refunded, delivered) keyed by platform + platformOrderId. Each completes the matching open order command. One bad event never fails the rest.
[**createOrderTakeOver**](AppManagedListingsApi.md#createOrderTakeOver) | **POST** /v1/orders/{id}/take-over | Take over the app-managed item behind an order; its actions then go through your own connection.
[**getListingManagement**](AppManagedListingsApi.md#getListingManagement) | **GET** /v1/listings/{id}/management | Which app manages this listing (null when none). Its fee is charged only on Crossly Shop sales, never on eBay or other marketplaces.
[**getListingPlatformReclone**](AppManagedListingsApi.md#getListingPlatformReclone) | **GET** /v1/listings/{id}/platforms/{platform}/reclone | The latest relist-under-Crossly run for this listing on a platform (null when none).
[**listListingCommands**](AppManagedListingsApi.md#listListingCommands) | **GET** /v1/listing-commands | Your app&#39;s listing (delist/update/relist) and order (submit_tracking, remove_tracking, cancel_order, refund_order, message_buyer) commands for this seller (default: open ones), oldest first.


<a name="createListingCommandAck"></a>
# **createListingCommandAck**
> ListListingCommandsItem createListingCommandAck(id)

Acknowledge a command (you will act on it). Extends its deadline: 24 h for listing commands; tracking 2 h, cancel 4 h, refund 24 h, message 1 h.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AppManagedListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AppManagedListingsApi apiInstance = new AppManagedListingsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      ListListingCommandsItem result = apiInstance.createListingCommandAck(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagedListingsApi#createListingCommandAck");
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

**ListListingCommandsItem**

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

<a name="createListingCommandComplete"></a>
# **createListingCommandComplete**
> ListListingCommandsItem createListingCommandComplete(id)

Report a command done on the marketplace. relist: newExternalId when a new id was issued; refund_order: platformRefundId + amount (required); submit_tracking: trackingNumber/carrier as the marketplace holds them; message_buyer: platformMessageId.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AppManagedListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AppManagedListingsApi apiInstance = new AppManagedListingsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      ListListingCommandsItem result = apiInstance.createListingCommandComplete(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagedListingsApi#createListingCommandComplete");
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

**ListListingCommandsItem**

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

<a name="createListingCommandFail"></a>
# **createListingCommandFail**
> ListListingCommandsItem createListingCommandFail(id)

Report a command failed, with a reason the seller will see.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AppManagedListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AppManagedListingsApi apiInstance = new AppManagedListingsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      ListListingCommandsItem result = apiInstance.createListingCommandFail(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagedListingsApi#createListingCommandFail");
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

**ListListingCommandsItem**

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

<a name="createListingEvent"></a>
# **createListingEvent**
> CreateListingEventResponse createListingEvent(id)

Report a marketplace event (item.updated / ended / sold / relisted) for a listing your app manages.

Idempotent on &#x60;eventId&#x60;. State events apply only when &#x60;sequence&#x60; is higher than the last applied one (else &#x60;stale&#x60;, ignored). &#x60;item.sold&#x60; runs Crossly&#39;s sale cascade (other channels delist) and is never dropped as stale.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AppManagedListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AppManagedListingsApi apiInstance = new AppManagedListingsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateListingEventResponse result = apiInstance.createListingEvent(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagedListingsApi#createListingEvent");
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

**CreateListingEventResponse**

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

<a name="createListingEvent2"></a>
# **createListingEvent2**
> CreateListingEvent2Response createListingEvent2()

Report up to 100 marketplace events keyed by platform + externalId. One bad event never fails the rest.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AppManagedListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AppManagedListingsApi apiInstance = new AppManagedListingsApi(defaultClient);
    try {
      CreateListingEvent2Response result = apiInstance.createListingEvent2();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagedListingsApi#createListingEvent2");
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

**CreateListingEvent2Response**

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

<a name="createListingLink"></a>
# **createListingLink**
> CreateListingLinkResponse createListingLink()

Link a live marketplace listing your app already manages into Crossly (no re-listing). Idempotent.

Direct when Crossly holds the seller&#39;s own connection (verified by item id: exists, active, theirs); relayed otherwise, on your attestation plus &#x60;snapshot&#x60;. The listing shows \&quot;Managed by &lt;your app&gt;\&quot;. Your revenue share is charged only on sales made on Crossly Shop; sales on eBay or any other marketplace never carry an app fee.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AppManagedListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AppManagedListingsApi apiInstance = new AppManagedListingsApi(defaultClient);
    try {
      CreateListingLinkResponse result = apiInstance.createListingLink();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagedListingsApi#createListingLink");
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

**CreateListingLinkResponse**

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

<a name="createListingLinkBulk"></a>
# **createListingLinkBulk**
> CreateListingLinkBulkResponse createListingLinkBulk()

Link up to 100 live marketplace listings. Each item succeeds or fails on its own; re-sending is safe.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AppManagedListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AppManagedListingsApi apiInstance = new AppManagedListingsApi(defaultClient);
    try {
      CreateListingLinkBulkResponse result = apiInstance.createListingLinkBulk();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagedListingsApi#createListingLinkBulk");
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

**CreateListingLinkBulkResponse**

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

<a name="createListingPlatformReclone"></a>
# **createListingPlatformReclone**
> CreateListingPlatformRecloneResponse createListingPlatformReclone(id, platform)

End this marketplace item and relist it under Crossly. Requires consent: true.

Loses the item&#39;s watchers, sold count, sales history, Promoted Listings and open offers; the item number changes. Refused while an order awaits fulfilment or an auction has bids. The new listing is published only after the old one is confirmed ended.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AppManagedListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AppManagedListingsApi apiInstance = new AppManagedListingsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    String platform = "platform_example"; // String | 
    try {
      CreateListingPlatformRecloneResponse result = apiInstance.createListingPlatformReclone(id, platform);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagedListingsApi#createListingPlatformReclone");
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
 **platform** | **String**|  |

### Return type

**CreateListingPlatformRecloneResponse**

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

<a name="createListingPlatformRecloneCancel"></a>
# **createListingPlatformRecloneCancel**
> CreateListingPlatformRecloneResponse createListingPlatformRecloneCancel(id, platform)

Cancel a relist still waiting for you to end the old item.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AppManagedListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AppManagedListingsApi apiInstance = new AppManagedListingsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    String platform = "platform_example"; // String | 
    try {
      CreateListingPlatformRecloneResponse result = apiInstance.createListingPlatformRecloneCancel(id, platform);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagedListingsApi#createListingPlatformRecloneCancel");
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
 **platform** | **String**|  |

### Return type

**CreateListingPlatformRecloneResponse**

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

<a name="createListingPlatformRecloneSellerEnded"></a>
# **createListingPlatformRecloneSellerEnded**
> CreateListingPlatformRecloneResponse createListingPlatformRecloneSellerEnded(id, platform)

You ended the old item on the marketplace yourself (Done).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AppManagedListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AppManagedListingsApi apiInstance = new AppManagedListingsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    String platform = "platform_example"; // String | 
    try {
      CreateListingPlatformRecloneResponse result = apiInstance.createListingPlatformRecloneSellerEnded(id, platform);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagedListingsApi#createListingPlatformRecloneSellerEnded");
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
 **platform** | **String**|  |

### Return type

**CreateListingPlatformRecloneResponse**

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

<a name="createListingPlatformTakeOver"></a>
# **createListingPlatformTakeOver**
> CreateListingPlatformTakeOverResponse createListingPlatformTakeOver(id, platform)

Take over an app-managed item: Crossly acts on the marketplace itself (needs your own connection).

Verifies the item is on your connected account first. mode &#39;direct&#39; (default) keeps the app as manager; &#39;full&#39; also unlinks it (listing.unlinked reason &#39;taken_over&#39;; its Crossly Shop fee stops). An app command already acknowledged answers 409 app_command_in_flight until you send confirm: true.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AppManagedListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AppManagedListingsApi apiInstance = new AppManagedListingsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    String platform = "platform_example"; // String | 
    try {
      CreateListingPlatformTakeOverResponse result = apiInstance.createListingPlatformTakeOver(id, platform);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagedListingsApi#createListingPlatformTakeOver");
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
 **platform** | **String**|  |

### Return type

**CreateListingPlatformTakeOverResponse**

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

<a name="createListingUnlink"></a>
# **createListingUnlink**
> CreateListingUnlinkResponse createListingUnlink(id)

Stop the app managing this listing. It stays live everywhere; the app&#39;s Crossly Shop fee ends for future sales.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AppManagedListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AppManagedListingsApi apiInstance = new AppManagedListingsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateListingUnlinkResponse result = apiInstance.createListingUnlink(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagedListingsApi#createListingUnlink");
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

**CreateListingUnlinkResponse**

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

<a name="createOrderEvent"></a>
# **createOrderEvent**
> CreateOrderEventResponse createOrderEvent()

Report up to 100 order events (shipped, cancelled, refunded, delivered) keyed by platform + platformOrderId. Each completes the matching open order command. One bad event never fails the rest.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AppManagedListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AppManagedListingsApi apiInstance = new AppManagedListingsApi(defaultClient);
    try {
      CreateOrderEventResponse result = apiInstance.createOrderEvent();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagedListingsApi#createOrderEvent");
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

**CreateOrderEventResponse**

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

<a name="createOrderTakeOver"></a>
# **createOrderTakeOver**
> CreateOrderTakeOverResponse createOrderTakeOver(id)

Take over the app-managed item behind an order; its actions then go through your own connection.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AppManagedListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AppManagedListingsApi apiInstance = new AppManagedListingsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateOrderTakeOverResponse result = apiInstance.createOrderTakeOver(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagedListingsApi#createOrderTakeOver");
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

**CreateOrderTakeOverResponse**

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

<a name="getListingManagement"></a>
# **getListingManagement**
> GetListingManagementResponse getListingManagement(id)

Which app manages this listing (null when none). Its fee is charged only on Crossly Shop sales, never on eBay or other marketplaces.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AppManagedListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AppManagedListingsApi apiInstance = new AppManagedListingsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      GetListingManagementResponse result = apiInstance.getListingManagement(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagedListingsApi#getListingManagement");
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

**GetListingManagementResponse**

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

<a name="getListingPlatformReclone"></a>
# **getListingPlatformReclone**
> GetListingPlatformRecloneResponse getListingPlatformReclone(id, platform)

The latest relist-under-Crossly run for this listing on a platform (null when none).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AppManagedListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AppManagedListingsApi apiInstance = new AppManagedListingsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    String platform = "platform_example"; // String | 
    try {
      GetListingPlatformRecloneResponse result = apiInstance.getListingPlatformReclone(id, platform);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagedListingsApi#getListingPlatformReclone");
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
 **platform** | **String**|  |

### Return type

**GetListingPlatformRecloneResponse**

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

<a name="listListingCommands"></a>
# **listListingCommands**
> ListListingCommandsResponse listListingCommands(state, type, limit, page)

Your app&#39;s listing (delist/update/relist) and order (submit_tracking, remove_tracking, cancel_order, refund_order, message_buyer) commands for this seller (default: open ones), oldest first.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AppManagedListingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AppManagedListingsApi apiInstance = new AppManagedListingsApi(defaultClient);
    String state = "state_example"; // String | Comma-separated: pending, acked, completed, failed, expired, cancelled
    String type = "type_example"; // String | Comma-separated: delist, update, relist, submit_tracking, remove_tracking, cancel_order, refund_order, message_buyer
    Integer limit = 56; // Integer | 
    Integer page = 56; // Integer | 
    try {
      ListListingCommandsResponse result = apiInstance.listListingCommands(state, type, limit, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppManagedListingsApi#listListingCommands");
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
 **state** | **String**| Comma-separated: pending, acked, completed, failed, expired, cancelled | [optional]
 **type** | **String**| Comma-separated: delist, update, relist, submit_tracking, remove_tracking, cancel_order, refund_order, message_buyer | [optional]
 **limit** | **Integer**|  | [optional]
 **page** | **Integer**|  | [optional]

### Return type

**ListListingCommandsResponse**

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

