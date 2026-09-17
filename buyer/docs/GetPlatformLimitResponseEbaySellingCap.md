

# GetPlatformLimitResponseEbaySellingCap

eBay-imposed monthly selling cap (quantity + $$) fetched from Trading API GetMyeBaySelling. These are HARD blocks — past them, `publishOffer` returns an error. Distinct from the free-tier `limit` (which is just a fee threshold). Null when seller has no caps (established accounts) or the Trading call failed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amountLimit** | **BigDecimal** | Monthly $$ ceiling — null when seller has no $$ cap set. |  [optional]
**amountUsed** | **BigDecimal** |  |  [optional]
**quantityLimit** | **BigDecimal** | Monthly item-count ceiling — null when seller has no qty cap. |  [optional]
**quantityUsed** | **BigDecimal** |  |  [optional]
**currency** | **String** |  | 
**fetchedAt** | **String** | ISO timestamp this was fetched (used for cache freshness display). | 



