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


import io.coscene.jira.client.v3.model.ConnectModules;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DynamicModulesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DynamicModulesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DynamicModulesApi(ApiClient apiClient) {
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
     * Build call for dynamicModulesResourceGetModulesGet
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the call is not from a Connect app. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call dynamicModulesResourceGetModulesGetCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/rest/atlassian-connect/1/app/module/dynamic";

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

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call dynamicModulesResourceGetModulesGetValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = dynamicModulesResourceGetModulesGetCall(_callback);
        return localVarCall;

    }

    /**
     * Get modules
     * Returns all modules registered dynamically by the calling app.  **[Permissions](#permissions) required:** Only Connect apps can make this request.
     * @return ConnectModules
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the call is not from a Connect app. </td><td>  -  </td></tr>
     </table>
     */
    public ConnectModules dynamicModulesResourceGetModulesGet() throws ApiException {
        ApiResponse<ConnectModules> localVarResp = dynamicModulesResourceGetModulesGetWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get modules
     * Returns all modules registered dynamically by the calling app.  **[Permissions](#permissions) required:** Only Connect apps can make this request.
     * @return ApiResponse&lt;ConnectModules&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the call is not from a Connect app. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ConnectModules> dynamicModulesResourceGetModulesGetWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = dynamicModulesResourceGetModulesGetValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<ConnectModules>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get modules (asynchronously)
     * Returns all modules registered dynamically by the calling app.  **[Permissions](#permissions) required:** Only Connect apps can make this request.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the call is not from a Connect app. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call dynamicModulesResourceGetModulesGetAsync(final ApiCallback<ConnectModules> _callback) throws ApiException {

        okhttp3.Call localVarCall = dynamicModulesResourceGetModulesGetValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<ConnectModules>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for dynamicModulesResourceRegisterModulesPost
     * @param connectModules  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if: * any of the provided modules is invalid. For example, required properties are missing. * any of the modules conflict with registered dynamic modules or modules defined in the app descriptor. For example, there are duplicate keys.  Details of the issues encountered are included in the error message. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the call is not from a Connect app. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call dynamicModulesResourceRegisterModulesPostCall(ConnectModules connectModules, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = connectModules;

        // create path and map variables
        String localVarPath = "/rest/atlassian-connect/1/app/module/dynamic";

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

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call dynamicModulesResourceRegisterModulesPostValidateBeforeCall(ConnectModules connectModules, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'connectModules' is set
        if (connectModules == null) {
            throw new ApiException("Missing the required parameter 'connectModules' when calling dynamicModulesResourceRegisterModulesPost(Async)");
        }
        

        okhttp3.Call localVarCall = dynamicModulesResourceRegisterModulesPostCall(connectModules, _callback);
        return localVarCall;

    }

    /**
     * Register modules
     * Registers a list of modules.  **[Permissions](#permissions) required:** Only Connect apps can make this request.
     * @param connectModules  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if: * any of the provided modules is invalid. For example, required properties are missing. * any of the modules conflict with registered dynamic modules or modules defined in the app descriptor. For example, there are duplicate keys.  Details of the issues encountered are included in the error message. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the call is not from a Connect app. </td><td>  -  </td></tr>
     </table>
     */
    public void dynamicModulesResourceRegisterModulesPost(ConnectModules connectModules) throws ApiException {
        dynamicModulesResourceRegisterModulesPostWithHttpInfo(connectModules);
    }

    /**
     * Register modules
     * Registers a list of modules.  **[Permissions](#permissions) required:** Only Connect apps can make this request.
     * @param connectModules  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if: * any of the provided modules is invalid. For example, required properties are missing. * any of the modules conflict with registered dynamic modules or modules defined in the app descriptor. For example, there are duplicate keys.  Details of the issues encountered are included in the error message. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the call is not from a Connect app. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> dynamicModulesResourceRegisterModulesPostWithHttpInfo(ConnectModules connectModules) throws ApiException {
        okhttp3.Call localVarCall = dynamicModulesResourceRegisterModulesPostValidateBeforeCall(connectModules, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Register modules (asynchronously)
     * Registers a list of modules.  **[Permissions](#permissions) required:** Only Connect apps can make this request.
     * @param connectModules  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if: * any of the provided modules is invalid. For example, required properties are missing. * any of the modules conflict with registered dynamic modules or modules defined in the app descriptor. For example, there are duplicate keys.  Details of the issues encountered are included in the error message. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the call is not from a Connect app. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call dynamicModulesResourceRegisterModulesPostAsync(ConnectModules connectModules, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = dynamicModulesResourceRegisterModulesPostValidateBeforeCall(connectModules, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for dynamicModulesResourceRemoveModulesDelete
     * @param moduleKey The key of the module to remove. To include multiple module keys, provide multiple copies of this parameter. For example, &#x60;moduleKey&#x3D;dynamic-attachment-entity-property&amp;moduleKey&#x3D;dynamic-select-field&#x60;. Nonexistent keys are ignored. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the call is not from a Connect app. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call dynamicModulesResourceRemoveModulesDeleteCall(List<String> moduleKey, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/rest/atlassian-connect/1/app/module/dynamic";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (moduleKey != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "moduleKey", moduleKey));
        }

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

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call dynamicModulesResourceRemoveModulesDeleteValidateBeforeCall(List<String> moduleKey, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = dynamicModulesResourceRemoveModulesDeleteCall(moduleKey, _callback);
        return localVarCall;

    }

    /**
     * Remove modules
     * Remove all or a list of modules registered by the calling app.  **[Permissions](#permissions) required:** Only Connect apps can make this request.
     * @param moduleKey The key of the module to remove. To include multiple module keys, provide multiple copies of this parameter. For example, &#x60;moduleKey&#x3D;dynamic-attachment-entity-property&amp;moduleKey&#x3D;dynamic-select-field&#x60;. Nonexistent keys are ignored. (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the call is not from a Connect app. </td><td>  -  </td></tr>
     </table>
     */
    public void dynamicModulesResourceRemoveModulesDelete(List<String> moduleKey) throws ApiException {
        dynamicModulesResourceRemoveModulesDeleteWithHttpInfo(moduleKey);
    }

    /**
     * Remove modules
     * Remove all or a list of modules registered by the calling app.  **[Permissions](#permissions) required:** Only Connect apps can make this request.
     * @param moduleKey The key of the module to remove. To include multiple module keys, provide multiple copies of this parameter. For example, &#x60;moduleKey&#x3D;dynamic-attachment-entity-property&amp;moduleKey&#x3D;dynamic-select-field&#x60;. Nonexistent keys are ignored. (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the call is not from a Connect app. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> dynamicModulesResourceRemoveModulesDeleteWithHttpInfo(List<String> moduleKey) throws ApiException {
        okhttp3.Call localVarCall = dynamicModulesResourceRemoveModulesDeleteValidateBeforeCall(moduleKey, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Remove modules (asynchronously)
     * Remove all or a list of modules registered by the calling app.  **[Permissions](#permissions) required:** Only Connect apps can make this request.
     * @param moduleKey The key of the module to remove. To include multiple module keys, provide multiple copies of this parameter. For example, &#x60;moduleKey&#x3D;dynamic-attachment-entity-property&amp;moduleKey&#x3D;dynamic-select-field&#x60;. Nonexistent keys are ignored. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the call is not from a Connect app. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call dynamicModulesResourceRemoveModulesDeleteAsync(List<String> moduleKey, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = dynamicModulesResourceRemoveModulesDeleteValidateBeforeCall(moduleKey, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}