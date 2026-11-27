# AccountsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccount**](AccountsApi.md#createAccount) | **POST** /v1/accounts | Connect a new platform account (kicks off OAuth or extension handshake).
[**createConnectionCardnexusApiKey**](AccountsApi.md#createConnectionCardnexusApiKey) | **POST** /v1/connections/cardnexus/api-key | Connect CardNexus with a personal API key (validated live before it is stored).
[**createConnectionEmailImap**](AccountsApi.md#createConnectionEmailImap) | **POST** /v1/connections/email/imap | Add an IMAP mailbox connection.
[**createConnectionEmailImapTest**](AccountsApi.md#createConnectionEmailImapTest) | **POST** /v1/connections/email/imap/test | Validate IMAP credentials without persisting.
[**createConnectionLightspeedXToken**](AccountsApi.md#createConnectionLightspeedXToken) | **POST** /v1/connections/lightspeed_x/token | Connect Lightspeed X-Series with a personal token (Setup → Personal tokens, Plus plan) and the store prefix.
[**createConnectionRequest**](AccountsApi.md#createConnectionRequest) | **POST** /v1/connections/{platform}/request | Express interest in a request_only platform.
[**createPlatformAccountConnect**](AccountsApi.md#createPlatformAccountConnect) | **POST** /v1/platform-accounts/{platform}/connect | Revive or initiate connection for a cookie platform.
[**createPlatformAccountDisconnect**](AccountsApi.md#createPlatformAccountDisconnect) | **POST** /v1/platform-accounts/{platform}/disconnect | Disconnect every account of a platform (archives the rows and deletes their stored sessions).
[**createPlatformAccountHistoryImport**](AccountsApi.md#createPlatformAccountHistoryImport) | **POST** /v1/platform-accounts/{platform}/history-import | Set how far back to backfill order history + active listings for a platform, and run it now.
[**createPlatformAccountRefreshStatus**](AccountsApi.md#createPlatformAccountRefreshStatus) | **POST** /v1/platform-accounts/refresh-status | Run on-demand healthchecks across cookie accounts.
[**deleteAccount**](AccountsApi.md#deleteAccount) | **DELETE** /v1/accounts/{id} | Disconnect a platform account.
[**deleteConnectionById**](AccountsApi.md#deleteConnectionById) | **DELETE** /v1/connections/by-id/{id} | Disconnect a specific OAuth connection by id.
[**deleteConnectionEmailImap**](AccountsApi.md#deleteConnectionEmailImap) | **DELETE** /v1/connections/email/imap/{id} | Remove an IMAP mailbox connection.
[**getConnectionEmail**](AccountsApi.md#getConnectionEmail) | **GET** /v1/connections/email | List IMAP and email-OAuth connections.
[**getConnectionExtensionOnline**](AccountsApi.md#getConnectionExtensionOnline) | **GET** /v1/connections/extension-online | Check if the browser extension is online.
[**getConnectionPolicyManagementOption**](AccountsApi.md#getConnectionPolicyManagementOption) | **GET** /v1/connections/policy-management/{connectionId}/options/{source} | List the live options a marketplace policy field offers (e.g. Allegro delivery methods).
[**getOauthInit**](AccountsApi.md#getOauthInit) | **GET** /v1/oauth/{platform}/init | Return the OAuth authorize URL for an API-track platform.
[**getPlatformLimit**](AccountsApi.md#getPlatformLimit) | **GET** /v1/platforms/limits | eBay free-tier + Etsy fees aggregate.
[**listAccounts**](AccountsApi.md#listAccounts) | **GET** /v1/accounts | List your connected platform accounts.
[**listConnectionPolicyManagement**](AccountsApi.md#listConnectionPolicyManagement) | **GET** /v1/connections/policy-management | List eBay and Etsy accounts with whether Crossly manages their policies.
[**listConnections**](AccountsApi.md#listConnections) | **GET** /v1/connections | List OAuth-connected API platforms.
[**updateConnectionEmailImap**](AccountsApi.md#updateConnectionEmailImap) | **PATCH** /v1/connections/email/imap/{id} | Edit an IMAP mailbox connection.
[**updateConnectionPolicyManagement**](AccountsApi.md#updateConnectionPolicyManagement) | **PUT** /v1/connections/policy-management/{connectionId} | Turn Crossly policy management on or off for one eBay or Etsy account.
[**updatePlatformPreference**](AccountsApi.md#updatePlatformPreference) | **PATCH** /v1/platforms/{platform}/preferences | Update per-platform connection preferences.


<a name="createAccount"></a>
# **createAccount**
> CreateAccountResponse createAccount()

Connect a new platform account (kicks off OAuth or extension handshake).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    try {
      CreateAccountResponse result = apiInstance.createAccount();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#createAccount");
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

**CreateAccountResponse**

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

<a name="createConnectionCardnexusApiKey"></a>
# **createConnectionCardnexusApiKey**
> CreateConnectionCardnexusApiKeyResponse createConnectionCardnexusApiKey()

Connect CardNexus with a personal API key (validated live before it is stored).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    try {
      CreateConnectionCardnexusApiKeyResponse result = apiInstance.createConnectionCardnexusApiKey();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#createConnectionCardnexusApiKey");
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

**CreateConnectionCardnexusApiKeyResponse**

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

<a name="createConnectionEmailImap"></a>
# **createConnectionEmailImap**
> CreateConnectionEmailImapResponse createConnectionEmailImap()

Add an IMAP mailbox connection.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    try {
      CreateConnectionEmailImapResponse result = apiInstance.createConnectionEmailImap();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#createConnectionEmailImap");
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

**CreateConnectionEmailImapResponse**

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

<a name="createConnectionEmailImapTest"></a>
# **createConnectionEmailImapTest**
> CreateConnectionEmailImapTestResponse createConnectionEmailImapTest()

Validate IMAP credentials without persisting.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    try {
      CreateConnectionEmailImapTestResponse result = apiInstance.createConnectionEmailImapTest();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#createConnectionEmailImapTest");
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

**CreateConnectionEmailImapTestResponse**

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

<a name="createConnectionLightspeedXToken"></a>
# **createConnectionLightspeedXToken**
> CreateConnectionLightspeedXTokenResponse createConnectionLightspeedXToken(createConnectionLightspeedXTokenRequest)

Connect Lightspeed X-Series with a personal token (Setup → Personal tokens, Plus plan) and the store prefix.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    CreateConnectionLightspeedXTokenRequest createConnectionLightspeedXTokenRequest = new CreateConnectionLightspeedXTokenRequest(); // CreateConnectionLightspeedXTokenRequest | 
    try {
      CreateConnectionLightspeedXTokenResponse result = apiInstance.createConnectionLightspeedXToken(createConnectionLightspeedXTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#createConnectionLightspeedXToken");
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
 **createConnectionLightspeedXTokenRequest** | **CreateConnectionLightspeedXTokenRequest**|  |

### Return type

**CreateConnectionLightspeedXTokenResponse**

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

<a name="createConnectionRequest"></a>
# **createConnectionRequest**
> OkResponse createConnectionRequest(platform)

Express interest in a request_only platform.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String platform = "platform_example"; // String | 
    try {
      OkResponse result = apiInstance.createConnectionRequest(platform);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#createConnectionRequest");
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

<a name="createPlatformAccountConnect"></a>
# **createPlatformAccountConnect**
> CreatePlatformAccountConnectResponse createPlatformAccountConnect(platform)

Revive or initiate connection for a cookie platform.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String platform = "platform_example"; // String | 
    try {
      CreatePlatformAccountConnectResponse result = apiInstance.createPlatformAccountConnect(platform);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#createPlatformAccountConnect");
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

### Return type

**CreatePlatformAccountConnectResponse**

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

<a name="createPlatformAccountDisconnect"></a>
# **createPlatformAccountDisconnect**
> CreatePlatformAccountDisconnectResponse createPlatformAccountDisconnect(platform)

Disconnect every account of a platform (archives the rows and deletes their stored sessions).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String platform = "platform_example"; // String | 
    try {
      CreatePlatformAccountDisconnectResponse result = apiInstance.createPlatformAccountDisconnect(platform);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#createPlatformAccountDisconnect");
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

### Return type

**CreatePlatformAccountDisconnectResponse**

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

<a name="createPlatformAccountHistoryImport"></a>
# **createPlatformAccountHistoryImport**
> CreatePlatformAccountHistoryImportResponse createPlatformAccountHistoryImport(platform, createPlatformAccountHistoryImportRequest)

Set how far back to backfill order history + active listings for a platform, and run it now.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String platform = "platform_example"; // String | 
    CreatePlatformAccountHistoryImportRequest createPlatformAccountHistoryImportRequest = new CreatePlatformAccountHistoryImportRequest(); // CreatePlatformAccountHistoryImportRequest | 
    try {
      CreatePlatformAccountHistoryImportResponse result = apiInstance.createPlatformAccountHistoryImport(platform, createPlatformAccountHistoryImportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#createPlatformAccountHistoryImport");
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
 **createPlatformAccountHistoryImportRequest** | **CreatePlatformAccountHistoryImportRequest**|  |

### Return type

**CreatePlatformAccountHistoryImportResponse**

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

<a name="createPlatformAccountRefreshStatus"></a>
# **createPlatformAccountRefreshStatus**
> CreatePlatformAccountRefreshStatusResponse createPlatformAccountRefreshStatus()

Run on-demand healthchecks across cookie accounts.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    try {
      CreatePlatformAccountRefreshStatusResponse result = apiInstance.createPlatformAccountRefreshStatus();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#createPlatformAccountRefreshStatus");
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

**CreatePlatformAccountRefreshStatusResponse**

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

<a name="deleteAccount"></a>
# **deleteAccount**
> OkResponse deleteAccount(id)

Disconnect a platform account.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      OkResponse result = apiInstance.deleteAccount(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#deleteAccount");
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
 **id** | **UUID**|  |

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

<a name="deleteConnectionById"></a>
# **deleteConnectionById**
> SuccessResponse deleteConnectionById(id)

Disconnect a specific OAuth connection by id.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      SuccessResponse result = apiInstance.deleteConnectionById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#deleteConnectionById");
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
 **id** | **UUID**|  |

### Return type

**SuccessResponse**

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

<a name="deleteConnectionEmailImap"></a>
# **deleteConnectionEmailImap**
> SuccessResponse deleteConnectionEmailImap(id)

Remove an IMAP mailbox connection.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      SuccessResponse result = apiInstance.deleteConnectionEmailImap(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#deleteConnectionEmailImap");
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
 **id** | **UUID**|  |

### Return type

**SuccessResponse**

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

<a name="getConnectionEmail"></a>
# **getConnectionEmail**
> GetConnectionEmailResponse getConnectionEmail()

List IMAP and email-OAuth connections.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    try {
      GetConnectionEmailResponse result = apiInstance.getConnectionEmail();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getConnectionEmail");
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

**GetConnectionEmailResponse**

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

<a name="getConnectionExtensionOnline"></a>
# **getConnectionExtensionOnline**
> GetConnectionExtensionOnlineResponse getConnectionExtensionOnline()

Check if the browser extension is online.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    try {
      GetConnectionExtensionOnlineResponse result = apiInstance.getConnectionExtensionOnline();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getConnectionExtensionOnline");
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

**GetConnectionExtensionOnlineResponse**

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

<a name="getConnectionPolicyManagementOption"></a>
# **getConnectionPolicyManagementOption**
> GetConnectionPolicyManagementOptionResponse getConnectionPolicyManagementOption(connectionId, source)

List the live options a marketplace policy field offers (e.g. Allegro delivery methods).

For one of your managed connections, the choices a preset&#39;s &#x60;platformFields&#x60; picker offers, from the marketplace (&#x60;source&#x60; is the field&#39;s &#x60;optionsSource&#x60;, e.g. &#x60;delivery-methods&#x60;). An unknown connection or source is a 404.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String connectionId = "connectionId_example"; // String | 
    String source = "source_example"; // String | 
    try {
      GetConnectionPolicyManagementOptionResponse result = apiInstance.getConnectionPolicyManagementOption(connectionId, source);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getConnectionPolicyManagementOption");
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
 **connectionId** | **String**|  |
 **source** | **String**|  |

### Return type

**GetConnectionPolicyManagementOptionResponse**

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

<a name="getOauthInit"></a>
# **getOauthInit**
> GetOauthInitResponse getOauthInit(platform, shop, region, siteUrl)

Return the OAuth authorize URL for an API-track platform.

Most platforms return &#x60;{ url }&#x60; (Shopify, Etsy, Amazon and the other marketplaces Atlas Connections connects: the URL Atlas returns for this seller). Bonanza adds &#x60;{ oneShot: true }&#x60;. WooCommerce requires &#x60;?siteUrl&#x3D;...&#x60;. Walmart returns &#x60;{ status: \&quot;request_only\&quot;, requestUrl, message }&#x60; instead of a URL because per-seller OAuth needs Solution Provider approval.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String platform = "platform_example"; // String | 
    String shop = "shop_example"; // String | 
    String region = "region_example"; // String | 
    String siteUrl = "siteUrl_example"; // String | 
    try {
      GetOauthInitResponse result = apiInstance.getOauthInit(platform, shop, region, siteUrl);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getOauthInit");
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
 **shop** | **String**|  | [optional]
 **region** | **String**|  | [optional]
 **siteUrl** | **String**|  | [optional]

### Return type

**GetOauthInitResponse**

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

<a name="getPlatformLimit"></a>
# **getPlatformLimit**
> GetPlatformLimitResponse getPlatformLimit()

eBay free-tier + Etsy fees aggregate.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    try {
      GetPlatformLimitResponse result = apiInstance.getPlatformLimit();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#getPlatformLimit");
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

**GetPlatformLimitResponse**

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

<a name="listAccounts"></a>
# **listAccounts**
> ListAccountsResponse listAccounts()

List your connected platform accounts.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    try {
      ListAccountsResponse result = apiInstance.listAccounts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#listAccounts");
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

**ListAccountsResponse**

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

<a name="listConnectionPolicyManagement"></a>
# **listConnectionPolicyManagement**
> ListConnectionPolicyManagementResponse listConnectionPolicyManagement()

List eBay and Etsy accounts with whether Crossly manages their policies.

One row per connected eBay or Etsy account: &#x60;eligible&#x60; (eBay only on EBAY_US), &#x60;managed&#x60; (Crossly keeps its policies / shipping profiles in step with your default presets) and sync &#x60;notes&#x60;.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    try {
      ListConnectionPolicyManagementResponse result = apiInstance.listConnectionPolicyManagement();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#listConnectionPolicyManagement");
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

**ListConnectionPolicyManagementResponse**

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

<a name="listConnections"></a>
# **listConnections**
> ListConnectionsResponse listConnections()

List OAuth-connected API platforms.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    try {
      ListConnectionsResponse result = apiInstance.listConnections();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#listConnections");
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

**ListConnectionsResponse**

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

<a name="updateConnectionEmailImap"></a>
# **updateConnectionEmailImap**
> SuccessResponse updateConnectionEmailImap(id)

Edit an IMAP mailbox connection.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      SuccessResponse result = apiInstance.updateConnectionEmailImap(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#updateConnectionEmailImap");
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
 **id** | **UUID**|  |

### Return type

**SuccessResponse**

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

<a name="updateConnectionPolicyManagement"></a>
# **updateConnectionPolicyManagement**
> ListConnectionPolicyManagementItem updateConnectionPolicyManagement(connectionId)

Turn Crossly policy management on or off for one eBay or Etsy account.

Body &#x60;{ managed: boolean }&#x60;. On: Crossly may overwrite that account&#39;s own policies with your default presets and queues a sync now (409 for an ineligible account, e.g. non-US eBay). Off: Crossly stops touching them. A connection that is not yours (or not eBay/Etsy) is a 404.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String connectionId = "connectionId_example"; // String | 
    try {
      ListConnectionPolicyManagementItem result = apiInstance.updateConnectionPolicyManagement(connectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#updateConnectionPolicyManagement");
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
 **connectionId** | **String**|  |

### Return type

**ListConnectionPolicyManagementItem**

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

<a name="updatePlatformPreference"></a>
# **updatePlatformPreference**
> UpdatePlatformPreferenceResponse updatePlatformPreference(platform, connectionId)

Update per-platform connection preferences.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String platform = "platform_example"; // String | 
    UUID connectionId = UUID.randomUUID(); // UUID | 
    try {
      UpdatePlatformPreferenceResponse result = apiInstance.updatePlatformPreference(platform, connectionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AccountsApi#updatePlatformPreference");
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
 **connectionId** | **UUID**|  | [optional]

### Return type

**UpdatePlatformPreferenceResponse**

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

