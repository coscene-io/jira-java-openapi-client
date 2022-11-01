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


import io.coscene.jira.client.v3.model.EntityProperty;
import io.coscene.jira.client.v3.model.OperationMessage;
import io.coscene.jira.client.v3.model.PropertyKeys;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppPropertiesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AppPropertiesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AppPropertiesApi(ApiClient apiClient) {
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
     * Build call for addonPropertiesResourceDeleteAddonPropertyDelete
     * @param addonKey The key of the app, as defined in its descriptor. (required)
     * @param propertyKey The key of the property. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the property key is longer than 127 characters. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the property is not found or doesn&#39;t belong to the app. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addonPropertiesResourceDeleteAddonPropertyDeleteCall(String addonKey, String propertyKey, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/rest/atlassian-connect/1/addons/{addonKey}/properties/{propertyKey}"
            .replaceAll("\\{" + "addonKey" + "\\}", localVarApiClient.escapeString(addonKey.toString()))
            .replaceAll("\\{" + "propertyKey" + "\\}", localVarApiClient.escapeString(propertyKey.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addonPropertiesResourceDeleteAddonPropertyDeleteValidateBeforeCall(String addonKey, String propertyKey, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'addonKey' is set
        if (addonKey == null) {
            throw new ApiException("Missing the required parameter 'addonKey' when calling addonPropertiesResourceDeleteAddonPropertyDelete(Async)");
        }
        
        // verify the required parameter 'propertyKey' is set
        if (propertyKey == null) {
            throw new ApiException("Missing the required parameter 'propertyKey' when calling addonPropertiesResourceDeleteAddonPropertyDelete(Async)");
        }
        

        okhttp3.Call localVarCall = addonPropertiesResourceDeleteAddonPropertyDeleteCall(addonKey, propertyKey, _callback);
        return localVarCall;

    }

    /**
     * Delete app property
     * Deletes an app&#39;s property.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.
     * @param addonKey The key of the app, as defined in its descriptor. (required)
     * @param propertyKey The key of the property. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the property key is longer than 127 characters. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the property is not found or doesn&#39;t belong to the app. </td><td>  -  </td></tr>
     </table>
     */
    public void addonPropertiesResourceDeleteAddonPropertyDelete(String addonKey, String propertyKey) throws ApiException {
        addonPropertiesResourceDeleteAddonPropertyDeleteWithHttpInfo(addonKey, propertyKey);
    }

    /**
     * Delete app property
     * Deletes an app&#39;s property.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.
     * @param addonKey The key of the app, as defined in its descriptor. (required)
     * @param propertyKey The key of the property. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the property key is longer than 127 characters. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the property is not found or doesn&#39;t belong to the app. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> addonPropertiesResourceDeleteAddonPropertyDeleteWithHttpInfo(String addonKey, String propertyKey) throws ApiException {
        okhttp3.Call localVarCall = addonPropertiesResourceDeleteAddonPropertyDeleteValidateBeforeCall(addonKey, propertyKey, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete app property (asynchronously)
     * Deletes an app&#39;s property.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.
     * @param addonKey The key of the app, as defined in its descriptor. (required)
     * @param propertyKey The key of the property. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the property key is longer than 127 characters. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the property is not found or doesn&#39;t belong to the app. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addonPropertiesResourceDeleteAddonPropertyDeleteAsync(String addonKey, String propertyKey, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = addonPropertiesResourceDeleteAddonPropertyDeleteValidateBeforeCall(addonKey, propertyKey, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for addonPropertiesResourceGetAddonPropertiesGet
     * @param addonKey The key of the app, as defined in its descriptor. (required)
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
    public okhttp3.Call addonPropertiesResourceGetAddonPropertiesGetCall(String addonKey, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/rest/atlassian-connect/1/addons/{addonKey}/properties"
            .replaceAll("\\{" + "addonKey" + "\\}", localVarApiClient.escapeString(addonKey.toString()));

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
    private okhttp3.Call addonPropertiesResourceGetAddonPropertiesGetValidateBeforeCall(String addonKey, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'addonKey' is set
        if (addonKey == null) {
            throw new ApiException("Missing the required parameter 'addonKey' when calling addonPropertiesResourceGetAddonPropertiesGet(Async)");
        }
        

        okhttp3.Call localVarCall = addonPropertiesResourceGetAddonPropertiesGetCall(addonKey, _callback);
        return localVarCall;

    }

    /**
     * Get app properties
     * Gets all the properties of an app.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.
     * @param addonKey The key of the app, as defined in its descriptor. (required)
     * @return PropertyKeys
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
     </table>
     */
    public PropertyKeys addonPropertiesResourceGetAddonPropertiesGet(String addonKey) throws ApiException {
        ApiResponse<PropertyKeys> localVarResp = addonPropertiesResourceGetAddonPropertiesGetWithHttpInfo(addonKey);
        return localVarResp.getData();
    }

    /**
     * Get app properties
     * Gets all the properties of an app.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.
     * @param addonKey The key of the app, as defined in its descriptor. (required)
     * @return ApiResponse&lt;PropertyKeys&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PropertyKeys> addonPropertiesResourceGetAddonPropertiesGetWithHttpInfo(String addonKey) throws ApiException {
        okhttp3.Call localVarCall = addonPropertiesResourceGetAddonPropertiesGetValidateBeforeCall(addonKey, null);
        Type localVarReturnType = new TypeToken<PropertyKeys>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get app properties (asynchronously)
     * Gets all the properties of an app.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.
     * @param addonKey The key of the app, as defined in its descriptor. (required)
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
    public okhttp3.Call addonPropertiesResourceGetAddonPropertiesGetAsync(String addonKey, final ApiCallback<PropertyKeys> _callback) throws ApiException {

        okhttp3.Call localVarCall = addonPropertiesResourceGetAddonPropertiesGetValidateBeforeCall(addonKey, _callback);
        Type localVarReturnType = new TypeToken<PropertyKeys>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for addonPropertiesResourceGetAddonPropertyGet
     * @param addonKey The key of the app, as defined in its descriptor. (required)
     * @param propertyKey The key of the property. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the property key is longer than 127 characters. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the property is not found or doesn&#39;t belong to the app. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addonPropertiesResourceGetAddonPropertyGetCall(String addonKey, String propertyKey, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/rest/atlassian-connect/1/addons/{addonKey}/properties/{propertyKey}"
            .replaceAll("\\{" + "addonKey" + "\\}", localVarApiClient.escapeString(addonKey.toString()))
            .replaceAll("\\{" + "propertyKey" + "\\}", localVarApiClient.escapeString(propertyKey.toString()));

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
    private okhttp3.Call addonPropertiesResourceGetAddonPropertyGetValidateBeforeCall(String addonKey, String propertyKey, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'addonKey' is set
        if (addonKey == null) {
            throw new ApiException("Missing the required parameter 'addonKey' when calling addonPropertiesResourceGetAddonPropertyGet(Async)");
        }
        
        // verify the required parameter 'propertyKey' is set
        if (propertyKey == null) {
            throw new ApiException("Missing the required parameter 'propertyKey' when calling addonPropertiesResourceGetAddonPropertyGet(Async)");
        }
        

        okhttp3.Call localVarCall = addonPropertiesResourceGetAddonPropertyGetCall(addonKey, propertyKey, _callback);
        return localVarCall;

    }

    /**
     * Get app property
     * Returns the key and value of an app&#39;s property.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.
     * @param addonKey The key of the app, as defined in its descriptor. (required)
     * @param propertyKey The key of the property. (required)
     * @return EntityProperty
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the property key is longer than 127 characters. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the property is not found or doesn&#39;t belong to the app. </td><td>  -  </td></tr>
     </table>
     */
    public EntityProperty addonPropertiesResourceGetAddonPropertyGet(String addonKey, String propertyKey) throws ApiException {
        ApiResponse<EntityProperty> localVarResp = addonPropertiesResourceGetAddonPropertyGetWithHttpInfo(addonKey, propertyKey);
        return localVarResp.getData();
    }

    /**
     * Get app property
     * Returns the key and value of an app&#39;s property.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.
     * @param addonKey The key of the app, as defined in its descriptor. (required)
     * @param propertyKey The key of the property. (required)
     * @return ApiResponse&lt;EntityProperty&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the property key is longer than 127 characters. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the property is not found or doesn&#39;t belong to the app. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EntityProperty> addonPropertiesResourceGetAddonPropertyGetWithHttpInfo(String addonKey, String propertyKey) throws ApiException {
        okhttp3.Call localVarCall = addonPropertiesResourceGetAddonPropertyGetValidateBeforeCall(addonKey, propertyKey, null);
        Type localVarReturnType = new TypeToken<EntityProperty>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get app property (asynchronously)
     * Returns the key and value of an app&#39;s property.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.
     * @param addonKey The key of the app, as defined in its descriptor. (required)
     * @param propertyKey The key of the property. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the property key is longer than 127 characters. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the property is not found or doesn&#39;t belong to the app. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addonPropertiesResourceGetAddonPropertyGetAsync(String addonKey, String propertyKey, final ApiCallback<EntityProperty> _callback) throws ApiException {

        okhttp3.Call localVarCall = addonPropertiesResourceGetAddonPropertyGetValidateBeforeCall(addonKey, propertyKey, _callback);
        Type localVarReturnType = new TypeToken<EntityProperty>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for addonPropertiesResourcePutAddonPropertyPut
     * @param addonKey The key of the app, as defined in its descriptor. (required)
     * @param propertyKey The key of the property. (required)
     * @param body  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the property is updated. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Returned is the property is created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if:   * the property key is longer than 127 characters.   * the value is not valid JSON.   * the value is longer than 32768 characters. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addonPropertiesResourcePutAddonPropertyPutCall(String addonKey, String propertyKey, Object body, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/rest/atlassian-connect/1/addons/{addonKey}/properties/{propertyKey}"
            .replaceAll("\\{" + "addonKey" + "\\}", localVarApiClient.escapeString(addonKey.toString()))
            .replaceAll("\\{" + "propertyKey" + "\\}", localVarApiClient.escapeString(propertyKey.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addonPropertiesResourcePutAddonPropertyPutValidateBeforeCall(String addonKey, String propertyKey, Object body, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'addonKey' is set
        if (addonKey == null) {
            throw new ApiException("Missing the required parameter 'addonKey' when calling addonPropertiesResourcePutAddonPropertyPut(Async)");
        }
        
        // verify the required parameter 'propertyKey' is set
        if (propertyKey == null) {
            throw new ApiException("Missing the required parameter 'propertyKey' when calling addonPropertiesResourcePutAddonPropertyPut(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addonPropertiesResourcePutAddonPropertyPut(Async)");
        }
        

        okhttp3.Call localVarCall = addonPropertiesResourcePutAddonPropertyPutCall(addonKey, propertyKey, body, _callback);
        return localVarCall;

    }

    /**
     * Set app property
     * Sets the value of an app&#39;s property. Use this resource to store custom data for your app.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.
     * @param addonKey The key of the app, as defined in its descriptor. (required)
     * @param propertyKey The key of the property. (required)
     * @param body  (required)
     * @return OperationMessage
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the property is updated. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Returned is the property is created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if:   * the property key is longer than 127 characters.   * the value is not valid JSON.   * the value is longer than 32768 characters. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
     </table>
     */
    public OperationMessage addonPropertiesResourcePutAddonPropertyPut(String addonKey, String propertyKey, Object body) throws ApiException {
        ApiResponse<OperationMessage> localVarResp = addonPropertiesResourcePutAddonPropertyPutWithHttpInfo(addonKey, propertyKey, body);
        return localVarResp.getData();
    }

    /**
     * Set app property
     * Sets the value of an app&#39;s property. Use this resource to store custom data for your app.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.
     * @param addonKey The key of the app, as defined in its descriptor. (required)
     * @param propertyKey The key of the property. (required)
     * @param body  (required)
     * @return ApiResponse&lt;OperationMessage&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the property is updated. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Returned is the property is created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if:   * the property key is longer than 127 characters.   * the value is not valid JSON.   * the value is longer than 32768 characters. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<OperationMessage> addonPropertiesResourcePutAddonPropertyPutWithHttpInfo(String addonKey, String propertyKey, Object body) throws ApiException {
        okhttp3.Call localVarCall = addonPropertiesResourcePutAddonPropertyPutValidateBeforeCall(addonKey, propertyKey, body, null);
        Type localVarReturnType = new TypeToken<OperationMessage>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Set app property (asynchronously)
     * Sets the value of an app&#39;s property. Use this resource to store custom data for your app.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.
     * @param addonKey The key of the app, as defined in its descriptor. (required)
     * @param propertyKey The key of the property. (required)
     * @param body  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the property is updated. </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Returned is the property is created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if:   * the property key is longer than 127 characters.   * the value is not valid JSON.   * the value is longer than 32768 characters. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addonPropertiesResourcePutAddonPropertyPutAsync(String addonKey, String propertyKey, Object body, final ApiCallback<OperationMessage> _callback) throws ApiException {

        okhttp3.Call localVarCall = addonPropertiesResourcePutAddonPropertyPutValidateBeforeCall(addonKey, propertyKey, body, _callback);
        Type localVarReturnType = new TypeToken<OperationMessage>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
