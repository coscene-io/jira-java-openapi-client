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
import io.coscene.jira.client.v2.model.License;

/**
 * API tests for InstanceInformationApi
 */
@Disabled
public class InstanceInformationApiTest {

    private final InstanceInformationApi api = new InstanceInformationApi();

    /**
     * Get license
     *
     * Returns licensing information about the Jira instance.  **[Permissions](#permissions) required:** None.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLicenseTest() throws ApiException {
        License response = api.getLicense();
        // TODO: test validations
    }

}
