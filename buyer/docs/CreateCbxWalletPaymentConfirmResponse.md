

# CreateCbxWalletPaymentConfirmResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentId** | **String** |  | 
**duplicate** | **Boolean** |  | 
**releaseDecision** | [**ReleaseDecisionEnum**](#ReleaseDecisionEnum) |  | 
**releaseReason** | **String** |  | 
**baseUnits** | **String** |  | 
**valueCents** | **BigDecimal** |  | 
**centsPerToken** | **BigDecimal** |  | 
**payerAddress** | **String** |  | 
**riskLevel** | **String** |  |  [optional]
**riskExposures** | **List&lt;String&gt;** |  | 
**screeningProvider** | **String** |  |  [optional]



## Enum: ReleaseDecisionEnum

Name | Value
---- | -----
REVIEW | &quot;review&quot;
RELEASE | &quot;release&quot;
REFUSE | &quot;refuse&quot;



