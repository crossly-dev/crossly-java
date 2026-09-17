

# CreateBuyerCartQuoteResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kind** | **String** |  | 
**taxCents** | **BigDecimal** |  | 
**shippingCents** | **BigDecimal** |  | 
**totalCents** | **BigDecimal** |  | 
**currency** | **String** |  | 
**itemsTotalCents** | **BigDecimal** |  | 
**pickupCartItemIds** | **List&lt;String&gt;** | Lines being collected in person, so a summary can name what ships free. | 
**taxComplete** | **Boolean** | False means there is no saved delivery address, so &#x60;taxCents&#x60; is a floor rather than a final figure — not that tax is zero. | 



