

# GetConnectionHealthResponseAccounts


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**platformName** | **String** |  | 
**accountId** | **String** |  |  [optional]
**accountSlot** | **BigDecimal** |  |  [optional]
**label** | **String** |  |  [optional]
**platformUsername** | **String** |  |  [optional]
**summary** | **String** | Plain-English \&quot;what is true\&quot; + \&quot;what to do\&quot;. Never empty. | 
**action** | **String** |  | 
**liveness** | [**GetConnectionHealthResponseLiveness**](GetConnectionHealthResponseLiveness.md) |  | 
**browser** | [**GetConnectionHealthResponseBrowser**](GetConnectionHealthResponseBrowser.md) |  |  [optional]
**platform** | **String** |  | 
**state** | [**StateEnum**](#StateEnum) |  | 
**severity** | [**SeverityEnum**](#SeverityEnum) |  | 
**audience** | [**AudienceEnum**](#AudienceEnum) |  | 
**anchors** | [**GetConnectionHealthResponseAnchors**](GetConnectionHealthResponseAnchors.md) |  |  [optional]
**notes** | **List&lt;String&gt;** | Secondary observations that do not change the verdict but change the debugging. Always safe to show; never the only thing shown. | 



## Enum: StateEnum

Name | Value
---- | -----
UNKNOWN | &quot;unknown&quot;
UNMONITORED | &quot;unmonitored&quot;
DISCONNECTED | &quot;disconnected&quot;
HEALTHY | &quot;healthy&quot;
STALE | &quot;stale&quot;
PARTIAL_BLANK | &quot;partial_blank&quot;
BLANK_CREDENTIAL | &quot;blank_credential&quot;
SIGNED_OUT | &quot;signed_out&quot;
ANCHOR_DRIFT | &quot;anchor_drift&quot;
NO_COOKIES | &quot;no_cookies&quot;



## Enum: SeverityEnum

Name | Value
---- | -----
ERROR | &quot;error&quot;
OK | &quot;ok&quot;
UNKNOWN | &quot;unknown&quot;
INFO | &quot;info&quot;
WARN | &quot;warn&quot;



## Enum: AudienceEnum

Name | Value
---- | -----
SELLER | &quot;seller&quot;
CROSSLY | &quot;crossly&quot;
NOBODY | &quot;nobody&quot;



