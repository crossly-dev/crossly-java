# WholesaleApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWholesaleBuyerInvite**](WholesaleApi.md#createWholesaleBuyerInvite) | **POST** /v1/wholesale/buyers/invite | Invite a buyer by email to one or more of your catalogs. Binds to their account now if they have one, or when they sign up.
[**createWholesaleBuyerRemove**](WholesaleApi.md#createWholesaleBuyerRemove) | **POST** /v1/wholesale/buyers/remove | Revoke every catalog grant a buyer (or invited email) has with you. Their terms and invoices are kept.
[**createWholesaleCatalog**](WholesaleApi.md#createWholesaleCatalog) | **POST** /v1/wholesale/catalogs | Create a catalog. visibility public | public_prices_private (prices for approved buyers) | private_discoverable (listed, opened on approval) | link (anyone with the URL) | invite (named buyers only; \&quot;private\&quot; is accepted as invite); autoApprove never | verified | all; the cascade terms (minOrderQuantity, casePack, leadTimeDays, verifiedOnly, priceVisibility, maxPerOrder, backorder, restockEta, preset ids) default every item; listed advertises a public catalog in the wholesale directory (never its prices).
[**createWholesaleCatalogItem**](WholesaleApi.md#createWholesaleCatalogItem) | **POST** /v1/wholesale/catalogs/{id}/items | Add your Crossly listings to a catalog (up to 500), each with an optional wholesalePriceCents, minOrderQuantity and casePack. Items already in the catalog have their terms updated.
[**createWholesaleDrop**](WholesaleApi.md#createWholesaleDrop) | **POST** /v1/wholesale/drops | Create a draft trade drop: name, dropAt (ISO; when it opens), audience trade|catalog (+ audienceCatalogId), kind release|prebook. A pre-book needs depositBps (100-9900) and shipBy (YYYY-MM-DD), and takes balanceNetDays (0-90) for the balance invoice. listingIds are your listing ids, each on Crossly. A pre-book makes its listings pre-orders, so buyers pay the deposit at checkout. Schedule it with PATCH status \&quot;scheduled\&quot;.
[**createWholesaleDropRelease**](WholesaleApi.md#createWholesaleDropRelease) | **POST** /v1/wholesale/drops/{id}/release | Release a live pre-book: every reserved balance becomes an invoice on account to its buyer (due in the drop balanceNetDays), emailed, and the drop ends. Safe to retry: only balances not yet invoiced are invoiced. Returns { invoiced, balanceCents, invoiceIds }.
[**createWholesaleFreightRequestAnswer**](WholesaleApi.md#createWholesaleFreightRequestAnswer) | **POST** /v1/wholesale/freight-requests/{id}/answer | Answer an open freight request with a figure in CENTS (and an optional note).
[**createWholesaleGroup**](WholesaleApi.md#createWholesaleGroup) | **POST** /v1/wholesale/groups | Create a customer group with a discount in basis points (up to 9000). A buyer in several groups gets the best rate, never a stacked one.
[**createWholesaleGroupMember**](WholesaleApi.md#createWholesaleGroupMember) | **POST** /v1/wholesale/groups/{id}/members | Add a buyer to a group by account id or by the email of an existing Crossly account.
[**createWholesaleInvoiceCreditNote**](WholesaleApi.md#createWholesaleInvoiceCreditNote) | **POST** /v1/wholesale/invoices/{id}/credit-notes | Issue a credit note on an on-account invoice (short shipment, damaged, pricing error, returned, goodwill, other): at most the balance due. Numbered &lt;invoice&gt;-CN&lt;n&gt;; settling the rest closes the invoice paid. Not a refund.
[**createWholesaleInvoiceLateFee**](WholesaleApi.md#createWholesaleInvoiceLateFee) | **POST** /v1/wholesale/invoices/{id}/late-fee | Add your late fee (invoice settings lateFeeBps) to an invoice by hand, once. The hourly sweep adds it automatically when an invoice goes overdue.
[**createWholesaleInvoiceMarkPaid**](WholesaleApi.md#createWholesaleInvoiceMarkPaid) | **POST** /v1/wholesale/invoices/{id}/mark-paid | Record a payment the buyer made to you directly: method ach | check | wire | card | other, a reference, and amountCents (omit for the whole balance). When the invoice is settled, Crossly&#39;s fee and the tax it remits are charged to your billing card.
[**createWholesaleInvoiceSend**](WholesaleApi.md#createWholesaleInvoiceSend) | **POST** /v1/wholesale/invoices/{id}/send | Email the invoice to the buyer again (an overdue one goes as an overdue notice), with the link to pay it.
[**createWholesaleInvoiceVoid**](WholesaleApi.md#createWholesaleInvoiceVoid) | **POST** /v1/wholesale/invoices/{id}/void | Void an invoice nobody has paid anything on (e.g. the order was cancelled). It stops counting against the buyer&#39;s credit limit.
[**createWholesaleInvoiceWriteOff**](WholesaleApi.md#createWholesaleInvoiceWriteOff) | **POST** /v1/wholesale/invoices/{id}/write-off | Write off what is left on an invoice (bad debt): it closes as written_off and stops counting against the buyer&#39;s credit.
[**createWholesaleProfileShipsFromValidate**](WholesaleApi.md#createWholesaleProfileShipsFromValidate) | **POST** /v1/wholesale/profile/ships-from/validate | Check a ships-from origin ({ postalCode, country, city?, region? }) with the shipping validator without saving it. 400 invalid_ships_from with the issues; 422 for an embargoed origin.
[**createWholesaleQuoteAnswer**](WholesaleApi.md#createWholesaleQuoteAnswer) | **POST** /v1/wholesale/quotes/{id}/answer | Answer (or revise) a quote: a unit price in CENTS per item you quote, an expiresAt (ISO, at most 90 days out) and an optional note. Items left out are not quoted. The buyer is notified and can accept until expiry.
[**createWholesaleQuoteDecline**](WholesaleApi.md#createWholesaleQuoteDecline) | **POST** /v1/wholesale/quotes/{id}/decline | Decline a quote request, with an optional reason the buyer sees.
[**createWholesaleRequestDecide**](WholesaleApi.md#createWholesaleRequestDecide) | **POST** /v1/wholesale/requests/{id}/decide | Approve (grants access to that catalog; optional groupId adds the buyer to a customer group) or decline (optional reason) an access request.
[**createWholesaleTierBulk**](WholesaleApi.md#createWholesaleTierBulk) | **POST** /v1/wholesale/tiers/bulk | One ladder for many listings: breaks as [{ minQuantity, discountBps }] off each listing&#39;s own price. Returns how many were updated and which were skipped and why.
[**deleteWholesaleBuyerTerm**](WholesaleApi.md#deleteWholesaleBuyerTerm) | **DELETE** /v1/wholesale/buyers/{buyerUserId}/terms | Switch a buyer&#39;s account terms off. Invoices already issued are unaffected.
[**deleteWholesaleCatalog**](WholesaleApi.md#deleteWholesaleCatalog) | **DELETE** /v1/wholesale/catalogs/{id} | Delete a catalog with its items, grants and access requests. Orders and invoices are untouched.
[**deleteWholesaleCatalogItem**](WholesaleApi.md#deleteWholesaleCatalogItem) | **DELETE** /v1/wholesale/catalogs/{id}/items/{platformListingId} | Take an item out of a catalog. The listing itself is untouched.
[**deleteWholesaleGroup**](WholesaleApi.md#deleteWholesaleGroup) | **DELETE** /v1/wholesale/groups/{id} | Delete a customer group. Its members keep any other group or account rate.
[**deleteWholesaleGroupMember**](WholesaleApi.md#deleteWholesaleGroupMember) | **DELETE** /v1/wholesale/groups/{id}/members/{buyerUserId} | Take a buyer out of a group.
[**getWholesaleCatalogLineSheet**](WholesaleApi.md#getWholesaleCatalogLineSheet) | **GET** /v1/wholesale/catalogs/{id}/line-sheet | The catalog&#39;s line sheet: your company details and terms, then every item with retail and trade price, minimum, case pack and quantity breaks.
[**getWholesaleCatalogShare**](WholesaleApi.md#getWholesaleCatalogShare) | **GET** /v1/wholesale/catalogs/{id}/share | The catalog&#39;s buyer link (null until you have a shop username), to share or print as a QR code.
[**getWholesaleCategory**](WholesaleApi.md#getWholesaleCategory) | **GET** /v1/wholesale/categories | The wholesale category taxonomy (id, label, group). A catalog or trade profile takes up to 12 ids, or \&quot;other:&lt;words&gt;\&quot;.
[**getWholesaleDrop**](WholesaleApi.md#getWholesaleDrop) | **GET** /v1/wholesale/drops/{id} | One trade drop with its listings and, for a pre-book, every reservation: buyer, item, quantity, deposit, balance, status and the balance invoice once released.
[**getWholesaleInvoice**](WholesaleApi.md#getWholesaleInvoice) | **GET** /v1/wholesale/invoices/{id} | One invoice with its lines, PO reference, payments and whether Crossly dues on it are collected.
[**getWholesaleOverview**](WholesaleApi.md#getWholesaleOverview) | **GET** /v1/wholesale/overview | Your wholesale store at a glance: the setup checklist, 30-day wholesale revenue, open orders, outstanding invoices, active buyers and pending access requests.
[**getWholesaleProfile**](WholesaleApi.md#getWholesaleProfile) | **GET** /v1/wholesale/profile | A store&#39;s trade profile (X-Storefront-Id; default store when omitted): company, tagline, logo and banner, contact, ships-from origin, lead time, order minimums (opening, first order, reorder), the default MOQ / case pack / max per order / backorder / price visibility, return, payment and shipping preset ids, invoicing and its settings, buyer requirements and the directory defaults.
[**getWholesaleQuote**](WholesaleApi.md#getWholesaleQuote) | **GET** /v1/wholesale/quotes/{id} | One quote request.
[**getWholesaleReserve**](WholesaleApi.md#getWholesaleReserve) | **GET** /v1/wholesale/reserve/{inventoryItemId} | How many units of an inventory item are held back for wholesale, and what retail channels advertise.
[**getWholesaleTermPreview**](WholesaleApi.md#getWholesaleTermPreview) | **GET** /v1/wholesale/terms/preview | The trade terms that apply to a catalog item (?catalogId&amp;platformListingId), a catalog (?catalogId) or the trade profile alone, each with its source (item, catalog, profile, default), plus the return, payment and shipping policies they resolve to.
[**listWholesaleBuyers**](WholesaleApi.md#listWholesaleBuyers) | **GET** /v1/wholesale/buyers | Your trade buyers: catalogs they can open, customer groups, account terms, outstanding balance, wholesale spend, business verification and resale-certificate status (read-only — Crossly reviews those).
[**listWholesaleCatalogItems**](WholesaleApi.md#listWholesaleCatalogItems) | **GET** /v1/wholesale/catalogs/{id}/items | A catalog&#39;s items in merchandising order, each with its retail price, trade price, minimum order quantity, case pack and quantity breaks.
[**listWholesaleCatalogs**](WholesaleApi.md#listWholesaleCatalogs) | **GET** /v1/wholesale/catalogs | Your wholesale catalogs with item, buyer-grant and pending-request counts.
[**listWholesaleDrops**](WholesaleApi.md#listWholesaleDrops) | **GET** /v1/wholesale/drops | Your trade drops and pre-books: audience (trade &#x3D; your approved trade buyers, catalog &#x3D; whoever can open audienceCatalogId), kind (release | prebook), deposit, ship date, status, and for a pre-book its reservation totals (buyers, units, deposits taken, balances still to invoice).
[**listWholesaleFreightRequests**](WholesaleApi.md#listWholesaleFreightRequests) | **GET** /v1/wholesale/freight-requests | Freight (LTL) quote requests from buyers whose order is over your pallet threshold.
[**listWholesaleGroups**](WholesaleApi.md#listWholesaleGroups) | **GET** /v1/wholesale/groups | Your customer groups with their discount and members.
[**listWholesaleInvoices**](WholesaleApi.md#listWholesaleInvoices) | **GET** /v1/wholesale/invoices | On-account invoices, newest first, with balance due. ?status&#x3D;unpaid for open, partial and overdue together.
[**listWholesaleOrders**](WholesaleApi.md#listWholesaleOrders) | **GET** /v1/wholesale/orders | Wholesale orders: Crossly orders priced through your trade terms (catalog price, quantity break or account rate) or placed on account. Fulfil them like any order.
[**listWholesaleQuotes**](WholesaleApi.md#listWholesaleQuotes) | **GET** /v1/wholesale/quotes | Quote requests (RFQ) from trade buyers: items with quantity and target price, your quoted prices and expiry. ?status&#x3D;open lists the ones waiting on you or the buyer.
[**listWholesaleRequests**](WholesaleApi.md#listWholesaleRequests) | **GET** /v1/wholesale/requests | Requests from buyers to open your private or trade-only catalogs, with each buyer&#39;s business-verification and tax-exempt status. ?status&#x3D;all includes decided ones.
[**listWholesaleSetupSteps**](WholesaleApi.md#listWholesaleSetupSteps) | **GET** /v1/wholesale/setup-steps | The wholesale setup checklist for a store: profile, ships-from, payment, returns, a catalog with items, visibility chosen, live. Each step is done because the thing exists.
[**updateWholesaleBuyerTerm**](WholesaleApi.md#updateWholesaleBuyerTerm) | **PUT** /v1/wholesale/buyers/{buyerUserId}/terms | Set a buyer&#39;s account terms: netDays (0-120) for paying on account, creditLimitCents (the most they may owe you at once; null &#x3D; no limit) and discountPercentBps (their negotiated rate).
[**updateWholesaleCatalog**](WholesaleApi.md#updateWholesaleCatalog) | **PATCH** /v1/wholesale/catalogs/{id} | Edit a catalog: name, slug, description, cover image, visibility, opening-order minimum, trade gate, directory listing, active.
[**updateWholesaleCatalogItem**](WholesaleApi.md#updateWholesaleCatalogItem) | **PATCH** /v1/wholesale/catalogs/{id}/items | Change many catalog items at once: items[] sets each row (trade price, MOQ, case pack, lead time, max per order, backorder, restock date, verified-only, price visibility, preset ids); or platformListingIds + set applies the same values to each, set.pctOffRetailBps pricing each from its retail price.
[**updateWholesaleCatalogItemByPlatformListingId**](WholesaleApi.md#updateWholesaleCatalogItemByPlatformListingId) | **PATCH** /v1/wholesale/catalogs/{id}/items/{platformListingId} | Change one item&#39;s trade price and its own trade terms in this catalog (MOQ, case pack, lead time, max per order, backorder, restock date, verified-only, price visibility, preset ids). null clears &#x3D; inherit from the catalog.
[**updateWholesaleCatalogItemOrder**](WholesaleApi.md#updateWholesaleCatalogItemOrder) | **PUT** /v1/wholesale/catalogs/{id}/items/order | Set the merchandising order: platform listing ids, first to last. Items left out keep their relative order after these.
[**updateWholesaleDrop**](WholesaleApi.md#updateWholesaleDrop) | **PATCH** /v1/wholesale/drops/{id} | Edit a trade drop (any create field but kind), schedule it (status \&quot;scheduled\&quot;, with dropAt in the future) or cancel it. A live drop can only be cancelled or have endsAt / perCustomerLimit changed.
[**updateWholesaleGroup**](WholesaleApi.md#updateWholesaleGroup) | **PATCH** /v1/wholesale/groups/{id} | Rename a group, change its discount, or pause it (active&#x3D;false).
[**updateWholesaleListingTier**](WholesaleApi.md#updateWholesaleListingTier) | **PUT** /v1/wholesale/listings/{platformListingId}/tiers | Replace one listing&#39;s quantity breaks: [{ minQuantity ≥ 2, unitPriceCents }], each cheaper than the last and than the list price. An empty list removes them. Applies to every buyer at checkout.
[**updateWholesaleProfile**](WholesaleApi.md#updateWholesaleProfile) | **PUT** /v1/wholesale/profile | Save a store&#39;s trade profile. Omitted fields are unchanged; null clears. shipsFrom is checked by the shipping validator (400 invalid_ships_from). The profile is the bottom of the trade-terms cascade: catalogs and items that leave a term empty inherit it — saving never rewrites catalogs. Preset ids must be your own presets of that kind.
[**updateWholesaleReserve**](WholesaleApi.md#updateWholesaleReserve) | **PUT** /v1/wholesale/reserve/{inventoryItemId} | Reserve N units of an inventory item for wholesale: retail channels advertise the rest and come down when only the reserve is left. 0 clears it.


<a name="createWholesaleBuyerInvite"></a>
# **createWholesaleBuyerInvite**
> CreateWholesaleBuyerInviteResponse createWholesaleBuyerInvite()

Invite a buyer by email to one or more of your catalogs. Binds to their account now if they have one, or when they sign up.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    try {
      CreateWholesaleBuyerInviteResponse result = apiInstance.createWholesaleBuyerInvite();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#createWholesaleBuyerInvite");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWholesaleBuyerInviteResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="createWholesaleBuyerRemove"></a>
# **createWholesaleBuyerRemove**
> CreateWholesaleBuyerRemoveResponse createWholesaleBuyerRemove()

Revoke every catalog grant a buyer (or invited email) has with you. Their terms and invoices are kept.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    try {
      CreateWholesaleBuyerRemoveResponse result = apiInstance.createWholesaleBuyerRemove();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#createWholesaleBuyerRemove");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWholesaleBuyerRemoveResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="createWholesaleCatalog"></a>
# **createWholesaleCatalog**
> CreateWholesaleCatalogResponse createWholesaleCatalog()

Create a catalog. visibility public | public_prices_private (prices for approved buyers) | private_discoverable (listed, opened on approval) | link (anyone with the URL) | invite (named buyers only; \&quot;private\&quot; is accepted as invite); autoApprove never | verified | all; the cascade terms (minOrderQuantity, casePack, leadTimeDays, verifiedOnly, priceVisibility, maxPerOrder, backorder, restockEta, preset ids) default every item; listed advertises a public catalog in the wholesale directory (never its prices).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    try {
      CreateWholesaleCatalogResponse result = apiInstance.createWholesaleCatalog();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#createWholesaleCatalog");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWholesaleCatalogResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="createWholesaleCatalogItem"></a>
# **createWholesaleCatalogItem**
> CreateWholesaleCatalogItemResponse createWholesaleCatalogItem(id)

Add your Crossly listings to a catalog (up to 500), each with an optional wholesalePriceCents, minOrderQuantity and casePack. Items already in the catalog have their terms updated.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateWholesaleCatalogItemResponse result = apiInstance.createWholesaleCatalogItem(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#createWholesaleCatalogItem");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**CreateWholesaleCatalogItemResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="createWholesaleDrop"></a>
# **createWholesaleDrop**
> CreateWholesaleDropResponse createWholesaleDrop()

Create a draft trade drop: name, dropAt (ISO; when it opens), audience trade|catalog (+ audienceCatalogId), kind release|prebook. A pre-book needs depositBps (100-9900) and shipBy (YYYY-MM-DD), and takes balanceNetDays (0-90) for the balance invoice. listingIds are your listing ids, each on Crossly. A pre-book makes its listings pre-orders, so buyers pay the deposit at checkout. Schedule it with PATCH status \&quot;scheduled\&quot;.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    try {
      CreateWholesaleDropResponse result = apiInstance.createWholesaleDrop();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#createWholesaleDrop");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWholesaleDropResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="createWholesaleDropRelease"></a>
# **createWholesaleDropRelease**
> CreateWholesaleDropReleaseResponse createWholesaleDropRelease(id)

Release a live pre-book: every reserved balance becomes an invoice on account to its buyer (due in the drop balanceNetDays), emailed, and the drop ends. Safe to retry: only balances not yet invoiced are invoiced. Returns { invoiced, balanceCents, invoiceIds }.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateWholesaleDropReleaseResponse result = apiInstance.createWholesaleDropRelease(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#createWholesaleDropRelease");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**CreateWholesaleDropReleaseResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="createWholesaleFreightRequestAnswer"></a>
# **createWholesaleFreightRequestAnswer**
> CreateWholesaleFreightRequestAnswerResponse createWholesaleFreightRequestAnswer(id)

Answer an open freight request with a figure in CENTS (and an optional note).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateWholesaleFreightRequestAnswerResponse result = apiInstance.createWholesaleFreightRequestAnswer(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#createWholesaleFreightRequestAnswer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**CreateWholesaleFreightRequestAnswerResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="createWholesaleGroup"></a>
# **createWholesaleGroup**
> CreateWholesaleGroupResponse createWholesaleGroup()

Create a customer group with a discount in basis points (up to 9000). A buyer in several groups gets the best rate, never a stacked one.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    try {
      CreateWholesaleGroupResponse result = apiInstance.createWholesaleGroup();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#createWholesaleGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWholesaleGroupResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="createWholesaleGroupMember"></a>
# **createWholesaleGroupMember**
> CreateWholesaleGroupMemberResponse createWholesaleGroupMember(id)

Add a buyer to a group by account id or by the email of an existing Crossly account.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateWholesaleGroupMemberResponse result = apiInstance.createWholesaleGroupMember(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#createWholesaleGroupMember");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**CreateWholesaleGroupMemberResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="createWholesaleInvoiceCreditNote"></a>
# **createWholesaleInvoiceCreditNote**
> CreateWholesaleInvoiceCreditNoteResponse createWholesaleInvoiceCreditNote(id)

Issue a credit note on an on-account invoice (short shipment, damaged, pricing error, returned, goodwill, other): at most the balance due. Numbered &lt;invoice&gt;-CN&lt;n&gt;; settling the rest closes the invoice paid. Not a refund.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateWholesaleInvoiceCreditNoteResponse result = apiInstance.createWholesaleInvoiceCreditNote(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#createWholesaleInvoiceCreditNote");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**CreateWholesaleInvoiceCreditNoteResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="createWholesaleInvoiceLateFee"></a>
# **createWholesaleInvoiceLateFee**
> WholesaleInvoiceResponse createWholesaleInvoiceLateFee(id)

Add your late fee (invoice settings lateFeeBps) to an invoice by hand, once. The hourly sweep adds it automatically when an invoice goes overdue.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      WholesaleInvoiceResponse result = apiInstance.createWholesaleInvoiceLateFee(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#createWholesaleInvoiceLateFee");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**WholesaleInvoiceResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="createWholesaleInvoiceMarkPaid"></a>
# **createWholesaleInvoiceMarkPaid**
> WholesaleInvoiceResponse createWholesaleInvoiceMarkPaid(id)

Record a payment the buyer made to you directly: method ach | check | wire | card | other, a reference, and amountCents (omit for the whole balance). When the invoice is settled, Crossly&#39;s fee and the tax it remits are charged to your billing card.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      WholesaleInvoiceResponse result = apiInstance.createWholesaleInvoiceMarkPaid(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#createWholesaleInvoiceMarkPaid");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**WholesaleInvoiceResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="createWholesaleInvoiceSend"></a>
# **createWholesaleInvoiceSend**
> CreateWholesaleInvoiceSendResponse createWholesaleInvoiceSend(id)

Email the invoice to the buyer again (an overdue one goes as an overdue notice), with the link to pay it.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateWholesaleInvoiceSendResponse result = apiInstance.createWholesaleInvoiceSend(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#createWholesaleInvoiceSend");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**CreateWholesaleInvoiceSendResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="createWholesaleInvoiceVoid"></a>
# **createWholesaleInvoiceVoid**
> WholesaleInvoiceResponse createWholesaleInvoiceVoid(id)

Void an invoice nobody has paid anything on (e.g. the order was cancelled). It stops counting against the buyer&#39;s credit limit.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      WholesaleInvoiceResponse result = apiInstance.createWholesaleInvoiceVoid(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#createWholesaleInvoiceVoid");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**WholesaleInvoiceResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="createWholesaleInvoiceWriteOff"></a>
# **createWholesaleInvoiceWriteOff**
> WholesaleInvoiceResponse createWholesaleInvoiceWriteOff(id)

Write off what is left on an invoice (bad debt): it closes as written_off and stops counting against the buyer&#39;s credit.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      WholesaleInvoiceResponse result = apiInstance.createWholesaleInvoiceWriteOff(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#createWholesaleInvoiceWriteOff");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**WholesaleInvoiceResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="createWholesaleProfileShipsFromValidate"></a>
# **createWholesaleProfileShipsFromValidate**
> CreateWholesaleProfileShipsFromValidateResponse createWholesaleProfileShipsFromValidate()

Check a ships-from origin ({ postalCode, country, city?, region? }) with the shipping validator without saving it. 400 invalid_ships_from with the issues; 422 for an embargoed origin.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    try {
      CreateWholesaleProfileShipsFromValidateResponse result = apiInstance.createWholesaleProfileShipsFromValidate();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#createWholesaleProfileShipsFromValidate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWholesaleProfileShipsFromValidateResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="createWholesaleQuoteAnswer"></a>
# **createWholesaleQuoteAnswer**
> WholesaleQuoteResponse createWholesaleQuoteAnswer(id)

Answer (or revise) a quote: a unit price in CENTS per item you quote, an expiresAt (ISO, at most 90 days out) and an optional note. Items left out are not quoted. The buyer is notified and can accept until expiry.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      WholesaleQuoteResponse result = apiInstance.createWholesaleQuoteAnswer(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#createWholesaleQuoteAnswer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**WholesaleQuoteResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="createWholesaleQuoteDecline"></a>
# **createWholesaleQuoteDecline**
> WholesaleQuoteResponse createWholesaleQuoteDecline(id)

Decline a quote request, with an optional reason the buyer sees.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      WholesaleQuoteResponse result = apiInstance.createWholesaleQuoteDecline(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#createWholesaleQuoteDecline");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**WholesaleQuoteResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="createWholesaleRequestDecide"></a>
# **createWholesaleRequestDecide**
> CreateWholesaleRequestDecideResponse createWholesaleRequestDecide(id)

Approve (grants access to that catalog; optional groupId adds the buyer to a customer group) or decline (optional reason) an access request.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateWholesaleRequestDecideResponse result = apiInstance.createWholesaleRequestDecide(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#createWholesaleRequestDecide");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**CreateWholesaleRequestDecideResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="createWholesaleTierBulk"></a>
# **createWholesaleTierBulk**
> CreateWholesaleTierBulkResponse createWholesaleTierBulk()

One ladder for many listings: breaks as [{ minQuantity, discountBps }] off each listing&#39;s own price. Returns how many were updated and which were skipped and why.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    try {
      CreateWholesaleTierBulkResponse result = apiInstance.createWholesaleTierBulk();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#createWholesaleTierBulk");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**CreateWholesaleTierBulkResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="deleteWholesaleBuyerTerm"></a>
# **deleteWholesaleBuyerTerm**
> UpdateGroupBuyResponse deleteWholesaleBuyerTerm(buyerUserId)

Switch a buyer&#39;s account terms off. Invoices already issued are unaffected.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    String buyerUserId = "buyerUserId_example"; // String | 
    try {
      UpdateGroupBuyResponse result = apiInstance.deleteWholesaleBuyerTerm(buyerUserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#deleteWholesaleBuyerTerm");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerUserId** | **String**|  |

### Return type

**UpdateGroupBuyResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="deleteWholesaleCatalog"></a>
# **deleteWholesaleCatalog**
> UpdateGroupBuyResponse deleteWholesaleCatalog(id)

Delete a catalog with its items, grants and access requests. Orders and invoices are untouched.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      UpdateGroupBuyResponse result = apiInstance.deleteWholesaleCatalog(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#deleteWholesaleCatalog");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**UpdateGroupBuyResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="deleteWholesaleCatalogItem"></a>
# **deleteWholesaleCatalogItem**
> UpdateGroupBuyResponse deleteWholesaleCatalogItem(id, platformListingId)

Take an item out of a catalog. The listing itself is untouched.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    String id = "id_example"; // String | 
    String platformListingId = "platformListingId_example"; // String | 
    try {
      UpdateGroupBuyResponse result = apiInstance.deleteWholesaleCatalogItem(id, platformListingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#deleteWholesaleCatalogItem");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **platformListingId** | **String**|  |

### Return type

**UpdateGroupBuyResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="deleteWholesaleGroup"></a>
# **deleteWholesaleGroup**
> UpdateGroupBuyResponse deleteWholesaleGroup(id)

Delete a customer group. Its members keep any other group or account rate.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      UpdateGroupBuyResponse result = apiInstance.deleteWholesaleGroup(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#deleteWholesaleGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**UpdateGroupBuyResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="deleteWholesaleGroupMember"></a>
# **deleteWholesaleGroupMember**
> UpdateGroupBuyResponse deleteWholesaleGroupMember(id, buyerUserId)

Take a buyer out of a group.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    String id = "id_example"; // String | 
    String buyerUserId = "buyerUserId_example"; // String | 
    try {
      UpdateGroupBuyResponse result = apiInstance.deleteWholesaleGroupMember(id, buyerUserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#deleteWholesaleGroupMember");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **buyerUserId** | **String**|  |

### Return type

**UpdateGroupBuyResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="getWholesaleCatalogLineSheet"></a>
# **getWholesaleCatalogLineSheet**
> GetWholesaleCatalogLineSheetResponse getWholesaleCatalogLineSheet(id)

The catalog&#39;s line sheet: your company details and terms, then every item with retail and trade price, minimum, case pack and quantity breaks.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetWholesaleCatalogLineSheetResponse result = apiInstance.getWholesaleCatalogLineSheet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#getWholesaleCatalogLineSheet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**GetWholesaleCatalogLineSheetResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="getWholesaleCatalogShare"></a>
# **getWholesaleCatalogShare**
> GetWholesaleCatalogShareResponse getWholesaleCatalogShare(id)

The catalog&#39;s buyer link (null until you have a shop username), to share or print as a QR code.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetWholesaleCatalogShareResponse result = apiInstance.getWholesaleCatalogShare(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#getWholesaleCatalogShare");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**GetWholesaleCatalogShareResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="getWholesaleCategory"></a>
# **getWholesaleCategory**
> GetWholesaleCategoryResponse getWholesaleCategory()

The wholesale category taxonomy (id, label, group). A catalog or trade profile takes up to 12 ids, or \&quot;other:&lt;words&gt;\&quot;.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    try {
      GetWholesaleCategoryResponse result = apiInstance.getWholesaleCategory();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#getWholesaleCategory");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWholesaleCategoryResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="getWholesaleDrop"></a>
# **getWholesaleDrop**
> GetWholesaleDropResponse getWholesaleDrop(id)

One trade drop with its listings and, for a pre-book, every reservation: buyer, item, quantity, deposit, balance, status and the balance invoice once released.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetWholesaleDropResponse result = apiInstance.getWholesaleDrop(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#getWholesaleDrop");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**GetWholesaleDropResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="getWholesaleInvoice"></a>
# **getWholesaleInvoice**
> WholesaleInvoiceResponse getWholesaleInvoice(id)

One invoice with its lines, PO reference, payments and whether Crossly dues on it are collected.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      WholesaleInvoiceResponse result = apiInstance.getWholesaleInvoice(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#getWholesaleInvoice");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**WholesaleInvoiceResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="getWholesaleOverview"></a>
# **getWholesaleOverview**
> GetWholesaleOverviewResponse getWholesaleOverview()

Your wholesale store at a glance: the setup checklist, 30-day wholesale revenue, open orders, outstanding invoices, active buyers and pending access requests.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    try {
      GetWholesaleOverviewResponse result = apiInstance.getWholesaleOverview();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#getWholesaleOverview");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWholesaleOverviewResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="getWholesaleProfile"></a>
# **getWholesaleProfile**
> GetWholesaleProfileResponse getWholesaleProfile()

A store&#39;s trade profile (X-Storefront-Id; default store when omitted): company, tagline, logo and banner, contact, ships-from origin, lead time, order minimums (opening, first order, reorder), the default MOQ / case pack / max per order / backorder / price visibility, return, payment and shipping preset ids, invoicing and its settings, buyer requirements and the directory defaults.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    try {
      GetWholesaleProfileResponse result = apiInstance.getWholesaleProfile();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#getWholesaleProfile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWholesaleProfileResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="getWholesaleQuote"></a>
# **getWholesaleQuote**
> WholesaleQuoteResponse getWholesaleQuote(id)

One quote request.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      WholesaleQuoteResponse result = apiInstance.getWholesaleQuote(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#getWholesaleQuote");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**WholesaleQuoteResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="getWholesaleReserve"></a>
# **getWholesaleReserve**
> GetWholesaleReserveResponse getWholesaleReserve(inventoryItemId)

How many units of an inventory item are held back for wholesale, and what retail channels advertise.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    String inventoryItemId = "inventoryItemId_example"; // String | 
    try {
      GetWholesaleReserveResponse result = apiInstance.getWholesaleReserve(inventoryItemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#getWholesaleReserve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryItemId** | **String**|  |

### Return type

**GetWholesaleReserveResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="getWholesaleTermPreview"></a>
# **getWholesaleTermPreview**
> GetWholesaleTermPreviewResponse getWholesaleTermPreview()

The trade terms that apply to a catalog item (?catalogId&amp;platformListingId), a catalog (?catalogId) or the trade profile alone, each with its source (item, catalog, profile, default), plus the return, payment and shipping policies they resolve to.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    try {
      GetWholesaleTermPreviewResponse result = apiInstance.getWholesaleTermPreview();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#getWholesaleTermPreview");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**GetWholesaleTermPreviewResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="listWholesaleBuyers"></a>
# **listWholesaleBuyers**
> ListWholesaleBuyersResponse listWholesaleBuyers()

Your trade buyers: catalogs they can open, customer groups, account terms, outstanding balance, wholesale spend, business verification and resale-certificate status (read-only — Crossly reviews those).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    try {
      ListWholesaleBuyersResponse result = apiInstance.listWholesaleBuyers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#listWholesaleBuyers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWholesaleBuyersResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="listWholesaleCatalogItems"></a>
# **listWholesaleCatalogItems**
> ListWholesaleCatalogItemsResponse listWholesaleCatalogItems(id)

A catalog&#39;s items in merchandising order, each with its retail price, trade price, minimum order quantity, case pack and quantity breaks.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      ListWholesaleCatalogItemsResponse result = apiInstance.listWholesaleCatalogItems(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#listWholesaleCatalogItems");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**ListWholesaleCatalogItemsResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="listWholesaleCatalogs"></a>
# **listWholesaleCatalogs**
> ListWholesaleCatalogsResponse listWholesaleCatalogs()

Your wholesale catalogs with item, buyer-grant and pending-request counts.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    try {
      ListWholesaleCatalogsResponse result = apiInstance.listWholesaleCatalogs();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#listWholesaleCatalogs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWholesaleCatalogsResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="listWholesaleDrops"></a>
# **listWholesaleDrops**
> ListWholesaleDropsResponse listWholesaleDrops()

Your trade drops and pre-books: audience (trade &#x3D; your approved trade buyers, catalog &#x3D; whoever can open audienceCatalogId), kind (release | prebook), deposit, ship date, status, and for a pre-book its reservation totals (buyers, units, deposits taken, balances still to invoice).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    try {
      ListWholesaleDropsResponse result = apiInstance.listWholesaleDrops();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#listWholesaleDrops");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWholesaleDropsResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="listWholesaleFreightRequests"></a>
# **listWholesaleFreightRequests**
> ListWholesaleFreightRequestsResponse listWholesaleFreightRequests()

Freight (LTL) quote requests from buyers whose order is over your pallet threshold.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    try {
      ListWholesaleFreightRequestsResponse result = apiInstance.listWholesaleFreightRequests();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#listWholesaleFreightRequests");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWholesaleFreightRequestsResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="listWholesaleGroups"></a>
# **listWholesaleGroups**
> ListWholesaleGroupsResponse listWholesaleGroups()

Your customer groups with their discount and members.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    try {
      ListWholesaleGroupsResponse result = apiInstance.listWholesaleGroups();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#listWholesaleGroups");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWholesaleGroupsResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="listWholesaleInvoices"></a>
# **listWholesaleInvoices**
> ListWholesaleInvoicesResponse listWholesaleInvoices()

On-account invoices, newest first, with balance due. ?status&#x3D;unpaid for open, partial and overdue together.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    try {
      ListWholesaleInvoicesResponse result = apiInstance.listWholesaleInvoices();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#listWholesaleInvoices");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWholesaleInvoicesResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="listWholesaleOrders"></a>
# **listWholesaleOrders**
> ListWholesaleOrdersResponse listWholesaleOrders()

Wholesale orders: Crossly orders priced through your trade terms (catalog price, quantity break or account rate) or placed on account. Fulfil them like any order.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    try {
      ListWholesaleOrdersResponse result = apiInstance.listWholesaleOrders();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#listWholesaleOrders");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWholesaleOrdersResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="listWholesaleQuotes"></a>
# **listWholesaleQuotes**
> ListWholesaleQuotesResponse listWholesaleQuotes()

Quote requests (RFQ) from trade buyers: items with quantity and target price, your quoted prices and expiry. ?status&#x3D;open lists the ones waiting on you or the buyer.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    try {
      ListWholesaleQuotesResponse result = apiInstance.listWholesaleQuotes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#listWholesaleQuotes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWholesaleQuotesResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="listWholesaleRequests"></a>
# **listWholesaleRequests**
> ListWholesaleRequestsResponse listWholesaleRequests()

Requests from buyers to open your private or trade-only catalogs, with each buyer&#39;s business-verification and tax-exempt status. ?status&#x3D;all includes decided ones.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    try {
      ListWholesaleRequestsResponse result = apiInstance.listWholesaleRequests();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#listWholesaleRequests");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWholesaleRequestsResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="listWholesaleSetupSteps"></a>
# **listWholesaleSetupSteps**
> ListWholesaleSetupStepsResponse listWholesaleSetupSteps()

The wholesale setup checklist for a store: profile, ships-from, payment, returns, a catalog with items, visibility chosen, live. Each step is done because the thing exists.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    try {
      ListWholesaleSetupStepsResponse result = apiInstance.listWholesaleSetupSteps();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#listWholesaleSetupSteps");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ListWholesaleSetupStepsResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="updateWholesaleBuyerTerm"></a>
# **updateWholesaleBuyerTerm**
> UpdateWholesaleBuyerTermResponse updateWholesaleBuyerTerm(buyerUserId)

Set a buyer&#39;s account terms: netDays (0-120) for paying on account, creditLimitCents (the most they may owe you at once; null &#x3D; no limit) and discountPercentBps (their negotiated rate).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    String buyerUserId = "buyerUserId_example"; // String | 
    try {
      UpdateWholesaleBuyerTermResponse result = apiInstance.updateWholesaleBuyerTerm(buyerUserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#updateWholesaleBuyerTerm");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **buyerUserId** | **String**|  |

### Return type

**UpdateWholesaleBuyerTermResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="updateWholesaleCatalog"></a>
# **updateWholesaleCatalog**
> CreateWholesaleCatalogResponse updateWholesaleCatalog(id)

Edit a catalog: name, slug, description, cover image, visibility, opening-order minimum, trade gate, directory listing, active.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateWholesaleCatalogResponse result = apiInstance.updateWholesaleCatalog(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#updateWholesaleCatalog");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**CreateWholesaleCatalogResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="updateWholesaleCatalogItem"></a>
# **updateWholesaleCatalogItem**
> UpdateWholesaleCatalogItemResponse updateWholesaleCatalogItem(id)

Change many catalog items at once: items[] sets each row (trade price, MOQ, case pack, lead time, max per order, backorder, restock date, verified-only, price visibility, preset ids); or platformListingIds + set applies the same values to each, set.pctOffRetailBps pricing each from its retail price.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      UpdateWholesaleCatalogItemResponse result = apiInstance.updateWholesaleCatalogItem(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#updateWholesaleCatalogItem");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**UpdateWholesaleCatalogItemResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="updateWholesaleCatalogItemByPlatformListingId"></a>
# **updateWholesaleCatalogItemByPlatformListingId**
> UpdateGroupBuyResponse updateWholesaleCatalogItemByPlatformListingId(id, platformListingId)

Change one item&#39;s trade price and its own trade terms in this catalog (MOQ, case pack, lead time, max per order, backorder, restock date, verified-only, price visibility, preset ids). null clears &#x3D; inherit from the catalog.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    String id = "id_example"; // String | 
    String platformListingId = "platformListingId_example"; // String | 
    try {
      UpdateGroupBuyResponse result = apiInstance.updateWholesaleCatalogItemByPlatformListingId(id, platformListingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#updateWholesaleCatalogItemByPlatformListingId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **platformListingId** | **String**|  |

### Return type

**UpdateGroupBuyResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="updateWholesaleCatalogItemOrder"></a>
# **updateWholesaleCatalogItemOrder**
> ListWholesaleCatalogItemsResponse updateWholesaleCatalogItemOrder(id)

Set the merchandising order: platform listing ids, first to last. Items left out keep their relative order after these.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      ListWholesaleCatalogItemsResponse result = apiInstance.updateWholesaleCatalogItemOrder(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#updateWholesaleCatalogItemOrder");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**ListWholesaleCatalogItemsResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="updateWholesaleDrop"></a>
# **updateWholesaleDrop**
> CreateWholesaleDropResponse updateWholesaleDrop(id)

Edit a trade drop (any create field but kind), schedule it (status \&quot;scheduled\&quot;, with dropAt in the future) or cancel it. A live drop can only be cancelled or have endsAt / perCustomerLimit changed.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateWholesaleDropResponse result = apiInstance.updateWholesaleDrop(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#updateWholesaleDrop");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**CreateWholesaleDropResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="updateWholesaleGroup"></a>
# **updateWholesaleGroup**
> CreateWholesaleGroupResponse updateWholesaleGroup(id)

Rename a group, change its discount, or pause it (active&#x3D;false).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateWholesaleGroupResponse result = apiInstance.updateWholesaleGroup(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#updateWholesaleGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

**CreateWholesaleGroupResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="updateWholesaleListingTier"></a>
# **updateWholesaleListingTier**
> UpdateWholesaleListingTierResponse updateWholesaleListingTier(platformListingId)

Replace one listing&#39;s quantity breaks: [{ minQuantity ≥ 2, unitPriceCents }], each cheaper than the last and than the list price. An empty list removes them. Applies to every buyer at checkout.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    String platformListingId = "platformListingId_example"; // String | 
    try {
      UpdateWholesaleListingTierResponse result = apiInstance.updateWholesaleListingTier(platformListingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#updateWholesaleListingTier");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **platformListingId** | **String**|  |

### Return type

**UpdateWholesaleListingTierResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="updateWholesaleProfile"></a>
# **updateWholesaleProfile**
> UpdateWholesaleProfileResponse updateWholesaleProfile()

Save a store&#39;s trade profile. Omitted fields are unchanged; null clears. shipsFrom is checked by the shipping validator (400 invalid_ships_from). The profile is the bottom of the trade-terms cascade: catalogs and items that leave a term empty inherit it — saving never rewrites catalogs. Preset ids must be your own presets of that kind.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    try {
      UpdateWholesaleProfileResponse result = apiInstance.updateWholesaleProfile();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#updateWholesaleProfile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**UpdateWholesaleProfileResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="updateWholesaleReserve"></a>
# **updateWholesaleReserve**
> GetWholesaleReserveResponse updateWholesaleReserve(inventoryItemId)

Reserve N units of an inventory item for wholesale: retail channels advertise the rest and come down when only the reserve is left. 0 clears it.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WholesaleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WholesaleApi apiInstance = new WholesaleApi(defaultClient);
    String inventoryItemId = "inventoryItemId_example"; // String | 
    try {
      GetWholesaleReserveResponse result = apiInstance.updateWholesaleReserve(inventoryItemId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WholesaleApi#updateWholesaleReserve");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inventoryItemId** | **String**|  |

### Return type

**GetWholesaleReserveResponse**

### Authorization

[PersonalAccessToken](../README.md#PersonalAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

