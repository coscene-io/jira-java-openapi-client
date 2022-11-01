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

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.coscene.jira.client.v2.ApiCallback;
import io.coscene.jira.client.v2.ApiClient;
import io.coscene.jira.client.v2.ApiException;
import io.coscene.jira.client.v2.ApiResponse;
import io.coscene.jira.client.v2.Configuration;
import io.coscene.jira.client.v2.Pair;
import io.coscene.jira.client.v2.model.ProjectType;

public class ProjectTypesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ProjectTypesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProjectTypesApi(ApiClient apiClient) {
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
     * Build call for getAccessibleProjectTypeByKey
     * @param projectTypeKey The key of the project type. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project type is not accessible to the user. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAccessibleProjectTypeByKeyCall(String projectTypeKey, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/rest/api/2/project/type/{projectTypeKey}/accessible"
            .replaceAll("\\{" + "projectTypeKey" + "\\}", localVarApiClient.escapeString(projectTypeKey.toString()));

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
    private okhttp3.Call getAccessibleProjectTypeByKeyValidateBeforeCall(String projectTypeKey, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'projectTypeKey' is set
        if (projectTypeKey == null) {
            throw new ApiException("Missing the required parameter 'projectTypeKey' when calling getAccessibleProjectTypeByKey(Async)");
        }
        

        okhttp3.Call localVarCall = getAccessibleProjectTypeByKeyCall(projectTypeKey, _callback);
        return localVarCall;

    }

    /**
     * Get accessible project type by key
     * Returns a [project type](https://confluence.atlassian.com/x/Var1Nw) if it is accessible to the user.  **[Permissions](#permissions) required:** Permission to access Jira.
     * @param projectTypeKey The key of the project type. (required)
     * @return ProjectType
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project type is not accessible to the user. </td><td>  -  </td></tr>
     </table>
     */
    public ProjectType getAccessibleProjectTypeByKey(String projectTypeKey) throws ApiException {
        ApiResponse<ProjectType> localVarResp = getAccessibleProjectTypeByKeyWithHttpInfo(projectTypeKey);
        return localVarResp.getData();
    }

    /**
     * Get accessible project type by key
     * Returns a [project type](https://confluence.atlassian.com/x/Var1Nw) if it is accessible to the user.  **[Permissions](#permissions) required:** Permission to access Jira.
     * @param projectTypeKey The key of the project type. (required)
     * @return ApiResponse&lt;ProjectType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project type is not accessible to the user. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProjectType> getAccessibleProjectTypeByKeyWithHttpInfo(String projectTypeKey) throws ApiException {
        okhttp3.Call localVarCall = getAccessibleProjectTypeByKeyValidateBeforeCall(projectTypeKey, null);
        Type localVarReturnType = new TypeToken<ProjectType>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get accessible project type by key (asynchronously)
     * Returns a [project type](https://confluence.atlassian.com/x/Var1Nw) if it is accessible to the user.  **[Permissions](#permissions) required:** Permission to access Jira.
     * @param projectTypeKey The key of the project type. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project type is not accessible to the user. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAccessibleProjectTypeByKeyAsync(String projectTypeKey, final ApiCallback<ProjectType> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAccessibleProjectTypeByKeyValidateBeforeCall(projectTypeKey, _callback);
        Type localVarReturnType = new TypeToken<ProjectType>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAllAccessibleProjectTypes
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAllAccessibleProjectTypesCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/rest/api/2/project/type/accessible";

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
    private okhttp3.Call getAllAccessibleProjectTypesValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getAllAccessibleProjectTypesCall(_callback);
        return localVarCall;

    }

    /**
     * Get licensed project types
     * Returns all [project types](https://confluence.atlassian.com/x/Var1Nw) with a valid license.
     * @return List&lt;ProjectType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
     </table>
     */
    public List<ProjectType> getAllAccessibleProjectTypes() throws ApiException {
        ApiResponse<List<ProjectType>> localVarResp = getAllAccessibleProjectTypesWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get licensed project types
     * Returns all [project types](https://confluence.atlassian.com/x/Var1Nw) with a valid license.
     * @return ApiResponse&lt;List&lt;ProjectType&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ProjectType>> getAllAccessibleProjectTypesWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getAllAccessibleProjectTypesValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<ProjectType>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get licensed project types (asynchronously)
     * Returns all [project types](https://confluence.atlassian.com/x/Var1Nw) with a valid license.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAllAccessibleProjectTypesAsync(final ApiCallback<List<ProjectType>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAllAccessibleProjectTypesValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<ProjectType>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAllProjectTypes
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAllProjectTypesCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/rest/api/2/project/type";

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
    private okhttp3.Call getAllProjectTypesValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getAllProjectTypesCall(_callback);
        return localVarCall;

    }

    /**
     * Get all project types
     * Returns all [project types](https://confluence.atlassian.com/x/Var1Nw), whether or not the instance has a valid license for each type.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     * @return List&lt;ProjectType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect. </td><td>  -  </td></tr>
     </table>
     */
    public List<ProjectType> getAllProjectTypes() throws ApiException {
        ApiResponse<List<ProjectType>> localVarResp = getAllProjectTypesWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get all project types
     * Returns all [project types](https://confluence.atlassian.com/x/Var1Nw), whether or not the instance has a valid license for each type.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     * @return ApiResponse&lt;List&lt;ProjectType&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ProjectType>> getAllProjectTypesWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getAllProjectTypesValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<ProjectType>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get all project types (asynchronously)
     * Returns all [project types](https://confluence.atlassian.com/x/Var1Nw), whether or not the instance has a valid license for each type.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAllProjectTypesAsync(final ApiCallback<List<ProjectType>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAllProjectTypesValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<ProjectType>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getProjectTypeByKey
     * @param projectTypeKey The key of the project type. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project type is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getProjectTypeByKeyCall(String projectTypeKey, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/rest/api/2/project/type/{projectTypeKey}"
            .replaceAll("\\{" + "projectTypeKey" + "\\}", localVarApiClient.escapeString(projectTypeKey.toString()));

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
    private okhttp3.Call getProjectTypeByKeyValidateBeforeCall(String projectTypeKey, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'projectTypeKey' is set
        if (projectTypeKey == null) {
            throw new ApiException("Missing the required parameter 'projectTypeKey' when calling getProjectTypeByKey(Async)");
        }
        

        okhttp3.Call localVarCall = getProjectTypeByKeyCall(projectTypeKey, _callback);
        return localVarCall;

    }

    /**
     * Get project type by key
     * Returns a [project type](https://confluence.atlassian.com/x/Var1Nw).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     * @param projectTypeKey The key of the project type. (required)
     * @return ProjectType
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project type is not found. </td><td>  -  </td></tr>
     </table>
     */
    public ProjectType getProjectTypeByKey(String projectTypeKey) throws ApiException {
        ApiResponse<ProjectType> localVarResp = getProjectTypeByKeyWithHttpInfo(projectTypeKey);
        return localVarResp.getData();
    }

    /**
     * Get project type by key
     * Returns a [project type](https://confluence.atlassian.com/x/Var1Nw).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     * @param projectTypeKey The key of the project type. (required)
     * @return ApiResponse&lt;ProjectType&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project type is not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProjectType> getProjectTypeByKeyWithHttpInfo(String projectTypeKey) throws ApiException {
        okhttp3.Call localVarCall = getProjectTypeByKeyValidateBeforeCall(projectTypeKey, null);
        Type localVarReturnType = new TypeToken<ProjectType>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get project type by key (asynchronously)
     * Returns a [project type](https://confluence.atlassian.com/x/Var1Nw).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     * @param projectTypeKey The key of the project type. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project type is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getProjectTypeByKeyAsync(String projectTypeKey, final ApiCallback<ProjectType> _callback) throws ApiException {

        okhttp3.Call localVarCall = getProjectTypeByKeyValidateBeforeCall(projectTypeKey, _callback);
        Type localVarReturnType = new TypeToken<ProjectType>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
