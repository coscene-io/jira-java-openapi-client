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


package io.coscene.jira.client.v3.api;

import io.coscene.jira.client.v3.ApiException;
import io.coscene.jira.client.v3.model.ServerInformation;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * API tests for ServerInfoApi
 */
@Disabled
public class ServerInfoApiTest {

    private final ServerInfoApi api = new ServerInfoApi();

    /**
     * Get Jira instance info
     *
     * Returns information about the Jira instance.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getServerInfoTest() throws ApiException {
        ServerInformation response = api.getServerInfo();
        // TODO: test validations
    }

}
