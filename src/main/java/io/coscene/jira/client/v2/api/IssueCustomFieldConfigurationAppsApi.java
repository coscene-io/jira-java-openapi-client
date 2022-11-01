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
import java.util.Set;
import io.coscene.jira.client.v2.ApiCallback;
import io.coscene.jira.client.v2.ApiClient;
import io.coscene.jira.client.v2.ApiException;
import io.coscene.jira.client.v2.ApiResponse;
import io.coscene.jira.client.v2.Configuration;
import io.coscene.jira.client.v2.Pair;
import io.coscene.jira.client.v2.model.CustomFieldConfigurations;
import io.coscene.jira.client.v2.model.PageBeanContextualConfiguration;

public class IssueCustomFieldConfigurationAppsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public IssueCustomFieldConfigurationAppsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public IssueCustomFieldConfigurationAppsApi(ApiClient apiClient) {
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
     * Build call for getCustomFieldConfiguration
     * @param fieldIdOrKey The ID or key of the custom field, for example &#x60;customfield_10000&#x60;. (required)
     * @param id The list of configuration IDs. To include multiple configurations, separate IDs with an ampersand: &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;. Can&#39;t be provided with &#x60;fieldContextId&#x60;, &#x60;issueId&#x60;, &#x60;projectKeyOrId&#x60;, or &#x60;issueTypeId&#x60;. (optional)
     * @param fieldContextId The list of field context IDs. To include multiple field contexts, separate IDs with an ampersand: &#x60;fieldContextId&#x3D;10000&amp;fieldContextId&#x3D;10001&#x60;. Can&#39;t be provided with &#x60;id&#x60;, &#x60;issueId&#x60;, &#x60;projectKeyOrId&#x60;, or &#x60;issueTypeId&#x60;. (optional)
     * @param issueId The ID of the issue to filter results by. If the issue doesn&#39;t exist, an empty list is returned. Can&#39;t be provided with &#x60;projectKeyOrId&#x60;, or &#x60;issueTypeId&#x60;. (optional)
     * @param projectKeyOrId The ID or key of the project to filter results by. Must be provided with &#x60;issueTypeId&#x60;. Can&#39;t be provided with &#x60;issueId&#x60;. (optional)
     * @param issueTypeId The ID of the issue type to filter results by. Must be provided with &#x60;projectKeyOrId&#x60;. Can&#39;t be provided with &#x60;issueId&#x60;. (optional)
     * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
     * @param maxResults The maximum number of items to return per page. (optional, default to 100)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user is not a Jira admin or the request is not authenticated as from the app that provided the field. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the custom field is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCustomFieldConfigurationCall(String fieldIdOrKey, Set<Long> id, Set<Long> fieldContextId, Long issueId, String projectKeyOrId, String issueTypeId, Long startAt, Integer maxResults, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/rest/api/2/app/field/{fieldIdOrKey}/context/configuration"
            .replaceAll("\\{" + "fieldIdOrKey" + "\\}", localVarApiClient.escapeString(fieldIdOrKey.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (id != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "id", id));
        }

        if (fieldContextId != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "fieldContextId", fieldContextId));
        }

        if (issueId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("issueId", issueId));
        }

        if (projectKeyOrId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("projectKeyOrId", projectKeyOrId));
        }

        if (issueTypeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("issueTypeId", issueTypeId));
        }

        if (startAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("startAt", startAt));
        }

        if (maxResults != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("maxResults", maxResults));
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

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCustomFieldConfigurationValidateBeforeCall(String fieldIdOrKey, Set<Long> id, Set<Long> fieldContextId, Long issueId, String projectKeyOrId, String issueTypeId, Long startAt, Integer maxResults, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'fieldIdOrKey' is set
        if (fieldIdOrKey == null) {
            throw new ApiException("Missing the required parameter 'fieldIdOrKey' when calling getCustomFieldConfiguration(Async)");
        }
        

        okhttp3.Call localVarCall = getCustomFieldConfigurationCall(fieldIdOrKey, id, fieldContextId, issueId, projectKeyOrId, issueTypeId, startAt, maxResults, _callback);
        return localVarCall;

    }

    /**
     * Get custom field configurations
     * Returns a [paginated](#pagination) list of configurations for a custom field created by a [Forge app](https://developer.atlassian.com/platform/forge/).  The result can be filtered by one of these criteria:   *  &#x60;id&#x60;.  *  &#x60;fieldContextId&#x60;.  *  &#x60;issueId&#x60;.  *  &#x60;projectKeyOrId&#x60; and &#x60;issueTypeId&#x60;.  Otherwise, all configurations are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the Forge app that created the custom field.
     * @param fieldIdOrKey The ID or key of the custom field, for example &#x60;customfield_10000&#x60;. (required)
     * @param id The list of configuration IDs. To include multiple configurations, separate IDs with an ampersand: &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;. Can&#39;t be provided with &#x60;fieldContextId&#x60;, &#x60;issueId&#x60;, &#x60;projectKeyOrId&#x60;, or &#x60;issueTypeId&#x60;. (optional)
     * @param fieldContextId The list of field context IDs. To include multiple field contexts, separate IDs with an ampersand: &#x60;fieldContextId&#x3D;10000&amp;fieldContextId&#x3D;10001&#x60;. Can&#39;t be provided with &#x60;id&#x60;, &#x60;issueId&#x60;, &#x60;projectKeyOrId&#x60;, or &#x60;issueTypeId&#x60;. (optional)
     * @param issueId The ID of the issue to filter results by. If the issue doesn&#39;t exist, an empty list is returned. Can&#39;t be provided with &#x60;projectKeyOrId&#x60;, or &#x60;issueTypeId&#x60;. (optional)
     * @param projectKeyOrId The ID or key of the project to filter results by. Must be provided with &#x60;issueTypeId&#x60;. Can&#39;t be provided with &#x60;issueId&#x60;. (optional)
     * @param issueTypeId The ID of the issue type to filter results by. Must be provided with &#x60;projectKeyOrId&#x60;. Can&#39;t be provided with &#x60;issueId&#x60;. (optional)
     * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
     * @param maxResults The maximum number of items to return per page. (optional, default to 100)
     * @return PageBeanContextualConfiguration
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user is not a Jira admin or the request is not authenticated as from the app that provided the field. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the custom field is not found. </td><td>  -  </td></tr>
     </table>
     */
    public PageBeanContextualConfiguration getCustomFieldConfiguration(String fieldIdOrKey, Set<Long> id, Set<Long> fieldContextId, Long issueId, String projectKeyOrId, String issueTypeId, Long startAt, Integer maxResults) throws ApiException {
        ApiResponse<PageBeanContextualConfiguration> localVarResp = getCustomFieldConfigurationWithHttpInfo(fieldIdOrKey, id, fieldContextId, issueId, projectKeyOrId, issueTypeId, startAt, maxResults);
        return localVarResp.getData();
    }

    /**
     * Get custom field configurations
     * Returns a [paginated](#pagination) list of configurations for a custom field created by a [Forge app](https://developer.atlassian.com/platform/forge/).  The result can be filtered by one of these criteria:   *  &#x60;id&#x60;.  *  &#x60;fieldContextId&#x60;.  *  &#x60;issueId&#x60;.  *  &#x60;projectKeyOrId&#x60; and &#x60;issueTypeId&#x60;.  Otherwise, all configurations are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the Forge app that created the custom field.
     * @param fieldIdOrKey The ID or key of the custom field, for example &#x60;customfield_10000&#x60;. (required)
     * @param id The list of configuration IDs. To include multiple configurations, separate IDs with an ampersand: &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;. Can&#39;t be provided with &#x60;fieldContextId&#x60;, &#x60;issueId&#x60;, &#x60;projectKeyOrId&#x60;, or &#x60;issueTypeId&#x60;. (optional)
     * @param fieldContextId The list of field context IDs. To include multiple field contexts, separate IDs with an ampersand: &#x60;fieldContextId&#x3D;10000&amp;fieldContextId&#x3D;10001&#x60;. Can&#39;t be provided with &#x60;id&#x60;, &#x60;issueId&#x60;, &#x60;projectKeyOrId&#x60;, or &#x60;issueTypeId&#x60;. (optional)
     * @param issueId The ID of the issue to filter results by. If the issue doesn&#39;t exist, an empty list is returned. Can&#39;t be provided with &#x60;projectKeyOrId&#x60;, or &#x60;issueTypeId&#x60;. (optional)
     * @param projectKeyOrId The ID or key of the project to filter results by. Must be provided with &#x60;issueTypeId&#x60;. Can&#39;t be provided with &#x60;issueId&#x60;. (optional)
     * @param issueTypeId The ID of the issue type to filter results by. Must be provided with &#x60;projectKeyOrId&#x60;. Can&#39;t be provided with &#x60;issueId&#x60;. (optional)
     * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
     * @param maxResults The maximum number of items to return per page. (optional, default to 100)
     * @return ApiResponse&lt;PageBeanContextualConfiguration&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user is not a Jira admin or the request is not authenticated as from the app that provided the field. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the custom field is not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PageBeanContextualConfiguration> getCustomFieldConfigurationWithHttpInfo(String fieldIdOrKey, Set<Long> id, Set<Long> fieldContextId, Long issueId, String projectKeyOrId, String issueTypeId, Long startAt, Integer maxResults) throws ApiException {
        okhttp3.Call localVarCall = getCustomFieldConfigurationValidateBeforeCall(fieldIdOrKey, id, fieldContextId, issueId, projectKeyOrId, issueTypeId, startAt, maxResults, null);
        Type localVarReturnType = new TypeToken<PageBeanContextualConfiguration>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get custom field configurations (asynchronously)
     * Returns a [paginated](#pagination) list of configurations for a custom field created by a [Forge app](https://developer.atlassian.com/platform/forge/).  The result can be filtered by one of these criteria:   *  &#x60;id&#x60;.  *  &#x60;fieldContextId&#x60;.  *  &#x60;issueId&#x60;.  *  &#x60;projectKeyOrId&#x60; and &#x60;issueTypeId&#x60;.  Otherwise, all configurations are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the Forge app that created the custom field.
     * @param fieldIdOrKey The ID or key of the custom field, for example &#x60;customfield_10000&#x60;. (required)
     * @param id The list of configuration IDs. To include multiple configurations, separate IDs with an ampersand: &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;. Can&#39;t be provided with &#x60;fieldContextId&#x60;, &#x60;issueId&#x60;, &#x60;projectKeyOrId&#x60;, or &#x60;issueTypeId&#x60;. (optional)
     * @param fieldContextId The list of field context IDs. To include multiple field contexts, separate IDs with an ampersand: &#x60;fieldContextId&#x3D;10000&amp;fieldContextId&#x3D;10001&#x60;. Can&#39;t be provided with &#x60;id&#x60;, &#x60;issueId&#x60;, &#x60;projectKeyOrId&#x60;, or &#x60;issueTypeId&#x60;. (optional)
     * @param issueId The ID of the issue to filter results by. If the issue doesn&#39;t exist, an empty list is returned. Can&#39;t be provided with &#x60;projectKeyOrId&#x60;, or &#x60;issueTypeId&#x60;. (optional)
     * @param projectKeyOrId The ID or key of the project to filter results by. Must be provided with &#x60;issueTypeId&#x60;. Can&#39;t be provided with &#x60;issueId&#x60;. (optional)
     * @param issueTypeId The ID of the issue type to filter results by. Must be provided with &#x60;projectKeyOrId&#x60;. Can&#39;t be provided with &#x60;issueId&#x60;. (optional)
     * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
     * @param maxResults The maximum number of items to return per page. (optional, default to 100)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user is not a Jira admin or the request is not authenticated as from the app that provided the field. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the custom field is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCustomFieldConfigurationAsync(String fieldIdOrKey, Set<Long> id, Set<Long> fieldContextId, Long issueId, String projectKeyOrId, String issueTypeId, Long startAt, Integer maxResults, final ApiCallback<PageBeanContextualConfiguration> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCustomFieldConfigurationValidateBeforeCall(fieldIdOrKey, id, fieldContextId, issueId, projectKeyOrId, issueTypeId, startAt, maxResults, _callback);
        Type localVarReturnType = new TypeToken<PageBeanContextualConfiguration>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateCustomFieldConfiguration
     * @param fieldIdOrKey The ID or key of the custom field, for example &#x60;customfield_10000&#x60;. (required)
     * @param customFieldConfigurations  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user is not a Jira admin or the request is not authenticated as from the app that provided the field. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the custom field is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateCustomFieldConfigurationCall(String fieldIdOrKey, CustomFieldConfigurations customFieldConfigurations, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = customFieldConfigurations;

        // create path and map variables
        String localVarPath = "/rest/api/2/app/field/{fieldIdOrKey}/context/configuration"
            .replaceAll("\\{" + "fieldIdOrKey" + "\\}", localVarApiClient.escapeString(fieldIdOrKey.toString()));

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
    private okhttp3.Call updateCustomFieldConfigurationValidateBeforeCall(String fieldIdOrKey, CustomFieldConfigurations customFieldConfigurations, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'fieldIdOrKey' is set
        if (fieldIdOrKey == null) {
            throw new ApiException("Missing the required parameter 'fieldIdOrKey' when calling updateCustomFieldConfiguration(Async)");
        }
        
        // verify the required parameter 'customFieldConfigurations' is set
        if (customFieldConfigurations == null) {
            throw new ApiException("Missing the required parameter 'customFieldConfigurations' when calling updateCustomFieldConfiguration(Async)");
        }
        

        okhttp3.Call localVarCall = updateCustomFieldConfigurationCall(fieldIdOrKey, customFieldConfigurations, _callback);
        return localVarCall;

    }

    /**
     * Update custom field configurations
     * Update the configuration for contexts of a custom field created by a [Forge app](https://developer.atlassian.com/platform/forge/).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the Forge app that created the custom field.
     * @param fieldIdOrKey The ID or key of the custom field, for example &#x60;customfield_10000&#x60;. (required)
     * @param customFieldConfigurations  (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user is not a Jira admin or the request is not authenticated as from the app that provided the field. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the custom field is not found. </td><td>  -  </td></tr>
     </table>
     */
    public Object updateCustomFieldConfiguration(String fieldIdOrKey, CustomFieldConfigurations customFieldConfigurations) throws ApiException {
        ApiResponse<Object> localVarResp = updateCustomFieldConfigurationWithHttpInfo(fieldIdOrKey, customFieldConfigurations);
        return localVarResp.getData();
    }

    /**
     * Update custom field configurations
     * Update the configuration for contexts of a custom field created by a [Forge app](https://developer.atlassian.com/platform/forge/).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the Forge app that created the custom field.
     * @param fieldIdOrKey The ID or key of the custom field, for example &#x60;customfield_10000&#x60;. (required)
     * @param customFieldConfigurations  (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user is not a Jira admin or the request is not authenticated as from the app that provided the field. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the custom field is not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> updateCustomFieldConfigurationWithHttpInfo(String fieldIdOrKey, CustomFieldConfigurations customFieldConfigurations) throws ApiException {
        okhttp3.Call localVarCall = updateCustomFieldConfigurationValidateBeforeCall(fieldIdOrKey, customFieldConfigurations, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update custom field configurations (asynchronously)
     * Update the configuration for contexts of a custom field created by a [Forge app](https://developer.atlassian.com/platform/forge/).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg). Jira permissions are not required for the Forge app that created the custom field.
     * @param fieldIdOrKey The ID or key of the custom field, for example &#x60;customfield_10000&#x60;. (required)
     * @param customFieldConfigurations  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user is not a Jira admin or the request is not authenticated as from the app that provided the field. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the custom field is not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateCustomFieldConfigurationAsync(String fieldIdOrKey, CustomFieldConfigurations customFieldConfigurations, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateCustomFieldConfigurationValidateBeforeCall(fieldIdOrKey, customFieldConfigurations, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}