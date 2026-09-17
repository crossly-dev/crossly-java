

# CreateBuyerScanResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**verdict** | [**VerdictEnum**](#VerdictEnum) |  | 
**crossly** | [**GetBuyerAnywhereResponseCrossly**](GetBuyerAnywhereResponseCrossly.md) |  |  [optional]
**offsite** | [**GetBuyerAnywhereResponseOffsite**](GetBuyerAnywhereResponseOffsite.md) |  |  [optional]
**alternates** | [**List&lt;GetBuyerAnywhereResponseAlternates&gt;**](GetBuyerAnywhereResponseAlternates.md) |  | 
**savingCents** | **BigDecimal** |  |  [optional]
**shippingUnknown** | **Boolean** |  | 
**matchMethod** | **String** |  | 
**comparable** | **Boolean** |  | 
**confidence** | **BigDecimal** |  | 
**identifier** | [**CreateBuyerScanResponseIdentifier**](CreateBuyerScanResponseIdentifier.md) |  | 
**visualMatches** | **List&lt;Object&gt;** |  | 



## Enum: VerdictEnum

Name | Value
---- | -----
CROSSLY_BEST | &quot;crossly_best&quot;
OFFSITE_CHEAPER | &quot;offsite_cheaper&quot;
OFFSITE_ONLY | &quot;offsite_only&quot;
NO_MATCH | &quot;no_match&quot;



