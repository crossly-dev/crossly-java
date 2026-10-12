# BuyerApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSpatialAuctionRoomBid**](BuyerApi.md#createSpatialAuctionRoomBid) | **POST** /v1/spatial/auction/rooms/{sceneId}/bid | Bid on the lot currently up in a room.


<a name="createSpatialAuctionRoomBid"></a>
# **createSpatialAuctionRoomBid**
> CreateSpatialAuctionRoomBidResponse createSpatialAuctionRoomBid(sceneId)

Bid on the lot currently up in a room.

Bids on whatever the auctioneer has up RIGHT NOW. Pass &#x60;lotId&#x60; to say which lot you believe that is: it is checked against the rostrum rather than used in its place, and a mismatch answers 409 with the lot that is actually up, so a stale catalogue cannot buy you something you never looked at. &#x60;amountCents&#x60; is CENTS and must be at least the room state&#39;s &#x60;minimumNextBidCents&#x60; — do not compute that yourself, because the opening bid on a lot is floored at the START price rather than start + step. Below it you get 400 &#x60;bid_too_low&#x60; carrying &#x60;details.minimumNextBidCents&#x60;, which is the figure the transaction itself used; raise to that and retry. THIS AUCTION HOUSE SELLS DIGITAL GOODS ONLY. A physical lot is refused 403 &#x60;forbidden&#x60; with &#x60;details.reason: \&quot;physical_lot\&quot;&#x60;, checked against the listing on every single bid rather than once when the room was set up. Bids by one person on one lot are throttled to a few per second — 429 &#x60;bidding_too_fast&#x60; carries &#x60;retryInSeconds&#x60;. A hammered or skipped lot answers 409 &#x60;lot_closed&#x60;. A room you may not enter answers 404, the same as one that does not exist. Success is the bid RECORDED, not the lot won: the reply names the topic the price moves on, and somebody may outbid you on the next frame.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    UUID sceneId = UUID.randomUUID(); // UUID | 
    try {
      CreateSpatialAuctionRoomBidResponse result = apiInstance.createSpatialAuctionRoomBid(sceneId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createSpatialAuctionRoomBid");
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
 **sceneId** | **UUID**|  |

### Return type

**CreateSpatialAuctionRoomBidResponse**

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

