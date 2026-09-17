

# GetBuyerAnywhereResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**verdict** | [**VerdictEnum**](#VerdictEnum) |  | 
**savingCents** | **BigDecimal** |  |  [optional]
**shippingUnknown** | **Boolean** |  | 
**crossly** | [**GetBuyerAnywhereResponseCrossly**](GetBuyerAnywhereResponseCrossly.md) |  |  [optional]
**offsite** | [**GetBuyerAnywhereResponseOffsite**](GetBuyerAnywhereResponseOffsite.md) |  |  [optional]
**alternates** | [**List&lt;GetBuyerAnywhereResponseAlternates&gt;**](GetBuyerAnywhereResponseAlternates.md) |  | 



## Enum: VerdictEnum

Name | Value
---- | -----
CROSSLY_BEST | &quot;crossly_best&quot;
OFFSITE_CHEAPER | &quot;offsite_cheaper&quot;
OFFSITE_ONLY | &quot;offsite_only&quot;
NO_MATCH | &quot;no_match&quot;



