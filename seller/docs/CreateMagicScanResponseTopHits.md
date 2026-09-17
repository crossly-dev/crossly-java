

# CreateMagicScanResponseTopHits


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**platform** | **String** |  | 
**title** | **String** |  | 
**priceCents** | **BigDecimal** |  | 
**imageUrl** | **String** |  |  [optional]
**listingUrl** | **String** |  |  [optional]
**origin** | **String** | Origin marker for the UI badge. | 
**visualSim** | **BigDecimal** | CLIP cosine [0,1]; populated after the visual-rank pass. |  [optional]
**state** | [**StateEnum**](#StateEnum) | &#39;active&#39; &#x3D; currently for sale; &#39;sold&#39; &#x3D; historical comp. UI  renders distinct badges so the seller can see both at a glance. | 



## Enum: StateEnum

Name | Value
---- | -----
ACTIVE | &quot;active&quot;
SOLD | &quot;sold&quot;



