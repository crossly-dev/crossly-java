# TradeBlockApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTradeBlockEvolutionClaim**](TradeBlockApi.md#createTradeBlockEvolutionClaim) | **POST** /v1/trade-block/evolutions/{id}/claim | Burn COSM and mint the evolved (or set-master) NFT for one of your unlocks.
[**createTradeBlockEvolutionRecipe**](TradeBlockApi.md#createTradeBlockEvolutionRecipe) | **POST** /v1/trade-block/evolution-recipes | Author a Trade Evolution recipe (a graded item or pair that, when swapped, unlocks a cosmetic you designed). Born unreviewed until ops approves.
[**createTradeBlockOfferRespond**](TradeBlockApi.md#createTradeBlockOfferRespond) | **POST** /v1/trade-block/offers/{id}/respond | Accept, decline, counter, or withdraw a Trade Block offer.
[**createTradeBlockPostClose**](TradeBlockApi.md#createTradeBlockPostClose) | **POST** /v1/trade-block/posts/{id}/close | Close one of your posts so it stops taking offers.
[**createTradeBlockPostOffer**](TradeBlockApi.md#createTradeBlockPostOffer) | **POST** /v1/trade-block/posts/{id}/offers | Respond to a post with a concrete swap: items on each side (0..N), optional cash.
[**createTradeBlockSetRecipe**](TradeBlockApi.md#createTradeBlockSetRecipe) | **POST** /v1/trade-block/set-recipes | Author a set-completion recipe (a set of items that, once assembled through trading, unlocks a set-master cosmetic you designed). Born unreviewed until ops approves.
[**getTradeBlockEvolution**](TradeBlockApi.md#getTradeBlockEvolution) | **GET** /v1/trade-block/evolutions | List your Trade Evolution unlocks — completed swaps that unlocked an evolved or set-master NFT you can mint by burning COSM.
[**getTradeBlockPost**](TradeBlockApi.md#getTradeBlockPost) | **GET** /v1/trade-block/posts | Browse open Trade Block posts (wants + offers) on the Crossly Market.
[**getTradeBlockPostById**](TradeBlockApi.md#getTradeBlockPostById) | **GET** /v1/trade-block/posts/{id} | Get one Trade Block post with its items and open-offer count.
[**getTradeBlockTrade**](TradeBlockApi.md#getTradeBlockTrade) | **GET** /v1/trade-block/trades | List the trades you are a party to, newest first.


<a name="createTradeBlockEvolutionClaim"></a>
# **createTradeBlockEvolutionClaim**
> CreateTradeBlockEvolutionClaimResponse createTradeBlockEvolutionClaim(id)

Burn COSM and mint the evolved (or set-master) NFT for one of your unlocks.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TradeBlockApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TradeBlockApi apiInstance = new TradeBlockApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateTradeBlockEvolutionClaimResponse result = apiInstance.createTradeBlockEvolutionClaim(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeBlockApi#createTradeBlockEvolutionClaim");
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

**CreateTradeBlockEvolutionClaimResponse**

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

<a name="createTradeBlockEvolutionRecipe"></a>
# **createTradeBlockEvolutionRecipe**
> CreateTradeBlockEvolutionRecipeResponse createTradeBlockEvolutionRecipe()

Author a Trade Evolution recipe (a graded item or pair that, when swapped, unlocks a cosmetic you designed). Born unreviewed until ops approves.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TradeBlockApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TradeBlockApi apiInstance = new TradeBlockApi(defaultClient);
    try {
      CreateTradeBlockEvolutionRecipeResponse result = apiInstance.createTradeBlockEvolutionRecipe();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeBlockApi#createTradeBlockEvolutionRecipe");
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

**CreateTradeBlockEvolutionRecipeResponse**

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

<a name="createTradeBlockOfferRespond"></a>
# **createTradeBlockOfferRespond**
> CreateTradeBlockOfferRespondResponse createTradeBlockOfferRespond(id)

Accept, decline, counter, or withdraw a Trade Block offer.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TradeBlockApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TradeBlockApi apiInstance = new TradeBlockApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateTradeBlockOfferRespondResponse result = apiInstance.createTradeBlockOfferRespond(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeBlockApi#createTradeBlockOfferRespond");
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

**CreateTradeBlockOfferRespondResponse**

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

<a name="createTradeBlockPostClose"></a>
# **createTradeBlockPostClose**
> OkResponse createTradeBlockPostClose(id)

Close one of your posts so it stops taking offers.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TradeBlockApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TradeBlockApi apiInstance = new TradeBlockApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      OkResponse result = apiInstance.createTradeBlockPostClose(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeBlockApi#createTradeBlockPostClose");
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

**OkResponse**

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

<a name="createTradeBlockPostOffer"></a>
# **createTradeBlockPostOffer**
> IdResponse createTradeBlockPostOffer(id)

Respond to a post with a concrete swap: items on each side (0..N), optional cash.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TradeBlockApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TradeBlockApi apiInstance = new TradeBlockApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      IdResponse result = apiInstance.createTradeBlockPostOffer(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeBlockApi#createTradeBlockPostOffer");
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

**IdResponse**

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

<a name="createTradeBlockSetRecipe"></a>
# **createTradeBlockSetRecipe**
> CreateTradeBlockSetRecipeResponse createTradeBlockSetRecipe()

Author a set-completion recipe (a set of items that, once assembled through trading, unlocks a set-master cosmetic you designed). Born unreviewed until ops approves.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TradeBlockApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TradeBlockApi apiInstance = new TradeBlockApi(defaultClient);
    try {
      CreateTradeBlockSetRecipeResponse result = apiInstance.createTradeBlockSetRecipe();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeBlockApi#createTradeBlockSetRecipe");
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

**CreateTradeBlockSetRecipeResponse**

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

<a name="getTradeBlockEvolution"></a>
# **getTradeBlockEvolution**
> GetTradeBlockEvolutionResponse getTradeBlockEvolution()

List your Trade Evolution unlocks — completed swaps that unlocked an evolved or set-master NFT you can mint by burning COSM.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TradeBlockApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TradeBlockApi apiInstance = new TradeBlockApi(defaultClient);
    try {
      GetTradeBlockEvolutionResponse result = apiInstance.getTradeBlockEvolution();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeBlockApi#getTradeBlockEvolution");
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

**GetTradeBlockEvolutionResponse**

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

<a name="getTradeBlockPost"></a>
# **getTradeBlockPost**
> GetTradeBlockPostResponse getTradeBlockPost(kind, categorySlug, brand, model, q, limit, offset)

Browse open Trade Block posts (wants + offers) on the Crossly Market.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TradeBlockApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TradeBlockApi apiInstance = new TradeBlockApi(defaultClient);
    String kind = "want"; // String | Filter to wants or offers.
    String categorySlug = "categorySlug_example"; // String | Filter to a market category.
    String brand = "brand_example"; // String | Filter to posts with a product of this brand (case-insensitive).
    String model = "model_example"; // String | Filter to posts with a product of this catalogue model (case-insensitive).
    String q = "q_example"; // String | Search title + want text.
    Integer limit = 40; // Integer | 
    Integer offset = 0; // Integer | 
    try {
      GetTradeBlockPostResponse result = apiInstance.getTradeBlockPost(kind, categorySlug, brand, model, q, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeBlockApi#getTradeBlockPost");
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
 **kind** | **String**| Filter to wants or offers. | [optional] [enum: want, offer]
 **categorySlug** | **String**| Filter to a market category. | [optional]
 **brand** | **String**| Filter to posts with a product of this brand (case-insensitive). | [optional]
 **model** | **String**| Filter to posts with a product of this catalogue model (case-insensitive). | [optional]
 **q** | **String**| Search title + want text. | [optional]
 **limit** | **Integer**|  | [optional] [default to 40]
 **offset** | **Integer**|  | [optional] [default to 0]

### Return type

**GetTradeBlockPostResponse**

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

<a name="getTradeBlockPostById"></a>
# **getTradeBlockPostById**
> GetTradeBlockPostByIdResponse getTradeBlockPostById(id)

Get one Trade Block post with its items and open-offer count.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TradeBlockApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TradeBlockApi apiInstance = new TradeBlockApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetTradeBlockPostByIdResponse result = apiInstance.getTradeBlockPostById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeBlockApi#getTradeBlockPostById");
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

**GetTradeBlockPostByIdResponse**

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

<a name="getTradeBlockTrade"></a>
# **getTradeBlockTrade**
> GetTradeBlockTradeResponse getTradeBlockTrade()

List the trades you are a party to, newest first.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TradeBlockApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TradeBlockApi apiInstance = new TradeBlockApi(defaultClient);
    try {
      GetTradeBlockTradeResponse result = apiInstance.getTradeBlockTrade();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TradeBlockApi#getTradeBlockTrade");
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

**GetTradeBlockTradeResponse**

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

