# WorldsAdsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getWorldExperienceAd**](WorldsAdsApi.md#getWorldExperienceAd) | **GET** /v1/worlds/experiences/{experienceId}/ads | The ads for a game&#39;s in-world ad surfaces (parts tagged CrosslyAdSurface), for the token&#39;s owner: Sponsored Listings labelled \&quot;Ad\&quot;, served only to signed-in adults where the game&#39;s creator turned ads on, never to its team. A click is POST /api/public/shop/ads/click { token }.
[**getWorldExperienceAdReport**](WorldsAdsApi.md#getWorldExperienceAdReport) | **GET** /v1/worlds/experiences/{experienceId}/ads/report | In-game ads over the last N days (default 30, max 90): impressions, clicks, charged clicks, advertiser spend and your earned share, per day.
[**getWorldExperienceAdSetting**](WorldsAdsApi.md#getWorldExperienceAdSetting) | **GET** /v1/worlds/experiences/{experienceId}/ad-settings | Whether this game shows in-game ads (opt-in, default off) and the creator&#39;s share of Crossly&#39;s ad revenue in force.
[**updateWorldExperienceAdSetting**](WorldsAdsApi.md#updateWorldExperienceAdSetting) | **PUT** /v1/worlds/experiences/{experienceId}/ad-settings | Turn in-game ads on or off for this game. Ads fill the game&#39;s ad surfaces (parts tagged CrosslyAdSurface); nothing shows until it has one.


<a name="getWorldExperienceAd"></a>
# **getWorldExperienceAd**
> GetWorldExperienceAdResponse getWorldExperienceAd(experienceId)

The ads for a game&#39;s in-world ad surfaces (parts tagged CrosslyAdSurface), for the token&#39;s owner: Sponsored Listings labelled \&quot;Ad\&quot;, served only to signed-in adults where the game&#39;s creator turned ads on, never to its team. A click is POST /api/public/shop/ads/click { token }.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsAdsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsAdsApi apiInstance = new WorldsAdsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      GetWorldExperienceAdResponse result = apiInstance.getWorldExperienceAd(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsAdsApi#getWorldExperienceAd");
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

**GetWorldExperienceAdResponse**

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

<a name="getWorldExperienceAdReport"></a>
# **getWorldExperienceAdReport**
> GetWorldExperienceAdReportResponse getWorldExperienceAdReport(experienceId)

In-game ads over the last N days (default 30, max 90): impressions, clicks, charged clicks, advertiser spend and your earned share, per day.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsAdsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsAdsApi apiInstance = new WorldsAdsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      GetWorldExperienceAdReportResponse result = apiInstance.getWorldExperienceAdReport(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsAdsApi#getWorldExperienceAdReport");
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

**GetWorldExperienceAdReportResponse**

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

<a name="getWorldExperienceAdSetting"></a>
# **getWorldExperienceAdSetting**
> GetWorldExperienceAdSettingResponse getWorldExperienceAdSetting(experienceId)

Whether this game shows in-game ads (opt-in, default off) and the creator&#39;s share of Crossly&#39;s ad revenue in force.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsAdsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsAdsApi apiInstance = new WorldsAdsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      GetWorldExperienceAdSettingResponse result = apiInstance.getWorldExperienceAdSetting(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsAdsApi#getWorldExperienceAdSetting");
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

**GetWorldExperienceAdSettingResponse**

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

<a name="updateWorldExperienceAdSetting"></a>
# **updateWorldExperienceAdSetting**
> GetWorldExperienceAdSettingResponse updateWorldExperienceAdSetting(experienceId)

Turn in-game ads on or off for this game. Ads fill the game&#39;s ad surfaces (parts tagged CrosslyAdSurface); nothing shows until it has one.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsAdsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsAdsApi apiInstance = new WorldsAdsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      GetWorldExperienceAdSettingResponse result = apiInstance.updateWorldExperienceAdSetting(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsAdsApi#updateWorldExperienceAdSetting");
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

**GetWorldExperienceAdSettingResponse**

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

