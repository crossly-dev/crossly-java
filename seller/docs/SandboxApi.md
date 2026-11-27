# SandboxApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSandboxReset**](SandboxApi.md#createSandboxReset) | **POST** /v1/sandbox/reset | Restore the sandbox seller to its seed. Your grant and webhook subscriptions are kept.
[**createSandboxSimulateInventory**](SandboxApi.md#createSandboxSimulateInventory) | **POST** /v1/sandbox/simulate/inventory | Change stock (set, increase or decrease); the new quantity is pushed to every channel.
[**createSandboxSimulateListingSoldOut**](SandboxApi.md#createSandboxSimulateListingSoldOut) | **POST** /v1/sandbox/simulate/listing.sold_out | A listing sells out on a marketplace with no order (stock moves, other channels delist).
[**createSandboxSimulateOrder**](SandboxApi.md#createSandboxSimulateOrder) | **POST** /v1/sandbox/simulate/order | Simulate a sale through the real sale pipeline (order.created, sale.detected, stock and cross-channel updates).
[**createSandboxSimulateOrderAddress**](SandboxApi.md#createSandboxSimulateOrderAddress) | **POST** /v1/sandbox/simulate/order.address | The buyer address of an order simulated with address \&quot;delayed\&quot; arrives now (order.address_available).
[**createSandboxSimulateOrderCancelled**](SandboxApi.md#createSandboxSimulateOrderCancelled) | **POST** /v1/sandbox/simulate/order.cancelled | The buyer or the marketplace cancels an order (order.cancelled).
[**createSandboxSimulateOrderDelivered**](SandboxApi.md#createSandboxSimulateOrderDelivered) | **POST** /v1/sandbox/simulate/order.delivered | The carrier delivers a shipped order (order.delivered).
[**createSandboxSimulateRefund**](SandboxApi.md#createSandboxSimulateRefund) | **POST** /v1/sandbox/simulate/refund | Refund an order in full or in part (refund.issued).
[**getSandbox**](SandboxApi.md#getSandbox) | **GET** /v1/sandbox | The sandbox seller this token acts on, its simulated channels and the failure modes.
[**listSandboxEvents**](SandboxApi.md#listSandboxEvents) | **GET** /v1/sandbox/events | The simulated marketplaces&#39; call log: verb, channel, outcome, latency.


<a name="createSandboxReset"></a>
# **createSandboxReset**
> CreateSandboxResetResponse createSandboxReset()

Restore the sandbox seller to its seed. Your grant and webhook subscriptions are kept.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.SandboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    SandboxApi apiInstance = new SandboxApi(defaultClient);
    try {
      CreateSandboxResetResponse result = apiInstance.createSandboxReset();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SandboxApi#createSandboxReset");
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

**CreateSandboxResetResponse**

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

<a name="createSandboxSimulateInventory"></a>
# **createSandboxSimulateInventory**
> CreateInboxConversationBulkResponse createSandboxSimulateInventory()

Change stock (set, increase or decrease); the new quantity is pushed to every channel.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.SandboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    SandboxApi apiInstance = new SandboxApi(defaultClient);
    try {
      CreateInboxConversationBulkResponse result = apiInstance.createSandboxSimulateInventory();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SandboxApi#createSandboxSimulateInventory");
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

<a name="createSandboxSimulateListingSoldOut"></a>
# **createSandboxSimulateListingSoldOut**
> CreateSandboxSimulateListingSoldOutResponse createSandboxSimulateListingSoldOut()

A listing sells out on a marketplace with no order (stock moves, other channels delist).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.SandboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    SandboxApi apiInstance = new SandboxApi(defaultClient);
    try {
      CreateSandboxSimulateListingSoldOutResponse result = apiInstance.createSandboxSimulateListingSoldOut();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SandboxApi#createSandboxSimulateListingSoldOut");
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

**CreateSandboxSimulateListingSoldOutResponse**

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

<a name="createSandboxSimulateOrder"></a>
# **createSandboxSimulateOrder**
> CreateSandboxSimulateOrderResponse createSandboxSimulateOrder()

Simulate a sale through the real sale pipeline (order.created, sale.detected, stock and cross-channel updates).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.SandboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    SandboxApi apiInstance = new SandboxApi(defaultClient);
    try {
      CreateSandboxSimulateOrderResponse result = apiInstance.createSandboxSimulateOrder();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SandboxApi#createSandboxSimulateOrder");
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

**CreateSandboxSimulateOrderResponse**

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

<a name="createSandboxSimulateOrderAddress"></a>
# **createSandboxSimulateOrderAddress**
> CreateSandboxSimulateOrderAddressResponse createSandboxSimulateOrderAddress()

The buyer address of an order simulated with address \&quot;delayed\&quot; arrives now (order.address_available).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.SandboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    SandboxApi apiInstance = new SandboxApi(defaultClient);
    try {
      CreateSandboxSimulateOrderAddressResponse result = apiInstance.createSandboxSimulateOrderAddress();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SandboxApi#createSandboxSimulateOrderAddress");
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

**CreateSandboxSimulateOrderAddressResponse**

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

<a name="createSandboxSimulateOrderCancelled"></a>
# **createSandboxSimulateOrderCancelled**
> CreateSandboxSimulateOrderCancelledResponse createSandboxSimulateOrderCancelled()

The buyer or the marketplace cancels an order (order.cancelled).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.SandboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    SandboxApi apiInstance = new SandboxApi(defaultClient);
    try {
      CreateSandboxSimulateOrderCancelledResponse result = apiInstance.createSandboxSimulateOrderCancelled();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SandboxApi#createSandboxSimulateOrderCancelled");
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

**CreateSandboxSimulateOrderCancelledResponse**

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

<a name="createSandboxSimulateOrderDelivered"></a>
# **createSandboxSimulateOrderDelivered**
> CreateSandboxSimulateOrderDeliveredResponse createSandboxSimulateOrderDelivered()

The carrier delivers a shipped order (order.delivered).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.SandboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    SandboxApi apiInstance = new SandboxApi(defaultClient);
    try {
      CreateSandboxSimulateOrderDeliveredResponse result = apiInstance.createSandboxSimulateOrderDelivered();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SandboxApi#createSandboxSimulateOrderDelivered");
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

**CreateSandboxSimulateOrderDeliveredResponse**

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

<a name="createSandboxSimulateRefund"></a>
# **createSandboxSimulateRefund**
> CreateSandboxSimulateRefundResponse createSandboxSimulateRefund()

Refund an order in full or in part (refund.issued).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.SandboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    SandboxApi apiInstance = new SandboxApi(defaultClient);
    try {
      CreateSandboxSimulateRefundResponse result = apiInstance.createSandboxSimulateRefund();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SandboxApi#createSandboxSimulateRefund");
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

**CreateSandboxSimulateRefundResponse**

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

<a name="getSandbox"></a>
# **getSandbox**
> GetSandboxResponse getSandbox()

The sandbox seller this token acts on, its simulated channels and the failure modes.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.SandboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    SandboxApi apiInstance = new SandboxApi(defaultClient);
    try {
      GetSandboxResponse result = apiInstance.getSandbox();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SandboxApi#getSandbox");
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

**GetSandboxResponse**

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

<a name="listSandboxEvents"></a>
# **listSandboxEvents**
> ListSandboxEventsResponse listSandboxEvents()

The simulated marketplaces&#39; call log: verb, channel, outcome, latency.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.SandboxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    SandboxApi apiInstance = new SandboxApi(defaultClient);
    try {
      ListSandboxEventsResponse result = apiInstance.listSandboxEvents();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SandboxApi#listSandboxEvents");
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

**ListSandboxEventsResponse**

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

