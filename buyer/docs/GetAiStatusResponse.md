

# GetAiStatusResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hasKey** | **Boolean** |  | 
**aiEnabled** | **Boolean** |  | 
**activeProvider** | [**ActiveProviderEnum**](#ActiveProviderEnum) |  | 
**providers** | **Object** |  | 
**capabilities** | [**GetAiStatusResponseCapabilities**](GetAiStatusResponseCapabilities.md) |  | 
**customConfig** | [**GetAiStatusResponseCustomConfig**](GetAiStatusResponseCustomConfig.md) |  |  [optional]



## Enum: ActiveProviderEnum

Name | Value
---- | -----
CUSTOM | &quot;custom&quot;
OPENAI | &quot;openai&quot;
ANTHROPIC | &quot;anthropic&quot;
GOOGLE | &quot;google&quot;
GROQ | &quot;groq&quot;
OPENROUTER | &quot;openrouter&quot;
XAI | &quot;xai&quot;
TOGETHER | &quot;together&quot;



