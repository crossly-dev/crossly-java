# CatalogApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCatalogLookup**](CatalogApi.md#getCatalogLookup) | **GET** /v1/catalog/lookup | Live Crossly offers for a product identifier (barcode, style code, LEGO set…).


<a name="getCatalogLookup"></a>
# **getCatalogLookup**
> GetCatalogLookupResponse getCatalogLookup(namespace, value)

Live Crossly offers for a product identifier (barcode, style code, LEGO set…).

Identifier-first: a GTIN is validated against its GS1 check digit and every length is normalised to 14 digits before lookup, so a UPC-A and its EAN-13 twin resolve to the same product. There is no fuzzy fallback — an identifier we cannot validate returns nothing rather than a guess.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CatalogApi apiInstance = new CatalogApi(defaultClient);
    String namespace = "gtin"; // String | 
    String value = "value_example"; // String | 
    try {
      GetCatalogLookupResponse result = apiInstance.getCatalogLookup(namespace, value);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CatalogApi#getCatalogLookup");
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
 **namespace** | **String**|  | [enum: gtin, style_code, lego_set, tcgplayer, discogs, asin]
 **value** | **String**|  |

### Return type

[**GetCatalogLookupResponse**](GetCatalogLookupResponse.md)

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

