

# ListBuyerMonitorsItem


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Boolean** |  | 
**pausedReason** | **String** |  |  [optional]
**matchCount** | **BigDecimal** |  | 
**lastCheckedAt** | **String** |  |  [optional]
**lastMatchAt** | **String** |  |  [optional]
**createdAt** | **String** |  | 
**webhookSecret** | **String** |  |  [optional]
**id** | **String** |  | 
**name** | **String** |  | 
**kind** | [**KindEnum**](#KindEnum) |  | 
**delivery** | [**DeliveryEnum**](#DeliveryEnum) |  | 
**webhookUrl** | **String** |  |  [optional]



## Enum: KindEnum

Name | Value
---- | -----
NEW_LISTING | &quot;new_listing&quot;
PRICE_DROP | &quot;price_drop&quot;
BACK_IN_STOCK | &quot;back_in_stock&quot;



## Enum: DeliveryEnum

Name | Value
---- | -----
WEBHOOK | &quot;webhook&quot;
POLL | &quot;poll&quot;



