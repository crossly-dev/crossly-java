

# ListPayoutCompareItem


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**platform** | **String** |  | 
**grossCents** | **BigDecimal** |  | 
**feeCents** | **BigDecimal** |  | 
**feeSource** | [**FeeSourceEnum**](#FeeSourceEnum) |  | 
**shippingCents** | **BigDecimal** |  | 
**shippingSource** | [**ShippingSourceEnum**](#ShippingSourceEnum) |  | 
**netCents** | **BigDecimal** |  | 
**takeHomePct** | **BigDecimal** | Net as a percentage of gross, for comparing across price points. | 
**assumptions** | **List&lt;String&gt;** | What we assumed, in the seller&#39;s words. Never empty when we guessed. | 



## Enum: FeeSourceEnum

Name | Value
---- | -----
EXACT | &quot;exact&quot;
ESTIMATED | &quot;estimated&quot;



## Enum: ShippingSourceEnum

Name | Value
---- | -----
NONE | &quot;none&quot;
UNKNOWN | &quot;unknown&quot;
QUOTED | &quot;quoted&quot;
PLATFORM_LABEL | &quot;platform_label&quot;
BUYER_PAID | &quot;buyer_paid&quot;



