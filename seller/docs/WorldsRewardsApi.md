# WorldsRewardsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorldExperienceRewardClose**](WorldsRewardsApi.md#createWorldExperienceRewardClose) | **POST** /v1/worlds/experiences/{experienceId}/rewards/close | Close the pool: the unspent balance returns to your Crossly Carnival earnings. Free rewards keep working.
[**createWorldExperienceRewardDefinition**](WorldsRewardsApi.md#createWorldExperienceRewardDefinition) | **POST** /v1/worlds/experiences/{experienceId}/rewards/definitions | Add a reward scripts can grant: pin, emote, decor, item (your own COSM design), cosm or cbx (with an amount).
[**createWorldExperienceRewardDeposit**](WorldsRewardsApi.md#createWorldExperienceRewardDeposit) | **POST** /v1/worlds/experiences/{experienceId}/rewards/deposits | Move available Crossly Carnival earnings into the pool ($1-$10,000). Owner only; idempotent on idempotencyKey.
[**createWorldExperienceRewardTopup**](WorldsRewardsApi.md#createWorldExperienceRewardTopup) | **POST** /v1/worlds/experiences/{experienceId}/rewards/topups | Open a card top-up ($5-$10,000 into the pool; the 2.9% + 30¢ card fee is added on top). Returns checkoutUrl, where the owner pays with Crossly checkout; the pool is credited once when the payment lands. Owner only.
[**createWorldRewardTopupCancel**](WorldsRewardsApi.md#createWorldRewardTopupCancel) | **POST** /v1/worlds/rewards/topups/{topupId}/cancel | Cancel an unpaid top-up sheet.
[**getWorldExperienceReward**](WorldsRewardsApi.md#getWorldExperienceReward) | **GET** /v1/worlds/experiences/{experienceId}/rewards | The funded reward pool: balance, reserved (owed) value, caps, today&#39;s grants, the reward catalogue and the published rates.
[**getWorldRewardTopup**](WorldsRewardsApi.md#getWorldRewardTopup) | **GET** /v1/worlds/rewards/topups/{topupId} | One card top-up: its status (open, paying, paid, cancelled, expired, refused), amounts and the pool it funds.
[**listWorldExperienceRewardGrants**](WorldsRewardsApi.md#listWorldExperienceRewardGrants) | **GET** /v1/worlds/experiences/{experienceId}/rewards/grants | Every grant, newest first: reward, player sub, amount, cost, status. Cursor-paged; ?sub&#x3D; for one player.
[**listWorldExperienceRewardLedger**](WorldsRewardsApi.md#listWorldExperienceRewardLedger) | **GET** /v1/worlds/experiences/{experienceId}/rewards/ledger | The pool&#39;s own ledger: deposits, grant draw-downs, refunds. Cursor-paged.
[**listWorldExperienceRewardTopups**](WorldsRewardsApi.md#listWorldExperienceRewardTopups) | **GET** /v1/worlds/experiences/{experienceId}/rewards/topups | Card top-ups of the reward pool, newest first: amount into the pool, card fee, status, what went back to the card.
[**updateWorldExperienceRewardDefinition**](WorldsRewardsApi.md#updateWorldExperienceRewardDefinition) | **PATCH** /v1/worlds/experiences/{experienceId}/rewards/definitions/{rewardId} | Edit a reward: name, description, image, amount, per-player daily cap, on/off. Key and kind never change.
[**updateWorldExperienceRewardPool**](WorldsRewardsApi.md#updateWorldExperienceRewardPool) | **PATCH** /v1/worlds/experiences/{experienceId}/rewards/pool | Set the pool&#39;s daily caps: total value per day, value and grant count per player per day.


<a name="createWorldExperienceRewardClose"></a>
# **createWorldExperienceRewardClose**
> CreateWorldExperienceRewardCloseResponse createWorldExperienceRewardClose(experienceId)

Close the pool: the unspent balance returns to your Crossly Carnival earnings. Free rewards keep working.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsRewardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsRewardsApi apiInstance = new WorldsRewardsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      CreateWorldExperienceRewardCloseResponse result = apiInstance.createWorldExperienceRewardClose(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsRewardsApi#createWorldExperienceRewardClose");
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

**CreateWorldExperienceRewardCloseResponse**

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

<a name="createWorldExperienceRewardDefinition"></a>
# **createWorldExperienceRewardDefinition**
> CreateWorldExperienceRewardDefinitionResponse createWorldExperienceRewardDefinition(experienceId)

Add a reward scripts can grant: pin, emote, decor, item (your own COSM design), cosm or cbx (with an amount).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsRewardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsRewardsApi apiInstance = new WorldsRewardsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      CreateWorldExperienceRewardDefinitionResponse result = apiInstance.createWorldExperienceRewardDefinition(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsRewardsApi#createWorldExperienceRewardDefinition");
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

**CreateWorldExperienceRewardDefinitionResponse**

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

<a name="createWorldExperienceRewardDeposit"></a>
# **createWorldExperienceRewardDeposit**
> CreateWorldExperienceRewardDepositResponse createWorldExperienceRewardDeposit(experienceId)

Move available Crossly Carnival earnings into the pool ($1-$10,000). Owner only; idempotent on idempotencyKey.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsRewardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsRewardsApi apiInstance = new WorldsRewardsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      CreateWorldExperienceRewardDepositResponse result = apiInstance.createWorldExperienceRewardDeposit(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsRewardsApi#createWorldExperienceRewardDeposit");
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

**CreateWorldExperienceRewardDepositResponse**

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

<a name="createWorldExperienceRewardTopup"></a>
# **createWorldExperienceRewardTopup**
> CreateWorldExperienceRewardTopupResponse createWorldExperienceRewardTopup(experienceId)

Open a card top-up ($5-$10,000 into the pool; the 2.9% + 30¢ card fee is added on top). Returns checkoutUrl, where the owner pays with Crossly checkout; the pool is credited once when the payment lands. Owner only.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsRewardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsRewardsApi apiInstance = new WorldsRewardsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      CreateWorldExperienceRewardTopupResponse result = apiInstance.createWorldExperienceRewardTopup(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsRewardsApi#createWorldExperienceRewardTopup");
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

**CreateWorldExperienceRewardTopupResponse**

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

<a name="createWorldRewardTopupCancel"></a>
# **createWorldRewardTopupCancel**
> CreateWorldSpaceJoinResponse createWorldRewardTopupCancel(topupId)

Cancel an unpaid top-up sheet.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsRewardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsRewardsApi apiInstance = new WorldsRewardsApi(defaultClient);
    String topupId = "topupId_example"; // String | 
    try {
      CreateWorldSpaceJoinResponse result = apiInstance.createWorldRewardTopupCancel(topupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsRewardsApi#createWorldRewardTopupCancel");
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
 **topupId** | **String**|  |

### Return type

**CreateWorldSpaceJoinResponse**

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

<a name="getWorldExperienceReward"></a>
# **getWorldExperienceReward**
> GetWorldExperienceRewardResponse getWorldExperienceReward(experienceId)

The funded reward pool: balance, reserved (owed) value, caps, today&#39;s grants, the reward catalogue and the published rates.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsRewardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsRewardsApi apiInstance = new WorldsRewardsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      GetWorldExperienceRewardResponse result = apiInstance.getWorldExperienceReward(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsRewardsApi#getWorldExperienceReward");
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

**GetWorldExperienceRewardResponse**

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

<a name="getWorldRewardTopup"></a>
# **getWorldRewardTopup**
> GetWorldRewardTopupResponse getWorldRewardTopup(topupId)

One card top-up: its status (open, paying, paid, cancelled, expired, refused), amounts and the pool it funds.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsRewardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsRewardsApi apiInstance = new WorldsRewardsApi(defaultClient);
    String topupId = "topupId_example"; // String | 
    try {
      GetWorldRewardTopupResponse result = apiInstance.getWorldRewardTopup(topupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsRewardsApi#getWorldRewardTopup");
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
 **topupId** | **String**|  |

### Return type

**GetWorldRewardTopupResponse**

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

<a name="listWorldExperienceRewardGrants"></a>
# **listWorldExperienceRewardGrants**
> ListWorldExperienceRewardGrantsResponse listWorldExperienceRewardGrants(experienceId)

Every grant, newest first: reward, player sub, amount, cost, status. Cursor-paged; ?sub&#x3D; for one player.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsRewardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsRewardsApi apiInstance = new WorldsRewardsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      ListWorldExperienceRewardGrantsResponse result = apiInstance.listWorldExperienceRewardGrants(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsRewardsApi#listWorldExperienceRewardGrants");
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

**ListWorldExperienceRewardGrantsResponse**

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

<a name="listWorldExperienceRewardLedger"></a>
# **listWorldExperienceRewardLedger**
> ListWorldExperienceRewardLedgerResponse listWorldExperienceRewardLedger(experienceId)

The pool&#39;s own ledger: deposits, grant draw-downs, refunds. Cursor-paged.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsRewardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsRewardsApi apiInstance = new WorldsRewardsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      ListWorldExperienceRewardLedgerResponse result = apiInstance.listWorldExperienceRewardLedger(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsRewardsApi#listWorldExperienceRewardLedger");
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

**ListWorldExperienceRewardLedgerResponse**

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

<a name="listWorldExperienceRewardTopups"></a>
# **listWorldExperienceRewardTopups**
> ListWorldExperienceRewardTopupsResponse listWorldExperienceRewardTopups(experienceId)

Card top-ups of the reward pool, newest first: amount into the pool, card fee, status, what went back to the card.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsRewardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsRewardsApi apiInstance = new WorldsRewardsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      ListWorldExperienceRewardTopupsResponse result = apiInstance.listWorldExperienceRewardTopups(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsRewardsApi#listWorldExperienceRewardTopups");
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

**ListWorldExperienceRewardTopupsResponse**

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

<a name="updateWorldExperienceRewardDefinition"></a>
# **updateWorldExperienceRewardDefinition**
> CreateWorldExperienceRewardDefinitionResponse updateWorldExperienceRewardDefinition(experienceId, rewardId)

Edit a reward: name, description, image, amount, per-player daily cap, on/off. Key and kind never change.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsRewardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsRewardsApi apiInstance = new WorldsRewardsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String rewardId = "rewardId_example"; // String | 
    try {
      CreateWorldExperienceRewardDefinitionResponse result = apiInstance.updateWorldExperienceRewardDefinition(experienceId, rewardId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsRewardsApi#updateWorldExperienceRewardDefinition");
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
 **rewardId** | **String**|  |

### Return type

**CreateWorldExperienceRewardDefinitionResponse**

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

<a name="updateWorldExperienceRewardPool"></a>
# **updateWorldExperienceRewardPool**
> UpdateWorldExperienceRewardPoolResponse updateWorldExperienceRewardPool(experienceId)

Set the pool&#39;s daily caps: total value per day, value and grant count per player per day.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsRewardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsRewardsApi apiInstance = new WorldsRewardsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      UpdateWorldExperienceRewardPoolResponse result = apiInstance.updateWorldExperienceRewardPool(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsRewardsApi#updateWorldExperienceRewardPool");
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

**UpdateWorldExperienceRewardPoolResponse**

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

