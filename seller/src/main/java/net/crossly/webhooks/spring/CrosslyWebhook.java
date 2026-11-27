package net.crossly.webhooks.spring;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a Spring MVC handler parameter ({@code String} or {@code byte[]}) as the verified body of a Crossly webhook.
 * Resolved by {@link CrosslyWebhookArgumentResolver}: a request whose signature does not verify never reaches the
 * method and is answered 400.
 */
@Documented
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface CrosslyWebhook {}
