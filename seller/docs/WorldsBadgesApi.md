# WorldsBadgesApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorldExperienceBadge**](WorldsBadgesApi.md#createWorldExperienceBadge) | **POST** /v1/worlds/experiences/{experienceId}/badges | Add a badge (at most 100 per game). name 1-50 characters, description up to 1000, iconSha256 &#x3D; the sha256 a png upload answered (POST /v1/world/interactive/assets, kind png); a new icon is shown once a person approved it.
[**getWorldBadgeMine**](WorldsBadgesApi.md#getWorldBadgeMine) | **GET** /v1/worlds/badges/mine | Every game badge you hold, newest first, and whether your person page shows them.
[**getWorldExperienceBadge**](WorldsBadgesApi.md#getWorldExperienceBadge) | **GET** /v1/worlds/experiences/{experienceId}/badges | A game&#39;s badges, oldest first: name, description, icon and its review state, on/off, how many players hold each; plus the player count (the rarity denominator) and the limits. Scripts award them with BadgeService.AwardBadge(player, badgeId).
[**getWorldGameBadge**](WorldsBadgesApi.md#getWorldGameBadge) | **GET** /v1/worlds/games/{game}/badges | A Crossly Carnival game&#39;s badges as players see them: name, description, approved icon, how many hold it, rarity (% of the game&#39;s players) and, for you, when you earned it. :game is a Worlds experience id or key.
[**getWorldPlayerBadge**](WorldsBadgesApi.md#getWorldPlayerBadge) | **GET** /v1/worlds/players/{username}/badges | The game badges a person shows on their person page (only when they switched it on; Mature and non-public games never appear).
[**updateWorldBadgeProfile**](WorldsBadgesApi.md#updateWorldBadgeProfile) | **PUT** /v1/worlds/badges/profile | Show (or hide) the game badges you hold on your person page. Off by default.
[**updateWorldExperienceBadge**](WorldsBadgesApi.md#updateWorldExperienceBadge) | **PATCH** /v1/worlds/experiences/{experienceId}/badges/{badgeId} | Edit a badge: name, description, icon (null removes it), enabled. Badges are never deleted (players keep what they earned); turn one off to hide it and stop AwardBadge.


<a name="createWorldExperienceBadge"></a>
# **createWorldExperienceBadge**
> CreateWorldExperienceBadgeResponse createWorldExperienceBadge(experienceId)

Add a badge (at most 100 per game). name 1-50 characters, description up to 1000, iconSha256 &#x3D; the sha256 a png upload answered (POST /v1/world/interactive/assets, kind png); a new icon is shown once a person approved it.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsBadgesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsBadgesApi apiInstance = new WorldsBadgesApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      CreateWorldExperienceBadgeResponse result = apiInstance.createWorldExperienceBadge(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsBadgesApi#createWorldExperienceBadge");
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
 **experienceId** | **String**|  |

### Return type

**CreateWorldExperienceBadgeResponse**

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

<a name="getWorldBadgeMine"></a>
# **getWorldBadgeMine**
> GetWorldBadgeMineResponse getWorldBadgeMine()

Every game badge you hold, newest first, and whether your person page shows them.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsBadgesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsBadgesApi apiInstance = new WorldsBadgesApi(defaultClient);
    try {
      GetWorldBadgeMineResponse result = apiInstance.getWorldBadgeMine();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsBadgesApi#getWorldBadgeMine");
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

**GetWorldBadgeMineResponse**

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

<a name="getWorldExperienceBadge"></a>
# **getWorldExperienceBadge**
> GetWorldExperienceBadgeResponse getWorldExperienceBadge(experienceId)

A game&#39;s badges, oldest first: name, description, icon and its review state, on/off, how many players hold each; plus the player count (the rarity denominator) and the limits. Scripts award them with BadgeService.AwardBadge(player, badgeId).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsBadgesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsBadgesApi apiInstance = new WorldsBadgesApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      GetWorldExperienceBadgeResponse result = apiInstance.getWorldExperienceBadge(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsBadgesApi#getWorldExperienceBadge");
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
 **experienceId** | **String**|  |

### Return type

**GetWorldExperienceBadgeResponse**

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

<a name="getWorldGameBadge"></a>
# **getWorldGameBadge**
> GetWorldGameBadgeResponse getWorldGameBadge(game)

A Crossly Carnival game&#39;s badges as players see them: name, description, approved icon, how many hold it, rarity (% of the game&#39;s players) and, for you, when you earned it. :game is a Worlds experience id or key.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsBadgesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsBadgesApi apiInstance = new WorldsBadgesApi(defaultClient);
    String game = "game_example"; // String | 
    try {
      GetWorldGameBadgeResponse result = apiInstance.getWorldGameBadge(game);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsBadgesApi#getWorldGameBadge");
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

**GetWorldGameBadgeResponse**

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

<a name="getWorldPlayerBadge"></a>
# **getWorldPlayerBadge**
> GetWorldPlayerBadgeResponse getWorldPlayerBadge(username)

The game badges a person shows on their person page (only when they switched it on; Mature and non-public games never appear).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsBadgesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsBadgesApi apiInstance = new WorldsBadgesApi(defaultClient);
    String username = "username_example"; // String | 
    try {
      GetWorldPlayerBadgeResponse result = apiInstance.getWorldPlayerBadge(username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsBadgesApi#getWorldPlayerBadge");
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
 **username** | **String**|  |

### Return type

**GetWorldPlayerBadgeResponse**

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

<a name="updateWorldBadgeProfile"></a>
# **updateWorldBadgeProfile**
> UpdateWorldBadgeProfileResponse updateWorldBadgeProfile()

Show (or hide) the game badges you hold on your person page. Off by default.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsBadgesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsBadgesApi apiInstance = new WorldsBadgesApi(defaultClient);
    try {
      UpdateWorldBadgeProfileResponse result = apiInstance.updateWorldBadgeProfile();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsBadgesApi#updateWorldBadgeProfile");
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

**UpdateWorldBadgeProfileResponse**

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

<a name="updateWorldExperienceBadge"></a>
# **updateWorldExperienceBadge**
> CreateWorldExperienceBadgeResponse updateWorldExperienceBadge(experienceId, badgeId)

Edit a badge: name, description, icon (null removes it), enabled. Badges are never deleted (players keep what they earned); turn one off to hide it and stop AwardBadge.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsBadgesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsBadgesApi apiInstance = new WorldsBadgesApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String badgeId = "badgeId_example"; // String | 
    try {
      CreateWorldExperienceBadgeResponse result = apiInstance.updateWorldExperienceBadge(experienceId, badgeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsBadgesApi#updateWorldExperienceBadge");
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
 **experienceId** | **String**|  |
 **badgeId** | **String**|  |

### Return type

**CreateWorldExperienceBadgeResponse**

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

