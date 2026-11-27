# TaxonomyApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCategoryById**](TaxonomyApi.md#getCategoryById) | **GET** /v1/categories/{id} | One canonical category and the category it maps to on each marketplace.
[**getTaxonomyCategory**](TaxonomyApi.md#getTaxonomyCategory) | **GET** /v1/taxonomy/{platform}/categories | Categories for a platform. Default is top-level; pass &#x60;?parent&#x3D;&lt;categoryId&gt;&#x60; to drill down one level (supported on cookie platforms whose recipe returns flat parent_id-linked rows).
[**getTaxonomyCategoryAspect**](TaxonomyApi.md#getTaxonomyCategoryAspect) | **GET** /v1/taxonomy/{platform}/categories/{id}/aspects | Item-specific aspects (eBay) / properties (Etsy) / hard-coded enums (cookie platforms) for a category.
[**getTaxonomyCategoryChildren**](TaxonomyApi.md#getTaxonomyCategoryChildren) | **GET** /v1/taxonomy/{platform}/categories/{id}/children | Direct children of a category node.
[**getTaxonomyRequiredField**](TaxonomyApi.md#getTaxonomyRequiredField) | **GET** /v1/taxonomy/{platform}/required-fields | Normalized field schema the seller needs to fill before crossposting to this platform. Combines master fields (title/description/price/condition) with platform-specific overrides.
[**listCategoryAspects**](TaxonomyApi.md#listCategoryAspects) | **GET** /v1/categories/{id}/aspects | Item specifics for a canonical category: required/optional, known values, per-marketplace names.
[**listCategorySearch**](TaxonomyApi.md#listCategorySearch) | **GET** /v1/categories/search | Search or browse Crossly&#39;s canonical categories (the ids listings take as categoryId).
[**listTaxonomyEbayCharities**](TaxonomyApi.md#listTaxonomyEbayCharities) | **GET** /v1/taxonomy/ebay/charities | Search eBay for Charity organisations (the charityId an eBay listing donates to).
[**listTaxonomySuggest**](TaxonomyApi.md#listTaxonomySuggest) | **GET** /v1/taxonomy/{platform}/suggest | Reverse lookup — suggest categories matching a search phrase: eBay live; Poshmark, Mercari, Depop, Grailed, Vinted, Whatnot, Vestiaire, OfferUp, Facebook and Curtsy over their harvested trees. Etsy answers an empty list (browse its tree instead).


<a name="getCategoryById"></a>
# **getCategoryById**
> GetCategoryByIdResponse getCategoryById(id)

One canonical category and the category it maps to on each marketplace.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TaxonomyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TaxonomyApi apiInstance = new TaxonomyApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetCategoryByIdResponse result = apiInstance.getCategoryById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxonomyApi#getCategoryById");
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

**GetCategoryByIdResponse**

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

<a name="getTaxonomyCategory"></a>
# **getTaxonomyCategory**
> GetTaxonomyCategoryResponse getTaxonomyCategory(platform, parent)

Categories for a platform. Default is top-level; pass &#x60;?parent&#x3D;&lt;categoryId&gt;&#x60; to drill down one level (supported on cookie platforms whose recipe returns flat parent_id-linked rows).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TaxonomyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TaxonomyApi apiInstance = new TaxonomyApi(defaultClient);
    String platform = "platform_example"; // String | 
    String parent = "parent_example"; // String | 
    try {
      GetTaxonomyCategoryResponse result = apiInstance.getTaxonomyCategory(platform, parent);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxonomyApi#getTaxonomyCategory");
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
 **platform** | **String**|  |
 **parent** | **String**|  | [optional]

### Return type

**GetTaxonomyCategoryResponse**

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

<a name="getTaxonomyCategoryAspect"></a>
# **getTaxonomyCategoryAspect**
> GetTaxonomyCategoryAspectResponse getTaxonomyCategoryAspect(platform, id)

Item-specific aspects (eBay) / properties (Etsy) / hard-coded enums (cookie platforms) for a category.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TaxonomyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TaxonomyApi apiInstance = new TaxonomyApi(defaultClient);
    String platform = "platform_example"; // String | 
    String id = "id_example"; // String | 
    try {
      GetTaxonomyCategoryAspectResponse result = apiInstance.getTaxonomyCategoryAspect(platform, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxonomyApi#getTaxonomyCategoryAspect");
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
 **platform** | **String**|  |
 **id** | **String**|  |

### Return type

**GetTaxonomyCategoryAspectResponse**

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

<a name="getTaxonomyCategoryChildren"></a>
# **getTaxonomyCategoryChildren**
> GetTaxonomyCategoryChildrenResponse getTaxonomyCategoryChildren(platform, id)

Direct children of a category node.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TaxonomyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TaxonomyApi apiInstance = new TaxonomyApi(defaultClient);
    String platform = "platform_example"; // String | 
    String id = "id_example"; // String | 
    try {
      GetTaxonomyCategoryChildrenResponse result = apiInstance.getTaxonomyCategoryChildren(platform, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxonomyApi#getTaxonomyCategoryChildren");
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
 **platform** | **String**|  |
 **id** | **String**|  |

### Return type

**GetTaxonomyCategoryChildrenResponse**

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

<a name="getTaxonomyRequiredField"></a>
# **getTaxonomyRequiredField**
> GetTaxonomyRequiredFieldResponse getTaxonomyRequiredField(platform, categoryId)

Normalized field schema the seller needs to fill before crossposting to this platform. Combines master fields (title/description/price/condition) with platform-specific overrides.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TaxonomyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TaxonomyApi apiInstance = new TaxonomyApi(defaultClient);
    String platform = "platform_example"; // String | 
    String categoryId = "categoryId_example"; // String | Optional — used to inline aspects when present.
    try {
      GetTaxonomyRequiredFieldResponse result = apiInstance.getTaxonomyRequiredField(platform, categoryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxonomyApi#getTaxonomyRequiredField");
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
 **platform** | **String**|  |
 **categoryId** | **String**| Optional — used to inline aspects when present. | [optional]

### Return type

**GetTaxonomyRequiredFieldResponse**

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

<a name="listCategoryAspects"></a>
# **listCategoryAspects**
> ListCategoryAspectsResponse listCategoryAspects(id, valuesLimit)

Item specifics for a canonical category: required/optional, known values, per-marketplace names.

Required-ness and cardinality come from the eBay category the concept maps to. &#x60;freeText&#x60; &#x3D; any text is accepted; otherwise &#x60;values&#x60; are the known values (up to &#x60;valuesLimit&#x60;). &#x60;marketplaces&#x60; gives the attribute name each marketplace uses for the aspect. Send them as &#x60;itemSpecifics&#x60; on POST /v1/listings.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TaxonomyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TaxonomyApi apiInstance = new TaxonomyApi(defaultClient);
    String id = "id_example"; // String | 
    Integer valuesLimit = 50; // Integer | 
    try {
      ListCategoryAspectsResponse result = apiInstance.listCategoryAspects(id, valuesLimit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxonomyApi#listCategoryAspects");
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
 **valuesLimit** | **Integer**|  | [optional] [default to 50]

### Return type

**ListCategoryAspectsResponse**

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

<a name="listCategorySearch"></a>
# **listCategorySearch**
> ListCategorySearchResponse listCategorySearch(q, path, limit)

Search or browse Crossly&#39;s canonical categories (the ids listings take as categoryId).

&#x60;q&#x60; matches the category name and path. &#x60;path&#x60; (e.g. \&quot;Clothing &amp; Shoes &gt; Men\&quot;) limits to one branch. Without &#x60;q&#x60;, &#x60;meta.branches&#x60; lists the next level under &#x60;path&#x60; (the root when omitted) so a client can walk the tree down to a leaf.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TaxonomyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TaxonomyApi apiInstance = new TaxonomyApi(defaultClient);
    String q = "q_example"; // String | 
    String path = "path_example"; // String | 
    Integer limit = 25; // Integer | 
    try {
      ListCategorySearchResponse result = apiInstance.listCategorySearch(q, path, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxonomyApi#listCategorySearch");
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
 **q** | **String**|  | [optional]
 **path** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional] [default to 25]

### Return type

**ListCategorySearchResponse**

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

<a name="listTaxonomyEbayCharities"></a>
# **listTaxonomyEbayCharities**
> ListTaxonomyEbayCharitiesResponse listTaxonomyEbayCharities(q, limit, marketplace)

Search eBay for Charity organisations (the charityId an eBay listing donates to).

Send the chosen &#x60;charityOrgId&#x60; as &#x60;overrides.ebay.charityId&#x60; with &#x60;overrides.ebay.donationPercentage&#x60; (10-100 in steps of 5) on a listing to donate that share of the eBay sale. &#x60;q&#x60; needs at least 2 characters.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TaxonomyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TaxonomyApi apiInstance = new TaxonomyApi(defaultClient);
    String q = "q_example"; // String | 
    Integer limit = 20; // Integer | 
    String marketplace = "EBAY_US"; // String | 
    try {
      ListTaxonomyEbayCharitiesResponse result = apiInstance.listTaxonomyEbayCharities(q, limit, marketplace);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxonomyApi#listTaxonomyEbayCharities");
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
 **q** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional] [default to 20]
 **marketplace** | **String**|  | [optional] [default to EBAY_US] [enum: EBAY_US, EBAY_GB]

### Return type

**ListTaxonomyEbayCharitiesResponse**

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

<a name="listTaxonomySuggest"></a>
# **listTaxonomySuggest**
> ListTaxonomySuggestResponse listTaxonomySuggest(platform, q)

Reverse lookup — suggest categories matching a search phrase: eBay live; Poshmark, Mercari, Depop, Grailed, Vinted, Whatnot, Vestiaire, OfferUp, Facebook and Curtsy over their harvested trees. Etsy answers an empty list (browse its tree instead).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TaxonomyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TaxonomyApi apiInstance = new TaxonomyApi(defaultClient);
    String platform = "platform_example"; // String | 
    String q = "q_example"; // String | 
    try {
      ListTaxonomySuggestResponse result = apiInstance.listTaxonomySuggest(platform, q);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TaxonomyApi#listTaxonomySuggest");
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
 **platform** | **String**|  |
 **q** | **String**|  | [optional]

### Return type

**ListTaxonomySuggestResponse**

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

