

# GetVariationGroupPublishPlanResponsePlans


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**platform** | **String** |  | 
**mode** | [**ModeEnum**](#ModeEnum) |  | 
**listingsProduced** | **BigDecimal** | How many marketplace listings this produces. One when grouped; one per  option when separate — the number the seller should see before they  commit, not after. | 
**explanation** | **String** | Plain-language, shown in the publish dialog. | 



## Enum: ModeEnum

Name | Value
---- | -----
GROUPED | &quot;grouped&quot;
SEPARATE | &quot;separate&quot;



