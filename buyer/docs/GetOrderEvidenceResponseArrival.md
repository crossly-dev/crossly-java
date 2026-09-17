

# GetOrderEvidenceResponseArrival


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**state** | [**StateEnum**](#StateEnum) |  | 
**windowHours** | **BigDecimal** |  | 
**requestedAt** | **OffsetDateTime** |  |  [optional]
**closesAt** | **OffsetDateTime** | When the window shuts. Null when nothing was ever asked. |  [optional]
**detail** | **String** |  | 
**photos** | **List&lt;String&gt;** |  | 



## Enum: StateEnum

Name | Value
---- | -----
NOT_REQUESTED | &quot;not_requested&quot;
AWAITING | &quot;awaiting&quot;
SUBMITTED | &quot;submitted&quot;
DECLINED | &quot;declined&quot;
WINDOW_CLOSED | &quot;window_closed&quot;



