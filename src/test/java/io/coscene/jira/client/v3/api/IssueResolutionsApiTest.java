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
import io.coscene.jira.client.v3.model.PageBeanResolutionJsonBean;
import io.coscene.jira.client.v3.model.ReorderIssueResolutionsRequest;
import io.coscene.jira.client.v3.model.Resolution;
import io.coscene.jira.client.v3.model.ResolutionId;
import io.coscene.jira.client.v3.model.SetDefaultResolutionRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

/**
 * API tests for IssueResolutionsApi
 */
@Disabled
public class IssueResolutionsApiTest {

    private final IssueResolutionsApi api = new IssueResolutionsApi();

    /**
     * Create resolution
     *
     * Creates an issue resolution.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createResolutionTest() throws ApiException {
        Map<String, Object> requestBody = null;
        ResolutionId response = api.createResolution(requestBody);
        // TODO: test validations
    }

    /**
     * Delete resolution
     *
     * Deletes an issue resolution.  This operation is [asynchronous](#async). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](#api-rest-api-3-task-taskId-get) to obtain subsequent updates.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteResolutionTest() throws ApiException {
        String id = null;
        String replaceWith = null;
        api.deleteResolution(id, replaceWith);
        // TODO: test validations
    }

    /**
     * Get resolution
     *
     * Returns an issue resolution value.  **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResolutionTest() throws ApiException {
        String id = null;
        Resolution response = api.getResolution(id);
        // TODO: test validations
    }

    /**
     * Get resolutions
     *
     * Returns a list of all issue resolution values.  **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getResolutionsTest() throws ApiException {
        List<Resolution> response = api.getResolutions();
        // TODO: test validations
    }

    /**
     * Move resolutions
     *
     * Changes the order of issue resolutions.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void moveResolutionsTest() throws ApiException {
        ReorderIssueResolutionsRequest reorderIssueResolutionsRequest = null;
        Object response = api.moveResolutions(reorderIssueResolutionsRequest);
        // TODO: test validations
    }

    /**
     * Search resolutions
     *
     * Returns a [paginated](#pagination) list of resolutions. The list can contain all resolutions or a subset determined by any combination of these criteria:   *  a list of resolutions IDs.  *  whether the field configuration is a default. This returns resolutions from company-managed (classic) projects only, as there is no concept of default resolutions in team-managed projects.  **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchResolutionsTest() throws ApiException {
        Long startAt = null;
        Integer maxResults = null;
        List<String> id = null;
        Boolean onlyDefault = null;
        PageBeanResolutionJsonBean response = api.searchResolutions(startAt, maxResults, id, onlyDefault);
        // TODO: test validations
    }

    /**
     * Set default resolution
     *
     * Sets default issue resolution.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setDefaultResolutionTest() throws ApiException {
        SetDefaultResolutionRequest setDefaultResolutionRequest = null;
        Object response = api.setDefaultResolution(setDefaultResolutionRequest);
        // TODO: test validations
    }

    /**
     * Update resolution
     *
     * Updates an issue resolution.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateResolutionTest() throws ApiException {
        String id = null;
        Map<String, Object> requestBody = null;
        Object response = api.updateResolution(id, requestBody);
        // TODO: test validations
    }

}
