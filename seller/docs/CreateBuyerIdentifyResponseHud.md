

# CreateBuyerIdentifyResponseHud


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**headline** | **String** |  | 
**subline** | **String** |  |  [optional]
**facts** | [**List&lt;CreateBuyerIdentifyResponseHudFacts&gt;**](CreateBuyerIdentifyResponseHudFacts.md) |  | 
**action** | [**CreateBuyerIdentifyResponseHudAction**](CreateBuyerIdentifyResponseHudAction.md) |  | 
**tone** | [**ToneEnum**](#ToneEnum) | &#x60;win&#x60; earned a saving, &#x60;info&#x60; found something, &#x60;none&#x60; found nothing. | 
**imageUrl** | **String** | Image for the lens card, when there is a match worth showing. |  [optional]



## Enum: ToneEnum

Name | Value
---- | -----
NONE | &quot;none&quot;
INFO | &quot;info&quot;
WIN | &quot;win&quot;



