# SearchApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSearch**](SearchApi.md#getSearch) | **GET** /v1/search | Search everything in your business at once: inventory, listings, orders, sales, customers, conversations, offers, shipments and returns. Exact identifiers (SKU, barcode, order number, tracking number, buyer email, marketplace listing id or a pasted listing URL) rank first, then prefixes, then fuzzy title / brand / buyer matches. Operators: sku:, order:, buyer:, tracking:, in:&lt;type&gt;, status:, platform:. Groups your token has no read scope for are left out.


<a name="getSearch"></a>
# **getSearch**
> GetSearchResponse getSearch(q, types, limit)

Search everything in your business at once: inventory, listings, orders, sales, customers, conversations, offers, shipments and returns. Exact identifiers (SKU, barcode, order number, tracking number, buyer email, marketplace listing id or a pasted listing URL) rank first, then prefixes, then fuzzy title / brand / buyer matches. Operators: sku:, order:, buyer:, tracking:, in:&lt;type&gt;, status:, platform:. Groups your token has no read scope for are left out.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.SearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    SearchApi apiInstance = new SearchApi(defaultClient);
    String q = "q_example"; // String | What to search for (operators allowed).
    String types = "types_example"; // String | Comma-separated groups to search: inventory, listings, orders, sales, customers, conversations, offers, shipments, returns.
    Integer limit = 5; // Integer | Hits per group.
    try {
      GetSearchResponse result = apiInstance.getSearch(q, types, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#getSearch");
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
 **q** | **String**| What to search for (operators allowed). | [optional]
 **types** | **String**| Comma-separated groups to search: inventory, listings, orders, sales, customers, conversations, offers, shipments, returns. | [optional]
 **limit** | **Integer**| Hits per group. | [optional] [default to 5]

### Return type

**GetSearchResponse**

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

