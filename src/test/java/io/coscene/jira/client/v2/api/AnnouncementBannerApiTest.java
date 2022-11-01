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
import io.coscene.jira.client.v2.model.AnnouncementBannerConfiguration;
import io.coscene.jira.client.v2.model.AnnouncementBannerConfigurationUpdate;

/**
 * API tests for AnnouncementBannerApi
 */
@Disabled
public class AnnouncementBannerApiTest {

    private final AnnouncementBannerApi api = new AnnouncementBannerApi();

    /**
     * Get announcement banner configuration
     *
     * Returns the current announcement banner configuration.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBannerTest() throws ApiException {
        AnnouncementBannerConfiguration response = api.getBanner();
        // TODO: test validations
    }

    /**
     * Update announcement banner configuration
     *
     * Updates the announcement banner configuration.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setBannerTest() throws ApiException {
        AnnouncementBannerConfigurationUpdate announcementBannerConfigurationUpdate = null;
        Object response = api.setBanner(announcementBannerConfigurationUpdate);
        // TODO: test validations
    }

}