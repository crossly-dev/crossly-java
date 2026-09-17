# OffersApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOfferRespond**](OffersApi.md#createOfferRespond) | **POST** /v1/offers/{id}/respond | Accept, decline, or counter a buyer offer on a Crossly marketplace listing.
[**getOffer**](OffersApi.md#getOffer) | **GET** /v1/offers | List buyer offers on your Crossly marketplace listings, including bundles.


<a name="createOfferRespond"></a>
# **createOfferRespond**
> CreateOfferRespondResponse createOfferRespond(id, inlineObject2)

Accept, decline, or counter a buyer offer on a Crossly marketplace listing.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.OffersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    OffersApi apiInstance = new OffersApi(defaultClient);
    String id = "id_example"; // String | Offer UUID.
    InlineObject2 inlineObject2 = new InlineObject2(); // InlineObject2 | 
    try {
      CreateOfferRespondResponse result = apiInstance.createOfferRespond(id, inlineObject2);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OffersApi#createOfferRespond");
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
 **id** | **String**| Offer UUID. |
 **inlineObject2** | [**InlineObject2**](InlineObject2.md)|  |

### Return type

[**CreateOfferRespondResponse**](CreateOfferRespondResponse.md)

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

<a name="getOffer"></a>
# **getOffer**
> GetOfferResponse getOffer(status, limit)

List buyer offers on your Crossly marketplace listings, including bundles.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.OffersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    OffersApi apiInstance = new OffersApi(defaultClient);
    String status = "pending"; // String | Filter to one status. Omit for all.
    Integer limit = 50; // Integer | 
    try {
      GetOfferResponse result = apiInstance.getOffer(status, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OffersApi#getOffer");
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
 **status** | **String**| Filter to one status. Omit for all. | [optional] [enum: pending, accepted, declined, countered, expired, withdrawn]
 **limit** | **Integer**|  | [optional] [default to 50]

### Return type

[**GetOfferResponse**](GetOfferResponse.md)

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

