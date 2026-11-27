# TcgApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTcgChallenge**](TcgApi.md#createTcgChallenge) | **POST** /v1/tcg/{game}/challenges | Open a 1v1 challenge with one of your decks; another player joins it.
[**createTcgDeck**](TcgApi.md#createTcgDeck) | **POST** /v1/tcg/{game}/decks | Create (no id) or update a deck: its lead (Crew Boss, Mastermind or Keeper) and 40 cards you own, checked against the deck rules of its game.
[**createTcgMatchAct**](TcgApi.md#createTcgMatchAct) | **POST** /v1/tcg/matches/{id}/act | Make one move: { action } as listed in the match&#39;s legal moves. The engine checks it.
[**createTcgMatchJoin**](TcgApi.md#createTcgMatchJoin) | **POST** /v1/tcg/matches/{id}/join | Join an open 1v1 challenge with one of your decks.
[**createTcgPackOpen**](TcgApi.md#createTcgPackOpen) | **POST** /v1/tcg/packs/{id}/open | Open one of your earned packs: its eight cards join your collection.
[**createTcgPractice**](TcgApi.md#createTcgPractice) | **POST** /v1/tcg/{game}/practice | Start a practice match against the house bot with one of your decks.
[**createTcgQueue**](TcgApi.md#createTcgQueue) | **POST** /v1/tcg/{game}/queue | Join the ranked queue with an owned, legal deck (free). Returns the match at once when an opponent fits.
[**createTcgStarter**](TcgApi.md#createTcgStarter) | **POST** /v1/tcg/{game}/starter | Claim the free starter deck for a game, choosing its faction (once per account; account-bound, untradeable).
[**createTcgTable**](TcgApi.md#createTcgTable) | **POST** /v1/tcg/{game}/table | Sit at a table with your free starter deck (claimed now if you never did: starter names it, else one is picked for you): joins the oldest open 1v1 challenge, or opens one; already waiting, your own seat back.
[**createTcgTournament**](TcgApi.md#createTcgTournament) | **POST** /v1/tcg/{game}/tournaments | Host a Swiss tournament: name, optional top cut (4 or 8), round length, player cap and start time.
[**createTcgTournamentDrop**](TcgApi.md#createTcgTournamentDrop) | **POST** /v1/tcg/tournaments/{id}/drop | Leave a tournament before it starts, or drop from it (your results stand).
[**createTcgTournamentRegister**](TcgApi.md#createTcgTournamentRegister) | **POST** /v1/tcg/tournaments/{id}/register | Enter a tournament with an owned, legal deck before it starts.
[**createTcgTournamentStart**](TcgApi.md#createTcgTournamentStart) | **POST** /v1/tcg/tournaments/{id}/start | As the host, start the tournament: Swiss rounds are sized to the field and round 1 is dealt.
[**deleteTcgDeck**](TcgApi.md#deleteTcgDeck) | **DELETE** /v1/tcg/decks/{id} | Delete one of your decks.
[**deleteTcgQueue**](TcgApi.md#deleteTcgQueue) | **DELETE** /v1/tcg/{game}/queue | Leave the ranked queue.
[**getTcgCreatorGamePrint**](TcgApi.md#getTcgCreatorGamePrint) | **GET** /v1/tcg/creator/games/{id}/print | Print file links for your own creator card game (owner only): the set&#39;s print file, home sheets and a proof, for its newest version.
[**getTcgCreatorGamePrintByKind**](TcgApi.md#getTcgCreatorGamePrintByKind) | **GET** /v1/tcg/creator/games/{id}/print/{kind} | A PDF of your own creator card game (owner only): kind set | sheet | proof; ?version&#x3D;, ?paper&#x3D;letter|a4, ?card&#x3D; for a proof. Binary (application/pdf).
[**getTcgLadder**](TcgApi.md#getTcgLadder) | **GET** /v1/tcg/{game}/ladder | The season&#39;s ranked leaderboard for a game: place, rating, tier and record (named only where the player chose to be).
[**getTcgLadderMe**](TcgApi.md#getTcgLadderMe) | **GET** /v1/tcg/{game}/ladder/me | Your ranked rating, tier, place and record this season, and whether you are queued.
[**getTcgMatch**](TcgApi.md#getTcgMatch) | **GET** /v1/tcg/{game}/matches | Your recent matches, and open challenges you could join.
[**getTcgMatchById**](TcgApi.md#getTcgMatchById) | **GET** /v1/tcg/matches/{id} | Your view of a match (no hidden information) and, on your turn, every legal move.
[**getTcgMe**](TcgApi.md#getTcgMe) | **GET** /v1/tcg/{game}/me | Your starter faction, collection (card id -&gt; copies), decks and earned packs.
[**getTcgPrint**](TcgApi.md#getTcgPrint) | **GET** /v1/tcg/{game}/print | Print files for one of Crossly&#39;s own card games: a card proof (template), 3 x 3 Letter/A4 home sheets with crop marks, and the set&#39;s print file (63 x 88 mm, 3 mm bleed).
[**getTcgTournament**](TcgApi.md#getTcgTournament) | **GET** /v1/tcg/tournaments/{id} | A tournament&#39;s standings (points, opponents&#39; and game win %), this round&#39;s pairings and your seat.
[**listTcgCards**](TcgApi.md#listTcgCards) | **GET** /v1/tcg/{game}/cards | The game&#39;s card pool: every card with its rules text, stats, rarity and collector number.
[**listTcgGames**](TcgApi.md#listTcgGames) | **GET** /v1/tcg/games | Crossly&#39;s own card games: id, name, seats and card count.
[**listTcgTournaments**](TcgApi.md#listTcgTournaments) | **GET** /v1/tcg/{game}/tournaments | A game&#39;s recent and upcoming Swiss tournaments (free to enter; prizes are earned packs).


<a name="createTcgChallenge"></a>
# **createTcgChallenge**
> TcgResponse createTcgChallenge(game)

Open a 1v1 challenge with one of your decks; another player joins it.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgApi apiInstance = new TcgApi(defaultClient);
    String game = "game_example"; // String | 
    try {
      TcgResponse result = apiInstance.createTcgChallenge(game);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgApi#createTcgChallenge");
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

**TcgResponse**

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

<a name="createTcgDeck"></a>
# **createTcgDeck**
> CreateTcgDeckResponse createTcgDeck(game)

Create (no id) or update a deck: its lead (Crew Boss, Mastermind or Keeper) and 40 cards you own, checked against the deck rules of its game.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgApi apiInstance = new TcgApi(defaultClient);
    String game = "game_example"; // String | 
    try {
      CreateTcgDeckResponse result = apiInstance.createTcgDeck(game);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgApi#createTcgDeck");
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

**CreateTcgDeckResponse**

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

<a name="createTcgMatchAct"></a>
# **createTcgMatchAct**
> TcgResponse createTcgMatchAct(id)

Make one move: { action } as listed in the match&#39;s legal moves. The engine checks it.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgApi apiInstance = new TcgApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      TcgResponse result = apiInstance.createTcgMatchAct(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgApi#createTcgMatchAct");
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

**TcgResponse**

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

<a name="createTcgMatchJoin"></a>
# **createTcgMatchJoin**
> TcgResponse createTcgMatchJoin(id)

Join an open 1v1 challenge with one of your decks.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgApi apiInstance = new TcgApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      TcgResponse result = apiInstance.createTcgMatchJoin(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgApi#createTcgMatchJoin");
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

**TcgResponse**

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

<a name="createTcgPackOpen"></a>
# **createTcgPackOpen**
> CreateTcgPackOpenResponse createTcgPackOpen(id)

Open one of your earned packs: its eight cards join your collection.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgApi apiInstance = new TcgApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateTcgPackOpenResponse result = apiInstance.createTcgPackOpen(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgApi#createTcgPackOpen");
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

**CreateTcgPackOpenResponse**

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

<a name="createTcgPractice"></a>
# **createTcgPractice**
> TcgResponse createTcgPractice(game)

Start a practice match against the house bot with one of your decks.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgApi apiInstance = new TcgApi(defaultClient);
    String game = "game_example"; // String | 
    try {
      TcgResponse result = apiInstance.createTcgPractice(game);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgApi#createTcgPractice");
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

**TcgResponse**

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

<a name="createTcgQueue"></a>
# **createTcgQueue**
> CreateTcgQueueResponse createTcgQueue(game)

Join the ranked queue with an owned, legal deck (free). Returns the match at once when an opponent fits.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgApi apiInstance = new TcgApi(defaultClient);
    String game = "game_example"; // String | 
    try {
      CreateTcgQueueResponse result = apiInstance.createTcgQueue(game);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgApi#createTcgQueue");
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

**CreateTcgQueueResponse**

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

<a name="createTcgStarter"></a>
# **createTcgStarter**
> CreateTcgStarterResponse createTcgStarter(game)

Claim the free starter deck for a game, choosing its faction (once per account; account-bound, untradeable).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgApi apiInstance = new TcgApi(defaultClient);
    String game = "game_example"; // String | 
    try {
      CreateTcgStarterResponse result = apiInstance.createTcgStarter(game);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgApi#createTcgStarter");
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

<a name="createTcgTable"></a>
# **createTcgTable**
> TcgResponse createTcgTable(game)

Sit at a table with your free starter deck (claimed now if you never did: starter names it, else one is picked for you): joins the oldest open 1v1 challenge, or opens one; already waiting, your own seat back.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgApi apiInstance = new TcgApi(defaultClient);
    String game = "game_example"; // String | 
    try {
      TcgResponse result = apiInstance.createTcgTable(game);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgApi#createTcgTable");
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

**TcgResponse**

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

<a name="createTcgTournament"></a>
# **createTcgTournament**
> CreateTcgTournamentResponse createTcgTournament(game)

Host a Swiss tournament: name, optional top cut (4 or 8), round length, player cap and start time.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgApi apiInstance = new TcgApi(defaultClient);
    String game = "game_example"; // String | 
    try {
      CreateTcgTournamentResponse result = apiInstance.createTcgTournament(game);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgApi#createTcgTournament");
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

**CreateTcgTournamentResponse**

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

<a name="createTcgTournamentDrop"></a>
# **createTcgTournamentDrop**
> TcgTournamentResponse createTcgTournamentDrop(id)

Leave a tournament before it starts, or drop from it (your results stand).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgApi apiInstance = new TcgApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      TcgTournamentResponse result = apiInstance.createTcgTournamentDrop(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgApi#createTcgTournamentDrop");
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

**TcgTournamentResponse**

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

<a name="createTcgTournamentRegister"></a>
# **createTcgTournamentRegister**
> TcgTournamentResponse createTcgTournamentRegister(id)

Enter a tournament with an owned, legal deck before it starts.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgApi apiInstance = new TcgApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      TcgTournamentResponse result = apiInstance.createTcgTournamentRegister(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgApi#createTcgTournamentRegister");
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

**TcgTournamentResponse**

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

<a name="createTcgTournamentStart"></a>
# **createTcgTournamentStart**
> TcgTournamentResponse createTcgTournamentStart(id)

As the host, start the tournament: Swiss rounds are sized to the field and round 1 is dealt.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgApi apiInstance = new TcgApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      TcgTournamentResponse result = apiInstance.createTcgTournamentStart(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgApi#createTcgTournamentStart");
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

**TcgTournamentResponse**

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

<a name="deleteTcgDeck"></a>
# **deleteTcgDeck**
> deleteTcgDeck(id)

Delete one of your decks.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgApi apiInstance = new TcgApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.deleteTcgDeck(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgApi#deleteTcgDeck");
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

<a name="deleteTcgQueue"></a>
# **deleteTcgQueue**
> deleteTcgQueue(game)

Leave the ranked queue.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgApi apiInstance = new TcgApi(defaultClient);
    String game = "game_example"; // String | 
    try {
      apiInstance.deleteTcgQueue(game);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgApi#deleteTcgQueue");
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

<a name="getTcgCreatorGamePrint"></a>
# **getTcgCreatorGamePrint**
> GetTcgCreatorGamePrintResponse getTcgCreatorGamePrint(id)

Print file links for your own creator card game (owner only): the set&#39;s print file, home sheets and a proof, for its newest version.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgApi apiInstance = new TcgApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetTcgCreatorGamePrintResponse result = apiInstance.getTcgCreatorGamePrint(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgApi#getTcgCreatorGamePrint");
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

**GetTcgCreatorGamePrintResponse**

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

<a name="getTcgCreatorGamePrintByKind"></a>
# **getTcgCreatorGamePrintByKind**
> File getTcgCreatorGamePrintByKind(id, kind)

A PDF of your own creator card game (owner only): kind set | sheet | proof; ?version&#x3D;, ?paper&#x3D;letter|a4, ?card&#x3D; for a proof. Binary (application/pdf).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgApi apiInstance = new TcgApi(defaultClient);
    String id = "id_example"; // String | 
    String kind = "kind_example"; // String | 
    try {
      File result = apiInstance.getTcgCreatorGamePrintByKind(id, kind);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgApi#getTcgCreatorGamePrintByKind");
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
 **kind** | **String**|  |

### Return type

**File**

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

<a name="getTcgLadder"></a>
# **getTcgLadder**
> GetTcgLadderResponse getTcgLadder(game)

The season&#39;s ranked leaderboard for a game: place, rating, tier and record (named only where the player chose to be).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgApi apiInstance = new TcgApi(defaultClient);
    String game = "game_example"; // String | 
    try {
      GetTcgLadderResponse result = apiInstance.getTcgLadder(game);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgApi#getTcgLadder");
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

**GetTcgLadderResponse**

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

<a name="getTcgLadderMe"></a>
# **getTcgLadderMe**
> GetTcgLadderMeResponse getTcgLadderMe(game)

Your ranked rating, tier, place and record this season, and whether you are queued.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgApi apiInstance = new TcgApi(defaultClient);
    String game = "game_example"; // String | 
    try {
      GetTcgLadderMeResponse result = apiInstance.getTcgLadderMe(game);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgApi#getTcgLadderMe");
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

**GetTcgLadderMeResponse**

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

<a name="getTcgMatch"></a>
# **getTcgMatch**
> GetTcgMatchResponse getTcgMatch(game)

Your recent matches, and open challenges you could join.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgApi apiInstance = new TcgApi(defaultClient);
    String game = "game_example"; // String | 
    try {
      GetTcgMatchResponse result = apiInstance.getTcgMatch(game);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgApi#getTcgMatch");
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

**GetTcgMatchResponse**

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

<a name="getTcgMatchById"></a>
# **getTcgMatchById**
> TcgResponse getTcgMatchById(id)

Your view of a match (no hidden information) and, on your turn, every legal move.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgApi apiInstance = new TcgApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      TcgResponse result = apiInstance.getTcgMatchById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgApi#getTcgMatchById");
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

**TcgResponse**

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

<a name="getTcgMe"></a>
# **getTcgMe**
> GetTcgMeResponse getTcgMe(game)

Your starter faction, collection (card id -&gt; copies), decks and earned packs.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgApi apiInstance = new TcgApi(defaultClient);
    String game = "game_example"; // String | 
    try {
      GetTcgMeResponse result = apiInstance.getTcgMe(game);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgApi#getTcgMe");
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

**GetTcgMeResponse**

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

<a name="getTcgPrint"></a>
# **getTcgPrint**
> GetTcgPrintResponse getTcgPrint(game)

Print files for one of Crossly&#39;s own card games: a card proof (template), 3 x 3 Letter/A4 home sheets with crop marks, and the set&#39;s print file (63 x 88 mm, 3 mm bleed).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgApi apiInstance = new TcgApi(defaultClient);
    String game = "game_example"; // String | 
    try {
      GetTcgPrintResponse result = apiInstance.getTcgPrint(game);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgApi#getTcgPrint");
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

**GetTcgPrintResponse**

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

<a name="getTcgTournament"></a>
# **getTcgTournament**
> TcgTournamentResponse getTcgTournament(id)

A tournament&#39;s standings (points, opponents&#39; and game win %), this round&#39;s pairings and your seat.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgApi apiInstance = new TcgApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      TcgTournamentResponse result = apiInstance.getTcgTournament(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgApi#getTcgTournament");
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

**TcgTournamentResponse**

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

<a name="listTcgCards"></a>
# **listTcgCards**
> ListTcgCardsResponse listTcgCards(game)

The game&#39;s card pool: every card with its rules text, stats, rarity and collector number.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgApi apiInstance = new TcgApi(defaultClient);
    String game = "game_example"; // String | 
    try {
      ListTcgCardsResponse result = apiInstance.listTcgCards(game);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgApi#listTcgCards");
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

**ListTcgCardsResponse**

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

<a name="listTcgGames"></a>
# **listTcgGames**
> ListTcgGamesResponse listTcgGames()

Crossly&#39;s own card games: id, name, seats and card count.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgApi apiInstance = new TcgApi(defaultClient);
    try {
      ListTcgGamesResponse result = apiInstance.listTcgGames();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgApi#listTcgGames");
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

**ListTcgGamesResponse**

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

<a name="listTcgTournaments"></a>
# **listTcgTournaments**
> ListTcgTournamentsResponse listTcgTournaments(game)

A game&#39;s recent and upcoming Swiss tournaments (free to enter; prizes are earned packs).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.TcgApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TcgApi apiInstance = new TcgApi(defaultClient);
    String game = "game_example"; // String | 
    try {
      ListTcgTournamentsResponse result = apiInstance.listTcgTournaments(game);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TcgApi#listTcgTournaments");
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

**ListTcgTournamentsResponse**

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

