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
import io.coscene.jira.client.v3.model.ErrorCollection;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * API tests for ProjectKeyAndNameValidationApi
 */
@Disabled
public class ProjectKeyAndNameValidationApiTest {

    private final ProjectKeyAndNameValidationApi api = new ProjectKeyAndNameValidationApi();

    /**
     * Get valid project key
     *
     * Validates a project key and, if the key is invalid or in use, generates a valid random string for the project key.  **[Permissions](#permissions) required:** None.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getValidProjectKeyTest() throws ApiException {
        String key = null;
        String response = api.getValidProjectKey(key);
        // TODO: test validations
    }

    /**
     * Get valid project name
     *
     * Checks that a project name isn&#39;t in use. If the name isn&#39;t in use, the passed string is returned. If the name is in use, this operation attempts to generate a valid project name based on the one supplied, usually by adding a sequence number. If a valid project name cannot be generated, a 404 response is returned.  **[Permissions](#permissions) required:** None.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getValidProjectNameTest() throws ApiException {
        String name = null;
        String response = api.getValidProjectName(name);
        // TODO: test validations
    }

    /**
     * Validate project key
     *
     * Validates a project key by confirming the key is a valid string and not in use.  **[Permissions](#permissions) required:** None.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void validateProjectKeyTest() throws ApiException {
        String key = null;
        ErrorCollection response = api.validateProjectKey(key);
        // TODO: test validations
    }

}
