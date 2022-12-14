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
import io.coscene.jira.client.v2.model.ProjectCategory;
import io.coscene.jira.client.v2.model.UpdatedProjectCategory;

/**
 * API tests for ProjectCategoriesApi
 */
@Disabled
public class ProjectCategoriesApiTest {

    private final ProjectCategoriesApi api = new ProjectCategoriesApi();

    /**
     * Create project category
     *
     * Creates a project category.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createProjectCategoryTest() throws ApiException {
        ProjectCategory projectCategory = null;
        ProjectCategory response = api.createProjectCategory(projectCategory);
        // TODO: test validations
    }

    /**
     * Get all project categories
     *
     * Returns all project categories.  **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllProjectCategoriesTest() throws ApiException {
        List<ProjectCategory> response = api.getAllProjectCategories();
        // TODO: test validations
    }

    /**
     * Get project category by ID
     *
     * Returns a project category.  **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectCategoryByIdTest() throws ApiException {
        Long id = null;
        ProjectCategory response = api.getProjectCategoryById(id);
        // TODO: test validations
    }

    /**
     * Delete project category
     *
     * Deletes a project category.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeProjectCategoryTest() throws ApiException {
        Long id = null;
        api.removeProjectCategory(id);
        // TODO: test validations
    }

    /**
     * Update project category
     *
     * Updates a project category.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateProjectCategoryTest() throws ApiException {
        Long id = null;
        ProjectCategory projectCategory = null;
        UpdatedProjectCategory response = api.updateProjectCategory(id, projectCategory);
        // TODO: test validations
    }

}
