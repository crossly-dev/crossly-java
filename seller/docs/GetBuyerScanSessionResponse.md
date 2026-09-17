

# GetBuyerScanSessionResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | 
**device** | **String** |  | 
**label** | **String** |  |  [optional]
**startedAt** | **String** |  | 
**endedAt** | **String** |  |  [optional]
**live** | **Boolean** |  | 
**captureCount** | **BigDecimal** |  | 
**savedCents** | **BigDecimal** | Sum of measured savings. Unmeasured captures contribute 0, not null. | 
**captures** | [**List&lt;GetBuyerScanSessionResponseCaptures&gt;**](GetBuyerScanSessionResponseCaptures.md) |  | 



