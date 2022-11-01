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
import io.coscene.jira.client.v3.model.ColumnItem;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * API tests for IssueNavigatorSettingsApi
 */
@Disabled
public class IssueNavigatorSettingsApiTest {

    private final IssueNavigatorSettingsApi api = new IssueNavigatorSettingsApi();

    /**
     * Get issue navigator default columns
     *
     * Returns the default issue navigator columns.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getIssueNavigatorDefaultColumnsTest() throws ApiException {
        List<ColumnItem> response = api.getIssueNavigatorDefaultColumns();
        // TODO: test validations
    }

    /**
     * Set issue navigator default columns
     *
     * Sets the default issue navigator columns.  The &#x60;columns&#x60; parameter accepts a navigable field value and is expressed as HTML form data. To specify multiple columns, pass multiple &#x60;columns&#x60; parameters. For example, in curl:  &#x60;curl -X PUT -d columns&#x3D;summary -d columns&#x3D;description https://your-domain.atlassian.net/rest/api/3/settings/columns&#x60;  If no column details are sent, then all default columns are removed.  A navigable field is one that can be used as a column on the issue navigator. Find details of navigable issue columns using [Get fields](#api-rest-api-3-field-get).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setIssueNavigatorDefaultColumnsTest() throws ApiException {
        List<String> requestBody = null;
        Object response = api.setIssueNavigatorDefaultColumns(requestBody);
        // TODO: test validations
    }

}
