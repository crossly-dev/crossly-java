

# ListSpatialPublicItem


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  | 
**publicSlug** | **String** |  | 
**categorySlug** | **String** |  | 
**itemCount** | **BigDecimal** | Unsold stock that lands in this room. The same predicate the room uses. | 
**forSaleCount** | **BigDecimal** | How many of those a visitor could buy right now. | 
**priceFromCents** | **BigDecimal** | The cheapest and dearest thing for sale, in cents.  A BAND, deliberately, and never a quote: &#x60;listPublicSceneOffers&#x60; is the only authority on what a given object costs. Null when nothing is for sale — zero would read as free. |  [optional]
**priceToCents** | **BigDecimal** |  |  [optional]
**previewImages** | **List&lt;String&gt;** | Up to PREVIEW_IMAGES item images. Catalog art first, seller photo else. | 
**updatedAt** | **String** | Last time the room itself changed. ISO, or null if the row has no date. |  [optional]



