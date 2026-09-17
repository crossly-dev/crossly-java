# TemplatesApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMeTemplate**](TemplatesApi.md#createMeTemplate) | **POST** /v1/me/templates | Create a template.
[**createMeTemplateImport**](TemplatesApi.md#createMeTemplateImport) | **POST** /v1/me/templates/import | Bulk-create templates from an exported payload.
[**createMeTemplateRender**](TemplatesApi.md#createMeTemplateRender) | **POST** /v1/me/templates/{id}/render | Render a template&#39;s title + description against a context.
[**createMeTemplateShare**](TemplatesApi.md#createMeTemplateShare) | **POST** /v1/me/templates/{id}/share | Mint or return an existing share token for a template.
[**deleteMeTemplate**](TemplatesApi.md#deleteMeTemplate) | **DELETE** /v1/me/templates/{id} | Delete a template.
[**deleteMeTemplateShare**](TemplatesApi.md#deleteMeTemplateShare) | **DELETE** /v1/me/templates/{id}/share | Revoke a template share link.
[**getMeTemplate**](TemplatesApi.md#getMeTemplate) | **GET** /v1/me/templates/{id} | Fetch one template in full.
[**getMeTemplateSuggest**](TemplatesApi.md#getMeTemplateSuggest) | **GET** /v1/me/templates/suggest | The seller&#39;s default template for a category.
[**listMeTemplates**](TemplatesApi.md#listMeTemplates) | **GET** /v1/me/templates | List the seller&#39;s templates.
[**updateMeTemplate**](TemplatesApi.md#updateMeTemplate) | **PATCH** /v1/me/templates/{id} | Patch a template.


<a name="createMeTemplate"></a>
# **createMeTemplate**
> CreateMeTemplateResponse createMeTemplate()

Create a template.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    try {
      CreateMeTemplateResponse result = apiInstance.createMeTemplate();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#createMeTemplate");
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

[**CreateMeTemplateResponse**](CreateMeTemplateResponse.md)

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

<a name="createMeTemplateImport"></a>
# **createMeTemplateImport**
> CreateMeTemplateImportResponse createMeTemplateImport()

Bulk-create templates from an exported payload.

Accepts one template object or an array of them. Entries that fail validation are SKIPPED rather than failing the batch — an import is usually someone else&#39;s export, and rejecting fifty good templates over one bad row helps nobody. The response reports how many landed, so a short count is visible rather than silent.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    try {
      CreateMeTemplateImportResponse result = apiInstance.createMeTemplateImport();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#createMeTemplateImport");
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

[**CreateMeTemplateImportResponse**](CreateMeTemplateImportResponse.md)

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

<a name="createMeTemplateRender"></a>
# **createMeTemplateRender**
> CreateMeTemplateRenderResponse createMeTemplateRender(id)

Render a template&#39;s title + description against a context.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateMeTemplateRenderResponse result = apiInstance.createMeTemplateRender(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#createMeTemplateRender");
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

[**CreateMeTemplateRenderResponse**](CreateMeTemplateRenderResponse.md)

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

<a name="createMeTemplateShare"></a>
# **createMeTemplateShare**
> CreateMeTemplateShareResponse createMeTemplateShare(id)

Mint or return an existing share token for a template.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateMeTemplateShareResponse result = apiInstance.createMeTemplateShare(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#createMeTemplateShare");
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

[**CreateMeTemplateShareResponse**](CreateMeTemplateShareResponse.md)

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

<a name="deleteMeTemplate"></a>
# **deleteMeTemplate**
> DeleteMeTemplateResponse deleteMeTemplate(id)

Delete a template.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      DeleteMeTemplateResponse result = apiInstance.deleteMeTemplate(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#deleteMeTemplate");
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

[**DeleteMeTemplateResponse**](DeleteMeTemplateResponse.md)

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

<a name="deleteMeTemplateShare"></a>
# **deleteMeTemplateShare**
> DeleteMeTemplateShareResponse deleteMeTemplateShare(id)

Revoke a template share link.

Clears the share token, so the public link stops resolving. The template itself is untouched. Sharing again mints a NEW token — the old link is dead for good, which is the point of revoking.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      DeleteMeTemplateShareResponse result = apiInstance.deleteMeTemplateShare(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#deleteMeTemplateShare");
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

[**DeleteMeTemplateShareResponse**](DeleteMeTemplateShareResponse.md)

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

<a name="getMeTemplate"></a>
# **getMeTemplate**
> GetMeTemplateResponse getMeTemplate(id)

Fetch one template in full.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      GetMeTemplateResponse result = apiInstance.getMeTemplate(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#getMeTemplate");
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

[**GetMeTemplateResponse**](GetMeTemplateResponse.md)

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

<a name="getMeTemplateSuggest"></a>
# **getMeTemplateSuggest**
> GetMeTemplateSuggestResponse getMeTemplateSuggest()

The seller&#39;s default template for a category.

Returns { template: null } rather than 404 when the seller has no default for that category — \&quot;no default\&quot; is a normal answer, not an error, and callers hydrate a form from it.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    try {
      GetMeTemplateSuggestResponse result = apiInstance.getMeTemplateSuggest();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#getMeTemplateSuggest");
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

[**GetMeTemplateSuggestResponse**](GetMeTemplateSuggestResponse.md)

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

<a name="listMeTemplates"></a>
# **listMeTemplates**
> V1List listMeTemplates()

List the seller&#39;s templates.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    try {
      V1List result = apiInstance.listMeTemplates();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#listMeTemplates");
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

<a name="updateMeTemplate"></a>
# **updateMeTemplate**
> UpdateMeTemplateResponse updateMeTemplate(id)

Patch a template.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      UpdateMeTemplateResponse result = apiInstance.updateMeTemplate(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#updateMeTemplate");
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

[**UpdateMeTemplateResponse**](UpdateMeTemplateResponse.md)

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

