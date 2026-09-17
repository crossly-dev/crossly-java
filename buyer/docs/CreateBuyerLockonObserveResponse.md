

# CreateBuyerLockonObserveResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lockonId** | **String** |  | 
**status** | **String** |  | 
**identifier** | [**CreateBuyerIdentifyResponseIdentifier**](CreateBuyerIdentifyResponseIdentifier.md) |  |  [optional]
**candidates** | [**List&lt;CreateBuyerLockonObserveResponseCandidates&gt;**](CreateBuyerLockonObserveResponseCandidates.md) | Present when we could not settle it alone. Show them; a pinch on one is the cheapest, strongest disambiguation available. | 
**observationCount** | **BigDecimal** |  | 
**visionCalls** | **BigDecimal** |  | 
**visionQuotaExhausted** | **Boolean** |  | 
**verdict** | [**VerdictEnum**](#VerdictEnum) |  | 
**crossly** | [**GetBuyerAnywhereResponseCrossly**](GetBuyerAnywhereResponseCrossly.md) |  |  [optional]
**offsite** | [**GetBuyerAnywhereResponseOffsite**](GetBuyerAnywhereResponseOffsite.md) |  |  [optional]
**alternates** | [**List&lt;GetBuyerAnywhereResponseAlternates&gt;**](GetBuyerAnywhereResponseAlternates.md) |  | 
**savingCents** | **BigDecimal** |  |  [optional]
**shippingUnknown** | **Boolean** |  | 
**hud** | [**CreateBuyerIdentifyResponseHud**](CreateBuyerIdentifyResponseHud.md) |  | 



## Enum: VerdictEnum

Name | Value
---- | -----
CROSSLY_BEST | &quot;crossly_best&quot;
OFFSITE_CHEAPER | &quot;offsite_cheaper&quot;
OFFSITE_ONLY | &quot;offsite_only&quot;
NO_MATCH | &quot;no_match&quot;



