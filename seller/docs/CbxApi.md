# CbxApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCbxAccrual**](CbxApi.md#createCbxAccrual) | **POST** /v1/cbx/accruals | Record cashback a user earned, in cents.
[**createCbxAccrualPurchase**](CbxApi.md#createCbxAccrualPurchase) | **POST** /v1/cbx/accruals/purchase | Accrue cashback for an order at the resolved rate.
[**createCbxAccrualReverse**](CbxApi.md#createCbxAccrualReverse) | **POST** /v1/cbx/accruals/{accrualId}/reverse | Claw back a pending accrual — a refund, a cancellation, fraud.
[**createCbxAdCreditPurchase**](CbxApi.md#createCbxAdCreditPurchase) | **POST** /v1/cbx/ad-credit/purchase | Claim ad credit against a CBX transfer you sent.
[**createCbxAdCreditQuote**](CbxApi.md#createCbxAdCreditQuote) | **POST** /v1/cbx/ad-credit/quote | What a given number of tokens buys in ad credit.
[**createCbxAdCreditSpend**](CbxApi.md#createCbxAdCreditSpend) | **POST** /v1/cbx/ad-credit/spend | Consume credit for a billing period.
[**createCbxBoost**](CbxApi.md#createCbxBoost) | **POST** /v1/cbx/boosts | Fund elevated cashback on matching items.
[**createCbxBoostPause**](CbxApi.md#createCbxBoostPause) | **POST** /v1/cbx/boosts/{boostId}/pause | Stop a boost from matching further orders.
[**createCbxCampaign**](CbxApi.md#createCbxCampaign) | **POST** /v1/cbx/campaigns | Create a campaign in draft.
[**createCbxCampaignApprove**](CbxApi.md#createCbxCampaignApprove) | **POST** /v1/cbx/campaigns/{campaignId}/approve | Approve the previewed recipient list.
[**createCbxCampaignExecute**](CbxApi.md#createCbxCampaignExecute) | **POST** /v1/cbx/campaigns/{campaignId}/execute | Pay an approved campaign.
[**createCbxCampaignPreview**](CbxApi.md#createCbxCampaignPreview) | **POST** /v1/cbx/campaigns/{campaignId}/preview | Compute the recipient list without paying it.
[**createCbxClaim**](CbxApi.md#createCbxClaim) | **POST** /v1/cbx/claims | Reserve a claim. Debits the balance and queues the transfer.
[**createCbxClaimQuote**](CbxApi.md#createCbxClaimQuote) | **POST** /v1/cbx/claims/quote | What a claim would cost, without committing to it.
[**createCbxClaimSend**](CbxApi.md#createCbxClaimSend) | **POST** /v1/cbx/claims/{claimId}/send | Send a reserved claim on chain.
[**createCbxCreditDraw**](CbxApi.md#createCbxCreditDraw) | **POST** /v1/cbx/credit/draw | Draw against a line, receiving grant credit.
[**createCbxCreditFreeze**](CbxApi.md#createCbxCreditFreeze) | **POST** /v1/cbx/credit/freeze | Stop new draws. Leaves the drawn balance on its terms.
[**createCbxCreditRefresh**](CbxApi.md#createCbxCreditRefresh) | **POST** /v1/cbx/credit/refresh | Recompute a limit from trading history and stake.
[**createCbxCreditRepay**](CbxApi.md#createCbxCreditRepay) | **POST** /v1/cbx/credit/repay | Apply a repayment to a line.
[**createCbxDisbursementRule**](CbxApi.md#createCbxDisbursementRule) | **POST** /v1/cbx/disbursement-rules | Fire a distribution when the events pool crosses a threshold.
[**createCbxDisbursementRuleActive**](CbxApi.md#createCbxDisbursementRuleActive) | **POST** /v1/cbx/disbursement-rules/{ruleId}/active | Enable or disable a rule.
[**createCbxDisbursementRuleCheck**](CbxApi.md#createCbxDisbursementRuleCheck) | **POST** /v1/cbx/disbursement-rules/{ruleId}/check | Evaluate a rule now. Fires it if every gate passes.
[**createCbxEarnTier**](CbxApi.md#createCbxEarnTier) | **POST** /v1/cbx/earn-tiers | Define an earn term.
[**createCbxRateQuote**](CbxApi.md#createCbxRateQuote) | **POST** /v1/cbx/rates/quote | What would this order earn, and why.
[**createCbxRedemption**](CbxApi.md#createCbxRedemption) | **POST** /v1/cbx/redemptions | Pay for a service in CBX.
[**createCbxRedemptionQuote**](CbxApi.md#createCbxRedemptionQuote) | **POST** /v1/cbx/redemptions/quote | What a service costs in tokens right now.
[**createCbxRevenueSweep**](CbxApi.md#createCbxRevenueSweep) | **POST** /v1/cbx/revenue/sweep | Move accrued revenue from the reserve to your revenue wallet.
[**createCbxSpend**](CbxApi.md#createCbxSpend) | **POST** /v1/cbx/spends | Redeem a user&#39;s CBX against an order.
[**createCbxSpendReverse**](CbxApi.md#createCbxSpendReverse) | **POST** /v1/cbx/spends/{externalId}/reverse | Refund a spend — give the tokens back and claw the skim back.
[**createCbxStakeTier**](CbxApi.md#createCbxStakeTier) | **POST** /v1/cbx/stake-tiers | Define a staking tier.
[**createCbxSubject**](CbxApi.md#createCbxSubject) | **POST** /v1/cbx/subjects | Map one of your user ids to a CBX subject.
[**createCbxSubjectGrant**](CbxApi.md#createCbxSubjectGrant) | **POST** /v1/cbx/subjects/{subjectId}/grants | Issue grant credit — in-platform, non-withdrawable.
[**createCbxSubjectSpendPlan**](CbxApi.md#createCbxSubjectSpendPlan) | **POST** /v1/cbx/subjects/{subjectId}/spend-plan | Which balances would pay for a spend, and in what order.
[**createCbxSubjectStake**](CbxApi.md#createCbxSubjectStake) | **POST** /v1/cbx/subjects/{subjectId}/stake | Lock a subject&#39;s tokens for a tier.
[**createCbxSubjectStakeUnstake**](CbxApi.md#createCbxSubjectStakeUnstake) | **POST** /v1/cbx/subjects/{subjectId}/stake/unstake | Start the cooldown. Tokens unlock when it elapses.
[**createCbxWalletChallenge**](CbxApi.md#createCbxWalletChallenge) | **POST** /v1/cbx/wallets/challenge | Start wallet verification. Returns a message for the user to sign.
[**createCbxWalletPaymentConfirm**](CbxApi.md#createCbxWalletPaymentConfirm) | **POST** /v1/cbx/wallet-payments/confirm | Present the signature. Returns a ship / do-not-ship decision.
[**createCbxWalletPaymentQuote**](CbxApi.md#createCbxWalletPaymentQuote) | **POST** /v1/cbx/wallet-payments/quote | Build a transfer for the buyer to sign themselves.
[**createCbxWalletPaymentResolve**](CbxApi.md#createCbxWalletPaymentResolve) | **POST** /v1/cbx/wallet-payments/{paymentId}/resolve | A human decides on a held payment.
[**createCbxWalletVerify**](CbxApi.md#createCbxWalletVerify) | **POST** /v1/cbx/wallets/verify | Complete wallet verification with the user&#39;s signature.
[**getCbxAdCredit**](CbxApi.md#getCbxAdCredit) | **GET** /v1/cbx/ad-credit | Unspent advertising credit, in cents.
[**getCbxClaim**](CbxApi.md#getCbxClaim) | **GET** /v1/cbx/claims/{claimId} | A claim&#39;s current state.
[**getCbxCredit**](CbxApi.md#getCbxCredit) | **GET** /v1/cbx/credit | A seller&#39;s wholesale credit line.
[**getCbxMe**](CbxApi.md#getCbxMe) | **GET** /v1/cbx/me | Identity check — which merchant this key belongs to, and its terms.
[**getCbxPool**](CbxApi.md#getCbxPool) | **GET** /v1/cbx/pool | Your events-pool balance.
[**getCbxRevenue**](CbxApi.md#getCbxRevenue) | **GET** /v1/cbx/revenue | Operator revenue accrued and not yet withdrawn.
[**getCbxSubjectBalance**](CbxApi.md#getCbxSubjectBalance) | **GET** /v1/cbx/subjects/{subjectId}/balance | What a subject holds: pending cents and available CBX.
[**getCbxSubjectBalanceBySubjectId**](CbxApi.md#getCbxSubjectBalanceBySubjectId) | **GET** /v1/cbx/subjects/{subjectId}/balances | All three balances a subject holds.
[**getCbxSubjectSpent**](CbxApi.md#getCbxSubjectSpent) | **GET** /v1/cbx/subjects/{subjectId}/spent | Total CBX a subject has spent in your marketplace.
[**getCbxSubjectStake**](CbxApi.md#getCbxSubjectStake) | **GET** /v1/cbx/subjects/{subjectId}/stake | A subject&#39;s staking state and spendable balance.
[**getCbxSubjectWallet**](CbxApi.md#getCbxSubjectWallet) | **GET** /v1/cbx/subjects/{subjectId}/wallet | The verified payout address for a subject, if any.
[**getCbxTreasury**](CbxApi.md#getCbxTreasury) | **GET** /v1/cbx/treasury | Your most recent reserve reconciliation.
[**listCbxAdCreditLedger**](CbxApi.md#listCbxAdCreditLedger) | **GET** /v1/cbx/ad-credit/ledger | Ad-credit movements, newest first.
[**listCbxBoosts**](CbxApi.md#listCbxBoosts) | **GET** /v1/cbx/boosts | Your funded cashback boosts, newest first.
[**listCbxCampaignPayouts**](CbxApi.md#listCbxCampaignPayouts) | **GET** /v1/cbx/campaigns/{campaignId}/payouts | What a campaign actually paid, with the weight behind each amount.
[**listCbxCampaigns**](CbxApi.md#listCbxCampaigns) | **GET** /v1/cbx/campaigns | Your campaigns, newest first.
[**listCbxDisbursementProgress**](CbxApi.md#listCbxDisbursementProgress) | **GET** /v1/cbx/disbursement-progress | How close each rule is to firing — the public counter.
[**listCbxDisbursementRules**](CbxApi.md#listCbxDisbursementRules) | **GET** /v1/cbx/disbursement-rules | Threshold rules that fire community distributions.
[**listCbxEarnTiers**](CbxApi.md#listCbxEarnTiers) | **GET** /v1/cbx/earn-tiers | Earn terms on offer — longer maturation, higher rate.
[**listCbxRedemptionServices**](CbxApi.md#listCbxRedemptionServices) | **GET** /v1/cbx/redemptions/services | Services payable in CBX, and the discount each carries.
[**listCbxStakeTiers**](CbxApi.md#listCbxStakeTiers) | **GET** /v1/cbx/stake-tiers | Staking tiers — what locking tokens buys.
[**listCbxSubjectGrants**](CbxApi.md#listCbxSubjectGrants) | **GET** /v1/cbx/subjects/{subjectId}/grants | Live grants, soonest-expiring first.
[**listCbxSubjectLedger**](CbxApi.md#listCbxSubjectLedger) | **GET** /v1/cbx/subjects/{subjectId}/ledger | A subject&#39;s CBX ledger, newest first.
[**listCbxWalletPaymentReview**](CbxApi.md#listCbxWalletPaymentReview) | **GET** /v1/cbx/wallet-payments/review | Payments held for a human — the ops queue.


<a name="createCbxAccrual"></a>
# **createCbxAccrual**
> CreateCbxAccrualResponse createCbxAccrual()

Record cashback a user earned, in cents.

The accrual is PENDING until its maturation window closes, then converts to CBX at that moment&#39;s market price. It is denominated in cents the whole time it is pending, deliberately: quoting a token quantity up front and buying later would leave the reserve short for the length of the window. Send sourceExternalId and a retry is a no-op rather than a double credit.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      CreateCbxAccrualResponse result = apiInstance.createCbxAccrual();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxAccrual");
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

[**CreateCbxAccrualResponse**](CreateCbxAccrualResponse.md)

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

<a name="createCbxAccrualPurchase"></a>
# **createCbxAccrualPurchase**
> CreateCbxAccrualPurchaseResponse createCbxAccrualPurchase()

Accrue cashback for an order at the resolved rate.

Prefer this over POST /accruals when you want us to do the rate maths — it resolves the tier, the boost and the stake boost, charges your boost budget in the same transaction, and records what rate was actually granted. If a matching boost cannot fund the order, the accrual falls back to your un-boosted rate and &#x60;boostBudgetExhausted&#x60; is true. Idempotent on externalId: a retried webhook neither accrues twice nor charges your budget twice.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      CreateCbxAccrualPurchaseResponse result = apiInstance.createCbxAccrualPurchase();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxAccrualPurchase");
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

[**CreateCbxAccrualPurchaseResponse**](CreateCbxAccrualPurchaseResponse.md)

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

<a name="createCbxAccrualReverse"></a>
# **createCbxAccrualReverse**
> CreateCbxAccrualReverseResponse createCbxAccrualReverse(accrualId)

Claw back a pending accrual — a refund, a cancellation, fraud.

Only works while the accrual is still pending. Once it has converted, the value is tokens in somebody&#39;s balance and this is the wrong operation: reversing then is a debit against that balance, which is a different act with different consequences and is not something an integration key can do. This is why the maturation window has to be at least as long as your refund window.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    String accrualId = "accrualId_example"; // String | 
    try {
      CreateCbxAccrualReverseResponse result = apiInstance.createCbxAccrualReverse(accrualId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxAccrualReverse");
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
 **accrualId** | **String**|  |

### Return type

[**CreateCbxAccrualReverseResponse**](CreateCbxAccrualReverseResponse.md)

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

<a name="createCbxAdCreditPurchase"></a>
# **createCbxAdCreditPurchase**
> CreateCbxAdCreditPurchaseResponse createCbxAdCreditPurchase()

Claim ad credit against a CBX transfer you sent.

Send CBX to our revenue wallet yourself, then present the signature. We read the actual balance delta at FINALIZED commitment — a confirmed transaction can still be dropped by a fork, and this grants real credit. One signature can be claimed exactly once. Priced at the spot when the claim is processed, not when you signed: pricing at send time would let somebody hold signed transfers and claim only the ones that moved in their favour. A 409 means the transaction has not finalized yet and you should retry; a 400 means it will never be claimable (failed, wrong mint, wrong destination).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      CreateCbxAdCreditPurchaseResponse result = apiInstance.createCbxAdCreditPurchase();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxAdCreditPurchase");
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

[**CreateCbxAdCreditPurchaseResponse**](CreateCbxAdCreditPurchaseResponse.md)

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

<a name="createCbxAdCreditQuote"></a>
# **createCbxAdCreditQuote**
> CreateCbxAdCreditQuoteResponse createCbxAdCreditQuote()

What a given number of tokens buys in ad credit.

Credit is 1:1 with the market value of the tokens at confirmation. Refuses with 409 when there is no fresh price — pricing an entire prepaid budget off a guess is not something to do quietly.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      CreateCbxAdCreditQuoteResponse result = apiInstance.createCbxAdCreditQuote();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxAdCreditQuote");
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

[**CreateCbxAdCreditQuoteResponse**](CreateCbxAdCreditQuoteResponse.md)

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

<a name="createCbxAdCreditSpend"></a>
# **createCbxAdCreditSpend**
> CreateCbxAdCreditSpendResponse createCbxAdCreditSpend()

Consume credit for a billing period.

Spends what the balance covers and reports the rest as &#x60;shortfallCents&#x60; — the campaign should stop there rather than running on credit that does not exist. 20% of what is spent moves to the community events pool and 80% is operator revenue; the split happens on SPEND rather than at purchase, because the pool&#39;s share is earned when the advertising is actually delivered. Idempotent on externalId: pass your billing-period id so a retried run does not consume the same credit twice.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      CreateCbxAdCreditSpendResponse result = apiInstance.createCbxAdCreditSpend();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxAdCreditSpend");
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

[**CreateCbxAdCreditSpendResponse**](CreateCbxAdCreditSpendResponse.md)

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

<a name="createCbxBoost"></a>
# **createCbxBoost**
> CreateCbxBoostResponse createCbxBoost()

Fund elevated cashback on matching items.

Performance marketing priced in CBX: the spend lands as a durable balance the buyer returns to use, rather than a one-time price cut they pocket. A boost REPLACES the base or tier rate rather than adding to it — you are stating the total you will pay, and it is priced against your margin. Targeting is matched by equality on one facet; most specific wins (sku &gt; collection &gt; category &gt; all). Kinds: all, category, sku, collection.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      CreateCbxBoostResponse result = apiInstance.createCbxBoost();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxBoost");
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

[**CreateCbxBoostResponse**](CreateCbxBoostResponse.md)

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

<a name="createCbxBoostPause"></a>
# **createCbxBoostPause**
> CreateCbxBoostPauseResponse createCbxBoostPause(boostId)

Stop a boost from matching further orders.

Pausing does not refund anything — already-accrued cashback is a promise already made to a buyer, and unwinding it would take back cashback somebody was shown at checkout. The remaining budget simply stops being spendable.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    String boostId = "boostId_example"; // String | 
    try {
      CreateCbxBoostPauseResponse result = apiInstance.createCbxBoostPause(boostId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxBoostPause");
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
 **boostId** | **String**|  |

### Return type

[**CreateCbxBoostPauseResponse**](CreateCbxBoostPauseResponse.md)

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

<a name="createCbxCampaign"></a>
# **createCbxCampaign**
> CreateCbxCampaignResponse createCbxCampaign()

Create a campaign in draft.

Nothing is paid until it is previewed, approved and executed. Available metrics: accruals_count, accrued_cents, spend_count, spend_base_units — all of them measure activity inside the window. &#x60;capPerSubject&#x60; is worth setting on a proportional campaign: without it one large participant can take almost the whole pool, which makes the event pointless for everybody else.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      CreateCbxCampaignResponse result = apiInstance.createCbxCampaign();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxCampaign");
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

[**CreateCbxCampaignResponse**](CreateCbxCampaignResponse.md)

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

<a name="createCbxCampaignApprove"></a>
# **createCbxCampaignApprove**
> CreateCbxCampaignApproveResponse createCbxCampaignApprove(campaignId)

Approve the previewed recipient list.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    String campaignId = "campaignId_example"; // String | 
    try {
      CreateCbxCampaignApproveResponse result = apiInstance.createCbxCampaignApprove(campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxCampaignApprove");
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
 **campaignId** | **String**|  |

### Return type

[**CreateCbxCampaignApproveResponse**](CreateCbxCampaignApproveResponse.md)

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

<a name="createCbxCampaignExecute"></a>
# **createCbxCampaignExecute**
> CreateCbxCampaignExecuteResponse createCbxCampaignExecute(campaignId)

Pay an approved campaign.

Recomputes the list and refuses if the hash no longer matches the approved one. Payouts credit balances directly rather than transferring on chain, so a distribution to ten thousand recipients costs one internal move and is reversible if it was computed wrong.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    String campaignId = "campaignId_example"; // String | 
    try {
      CreateCbxCampaignExecuteResponse result = apiInstance.createCbxCampaignExecute(campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxCampaignExecute");
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
 **campaignId** | **String**|  |

### Return type

[**CreateCbxCampaignExecuteResponse**](CreateCbxCampaignExecuteResponse.md)

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

<a name="createCbxCampaignPreview"></a>
# **createCbxCampaignPreview**
> CreateCbxCampaignPreviewResponse createCbxCampaignPreview(campaignId)

Compute the recipient list without paying it.

Returns every recipient and amount, plus a hash of the list. Re-previewing invalidates any prior approval by design — the approver signed off on a specific list, and if it has changed they have not approved what would now happen.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    String campaignId = "campaignId_example"; // String | 
    try {
      CreateCbxCampaignPreviewResponse result = apiInstance.createCbxCampaignPreview(campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxCampaignPreview");
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
 **campaignId** | **String**|  |

### Return type

[**CreateCbxCampaignPreviewResponse**](CreateCbxCampaignPreviewResponse.md)

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

<a name="createCbxClaim"></a>
# **createCbxClaim**
> CreateCbxClaimResponse createCbxClaim()

Reserve a claim. Debits the balance and queues the transfer.

The balance is debited here, before anything is sent, which is the only safe order: sending first and debiting after means a crash between the two pays somebody and never charges them, and that is unrecoverable. A crash after this leaves a reserved balance and a pending claim, which is recoverable by looking at the chain. Send the same idempotencyKey to retry safely.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      CreateCbxClaimResponse result = apiInstance.createCbxClaim();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxClaim");
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

[**CreateCbxClaimResponse**](CreateCbxClaimResponse.md)

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

<a name="createCbxClaimQuote"></a>
# **createCbxClaimQuote**
> CreateCbxClaimQuoteResponse createCbxClaimQuote()

What a claim would cost, without committing to it.

Every fee at cost, so a confirm screen can show the breakdown before the user agrees. The network fee is passed through at actual cost and includes the one-time account rent when the recipient has no token account yet — that rent is a recoverable deposit on an account the USER owns, not a fee we keep.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      CreateCbxClaimQuoteResponse result = apiInstance.createCbxClaimQuote();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxClaimQuote");
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

[**CreateCbxClaimQuoteResponse**](CreateCbxClaimQuoteResponse.md)

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

<a name="createCbxClaimSend"></a>
# **createCbxClaimSend**
> CreateCbxClaimSendResponse createCbxClaimSend(claimId)

Send a reserved claim on chain.

Re-checks every precondition rather than trusting the reservation: the delegation may have been revoked, the fee payer may have run dry, the address may have been flagged since. A response of &#x60;unconfirmed&#x60; means the transfer may have landed but confirmation was not observed — do NOT retry it, it needs reconciliation against the chain first.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    String claimId = "claimId_example"; // String | 
    try {
      CreateCbxClaimSendResponse result = apiInstance.createCbxClaimSend(claimId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxClaimSend");
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
 **claimId** | **String**|  |

### Return type

[**CreateCbxClaimSendResponse**](CreateCbxClaimSendResponse.md)

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

<a name="createCbxCreditDraw"></a>
# **createCbxCreditDraw**
> CreateCbxCreditDrawResponse createCbxCreditDraw()

Draw against a line, receiving grant credit.

The advance lands as GRANT balance: in-platform only, so it cannot be withdrawn, cannot be turned into cash and absconded with, and adds nothing to the float that could hit an order book. Restricted to wholesale channels — the limit was sized on the theory that the advance buys goods that get sold and generate the payout stream repaying it, and credit spent on a subscription does not create that stream. Refuses if the reserve has no unallocated tokens: credit is real value and cannot be advanced against tokens that do not exist. Idempotent on externalId.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      CreateCbxCreditDrawResponse result = apiInstance.createCbxCreditDraw();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxCreditDraw");
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

[**CreateCbxCreditDrawResponse**](CreateCbxCreditDrawResponse.md)

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

<a name="createCbxCreditFreeze"></a>
# **createCbxCreditFreeze**
> CreateCbxCreditFreezeResponse createCbxCreditFreeze()

Stop new draws. Leaves the drawn balance on its terms.

The only lever over a line, and deliberately the only one. A seller who took inventory on Tuesday keeps Tuesday&#39;s terms whatever the token does on Wednesday — the only way a credit product sits next to a volatile asset without transmitting its volatility.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      CreateCbxCreditFreezeResponse result = apiInstance.createCbxCreditFreeze();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxCreditFreeze");
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

[**CreateCbxCreditFreezeResponse**](CreateCbxCreditFreezeResponse.md)

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

<a name="createCbxCreditRefresh"></a>
# **createCbxCreditRefresh**
> CreateCbxCreditRefreshResponse createCbxCreditRefresh()

Recompute a limit from trading history and stake.

The earned limit is a share of trailing SETTLED payout volume — money that actually reached the seller, not listed inventory or projected sales. The stake bonus is capped at a share of that, so a seller with no history gets nothing however much they stake. A frozen line stays frozen: freezing is a credit decision somebody made, and a recompute must not quietly undo it.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      CreateCbxCreditRefreshResponse result = apiInstance.createCbxCreditRefresh();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxCreditRefresh");
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

[**CreateCbxCreditRefreshResponse**](CreateCbxCreditRefreshResponse.md)

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

<a name="createCbxCreditRepay"></a>
# **createCbxCreditRepay**
> CreateCbxCreditRepayResponse createCbxCreditRepay()

Apply a repayment to a line.

&#x60;treasury&#x60; scope, which looks backwards next to a draw needing only &#x60;spend&#x60; and is deliberate: a forged repayment writes off real money owed to us, while a forged draw hands out credit spendable only in our own marketplace. The scope follows the loss. Clamped to what is outstanding — a payout larger than the debt would otherwise push the balance negative and read as credit nobody underwrote.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      CreateCbxCreditRepayResponse result = apiInstance.createCbxCreditRepay();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxCreditRepay");
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

[**CreateCbxCreditRepayResponse**](CreateCbxCreditRepayResponse.md)

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

<a name="createCbxDisbursementRule"></a>
# **createCbxDisbursementRule**
> CreateCbxDisbursementRuleResponse createCbxDisbursementRule()

Fire a distribution when the events pool crosses a threshold.

Applies to the EVENTS POOL only — never free reserve surplus. Reserve surplus is the recirculation buffer that funds the next accrual without touching the market, so distributing it would force us to buy the same tokens back at spread plus MEV. &#x60;checkCadenceHours&#x60; bounds how often the rule may fire even when the pool is over the line: a pure threshold fires at an unpredictable moment, and the pool jumps most after a lapse sweep — precisely when engagement was worst. &#x60;distributeBps&#x60; is capped under 100% because draining the pool removes the standing balance that makes the next event credible. The rule decides WHEN only: firing opens a campaign that still needs preview, approval and execution. Metrics: accruals_count, accrued_cents, spend_count, spend_base_units.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      CreateCbxDisbursementRuleResponse result = apiInstance.createCbxDisbursementRule();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxDisbursementRule");
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

[**CreateCbxDisbursementRuleResponse**](CreateCbxDisbursementRuleResponse.md)

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

<a name="createCbxDisbursementRuleActive"></a>
# **createCbxDisbursementRuleActive**
> CreateCbxDisbursementRuleActiveResponse createCbxDisbursementRuleActive(ruleId)

Enable or disable a rule.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    String ruleId = "ruleId_example"; // String | 
    try {
      CreateCbxDisbursementRuleActiveResponse result = apiInstance.createCbxDisbursementRuleActive(ruleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxDisbursementRuleActive");
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
 **ruleId** | **String**|  |

### Return type

[**CreateCbxDisbursementRuleActiveResponse**](CreateCbxDisbursementRuleActiveResponse.md)

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

<a name="createCbxDisbursementRuleCheck"></a>
# **createCbxDisbursementRuleCheck**
> CreateCbxDisbursementRuleCheckResponse createCbxDisbursementRuleCheck(ruleId)

Evaluate a rule now. Fires it if every gate passes.

Gates in order: cadence, threshold, coverage. &#x60;outcome&#x60; names the one that stopped it — every evaluation is recorded including the declines, because \&quot;why didn&#39;t the event happen\&quot; is the question people ask and the answer is always a check that ran and said no. A missing or stale treasury snapshot declines on &#x60;coverage&#x60;: unknown coverage is not healthy coverage. Send dryRun to evaluate without opening a campaign or writing anything.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    String ruleId = "ruleId_example"; // String | 
    try {
      CreateCbxDisbursementRuleCheckResponse result = apiInstance.createCbxDisbursementRuleCheck(ruleId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxDisbursementRuleCheck");
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
 **ruleId** | **String**|  |

### Return type

[**CreateCbxDisbursementRuleCheckResponse**](CreateCbxDisbursementRuleCheckResponse.md)

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

<a name="createCbxEarnTier"></a>
# **createCbxEarnTier**
> CreateCbxEarnTierResponse createCbxEarnTier()

Define an earn term.

Setting &#x60;isDefault&#x60; moves the default off whatever held it — exactly one active default per merchant is enforced by a unique index, because two would make \&quot;what rate did this user get\&quot; depend on row order.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      CreateCbxEarnTierResponse result = apiInstance.createCbxEarnTier();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxEarnTier");
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

[**CreateCbxEarnTierResponse**](CreateCbxEarnTierResponse.md)

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

<a name="createCbxRateQuote"></a>
# **createCbxRateQuote**
> CreateCbxRateQuoteResponse createCbxRateQuote()

What would this order earn, and why.

Resolve the rate without accruing anything, so a checkout can show the real number and its reason. &#x60;source&#x60; tells you whether it came from your base rate, a tier, or a boost; &#x60;stakeBoostBps&#x60; is the part the user&#39;s own stake contributed. Quoting does NOT reserve boost budget — a quote and the subsequent accrual can differ if the budget runs out in between, which is why the accrual response repeats the rate it actually granted.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      CreateCbxRateQuoteResponse result = apiInstance.createCbxRateQuote();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxRateQuote");
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

[**CreateCbxRateQuoteResponse**](CreateCbxRateQuoteResponse.md)

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

<a name="createCbxRedemption"></a>
# **createCbxRedemption**
> CreateCbxRedemptionResponse createCbxRedemption()

Pay for a service in CBX.

Idempotent on (serviceKind, externalId) rather than externalId alone: a grading submission and a listing boost can legitimately share an id because they refer to the same item, and without the service in the key, boosting a listing you had already graded would return the grading receipt and never charge for the boost. Staked tokens cannot pay — the debit checks spendable balance, not total.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      CreateCbxRedemptionResponse result = apiInstance.createCbxRedemption();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxRedemption");
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

[**CreateCbxRedemptionResponse**](CreateCbxRedemptionResponse.md)

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

<a name="createCbxRedemptionQuote"></a>
# **createCbxRedemptionQuote**
> CreateCbxRedemptionQuoteResponse createCbxRedemptionQuote()

What a service costs in tokens right now.

Refuses with 409 when there is no fresh price. A dollar-priced service has no honest token quantity without a spot, and there is no safe direction to guess in — a guess either overcharges the user or undercharges us.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      CreateCbxRedemptionQuoteResponse result = apiInstance.createCbxRedemptionQuote();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxRedemptionQuote");
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

[**CreateCbxRedemptionQuoteResponse**](CreateCbxRedemptionQuoteResponse.md)

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

<a name="createCbxRevenueSweep"></a>
# **createCbxRevenueSweep**
> CreateCbxRevenueSweepResponse createCbxRevenueSweep()

Move accrued revenue from the reserve to your revenue wallet.

Computes what is genuinely free — reserve minus outstanding balances, minus claims in flight, minus the pool, minus unswept revenue — and moves at most that. If the reserve is short it moves NOTHING, whatever the ledger says: an under-covered reserve is not a reason to stop paying users, it is a reason to stop paying yourself. Send dryRun to see the arithmetic without moving tokens.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      CreateCbxRevenueSweepResponse result = apiInstance.createCbxRevenueSweep();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxRevenueSweep");
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

[**CreateCbxRevenueSweepResponse**](CreateCbxRevenueSweepResponse.md)

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

<a name="createCbxSpend"></a>
# **createCbxSpend**
> CreateCbxSpendResponse createCbxSpend()

Redeem a user&#39;s CBX against an order.

Debits the user exactly what they spent — the skim is never added on top, because making CBX worth less when used than when sold would invert the whole reason to spend rather than liquidate. The skim comes out of YOUR fee on the order and is capped against it, so an order paid entirely in saved-up CBX does not have its whole margin eaten. Idempotent on externalId: a retried checkout returns the original spend rather than debiting twice. Spending is always free and has no minimum — that asymmetry against the withdrawal fee is what steers toward spending without ever telling anyone they cannot have their money.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      CreateCbxSpendResponse result = apiInstance.createCbxSpend();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxSpend");
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

[**CreateCbxSpendResponse**](CreateCbxSpendResponse.md)

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

<a name="createCbxSpendReverse"></a>
# **createCbxSpendReverse**
> CreateCbxSpendReverseResponse createCbxSpendReverse(externalId)

Refund a spend — give the tokens back and claw the skim back.

Returns the user&#39;s tokens AND reverses the skim out of both the community pool and operator revenue. All three move together: returning the tokens while the pool and operator kept their shares would count the same tokens twice against one reserve. The spend also stops counting as activity for campaign weighting, so buy-then-refund cannot farm distributions.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    String externalId = "externalId_example"; // String | 
    try {
      CreateCbxSpendReverseResponse result = apiInstance.createCbxSpendReverse(externalId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxSpendReverse");
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
 **externalId** | **String**|  |

### Return type

[**CreateCbxSpendReverseResponse**](CreateCbxSpendReverseResponse.md)

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

<a name="createCbxStakeTier"></a>
# **createCbxStakeTier**
> CreateCbxStakeTierResponse createCbxStakeTier()

Define a staking tier.

A user gets the highest tier their amount clears. &#x60;cooldownDays&#x60; is what makes the discount real: without a wait, a user stakes for the discount and unstakes the moment they want to withdraw, so the commitment it was priced against never existed.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      CreateCbxStakeTierResponse result = apiInstance.createCbxStakeTier();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxStakeTier");
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

[**CreateCbxStakeTierResponse**](CreateCbxStakeTierResponse.md)

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

<a name="createCbxSubject"></a>
# **createCbxSubject**
> CreateCbxSubjectResponse createCbxSubject()

Map one of your user ids to a CBX subject.

Idempotent. Call it whenever you need a subject id; repeated calls with the same externalUserId return the same subject. Your user ids are opaque to us and unique only within your merchant, so two marketplaces can both have a user \&quot;1\&quot; without collision.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      CreateCbxSubjectResponse result = apiInstance.createCbxSubject();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxSubject");
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

[**CreateCbxSubjectResponse**](CreateCbxSubjectResponse.md)

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

<a name="createCbxSubjectGrant"></a>
# **createCbxSubjectGrant**
> CreateCbxSubjectGrantResponse createCbxSubjectGrant(subjectId)

Issue grant credit — in-platform, non-withdrawable.

Requires a funding &#x60;batchId&#x60; for every kind except &#x60;grant_makegood&#x60;. Grant credit is spendable at merchants who receive real value, so the tokens have to exist — the same rule earned balance obeys. A makegood is exempt because compensating somebody for our failure must not be blocked on treasury state. There is no path that converts a grant to earned balance or pays it to an address, and the database enforces that rather than a comment.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    String subjectId = "subjectId_example"; // String | 
    try {
      CreateCbxSubjectGrantResponse result = apiInstance.createCbxSubjectGrant(subjectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxSubjectGrant");
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
 **subjectId** | **String**|  |

### Return type

[**CreateCbxSubjectGrantResponse**](CreateCbxSubjectGrantResponse.md)

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

<a name="createCbxSubjectSpendPlan"></a>
# **createCbxSubjectSpendPlan**
> CreateCbxSubjectSpendPlanResponse createCbxSubjectSpendPlan(subjectId)

Which balances would pay for a spend, and in what order.

The order is granted → earned → connected and you do not get to choose it. Granted first is a security property, not a preference: if earned spent first, a subject holding both would spend their withdrawable balance down while their non-withdrawable grant sat untouched — converting a grant into a withdrawable balance one purchase at a time. Returns a &#x60;shortfallBaseUnits&#x60; rather than failing, so a checkout can charge the remainder to a card. Send excludeConnected on a flow that cannot wait for an on-chain transfer.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    String subjectId = "subjectId_example"; // String | 
    try {
      CreateCbxSubjectSpendPlanResponse result = apiInstance.createCbxSubjectSpendPlan(subjectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxSubjectSpendPlan");
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
 **subjectId** | **String**|  |

### Return type

[**CreateCbxSubjectSpendPlanResponse**](CreateCbxSubjectSpendPlanResponse.md)

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

<a name="createCbxSubjectStake"></a>
# **createCbxSubjectStake**
> CreateCbxSubjectStakeResponse createCbxSubjectStake(subjectId)

Lock a subject&#39;s tokens for a tier.

Refuses an amount that clears no tier — locking tokens for no benefit is never what somebody meant to do. One stake per subject: to change the amount, unstake and wait out the cooldown first.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    String subjectId = "subjectId_example"; // String | 
    try {
      CreateCbxSubjectStakeResponse result = apiInstance.createCbxSubjectStake(subjectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxSubjectStake");
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
 **subjectId** | **String**|  |

### Return type

[**CreateCbxSubjectStakeResponse**](CreateCbxSubjectStakeResponse.md)

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

<a name="createCbxSubjectStakeUnstake"></a>
# **createCbxSubjectStakeUnstake**
> CreateCbxSubjectStakeUnstakeResponse createCbxSubjectStakeUnstake(subjectId)

Start the cooldown. Tokens unlock when it elapses.

The earn boost stops immediately; the tokens stay locked until &#x60;unlocksAt&#x60;. The cooldown is read from the tier as configured NOW, which is the one place a later config change is allowed to matter — holding somebody to a longer wait the merchant has since abandoned would be the worse behaviour.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    String subjectId = "subjectId_example"; // String | 
    try {
      CreateCbxSubjectStakeUnstakeResponse result = apiInstance.createCbxSubjectStakeUnstake(subjectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxSubjectStakeUnstake");
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
 **subjectId** | **String**|  |

### Return type

[**CreateCbxSubjectStakeUnstakeResponse**](CreateCbxSubjectStakeUnstakeResponse.md)

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

<a name="createCbxWalletChallenge"></a>
# **createCbxWalletChallenge**
> CreateCbxWalletChallengeResponse createCbxWalletChallenge()

Start wallet verification. Returns a message for the user to sign.

Present the returned &#x60;message&#x60; verbatim to the user&#39;s wallet for signing. It binds your merchant, their subject, the address and a single-use nonce, so the resulting signature is not transferable to another address or account. A signature is required because there is no custody here: a send cannot be undone, so a typo or a swapped address is permanent.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      CreateCbxWalletChallengeResponse result = apiInstance.createCbxWalletChallenge();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxWalletChallenge");
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

[**CreateCbxWalletChallengeResponse**](CreateCbxWalletChallengeResponse.md)

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

<a name="createCbxWalletPaymentConfirm"></a>
# **createCbxWalletPaymentConfirm**
> CreateCbxWalletPaymentConfirmResponse createCbxWalletPaymentConfirm()

Present the signature. Returns a ship / do-not-ship decision.

Everything is read from the CHAIN at finalized commitment — the amount, the payer, the destination. Nothing you assert about the payment is trusted, because a client that can state its own payment amount can state a larger one. The response &#x60;releaseDecision&#x60; is about the ORDER, not the payment: by the time we see a signature the tokens have moved and cannot be un-moved, so the only decision left is whether to hand over goods. &#x60;release&#x60; means ship. &#x60;review&#x60; means hold — a person needs to look, and that includes the case where no screening provider is configured. &#x60;refuse&#x60; means do not ship; the payment is still recorded, because we received the tokens and that fact does not go away. Idempotent twice over: on txSig globally, so one payment cannot pay two orders, and on (merchant, externalId), so one order is not paid twice. A 409 means the transaction has not finalized yet and you should retry; a 400 means it never will be claimable.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      CreateCbxWalletPaymentConfirmResponse result = apiInstance.createCbxWalletPaymentConfirm();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxWalletPaymentConfirm");
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

[**CreateCbxWalletPaymentConfirmResponse**](CreateCbxWalletPaymentConfirmResponse.md)

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

<a name="createCbxWalletPaymentQuote"></a>
# **createCbxWalletPaymentQuote**
> CreateCbxWalletPaymentQuoteResponse createCbxWalletPaymentQuote()

Build a transfer for the buyer to sign themselves.

Returns an unsigned, base64 transaction. The buyer&#39;s wallet signs and submits it; we never hold a key or a delegation and never submit anything, so the platform has no authority over their tokens at any point. RESERVES NOTHING — no row, no hold, no balance change. The buyer may never sign it. The SIGNATURE is the event, so treat this as a convenience and not a commitment. &#x60;lastValidBlockHeight&#x60; is when it expires: a wallet prompt left open for a couple of minutes produces a transaction the chain will reject, and you should re-quote rather than retry. &#x60;payerCanCover&#x60; is a courtesy read of their balance so you can warn before a prompt rather than after a failure; null means we could not read it, which is not the same as \&quot;no\&quot;. The buyer needs no prior wallet registration: a payment proves control of the tokens, which is what a connect-and-verify step would have been proving.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      CreateCbxWalletPaymentQuoteResponse result = apiInstance.createCbxWalletPaymentQuote();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxWalletPaymentQuote");
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

[**CreateCbxWalletPaymentQuoteResponse**](CreateCbxWalletPaymentQuoteResponse.md)

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

<a name="createCbxWalletPaymentResolve"></a>
# **createCbxWalletPaymentResolve**
> CreateCbxWalletPaymentResolveResponse createCbxWalletPaymentResolve(paymentId)

A human decides on a held payment.

Only moves a payment OUT of &#x60;review&#x60;, never between the other two. A refusal that could later be flipped to a release is an approval control with no teeth, and a release re-decided as a refusal after the goods shipped is a record that no longer describes what happened. The reviewer and their note are stored on the row, because this is the decision somebody will be asked to justify.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    String paymentId = "paymentId_example"; // String | 
    try {
      CreateCbxWalletPaymentResolveResponse result = apiInstance.createCbxWalletPaymentResolve(paymentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxWalletPaymentResolve");
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
 **paymentId** | **String**|  |

### Return type

[**CreateCbxWalletPaymentResolveResponse**](CreateCbxWalletPaymentResolveResponse.md)

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

<a name="createCbxWalletVerify"></a>
# **createCbxWalletVerify**
> CreateCbxWalletVerifyResponse createCbxWalletVerify()

Complete wallet verification with the user&#39;s signature.

The signature is checked against the message WE issued and stored, never one supplied here. The nonce is single-use, so the same signature cannot re-verify an address later.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      CreateCbxWalletVerifyResponse result = apiInstance.createCbxWalletVerify();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#createCbxWalletVerify");
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

[**CreateCbxWalletVerifyResponse**](CreateCbxWalletVerifyResponse.md)

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

<a name="getCbxAdCredit"></a>
# **getCbxAdCredit**
> GetCbxAdCreditResponse getCbxAdCredit()

Unspent advertising credit, in cents.

Advertising is payable in CBX and nothing else. Your budget is denominated in dollars, priced at the spot when your payment finalized — deliberately NOT held as a token quantity, since a price move would otherwise silently change the budget you prepaid, making you a market participant because you bought ads. Credit is 1:1 with market value: with CBX the only way to pay there is nothing to discount against. Spendable on advertising only, and not refundable.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      GetCbxAdCreditResponse result = apiInstance.getCbxAdCredit();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#getCbxAdCredit");
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

[**GetCbxAdCreditResponse**](GetCbxAdCreditResponse.md)

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

<a name="getCbxClaim"></a>
# **getCbxClaim**
> GetCbxClaimResponse getCbxClaim(claimId)

A claim&#39;s current state.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    String claimId = "claimId_example"; // String | 
    try {
      GetCbxClaimResponse result = apiInstance.getCbxClaim(claimId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#getCbxClaim");
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
 **claimId** | **String**|  |

### Return type

[**GetCbxClaimResponse**](GetCbxClaimResponse.md)

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

<a name="getCbxCredit"></a>
# **getCbxCredit**
> GetCbxCreditResponse getCbxCredit()

A seller&#39;s wholesale credit line.

Trade credit, not token-collateralized lending. The line is secured by receivables we already hold — the payout stream sits under a hold with an exposure ceiling — and secondarily by goods bought from our own wholesale channel. CBX is the alignment mechanism, not the collateral: a stake raises the limit and lowers the rate, bounded to a share of the earned limit so a price collapse can never remove the majority of a facility. The limit may FALL. A drawn balance is never accelerated or margin-called — there is no liquidation engine, no keeper and no oracle trigger anywhere in it.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      GetCbxCreditResponse result = apiInstance.getCbxCredit();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#getCbxCredit");
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

[**GetCbxCreditResponse**](GetCbxCreditResponse.md)

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

<a name="getCbxMe"></a>
# **getCbxMe**
> GetCbxMeResponse getCbxMe()

Identity check — which merchant this key belongs to, and its terms.

Returns the economics your merchant is configured with, so an integration can display accurate terms rather than hard-coding ours. Note &#x60;claimsEnabled&#x60;: off means balances are store credit that cannot leave, which is the default and the smaller regulatory posture.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      GetCbxMeResponse result = apiInstance.getCbxMe();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#getCbxMe");
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

[**GetCbxMeResponse**](GetCbxMeResponse.md)

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

<a name="getCbxPool"></a>
# **getCbxPool**
> GetCbxPoolResponse getCbxPool()

Your events-pool balance.

Funded by the skim on in-marketplace CBX spending, the community share of withdrawal fees, and lapsed balances. Sponsor budgets are tracked separately and are not included here.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      GetCbxPoolResponse result = apiInstance.getCbxPool();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#getCbxPool");
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

[**GetCbxPoolResponse**](GetCbxPoolResponse.md)

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

<a name="getCbxRevenue"></a>
# **getCbxRevenue**
> GetCbxRevenueResponse getCbxRevenue()

Operator revenue accrued and not yet withdrawn.

Your share of the spend skim plus your half of withdrawal fees, denominated in CBX. It sits inside the reserve until swept, which is why it is tracked here rather than inferred: without a number saying how much of the reserve is yours, there is no safe amount to take out.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      GetCbxRevenueResponse result = apiInstance.getCbxRevenue();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#getCbxRevenue");
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

[**GetCbxRevenueResponse**](GetCbxRevenueResponse.md)

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

<a name="getCbxSubjectBalance"></a>
# **getCbxSubjectBalance**
> GetCbxSubjectBalanceResponse getCbxSubjectBalance(subjectId)

What a subject holds: pending cents and available CBX.

Two numbers because they are two different things. &#x60;pendingCents&#x60; is cashback earned but still inside its window — reversible, denominated in dollars, not yet tokens. &#x60;availableBaseUnits&#x60; is CBX they hold now. Amounts are strings because a token balance can exceed what a JSON number represents exactly.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    String subjectId = "subjectId_example"; // String | 
    try {
      GetCbxSubjectBalanceResponse result = apiInstance.getCbxSubjectBalance(subjectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#getCbxSubjectBalance");
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
 **subjectId** | **String**|  |

### Return type

[**GetCbxSubjectBalanceResponse**](GetCbxSubjectBalanceResponse.md)

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

<a name="getCbxSubjectBalanceBySubjectId"></a>
# **getCbxSubjectBalanceBySubjectId**
> GetCbxSubjectBalanceBySubjectIdResponse getCbxSubjectBalanceBySubjectId(subjectId)

All three balances a subject holds.

EARNED is cashback and affiliate accruals — withdrawable once matured and above the claim floor. GRANTED is ad credit, wholesale draws and promos — spendable in your marketplace only, never withdrawable, so it creates no sell pressure. CONNECTED is the subject&#39;s own self-custodied CBX, reachable through a bounded delegation; it was never our liability and does not enter the reserve invariant. &#x60;connectedAvailableBaseUnits&#x60; is delegation HEADROOM, not a wallet balance — the subject may hold less than they approved, or have revoked on chain without telling us, so treat it as a ceiling and let the spend re-read the chain.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    String subjectId = "subjectId_example"; // String | 
    try {
      GetCbxSubjectBalanceBySubjectIdResponse result = apiInstance.getCbxSubjectBalanceBySubjectId(subjectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#getCbxSubjectBalanceBySubjectId");
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
 **subjectId** | **String**|  |

### Return type

[**GetCbxSubjectBalanceBySubjectIdResponse**](GetCbxSubjectBalanceBySubjectIdResponse.md)

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

<a name="getCbxSubjectSpent"></a>
# **getCbxSubjectSpent**
> GetCbxSubjectSpentResponse getCbxSubjectSpent(subjectId)

Total CBX a subject has spent in your marketplace.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    String subjectId = "subjectId_example"; // String | 
    try {
      GetCbxSubjectSpentResponse result = apiInstance.getCbxSubjectSpent(subjectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#getCbxSubjectSpent");
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
 **subjectId** | **String**|  |

### Return type

[**GetCbxSubjectSpentResponse**](GetCbxSubjectSpentResponse.md)

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

<a name="getCbxSubjectStake"></a>
# **getCbxSubjectStake**
> GetCbxSubjectStakeResponse getCbxSubjectStake(subjectId)

A subject&#39;s staking state and spendable balance.

&#x60;availableBaseUnits&#x60; is the number a checkout must use — balance minus anything locked. &#x60;earnBoostBps&#x60; reads zero once an unstake has been requested, because the boost ends with the commitment; &#x60;feeDiscountBps&#x60; survives the cooldown, since withdrawing is exactly what somebody in cooldown is trying to do.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    String subjectId = "subjectId_example"; // String | 
    try {
      GetCbxSubjectStakeResponse result = apiInstance.getCbxSubjectStake(subjectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#getCbxSubjectStake");
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
 **subjectId** | **String**|  |

### Return type

[**GetCbxSubjectStakeResponse**](GetCbxSubjectStakeResponse.md)

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

<a name="getCbxSubjectWallet"></a>
# **getCbxSubjectWallet**
> GetCbxSubjectWalletResponse getCbxSubjectWallet(subjectId)

The verified payout address for a subject, if any.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    String subjectId = "subjectId_example"; // String | 
    try {
      GetCbxSubjectWalletResponse result = apiInstance.getCbxSubjectWallet(subjectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#getCbxSubjectWallet");
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
 **subjectId** | **String**|  |

### Return type

[**GetCbxSubjectWalletResponse**](GetCbxSubjectWalletResponse.md)

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

<a name="getCbxTreasury"></a>
# **getCbxTreasury**
> GetCbxTreasuryResponse getCbxTreasury()

Your most recent reserve reconciliation.

Coverage is your reserve measured against what you owe your users, including claims already in flight. Below 100% your conversions stop — we will not credit balances that nothing backs. Claims and spends keep working, because those move value out and improve coverage.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      GetCbxTreasuryResponse result = apiInstance.getCbxTreasury();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#getCbxTreasury");
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

[**GetCbxTreasuryResponse**](GetCbxTreasuryResponse.md)

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

<a name="listCbxAdCreditLedger"></a>
# **listCbxAdCreditLedger**
> V1List listCbxAdCreditLedger()

Ad-credit movements, newest first.

Append-only. &#x60;purchase_cbx&#x60; and &#x60;grant&#x60; add; &#x60;ad_spend&#x60; and &#x60;expire&#x60; subtract. There is no refund kind and there will not be one: advertising credit exists to buy advertising, and any exit at face value turns it into a currency exchange.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      V1List result = apiInstance.listCbxAdCreditLedger();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#listCbxAdCreditLedger");
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

[**V1List**](V1List.md)

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

<a name="listCbxBoosts"></a>
# **listCbxBoosts**
> V1List listCbxBoosts()

Your funded cashback boosts, newest first.

&#x60;spentCents&#x60; against &#x60;budgetCents&#x60; is the live burn. The budget is a hard ceiling enforced inside the accrual transaction, so a boost cannot overspend — when it runs out, matching orders quietly fall back to your base rate rather than failing or accruing zero.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      V1List result = apiInstance.listCbxBoosts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#listCbxBoosts");
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

[**V1List**](V1List.md)

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

<a name="listCbxCampaignPayouts"></a>
# **listCbxCampaignPayouts**
> V1List listCbxCampaignPayouts(campaignId)

What a campaign actually paid, with the weight behind each amount.

The weight is kept so a payout can be explained to the person who received it. \&quot;Why did I get this much\&quot; should have an answer that is not \&quot;the algorithm\&quot;.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    String campaignId = "campaignId_example"; // String | 
    try {
      V1List result = apiInstance.listCbxCampaignPayouts(campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#listCbxCampaignPayouts");
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
 **campaignId** | **String**|  |

### Return type

[**V1List**](V1List.md)

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

<a name="listCbxCampaigns"></a>
# **listCbxCampaigns**
> V1List listCbxCampaigns()

Your campaigns, newest first.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      V1List result = apiInstance.listCbxCampaigns();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#listCbxCampaigns");
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

[**V1List**](V1List.md)

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

<a name="listCbxDisbursementProgress"></a>
# **listCbxDisbursementProgress**
> V1List listCbxDisbursementProgress()

How close each rule is to firing — the public counter.

Safe to show users. A climbing counter toward a known number is the reason to prefer cadence-plus-threshold over a pure threshold: people can see the pool rising and know roughly when the next event is possible. A trigger nobody can anticipate generates suspicion rather than anticipation.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      V1List result = apiInstance.listCbxDisbursementProgress();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#listCbxDisbursementProgress");
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

[**V1List**](V1List.md)

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

<a name="listCbxDisbursementRules"></a>
# **listCbxDisbursementRules**
> V1List listCbxDisbursementRules()

Threshold rules that fire community distributions.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      V1List result = apiInstance.listCbxDisbursementRules();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#listCbxDisbursementRules");
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

[**V1List**](V1List.md)

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

<a name="listCbxEarnTiers"></a>
# **listCbxEarnTiers**
> V1List listCbxEarnTiers()

Earn terms on offer — longer maturation, higher rate.

A term structure on a rebate, not a yield: the user chooses WHEN to be paid for a purchase they already made, and a longer wait earns more. Nothing accrues to a balance for being held. Show these at checkout so the choice is the user&#39;s — the rate is snapshot onto the accrual, so a tier edited later never reprices a promise already made.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      V1List result = apiInstance.listCbxEarnTiers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#listCbxEarnTiers");
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

[**V1List**](V1List.md)

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

<a name="listCbxRedemptionServices"></a>
# **listCbxRedemptionServices**
> V1List listCbxRedemptionServices()

Services payable in CBX, and the discount each carries.

Paying in CBX costs less than paying in dollars, which is what makes anybody choose it. These are real services with real cost behind them rather than a sink invented to soak up supply — and sinks matter: supply is fixed, so tokens that only ever accumulate starve the market the protocol has to buy from.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      V1List result = apiInstance.listCbxRedemptionServices();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#listCbxRedemptionServices");
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

[**V1List**](V1List.md)

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

<a name="listCbxStakeTiers"></a>
# **listCbxStakeTiers**
> V1List listCbxStakeTiers()

Staking tiers — what locking tokens buys.

Staking pays NOTHING. It confers a lower withdrawal fee and a higher earn rate on future purchases: a discount for commitment, not a return on a holding. Staked tokens never leave the user — they stay in their balance and stay backed by the reserve — they simply become unspendable until unstaked.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      V1List result = apiInstance.listCbxStakeTiers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#listCbxStakeTiers");
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

[**V1List**](V1List.md)

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

<a name="listCbxSubjectGrants"></a>
# **listCbxSubjectGrants**
> V1List listCbxSubjectGrants(subjectId)

Live grants, soonest-expiring first.

That ordering is the allocation order: a spend consumes the grant closest to lapsing, so value about to expire is used before value that will not. Grants with no expiry sort last.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    String subjectId = "subjectId_example"; // String | 
    try {
      V1List result = apiInstance.listCbxSubjectGrants(subjectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#listCbxSubjectGrants");
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
 **subjectId** | **String**|  |

### Return type

[**V1List**](V1List.md)

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

<a name="listCbxSubjectLedger"></a>
# **listCbxSubjectLedger**
> V1List listCbxSubjectLedger(subjectId, limit)

A subject&#39;s CBX ledger, newest first.

Append-only. The balance is the sum of these rows and there is no cached balance anywhere that could disagree with them.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    String subjectId = "subjectId_example"; // String | 
    Integer limit = 50; // Integer | 
    try {
      V1List result = apiInstance.listCbxSubjectLedger(subjectId, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#listCbxSubjectLedger");
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
 **subjectId** | **String**|  |
 **limit** | **Integer**|  | [optional] [default to 50]

### Return type

[**V1List**](V1List.md)

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

<a name="listCbxWalletPaymentReview"></a>
# **listCbxWalletPaymentReview**
> V1List listCbxWalletPaymentReview()

Payments held for a human — the ops queue.

Every row here is money taken and goods not shipped, which is not a state to leave a buyer in without it appearing on a list. &#x60;riskLevel&#x60; and &#x60;riskExposures&#x60; are the verdict as recorded at the time, not re-derived — asking a provider again next month answers a different question than the one already decided.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import org.openapitools.client.api.CbxApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    CbxApi apiInstance = new CbxApi(defaultClient);
    try {
      V1List result = apiInstance.listCbxWalletPaymentReview();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CbxApi#listCbxWalletPaymentReview");
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

[**V1List**](V1List.md)

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

