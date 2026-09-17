

# GetSpatialSceneResponseItems


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | 
**unitId** | **String** |  |  [optional]
**title** | **String** |  | 
**imageUrl** | **String** |  |  [optional]
**thumbUrl** | **String** | A small copy of &#x60;imageUrl&#x60;, when the catalog has one.    The room binds this for everything except the few items you are standing  in front of. A 600x600 original costs 1.83 MiB of VRAM; a 150x150 thumb  costs 0.11 MiB, and at more than a couple of metres they are the same  handful of pixels on screen. Null when the catalog never made one, which  the renderer treats as \&quot;use the original\&quot; rather than as \&quot;draw nothing\&quot;. |  [optional]
**size** | [**GetSpatialSceneResponseSize**](GetSpatialSceneResponseSize.md) |  |  [optional]
**costCents** | **BigDecimal** | Cents the seller paid. Drives the &#x60;value&#x60; overlay and capital density. |  [optional]
**ageDays** | **BigDecimal** | Days since first listed anywhere. Drives the &#x60;aging&#x60; overlay. |  [optional]
**status** | **String** |  | 
**location** | **String** | Free-text or structured location, when the unit has one. |  [optional]
**marketTagged** | **Boolean** | True when this row resolved to a catalog product. | 



