

# ListActionLogItem


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | 
**createdAt** | **OffsetDateTime** |  | 
**userId** | **String** |  |  [optional]
**status** | **String** |  | 
**source** | **String** |  | 
**platform** | **String** |  |  [optional]
**action** | **String** |  | 
**latencyMs** | **BigDecimal** |  |  [optional]
**errorClass** | **String** |  |  [optional]
**errorMessage** | **String** |  |  [optional]
**ipAddress** | **String** |  |  [optional]
**userAgent** | **String** |  |  [optional]
**oauthAppId** | **String** |  |  [optional]
**category** | **String** |  | 
**actorUserId** | **String** |  |  [optional]
**finishedAt** | **OffsetDateTime** |  |  [optional]
**correlationId** | **String** |  | 
**track** | **String** |  |  [optional]
**targetType** | **String** |  |  [optional]
**targetId** | **String** |  |  [optional]
**httpStatus** | **BigDecimal** |  |  [optional]
**actorEmail** | **String** | Resolved from actorUserId so the UI can say \&quot;Jane relisted this\&quot; rather than printing a UUID. Null for worker/system actions, which genuinely had no human actor. |  [optional]
**actorDisplayName** | **String** |  |  [optional]



