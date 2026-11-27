# WorldsApi

All URIs are relative to *https://crossly.net/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWorldExperience**](WorldsApi.md#createWorldExperience) | **POST** /v1/worlds/experiences | Create an experience with a start place (no version yet). Counts against the plan&#39;s experience limit.
[**createWorldExperienceAccess**](WorldsApi.md#createWorldExperienceAccess) | **POST** /v1/worlds/experiences/{experienceId}/access | Who can play: private, friends, unlisted or public (public/unlisted need a reviewed publish).
[**createWorldExperienceAlertAck**](WorldsApi.md#createWorldExperienceAlertAck) | **POST** /v1/worlds/experiences/{experienceId}/alerts/{alertId}/ack | Acknowledge an alert.
[**createWorldExperienceAnalyticQuery**](WorldsApi.md#createWorldExperienceAnalyticQuery) | **POST** /v1/worlds/experiences/{experienceId}/analytics/query | Query one custom event over ≤ 31 days: count, sum, avg or players, by day or hour, optionally grouped by a field. Groups under 50 players are suppressed.
[**createWorldExperienceArchive**](WorldsApi.md#createWorldExperienceArchive) | **POST** /v1/worlds/experiences/{experienceId}/archive | Archive: closes it, drains its servers, frees its plan slot; data is kept.
[**createWorldExperienceBan**](WorldsApi.md#createWorldExperienceBan) | **POST** /v1/worlds/experiences/{experienceId}/bans | Ban a player from your experience: { sub, duration (seconds, null &#x3D; permanent), reason, displayReason?, applyToAlts? }. Enforced at join and on every running server.
[**createWorldExperienceClose**](WorldsApi.md#createWorldExperienceClose) | **POST** /v1/worlds/experiences/{experienceId}/close | Make the experience private again (owner-only joins).
[**createWorldExperienceConfigRollback**](WorldsApi.md#createWorldExperienceConfigRollback) | **POST** /v1/worlds/experiences/{experienceId}/configs/rollback | Instant rollback: an earlier version becomes the newest one.
[**createWorldExperienceEvent**](WorldsApi.md#createWorldExperienceEvent) | **POST** /v1/worlds/experiences/{experienceId}/events | Schedule a live event: start and end, config values while live, an optional Messaging topic the platform publishes to at start and end.
[**createWorldExperienceEventCancel**](WorldsApi.md#createWorldExperienceEventCancel) | **POST** /v1/worlds/experiences/{experienceId}/events/{eventId}/cancel | Cancel a scheduled event, or end a live one now.
[**createWorldExperienceExperiment**](WorldsApi.md#createWorldExperienceExperiment) | **POST** /v1/worlds/experiences/{experienceId}/experiments | Create a draft experiment: 2–5 variants of config values with traffic weights (+ holdout &#x3D; 100), targeting, a primary metric and guardrails, minimum 7 days.
[**createWorldExperienceExperimentShip**](WorldsApi.md#createWorldExperienceExperimentShip) | **POST** /v1/worlds/experiences/{experienceId}/experiments/{experimentId}/ship | Ship a variant: its values become the base config for everyone and the experiment ends.
[**createWorldExperienceExperimentStart**](WorldsApi.md#createWorldExperienceExperimentStart) | **POST** /v1/worlds/experiences/{experienceId}/experiments/{experimentId}/start | Start: running servers begin assigning players by their per-experience id.
[**createWorldExperienceExperimentStop**](WorldsApi.md#createWorldExperienceExperimentStop) | **POST** /v1/worlds/experiences/{experienceId}/experiments/{experimentId}/stop | Stop: every player sees the base config again.
[**createWorldExperienceJoin**](WorldsApi.md#createWorldExperienceJoin) | **POST** /v1/worlds/experiences/{experienceId}/join | Join as the token&#39;s owner: a server and a 60-second single-use ticket for wss …/v1/realtime/worlds/{serverId}. 202 while a new server boots.
[**createWorldExperienceModerationAppeal**](WorldsApi.md#createWorldExperienceModerationAppeal) | **POST** /v1/worlds/experiences/{experienceId}/moderation/appeals | Appeal a moderation decision on your game within 6 months (183 days): { kind: action | game | version | asset, targetId (from GET …/moderation/appeals targets), reason (20-4000 characters), evidence?: up to 5 https links }. The older shape { actionId, statement } still appeals an action. One open appeal per decision; a different reviewer answers and you are notified.
[**createWorldExperienceOpen**](WorldsApi.md#createWorldExperienceOpen) | **POST** /v1/worlds/experiences/{experienceId}/open | Open the experience to players (needs a published start place).
[**createWorldExperiencePlace**](WorldsApi.md#createWorldExperiencePlace) | **POST** /v1/worlds/experiences/{experienceId}/places | Add a place (at most 10 per experience in P1).
[**createWorldExperiencePlaceCheck**](WorldsApi.md#createWorldExperiencePlaceCheck) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/checks | Run the publish checks (script lint, budgets, shop-object listings) on a project. Writes nothing.
[**createWorldExperiencePlacePublish**](WorldsApi.md#createWorldExperiencePlacePublish) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/publishes | Step 1: run checks and freeze a version (the saved draft, or an uploaded versionId). Blocking problems answer 400 with the list.
[**createWorldExperiencePlaceStart**](WorldsApi.md#createWorldExperiencePlaceStart) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/start | Make this the start place (where a plain join lands).
[**createWorldExperiencePlaceTest**](WorldsApi.md#createWorldExperiencePlaceTest) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/test | Cloud playtest: a private test version from the saved draft, joined on a fleet server (owner only, never live). 202 while it boots.
[**createWorldExperiencePlaceVersion**](WorldsApi.md#createWorldExperiencePlaceVersion) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/versions | Upload a version bundle (crossly-worlds-project/1). Not live until published.
[**createWorldExperiencePlaceVersionPublish**](WorldsApi.md#createWorldExperiencePlaceVersionPublish) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/versions/{versionId}/publish | Make a version current (publish or roll back). New joins land on it; older servers drain as they empty.
[**createWorldExperiencePlaceVersionRollback**](WorldsApi.md#createWorldExperiencePlaceVersionRollback) | **POST** /v1/worlds/experiences/{experienceId}/places/{placeId}/versions/{versionId}/rollback | Make an earlier reviewed version current again. Unreviewed versions go through …/publishes.
[**createWorldExperiencePlaytester**](WorldsApi.md#createWorldExperiencePlaytester) | **POST** /v1/worlds/experiences/{experienceId}/playtesters | Add a playtester by Crossly handle (max 200 per game).
[**createWorldExperiencePublishCancel**](WorldsApi.md#createWorldExperiencePublishCancel) | **POST** /v1/worlds/experiences/{experienceId}/publishes/{requestId}/cancel | Give up a publish that is not live.
[**createWorldExperiencePublishHalt**](WorldsApi.md#createWorldExperiencePublishHalt) | **POST** /v1/worlds/experiences/{experienceId}/publishes/{requestId}/halt | Stop a rollout: new joins go back to the current version.
[**createWorldExperiencePublishRollout**](WorldsApi.md#createWorldExperiencePublishRollout) | **POST** /v1/worlds/experiences/{experienceId}/publishes/{requestId}/rollout | Step 7: serve the approved version to percent (1–100) of new joins; 100 makes it current. Crash-heavy rollouts halt automatically.
[**createWorldExperiencePublishSubmit**](WorldsApi.md#createWorldExperiencePublishSubmit) | **POST** /v1/worlds/experiences/{experienceId}/publishes/{requestId}/submit | Step 6: moderation. First publishes and script changes go to a person (24 h SLA); layout-only and private publishes are approved automatically.
[**createWorldExperienceReservedServer**](WorldsApi.md#createWorldExperienceReservedServer) | **POST** /v1/worlds/experiences/{experienceId}/reserved-servers | An access code for a reserved server of a place (teleports, matches, tournaments). The code is shown once.
[**createWorldExperienceRestore**](WorldsApi.md#createWorldExperienceRestore) | **POST** /v1/worlds/experiences/{experienceId}/restore | Restore an archived game, or a deleted one within 30 days; it comes back private.
[**createWorldExperienceServerShutdown**](WorldsApi.md#createWorldExperienceServerShutdown) | **POST** /v1/worlds/experiences/{experienceId}/servers/shutdown | Shut down servers: mode soft (default) teleports players to fresh servers of the current version first; hard stops now. scope all | outdated (only servers not on a served version).
[**createWorldExperienceTransferRequest**](WorldsApi.md#createWorldExperienceTransferRequest) | **POST** /v1/worlds/experiences/{experienceId}/transfer-requests | Ask another Crossly account (handle or email) to take over a 3D game you own. One waiting request per game; it expires after 14 days.
[**createWorldMatureVerify**](WorldsApi.md#createWorldMatureVerify) | **POST** /v1/worlds/mature/verify | Start the ID check Mature needs (Stripe Identity: photo ID + selfie; the date of birth is read off the ID). Returns a hosted URL and client secret, or alreadyVerified.
[**createWorldParentalAccept**](WorldsApi.md#createWorldParentalAccept) | **POST** /v1/worlds/parental/accept | Accept a child&#39;s invite as the parent: { code, pin }. The parent must be an ID-verified adult (18+ by the date of birth on the ID). The PIN protects every later change.
[**createWorldParentalChildrenPin**](WorldsApi.md#createWorldParentalChildrenPin) | **POST** /v1/worlds/parental/children/{childId}/pin | Change the parent PIN: { pin, newPin } (4-8 digits). Five wrong PINs lock changes for 15 minutes.
[**createWorldParentalChildrenUnlink**](WorldsApi.md#createWorldParentalChildrenUnlink) | **POST** /v1/worlds/parental/children/{childId}/unlink | Remove the parent link (and its limits) with your PIN: { pin }.
[**createWorldParentalInvite**](WorldsApi.md#createWorldParentalInvite) | **POST** /v1/worlds/parental/invite | An under-18 account asks for a parent: a one-time code (72 hours) the parent enters while signed in to their own account. Replaces any pending code.
[**createWorldRatingCompute**](WorldsApi.md#createWorldRatingCompute) | **POST** /v1/worlds/rating/compute | Rate a set of questionnaire answers exactly as publishing does: { answers } → rating (null when refused), reasons, content descriptors, interactive notices and refusals.
[**createWorldReport**](WorldsApi.md#createWorldReport) | **POST** /v1/worlds/reports | Report a player (targetSub), the experience, an object (targetInstanceId) or a chat line (chatLineId). Crossly attaches the server, place version and its own chat log; you send ids only.
[**createWorldTransferRequestAccept**](WorldsApi.md#createWorldTransferRequestAccept) | **POST** /v1/worlds/transfer-requests/{requestId}/accept | Accept a transfer asked of you: the game becomes yours now. Earnings already credited stay with the previous owner; new sales pay you.
[**createWorldTransferRequestCancel**](WorldsApi.md#createWorldTransferRequestCancel) | **POST** /v1/worlds/transfer-requests/{requestId}/cancel | Cancel a transfer request you sent while it waits.
[**createWorldTransferRequestDecline**](WorldsApi.md#createWorldTransferRequestDecline) | **POST** /v1/worlds/transfer-requests/{requestId}/decline | Decline a transfer asked of you; nothing changes.
[**deleteWorldExperience**](WorldsApi.md#deleteWorldExperience) | **DELETE** /v1/worlds/experiences/{experienceId} | Delete a game (a tombstone, restorable for 30 days). Body { confirmName } &#x3D; the game&#39;s name.
[**deleteWorldExperienceBan**](WorldsApi.md#deleteWorldExperienceBan) | **DELETE** /v1/worlds/experiences/{experienceId}/bans/{sub} | Lift your experience&#39;s ban on a player. Bans placed by Crossly safety are lifted only by appeal.
[**deleteWorldExperiencePlaytester**](WorldsApi.md#deleteWorldExperiencePlaytester) | **DELETE** /v1/worlds/experiences/{experienceId}/playtesters/{userId} | Remove a playtester.
[**deleteWorldParentalInvite**](WorldsApi.md#deleteWorldParentalInvite) | **DELETE** /v1/worlds/parental/invite | Withdraw a pending parent invite.
[**getWorldChart**](WorldsApi.md#getWorldChart) | **GET** /v1/worlds/charts/{chart} | A chart: top-playing (players now), trending (this week vs last, retention-weighted), top-rated (Wilson lower bound of thumbs up, 10+ votes), new-rising, friends, most-favorited; ?genre&#x3D; cuts it to one genre. Organic only: nothing paid.
[**getWorldDiscoverExperience**](WorldsApi.md#getWorldDiscoverExperience) | **GET** /v1/worlds/discover/experiences/{key} | An experience&#39;s thumbs up/down, favourites, your vote and favourite, and whether you have played enough to vote (10 minutes). key: worlds:&lt;id&gt;, classic:&lt;id&gt;, tcg:&lt;game&gt;, cards:&lt;game&gt;.
[**getWorldDiscoverRow**](WorldsApi.md#getWorldDiscoverRow) | **GET** /v1/worlds/discover/rows | The Play hub&#39;s rows for you: Continue playing, Friends are playing, Recommended for you, Featured (editorial, first-party capped), Top Playing, Trending, New &amp; Rising, Top Rated, Made in Carnival Studio, Shop the world, card games, Classic games and genre rows. At most one tile is paid, always labelled \&quot;Sponsored\&quot;, never in the first two rows or a row&#39;s first two places.
[**getWorldExperience**](WorldsApi.md#getWorldExperience) | **GET** /v1/worlds/experiences/{experienceId} | One of your experiences with its places, live CCU and server count.
[**getWorldExperienceAccessLimit**](WorldsApi.md#getWorldExperienceAccessLimit) | **GET** /v1/worlds/experiences/{experienceId}/access-limits | The game&#39;s crew-only and country limits, and the owner&#39;s crew.
[**getWorldExperienceAlertSetting**](WorldsApi.md#getWorldExperienceAlertSetting) | **GET** /v1/worlds/experiences/{experienceId}/alerts/settings | Alert rules (threshold, on/off, inbox, webhook) and quiet hours.
[**getWorldExperienceAnalytic**](WorldsApi.md#getWorldExperienceAnalytic) | **GET** /v1/worlds/experiences/{experienceId}/analytics/{report} | An analytics report: overview, engagement, retention, monetization, funnels, economy, performance, custom or costs (fleet CPU-minutes, egress, estimated cost). ?from&#x3D;&amp;to&#x3D; (YYYY-MM-DD), retention ?segment&#x3D;, funnels ?funnel&#x3D;, economy ?currency&#x3D;.
[**getWorldExperienceBan**](WorldsApi.md#getWorldExperienceBan) | **GET** /v1/worlds/experiences/{experienceId}/bans/{sub} | The live ban on one player, or 404.
[**getWorldExperienceChatSetting**](WorldsApi.md#getWorldExperienceChatSetting) | **GET** /v1/worlds/experiences/{experienceId}/chat-settings | The game&#39;s text chat setting and filter level.
[**getWorldExperienceConfig**](WorldsApi.md#getWorldExperienceConfig) | **GET** /v1/worlds/experiences/{experienceId}/configs | The remote config document ({ values, rules }) and its version.
[**getWorldExperienceExperiment**](WorldsApi.md#getWorldExperienceExperiment) | **GET** /v1/worlds/experiences/{experienceId}/experiments/{experimentId} | Results per variant: n, mean, lift, fixed and always-valid 95% intervals, the verdict and a sample-size estimate.
[**getWorldExperienceMaturity**](WorldsApi.md#getWorldExperienceMaturity) | **GET** /v1/worlds/experiences/{experienceId}/maturity | The content maturity questionnaire: questions, answers, the published rating and any rating waiting for the next publish.
[**getWorldExperienceModeration**](WorldsApi.md#getWorldExperienceModeration) | **GET** /v1/worlds/experiences/{experienceId}/moderation | Moderation status of your experience: holds (unlisted / taken down), the latest review, the automated scan, strikes, trusted-lane status, open reports and live bans.
[**getWorldExperienceModerationAppeal**](WorldsApi.md#getWorldExperienceModerationAppeal) | **GET** /v1/worlds/experiences/{experienceId}/moderation/appeals | What you can appeal on your game and every appeal of it: data.targets (Crossly&#39;s actions, a moderation hold, rejected versions, blocked assets; each with appealableUntil and its latest appeal) and data.appeals (newest first: kind, status open | upheld | overturned, reason, evidence, the reviewer&#39;s note).
[**getWorldExperiencePlaceDraft**](WorldsApi.md#getWorldExperiencePlaceDraft) | **GET** /v1/worlds/experiences/{experienceId}/places/{placeId}/draft | The Studio draft of a place ({ world, place }, revision). Falls back to the current version, or an empty place.
[**getWorldExperiencePublish**](WorldsApi.md#getWorldExperiencePublish) | **GET** /v1/worlds/experiences/{experienceId}/publishes/{requestId} | One publish with its review state and rollout.
[**getWorldExperienceShop**](WorldsApi.md#getWorldExperienceShop) | **GET** /v1/worlds/experiences/{experienceId}/shop | An open experience&#39;s way back to commerce: its creator&#39;s shop and how many live listings it has.
[**getWorldExperienceShowcase**](WorldsApi.md#getWorldExperienceShowcase) | **GET** /v1/worlds/experiences/{experienceId}/showcase | The listings the game&#39;s page showcases, and the owner&#39;s live Crossly listings that can be picked.
[**getWorldFriendPlaying**](WorldsApi.md#getWorldFriendPlaying) | **GET** /v1/worlds/friends/playing | Your friends (mutual follows) and where each is playing right now, with the link that joins them.
[**getWorldGameByGame**](WorldsApi.md#getWorldGameByGame) | **GET** /v1/worlds/games/{game} | A game&#39;s page, as the /games launcher shows it: the tile (players now, thumbs-up %, friends inside), description, tags, creator (Crossly for its own), rating with its content descriptors, visits, created and updated, release notes, gallery, what it sells (bought through Crossly checkout) and the Crossly World app link. :game is a Worlds experience id or any experience key.
[**getWorldGameMine**](WorldsApi.md#getWorldGameMine) | **GET** /v1/worlds/games/mine/{gameId} | A game&#39;s summary: status, timeline, the sub-pages you may open, health and next steps.
[**getWorldGameMineAssetsUsed**](WorldsApi.md#getWorldGameMineAssetsUsed) | **GET** /v1/worlds/games/mine/{gameId}/assets-used | Everything a game&#39;s published build ships (Assets used): models, sounds, images, scripts, Toolbox assets and other files, each with the places that ship it. A 3D world reads each place&#39;s current version; a Classic game its latest reviewed package version.
[**getWorldGameServer**](WorldsApi.md#getWorldGameServer) | **GET** /v1/worlds/games/{game}/servers | A Crossly Carnival game&#39;s public servers that are up: players, max, whether a stranger still fits, your friends on each (friends&#39; servers first, then the fullest with room); and the private servers you pay for. Join one with POST /v1/worlds/experiences/:id/join { serverId }.
[**getWorldLinkCardGame**](WorldsApi.md#getWorldLinkCardGame) | **GET** /v1/worlds/links/card-game/{game} | Where to play a card game: Crossly&#39;s own game, its Commons tables, and creator worlds that tag it.
[**getWorldLinkListing**](WorldsApi.md#getWorldLinkListing) | **GET** /v1/worlds/links/listing/{slug} | \&quot;Try it in Crossly Carnival\&quot;: open games whose live version shows this Crossly listing (its shop slug), then other games by the same seller. Links only: a sale is attributed to a game only through in-world touches its server reports.
[**getWorldLinkSeller**](WorldsApi.md#getWorldLinkSeller) | **GET** /v1/worlds/links/seller/{username} | \&quot;Games by this seller\&quot;: the seller&#39;s open games, best first.
[**getWorldMature**](WorldsApi.md#getWorldMature) | **GET** /v1/worlds/mature | Mature (17+) for this account: eligible or not, the steps still to take in order (birth month, ID check, opt-in; region, parental controls and safety holds are final), and the ID age check status.
[**getWorldMePref**](WorldsApi.md#getWorldMePref) | **GET** /v1/worlds/me/prefs | Your Crossly Carnival choices (whether games may see your Crossly wallet address).
[**getWorldParentalChildren**](WorldsApi.md#getWorldParentalChildren) | **GET** /v1/worlds/parental/children/{childId} | One linked account with ?days&#x3D; (1-90) of playtime per experience.
[**getWorldParentalMe**](WorldsApi.md#getWorldParentalMe) | **GET** /v1/worlds/parental/me | This account&#39;s parent link: none, pending (an invite is out) or active (the parent&#39;s name and the limits they set).
[**getWorldPlaza**](WorldsApi.md#getWorldPlaza) | **GET** /v1/worlds/plaza | The Carnival Plaza district: the twelve-portal ring (a sponsored portal can only take the last slot, labelled), the new &amp; rising row, the featured stage&#39;s editorial pick and four chart boards, with players now and friends inside.
[**getWorldPolicyMe**](WorldsApi.md#getWorldPolicyMe) | **GET** /v1/worlds/policy/me | What this account may do in experiences, by age and region: chat level, purchases, paid random items, trading, links, ads, contests, rating ceiling — with the reason for each \&quot;no\&quot;.
[**getWorldRatingQuestionnaire**](WorldsApi.md#getWorldRatingQuestionnaire) | **GET** /v1/worlds/rating/questionnaire | The content-rating questionnaire (IARC-aligned): every question and choice, the three ratings (Everyone, Teen 13+, Mature 17+), what is never allowed, and the regions where Mature is restricted.
[**getWorldSearch**](WorldsApi.md#getWorldSearch) | **GET** /v1/worlds/search | Search experiences by title, creator, tags and genre (typo-tolerant, synonyms such as obby / obstacle). Filters: genre, rating (everyone keeps to Everyone), device, players (one server holds at least N), minThumbs (percent), live, friends. No results suggests a chart.
[**getWorldTransferRequest**](WorldsApi.md#getWorldTransferRequest) | **GET** /v1/worlds/transfer-requests/{requestId} | One ownership transfer request (only its two people can read it), with the actions you may take.
[**getWorldTransparency**](WorldsApi.md#getWorldTransparency) | **GET** /v1/worlds/transparency/{month} | One month&#39;s transparency report (YYYY-MM): reports by reason and source, decisions and median time to decide, actions by kind and issuer, appeals and overturn rate, publish reviews, second reviews of creator bans.
[**listWorldAppeals**](WorldsApi.md#listWorldAppeals) | **GET** /v1/worlds/appeals | Your appeals and their decisions.
[**listWorldExperienceAlerts**](WorldsApi.md#listWorldExperienceAlerts) | **GET** /v1/worlds/experiences/{experienceId}/alerts | Alerts that fired, newest first.
[**listWorldExperienceAudit**](WorldsApi.md#listWorldExperienceAudit) | **GET** /v1/worlds/experiences/{experienceId}/audit | The live-ops audit log: every config, experiment, event and alert change, who made it, when.
[**listWorldExperienceBans**](WorldsApi.md#listWorldExperienceBans) | **GET** /v1/worlds/experiences/{experienceId}/bans | Players banned from your experience (by pairwise sub), oldest first (cursor).
[**listWorldExperienceConfigVersions**](WorldsApi.md#listWorldExperienceConfigVersions) | **GET** /v1/worlds/experiences/{experienceId}/configs/versions | Config history, newest first: who changed which keys, when.
[**listWorldExperienceEvents**](WorldsApi.md#listWorldExperienceEvents) | **GET** /v1/worlds/experiences/{experienceId}/events | Scheduled and live events (?includeEnded&#x3D;true for history).
[**listWorldExperienceExperiments**](WorldsApi.md#listWorldExperienceExperiments) | **GET** /v1/worlds/experiences/{experienceId}/experiments | A/B experiments, newest first, with their live verdict.
[**listWorldExperienceModerationReports**](WorldsApi.md#listWorldExperienceModerationReports) | **GET** /v1/worlds/experiences/{experienceId}/moderation/reports | Reports about your experience, newest first (cursor). Reporter identity, account ids and other players&#39; words are removed.
[**listWorldExperiencePlacePublishes**](WorldsApi.md#listWorldExperiencePlacePublishes) | **GET** /v1/worlds/experiences/{experienceId}/places/{placeId}/publishes | Publishes of a place, newest first: state, checks, rating, access, review, rollout.
[**listWorldExperiencePlaceVersions**](WorldsApi.md#listWorldExperiencePlaceVersions) | **GET** /v1/worlds/experiences/{experienceId}/places/{placeId}/versions | Version history of a place, newest first; &#x60;current&#x60; marks the live one.
[**listWorldExperiencePlaces**](WorldsApi.md#listWorldExperiencePlaces) | **GET** /v1/worlds/experiences/{experienceId}/places | The places of an experience, start place first.
[**listWorldExperiencePlaytesters**](WorldsApi.md#listWorldExperiencePlaytesters) | **GET** /v1/worlds/experiences/{experienceId}/playtesters | People who may join while the game is private.
[**listWorldExperienceServers**](WorldsApi.md#listWorldExperienceServers) | **GET** /v1/worlds/experiences/{experienceId}/servers | Live servers: place, version, region, players, health.
[**listWorldExperiences**](WorldsApi.md#listWorldExperiences) | **GET** /v1/worlds/experiences | Your experiences, newest first; cursor-paged (?cursor&#x3D;&amp;limit&#x3D;).
[**listWorldFavorites**](WorldsApi.md#listWorldFavorites) | **GET** /v1/worlds/favorites | Your favourite experiences that are still open, newest first.
[**listWorldGameMine**](WorldsApi.md#listWorldGameMine) | **GET** /v1/worlds/games/mine | Every game you own or collaborate on, 3D worlds and Classic, filtered (?q&amp;status&amp;engine&amp;genre&amp;template&amp;owner&amp;flag&amp;sort; sort&#x3D;revenue &#x3D; highest earning first). Each row carries revenueCents: your creator-ledger earnings from it in USD cents (null for Classic).
[**listWorldParentalChildren**](WorldsApi.md#listWorldParentalChildren) | **GET** /v1/worlds/parental/children | Accounts you are the linked parent of: limits (max rating, chat, monthly spend), spend this month, and the last 7 days of playtime per experience.
[**listWorldRecent**](WorldsApi.md#listWorldRecent) | **GET** /v1/worlds/recent | Continue playing: what you played in the last 90 days that is still open, newest first (from what the servers recorded).
[**listWorldRegions**](WorldsApi.md#listWorldRegions) | **GET** /v1/worlds/regions | Live server regions with a probe URL each: GET it a few times, send the round trips as &#x60;pings&#x60; with the join to land in the nearest region.
[**listWorldShopListings**](WorldsApi.md#listWorldShopListings) | **GET** /v1/worlds/shop-listings | Your live Crossly listings a game can show and sell (shop objects bind to their id).
[**listWorldTransferRequests**](WorldsApi.md#listWorldTransferRequests) | **GET** /v1/worlds/transfer-requests | Ownership transfer requests you were asked (incoming) or sent (outgoing), newest first (?direction&amp;status&amp;experienceId).
[**listWorldTransparency**](WorldsApi.md#listWorldTransparency) | **GET** /v1/worlds/transparency | Published monthly transparency reports, newest first: reports received and actions taken, by type (counts only).
[**updateWorldExperience**](WorldsApi.md#updateWorldExperience) | **PATCH** /v1/worlds/experiences/{experienceId} | Edit name, description, genre, rating or icon.
[**updateWorldExperienceAccessLimit**](WorldsApi.md#updateWorldExperienceAccessLimit) | **PUT** /v1/worlds/experiences/{experienceId}/access-limits | Limit who can play: { crewOnly } (only members of the owner&#39;s crew), { countryMode: all|allow|block, countries: [&#39;US&#39;, ...] }. The owner and team are never limited.
[**updateWorldExperienceAlertSetting**](WorldsApi.md#updateWorldExperienceAlertSetting) | **PUT** /v1/worlds/experiences/{experienceId}/alerts/settings | Change alert rules and quiet hours.
[**updateWorldExperienceChatSetting**](WorldsApi.md#updateWorldExperienceChatSetting) | **PUT** /v1/worlds/experiences/{experienceId}/chat-settings | Turn text chat off or use the strict filter for everyone (never looser than the platform).
[**updateWorldExperienceConfig**](WorldsApi.md#updateWorldExperienceConfig) | **PUT** /v1/worlds/experiences/{experienceId}/configs | Save the whole config document. Running servers get it within seconds (ConfigService.Changed). baseVersion guards against overwriting a newer save (409).
[**updateWorldExperienceConfigValue**](WorldsApi.md#updateWorldExperienceConfigValue) | **PATCH** /v1/worlds/experiences/{experienceId}/configs/values | Set and/or remove individual config keys.
[**updateWorldExperienceEvent**](WorldsApi.md#updateWorldExperienceEvent) | **PATCH** /v1/worlds/experiences/{experienceId}/events/{eventId} | Reschedule or change a scheduled event; a live event may only move its end.
[**updateWorldExperienceExperiment**](WorldsApi.md#updateWorldExperienceExperiment) | **PATCH** /v1/worlds/experiences/{experienceId}/experiments/{experimentId} | Edit a draft (a running experiment may only rename or reword).
[**updateWorldExperienceMaturity**](WorldsApi.md#updateWorldExperienceMaturity) | **PUT** /v1/worlds/experiences/{experienceId}/maturity | Answer the questionnaire: { answers }. A stricter rating applies now; a looser or first Mature rating waits for the next reviewed publish (takesEffect).
[**updateWorldExperiencePlace**](WorldsApi.md#updateWorldExperiencePlace) | **PATCH** /v1/worlds/experiences/{experienceId}/places/{placeId} | Place settings: name, max players (1-50), fill target, social slots, empty shutdown.
[**updateWorldExperiencePlaceDraft**](WorldsApi.md#updateWorldExperiencePlaceDraft) | **PUT** /v1/worlds/experiences/{experienceId}/places/{placeId}/draft | Save the draft. baseRevision is the revision you loaded (0 for none); a newer save elsewhere answers 409 draft_conflict.
[**updateWorldExperiencePlaceVersionNote**](WorldsApi.md#updateWorldExperiencePlaceVersionNote) | **PUT** /v1/worlds/experiences/{experienceId}/places/{placeId}/versions/{versionId}/notes | Edit a release version&#39;s changelog (the game page&#39;s What&#39;s new): { notes } up to 2000 characters.
[**updateWorldExperiencePublish**](WorldsApi.md#updateWorldExperiencePublish) | **PATCH** /v1/worlds/experiences/{experienceId}/publishes/{requestId} | Steps 2–5: details, rating questionnaire answers, access (private | friends | unlisted | public), money review acknowledgement.
[**updateWorldExperienceShowcase**](WorldsApi.md#updateWorldExperienceShowcase) | **PUT** /v1/worlds/experiences/{experienceId}/showcase | Set the showcased listings: { listingIds } (Crossly shop slugs of the owner&#39;s live listings, max 12, in order).
[**updateWorldFavorite**](WorldsApi.md#updateWorldFavorite) | **PUT** /v1/worlds/favorites | Favourite or un-favourite an experience (idempotent).
[**updateWorldMature**](WorldsApi.md#updateWorldMature) | **PUT** /v1/worlds/mature | Switch \&quot;Show Mature experiences\&quot; on or off: { showMature }. On is refused while a final step blocks (too young, region, parental controls, safety hold); it never skips the ID check.
[**updateWorldMePref**](WorldsApi.md#updateWorldMePref) | **PUT** /v1/worlds/me/prefs | Set your Crossly Carnival choices.
[**updateWorldParentalChildren**](WorldsApi.md#updateWorldParentalChildren) | **PATCH** /v1/worlds/parental/children/{childId} | Change a linked account&#39;s limits with your PIN: { pin, settings: { maxRating: everyone|teen, chat: on|friends|off, monthlySpendLimitCents (0 &#x3D; no purchases, null &#x3D; no limit) } }. Enforced server-side at join, chat, the purchase prompt and checkout.
[**updateWorldVote**](WorldsApi.md#updateWorldVote) | **PUT** /v1/worlds/votes | Thumbs up, down, or null to withdraw: one vote per player per experience, counted only after 10 minutes of play (403 vote_needs_playtime before). A light ranking signal.


<a name="createWorldExperience"></a>
# **createWorldExperience**
> CreateWorldExperienceResponse createWorldExperience()

Create an experience with a start place (no version yet). Counts against the plan&#39;s experience limit.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    try {
      CreateWorldExperienceResponse result = apiInstance.createWorldExperience();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldExperience");
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

**CreateWorldExperienceResponse**

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

<a name="createWorldExperienceAccess"></a>
# **createWorldExperienceAccess**
> WorldExperienceResponse createWorldExperienceAccess(experienceId)

Who can play: private, friends, unlisted or public (public/unlisted need a reviewed publish).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      WorldExperienceResponse result = apiInstance.createWorldExperienceAccess(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldExperienceAccess");
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
 **experienceId** | **String**|  |

### Return type

**WorldExperienceResponse**

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

<a name="createWorldExperienceAlertAck"></a>
# **createWorldExperienceAlertAck**
> CreateWorldExperienceAlertAckResponse createWorldExperienceAlertAck(experienceId, alertId)

Acknowledge an alert.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String alertId = "alertId_example"; // String | 
    try {
      CreateWorldExperienceAlertAckResponse result = apiInstance.createWorldExperienceAlertAck(experienceId, alertId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldExperienceAlertAck");
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
 **experienceId** | **String**|  |
 **alertId** | **String**|  |

### Return type

**CreateWorldExperienceAlertAckResponse**

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

<a name="createWorldExperienceAnalyticQuery"></a>
# **createWorldExperienceAnalyticQuery**
> CreateWorldExperienceAnalyticQueryResponse createWorldExperienceAnalyticQuery(experienceId)

Query one custom event over ≤ 31 days: count, sum, avg or players, by day or hour, optionally grouped by a field. Groups under 50 players are suppressed.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      CreateWorldExperienceAnalyticQueryResponse result = apiInstance.createWorldExperienceAnalyticQuery(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldExperienceAnalyticQuery");
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
 **experienceId** | **String**|  |

### Return type

**CreateWorldExperienceAnalyticQueryResponse**

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

<a name="createWorldExperienceArchive"></a>
# **createWorldExperienceArchive**
> WorldExperienceResponse createWorldExperienceArchive(experienceId)

Archive: closes it, drains its servers, frees its plan slot; data is kept.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      WorldExperienceResponse result = apiInstance.createWorldExperienceArchive(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldExperienceArchive");
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
 **experienceId** | **String**|  |

### Return type

**WorldExperienceResponse**

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

<a name="createWorldExperienceBan"></a>
# **createWorldExperienceBan**
> GetWorldExperienceBanResponse createWorldExperienceBan(experienceId)

Ban a player from your experience: { sub, duration (seconds, null &#x3D; permanent), reason, displayReason?, applyToAlts? }. Enforced at join and on every running server.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      GetWorldExperienceBanResponse result = apiInstance.createWorldExperienceBan(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldExperienceBan");
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
 **experienceId** | **String**|  |

### Return type

**GetWorldExperienceBanResponse**

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

<a name="createWorldExperienceClose"></a>
# **createWorldExperienceClose**
> WorldExperienceResponse createWorldExperienceClose(experienceId)

Make the experience private again (owner-only joins).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      WorldExperienceResponse result = apiInstance.createWorldExperienceClose(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldExperienceClose");
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
 **experienceId** | **String**|  |

### Return type

**WorldExperienceResponse**

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

<a name="createWorldExperienceConfigRollback"></a>
# **createWorldExperienceConfigRollback**
> WorldExperienceConfigResponse createWorldExperienceConfigRollback(experienceId)

Instant rollback: an earlier version becomes the newest one.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      WorldExperienceConfigResponse result = apiInstance.createWorldExperienceConfigRollback(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldExperienceConfigRollback");
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
 **experienceId** | **String**|  |

### Return type

**WorldExperienceConfigResponse**

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

<a name="createWorldExperienceEvent"></a>
# **createWorldExperienceEvent**
> WorldExperienceEventResponse createWorldExperienceEvent(experienceId)

Schedule a live event: start and end, config values while live, an optional Messaging topic the platform publishes to at start and end.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      WorldExperienceEventResponse result = apiInstance.createWorldExperienceEvent(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldExperienceEvent");
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
 **experienceId** | **String**|  |

### Return type

**WorldExperienceEventResponse**

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

<a name="createWorldExperienceEventCancel"></a>
# **createWorldExperienceEventCancel**
> WorldExperienceEventResponse createWorldExperienceEventCancel(experienceId, eventId)

Cancel a scheduled event, or end a live one now.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String eventId = "eventId_example"; // String | 
    try {
      WorldExperienceEventResponse result = apiInstance.createWorldExperienceEventCancel(experienceId, eventId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldExperienceEventCancel");
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
 **experienceId** | **String**|  |
 **eventId** | **String**|  |

### Return type

**WorldExperienceEventResponse**

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

<a name="createWorldExperienceExperiment"></a>
# **createWorldExperienceExperiment**
> WorldExperienceExperimentResponse createWorldExperienceExperiment(experienceId)

Create a draft experiment: 2–5 variants of config values with traffic weights (+ holdout &#x3D; 100), targeting, a primary metric and guardrails, minimum 7 days.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      WorldExperienceExperimentResponse result = apiInstance.createWorldExperienceExperiment(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldExperienceExperiment");
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
 **experienceId** | **String**|  |

### Return type

**WorldExperienceExperimentResponse**

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

<a name="createWorldExperienceExperimentShip"></a>
# **createWorldExperienceExperimentShip**
> WorldExperienceExperimentResponse createWorldExperienceExperimentShip(experienceId, experimentId)

Ship a variant: its values become the base config for everyone and the experiment ends.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String experimentId = "experimentId_example"; // String | 
    try {
      WorldExperienceExperimentResponse result = apiInstance.createWorldExperienceExperimentShip(experienceId, experimentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldExperienceExperimentShip");
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
 **experienceId** | **String**|  |
 **experimentId** | **String**|  |

### Return type

**WorldExperienceExperimentResponse**

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

<a name="createWorldExperienceExperimentStart"></a>
# **createWorldExperienceExperimentStart**
> WorldExperienceExperimentResponse createWorldExperienceExperimentStart(experienceId, experimentId)

Start: running servers begin assigning players by their per-experience id.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String experimentId = "experimentId_example"; // String | 
    try {
      WorldExperienceExperimentResponse result = apiInstance.createWorldExperienceExperimentStart(experienceId, experimentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldExperienceExperimentStart");
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
 **experienceId** | **String**|  |
 **experimentId** | **String**|  |

### Return type

**WorldExperienceExperimentResponse**

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

<a name="createWorldExperienceExperimentStop"></a>
# **createWorldExperienceExperimentStop**
> WorldExperienceExperimentResponse createWorldExperienceExperimentStop(experienceId, experimentId)

Stop: every player sees the base config again.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String experimentId = "experimentId_example"; // String | 
    try {
      WorldExperienceExperimentResponse result = apiInstance.createWorldExperienceExperimentStop(experienceId, experimentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldExperienceExperimentStop");
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
 **experienceId** | **String**|  |
 **experimentId** | **String**|  |

### Return type

**WorldExperienceExperimentResponse**

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

<a name="createWorldExperienceJoin"></a>
# **createWorldExperienceJoin**
> CreateWorldExperienceJoinResponse createWorldExperienceJoin(experienceId)

Join as the token&#39;s owner: a server and a 60-second single-use ticket for wss …/v1/realtime/worlds/{serverId}. 202 while a new server boots.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      CreateWorldExperienceJoinResponse result = apiInstance.createWorldExperienceJoin(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldExperienceJoin");
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
 **experienceId** | **String**|  |

### Return type

**CreateWorldExperienceJoinResponse**

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

<a name="createWorldExperienceModerationAppeal"></a>
# **createWorldExperienceModerationAppeal**
> CreateWorldExperienceModerationAppealResponse createWorldExperienceModerationAppeal(experienceId)

Appeal a moderation decision on your game within 6 months (183 days): { kind: action | game | version | asset, targetId (from GET …/moderation/appeals targets), reason (20-4000 characters), evidence?: up to 5 https links }. The older shape { actionId, statement } still appeals an action. One open appeal per decision; a different reviewer answers and you are notified.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      CreateWorldExperienceModerationAppealResponse result = apiInstance.createWorldExperienceModerationAppeal(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldExperienceModerationAppeal");
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
 **experienceId** | **String**|  |

### Return type

**CreateWorldExperienceModerationAppealResponse**

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

<a name="createWorldExperienceOpen"></a>
# **createWorldExperienceOpen**
> WorldExperienceResponse createWorldExperienceOpen(experienceId)

Open the experience to players (needs a published start place).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      WorldExperienceResponse result = apiInstance.createWorldExperienceOpen(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldExperienceOpen");
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
 **experienceId** | **String**|  |

### Return type

**WorldExperienceResponse**

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

<a name="createWorldExperiencePlace"></a>
# **createWorldExperiencePlace**
> WorldExperiencePlaceResponse createWorldExperiencePlace(experienceId)

Add a place (at most 10 per experience in P1).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      WorldExperiencePlaceResponse result = apiInstance.createWorldExperiencePlace(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldExperiencePlace");
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
 **experienceId** | **String**|  |

### Return type

**WorldExperiencePlaceResponse**

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

<a name="createWorldExperiencePlaceCheck"></a>
# **createWorldExperiencePlaceCheck**
> CreateWorldExperiencePlaceCheckResponse createWorldExperiencePlaceCheck(experienceId, placeId)

Run the publish checks (script lint, budgets, shop-object listings) on a project. Writes nothing.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    try {
      CreateWorldExperiencePlaceCheckResponse result = apiInstance.createWorldExperiencePlaceCheck(experienceId, placeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldExperiencePlaceCheck");
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
 **experienceId** | **String**|  |
 **placeId** | **String**|  |

### Return type

**CreateWorldExperiencePlaceCheckResponse**

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

<a name="createWorldExperiencePlacePublish"></a>
# **createWorldExperiencePlacePublish**
> WorldExperienceResponse2 createWorldExperiencePlacePublish(experienceId, placeId)

Step 1: run checks and freeze a version (the saved draft, or an uploaded versionId). Blocking problems answer 400 with the list.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    try {
      WorldExperienceResponse2 result = apiInstance.createWorldExperiencePlacePublish(experienceId, placeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldExperiencePlacePublish");
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
 **experienceId** | **String**|  |
 **placeId** | **String**|  |

### Return type

**WorldExperienceResponse2**

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

<a name="createWorldExperiencePlaceStart"></a>
# **createWorldExperiencePlaceStart**
> WorldExperiencePlaceResponse createWorldExperiencePlaceStart(experienceId, placeId)

Make this the start place (where a plain join lands).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    try {
      WorldExperiencePlaceResponse result = apiInstance.createWorldExperiencePlaceStart(experienceId, placeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldExperiencePlaceStart");
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
 **experienceId** | **String**|  |
 **placeId** | **String**|  |

### Return type

**WorldExperiencePlaceResponse**

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

<a name="createWorldExperiencePlaceTest"></a>
# **createWorldExperiencePlaceTest**
> CreateWorldExperiencePlaceTestResponse createWorldExperiencePlaceTest(experienceId, placeId)

Cloud playtest: a private test version from the saved draft, joined on a fleet server (owner only, never live). 202 while it boots.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    try {
      CreateWorldExperiencePlaceTestResponse result = apiInstance.createWorldExperiencePlaceTest(experienceId, placeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldExperiencePlaceTest");
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
 **experienceId** | **String**|  |
 **placeId** | **String**|  |

### Return type

**CreateWorldExperiencePlaceTestResponse**

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

<a name="createWorldExperiencePlaceVersion"></a>
# **createWorldExperiencePlaceVersion**
> WorldExperiencePlaceVersionResponse createWorldExperiencePlaceVersion(experienceId, placeId)

Upload a version bundle (crossly-worlds-project/1). Not live until published.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    try {
      WorldExperiencePlaceVersionResponse result = apiInstance.createWorldExperiencePlaceVersion(experienceId, placeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldExperiencePlaceVersion");
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
 **experienceId** | **String**|  |
 **placeId** | **String**|  |

### Return type

**WorldExperiencePlaceVersionResponse**

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

<a name="createWorldExperiencePlaceVersionPublish"></a>
# **createWorldExperiencePlaceVersionPublish**
> WorldExperiencePlaceVersionResponse createWorldExperiencePlaceVersionPublish(experienceId, placeId, versionId)

Make a version current (publish or roll back). New joins land on it; older servers drain as they empty.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    String versionId = "versionId_example"; // String | 
    try {
      WorldExperiencePlaceVersionResponse result = apiInstance.createWorldExperiencePlaceVersionPublish(experienceId, placeId, versionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldExperiencePlaceVersionPublish");
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
 **experienceId** | **String**|  |
 **placeId** | **String**|  |
 **versionId** | **String**|  |

### Return type

**WorldExperiencePlaceVersionResponse**

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

<a name="createWorldExperiencePlaceVersionRollback"></a>
# **createWorldExperiencePlaceVersionRollback**
> WorldExperiencePlaceVersionResponse createWorldExperiencePlaceVersionRollback(experienceId, placeId, versionId)

Make an earlier reviewed version current again. Unreviewed versions go through …/publishes.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    String versionId = "versionId_example"; // String | 
    try {
      WorldExperiencePlaceVersionResponse result = apiInstance.createWorldExperiencePlaceVersionRollback(experienceId, placeId, versionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldExperiencePlaceVersionRollback");
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
 **experienceId** | **String**|  |
 **placeId** | **String**|  |
 **versionId** | **String**|  |

### Return type

**WorldExperiencePlaceVersionResponse**

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

<a name="createWorldExperiencePlaytester"></a>
# **createWorldExperiencePlaytester**
> CreateWorldExperiencePlaytesterResponse createWorldExperiencePlaytester(experienceId)

Add a playtester by Crossly handle (max 200 per game).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      CreateWorldExperiencePlaytesterResponse result = apiInstance.createWorldExperiencePlaytester(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldExperiencePlaytester");
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
 **experienceId** | **String**|  |

### Return type

**CreateWorldExperiencePlaytesterResponse**

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

<a name="createWorldExperiencePublishCancel"></a>
# **createWorldExperiencePublishCancel**
> WorldExperienceResponse2 createWorldExperiencePublishCancel(experienceId, requestId)

Give up a publish that is not live.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String requestId = "requestId_example"; // String | 
    try {
      WorldExperienceResponse2 result = apiInstance.createWorldExperiencePublishCancel(experienceId, requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldExperiencePublishCancel");
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
 **experienceId** | **String**|  |
 **requestId** | **String**|  |

### Return type

**WorldExperienceResponse2**

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

<a name="createWorldExperiencePublishHalt"></a>
# **createWorldExperiencePublishHalt**
> WorldExperienceResponse2 createWorldExperiencePublishHalt(experienceId, requestId)

Stop a rollout: new joins go back to the current version.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String requestId = "requestId_example"; // String | 
    try {
      WorldExperienceResponse2 result = apiInstance.createWorldExperiencePublishHalt(experienceId, requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldExperiencePublishHalt");
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
 **experienceId** | **String**|  |
 **requestId** | **String**|  |

### Return type

**WorldExperienceResponse2**

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

<a name="createWorldExperiencePublishRollout"></a>
# **createWorldExperiencePublishRollout**
> WorldExperienceResponse2 createWorldExperiencePublishRollout(experienceId, requestId)

Step 7: serve the approved version to percent (1–100) of new joins; 100 makes it current. Crash-heavy rollouts halt automatically.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String requestId = "requestId_example"; // String | 
    try {
      WorldExperienceResponse2 result = apiInstance.createWorldExperiencePublishRollout(experienceId, requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldExperiencePublishRollout");
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
 **experienceId** | **String**|  |
 **requestId** | **String**|  |

### Return type

**WorldExperienceResponse2**

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

<a name="createWorldExperiencePublishSubmit"></a>
# **createWorldExperiencePublishSubmit**
> WorldExperienceResponse2 createWorldExperiencePublishSubmit(experienceId, requestId)

Step 6: moderation. First publishes and script changes go to a person (24 h SLA); layout-only and private publishes are approved automatically.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String requestId = "requestId_example"; // String | 
    try {
      WorldExperienceResponse2 result = apiInstance.createWorldExperiencePublishSubmit(experienceId, requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldExperiencePublishSubmit");
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
 **experienceId** | **String**|  |
 **requestId** | **String**|  |

### Return type

**WorldExperienceResponse2**

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

<a name="createWorldExperienceReservedServer"></a>
# **createWorldExperienceReservedServer**
> CreateWorldExperienceReservedServerResponse createWorldExperienceReservedServer(experienceId)

An access code for a reserved server of a place (teleports, matches, tournaments). The code is shown once.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      CreateWorldExperienceReservedServerResponse result = apiInstance.createWorldExperienceReservedServer(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldExperienceReservedServer");
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
 **experienceId** | **String**|  |

### Return type

**CreateWorldExperienceReservedServerResponse**

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

<a name="createWorldExperienceRestore"></a>
# **createWorldExperienceRestore**
> WorldExperienceResponse createWorldExperienceRestore(experienceId)

Restore an archived game, or a deleted one within 30 days; it comes back private.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      WorldExperienceResponse result = apiInstance.createWorldExperienceRestore(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldExperienceRestore");
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
 **experienceId** | **String**|  |

### Return type

**WorldExperienceResponse**

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

<a name="createWorldExperienceServerShutdown"></a>
# **createWorldExperienceServerShutdown**
> CreateWorldExperienceServerShutdownResponse createWorldExperienceServerShutdown(experienceId)

Shut down servers: mode soft (default) teleports players to fresh servers of the current version first; hard stops now. scope all | outdated (only servers not on a served version).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      CreateWorldExperienceServerShutdownResponse result = apiInstance.createWorldExperienceServerShutdown(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldExperienceServerShutdown");
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
 **experienceId** | **String**|  |

### Return type

**CreateWorldExperienceServerShutdownResponse**

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

<a name="createWorldExperienceTransferRequest"></a>
# **createWorldExperienceTransferRequest**
> WorldResponse2 createWorldExperienceTransferRequest(experienceId)

Ask another Crossly account (handle or email) to take over a 3D game you own. One waiting request per game; it expires after 14 days.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      WorldResponse2 result = apiInstance.createWorldExperienceTransferRequest(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldExperienceTransferRequest");
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
 **experienceId** | **String**|  |

### Return type

**WorldResponse2**

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

<a name="createWorldMatureVerify"></a>
# **createWorldMatureVerify**
> CreateWorldMatureVerifyResponse createWorldMatureVerify()

Start the ID check Mature needs (Stripe Identity: photo ID + selfie; the date of birth is read off the ID). Returns a hosted URL and client secret, or alreadyVerified.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    try {
      CreateWorldMatureVerifyResponse result = apiInstance.createWorldMatureVerify();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldMatureVerify");
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

**CreateWorldMatureVerifyResponse**

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

<a name="createWorldParentalAccept"></a>
# **createWorldParentalAccept**
> WorldParentalResponse createWorldParentalAccept()

Accept a child&#39;s invite as the parent: { code, pin }. The parent must be an ID-verified adult (18+ by the date of birth on the ID). The PIN protects every later change.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    try {
      WorldParentalResponse result = apiInstance.createWorldParentalAccept();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldParentalAccept");
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

**WorldParentalResponse**

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

<a name="createWorldParentalChildrenPin"></a>
# **createWorldParentalChildrenPin**
> CreateWorldParentalChildrenPinResponse createWorldParentalChildrenPin(childId)

Change the parent PIN: { pin, newPin } (4-8 digits). Five wrong PINs lock changes for 15 minutes.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String childId = "childId_example"; // String | 
    try {
      CreateWorldParentalChildrenPinResponse result = apiInstance.createWorldParentalChildrenPin(childId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldParentalChildrenPin");
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
 **childId** | **String**|  |

### Return type

**CreateWorldParentalChildrenPinResponse**

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

<a name="createWorldParentalChildrenUnlink"></a>
# **createWorldParentalChildrenUnlink**
> CreateWorldParentalChildrenUnlinkResponse createWorldParentalChildrenUnlink(childId)

Remove the parent link (and its limits) with your PIN: { pin }.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String childId = "childId_example"; // String | 
    try {
      CreateWorldParentalChildrenUnlinkResponse result = apiInstance.createWorldParentalChildrenUnlink(childId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldParentalChildrenUnlink");
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
 **childId** | **String**|  |

### Return type

**CreateWorldParentalChildrenUnlinkResponse**

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

<a name="createWorldParentalInvite"></a>
# **createWorldParentalInvite**
> CreateWorldParentalInviteResponse createWorldParentalInvite()

An under-18 account asks for a parent: a one-time code (72 hours) the parent enters while signed in to their own account. Replaces any pending code.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    try {
      CreateWorldParentalInviteResponse result = apiInstance.createWorldParentalInvite();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldParentalInvite");
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

**CreateWorldParentalInviteResponse**

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

<a name="createWorldRatingCompute"></a>
# **createWorldRatingCompute**
> CreateWorldRatingComputeResponse createWorldRatingCompute()

Rate a set of questionnaire answers exactly as publishing does: { answers } → rating (null when refused), reasons, content descriptors, interactive notices and refusals.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    try {
      CreateWorldRatingComputeResponse result = apiInstance.createWorldRatingCompute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldRatingCompute");
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

**CreateWorldRatingComputeResponse**

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

<a name="createWorldReport"></a>
# **createWorldReport**
> CreateWorldReportResponse createWorldReport()

Report a player (targetSub), the experience, an object (targetInstanceId) or a chat line (chatLineId). Crossly attaches the server, place version and its own chat log; you send ids only.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    try {
      CreateWorldReportResponse result = apiInstance.createWorldReport();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldReport");
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

**CreateWorldReportResponse**

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

<a name="createWorldTransferRequestAccept"></a>
# **createWorldTransferRequestAccept**
> WorldResponse2 createWorldTransferRequestAccept(requestId)

Accept a transfer asked of you: the game becomes yours now. Earnings already credited stay with the previous owner; new sales pay you.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String requestId = "requestId_example"; // String | 
    try {
      WorldResponse2 result = apiInstance.createWorldTransferRequestAccept(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldTransferRequestAccept");
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
 **requestId** | **String**|  |

### Return type

**WorldResponse2**

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

<a name="createWorldTransferRequestCancel"></a>
# **createWorldTransferRequestCancel**
> WorldResponse2 createWorldTransferRequestCancel(requestId)

Cancel a transfer request you sent while it waits.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String requestId = "requestId_example"; // String | 
    try {
      WorldResponse2 result = apiInstance.createWorldTransferRequestCancel(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldTransferRequestCancel");
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
 **requestId** | **String**|  |

### Return type

**WorldResponse2**

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

<a name="createWorldTransferRequestDecline"></a>
# **createWorldTransferRequestDecline**
> WorldResponse2 createWorldTransferRequestDecline(requestId)

Decline a transfer asked of you; nothing changes.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String requestId = "requestId_example"; // String | 
    try {
      WorldResponse2 result = apiInstance.createWorldTransferRequestDecline(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#createWorldTransferRequestDecline");
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
 **requestId** | **String**|  |

### Return type

**WorldResponse2**

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

<a name="deleteWorldExperience"></a>
# **deleteWorldExperience**
> DeleteWorldExperienceResponse deleteWorldExperience(experienceId)

Delete a game (a tombstone, restorable for 30 days). Body { confirmName } &#x3D; the game&#39;s name.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      DeleteWorldExperienceResponse result = apiInstance.deleteWorldExperience(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#deleteWorldExperience");
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
 **experienceId** | **String**|  |

### Return type

**DeleteWorldExperienceResponse**

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

<a name="deleteWorldExperienceBan"></a>
# **deleteWorldExperienceBan**
> DeleteWorldExperienceBanResponse deleteWorldExperienceBan(experienceId, sub)

Lift your experience&#39;s ban on a player. Bans placed by Crossly safety are lifted only by appeal.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String sub = "sub_example"; // String | 
    try {
      DeleteWorldExperienceBanResponse result = apiInstance.deleteWorldExperienceBan(experienceId, sub);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#deleteWorldExperienceBan");
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
 **experienceId** | **String**|  |
 **sub** | **String**|  |

### Return type

**DeleteWorldExperienceBanResponse**

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

<a name="deleteWorldExperiencePlaytester"></a>
# **deleteWorldExperiencePlaytester**
> DeleteSpatialSceneGrantResponse deleteWorldExperiencePlaytester(experienceId, userId)

Remove a playtester.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String userId = "userId_example"; // String | 
    try {
      DeleteSpatialSceneGrantResponse result = apiInstance.deleteWorldExperiencePlaytester(experienceId, userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#deleteWorldExperiencePlaytester");
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
 **experienceId** | **String**|  |
 **userId** | **String**|  |

### Return type

**DeleteSpatialSceneGrantResponse**

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

<a name="deleteWorldParentalInvite"></a>
# **deleteWorldParentalInvite**
> DeleteDaoProposalResponse deleteWorldParentalInvite()

Withdraw a pending parent invite.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    try {
      DeleteDaoProposalResponse result = apiInstance.deleteWorldParentalInvite();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#deleteWorldParentalInvite");
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

**DeleteDaoProposalResponse**

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

<a name="getWorldChart"></a>
# **getWorldChart**
> GetWorldChartResponse getWorldChart(chart)

A chart: top-playing (players now), trending (this week vs last, retention-weighted), top-rated (Wilson lower bound of thumbs up, 10+ votes), new-rising, friends, most-favorited; ?genre&#x3D; cuts it to one genre. Organic only: nothing paid.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String chart = "chart_example"; // String | 
    try {
      GetWorldChartResponse result = apiInstance.getWorldChart(chart);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldChart");
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
 **chart** | **String**|  |

### Return type

**GetWorldChartResponse**

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

<a name="getWorldDiscoverExperience"></a>
# **getWorldDiscoverExperience**
> WorldResponse3 getWorldDiscoverExperience(key)

An experience&#39;s thumbs up/down, favourites, your vote and favourite, and whether you have played enough to vote (10 minutes). key: worlds:&lt;id&gt;, classic:&lt;id&gt;, tcg:&lt;game&gt;, cards:&lt;game&gt;.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String key = "key_example"; // String | 
    try {
      WorldResponse3 result = apiInstance.getWorldDiscoverExperience(key);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldDiscoverExperience");
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
 **key** | **String**|  |

### Return type

**WorldResponse3**

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

<a name="getWorldDiscoverRow"></a>
# **getWorldDiscoverRow**
> GetWorldDiscoverRowResponse getWorldDiscoverRow()

The Play hub&#39;s rows for you: Continue playing, Friends are playing, Recommended for you, Featured (editorial, first-party capped), Top Playing, Trending, New &amp; Rising, Top Rated, Made in Carnival Studio, Shop the world, card games, Classic games and genre rows. At most one tile is paid, always labelled \&quot;Sponsored\&quot;, never in the first two rows or a row&#39;s first two places.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    try {
      GetWorldDiscoverRowResponse result = apiInstance.getWorldDiscoverRow();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldDiscoverRow");
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

**GetWorldDiscoverRowResponse**

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

<a name="getWorldExperience"></a>
# **getWorldExperience**
> GetWorldExperienceResponse getWorldExperience(experienceId)

One of your experiences with its places, live CCU and server count.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      GetWorldExperienceResponse result = apiInstance.getWorldExperience(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldExperience");
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
 **experienceId** | **String**|  |

### Return type

**GetWorldExperienceResponse**

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

<a name="getWorldExperienceAccessLimit"></a>
# **getWorldExperienceAccessLimit**
> GetWorldExperienceAccessLimitResponse getWorldExperienceAccessLimit(experienceId)

The game&#39;s crew-only and country limits, and the owner&#39;s crew.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      GetWorldExperienceAccessLimitResponse result = apiInstance.getWorldExperienceAccessLimit(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldExperienceAccessLimit");
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
 **experienceId** | **String**|  |

### Return type

**GetWorldExperienceAccessLimitResponse**

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

<a name="getWorldExperienceAlertSetting"></a>
# **getWorldExperienceAlertSetting**
> GetWorldExperienceAlertSettingResponse getWorldExperienceAlertSetting(experienceId)

Alert rules (threshold, on/off, inbox, webhook) and quiet hours.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      GetWorldExperienceAlertSettingResponse result = apiInstance.getWorldExperienceAlertSetting(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldExperienceAlertSetting");
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
 **experienceId** | **String**|  |

### Return type

**GetWorldExperienceAlertSettingResponse**

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

<a name="getWorldExperienceAnalytic"></a>
# **getWorldExperienceAnalytic**
> GetWorldExperienceAnalyticResponse getWorldExperienceAnalytic(experienceId, report)

An analytics report: overview, engagement, retention, monetization, funnels, economy, performance, custom or costs (fleet CPU-minutes, egress, estimated cost). ?from&#x3D;&amp;to&#x3D; (YYYY-MM-DD), retention ?segment&#x3D;, funnels ?funnel&#x3D;, economy ?currency&#x3D;.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String report = "report_example"; // String | 
    try {
      GetWorldExperienceAnalyticResponse result = apiInstance.getWorldExperienceAnalytic(experienceId, report);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldExperienceAnalytic");
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
 **experienceId** | **String**|  |
 **report** | **String**|  |

### Return type

**GetWorldExperienceAnalyticResponse**

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

<a name="getWorldExperienceBan"></a>
# **getWorldExperienceBan**
> GetWorldExperienceBanResponse getWorldExperienceBan(experienceId, sub)

The live ban on one player, or 404.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String sub = "sub_example"; // String | 
    try {
      GetWorldExperienceBanResponse result = apiInstance.getWorldExperienceBan(experienceId, sub);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldExperienceBan");
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
 **experienceId** | **String**|  |
 **sub** | **String**|  |

### Return type

**GetWorldExperienceBanResponse**

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

<a name="getWorldExperienceChatSetting"></a>
# **getWorldExperienceChatSetting**
> GetWorldExperienceChatSettingResponse getWorldExperienceChatSetting(experienceId)

The game&#39;s text chat setting and filter level.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      GetWorldExperienceChatSettingResponse result = apiInstance.getWorldExperienceChatSetting(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldExperienceChatSetting");
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
 **experienceId** | **String**|  |

### Return type

**GetWorldExperienceChatSettingResponse**

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

<a name="getWorldExperienceConfig"></a>
# **getWorldExperienceConfig**
> WorldExperienceConfigResponse getWorldExperienceConfig(experienceId)

The remote config document ({ values, rules }) and its version.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      WorldExperienceConfigResponse result = apiInstance.getWorldExperienceConfig(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldExperienceConfig");
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
 **experienceId** | **String**|  |

### Return type

**WorldExperienceConfigResponse**

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

<a name="getWorldExperienceExperiment"></a>
# **getWorldExperienceExperiment**
> GetWorldExperienceExperimentResponse getWorldExperienceExperiment(experienceId, experimentId)

Results per variant: n, mean, lift, fixed and always-valid 95% intervals, the verdict and a sample-size estimate.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String experimentId = "experimentId_example"; // String | 
    try {
      GetWorldExperienceExperimentResponse result = apiInstance.getWorldExperienceExperiment(experienceId, experimentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldExperienceExperiment");
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
 **experienceId** | **String**|  |
 **experimentId** | **String**|  |

### Return type

**GetWorldExperienceExperimentResponse**

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

<a name="getWorldExperienceMaturity"></a>
# **getWorldExperienceMaturity**
> GetWorldExperienceMaturityResponse getWorldExperienceMaturity(experienceId)

The content maturity questionnaire: questions, answers, the published rating and any rating waiting for the next publish.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      GetWorldExperienceMaturityResponse result = apiInstance.getWorldExperienceMaturity(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldExperienceMaturity");
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
 **experienceId** | **String**|  |

### Return type

**GetWorldExperienceMaturityResponse**

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

<a name="getWorldExperienceModeration"></a>
# **getWorldExperienceModeration**
> GetWorldExperienceModerationResponse getWorldExperienceModeration(experienceId)

Moderation status of your experience: holds (unlisted / taken down), the latest review, the automated scan, strikes, trusted-lane status, open reports and live bans.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      GetWorldExperienceModerationResponse result = apiInstance.getWorldExperienceModeration(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldExperienceModeration");
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
 **experienceId** | **String**|  |

### Return type

**GetWorldExperienceModerationResponse**

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

<a name="getWorldExperienceModerationAppeal"></a>
# **getWorldExperienceModerationAppeal**
> GetWorldExperienceModerationAppealResponse getWorldExperienceModerationAppeal(experienceId)

What you can appeal on your game and every appeal of it: data.targets (Crossly&#39;s actions, a moderation hold, rejected versions, blocked assets; each with appealableUntil and its latest appeal) and data.appeals (newest first: kind, status open | upheld | overturned, reason, evidence, the reviewer&#39;s note).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      GetWorldExperienceModerationAppealResponse result = apiInstance.getWorldExperienceModerationAppeal(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldExperienceModerationAppeal");
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
 **experienceId** | **String**|  |

### Return type

**GetWorldExperienceModerationAppealResponse**

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

<a name="getWorldExperiencePlaceDraft"></a>
# **getWorldExperiencePlaceDraft**
> GetWorldExperiencePlaceDraftResponse getWorldExperiencePlaceDraft(experienceId, placeId)

The Studio draft of a place ({ world, place }, revision). Falls back to the current version, or an empty place.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    try {
      GetWorldExperiencePlaceDraftResponse result = apiInstance.getWorldExperiencePlaceDraft(experienceId, placeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldExperiencePlaceDraft");
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
 **experienceId** | **String**|  |
 **placeId** | **String**|  |

### Return type

**GetWorldExperiencePlaceDraftResponse**

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

<a name="getWorldExperiencePublish"></a>
# **getWorldExperiencePublish**
> WorldExperienceResponse2 getWorldExperiencePublish(experienceId, requestId)

One publish with its review state and rollout.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String requestId = "requestId_example"; // String | 
    try {
      WorldExperienceResponse2 result = apiInstance.getWorldExperiencePublish(experienceId, requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldExperiencePublish");
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
 **experienceId** | **String**|  |
 **requestId** | **String**|  |

### Return type

**WorldExperienceResponse2**

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

<a name="getWorldExperienceShop"></a>
# **getWorldExperienceShop**
> GetWorldExperienceShopResponse getWorldExperienceShop(experienceId)

An open experience&#39;s way back to commerce: its creator&#39;s shop and how many live listings it has.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      GetWorldExperienceShopResponse result = apiInstance.getWorldExperienceShop(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldExperienceShop");
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
 **experienceId** | **String**|  |

### Return type

**GetWorldExperienceShopResponse**

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

<a name="getWorldExperienceShowcase"></a>
# **getWorldExperienceShowcase**
> GetWorldExperienceShowcaseResponse getWorldExperienceShowcase(experienceId)

The listings the game&#39;s page showcases, and the owner&#39;s live Crossly listings that can be picked.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      GetWorldExperienceShowcaseResponse result = apiInstance.getWorldExperienceShowcase(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldExperienceShowcase");
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
 **experienceId** | **String**|  |

### Return type

**GetWorldExperienceShowcaseResponse**

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

<a name="getWorldFriendPlaying"></a>
# **getWorldFriendPlaying**
> GetWorldFriendPlayingResponse getWorldFriendPlaying()

Your friends (mutual follows) and where each is playing right now, with the link that joins them.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    try {
      GetWorldFriendPlayingResponse result = apiInstance.getWorldFriendPlaying();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldFriendPlaying");
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

**GetWorldFriendPlayingResponse**

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

<a name="getWorldGameByGame"></a>
# **getWorldGameByGame**
> GetWorldGameByGameResponse getWorldGameByGame(game)

A game&#39;s page, as the /games launcher shows it: the tile (players now, thumbs-up %, friends inside), description, tags, creator (Crossly for its own), rating with its content descriptors, visits, created and updated, release notes, gallery, what it sells (bought through Crossly checkout) and the Crossly World app link. :game is a Worlds experience id or any experience key.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String game = "game_example"; // String | 
    try {
      GetWorldGameByGameResponse result = apiInstance.getWorldGameByGame(game);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldGameByGame");
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
 **game** | **String**|  |

### Return type

**GetWorldGameByGameResponse**

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

<a name="getWorldGameMine"></a>
# **getWorldGameMine**
> GetWorldGameMineResponse getWorldGameMine(gameId)

A game&#39;s summary: status, timeline, the sub-pages you may open, health and next steps.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String gameId = "gameId_example"; // String | 
    try {
      GetWorldGameMineResponse result = apiInstance.getWorldGameMine(gameId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldGameMine");
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
 **gameId** | **String**|  |

### Return type

**GetWorldGameMineResponse**

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

<a name="getWorldGameMineAssetsUsed"></a>
# **getWorldGameMineAssetsUsed**
> GetWorldGameMineAssetsUsedResponse getWorldGameMineAssetsUsed(gameId)

Everything a game&#39;s published build ships (Assets used): models, sounds, images, scripts, Toolbox assets and other files, each with the places that ship it. A 3D world reads each place&#39;s current version; a Classic game its latest reviewed package version.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String gameId = "gameId_example"; // String | 
    try {
      GetWorldGameMineAssetsUsedResponse result = apiInstance.getWorldGameMineAssetsUsed(gameId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldGameMineAssetsUsed");
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
 **gameId** | **String**|  |

### Return type

**GetWorldGameMineAssetsUsedResponse**

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

<a name="getWorldGameServer"></a>
# **getWorldGameServer**
> GetWorldGameServerResponse getWorldGameServer(game)

A Crossly Carnival game&#39;s public servers that are up: players, max, whether a stranger still fits, your friends on each (friends&#39; servers first, then the fullest with room); and the private servers you pay for. Join one with POST /v1/worlds/experiences/:id/join { serverId }.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String game = "game_example"; // String | 
    try {
      GetWorldGameServerResponse result = apiInstance.getWorldGameServer(game);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldGameServer");
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
 **game** | **String**|  |

### Return type

**GetWorldGameServerResponse**

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

<a name="getWorldLinkCardGame"></a>
# **getWorldLinkCardGame**
> WorldLinkResponse getWorldLinkCardGame(game)

Where to play a card game: Crossly&#39;s own game, its Commons tables, and creator worlds that tag it.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String game = "game_example"; // String | 
    try {
      WorldLinkResponse result = apiInstance.getWorldLinkCardGame(game);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldLinkCardGame");
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
 **game** | **String**|  |

### Return type

**WorldLinkResponse**

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

<a name="getWorldLinkListing"></a>
# **getWorldLinkListing**
> WorldLinkResponse getWorldLinkListing(slug)

\&quot;Try it in Crossly Carnival\&quot;: open games whose live version shows this Crossly listing (its shop slug), then other games by the same seller. Links only: a sale is attributed to a game only through in-world touches its server reports.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String slug = "slug_example"; // String | 
    try {
      WorldLinkResponse result = apiInstance.getWorldLinkListing(slug);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldLinkListing");
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

**WorldLinkResponse**

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

<a name="getWorldLinkSeller"></a>
# **getWorldLinkSeller**
> WorldLinkResponse getWorldLinkSeller(username)

\&quot;Games by this seller\&quot;: the seller&#39;s open games, best first.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String username = "username_example"; // String | 
    try {
      WorldLinkResponse result = apiInstance.getWorldLinkSeller(username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldLinkSeller");
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

**WorldLinkResponse**

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

<a name="getWorldMature"></a>
# **getWorldMature**
> GetWorldMatureResponse getWorldMature()

Mature (17+) for this account: eligible or not, the steps still to take in order (birth month, ID check, opt-in; region, parental controls and safety holds are final), and the ID age check status.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    try {
      GetWorldMatureResponse result = apiInstance.getWorldMature();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldMature");
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

**GetWorldMatureResponse**

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

<a name="getWorldMePref"></a>
# **getWorldMePref**
> GetWorldMePrefResponse getWorldMePref()

Your Crossly Carnival choices (whether games may see your Crossly wallet address).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    try {
      GetWorldMePrefResponse result = apiInstance.getWorldMePref();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldMePref");
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

**GetWorldMePrefResponse**

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

<a name="getWorldParentalChildren"></a>
# **getWorldParentalChildren**
> WorldParentalResponse getWorldParentalChildren(childId)

One linked account with ?days&#x3D; (1-90) of playtime per experience.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String childId = "childId_example"; // String | 
    try {
      WorldParentalResponse result = apiInstance.getWorldParentalChildren(childId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldParentalChildren");
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
 **childId** | **String**|  |

### Return type

**WorldParentalResponse**

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

<a name="getWorldParentalMe"></a>
# **getWorldParentalMe**
> GetWorldParentalMeResponse getWorldParentalMe()

This account&#39;s parent link: none, pending (an invite is out) or active (the parent&#39;s name and the limits they set).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    try {
      GetWorldParentalMeResponse result = apiInstance.getWorldParentalMe();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldParentalMe");
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

**GetWorldParentalMeResponse**

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

<a name="getWorldPlaza"></a>
# **getWorldPlaza**
> GetWorldPlazaResponse getWorldPlaza()

The Carnival Plaza district: the twelve-portal ring (a sponsored portal can only take the last slot, labelled), the new &amp; rising row, the featured stage&#39;s editorial pick and four chart boards, with players now and friends inside.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    try {
      GetWorldPlazaResponse result = apiInstance.getWorldPlaza();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldPlaza");
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

**GetWorldPlazaResponse**

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

<a name="getWorldPolicyMe"></a>
# **getWorldPolicyMe**
> GetWorldPolicyMeResponse getWorldPolicyMe()

What this account may do in experiences, by age and region: chat level, purchases, paid random items, trading, links, ads, contests, rating ceiling — with the reason for each \&quot;no\&quot;.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    try {
      GetWorldPolicyMeResponse result = apiInstance.getWorldPolicyMe();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldPolicyMe");
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

**GetWorldPolicyMeResponse**

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

<a name="getWorldRatingQuestionnaire"></a>
# **getWorldRatingQuestionnaire**
> GetWorldRatingQuestionnaireResponse getWorldRatingQuestionnaire()

The content-rating questionnaire (IARC-aligned): every question and choice, the three ratings (Everyone, Teen 13+, Mature 17+), what is never allowed, and the regions where Mature is restricted.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    try {
      GetWorldRatingQuestionnaireResponse result = apiInstance.getWorldRatingQuestionnaire();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldRatingQuestionnaire");
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

**GetWorldRatingQuestionnaireResponse**

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

<a name="getWorldSearch"></a>
# **getWorldSearch**
> GetWorldSearchResponse getWorldSearch()

Search experiences by title, creator, tags and genre (typo-tolerant, synonyms such as obby / obstacle). Filters: genre, rating (everyone keeps to Everyone), device, players (one server holds at least N), minThumbs (percent), live, friends. No results suggests a chart.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    try {
      GetWorldSearchResponse result = apiInstance.getWorldSearch();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldSearch");
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

**GetWorldSearchResponse**

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

<a name="getWorldTransferRequest"></a>
# **getWorldTransferRequest**
> WorldResponse2 getWorldTransferRequest(requestId)

One ownership transfer request (only its two people can read it), with the actions you may take.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String requestId = "requestId_example"; // String | 
    try {
      WorldResponse2 result = apiInstance.getWorldTransferRequest(requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldTransferRequest");
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
 **requestId** | **String**|  |

### Return type

**WorldResponse2**

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

<a name="getWorldTransparency"></a>
# **getWorldTransparency**
> GetWorldTransparencyResponse getWorldTransparency(month)

One month&#39;s transparency report (YYYY-MM): reports by reason and source, decisions and median time to decide, actions by kind and issuer, appeals and overturn rate, publish reviews, second reviews of creator bans.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String month = "month_example"; // String | 
    try {
      GetWorldTransparencyResponse result = apiInstance.getWorldTransparency(month);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#getWorldTransparency");
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
 **month** | **String**|  |

### Return type

**GetWorldTransparencyResponse**

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

<a name="listWorldAppeals"></a>
# **listWorldAppeals**
> ListWorldAppealsResponse listWorldAppeals()

Your appeals and their decisions.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    try {
      ListWorldAppealsResponse result = apiInstance.listWorldAppeals();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#listWorldAppeals");
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

**ListWorldAppealsResponse**

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

<a name="listWorldExperienceAlerts"></a>
# **listWorldExperienceAlerts**
> ListWorldExperienceAlertsResponse listWorldExperienceAlerts(experienceId)

Alerts that fired, newest first.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      ListWorldExperienceAlertsResponse result = apiInstance.listWorldExperienceAlerts(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#listWorldExperienceAlerts");
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
 **experienceId** | **String**|  |

### Return type

**ListWorldExperienceAlertsResponse**

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

<a name="listWorldExperienceAudit"></a>
# **listWorldExperienceAudit**
> ListWorldExperienceAuditResponse listWorldExperienceAudit(experienceId)

The live-ops audit log: every config, experiment, event and alert change, who made it, when.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      ListWorldExperienceAuditResponse result = apiInstance.listWorldExperienceAudit(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#listWorldExperienceAudit");
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
 **experienceId** | **String**|  |

### Return type

**ListWorldExperienceAuditResponse**

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

<a name="listWorldExperienceBans"></a>
# **listWorldExperienceBans**
> ListWorldExperienceBansResponse listWorldExperienceBans(experienceId)

Players banned from your experience (by pairwise sub), oldest first (cursor).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      ListWorldExperienceBansResponse result = apiInstance.listWorldExperienceBans(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#listWorldExperienceBans");
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
 **experienceId** | **String**|  |

### Return type

**ListWorldExperienceBansResponse**

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

<a name="listWorldExperienceConfigVersions"></a>
# **listWorldExperienceConfigVersions**
> ListWorldExperienceConfigVersionsResponse listWorldExperienceConfigVersions(experienceId)

Config history, newest first: who changed which keys, when.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      ListWorldExperienceConfigVersionsResponse result = apiInstance.listWorldExperienceConfigVersions(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#listWorldExperienceConfigVersions");
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
 **experienceId** | **String**|  |

### Return type

**ListWorldExperienceConfigVersionsResponse**

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

<a name="listWorldExperienceEvents"></a>
# **listWorldExperienceEvents**
> ListWorldExperienceEventsResponse listWorldExperienceEvents(experienceId)

Scheduled and live events (?includeEnded&#x3D;true for history).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      ListWorldExperienceEventsResponse result = apiInstance.listWorldExperienceEvents(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#listWorldExperienceEvents");
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
 **experienceId** | **String**|  |

### Return type

**ListWorldExperienceEventsResponse**

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

<a name="listWorldExperienceExperiments"></a>
# **listWorldExperienceExperiments**
> ListWorldExperienceExperimentsResponse listWorldExperienceExperiments(experienceId)

A/B experiments, newest first, with their live verdict.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      ListWorldExperienceExperimentsResponse result = apiInstance.listWorldExperienceExperiments(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#listWorldExperienceExperiments");
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
 **experienceId** | **String**|  |

### Return type

**ListWorldExperienceExperimentsResponse**

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

<a name="listWorldExperienceModerationReports"></a>
# **listWorldExperienceModerationReports**
> ListWorldExperienceModerationReportsResponse listWorldExperienceModerationReports(experienceId)

Reports about your experience, newest first (cursor). Reporter identity, account ids and other players&#39; words are removed.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      ListWorldExperienceModerationReportsResponse result = apiInstance.listWorldExperienceModerationReports(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#listWorldExperienceModerationReports");
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
 **experienceId** | **String**|  |

### Return type

**ListWorldExperienceModerationReportsResponse**

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

<a name="listWorldExperiencePlacePublishes"></a>
# **listWorldExperiencePlacePublishes**
> ListWorldExperiencePlacePublishesResponse listWorldExperiencePlacePublishes(experienceId, placeId)

Publishes of a place, newest first: state, checks, rating, access, review, rollout.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    try {
      ListWorldExperiencePlacePublishesResponse result = apiInstance.listWorldExperiencePlacePublishes(experienceId, placeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#listWorldExperiencePlacePublishes");
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
 **experienceId** | **String**|  |
 **placeId** | **String**|  |

### Return type

**ListWorldExperiencePlacePublishesResponse**

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

<a name="listWorldExperiencePlaceVersions"></a>
# **listWorldExperiencePlaceVersions**
> ListWorldExperiencePlaceVersionsResponse listWorldExperiencePlaceVersions(experienceId, placeId)

Version history of a place, newest first; &#x60;current&#x60; marks the live one.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    try {
      ListWorldExperiencePlaceVersionsResponse result = apiInstance.listWorldExperiencePlaceVersions(experienceId, placeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#listWorldExperiencePlaceVersions");
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
 **experienceId** | **String**|  |
 **placeId** | **String**|  |

### Return type

**ListWorldExperiencePlaceVersionsResponse**

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

<a name="listWorldExperiencePlaces"></a>
# **listWorldExperiencePlaces**
> ListWorldExperiencePlacesResponse listWorldExperiencePlaces(experienceId)

The places of an experience, start place first.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      ListWorldExperiencePlacesResponse result = apiInstance.listWorldExperiencePlaces(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#listWorldExperiencePlaces");
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
 **experienceId** | **String**|  |

### Return type

**ListWorldExperiencePlacesResponse**

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

<a name="listWorldExperiencePlaytesters"></a>
# **listWorldExperiencePlaytesters**
> ListWorldExperiencePlaytestersResponse listWorldExperiencePlaytesters(experienceId)

People who may join while the game is private.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      ListWorldExperiencePlaytestersResponse result = apiInstance.listWorldExperiencePlaytesters(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#listWorldExperiencePlaytesters");
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
 **experienceId** | **String**|  |

### Return type

**ListWorldExperiencePlaytestersResponse**

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

<a name="listWorldExperienceServers"></a>
# **listWorldExperienceServers**
> ListWorldExperienceServersResponse listWorldExperienceServers(experienceId)

Live servers: place, version, region, players, health.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      ListWorldExperienceServersResponse result = apiInstance.listWorldExperienceServers(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#listWorldExperienceServers");
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
 **experienceId** | **String**|  |

### Return type

**ListWorldExperienceServersResponse**

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

<a name="listWorldExperiences"></a>
# **listWorldExperiences**
> ListWorldExperiencesResponse listWorldExperiences()

Your experiences, newest first; cursor-paged (?cursor&#x3D;&amp;limit&#x3D;).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    try {
      ListWorldExperiencesResponse result = apiInstance.listWorldExperiences();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#listWorldExperiences");
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

**ListWorldExperiencesResponse**

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

<a name="listWorldFavorites"></a>
# **listWorldFavorites**
> ListWorldRecentResponse listWorldFavorites()

Your favourite experiences that are still open, newest first.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    try {
      ListWorldRecentResponse result = apiInstance.listWorldFavorites();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#listWorldFavorites");
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

**ListWorldRecentResponse**

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

<a name="listWorldGameMine"></a>
# **listWorldGameMine**
> ListWorldGameMineResponse listWorldGameMine()

Every game you own or collaborate on, 3D worlds and Classic, filtered (?q&amp;status&amp;engine&amp;genre&amp;template&amp;owner&amp;flag&amp;sort; sort&#x3D;revenue &#x3D; highest earning first). Each row carries revenueCents: your creator-ledger earnings from it in USD cents (null for Classic).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    try {
      ListWorldGameMineResponse result = apiInstance.listWorldGameMine();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#listWorldGameMine");
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

**ListWorldGameMineResponse**

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

<a name="listWorldParentalChildren"></a>
# **listWorldParentalChildren**
> ListWorldParentalChildrenResponse listWorldParentalChildren()

Accounts you are the linked parent of: limits (max rating, chat, monthly spend), spend this month, and the last 7 days of playtime per experience.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    try {
      ListWorldParentalChildrenResponse result = apiInstance.listWorldParentalChildren();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#listWorldParentalChildren");
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

**ListWorldParentalChildrenResponse**

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

<a name="listWorldRecent"></a>
# **listWorldRecent**
> ListWorldRecentResponse listWorldRecent()

Continue playing: what you played in the last 90 days that is still open, newest first (from what the servers recorded).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    try {
      ListWorldRecentResponse result = apiInstance.listWorldRecent();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#listWorldRecent");
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

**ListWorldRecentResponse**

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

<a name="listWorldRegions"></a>
# **listWorldRegions**
> ListWorldRegionsResponse listWorldRegions()

Live server regions with a probe URL each: GET it a few times, send the round trips as &#x60;pings&#x60; with the join to land in the nearest region.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    try {
      ListWorldRegionsResponse result = apiInstance.listWorldRegions();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#listWorldRegions");
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

**ListWorldRegionsResponse**

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

<a name="listWorldShopListings"></a>
# **listWorldShopListings**
> ListWorldShopListingsResponse listWorldShopListings()

Your live Crossly listings a game can show and sell (shop objects bind to their id).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    try {
      ListWorldShopListingsResponse result = apiInstance.listWorldShopListings();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#listWorldShopListings");
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

**ListWorldShopListingsResponse**

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

<a name="listWorldTransferRequests"></a>
# **listWorldTransferRequests**
> ListWorldTransferRequestsResponse listWorldTransferRequests()

Ownership transfer requests you were asked (incoming) or sent (outgoing), newest first (?direction&amp;status&amp;experienceId).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    try {
      ListWorldTransferRequestsResponse result = apiInstance.listWorldTransferRequests();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#listWorldTransferRequests");
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

**ListWorldTransferRequestsResponse**

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

<a name="listWorldTransparency"></a>
# **listWorldTransparency**
> ListWorldTransparencyResponse listWorldTransparency()

Published monthly transparency reports, newest first: reports received and actions taken, by type (counts only).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    try {
      ListWorldTransparencyResponse result = apiInstance.listWorldTransparency();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#listWorldTransparency");
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

**ListWorldTransparencyResponse**

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

<a name="updateWorldExperience"></a>
# **updateWorldExperience**
> WorldExperienceResponse updateWorldExperience(experienceId)

Edit name, description, genre, rating or icon.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      WorldExperienceResponse result = apiInstance.updateWorldExperience(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#updateWorldExperience");
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
 **experienceId** | **String**|  |

### Return type

**WorldExperienceResponse**

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

<a name="updateWorldExperienceAccessLimit"></a>
# **updateWorldExperienceAccessLimit**
> GetWorldExperienceAccessLimitResponse updateWorldExperienceAccessLimit(experienceId)

Limit who can play: { crewOnly } (only members of the owner&#39;s crew), { countryMode: all|allow|block, countries: [&#39;US&#39;, ...] }. The owner and team are never limited.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      GetWorldExperienceAccessLimitResponse result = apiInstance.updateWorldExperienceAccessLimit(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#updateWorldExperienceAccessLimit");
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
 **experienceId** | **String**|  |

### Return type

**GetWorldExperienceAccessLimitResponse**

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

<a name="updateWorldExperienceAlertSetting"></a>
# **updateWorldExperienceAlertSetting**
> GetWorldExperienceAlertSettingResponse updateWorldExperienceAlertSetting(experienceId)

Change alert rules and quiet hours.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      GetWorldExperienceAlertSettingResponse result = apiInstance.updateWorldExperienceAlertSetting(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#updateWorldExperienceAlertSetting");
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
 **experienceId** | **String**|  |

### Return type

**GetWorldExperienceAlertSettingResponse**

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

<a name="updateWorldExperienceChatSetting"></a>
# **updateWorldExperienceChatSetting**
> GetWorldExperienceChatSettingResponse updateWorldExperienceChatSetting(experienceId)

Turn text chat off or use the strict filter for everyone (never looser than the platform).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      GetWorldExperienceChatSettingResponse result = apiInstance.updateWorldExperienceChatSetting(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#updateWorldExperienceChatSetting");
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
 **experienceId** | **String**|  |

### Return type

**GetWorldExperienceChatSettingResponse**

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

<a name="updateWorldExperienceConfig"></a>
# **updateWorldExperienceConfig**
> WorldExperienceConfigResponse updateWorldExperienceConfig(experienceId)

Save the whole config document. Running servers get it within seconds (ConfigService.Changed). baseVersion guards against overwriting a newer save (409).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      WorldExperienceConfigResponse result = apiInstance.updateWorldExperienceConfig(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#updateWorldExperienceConfig");
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
 **experienceId** | **String**|  |

### Return type

**WorldExperienceConfigResponse**

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

<a name="updateWorldExperienceConfigValue"></a>
# **updateWorldExperienceConfigValue**
> WorldExperienceConfigResponse updateWorldExperienceConfigValue(experienceId)

Set and/or remove individual config keys.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      WorldExperienceConfigResponse result = apiInstance.updateWorldExperienceConfigValue(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#updateWorldExperienceConfigValue");
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
 **experienceId** | **String**|  |

### Return type

**WorldExperienceConfigResponse**

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

<a name="updateWorldExperienceEvent"></a>
# **updateWorldExperienceEvent**
> WorldExperienceEventResponse updateWorldExperienceEvent(experienceId, eventId)

Reschedule or change a scheduled event; a live event may only move its end.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String eventId = "eventId_example"; // String | 
    try {
      WorldExperienceEventResponse result = apiInstance.updateWorldExperienceEvent(experienceId, eventId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#updateWorldExperienceEvent");
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
 **experienceId** | **String**|  |
 **eventId** | **String**|  |

### Return type

**WorldExperienceEventResponse**

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

<a name="updateWorldExperienceExperiment"></a>
# **updateWorldExperienceExperiment**
> WorldExperienceExperimentResponse updateWorldExperienceExperiment(experienceId, experimentId)

Edit a draft (a running experiment may only rename or reword).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String experimentId = "experimentId_example"; // String | 
    try {
      WorldExperienceExperimentResponse result = apiInstance.updateWorldExperienceExperiment(experienceId, experimentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#updateWorldExperienceExperiment");
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
 **experienceId** | **String**|  |
 **experimentId** | **String**|  |

### Return type

**WorldExperienceExperimentResponse**

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

<a name="updateWorldExperienceMaturity"></a>
# **updateWorldExperienceMaturity**
> UpdateWorldExperienceMaturityResponse updateWorldExperienceMaturity(experienceId)

Answer the questionnaire: { answers }. A stricter rating applies now; a looser or first Mature rating waits for the next reviewed publish (takesEffect).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      UpdateWorldExperienceMaturityResponse result = apiInstance.updateWorldExperienceMaturity(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#updateWorldExperienceMaturity");
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
 **experienceId** | **String**|  |

### Return type

**UpdateWorldExperienceMaturityResponse**

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

<a name="updateWorldExperiencePlace"></a>
# **updateWorldExperiencePlace**
> WorldExperiencePlaceResponse updateWorldExperiencePlace(experienceId, placeId)

Place settings: name, max players (1-50), fill target, social slots, empty shutdown.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    try {
      WorldExperiencePlaceResponse result = apiInstance.updateWorldExperiencePlace(experienceId, placeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#updateWorldExperiencePlace");
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
 **experienceId** | **String**|  |
 **placeId** | **String**|  |

### Return type

**WorldExperiencePlaceResponse**

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

<a name="updateWorldExperiencePlaceDraft"></a>
# **updateWorldExperiencePlaceDraft**
> GetWorldExperiencePlaceDraftResponse updateWorldExperiencePlaceDraft(experienceId, placeId)

Save the draft. baseRevision is the revision you loaded (0 for none); a newer save elsewhere answers 409 draft_conflict.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    try {
      GetWorldExperiencePlaceDraftResponse result = apiInstance.updateWorldExperiencePlaceDraft(experienceId, placeId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#updateWorldExperiencePlaceDraft");
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
 **experienceId** | **String**|  |
 **placeId** | **String**|  |

### Return type

**GetWorldExperiencePlaceDraftResponse**

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

<a name="updateWorldExperiencePlaceVersionNote"></a>
# **updateWorldExperiencePlaceVersionNote**
> UpdateWorldExperiencePlaceVersionNoteResponse updateWorldExperiencePlaceVersionNote(experienceId, placeId, versionId)

Edit a release version&#39;s changelog (the game page&#39;s What&#39;s new): { notes } up to 2000 characters.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String placeId = "placeId_example"; // String | 
    String versionId = "versionId_example"; // String | 
    try {
      UpdateWorldExperiencePlaceVersionNoteResponse result = apiInstance.updateWorldExperiencePlaceVersionNote(experienceId, placeId, versionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#updateWorldExperiencePlaceVersionNote");
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
 **experienceId** | **String**|  |
 **placeId** | **String**|  |
 **versionId** | **String**|  |

### Return type

**UpdateWorldExperiencePlaceVersionNoteResponse**

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

<a name="updateWorldExperiencePublish"></a>
# **updateWorldExperiencePublish**
> WorldExperienceResponse2 updateWorldExperiencePublish(experienceId, requestId)

Steps 2–5: details, rating questionnaire answers, access (private | friends | unlisted | public), money review acknowledgement.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    String requestId = "requestId_example"; // String | 
    try {
      WorldExperienceResponse2 result = apiInstance.updateWorldExperiencePublish(experienceId, requestId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#updateWorldExperiencePublish");
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
 **experienceId** | **String**|  |
 **requestId** | **String**|  |

### Return type

**WorldExperienceResponse2**

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

<a name="updateWorldExperienceShowcase"></a>
# **updateWorldExperienceShowcase**
> UpdateWorldExperienceShowcaseResponse updateWorldExperienceShowcase(experienceId)

Set the showcased listings: { listingIds } (Crossly shop slugs of the owner&#39;s live listings, max 12, in order).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String experienceId = "experienceId_example"; // String | 
    try {
      UpdateWorldExperienceShowcaseResponse result = apiInstance.updateWorldExperienceShowcase(experienceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#updateWorldExperienceShowcase");
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
 **experienceId** | **String**|  |

### Return type

**UpdateWorldExperienceShowcaseResponse**

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

<a name="updateWorldFavorite"></a>
# **updateWorldFavorite**
> WorldResponse3 updateWorldFavorite()

Favourite or un-favourite an experience (idempotent).

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    try {
      WorldResponse3 result = apiInstance.updateWorldFavorite();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#updateWorldFavorite");
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

**WorldResponse3**

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

<a name="updateWorldMature"></a>
# **updateWorldMature**
> GetWorldMatureResponse updateWorldMature()

Switch \&quot;Show Mature experiences\&quot; on or off: { showMature }. On is refused while a final step blocks (too young, region, parental controls, safety hold); it never skips the ID check.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    try {
      GetWorldMatureResponse result = apiInstance.updateWorldMature();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#updateWorldMature");
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

**GetWorldMatureResponse**

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

<a name="updateWorldMePref"></a>
# **updateWorldMePref**
> GetWorldMePrefResponse updateWorldMePref()

Set your Crossly Carnival choices.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    try {
      GetWorldMePrefResponse result = apiInstance.updateWorldMePref();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#updateWorldMePref");
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

**GetWorldMePrefResponse**

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

<a name="updateWorldParentalChildren"></a>
# **updateWorldParentalChildren**
> WorldParentalResponse updateWorldParentalChildren(childId)

Change a linked account&#39;s limits with your PIN: { pin, settings: { maxRating: everyone|teen, chat: on|friends|off, monthlySpendLimitCents (0 &#x3D; no purchases, null &#x3D; no limit) } }. Enforced server-side at join, chat, the purchase prompt and checkout.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    String childId = "childId_example"; // String | 
    try {
      WorldParentalResponse result = apiInstance.updateWorldParentalChildren(childId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#updateWorldParentalChildren");
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
 **childId** | **String**|  |

### Return type

**WorldParentalResponse**

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

<a name="updateWorldVote"></a>
# **updateWorldVote**
> WorldResponse3 updateWorldVote()

Thumbs up, down, or null to withdraw: one vote per player per experience, counted only after 10 minutes of play (403 vote_needs_playtime before). A light ranking signal.

### Example
```java
// Import classes:
import net.crossly.ApiClient;
import net.crossly.ApiException;
import net.crossly.Configuration;
import net.crossly.auth.*;
import net.crossly.models.*;
import net.crossly.api.WorldsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://crossly.net/api");
    
    // Configure HTTP bearer authorization: PersonalAccessToken
    HttpBearerAuth PersonalAccessToken = (HttpBearerAuth) defaultClient.getAuthentication("PersonalAccessToken");
    PersonalAccessToken.setBearerToken("BEARER TOKEN");

    WorldsApi apiInstance = new WorldsApi(defaultClient);
    try {
      WorldResponse3 result = apiInstance.updateWorldVote();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorldsApi#updateWorldVote");
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

**WorldResponse3**

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

