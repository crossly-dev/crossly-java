# AccountsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccount**](AccountsApi.md#createAccount) | **POST** /v1/accounts | Connect a new platform account (kicks off OAuth or extension handshake).
[**createConnectionEmailImap**](AccountsApi.md#createConnectionEmailImap) | **POST** /v1/connections/email/imap | Add an IMAP mailbox connection.
[**createConnectionEmailImapTest**](AccountsApi.md#createConnectionEmailImapTest) | **POST** /v1/connections/email/imap/test | Validate IMAP credentials without persisting.
[**createConnectionRequest**](AccountsApi.md#createConnectionRequest) | **POST** /v1/connections/{platform}/request | Express interest in a request_only platform.
[**createPlatformAccountConnect**](AccountsApi.md#createPlatformAccountConnect) | **POST** /v1/platform-accounts/{platform}/connect | Revive or initiate connection for a cookie platform.
[**createPlatformAccountDisconnect**](AccountsApi.md#createPlatformAccountDisconnect) | **POST** /v1/platform-accounts/{platform}/disconnect | Archive every active account row for a platform.
[**createPlatformAccountHistoryImport**](AccountsApi.md#createPlatformAccountHistoryImport) | **POST** /v1/platform-accounts/{platform}/history-import | Set how far back to backfill order history + active listings for a platform, and run it now.
[**createPlatformAccountRefreshStatus**](AccountsApi.md#createPlatformAccountRefreshStatus) | **POST** /v1/platform-accounts/refresh-status | Run on-demand healthchecks across cookie accounts.
[**deleteAccount**](AccountsApi.md#deleteAccount) | **DELETE** /v1/accounts/{id} | Disconnect a platform account.
[**deleteConnectionById**](AccountsApi.md#deleteConnectionById) | **DELETE** /v1/connections/by-id/{id} | Disconnect a specific OAuth connection by id.
[**deleteConnectionEmailImap**](AccountsApi.md#deleteConnectionEmailImap) | **DELETE** /v1/connections/email/imap/{id} | Remove an IMAP mailbox connection.
[**getConnectionEmail**](AccountsApi.md#getConnectionEmail) | **GET** /v1/connections/email | List IMAP and email-OAuth connections.
[**getConnectionExtensionOnline**](AccountsApi.md#getConnectionExtensionOnline) | **GET** /v1/connections/extension-online | Check if the browser extension is online.
[**getOauthInit**](AccountsApi.md#getOauthInit) | **GET** /v1/oauth/{platform}/init | Return the OAuth authorize URL for an API-track platform.
[**getPlatformLimit**](AccountsApi.md#getPlatformLimit) | **GET** /v1/platforms/limits | eBay free-tier + Etsy fees aggregate.
[**listAccounts**](AccountsApi.md#listAccounts) | **GET** /v1/accounts | List your connected platform accounts.
[**listConnections**](AccountsApi.md#listConnections) | **GET** /v1/connections | List OAuth-connected API platforms.
[**updateConnectionEmailImap**](AccountsApi.md#updateConnectionEmailImap) | **PATCH** /v1/connections/email/imap/{id} | Edit an IMAP mailbox connection.
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
import org.openapitools.client.api.AccountsApi;

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

[**CreateAccountResponse**](CreateAccountResponse.md)

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
import org.openapitools.client.api.AccountsApi;

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

[**CreateConnectionEmailImapResponse**](CreateConnectionEmailImapResponse.md)

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
import org.openapitools.client.api.AccountsApi;

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

[**CreateConnectionEmailImapTestResponse**](CreateConnectionEmailImapTestResponse.md)

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

<a name="createConnectionRequest"></a>
# **createConnectionRequest**
> CreateConnectionRequestResponse createConnectionRequest(platform)

Express interest in a request_only platform.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.AccountsApi;

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
      CreateConnectionRequestResponse result = apiInstance.createConnectionRequest(platform);
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

[**CreateConnectionRequestResponse**](CreateConnectionRequestResponse.md)

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
import org.openapitools.client.api.AccountsApi;

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

[**CreatePlatformAccountConnectResponse**](CreatePlatformAccountConnectResponse.md)

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

Archive every active account row for a platform.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.AccountsApi;

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

[**CreatePlatformAccountDisconnectResponse**](CreatePlatformAccountDisconnectResponse.md)

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
> CreatePlatformAccountHistoryImportResponse createPlatformAccountHistoryImport(platform, inlineObject1)

Set how far back to backfill order history + active listings for a platform, and run it now.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    String platform = "platform_example"; // String | 
    InlineObject1 inlineObject1 = new InlineObject1(); // InlineObject1 | 
    try {
      CreatePlatformAccountHistoryImportResponse result = apiInstance.createPlatformAccountHistoryImport(platform, inlineObject1);
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
 **inlineObject1** | [**InlineObject1**](InlineObject1.md)|  |

### Return type

[**CreatePlatformAccountHistoryImportResponse**](CreatePlatformAccountHistoryImportResponse.md)

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
import org.openapitools.client.api.AccountsApi;

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

[**CreatePlatformAccountRefreshStatusResponse**](CreatePlatformAccountRefreshStatusResponse.md)

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
> DeleteAccountResponse deleteAccount(id)

Disconnect a platform account.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.AccountsApi;

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
      DeleteAccountResponse result = apiInstance.deleteAccount(id);
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

[**DeleteAccountResponse**](DeleteAccountResponse.md)

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
> DeleteConnectionByIdResponse deleteConnectionById(id)

Disconnect a specific OAuth connection by id.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.AccountsApi;

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
      DeleteConnectionByIdResponse result = apiInstance.deleteConnectionById(id);
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

[**DeleteConnectionByIdResponse**](DeleteConnectionByIdResponse.md)

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
> DeleteConnectionEmailImapResponse deleteConnectionEmailImap(id)

Remove an IMAP mailbox connection.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.AccountsApi;

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
      DeleteConnectionEmailImapResponse result = apiInstance.deleteConnectionEmailImap(id);
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

[**DeleteConnectionEmailImapResponse**](DeleteConnectionEmailImapResponse.md)

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
import org.openapitools.client.api.AccountsApi;

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

[**GetConnectionEmailResponse**](GetConnectionEmailResponse.md)

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
import org.openapitools.client.api.AccountsApi;

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

[**GetConnectionExtensionOnlineResponse**](GetConnectionExtensionOnlineResponse.md)

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

Most platforms return &#x60;{ url }&#x60;. Etsy adds &#x60;{ correlationId }&#x60; (PKCE verifier stashed in Redis). Bonanza adds &#x60;{ oneShot: true }&#x60;. WooCommerce requires &#x60;?siteUrl&#x3D;...&#x60;. Walmart returns &#x60;{ status: \&quot;request_only\&quot;, requestUrl, message }&#x60; instead of a URL because per-seller OAuth needs Solution Provider approval.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.AccountsApi;

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

[**GetOauthInitResponse**](GetOauthInitResponse.md)

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
import org.openapitools.client.api.AccountsApi;

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

[**GetPlatformLimitResponse**](GetPlatformLimitResponse.md)

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
> V1List listAccounts()

List your connected platform accounts.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    try {
      V1List result = apiInstance.listAccounts();
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

[**V1List**](V1List.md)

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
> V1List listConnections()

List OAuth-connected API platforms.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.AccountsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AccountsApi apiInstance = new AccountsApi(defaultClient);
    try {
      V1List result = apiInstance.listConnections();
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

[**V1List**](V1List.md)

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
> UpdateConnectionEmailImapResponse updateConnectionEmailImap(id)

Edit an IMAP mailbox connection.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.AccountsApi;

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
      UpdateConnectionEmailImapResponse result = apiInstance.updateConnectionEmailImap(id);
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

[**UpdateConnectionEmailImapResponse**](UpdateConnectionEmailImapResponse.md)

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
import org.openapitools.client.api.AccountsApi;

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

[**UpdatePlatformPreferenceResponse**](UpdatePlatformPreferenceResponse.md)

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

