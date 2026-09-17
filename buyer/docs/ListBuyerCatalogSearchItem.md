

# ListBuyerCatalogSearchItem


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**slug** | **String** |  | 
**title** | **String** |  | 
**priceCents** | **BigDecimal** |  | 
**compareAtCents** | **BigDecimal** | MSRP above the ask, or null. Never fabricated from a stale value. |  [optional]
**currency** | **String** |  | 
**condition** | **String** |  |  [optional]
**brand** | **String** |  |  [optional]
**categoryMain** | **String** |  |  [optional]
**categorySub** | **String** |  |  [optional]
**thumbnail** | **String** |  |  [optional]
**images** | **List&lt;String&gt;** |  | 
**sellerUsername** | **String** |  |  [optional]
**sellerDisplayName** | **String** |  |  [optional]
**quantityAvailable** | **BigDecimal** | Units a buyer can actually take right now. Reserved units are excluded. | 
**listedAt** | **String** |  |  [optional]
**url** | **String** | Canonical buyer-facing URL, so a client never has to build one. | 



