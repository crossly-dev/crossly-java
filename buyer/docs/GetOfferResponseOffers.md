

# GetOfferResponseOffers


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | 
**status** | **String** |  | 
**amountCents** | **BigDecimal** |  | 
**listedTotalCents** | **BigDecimal** | Asking total when the offer was made — what the buyer responded to. |  [optional]
**isBundle** | **Boolean** |  | 
**items** | **List&lt;Object&gt;** |  | 
**message** | **String** |  |  [optional]
**parentOfferId** | **String** |  |  [optional]
**expiresAt** | **OffsetDateTime** |  | 
**decidedAt** | **OffsetDateTime** |  |  [optional]
**consumedAt** | **OffsetDateTime** | Set once an accepted offer has actually been paid for. |  [optional]
**createdAt** | **OffsetDateTime** |  | 



