# AutomationApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAutomationRule**](AutomationApi.md#createAutomationRule) | **POST** /v1/automation/rules | Create an automation rule.
[**createAutomationRuleImport**](AutomationApi.md#createAutomationRuleImport) | **POST** /v1/automation/rules/import | Import one or more rules from recipe JSON (single or bundle).
[**createAutomationRuleRunNow**](AutomationApi.md#createAutomationRuleRunNow) | **POST** /v1/automation/rules/{id}/run-now | Fire an automation rule immediately.
[**createAutomationRuleToggle**](AutomationApi.md#createAutomationRuleToggle) | **POST** /v1/automation/rules/{id}/toggle | Flip an automation rule between active and inactive.
[**createAutomationRuleValidateRecipe**](AutomationApi.md#createAutomationRuleValidateRecipe) | **POST** /v1/automation/rules/validate-recipe | Dry-run validate one or more recipes against the live catalog.
[**deleteAutomationRule**](AutomationApi.md#deleteAutomationRule) | **DELETE** /v1/automation/rules/{id} | Delete an automation rule.
[**getAutomationCatalog**](AutomationApi.md#getAutomationCatalog) | **GET** /v1/automation/catalog | Supported triggerType / actionType / conditionType values for automation rules.
[**getAutomationRule**](AutomationApi.md#getAutomationRule) | **GET** /v1/automation/rules/{id} | Get a single automation rule.
[**getAutomationRuleExport**](AutomationApi.md#getAutomationRuleExport) | **GET** /v1/automation/rules/export | Export the user&#39;s full rule library as a portable recipe bundle.
[**getAutomationRuleExportById**](AutomationApi.md#getAutomationRuleExportById) | **GET** /v1/automation/rules/{id}/export | Export a single automation rule as a portable recipe.
[**listAutomationRules**](AutomationApi.md#listAutomationRules) | **GET** /v1/automation/rules | List automation rules.
[**listAutomationRuns**](AutomationApi.md#listAutomationRuns) | **GET** /v1/automation/runs | Per-fire history for automation rules and workflow chain runs.
[**updateAutomationRule**](AutomationApi.md#updateAutomationRule) | **PUT** /v1/automation/rules/{id} | Update an automation rule (full replace).


<a name="createAutomationRule"></a>
# **createAutomationRule**
> CreateAutomationRuleResponse createAutomationRule()

Create an automation rule.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.AutomationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AutomationApi apiInstance = new AutomationApi(defaultClient);
    try {
      CreateAutomationRuleResponse result = apiInstance.createAutomationRule();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationApi#createAutomationRule");
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

[**CreateAutomationRuleResponse**](CreateAutomationRuleResponse.md)

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

<a name="createAutomationRuleImport"></a>
# **createAutomationRuleImport**
> CreateAutomationRuleImportResponse createAutomationRuleImport(activate)

Import one or more rules from recipe JSON (single or bundle).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.AutomationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AutomationApi apiInstance = new AutomationApi(defaultClient);
    Boolean activate = false; // Boolean | 
    try {
      CreateAutomationRuleImportResponse result = apiInstance.createAutomationRuleImport(activate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationApi#createAutomationRuleImport");
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
 **activate** | **Boolean**|  | [optional] [default to false]

### Return type

[**CreateAutomationRuleImportResponse**](CreateAutomationRuleImportResponse.md)

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

<a name="createAutomationRuleRunNow"></a>
# **createAutomationRuleRunNow**
> CreateAutomationRuleRunNowResponse createAutomationRuleRunNow(id)

Fire an automation rule immediately.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.AutomationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AutomationApi apiInstance = new AutomationApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateAutomationRuleRunNowResponse result = apiInstance.createAutomationRuleRunNow(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationApi#createAutomationRuleRunNow");
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

[**CreateAutomationRuleRunNowResponse**](CreateAutomationRuleRunNowResponse.md)

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

<a name="createAutomationRuleToggle"></a>
# **createAutomationRuleToggle**
> CreateAutomationRuleToggleResponse createAutomationRuleToggle(id)

Flip an automation rule between active and inactive.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.AutomationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AutomationApi apiInstance = new AutomationApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateAutomationRuleToggleResponse result = apiInstance.createAutomationRuleToggle(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationApi#createAutomationRuleToggle");
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

[**CreateAutomationRuleToggleResponse**](CreateAutomationRuleToggleResponse.md)

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

<a name="createAutomationRuleValidateRecipe"></a>
# **createAutomationRuleValidateRecipe**
> CreateAutomationRuleValidateRecipeResponse createAutomationRuleValidateRecipe()

Dry-run validate one or more recipes against the live catalog.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.AutomationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AutomationApi apiInstance = new AutomationApi(defaultClient);
    try {
      CreateAutomationRuleValidateRecipeResponse result = apiInstance.createAutomationRuleValidateRecipe();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationApi#createAutomationRuleValidateRecipe");
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

[**CreateAutomationRuleValidateRecipeResponse**](CreateAutomationRuleValidateRecipeResponse.md)

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

<a name="deleteAutomationRule"></a>
# **deleteAutomationRule**
> DeleteAutomationRuleResponse deleteAutomationRule(id)

Delete an automation rule.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.AutomationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AutomationApi apiInstance = new AutomationApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      DeleteAutomationRuleResponse result = apiInstance.deleteAutomationRule(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationApi#deleteAutomationRule");
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

[**DeleteAutomationRuleResponse**](DeleteAutomationRuleResponse.md)

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

<a name="getAutomationCatalog"></a>
# **getAutomationCatalog**
> GetAutomationCatalogResponse getAutomationCatalog()

Supported triggerType / actionType / conditionType values for automation rules.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.AutomationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AutomationApi apiInstance = new AutomationApi(defaultClient);
    try {
      GetAutomationCatalogResponse result = apiInstance.getAutomationCatalog();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationApi#getAutomationCatalog");
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

[**GetAutomationCatalogResponse**](GetAutomationCatalogResponse.md)

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

<a name="getAutomationRule"></a>
# **getAutomationRule**
> GetAutomationRuleResponse getAutomationRule(id)

Get a single automation rule.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.AutomationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AutomationApi apiInstance = new AutomationApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      GetAutomationRuleResponse result = apiInstance.getAutomationRule(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationApi#getAutomationRule");
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

[**GetAutomationRuleResponse**](GetAutomationRuleResponse.md)

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

<a name="getAutomationRuleExport"></a>
# **getAutomationRuleExport**
> GetAutomationRuleExportResponse getAutomationRuleExport()

Export the user&#39;s full rule library as a portable recipe bundle.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.AutomationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AutomationApi apiInstance = new AutomationApi(defaultClient);
    try {
      GetAutomationRuleExportResponse result = apiInstance.getAutomationRuleExport();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationApi#getAutomationRuleExport");
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

[**GetAutomationRuleExportResponse**](GetAutomationRuleExportResponse.md)

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

<a name="getAutomationRuleExportById"></a>
# **getAutomationRuleExportById**
> GetAutomationRuleExportByIdResponse getAutomationRuleExportById(id)

Export a single automation rule as a portable recipe.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.AutomationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AutomationApi apiInstance = new AutomationApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      GetAutomationRuleExportByIdResponse result = apiInstance.getAutomationRuleExportById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationApi#getAutomationRuleExportById");
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

[**GetAutomationRuleExportByIdResponse**](GetAutomationRuleExportByIdResponse.md)

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

<a name="listAutomationRules"></a>
# **listAutomationRules**
> V1List listAutomationRules()

List automation rules.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.AutomationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AutomationApi apiInstance = new AutomationApi(defaultClient);
    try {
      V1List result = apiInstance.listAutomationRules();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationApi#listAutomationRules");
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

<a name="listAutomationRuns"></a>
# **listAutomationRuns**
> V1List listAutomationRuns(ruleId, chainId, limit)

Per-fire history for automation rules and workflow chain runs.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.AutomationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AutomationApi apiInstance = new AutomationApi(defaultClient);
    UUID ruleId = UUID.randomUUID(); // UUID | 
    UUID chainId = UUID.randomUUID(); // UUID | 
    Integer limit = 100; // Integer | 
    try {
      V1List result = apiInstance.listAutomationRuns(ruleId, chainId, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationApi#listAutomationRuns");
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
 **ruleId** | **UUID**|  | [optional]
 **chainId** | **UUID**|  | [optional]
 **limit** | **Integer**|  | [optional] [default to 100]

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

<a name="updateAutomationRule"></a>
# **updateAutomationRule**
> UpdateAutomationRuleResponse updateAutomationRule(id)

Update an automation rule (full replace).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.AutomationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    AutomationApi apiInstance = new AutomationApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      UpdateAutomationRuleResponse result = apiInstance.updateAutomationRule(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AutomationApi#updateAutomationRule");
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

[**UpdateAutomationRuleResponse**](UpdateAutomationRuleResponse.md)

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

