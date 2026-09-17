

# UpdateMeTemplateResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  | 
**userId** | **String** |  | 
**scope** | **String** |  | 
**name** | **String** |  | 
**notes** | **String** | Optional short blurb the seller can attach to remember what it&#39;s for. |  [optional]
**description** | **String** | Primary description body. For scope&#x3D;&#39;description&#39; this is the  snippet body; for scope&#x3D;&#39;listing&#39; this is the default description  the seller wants pre-filled. |  [optional]
**descriptionVariants** | **List&lt;String&gt;** | A/B variants for description. Populated for scope&#x3D;&#39;listing&#39;;  typically null for scope&#x3D;&#39;description&#39; (a snippet is one string). |  [optional]
**title** | **String** |  |  [optional]
**titleVariants** | **List&lt;String&gt;** |  |  [optional]
**brand** | **String** |  |  [optional]
**condition** | **String** | Master condition enum — new/like_new/good/fair/poor. |  [optional]
**color** | **String** |  |  [optional]
**material** | **String** |  |  [optional]
**size** | **String** |  |  [optional]
**sizeSystem** | **String** |  |  [optional]
**weightOz** | **BigDecimal** |  |  [optional]
**department** | **String** |  |  [optional]
**gender** | **String** |  |  [optional]
**style** | **String** |  |  [optional]
**pattern** | **String** |  |  [optional]
**itemType** | **String** |  |  [optional]
**tags** | **List&lt;String&gt;** |  |  [optional]
**defaultForCategory** | **String** | When set, form&#39;s category picker prompts \&quot;Use your default for  this category\&quot; on match. |  [optional]
**isDefault** | **Boolean** |  | 
**shareToken** | **String** | URL-safe random token. Populated by POST /me/templates/:id/share;  the /public/templates/:token route surfaces a read-only view any  visitor can browse + import. |  [optional]
**sortOrder** | **BigDecimal** | Snippet ordering — kept for scope&#x3D;&#39;description&#39; back-compat with  the description_templates.sort_order behavior. | 
**createdAt** | **OffsetDateTime** |  | 
**updatedAt** | **OffsetDateTime** |  | 



