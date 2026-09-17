

# GetOrderEvidenceResponseGrade


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**grade** | [**GradeEnum**](#GradeEnum) |  | 
**points** | **BigDecimal** |  | 
**signals** | [**List&lt;GetOrderEvidenceResponseGradeSignals&gt;**](GetOrderEvidenceResponseGradeSignals.md) |  | 
**nextStep** | **String** | The single most valuable thing not yet done, phrased as an action.  One, not a checklist. A seller given six things to fix does none of them; a seller given the one worth the most does that one. |  [optional]



## Enum: GradeEnum

Name | Value
---- | -----
NONE | &quot;none&quot;
STRONG | &quot;strong&quot;
BASIC | &quot;basic&quot;
CONCLUSIVE | &quot;conclusive&quot;



