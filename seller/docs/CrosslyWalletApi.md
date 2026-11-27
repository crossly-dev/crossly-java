# CrosslyWalletApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTcgNftReconcile**](CrosslyWalletApi.md#createTcgNftReconcile) | **POST** /v1/tcg/nfts/reconcile | Re-read your wallets on chain so your card counts follow what you hold (cards you moved away leave; cards you received join).
[**createWalletCrossly**](CrosslyWalletApi.md#createWalletCrossly) | **POST** /v1/wallet/crossly | Create your Crossly wallet now (it is otherwise created for you in the background). Idempotent.
[**getWalletCrossly**](CrosslyWalletApi.md#getWalletCrossly) | **GET** /v1/wallet/crossly | Your Crossly wallet (self-custody Solana): status, address, whether it is configured, and your card NFT counts by status.
[**listTcgNfts**](CrosslyWalletApi.md#listTcgNfts) | **GET** /v1/tcg/{game}/nfts | Your card NFTs for a Crossly TCG game: each copy, its mint status, asset id and whether it is soulbound (starter).


<a name="createTcgNftReconcile"></a>
# **createTcgNftReconcile**
> CreateTcgNftReconcileResponse createTcgNftReconcile()

Re-read your wallets on chain so your card counts follow what you hold (cards you moved away leave; cards you received join).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CrosslyWalletApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CrosslyWalletApi apiInstance = new CrosslyWalletApi(defaultClient);
    try {
      CreateTcgNftReconcileResponse result = apiInstance.createTcgNftReconcile();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrosslyWalletApi#createTcgNftReconcile");
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

**CreateTcgNftReconcileResponse**

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

<a name="createWalletCrossly"></a>
# **createWalletCrossly**
> GetWalletCrosslyResponse createWalletCrossly()

Create your Crossly wallet now (it is otherwise created for you in the background). Idempotent.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CrosslyWalletApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CrosslyWalletApi apiInstance = new CrosslyWalletApi(defaultClient);
    try {
      GetWalletCrosslyResponse result = apiInstance.createWalletCrossly();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrosslyWalletApi#createWalletCrossly");
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

**GetWalletCrosslyResponse**

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

<a name="getWalletCrossly"></a>
# **getWalletCrossly**
> GetWalletCrosslyResponse getWalletCrossly()

Your Crossly wallet (self-custody Solana): status, address, whether it is configured, and your card NFT counts by status.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CrosslyWalletApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CrosslyWalletApi apiInstance = new CrosslyWalletApi(defaultClient);
    try {
      GetWalletCrosslyResponse result = apiInstance.getWalletCrossly();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrosslyWalletApi#getWalletCrossly");
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

**GetWalletCrosslyResponse**

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

<a name="listTcgNfts"></a>
# **listTcgNfts**
> ListTcgNftsResponse listTcgNfts(game)

Your card NFTs for a Crossly TCG game: each copy, its mint status, asset id and whether it is soulbound (starter).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CrosslyWalletApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CrosslyWalletApi apiInstance = new CrosslyWalletApi(defaultClient);
    String game = "game_example"; // String | 
    try {
      ListTcgNftsResponse result = apiInstance.listTcgNfts(game);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CrosslyWalletApi#listTcgNfts");
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
 **game** | **String**|  |

### Return type

**ListTcgNftsResponse**

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

