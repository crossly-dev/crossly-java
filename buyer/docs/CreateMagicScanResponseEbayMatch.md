

# CreateMagicScanResponseEbayMatch

Top eBay match (or null when eBay returned zero). Drives the  synthesize step's title/brand/price seed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemId** | **String** |  | 
**legacyItemId** | **String** |  |  [optional]
**title** | **String** |  | 
**brand** | **String** |  |  [optional]
**priceCents** | **BigDecimal** | Normalized cents. eBay returns string + currency on &#x60;price.value&#x60;. |  [optional]
**currency** | **String** |  |  [optional]
**condition** | **String** |  |  [optional]
**categoryId** | **String** | Top-level category eBay assigned to the match (id + path). |  [optional]
**categoryPath** | **String** |  |  [optional]
**itemUrl** | **String** |  | 
**thumbnailUrl** | **String** |  |  [optional]
**aspects** | **Object** | Loosely-typed aspect bag — Brand, Color, Material, etc. when eBay inlines them. Always inspected defensively by the synthesizer. |  [optional]



