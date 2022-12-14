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
import io.coscene.jira.client.v3.model.CustomFieldValueUpdateDetails;
import io.coscene.jira.client.v3.model.MultipleCustomFieldValuesUpdateDetails;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * API tests for IssueCustomFieldValuesAppsApi
 */
@Disabled
public class IssueCustomFieldValuesAppsApiTest {

    private final IssueCustomFieldValuesAppsApi api = new IssueCustomFieldValuesAppsApi();

    /**
     * Update custom field value
     *
     * Updates the value of a custom field on one or more issues. Custom fields can only be updated by the Forge app that created them.  **[Permissions](#permissions) required:** Only the app that created the custom field can update its values with this operation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCustomFieldValueTest() throws ApiException {
        String fieldIdOrKey = null;
        CustomFieldValueUpdateDetails customFieldValueUpdateDetails = null;
        Boolean generateChangelog = null;
        Object response = api.updateCustomFieldValue(fieldIdOrKey, customFieldValueUpdateDetails, generateChangelog);
        // TODO: test validations
    }

    /**
     * Update custom fields
     *
     * Updates the value of one or more custom fields on one or more issues. Combinations of custom field and issue should be unique within the request. Custom fields can only be updated by the Forge app that created them.  **[Permissions](#permissions) required:** Only the app that created the custom field can update its values with this operation.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateMultipleCustomFieldValuesTest() throws ApiException {
        MultipleCustomFieldValuesUpdateDetails multipleCustomFieldValuesUpdateDetails = null;
        Boolean generateChangelog = null;
        Object response = api.updateMultipleCustomFieldValues(multipleCustomFieldValuesUpdateDetails, generateChangelog);
        // TODO: test validations
    }

}
