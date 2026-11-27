# TcgCreatorsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTcgCreatorGame**](TcgCreatorsApi.md#createTcgCreatorGame) | **POST** /v1/tcg/creator/games | Submit a card-game package version for review: game.json, cards.json, rules/game.js, thumb.png, art/_*.png as { path, base64 }. Checked, conformance-run, art quarantined, then reviewed by a person.
[**createTcgCreatorGameCheck**](TcgCreatorsApi.md#createTcgCreatorGameCheck) | **POST** /v1/tcg/creator/games/check | Check a card-game package exactly as a submission is checked -- the static report and bot games played against your rules in the sandbox -- storing nothing. Files as { path, base64 }.
[**createTcgCreatorGamePackOpen**](TcgCreatorsApi.md#createTcgCreatorGamePackOpen) | **POST** /v1/tcg/creator/games/{id}/packs/{packId}/open | Open a booster you hold: the game&#39;s rules pick the pulls, the pack is used up, and one COSM copy per card joins your collection (logged with its seed).
[**createTcgCreatorGameStarter**](TcgCreatorsApi.md#createTcgCreatorGameStarter) | **POST** /v1/tcg/creator/games/{id}/starter | Claim a creator game&#39;s free starter deck by its key (once per account; account-bound, never tradeable).
[**createTcgCreatorGameVersionWithdraw**](TcgCreatorsApi.md#createTcgCreatorGameVersionWithdraw) | **POST** /v1/tcg/creator/games/{id}/versions/{v}/withdraw | Withdraw one of your versions that is still waiting for review.
[**getTcgCreatorGame**](TcgCreatorsApi.md#getTcgCreatorGame) | **GET** /v1/tcg/creator/games/{id} | One live creator card game: its set, every card (rules text, rarity, art URL, game data) and its COSM prices.
[**getTcgCreatorGameCollection**](TcgCreatorsApi.md#getTcgCreatorGameCollection) | **GET** /v1/tcg/creator/games/{id}/collection | Your playable copies of a creator game: card id -&gt; copies (free starter plus every COSM copy you hold).
[**getTcgCreatorGamePopularity**](TcgCreatorsApi.md#getTcgCreatorGamePopularity) | **GET** /v1/tcg/creator/games/{id}/popularity | The set&#39;s progress toward going on chain: distinct collectors, packs opened and resales against the bar; when it passes, every holder may mint their cards as NFTs.
[**getTcgCreatorGameShelf**](TcgCreatorsApi.md#getTcgCreatorGameShelf) | **GET** /v1/tcg/creator/games/{id}/shelf | The game&#39;s COSM shelf: the booster and every single, each with its COSM design id (buy via /api/v1/cosm/cosmetics/:id/buy), price, edition cap and copies issued.
[**listTcgCreatorGamePacks**](TcgCreatorsApi.md#listTcgCreatorGamePacks) | **GET** /v1/tcg/creator/games/{id}/packs | Your unopened boosters of a creator game.
[**listTcgCreatorGames**](TcgCreatorsApi.md#listTcgCreatorGames) | **GET** /v1/tcg/creator/games | Live creator card games: name, set, description, typical match length, frame colours, thumbnail.
[**listTcgCreatorMine**](TcgCreatorsApi.md#listTcgCreatorMine) | **GET** /v1/tcg/creator/mine | Your creator card games and every version with its review state and note.


<a name="createTcgCreatorGame"></a>
# **createTcgCreatorGame**
> CreateTcgCreatorGameResponse createTcgCreatorGame()

Submit a card-game package version for review: game.json, cards.json, rules/game.js, thumb.png, art/_*.png as { path, base64 }. Checked, conformance-run, art quarantined, then reviewed by a person.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgCreatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgCreatorsApi apiInstance = new TcgCreatorsApi(defaultClient);
    try {
      CreateTcgCreatorGameResponse result = apiInstance.createTcgCreatorGame();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgCreatorsApi#createTcgCreatorGame");
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

**CreateTcgCreatorGameResponse**

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

<a name="createTcgCreatorGameCheck"></a>
# **createTcgCreatorGameCheck**
> CreateTcgCreatorGameCheckResponse createTcgCreatorGameCheck()

Check a card-game package exactly as a submission is checked -- the static report and bot games played against your rules in the sandbox -- storing nothing. Files as { path, base64 }.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgCreatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgCreatorsApi apiInstance = new TcgCreatorsApi(defaultClient);
    try {
      CreateTcgCreatorGameCheckResponse result = apiInstance.createTcgCreatorGameCheck();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgCreatorsApi#createTcgCreatorGameCheck");
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

**CreateTcgCreatorGameCheckResponse**

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

<a name="createTcgCreatorGamePackOpen"></a>
# **createTcgCreatorGamePackOpen**
> CreateTcgCreatorGamePackOpenResponse createTcgCreatorGamePackOpen(id, packId)

Open a booster you hold: the game&#39;s rules pick the pulls, the pack is used up, and one COSM copy per card joins your collection (logged with its seed).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgCreatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgCreatorsApi apiInstance = new TcgCreatorsApi(defaultClient);
    String id = "id_example"; // String | 
    String packId = "packId_example"; // String | 
    try {
      CreateTcgCreatorGamePackOpenResponse result = apiInstance.createTcgCreatorGamePackOpen(id, packId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgCreatorsApi#createTcgCreatorGamePackOpen");
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
 **packId** | **String**|  |

### Return type

**CreateTcgCreatorGamePackOpenResponse**

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

<a name="createTcgCreatorGameStarter"></a>
# **createTcgCreatorGameStarter**
> CreateTcgStarterResponse createTcgCreatorGameStarter(id)

Claim a creator game&#39;s free starter deck by its key (once per account; account-bound, never tradeable).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgCreatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgCreatorsApi apiInstance = new TcgCreatorsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateTcgStarterResponse result = apiInstance.createTcgCreatorGameStarter(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgCreatorsApi#createTcgCreatorGameStarter");
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

**CreateTcgStarterResponse**

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

<a name="createTcgCreatorGameVersionWithdraw"></a>
# **createTcgCreatorGameVersionWithdraw**
> createTcgCreatorGameVersionWithdraw(id, v)

Withdraw one of your versions that is still waiting for review.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgCreatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgCreatorsApi apiInstance = new TcgCreatorsApi(defaultClient);
    String id = "id_example"; // String | 
    String v = "v_example"; // String | 
    try {
      apiInstance.createTcgCreatorGameVersionWithdraw(id, v);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgCreatorsApi#createTcgCreatorGameVersionWithdraw");
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
 **v** | **String**|  |

### Return type

null (empty response body)

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content — the request succeeded and there is no body. |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="getTcgCreatorGame"></a>
# **getTcgCreatorGame**
> GetTcgCreatorGameResponse getTcgCreatorGame(id)

One live creator card game: its set, every card (rules text, rarity, art URL, game data) and its COSM prices.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgCreatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgCreatorsApi apiInstance = new TcgCreatorsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetTcgCreatorGameResponse result = apiInstance.getTcgCreatorGame(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgCreatorsApi#getTcgCreatorGame");
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

**GetTcgCreatorGameResponse**

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

<a name="getTcgCreatorGameCollection"></a>
# **getTcgCreatorGameCollection**
> GetTcgCreatorGameCollectionResponse getTcgCreatorGameCollection(id)

Your playable copies of a creator game: card id -&gt; copies (free starter plus every COSM copy you hold).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgCreatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgCreatorsApi apiInstance = new TcgCreatorsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetTcgCreatorGameCollectionResponse result = apiInstance.getTcgCreatorGameCollection(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgCreatorsApi#getTcgCreatorGameCollection");
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

**GetTcgCreatorGameCollectionResponse**

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

<a name="getTcgCreatorGamePopularity"></a>
# **getTcgCreatorGamePopularity**
> GetTcgCreatorGamePopularityResponse getTcgCreatorGamePopularity(id)

The set&#39;s progress toward going on chain: distinct collectors, packs opened and resales against the bar; when it passes, every holder may mint their cards as NFTs.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgCreatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgCreatorsApi apiInstance = new TcgCreatorsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetTcgCreatorGamePopularityResponse result = apiInstance.getTcgCreatorGamePopularity(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgCreatorsApi#getTcgCreatorGamePopularity");
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

**GetTcgCreatorGamePopularityResponse**

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

<a name="getTcgCreatorGameShelf"></a>
# **getTcgCreatorGameShelf**
> GetTcgCreatorGameShelfResponse getTcgCreatorGameShelf(id)

The game&#39;s COSM shelf: the booster and every single, each with its COSM design id (buy via /api/v1/cosm/cosmetics/:id/buy), price, edition cap and copies issued.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgCreatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgCreatorsApi apiInstance = new TcgCreatorsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetTcgCreatorGameShelfResponse result = apiInstance.getTcgCreatorGameShelf(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgCreatorsApi#getTcgCreatorGameShelf");
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

**GetTcgCreatorGameShelfResponse**

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

<a name="listTcgCreatorGamePacks"></a>
# **listTcgCreatorGamePacks**
> ListTcgCreatorGamePacksResponse listTcgCreatorGamePacks(id)

Your unopened boosters of a creator game.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgCreatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgCreatorsApi apiInstance = new TcgCreatorsApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      ListTcgCreatorGamePacksResponse result = apiInstance.listTcgCreatorGamePacks(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgCreatorsApi#listTcgCreatorGamePacks");
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

**ListTcgCreatorGamePacksResponse**

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

<a name="listTcgCreatorGames"></a>
# **listTcgCreatorGames**
> ListTcgCreatorGamesResponse listTcgCreatorGames()

Live creator card games: name, set, description, typical match length, frame colours, thumbnail.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgCreatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgCreatorsApi apiInstance = new TcgCreatorsApi(defaultClient);
    try {
      ListTcgCreatorGamesResponse result = apiInstance.listTcgCreatorGames();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgCreatorsApi#listTcgCreatorGames");
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

**ListTcgCreatorGamesResponse**

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

<a name="listTcgCreatorMine"></a>
# **listTcgCreatorMine**
> ListTcgCreatorMineResponse listTcgCreatorMine()

Your creator card games and every version with its review state and note.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgCreatorsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgCreatorsApi apiInstance = new TcgCreatorsApi(defaultClient);
    try {
      ListTcgCreatorMineResponse result = apiInstance.listTcgCreatorMine();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgCreatorsApi#listTcgCreatorMine");
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

**ListTcgCreatorMineResponse**

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

