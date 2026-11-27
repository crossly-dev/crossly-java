# CustomersApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCustomerBulkDelete**](CustomersApi.md#createCustomerBulkDelete) | **POST** /v1/customers/bulk-delete | Bulk blocklist customer handles.
[**createCustomerBulkExport**](CustomersApi.md#createCustomerBulkExport) | **POST** /v1/customers/bulk-export | Bulk export aggregated customers as CSV.
[**createCustomerRefreshProfile**](CustomersApi.md#createCustomerRefreshProfile) | **POST** /v1/customers/{handle}/refresh-profile | Queue a fresh read of a customer&#39;s buyer profiles on every platform they ordered on.
[**createLoyaltyAirdropCancel**](CustomersApi.md#createLoyaltyAirdropCancel) | **POST** /v1/loyalty/airdrops/{id}/cancel | Cancel a queued or failed airdrop (one already sent is the member’s).
[**createLoyaltyAirdropCheck**](CustomersApi.md#createLoyaltyAirdropCheck) | **POST** /v1/loyalty/airdrops/{id}/check | Read a submitted airdrop’s receipt again now.
[**createLoyaltyAirdropPrepare**](CustomersApi.md#createLoyaltyAirdropPrepare) | **POST** /v1/loyalty/airdrops/{id}/prepare | The mint transaction for your launch owner wallet to send: chain, from, to (your launch contract) and calldata, to the member’s verified wallet. Refused airdrop_not_sendable with a reason when it cannot be built.
[**createLoyaltyAirdropSubmit**](CustomersApi.md#createLoyaltyAirdropSubmit) | **POST** /v1/loyalty/airdrops/{id}/submit | Record the hash your wallet broadcast; Crossly reads the receipt (now, then on a schedule) and marks it sent or failed.
[**createLoyaltyProgramInvite**](CustomersApi.md#createLoyaltyProgramInvite) | **POST** /v1/loyalty/program/invite | Invite Crossly buyers to your loyalty program by user id (up to 500); returns how many were newly invited.
[**createLoyaltyProgramMemberOverride**](CustomersApi.md#createLoyaltyProgramMemberOverride) | **POST** /v1/loyalty/program/members/{id}/override | Pin a member to a tier (tierId null clears the pin), with a reason.
[**createLoyaltyTier**](CustomersApi.md#createLoyaltyTier) | **POST** /v1/loyalty/tiers | Add a tier: name, look, threshold and typed perks (% off, free shipping, early access, members-only listings, wholesale access, token gates, airdrops, Bucks, World items, event tickets, …).
[**deleteLoyaltyTier**](CustomersApi.md#deleteLoyaltyTier) | **DELETE** /v1/loyalty/tiers/{id} | Delete a tier; its members are re-evaluated.
[**getCustomer**](CustomersApi.md#getCustomer) | **GET** /v1/customers/{handle} | Get one customer: recent 50 orders, buyer profiles per platform, and stats over all of their orders.
[**getCustomerNote**](CustomersApi.md#getCustomerNote) | **GET** /v1/customers/{handle}/notes | Your private notes on a customer (empty when none). Works before their first order.
[**getLoyaltyAirdrop**](CustomersApi.md#getLoyaltyAirdrop) | **GET** /v1/loyalty/airdrops/{id} | One loyalty NFT airdrop: member, collection, recipient wallet, transaction hash and status.
[**getLoyaltyClub**](CustomersApi.md#getLoyaltyClub) | **GET** /v1/loyalty/club | Your loyalty club: tiers and how many members are in each.
[**getLoyaltyProgram**](CustomersApi.md#getLoyaltyProgram) | **GET** /v1/loyalty/program | Your loyalty program: qualification (spend, orders, points), window, joining, downgrade and grace, and its tiers with typed perks.
[**getLoyaltyProgramMember**](CustomersApi.md#getLoyaltyProgramMember) | **GET** /v1/loyalty/program/members/{id} | One member: standing, tier, progress, perks held, history and any override.
[**listCustomers**](CustomersApi.md#listCustomers) | **GET** /v1/customers | List aggregated customers (group-by lower(buyer_username)), each with its best avatar, display name and star rating.
[**listLoyaltyAirdrops**](CustomersApi.md#listLoyaltyAirdrops) | **GET** /v1/loyalty/airdrops | NFT airdrops your loyalty tiers earned members: queued to send, submitted (waiting on the receipt), sent, failed (with why) or cancelled.
[**listLoyaltyMembers**](CustomersApi.md#listLoyaltyMembers) | **GET** /v1/loyalty/members | Your loyalty club’s members, by spend with you.
[**listLoyaltyProgramInviteCandidates**](CustomersApi.md#listLoyaltyProgramInviteCandidates) | **GET** /v1/loyalty/program/invite-candidates | Crossly buyers who bought from you and are not loyalty members yet (q searches by name): who you can invite.
[**listLoyaltyProgramMembers**](CustomersApi.md#listLoyaltyProgramMembers) | **GET** /v1/loyalty/program/members | Your loyalty members with tier, standing, grace and overrides; search, tier, status and sort filters.
[**updateCustomerNote**](CustomersApi.md#updateCustomerNote) | **PUT** /v1/customers/{handle}/notes | Save your private notes on a customer (an empty string clears them).
[**updateLoyaltyClub**](CustomersApi.md#updateLoyaltyClub) | **PUT** /v1/loyalty/club | Create or update your loyalty club: name, on/off, and up to 6 spend tiers each with a discount (≤ 30%) and perks.
[**updateLoyaltyProgram**](CustomersApi.md#updateLoyaltyProgram) | **PUT** /v1/loyalty/program | Create or update your loyalty program settings.
[**updateLoyaltyTier**](CustomersApi.md#updateLoyaltyTier) | **PUT** /v1/loyalty/tiers/{id} | Replace a tier. Members holding it get the edited perks.


<a name="createCustomerBulkDelete"></a>
# **createCustomerBulkDelete**
> CreateCustomerBulkDeleteResponse createCustomerBulkDelete()

Bulk blocklist customer handles.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    try {
      CreateCustomerBulkDeleteResponse result = apiInstance.createCustomerBulkDelete();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#createCustomerBulkDelete");
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

**CreateCustomerBulkDeleteResponse**

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

<a name="createCustomerBulkExport"></a>
# **createCustomerBulkExport**
> String createCustomerBulkExport()

Bulk export aggregated customers as CSV.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    try {
      String result = apiInstance.createCustomerBulkExport();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#createCustomerBulkExport");
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

**String**

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

<a name="createCustomerRefreshProfile"></a>
# **createCustomerRefreshProfile**
> CreateCustomerRefreshProfileResponse createCustomerRefreshProfile(handle)

Queue a fresh read of a customer&#39;s buyer profiles on every platform they ordered on.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    String handle = "handle_example"; // String | 
    try {
      CreateCustomerRefreshProfileResponse result = apiInstance.createCustomerRefreshProfile(handle);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#createCustomerRefreshProfile");
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
 **handle** | **String**|  |

### Return type

**CreateCustomerRefreshProfileResponse**

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

<a name="createLoyaltyAirdropCancel"></a>
# **createLoyaltyAirdropCancel**
> LoyaltyAirdropResponse createLoyaltyAirdropCancel(id)

Cancel a queued or failed airdrop (one already sent is the member’s).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      LoyaltyAirdropResponse result = apiInstance.createLoyaltyAirdropCancel(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#createLoyaltyAirdropCancel");
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

**LoyaltyAirdropResponse**

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

<a name="createLoyaltyAirdropCheck"></a>
# **createLoyaltyAirdropCheck**
> LoyaltyAirdropResponse createLoyaltyAirdropCheck(id)

Read a submitted airdrop’s receipt again now.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      LoyaltyAirdropResponse result = apiInstance.createLoyaltyAirdropCheck(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#createLoyaltyAirdropCheck");
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

**LoyaltyAirdropResponse**

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

<a name="createLoyaltyAirdropPrepare"></a>
# **createLoyaltyAirdropPrepare**
> CreateLoyaltyAirdropPrepareResponse createLoyaltyAirdropPrepare(id)

The mint transaction for your launch owner wallet to send: chain, from, to (your launch contract) and calldata, to the member’s verified wallet. Refused airdrop_not_sendable with a reason when it cannot be built.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateLoyaltyAirdropPrepareResponse result = apiInstance.createLoyaltyAirdropPrepare(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#createLoyaltyAirdropPrepare");
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

**CreateLoyaltyAirdropPrepareResponse**

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

<a name="createLoyaltyAirdropSubmit"></a>
# **createLoyaltyAirdropSubmit**
> LoyaltyAirdropResponse createLoyaltyAirdropSubmit(id)

Record the hash your wallet broadcast; Crossly reads the receipt (now, then on a schedule) and marks it sent or failed.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      LoyaltyAirdropResponse result = apiInstance.createLoyaltyAirdropSubmit(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#createLoyaltyAirdropSubmit");
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

**LoyaltyAirdropResponse**

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

<a name="createLoyaltyProgramInvite"></a>
# **createLoyaltyProgramInvite**
> CreateLoyaltyProgramInviteResponse createLoyaltyProgramInvite()

Invite Crossly buyers to your loyalty program by user id (up to 500); returns how many were newly invited.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    try {
      CreateLoyaltyProgramInviteResponse result = apiInstance.createLoyaltyProgramInvite();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#createLoyaltyProgramInvite");
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

**CreateLoyaltyProgramInviteResponse**

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

<a name="createLoyaltyProgramMemberOverride"></a>
# **createLoyaltyProgramMemberOverride**
> GetLoyaltyProgramMemberResponse createLoyaltyProgramMemberOverride(id)

Pin a member to a tier (tierId null clears the pin), with a reason.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetLoyaltyProgramMemberResponse result = apiInstance.createLoyaltyProgramMemberOverride(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#createLoyaltyProgramMemberOverride");
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

**GetLoyaltyProgramMemberResponse**

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

<a name="createLoyaltyTier"></a>
# **createLoyaltyTier**
> CreateLoyaltyTierResponse createLoyaltyTier()

Add a tier: name, look, threshold and typed perks (% off, free shipping, early access, members-only listings, wholesale access, token gates, airdrops, Bucks, World items, event tickets, …).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    try {
      CreateLoyaltyTierResponse result = apiInstance.createLoyaltyTier();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#createLoyaltyTier");
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

**CreateLoyaltyTierResponse**

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

<a name="deleteLoyaltyTier"></a>
# **deleteLoyaltyTier**
> UpdateGroupBuyResponse deleteLoyaltyTier(id)

Delete a tier; its members are re-evaluated.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      UpdateGroupBuyResponse result = apiInstance.deleteLoyaltyTier(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#deleteLoyaltyTier");
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

**UpdateGroupBuyResponse**

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

<a name="getCustomer"></a>
# **getCustomer**
> GetCustomerResponse getCustomer(handle)

Get one customer: recent 50 orders, buyer profiles per platform, and stats over all of their orders.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    String handle = "handle_example"; // String | 
    try {
      GetCustomerResponse result = apiInstance.getCustomer(handle);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#getCustomer");
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
 **handle** | **String**|  |

### Return type

**GetCustomerResponse**

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

<a name="getCustomerNote"></a>
# **getCustomerNote**
> GetCustomerNoteResponse getCustomerNote(handle)

Your private notes on a customer (empty when none). Works before their first order.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    String handle = "handle_example"; // String | 
    try {
      GetCustomerNoteResponse result = apiInstance.getCustomerNote(handle);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#getCustomerNote");
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
 **handle** | **String**|  |

### Return type

**GetCustomerNoteResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Default Response |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="getLoyaltyAirdrop"></a>
# **getLoyaltyAirdrop**
> LoyaltyAirdropResponse getLoyaltyAirdrop(id)

One loyalty NFT airdrop: member, collection, recipient wallet, transaction hash and status.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      LoyaltyAirdropResponse result = apiInstance.getLoyaltyAirdrop(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#getLoyaltyAirdrop");
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

**LoyaltyAirdropResponse**

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

<a name="getLoyaltyClub"></a>
# **getLoyaltyClub**
> GetLoyaltyClubResponse getLoyaltyClub()

Your loyalty club: tiers and how many members are in each.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    try {
      GetLoyaltyClubResponse result = apiInstance.getLoyaltyClub();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#getLoyaltyClub");
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

**GetLoyaltyClubResponse**

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

<a name="getLoyaltyProgram"></a>
# **getLoyaltyProgram**
> GetLoyaltyProgramResponse getLoyaltyProgram()

Your loyalty program: qualification (spend, orders, points), window, joining, downgrade and grace, and its tiers with typed perks.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    try {
      GetLoyaltyProgramResponse result = apiInstance.getLoyaltyProgram();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#getLoyaltyProgram");
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

**GetLoyaltyProgramResponse**

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

<a name="getLoyaltyProgramMember"></a>
# **getLoyaltyProgramMember**
> GetLoyaltyProgramMemberResponse getLoyaltyProgramMember(id)

One member: standing, tier, progress, perks held, history and any override.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetLoyaltyProgramMemberResponse result = apiInstance.getLoyaltyProgramMember(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#getLoyaltyProgramMember");
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

**GetLoyaltyProgramMemberResponse**

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

<a name="listCustomers"></a>
# **listCustomers**
> ListCustomersResponse listCustomers()

List aggregated customers (group-by lower(buyer_username)), each with its best avatar, display name and star rating.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    try {
      ListCustomersResponse result = apiInstance.listCustomers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#listCustomers");
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

**ListCustomersResponse**

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

<a name="listLoyaltyAirdrops"></a>
# **listLoyaltyAirdrops**
> ListLoyaltyAirdropsResponse listLoyaltyAirdrops()

NFT airdrops your loyalty tiers earned members: queued to send, submitted (waiting on the receipt), sent, failed (with why) or cancelled.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    try {
      ListLoyaltyAirdropsResponse result = apiInstance.listLoyaltyAirdrops();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#listLoyaltyAirdrops");
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

**ListLoyaltyAirdropsResponse**

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

<a name="listLoyaltyMembers"></a>
# **listLoyaltyMembers**
> ListLoyaltyMembersResponse listLoyaltyMembers()

Your loyalty club’s members, by spend with you.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    try {
      ListLoyaltyMembersResponse result = apiInstance.listLoyaltyMembers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#listLoyaltyMembers");
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

**ListLoyaltyMembersResponse**

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

<a name="listLoyaltyProgramInviteCandidates"></a>
# **listLoyaltyProgramInviteCandidates**
> ListLoyaltyProgramInviteCandidatesResponse listLoyaltyProgramInviteCandidates()

Crossly buyers who bought from you and are not loyalty members yet (q searches by name): who you can invite.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    try {
      ListLoyaltyProgramInviteCandidatesResponse result = apiInstance.listLoyaltyProgramInviteCandidates();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#listLoyaltyProgramInviteCandidates");
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

**ListLoyaltyProgramInviteCandidatesResponse**

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

<a name="listLoyaltyProgramMembers"></a>
# **listLoyaltyProgramMembers**
> ListLoyaltyProgramMembersResponse listLoyaltyProgramMembers()

Your loyalty members with tier, standing, grace and overrides; search, tier, status and sort filters.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    try {
      ListLoyaltyProgramMembersResponse result = apiInstance.listLoyaltyProgramMembers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#listLoyaltyProgramMembers");
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

**ListLoyaltyProgramMembersResponse**

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

<a name="updateCustomerNote"></a>
# **updateCustomerNote**
> GetCustomerNoteResponse updateCustomerNote(handle, updateCustomerNoteRequest)

Save your private notes on a customer (an empty string clears them).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    String handle = "handle_example"; // String | 
    UpdateCustomerNoteRequest updateCustomerNoteRequest = new UpdateCustomerNoteRequest(); // UpdateCustomerNoteRequest | 
    try {
      GetCustomerNoteResponse result = apiInstance.updateCustomerNote(handle, updateCustomerNoteRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#updateCustomerNote");
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
 **handle** | **String**|  |
 **updateCustomerNoteRequest** | **UpdateCustomerNoteRequest**|  |

### Return type

**GetCustomerNoteResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Default Response |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="updateLoyaltyClub"></a>
# **updateLoyaltyClub**
> GetLoyaltyClubResponse updateLoyaltyClub()

Create or update your loyalty club: name, on/off, and up to 6 spend tiers each with a discount (≤ 30%) and perks.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    try {
      GetLoyaltyClubResponse result = apiInstance.updateLoyaltyClub();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#updateLoyaltyClub");
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

**GetLoyaltyClubResponse**

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

<a name="updateLoyaltyProgram"></a>
# **updateLoyaltyProgram**
> UpdateLoyaltyProgramResponse updateLoyaltyProgram()

Create or update your loyalty program settings.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    try {
      UpdateLoyaltyProgramResponse result = apiInstance.updateLoyaltyProgram();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#updateLoyaltyProgram");
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

**UpdateLoyaltyProgramResponse**

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

<a name="updateLoyaltyTier"></a>
# **updateLoyaltyTier**
> CreateLoyaltyTierResponse updateLoyaltyTier(id)

Replace a tier. Members holding it get the edited perks.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.CustomersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CustomersApi apiInstance = new CustomersApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateLoyaltyTierResponse result = apiInstance.updateLoyaltyTier(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CustomersApi#updateLoyaltyTier");
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

**CreateLoyaltyTierResponse**

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

