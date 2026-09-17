

# ListSourcingDemandMineItem


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifierValue** | **String** |  | 
**lookers** | **BigDecimal** | How many distinct shoppers looked, in the window. | 
**misses** | **BigDecimal** | How many of those looks Crossly could not answer at all. | 
**medianRetailCents** | **BigDecimal** | What the retailers were charging, median of what Scout saw. |  [optional]
**relation** | [**RelationEnum**](#RelationEnum) | &#39;in_stock&#39; — it is in their inventory. &#39;sold_before&#39; — they have sold one. | 
**inventoryItemId** | **String** | Their own row, for the link. |  [optional]
**title** | **String** |  |  [optional]
**lastSoldCents** | **BigDecimal** | What they got for it last time, when they have sold one. |  [optional]
**lastSoldAt** | **OffsetDateTime** |  |  [optional]



## Enum: RelationEnum

Name | Value
---- | -----
IN_STOCK | &quot;in_stock&quot;
SOLD_BEFORE | &quot;sold_before&quot;



