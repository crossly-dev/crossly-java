

# CreateBuyerIdentifyResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tier** | [**TierEnum**](#TierEnum) |  | 
**confidence** | **BigDecimal** |  | 
**identifier** | [**CreateBuyerIdentifyResponseIdentifier**](CreateBuyerIdentifyResponseIdentifier.md) |  |  [optional]
**visionLabel** | **String** |  |  [optional]
**visionQuotaExhausted** | **Boolean** | Surfaced rather than hidden: \&quot;we could not look harder\&quot; and \&quot;we looked and found nothing\&quot; are different answers, and a client that cannot tell them apart shows the wrong message on both. | 
**visualMatches** | [**List&lt;CreateBuyerIdentifyResponseVisualMatches&gt;**](CreateBuyerIdentifyResponseVisualMatches.md) |  | 
**verdict** | [**VerdictEnum**](#VerdictEnum) |  | 
**crossly** | [**GetBuyerAnywhereResponseCrossly**](GetBuyerAnywhereResponseCrossly.md) |  |  [optional]
**offsite** | [**GetBuyerAnywhereResponseOffsite**](GetBuyerAnywhereResponseOffsite.md) |  |  [optional]
**alternates** | [**List&lt;GetBuyerAnywhereResponseAlternates&gt;**](GetBuyerAnywhereResponseAlternates.md) |  | 
**savingCents** | **BigDecimal** |  |  [optional]
**shippingUnknown** | **Boolean** |  | 
**hud** | [**CreateBuyerIdentifyResponseHud**](CreateBuyerIdentifyResponseHud.md) |  | 



## Enum: TierEnum

Name | Value
---- | -----
NONE | &quot;none&quot;
VISUAL | &quot;visual&quot;
IDENTIFIER | &quot;identifier&quot;
VISION | &quot;vision&quot;



## Enum: VerdictEnum

Name | Value
---- | -----
CROSSLY_BEST | &quot;crossly_best&quot;
OFFSITE_CHEAPER | &quot;offsite_cheaper&quot;
OFFSITE_ONLY | &quot;offsite_only&quot;
NO_MATCH | &quot;no_match&quot;



