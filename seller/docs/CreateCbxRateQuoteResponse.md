

# CreateCbxRateQuoteResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**rateBps** | **BigDecimal** |  | 
**cents** | **BigDecimal** |  | 
**maturationDays** | **BigDecimal** |  | 
**source** | [**SourceEnum**](#SourceEnum) |  | 
**tierSlug** | **String** |  |  [optional]
**boostName** | **String** |  |  [optional]
**stakeBoostBps** | **BigDecimal** |  | 
**clamped** | **Boolean** |  | 



## Enum: SourceEnum

Name | Value
---- | -----
TIER | &quot;tier&quot;
BASE | &quot;base&quot;
BOOST | &quot;boost&quot;



