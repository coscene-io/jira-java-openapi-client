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
import io.coscene.jira.client.v2.model.ContainerForProjectFeatures;
import io.coscene.jira.client.v2.model.ProjectFeatureState;

/**
 * API tests for ProjectFeaturesApi
 */
@Disabled
public class ProjectFeaturesApiTest {

    private final ProjectFeaturesApi api = new ProjectFeaturesApi();

    /**
     * Get project features
     *
     * Returns the list of features for a project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getFeaturesForProjectTest() throws ApiException {
        String projectIdOrKey = null;
        ContainerForProjectFeatures response = api.getFeaturesForProject(projectIdOrKey);
        // TODO: test validations
    }

    /**
     * Set project feature state
     *
     * Sets the state of a project feature.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void toggleFeatureForProjectTest() throws ApiException {
        String projectIdOrKey = null;
        String featureKey = null;
        ProjectFeatureState projectFeatureState = null;
        ContainerForProjectFeatures response = api.toggleFeatureForProject(projectIdOrKey, featureKey, projectFeatureState);
        // TODO: test validations
    }

}
