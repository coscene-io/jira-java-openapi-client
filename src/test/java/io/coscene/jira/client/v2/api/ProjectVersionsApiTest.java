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

import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import io.coscene.jira.client.v2.ApiException;
import io.coscene.jira.client.v2.model.DeleteAndReplaceVersionBean;
import io.coscene.jira.client.v2.model.PageBeanVersion;
import io.coscene.jira.client.v2.model.Version;
import io.coscene.jira.client.v2.model.VersionIssueCounts;
import io.coscene.jira.client.v2.model.VersionMoveBean;
import io.coscene.jira.client.v2.model.VersionUnresolvedIssuesCount;

/**
 * API tests for ProjectVersionsApi
 */
@Disabled
public class ProjectVersionsApiTest {

    private final ProjectVersionsApi api = new ProjectVersionsApi();

    /**
     * Create version
     *
     * Creates a project version.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project the version is added to.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createVersionTest() throws ApiException {
        Version version = null;
        Version response = api.createVersion(version);
        // TODO: test validations
    }

    /**
     * Delete and replace version
     *
     * Deletes a project version.  Alternative versions can be provided to update issues that use the deleted version in &#x60;fixVersion&#x60;, &#x60;affectedVersion&#x60;, or any version picker custom fields. If alternatives are not provided, occurrences of &#x60;fixVersion&#x60;, &#x60;affectedVersion&#x60;, and any version picker custom field, that contain the deleted version, are cleared. Any replacement version must be in the same project as the version being deleted and cannot be the version being deleted.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that contains the version.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteAndReplaceVersionTest() throws ApiException {
        String id = null;
        DeleteAndReplaceVersionBean deleteAndReplaceVersionBean = null;
        Object response = api.deleteAndReplaceVersion(id, deleteAndReplaceVersionBean);
        // TODO: test validations
    }

    /**
     * Delete version
     *
     * Deletes a project version.  Deprecated, use [ Delete and replace version](#api-rest-api-2-version-id-removeAndSwap-post) that supports swapping version values in custom fields, in addition to the swapping for &#x60;fixVersion&#x60; and &#x60;affectedVersion&#x60; provided in this resource.  Alternative versions can be provided to update issues that use the deleted version in &#x60;fixVersion&#x60; or &#x60;affectedVersion&#x60;. If alternatives are not provided, occurrences of &#x60;fixVersion&#x60; and &#x60;affectedVersion&#x60; that contain the deleted version are cleared.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that contains the version.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteVersionTest() throws ApiException {
        String id = null;
        String moveFixIssuesTo = null;
        String moveAffectedIssuesTo = null;
        api.deleteVersion(id, moveFixIssuesTo, moveAffectedIssuesTo);
        // TODO: test validations
    }

    /**
     * Get project versions
     *
     * Returns all versions in a project. The response is not paginated. Use [Get project versions paginated](#api-rest-api-2-project-projectIdOrKey-version-get) if you want to get the versions in a project with pagination.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectVersionsTest() throws ApiException {
        String projectIdOrKey = null;
        String expand = null;
        List<Version> response = api.getProjectVersions(projectIdOrKey, expand);
        // TODO: test validations
    }

    /**
     * Get project versions paginated
     *
     * Returns a [paginated](#pagination) list of all versions in a project. See the [Get project versions](#api-rest-api-2-project-projectIdOrKey-versions-get) resource if you want to get a full list of versions without pagination.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectVersionsPaginatedTest() throws ApiException {
        String projectIdOrKey = null;
        Long startAt = null;
        Integer maxResults = null;
        String orderBy = null;
        String query = null;
        String status = null;
        String expand = null;
        PageBeanVersion response = api.getProjectVersionsPaginated(projectIdOrKey, startAt, maxResults, orderBy, query, status, expand);
        // TODO: test validations
    }

    /**
     * Get version
     *
     * Returns a project version.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the version.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getVersionTest() throws ApiException {
        String id = null;
        String expand = null;
        Version response = api.getVersion(id, expand);
        // TODO: test validations
    }

    /**
     * Get version&#39;s related issues count
     *
     * Returns the following counts for a version:   *  Number of issues where the &#x60;fixVersion&#x60; is set to the version.  *  Number of issues where the &#x60;affectedVersion&#x60; is set to the version.  *  Number of issues where a version custom field is set to the version.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* project permission for the project that contains the version.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getVersionRelatedIssuesTest() throws ApiException {
        String id = null;
        VersionIssueCounts response = api.getVersionRelatedIssues(id);
        // TODO: test validations
    }

    /**
     * Get version&#39;s unresolved issues count
     *
     * Returns counts of the issues and unresolved issues for the project version.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* project permission for the project that contains the version.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getVersionUnresolvedIssuesTest() throws ApiException {
        String id = null;
        VersionUnresolvedIssuesCount response = api.getVersionUnresolvedIssues(id);
        // TODO: test validations
    }

    /**
     * Merge versions
     *
     * Merges two project versions. The merge is completed by deleting the version specified in &#x60;id&#x60; and replacing any occurrences of its ID in &#x60;fixVersion&#x60; with the version ID specified in &#x60;moveIssuesTo&#x60;.  Consider using [ Delete and replace version](#api-rest-api-2-version-id-removeAndSwap-post) instead. This resource supports swapping version values in &#x60;fixVersion&#x60;, &#x60;affectedVersion&#x60;, and custom fields.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that contains the version.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void mergeVersionsTest() throws ApiException {
        String id = null;
        String moveIssuesTo = null;
        Object response = api.mergeVersions(id, moveIssuesTo);
        // TODO: test validations
    }

    /**
     * Move version
     *
     * Modifies the version&#39;s sequence within the project, which affects the display order of the versions in Jira.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* project permission for the project that contains the version.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void moveVersionTest() throws ApiException {
        String id = null;
        VersionMoveBean versionMoveBean = null;
        Version response = api.moveVersion(id, versionMoveBean);
        // TODO: test validations
    }

    /**
     * Update version
     *
     * Updates a project version.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that contains the version.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateVersionTest() throws ApiException {
        String id = null;
        Version version = null;
        Version response = api.updateVersion(id, version);
        // TODO: test validations
    }

}
