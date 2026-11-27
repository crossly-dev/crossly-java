# WorkflowsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorkflow**](WorkflowsApi.md#createWorkflow) | **POST** /v1/workflows | Create a workflow: from blank ({ name, graph? }), from a template ({ from: \&quot;template\&quot;, templateId, setup?, activate? }) or from an export document ({ from: \&quot;import\&quot;, document }). New workflows start paused; activate one with POST /v1/workflows/{id}/activate. Returns the workflow and its validation issues.
[**createWorkflowActivate**](WorkflowsApi.md#createWorkflowActivate) | **POST** /v1/workflows/{id}/activate | Activate a workflow: its triggers start firing. A graph with blocking issues is refused (422, details.issues).
[**createWorkflowApprovalDecide**](WorkflowsApi.md#createWorkflowApprovalDecide) | **POST** /v1/workflow-approvals/{id}/decide | Approve or reject a pending flow.approval request: the waiting run resumes down the approved or rejected port. 409 when it was already decided (another device, Telegram, or the timeout).
[**createWorkflowChain**](WorkflowsApi.md#createWorkflowChain) | **POST** /v1/workflow-chains | Create a multi-step workflow chain.
[**createWorkflowChainRunNow**](WorkflowsApi.md#createWorkflowChainRunNow) | **POST** /v1/workflow-chains/{id}/run-now | Enqueue an ad-hoc run of a workflow chain.
[**createWorkflowChainToggle**](WorkflowsApi.md#createWorkflowChainToggle) | **POST** /v1/workflow-chains/{id}/toggle | Flip a workflow chain between active and inactive.
[**createWorkflowDeactivate**](WorkflowsApi.md#createWorkflowDeactivate) | **POST** /v1/workflows/{id}/deactivate | Pause a workflow: its triggers stop firing. Runs already started finish.
[**createWorkflowDuplicate**](WorkflowsApi.md#createWorkflowDuplicate) | **POST** /v1/workflows/{id}/duplicate | Copy a workflow (graph, description, tags) into a new paused workflow.
[**createWorkflowExpressionPreview**](WorkflowsApi.md#createWorkflowExpressionPreview) | **POST** /v1/workflows/expressions/preview | Resolve one param value (\&quot;{{ $json.priceCents * 0.9 }}\&quot;) with the engine&#39;s evaluator against an item, the trigger item, earlier nodes&#39; items or a stored run. A bad expression is an answer (ok&#x3D;false with the message), not an HTTP error. Changes nothing.
[**createWorkflowImport**](WorkflowsApi.md#createWorkflowImport) | **POST** /v1/workflows/import | Import a crossly.workflow export document (or { document, name }) as a new, paused workflow. Integration and workflow references are cleared (they belong to the exporting account) and listed in stripped.
[**createWorkflowRun**](WorkflowsApi.md#createWorkflowRun) | **POST** /v1/workflows/{id}/run | Run a workflow (active or paused) live now, on items you pass or on selected listings / orders / inventory items (one kind per call, up to 1,000). The graph must validate (422 with issues otherwise).
[**createWorkflowRunCancel**](WorkflowsApi.md#createWorkflowRunCancel) | **POST** /v1/workflow-runs/{runId}/cancel | Cancel a queued, running or waiting run. 409 when it already finished.
[**createWorkflowRunOn**](WorkflowsApi.md#createWorkflowRunOn) | **POST** /v1/workflows/run-on | \&quot;Run workflow on…\&quot;: the same as POST /v1/workflows/{id}/run with the workflow named in the body.
[**createWorkflowRunRetry**](WorkflowsApi.md#createWorkflowRunRetry) | **POST** /v1/workflow-runs/{runId}/retry | Retry a failed run from the node that failed: a new run (retryOfRunId) seeded from the failed run&#39;s checkpoint, so nodes that succeeded are not repeated. 409 unless the run failed.
[**createWorkflowSaleEnd**](WorkflowsApi.md#createWorkflowSaleEnd) | **POST** /v1/workflows/sales/{saleEventId}/end | End a sale now. A sale that has not started is cancelled; a live one closes and every discounted price is put back now (reverted &#x3D; how many listings were restored). 404 for a sale that is not yours.
[**createWorkflowTemplateUse**](WorkflowsApi.md#createWorkflowTemplateUse) | **POST** /v1/workflows/templates/{id}/use | Create a workflow from a template, filling its setup fields; activate&#x3D;true activates it when it validates.
[**createWorkflowTest**](WorkflowsApi.md#createWorkflowTest) | **POST** /v1/workflows/{id}/test | Test a workflow (the saved graph, or a draft graph you pass). mode&#x3D;test runs it for real, using pinned data where a node has it; mode&#x3D;dry is a safe test: write, destructive and money nodes report what they would do and change nothing. Trigger items: the ones you pass, else pinned, else the last real ones, else the trigger sample.
[**createWorkflowValidate**](WorkflowsApi.md#createWorkflowValidate) | **POST** /v1/workflows/validate | Validate a graph without saving it: unknown node types, missing required params, bad ports, cycles, expression errors. blocking&#x3D;true means activation would be refused.
[**createWorkflowVersionRestore**](WorkflowsApi.md#createWorkflowVersionRestore) | **POST** /v1/workflows/{id}/versions/{v}/restore | Restore an earlier version&#39;s graph as a new version. Pass version (the current one you read) to refuse the restore when someone saved meanwhile (409). Body optional: { version?: integer }.
[**createWorkflowWebhookRotate**](WorkflowsApi.md#createWorkflowWebhookRotate) | **POST** /v1/workflows/{id}/webhooks/{nodeId}/rotate | Issue a new inbound URL for an on.webhook trigger node (the old one stops working). The URL, and the signing secret when withSecret&#x3D;true, are returned ONCE: store them now.
[**deleteWorkflow**](WorkflowsApi.md#deleteWorkflow) | **DELETE** /v1/workflows/{id} | Delete (archive) a workflow: its triggers stop, open runs are cancelled, run history stays readable.
[**deleteWorkflowChain**](WorkflowsApi.md#deleteWorkflowChain) | **DELETE** /v1/workflow-chains/{id} | Delete a workflow chain (cascades steps + runs).
[**getWorkflow**](WorkflowsApi.md#getWorkflow) | **GET** /v1/workflows/{id} | Get one workflow with its full graph and current version.
[**getWorkflowCatalog**](WorkflowsApi.md#getWorkflowCatalog) | **GET** /v1/workflows/catalog | Everything needed to build a workflow: every node type (params, ports, output fields, risk, platforms capability), which platforms each capability covers and which of those you have connected, the expression helpers and bindings ({{ $json.listingId }}…) and the condition operators. Read this before composing a graph rather than guessing node types or param keys.
[**getWorkflowChain**](WorkflowsApi.md#getWorkflowChain) | **GET** /v1/workflow-chains/{id} | Get one workflow chain with its steps.
[**getWorkflowExport**](WorkflowsApi.md#getWorkflowExport) | **GET** /v1/workflows/{id}/export | Export a workflow as a portable document (format crossly.workflow) that POST /v1/workflows/import accepts. Credentials and account handles are stripped; pinned test data only with pinnedData&#x3D;true.
[**getWorkflowRun**](WorkflowsApi.md#getWorkflowRun) | **GET** /v1/workflow-runs/{runId} | One run: its summary, the graph version it ran, and every node execution (status, item counts per port, timing, errors). Item data per node: GET …/nodes/{nodeId}.
[**getWorkflowRunNode**](WorkflowsApi.md#getWorkflowRunNode) | **GET** /v1/workflow-runs/{runId}/nodes/{nodeId} | Every execution of one node in a run with its input and output items (each port keeps the first 50 items, 16 KB per item; truncated&#x3D;true when cut). Data older than the retention window, or not kept by settings.saveSuccessData&#x3D;false, is pruned: that execution has input/output null and pruned&#x3D;true, and when every execution is pruned the response is { data: null, meta: { pruned: true } } (never an empty list).
[**listWorkflowApprovals**](WorkflowsApi.md#listWorkflowApprovals) | **GET** /v1/workflow-approvals | Approval requests from flow.approval nodes, newest first (pending only unless status says otherwise). Decide one with POST /v1/workflow-approvals/{id}/decide.
[**listWorkflowChains**](WorkflowsApi.md#listWorkflowChains) | **GET** /v1/workflow-chains | List workflow chains with their step graph.
[**listWorkflowRuns**](WorkflowsApi.md#listWorkflowRuns) | **GET** /v1/workflows/{id}/runs | Run history of one workflow, newest first, with per-node status and item counts.
[**listWorkflowRuns2**](WorkflowsApi.md#listWorkflowRuns2) | **GET** /v1/workflow-runs | Runs of every workflow, newest first. Filter by workflow, status, mode and time.
[**listWorkflowSaleActive**](WorkflowsApi.md#listWorkflowSaleActive) | **GET** /v1/workflows/sales/active | Every live or upcoming sale (a sales event started by a sale.start node) with the workflow that runs it: percent off, window, and how many listings it applies to.
[**listWorkflowTemplates**](WorkflowsApi.md#listWorkflowTemplates) | **GET** /v1/workflows/templates | Ready-made workflows (weekend sale, stale-listing markdowns, offer responder, ship-by alerts…), each a complete graph plus the setup fields its \&quot;use\&quot; call asks for.
[**listWorkflowVersions**](WorkflowsApi.md#listWorkflowVersions) | **GET** /v1/workflows/{id}/versions | The saved versions of a workflow, newest first (restore one with POST …/versions/{v}/restore).
[**listWorkflows**](WorkflowsApi.md#listWorkflows) | **GET** /v1/workflows | List workflows, newest change first. A workflow is a graph of nodes: one or more triggers, then actions, lookups and flow nodes (if, switch, wait, approval…). Each row carries its trigger and node types and a 7-day run sparkline, not the graph (GET /v1/workflows/{id} has it).
[**updateWorkflow**](WorkflowsApi.md#updateWorkflow) | **PUT** /v1/workflows/{id} | Save a workflow. Pass the version you edited: a save over a newer version is 409 version_conflict (re-read and merge). Saving an active workflow validates it like activation does (422 with issues).
[**updateWorkflowChain**](WorkflowsApi.md#updateWorkflowChain) | **PUT** /v1/workflow-chains/{id} | Replace a workflow chain wholesale.


<a name="createWorkflow"></a>
# **createWorkflow**
> CreateWorkflowResponse createWorkflow(createWorkflowRequest)

Create a workflow: from blank ({ name, graph? }), from a template ({ from: \&quot;template\&quot;, templateId, setup?, activate? }) or from an export document ({ from: \&quot;import\&quot;, document }). New workflows start paused; activate one with POST /v1/workflows/{id}/activate. Returns the workflow and its validation issues.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    CreateWorkflowRequest createWorkflowRequest = new CreateWorkflowRequest(); // CreateWorkflowRequest | 
    try {
      CreateWorkflowResponse result = apiInstance.createWorkflow(createWorkflowRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#createWorkflow");
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
 **createWorkflowRequest** | **CreateWorkflowRequest**|  |

### Return type

**CreateWorkflowResponse**

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

<a name="createWorkflowActivate"></a>
# **createWorkflowActivate**
> WorkflowResponse createWorkflowActivate(id)

Activate a workflow: its triggers start firing. A graph with blocking issues is refused (422, details.issues).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Workflow id.
    try {
      WorkflowResponse result = apiInstance.createWorkflowActivate(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#createWorkflowActivate");
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
 **id** | **UUID**| Workflow id. |

### Return type

**WorkflowResponse**

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

<a name="createWorkflowApprovalDecide"></a>
# **createWorkflowApprovalDecide**
> CreateWorkflowApprovalDecideResponse createWorkflowApprovalDecide(id, createWorkflowApprovalDecideRequest)

Approve or reject a pending flow.approval request: the waiting run resumes down the approved or rejected port. 409 when it was already decided (another device, Telegram, or the timeout).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Approval id from GET /v1/workflow-approvals.
    CreateWorkflowApprovalDecideRequest createWorkflowApprovalDecideRequest = new CreateWorkflowApprovalDecideRequest(); // CreateWorkflowApprovalDecideRequest | 
    try {
      CreateWorkflowApprovalDecideResponse result = apiInstance.createWorkflowApprovalDecide(id, createWorkflowApprovalDecideRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#createWorkflowApprovalDecide");
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
 **id** | **UUID**| Approval id from GET /v1/workflow-approvals. |
 **createWorkflowApprovalDecideRequest** | **CreateWorkflowApprovalDecideRequest**|  |

### Return type

**CreateWorkflowApprovalDecideResponse**

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

<a name="createWorkflowChain"></a>
# **createWorkflowChain**
> IdResponse createWorkflowChain()

Create a multi-step workflow chain.

Deprecated: workflow chains are workflows now. Use /v1/workflows.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    try {
      IdResponse result = apiInstance.createWorkflowChain();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#createWorkflowChain");
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

**IdResponse**

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

<a name="createWorkflowChainRunNow"></a>
# **createWorkflowChainRunNow**
> CreateWorkflowChainRunNowResponse createWorkflowChainRunNow(id)

Enqueue an ad-hoc run of a workflow chain.

Deprecated: workflow chains are workflows now. Use /v1/workflows.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateWorkflowChainRunNowResponse result = apiInstance.createWorkflowChainRunNow(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#createWorkflowChainRunNow");
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

**CreateWorkflowChainRunNowResponse**

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

<a name="createWorkflowChainToggle"></a>
# **createWorkflowChainToggle**
> CreateWorkflowChainToggleResponse createWorkflowChainToggle(id)

Flip a workflow chain between active and inactive.

Deprecated: workflow chains are workflows now. Use /v1/workflows.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      CreateWorkflowChainToggleResponse result = apiInstance.createWorkflowChainToggle(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#createWorkflowChainToggle");
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

**CreateWorkflowChainToggleResponse**

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

<a name="createWorkflowDeactivate"></a>
# **createWorkflowDeactivate**
> WorkflowResponse createWorkflowDeactivate(id)

Pause a workflow: its triggers stop firing. Runs already started finish.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Workflow id.
    try {
      WorkflowResponse result = apiInstance.createWorkflowDeactivate(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#createWorkflowDeactivate");
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
 **id** | **UUID**| Workflow id. |

### Return type

**WorkflowResponse**

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

<a name="createWorkflowDuplicate"></a>
# **createWorkflowDuplicate**
> CreateWorkflowDuplicateResponse createWorkflowDuplicate(id, createWorkflowDuplicateRequest)

Copy a workflow (graph, description, tags) into a new paused workflow.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Workflow id.
    CreateWorkflowDuplicateRequest createWorkflowDuplicateRequest = new CreateWorkflowDuplicateRequest(); // CreateWorkflowDuplicateRequest | 
    try {
      CreateWorkflowDuplicateResponse result = apiInstance.createWorkflowDuplicate(id, createWorkflowDuplicateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#createWorkflowDuplicate");
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
 **id** | **UUID**| Workflow id. |
 **createWorkflowDuplicateRequest** | **CreateWorkflowDuplicateRequest**|  |

### Return type

**CreateWorkflowDuplicateResponse**

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

<a name="createWorkflowExpressionPreview"></a>
# **createWorkflowExpressionPreview**
> CreateWorkflowExpressionPreviewResponse createWorkflowExpressionPreview(createWorkflowExpressionPreviewRequest)

Resolve one param value (\&quot;{{ $json.priceCents * 0.9 }}\&quot;) with the engine&#39;s evaluator against an item, the trigger item, earlier nodes&#39; items or a stored run. A bad expression is an answer (ok&#x3D;false with the message), not an HTTP error. Changes nothing.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    CreateWorkflowExpressionPreviewRequest createWorkflowExpressionPreviewRequest = new CreateWorkflowExpressionPreviewRequest(); // CreateWorkflowExpressionPreviewRequest | 
    try {
      CreateWorkflowExpressionPreviewResponse result = apiInstance.createWorkflowExpressionPreview(createWorkflowExpressionPreviewRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#createWorkflowExpressionPreview");
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
 **createWorkflowExpressionPreviewRequest** | **CreateWorkflowExpressionPreviewRequest**|  |

### Return type

**CreateWorkflowExpressionPreviewResponse**

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

<a name="createWorkflowImport"></a>
# **createWorkflowImport**
> CreateWorkflowImportResponse createWorkflowImport(requestBody)

Import a crossly.workflow export document (or { document, name }) as a new, paused workflow. Integration and workflow references are cleared (they belong to the exporting account) and listed in stripped.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    Map<String, Object> requestBody = null; // Map<String, Object> | 
    try {
      CreateWorkflowImportResponse result = apiInstance.createWorkflowImport(requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#createWorkflowImport");
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
 **requestBody** | **Map&lt;String, Object&gt;**|  |

### Return type

**CreateWorkflowImportResponse**

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

<a name="createWorkflowRun"></a>
# **createWorkflowRun**
> CreateWorkflowRunResponse createWorkflowRun(id, createWorkflowRunRequest)

Run a workflow (active or paused) live now, on items you pass or on selected listings / orders / inventory items (one kind per call, up to 1,000). The graph must validate (422 with issues otherwise).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Workflow id.
    CreateWorkflowRunRequest createWorkflowRunRequest = new CreateWorkflowRunRequest(); // CreateWorkflowRunRequest | 
    try {
      CreateWorkflowRunResponse result = apiInstance.createWorkflowRun(id, createWorkflowRunRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#createWorkflowRun");
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
 **id** | **UUID**| Workflow id. |
 **createWorkflowRunRequest** | **CreateWorkflowRunRequest**|  |

### Return type

**CreateWorkflowRunResponse**

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

<a name="createWorkflowRunCancel"></a>
# **createWorkflowRunCancel**
> CreateWorkflowRunCancelResponse createWorkflowRunCancel(runId)

Cancel a queued, running or waiting run. 409 when it already finished.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    UUID runId = UUID.randomUUID(); // UUID | Workflow run id.
    try {
      CreateWorkflowRunCancelResponse result = apiInstance.createWorkflowRunCancel(runId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#createWorkflowRunCancel");
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
 **runId** | **UUID**| Workflow run id. |

### Return type

**CreateWorkflowRunCancelResponse**

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

<a name="createWorkflowRunOn"></a>
# **createWorkflowRunOn**
> CreateWorkflowRunOnResponse createWorkflowRunOn(createWorkflowRunOnRequest)

\&quot;Run workflow on…\&quot;: the same as POST /v1/workflows/{id}/run with the workflow named in the body.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    CreateWorkflowRunOnRequest createWorkflowRunOnRequest = new CreateWorkflowRunOnRequest(); // CreateWorkflowRunOnRequest | 
    try {
      CreateWorkflowRunOnResponse result = apiInstance.createWorkflowRunOn(createWorkflowRunOnRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#createWorkflowRunOn");
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
 **createWorkflowRunOnRequest** | **CreateWorkflowRunOnRequest**|  |

### Return type

**CreateWorkflowRunOnResponse**

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

<a name="createWorkflowRunRetry"></a>
# **createWorkflowRunRetry**
> CreateWorkflowRunRetryResponse createWorkflowRunRetry(runId)

Retry a failed run from the node that failed: a new run (retryOfRunId) seeded from the failed run&#39;s checkpoint, so nodes that succeeded are not repeated. 409 unless the run failed.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    UUID runId = UUID.randomUUID(); // UUID | Workflow run id.
    try {
      CreateWorkflowRunRetryResponse result = apiInstance.createWorkflowRunRetry(runId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#createWorkflowRunRetry");
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
 **runId** | **UUID**| Workflow run id. |

### Return type

**CreateWorkflowRunRetryResponse**

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

<a name="createWorkflowSaleEnd"></a>
# **createWorkflowSaleEnd**
> CreateWorkflowSaleEndResponse createWorkflowSaleEnd(saleEventId)

End a sale now. A sale that has not started is cancelled; a live one closes and every discounted price is put back now (reverted &#x3D; how many listings were restored). 404 for a sale that is not yours.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    UUID saleEventId = UUID.randomUUID(); // UUID | Sale id from GET /v1/workflows/sales/active.
    try {
      CreateWorkflowSaleEndResponse result = apiInstance.createWorkflowSaleEnd(saleEventId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#createWorkflowSaleEnd");
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
 **saleEventId** | **UUID**| Sale id from GET /v1/workflows/sales/active. |

### Return type

**CreateWorkflowSaleEndResponse**

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

<a name="createWorkflowTemplateUse"></a>
# **createWorkflowTemplateUse**
> CreateWorkflowResponse createWorkflowTemplateUse(id, createWorkflowTemplateUseRequest)

Create a workflow from a template, filling its setup fields; activate&#x3D;true activates it when it validates.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    String id = "id_example"; // String | Template id from GET /v1/workflows/templates.
    CreateWorkflowTemplateUseRequest createWorkflowTemplateUseRequest = new CreateWorkflowTemplateUseRequest(); // CreateWorkflowTemplateUseRequest | 
    try {
      CreateWorkflowResponse result = apiInstance.createWorkflowTemplateUse(id, createWorkflowTemplateUseRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#createWorkflowTemplateUse");
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
 **id** | **String**| Template id from GET /v1/workflows/templates. |
 **createWorkflowTemplateUseRequest** | **CreateWorkflowTemplateUseRequest**|  |

### Return type

**CreateWorkflowResponse**

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

<a name="createWorkflowTest"></a>
# **createWorkflowTest**
> CreateWorkflowTestResponse createWorkflowTest(id, createWorkflowTestRequest)

Test a workflow (the saved graph, or a draft graph you pass). mode&#x3D;test runs it for real, using pinned data where a node has it; mode&#x3D;dry is a safe test: write, destructive and money nodes report what they would do and change nothing. Trigger items: the ones you pass, else pinned, else the last real ones, else the trigger sample.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Workflow id.
    CreateWorkflowTestRequest createWorkflowTestRequest = new CreateWorkflowTestRequest(); // CreateWorkflowTestRequest | 
    try {
      CreateWorkflowTestResponse result = apiInstance.createWorkflowTest(id, createWorkflowTestRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#createWorkflowTest");
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
 **id** | **UUID**| Workflow id. |
 **createWorkflowTestRequest** | **CreateWorkflowTestRequest**|  |

### Return type

**CreateWorkflowTestResponse**

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

<a name="createWorkflowValidate"></a>
# **createWorkflowValidate**
> CreateWorkflowValidateResponse createWorkflowValidate(createWorkflowValidateRequest)

Validate a graph without saving it: unknown node types, missing required params, bad ports, cycles, expression errors. blocking&#x3D;true means activation would be refused.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    CreateWorkflowValidateRequest createWorkflowValidateRequest = new CreateWorkflowValidateRequest(); // CreateWorkflowValidateRequest | 
    try {
      CreateWorkflowValidateResponse result = apiInstance.createWorkflowValidate(createWorkflowValidateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#createWorkflowValidate");
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
 **createWorkflowValidateRequest** | **CreateWorkflowValidateRequest**|  |

### Return type

**CreateWorkflowValidateResponse**

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

<a name="createWorkflowVersionRestore"></a>
# **createWorkflowVersionRestore**
> WorkflowResponse createWorkflowVersionRestore(id, v)

Restore an earlier version&#39;s graph as a new version. Pass version (the current one you read) to refuse the restore when someone saved meanwhile (409). Body optional: { version?: integer }.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Workflow id.
    Integer v = 56; // Integer | The version number to restore.
    try {
      WorkflowResponse result = apiInstance.createWorkflowVersionRestore(id, v);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#createWorkflowVersionRestore");
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
 **id** | **UUID**| Workflow id. |
 **v** | **Integer**| The version number to restore. |

### Return type

**WorkflowResponse**

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

<a name="createWorkflowWebhookRotate"></a>
# **createWorkflowWebhookRotate**
> CreateWorkflowWebhookRotateResponse createWorkflowWebhookRotate(id, nodeId, createWorkflowWebhookRotateRequest)

Issue a new inbound URL for an on.webhook trigger node (the old one stops working). The URL, and the signing secret when withSecret&#x3D;true, are returned ONCE: store them now.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Workflow id.
    String nodeId = "nodeId_example"; // String | The on.webhook trigger node id.
    CreateWorkflowWebhookRotateRequest createWorkflowWebhookRotateRequest = new CreateWorkflowWebhookRotateRequest(); // CreateWorkflowWebhookRotateRequest | 
    try {
      CreateWorkflowWebhookRotateResponse result = apiInstance.createWorkflowWebhookRotate(id, nodeId, createWorkflowWebhookRotateRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#createWorkflowWebhookRotate");
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
 **id** | **UUID**| Workflow id. |
 **nodeId** | **String**| The on.webhook trigger node id. |
 **createWorkflowWebhookRotateRequest** | **CreateWorkflowWebhookRotateRequest**|  |

### Return type

**CreateWorkflowWebhookRotateResponse**

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

<a name="deleteWorkflow"></a>
# **deleteWorkflow**
> DeleteWorkflowResponse deleteWorkflow(id)

Delete (archive) a workflow: its triggers stop, open runs are cancelled, run history stays readable.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Workflow id.
    try {
      DeleteWorkflowResponse result = apiInstance.deleteWorkflow(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#deleteWorkflow");
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
 **id** | **UUID**| Workflow id. |

### Return type

**DeleteWorkflowResponse**

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

<a name="deleteWorkflowChain"></a>
# **deleteWorkflowChain**
> OkResponse deleteWorkflowChain(id)

Delete a workflow chain (cascades steps + runs).

Deprecated: workflow chains are workflows now. Use /v1/workflows.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      OkResponse result = apiInstance.deleteWorkflowChain(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#deleteWorkflowChain");
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

<a name="getWorkflow"></a>
# **getWorkflow**
> GetWorkflowResponse getWorkflow(id)

Get one workflow with its full graph and current version.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Workflow id.
    try {
      GetWorkflowResponse result = apiInstance.getWorkflow(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#getWorkflow");
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
 **id** | **UUID**| Workflow id. |

### Return type

**GetWorkflowResponse**

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

<a name="getWorkflowCatalog"></a>
# **getWorkflowCatalog**
> GetWorkflowCatalogResponse getWorkflowCatalog()

Everything needed to build a workflow: every node type (params, ports, output fields, risk, platforms capability), which platforms each capability covers and which of those you have connected, the expression helpers and bindings ({{ $json.listingId }}…) and the condition operators. Read this before composing a graph rather than guessing node types or param keys.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    try {
      GetWorkflowCatalogResponse result = apiInstance.getWorkflowCatalog();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#getWorkflowCatalog");
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

**GetWorkflowCatalogResponse**

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

<a name="getWorkflowChain"></a>
# **getWorkflowChain**
> GetWorkflowChainResponse getWorkflowChain(id)

Get one workflow chain with its steps.

Deprecated: workflow chains are workflows now. Use /v1/workflows.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      GetWorkflowChainResponse result = apiInstance.getWorkflowChain(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#getWorkflowChain");
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

**GetWorkflowChainResponse**

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

<a name="getWorkflowExport"></a>
# **getWorkflowExport**
> GetWorkflowExportResponse getWorkflowExport(id, pinnedData)

Export a workflow as a portable document (format crossly.workflow) that POST /v1/workflows/import accepts. Credentials and account handles are stripped; pinned test data only with pinnedData&#x3D;true.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Workflow id.
    String pinnedData = "true"; // String | Keep the nodes' pinned test data.
    try {
      GetWorkflowExportResponse result = apiInstance.getWorkflowExport(id, pinnedData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#getWorkflowExport");
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
 **id** | **UUID**| Workflow id. |
 **pinnedData** | **String**| Keep the nodes&#39; pinned test data. | [optional] [enum: true, false]

### Return type

**GetWorkflowExportResponse**

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

<a name="getWorkflowRun"></a>
# **getWorkflowRun**
> GetWorkflowRunResponse getWorkflowRun(runId)

One run: its summary, the graph version it ran, and every node execution (status, item counts per port, timing, errors). Item data per node: GET …/nodes/{nodeId}.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    UUID runId = UUID.randomUUID(); // UUID | Workflow run id.
    try {
      GetWorkflowRunResponse result = apiInstance.getWorkflowRun(runId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#getWorkflowRun");
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
 **runId** | **UUID**| Workflow run id. |

### Return type

**GetWorkflowRunResponse**

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

<a name="getWorkflowRunNode"></a>
# **getWorkflowRunNode**
> GetWorkflowRunNodeResponse getWorkflowRunNode(runId, nodeId)

Every execution of one node in a run with its input and output items (each port keeps the first 50 items, 16 KB per item; truncated&#x3D;true when cut). Data older than the retention window, or not kept by settings.saveSuccessData&#x3D;false, is pruned: that execution has input/output null and pruned&#x3D;true, and when every execution is pruned the response is { data: null, meta: { pruned: true } } (never an empty list).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    UUID runId = UUID.randomUUID(); // UUID | Workflow run id.
    String nodeId = "nodeId_example"; // String | Node id within the run's graph.
    try {
      GetWorkflowRunNodeResponse result = apiInstance.getWorkflowRunNode(runId, nodeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#getWorkflowRunNode");
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
 **runId** | **UUID**| Workflow run id. |
 **nodeId** | **String**| Node id within the run&#39;s graph. |

### Return type

**GetWorkflowRunNodeResponse**

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

<a name="listWorkflowApprovals"></a>
# **listWorkflowApprovals**
> ListWorkflowApprovalsResponse listWorkflowApprovals(status, workflowId, page, limit)

Approval requests from flow.approval nodes, newest first (pending only unless status says otherwise). Decide one with POST /v1/workflow-approvals/{id}/decide.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    String status = "status_example"; // String | Comma-separated: pending, approved, rejected, expired. Default pending.
    UUID workflowId = UUID.randomUUID(); // UUID | Only approvals of this workflow.
    Integer page = 1; // Integer | 1-indexed page.
    Integer limit = 25; // Integer | Rows per page (1-100).
    try {
      ListWorkflowApprovalsResponse result = apiInstance.listWorkflowApprovals(status, workflowId, page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#listWorkflowApprovals");
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
 **status** | **String**| Comma-separated: pending, approved, rejected, expired. Default pending. | [optional]
 **workflowId** | **UUID**| Only approvals of this workflow. | [optional]
 **page** | **Integer**| 1-indexed page. | [optional] [default to 1]
 **limit** | **Integer**| Rows per page (1-100). | [optional] [default to 25]

### Return type

**ListWorkflowApprovalsResponse**

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

<a name="listWorkflowChains"></a>
# **listWorkflowChains**
> ListWorkflowChainsResponse listWorkflowChains()

List workflow chains with their step graph.

Deprecated: workflow chains are workflows now. Use /v1/workflows.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    try {
      ListWorkflowChainsResponse result = apiInstance.listWorkflowChains();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#listWorkflowChains");
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

**ListWorkflowChainsResponse**

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

<a name="listWorkflowRuns"></a>
# **listWorkflowRuns**
> ListWorkflowRunsResponse listWorkflowRuns(id, status, mode, since, until, page, limit)

Run history of one workflow, newest first, with per-node status and item counts.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Workflow id.
    String status = "status_example"; // String | Comma-separated run statuses: queued, running, waiting, succeeded, failed, cancelled.
    String mode = "live"; // String | live (triggers), test (editor test run) or dry (safe test: no writes).
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Runs queued at or after this time (ISO 8601).
    OffsetDateTime until = OffsetDateTime.now(); // OffsetDateTime | Runs queued at or before this time (ISO 8601).
    Integer page = 1; // Integer | 1-indexed page.
    Integer limit = 25; // Integer | Rows per page (1-100).
    try {
      ListWorkflowRunsResponse result = apiInstance.listWorkflowRuns(id, status, mode, since, until, page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#listWorkflowRuns");
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
 **id** | **UUID**| Workflow id. |
 **status** | **String**| Comma-separated run statuses: queued, running, waiting, succeeded, failed, cancelled. | [optional]
 **mode** | **String**| live (triggers), test (editor test run) or dry (safe test: no writes). | [optional] [enum: live, test, dry]
 **since** | **OffsetDateTime**| Runs queued at or after this time (ISO 8601). | [optional]
 **until** | **OffsetDateTime**| Runs queued at or before this time (ISO 8601). | [optional]
 **page** | **Integer**| 1-indexed page. | [optional] [default to 1]
 **limit** | **Integer**| Rows per page (1-100). | [optional] [default to 25]

### Return type

**ListWorkflowRunsResponse**

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

<a name="listWorkflowRuns2"></a>
# **listWorkflowRuns2**
> ListWorkflowRunsResponse listWorkflowRuns2(workflowId, status, mode, since, until, page, limit)

Runs of every workflow, newest first. Filter by workflow, status, mode and time.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    UUID workflowId = UUID.randomUUID(); // UUID | Only runs of this workflow.
    String status = "status_example"; // String | Comma-separated run statuses: queued, running, waiting, succeeded, failed, cancelled.
    String mode = "live"; // String | live (triggers), test (editor test run) or dry (safe test: no writes).
    OffsetDateTime since = OffsetDateTime.now(); // OffsetDateTime | Runs queued at or after this time (ISO 8601).
    OffsetDateTime until = OffsetDateTime.now(); // OffsetDateTime | Runs queued at or before this time (ISO 8601).
    Integer page = 1; // Integer | 1-indexed page.
    Integer limit = 25; // Integer | Rows per page (1-100).
    try {
      ListWorkflowRunsResponse result = apiInstance.listWorkflowRuns2(workflowId, status, mode, since, until, page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#listWorkflowRuns2");
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
 **workflowId** | **UUID**| Only runs of this workflow. | [optional]
 **status** | **String**| Comma-separated run statuses: queued, running, waiting, succeeded, failed, cancelled. | [optional]
 **mode** | **String**| live (triggers), test (editor test run) or dry (safe test: no writes). | [optional] [enum: live, test, dry]
 **since** | **OffsetDateTime**| Runs queued at or after this time (ISO 8601). | [optional]
 **until** | **OffsetDateTime**| Runs queued at or before this time (ISO 8601). | [optional]
 **page** | **Integer**| 1-indexed page. | [optional] [default to 1]
 **limit** | **Integer**| Rows per page (1-100). | [optional] [default to 25]

### Return type

**ListWorkflowRunsResponse**

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

<a name="listWorkflowSaleActive"></a>
# **listWorkflowSaleActive**
> ListWorkflowSaleActiveResponse listWorkflowSaleActive()

Every live or upcoming sale (a sales event started by a sale.start node) with the workflow that runs it: percent off, window, and how many listings it applies to.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    try {
      ListWorkflowSaleActiveResponse result = apiInstance.listWorkflowSaleActive();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#listWorkflowSaleActive");
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

**ListWorkflowSaleActiveResponse**

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

<a name="listWorkflowTemplates"></a>
# **listWorkflowTemplates**
> ListWorkflowTemplatesResponse listWorkflowTemplates(category, q)

Ready-made workflows (weekend sale, stale-listing markdowns, offer responder, ship-by alerts…), each a complete graph plus the setup fields its \&quot;use\&quot; call asks for.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    String category = "category_example"; // String | Exact template category, e.g. \"Sales & markdowns\".
    String q = "q_example"; // String | Matches name, description, category or tags.
    try {
      ListWorkflowTemplatesResponse result = apiInstance.listWorkflowTemplates(category, q);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#listWorkflowTemplates");
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
 **category** | **String**| Exact template category, e.g. \&quot;Sales &amp; markdowns\&quot;. | [optional]
 **q** | **String**| Matches name, description, category or tags. | [optional]

### Return type

**ListWorkflowTemplatesResponse**

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

<a name="listWorkflowVersions"></a>
# **listWorkflowVersions**
> ListWorkflowVersionsResponse listWorkflowVersions(id)

The saved versions of a workflow, newest first (restore one with POST …/versions/{v}/restore).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Workflow id.
    try {
      ListWorkflowVersionsResponse result = apiInstance.listWorkflowVersions(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#listWorkflowVersions");
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
 **id** | **UUID**| Workflow id. |

### Return type

**ListWorkflowVersionsResponse**

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

<a name="listWorkflows"></a>
# **listWorkflows**
> ListWorkflowsResponse listWorkflows(active, tag, trigger, q, legacyRef)

List workflows, newest change first. A workflow is a graph of nodes: one or more triggers, then actions, lookups and flow nodes (if, switch, wait, approval…). Each row carries its trigger and node types and a 7-day run sparkline, not the graph (GET /v1/workflows/{id} has it).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    String active = "true"; // String | Only active (true) or paused (false) workflows.
    String tag = "tag_example"; // String | Only workflows carrying this tag.
    String trigger = "trigger_example"; // String | Only workflows started by this trigger node type, e.g. on.listing.sold.
    String q = "q_example"; // String | Name contains (case-insensitive).
    String legacyRef = "legacyRef_example"; // String | The workflow an old automation became: rule:<id>, chain:<id> or sale_event:<id>.
    try {
      ListWorkflowsResponse result = apiInstance.listWorkflows(active, tag, trigger, q, legacyRef);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#listWorkflows");
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
 **active** | **String**| Only active (true) or paused (false) workflows. | [optional] [enum: true, false]
 **tag** | **String**| Only workflows carrying this tag. | [optional]
 **trigger** | **String**| Only workflows started by this trigger node type, e.g. on.listing.sold. | [optional]
 **q** | **String**| Name contains (case-insensitive). | [optional]
 **legacyRef** | **String**| The workflow an old automation became: rule:&lt;id&gt;, chain:&lt;id&gt; or sale_event:&lt;id&gt;. | [optional]

### Return type

**ListWorkflowsResponse**

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

<a name="updateWorkflow"></a>
# **updateWorkflow**
> WorkflowResponse updateWorkflow(id, updateWorkflowRequest)

Save a workflow. Pass the version you edited: a save over a newer version is 409 version_conflict (re-read and merge). Saving an active workflow validates it like activation does (422 with issues).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | Workflow id.
    UpdateWorkflowRequest updateWorkflowRequest = new UpdateWorkflowRequest(); // UpdateWorkflowRequest | 
    try {
      WorkflowResponse result = apiInstance.updateWorkflow(id, updateWorkflowRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#updateWorkflow");
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
 **id** | **UUID**| Workflow id. |
 **updateWorkflowRequest** | **UpdateWorkflowRequest**|  |

### Return type

**WorkflowResponse**

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

<a name="updateWorkflowChain"></a>
# **updateWorkflowChain**
> OkResponse updateWorkflowChain(id)

Replace a workflow chain wholesale.

Deprecated: workflow chains are workflows now. Use /v1/workflows.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorkflowsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorkflowsApi apiInstance = new WorkflowsApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      OkResponse result = apiInstance.updateWorkflowChain(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkflowsApi#updateWorkflowChain");
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

