# ActivityApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createActionLogExport**](ActivityApi.md#createActionLogExport) | **POST** /v1/action-log/exports | Queue an export of the Activity Log: every event (csv, ndjson, pdf) or a summary report (pdf, ndjson). Poll GET /api/v1/action-log/exports/{exportId}, then download it. Exports never contain IP addresses.
[**createActionLogSearchTranslate**](ActivityApi.md#createActionLogSearchTranslate) | **POST** /v1/action-log/search/translate | Turn a question in words (\&quot;failed delists on Mercari last week\&quot;) into an Activity Log search: pass the returned &#x60;q&#x60; to GET /api/v1/action-log (or the histogram and csv/ndjson exports). Nothing is run. A 404 with details.code &#x60;not_enabled&#x60; means natural-language search is off for this account.
[**createDetectedEventEventConfirm**](ActivityApi.md#createDetectedEventEventConfirm) | **POST** /v1/detected-events/events/{id}/confirm | Answer an open ask (canConfirm true): optionally which item it is (itemId, one of the match candidates) and which actions to run instead of the ask&#39;s preselected ones. Returns the event. 409 ask_not_open when the event is not waiting.
[**createDetectedEventEventUndo**](ActivityApi.md#createDetectedEventEventUndo) | **POST** /v1/detected-events/events/{id}/undo | Undo what Crossly did for an event (canUndo true): every executed action&#39;s stored inverse runs, newest first (restore stock, relist, unlink…). Returns the event. 409 nothing_to_undo when nothing is reversible.
[**createDetectedEventRule**](ActivityApi.md#createDetectedEventRule) | **POST** /v1/detected-events/rules | Create a detection rule: which detected events it applies to (filter + optional condition over any event axis) and what Crossly does then (and else). Without order it is placed most-specific-first, above the default set. Returns the stored rule with its id.
[**createDetectedEventRulePlace**](ActivityApi.md#createDetectedEventRulePlace) | **POST** /v1/detected-events/rules/place | Save one rule and the whole evaluation order in one transaction: rule.id is an existing id (replace) or any new client id (create); ids is every rule id top-down, naming the rule by that id. Returns the stored rule and the list.
[**createDetectedEventRuleReorder**](ActivityApi.md#createDetectedEventRuleReorder) | **POST** /v1/detected-events/rules/reorder | Set the evaluation order: ids top-down, defaults included (ids from the rules list). Rules are re-numbered 10, 20, 30…; a default moved above one of your rules is stored as your edit. Returns the list.
[**createDetectedEventRuleResetDefault**](ActivityApi.md#createDetectedEventRuleResetDefault) | **POST** /v1/detected-events/rules/reset-defaults | Drop your edits of the shipped default rules (keys, or all when omitted). Returns the list.
[**createDetectedEventSimulate**](ActivityApi.md#createDetectedEventSimulate) | **POST** /v1/detected-events/simulate | Run one event through the rules without acting: the winning rule, rules it shadowed, the trace, the guards that held actions back and the plan per target with how it would run (direct / relay / ask / skip). event needs only kind; every axis left out takes its default. rules &#x3D; an unsaved draft list.
[**createDetectedEventSimulateImpact**](ActivityApi.md#createDetectedEventSimulateImpact) | **POST** /v1/detected-events/simulate/impact | What a rule edit would change: your detected events of the last days (default 30, at most 500) re-resolved against the draft rules and against the stored ones. Per event: winning rule and actions before and after, and whether it changed. Nothing runs.
[**createEmailEventConfirm**](ActivityApi.md#createEmailEventConfirm) | **POST** /v1/email-events/{id}/confirm | Confirm an email-detected event: re-run it as certain (a possible sale records the sale and delists the item elsewhere). When several listings could be meant, pass platformListingDbId to choose one.
[**createEmailEventDismiss**](ActivityApi.md#createEmailEventDismiss) | **POST** /v1/email-events/{id}/dismiss | Dismiss an email-detected event (\&quot;not a sale\&quot;): closes the card without acting.
[**createEventPolicyDecisionConfirm**](ActivityApi.md#createEventPolicyDecisionConfirm) | **POST** /v1/event-policies/decisions/{id}/confirm | Confirm a review decision from a webhook, order poller or app relay (canConfirm true): the event runs again with the seller confirmed, so a review rule runs the strongest allowed non-review action for that cell. Returns the new decision. 409 when the decision was already confirmed or is not confirmable (email review decisions are confirmed on their review card).
[**deleteDetectedEventRule**](ActivityApi.md#deleteDetectedEventRule) | **DELETE** /v1/detected-events/rules/{id} | Delete a detection rule. Deleting your edit of a default (its id, or default:&lt;key&gt;) brings the shipped default back; deleting a translated event-policy rule deletes that policy rule too.
[**deleteEventPolicyRule**](ActivityApi.md#deleteEventPolicyRule) | **DELETE** /v1/event-policies/rules/{id} | Delete a rule: its cell falls back to the next scope (platform → global → the built-in default).
[**getActionLog**](ActivityApi.md#getActionLog) | **GET** /v1/action-log/{id} | One Activity Log event by id, with &#x60;view&#x60; including its steps and, for bulk jobs, its children.
[**getActionLogExport**](ActivityApi.md#getActionLogExport) | **GET** /v1/action-log/exports/{exportId} | The state of one Activity Log export.
[**getActionLogExportDownload**](ActivityApi.md#getActionLogExportDownload) | **GET** /v1/action-log/exports/{exportId}/download | Download a finished Activity Log export (for 24 hours after it completes).
[**getActionLogFacet**](ActivityApi.md#getActionLogFacet) | **GET** /v1/action-log/facets | Filter options of the caller&#39;s Activity Log (last 90 days): areas with their actions and counts, the team members who acted, platforms and outcomes.
[**getDetectedEventEvent**](ActivityApi.md#getDetectedEventEvent) | **GET** /v1/detected-events/events/{id} | One detected event with every report of it (first + corroborations, with correlation and contradiction), the guards that held actions back, the plan and each executed action&#39;s outcome and reversibility.
[**getEventPolicy**](ActivityApi.md#getEventPolicy) | **GET** /v1/event-policies | What Crossly does with each detected marketplace event (sale, listing ended, offer, cancellation, label, shipped, delivered, refund, return, payout, message), per who owns the item (crossly, imported, app_managed, other_tool, untracked). Each matrix cell lists the allowed actions and the effective one, with the scope it comes from (app &gt; platform &gt; global &gt; default). Pass platform (or appId) to see the matrix as that platform&#39;s (or app&#39;s) items see it. Also returns the rules, platforms and connected apps.
[**listActionLog**](ActivityApi.md#listActionLog) | **GET** /v1/action-log | List Activity Log events, newest first. Each event carries &#x60;view&#x60; (title, sentence, fields, failure advice, who did it) and typed &#x60;detail&#x60;. Page with &#x60;cursor&#x60;; &#x60;pagination.total&#x60; counts matches.
[**listActionLogCalls**](ActivityApi.md#listActionLogCalls) | **GET** /v1/action-log/{id}/calls | The outbound platform HTTP calls under an event (oldest first) — platform, operation, method, host, status, latency, error class/message, proxy + recipe id. Answers \&quot;what was sent / what went wrong\&quot;. The URL path, request/response bodies and persisted-query hash are never returned.
[**listActionLogHistogram**](ActivityApi.md#listActionLogHistogram) | **GET** /v1/action-log/histogram | Events per UTC day for the list filters (default: the last 30 days; at most 366).
[**listDetectedEventEvents**](ActivityApi.md#listDetectedEventEvents) | **GET** /v1/detected-events/events | Every event Crossly detected (sales, order changes, listing changes, offers, messages, account notices), newest first: all its axes, the rule that decided it, its corroborating reports, the plan per target and how each action went, with canConfirm (an open ask) and canUndo. Cursor-paged; filter by kinds, platforms statuses and accounts (comma-separated) and since (ISO time).
[**listDetectedEventRules**](ActivityApi.md#listDetectedEventRules) | **GET** /v1/detected-events/rules | The seller&#39;s detection rules, top-down in the order they are evaluated (first match wins unless a rule says continue): the seller&#39;s own rules, translations of their event-policy rules (source legacy), then the shipped default set (source default, ids default:&lt;key&gt;; a stored edit of a default replaces it). Each rule has a filter (event kinds, platforms, accounts, apps, tags, items), an optional condition over any event axis, the actions it runs (then / else) and its guard loosenings.
[**listEmailEvents**](ActivityApi.md#listEmailEvents) | **GET** /v1/email-events | List email-detected events waiting for the seller (status&#x3D;needs_review): a possible sale, ended listing, cancellation or other event an email reported that was not certain enough to act on automatically.
[**listEventPolicyDecisions**](ActivityApi.md#listEventPolicyDecisions) | **GET** /v1/event-policies/decisions | The decision log, newest first: for each detected event, what the rule or default asked for, what was done (after capability fallback and the email confidence ceiling), the rule that decided it, and the outcome (done / skipped / failed / review). Cursor-paged; filter by event, ownership, platform or outcome (outcome&#x3D;review: still waiting for the seller). Kept 90 days.
[**updateDetectedEventRule**](ActivityApi.md#updateDetectedEventRule) | **PUT** /v1/detected-events/rules/{id} | Replace a detection rule. An id default:&lt;key&gt; stores your edit of that shipped default (delete it, or reset-defaults, to go back to the shipped one).
[**updateEventPolicyRule**](ActivityApi.md#updateEventPolicyRule) | **PUT** /v1/event-policies/rules | Set what Crossly does with one kind of detected event for one kind of item: scope global (scopeValue null), platform (scopeValue &#x3D; platform id) or app (scopeValue &#x3D; OAuth app id, app_managed items only). Replaces the rule for the same cell and scope. The action must be one the matrix allows for that cell; import actions exist only for untracked items.


<a name="createActionLogExport"></a>
# **createActionLogExport**
> GetActionLogExportResponse createActionLogExport(createActionLogExportRequest)

Queue an export of the Activity Log: every event (csv, ndjson, pdf) or a summary report (pdf, ndjson). Poll GET /api/v1/action-log/exports/{exportId}, then download it. Exports never contain IP addresses.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ActivityApi apiInstance = new ActivityApi(defaultClient);
    CreateActionLogExportRequest createActionLogExportRequest = new CreateActionLogExportRequest(); // CreateActionLogExportRequest | 
    try {
      GetActionLogExportResponse result = apiInstance.createActionLogExport(createActionLogExportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#createActionLogExport");
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
 **createActionLogExportRequest** | **CreateActionLogExportRequest**|  |

### Return type

**GetActionLogExportResponse**

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

<a name="createActionLogSearchTranslate"></a>
# **createActionLogSearchTranslate**
> CreateActionLogSearchTranslateResponse createActionLogSearchTranslate(createActionLogSearchTranslateRequest)

Turn a question in words (\&quot;failed delists on Mercari last week\&quot;) into an Activity Log search: pass the returned &#x60;q&#x60; to GET /api/v1/action-log (or the histogram and csv/ndjson exports). Nothing is run. A 404 with details.code &#x60;not_enabled&#x60; means natural-language search is off for this account.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ActivityApi apiInstance = new ActivityApi(defaultClient);
    CreateActionLogSearchTranslateRequest createActionLogSearchTranslateRequest = new CreateActionLogSearchTranslateRequest(); // CreateActionLogSearchTranslateRequest | 
    try {
      CreateActionLogSearchTranslateResponse result = apiInstance.createActionLogSearchTranslate(createActionLogSearchTranslateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#createActionLogSearchTranslate");
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
 **createActionLogSearchTranslateRequest** | **CreateActionLogSearchTranslateRequest**|  |

### Return type

**CreateActionLogSearchTranslateResponse**

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

<a name="createDetectedEventEventConfirm"></a>
# **createDetectedEventEventConfirm**
> CreateDetectedEventEventUndoResponse createDetectedEventEventConfirm(id, createDetectedEventEventConfirmRequest)

Answer an open ask (canConfirm true): optionally which item it is (itemId, one of the match candidates) and which actions to run instead of the ask&#39;s preselected ones. Returns the event. 409 ask_not_open when the event is not waiting.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ActivityApi apiInstance = new ActivityApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    CreateDetectedEventEventConfirmRequest createDetectedEventEventConfirmRequest = new CreateDetectedEventEventConfirmRequest(); // CreateDetectedEventEventConfirmRequest | 
    try {
      CreateDetectedEventEventUndoResponse result = apiInstance.createDetectedEventEventConfirm(id, createDetectedEventEventConfirmRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#createDetectedEventEventConfirm");
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
 **createDetectedEventEventConfirmRequest** | **CreateDetectedEventEventConfirmRequest**|  |

### Return type

**CreateDetectedEventEventUndoResponse**

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

<a name="createDetectedEventEventUndo"></a>
# **createDetectedEventEventUndo**
> CreateDetectedEventEventUndoResponse createDetectedEventEventUndo(id)

Undo what Crossly did for an event (canUndo true): every executed action&#39;s stored inverse runs, newest first (restore stock, relist, unlink…). Returns the event. 409 nothing_to_undo when nothing is reversible.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ActivityApi apiInstance = new ActivityApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateDetectedEventEventUndoResponse result = apiInstance.createDetectedEventEventUndo(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#createDetectedEventEventUndo");
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

**CreateDetectedEventEventUndoResponse**

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

<a name="createDetectedEventRule"></a>
# **createDetectedEventRule**
> CreateDetectedEventRuleResponse createDetectedEventRule(createDetectedEventRuleRequest)

Create a detection rule: which detected events it applies to (filter + optional condition over any event axis) and what Crossly does then (and else). Without order it is placed most-specific-first, above the default set. Returns the stored rule with its id.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ActivityApi apiInstance = new ActivityApi(defaultClient);
    CreateDetectedEventRuleRequest createDetectedEventRuleRequest = new CreateDetectedEventRuleRequest(); // CreateDetectedEventRuleRequest | 
    try {
      CreateDetectedEventRuleResponse result = apiInstance.createDetectedEventRule(createDetectedEventRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#createDetectedEventRule");
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
 **createDetectedEventRuleRequest** | **CreateDetectedEventRuleRequest**|  |

### Return type

**CreateDetectedEventRuleResponse**

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

<a name="createDetectedEventRulePlace"></a>
# **createDetectedEventRulePlace**
> CreateDetectedEventRulePlaceResponse createDetectedEventRulePlace(createDetectedEventRulePlaceRequest)

Save one rule and the whole evaluation order in one transaction: rule.id is an existing id (replace) or any new client id (create); ids is every rule id top-down, naming the rule by that id. Returns the stored rule and the list.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ActivityApi apiInstance = new ActivityApi(defaultClient);
    CreateDetectedEventRulePlaceRequest createDetectedEventRulePlaceRequest = new CreateDetectedEventRulePlaceRequest(); // CreateDetectedEventRulePlaceRequest | 
    try {
      CreateDetectedEventRulePlaceResponse result = apiInstance.createDetectedEventRulePlace(createDetectedEventRulePlaceRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#createDetectedEventRulePlace");
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
 **createDetectedEventRulePlaceRequest** | **CreateDetectedEventRulePlaceRequest**|  |

### Return type

**CreateDetectedEventRulePlaceResponse**

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

<a name="createDetectedEventRuleReorder"></a>
# **createDetectedEventRuleReorder**
> CreateDetectedEventRuleReorderResponse createDetectedEventRuleReorder(createDetectedEventRuleReorderRequest)

Set the evaluation order: ids top-down, defaults included (ids from the rules list). Rules are re-numbered 10, 20, 30…; a default moved above one of your rules is stored as your edit. Returns the list.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ActivityApi apiInstance = new ActivityApi(defaultClient);
    CreateDetectedEventRuleReorderRequest createDetectedEventRuleReorderRequest = new CreateDetectedEventRuleReorderRequest(); // CreateDetectedEventRuleReorderRequest | 
    try {
      CreateDetectedEventRuleReorderResponse result = apiInstance.createDetectedEventRuleReorder(createDetectedEventRuleReorderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#createDetectedEventRuleReorder");
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
 **createDetectedEventRuleReorderRequest** | **CreateDetectedEventRuleReorderRequest**|  |

### Return type

**CreateDetectedEventRuleReorderResponse**

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

<a name="createDetectedEventRuleResetDefault"></a>
# **createDetectedEventRuleResetDefault**
> CreateDetectedEventRuleReorderResponse createDetectedEventRuleResetDefault(createDetectedEventRuleResetDefaultRequest)

Drop your edits of the shipped default rules (keys, or all when omitted). Returns the list.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ActivityApi apiInstance = new ActivityApi(defaultClient);
    CreateDetectedEventRuleResetDefaultRequest createDetectedEventRuleResetDefaultRequest = new CreateDetectedEventRuleResetDefaultRequest(); // CreateDetectedEventRuleResetDefaultRequest | 
    try {
      CreateDetectedEventRuleReorderResponse result = apiInstance.createDetectedEventRuleResetDefault(createDetectedEventRuleResetDefaultRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#createDetectedEventRuleResetDefault");
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
 **createDetectedEventRuleResetDefaultRequest** | **CreateDetectedEventRuleResetDefaultRequest**|  |

### Return type

**CreateDetectedEventRuleReorderResponse**

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

<a name="createDetectedEventSimulate"></a>
# **createDetectedEventSimulate**
> CreateDetectedEventSimulateResponse createDetectedEventSimulate(createDetectedEventSimulateRequest)

Run one event through the rules without acting: the winning rule, rules it shadowed, the trace, the guards that held actions back and the plan per target with how it would run (direct / relay / ask / skip). event needs only kind; every axis left out takes its default. rules &#x3D; an unsaved draft list.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ActivityApi apiInstance = new ActivityApi(defaultClient);
    CreateDetectedEventSimulateRequest createDetectedEventSimulateRequest = new CreateDetectedEventSimulateRequest(); // CreateDetectedEventSimulateRequest | 
    try {
      CreateDetectedEventSimulateResponse result = apiInstance.createDetectedEventSimulate(createDetectedEventSimulateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#createDetectedEventSimulate");
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
 **createDetectedEventSimulateRequest** | **CreateDetectedEventSimulateRequest**|  |

### Return type

**CreateDetectedEventSimulateResponse**

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

<a name="createDetectedEventSimulateImpact"></a>
# **createDetectedEventSimulateImpact**
> CreateDetectedEventSimulateImpactResponse createDetectedEventSimulateImpact(createDetectedEventSimulateImpactRequest)

What a rule edit would change: your detected events of the last days (default 30, at most 500) re-resolved against the draft rules and against the stored ones. Per event: winning rule and actions before and after, and whether it changed. Nothing runs.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ActivityApi apiInstance = new ActivityApi(defaultClient);
    CreateDetectedEventSimulateImpactRequest createDetectedEventSimulateImpactRequest = new CreateDetectedEventSimulateImpactRequest(); // CreateDetectedEventSimulateImpactRequest | 
    try {
      CreateDetectedEventSimulateImpactResponse result = apiInstance.createDetectedEventSimulateImpact(createDetectedEventSimulateImpactRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#createDetectedEventSimulateImpact");
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
 **createDetectedEventSimulateImpactRequest** | **CreateDetectedEventSimulateImpactRequest**|  |

### Return type

**CreateDetectedEventSimulateImpactResponse**

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

<a name="createEmailEventConfirm"></a>
# **createEmailEventConfirm**
> CreateEmailEventConfirmResponse createEmailEventConfirm(id, createEmailEventConfirmRequest)

Confirm an email-detected event: re-run it as certain (a possible sale records the sale and delists the item elsewhere). When several listings could be meant, pass platformListingDbId to choose one.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ActivityApi apiInstance = new ActivityApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    CreateEmailEventConfirmRequest createEmailEventConfirmRequest = new CreateEmailEventConfirmRequest(); // CreateEmailEventConfirmRequest | 
    try {
      CreateEmailEventConfirmResponse result = apiInstance.createEmailEventConfirm(id, createEmailEventConfirmRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#createEmailEventConfirm");
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
 **createEmailEventConfirmRequest** | **CreateEmailEventConfirmRequest**|  |

### Return type

**CreateEmailEventConfirmResponse**

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

<a name="createEmailEventDismiss"></a>
# **createEmailEventDismiss**
> IdStatusResponse createEmailEventDismiss(id)

Dismiss an email-detected event (\&quot;not a sale\&quot;): closes the card without acting.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ActivityApi apiInstance = new ActivityApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      IdStatusResponse result = apiInstance.createEmailEventDismiss(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#createEmailEventDismiss");
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

**IdStatusResponse**

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

<a name="createEventPolicyDecisionConfirm"></a>
# **createEventPolicyDecisionConfirm**
> CreateEventPolicyDecisionConfirmResponse createEventPolicyDecisionConfirm(id)

Confirm a review decision from a webhook, order poller or app relay (canConfirm true): the event runs again with the seller confirmed, so a review rule runs the strongest allowed non-review action for that cell. Returns the new decision. 409 when the decision was already confirmed or is not confirmable (email review decisions are confirmed on their review card).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ActivityApi apiInstance = new ActivityApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateEventPolicyDecisionConfirmResponse result = apiInstance.createEventPolicyDecisionConfirm(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#createEventPolicyDecisionConfirm");
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

**CreateEventPolicyDecisionConfirmResponse**

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

<a name="deleteDetectedEventRule"></a>
# **deleteDetectedEventRule**
> DeleteStoryResponse deleteDetectedEventRule(id)

Delete a detection rule. Deleting your edit of a default (its id, or default:&lt;key&gt;) brings the shipped default back; deleting a translated event-policy rule deletes that policy rule too.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ActivityApi apiInstance = new ActivityApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      DeleteStoryResponse result = apiInstance.deleteDetectedEventRule(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#deleteDetectedEventRule");
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

**DeleteStoryResponse**

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

<a name="deleteEventPolicyRule"></a>
# **deleteEventPolicyRule**
> DeleteStoryResponse deleteEventPolicyRule(id)

Delete a rule: its cell falls back to the next scope (platform → global → the built-in default).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ActivityApi apiInstance = new ActivityApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      DeleteStoryResponse result = apiInstance.deleteEventPolicyRule(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#deleteEventPolicyRule");
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

**DeleteStoryResponse**

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

<a name="getActionLog"></a>
# **getActionLog**
> ListActionLogItem getActionLog(id)

One Activity Log event by id, with &#x60;view&#x60; including its steps and, for bulk jobs, its children.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ActivityApi apiInstance = new ActivityApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      ListActionLogItem result = apiInstance.getActionLog(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#getActionLog");
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

**ListActionLogItem**

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

<a name="getActionLogExport"></a>
# **getActionLogExport**
> GetActionLogExportResponse getActionLogExport(exportId)

The state of one Activity Log export.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ActivityApi apiInstance = new ActivityApi(defaultClient);
    String exportId = "exportId_example"; // String | 
    try {
      GetActionLogExportResponse result = apiInstance.getActionLogExport(exportId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#getActionLogExport");
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
 **exportId** | **String**|  |

### Return type

**GetActionLogExportResponse**

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

<a name="getActionLogExportDownload"></a>
# **getActionLogExportDownload**
> GetActionLogExportDownloadResponse getActionLogExportDownload(exportId)

Download a finished Activity Log export (for 24 hours after it completes).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ActivityApi apiInstance = new ActivityApi(defaultClient);
    String exportId = "exportId_example"; // String | 
    try {
      GetActionLogExportDownloadResponse result = apiInstance.getActionLogExportDownload(exportId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#getActionLogExportDownload");
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
 **exportId** | **String**|  |

### Return type

**GetActionLogExportDownloadResponse**

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

<a name="getActionLogFacet"></a>
# **getActionLogFacet**
> GetActionLogFacetResponse getActionLogFacet()

Filter options of the caller&#39;s Activity Log (last 90 days): areas with their actions and counts, the team members who acted, platforms and outcomes.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ActivityApi apiInstance = new ActivityApi(defaultClient);
    try {
      GetActionLogFacetResponse result = apiInstance.getActionLogFacet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#getActionLogFacet");
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

**GetActionLogFacetResponse**

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

<a name="getDetectedEventEvent"></a>
# **getDetectedEventEvent**
> GetDetectedEventEventResponse getDetectedEventEvent(id)

One detected event with every report of it (first + corroborations, with correlation and contradiction), the guards that held actions back, the plan and each executed action&#39;s outcome and reversibility.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ActivityApi apiInstance = new ActivityApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      GetDetectedEventEventResponse result = apiInstance.getDetectedEventEvent(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#getDetectedEventEvent");
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

**GetDetectedEventEventResponse**

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

<a name="getEventPolicy"></a>
# **getEventPolicy**
> GetEventPolicyResponse getEventPolicy(platform, appId)

What Crossly does with each detected marketplace event (sale, listing ended, offer, cancellation, label, shipped, delivered, refund, return, payout, message), per who owns the item (crossly, imported, app_managed, other_tool, untracked). Each matrix cell lists the allowed actions and the effective one, with the scope it comes from (app &gt; platform &gt; global &gt; default). Pass platform (or appId) to see the matrix as that platform&#39;s (or app&#39;s) items see it. Also returns the rules, platforms and connected apps.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ActivityApi apiInstance = new ActivityApi(defaultClient);
    String platform = "platform_example"; // String | 
    UUID appId = UUID.randomUUID(); // UUID | 
    try {
      GetEventPolicyResponse result = apiInstance.getEventPolicy(platform, appId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#getEventPolicy");
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
 **platform** | **String**|  | [optional]
 **appId** | **UUID**|  | [optional]

### Return type

**GetEventPolicyResponse**

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

<a name="listActionLog"></a>
# **listActionLog**
> ListActionLogResponse listActionLog(platform, action, category, area, status, source, targetType, targetId, actorUserId, q, since, until, at, cursor, limit, offset)

List Activity Log events, newest first. Each event carries &#x60;view&#x60; (title, sentence, fields, failure advice, who did it) and typed &#x60;detail&#x60;. Page with &#x60;cursor&#x60;; &#x60;pagination.total&#x60; counts matches.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ActivityApi apiInstance = new ActivityApi(defaultClient);
    String platform = "platform_example"; // String | Platform id (`ebay`, `poshmark`, ...).
    String action = "action_example"; // String | A canonical action key (`listing.delist`, see the public action catalog) or a legacy action word.
    String category = "category_example"; // String | 
    String area = "listings"; // String | A seller area: every action of that area (the grouped filter of the dashboard).
    String status = "pending"; // String | 
    String source = "source_example"; // String | 
    String targetType = "targetType_example"; // String | With targetId: events about that object (any of their targets).
    String targetId = "targetId_example"; // String | 
    String actorUserId = "actorUserId_example"; // String | Only what one team member did.
    String q = "q_example"; // String | A search in the activity query language (`action:listing.* -outcome:failure \"free text\"`), ANDed with the other filters. POST /api/v1/action-log/search/translate turns a question in words into one.
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Inclusive lower bound on when the action happened.
    OffsetDateTime until = OffsetDateTime.now(); // OffsetDateTime | Exclusive upper bound.
    OffsetDateTime at = OffsetDateTime.now(); // OffsetDateTime | Jump to a time: the page starts at the newest event at or before it.
    String cursor = "cursor_example"; // String | `pagination.nextCursor` of the previous page.
    Integer limit = 50; // Integer | 
    Integer offset = 56; // Integer | Deprecated: use cursor. offset + limit may reach at most 1000 events.
    try {
      ListActionLogResponse result = apiInstance.listActionLog(platform, action, category, area, status, source, targetType, targetId, actorUserId, q, since, until, at, cursor, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#listActionLog");
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
 **platform** | **String**| Platform id (&#x60;ebay&#x60;, &#x60;poshmark&#x60;, ...). | [optional]
 **action** | **String**| A canonical action key (&#x60;listing.delist&#x60;, see the public action catalog) or a legacy action word. | [optional]
 **category** | **String**|  | [optional]
 **area** | **String**| A seller area: every action of that area (the grouped filter of the dashboard). | [optional] [enum: listings, inventory, orders, shipping, messages, automations, connections, settings, billing, account, emails]
 **status** | **String**|  | [optional] [enum: pending, success, failure, partial, skipped]
 **source** | **String**|  | [optional]
 **targetType** | **String**| With targetId: events about that object (any of their targets). | [optional]
 **targetId** | **String**|  | [optional]
 **actorUserId** | **String**| Only what one team member did. | [optional]
 **q** | **String**| A search in the activity query language (&#x60;action:listing.* -outcome:failure \&quot;free text\&quot;&#x60;), ANDed with the other filters. POST /api/v1/action-log/search/translate turns a question in words into one. | [optional]
 **since** | **OffsetDateTime**| Inclusive lower bound on when the action happened. | [optional]
 **until** | **OffsetDateTime**| Exclusive upper bound. | [optional]
 **at** | **OffsetDateTime**| Jump to a time: the page starts at the newest event at or before it. | [optional]
 **cursor** | **String**| &#x60;pagination.nextCursor&#x60; of the previous page. | [optional]
 **limit** | **Integer**|  | [optional] [default to 50]
 **offset** | **Integer**| Deprecated: use cursor. offset + limit may reach at most 1000 events. | [optional]

### Return type

**ListActionLogResponse**

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

<a name="listActionLogCalls"></a>
# **listActionLogCalls**
> ListActionLogCallsResponse listActionLogCalls(id)

The outbound platform HTTP calls under an event (oldest first) — platform, operation, method, host, status, latency, error class/message, proxy + recipe id. Answers \&quot;what was sent / what went wrong\&quot;. The URL path, request/response bodies and persisted-query hash are never returned.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ActivityApi apiInstance = new ActivityApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      ListActionLogCallsResponse result = apiInstance.listActionLogCalls(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#listActionLogCalls");
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

**ListActionLogCallsResponse**

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

<a name="listActionLogHistogram"></a>
# **listActionLogHistogram**
> ListActionLogHistogramResponse listActionLogHistogram(platform, action, category, area, status, source, targetType, targetId, actorUserId, q, since, until)

Events per UTC day for the list filters (default: the last 30 days; at most 366).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ActivityApi apiInstance = new ActivityApi(defaultClient);
    String platform = "platform_example"; // String | Platform id (`ebay`, `poshmark`, ...).
    String action = "action_example"; // String | A canonical action key (`listing.delist`, see the public action catalog) or a legacy action word.
    String category = "category_example"; // String | 
    String area = "listings"; // String | A seller area: every action of that area (the grouped filter of the dashboard).
    String status = "pending"; // String | 
    String source = "source_example"; // String | 
    String targetType = "targetType_example"; // String | With targetId: events about that object (any of their targets).
    String targetId = "targetId_example"; // String | 
    String actorUserId = "actorUserId_example"; // String | Only what one team member did.
    String q = "q_example"; // String | A search in the activity query language (`action:listing.* -outcome:failure \"free text\"`), ANDed with the other filters. POST /api/v1/action-log/search/translate turns a question in words into one.
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Inclusive lower bound on when the action happened.
    OffsetDateTime until = OffsetDateTime.now(); // OffsetDateTime | Exclusive upper bound.
    try {
      ListActionLogHistogramResponse result = apiInstance.listActionLogHistogram(platform, action, category, area, status, source, targetType, targetId, actorUserId, q, since, until);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#listActionLogHistogram");
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
 **platform** | **String**| Platform id (&#x60;ebay&#x60;, &#x60;poshmark&#x60;, ...). | [optional]
 **action** | **String**| A canonical action key (&#x60;listing.delist&#x60;, see the public action catalog) or a legacy action word. | [optional]
 **category** | **String**|  | [optional]
 **area** | **String**| A seller area: every action of that area (the grouped filter of the dashboard). | [optional] [enum: listings, inventory, orders, shipping, messages, automations, connections, settings, billing, account, emails]
 **status** | **String**|  | [optional] [enum: pending, success, failure, partial, skipped]
 **source** | **String**|  | [optional]
 **targetType** | **String**| With targetId: events about that object (any of their targets). | [optional]
 **targetId** | **String**|  | [optional]
 **actorUserId** | **String**| Only what one team member did. | [optional]
 **q** | **String**| A search in the activity query language (&#x60;action:listing.* -outcome:failure \&quot;free text\&quot;&#x60;), ANDed with the other filters. POST /api/v1/action-log/search/translate turns a question in words into one. | [optional]
 **since** | **OffsetDateTime**| Inclusive lower bound on when the action happened. | [optional]
 **until** | **OffsetDateTime**| Exclusive upper bound. | [optional]

### Return type

**ListActionLogHistogramResponse**

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

<a name="listDetectedEventEvents"></a>
# **listDetectedEventEvents**
> ListDetectedEventEventsResponse listDetectedEventEvents(kinds, platforms, accounts, statuses, since, cursor, limit)

Every event Crossly detected (sales, order changes, listing changes, offers, messages, account notices), newest first: all its axes, the rule that decided it, its corroborating reports, the plan per target and how each action went, with canConfirm (an open ask) and canUndo. Cursor-paged; filter by kinds, platforms statuses and accounts (comma-separated) and since (ISO time).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ActivityApi apiInstance = new ActivityApi(defaultClient);
    String kinds = "kinds_example"; // String | 
    String platforms = "platforms_example"; // String | 
    String accounts = "accounts_example"; // String | Comma-separated platform account ids (scope.account).
    String statuses = "statuses_example"; // String | Comma-separated: acted, held, asked, confirmed, ignored, undone, failed, received, corrected
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | 
    String cursor = "cursor_example"; // String | 
    Integer limit = 56; // Integer | 
    try {
      ListDetectedEventEventsResponse result = apiInstance.listDetectedEventEvents(kinds, platforms, accounts, statuses, since, cursor, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#listDetectedEventEvents");
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
 **kinds** | **String**|  | [optional]
 **platforms** | **String**|  | [optional]
 **accounts** | **String**| Comma-separated platform account ids (scope.account). | [optional]
 **statuses** | **String**| Comma-separated: acted, held, asked, confirmed, ignored, undone, failed, received, corrected | [optional]
 **since** | **OffsetDateTime**|  | [optional]
 **cursor** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]

### Return type

**ListDetectedEventEventsResponse**

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

<a name="listDetectedEventRules"></a>
# **listDetectedEventRules**
> ListDetectedEventRulesResponse listDetectedEventRules()

The seller&#39;s detection rules, top-down in the order they are evaluated (first match wins unless a rule says continue): the seller&#39;s own rules, translations of their event-policy rules (source legacy), then the shipped default set (source default, ids default:&lt;key&gt;; a stored edit of a default replaces it). Each rule has a filter (event kinds, platforms, accounts, apps, tags, items), an optional condition over any event axis, the actions it runs (then / else) and its guard loosenings.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ActivityApi apiInstance = new ActivityApi(defaultClient);
    try {
      ListDetectedEventRulesResponse result = apiInstance.listDetectedEventRules();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#listDetectedEventRules");
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

**ListDetectedEventRulesResponse**

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

<a name="listEmailEvents"></a>
# **listEmailEvents**
> ListEmailEventsResponse listEmailEvents(status)

List email-detected events waiting for the seller (status&#x3D;needs_review): a possible sale, ended listing, cancellation or other event an email reported that was not certain enough to act on automatically.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ActivityApi apiInstance = new ActivityApi(defaultClient);
    String status = "needs_review"; // String | 
    try {
      ListEmailEventsResponse result = apiInstance.listEmailEvents(status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#listEmailEvents");
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
 **status** | **String**|  | [optional] [default to needs_review] [enum: needs_review]

### Return type

**ListEmailEventsResponse**

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

<a name="listEventPolicyDecisions"></a>
# **listEventPolicyDecisions**
> ListEventPolicyDecisionsResponse listEventPolicyDecisions(cursor, limit, event, ownership, platform, outcome)

The decision log, newest first: for each detected event, what the rule or default asked for, what was done (after capability fallback and the email confidence ceiling), the rule that decided it, and the outcome (done / skipped / failed / review). Cursor-paged; filter by event, ownership, platform or outcome (outcome&#x3D;review: still waiting for the seller). Kept 90 days.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ActivityApi apiInstance = new ActivityApi(defaultClient);
    String cursor = "cursor_example"; // String | 
    Integer limit = 56; // Integer | 
    String event = "sale"; // String | 
    String ownership = "crossly"; // String | 
    String platform = "platform_example"; // String | 
    String outcome = "done"; // String | 
    try {
      ListEventPolicyDecisionsResponse result = apiInstance.listEventPolicyDecisions(cursor, limit, event, ownership, platform, outcome);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#listEventPolicyDecisions");
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
 **cursor** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **event** | **String**|  | [optional] [enum: sale, listing_ended, offer, order_cancelled, label_ready, shipped, delivered, refunded, return_opened, payout_sent, message]
 **ownership** | **String**|  | [optional] [enum: crossly, imported, app_managed, other_tool, untracked]
 **platform** | **String**|  | [optional]
 **outcome** | **String**|  | [optional] [enum: done, skipped, failed, review]

### Return type

**ListEventPolicyDecisionsResponse**

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

<a name="updateDetectedEventRule"></a>
# **updateDetectedEventRule**
> CreateDetectedEventRuleResponse updateDetectedEventRule(id, createDetectedEventRuleRequest)

Replace a detection rule. An id default:&lt;key&gt; stores your edit of that shipped default (delete it, or reset-defaults, to go back to the shipped one).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ActivityApi apiInstance = new ActivityApi(defaultClient);
    String id = "id_example"; // String | 
    CreateDetectedEventRuleRequest createDetectedEventRuleRequest = new CreateDetectedEventRuleRequest(); // CreateDetectedEventRuleRequest | 
    try {
      CreateDetectedEventRuleResponse result = apiInstance.updateDetectedEventRule(id, createDetectedEventRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#updateDetectedEventRule");
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
 **createDetectedEventRuleRequest** | **CreateDetectedEventRuleRequest**|  |

### Return type

**CreateDetectedEventRuleResponse**

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

<a name="updateEventPolicyRule"></a>
# **updateEventPolicyRule**
> UpdateEventPolicyRuleResponse updateEventPolicyRule(updateEventPolicyRuleRequest)

Set what Crossly does with one kind of detected event for one kind of item: scope global (scopeValue null), platform (scopeValue &#x3D; platform id) or app (scopeValue &#x3D; OAuth app id, app_managed items only). Replaces the rule for the same cell and scope. The action must be one the matrix allows for that cell; import actions exist only for untracked items.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.ActivityApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    ActivityApi apiInstance = new ActivityApi(defaultClient);
    UpdateEventPolicyRuleRequest updateEventPolicyRuleRequest = new UpdateEventPolicyRuleRequest(); // UpdateEventPolicyRuleRequest | 
    try {
      UpdateEventPolicyRuleResponse result = apiInstance.updateEventPolicyRule(updateEventPolicyRuleRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActivityApi#updateEventPolicyRule");
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
 **updateEventPolicyRuleRequest** | **UpdateEventPolicyRuleRequest**|  |

### Return type

**UpdateEventPolicyRuleResponse**

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

