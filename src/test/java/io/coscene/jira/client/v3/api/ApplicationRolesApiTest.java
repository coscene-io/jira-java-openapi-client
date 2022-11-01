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
import io.coscene.jira.client.v3.model.ApplicationRole;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * API tests for ApplicationRolesApi
 */
@Disabled
public class ApplicationRolesApiTest {

    private final ApplicationRolesApi api = new ApplicationRolesApi();

    /**
     * Get all application roles
     *
     * Returns all application roles. In Jira, application roles are managed using the [Application access configuration](https://confluence.atlassian.com/x/3YxjL) page.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllApplicationRolesTest() throws ApiException {
        List<ApplicationRole> response = api.getAllApplicationRoles();
        // TODO: test validations
    }

    /**
     * Get application role
     *
     * Returns an application role.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getApplicationRoleTest() throws ApiException {
        String key = null;
        ApplicationRole response = api.getApplicationRole(key);
        // TODO: test validations
    }

}