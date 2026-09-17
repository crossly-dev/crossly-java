

# GetSpatialPublicResponseProfile


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categorySlug** | **String** | Matches &#x60;crossly_market_categories.slug&#x60;, or &#39;*&#39; for the fallback. | 
**label** | **String** | Room title, shown in the switcher. | 
**tagline** | **String** | One line of why this space is shaped the way it is. Surfaced in the UI. | 
**presentation** | [**PresentationEnum**](#PresentationEnum) |  | 
**itemModelVariants** | [**List&lt;ItemModelVariantsEnum&gt;**](#List&lt;ItemModelVariantsEnum&gt;) | Other meshes items in this category may be drawn as, chosen PER ITEM.    One model per category is right for a card room, where every object is the  same object. It is wrong for a wardrobe: a rail holds tees and jeans and  jackets, and drawing all of them as a tee would be a worse lie than the  flat quad it replaced, because a wrong SHAPE reads as information.    The renderer picks from &#x60;[itemModel, ...itemModelVariants]&#x60; using the  item&#39;s title — the same heuristic &#x60;silhouetteFor&#x60; already uses to choose a  garment outline, and for the same reason: the title is the only signal  present on every item, and a wrong guess costs a slightly odd shape rather  than the wrong item. &#x60;itemModel&#x60; is the fallback when nothing matches.    Deliberately NOT fuzzy-matched against a catalog — this picks a SHAPE, not  an identity. See docs/IDENTIFIER-FIRST.md for where that line sits. |  [optional]
**itemSize** | [**GetSpatialPublicResponseProfileItemSize**](GetSpatialPublicResponseProfileItemSize.md) |  | 
**containers** | [**List&lt;GetSpatialPublicResponseProfileContainers&gt;**](GetSpatialPublicResponseProfileContainers.md) | The container ladder, OUTERMOST FIRST. A binder holds pages, a page holds  cards. The solver walks this to decide what to create next when the  current container fills up. | 
**defaultGroupBy** | [**List&lt;DefaultGroupByEnum&gt;**](#List&lt;DefaultGroupByEnum&gt;) | Default grouping, in order. Each level becomes a divider or a container. | 
**defaultSortBy** | [**List&lt;DefaultSortByEnum&gt;**](#List&lt;DefaultSortByEnum&gt;) | Default ordering inside a group. | 
**gradedVariant** | **String** | A SEPARATE profile for graded/sealed copies of the same category.    This is not a flourish. Nobody puts a slabbed card in a binder — it does  not fit and it would be vandalism. Graded cards go on a wall, raw cards go  in pockets, and a space that ignores that is immediately wrong to the only  people who would use it. Same for CGC comics. |  [optional]



## Enum: PresentationEnum

Name | Value
---- | -----
FLAT | &quot;flat&quot;
SLABBED | &quot;slabbed&quot;
BOXED | &quot;boxed&quot;
CASED | &quot;cased&quot;
SPINED | &quot;spined&quot;
HANGING | &quot;hanging&quot;
STANDING | &quot;standing&quot;



## Enum: List&lt;ItemModelVariantsEnum&gt;

Name | Value
---- | -----
CARD | &quot;item-card&quot;
CARD_SLAB | &quot;item-card-slab&quot;
COMIC | &quot;item-comic&quot;
COMIC_SLAB | &quot;item-comic-slab&quot;
VINYL | &quot;item-vinyl&quot;
VINYL_DISC | &quot;item-vinyl-disc&quot;
FUNKO_BOX | &quot;item-funko-box&quot;
LEGO_BOX | &quot;item-lego-box&quot;
MINIFIG | &quot;item-minifig&quot;
GAME_CASE | &quot;item-game-case&quot;
BOOK | &quot;item-book&quot;
SNEAKER | &quot;item-sneaker&quot;
BOOT | &quot;item-boot&quot;
HANDBAG | &quot;item-handbag&quot;
WATCH | &quot;item-watch&quot;
PHONE | &quot;item-phone&quot;
LAPTOP | &quot;item-laptop&quot;
TEE | &quot;item-tee&quot;
HOODIE | &quot;item-hoodie&quot;
JACKET | &quot;item-jacket&quot;
JEANS | &quot;item-jeans&quot;
DRESS | &quot;item-dress&quot;
SKIRT | &quot;item-skirt&quot;



## Enum: List&lt;DefaultGroupByEnum&gt;

Name | Value
---- | -----
BRAND | &quot;brand&quot;
CONDITION | &quot;condition&quot;
SIZE | &quot;size&quot;
STATUS | &quot;status&quot;
LABEL | &quot;label&quot;
TITLE | &quot;title&quot;
VALUE | &quot;value&quot;
YEAR | &quot;year&quot;
GRADE | &quot;grade&quot;
SET | &quot;set&quot;
FRANCHISE | &quot;franchise&quot;
GAME | &quot;game&quot;
TEAM | &quot;team&quot;
ERA | &quot;era&quot;
GENRE | &quot;genre&quot;
COLOUR | &quot;colour&quot;
AGE | &quot;age&quot;



## Enum: List&lt;DefaultSortByEnum&gt;

Name | Value
---- | -----
BRAND | &quot;brand&quot;
CONDITION | &quot;condition&quot;
SIZE | &quot;size&quot;
STATUS | &quot;status&quot;
LABEL | &quot;label&quot;
TITLE | &quot;title&quot;
VALUE | &quot;value&quot;
YEAR | &quot;year&quot;
GRADE | &quot;grade&quot;
SET | &quot;set&quot;
FRANCHISE | &quot;franchise&quot;
GAME | &quot;game&quot;
TEAM | &quot;team&quot;
ERA | &quot;era&quot;
GENRE | &quot;genre&quot;
COLOUR | &quot;colour&quot;
AGE | &quot;age&quot;



