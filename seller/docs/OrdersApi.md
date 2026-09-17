# OrdersApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrderBulkDelete**](OrdersApi.md#createOrderBulkDelete) | **POST** /v1/orders/bulk-delete | Bulk soft- or hard-delete orders by id.
[**createOrderBulkExport**](OrdersApi.md#createOrderBulkExport) | **POST** /v1/orders/bulk-export | Bulk export selected orders as CSV.
[**createOrderBulkMarkDisputed**](OrdersApi.md#createOrderBulkMarkDisputed) | **POST** /v1/orders/bulk-mark-disputed | Bulk mark orders as disputed with a shared reason.
[**createOrderBulkMarkShipped**](OrdersApi.md#createOrderBulkMarkShipped) | **POST** /v1/orders/bulk-mark-shipped | Bulk flip status&#x3D;shipped, clear the reserved-stock marker, and notify each platform.
[**createOrderBulkPackingSlip**](OrdersApi.md#createOrderBulkPackingSlip) | **POST** /v1/orders/bulk-packing-slips | Bulk packing slips PDF.
[**createOrderCancel**](OrdersApi.md#createOrderCancel) | **POST** /v1/orders/{id}/cancel | Cancel an order on its marketplace.
[**createOrderDispute**](OrdersApi.md#createOrderDispute) | **POST** /v1/orders/{id}/dispute | Flag an order as disputed.
[**createOrderImport**](OrdersApi.md#createOrderImport) | **POST** /v1/orders/import | Manually (re-)pull one or more connected platforms&#39; order history for a day-window.
[**createOrderLabel**](OrdersApi.md#createOrderLabel) | **POST** /v1/orders/{id}/label | Purchase EasyPost shipping label.
[**createOrderMessage**](OrdersApi.md#createOrderMessage) | **POST** /v1/orders/{id}/message | Message the order&#39;s buyer on the marketplace.
[**createOrderPullPlatformLabel**](OrdersApi.md#createOrderPullPlatformLabel) | **POST** /v1/orders/{id}/pull-platform-label | Pull a pre-paid label from cookie platforms (Poshmark/Mercari).
[**createOrderRate**](OrdersApi.md#createOrderRate) | **POST** /v1/orders/{id}/rates | EasyPost rate quote for an order.
[**createOrderRefund**](OrdersApi.md#createOrderRefund) | **POST** /v1/orders/{id}/refund | Issue a full or partial refund on the platform.
[**createOrderTracking**](OrdersApi.md#createOrderTracking) | **POST** /v1/orders/{id}/tracking | Submit tracking number + carrier and notify the platform.
[**getOrder**](OrdersApi.md#getOrder) | **GET** /v1/orders/{id} | Get one order.
[**getOrderCancelEligibility**](OrdersApi.md#getOrderCancelEligibility) | **GET** /v1/orders/{id}/cancel-eligibility | Whether this order can be cancelled, and which reason codes the marketplace accepts.
[**getOrderCount**](OrdersApi.md#getOrderCount) | **GET** /v1/orders/counts | Tab badge counts by status.
[**getOrderEvidence**](OrdersApi.md#getOrderEvidence) | **GET** /v1/orders/{id}/evidence | Everything recorded about how this order was packed and how it arrived.
[**getOrderPackingSlip**](OrdersApi.md#getOrderPackingSlip) | **GET** /v1/orders/{id}/packing-slip | Single-order packing slip PDF.
[**getOrderProofOfDelivery**](OrdersApi.md#getOrderProofOfDelivery) | **GET** /v1/orders/{id}/proof-of-delivery | Proof-of-delivery evidence from the carrier&#39;s scan record (PDF, or JSON).
[**getOrderShipment**](OrdersApi.md#getOrderShipment) | **GET** /v1/orders/{id}/shipments | List the parcels an order shipped in.
[**listOrderUnits**](OrdersApi.md#listOrderUnits) | **GET** /v1/orders/{id}/units | List the identified units that shipped on an order.
[**listOrders**](OrdersApi.md#listOrders) | **GET** /v1/orders | List orders.
[**updateOrder**](OrdersApi.md#updateOrder) | **PATCH** /v1/orders/{id} | Update order (status, notes, tracking).


<a name="createOrderBulkDelete"></a>
# **createOrderBulkDelete**
> CreateOrderBulkDeleteResponse createOrderBulkDelete()

Bulk soft- or hard-delete orders by id.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    try {
      CreateOrderBulkDeleteResponse result = apiInstance.createOrderBulkDelete();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#createOrderBulkDelete");
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

[**CreateOrderBulkDeleteResponse**](CreateOrderBulkDeleteResponse.md)

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

<a name="createOrderBulkExport"></a>
# **createOrderBulkExport**
> String createOrderBulkExport()

Bulk export selected orders as CSV.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    try {
      String result = apiInstance.createOrderBulkExport();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#createOrderBulkExport");
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

**String**

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

<a name="createOrderBulkMarkDisputed"></a>
# **createOrderBulkMarkDisputed**
> CreateOrderBulkMarkDisputedResponse createOrderBulkMarkDisputed()

Bulk mark orders as disputed with a shared reason.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    try {
      CreateOrderBulkMarkDisputedResponse result = apiInstance.createOrderBulkMarkDisputed();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#createOrderBulkMarkDisputed");
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

[**CreateOrderBulkMarkDisputedResponse**](CreateOrderBulkMarkDisputedResponse.md)

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

<a name="createOrderBulkMarkShipped"></a>
# **createOrderBulkMarkShipped**
> CreateOrderBulkMarkShippedResponse createOrderBulkMarkShipped()

Bulk flip status&#x3D;shipped, clear the reserved-stock marker, and notify each platform.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    try {
      CreateOrderBulkMarkShippedResponse result = apiInstance.createOrderBulkMarkShipped();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#createOrderBulkMarkShipped");
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

[**CreateOrderBulkMarkShippedResponse**](CreateOrderBulkMarkShippedResponse.md)

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

<a name="createOrderBulkPackingSlip"></a>
# **createOrderBulkPackingSlip**
> File createOrderBulkPackingSlip()

Bulk packing slips PDF.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    try {
      File result = apiInstance.createOrderBulkPackingSlip();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#createOrderBulkPackingSlip");
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

[**File**](File.md)

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A PDF document. |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="createOrderCancel"></a>
# **createOrderCancel**
> CreateOrderCancelResponse createOrderCancel(id)

Cancel an order on its marketplace.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateOrderCancelResponse result = apiInstance.createOrderCancel(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#createOrderCancel");
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

[**CreateOrderCancelResponse**](CreateOrderCancelResponse.md)

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

<a name="createOrderDispute"></a>
# **createOrderDispute**
> CreateOrderDisputeResponse createOrderDispute(id)

Flag an order as disputed.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateOrderDisputeResponse result = apiInstance.createOrderDispute(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#createOrderDispute");
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

[**CreateOrderDisputeResponse**](CreateOrderDisputeResponse.md)

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

<a name="createOrderImport"></a>
# **createOrderImport**
> CreateOrderImportResponse createOrderImport()

Manually (re-)pull one or more connected platforms&#39; order history for a day-window.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    try {
      CreateOrderImportResponse result = apiInstance.createOrderImport();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#createOrderImport");
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

[**CreateOrderImportResponse**](CreateOrderImportResponse.md)

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

<a name="createOrderLabel"></a>
# **createOrderLabel**
> CreateOrderLabelResponse createOrderLabel(id)

Purchase EasyPost shipping label.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateOrderLabelResponse result = apiInstance.createOrderLabel(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#createOrderLabel");
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

[**CreateOrderLabelResponse**](CreateOrderLabelResponse.md)

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

<a name="createOrderMessage"></a>
# **createOrderMessage**
> CreateOrderMessageResponse createOrderMessage(id)

Message the order&#39;s buyer on the marketplace.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateOrderMessageResponse result = apiInstance.createOrderMessage(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#createOrderMessage");
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

[**CreateOrderMessageResponse**](CreateOrderMessageResponse.md)

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

<a name="createOrderPullPlatformLabel"></a>
# **createOrderPullPlatformLabel**
> CreateOrderPullPlatformLabelResponse createOrderPullPlatformLabel(id)

Pull a pre-paid label from cookie platforms (Poshmark/Mercari).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateOrderPullPlatformLabelResponse result = apiInstance.createOrderPullPlatformLabel(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#createOrderPullPlatformLabel");
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

[**CreateOrderPullPlatformLabelResponse**](CreateOrderPullPlatformLabelResponse.md)

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

<a name="createOrderRate"></a>
# **createOrderRate**
> CreateOrderRateResponse createOrderRate(id)

EasyPost rate quote for an order.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateOrderRateResponse result = apiInstance.createOrderRate(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#createOrderRate");
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

[**CreateOrderRateResponse**](CreateOrderRateResponse.md)

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

<a name="createOrderRefund"></a>
# **createOrderRefund**
> CreateOrderRefundResponse createOrderRefund(id)

Issue a full or partial refund on the platform.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateOrderRefundResponse result = apiInstance.createOrderRefund(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#createOrderRefund");
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

[**CreateOrderRefundResponse**](CreateOrderRefundResponse.md)

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

<a name="createOrderTracking"></a>
# **createOrderTracking**
> CreateOrderTrackingResponse createOrderTracking(id)

Submit tracking number + carrier and notify the platform.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateOrderTrackingResponse result = apiInstance.createOrderTracking(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#createOrderTracking");
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

[**CreateOrderTrackingResponse**](CreateOrderTrackingResponse.md)

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

<a name="getOrder"></a>
# **getOrder**
> GetOrderResponse getOrder(id)

Get one order.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      GetOrderResponse result = apiInstance.getOrder(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getOrder");
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

[**GetOrderResponse**](GetOrderResponse.md)

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

<a name="getOrderCancelEligibility"></a>
# **getOrderCancelEligibility**
> GetOrderCancelEligibilityResponse getOrderCancelEligibility(id)

Whether this order can be cancelled, and which reason codes the marketplace accepts.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      GetOrderCancelEligibilityResponse result = apiInstance.getOrderCancelEligibility(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getOrderCancelEligibility");
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

[**GetOrderCancelEligibilityResponse**](GetOrderCancelEligibilityResponse.md)

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

<a name="getOrderCount"></a>
# **getOrderCount**
> Map&lt;String, BigDecimal&gt; getOrderCount()

Tab badge counts by status.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    try {
      Map<String, BigDecimal> result = apiInstance.getOrderCount();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getOrderCount");
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

[**Map&lt;String, BigDecimal&gt;**](BigDecimal.md)

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

<a name="getOrderEvidence"></a>
# **getOrderEvidence**
> GetOrderEvidenceResponse getOrderEvidence(id)

Everything recorded about how this order was packed and how it arrived.

Returns the packing capture and its attestation verdict, the seal comparison (dispatch vs arrival), the buyer&#39;s arrival-condition state, and the identified units that shipped. Absence is reported as absence — an empty section means nothing was recorded, never that nothing happened.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetOrderEvidenceResponse result = apiInstance.getOrderEvidence(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getOrderEvidence");
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

[**GetOrderEvidenceResponse**](GetOrderEvidenceResponse.md)

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

<a name="getOrderPackingSlip"></a>
# **getOrderPackingSlip**
> File getOrderPackingSlip(id)

Single-order packing slip PDF.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      File result = apiInstance.getOrderPackingSlip(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getOrderPackingSlip");
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

[**File**](File.md)

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/pdf, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | A PDF document. |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="getOrderProofOfDelivery"></a>
# **getOrderProofOfDelivery**
> GetOrderProofOfDeliveryResponse getOrderProofOfDelivery(id)

Proof-of-delivery evidence from the carrier&#39;s scan record (PDF, or JSON).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      GetOrderProofOfDeliveryResponse result = apiInstance.getOrderProofOfDelivery(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getOrderProofOfDelivery");
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

[**GetOrderProofOfDeliveryResponse**](GetOrderProofOfDeliveryResponse.md)

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

<a name="getOrderShipment"></a>
# **getOrderShipment**
> GetOrderShipmentResponse getOrderShipment(id)

List the parcels an order shipped in.

An order can ship in more than one box: eBay allows a second label, Poshmark sells up to ten additional ones, and a bundle can need two. The order record carries only the PRIMARY parcel, so this is the only place the rest are visible. totalLabelCostCents sums every non-voided parcel — reading label cost off the order understates a multi-parcel order by a whole label.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      GetOrderShipmentResponse result = apiInstance.getOrderShipment(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#getOrderShipment");
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

[**GetOrderShipmentResponse**](GetOrderShipmentResponse.md)

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

<a name="listOrderUnits"></a>
# **listOrderUnits**
> V1List listOrderUnits(id)

List the identified units that shipped on an order.

The dispute-time read: what physically went out. An empty list means no identity was recorded, which is not the same as the order having no units.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      V1List result = apiInstance.listOrderUnits(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#listOrderUnits");
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

<a name="listOrders"></a>
# **listOrders**
> V1List listOrders(page, limit, status, platform)

List orders.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    Integer page = 1; // Integer | 
    Integer limit = 25; // Integer | 
    String status = "status_example"; // String | 
    String platform = "platform_example"; // String | 
    try {
      V1List result = apiInstance.listOrders(page, limit, status, platform);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#listOrders");
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
 **status** | **String**|  | [optional]
 **platform** | **String**|  | [optional]

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

<a name="updateOrder"></a>
# **updateOrder**
> UpdateOrderResponse updateOrder(id)

Update order (status, notes, tracking).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.OrdersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    OrdersApi apiInstance = new OrdersApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      UpdateOrderResponse result = apiInstance.updateOrder(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrdersApi#updateOrder");
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

[**UpdateOrderResponse**](UpdateOrderResponse.md)

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

