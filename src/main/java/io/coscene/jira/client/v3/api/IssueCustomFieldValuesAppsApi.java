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


import io.coscene.jira.client.v3.model.CustomFieldValueUpdateDetails;
import io.coscene.jira.client.v3.model.MultipleCustomFieldValuesUpdateDetails;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IssueCustomFieldValuesAppsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public IssueCustomFieldValuesAppsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public IssueCustomFieldValuesAppsApi(ApiClient apiClient) {
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
     * Build call for updateCustomFieldValue
     * @param fieldIdOrKey The ID or key of the custom field. For example, &#x60;customfield_10010&#x60;. (required)
     * @param customFieldValueUpdateDetails  (required)
     * @param generateChangelog Whether to generate a changelog for this update. (optional, default to true)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the request is not authenticated as the app that provided the field. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the field is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateCustomFieldValueCall(String fieldIdOrKey, CustomFieldValueUpdateDetails customFieldValueUpdateDetails, Boolean generateChangelog, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = customFieldValueUpdateDetails;

        // create path and map variables
        String localVarPath = "/rest/api/3/app/field/{fieldIdOrKey}/value"
            .replaceAll("\\{" + "fieldIdOrKey" + "\\}", localVarApiClient.escapeString(fieldIdOrKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (generateChangelog != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("generateChangelog", generateChangelog));
        }

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
    private okhttp3.Call updateCustomFieldValueValidateBeforeCall(String fieldIdOrKey, CustomFieldValueUpdateDetails customFieldValueUpdateDetails, Boolean generateChangelog, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'fieldIdOrKey' is set
        if (fieldIdOrKey == null) {
            throw new ApiException("Missing the required parameter 'fieldIdOrKey' when calling updateCustomFieldValue(Async)");
        }
        
        // verify the required parameter 'customFieldValueUpdateDetails' is set
        if (customFieldValueUpdateDetails == null) {
            throw new ApiException("Missing the required parameter 'customFieldValueUpdateDetails' when calling updateCustomFieldValue(Async)");
        }
        

        okhttp3.Call localVarCall = updateCustomFieldValueCall(fieldIdOrKey, customFieldValueUpdateDetails, generateChangelog, _callback);
        return localVarCall;

    }

    /**
     * Update custom field value
     * Updates the value of a custom field on one or more issues. Custom fields can only be updated by the Forge app that created them.  **[Permissions](#permissions) required:** Only the app that created the custom field can update its values with this operation.
     * @param fieldIdOrKey The ID or key of the custom field. For example, &#x60;customfield_10010&#x60;. (required)
     * @param customFieldValueUpdateDetails  (required)
     * @param generateChangelog Whether to generate a changelog for this update. (optional, default to true)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the request is not authenticated as the app that provided the field. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the field is not found. </td><td>  -  </td></tr>
     </table>
     */
    public Object updateCustomFieldValue(String fieldIdOrKey, CustomFieldValueUpdateDetails customFieldValueUpdateDetails, Boolean generateChangelog) throws ApiException {
        ApiResponse<Object> localVarResp = updateCustomFieldValueWithHttpInfo(fieldIdOrKey, customFieldValueUpdateDetails, generateChangelog);
        return localVarResp.getData();
    }

    /**
     * Update custom field value
     * Updates the value of a custom field on one or more issues. Custom fields can only be updated by the Forge app that created them.  **[Permissions](#permissions) required:** Only the app that created the custom field can update its values with this operation.
     * @param fieldIdOrKey The ID or key of the custom field. For example, &#x60;customfield_10010&#x60;. (required)
     * @param customFieldValueUpdateDetails  (required)
     * @param generateChangelog Whether to generate a changelog for this update. (optional, default to true)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the request is not authenticated as the app that provided the field. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the field is not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> updateCustomFieldValueWithHttpInfo(String fieldIdOrKey, CustomFieldValueUpdateDetails customFieldValueUpdateDetails, Boolean generateChangelog) throws ApiException {
        okhttp3.Call localVarCall = updateCustomFieldValueValidateBeforeCall(fieldIdOrKey, customFieldValueUpdateDetails, generateChangelog, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update custom field value (asynchronously)
     * Updates the value of a custom field on one or more issues. Custom fields can only be updated by the Forge app that created them.  **[Permissions](#permissions) required:** Only the app that created the custom field can update its values with this operation.
     * @param fieldIdOrKey The ID or key of the custom field. For example, &#x60;customfield_10010&#x60;. (required)
     * @param customFieldValueUpdateDetails  (required)
     * @param generateChangelog Whether to generate a changelog for this update. (optional, default to true)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the request is not authenticated as the app that provided the field. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the field is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateCustomFieldValueAsync(String fieldIdOrKey, CustomFieldValueUpdateDetails customFieldValueUpdateDetails, Boolean generateChangelog, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateCustomFieldValueValidateBeforeCall(fieldIdOrKey, customFieldValueUpdateDetails, generateChangelog, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateMultipleCustomFieldValues
     * @param multipleCustomFieldValuesUpdateDetails  (required)
     * @param generateChangelog Whether to generate a changelog for this update. (optional, default to true)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the request is not authenticated as the app that provided all the fields. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if any field is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateMultipleCustomFieldValuesCall(MultipleCustomFieldValuesUpdateDetails multipleCustomFieldValuesUpdateDetails, Boolean generateChangelog, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = multipleCustomFieldValuesUpdateDetails;

        // create path and map variables
        String localVarPath = "/rest/api/3/app/field/value";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (generateChangelog != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("generateChangelog", generateChangelog));
        }

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
    private okhttp3.Call updateMultipleCustomFieldValuesValidateBeforeCall(MultipleCustomFieldValuesUpdateDetails multipleCustomFieldValuesUpdateDetails, Boolean generateChangelog, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'multipleCustomFieldValuesUpdateDetails' is set
        if (multipleCustomFieldValuesUpdateDetails == null) {
            throw new ApiException("Missing the required parameter 'multipleCustomFieldValuesUpdateDetails' when calling updateMultipleCustomFieldValues(Async)");
        }
        

        okhttp3.Call localVarCall = updateMultipleCustomFieldValuesCall(multipleCustomFieldValuesUpdateDetails, generateChangelog, _callback);
        return localVarCall;

    }

    /**
     * Update custom fields
     * Updates the value of one or more custom fields on one or more issues. Combinations of custom field and issue should be unique within the request. Custom fields can only be updated by the Forge app that created them.  **[Permissions](#permissions) required:** Only the app that created the custom field can update its values with this operation.
     * @param multipleCustomFieldValuesUpdateDetails  (required)
     * @param generateChangelog Whether to generate a changelog for this update. (optional, default to true)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the request is not authenticated as the app that provided all the fields. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if any field is not found. </td><td>  -  </td></tr>
     </table>
     */
    public Object updateMultipleCustomFieldValues(MultipleCustomFieldValuesUpdateDetails multipleCustomFieldValuesUpdateDetails, Boolean generateChangelog) throws ApiException {
        ApiResponse<Object> localVarResp = updateMultipleCustomFieldValuesWithHttpInfo(multipleCustomFieldValuesUpdateDetails, generateChangelog);
        return localVarResp.getData();
    }

    /**
     * Update custom fields
     * Updates the value of one or more custom fields on one or more issues. Combinations of custom field and issue should be unique within the request. Custom fields can only be updated by the Forge app that created them.  **[Permissions](#permissions) required:** Only the app that created the custom field can update its values with this operation.
     * @param multipleCustomFieldValuesUpdateDetails  (required)
     * @param generateChangelog Whether to generate a changelog for this update. (optional, default to true)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the request is not authenticated as the app that provided all the fields. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if any field is not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> updateMultipleCustomFieldValuesWithHttpInfo(MultipleCustomFieldValuesUpdateDetails multipleCustomFieldValuesUpdateDetails, Boolean generateChangelog) throws ApiException {
        okhttp3.Call localVarCall = updateMultipleCustomFieldValuesValidateBeforeCall(multipleCustomFieldValuesUpdateDetails, generateChangelog, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update custom fields (asynchronously)
     * Updates the value of one or more custom fields on one or more issues. Combinations of custom field and issue should be unique within the request. Custom fields can only be updated by the Forge app that created them.  **[Permissions](#permissions) required:** Only the app that created the custom field can update its values with this operation.
     * @param multipleCustomFieldValuesUpdateDetails  (required)
     * @param generateChangelog Whether to generate a changelog for this update. (optional, default to true)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the request is not authenticated as the app that provided all the fields. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if any field is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateMultipleCustomFieldValuesAsync(MultipleCustomFieldValuesUpdateDetails multipleCustomFieldValuesUpdateDetails, Boolean generateChangelog, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateMultipleCustomFieldValuesValidateBeforeCall(multipleCustomFieldValuesUpdateDetails, generateChangelog, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
