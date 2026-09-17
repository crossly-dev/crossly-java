

# CreateCbxDisbursementRuleCheckResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**outcome** | [**OutcomeEnum**](#OutcomeEnum) |  | 
**fired** | **Boolean** |  | 
**poolBaseUnits** | **String** |  | 
**thresholdBaseUnits** | **String** |  | 
**distributeBaseUnits** | **String** |  | 
**coverageBps** | **BigDecimal** |  |  [optional]
**campaignId** | **String** |  |  [optional]



## Enum: OutcomeEnum

Name | Value
---- | -----
FIRED | &quot;fired&quot;
BELOW_THRESHOLD | &quot;below_threshold&quot;
CADENCE | &quot;cadence&quot;
COVERAGE | &quot;coverage&quot;
NO_PRICE | &quot;no_price&quot;
NO_RECIPIENTS | &quot;no_recipients&quot;
INACTIVE | &quot;inactive&quot;



