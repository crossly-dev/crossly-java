

# V1List

The canonical collection envelope. The array is ALWAYS under `data`, never under the noun — so one accessor works for every list endpoint.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | **List&lt;Object&gt;** | The rows. | 
**pagination** | [**Pagination**](Pagination.md) |  |  [optional]
**meta** | **Map&lt;String, Object&gt;** | Endpoint-specific extras that are NOT pagination — e.g. &#x60;pendingCents&#x60;, &#x60;basis&#x60;. Omitted when empty. |  [optional]



