

# GetCatalogLookupResponseOffers


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**kind** | [**KindEnum**](#KindEnum) |  | 
**priceCents** | **BigDecimal** |  | 
**currency** | **String** |  | 
**condition** | **String** |  |  [optional]
**title** | **String** |  |  [optional]
**imageUrl** | **String** |  |  [optional]
**url** | **String** |  | 
**listingSlug** | **String** | Null on an order-book ask, which is a price rather than a purchasable listing. |  [optional]
**available** | **BigDecimal** |  |  [optional]
**catalog** | [**GetCatalogLookupResponseCatalog**](GetCatalogLookupResponseCatalog.md) |  |  [optional]



## Enum: KindEnum

Name | Value
---- | -----
LISTING | &quot;listing&quot;
ASK | &quot;ask&quot;



