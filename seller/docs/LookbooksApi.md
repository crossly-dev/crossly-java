# LookbooksApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLookbook**](LookbooksApi.md#createLookbook) | **POST** /v1/lookbooks | Create a lookbook. Pass templateId (classic, editorial, hero, magazine, drop, sale, postcard) to start it from a template styled with your storefront brand kit.
[**createLookbookCampaign**](LookbooksApi.md#createLookbookCampaign) | **POST** /v1/lookbook-campaigns | Email a lookbook to customers now or at scheduledAt. Audience kind subscribers | all | repeat | segment {filters} | handles {handles}; only people with marketing consent who have not unsubscribed receive it.
[**createLookbookCampaignCancel**](LookbooksApi.md#createLookbookCampaignCancel) | **POST** /v1/lookbook-campaigns/{id}/cancel | Cancel a scheduled campaign or stop one that is sending (emails already sent stay sent).
[**createLookbookCampaignPreview**](LookbooksApi.md#createLookbookCampaignPreview) | **POST** /v1/lookbook-campaigns/preview | Preview a lookbook email campaign without sending: how many of the audience can receive it (opted in, not suppressed) and the rendered HTML/text.
[**createLookbookShareLink**](LookbooksApi.md#createLookbookShareLink) | **POST** /v1/lookbooks/{id}/share-links | Make a share link for someone without a Crossly login: role view, comment or edit; expires after ttlHours (1 to 2160, default 168). The url is shown once.
[**createPrintMailJob**](LookbooksApi.md#createPrintMailJob) | **POST** /v1/print-mail/jobs | Draft a printed lookbook mailing (beta): renders the print-ready PDF with bleed and estimates the cost from your per-piece price. Mails nothing until confirmed.
[**createPrintMailJobConfirm**](LookbooksApi.md#createPrintMailJobConfirm) | **POST** /v1/print-mail/jobs/{id}/confirm | Confirm a drafted print job: acknowledgeCharges must be true and pieces must equal the job&#39;s piece count. Your Lob or PostGrid account is billed.
[**getLookbookCampaign**](LookbooksApi.md#getLookbookCampaign) | **GET** /v1/lookbook-campaigns/{id} | One lookbook campaign and its counts.
[**getLookbookDesign**](LookbooksApi.md#getLookbookDesign) | **GET** /v1/lookbooks/{id}/design | A lookbook design document (pages of text, photo, listing, shape and sticker elements) with live listing title/price/photo, your brand kit and rendered page images.
[**listEmailProviders**](LookbooksApi.md#listEmailProviders) | **GET** /v1/email-providers | Your BYOK email providers (SMTP, Mailgun, SendGrid, SES, Resend, Postmark, Brevo, Mailjet, SparkPost, MailerSend, Mandrill, Plunk and more): label, from address, default, last test. Secrets are never returned.
[**listLookbookCampaignRecipients**](LookbooksApi.md#listLookbookCampaignRecipients) | **GET** /v1/lookbook-campaigns/{id}/recipients | Per-recipient results for a campaign: status (queued, sent, failed, skipped + reason), provider message id, opens, clicks, bounce, unsubscribe.
[**listLookbookCampaigns**](LookbooksApi.md#listLookbookCampaigns) | **GET** /v1/lookbook-campaigns | Your lookbook campaigns, newest first, with sent / failed / skipped / opened / clicked / bounced / unsubscribed counts.
[**listLookbooks**](LookbooksApi.md#listLookbooks) | **GET** /v1/lookbooks | Your lookbooks: id, slug, title, published, current design version and item count.
[**listPrintMailJobs**](LookbooksApi.md#listPrintMailJobs) | **GET** /v1/print-mail/jobs | Print-and-mail jobs (beta): provider, format, pieces, estimate, status and per-piece results.
[**updateLookbookDesign**](LookbooksApi.md#updateLookbookDesign) | **PUT** /v1/lookbooks/{id}/design | Save a new design version. Images must already be on the Crossly CDN; listings must be your own Crossly listings. Pass baseVersion to get a 409 instead of overwriting a newer save.


<a name="createLookbook"></a>
# **createLookbook**
> CreateLookbookResponse createLookbook()

Create a lookbook. Pass templateId (classic, editorial, hero, magazine, drop, sale, postcard) to start it from a template styled with your storefront brand kit.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.LookbooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    LookbooksApi apiInstance = new LookbooksApi(defaultClient);
    try {
      CreateLookbookResponse result = apiInstance.createLookbook();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LookbooksApi#createLookbook");
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

**CreateLookbookResponse**

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

<a name="createLookbookCampaign"></a>
# **createLookbookCampaign**
> LookbookCampaignResponse createLookbookCampaign()

Email a lookbook to customers now or at scheduledAt. Audience kind subscribers | all | repeat | segment {filters} | handles {handles}; only people with marketing consent who have not unsubscribed receive it.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.LookbooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    LookbooksApi apiInstance = new LookbooksApi(defaultClient);
    try {
      LookbookCampaignResponse result = apiInstance.createLookbookCampaign();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LookbooksApi#createLookbookCampaign");
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

**LookbookCampaignResponse**

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

<a name="createLookbookCampaignCancel"></a>
# **createLookbookCampaignCancel**
> LookbookCampaignResponse createLookbookCampaignCancel(id)

Cancel a scheduled campaign or stop one that is sending (emails already sent stay sent).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.LookbooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    LookbooksApi apiInstance = new LookbooksApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      LookbookCampaignResponse result = apiInstance.createLookbookCampaignCancel(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LookbooksApi#createLookbookCampaignCancel");
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

**LookbookCampaignResponse**

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

<a name="createLookbookCampaignPreview"></a>
# **createLookbookCampaignPreview**
> CreateLookbookCampaignPreviewResponse createLookbookCampaignPreview()

Preview a lookbook email campaign without sending: how many of the audience can receive it (opted in, not suppressed) and the rendered HTML/text.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.LookbooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    LookbooksApi apiInstance = new LookbooksApi(defaultClient);
    try {
      CreateLookbookCampaignPreviewResponse result = apiInstance.createLookbookCampaignPreview();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LookbooksApi#createLookbookCampaignPreview");
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

**CreateLookbookCampaignPreviewResponse**

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

<a name="createLookbookShareLink"></a>
# **createLookbookShareLink**
> CreateLookbookShareLinkResponse createLookbookShareLink(id)

Make a share link for someone without a Crossly login: role view, comment or edit; expires after ttlHours (1 to 2160, default 168). The url is shown once.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.LookbooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    LookbooksApi apiInstance = new LookbooksApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateLookbookShareLinkResponse result = apiInstance.createLookbookShareLink(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LookbooksApi#createLookbookShareLink");
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

**CreateLookbookShareLinkResponse**

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

<a name="createPrintMailJob"></a>
# **createPrintMailJob**
> CreatePrintMailJobResponse createPrintMailJob()

Draft a printed lookbook mailing (beta): renders the print-ready PDF with bleed and estimates the cost from your per-piece price. Mails nothing until confirmed.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.LookbooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    LookbooksApi apiInstance = new LookbooksApi(defaultClient);
    try {
      CreatePrintMailJobResponse result = apiInstance.createPrintMailJob();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LookbooksApi#createPrintMailJob");
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

**CreatePrintMailJobResponse**

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

<a name="createPrintMailJobConfirm"></a>
# **createPrintMailJobConfirm**
> CreatePrintMailJobConfirmResponse createPrintMailJobConfirm(id)

Confirm a drafted print job: acknowledgeCharges must be true and pieces must equal the job&#39;s piece count. Your Lob or PostGrid account is billed.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.LookbooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    LookbooksApi apiInstance = new LookbooksApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreatePrintMailJobConfirmResponse result = apiInstance.createPrintMailJobConfirm(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LookbooksApi#createPrintMailJobConfirm");
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

**CreatePrintMailJobConfirmResponse**

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

<a name="getLookbookCampaign"></a>
# **getLookbookCampaign**
> LookbookCampaignResponse getLookbookCampaign(id)

One lookbook campaign and its counts.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.LookbooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    LookbooksApi apiInstance = new LookbooksApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      LookbookCampaignResponse result = apiInstance.getLookbookCampaign(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LookbooksApi#getLookbookCampaign");
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

**LookbookCampaignResponse**

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

<a name="getLookbookDesign"></a>
# **getLookbookDesign**
> GetLookbookDesignResponse getLookbookDesign(id)

A lookbook design document (pages of text, photo, listing, shape and sticker elements) with live listing title/price/photo, your brand kit and rendered page images.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.LookbooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    LookbooksApi apiInstance = new LookbooksApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetLookbookDesignResponse result = apiInstance.getLookbookDesign(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LookbooksApi#getLookbookDesign");
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

**GetLookbookDesignResponse**

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

<a name="listEmailProviders"></a>
# **listEmailProviders**
> ListEmailProvidersResponse listEmailProviders()

Your BYOK email providers (SMTP, Mailgun, SendGrid, SES, Resend, Postmark, Brevo, Mailjet, SparkPost, MailerSend, Mandrill, Plunk and more): label, from address, default, last test. Secrets are never returned.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.LookbooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    LookbooksApi apiInstance = new LookbooksApi(defaultClient);
    try {
      ListEmailProvidersResponse result = apiInstance.listEmailProviders();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LookbooksApi#listEmailProviders");
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

**ListEmailProvidersResponse**

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

<a name="listLookbookCampaignRecipients"></a>
# **listLookbookCampaignRecipients**
> ListLookbookCampaignRecipientsResponse listLookbookCampaignRecipients(id)

Per-recipient results for a campaign: status (queued, sent, failed, skipped + reason), provider message id, opens, clicks, bounce, unsubscribe.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.LookbooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    LookbooksApi apiInstance = new LookbooksApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      ListLookbookCampaignRecipientsResponse result = apiInstance.listLookbookCampaignRecipients(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LookbooksApi#listLookbookCampaignRecipients");
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

**ListLookbookCampaignRecipientsResponse**

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

<a name="listLookbookCampaigns"></a>
# **listLookbookCampaigns**
> ListLookbookCampaignsResponse listLookbookCampaigns()

Your lookbook campaigns, newest first, with sent / failed / skipped / opened / clicked / bounced / unsubscribed counts.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.LookbooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    LookbooksApi apiInstance = new LookbooksApi(defaultClient);
    try {
      ListLookbookCampaignsResponse result = apiInstance.listLookbookCampaigns();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LookbooksApi#listLookbookCampaigns");
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

**ListLookbookCampaignsResponse**

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

<a name="listLookbooks"></a>
# **listLookbooks**
> ListLookbooksResponse listLookbooks()

Your lookbooks: id, slug, title, published, current design version and item count.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.LookbooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    LookbooksApi apiInstance = new LookbooksApi(defaultClient);
    try {
      ListLookbooksResponse result = apiInstance.listLookbooks();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LookbooksApi#listLookbooks");
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

**ListLookbooksResponse**

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

<a name="listPrintMailJobs"></a>
# **listPrintMailJobs**
> ListPrintMailJobsResponse listPrintMailJobs()

Print-and-mail jobs (beta): provider, format, pieces, estimate, status and per-piece results.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.LookbooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    LookbooksApi apiInstance = new LookbooksApi(defaultClient);
    try {
      ListPrintMailJobsResponse result = apiInstance.listPrintMailJobs();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LookbooksApi#listPrintMailJobs");
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

**ListPrintMailJobsResponse**

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

<a name="updateLookbookDesign"></a>
# **updateLookbookDesign**
> UpdateLookbookDesignResponse updateLookbookDesign(id)

Save a new design version. Images must already be on the Crossly CDN; listings must be your own Crossly listings. Pass baseVersion to get a 409 instead of overwriting a newer save.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.LookbooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    LookbooksApi apiInstance = new LookbooksApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      UpdateLookbookDesignResponse result = apiInstance.updateLookbookDesign(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LookbooksApi#updateLookbookDesign");
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

**UpdateLookbookDesignResponse**

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

