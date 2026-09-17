

# GetPlatformLimitResponseEbay


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**platform** | **String** |  | 
**used** | **BigDecimal** |  | 
**limit** | **BigDecimal** |  | 
**remaining** | **BigDecimal** |  | 
**tierConfigured** | **Boolean** | False if the user hasn&#39;t picked a tier (we default to 250 but flag it so the UI can prompt). | 
**respectQuota** | **Boolean** |  | 
**periodStart** | **String** |  | 
**perOverageFeeUsd** | **BigDecimal** | Approximate cost if &#x60;used&#x60; overflows &#x60;limit&#x60; — informational. | 
**sellingCap** | [**GetPlatformLimitResponseEbaySellingCap**](GetPlatformLimitResponseEbaySellingCap.md) |  |  [optional]



