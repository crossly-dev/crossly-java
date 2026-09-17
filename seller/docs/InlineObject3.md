

# InlineObject3


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Which site this is for, e.g. \&quot;my Squarespace shop\&quot;. | 
**allowedOrigins** | **List&lt;String&gt;** | Origins permitted to use this key, e.g. [\&quot;https://shop.example.com\&quot;]. LEAVE EMPTY to allow any origin — necessary when embedding on a platform whose domain you do not control, and the reason this is not locked by default. |  [optional]
**environment** | [**EnvironmentEnum**](#EnvironmentEnum) |  |  [optional]



## Enum: EnvironmentEnum

Name | Value
---- | -----
LIVE | &quot;live&quot;
TEST | &quot;test&quot;



