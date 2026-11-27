# BuyerApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBuyerActivity**](BuyerApi.md#createBuyerActivity) | **POST** /v1/buyer/activity | Report an item your user is looking at, and get our answer.
[**createBuyerAuctionBid**](BuyerApi.md#createBuyerAuctionBid) | **POST** /v1/buyer/auctions/{slug}/bids | Place a bid, optionally with a proxy maximum. A WINNING BID IS CHARGED AUTOMATICALLY.
[**createBuyerAuctionPay**](BuyerApi.md#createBuyerAuctionPay) | **POST** /v1/buyer/auctions/{slug}/pay | Pay for an auction you won whose automatic charge did not go through.
[**createBuyerAuctionRetract**](BuyerApi.md#createBuyerAuctionRetract) | **POST** /v1/buyer/auctions/{slug}/retract | Retract your bids under eBay’s rules — a typo, a changed listing, or an unreachable seller.
[**createBuyerBoard**](BuyerApi.md#createBuyerBoard) | **POST** /v1/buyer/boards | Create an outfit board.
[**createBuyerBoardItem**](BuyerApi.md#createBuyerBoardItem) | **POST** /v1/buyer/boards/{id}/items | Add a listing (by slug) to a board, at the next free spot.
[**createBuyerBreakSpotHold**](BuyerApi.md#createBuyerBreakSpotHold) | **POST** /v1/buyer/breaks/{id}/spots/{spotId}/hold | Hold a spot in a pick-your-spot break, then buy it through checkout before the hold lapses.
[**createBuyerBuybackRequest**](BuyerApi.md#createBuyerBuybackRequest) | **POST** /v1/buyer/buybacks/{id}/request | Ask Crossly to buy an item back under its buyback guarantee.
[**createBuyerCartItem**](BuyerApi.md#createBuyerCartItem) | **POST** /v1/buyer/cart/items | Add a listing to your cart.
[**createBuyerCartItemSaveForLater**](BuyerApi.md#createBuyerCartItemSaveForLater) | **POST** /v1/buyer/cart/items/{id}/save-for-later | Move a cart line to saved-for-later.
[**createBuyerCartOptimizer**](BuyerApi.md#createBuyerCartOptimizer) | **POST** /v1/buyer/cart-optimizer | Cart optimizer: send a shopping list (one item per line, \&quot;2 Charizard Base Set\&quot;) and get the cheapest delivered basket across sellers — one pick per line, items + each seller’s shipping with free-shipping thresholds applied. fewestPackages prefers fewer sellers. Nothing is added to the cart.
[**createBuyerCartQuote**](BuyerApi.md#createBuyerCartQuote) | **POST** /v1/buyer/cart/quote | Price the cart, delivered — item, shipping, tax, total.
[**createBuyerCartSavedMoveToCart**](BuyerApi.md#createBuyerCartSavedMoveToCart) | **POST** /v1/buyer/cart/saved/{id}/move-to-cart | Move a saved item back into your cart, at today’s price.
[**createBuyerCaseCounter**](BuyerApi.md#createBuyerCaseCounter) | **POST** /v1/buyer/cases/{id}/counter | Propose your own refund figure on a case.
[**createBuyerCaseEscalate**](BuyerApi.md#createBuyerCaseEscalate) | **POST** /v1/buyer/cases/{id}/escalate | Ask Crossly to step in on a case.
[**createBuyerCaseMessage**](BuyerApi.md#createBuyerCaseMessage) | **POST** /v1/buyer/cases/{id}/messages | Post a message on a case thread.
[**createBuyerCaseRespond**](BuyerApi.md#createBuyerCaseRespond) | **POST** /v1/buyer/cases/{id}/respond | Accept or reject the seller’s partial-refund offer on a case.
[**createBuyerCaseWithdraw**](BuyerApi.md#createBuyerCaseWithdraw) | **POST** /v1/buyer/cases/{id}/withdraw | Withdraw a case you opened.
[**createBuyerCatalogListingRental**](BuyerApi.md#createBuyerCatalogListingRental) | **POST** /v1/buyer/catalog/listings/{slug}/rental | Book a rental. Returns a Stripe PaymentIntent client secret for rent + shipping both ways + deposit; the dates are held 30 minutes for payment. Crossly buys both labels; the deposit comes back after the item does.
[**createBuyerCatalogListingRentalQuote**](BuyerApi.md#createBuyerCatalogListingRentalQuote) | **POST** /v1/buyer/catalog/listings/{slug}/rental/quote | Price a rental: rent (the cheaper of by-the-day and by-the-week), both shipping legs once a ship-to is given, and the deposit. &#x60;problem&#x60; says why the dates can’t be booked.
[**createBuyerCatalogListingVideoRequest**](BuyerApi.md#createBuyerCatalogListingVideoRequest) | **POST** /v1/buyer/catalog/listings/{slug}/video-requests | Ask the seller for a video of an item (one open request per item). The seller is notified; their answer appears on the listing for every buyer.
[**createBuyerCompany**](BuyerApi.md#createBuyerCompany) | **POST** /v1/buyer/company | Create a buyer company: name, taxId?, website?. You become its owner; a user is in at most one company.
[**createBuyerCompanyApproval**](BuyerApi.md#createBuyerCompanyApproval) | **POST** /v1/buyer/company/approvals | Ask for approval of a trade order above your limit: sellerUserId, amountCents, note?, poReference?. Good for 7 days, used once at checkout.
[**createBuyerCompanyApprovalDecide**](BuyerApi.md#createBuyerCompanyApprovalDecide) | **POST** /v1/buyer/company/approvals/{id}/decide | Approve or decline a pending request (owner, accounts payable): decision approved | declined, note?.
[**createBuyerCompanyMember**](BuyerApi.md#createBuyerCompanyMember) | **POST** /v1/buyer/company/members | Invite a teammate by email (owner): role owner | buyer | accounts_payable | viewer, approvalLimitCents for a buyer (orders above it need an approval).
[**createBuyerConversationInvite**](BuyerApi.md#createBuyerConversationInvite) | **POST** /v1/buyer/conversations/{id}/invite | Invite a friend into a chat with a seller: a single-use link (7 days) that makes whoever opens it a guest who can read and post. Only the thread’s buyer can invite; at most 5 guests.
[**createBuyerConversationJoin**](BuyerApi.md#createBuyerConversationJoin) | **POST** /v1/buyer/conversations/join/{token} | Join a chat you were invited into, as a guest.
[**createBuyerEventRsvp**](BuyerApi.md#createBuyerEventRsvp) | **POST** /v1/buyer/events/{slug}/rsvp | RSVP to an event: going (counts against its capacity) or interested.
[**createBuyerFeedback**](BuyerApi.md#createBuyerFeedback) | **POST** /v1/buyer/feedback | Leave feedback on up to 25 orders at once, with optional detailed seller ratings.
[**createBuyerFitRef**](BuyerApi.md#createBuyerFitRef) | **POST** /v1/buyer/fit/refs | Save a reference garment (flat measurements, inches) to compare listings against.
[**createBuyerFollowingSellerSeen**](BuyerApi.md#createBuyerFollowingSellerSeen) | **POST** /v1/buyer/following/sellers/seen | Clear the \&quot;new listings\&quot; count on a followed seller, or on all of them.
[**createBuyerGiftCard**](BuyerApi.md#createBuyerGiftCard) | **POST** /v1/buyer/gift-cards | Start a gift card purchase.
[**createBuyerGiftCardRedeem**](BuyerApi.md#createBuyerGiftCardRedeem) | **POST** /v1/buyer/gift-cards/redeem | Redeem a gift card code into your own balance.
[**createBuyerGroupBuyJoin**](BuyerApi.md#createBuyerGroupBuyJoin) | **POST** /v1/buyer/group-buys/{id}/join | Join a group buy with a quantity (up to its per-buyer max): a hold (or, for pay-now pools, a charge refunded the difference) at the starting price, settled at the price the group reaches. &#x60;linkToken&#x60; opens a link-only pool. Checked against this key’s spending controls; send an Idempotency-Key.
[**createBuyerGroupBuyLeave**](BuyerApi.md#createBuyerGroupBuyLeave) | **POST** /v1/buyer/group-buys/{id}/leave | Leave a group buy and release your hold.
[**createBuyerHunt**](BuyerApi.md#createBuyerHunt) | **POST** /v1/buyer/hunts | Start a buyer-agent hunt — over a search (filters), or auto-buy on one listing (listingSlug: buy it once its price, sale applied, is within maxPriceCents). &#x60;offer&#x60; and &#x60;buy&#x60; modes also need buyer:checkout:write, and the budget is checked against this key’s spending controls.
[**createBuyerInstantOfferAccept**](BuyerApi.md#createBuyerInstantOfferAccept) | **POST** /v1/buyer/instant-offers/{id}/accept | Accept Crossly’s instant offer on a collection item. Ops then send a prepaid label; the store credit is paid once the item arrives and checks out.
[**createBuyerLayawayCancel**](BuyerApi.md#createBuyerLayawayCancel) | **POST** /v1/buyer/layaways/{id}/cancel | Cancel a layaway: everything paid comes back except the layaway fee (10% of the price, at most $15).
[**createBuyerLayawayPay**](BuyerApi.md#createBuyerLayawayPay) | **POST** /v1/buyer/layaways/{id}/pay | Pay some (at least $1) or all of what is left now, on the saved card. Paid in full, it ships.
[**createBuyerListingAudioSummary**](BuyerApi.md#createBuyerListingAudioSummary) | **POST** /v1/buyer/listings/{slug}/audio-summary | Record the spoken summary of a listing (cached per listing version). 503 naming TTS_API_KEY when no speech provider is configured.
[**createBuyerListingSplit**](BuyerApi.md#createBuyerListingSplit) | **POST** /v1/buyer/listings/{slug}/split | Split a purchase: one pay link per person; nobody is charged until all have paid.
[**createBuyerListingSubscribe**](BuyerApi.md#createBuyerListingSubscribe) | **POST** /v1/buyer/listings/{slug}/subscribe | Subscribe &amp; save: a standing order charged to your saved card every interval. Checked against this key’s spending controls; send an Idempotency-Key.
[**createBuyerListingTryOn**](BuyerApi.md#createBuyerListingTryOn) | **POST** /v1/buyer/listings/{slug}/try-on | Render an AI try-on of this listing on the buyer’s own photo (base64 &#x60;photo&#x60;, or &#x60;reuseLastPhoto&#x60;). &#x60;confirmSelfAdult&#x60; must be true: the photo is of the buyer and they are 18+. Wearables only; capped per day; 503 naming TRYON_API_KEY when no image model is configured.
[**createBuyerMarketBid**](BuyerApi.md#createBuyerMarketBid) | **POST** /v1/buyer/market/bids | Place a fixed-price market bid. SPENDS MONEY: it fills against the lowest ask at or under your price and charges your saved card (plus the fast-ship premium when fastShip is set and it fills from vault stock). deliverTo vault keeps it in your Crossly vault; gradeWith sends a raw card to a Grading run first. Checked against this key’s spending controls; send an Idempotency-Key.
[**createBuyerMarketWatch**](BuyerApi.md#createBuyerMarketWatch) | **POST** /v1/buyer/market/watches | Watch a market variant: alert at or below a price, or on any drop.
[**createBuyerOffer**](BuyerApi.md#createBuyerOffer) | **POST** /v1/buyer/offers | Offer a price on a listing.
[**createBuyerOfferRespond**](BuyerApi.md#createBuyerOfferRespond) | **POST** /v1/buyer/offers/{id}/respond | Answer a seller’s counteroffer — accept, decline, or counter back.
[**createBuyerOrderCancel**](BuyerApi.md#createBuyerOrderCancel) | **POST** /v1/buyer/orders/{id}/cancel | Cancel an order before it ships — refunds it in full.
[**createBuyerOrderInr**](BuyerApi.md#createBuyerOrderInr) | **POST** /v1/buyer/orders/{id}/inr | Open an item-not-received case.
[**createBuyerOrderReceived**](BuyerApi.md#createBuyerOrderReceived) | **POST** /v1/buyer/orders/{id}/received | Confirm you received an order.
[**createBuyerOrderTip**](BuyerApi.md#createBuyerOrderTip) | **POST** /v1/buyer/orders/{id}/tip | Tip the seller on one of your shipped orders, charged to your saved card. One tip per order; $1–$500; checked against this key’s spending controls.
[**createBuyerPackFairnessRotate**](BuyerApi.md#createBuyerPackFairnessRotate) | **POST** /v1/buyer/packs/fairness/rotate | Reveal your current server seed and start a new one (optionally with your own client seed). Refused while an opening is awaiting payment.
[**createBuyerPackOpen**](BuyerApi.md#createBuyerPackOpen) | **POST** /v1/buyer/packs/{slug}/open | Open a pack. SPENDS MONEY: charges the pack price to your saved card, then pulls one real item by the published odds (provably fair: see /buyer/packs/fairness) into your Crossly vault. confirmAdult must be true. Checked against this key’s spending controls; send an Idempotency-Key.
[**createBuyerPackOpeningSellBack**](BuyerApi.md#createBuyerPackOpeningSellBack) | **POST** /v1/buyer/pack-openings/{id}/sell-back | Sell a pull straight back for Crossly credit at the pack’s buyback rate, within its window, while it is still in your vault.
[**createBuyerPassportClaim**](BuyerApi.md#createBuyerPassportClaim) | **POST** /v1/buyer/passports/{code}/claim | Claim a passport as the item’s current owner — the buyer of its latest Crossly sale, or (after a sale on another marketplace) with the transfer code from the card in the box — shown as “in its owner’s hands” until it sells again.
[**createBuyerProtectionPlanCancel**](BuyerApi.md#createBuyerProtectionPlanCancel) | **POST** /v1/buyer/protection-plans/{id}/cancel | Cancel a protection plan. The insurer decides what is refundable (pro-rata after the free-look window); that amount goes back to the card.
[**createBuyerPurchaseFit**](BuyerApi.md#createBuyerPurchaseFit) | **POST** /v1/buyer/purchases/{id}/fit | Say how a delivered purchase fit: true_to_size, small or large. It teaches your size memory and, pooled with other buyers, how the brand runs.
[**createBuyerPurchaseReturn**](BuyerApi.md#createBuyerPurchaseReturn) | **POST** /v1/buyer/purchases/{id}/return | Return a purchase under the seller’s policy, or send back a try-at-home item. With reason doesnt_fit, &#x60;fit&#x60; (small | large) says which way, and it feeds your size memory.
[**createBuyerRegistry**](BuyerApi.md#createBuyerRegistry) | **POST** /v1/buyer/registries | Start a gift registry (wedding, baby, birthday, housewarming, graduation, other). Items are added like any wishlist item; set shipAddressId to one of your saved addresses so guests can buy — they never see it.
[**createBuyerRegistryGiftThanked**](BuyerApi.md#createBuyerRegistryGiftThanked) | **POST** /v1/buyer/registries/{id}/gifts/{giftId}/thanked | Tick a gift as thanked (or untick it).
[**createBuyerRentalArrivalPhoto**](BuyerApi.md#createBuyerRentalArrivalPhoto) | **POST** /v1/buyer/rentals/{id}/arrival-photos | Photograph a rental on arrival (URLs you uploaded): your side of the condition record.
[**createBuyerRentalBuyout**](BuyerApi.md#createBuyerRentalBuyout) | **POST** /v1/buyer/rentals/{id}/buyout | Buy the item you are renting: the price less the rent-to-own credit → clientSecret.
[**createBuyerRentalCancel**](BuyerApi.md#createBuyerRentalCancel) | **POST** /v1/buyer/rentals/{id}/cancel | Cancel a rental that has not shipped: everything is refunded.
[**createBuyerRentalClaimResponse**](BuyerApi.md#createBuyerRentalClaimResponse) | **POST** /v1/buyer/rentals/{id}/claim-response | Answer a deposit claim: accept (the claim is paid, the rest refunded) or dispute (Crossly decides).
[**createBuyerRentalDelivered**](BuyerApi.md#createBuyerRentalDelivered) | **POST** /v1/buyer/rentals/{id}/delivered | Confirm your rental arrived.
[**createBuyerRentalExtension**](BuyerApi.md#createBuyerRentalExtension) | **POST** /v1/buyer/rentals/{id}/extensions | Ask for more days. Auto-approved extensions return a clientSecret to pay with Stripe.
[**createBuyerRentalExtensionPay**](BuyerApi.md#createBuyerRentalExtensionPay) | **POST** /v1/buyer/rentals/{id}/extensions/{extensionId}/pay | Pay for an extension the seller approved → clientSecret.
[**createBuyerRentalIdentityStart**](BuyerApi.md#createBuyerRentalIdentityStart) | **POST** /v1/buyer/rentals/identity/start | Start the ID check renting needs (Stripe Identity: photo ID + selfie). Open &#x60;url&#x60; (hosted) or use &#x60;clientSecret&#x60; with Stripe.js.
[**createBuyerRentalReturnShipped**](BuyerApi.md#createBuyerRentalReturnShipped) | **POST** /v1/buyer/rentals/{id}/return-shipped | Say you sent your rental back (optionally with photos).
[**createBuyerReturnCancel**](BuyerApi.md#createBuyerReturnCancel) | **POST** /v1/buyer/returns/{id}/cancel | Cancel a return before it ships.
[**createBuyerReturnTracking**](BuyerApi.md#createBuyerReturnTracking) | **POST** /v1/buyer/returns/{id}/tracking | Add tracking to a return you shipped on your own label.
[**createBuyerSellerClubJoin**](BuyerApi.md#createBuyerSellerClubJoin) | **POST** /v1/buyer/sellers/{sellerUserId}/club/join | Join a seller’s loyalty club (free). Your tier’s discount then applies to their items — the best of it and any other rate you have with them, never stacked.
[**createBuyerSellerLoyaltyJoin**](BuyerApi.md#createBuyerSellerLoyaltyJoin) | **POST** /v1/buyer/sellers/{sellerUserId}/loyalty/join | Join a seller’s loyalty club. Invite-only clubs take only invited buyers. Your tier and its perks are granted at once.
[**createBuyerSellerReport**](BuyerApi.md#createBuyerSellerReport) | **POST** /v1/buyer/sellers/{username}/report | Report a seller to Crossly’s trust team.
[**createBuyerSplitCancel**](BuyerApi.md#createBuyerSplitCancel) | **POST** /v1/buyer/splits/{id}/cancel | Cancel a split you organised; every held share is released.
[**createBuyerStoreReport**](BuyerApi.md#createBuyerStoreReport) | **POST** /v1/buyer/stores/{slug}/report | Report a store to Crossly’s trust team.
[**createBuyerTogether**](BuyerApi.md#createBuyerTogether) | **POST** /v1/buyer/together | Start a shop-together room.
[**createBuyerTogetherItem**](BuyerApi.md#createBuyerTogetherItem) | **POST** /v1/buyer/together/{code}/items | Add a listing to a shop-together board.
[**createBuyerTogetherItemVote**](BuyerApi.md#createBuyerTogetherItemVote) | **POST** /v1/buyer/together/{code}/items/{id}/vote | Vote an item on a room’s board up (1), down (-1) or clear (0).
[**createBuyerTogetherJoin**](BuyerApi.md#createBuyerTogetherJoin) | **POST** /v1/buyer/together/{code}/join | Join a shop-together room by its code.
[**createBuyerTogetherLeave**](BuyerApi.md#createBuyerTogetherLeave) | **POST** /v1/buyer/together/{code}/leave | Leave a shop-together room.
[**createBuyerTogetherMessage**](BuyerApi.md#createBuyerTogetherMessage) | **POST** /v1/buyer/together/{code}/messages | Say something in a shop-together room.
[**createBuyerTotalRequest**](BuyerApi.md#createBuyerTotalRequest) | **POST** /v1/buyer/total-requests | Ask a seller for one combined shipping total on everything of theirs in your cart.
[**createBuyerVaultList**](BuyerApi.md#createBuyerVaultList) | **POST** /v1/buyer/vault/{id}/list | Sell a vault item on the market at your price. It is already authenticated, so when it sells nothing ships in: the buyer keeps it vaulted or it ships straight to them.
[**createBuyerVaultUnlist**](BuyerApi.md#createBuyerVaultUnlist) | **POST** /v1/buyer/vault/{id}/unlist | Take a vault item off the market; it stays stored.
[**createBuyerVaultWithdraw**](BuyerApi.md#createBuyerVaultWithdraw) | **POST** /v1/buyer/vault/{id}/withdraw | Ship a vault item home, standard or expedited. The shipping, any storage it owes and the early-withdrawal fee (within 90 days of arriving) are charged to your saved card now, all checked against this key’s spending controls; send an Idempotency-Key.
[**createBuyerWholesaleCatalogApply**](BuyerApi.md#createBuyerWholesaleCatalogApply) | **POST** /v1/buyer/wholesale/catalogs/{storeSlug}/{catalogSlug}/apply | Apply to a store&#39;s wholesale catalog: { message?, answers [{ id, value }], resaleCertUrl?, resaleCertState?, taxId?, businessInfo? }. The seller&#39;s requirements are enforced (400 trade_apply_requirements names the first one missing); the seller reviews the request.
[**createBuyerWholesaleFreightRequest**](BuyerApi.md#createBuyerWholesaleFreightRequest) | **POST** /v1/buyer/wholesale/freight-requests | Ask a seller to quote freight for their lines in your cart (an order over their pallet threshold): { sellerUserId, weightLbs?, shipTo? { postalCode, country, city?, region?, liftgate?, dock? }, note? }. One open request per seller.
[**createBuyerWholesaleInvoicePayLink**](BuyerApi.md#createBuyerWholesaleInvoicePayLink) | **POST** /v1/buyer/wholesale/invoices/{id}/pay-link | A hosted payment page for an on-account invoice: amountCents? (part of the balance, at least $1), method? card | ach. Nothing is charged until the buyer completes the page.
[**createBuyerWholesaleOrderSheet**](BuyerApi.md#createBuyerWholesaleOrderSheet) | **POST** /v1/buyer/wholesale/order-sheets | Save an order sheet: name, lines [{ platformListingId, listingVariantId?, catalogId?, quantity }] from one seller, optional catalogId, poReference, note.
[**createBuyerWholesaleQuote**](BuyerApi.md#createBuyerWholesaleQuote) | **POST** /v1/buyer/wholesale/quotes | Ask one seller for a quote: items [{ platformListingId, listingVariantId?, quantity, targetUnitPriceCents? }] (one seller per quote), optional catalogId, note, poReference.
[**createBuyerWholesaleQuoteAccept**](BuyerApi.md#createBuyerWholesaleQuoteAccept) | **POST** /v1/buyer/wholesale/quotes/{id}/accept | Accept an answered quote: its priced items go into your cart at the quoted quantities, locked at the quoted prices until the quote expires (changing a line&#39;s quantity drops the lock). Paying happens at checkout on Crossly.
[**createBuyerWholesaleQuoteWithdraw**](BuyerApi.md#createBuyerWholesaleQuoteWithdraw) | **POST** /v1/buyer/wholesale/quotes/{id}/withdraw | Withdraw a quote request that is still requested or answered.
[**createBuyerWholesaleUploadValidate**](BuyerApi.md#createBuyerWholesaleUploadValidate) | **POST** /v1/buyer/wholesale/upload/validate | Validate a CSV / PO against one catalog: rows [{ line, sku, quantity }] are matched by SKU (item or option SKU, or listing slug), merged per item and priced today; unmatched rows come back by line.
[**createBuyerWishlist**](BuyerApi.md#createBuyerWishlist) | **POST** /v1/buyer/wishlists | Create a wishlist.
[**createBuyerWishlistInvite**](BuyerApi.md#createBuyerWishlistInvite) | **POST** /v1/buyer/wishlists/{id}/invite | Share a wishlist with a co-editor: a single-use link (14 days). Members add and remove items; only the owner renames, deletes or removes members. At most 20.
[**createBuyerWishlistItem**](BuyerApi.md#createBuyerWishlistItem) | **POST** /v1/buyer/wishlists/{id}/items | Add a listing to a wishlist.
[**createBuyerWishlistJoin**](BuyerApi.md#createBuyerWishlistJoin) | **POST** /v1/buyer/wishlists/join/{token} | Join a wishlist you were invited to edit.
[**createBuyerWishlistShare**](BuyerApi.md#createBuyerWishlistShare) | **POST** /v1/buyer/wishlists/{id}/share | Share a wishlist — makes it public and returns its link.
[**deleteBuyerBoard**](BuyerApi.md#deleteBuyerBoard) | **DELETE** /v1/buyer/boards/{id} | Delete a board.
[**deleteBuyerBoardItem**](BuyerApi.md#deleteBuyerBoardItem) | **DELETE** /v1/buyer/boards/{id}/items/{platformListingId} | Take a listing off a board.
[**deleteBuyerBreakSpotHold**](BuyerApi.md#deleteBuyerBreakSpotHold) | **DELETE** /v1/buyer/breaks/{id}/spots/{spotId}/hold | Release a break spot you hold.
[**deleteBuyerCartItem**](BuyerApi.md#deleteBuyerCartItem) | **DELETE** /v1/buyer/cart/items/{id} | Remove a line from your cart.
[**deleteBuyerCartSaved**](BuyerApi.md#deleteBuyerCartSaved) | **DELETE** /v1/buyer/cart/saved/{id} | Remove an item from saved-for-later. Returns the remaining list.
[**deleteBuyerCompanyMember**](BuyerApi.md#deleteBuyerCompanyMember) | **DELETE** /v1/buyer/company/members/{id} | Remove a member or cancel an invite (owner), or leave the company (your own member id).
[**deleteBuyerConversationGuest**](BuyerApi.md#deleteBuyerConversationGuest) | **DELETE** /v1/buyer/conversations/{id}/guests/{userId} | Remove a guest (the thread’s buyer), or leave (a guest, with your own user id).
[**deleteBuyerCreationReview**](BuyerApi.md#deleteBuyerCreationReview) | **DELETE** /v1/buyer/creations/{format}/{id}/review | Remove your review of a creation (its vote leaves the rating with it).
[**deleteBuyerEventRsvp**](BuyerApi.md#deleteBuyerEventRsvp) | **DELETE** /v1/buyer/events/{slug}/rsvp | Take back your RSVP.
[**deleteBuyerFitRef**](BuyerApi.md#deleteBuyerFitRef) | **DELETE** /v1/buyer/fit/refs/{id} | Delete a reference garment.
[**deleteBuyerHomeGuestbook**](BuyerApi.md#deleteBuyerHomeGuestbook) | **DELETE** /v1/buyer/home/guestbook/{id} | Hide a line from your home’s guestbook.
[**deleteBuyerMarketBid**](BuyerApi.md#deleteBuyerMarketBid) | **DELETE** /v1/buyer/market/bids/{id} | Cancel a resting market bid.
[**deleteBuyerMarketWatch**](BuyerApi.md#deleteBuyerMarketWatch) | **DELETE** /v1/buyer/market/watches/{id} | Stop watching a market variant.
[**deleteBuyerOffer**](BuyerApi.md#deleteBuyerOffer) | **DELETE** /v1/buyer/offers/{id} | Withdraw an offer you made that the seller has not answered.
[**deleteBuyerRecentlyViewed**](BuyerApi.md#deleteBuyerRecentlyViewed) | **DELETE** /v1/buyer/recently-viewed/{slug} | Remove one listing from your recently viewed.
[**deleteBuyerRecentlyViewed2**](BuyerApi.md#deleteBuyerRecentlyViewed2) | **DELETE** /v1/buyer/recently-viewed | Clear your recently viewed list.
[**deleteBuyerRegistry**](BuyerApi.md#deleteBuyerRegistry) | **DELETE** /v1/buyer/registries/{id} | Delete a registry (and the wishlist behind it).
[**deleteBuyerSellerClubJoin**](BuyerApi.md#deleteBuyerSellerClubJoin) | **DELETE** /v1/buyer/sellers/{sellerUserId}/club/join | Leave a seller’s loyalty club.
[**deleteBuyerSellerLoyaltyJoin**](BuyerApi.md#deleteBuyerSellerLoyaltyJoin) | **DELETE** /v1/buyer/sellers/{sellerUserId}/loyalty/join | Leave a seller’s loyalty club.
[**deleteBuyerTogetherItem**](BuyerApi.md#deleteBuyerTogetherItem) | **DELETE** /v1/buyer/together/{code}/items/{id} | Take an item you added off a room’s board.
[**deleteBuyerTotalRequest**](BuyerApi.md#deleteBuyerTotalRequest) | **DELETE** /v1/buyer/total-requests/{id} | Cancel a total request you made.
[**deleteBuyerTryOn**](BuyerApi.md#deleteBuyerTryOn) | **DELETE** /v1/buyer/try-ons/{id} | Delete a try-on and its images — or pass &#x60;all&#x60; to delete every photo and result.
[**deleteBuyerWholesaleOrderSheet**](BuyerApi.md#deleteBuyerWholesaleOrderSheet) | **DELETE** /v1/buyer/wholesale/order-sheets/{id} | Delete an order sheet.
[**deleteBuyerWishlist**](BuyerApi.md#deleteBuyerWishlist) | **DELETE** /v1/buyer/wishlists/{id} | Delete a wishlist and everything on it.
[**deleteBuyerWishlistItem**](BuyerApi.md#deleteBuyerWishlistItem) | **DELETE** /v1/buyer/wishlists/{id}/items/{slug} | Take a listing off a wishlist.
[**deleteBuyerWishlistMember**](BuyerApi.md#deleteBuyerWishlistMember) | **DELETE** /v1/buyer/wishlists/{id}/members/{userId} | Remove a co-editor (the owner), or leave a list shared with you (your own user id).
[**getBuyerAuctionMe**](BuyerApi.md#getBuyerAuctionMe) | **GET** /v1/buyer/auctions/{slug}/me | Where you stand in one auction — your max, leading, won, must you pay.
[**getBuyerBadge**](BuyerApi.md#getBuyerBadge) | **GET** /v1/buyer/badges | The counts behind the account badge — unread messages, offers waiting, orders to review.
[**getBuyerBoard**](BuyerApi.md#getBuyerBoard) | **GET** /v1/buyer/boards/{id} | One of your boards with its layout: each item’s x, y and width as fractions of the board, and stacking order.
[**getBuyerBoardShared**](BuyerApi.md#getBuyerBoardShared) | **GET** /v1/buyer/boards/shared/{token} | A shared outfit board, by its link token.
[**getBuyerBreak**](BuyerApi.md#getBuyerBreak) | **GET** /v1/buyer/breaks/{id} | A card break’s board: spots, holders, and the seed after the draw.
[**getBuyerCase**](BuyerApi.md#getBuyerCase) | **GET** /v1/buyer/cases/{id} | One case — its state, the message thread, and the return parcel if there is one.
[**getBuyerCatalogListingMySize**](BuyerApi.md#getBuyerCatalogListingMySize) | **GET** /v1/buyer/catalog/listings/{slug}/my-size | This item against your size: the size you keep in this kind of item (and in this brand), whether this one is your size, smaller or larger, a warning if this brand and size ran small or large on you before, and how other buyers say the brand runs. null for an unsized item.
[**getBuyerCatalogListingPrice**](BuyerApi.md#getBuyerCatalogListingPrice) | **GET** /v1/buyer/catalog/listings/{slug}/price | The price today. When the seller has the same item live on another marketplace for less, this IS that price (&#x60;priceMatch&#x60; says where from), and &#x60;lowestAnywhere&#x60; lists the marketplaces it is guaranteed not to be cheaper on. &#x60;priceCheck&#x60; rates it against real sales of the same catalog item in the same condition over the last 180 days (great / good / fair / high, with the median and middle-half range in cents); null until there are 3+ sales from 2+ sellers.
[**getBuyerCatalogListingRental**](BuyerApi.md#getBuyerCatalogListingRental) | **GET** /v1/buyer/catalog/listings/{slug}/rental | Whether a listing is for rent: day and week rates, the refundable deposit, length limits, the turnaround buffer, and the dates already booked. null when it is not for rent.
[**getBuyerCheckoutUsdc**](BuyerApi.md#getBuyerCheckoutUsdc) | **GET** /v1/buyer/checkout/usdc | Whether Crossly takes USDC (Stripe stablecoin payments: Solana, Ethereum, Base, Polygon), and its per-order limit. Paying needs the buyer’s wallet, so it happens in the browser checkout, never unattended.
[**getBuyerCollectionOffer**](BuyerApi.md#getBuyerCollectionOffer) | **GET** /v1/buyer/collection/{id}/offer | What an item in your collection would fetch now: the top open bid on the market for the same variant, condition and grade, and Crossly’s instant offer in store credit when that is switched on (a quote valid for a limited time).
[**getBuyerCollectionSet**](BuyerApi.md#getBuyerCollectionSet) | **GET** /v1/buyer/collection/sets/{category}/{brand}/{model} | One set: every piece (owned or missing, with its lowest ask on the market), what completing it would cost now, and the leaderboard of collectors who opted in, with your rank.
[**getBuyerCompany**](BuyerApi.md#getBuyerCompany) | **GET** /v1/buyer/company | Your buyer company (members, roles, approval limits, shared addresses), or null when you are in none.
[**getBuyerCreation**](BuyerApi.md#getBuyerCreation) | **GET** /v1/buyer/creations/{format}/{id} | A live creation&#39;s public page: its rating breakdown, recent reviews and whether you can review it.
[**getBuyerCreator**](BuyerApi.md#getBuyerCreator) | **GET** /v1/buyer/creators/{handle} | A creator storefront: profile, affiliate code, and shelves of live picks.
[**getBuyerEvent**](BuyerApi.md#getBuyerEvent) | **GET** /v1/buyer/events/{slug} | A seller event: schedule, location, host, linked listings, live show, promo code, RSVP counts and your own RSVP.
[**getBuyerFitVocabulary**](BuyerApi.md#getBuyerFitVocabulary) | **GET** /v1/buyer/fit/vocabulary | Garment kinds and the measurements each takes.
[**getBuyerGiftFinderOption**](BuyerApi.md#getBuyerGiftFinderOption) | **GET** /v1/buyer/gift-finder/options | The gift finder’s questions: recipients, interests, budgets.
[**getBuyerHome**](BuyerApi.md#getBuyerHome) | **GET** /v1/buyer/home | Your home in Crossly World (made on first read).
[**getBuyerHomePlaceable**](BuyerApi.md#getBuyerHomePlaceable) | **GET** /v1/buyer/home/placeable | What you could place in your home: your items and delivered furniture.
[**getBuyerImpact**](BuyerApi.md#getBuyerImpact) | **GET** /v1/buyer/impact | The sourced footprint your secondhand purchases avoided.
[**getBuyerLayaway**](BuyerApi.md#getBuyerLayaway) | **GET** /v1/buyer/layaways/{id} | One layaway and its schedule.
[**getBuyerListingAudioSummary**](BuyerApi.md#getBuyerListingAudioSummary) | **GET** /v1/buyer/listings/{slug}/audio-summary | A spoken summary of a listing (accessibility): the text, built only from the listing’s own fields and the seller’s description, and the recording of it when one exists.
[**getBuyerListingBoughtTogether**](BuyerApi.md#getBuyerListingBoughtTogether) | **GET** /v1/buyer/listings/{slug}/bought-together | Frequently bought together / complete the look.
[**getBuyerListingBreak**](BuyerApi.md#getBuyerListingBreak) | **GET** /v1/buyer/listings/{slug}/break | The card break this listing sells spots in, if any; the seed is revealed after the draw.
[**getBuyerListingCert**](BuyerApi.md#getBuyerListingCert) | **GET** /v1/buyer/listings/{slug}/cert | A graded listing’s cert, checked with the grader: the seller’s claim (grader, grade, cert number), status (verified, mismatch, not_found, or unchecked where the grader has no lookup), population and how many graded higher where the grader publishes them, and the grader’s own cert page.
[**getBuyerListingFit**](BuyerApi.md#getBuyerListingFit) | **GET** /v1/buyer/listings/{slug}/fit | A listing’s flat measurements, compared with your saved reference garments.
[**getBuyerListingGroupBuy**](BuyerApi.md#getBuyerListingGroupBuy) | **GET** /v1/buyer/listings/{slug}/group-buy | The group buy open on this listing, if any.
[**getBuyerListingImpact**](BuyerApi.md#getBuyerListingImpact) | **GET** /v1/buyer/listings/{slug}/impact | The sourced footprint of making a new equivalent; null when no published figure applies.
[**getBuyerListingResaleValue**](BuyerApi.md#getBuyerListingResaleValue) | **GET** /v1/buyer/listings/{slug}/resale-value | What the same brand and category resold for on Crossly, and the buyback offer when enabled.
[**getBuyerListingSubscribeOffer**](BuyerApi.md#getBuyerListingSubscribeOffer) | **GET** /v1/buyer/listings/{slug}/subscribe-offer | The subscribe &amp; save discount and intervals on a listing; null when the seller has none.
[**getBuyerListingTryOn**](BuyerApi.md#getBuyerListingTryOn) | **GET** /v1/buyer/listings/{slug}/try-on | Whether an AI try-on is offered for this listing (a wearable with a photo) and whether the image model is configured.
[**getBuyerLiveStreamAuction**](BuyerApi.md#getBuyerLiveStreamAuction) | **GET** /v1/buyer/live-streams/{id}/auction | The auction running on a live stream right now, if any. Bid on it by its &#x60;slug&#x60; at POST /v1/buyer/auctions/:slug/bids.
[**getBuyerMarketPurchaseOption**](BuyerApi.md#getBuyerMarketPurchaseOption) | **GET** /v1/buyer/market/purchase-options | Before you bid or buy: whether the lowest ask is vault stock (keep it vaulted, or pay fastShipCents to rush it), and the grading runs a raw card can go straight to (pass gradeWith on the bid).
[**getBuyerOrderEligibility**](BuyerApi.md#getBuyerOrderEligibility) | **GET** /v1/buyer/orders/{id}/eligibility | What you can do with one order right now — cancel, confirm receipt, report not received, leave feedback.
[**getBuyerOrderExport**](BuyerApi.md#getBuyerOrderExport) | **GET** /v1/buyer/orders/export | Your order history as CSV text (up to 5,000 orders).
[**getBuyerOrderPriceProtection**](BuyerApi.md#getBuyerOrderPriceProtection) | **GET** /v1/buyer/orders/{id}/price-protection | Price protection on one order: if the item gets cheaper before &#x60;until&#x60;, the difference is credited to your Bucks automatically. &#x60;creditedCents&#x60; is what it has paid so far.
[**getBuyerPack**](BuyerApi.md#getBuyerPack) | **GET** /v1/buyer/packs/{slug} | One pack: tiers and odds, items left, expected value, the chase items still in it.
[**getBuyerPackFairness**](BuyerApi.md#getBuyerPackFairness) | **GET** /v1/buyer/packs/fairness | Your provably-fair seeds: the active server-seed commitment (sha256), your client seed and nonce, and every retired seed in full so past openings can be re-run.
[**getBuyerParty**](BuyerApi.md#getBuyerParty) | **GET** /v1/buyer/parties/{slug} | One shopping party.
[**getBuyerPassport**](BuyerApi.md#getBuyerPassport) | **GET** /v1/buyer/passports/{code} | What a product passport tag opens: the item, the verify verdict (registered, tag bound, tag matches with ?uid&#x3D;, authenticated, graded, in its owner’s hands), how many owners and since when — never who or for how much.
[**getBuyerPreference**](BuyerApi.md#getBuyerPreference) | **GET** /v1/buyer/preferences | The shopping profile derived from that activity.
[**getBuyerPriceGuide**](BuyerApi.md#getBuyerPriceGuide) | **GET** /v1/buyer/price-guide | What matching items actually sold for on Crossly: median, quartiles, by month, and recent sales. Needs q, brand or category.
[**getBuyerProfile**](BuyerApi.md#getBuyerProfile) | **GET** /v1/buyer/profile | Your Crossly shopping profile — name, email, saved address, Bucks balance.
[**getBuyerPurchaseDelivery**](BuyerApi.md#getBuyerPurchaseDelivery) | **GET** /v1/buyer/purchases/{id}/delivery | Where a purchase is going when not to your door: the pickup point (with its release code) or its ship-together consolidation.
[**getBuyerPurchaseLiveMoment**](BuyerApi.md#getBuyerPurchaseLiveMoment) | **GET** /v1/buyer/purchases/{id}/live-moment | The live show a purchase was bought in, with the offset (seconds) into its replay where it sold. null when it was not bought in a show.
[**getBuyerPurchaseReturn**](BuyerApi.md#getBuyerPurchaseReturn) | **GET** /v1/buyer/purchases/{id}/return | What a return would refund for each reason, by when, and any return already open.
[**getBuyerPurchaseStory**](BuyerApi.md#getBuyerPurchaseStory) | **GET** /v1/buyer/purchases/{id}/story | Your owner story on a purchase, passed on to the next owner if you resell it.
[**getBuyerRegistry**](BuyerApi.md#getBuyerRegistry) | **GET** /v1/buyer/registries/{id} | One of your registries: items with how many are wanted and bought.
[**getBuyerRegistryByToken**](BuyerApi.md#getBuyerRegistryByToken) | **GET** /v1/buyer/registry/{token} | A registry as a guest sees it: items, how many are still wanted, and whether it can ship. Never the address.
[**getBuyerRental**](BuyerApi.md#getBuyerRental) | **GET** /v1/buyer/rentals/{id} | One of your rentals: timeline, payments, the return label, extension and buy-out terms.
[**getBuyerRentalEligibility**](BuyerApi.md#getBuyerRentalEligibility) | **GET** /v1/buyer/rentals/eligibility | Can you rent right now: ID-verified (a photo ID and a matching selfie, once), the verified name rentals ship to, and your standing (one rental at a time until your first comes back; none after one that never did).
[**getBuyerSellerClub**](BuyerApi.md#getBuyerSellerClub) | **GET** /v1/buyer/sellers/{sellerUserId}/club | A seller’s loyalty club: its tiers (spend threshold, discount, perks) and your standing. null when the seller has none.
[**getBuyerSellerLoyalty**](BuyerApi.md#getBuyerSellerLoyalty) | **GET** /v1/buyer/sellers/{sellerUserId}/loyalty | A seller’s loyalty club with its typed perks per tier, its join mode (automatic, opt-in, invite-only) and your standing. null when they run none.
[**getBuyerSellerTrust**](BuyerApi.md#getBuyerSellerTrust) | **GET** /v1/buyer/sellers/{username}/trust | Seller at a glance: member since, completed sales, independent rating, typical handling time, dispute rate, trust tier, badges — and the plain sentences the profile shows.
[**getBuyerTogether**](BuyerApi.md#getBuyerTogether) | **GET** /v1/buyer/together/{code} | A shop-together room: members, the board with votes, and chat.
[**getBuyerVaultMarketHistory**](BuyerApi.md#getBuyerVaultMarketHistory) | **GET** /v1/buyer/vault-markets/history | Your Vault Markets value by day at the marks (oldest first, today live) over &#x60;days&#x60; (default 90), and today’s change against yesterday’s close.
[**getBuyerVaultMarketIndex**](BuyerApi.md#getBuyerVaultMarketIndex) | **GET** /v1/buyer/vault-markets/indexes/{slug} | One index with its published daily closes (oldest first, &#x60;days&#x60; default 365) and its level now.
[**getBuyerVaultMarketInstantExit**](BuyerApi.md#getBuyerVaultMarketInstantExit) | **GET** /v1/buyer/vault-markets/instant-exit/{id} | The Instant Exit quote for one vault unit you hold, and whether it can be sold now.
[**getBuyerVaultMarketOptionAnalytic**](BuyerApi.md#getBuyerVaultMarketOptionAnalytic) | **GET** /v1/buyer/vault-markets/options/analytics/{underlying} | Options analytics on an underlying: vol surface and smile, IV rank and percentile, open interest and volume by strike and expiry, put/call ratios, expected move and historical vol. Derived, display only. Read only.
[**getBuyerVaultMarketOptionChain**](BuyerApi.md#getBuyerVaultMarketOptionChain) | **GET** /v1/buyer/vault-markets/options/chain/{underlying} | The option chain for an underlying (index slug or book key): expiries, and for one expiry each strike’s call and put with bid / ask, last, open interest, theoretical price, implied vol (display only) and Greeks. Prices are cents per contract.
[**getBuyerVaultMarketOptionIv**](BuyerApi.md#getBuyerVaultMarketOptionIv) | **GET** /v1/buyer/vault-markets/options/iv/{underlying} | The at-the-money implied vol on an underlying’s nearest expiry, for display: derived from the options book, quality C, never a mark.
[**getBuyerVaultMarketOptionPosition**](BuyerApi.md#getBuyerVaultMarketOptionPosition) | **GET** /v1/buyer/vault-markets/options/positions | Your fractional options positions with their marks, P&amp;L and Greeks (open by default; &#x60;status&#x60; all for closed and settled too). Read only.
[**getBuyerVaultMarketOptionRisk**](BuyerApi.md#getBuyerVaultMarketOptionRisk) | **GET** /v1/buyer/vault-markets/options/risk | Your options portfolio Greeks, a scenario&#39;s P&amp;L (&#x60;priceShift&#x60;, &#x60;volShift&#x60;, &#x60;daysForward&#x60;) and the beta-weighted delta against an index. Read only.
[**getBuyerVaultMarketPredictionBoard**](BuyerApi.md#getBuyerVaultMarketPredictionBoard) | **GET** /v1/buyer/vault-markets/predictions/board | The busiest open prediction markets and their odds (the Trading Floor board). Anonymous.
[**getBuyerVaultMarketPredictionEvent**](BuyerApi.md#getBuyerVaultMarketPredictionEvent) | **GET** /v1/buyer/vault-markets/predictions/events/{id} | One expiry’s markets with your holdings in each and their real worst and best case across them.
[**getBuyerVaultMarketPredictionLeaderboard**](BuyerApi.md#getBuyerVaultMarketPredictionLeaderboard) | **GET** /v1/buyer/vault-markets/predictions/leaderboard | Opt-in forecaster leaderboards (&#x60;period&#x60; week | month | all; &#x60;metric&#x60; pnl | accuracy | brier; &#x60;venue&#x60; live | paper).
[**getBuyerVaultMarketPredictionMarket**](BuyerApi.md#getBuyerVaultMarketPredictionMarket) | **GET** /v1/buyer/vault-markets/predictions/markets/{id} | One prediction market: terms, the Yes ladder (live and practice), recent trades, settlement history and the series rules with their hash.
[**getBuyerVaultMarketPredictionMarketHistory**](BuyerApi.md#getBuyerVaultMarketPredictionMarketHistory) | **GET** /v1/buyer/vault-markets/predictions/markets/{id}/history | A prediction market’s probability over time (display only, never a mark), candles on the Yes price, volume and open interest (&#x60;range&#x60; 1d, 1w, 1m, all; &#x60;venue&#x60; live or paper).
[**getBuyerVaultMarketShare**](BuyerApi.md#getBuyerVaultMarketShare) | **GET** /v1/buyer/vault-markets/shares | Your Vault Shares: shares and percent of each item, cost, implied value at the last share price (display only, never a mark), subscriptions and payouts.
[**getBuyerVaultMarketShareBasket**](BuyerApi.md#getBuyerVaultMarketShareBasket) | **GET** /v1/buyer/vault-markets/shares/baskets/{id} | One theme basket: its series, weights and prices, and your holdings against them.
[**getBuyerVaultMarketShareSery**](BuyerApi.md#getBuyerVaultMarketShareSery) | **GET** /v1/buyer/vault-markets/shares/series/{id} | One Vault Shares series: the offering, the share book, the latest fills, holders as percentages (nobody named) and buyouts.
[**getBuyerVaultMarketShareSeryHistory**](BuyerApi.md#getBuyerVaultMarketShareSeryHistory) | **GET** /v1/buyer/vault-markets/shares/series/{id}/history | A Vault Shares series’ full price history (candles), the offering price and the appraisal history. Display only, never a mark.
[**getBuyerVaultMarketShareSeryPerk**](BuyerApi.md#getBuyerVaultMarketShareSeryPerk) | **GET** /v1/buyer/vault-markets/shares/series/{id}/perks | Your holder perks on a series: badge, visit links, viewing days and your bookings.
[**getBuyerVaultMarketWorth**](BuyerApi.md#getBuyerVaultMarketWorth) | **GET** /v1/buyer/vault-markets/worth | What your vault is worth now: value at the market prices (marks come only from trades) split into reliable and indicative marks, cost and P&amp;L, today’s change, and an estimate of what the units free to sell would fetch from the bids resting on the book now. Read only.
[**getBuyerWholesaleCart**](BuyerApi.md#getBuyerWholesaleCart) | **GET** /v1/buyer/wholesale/cart | Your cart grouped per seller: trade terms, the order-minimum progress, every rule the cart breaks (the messages checkout would refuse with), PO reference, quote-locked lines, and the checkout methods, deposit and freight threshold for each group.
[**getBuyerWholesaleCatalogApply**](BuyerApi.md#getBuyerWholesaleCatalogApply) | **GET** /v1/buyer/wholesale/catalogs/{storeSlug}/{catalogSlug}/apply | The application form for a store&#39;s wholesale catalog: the seller&#39;s requirements (resale certificate and accepted states, tax id, their custom questions) and your business info pre-filled. applicable&#x3D;false for a catalog you cannot apply to.
[**getBuyerWholesaleDrop**](BuyerApi.md#getBuyerWholesaleDrop) | **GET** /v1/buyer/wholesale/drops/{id} | One trade drop open to you: its listings once live (add one to your cart to reserve or buy it), and your reservations in it. 404 for a drop not open to you.
[**getBuyerWholesaleInvoicePayQuote**](BuyerApi.md#getBuyerWholesaleInvoicePayQuote) | **GET** /v1/buyer/wholesale/invoices/{id}/pay-quote | What paying an on-account invoice costs now: balance due, the early-pay discount if still open, the minimum part payment and the methods (card, ach).
[**getBuyerWholesaleOrderSheet**](BuyerApi.md#getBuyerWholesaleOrderSheet) | **GET** /v1/buyer/wholesale/order-sheets/{id} | One order sheet priced TODAY at its quantities, with stock, trade terms and flags (unavailable, out_of_stock, short_stock, price_hidden, needs_option).
[**getBuyerWholesaleQuote**](BuyerApi.md#getBuyerWholesaleQuote) | **GET** /v1/buyer/wholesale/quotes/{id} | One of your quotes with its items, the seller&#39;s prices and expiry.
[**getBuyerWholesaleReorder**](BuyerApi.md#getBuyerWholesaleReorder) | **GET** /v1/buyer/wholesale/reorder/{id} | Buy again: a past wholesale order (purchase or order id) as order-sheet lines at the same quantities, priced today, out-of-stock flagged.
[**listBuyerActivity**](BuyerApi.md#listBuyerActivity) | **GET** /v1/buyer/activity | What this buyer has compared lately.
[**listBuyerAuctionBids**](BuyerApi.md#listBuyerAuctionBids) | **GET** /v1/buyer/auctions/{slug}/bids | An auction’s bid history, highest first, bidders anonymised.
[**listBuyerAuctions**](BuyerApi.md#listBuyerAuctions) | **GET** /v1/buyer/auctions | Auctions you have bid in — bidding, won or lost (last 100).
[**listBuyerBoards**](BuyerApi.md#listBuyerBoards) | **GET** /v1/buyer/boards | Your outfit boards: collages of listings, each with a share link.
[**listBuyerBreaks**](BuyerApi.md#listBuyerBreaks) | **GET** /v1/buyer/breaks | Card-break spots you hold or bought, with what each pulled.
[**listBuyerBuybacks**](BuyerApi.md#listBuyerBuybacks) | **GET** /v1/buyer/buybacks | Your buyback guarantees and requests.
[**listBuyerCart**](BuyerApi.md#listBuyerCart) | **GET** /v1/buyer/cart | What is in your Crossly cart.
[**listBuyerCartSaved**](BuyerApi.md#listBuyerCartSaved) | **GET** /v1/buyer/cart/saved | Items you saved for later out of your cart (last 200).
[**listBuyerCases**](BuyerApi.md#listBuyerCases) | **GET** /v1/buyer/cases | Resolution center — every case you opened (returns, not received, problems).
[**listBuyerCashback**](BuyerApi.md#listBuyerCashback) | **GET** /v1/buyer/cashback | Your Scout cashback — pending, confirmed, paid.
[**listBuyerCatalogListingVideos**](BuyerApi.md#listBuyerCatalogListingVideos) | **GET** /v1/buyer/catalog/listings/{slug}/videos | Videos the seller recorded for this item on request, newest first, with the question each one answers.
[**listBuyerClubs**](BuyerApi.md#listBuyerClubs) | **GET** /v1/buyer/clubs | Sellers’ loyalty clubs you belong to: your spend with each, your tier and its discount, and the next tier.
[**listBuyerCollectionSets**](BuyerApi.md#listBuyerCollectionSets) | **GET** /v1/buyer/collection/sets | Sets you are collecting — a catalogue brand + model you own at least two pieces of — with owned / total and percent complete, most complete first; and whether you show on set leaderboards.
[**listBuyerCompanyApprovals**](BuyerApi.md#listBuyerCompanyApprovals) | **GET** /v1/buyer/company/approvals | Spend approval requests (owners and accounts payable see all; others their own). ?status&#x3D;pending|approved|declined|used|expired.
[**listBuyerConsolidations**](BuyerApi.md#listBuyerConsolidations) | **GET** /v1/buyer/consolidations | Your ship-together orders: parcels at the hub, and the one box out.
[**listBuyerConversationGuests**](BuyerApi.md#listBuyerConversationGuests) | **GET** /v1/buyer/conversations/{id}/guests | Guests in a chat.
[**listBuyerCreationReviewable**](BuyerApi.md#listBuyerCreationReviewable) | **GET** /v1/buyer/creations/reviewable | Creations you bought (decor, wearables, interactive objects, cards from packs) and your review of each.
[**listBuyerEvents**](BuyerApi.md#listBuyerEvents) | **GET** /v1/buyer/events | Upcoming and live seller events across Crossly, soonest first.
[**listBuyerFeedback**](BuyerApi.md#listBuyerFeedback) | **GET** /v1/buyer/feedback | Feedback you have left sellers, newest first — with the ids you revise by.
[**listBuyerFeedbackPending**](BuyerApi.md#listBuyerFeedbackPending) | **GET** /v1/buyer/feedback/pending | Orders from the last 60 days that are on their way or arrived and still need your feedback.
[**listBuyerFitRefs**](BuyerApi.md#listBuyerFitRefs) | **GET** /v1/buyer/fit/refs | Your saved reference garments for fit comparison.
[**listBuyerFollowingSellers**](BuyerApi.md#listBuyerFollowingSellers) | **GET** /v1/buyer/following/sellers | Sellers you follow, with how many new listings each has since you last looked.
[**listBuyerGiftCardCredit**](BuyerApi.md#listBuyerGiftCardCredit) | **GET** /v1/buyer/gift-cards/credit | Gift card credit on your account, and when it expires.
[**listBuyerGiftCards**](BuyerApi.md#listBuyerGiftCards) | **GET** /v1/buyer/gift-cards | Gift cards you bought, newest first.
[**listBuyerGiftFinder**](BuyerApi.md#listBuyerGiftFinder) | **GET** /v1/buyer/gift-finder | Live listings for a recipient, interest and budget.
[**listBuyerGiftSent**](BuyerApi.md#listBuyerGiftSent) | **GET** /v1/buyer/gifts/sent | Items you sent as gifts: whether the teaser went out, whether it arrived and was opened, and any thank-you. Send one with &#x60;gift&#x60; on checkout.
[**listBuyerHomeBuilders**](BuyerApi.md#listBuyerHomeBuilders) | **GET** /v1/buyer/home/builders | Your co-builders: friends who may arrange your home with you.
[**listBuyerHomeBuilding**](BuyerApi.md#listBuyerHomeBuilding) | **GET** /v1/buyer/homes/building | The homes you co-build, to visit and arrange.
[**listBuyerHotspots**](BuyerApi.md#listBuyerHotspots) | **GET** /v1/buyer/hotspots | Shop-the-look tags on a story or lookbook photo: each tagged listing and where it sits on the image (x, y as fractions).
[**listBuyerHunts**](BuyerApi.md#listBuyerHunts) | **GET** /v1/buyer/hunts | Your buyer-agent hunts and what they did.
[**listBuyerInstantOffers**](BuyerApi.md#listBuyerInstantOffers) | **GET** /v1/buyer/instant-offers | Your instant offers: live quotes, accepted ones awaiting a label, approved ones (with the prepaid label) and paid ones.
[**listBuyerLayaways**](BuyerApi.md#listBuyerLayaways) | **GET** /v1/buyer/layaways | Your layaways: price, paid so far, what is left, and the installment schedule. Put an item on layaway at checkout with layawayItemIds.
[**listBuyerListingQuickQuestions**](BuyerApi.md#listBuyerListingQuickQuestions) | **GET** /v1/buyer/listings/{slug}/quick-questions | One-tap questions this listing supports; send one as &#x60;quick&#x60; on a message.
[**listBuyerListingSellerReviews**](BuyerApi.md#listBuyerListingSellerReviews) | **GET** /v1/buyer/listings/{slug}/seller-reviews | The seller’s public reviews: summary, text, photos, replies.
[**listBuyerLiveShipments**](BuyerApi.md#listBuyerLiveShipments) | **GET** /v1/buyer/live-shipments | Your one-box-per-show shipments: every order won in a show ships together, and postage is charged once (the rest refunded when it ships).
[**listBuyerLiveStreamLineup**](BuyerApi.md#listBuyerLiveStreamLineup) | **GET** /v1/buyer/live-streams/{id}/lineup | What a live show will sell, in order: each item, its price, and whether it is still available.
[**listBuyerLoyalty**](BuyerApi.md#listBuyerLoyalty) | **GET** /v1/buyer/loyalty | Your loyalty clubs: the tier you hold, progress and how to reach the next tier, the typed perks you hold now, and your history.
[**listBuyerMarketBids**](BuyerApi.md#listBuyerMarketBids) | **GET** /v1/buyer/market/bids | Your resting market bids.
[**listBuyerMarketWatches**](BuyerApi.md#listBuyerMarketWatches) | **GET** /v1/buyer/market/watches | Market variants you watch, with the price you are waiting for.
[**listBuyerOffers**](BuyerApi.md#listBuyerOffers) | **GET** /v1/buyer/offers | Offers you have made, newest first (last 100).
[**listBuyerOrders**](BuyerApi.md#listBuyerOrders) | **GET** /v1/buyer/orders | What you have bought on Crossly, newest first.
[**listBuyerPackOpenings**](BuyerApi.md#listBuyerPackOpenings) | **GET** /v1/buyer/pack-openings | Your pulls: what you got, its value, sell-back status, and the fairness proof for each (the server seed once rotated).
[**listBuyerPacks**](BuyerApi.md#listBuyerPacks) | **GET** /v1/buyer/packs | Packs you can open: price, every tier with its published odds, what is left in it and its value range, and the expected value of one opening.
[**listBuyerParties**](BuyerApi.md#listBuyerParties) | **GET** /v1/buyer/parties | Themed shopping parties, live and upcoming.
[**listBuyerPartyListings**](BuyerApi.md#listBuyerPartyListings) | **GET** /v1/buyer/parties/{slug}/listings | Listings shared to a party, featured first.
[**listBuyerPaymentMethods**](BuyerApi.md#listBuyerPaymentMethods) | **GET** /v1/buyer/payment-methods | Your saved cards, the default first.
[**listBuyerPickupPoints**](BuyerApi.md#listBuyerPickupPoints) | **GET** /v1/buyer/pickup-points | Carrier pickup points (UPS Access Point / FedEx Hold at Location) near an address; pass one as &#x60;pickupPoint&#x60; to POST /v1/buyer/checkout.
[**listBuyerProtectionPlans**](BuyerApi.md#listBuyerProtectionPlans) | **GET** /v1/buyer/protection-plans | Your protection plans (bought at checkout with &#x60;protection&#x60;): status, term, coverage, contract id, and any refund.
[**listBuyerRegistries**](BuyerApi.md#listBuyerRegistries) | **GET** /v1/buyer/registries | Your gift registries.
[**listBuyerRegistryGifts**](BuyerApi.md#listBuyerRegistryGifts) | **GET** /v1/buyer/registries/{id}/gifts | Your thank-you list: who bought what off the registry, and whether you have thanked them.
[**listBuyerRegistrySearch**](BuyerApi.md#listBuyerRegistrySearch) | **GET** /v1/buyer/registries/search | Find a registry by its name or the registrant’s name. Current and recent registries only.
[**listBuyerRentals**](BuyerApi.md#listBuyerRentals) | **GET** /v1/buyer/rentals | Your rentals: dates, status (reserved, out, returned, claimed, closed, cancelled), the return label, and what happened to the deposit.
[**listBuyerSizeMemoryPrompts**](BuyerApi.md#listBuyerSizeMemoryPrompts) | **GET** /v1/buyer/size-memory/prompts | Delivered orders with a size that you haven’t said how they fit (the last 60 days).
[**listBuyerSizeMemorySizes**](BuyerApi.md#listBuyerSizeMemorySizes) | **GET** /v1/buyer/size-memory/sizes | The sizes learned from what you bought and kept, by kind of item (shoes, tops, bottoms, dresses, outerwear) and department.
[**listBuyerSplits**](BuyerApi.md#listBuyerSplits) | **GET** /v1/buyer/splits | Purchases you split, with each share’s status.
[**listBuyerStoreListings**](BuyerApi.md#listBuyerStoreListings) | **GET** /v1/buyer/stores/{slug}/listings | A store&#39;s live listings, filtered by tag, category, text and program chips (f: on_sale, discount_eligible, code_eligible, group_buy_active, rentable, wholesale_available…; all must hold), sorted; each card carries its program badges.
[**listBuyerSubscriptions**](BuyerApi.md#listBuyerSubscriptions) | **GET** /v1/buyer/subscriptions | Your subscribe &amp; save standing orders.
[**listBuyerTogether**](BuyerApi.md#listBuyerTogether) | **GET** /v1/buyer/together | Shop-together rooms you are in.
[**listBuyerTotalRequests**](BuyerApi.md#listBuyerTotalRequests) | **GET** /v1/buyer/total-requests | Your combined-shipping total requests, newest per seller.
[**listBuyerTryOns**](BuyerApi.md#listBuyerTryOns) | **GET** /v1/buyer/try-ons | Your AI try-ons: the rendered images (labelled AI-generated wherever shown).
[**listBuyerVault**](BuyerApi.md#listBuyerVault) | **GET** /v1/buyer/vault | What you own in the Crossly vault: stored (authenticated, on a shelf), listed for sale, or on its way home — with the price to ship one home.
[**listBuyerVaultMarketHoldings**](BuyerApi.md#listBuyerVaultMarketHoldings) | **GET** /v1/buyer/vault-markets/holdings | Each unit you hold in the vault at its market price, with the mark’s quality (A or B reliable, C indicative, none), cost, P&amp;L and where it stands (stored, listed, lent, pledged, at the grader); &#x60;meta&#x60; carries the totals and the units you have out on loan.
[**listBuyerVaultMarketIndexes**](BuyerApi.md#listBuyerVaultMarketIndexes) | **GET** /v1/buyer/vault-markets/indexes | Crossly indexes over vault book keys (category, brand, curated, composite, segment, and your own), each with its level now and change since the last daily close. Index levels are valued only from the book’s marks.
[**listBuyerVaultMarketInstantExit**](BuyerApi.md#listBuyerVaultMarketInstantExit) | **GET** /v1/buyer/vault-markets/instant-exit | Instant Exit quotes for what you hold, one per book key: the best resting bid (yours left out), its share of the mark, the bid levels, units held and which are free to sell, and why a key cannot be sold instantly. A quote, not an order.
[**listBuyerVaultMarketOptionCombos**](BuyerApi.md#listBuyerVaultMarketOptionCombos) | **GET** /v1/buyer/vault-markets/options/combos | Your options strategies (working by default) with their legs, net price per unit and fills. Read only.
[**listBuyerVaultMarketOptionNotices**](BuyerApi.md#listBuyerVaultMarketOptionNotices) | **GET** /v1/buyer/vault-markets/options/notices | Your options notices: expiry warnings, auto-closes, exercises, assignments, expiries worthless and rolls. Read only.
[**listBuyerVaultMarketOptionSeries**](BuyerApi.md#listBuyerVaultMarketOptionSeries) | **GET** /v1/buyer/vault-markets/options/series | Fractional options series on Crossly prices (indexes, and tier A item keys with 90 days of reliable marks): underlying, status and eligibility. Read only.
[**listBuyerVaultMarketOptionStrategies**](BuyerApi.md#listBuyerVaultMarketOptionStrategies) | **GET** /v1/buyer/vault-markets/options/strategies | The options strategies the picker builds (vertical, calendar, diagonal, straddle, strangle, butterfly, iron condor, collar) and what each does. Read only.
[**listBuyerVaultMarketPredictionComments**](BuyerApi.md#listBuyerVaultMarketPredictionComments) | **GET** /v1/buyer/vault-markets/predictions/comments | A prediction market’s (or series’) discussion thread. Read only.
[**listBuyerVaultMarketPredictionMarkets**](BuyerApi.md#listBuyerVaultMarketPredictionMarkets) | **GET** /v1/buyer/vault-markets/predictions/markets | \&quot;Will it hit?\&quot; prediction markets on Crossly prices (filter by book key, index slug, kind, status, expiry or text): strike, expiry, best Yes bid and ask, last price and the probability (the market&#39;s own price, display only).
[**listBuyerVaultMarketPredictionPositions**](BuyerApi.md#listBuyerVaultMarketPredictionPositions) | **GET** /v1/buyer/vault-markets/predictions/positions | Your prediction positions (practice and live): side, contracts, cost, value at the last price, payout or refund once settled.
[**listBuyerVaultMarketShareAutoInvest**](BuyerApi.md#listBuyerVaultMarketShareAutoInvest) | **GET** /v1/buyer/vault-markets/shares/auto-invest | Your recurring Vault Shares auto-invest plans.
[**listBuyerVaultMarketShareBaskets**](BuyerApi.md#listBuyerVaultMarketShareBaskets) | **GET** /v1/buyer/vault-markets/shares/baskets | Theme baskets: model portfolios of Vault Shares series you would own directly, never a fund.
[**listBuyerVaultMarketShareDrops**](BuyerApi.md#listBuyerVaultMarketShareDrops) | **GET** /v1/buyer/vault-markets/shares/drops | Upcoming and open Vault Shares drops: phase, countdown, allocation (first come, pro-rata or lottery), your Crossly One early-access time (never a better price).
[**listBuyerVaultMarketShareGifts**](BuyerApi.md#listBuyerVaultMarketShareGifts) | **GET** /v1/buyer/vault-markets/shares/gifts | Vault Shares gifts you sent or were offered.
[**listBuyerVaultMarketShareSeries**](BuyerApi.md#listBuyerVaultMarketShareSeries) | **GET** /v1/buyer/vault-markets/shares/series | Vault Shares series: open offerings first, then trading. Terms, progress, last share price and implied item value, and your holding.
[**listBuyerVaultMarketWatchlist**](BuyerApi.md#listBuyerVaultMarketWatchlist) | **GET** /v1/buyer/vault-markets/watchlist | The book keys you watch, with mark and its quality, 24 h and 7 d change, and the last 30 daily marks.
[**listBuyerVideoRequests**](BuyerApi.md#listBuyerVideoRequests) | **GET** /v1/buyer/video-requests | Your video requests and their answers.
[**listBuyerWalletPerks**](BuyerApi.md#listBuyerWalletPerks) | **GET** /v1/buyer/wallet/perks | The perks your wallets unlock: each Collection holders deal (a shop’s percent off for holders of a collection) and creator shop perk on a collection a linked wallet or your Crossly wallet holds, best first. Checkout applies the best one; perks never stack with each other.
[**listBuyerWholesaleDrops**](BuyerApi.md#listBuyerWholesaleDrops) | **GET** /v1/buyer/wholesale/drops | Upcoming and live trade drops open to you: drops sellers release only to their approved trade buyers or to a catalog audience. kind prebook &#x3D; reserve quantity now with a deposit (depositBps) at checkout; the balance is invoiced when the seller releases the stock.
[**listBuyerWholesaleFreightRequests**](BuyerApi.md#listBuyerWholesaleFreightRequests) | **GET** /v1/buyer/wholesale/freight-requests | Your freight (LTL) quote requests to sellers, with the seller&#39;s figure in cents once quoted.
[**listBuyerWholesaleOrderSheets**](BuyerApi.md#listBuyerWholesaleOrderSheets) | **GET** /v1/buyer/wholesale/order-sheets | Your saved wholesale order sheets (one seller each), newest first.
[**listBuyerWholesaleOrders**](BuyerApi.md#listBuyerWholesaleOrders) | **GET** /v1/buyer/wholesale/orders | Your past wholesale orders (trade-priced or on account), newest first — the starting point for reorder.
[**listBuyerWholesalePrebooks**](BuyerApi.md#listBuyerWholesalePrebooks) | **GET** /v1/buyer/wholesale/prebooks | Your pre-books: the drop, item, quantity, deposit paid, balance, status (awaiting_release, invoiced, paid, cancelled, failed) and the balance invoice once the seller released the stock.
[**listBuyerWholesaleQuotes**](BuyerApi.md#listBuyerWholesaleQuotes) | **GET** /v1/buyer/wholesale/quotes | Your requests for a quote (RFQ) to wholesale sellers. ?status&#x3D;open|all|requested|answered|accepted|declined|withdrawn|expired. An answered or accepted quote past expiresAt reads expired.
[**listBuyerWholesaleStatement**](BuyerApi.md#listBuyerWholesaleStatement) | **GET** /v1/buyer/wholesale/statement | Your open trade balances per seller in aging buckets (current, 1-30, 31-60, 61-90, 90+ days past due), with the invoices behind them.
[**listBuyerWholesaleSuppliers**](BuyerApi.md#listBuyerWholesaleSuppliers) | **GET** /v1/buyer/wholesale/suppliers | The sellers you trade with: catalogs you can open, your terms (net days, credit limit, discount), customer groups, and what you owe each.
[**listBuyerWishlistItems**](BuyerApi.md#listBuyerWishlistItems) | **GET** /v1/buyer/wishlists/{id}/items | What is on one wishlist.
[**listBuyerWishlistMembers**](BuyerApi.md#listBuyerWishlistMembers) | **GET** /v1/buyer/wishlists/{id}/members | Co-editors of a shared wishlist.
[**listBuyerWishlists**](BuyerApi.md#listBuyerWishlists) | **GET** /v1/buyer/wishlists | Your wishlists.
[**updateBuyerBoard**](BuyerApi.md#updateBuyerBoard) | **PATCH** /v1/buyer/boards/{id} | Rename a board, change its description, or make it public / private.
[**updateBuyerBoardLayout**](BuyerApi.md#updateBuyerBoardLayout) | **PUT** /v1/buyer/boards/{id}/layout | Replace a board’s layout: items by platform listing id or slug, with x, y, w (0–1) and z. At most 40.
[**updateBuyerCollectionSetLeaderboard**](BuyerApi.md#updateBuyerCollectionSetLeaderboard) | **PUT** /v1/buyer/collection/sets/leaderboard | Show or hide yourself (by your public handle) on set leaderboards.
[**updateBuyerCompany**](BuyerApi.md#updateBuyerCompany) | **PATCH** /v1/buyer/company | Rename the company or change its tax id / website (owner).
[**updateBuyerCompanyAddress**](BuyerApi.md#updateBuyerCompanyAddress) | **PUT** /v1/buyer/company/addresses | Replace the shared address book (owner): addresses [{ id, label, name, line1, line2?, city, region, postalCode, country, phone?, isDefault? }], at most 20.
[**updateBuyerCompanyMember**](BuyerApi.md#updateBuyerCompanyMember) | **PATCH** /v1/buyer/company/members/{id} | Change a member&#39;s role or approval limit (owner). The last owner stays an owner.
[**updateBuyerCreationReview**](BuyerApi.md#updateBuyerCreationReview) | **PUT** /v1/buyer/creations/{format}/{id}/review | Review a creation you bought (or change your review): 1-5 stars and an optional comment.
[**updateBuyerFeedback**](BuyerApi.md#updateBuyerFeedback) | **PATCH** /v1/buyer/feedback/{id} | Revise feedback you left, within 60 days.
[**updateBuyerHome**](BuyerApi.md#updateBuyerHome) | **PATCH** /v1/buyer/home | Who may walk in (privacy), the lighting (theme), wallpaper/floor/mood decor and whether visitors see your vault wall values.
[**updateBuyerHomeBuilder**](BuyerApi.md#updateBuyerHomeBuilder) | **PUT** /v1/buyer/home/builders | Set your co-builders (friends only, at most 4).
[**updateBuyerHomeLayout**](BuyerApi.md#updateBuyerHomeLayout) | **PUT** /v1/buyer/home/layout | Arrange your home: the whole layout, checked against what you own.
[**updateBuyerHunt**](BuyerApi.md#updateBuyerHunt) | **PATCH** /v1/buyer/hunts/{id} | Pause, resume or stop a hunt.
[**updateBuyerPaymentMethodDefault**](BuyerApi.md#updateBuyerPaymentMethodDefault) | **PUT** /v1/buyer/payment-methods/{id}/default | Make one of your saved cards the default.
[**updateBuyerPurchaseStory**](BuyerApi.md#updateBuyerPurchaseStory) | **PUT** /v1/buyer/purchases/{id}/story | Write your owner story (280 characters); it travels with the item if you resell it.
[**updateBuyerRegistry**](BuyerApi.md#updateBuyerRegistry) | **PATCH** /v1/buyer/registries/{id} | Edit a registry: title, kind, date, message, ship-to address.
[**updateBuyerRegistryItem**](BuyerApi.md#updateBuyerRegistryItem) | **PUT** /v1/buyer/registries/{id}/items/{platformListingId} | How many of an item you want (1–50).
[**updateBuyerSubscription**](BuyerApi.md#updateBuyerSubscription) | **PATCH** /v1/buyer/subscriptions/{id} | Pause, resume, skip the next delivery, change the interval, or cancel.
[**updateBuyerWholesaleCartPo**](BuyerApi.md#updateBuyerWholesaleCartPo) | **PUT** /v1/buyer/wholesale/cart/po | Set the PO reference for one seller&#39;s group of your cart: { sellerUserId, poReference } (empty clears it).
[**updateBuyerWholesaleOrderSheet**](BuyerApi.md#updateBuyerWholesaleOrderSheet) | **PATCH** /v1/buyer/wholesale/order-sheets/{id} | Rename an order sheet, change its PO reference or note, or replace its lines.
[**updateBuyerWishlist**](BuyerApi.md#updateBuyerWishlist) | **PATCH** /v1/buyer/wishlists/{id} | Rename a wishlist, or make it public / private.


<a name="createBuyerActivity"></a>
# **createBuyerActivity**
> CreateBuyerActivityResponse createBuyerActivity(createBuyerActivityRequest)

Report an item your user is looking at, and get our answer.

Records the look and returns whether Crossly has the item and at what price. Send an identifier and a store DOMAIN — a full URL is refused. Nothing about the page itself is stored.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    CreateBuyerActivityRequest createBuyerActivityRequest = new CreateBuyerActivityRequest(); // CreateBuyerActivityRequest | 
    try {
      CreateBuyerActivityResponse result = apiInstance.createBuyerActivity(createBuyerActivityRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerActivity");
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
 **createBuyerActivityRequest** | **CreateBuyerActivityRequest**|  |

### Return type

**CreateBuyerActivityResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="createBuyerAuctionBid"></a>
# **createBuyerAuctionBid**
> CreateBuyerAuctionBidResponse createBuyerAuctionBid(slug, createBuyerAuctionBidRequest)

Place a bid, optionally with a proxy maximum. A WINNING BID IS CHARGED AUTOMATICALLY.

Spends money: if you win, your saved card is charged when the auction closes, with nobody present. Requires buyer:checkout:write AND this key switched on at PUT /v1/buyer/checkout/controls; the bid’s maximum (or amount) is checked against the key’s per-order and daily ceilings. Amounts are integer cents. &#x60;leading: false&#x60; means a standing proxy bid outbid you at once. Send an Idempotency-Key: a retried bid is a second bid.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | The auction listing slug.
    CreateBuyerAuctionBidRequest createBuyerAuctionBidRequest = new CreateBuyerAuctionBidRequest(); // CreateBuyerAuctionBidRequest | 
    try {
      CreateBuyerAuctionBidResponse result = apiInstance.createBuyerAuctionBid(slug, createBuyerAuctionBidRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerAuctionBid");
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
 **slug** | **String**| The auction listing slug. |
 **createBuyerAuctionBidRequest** | **CreateBuyerAuctionBidRequest**|  |

### Return type

**CreateBuyerAuctionBidResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="createBuyerAuctionPay"></a>
# **createBuyerAuctionPay**
> CreateBuyerAuctionPayResponse createBuyerAuctionPay(slug)

Pay for an auction you won whose automatic charge did not go through.

Returns a Stripe client secret to confirm on the buyer’s device (3-D Secure, a new card). Charges nothing by itself. &#x60;paid: true&#x60; means there is nothing left to pay.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | The auction listing slug.
    try {
      CreateBuyerAuctionPayResponse result = apiInstance.createBuyerAuctionPay(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerAuctionPay");
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
 **slug** | **String**| The auction listing slug. |

### Return type

**CreateBuyerAuctionPayResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerAuctionRetract"></a>
# **createBuyerAuctionRetract**
> CreateBuyerAuctionRetractResponse createBuyerAuctionRetract(slug, createBuyerAuctionRetractRequest)

Retract your bids under eBay’s rules — a typo, a changed listing, or an unreachable seller.

With 12 hours or more left every bid of yours is withdrawn; inside 12 hours only bids placed in the last hour. Proxy answers your bid triggered are withdrawn with it.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | The auction listing slug.
    CreateBuyerAuctionRetractRequest createBuyerAuctionRetractRequest = new CreateBuyerAuctionRetractRequest(); // CreateBuyerAuctionRetractRequest | 
    try {
      CreateBuyerAuctionRetractResponse result = apiInstance.createBuyerAuctionRetract(slug, createBuyerAuctionRetractRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerAuctionRetract");
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
 **slug** | **String**| The auction listing slug. |
 **createBuyerAuctionRetractRequest** | **CreateBuyerAuctionRetractRequest**|  |

### Return type

**CreateBuyerAuctionRetractResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="createBuyerBoard"></a>
# **createBuyerBoard**
> CreateBuyerBoardResponse createBuyerBoard()

Create an outfit board.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      CreateBuyerBoardResponse result = apiInstance.createBuyerBoard();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerBoard");
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

**CreateBuyerBoardResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerBoardItem"></a>
# **createBuyerBoardItem**
> BuyerResponse createBuyerBoardItem(id)

Add a listing (by slug) to a board, at the next free spot.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerResponse result = apiInstance.createBuyerBoardItem(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerBoardItem");
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

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerBreakSpotHold"></a>
# **createBuyerBreakSpotHold**
> CreateBuyerBreakSpotHoldResponse createBuyerBreakSpotHold(id, spotId)

Hold a spot in a pick-your-spot break, then buy it through checkout before the hold lapses.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    String spotId = "spotId_example"; // String | 
    try {
      CreateBuyerBreakSpotHoldResponse result = apiInstance.createBuyerBreakSpotHold(id, spotId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerBreakSpotHold");
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
 **spotId** | **String**|  |

### Return type

**CreateBuyerBreakSpotHoldResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerBuybackRequest"></a>
# **createBuyerBuybackRequest**
> BuyerResponse createBuyerBuybackRequest(id)

Ask Crossly to buy an item back under its buyback guarantee.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerResponse result = apiInstance.createBuyerBuybackRequest(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerBuybackRequest");
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

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerCartItem"></a>
# **createBuyerCartItem**
> CreateBuyerCartItemResponse createBuyerCartItem(createBuyerCartItemRequest)

Add a listing to your cart.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    CreateBuyerCartItemRequest createBuyerCartItemRequest = new CreateBuyerCartItemRequest(); // CreateBuyerCartItemRequest | 
    try {
      CreateBuyerCartItemResponse result = apiInstance.createBuyerCartItem(createBuyerCartItemRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerCartItem");
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
 **createBuyerCartItemRequest** | **CreateBuyerCartItemRequest**|  |

### Return type

**CreateBuyerCartItemResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="createBuyerCartItemSaveForLater"></a>
# **createBuyerCartItemSaveForLater**
> BuyerCartResponse createBuyerCartItemSaveForLater(id)

Move a cart line to saved-for-later.

Returns the whole saved list. A line from an accepted offer cannot be saved — its price only holds in the cart.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The id.
    try {
      BuyerCartResponse result = apiInstance.createBuyerCartItemSaveForLater(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerCartItemSaveForLater");
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
 **id** | **UUID**| The id. |

### Return type

**BuyerCartResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerCartOptimizer"></a>
# **createBuyerCartOptimizer**
> CreateBuyerCartOptimizerResponse createBuyerCartOptimizer()

Cart optimizer: send a shopping list (one item per line, \&quot;2 Charizard Base Set\&quot;) and get the cheapest delivered basket across sellers — one pick per line, items + each seller’s shipping with free-shipping thresholds applied. fewestPackages prefers fewer sellers. Nothing is added to the cart.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      CreateBuyerCartOptimizerResponse result = apiInstance.createBuyerCartOptimizer();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerCartOptimizer");
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

**CreateBuyerCartOptimizerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerCartQuote"></a>
# **createBuyerCartQuote**
> CreateBuyerCartQuoteResponse createBuyerCartQuote()

Price the cart, delivered — item, shipping, tax, total.

Runs the real checkout cascade and returns the totals instead of charging. Nothing is purchased. &#x60;taxComplete: false&#x60; means there is no saved delivery address, so the total is a floor rather than a final figure. &#x60;shippingOptions&#x60; lists each seller’s shipping services; send &#x60;shippingServiceBySeller&#x60; to price a different speed (an id the seller does not offer to the destination is a 400). Optional body: &#x60;{ \&quot;shippingServiceBySeller\&quot;: { \&quot;&lt;sellerUserId&gt;\&quot;: \&quot;&lt;serviceId&gt;\&quot; } }&#x60; — omitted sellers get the cheapest service; &#x60;registryToken&#x60; prices it as a gift shipped to that registry. (No body JSON schema: existing callers POST with none.)

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      CreateBuyerCartQuoteResponse result = apiInstance.createBuyerCartQuote();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerCartQuote");
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

**CreateBuyerCartQuoteResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerCartSavedMoveToCart"></a>
# **createBuyerCartSavedMoveToCart**
> BuyerCartResponse createBuyerCartSavedMoveToCart(id)

Move a saved item back into your cart, at today’s price.

Refused when the item has sold or delisted. Returns the remaining saved list.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The id.
    try {
      BuyerCartResponse result = apiInstance.createBuyerCartSavedMoveToCart(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerCartSavedMoveToCart");
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
 **id** | **UUID**| The id. |

### Return type

**BuyerCartResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerCaseCounter"></a>
# **createBuyerCaseCounter**
> BuyerResponse createBuyerCaseCounter(id, createBuyerCaseCounterRequest)

Propose your own refund figure on a case.

In cents, at most what you paid. The case goes back to the seller for 72 hours.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The id.
    CreateBuyerCaseCounterRequest createBuyerCaseCounterRequest = new CreateBuyerCaseCounterRequest(); // CreateBuyerCaseCounterRequest | 
    try {
      BuyerResponse result = apiInstance.createBuyerCaseCounter(id, createBuyerCaseCounterRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerCaseCounter");
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
 **id** | **UUID**| The id. |
 **createBuyerCaseCounterRequest** | **CreateBuyerCaseCounterRequest**|  |

### Return type

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="createBuyerCaseEscalate"></a>
# **createBuyerCaseEscalate**
> BuyerResponse createBuyerCaseEscalate(id)

Ask Crossly to step in on a case.

Hands the case to Crossly’s reviewers. Refused once it is closed or already escalated.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The id.
    try {
      BuyerResponse result = apiInstance.createBuyerCaseEscalate(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerCaseEscalate");
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
 **id** | **UUID**| The id. |

### Return type

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerCaseMessage"></a>
# **createBuyerCaseMessage**
> BuyerResponse createBuyerCaseMessage(id, createBuyerCaseMessageRequest)

Post a message on a case thread.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The id.
    CreateBuyerCaseMessageRequest createBuyerCaseMessageRequest = new CreateBuyerCaseMessageRequest(); // CreateBuyerCaseMessageRequest | 
    try {
      BuyerResponse result = apiInstance.createBuyerCaseMessage(id, createBuyerCaseMessageRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerCaseMessage");
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
 **id** | **UUID**| The id. |
 **createBuyerCaseMessageRequest** | **CreateBuyerCaseMessageRequest**|  |

### Return type

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="createBuyerCaseRespond"></a>
# **createBuyerCaseRespond**
> BuyerResponse createBuyerCaseRespond(id, createBuyerCaseRespondRequest)

Accept or reject the seller’s partial-refund offer on a case.

Accepting refunds the offered amount and closes the case. Rejecting hands it back to the seller for 72 hours. To propose your own figure instead, use the counter endpoint.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The id.
    CreateBuyerCaseRespondRequest createBuyerCaseRespondRequest = new CreateBuyerCaseRespondRequest(); // CreateBuyerCaseRespondRequest | 
    try {
      BuyerResponse result = apiInstance.createBuyerCaseRespond(id, createBuyerCaseRespondRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerCaseRespond");
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
 **id** | **UUID**| The id. |
 **createBuyerCaseRespondRequest** | **CreateBuyerCaseRespondRequest**|  |

### Return type

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="createBuyerCaseWithdraw"></a>
# **createBuyerCaseWithdraw**
> BuyerResponse createBuyerCaseWithdraw(id)

Withdraw a case you opened.

Closes it with no refund and lets the order complete normally. Cannot be reopened — one case per order.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The id.
    try {
      BuyerResponse result = apiInstance.createBuyerCaseWithdraw(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerCaseWithdraw");
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
 **id** | **UUID**| The id. |

### Return type

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerCatalogListingRental"></a>
# **createBuyerCatalogListingRental**
> CreateBuyerCatalogListingRentalResponse createBuyerCatalogListingRental(slug)

Book a rental. Returns a Stripe PaymentIntent client secret for rent + shipping both ways + deposit; the dates are held 30 minutes for payment. Crossly buys both labels; the deposit comes back after the item does.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      CreateBuyerCatalogListingRentalResponse result = apiInstance.createBuyerCatalogListingRental(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerCatalogListingRental");
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
 **slug** | **String**|  |

### Return type

**CreateBuyerCatalogListingRentalResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerCatalogListingRentalQuote"></a>
# **createBuyerCatalogListingRentalQuote**
> CreateBuyerCatalogListingRentalQuoteResponse createBuyerCatalogListingRentalQuote(slug)

Price a rental: rent (the cheaper of by-the-day and by-the-week), both shipping legs once a ship-to is given, and the deposit. &#x60;problem&#x60; says why the dates can’t be booked.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      CreateBuyerCatalogListingRentalQuoteResponse result = apiInstance.createBuyerCatalogListingRentalQuote(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerCatalogListingRentalQuote");
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
 **slug** | **String**|  |

### Return type

**CreateBuyerCatalogListingRentalQuoteResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerCatalogListingVideoRequest"></a>
# **createBuyerCatalogListingVideoRequest**
> CreateBuyerCatalogListingVideoRequestResponse createBuyerCatalogListingVideoRequest(slug)

Ask the seller for a video of an item (one open request per item). The seller is notified; their answer appears on the listing for every buyer.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      CreateBuyerCatalogListingVideoRequestResponse result = apiInstance.createBuyerCatalogListingVideoRequest(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerCatalogListingVideoRequest");
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
 **slug** | **String**|  |

### Return type

**CreateBuyerCatalogListingVideoRequestResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerCompany"></a>
# **createBuyerCompany**
> BuyerCompanyResponse createBuyerCompany()

Create a buyer company: name, taxId?, website?. You become its owner; a user is in at most one company.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      BuyerCompanyResponse result = apiInstance.createBuyerCompany();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerCompany");
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

**BuyerCompanyResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerCompanyApproval"></a>
# **createBuyerCompanyApproval**
> CreateBuyerCompanyApprovalResponse createBuyerCompanyApproval()

Ask for approval of a trade order above your limit: sellerUserId, amountCents, note?, poReference?. Good for 7 days, used once at checkout.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      CreateBuyerCompanyApprovalResponse result = apiInstance.createBuyerCompanyApproval();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerCompanyApproval");
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

**CreateBuyerCompanyApprovalResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerCompanyApprovalDecide"></a>
# **createBuyerCompanyApprovalDecide**
> CreateBuyerCompanyApprovalResponse createBuyerCompanyApprovalDecide(id)

Approve or decline a pending request (owner, accounts payable): decision approved | declined, note?.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateBuyerCompanyApprovalResponse result = apiInstance.createBuyerCompanyApprovalDecide(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerCompanyApprovalDecide");
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

**CreateBuyerCompanyApprovalResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerCompanyMember"></a>
# **createBuyerCompanyMember**
> BuyerCompanyResponse createBuyerCompanyMember()

Invite a teammate by email (owner): role owner | buyer | accounts_payable | viewer, approvalLimitCents for a buyer (orders above it need an approval).

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      BuyerCompanyResponse result = apiInstance.createBuyerCompanyMember();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerCompanyMember");
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

**BuyerCompanyResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerConversationInvite"></a>
# **createBuyerConversationInvite**
> CreateBuyerWishlistInviteResponse createBuyerConversationInvite(id)

Invite a friend into a chat with a seller: a single-use link (7 days) that makes whoever opens it a guest who can read and post. Only the thread’s buyer can invite; at most 5 guests.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateBuyerWishlistInviteResponse result = apiInstance.createBuyerConversationInvite(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerConversationInvite");
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

**CreateBuyerWishlistInviteResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerConversationJoin"></a>
# **createBuyerConversationJoin**
> CreateBuyerConversationJoinResponse createBuyerConversationJoin(token)

Join a chat you were invited into, as a guest.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String token = "token_example"; // String | 
    try {
      CreateBuyerConversationJoinResponse result = apiInstance.createBuyerConversationJoin(token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerConversationJoin");
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
 **token** | **String**|  |

### Return type

**CreateBuyerConversationJoinResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerEventRsvp"></a>
# **createBuyerEventRsvp**
> CreateBuyerEventRsvpResponse createBuyerEventRsvp(slug)

RSVP to an event: going (counts against its capacity) or interested.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      CreateBuyerEventRsvpResponse result = apiInstance.createBuyerEventRsvp(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerEventRsvp");
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
 **slug** | **String**|  |

### Return type

**CreateBuyerEventRsvpResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerFeedback"></a>
# **createBuyerFeedback**
> CreateBuyerFeedbackResponse createBuyerFeedback(createBuyerFeedbackRequest)

Leave feedback on up to 25 orders at once, with optional detailed seller ratings.

Each entry is checked on its own — one refused comment never sinks the others; read &#x60;data[].ok&#x60;. Orders to review come from GET /v1/buyer/feedback/pending.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    CreateBuyerFeedbackRequest createBuyerFeedbackRequest = new CreateBuyerFeedbackRequest(); // CreateBuyerFeedbackRequest | 
    try {
      CreateBuyerFeedbackResponse result = apiInstance.createBuyerFeedback(createBuyerFeedbackRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerFeedback");
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
 **createBuyerFeedbackRequest** | **CreateBuyerFeedbackRequest**|  |

### Return type

**CreateBuyerFeedbackResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="createBuyerFitRef"></a>
# **createBuyerFitRef**
> BuyerResponse2 createBuyerFitRef()

Save a reference garment (flat measurements, inches) to compare listings against.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      BuyerResponse2 result = apiInstance.createBuyerFitRef();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerFitRef");
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

**BuyerResponse2**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerFollowingSellerSeen"></a>
# **createBuyerFollowingSellerSeen**
> CreateBuyerFollowingSellerSeenResponse createBuyerFollowingSellerSeen(createBuyerFollowingSellerSeenRequest)

Clear the \&quot;new listings\&quot; count on a followed seller, or on all of them.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    CreateBuyerFollowingSellerSeenRequest createBuyerFollowingSellerSeenRequest = new CreateBuyerFollowingSellerSeenRequest(); // CreateBuyerFollowingSellerSeenRequest | 
    try {
      CreateBuyerFollowingSellerSeenResponse result = apiInstance.createBuyerFollowingSellerSeen(createBuyerFollowingSellerSeenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerFollowingSellerSeen");
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
 **createBuyerFollowingSellerSeenRequest** | **CreateBuyerFollowingSellerSeenRequest**|  |

### Return type

**CreateBuyerFollowingSellerSeenResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="createBuyerGiftCard"></a>
# **createBuyerGiftCard**
> CreateBuyerGiftCardResponse createBuyerGiftCard(createBuyerGiftCardRequest)

Start a gift card purchase.

Creates an unpaid card and a Stripe PaymentIntent, and returns its client secret. Nothing is charged until the PaymentIntent is confirmed; the code is emailed to the recipient once payment clears (at deliverAt, if given) and is never returned here. $10–$500. Cards and their credit expire 5 years after purchase. Idempotency-Key required.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    CreateBuyerGiftCardRequest createBuyerGiftCardRequest = new CreateBuyerGiftCardRequest(); // CreateBuyerGiftCardRequest | 
    try {
      CreateBuyerGiftCardResponse result = apiInstance.createBuyerGiftCard(createBuyerGiftCardRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerGiftCard");
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
 **createBuyerGiftCardRequest** | **CreateBuyerGiftCardRequest**|  |

### Return type

**CreateBuyerGiftCardResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="createBuyerGiftCardRedeem"></a>
# **createBuyerGiftCardRedeem**
> CreateBuyerGiftCardRedeemResponse createBuyerGiftCardRedeem(createBuyerGiftCardRedeemRequest)

Redeem a gift card code into your own balance.

Adds the card’s value to the token owner’s Crossly balance (Crossly Bucks today; CBX granted balance when Crossly issues CBX), spendable at checkout. One redemption per card. The credit keeps the card’s expiry date. Refusals: 404 invalid_code, 409 already_redeemed / not_paid / void / expired.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    CreateBuyerGiftCardRedeemRequest createBuyerGiftCardRedeemRequest = new CreateBuyerGiftCardRedeemRequest(); // CreateBuyerGiftCardRedeemRequest | 
    try {
      CreateBuyerGiftCardRedeemResponse result = apiInstance.createBuyerGiftCardRedeem(createBuyerGiftCardRedeemRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerGiftCardRedeem");
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
 **createBuyerGiftCardRedeemRequest** | **CreateBuyerGiftCardRedeemRequest**|  |

### Return type

**CreateBuyerGiftCardRedeemResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="createBuyerGroupBuyJoin"></a>
# **createBuyerGroupBuyJoin**
> CreateBuyerGroupBuyJoinResponse createBuyerGroupBuyJoin(id)

Join a group buy with a quantity (up to its per-buyer max): a hold (or, for pay-now pools, a charge refunded the difference) at the starting price, settled at the price the group reaches. &#x60;linkToken&#x60; opens a link-only pool. Checked against this key’s spending controls; send an Idempotency-Key.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateBuyerGroupBuyJoinResponse result = apiInstance.createBuyerGroupBuyJoin(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerGroupBuyJoin");
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

**CreateBuyerGroupBuyJoinResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerGroupBuyLeave"></a>
# **createBuyerGroupBuyLeave**
> BuyerResponse createBuyerGroupBuyLeave(id)

Leave a group buy and release your hold.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerResponse result = apiInstance.createBuyerGroupBuyLeave(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerGroupBuyLeave");
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

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerHunt"></a>
# **createBuyerHunt**
> BuyerResponse2 createBuyerHunt()

Start a buyer-agent hunt — over a search (filters), or auto-buy on one listing (listingSlug: buy it once its price, sale applied, is within maxPriceCents). &#x60;offer&#x60; and &#x60;buy&#x60; modes also need buyer:checkout:write, and the budget is checked against this key’s spending controls.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      BuyerResponse2 result = apiInstance.createBuyerHunt();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerHunt");
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

**BuyerResponse2**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerInstantOfferAccept"></a>
# **createBuyerInstantOfferAccept**
> BuyerResponse createBuyerInstantOfferAccept(id)

Accept Crossly’s instant offer on a collection item. Ops then send a prepaid label; the store credit is paid once the item arrives and checks out.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerResponse result = apiInstance.createBuyerInstantOfferAccept(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerInstantOfferAccept");
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

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerLayawayCancel"></a>
# **createBuyerLayawayCancel**
> BuyerLayawayResponse createBuyerLayawayCancel(id)

Cancel a layaway: everything paid comes back except the layaway fee (10% of the price, at most $15).

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerLayawayResponse result = apiInstance.createBuyerLayawayCancel(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerLayawayCancel");
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

**BuyerLayawayResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerLayawayPay"></a>
# **createBuyerLayawayPay**
> BuyerLayawayResponse createBuyerLayawayPay(id)

Pay some (at least $1) or all of what is left now, on the saved card. Paid in full, it ships.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerLayawayResponse result = apiInstance.createBuyerLayawayPay(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerLayawayPay");
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

**BuyerLayawayResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerListingAudioSummary"></a>
# **createBuyerListingAudioSummary**
> GetBuyerListingAudioSummaryResponse createBuyerListingAudioSummary(slug)

Record the spoken summary of a listing (cached per listing version). 503 naming TTS_API_KEY when no speech provider is configured.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      GetBuyerListingAudioSummaryResponse result = apiInstance.createBuyerListingAudioSummary(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerListingAudioSummary");
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
 **slug** | **String**|  |

### Return type

**GetBuyerListingAudioSummaryResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerListingSplit"></a>
# **createBuyerListingSplit**
> CreateBuyerListingSplitResponse createBuyerListingSplit(slug)

Split a purchase: one pay link per person; nobody is charged until all have paid.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      CreateBuyerListingSplitResponse result = apiInstance.createBuyerListingSplit(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerListingSplit");
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
 **slug** | **String**|  |

### Return type

**CreateBuyerListingSplitResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerListingSubscribe"></a>
# **createBuyerListingSubscribe**
> BuyerResponse2 createBuyerListingSubscribe(slug)

Subscribe &amp; save: a standing order charged to your saved card every interval. Checked against this key’s spending controls; send an Idempotency-Key.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      BuyerResponse2 result = apiInstance.createBuyerListingSubscribe(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerListingSubscribe");
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
 **slug** | **String**|  |

### Return type

**BuyerResponse2**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerListingTryOn"></a>
# **createBuyerListingTryOn**
> CreateBuyerListingTryOnResponse createBuyerListingTryOn(slug)

Render an AI try-on of this listing on the buyer’s own photo (base64 &#x60;photo&#x60;, or &#x60;reuseLastPhoto&#x60;). &#x60;confirmSelfAdult&#x60; must be true: the photo is of the buyer and they are 18+. Wearables only; capped per day; 503 naming TRYON_API_KEY when no image model is configured.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      CreateBuyerListingTryOnResponse result = apiInstance.createBuyerListingTryOn(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerListingTryOn");
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
 **slug** | **String**|  |

### Return type

**CreateBuyerListingTryOnResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerMarketBid"></a>
# **createBuyerMarketBid**
> CreateBuyerMarketBidResponse createBuyerMarketBid()

Place a fixed-price market bid. SPENDS MONEY: it fills against the lowest ask at or under your price and charges your saved card (plus the fast-ship premium when fastShip is set and it fills from vault stock). deliverTo vault keeps it in your Crossly vault; gradeWith sends a raw card to a Grading run first. Checked against this key’s spending controls; send an Idempotency-Key.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      CreateBuyerMarketBidResponse result = apiInstance.createBuyerMarketBid();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerMarketBid");
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

**CreateBuyerMarketBidResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerMarketWatch"></a>
# **createBuyerMarketWatch**
> BuyerResponse createBuyerMarketWatch()

Watch a market variant: alert at or below a price, or on any drop.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      BuyerResponse result = apiInstance.createBuyerMarketWatch();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerMarketWatch");
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

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerOffer"></a>
# **createBuyerOffer**
> CreateBuyerOfferResponse createBuyerOffer(createBuyerOfferRequest)

Offer a price on a listing.

Sends an offer to the seller. Spends nothing — a seller accepting still leaves you to complete checkout. Offers at or above the asking price are refused; buy it instead.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    CreateBuyerOfferRequest createBuyerOfferRequest = new CreateBuyerOfferRequest(); // CreateBuyerOfferRequest | 
    try {
      CreateBuyerOfferResponse result = apiInstance.createBuyerOffer(createBuyerOfferRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerOffer");
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
 **createBuyerOfferRequest** | **CreateBuyerOfferRequest**|  |

### Return type

**CreateBuyerOfferResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="createBuyerOfferRespond"></a>
# **createBuyerOfferRespond**
> CreateBuyerOfferRespondResponse createBuyerOfferRespond(id, createBuyerOfferRespondRequest)

Answer a seller’s counteroffer — accept, decline, or counter back.

Only an offer with &#x60;awaitingBuyer: true&#x60; can be answered. Accepting opens a 48-hour window to pay on Crossly; it charges nothing. A counter must be below the seller’s price (in cents) and becomes a new offer waiting on the seller.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The offer id.
    CreateBuyerOfferRespondRequest createBuyerOfferRespondRequest = new CreateBuyerOfferRespondRequest(); // CreateBuyerOfferRespondRequest | 
    try {
      CreateBuyerOfferRespondResponse result = apiInstance.createBuyerOfferRespond(id, createBuyerOfferRespondRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerOfferRespond");
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
 **id** | **UUID**| The offer id. |
 **createBuyerOfferRespondRequest** | **CreateBuyerOfferRespondRequest**|  |

### Return type

**CreateBuyerOfferRespondResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="createBuyerOrderCancel"></a>
# **createBuyerOrderCancel**
> CreateBuyerOrderCancelResponse createBuyerOrderCancel(id)

Cancel an order before it ships — refunds it in full.

Instant while the seller has not bought a label or shipped. Refused with 409 once they have (&#x60;details.shopCode&#x60;: already_shipped, label_purchased, disputed, already_refunded). Check GET /v1/buyer/orders/{id}/eligibility first.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The id.
    try {
      CreateBuyerOrderCancelResponse result = apiInstance.createBuyerOrderCancel(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerOrderCancel");
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
 **id** | **UUID**| The id. |

### Return type

**CreateBuyerOrderCancelResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerOrderInr"></a>
# **createBuyerOrderInr**
> CreateBuyerOrderInrResponse createBuyerOrderInr(id, createBuyerOrderInrRequest)

Open an item-not-received case.

Only after the expected delivery window — a 409 carries &#x60;details.reason&#x60; and &#x60;details.opensAt&#x60; when it is too early. The seller then has 72 hours to respond. One case per order, ever.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The id.
    CreateBuyerOrderInrRequest createBuyerOrderInrRequest = new CreateBuyerOrderInrRequest(); // CreateBuyerOrderInrRequest | 
    try {
      CreateBuyerOrderInrResponse result = apiInstance.createBuyerOrderInr(id, createBuyerOrderInrRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerOrderInr");
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
 **id** | **UUID**| The id. |
 **createBuyerOrderInrRequest** | **CreateBuyerOrderInrRequest**|  |

### Return type

**CreateBuyerOrderInrResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="createBuyerOrderReceived"></a>
# **createBuyerOrderReceived**
> CreateBuyerOrderReceivedResponse createBuyerOrderReceived(id)

Confirm you received an order.

Records receipt and opens feedback. It does NOT release the seller’s money sooner or shorten your buyer protection. Closes the item-not-received entry point.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The id.
    try {
      CreateBuyerOrderReceivedResponse result = apiInstance.createBuyerOrderReceived(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerOrderReceived");
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
 **id** | **UUID**| The id. |

### Return type

**CreateBuyerOrderReceivedResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerOrderTip"></a>
# **createBuyerOrderTip**
> CreateBuyerOrderTipResponse createBuyerOrderTip(id)

Tip the seller on one of your shipped orders, charged to your saved card. One tip per order; $1–$500; checked against this key’s spending controls.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateBuyerOrderTipResponse result = apiInstance.createBuyerOrderTip(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerOrderTip");
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

**CreateBuyerOrderTipResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerPackFairnessRotate"></a>
# **createBuyerPackFairnessRotate**
> GetBuyerPackFairnessResponse createBuyerPackFairnessRotate()

Reveal your current server seed and start a new one (optionally with your own client seed). Refused while an opening is awaiting payment.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      GetBuyerPackFairnessResponse result = apiInstance.createBuyerPackFairnessRotate();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerPackFairnessRotate");
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

**GetBuyerPackFairnessResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerPackOpen"></a>
# **createBuyerPackOpen**
> CreateBuyerPackOpenResponse createBuyerPackOpen(slug)

Open a pack. SPENDS MONEY: charges the pack price to your saved card, then pulls one real item by the published odds (provably fair: see /buyer/packs/fairness) into your Crossly vault. confirmAdult must be true. Checked against this key’s spending controls; send an Idempotency-Key.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      CreateBuyerPackOpenResponse result = apiInstance.createBuyerPackOpen(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerPackOpen");
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
 **slug** | **String**|  |

### Return type

**CreateBuyerPackOpenResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerPackOpeningSellBack"></a>
# **createBuyerPackOpeningSellBack**
> CreateBuyerPackOpeningSellBackResponse createBuyerPackOpeningSellBack(id)

Sell a pull straight back for Crossly credit at the pack’s buyback rate, within its window, while it is still in your vault.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateBuyerPackOpeningSellBackResponse result = apiInstance.createBuyerPackOpeningSellBack(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerPackOpeningSellBack");
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

**CreateBuyerPackOpeningSellBackResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerPassportClaim"></a>
# **createBuyerPassportClaim**
> GetBuyerPassportResponse createBuyerPassportClaim(code)

Claim a passport as the item’s current owner — the buyer of its latest Crossly sale, or (after a sale on another marketplace) with the transfer code from the card in the box — shown as “in its owner’s hands” until it sells again.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String code = "code_example"; // String | 
    try {
      GetBuyerPassportResponse result = apiInstance.createBuyerPassportClaim(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerPassportClaim");
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
 **code** | **String**|  |

### Return type

**GetBuyerPassportResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerProtectionPlanCancel"></a>
# **createBuyerProtectionPlanCancel**
> CreateBuyerProtectionPlanCancelResponse createBuyerProtectionPlanCancel(id)

Cancel a protection plan. The insurer decides what is refundable (pro-rata after the free-look window); that amount goes back to the card.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateBuyerProtectionPlanCancelResponse result = apiInstance.createBuyerProtectionPlanCancel(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerProtectionPlanCancel");
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

**CreateBuyerProtectionPlanCancelResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerPurchaseFit"></a>
# **createBuyerPurchaseFit**
> BuyerResponse createBuyerPurchaseFit(id)

Say how a delivered purchase fit: true_to_size, small or large. It teaches your size memory and, pooled with other buyers, how the brand runs.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerResponse result = apiInstance.createBuyerPurchaseFit(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerPurchaseFit");
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

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerPurchaseReturn"></a>
# **createBuyerPurchaseReturn**
> BuyerResponse2 createBuyerPurchaseReturn(id)

Return a purchase under the seller’s policy, or send back a try-at-home item. With reason doesnt_fit, &#x60;fit&#x60; (small | large) says which way, and it feeds your size memory.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerResponse2 result = apiInstance.createBuyerPurchaseReturn(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerPurchaseReturn");
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

**BuyerResponse2**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerRegistry"></a>
# **createBuyerRegistry**
> CreateBuyerRegistryResponse createBuyerRegistry()

Start a gift registry (wedding, baby, birthday, housewarming, graduation, other). Items are added like any wishlist item; set shipAddressId to one of your saved addresses so guests can buy — they never see it.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      CreateBuyerRegistryResponse result = apiInstance.createBuyerRegistry();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerRegistry");
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

**CreateBuyerRegistryResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerRegistryGiftThanked"></a>
# **createBuyerRegistryGiftThanked**
> CreateBuyerRegistryGiftThankedResponse createBuyerRegistryGiftThanked(id, giftId)

Tick a gift as thanked (or untick it).

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    String giftId = "giftId_example"; // String | 
    try {
      CreateBuyerRegistryGiftThankedResponse result = apiInstance.createBuyerRegistryGiftThanked(id, giftId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerRegistryGiftThanked");
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
 **giftId** | **String**|  |

### Return type

**CreateBuyerRegistryGiftThankedResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerRentalArrivalPhoto"></a>
# **createBuyerRentalArrivalPhoto**
> BuyerRentalResponse createBuyerRentalArrivalPhoto(id)

Photograph a rental on arrival (URLs you uploaded): your side of the condition record.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerRentalResponse result = apiInstance.createBuyerRentalArrivalPhoto(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerRentalArrivalPhoto");
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

**BuyerRentalResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerRentalBuyout"></a>
# **createBuyerRentalBuyout**
> CreateBuyerRentalBuyoutResponse createBuyerRentalBuyout(id)

Buy the item you are renting: the price less the rent-to-own credit → clientSecret.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateBuyerRentalBuyoutResponse result = apiInstance.createBuyerRentalBuyout(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerRentalBuyout");
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

**CreateBuyerRentalBuyoutResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerRentalCancel"></a>
# **createBuyerRentalCancel**
> BuyerResponse createBuyerRentalCancel(id)

Cancel a rental that has not shipped: everything is refunded.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerResponse result = apiInstance.createBuyerRentalCancel(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerRentalCancel");
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

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerRentalClaimResponse"></a>
# **createBuyerRentalClaimResponse**
> BuyerResponse createBuyerRentalClaimResponse(id)

Answer a deposit claim: accept (the claim is paid, the rest refunded) or dispute (Crossly decides).

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerResponse result = apiInstance.createBuyerRentalClaimResponse(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerRentalClaimResponse");
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

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerRentalDelivered"></a>
# **createBuyerRentalDelivered**
> BuyerRentalResponse createBuyerRentalDelivered(id)

Confirm your rental arrived.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerRentalResponse result = apiInstance.createBuyerRentalDelivered(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerRentalDelivered");
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

**BuyerRentalResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerRentalExtension"></a>
# **createBuyerRentalExtension**
> CreateBuyerRentalExtensionResponse createBuyerRentalExtension(id)

Ask for more days. Auto-approved extensions return a clientSecret to pay with Stripe.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateBuyerRentalExtensionResponse result = apiInstance.createBuyerRentalExtension(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerRentalExtension");
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

**CreateBuyerRentalExtensionResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerRentalExtensionPay"></a>
# **createBuyerRentalExtensionPay**
> CreateBuyerRentalExtensionPayResponse createBuyerRentalExtensionPay(id, extensionId)

Pay for an extension the seller approved → clientSecret.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    String extensionId = "extensionId_example"; // String | 
    try {
      CreateBuyerRentalExtensionPayResponse result = apiInstance.createBuyerRentalExtensionPay(id, extensionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerRentalExtensionPay");
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
 **extensionId** | **String**|  |

### Return type

**CreateBuyerRentalExtensionPayResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerRentalIdentityStart"></a>
# **createBuyerRentalIdentityStart**
> CreateBuyerRentalIdentityStartResponse createBuyerRentalIdentityStart()

Start the ID check renting needs (Stripe Identity: photo ID + selfie). Open &#x60;url&#x60; (hosted) or use &#x60;clientSecret&#x60; with Stripe.js.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      CreateBuyerRentalIdentityStartResponse result = apiInstance.createBuyerRentalIdentityStart();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerRentalIdentityStart");
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

**CreateBuyerRentalIdentityStartResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerRentalReturnShipped"></a>
# **createBuyerRentalReturnShipped**
> BuyerRentalResponse createBuyerRentalReturnShipped(id)

Say you sent your rental back (optionally with photos).

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerRentalResponse result = apiInstance.createBuyerRentalReturnShipped(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerRentalReturnShipped");
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

**BuyerRentalResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerReturnCancel"></a>
# **createBuyerReturnCancel**
> BuyerResponse createBuyerReturnCancel(id)

Cancel a return before it ships.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerResponse result = apiInstance.createBuyerReturnCancel(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerReturnCancel");
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

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerReturnTracking"></a>
# **createBuyerReturnTracking**
> BuyerResponse createBuyerReturnTracking(id)

Add tracking to a return you shipped on your own label.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerResponse result = apiInstance.createBuyerReturnTracking(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerReturnTracking");
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

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerSellerClubJoin"></a>
# **createBuyerSellerClubJoin**
> CreateBuyerSellerClubJoinResponse createBuyerSellerClubJoin(sellerUserId)

Join a seller’s loyalty club (free). Your tier’s discount then applies to their items — the best of it and any other rate you have with them, never stacked.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String sellerUserId = "sellerUserId_example"; // String | 
    try {
      CreateBuyerSellerClubJoinResponse result = apiInstance.createBuyerSellerClubJoin(sellerUserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerSellerClubJoin");
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
 **sellerUserId** | **String**|  |

### Return type

**CreateBuyerSellerClubJoinResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerSellerLoyaltyJoin"></a>
# **createBuyerSellerLoyaltyJoin**
> GetBuyerSellerLoyaltyResponse createBuyerSellerLoyaltyJoin(sellerUserId)

Join a seller’s loyalty club. Invite-only clubs take only invited buyers. Your tier and its perks are granted at once.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String sellerUserId = "sellerUserId_example"; // String | 
    try {
      GetBuyerSellerLoyaltyResponse result = apiInstance.createBuyerSellerLoyaltyJoin(sellerUserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerSellerLoyaltyJoin");
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
 **sellerUserId** | **String**|  |

### Return type

**GetBuyerSellerLoyaltyResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerSellerReport"></a>
# **createBuyerSellerReport**
> CreateBuyerStoreReportResponse createBuyerSellerReport(username, createBuyerSellerReportRequest)

Report a seller to Crossly’s trust team.

A second report while your first is still under review updates that report instead of filing another. &#x60;purchaseId&#x60; is attached only if it is your order from this seller.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String username = "username_example"; // String | The seller’s shop handle.
    CreateBuyerSellerReportRequest createBuyerSellerReportRequest = new CreateBuyerSellerReportRequest(); // CreateBuyerSellerReportRequest | 
    try {
      CreateBuyerStoreReportResponse result = apiInstance.createBuyerSellerReport(username, createBuyerSellerReportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerSellerReport");
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
 **username** | **String**| The seller’s shop handle. |
 **createBuyerSellerReportRequest** | **CreateBuyerSellerReportRequest**|  |

### Return type

**CreateBuyerStoreReportResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="createBuyerSplitCancel"></a>
# **createBuyerSplitCancel**
> BuyerResponse createBuyerSplitCancel(id)

Cancel a split you organised; every held share is released.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerResponse result = apiInstance.createBuyerSplitCancel(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerSplitCancel");
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

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerStoreReport"></a>
# **createBuyerStoreReport**
> CreateBuyerStoreReportResponse createBuyerStoreReport(slug, createBuyerSellerReportRequest)

Report a store to Crossly’s trust team.

Files against whoever runs the store. A second report while your first is still under review updates that report instead of filing another. &#x60;purchaseId&#x60; is attached only if it is your order from this seller.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | The store’s slug (its /shop/s/<slug> address).
    CreateBuyerSellerReportRequest createBuyerSellerReportRequest = new CreateBuyerSellerReportRequest(); // CreateBuyerSellerReportRequest | 
    try {
      CreateBuyerStoreReportResponse result = apiInstance.createBuyerStoreReport(slug, createBuyerSellerReportRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerStoreReport");
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
 **slug** | **String**| The store’s slug (its /shop/s/&lt;slug&gt; address). |
 **createBuyerSellerReportRequest** | **CreateBuyerSellerReportRequest**|  |

### Return type

**CreateBuyerStoreReportResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="createBuyerTogether"></a>
# **createBuyerTogether**
> CreateBuyerTogetherResponse createBuyerTogether()

Start a shop-together room.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      CreateBuyerTogetherResponse result = apiInstance.createBuyerTogether();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerTogether");
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

**CreateBuyerTogetherResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerTogetherItem"></a>
# **createBuyerTogetherItem**
> BuyerResponse createBuyerTogetherItem(code)

Add a listing to a shop-together board.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String code = "code_example"; // String | 
    try {
      BuyerResponse result = apiInstance.createBuyerTogetherItem(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerTogetherItem");
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
 **code** | **String**|  |

### Return type

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerTogetherItemVote"></a>
# **createBuyerTogetherItemVote**
> BuyerResponse createBuyerTogetherItemVote(code, id)

Vote an item on a room’s board up (1), down (-1) or clear (0).

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String code = "code_example"; // String | 
    String id = "id_example"; // String | 
    try {
      BuyerResponse result = apiInstance.createBuyerTogetherItemVote(code, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerTogetherItemVote");
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
 **code** | **String**|  |
 **id** | **String**|  |

### Return type

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerTogetherJoin"></a>
# **createBuyerTogetherJoin**
> CreateBuyerTogetherResponse createBuyerTogetherJoin(code)

Join a shop-together room by its code.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String code = "code_example"; // String | 
    try {
      CreateBuyerTogetherResponse result = apiInstance.createBuyerTogetherJoin(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerTogetherJoin");
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
 **code** | **String**|  |

### Return type

**CreateBuyerTogetherResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerTogetherLeave"></a>
# **createBuyerTogetherLeave**
> BuyerResponse createBuyerTogetherLeave(code)

Leave a shop-together room.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String code = "code_example"; // String | 
    try {
      BuyerResponse result = apiInstance.createBuyerTogetherLeave(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerTogetherLeave");
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
 **code** | **String**|  |

### Return type

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerTogetherMessage"></a>
# **createBuyerTogetherMessage**
> BuyerResponse createBuyerTogetherMessage(code)

Say something in a shop-together room.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String code = "code_example"; // String | 
    try {
      BuyerResponse result = apiInstance.createBuyerTogetherMessage(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerTogetherMessage");
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
 **code** | **String**|  |

### Return type

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerTotalRequest"></a>
# **createBuyerTotalRequest**
> CreateBuyerTotalRequestResponse createBuyerTotalRequest(createBuyerTotalRequestRequest)

Ask a seller for one combined shipping total on everything of theirs in your cart.

Needs two or more of the seller’s items in your cart. Spends nothing; the quote applies at checkout on Crossly.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    CreateBuyerTotalRequestRequest createBuyerTotalRequestRequest = new CreateBuyerTotalRequestRequest(); // CreateBuyerTotalRequestRequest | 
    try {
      CreateBuyerTotalRequestResponse result = apiInstance.createBuyerTotalRequest(createBuyerTotalRequestRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerTotalRequest");
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
 **createBuyerTotalRequestRequest** | **CreateBuyerTotalRequestRequest**|  |

### Return type

**CreateBuyerTotalRequestResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="createBuyerVaultList"></a>
# **createBuyerVaultList**
> CreateBuyerVaultListResponse createBuyerVaultList(id)

Sell a vault item on the market at your price. It is already authenticated, so when it sells nothing ships in: the buyer keeps it vaulted or it ships straight to them.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateBuyerVaultListResponse result = apiInstance.createBuyerVaultList(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerVaultList");
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

**CreateBuyerVaultListResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerVaultUnlist"></a>
# **createBuyerVaultUnlist**
> BuyerResponse createBuyerVaultUnlist(id)

Take a vault item off the market; it stays stored.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerResponse result = apiInstance.createBuyerVaultUnlist(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerVaultUnlist");
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

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerVaultWithdraw"></a>
# **createBuyerVaultWithdraw**
> CreateBuyerVaultWithdrawResponse createBuyerVaultWithdraw(id)

Ship a vault item home, standard or expedited. The shipping, any storage it owes and the early-withdrawal fee (within 90 days of arriving) are charged to your saved card now, all checked against this key’s spending controls; send an Idempotency-Key.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateBuyerVaultWithdrawResponse result = apiInstance.createBuyerVaultWithdraw(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerVaultWithdraw");
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

**CreateBuyerVaultWithdrawResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerWholesaleCatalogApply"></a>
# **createBuyerWholesaleCatalogApply**
> CreateBuyerWholesaleCatalogApplyResponse createBuyerWholesaleCatalogApply(storeSlug, catalogSlug)

Apply to a store&#39;s wholesale catalog: { message?, answers [{ id, value }], resaleCertUrl?, resaleCertState?, taxId?, businessInfo? }. The seller&#39;s requirements are enforced (400 trade_apply_requirements names the first one missing); the seller reviews the request.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String storeSlug = "storeSlug_example"; // String | 
    String catalogSlug = "catalogSlug_example"; // String | 
    try {
      CreateBuyerWholesaleCatalogApplyResponse result = apiInstance.createBuyerWholesaleCatalogApply(storeSlug, catalogSlug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerWholesaleCatalogApply");
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
 **storeSlug** | **String**|  |
 **catalogSlug** | **String**|  |

### Return type

**CreateBuyerWholesaleCatalogApplyResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerWholesaleFreightRequest"></a>
# **createBuyerWholesaleFreightRequest**
> CreateBuyerWholesaleFreightRequestResponse createBuyerWholesaleFreightRequest()

Ask a seller to quote freight for their lines in your cart (an order over their pallet threshold): { sellerUserId, weightLbs?, shipTo? { postalCode, country, city?, region?, liftgate?, dock? }, note? }. One open request per seller.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      CreateBuyerWholesaleFreightRequestResponse result = apiInstance.createBuyerWholesaleFreightRequest();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerWholesaleFreightRequest");
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

**CreateBuyerWholesaleFreightRequestResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerWholesaleInvoicePayLink"></a>
# **createBuyerWholesaleInvoicePayLink**
> CreateBuyerWholesaleInvoicePayLinkResponse createBuyerWholesaleInvoicePayLink(id)

A hosted payment page for an on-account invoice: amountCents? (part of the balance, at least $1), method? card | ach. Nothing is charged until the buyer completes the page.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateBuyerWholesaleInvoicePayLinkResponse result = apiInstance.createBuyerWholesaleInvoicePayLink(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerWholesaleInvoicePayLink");
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

**CreateBuyerWholesaleInvoicePayLinkResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerWholesaleOrderSheet"></a>
# **createBuyerWholesaleOrderSheet**
> BuyerWholesaleOrderSheetResponse createBuyerWholesaleOrderSheet()

Save an order sheet: name, lines [{ platformListingId, listingVariantId?, catalogId?, quantity }] from one seller, optional catalogId, poReference, note.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      BuyerWholesaleOrderSheetResponse result = apiInstance.createBuyerWholesaleOrderSheet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerWholesaleOrderSheet");
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

**BuyerWholesaleOrderSheetResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerWholesaleQuote"></a>
# **createBuyerWholesaleQuote**
> BuyerWholesaleQuoteResponse createBuyerWholesaleQuote()

Ask one seller for a quote: items [{ platformListingId, listingVariantId?, quantity, targetUnitPriceCents? }] (one seller per quote), optional catalogId, note, poReference.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      BuyerWholesaleQuoteResponse result = apiInstance.createBuyerWholesaleQuote();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerWholesaleQuote");
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

**BuyerWholesaleQuoteResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerWholesaleQuoteAccept"></a>
# **createBuyerWholesaleQuoteAccept**
> CreateBuyerWholesaleQuoteAcceptResponse createBuyerWholesaleQuoteAccept(id)

Accept an answered quote: its priced items go into your cart at the quoted quantities, locked at the quoted prices until the quote expires (changing a line&#39;s quantity drops the lock). Paying happens at checkout on Crossly.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateBuyerWholesaleQuoteAcceptResponse result = apiInstance.createBuyerWholesaleQuoteAccept(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerWholesaleQuoteAccept");
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

**CreateBuyerWholesaleQuoteAcceptResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerWholesaleQuoteWithdraw"></a>
# **createBuyerWholesaleQuoteWithdraw**
> BuyerWholesaleQuoteResponse createBuyerWholesaleQuoteWithdraw(id)

Withdraw a quote request that is still requested or answered.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerWholesaleQuoteResponse result = apiInstance.createBuyerWholesaleQuoteWithdraw(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerWholesaleQuoteWithdraw");
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

**BuyerWholesaleQuoteResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerWholesaleUploadValidate"></a>
# **createBuyerWholesaleUploadValidate**
> CreateBuyerWholesaleUploadValidateResponse createBuyerWholesaleUploadValidate()

Validate a CSV / PO against one catalog: rows [{ line, sku, quantity }] are matched by SKU (item or option SKU, or listing slug), merged per item and priced today; unmatched rows come back by line.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      CreateBuyerWholesaleUploadValidateResponse result = apiInstance.createBuyerWholesaleUploadValidate();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerWholesaleUploadValidate");
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

**CreateBuyerWholesaleUploadValidateResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerWishlist"></a>
# **createBuyerWishlist**
> CreateBuyerWishlistResponse createBuyerWishlist(createBuyerWishlistRequest)

Create a wishlist.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    CreateBuyerWishlistRequest createBuyerWishlistRequest = new CreateBuyerWishlistRequest(); // CreateBuyerWishlistRequest | 
    try {
      CreateBuyerWishlistResponse result = apiInstance.createBuyerWishlist(createBuyerWishlistRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerWishlist");
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
 **createBuyerWishlistRequest** | **CreateBuyerWishlistRequest**|  |

### Return type

**CreateBuyerWishlistResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="createBuyerWishlistInvite"></a>
# **createBuyerWishlistInvite**
> CreateBuyerWishlistInviteResponse createBuyerWishlistInvite(id)

Share a wishlist with a co-editor: a single-use link (14 days). Members add and remove items; only the owner renames, deletes or removes members. At most 20.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      CreateBuyerWishlistInviteResponse result = apiInstance.createBuyerWishlistInvite(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerWishlistInvite");
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

**CreateBuyerWishlistInviteResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerWishlistItem"></a>
# **createBuyerWishlistItem**
> BuyerResponse2 createBuyerWishlistItem(id, createBuyerWishlistItemRequest)

Add a listing to a wishlist.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    CreateBuyerWishlistItemRequest createBuyerWishlistItemRequest = new CreateBuyerWishlistItemRequest(); // CreateBuyerWishlistItemRequest | 
    try {
      BuyerResponse2 result = apiInstance.createBuyerWishlistItem(id, createBuyerWishlistItemRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerWishlistItem");
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
 **id** | **UUID**|  |
 **createBuyerWishlistItemRequest** | **CreateBuyerWishlistItemRequest**|  |

### Return type

**BuyerResponse2**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="createBuyerWishlistJoin"></a>
# **createBuyerWishlistJoin**
> CreateBuyerWishlistJoinResponse createBuyerWishlistJoin(token)

Join a wishlist you were invited to edit.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String token = "token_example"; // String | 
    try {
      CreateBuyerWishlistJoinResponse result = apiInstance.createBuyerWishlistJoin(token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerWishlistJoin");
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
 **token** | **String**|  |

### Return type

**CreateBuyerWishlistJoinResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="createBuyerWishlistShare"></a>
# **createBuyerWishlistShare**
> CreateBuyerWishlistShareResponse createBuyerWishlistShare(id, createBuyerWishlistShareRequest)

Share a wishlist — makes it public and returns its link.

&#x60;resetLink: true&#x60; issues a new link and kills the old one, for a link that went further than intended. To stop sharing, PATCH the list with isPublic: false.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The id.
    CreateBuyerWishlistShareRequest createBuyerWishlistShareRequest = new CreateBuyerWishlistShareRequest(); // CreateBuyerWishlistShareRequest | 
    try {
      CreateBuyerWishlistShareResponse result = apiInstance.createBuyerWishlistShare(id, createBuyerWishlistShareRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#createBuyerWishlistShare");
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
 **id** | **UUID**| The id. |
 **createBuyerWishlistShareRequest** | **CreateBuyerWishlistShareRequest**|  |

### Return type

**CreateBuyerWishlistShareResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="deleteBuyerBoard"></a>
# **deleteBuyerBoard**
> BuyerResponse deleteBuyerBoard(id)

Delete a board.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerResponse result = apiInstance.deleteBuyerBoard(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#deleteBuyerBoard");
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

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="deleteBuyerBoardItem"></a>
# **deleteBuyerBoardItem**
> BuyerResponse deleteBuyerBoardItem(id, platformListingId)

Take a listing off a board.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    String platformListingId = "platformListingId_example"; // String | 
    try {
      BuyerResponse result = apiInstance.deleteBuyerBoardItem(id, platformListingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#deleteBuyerBoardItem");
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

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="deleteBuyerBreakSpotHold"></a>
# **deleteBuyerBreakSpotHold**
> BuyerResponse deleteBuyerBreakSpotHold(id, spotId)

Release a break spot you hold.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    String spotId = "spotId_example"; // String | 
    try {
      BuyerResponse result = apiInstance.deleteBuyerBreakSpotHold(id, spotId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#deleteBuyerBreakSpotHold");
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
 **spotId** | **String**|  |

### Return type

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="deleteBuyerCartItem"></a>
# **deleteBuyerCartItem**
> deleteBuyerCartItem(id)

Remove a line from your cart.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteBuyerCartItem(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#deleteBuyerCartItem");
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
 **id** | **UUID**|  |

### Return type

null (empty response body)

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content — the request succeeded and there is no body. |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="deleteBuyerCartSaved"></a>
# **deleteBuyerCartSaved**
> BuyerCartResponse deleteBuyerCartSaved(id)

Remove an item from saved-for-later. Returns the remaining list.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The id.
    try {
      BuyerCartResponse result = apiInstance.deleteBuyerCartSaved(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#deleteBuyerCartSaved");
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
 **id** | **UUID**| The id. |

### Return type

**BuyerCartResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="deleteBuyerCompanyMember"></a>
# **deleteBuyerCompanyMember**
> BuyerCompanyResponse deleteBuyerCompanyMember(id)

Remove a member or cancel an invite (owner), or leave the company (your own member id).

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerCompanyResponse result = apiInstance.deleteBuyerCompanyMember(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#deleteBuyerCompanyMember");
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

**BuyerCompanyResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="deleteBuyerConversationGuest"></a>
# **deleteBuyerConversationGuest**
> BuyerResponse deleteBuyerConversationGuest(id, userId)

Remove a guest (the thread’s buyer), or leave (a guest, with your own user id).

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    String userId = "userId_example"; // String | 
    try {
      BuyerResponse result = apiInstance.deleteBuyerConversationGuest(id, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#deleteBuyerConversationGuest");
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
 **userId** | **String**|  |

### Return type

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="deleteBuyerCreationReview"></a>
# **deleteBuyerCreationReview**
> BuyerResponse deleteBuyerCreationReview(format, id)

Remove your review of a creation (its vote leaves the rating with it).

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String format = "wearable"; // String | The creation format.
    String id = "id_example"; // String | The creation id (a card is <setId>.<slug>).
    try {
      BuyerResponse result = apiInstance.deleteBuyerCreationReview(format, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#deleteBuyerCreationReview");
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
 **format** | **String**| The creation format. | [enum: wearable, decor, interactive, card]
 **id** | **String**| The creation id (a card is &lt;setId&gt;.&lt;slug&gt;). |

### Return type

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="deleteBuyerEventRsvp"></a>
# **deleteBuyerEventRsvp**
> BuyerResponse deleteBuyerEventRsvp(slug)

Take back your RSVP.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      BuyerResponse result = apiInstance.deleteBuyerEventRsvp(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#deleteBuyerEventRsvp");
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
 **slug** | **String**|  |

### Return type

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="deleteBuyerFitRef"></a>
# **deleteBuyerFitRef**
> BuyerResponse deleteBuyerFitRef(id)

Delete a reference garment.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerResponse result = apiInstance.deleteBuyerFitRef(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#deleteBuyerFitRef");
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

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="deleteBuyerHomeGuestbook"></a>
# **deleteBuyerHomeGuestbook**
> deleteBuyerHomeGuestbook(id)

Hide a line from your home’s guestbook.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.deleteBuyerHomeGuestbook(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#deleteBuyerHomeGuestbook");
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

null (empty response body)

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content — the request succeeded and there is no body. |  -  |
**400** | Error |  -  |
**401** | Error |  -  |
**403** | Error |  -  |
**404** | Error |  -  |
**429** | Error |  -  |
**500** | Error |  -  |

<a name="deleteBuyerMarketBid"></a>
# **deleteBuyerMarketBid**
> BuyerResponse deleteBuyerMarketBid(id)

Cancel a resting market bid.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerResponse result = apiInstance.deleteBuyerMarketBid(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#deleteBuyerMarketBid");
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

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="deleteBuyerMarketWatch"></a>
# **deleteBuyerMarketWatch**
> BuyerResponse deleteBuyerMarketWatch(id)

Stop watching a market variant.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerResponse result = apiInstance.deleteBuyerMarketWatch(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#deleteBuyerMarketWatch");
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

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="deleteBuyerOffer"></a>
# **deleteBuyerOffer**
> BuyerResponse deleteBuyerOffer(id)

Withdraw an offer you made that the seller has not answered.

Only a pending offer can be withdrawn — an accepted price the seller agreed to cannot be taken back here.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The offer id.
    try {
      BuyerResponse result = apiInstance.deleteBuyerOffer(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#deleteBuyerOffer");
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
 **id** | **UUID**| The offer id. |

### Return type

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="deleteBuyerRecentlyViewed"></a>
# **deleteBuyerRecentlyViewed**
> BuyerResponse deleteBuyerRecentlyViewed(slug)

Remove one listing from your recently viewed.

Viewing it again brings it back. Sellers’ view counts are unaffected.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | The listing slug.
    try {
      BuyerResponse result = apiInstance.deleteBuyerRecentlyViewed(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#deleteBuyerRecentlyViewed");
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
 **slug** | **String**| The listing slug. |

### Return type

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="deleteBuyerRecentlyViewed2"></a>
# **deleteBuyerRecentlyViewed2**
> BuyerResponse deleteBuyerRecentlyViewed2()

Clear your recently viewed list.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      BuyerResponse result = apiInstance.deleteBuyerRecentlyViewed2();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#deleteBuyerRecentlyViewed2");
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

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="deleteBuyerRegistry"></a>
# **deleteBuyerRegistry**
> BuyerResponse deleteBuyerRegistry(id)

Delete a registry (and the wishlist behind it).

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerResponse result = apiInstance.deleteBuyerRegistry(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#deleteBuyerRegistry");
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

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="deleteBuyerSellerClubJoin"></a>
# **deleteBuyerSellerClubJoin**
> BuyerResponse deleteBuyerSellerClubJoin(sellerUserId)

Leave a seller’s loyalty club.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String sellerUserId = "sellerUserId_example"; // String | 
    try {
      BuyerResponse result = apiInstance.deleteBuyerSellerClubJoin(sellerUserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#deleteBuyerSellerClubJoin");
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
 **sellerUserId** | **String**|  |

### Return type

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="deleteBuyerSellerLoyaltyJoin"></a>
# **deleteBuyerSellerLoyaltyJoin**
> BuyerResponse deleteBuyerSellerLoyaltyJoin(sellerUserId)

Leave a seller’s loyalty club.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String sellerUserId = "sellerUserId_example"; // String | 
    try {
      BuyerResponse result = apiInstance.deleteBuyerSellerLoyaltyJoin(sellerUserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#deleteBuyerSellerLoyaltyJoin");
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
 **sellerUserId** | **String**|  |

### Return type

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="deleteBuyerTogetherItem"></a>
# **deleteBuyerTogetherItem**
> BuyerResponse deleteBuyerTogetherItem(code, id)

Take an item you added off a room’s board.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String code = "code_example"; // String | 
    String id = "id_example"; // String | 
    try {
      BuyerResponse result = apiInstance.deleteBuyerTogetherItem(code, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#deleteBuyerTogetherItem");
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
 **code** | **String**|  |
 **id** | **String**|  |

### Return type

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="deleteBuyerTotalRequest"></a>
# **deleteBuyerTotalRequest**
> BuyerResponse deleteBuyerTotalRequest(id)

Cancel a total request you made.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The id.
    try {
      BuyerResponse result = apiInstance.deleteBuyerTotalRequest(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#deleteBuyerTotalRequest");
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
 **id** | **UUID**| The id. |

### Return type

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="deleteBuyerTryOn"></a>
# **deleteBuyerTryOn**
> DeleteBuyerTryOnResponse deleteBuyerTryOn(id)

Delete a try-on and its images — or pass &#x60;all&#x60; to delete every photo and result.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      DeleteBuyerTryOnResponse result = apiInstance.deleteBuyerTryOn(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#deleteBuyerTryOn");
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

**DeleteBuyerTryOnResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="deleteBuyerWholesaleOrderSheet"></a>
# **deleteBuyerWholesaleOrderSheet**
> DeleteBuyerWholesaleOrderSheetResponse deleteBuyerWholesaleOrderSheet(id)

Delete an order sheet.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      DeleteBuyerWholesaleOrderSheetResponse result = apiInstance.deleteBuyerWholesaleOrderSheet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#deleteBuyerWholesaleOrderSheet");
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

**DeleteBuyerWholesaleOrderSheetResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="deleteBuyerWishlist"></a>
# **deleteBuyerWishlist**
> BuyerResponse deleteBuyerWishlist(id)

Delete a wishlist and everything on it.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The id.
    try {
      BuyerResponse result = apiInstance.deleteBuyerWishlist(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#deleteBuyerWishlist");
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
 **id** | **UUID**| The id. |

### Return type

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="deleteBuyerWishlistItem"></a>
# **deleteBuyerWishlistItem**
> DeleteBuyerWishlistItemResponse deleteBuyerWishlistItem(id, slug)

Take a listing off a wishlist.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The wishlist id.
    String slug = "slug_example"; // String | The listing slug.
    try {
      DeleteBuyerWishlistItemResponse result = apiInstance.deleteBuyerWishlistItem(id, slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#deleteBuyerWishlistItem");
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
 **id** | **UUID**| The wishlist id. |
 **slug** | **String**| The listing slug. |

### Return type

**DeleteBuyerWishlistItemResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="deleteBuyerWishlistMember"></a>
# **deleteBuyerWishlistMember**
> BuyerResponse deleteBuyerWishlistMember(id, userId)

Remove a co-editor (the owner), or leave a list shared with you (your own user id).

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    String userId = "userId_example"; // String | 
    try {
      BuyerResponse result = apiInstance.deleteBuyerWishlistMember(id, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#deleteBuyerWishlistMember");
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
 **userId** | **String**|  |

### Return type

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerAuctionMe"></a>
# **getBuyerAuctionMe**
> GetBuyerAuctionMeResponse getBuyerAuctionMe(slug)

Where you stand in one auction — your max, leading, won, must you pay.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | The auction listing slug.
    try {
      GetBuyerAuctionMeResponse result = apiInstance.getBuyerAuctionMe(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerAuctionMe");
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
 **slug** | **String**| The auction listing slug. |

### Return type

**GetBuyerAuctionMeResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerBadge"></a>
# **getBuyerBadge**
> GetBuyerBadgeResponse getBuyerBadge()

The counts behind the account badge — unread messages, offers waiting, orders to review.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      GetBuyerBadgeResponse result = apiInstance.getBuyerBadge();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerBadge");
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

**GetBuyerBadgeResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerBoard"></a>
# **getBuyerBoard**
> BuyerBoardResponse getBuyerBoard(id)

One of your boards with its layout: each item’s x, y and width as fractions of the board, and stacking order.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerBoardResponse result = apiInstance.getBuyerBoard(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerBoard");
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

**BuyerBoardResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerBoardShared"></a>
# **getBuyerBoardShared**
> BuyerBoardResponse getBuyerBoardShared(token)

A shared outfit board, by its link token.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String token = "token_example"; // String | 
    try {
      BuyerBoardResponse result = apiInstance.getBuyerBoardShared(token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerBoardShared");
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
 **token** | **String**|  |

### Return type

**BuyerBoardResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerBreak"></a>
# **getBuyerBreak**
> GetBuyerBreakResponse getBuyerBreak(id)

A card break’s board: spots, holders, and the seed after the draw.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetBuyerBreakResponse result = apiInstance.getBuyerBreak(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerBreak");
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

**GetBuyerBreakResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerCase"></a>
# **getBuyerCase**
> GetBuyerCaseResponse getBuyerCase(id)

One case — its state, the message thread, and the return parcel if there is one.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The id.
    try {
      GetBuyerCaseResponse result = apiInstance.getBuyerCase(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerCase");
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
 **id** | **UUID**| The id. |

### Return type

**GetBuyerCaseResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerCatalogListingMySize"></a>
# **getBuyerCatalogListingMySize**
> GetBuyerCatalogListingMySizeResponse getBuyerCatalogListingMySize(slug)

This item against your size: the size you keep in this kind of item (and in this brand), whether this one is your size, smaller or larger, a warning if this brand and size ran small or large on you before, and how other buyers say the brand runs. null for an unsized item.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      GetBuyerCatalogListingMySizeResponse result = apiInstance.getBuyerCatalogListingMySize(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerCatalogListingMySize");
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
 **slug** | **String**|  |

### Return type

**GetBuyerCatalogListingMySizeResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerCatalogListingPrice"></a>
# **getBuyerCatalogListingPrice**
> GetBuyerCatalogListingPriceResponse getBuyerCatalogListingPrice(slug)

The price today. When the seller has the same item live on another marketplace for less, this IS that price (&#x60;priceMatch&#x60; says where from), and &#x60;lowestAnywhere&#x60; lists the marketplaces it is guaranteed not to be cheaper on. &#x60;priceCheck&#x60; rates it against real sales of the same catalog item in the same condition over the last 180 days (great / good / fair / high, with the median and middle-half range in cents); null until there are 3+ sales from 2+ sellers.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      GetBuyerCatalogListingPriceResponse result = apiInstance.getBuyerCatalogListingPrice(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerCatalogListingPrice");
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
 **slug** | **String**|  |

### Return type

**GetBuyerCatalogListingPriceResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerCatalogListingRental"></a>
# **getBuyerCatalogListingRental**
> GetBuyerCatalogListingRentalResponse getBuyerCatalogListingRental(slug)

Whether a listing is for rent: day and week rates, the refundable deposit, length limits, the turnaround buffer, and the dates already booked. null when it is not for rent.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      GetBuyerCatalogListingRentalResponse result = apiInstance.getBuyerCatalogListingRental(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerCatalogListingRental");
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
 **slug** | **String**|  |

### Return type

**GetBuyerCatalogListingRentalResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerCheckoutUsdc"></a>
# **getBuyerCheckoutUsdc**
> GetBuyerCheckoutUsdcResponse getBuyerCheckoutUsdc()

Whether Crossly takes USDC (Stripe stablecoin payments: Solana, Ethereum, Base, Polygon), and its per-order limit. Paying needs the buyer’s wallet, so it happens in the browser checkout, never unattended.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      GetBuyerCheckoutUsdcResponse result = apiInstance.getBuyerCheckoutUsdc();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerCheckoutUsdc");
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

**GetBuyerCheckoutUsdcResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerCollectionOffer"></a>
# **getBuyerCollectionOffer**
> GetBuyerCollectionOfferResponse getBuyerCollectionOffer(id)

What an item in your collection would fetch now: the top open bid on the market for the same variant, condition and grade, and Crossly’s instant offer in store credit when that is switched on (a quote valid for a limited time).

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetBuyerCollectionOfferResponse result = apiInstance.getBuyerCollectionOffer(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerCollectionOffer");
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

**GetBuyerCollectionOfferResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerCollectionSet"></a>
# **getBuyerCollectionSet**
> GetBuyerCollectionSetResponse getBuyerCollectionSet(category, brand, model)

One set: every piece (owned or missing, with its lowest ask on the market), what completing it would cost now, and the leaderboard of collectors who opted in, with your rank.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String category = "category_example"; // String | 
    String brand = "brand_example"; // String | 
    String model = "model_example"; // String | 
    try {
      GetBuyerCollectionSetResponse result = apiInstance.getBuyerCollectionSet(category, brand, model);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerCollectionSet");
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
 **category** | **String**|  |
 **brand** | **String**|  |
 **model** | **String**|  |

### Return type

**GetBuyerCollectionSetResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerCompany"></a>
# **getBuyerCompany**
> BuyerCompanyResponse getBuyerCompany()

Your buyer company (members, roles, approval limits, shared addresses), or null when you are in none.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      BuyerCompanyResponse result = apiInstance.getBuyerCompany();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerCompany");
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

**BuyerCompanyResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerCreation"></a>
# **getBuyerCreation**
> GetBuyerCreationResponse getBuyerCreation(format, id)

A live creation&#39;s public page: its rating breakdown, recent reviews and whether you can review it.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String format = "wearable"; // String | The creation format.
    String id = "id_example"; // String | The creation id (a card is <setId>.<slug>).
    try {
      GetBuyerCreationResponse result = apiInstance.getBuyerCreation(format, id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerCreation");
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
 **format** | **String**| The creation format. | [enum: wearable, decor, interactive, card]
 **id** | **String**| The creation id (a card is &lt;setId&gt;.&lt;slug&gt;). |

### Return type

**GetBuyerCreationResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerCreator"></a>
# **getBuyerCreator**
> GetBuyerCreatorResponse getBuyerCreator(handle)

A creator storefront: profile, affiliate code, and shelves of live picks.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String handle = "handle_example"; // String | 
    try {
      GetBuyerCreatorResponse result = apiInstance.getBuyerCreator(handle);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerCreator");
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
 **handle** | **String**|  |

### Return type

**GetBuyerCreatorResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerEvent"></a>
# **getBuyerEvent**
> GetBuyerEventResponse getBuyerEvent(slug)

A seller event: schedule, location, host, linked listings, live show, promo code, RSVP counts and your own RSVP.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      GetBuyerEventResponse result = apiInstance.getBuyerEvent(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerEvent");
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
 **slug** | **String**|  |

### Return type

**GetBuyerEventResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerFitVocabulary"></a>
# **getBuyerFitVocabulary**
> GetBuyerFitVocabularyResponse getBuyerFitVocabulary()

Garment kinds and the measurements each takes.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      GetBuyerFitVocabularyResponse result = apiInstance.getBuyerFitVocabulary();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerFitVocabulary");
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

**GetBuyerFitVocabularyResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerGiftFinderOption"></a>
# **getBuyerGiftFinderOption**
> GetBuyerGiftFinderOptionResponse getBuyerGiftFinderOption()

The gift finder’s questions: recipients, interests, budgets.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      GetBuyerGiftFinderOptionResponse result = apiInstance.getBuyerGiftFinderOption();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerGiftFinderOption");
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

**GetBuyerGiftFinderOptionResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerHome"></a>
# **getBuyerHome**
> BuyerHomeResponse getBuyerHome()

Your home in Crossly World (made on first read).

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      BuyerHomeResponse result = apiInstance.getBuyerHome();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerHome");
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

**BuyerHomeResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerHomePlaceable"></a>
# **getBuyerHomePlaceable**
> GetBuyerHomePlaceableResponse getBuyerHomePlaceable()

What you could place in your home: your items and delivered furniture.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      GetBuyerHomePlaceableResponse result = apiInstance.getBuyerHomePlaceable();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerHomePlaceable");
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

**GetBuyerHomePlaceableResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerImpact"></a>
# **getBuyerImpact**
> GetBuyerImpactResponse getBuyerImpact()

The sourced footprint your secondhand purchases avoided.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      GetBuyerImpactResponse result = apiInstance.getBuyerImpact();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerImpact");
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

**GetBuyerImpactResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerLayaway"></a>
# **getBuyerLayaway**
> BuyerLayawayResponse getBuyerLayaway(id)

One layaway and its schedule.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerLayawayResponse result = apiInstance.getBuyerLayaway(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerLayaway");
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

**BuyerLayawayResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerListingAudioSummary"></a>
# **getBuyerListingAudioSummary**
> GetBuyerListingAudioSummaryResponse getBuyerListingAudioSummary(slug)

A spoken summary of a listing (accessibility): the text, built only from the listing’s own fields and the seller’s description, and the recording of it when one exists.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      GetBuyerListingAudioSummaryResponse result = apiInstance.getBuyerListingAudioSummary(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerListingAudioSummary");
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
 **slug** | **String**|  |

### Return type

**GetBuyerListingAudioSummaryResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerListingBoughtTogether"></a>
# **getBuyerListingBoughtTogether**
> GetBuyerListingBoughtTogetherResponse getBuyerListingBoughtTogether(slug)

Frequently bought together / complete the look.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      GetBuyerListingBoughtTogetherResponse result = apiInstance.getBuyerListingBoughtTogether(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerListingBoughtTogether");
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
 **slug** | **String**|  |

### Return type

**GetBuyerListingBoughtTogetherResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerListingBreak"></a>
# **getBuyerListingBreak**
> GetBuyerListingBreakResponse getBuyerListingBreak(slug)

The card break this listing sells spots in, if any; the seed is revealed after the draw.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      GetBuyerListingBreakResponse result = apiInstance.getBuyerListingBreak(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerListingBreak");
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
 **slug** | **String**|  |

### Return type

**GetBuyerListingBreakResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerListingCert"></a>
# **getBuyerListingCert**
> GetBuyerListingCertResponse getBuyerListingCert(slug)

A graded listing’s cert, checked with the grader: the seller’s claim (grader, grade, cert number), status (verified, mismatch, not_found, or unchecked where the grader has no lookup), population and how many graded higher where the grader publishes them, and the grader’s own cert page.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      GetBuyerListingCertResponse result = apiInstance.getBuyerListingCert(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerListingCert");
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
 **slug** | **String**|  |

### Return type

**GetBuyerListingCertResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerListingFit"></a>
# **getBuyerListingFit**
> GetBuyerListingFitResponse getBuyerListingFit(slug)

A listing’s flat measurements, compared with your saved reference garments.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      GetBuyerListingFitResponse result = apiInstance.getBuyerListingFit(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerListingFit");
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
 **slug** | **String**|  |

### Return type

**GetBuyerListingFitResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerListingGroupBuy"></a>
# **getBuyerListingGroupBuy**
> GetBuyerListingGroupBuyResponse getBuyerListingGroupBuy(slug)

The group buy open on this listing, if any.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      GetBuyerListingGroupBuyResponse result = apiInstance.getBuyerListingGroupBuy(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerListingGroupBuy");
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
 **slug** | **String**|  |

### Return type

**GetBuyerListingGroupBuyResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerListingImpact"></a>
# **getBuyerListingImpact**
> GetBuyerListingImpactResponse getBuyerListingImpact(slug)

The sourced footprint of making a new equivalent; null when no published figure applies.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      GetBuyerListingImpactResponse result = apiInstance.getBuyerListingImpact(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerListingImpact");
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
 **slug** | **String**|  |

### Return type

**GetBuyerListingImpactResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerListingResaleValue"></a>
# **getBuyerListingResaleValue**
> GetBuyerListingResaleValueResponse getBuyerListingResaleValue(slug)

What the same brand and category resold for on Crossly, and the buyback offer when enabled.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      GetBuyerListingResaleValueResponse result = apiInstance.getBuyerListingResaleValue(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerListingResaleValue");
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
 **slug** | **String**|  |

### Return type

**GetBuyerListingResaleValueResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerListingSubscribeOffer"></a>
# **getBuyerListingSubscribeOffer**
> GetBuyerListingSubscribeOfferResponse getBuyerListingSubscribeOffer(slug)

The subscribe &amp; save discount and intervals on a listing; null when the seller has none.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      GetBuyerListingSubscribeOfferResponse result = apiInstance.getBuyerListingSubscribeOffer(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerListingSubscribeOffer");
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
 **slug** | **String**|  |

### Return type

**GetBuyerListingSubscribeOfferResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerListingTryOn"></a>
# **getBuyerListingTryOn**
> GetBuyerListingTryOnResponse getBuyerListingTryOn(slug)

Whether an AI try-on is offered for this listing (a wearable with a photo) and whether the image model is configured.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      GetBuyerListingTryOnResponse result = apiInstance.getBuyerListingTryOn(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerListingTryOn");
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
 **slug** | **String**|  |

### Return type

**GetBuyerListingTryOnResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerLiveStreamAuction"></a>
# **getBuyerLiveStreamAuction**
> GetBuyerLiveStreamAuctionResponse getBuyerLiveStreamAuction(id)

The auction running on a live stream right now, if any. Bid on it by its &#x60;slug&#x60; at POST /v1/buyer/auctions/:slug/bids.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetBuyerLiveStreamAuctionResponse result = apiInstance.getBuyerLiveStreamAuction(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerLiveStreamAuction");
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

**GetBuyerLiveStreamAuctionResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerMarketPurchaseOption"></a>
# **getBuyerMarketPurchaseOption**
> GetBuyerMarketPurchaseOptionResponse getBuyerMarketPurchaseOption()

Before you bid or buy: whether the lowest ask is vault stock (keep it vaulted, or pay fastShipCents to rush it), and the grading runs a raw card can go straight to (pass gradeWith on the bid).

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      GetBuyerMarketPurchaseOptionResponse result = apiInstance.getBuyerMarketPurchaseOption();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerMarketPurchaseOption");
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

**GetBuyerMarketPurchaseOptionResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerOrderEligibility"></a>
# **getBuyerOrderEligibility**
> GetBuyerOrderEligibilityResponse getBuyerOrderEligibility(id)

What you can do with one order right now — cancel, confirm receipt, report not received, leave feedback.

&#x60;inr.eligible&#x60; says whether an item-not-received case can be opened; when it cannot, &#x60;inr.reason&#x60; says why and &#x60;inr.opensAt&#x60; when it will. The same rules the order page and the action routes enforce.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The id.
    try {
      GetBuyerOrderEligibilityResponse result = apiInstance.getBuyerOrderEligibility(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerOrderEligibility");
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
 **id** | **UUID**| The id. |

### Return type

**GetBuyerOrderEligibilityResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerOrderExport"></a>
# **getBuyerOrderExport**
> GetBuyerOrderExportResponse getBuyerOrderExport(from, to)

Your order history as CSV text (up to 5,000 orders).

The same CSV the shop downloads, returned as a string in &#x60;data.csv&#x60; so a program or agent can read it without a file download. Money columns are dollars, as a spreadsheet expects.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String from = "from_example"; // String | First day to include, YYYY-MM-DD.
    String to = "to_example"; // String | Last day to include, YYYY-MM-DD (inclusive).
    try {
      GetBuyerOrderExportResponse result = apiInstance.getBuyerOrderExport(from, to);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerOrderExport");
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
 **from** | **String**| First day to include, YYYY-MM-DD. | [optional]
 **to** | **String**| Last day to include, YYYY-MM-DD (inclusive). | [optional]

### Return type

**GetBuyerOrderExportResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerOrderPriceProtection"></a>
# **getBuyerOrderPriceProtection**
> GetBuyerOrderPriceProtectionResponse getBuyerOrderPriceProtection(id)

Price protection on one order: if the item gets cheaper before &#x60;until&#x60;, the difference is credited to your Bucks automatically. &#x60;creditedCents&#x60; is what it has paid so far.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetBuyerOrderPriceProtectionResponse result = apiInstance.getBuyerOrderPriceProtection(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerOrderPriceProtection");
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

**GetBuyerOrderPriceProtectionResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerPack"></a>
# **getBuyerPack**
> GetBuyerPackResponse getBuyerPack(slug)

One pack: tiers and odds, items left, expected value, the chase items still in it.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      GetBuyerPackResponse result = apiInstance.getBuyerPack(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerPack");
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
 **slug** | **String**|  |

### Return type

**GetBuyerPackResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerPackFairness"></a>
# **getBuyerPackFairness**
> GetBuyerPackFairnessResponse getBuyerPackFairness()

Your provably-fair seeds: the active server-seed commitment (sha256), your client seed and nonce, and every retired seed in full so past openings can be re-run.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      GetBuyerPackFairnessResponse result = apiInstance.getBuyerPackFairness();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerPackFairness");
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

**GetBuyerPackFairnessResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerParty"></a>
# **getBuyerParty**
> GetBuyerPartyResponse getBuyerParty(slug)

One shopping party.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      GetBuyerPartyResponse result = apiInstance.getBuyerParty(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerParty");
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
 **slug** | **String**|  |

### Return type

**GetBuyerPartyResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerPassport"></a>
# **getBuyerPassport**
> GetBuyerPassportResponse getBuyerPassport(code)

What a product passport tag opens: the item, the verify verdict (registered, tag bound, tag matches with ?uid&#x3D;, authenticated, graded, in its owner’s hands), how many owners and since when — never who or for how much.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String code = "code_example"; // String | 
    try {
      GetBuyerPassportResponse result = apiInstance.getBuyerPassport(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerPassport");
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
 **code** | **String**|  |

### Return type

**GetBuyerPassportResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerPreference"></a>
# **getBuyerPreference**
> GetBuyerPreferenceResponse getBuyerPreference()

The shopping profile derived from that activity.

Derived, never declared — there is no preferences form anywhere. &#x60;matchRate&#x60; is the share of this person&#39;s searches Crossly could answer; a low number is an inventory problem, not a personalisation one, which is why it is here.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      GetBuyerPreferenceResponse result = apiInstance.getBuyerPreference();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerPreference");
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

**GetBuyerPreferenceResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerPriceGuide"></a>
# **getBuyerPriceGuide**
> GetBuyerPriceGuideResponse getBuyerPriceGuide()

What matching items actually sold for on Crossly: median, quartiles, by month, and recent sales. Needs q, brand or category.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      GetBuyerPriceGuideResponse result = apiInstance.getBuyerPriceGuide();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerPriceGuide");
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

**GetBuyerPriceGuideResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerProfile"></a>
# **getBuyerProfile**
> GetBuyerProfileResponse getBuyerProfile()

Your Crossly shopping profile — name, email, saved address, Bucks balance.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      GetBuyerProfileResponse result = apiInstance.getBuyerProfile();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerProfile");
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

**GetBuyerProfileResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerPurchaseDelivery"></a>
# **getBuyerPurchaseDelivery**
> GetBuyerPurchaseDeliveryResponse getBuyerPurchaseDelivery(id)

Where a purchase is going when not to your door: the pickup point (with its release code) or its ship-together consolidation.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetBuyerPurchaseDeliveryResponse result = apiInstance.getBuyerPurchaseDelivery(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerPurchaseDelivery");
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

**GetBuyerPurchaseDeliveryResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerPurchaseLiveMoment"></a>
# **getBuyerPurchaseLiveMoment**
> GetBuyerPurchaseLiveMomentResponse getBuyerPurchaseLiveMoment(id)

The live show a purchase was bought in, with the offset (seconds) into its replay where it sold. null when it was not bought in a show.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetBuyerPurchaseLiveMomentResponse result = apiInstance.getBuyerPurchaseLiveMoment(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerPurchaseLiveMoment");
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

**GetBuyerPurchaseLiveMomentResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerPurchaseReturn"></a>
# **getBuyerPurchaseReturn**
> GetBuyerPurchaseReturnResponse getBuyerPurchaseReturn(id)

What a return would refund for each reason, by when, and any return already open.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetBuyerPurchaseReturnResponse result = apiInstance.getBuyerPurchaseReturn(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerPurchaseReturn");
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

**GetBuyerPurchaseReturnResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerPurchaseStory"></a>
# **getBuyerPurchaseStory**
> GetBuyerPurchaseStoryResponse getBuyerPurchaseStory(id)

Your owner story on a purchase, passed on to the next owner if you resell it.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetBuyerPurchaseStoryResponse result = apiInstance.getBuyerPurchaseStory(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerPurchaseStory");
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

**GetBuyerPurchaseStoryResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerRegistry"></a>
# **getBuyerRegistry**
> BuyerRegistryResponse getBuyerRegistry(id)

One of your registries: items with how many are wanted and bought.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerRegistryResponse result = apiInstance.getBuyerRegistry(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerRegistry");
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

**BuyerRegistryResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerRegistryByToken"></a>
# **getBuyerRegistryByToken**
> BuyerRegistryResponse getBuyerRegistryByToken(token)

A registry as a guest sees it: items, how many are still wanted, and whether it can ship. Never the address.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String token = "token_example"; // String | 
    try {
      BuyerRegistryResponse result = apiInstance.getBuyerRegistryByToken(token);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerRegistryByToken");
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
 **token** | **String**|  |

### Return type

**BuyerRegistryResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerRental"></a>
# **getBuyerRental**
> GetBuyerRentalResponse getBuyerRental(id)

One of your rentals: timeline, payments, the return label, extension and buy-out terms.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetBuyerRentalResponse result = apiInstance.getBuyerRental(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerRental");
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

**GetBuyerRentalResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerRentalEligibility"></a>
# **getBuyerRentalEligibility**
> GetBuyerRentalEligibilityResponse getBuyerRentalEligibility()

Can you rent right now: ID-verified (a photo ID and a matching selfie, once), the verified name rentals ship to, and your standing (one rental at a time until your first comes back; none after one that never did).

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      GetBuyerRentalEligibilityResponse result = apiInstance.getBuyerRentalEligibility();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerRentalEligibility");
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

**GetBuyerRentalEligibilityResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerSellerClub"></a>
# **getBuyerSellerClub**
> GetBuyerSellerClubResponse getBuyerSellerClub(sellerUserId)

A seller’s loyalty club: its tiers (spend threshold, discount, perks) and your standing. null when the seller has none.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String sellerUserId = "sellerUserId_example"; // String | 
    try {
      GetBuyerSellerClubResponse result = apiInstance.getBuyerSellerClub(sellerUserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerSellerClub");
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
 **sellerUserId** | **String**|  |

### Return type

**GetBuyerSellerClubResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerSellerLoyalty"></a>
# **getBuyerSellerLoyalty**
> GetBuyerSellerLoyaltyResponse getBuyerSellerLoyalty(sellerUserId)

A seller’s loyalty club with its typed perks per tier, its join mode (automatic, opt-in, invite-only) and your standing. null when they run none.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String sellerUserId = "sellerUserId_example"; // String | 
    try {
      GetBuyerSellerLoyaltyResponse result = apiInstance.getBuyerSellerLoyalty(sellerUserId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerSellerLoyalty");
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
 **sellerUserId** | **String**|  |

### Return type

**GetBuyerSellerLoyaltyResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerSellerTrust"></a>
# **getBuyerSellerTrust**
> GetBuyerSellerTrustResponse getBuyerSellerTrust(username)

Seller at a glance: member since, completed sales, independent rating, typical handling time, dispute rate, trust tier, badges — and the plain sentences the profile shows.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String username = "username_example"; // String | 
    try {
      GetBuyerSellerTrustResponse result = apiInstance.getBuyerSellerTrust(username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerSellerTrust");
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
 **username** | **String**|  |

### Return type

**GetBuyerSellerTrustResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerTogether"></a>
# **getBuyerTogether**
> GetBuyerTogetherResponse getBuyerTogether(code)

A shop-together room: members, the board with votes, and chat.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String code = "code_example"; // String | 
    try {
      GetBuyerTogetherResponse result = apiInstance.getBuyerTogether(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerTogether");
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
 **code** | **String**|  |

### Return type

**GetBuyerTogetherResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerVaultMarketHistory"></a>
# **getBuyerVaultMarketHistory**
> GetBuyerVaultMarketHistoryResponse getBuyerVaultMarketHistory()

Your Vault Markets value by day at the marks (oldest first, today live) over &#x60;days&#x60; (default 90), and today’s change against yesterday’s close.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      GetBuyerVaultMarketHistoryResponse result = apiInstance.getBuyerVaultMarketHistory();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerVaultMarketHistory");
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

**GetBuyerVaultMarketHistoryResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerVaultMarketIndex"></a>
# **getBuyerVaultMarketIndex**
> GetBuyerVaultMarketIndexResponse getBuyerVaultMarketIndex(slug)

One index with its published daily closes (oldest first, &#x60;days&#x60; default 365) and its level now.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      GetBuyerVaultMarketIndexResponse result = apiInstance.getBuyerVaultMarketIndex(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerVaultMarketIndex");
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
 **slug** | **String**|  |

### Return type

**GetBuyerVaultMarketIndexResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerVaultMarketInstantExit"></a>
# **getBuyerVaultMarketInstantExit**
> GetBuyerVaultMarketInstantExitResponse getBuyerVaultMarketInstantExit(id)

The Instant Exit quote for one vault unit you hold, and whether it can be sold now.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetBuyerVaultMarketInstantExitResponse result = apiInstance.getBuyerVaultMarketInstantExit(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerVaultMarketInstantExit");
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

**GetBuyerVaultMarketInstantExitResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerVaultMarketOptionAnalytic"></a>
# **getBuyerVaultMarketOptionAnalytic**
> GetBuyerVaultMarketOptionAnalyticResponse getBuyerVaultMarketOptionAnalytic(underlying)

Options analytics on an underlying: vol surface and smile, IV rank and percentile, open interest and volume by strike and expiry, put/call ratios, expected move and historical vol. Derived, display only. Read only.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String underlying = "underlying_example"; // String | 
    try {
      GetBuyerVaultMarketOptionAnalyticResponse result = apiInstance.getBuyerVaultMarketOptionAnalytic(underlying);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerVaultMarketOptionAnalytic");
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
 **underlying** | **String**|  |

### Return type

**GetBuyerVaultMarketOptionAnalyticResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerVaultMarketOptionChain"></a>
# **getBuyerVaultMarketOptionChain**
> GetBuyerVaultMarketOptionChainResponse getBuyerVaultMarketOptionChain(underlying)

The option chain for an underlying (index slug or book key): expiries, and for one expiry each strike’s call and put with bid / ask, last, open interest, theoretical price, implied vol (display only) and Greeks. Prices are cents per contract.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String underlying = "underlying_example"; // String | 
    try {
      GetBuyerVaultMarketOptionChainResponse result = apiInstance.getBuyerVaultMarketOptionChain(underlying);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerVaultMarketOptionChain");
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
 **underlying** | **String**|  |

### Return type

**GetBuyerVaultMarketOptionChainResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerVaultMarketOptionIv"></a>
# **getBuyerVaultMarketOptionIv**
> GetBuyerVaultMarketOptionIvResponse getBuyerVaultMarketOptionIv(underlying)

The at-the-money implied vol on an underlying’s nearest expiry, for display: derived from the options book, quality C, never a mark.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String underlying = "underlying_example"; // String | 
    try {
      GetBuyerVaultMarketOptionIvResponse result = apiInstance.getBuyerVaultMarketOptionIv(underlying);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerVaultMarketOptionIv");
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
 **underlying** | **String**|  |

### Return type

**GetBuyerVaultMarketOptionIvResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerVaultMarketOptionPosition"></a>
# **getBuyerVaultMarketOptionPosition**
> GetBuyerVaultMarketOptionPositionResponse getBuyerVaultMarketOptionPosition()

Your fractional options positions with their marks, P&amp;L and Greeks (open by default; &#x60;status&#x60; all for closed and settled too). Read only.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      GetBuyerVaultMarketOptionPositionResponse result = apiInstance.getBuyerVaultMarketOptionPosition();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerVaultMarketOptionPosition");
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

**GetBuyerVaultMarketOptionPositionResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerVaultMarketOptionRisk"></a>
# **getBuyerVaultMarketOptionRisk**
> GetBuyerVaultMarketOptionRiskResponse getBuyerVaultMarketOptionRisk()

Your options portfolio Greeks, a scenario&#39;s P&amp;L (&#x60;priceShift&#x60;, &#x60;volShift&#x60;, &#x60;daysForward&#x60;) and the beta-weighted delta against an index. Read only.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      GetBuyerVaultMarketOptionRiskResponse result = apiInstance.getBuyerVaultMarketOptionRisk();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerVaultMarketOptionRisk");
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

**GetBuyerVaultMarketOptionRiskResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerVaultMarketPredictionBoard"></a>
# **getBuyerVaultMarketPredictionBoard**
> GetBuyerVaultMarketPredictionBoardResponse getBuyerVaultMarketPredictionBoard()

The busiest open prediction markets and their odds (the Trading Floor board). Anonymous.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      GetBuyerVaultMarketPredictionBoardResponse result = apiInstance.getBuyerVaultMarketPredictionBoard();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerVaultMarketPredictionBoard");
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

**GetBuyerVaultMarketPredictionBoardResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerVaultMarketPredictionEvent"></a>
# **getBuyerVaultMarketPredictionEvent**
> GetBuyerVaultMarketPredictionEventResponse getBuyerVaultMarketPredictionEvent(id)

One expiry’s markets with your holdings in each and their real worst and best case across them.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetBuyerVaultMarketPredictionEventResponse result = apiInstance.getBuyerVaultMarketPredictionEvent(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerVaultMarketPredictionEvent");
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

**GetBuyerVaultMarketPredictionEventResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerVaultMarketPredictionLeaderboard"></a>
# **getBuyerVaultMarketPredictionLeaderboard**
> GetBuyerVaultMarketPredictionLeaderboardResponse getBuyerVaultMarketPredictionLeaderboard()

Opt-in forecaster leaderboards (&#x60;period&#x60; week | month | all; &#x60;metric&#x60; pnl | accuracy | brier; &#x60;venue&#x60; live | paper).

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      GetBuyerVaultMarketPredictionLeaderboardResponse result = apiInstance.getBuyerVaultMarketPredictionLeaderboard();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerVaultMarketPredictionLeaderboard");
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

**GetBuyerVaultMarketPredictionLeaderboardResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerVaultMarketPredictionMarket"></a>
# **getBuyerVaultMarketPredictionMarket**
> GetBuyerVaultMarketPredictionMarketResponse getBuyerVaultMarketPredictionMarket(id)

One prediction market: terms, the Yes ladder (live and practice), recent trades, settlement history and the series rules with their hash.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetBuyerVaultMarketPredictionMarketResponse result = apiInstance.getBuyerVaultMarketPredictionMarket(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerVaultMarketPredictionMarket");
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

**GetBuyerVaultMarketPredictionMarketResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerVaultMarketPredictionMarketHistory"></a>
# **getBuyerVaultMarketPredictionMarketHistory**
> GetBuyerVaultMarketPredictionMarketHistoryResponse getBuyerVaultMarketPredictionMarketHistory(id)

A prediction market’s probability over time (display only, never a mark), candles on the Yes price, volume and open interest (&#x60;range&#x60; 1d, 1w, 1m, all; &#x60;venue&#x60; live or paper).

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetBuyerVaultMarketPredictionMarketHistoryResponse result = apiInstance.getBuyerVaultMarketPredictionMarketHistory(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerVaultMarketPredictionMarketHistory");
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

**GetBuyerVaultMarketPredictionMarketHistoryResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerVaultMarketShare"></a>
# **getBuyerVaultMarketShare**
> GetBuyerVaultMarketShareResponse getBuyerVaultMarketShare()

Your Vault Shares: shares and percent of each item, cost, implied value at the last share price (display only, never a mark), subscriptions and payouts.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      GetBuyerVaultMarketShareResponse result = apiInstance.getBuyerVaultMarketShare();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerVaultMarketShare");
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

**GetBuyerVaultMarketShareResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerVaultMarketShareBasket"></a>
# **getBuyerVaultMarketShareBasket**
> GetBuyerVaultMarketShareBasketResponse getBuyerVaultMarketShareBasket(id)

One theme basket: its series, weights and prices, and your holdings against them.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetBuyerVaultMarketShareBasketResponse result = apiInstance.getBuyerVaultMarketShareBasket(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerVaultMarketShareBasket");
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

**GetBuyerVaultMarketShareBasketResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerVaultMarketShareSery"></a>
# **getBuyerVaultMarketShareSery**
> GetBuyerVaultMarketShareSeryResponse getBuyerVaultMarketShareSery(id)

One Vault Shares series: the offering, the share book, the latest fills, holders as percentages (nobody named) and buyouts.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetBuyerVaultMarketShareSeryResponse result = apiInstance.getBuyerVaultMarketShareSery(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerVaultMarketShareSery");
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

**GetBuyerVaultMarketShareSeryResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerVaultMarketShareSeryHistory"></a>
# **getBuyerVaultMarketShareSeryHistory**
> GetBuyerVaultMarketShareSeryHistoryResponse getBuyerVaultMarketShareSeryHistory(id)

A Vault Shares series’ full price history (candles), the offering price and the appraisal history. Display only, never a mark.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetBuyerVaultMarketShareSeryHistoryResponse result = apiInstance.getBuyerVaultMarketShareSeryHistory(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerVaultMarketShareSeryHistory");
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

**GetBuyerVaultMarketShareSeryHistoryResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerVaultMarketShareSeryPerk"></a>
# **getBuyerVaultMarketShareSeryPerk**
> GetBuyerVaultMarketShareSeryPerkResponse getBuyerVaultMarketShareSeryPerk(id)

Your holder perks on a series: badge, visit links, viewing days and your bookings.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetBuyerVaultMarketShareSeryPerkResponse result = apiInstance.getBuyerVaultMarketShareSeryPerk(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerVaultMarketShareSeryPerk");
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

**GetBuyerVaultMarketShareSeryPerkResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerVaultMarketWorth"></a>
# **getBuyerVaultMarketWorth**
> GetBuyerVaultMarketWorthResponse getBuyerVaultMarketWorth()

What your vault is worth now: value at the market prices (marks come only from trades) split into reliable and indicative marks, cost and P&amp;L, today’s change, and an estimate of what the units free to sell would fetch from the bids resting on the book now. Read only.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      GetBuyerVaultMarketWorthResponse result = apiInstance.getBuyerVaultMarketWorth();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerVaultMarketWorth");
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

**GetBuyerVaultMarketWorthResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerWholesaleCart"></a>
# **getBuyerWholesaleCart**
> GetBuyerWholesaleCartResponse getBuyerWholesaleCart()

Your cart grouped per seller: trade terms, the order-minimum progress, every rule the cart breaks (the messages checkout would refuse with), PO reference, quote-locked lines, and the checkout methods, deposit and freight threshold for each group.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      GetBuyerWholesaleCartResponse result = apiInstance.getBuyerWholesaleCart();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerWholesaleCart");
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

**GetBuyerWholesaleCartResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerWholesaleCatalogApply"></a>
# **getBuyerWholesaleCatalogApply**
> GetBuyerWholesaleCatalogApplyResponse getBuyerWholesaleCatalogApply(storeSlug, catalogSlug)

The application form for a store&#39;s wholesale catalog: the seller&#39;s requirements (resale certificate and accepted states, tax id, their custom questions) and your business info pre-filled. applicable&#x3D;false for a catalog you cannot apply to.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String storeSlug = "storeSlug_example"; // String | 
    String catalogSlug = "catalogSlug_example"; // String | 
    try {
      GetBuyerWholesaleCatalogApplyResponse result = apiInstance.getBuyerWholesaleCatalogApply(storeSlug, catalogSlug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerWholesaleCatalogApply");
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
 **storeSlug** | **String**|  |
 **catalogSlug** | **String**|  |

### Return type

**GetBuyerWholesaleCatalogApplyResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerWholesaleDrop"></a>
# **getBuyerWholesaleDrop**
> GetBuyerWholesaleDropResponse getBuyerWholesaleDrop(id)

One trade drop open to you: its listings once live (add one to your cart to reserve or buy it), and your reservations in it. 404 for a drop not open to you.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetBuyerWholesaleDropResponse result = apiInstance.getBuyerWholesaleDrop(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerWholesaleDrop");
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

**GetBuyerWholesaleDropResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerWholesaleInvoicePayQuote"></a>
# **getBuyerWholesaleInvoicePayQuote**
> GetBuyerWholesaleInvoicePayQuoteResponse getBuyerWholesaleInvoicePayQuote(id)

What paying an on-account invoice costs now: balance due, the early-pay discount if still open, the minimum part payment and the methods (card, ach).

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetBuyerWholesaleInvoicePayQuoteResponse result = apiInstance.getBuyerWholesaleInvoicePayQuote(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerWholesaleInvoicePayQuote");
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

**GetBuyerWholesaleInvoicePayQuoteResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerWholesaleOrderSheet"></a>
# **getBuyerWholesaleOrderSheet**
> BuyerWholesaleOrderSheetResponse getBuyerWholesaleOrderSheet(id)

One order sheet priced TODAY at its quantities, with stock, trade terms and flags (unavailable, out_of_stock, short_stock, price_hidden, needs_option).

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerWholesaleOrderSheetResponse result = apiInstance.getBuyerWholesaleOrderSheet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerWholesaleOrderSheet");
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

**BuyerWholesaleOrderSheetResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerWholesaleQuote"></a>
# **getBuyerWholesaleQuote**
> BuyerWholesaleQuoteResponse getBuyerWholesaleQuote(id)

One of your quotes with its items, the seller&#39;s prices and expiry.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerWholesaleQuoteResponse result = apiInstance.getBuyerWholesaleQuote(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerWholesaleQuote");
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

**BuyerWholesaleQuoteResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="getBuyerWholesaleReorder"></a>
# **getBuyerWholesaleReorder**
> GetBuyerWholesaleReorderResponse getBuyerWholesaleReorder(id)

Buy again: a past wholesale order (purchase or order id) as order-sheet lines at the same quantities, priced today, out-of-stock flagged.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      GetBuyerWholesaleReorderResponse result = apiInstance.getBuyerWholesaleReorder(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#getBuyerWholesaleReorder");
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

**GetBuyerWholesaleReorderResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerActivity"></a>
# **listBuyerActivity**
> ListBuyerActivityResponse listBuyerActivity()

What this buyer has compared lately.

Newest first, and only as far back as the retention window — the link between a person and a comparison is dropped after 180 days, so this thins out rather than growing forever.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerActivityResponse result = apiInstance.listBuyerActivity();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerActivity");
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

**ListBuyerActivityResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerAuctionBids"></a>
# **listBuyerAuctionBids**
> ListBuyerAuctionBidsResponse listBuyerAuctionBids(slug)

An auction’s bid history, highest first, bidders anonymised.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | The auction listing slug.
    try {
      ListBuyerAuctionBidsResponse result = apiInstance.listBuyerAuctionBids(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerAuctionBids");
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
 **slug** | **String**| The auction listing slug. |

### Return type

**ListBuyerAuctionBidsResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerAuctions"></a>
# **listBuyerAuctions**
> ListBuyerAuctionsResponse listBuyerAuctions(tab)

Auctions you have bid in — bidding, won or lost (last 100).

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String tab = "bidding"; // String | bidding = still running; won = you are the winner; lost = ended, someone else won.
    try {
      ListBuyerAuctionsResponse result = apiInstance.listBuyerAuctions(tab);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerAuctions");
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
 **tab** | **String**| bidding &#x3D; still running; won &#x3D; you are the winner; lost &#x3D; ended, someone else won. | [optional] [default to bidding] [enum: bidding, won, lost]

### Return type

**ListBuyerAuctionsResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerBoards"></a>
# **listBuyerBoards**
> ListBuyerBoardsResponse listBuyerBoards()

Your outfit boards: collages of listings, each with a share link.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerBoardsResponse result = apiInstance.listBuyerBoards();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerBoards");
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

**ListBuyerBoardsResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerBreaks"></a>
# **listBuyerBreaks**
> BuyerResponse3 listBuyerBreaks()

Card-break spots you hold or bought, with what each pulled.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      BuyerResponse3 result = apiInstance.listBuyerBreaks();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerBreaks");
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

**BuyerResponse3**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerBuybacks"></a>
# **listBuyerBuybacks**
> BuyerResponse3 listBuyerBuybacks()

Your buyback guarantees and requests.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      BuyerResponse3 result = apiInstance.listBuyerBuybacks();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerBuybacks");
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

**BuyerResponse3**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerCart"></a>
# **listBuyerCart**
> ListBuyerCartResponse listBuyerCart()

What is in your Crossly cart.

Line items with the price captured when each was added. This is NOT a quote — shipping, tax and any discounts are computed at checkout against a delivery address, and the sum of these lines is not what you will be charged.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerCartResponse result = apiInstance.listBuyerCart();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerCart");
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

**ListBuyerCartResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerCartSaved"></a>
# **listBuyerCartSaved**
> BuyerCartResponse listBuyerCartSaved()

Items you saved for later out of your cart (last 200).

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      BuyerCartResponse result = apiInstance.listBuyerCartSaved();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerCartSaved");
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

**BuyerCartResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerCases"></a>
# **listBuyerCases**
> ListBuyerCasesResponse listBuyerCases(status)

Resolution center — every case you opened (returns, not received, problems).

&#x60;yourTurn: true&#x60; means the case is waiting on you. &#x60;meta.counts&#x60; covers every case, not just this status.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String status = "open"; // String | open = still being worked; closed = resolved or withdrawn; all = both.
    try {
      ListBuyerCasesResponse result = apiInstance.listBuyerCases(status);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerCases");
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
 **status** | **String**| open &#x3D; still being worked; closed &#x3D; resolved or withdrawn; all &#x3D; both. | [optional] [default to open] [enum: open, closed, all]

### Return type

**ListBuyerCasesResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerCashback"></a>
# **listBuyerCashback**
> ListBuyerCashbackResponse listBuyerCashback(status, page, limit)

Your Scout cashback — pending, confirmed, paid.

Newest first. &#x60;pending&#x60; means an order was reported and the retailer&#39;s return window has not closed; nothing is paid until it does. &#x60;expired&#x60; means a click was never reported as converting, which is the ordinary outcome for most clicks.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String status = "pending"; // String | 
    Integer page = 1; // Integer | 
    Integer limit = 25; // Integer | 
    try {
      ListBuyerCashbackResponse result = apiInstance.listBuyerCashback(status, page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerCashback");
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
 **status** | **String**|  | [optional] [enum: pending, confirmed, rejected, paid, expired]
 **page** | **Integer**|  | [optional] [default to 1]
 **limit** | **Integer**|  | [optional] [default to 25]

### Return type

**ListBuyerCashbackResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerCatalogListingVideos"></a>
# **listBuyerCatalogListingVideos**
> ListBuyerCatalogListingVideosResponse listBuyerCatalogListingVideos(slug)

Videos the seller recorded for this item on request, newest first, with the question each one answers.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      ListBuyerCatalogListingVideosResponse result = apiInstance.listBuyerCatalogListingVideos(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerCatalogListingVideos");
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
 **slug** | **String**|  |

### Return type

**ListBuyerCatalogListingVideosResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerClubs"></a>
# **listBuyerClubs**
> ListBuyerClubsResponse listBuyerClubs()

Sellers’ loyalty clubs you belong to: your spend with each, your tier and its discount, and the next tier.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerClubsResponse result = apiInstance.listBuyerClubs();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerClubs");
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

**ListBuyerClubsResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerCollectionSets"></a>
# **listBuyerCollectionSets**
> BuyerResponse3 listBuyerCollectionSets()

Sets you are collecting — a catalogue brand + model you own at least two pieces of — with owned / total and percent complete, most complete first; and whether you show on set leaderboards.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      BuyerResponse3 result = apiInstance.listBuyerCollectionSets();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerCollectionSets");
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

**BuyerResponse3**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerCompanyApprovals"></a>
# **listBuyerCompanyApprovals**
> BuyerResponse3 listBuyerCompanyApprovals()

Spend approval requests (owners and accounts payable see all; others their own). ?status&#x3D;pending|approved|declined|used|expired.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      BuyerResponse3 result = apiInstance.listBuyerCompanyApprovals();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerCompanyApprovals");
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

**BuyerResponse3**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerConsolidations"></a>
# **listBuyerConsolidations**
> BuyerResponse3 listBuyerConsolidations()

Your ship-together orders: parcels at the hub, and the one box out.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      BuyerResponse3 result = apiInstance.listBuyerConsolidations();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerConsolidations");
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

**BuyerResponse3**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerConversationGuests"></a>
# **listBuyerConversationGuests**
> ListBuyerWishlistMembersResponse listBuyerConversationGuests(id)

Guests in a chat.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      ListBuyerWishlistMembersResponse result = apiInstance.listBuyerConversationGuests(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerConversationGuests");
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

**ListBuyerWishlistMembersResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerCreationReviewable"></a>
# **listBuyerCreationReviewable**
> ListBuyerCreationReviewableResponse listBuyerCreationReviewable(purchaseRef)

Creations you bought (decor, wearables, interactive objects, cards from packs) and your review of each.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String purchaseRef = "purchaseRef_example"; // String | Only the creation this purchase bought.
    try {
      ListBuyerCreationReviewableResponse result = apiInstance.listBuyerCreationReviewable(purchaseRef);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerCreationReviewable");
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
 **purchaseRef** | **String**| Only the creation this purchase bought. | [optional]

### Return type

**ListBuyerCreationReviewableResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerEvents"></a>
# **listBuyerEvents**
> ListBuyerEventsResponse listBuyerEvents()

Upcoming and live seller events across Crossly, soonest first.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerEventsResponse result = apiInstance.listBuyerEvents();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerEvents");
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

**ListBuyerEventsResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerFeedback"></a>
# **listBuyerFeedback**
> ListBuyerFeedbackResponse listBuyerFeedback()

Feedback you have left sellers, newest first — with the ids you revise by.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerFeedbackResponse result = apiInstance.listBuyerFeedback();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerFeedback");
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

**ListBuyerFeedbackResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerFeedbackPending"></a>
# **listBuyerFeedbackPending**
> ListBuyerFeedbackPendingResponse listBuyerFeedbackPending()

Orders from the last 60 days that are on their way or arrived and still need your feedback.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerFeedbackPendingResponse result = apiInstance.listBuyerFeedbackPending();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerFeedbackPending");
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

**ListBuyerFeedbackPendingResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerFitRefs"></a>
# **listBuyerFitRefs**
> BuyerResponse3 listBuyerFitRefs()

Your saved reference garments for fit comparison.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      BuyerResponse3 result = apiInstance.listBuyerFitRefs();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerFitRefs");
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

**BuyerResponse3**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerFollowingSellers"></a>
# **listBuyerFollowingSellers**
> ListBuyerFollowingSellersResponse listBuyerFollowingSellers()

Sellers you follow, with how many new listings each has since you last looked.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerFollowingSellersResponse result = apiInstance.listBuyerFollowingSellers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerFollowingSellers");
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

**ListBuyerFollowingSellersResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerGiftCardCredit"></a>
# **listBuyerGiftCardCredit**
> ListBuyerGiftCardCreditResponse listBuyerGiftCardCredit()

Gift card credit on your account, and when it expires.

One row per gift card you redeemed. &#x60;meta.giftCreditCents&#x60; is the unspent, unexpired gift credit in your Crossly Bucks balance; &#x60;meta.nextExpiresAt&#x60; is the soonest date any of it lapses. Spending at checkout uses gift credit first.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerGiftCardCreditResponse result = apiInstance.listBuyerGiftCardCredit();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerGiftCardCredit");
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

**ListBuyerGiftCardCreditResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerGiftCards"></a>
# **listBuyerGiftCards**
> ListBuyerGiftCardsResponse listBuyerGiftCards()

Gift cards you bought, newest first.

Status, recipient and delivery for each card you paid for. The code is masked unless you sent the card to your own email address. Abandoned (unpaid) checkouts are omitted.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerGiftCardsResponse result = apiInstance.listBuyerGiftCards();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerGiftCards");
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

**ListBuyerGiftCardsResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerGiftFinder"></a>
# **listBuyerGiftFinder**
> ListBuyerGiftFinderResponse listBuyerGiftFinder()

Live listings for a recipient, interest and budget.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerGiftFinderResponse result = apiInstance.listBuyerGiftFinder();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerGiftFinder");
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

**ListBuyerGiftFinderResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerGiftSent"></a>
# **listBuyerGiftSent**
> ListBuyerGiftSentResponse listBuyerGiftSent()

Items you sent as gifts: whether the teaser went out, whether it arrived and was opened, and any thank-you. Send one with &#x60;gift&#x60; on checkout.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerGiftSentResponse result = apiInstance.listBuyerGiftSent();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerGiftSent");
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

**ListBuyerGiftSentResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerHomeBuilders"></a>
# **listBuyerHomeBuilders**
> ListBuyerHomeBuildersResponse listBuyerHomeBuilders()

Your co-builders: friends who may arrange your home with you.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerHomeBuildersResponse result = apiInstance.listBuyerHomeBuilders();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerHomeBuilders");
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

**ListBuyerHomeBuildersResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerHomeBuilding"></a>
# **listBuyerHomeBuilding**
> ListBuyerHomeBuildingResponse listBuyerHomeBuilding()

The homes you co-build, to visit and arrange.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerHomeBuildingResponse result = apiInstance.listBuyerHomeBuilding();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerHomeBuilding");
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

**ListBuyerHomeBuildingResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerHotspots"></a>
# **listBuyerHotspots**
> ListBuyerHotspotsResponse listBuyerHotspots()

Shop-the-look tags on a story or lookbook photo: each tagged listing and where it sits on the image (x, y as fractions).

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerHotspotsResponse result = apiInstance.listBuyerHotspots();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerHotspots");
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

**ListBuyerHotspotsResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerHunts"></a>
# **listBuyerHunts**
> ListBuyerHuntsResponse listBuyerHunts()

Your buyer-agent hunts and what they did.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerHuntsResponse result = apiInstance.listBuyerHunts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerHunts");
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

**ListBuyerHuntsResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerInstantOffers"></a>
# **listBuyerInstantOffers**
> BuyerResponse3 listBuyerInstantOffers()

Your instant offers: live quotes, accepted ones awaiting a label, approved ones (with the prepaid label) and paid ones.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      BuyerResponse3 result = apiInstance.listBuyerInstantOffers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerInstantOffers");
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

**BuyerResponse3**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerLayaways"></a>
# **listBuyerLayaways**
> ListBuyerLayawaysResponse listBuyerLayaways()

Your layaways: price, paid so far, what is left, and the installment schedule. Put an item on layaway at checkout with layawayItemIds.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerLayawaysResponse result = apiInstance.listBuyerLayaways();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerLayaways");
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

**ListBuyerLayawaysResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerListingQuickQuestions"></a>
# **listBuyerListingQuickQuestions**
> ListBuyerListingQuickQuestionsResponse listBuyerListingQuickQuestions(slug)

One-tap questions this listing supports; send one as &#x60;quick&#x60; on a message.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      ListBuyerListingQuickQuestionsResponse result = apiInstance.listBuyerListingQuickQuestions(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerListingQuickQuestions");
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
 **slug** | **String**|  |

### Return type

**ListBuyerListingQuickQuestionsResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerListingSellerReviews"></a>
# **listBuyerListingSellerReviews**
> ListBuyerListingSellerReviewsResponse listBuyerListingSellerReviews(slug)

The seller’s public reviews: summary, text, photos, replies.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      ListBuyerListingSellerReviewsResponse result = apiInstance.listBuyerListingSellerReviews(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerListingSellerReviews");
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
 **slug** | **String**|  |

### Return type

**ListBuyerListingSellerReviewsResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerLiveShipments"></a>
# **listBuyerLiveShipments**
> ListBuyerLiveShipmentsResponse listBuyerLiveShipments()

Your one-box-per-show shipments: every order won in a show ships together, and postage is charged once (the rest refunded when it ships).

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerLiveShipmentsResponse result = apiInstance.listBuyerLiveShipments();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerLiveShipments");
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

**ListBuyerLiveShipmentsResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerLiveStreamLineup"></a>
# **listBuyerLiveStreamLineup**
> ListBuyerLiveStreamLineupResponse listBuyerLiveStreamLineup(id)

What a live show will sell, in order: each item, its price, and whether it is still available.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      ListBuyerLiveStreamLineupResponse result = apiInstance.listBuyerLiveStreamLineup(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerLiveStreamLineup");
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

**ListBuyerLiveStreamLineupResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerLoyalty"></a>
# **listBuyerLoyalty**
> ListBuyerLoyaltyResponse listBuyerLoyalty()

Your loyalty clubs: the tier you hold, progress and how to reach the next tier, the typed perks you hold now, and your history.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerLoyaltyResponse result = apiInstance.listBuyerLoyalty();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerLoyalty");
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

**ListBuyerLoyaltyResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerMarketBids"></a>
# **listBuyerMarketBids**
> BuyerResponse3 listBuyerMarketBids()

Your resting market bids.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      BuyerResponse3 result = apiInstance.listBuyerMarketBids();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerMarketBids");
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

**BuyerResponse3**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerMarketWatches"></a>
# **listBuyerMarketWatches**
> BuyerResponse3 listBuyerMarketWatches()

Market variants you watch, with the price you are waiting for.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      BuyerResponse3 result = apiInstance.listBuyerMarketWatches();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerMarketWatches");
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

**BuyerResponse3**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerOffers"></a>
# **listBuyerOffers**
> ListBuyerOffersResponse listBuyerOffers(awaitingBuyer)

Offers you have made, newest first (last 100).

&#x60;awaitingBuyer: true&#x60; is a seller counter waiting on you — answer it with POST /v1/buyer/offers/{id}/respond. &#x60;redeemable: true&#x60; is an accepted offer you can pay for on Crossly. Amounts are integer cents.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String awaitingBuyer = "true"; // String | true returns only seller counters waiting on you.
    try {
      ListBuyerOffersResponse result = apiInstance.listBuyerOffers(awaitingBuyer);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerOffers");
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
 **awaitingBuyer** | **String**| true returns only seller counters waiting on you. | [optional] [enum: true, false]

### Return type

**ListBuyerOffersResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerOrders"></a>
# **listBuyerOrders**
> ListBuyerOrdersResponse listBuyerOrders(page, limit)

What you have bought on Crossly, newest first.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    Integer page = 1; // Integer | 
    Integer limit = 25; // Integer | 
    try {
      ListBuyerOrdersResponse result = apiInstance.listBuyerOrders(page, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerOrders");
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
 **page** | **Integer**|  | [optional] [default to 1]
 **limit** | **Integer**|  | [optional] [default to 25]

### Return type

**ListBuyerOrdersResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerPackOpenings"></a>
# **listBuyerPackOpenings**
> ListBuyerPackOpeningsResponse listBuyerPackOpenings()

Your pulls: what you got, its value, sell-back status, and the fairness proof for each (the server seed once rotated).

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerPackOpeningsResponse result = apiInstance.listBuyerPackOpenings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerPackOpenings");
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

**ListBuyerPackOpeningsResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerPacks"></a>
# **listBuyerPacks**
> ListBuyerPacksResponse listBuyerPacks()

Packs you can open: price, every tier with its published odds, what is left in it and its value range, and the expected value of one opening.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerPacksResponse result = apiInstance.listBuyerPacks();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerPacks");
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

**ListBuyerPacksResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerParties"></a>
# **listBuyerParties**
> ListBuyerPartiesResponse listBuyerParties()

Themed shopping parties, live and upcoming.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerPartiesResponse result = apiInstance.listBuyerParties();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerParties");
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

**ListBuyerPartiesResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerPartyListings"></a>
# **listBuyerPartyListings**
> BuyerResponse3 listBuyerPartyListings(slug)

Listings shared to a party, featured first.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      BuyerResponse3 result = apiInstance.listBuyerPartyListings(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerPartyListings");
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
 **slug** | **String**|  |

### Return type

**BuyerResponse3**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerPaymentMethods"></a>
# **listBuyerPaymentMethods**
> ListBuyerPaymentMethodsResponse listBuyerPaymentMethods()

Your saved cards, the default first.

Brand, last 4, expiry and whether it is your default. The &#x60;id&#x60; is what checkout and auction bids take as &#x60;paymentMethodId&#x60;.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerPaymentMethodsResponse result = apiInstance.listBuyerPaymentMethods();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerPaymentMethods");
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

**ListBuyerPaymentMethodsResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerPickupPoints"></a>
# **listBuyerPickupPoints**
> BuyerResponse3 listBuyerPickupPoints()

Carrier pickup points (UPS Access Point / FedEx Hold at Location) near an address; pass one as &#x60;pickupPoint&#x60; to POST /v1/buyer/checkout.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      BuyerResponse3 result = apiInstance.listBuyerPickupPoints();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerPickupPoints");
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

**BuyerResponse3**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerProtectionPlans"></a>
# **listBuyerProtectionPlans**
> ListBuyerProtectionPlansResponse listBuyerProtectionPlans()

Your protection plans (bought at checkout with &#x60;protection&#x60;): status, term, coverage, contract id, and any refund.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerProtectionPlansResponse result = apiInstance.listBuyerProtectionPlans();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerProtectionPlans");
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

**ListBuyerProtectionPlansResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerRegistries"></a>
# **listBuyerRegistries**
> ListBuyerRegistriesResponse listBuyerRegistries()

Your gift registries.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerRegistriesResponse result = apiInstance.listBuyerRegistries();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerRegistries");
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

**ListBuyerRegistriesResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerRegistryGifts"></a>
# **listBuyerRegistryGifts**
> ListBuyerRegistryGiftsResponse listBuyerRegistryGifts(id)

Your thank-you list: who bought what off the registry, and whether you have thanked them.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      ListBuyerRegistryGiftsResponse result = apiInstance.listBuyerRegistryGifts(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerRegistryGifts");
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

**ListBuyerRegistryGiftsResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerRegistrySearch"></a>
# **listBuyerRegistrySearch**
> ListBuyerRegistrySearchResponse listBuyerRegistrySearch()

Find a registry by its name or the registrant’s name. Current and recent registries only.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerRegistrySearchResponse result = apiInstance.listBuyerRegistrySearch();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerRegistrySearch");
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

**ListBuyerRegistrySearchResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerRentals"></a>
# **listBuyerRentals**
> ListBuyerRentalsResponse listBuyerRentals()

Your rentals: dates, status (reserved, out, returned, claimed, closed, cancelled), the return label, and what happened to the deposit.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerRentalsResponse result = apiInstance.listBuyerRentals();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerRentals");
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

**ListBuyerRentalsResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerSizeMemoryPrompts"></a>
# **listBuyerSizeMemoryPrompts**
> ListBuyerSizeMemoryPromptsResponse listBuyerSizeMemoryPrompts()

Delivered orders with a size that you haven’t said how they fit (the last 60 days).

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerSizeMemoryPromptsResponse result = apiInstance.listBuyerSizeMemoryPrompts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerSizeMemoryPrompts");
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

**ListBuyerSizeMemoryPromptsResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerSizeMemorySizes"></a>
# **listBuyerSizeMemorySizes**
> ListBuyerSizeMemorySizesResponse listBuyerSizeMemorySizes()

The sizes learned from what you bought and kept, by kind of item (shoes, tops, bottoms, dresses, outerwear) and department.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerSizeMemorySizesResponse result = apiInstance.listBuyerSizeMemorySizes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerSizeMemorySizes");
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

**ListBuyerSizeMemorySizesResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerSplits"></a>
# **listBuyerSplits**
> BuyerResponse3 listBuyerSplits()

Purchases you split, with each share’s status.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      BuyerResponse3 result = apiInstance.listBuyerSplits();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerSplits");
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

**BuyerResponse3**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerStoreListings"></a>
# **listBuyerStoreListings**
> ListBuyerStoreListingsResponse listBuyerStoreListings(slug)

A store&#39;s live listings, filtered by tag, category, text and program chips (f: on_sale, discount_eligible, code_eligible, group_buy_active, rentable, wholesale_available…; all must hold), sorted; each card carries its program badges.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      ListBuyerStoreListingsResponse result = apiInstance.listBuyerStoreListings(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerStoreListings");
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
 **slug** | **String**|  |

### Return type

**ListBuyerStoreListingsResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerSubscriptions"></a>
# **listBuyerSubscriptions**
> ListBuyerSubscriptionsResponse listBuyerSubscriptions()

Your subscribe &amp; save standing orders.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerSubscriptionsResponse result = apiInstance.listBuyerSubscriptions();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerSubscriptions");
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

**ListBuyerSubscriptionsResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerTogether"></a>
# **listBuyerTogether**
> ListBuyerTogetherResponse listBuyerTogether()

Shop-together rooms you are in.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerTogetherResponse result = apiInstance.listBuyerTogether();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerTogether");
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

**ListBuyerTogetherResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerTotalRequests"></a>
# **listBuyerTotalRequests**
> ListBuyerTotalRequestsResponse listBuyerTotalRequests()

Your combined-shipping total requests, newest per seller.

A seller answers a request by quoting one shipping figure for every item of theirs in your cart. &#x60;matchesCart: false&#x60; means the cart changed since, so the quote will not apply at checkout.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerTotalRequestsResponse result = apiInstance.listBuyerTotalRequests();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerTotalRequests");
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

**ListBuyerTotalRequestsResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerTryOns"></a>
# **listBuyerTryOns**
> ListBuyerTryOnsResponse listBuyerTryOns()

Your AI try-ons: the rendered images (labelled AI-generated wherever shown).

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerTryOnsResponse result = apiInstance.listBuyerTryOns();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerTryOns");
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

**ListBuyerTryOnsResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerVault"></a>
# **listBuyerVault**
> ListBuyerVaultResponse listBuyerVault()

What you own in the Crossly vault: stored (authenticated, on a shelf), listed for sale, or on its way home — with the price to ship one home.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerVaultResponse result = apiInstance.listBuyerVault();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerVault");
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

**ListBuyerVaultResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerVaultMarketHoldings"></a>
# **listBuyerVaultMarketHoldings**
> ListBuyerVaultMarketHoldingsResponse listBuyerVaultMarketHoldings()

Each unit you hold in the vault at its market price, with the mark’s quality (A or B reliable, C indicative, none), cost, P&amp;L and where it stands (stored, listed, lent, pledged, at the grader); &#x60;meta&#x60; carries the totals and the units you have out on loan.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerVaultMarketHoldingsResponse result = apiInstance.listBuyerVaultMarketHoldings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerVaultMarketHoldings");
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

**ListBuyerVaultMarketHoldingsResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerVaultMarketIndexes"></a>
# **listBuyerVaultMarketIndexes**
> ListBuyerVaultMarketIndexesResponse listBuyerVaultMarketIndexes()

Crossly indexes over vault book keys (category, brand, curated, composite, segment, and your own), each with its level now and change since the last daily close. Index levels are valued only from the book’s marks.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerVaultMarketIndexesResponse result = apiInstance.listBuyerVaultMarketIndexes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerVaultMarketIndexes");
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

**ListBuyerVaultMarketIndexesResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerVaultMarketInstantExit"></a>
# **listBuyerVaultMarketInstantExit**
> ListBuyerVaultMarketInstantExitResponse listBuyerVaultMarketInstantExit()

Instant Exit quotes for what you hold, one per book key: the best resting bid (yours left out), its share of the mark, the bid levels, units held and which are free to sell, and why a key cannot be sold instantly. A quote, not an order.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerVaultMarketInstantExitResponse result = apiInstance.listBuyerVaultMarketInstantExit();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerVaultMarketInstantExit");
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

**ListBuyerVaultMarketInstantExitResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerVaultMarketOptionCombos"></a>
# **listBuyerVaultMarketOptionCombos**
> ListBuyerVaultMarketOptionCombosResponse listBuyerVaultMarketOptionCombos()

Your options strategies (working by default) with their legs, net price per unit and fills. Read only.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerVaultMarketOptionCombosResponse result = apiInstance.listBuyerVaultMarketOptionCombos();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerVaultMarketOptionCombos");
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

**ListBuyerVaultMarketOptionCombosResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerVaultMarketOptionNotices"></a>
# **listBuyerVaultMarketOptionNotices**
> ListBuyerVaultMarketOptionNoticesResponse listBuyerVaultMarketOptionNotices()

Your options notices: expiry warnings, auto-closes, exercises, assignments, expiries worthless and rolls. Read only.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerVaultMarketOptionNoticesResponse result = apiInstance.listBuyerVaultMarketOptionNotices();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerVaultMarketOptionNotices");
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

**ListBuyerVaultMarketOptionNoticesResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerVaultMarketOptionSeries"></a>
# **listBuyerVaultMarketOptionSeries**
> ListBuyerVaultMarketOptionSeriesResponse listBuyerVaultMarketOptionSeries()

Fractional options series on Crossly prices (indexes, and tier A item keys with 90 days of reliable marks): underlying, status and eligibility. Read only.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerVaultMarketOptionSeriesResponse result = apiInstance.listBuyerVaultMarketOptionSeries();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerVaultMarketOptionSeries");
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

**ListBuyerVaultMarketOptionSeriesResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerVaultMarketOptionStrategies"></a>
# **listBuyerVaultMarketOptionStrategies**
> ListBuyerVaultMarketOptionStrategiesResponse listBuyerVaultMarketOptionStrategies()

The options strategies the picker builds (vertical, calendar, diagonal, straddle, strangle, butterfly, iron condor, collar) and what each does. Read only.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerVaultMarketOptionStrategiesResponse result = apiInstance.listBuyerVaultMarketOptionStrategies();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerVaultMarketOptionStrategies");
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

**ListBuyerVaultMarketOptionStrategiesResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerVaultMarketPredictionComments"></a>
# **listBuyerVaultMarketPredictionComments**
> ListBuyerVaultMarketPredictionCommentsResponse listBuyerVaultMarketPredictionComments()

A prediction market’s (or series’) discussion thread. Read only.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerVaultMarketPredictionCommentsResponse result = apiInstance.listBuyerVaultMarketPredictionComments();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerVaultMarketPredictionComments");
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

**ListBuyerVaultMarketPredictionCommentsResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerVaultMarketPredictionMarkets"></a>
# **listBuyerVaultMarketPredictionMarkets**
> ListBuyerVaultMarketPredictionMarketsResponse listBuyerVaultMarketPredictionMarkets()

\&quot;Will it hit?\&quot; prediction markets on Crossly prices (filter by book key, index slug, kind, status, expiry or text): strike, expiry, best Yes bid and ask, last price and the probability (the market&#39;s own price, display only).

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerVaultMarketPredictionMarketsResponse result = apiInstance.listBuyerVaultMarketPredictionMarkets();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerVaultMarketPredictionMarkets");
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

**ListBuyerVaultMarketPredictionMarketsResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerVaultMarketPredictionPositions"></a>
# **listBuyerVaultMarketPredictionPositions**
> ListBuyerVaultMarketPredictionPositionsResponse listBuyerVaultMarketPredictionPositions()

Your prediction positions (practice and live): side, contracts, cost, value at the last price, payout or refund once settled.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerVaultMarketPredictionPositionsResponse result = apiInstance.listBuyerVaultMarketPredictionPositions();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerVaultMarketPredictionPositions");
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

**ListBuyerVaultMarketPredictionPositionsResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerVaultMarketShareAutoInvest"></a>
# **listBuyerVaultMarketShareAutoInvest**
> ListBuyerVaultMarketShareAutoInvestResponse listBuyerVaultMarketShareAutoInvest()

Your recurring Vault Shares auto-invest plans.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerVaultMarketShareAutoInvestResponse result = apiInstance.listBuyerVaultMarketShareAutoInvest();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerVaultMarketShareAutoInvest");
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

**ListBuyerVaultMarketShareAutoInvestResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerVaultMarketShareBaskets"></a>
# **listBuyerVaultMarketShareBaskets**
> ListBuyerVaultMarketShareBasketsResponse listBuyerVaultMarketShareBaskets()

Theme baskets: model portfolios of Vault Shares series you would own directly, never a fund.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerVaultMarketShareBasketsResponse result = apiInstance.listBuyerVaultMarketShareBaskets();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerVaultMarketShareBaskets");
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

**ListBuyerVaultMarketShareBasketsResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerVaultMarketShareDrops"></a>
# **listBuyerVaultMarketShareDrops**
> ListBuyerVaultMarketShareDropsResponse listBuyerVaultMarketShareDrops()

Upcoming and open Vault Shares drops: phase, countdown, allocation (first come, pro-rata or lottery), your Crossly One early-access time (never a better price).

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerVaultMarketShareDropsResponse result = apiInstance.listBuyerVaultMarketShareDrops();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerVaultMarketShareDrops");
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

**ListBuyerVaultMarketShareDropsResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerVaultMarketShareGifts"></a>
# **listBuyerVaultMarketShareGifts**
> ListBuyerVaultMarketShareGiftsResponse listBuyerVaultMarketShareGifts()

Vault Shares gifts you sent or were offered.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerVaultMarketShareGiftsResponse result = apiInstance.listBuyerVaultMarketShareGifts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerVaultMarketShareGifts");
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

**ListBuyerVaultMarketShareGiftsResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerVaultMarketShareSeries"></a>
# **listBuyerVaultMarketShareSeries**
> ListBuyerVaultMarketShareSeriesResponse listBuyerVaultMarketShareSeries()

Vault Shares series: open offerings first, then trading. Terms, progress, last share price and implied item value, and your holding.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerVaultMarketShareSeriesResponse result = apiInstance.listBuyerVaultMarketShareSeries();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerVaultMarketShareSeries");
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

**ListBuyerVaultMarketShareSeriesResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerVaultMarketWatchlist"></a>
# **listBuyerVaultMarketWatchlist**
> ListBuyerVaultMarketWatchlistResponse listBuyerVaultMarketWatchlist()

The book keys you watch, with mark and its quality, 24 h and 7 d change, and the last 30 daily marks.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerVaultMarketWatchlistResponse result = apiInstance.listBuyerVaultMarketWatchlist();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerVaultMarketWatchlist");
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

**ListBuyerVaultMarketWatchlistResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerVideoRequests"></a>
# **listBuyerVideoRequests**
> ListBuyerVideoRequestsResponse listBuyerVideoRequests()

Your video requests and their answers.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerVideoRequestsResponse result = apiInstance.listBuyerVideoRequests();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerVideoRequests");
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

**ListBuyerVideoRequestsResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerWalletPerks"></a>
# **listBuyerWalletPerks**
> ListBuyerWalletPerksResponse listBuyerWalletPerks()

The perks your wallets unlock: each Collection holders deal (a shop’s percent off for holders of a collection) and creator shop perk on a collection a linked wallet or your Crossly wallet holds, best first. Checkout applies the best one; perks never stack with each other.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerWalletPerksResponse result = apiInstance.listBuyerWalletPerks();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerWalletPerks");
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

**ListBuyerWalletPerksResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerWholesaleDrops"></a>
# **listBuyerWholesaleDrops**
> ListBuyerWholesaleDropsResponse listBuyerWholesaleDrops()

Upcoming and live trade drops open to you: drops sellers release only to their approved trade buyers or to a catalog audience. kind prebook &#x3D; reserve quantity now with a deposit (depositBps) at checkout; the balance is invoiced when the seller releases the stock.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerWholesaleDropsResponse result = apiInstance.listBuyerWholesaleDrops();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerWholesaleDrops");
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

**ListBuyerWholesaleDropsResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerWholesaleFreightRequests"></a>
# **listBuyerWholesaleFreightRequests**
> BuyerResponse3 listBuyerWholesaleFreightRequests()

Your freight (LTL) quote requests to sellers, with the seller&#39;s figure in cents once quoted.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      BuyerResponse3 result = apiInstance.listBuyerWholesaleFreightRequests();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerWholesaleFreightRequests");
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

**BuyerResponse3**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerWholesaleOrderSheets"></a>
# **listBuyerWholesaleOrderSheets**
> BuyerResponse3 listBuyerWholesaleOrderSheets()

Your saved wholesale order sheets (one seller each), newest first.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      BuyerResponse3 result = apiInstance.listBuyerWholesaleOrderSheets();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerWholesaleOrderSheets");
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

**BuyerResponse3**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerWholesaleOrders"></a>
# **listBuyerWholesaleOrders**
> BuyerResponse3 listBuyerWholesaleOrders()

Your past wholesale orders (trade-priced or on account), newest first — the starting point for reorder.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      BuyerResponse3 result = apiInstance.listBuyerWholesaleOrders();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerWholesaleOrders");
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

**BuyerResponse3**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerWholesalePrebooks"></a>
# **listBuyerWholesalePrebooks**
> ListBuyerWholesalePrebooksResponse listBuyerWholesalePrebooks()

Your pre-books: the drop, item, quantity, deposit paid, balance, status (awaiting_release, invoiced, paid, cancelled, failed) and the balance invoice once the seller released the stock.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerWholesalePrebooksResponse result = apiInstance.listBuyerWholesalePrebooks();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerWholesalePrebooks");
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

**ListBuyerWholesalePrebooksResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerWholesaleQuotes"></a>
# **listBuyerWholesaleQuotes**
> BuyerResponse3 listBuyerWholesaleQuotes()

Your requests for a quote (RFQ) to wholesale sellers. ?status&#x3D;open|all|requested|answered|accepted|declined|withdrawn|expired. An answered or accepted quote past expiresAt reads expired.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      BuyerResponse3 result = apiInstance.listBuyerWholesaleQuotes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerWholesaleQuotes");
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

**BuyerResponse3**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerWholesaleStatement"></a>
# **listBuyerWholesaleStatement**
> BuyerResponse3 listBuyerWholesaleStatement()

Your open trade balances per seller in aging buckets (current, 1-30, 31-60, 61-90, 90+ days past due), with the invoices behind them.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      BuyerResponse3 result = apiInstance.listBuyerWholesaleStatement();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerWholesaleStatement");
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

**BuyerResponse3**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerWholesaleSuppliers"></a>
# **listBuyerWholesaleSuppliers**
> BuyerResponse3 listBuyerWholesaleSuppliers()

The sellers you trade with: catalogs you can open, your terms (net days, credit limit, discount), customer groups, and what you owe each.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      BuyerResponse3 result = apiInstance.listBuyerWholesaleSuppliers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerWholesaleSuppliers");
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

**BuyerResponse3**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerWishlistItems"></a>
# **listBuyerWishlistItems**
> ListBuyerWishlistItemsResponse listBuyerWishlistItems(id)

What is on one wishlist.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | 
    try {
      ListBuyerWishlistItemsResponse result = apiInstance.listBuyerWishlistItems(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerWishlistItems");
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
 **id** | **UUID**|  |

### Return type

**ListBuyerWishlistItemsResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerWishlistMembers"></a>
# **listBuyerWishlistMembers**
> ListBuyerWishlistMembersResponse listBuyerWishlistMembers(id)

Co-editors of a shared wishlist.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      ListBuyerWishlistMembersResponse result = apiInstance.listBuyerWishlistMembers(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerWishlistMembers");
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

**ListBuyerWishlistMembersResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="listBuyerWishlists"></a>
# **listBuyerWishlists**
> ListBuyerWishlistsResponse listBuyerWishlists()

Your wishlists.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerWishlistsResponse result = apiInstance.listBuyerWishlists();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#listBuyerWishlists");
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

**ListBuyerWishlistsResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="updateBuyerBoard"></a>
# **updateBuyerBoard**
> BuyerResponse updateBuyerBoard(id)

Rename a board, change its description, or make it public / private.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerResponse result = apiInstance.updateBuyerBoard(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#updateBuyerBoard");
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

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="updateBuyerBoardLayout"></a>
# **updateBuyerBoardLayout**
> BuyerBoardResponse updateBuyerBoardLayout(id)

Replace a board’s layout: items by platform listing id or slug, with x, y, w (0–1) and z. At most 40.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerBoardResponse result = apiInstance.updateBuyerBoardLayout(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#updateBuyerBoardLayout");
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

**BuyerBoardResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="updateBuyerCollectionSetLeaderboard"></a>
# **updateBuyerCollectionSetLeaderboard**
> UpdateBuyerCollectionSetLeaderboardResponse updateBuyerCollectionSetLeaderboard()

Show or hide yourself (by your public handle) on set leaderboards.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      UpdateBuyerCollectionSetLeaderboardResponse result = apiInstance.updateBuyerCollectionSetLeaderboard();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#updateBuyerCollectionSetLeaderboard");
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

**UpdateBuyerCollectionSetLeaderboardResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="updateBuyerCompany"></a>
# **updateBuyerCompany**
> BuyerCompanyResponse updateBuyerCompany()

Rename the company or change its tax id / website (owner).

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      BuyerCompanyResponse result = apiInstance.updateBuyerCompany();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#updateBuyerCompany");
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

**BuyerCompanyResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="updateBuyerCompanyAddress"></a>
# **updateBuyerCompanyAddress**
> BuyerCompanyResponse updateBuyerCompanyAddress()

Replace the shared address book (owner): addresses [{ id, label, name, line1, line2?, city, region, postalCode, country, phone?, isDefault? }], at most 20.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      BuyerCompanyResponse result = apiInstance.updateBuyerCompanyAddress();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#updateBuyerCompanyAddress");
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

**BuyerCompanyResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="updateBuyerCompanyMember"></a>
# **updateBuyerCompanyMember**
> BuyerCompanyResponse updateBuyerCompanyMember(id)

Change a member&#39;s role or approval limit (owner). The last owner stays an owner.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerCompanyResponse result = apiInstance.updateBuyerCompanyMember(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#updateBuyerCompanyMember");
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

**BuyerCompanyResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="updateBuyerCreationReview"></a>
# **updateBuyerCreationReview**
> UpdateBuyerCreationReviewResponse updateBuyerCreationReview(format, id, updateBuyerCreationReviewRequest)

Review a creation you bought (or change your review): 1-5 stars and an optional comment.

Only a buyer of it may review it (a bought copy, or a pack that held the card). One review per creation; a second call replaces it. The comment is moderated.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String format = "wearable"; // String | The creation format.
    String id = "id_example"; // String | The creation id (a card is <setId>.<slug>).
    UpdateBuyerCreationReviewRequest updateBuyerCreationReviewRequest = new UpdateBuyerCreationReviewRequest(); // UpdateBuyerCreationReviewRequest | 
    try {
      UpdateBuyerCreationReviewResponse result = apiInstance.updateBuyerCreationReview(format, id, updateBuyerCreationReviewRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#updateBuyerCreationReview");
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
 **format** | **String**| The creation format. | [enum: wearable, decor, interactive, card]
 **id** | **String**| The creation id (a card is &lt;setId&gt;.&lt;slug&gt;). |
 **updateBuyerCreationReviewRequest** | **UpdateBuyerCreationReviewRequest**|  |

### Return type

**UpdateBuyerCreationReviewResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="updateBuyerFeedback"></a>
# **updateBuyerFeedback**
> BuyerResponse updateBuyerFeedback(id, updateBuyerFeedbackRequest)

Revise feedback you left, within 60 days.

Replaces the stars and comment; detailed ratings you omit stay as they were.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The id.
    UpdateBuyerFeedbackRequest updateBuyerFeedbackRequest = new UpdateBuyerFeedbackRequest(); // UpdateBuyerFeedbackRequest | 
    try {
      BuyerResponse result = apiInstance.updateBuyerFeedback(id, updateBuyerFeedbackRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#updateBuyerFeedback");
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
 **id** | **UUID**| The id. |
 **updateBuyerFeedbackRequest** | **UpdateBuyerFeedbackRequest**|  |

### Return type

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

<a name="updateBuyerHome"></a>
# **updateBuyerHome**
> BuyerHomeResponse updateBuyerHome()

Who may walk in (privacy), the lighting (theme), wallpaper/floor/mood decor and whether visitors see your vault wall values.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      BuyerHomeResponse result = apiInstance.updateBuyerHome();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#updateBuyerHome");
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

**BuyerHomeResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="updateBuyerHomeBuilder"></a>
# **updateBuyerHomeBuilder**
> ListBuyerHomeBuildersResponse updateBuyerHomeBuilder()

Set your co-builders (friends only, at most 4).

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      ListBuyerHomeBuildersResponse result = apiInstance.updateBuyerHomeBuilder();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#updateBuyerHomeBuilder");
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

**ListBuyerHomeBuildersResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="updateBuyerHomeLayout"></a>
# **updateBuyerHomeLayout**
> BuyerHomeResponse updateBuyerHomeLayout()

Arrange your home: the whole layout, checked against what you own.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      BuyerHomeResponse result = apiInstance.updateBuyerHomeLayout();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#updateBuyerHomeLayout");
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

**BuyerHomeResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="updateBuyerHunt"></a>
# **updateBuyerHunt**
> BuyerResponse updateBuyerHunt(id)

Pause, resume or stop a hunt.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerResponse result = apiInstance.updateBuyerHunt(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#updateBuyerHunt");
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

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="updateBuyerPaymentMethodDefault"></a>
# **updateBuyerPaymentMethodDefault**
> UpdateBuyerPaymentMethodDefaultResponse updateBuyerPaymentMethodDefault(id)

Make one of your saved cards the default.

The default is the card express checkout offers first. Only your own saved card: any other id is a 404.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      UpdateBuyerPaymentMethodDefaultResponse result = apiInstance.updateBuyerPaymentMethodDefault(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#updateBuyerPaymentMethodDefault");
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

**UpdateBuyerPaymentMethodDefaultResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="updateBuyerPurchaseStory"></a>
# **updateBuyerPurchaseStory**
> BuyerResponse updateBuyerPurchaseStory(id)

Write your owner story (280 characters); it travels with the item if you resell it.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerResponse result = apiInstance.updateBuyerPurchaseStory(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#updateBuyerPurchaseStory");
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

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="updateBuyerRegistry"></a>
# **updateBuyerRegistry**
> BuyerRegistryResponse updateBuyerRegistry(id)

Edit a registry: title, kind, date, message, ship-to address.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerRegistryResponse result = apiInstance.updateBuyerRegistry(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#updateBuyerRegistry");
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

**BuyerRegistryResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="updateBuyerRegistryItem"></a>
# **updateBuyerRegistryItem**
> UpdateBuyerRegistryItemResponse updateBuyerRegistryItem(id, platformListingId)

How many of an item you want (1–50).

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    String platformListingId = "platformListingId_example"; // String | 
    try {
      UpdateBuyerRegistryItemResponse result = apiInstance.updateBuyerRegistryItem(id, platformListingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#updateBuyerRegistryItem");
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

**UpdateBuyerRegistryItemResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="updateBuyerSubscription"></a>
# **updateBuyerSubscription**
> BuyerResponse updateBuyerSubscription(id)

Pause, resume, skip the next delivery, change the interval, or cancel.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerResponse result = apiInstance.updateBuyerSubscription(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#updateBuyerSubscription");
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

**BuyerResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="updateBuyerWholesaleCartPo"></a>
# **updateBuyerWholesaleCartPo**
> UpdateBuyerWholesaleCartPoResponse updateBuyerWholesaleCartPo()

Set the PO reference for one seller&#39;s group of your cart: { sellerUserId, poReference } (empty clears it).

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    try {
      UpdateBuyerWholesaleCartPoResponse result = apiInstance.updateBuyerWholesaleCartPo();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#updateBuyerWholesaleCartPo");
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

**UpdateBuyerWholesaleCartPoResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="updateBuyerWholesaleOrderSheet"></a>
# **updateBuyerWholesaleOrderSheet**
> BuyerWholesaleOrderSheetResponse updateBuyerWholesaleOrderSheet(id)

Rename an order sheet, change its PO reference or note, or replace its lines.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      BuyerWholesaleOrderSheetResponse result = apiInstance.updateBuyerWholesaleOrderSheet(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#updateBuyerWholesaleOrderSheet");
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

**BuyerWholesaleOrderSheetResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

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

<a name="updateBuyerWishlist"></a>
# **updateBuyerWishlist**
> UpdateBuyerWishlistResponse updateBuyerWishlist(id, updateBuyerWishlistRequest)

Rename a wishlist, or make it public / private.

A public list can be opened by anyone holding its share link; making it private again stops that link working.

### Example
```java
// Import classes:
import net.crossly.buyer.ApiClient;
import net.crossly.buyer.ApiException;
import net.crossly.buyer.Configuration;
import net.crossly.buyer.auth.*;
import net.crossly.buyer.models.*;
import net.crossly.buyer.api.BuyerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: BuyerOAuth
    HttpBearerAuth BuyerOAuth = (HttpBearerAuth) defaultClient.getAuthentication("BuyerOAuth");
    BuyerOAuth.setBearerToken("BEARER TOKEN");

    BuyerApi apiInstance = new BuyerApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The id.
    UpdateBuyerWishlistRequest updateBuyerWishlistRequest = new UpdateBuyerWishlistRequest(); // UpdateBuyerWishlistRequest | 
    try {
      UpdateBuyerWishlistResponse result = apiInstance.updateBuyerWishlist(id, updateBuyerWishlistRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BuyerApi#updateBuyerWishlist");
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
 **id** | **UUID**| The id. |
 **updateBuyerWishlistRequest** | **UpdateBuyerWishlistRequest**|  |

### Return type

**UpdateBuyerWishlistResponse**

### Authorization

[BuyerOAuth](../README.md#BuyerOAuth)

### HTTP request headers

 - **Content-Type**: application/json
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

