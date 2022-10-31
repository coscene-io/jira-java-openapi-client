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


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.ContainerForProjectFeatures;
import org.openapitools.client.model.ProjectFeatureState;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ProjectFeaturesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ProjectFeaturesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProjectFeaturesApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getFeaturesForProject
     * @param projectIdOrKey The ID or (case-sensitive) key of the project. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is not valid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user does not have the required permissions. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getFeaturesForProjectCall(String projectIdOrKey, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/rest/api/3/project/{projectIdOrKey}/features"
            .replaceAll("\\{" + "projectIdOrKey" + "\\}", localVarApiClient.escapeString(projectIdOrKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getFeaturesForProjectValidateBeforeCall(String projectIdOrKey, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'projectIdOrKey' is set
        if (projectIdOrKey == null) {
            throw new ApiException("Missing the required parameter 'projectIdOrKey' when calling getFeaturesForProject(Async)");
        }
        

        okhttp3.Call localVarCall = getFeaturesForProjectCall(projectIdOrKey, _callback);
        return localVarCall;

    }

    /**
     * Get project features
     * Returns the list of features for a project.
     * @param projectIdOrKey The ID or (case-sensitive) key of the project. (required)
     * @return ContainerForProjectFeatures
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is not valid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user does not have the required permissions. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project is not found. </td><td>  -  </td></tr>
     </table>
     */
    public ContainerForProjectFeatures getFeaturesForProject(String projectIdOrKey) throws ApiException {
        ApiResponse<ContainerForProjectFeatures> localVarResp = getFeaturesForProjectWithHttpInfo(projectIdOrKey);
        return localVarResp.getData();
    }

    /**
     * Get project features
     * Returns the list of features for a project.
     * @param projectIdOrKey The ID or (case-sensitive) key of the project. (required)
     * @return ApiResponse&lt;ContainerForProjectFeatures&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is not valid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user does not have the required permissions. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project is not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ContainerForProjectFeatures> getFeaturesForProjectWithHttpInfo(String projectIdOrKey) throws ApiException {
        okhttp3.Call localVarCall = getFeaturesForProjectValidateBeforeCall(projectIdOrKey, null);
        Type localVarReturnType = new TypeToken<ContainerForProjectFeatures>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get project features (asynchronously)
     * Returns the list of features for a project.
     * @param projectIdOrKey The ID or (case-sensitive) key of the project. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is not valid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user does not have the required permissions. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getFeaturesForProjectAsync(String projectIdOrKey, final ApiCallback<ContainerForProjectFeatures> _callback) throws ApiException {

        okhttp3.Call localVarCall = getFeaturesForProjectValidateBeforeCall(projectIdOrKey, _callback);
        Type localVarReturnType = new TypeToken<ContainerForProjectFeatures>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for toggleFeatureForProject
     * @param projectIdOrKey The ID or (case-sensitive) key of the project. (required)
     * @param featureKey The key of the feature. (required)
     * @param projectFeatureState Details of the feature state change. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is not valid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user does not have the required permissions. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project or project feature is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call toggleFeatureForProjectCall(String projectIdOrKey, String featureKey, ProjectFeatureState projectFeatureState, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = projectFeatureState;

        // create path and map variables
        String localVarPath = "/rest/api/3/project/{projectIdOrKey}/features/{featureKey}"
            .replaceAll("\\{" + "projectIdOrKey" + "\\}", localVarApiClient.escapeString(projectIdOrKey.toString()))
            .replaceAll("\\{" + "featureKey" + "\\}", localVarApiClient.escapeString(featureKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call toggleFeatureForProjectValidateBeforeCall(String projectIdOrKey, String featureKey, ProjectFeatureState projectFeatureState, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'projectIdOrKey' is set
        if (projectIdOrKey == null) {
            throw new ApiException("Missing the required parameter 'projectIdOrKey' when calling toggleFeatureForProject(Async)");
        }
        
        // verify the required parameter 'featureKey' is set
        if (featureKey == null) {
            throw new ApiException("Missing the required parameter 'featureKey' when calling toggleFeatureForProject(Async)");
        }
        
        // verify the required parameter 'projectFeatureState' is set
        if (projectFeatureState == null) {
            throw new ApiException("Missing the required parameter 'projectFeatureState' when calling toggleFeatureForProject(Async)");
        }
        

        okhttp3.Call localVarCall = toggleFeatureForProjectCall(projectIdOrKey, featureKey, projectFeatureState, _callback);
        return localVarCall;

    }

    /**
     * Set project feature state
     * Sets the state of a project feature.
     * @param projectIdOrKey The ID or (case-sensitive) key of the project. (required)
     * @param featureKey The key of the feature. (required)
     * @param projectFeatureState Details of the feature state change. (required)
     * @return ContainerForProjectFeatures
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is not valid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user does not have the required permissions. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project or project feature is not found. </td><td>  -  </td></tr>
     </table>
     */
    public ContainerForProjectFeatures toggleFeatureForProject(String projectIdOrKey, String featureKey, ProjectFeatureState projectFeatureState) throws ApiException {
        ApiResponse<ContainerForProjectFeatures> localVarResp = toggleFeatureForProjectWithHttpInfo(projectIdOrKey, featureKey, projectFeatureState);
        return localVarResp.getData();
    }

    /**
     * Set project feature state
     * Sets the state of a project feature.
     * @param projectIdOrKey The ID or (case-sensitive) key of the project. (required)
     * @param featureKey The key of the feature. (required)
     * @param projectFeatureState Details of the feature state change. (required)
     * @return ApiResponse&lt;ContainerForProjectFeatures&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is not valid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user does not have the required permissions. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project or project feature is not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ContainerForProjectFeatures> toggleFeatureForProjectWithHttpInfo(String projectIdOrKey, String featureKey, ProjectFeatureState projectFeatureState) throws ApiException {
        okhttp3.Call localVarCall = toggleFeatureForProjectValidateBeforeCall(projectIdOrKey, featureKey, projectFeatureState, null);
        Type localVarReturnType = new TypeToken<ContainerForProjectFeatures>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Set project feature state (asynchronously)
     * Sets the state of a project feature.
     * @param projectIdOrKey The ID or (case-sensitive) key of the project. (required)
     * @param featureKey The key of the feature. (required)
     * @param projectFeatureState Details of the feature state change. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is not valid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user does not have the required permissions. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project or project feature is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call toggleFeatureForProjectAsync(String projectIdOrKey, String featureKey, ProjectFeatureState projectFeatureState, final ApiCallback<ContainerForProjectFeatures> _callback) throws ApiException {

        okhttp3.Call localVarCall = toggleFeatureForProjectValidateBeforeCall(projectIdOrKey, featureKey, projectFeatureState, _callback);
        Type localVarReturnType = new TypeToken<ContainerForProjectFeatures>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}