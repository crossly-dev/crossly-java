

# GetConnectionHealthResponseAnchors


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expected** | **List&lt;String&gt;** | What we were looking for. Empty ⇒ this platform is unmonitored. | 
**observations** | **List&lt;Object&gt;** |  | 
**present** | **List&lt;String&gt;** | Name found carrying a non-empty value — the only honest \&quot;logged in\&quot;. | 
**empty** | **List&lt;String&gt;** | Name found, value is the empty string. The Whatnot class. | 
**missing** | **List&lt;String&gt;** | Name not in the jar at all. | 
**cookieCount** | **BigDecimal** |  | 
**observedCookieNames** | **List&lt;String&gt;** | Cookie names actually in the jar, truncated. This is the payload that turns \&quot;anchors missing\&quot; into a diagnosis: if the jar holds 30 cookies and none are ours, a rename is the likely story; if it holds three device cookies, the browser is signed out. NAMES ONLY — never values. | 



