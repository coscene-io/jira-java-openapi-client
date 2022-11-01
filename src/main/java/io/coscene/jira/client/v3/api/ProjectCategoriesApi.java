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

import io.coscene.jira.client.v3.ApiCallback;
import io.coscene.jira.client.v3.ApiClient;
import io.coscene.jira.client.v3.ApiException;
import io.coscene.jira.client.v3.ApiResponse;
import io.coscene.jira.client.v3.Configuration;
import io.coscene.jira.client.v3.Pair;

import com.google.gson.reflect.TypeToken;


import io.coscene.jira.client.v3.model.ProjectCategory;
import io.coscene.jira.client.v3.model.UpdatedProjectCategory;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjectCategoriesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ProjectCategoriesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProjectCategoriesApi(ApiClient apiClient) {
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
     * Build call for createProjectCategory
     * @param projectCategory  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if:   *  &#x60;name&#x60; is not provided or exceeds 255 characters.  *  &#x60;description&#x60; exceeds 1000 characters. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user does not have the necessary permission. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Returned if the project category name is in use. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createProjectCategoryCall(ProjectCategory projectCategory, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = projectCategory;

        // create path and map variables
        String localVarPath = "/rest/api/3/projectCategory";

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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createProjectCategoryValidateBeforeCall(ProjectCategory projectCategory, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'projectCategory' is set
        if (projectCategory == null) {
            throw new ApiException("Missing the required parameter 'projectCategory' when calling createProjectCategory(Async)");
        }
        

        okhttp3.Call localVarCall = createProjectCategoryCall(projectCategory, _callback);
        return localVarCall;

    }

    /**
     * Create project category
     * Creates a project category.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param projectCategory  (required)
     * @return ProjectCategory
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if:   *  &#x60;name&#x60; is not provided or exceeds 255 characters.  *  &#x60;description&#x60; exceeds 1000 characters. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user does not have the necessary permission. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Returned if the project category name is in use. </td><td>  -  </td></tr>
     </table>
     */
    public ProjectCategory createProjectCategory(ProjectCategory projectCategory) throws ApiException {
        ApiResponse<ProjectCategory> localVarResp = createProjectCategoryWithHttpInfo(projectCategory);
        return localVarResp.getData();
    }

    /**
     * Create project category
     * Creates a project category.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param projectCategory  (required)
     * @return ApiResponse&lt;ProjectCategory&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if:   *  &#x60;name&#x60; is not provided or exceeds 255 characters.  *  &#x60;description&#x60; exceeds 1000 characters. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user does not have the necessary permission. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Returned if the project category name is in use. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProjectCategory> createProjectCategoryWithHttpInfo(ProjectCategory projectCategory) throws ApiException {
        okhttp3.Call localVarCall = createProjectCategoryValidateBeforeCall(projectCategory, null);
        Type localVarReturnType = new TypeToken<ProjectCategory>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create project category (asynchronously)
     * Creates a project category.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param projectCategory  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if:   *  &#x60;name&#x60; is not provided or exceeds 255 characters.  *  &#x60;description&#x60; exceeds 1000 characters. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user does not have the necessary permission. </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Returned if the project category name is in use. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createProjectCategoryAsync(ProjectCategory projectCategory, final ApiCallback<ProjectCategory> _callback) throws ApiException {

        okhttp3.Call localVarCall = createProjectCategoryValidateBeforeCall(projectCategory, _callback);
        Type localVarReturnType = new TypeToken<ProjectCategory>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAllProjectCategories
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAllProjectCategoriesCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/rest/api/3/projectCategory";

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
    private okhttp3.Call getAllProjectCategoriesValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getAllProjectCategoriesCall(_callback);
        return localVarCall;

    }

    /**
     * Get all project categories
     * Returns all project categories.  **[Permissions](#permissions) required:** Permission to access Jira.
     * @return List&lt;ProjectCategory&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
     </table>
     */
    public List<ProjectCategory> getAllProjectCategories() throws ApiException {
        ApiResponse<List<ProjectCategory>> localVarResp = getAllProjectCategoriesWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get all project categories
     * Returns all project categories.  **[Permissions](#permissions) required:** Permission to access Jira.
     * @return ApiResponse&lt;List&lt;ProjectCategory&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ProjectCategory>> getAllProjectCategoriesWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getAllProjectCategoriesValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<ProjectCategory>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get all project categories (asynchronously)
     * Returns all project categories.  **[Permissions](#permissions) required:** Permission to access Jira.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAllProjectCategoriesAsync(final ApiCallback<List<ProjectCategory>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAllProjectCategoriesValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<ProjectCategory>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getProjectCategoryById
     * @param id The ID of the project category. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project category is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getProjectCategoryByIdCall(Long id, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/rest/api/3/projectCategory/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

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
    private okhttp3.Call getProjectCategoryByIdValidateBeforeCall(Long id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getProjectCategoryById(Async)");
        }
        

        okhttp3.Call localVarCall = getProjectCategoryByIdCall(id, _callback);
        return localVarCall;

    }

    /**
     * Get project category by ID
     * Returns a project category.  **[Permissions](#permissions) required:** Permission to access Jira.
     * @param id The ID of the project category. (required)
     * @return ProjectCategory
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project category is not found. </td><td>  -  </td></tr>
     </table>
     */
    public ProjectCategory getProjectCategoryById(Long id) throws ApiException {
        ApiResponse<ProjectCategory> localVarResp = getProjectCategoryByIdWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Get project category by ID
     * Returns a project category.  **[Permissions](#permissions) required:** Permission to access Jira.
     * @param id The ID of the project category. (required)
     * @return ApiResponse&lt;ProjectCategory&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project category is not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProjectCategory> getProjectCategoryByIdWithHttpInfo(Long id) throws ApiException {
        okhttp3.Call localVarCall = getProjectCategoryByIdValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<ProjectCategory>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get project category by ID (asynchronously)
     * Returns a project category.  **[Permissions](#permissions) required:** Permission to access Jira.
     * @param id The ID of the project category. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project category is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getProjectCategoryByIdAsync(Long id, final ApiCallback<ProjectCategory> _callback) throws ApiException {

        okhttp3.Call localVarCall = getProjectCategoryByIdValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<ProjectCategory>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for removeProjectCategory
     * @param id ID of the project category to delete. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user does not have the necessary permission. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project category is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call removeProjectCategoryCall(Long id, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/rest/api/3/projectCategory/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call removeProjectCategoryValidateBeforeCall(Long id, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling removeProjectCategory(Async)");
        }
        

        okhttp3.Call localVarCall = removeProjectCategoryCall(id, _callback);
        return localVarCall;

    }

    /**
     * Delete project category
     * Deletes a project category.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param id ID of the project category to delete. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user does not have the necessary permission. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project category is not found. </td><td>  -  </td></tr>
     </table>
     */
    public void removeProjectCategory(Long id) throws ApiException {
        removeProjectCategoryWithHttpInfo(id);
    }

    /**
     * Delete project category
     * Deletes a project category.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param id ID of the project category to delete. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user does not have the necessary permission. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project category is not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> removeProjectCategoryWithHttpInfo(Long id) throws ApiException {
        okhttp3.Call localVarCall = removeProjectCategoryValidateBeforeCall(id, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete project category (asynchronously)
     * Deletes a project category.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param id ID of the project category to delete. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user does not have the necessary permission. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project category is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call removeProjectCategoryAsync(Long id, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = removeProjectCategoryValidateBeforeCall(id, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateProjectCategory
     * @param id  (required)
     * @param projectCategory  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if:   *  &#x60;name&#x60; has been modified and exceeds 255 characters.  *  &#x60;description&#x60; has been modified and exceeds 1000 characters. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user does not have the necessary permission. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project category is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProjectCategoryCall(Long id, ProjectCategory projectCategory, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = projectCategory;

        // create path and map variables
        String localVarPath = "/rest/api/3/projectCategory/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

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
    private okhttp3.Call updateProjectCategoryValidateBeforeCall(Long id, ProjectCategory projectCategory, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling updateProjectCategory(Async)");
        }
        
        // verify the required parameter 'projectCategory' is set
        if (projectCategory == null) {
            throw new ApiException("Missing the required parameter 'projectCategory' when calling updateProjectCategory(Async)");
        }
        

        okhttp3.Call localVarCall = updateProjectCategoryCall(id, projectCategory, _callback);
        return localVarCall;

    }

    /**
     * Update project category
     * Updates a project category.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param id  (required)
     * @param projectCategory  (required)
     * @return UpdatedProjectCategory
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if:   *  &#x60;name&#x60; has been modified and exceeds 255 characters.  *  &#x60;description&#x60; has been modified and exceeds 1000 characters. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user does not have the necessary permission. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project category is not found. </td><td>  -  </td></tr>
     </table>
     */
    public UpdatedProjectCategory updateProjectCategory(Long id, ProjectCategory projectCategory) throws ApiException {
        ApiResponse<UpdatedProjectCategory> localVarResp = updateProjectCategoryWithHttpInfo(id, projectCategory);
        return localVarResp.getData();
    }

    /**
     * Update project category
     * Updates a project category.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param id  (required)
     * @param projectCategory  (required)
     * @return ApiResponse&lt;UpdatedProjectCategory&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if:   *  &#x60;name&#x60; has been modified and exceeds 255 characters.  *  &#x60;description&#x60; has been modified and exceeds 1000 characters. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user does not have the necessary permission. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project category is not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<UpdatedProjectCategory> updateProjectCategoryWithHttpInfo(Long id, ProjectCategory projectCategory) throws ApiException {
        okhttp3.Call localVarCall = updateProjectCategoryValidateBeforeCall(id, projectCategory, null);
        Type localVarReturnType = new TypeToken<UpdatedProjectCategory>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update project category (asynchronously)
     * Updates a project category.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param id  (required)
     * @param projectCategory  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if:   *  &#x60;name&#x60; has been modified and exceeds 255 characters.  *  &#x60;description&#x60; has been modified and exceeds 1000 characters. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user does not have the necessary permission. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project category is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateProjectCategoryAsync(Long id, ProjectCategory projectCategory, final ApiCallback<UpdatedProjectCategory> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateProjectCategoryValidateBeforeCall(id, projectCategory, _callback);
        Type localVarReturnType = new TypeToken<UpdatedProjectCategory>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}