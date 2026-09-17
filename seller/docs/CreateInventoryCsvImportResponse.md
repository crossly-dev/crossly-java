

# CreateInventoryCsvImportResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**problems** | [**List&lt;CreateInventoryCsvImportResponseProblems&gt;**](CreateInventoryCsvImportResponseProblems.md) |  | 
**problemCount** | **BigDecimal** |  | 
**maxRows** | **BigDecimal** |  | 
**created** | **BigDecimal** |  | 
**updated** | **BigDecimal** |  | 
**usable** | **BigDecimal** | Rows that mapped cleanly. &#x60;created + updated&#x60; when not a dry run. | 
**totalRows** | **BigDecimal** |  | 
**listingsCreated** | **BigDecimal** |  | 
**dryRun** | **Boolean** | True when nothing was written — a preview pass. | 



