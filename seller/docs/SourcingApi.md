# SourcingApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSourcingReceipt**](SourcingApi.md#createSourcingReceipt) | **POST** /v1/sourcing/receipts | Append a parsed receipt to the sourcing ledger.
[**getSourcingReceipt**](SourcingApi.md#getSourcingReceipt) | **GET** /v1/sourcing/receipts | List parsed sourcing receipts in this user&#39;s ledger.
[**listSourcingDemand**](SourcingApi.md#listSourcingDemand) | **GET** /v1/sourcing/demand | Items buyers looked for on other sites that Crossly did not have.
[**listSourcingDemandMine**](SourcingApi.md#listSourcingDemandMine) | **GET** /v1/sourcing/demand/mine | Unmet buyer demand for items you hold or have sold before.


<a name="createSourcingReceipt"></a>
# **createSourcingReceipt**
> CreateSourcingReceiptResponse createSourcingReceipt()

Append a parsed receipt to the sourcing ledger.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.SourcingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    SourcingApi apiInstance = new SourcingApi(defaultClient);
    try {
      CreateSourcingReceiptResponse result = apiInstance.createSourcingReceipt();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcingApi#createSourcingReceipt");
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

[**CreateSourcingReceiptResponse**](CreateSourcingReceiptResponse.md)

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

<a name="getSourcingReceipt"></a>
# **getSourcingReceipt**
> GetSourcingReceiptResponse getSourcingReceipt()

List parsed sourcing receipts in this user&#39;s ledger.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.SourcingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    SourcingApi apiInstance = new SourcingApi(defaultClient);
    try {
      GetSourcingReceiptResponse result = apiInstance.getSourcingReceipt();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcingApi#getSourcingReceipt");
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

[**GetSourcingReceiptResponse**](GetSourcingReceiptResponse.md)

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

<a name="listSourcingDemand"></a>
# **listSourcingDemand**
> V1List listSourcingDemand(days, minLooks, limit)

Items buyers looked for on other sites that Crossly did not have.

Aggregate demand observed by the Scout extension, ranked by MISSES — the times somebody asked and we had nothing. &#x60;medianPageCents&#x60; is what the retailers were charging, which is the number to source against. Anonymous in every case; there is no per-buyer view of this.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.SourcingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    SourcingApi apiInstance = new SourcingApi(defaultClient);
    Integer days = 30; // Integer | 
    Integer minLooks = 3; // Integer | 
    Integer limit = 50; // Integer | 
    try {
      V1List result = apiInstance.listSourcingDemand(days, minLooks, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcingApi#listSourcingDemand");
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
 **days** | **Integer**|  | [optional] [default to 30]
 **minLooks** | **Integer**|  | [optional] [default to 3]
 **limit** | **Integer**|  | [optional] [default to 50]

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

<a name="listSourcingDemandMine"></a>
# **listSourcingDemandMine**
> V1List listSourcingDemandMine(days, minLookers, limit)

Unmet buyer demand for items you hold or have sold before.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.SourcingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    SourcingApi apiInstance = new SourcingApi(defaultClient);
    Integer days = 60; // Integer | 
    Integer minLookers = 2; // Integer | 
    Integer limit = 25; // Integer | 
    try {
      V1List result = apiInstance.listSourcingDemandMine(days, minLookers, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SourcingApi#listSourcingDemandMine");
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
 **days** | **Integer**|  | [optional] [default to 60]
 **minLookers** | **Integer**|  | [optional] [default to 2]
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

