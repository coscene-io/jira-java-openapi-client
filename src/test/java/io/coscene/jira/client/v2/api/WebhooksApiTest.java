/*
 * The Jira Cloud platform REST API
 * Jira Cloud platform REST API documentation
 *
 * The version of the OpenAPI document: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.coscene.jira.client.v2.api;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import io.coscene.jira.client.v2.ApiException;
import io.coscene.jira.client.v2.model.ContainerForRegisteredWebhooks;
import io.coscene.jira.client.v2.model.ContainerForWebhookIDs;
import io.coscene.jira.client.v2.model.FailedWebhooks;
import io.coscene.jira.client.v2.model.PageBeanWebhook;
import io.coscene.jira.client.v2.model.WebhookRegistrationDetails;
import io.coscene.jira.client.v2.model.WebhooksExpirationDate;

/**
 * API tests for WebhooksApi
 */
@Disabled
public class WebhooksApiTest {

    private final WebhooksApi api = new WebhooksApi();

    /**
     * Delete webhooks by ID
     *
     * Removes webhooks by ID. Only webhooks registered by the calling app are removed. If webhooks created by other apps are specified, they are ignored.  **[Permissions](#permissions) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/#connect-apps) and [OAuth 2.0](https://developer.atlassian.com/cloud/jira/platform/oauth-2-3lo-apps) apps can use this operation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteWebhookByIdTest() throws ApiException {
        ContainerForWebhookIDs containerForWebhookIDs = null;
        api.deleteWebhookById(containerForWebhookIDs);
        // TODO: test validations
    }

    /**
     * Get dynamic webhooks for app
     *
     * Returns a [paginated](#pagination) list of the webhooks registered by the calling app.  **[Permissions](#permissions) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/#connect-apps) and [OAuth 2.0](https://developer.atlassian.com/cloud/jira/platform/oauth-2-3lo-apps) apps can use this operation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDynamicWebhooksForAppTest() throws ApiException {
        Long startAt = null;
        Integer maxResults = null;
        PageBeanWebhook response = api.getDynamicWebhooksForApp(startAt, maxResults);
        // TODO: test validations
    }

    /**
     * Get failed webhooks
     *
     * Returns webhooks that have recently failed to be delivered to the requesting app after the maximum number of retries.  After 72 hours the failure may no longer be returned by this operation.  The oldest failure is returned first.  This method uses a cursor-based pagination. To request the next page use the failure time of the last webhook on the list as the &#x60;failedAfter&#x60; value or use the URL provided in &#x60;next&#x60;.  **[Permissions](#permissions) required:** Only [Connect apps](https://developer.atlassian.com/cloud/jira/platform/index/#connect-apps) can use this operation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFailedWebhooksTest() throws ApiException {
        Integer maxResults = null;
        Long after = null;
        FailedWebhooks response = api.getFailedWebhooks(maxResults, after);
        // TODO: test validations
    }

    /**
     * Extend webhook life
     *
     * Extends the life of webhook. Webhooks registered through the REST API expire after 30 days. Call this operation to keep them alive.  Unrecognized webhook IDs (those that are not found or belong to other apps) are ignored.  **[Permissions](#permissions) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/#connect-apps) and [OAuth 2.0](https://developer.atlassian.com/cloud/jira/platform/oauth-2-3lo-apps) apps can use this operation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void refreshWebhooksTest() throws ApiException {
        ContainerForWebhookIDs containerForWebhookIDs = null;
        WebhooksExpirationDate response = api.refreshWebhooks(containerForWebhookIDs);
        // TODO: test validations
    }

    /**
     * Register dynamic webhooks
     *
     * Registers webhooks.  **NOTE:** for non-public OAuth apps, webhooks are delivered only if there is a match between the app owner and the user who registered a dynamic webhook.  **[Permissions](#permissions) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/#connect-apps) and [OAuth 2.0](https://developer.atlassian.com/cloud/jira/platform/oauth-2-3lo-apps) apps can use this operation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void registerDynamicWebhooksTest() throws ApiException {
        WebhookRegistrationDetails webhookRegistrationDetails = null;
        ContainerForRegisteredWebhooks response = api.registerDynamicWebhooks(webhookRegistrationDetails);
        // TODO: test validations
    }

}
