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
import io.coscene.jira.client.v2.model.NotificationScheme;
import io.coscene.jira.client.v2.model.PageBeanNotificationScheme;

public class IssueNotificationSchemesApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public IssueNotificationSchemesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public IssueNotificationSchemesApi(ApiClient apiClient) {
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
     * Build call for getNotificationScheme
     * @param id The ID of the notification scheme. Use [Get notification schemes paginated](#api-rest-api-2-notificationscheme-get) to get a list of notification scheme IDs. (required)
     * @param expand Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about any custom fields assigned to receive an event.  *  &#x60;group&#x60; Returns information about any groups assigned to receive an event.  *  &#x60;notificationSchemeEvents&#x60; Returns a list of event associations. This list is returned for all expandable information.  *  &#x60;projectRole&#x60; Returns information about any project roles assigned to receive an event.  *  &#x60;user&#x60; Returns information about any users assigned to receive an event. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the notification scheme is not found or the user does not have permission to view it. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getNotificationSchemeCall(Long id, String expand, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/rest/api/2/notificationscheme/{id}"
            .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (expand != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("expand", expand));
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
    private okhttp3.Call getNotificationSchemeValidateBeforeCall(Long id, String expand, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getNotificationScheme(Async)");
        }
        

        okhttp3.Call localVarCall = getNotificationSchemeCall(id, expand, _callback);
        return localVarCall;

    }

    /**
     * Get notification scheme
     * Returns a [notification scheme](https://confluence.atlassian.com/x/8YdKLg), including the list of events and the recipients who will receive notifications for those events.  **[Permissions](#permissions) required:** Permission to access Jira, however the user must have permission to administer at least one project associated with the notification scheme.
     * @param id The ID of the notification scheme. Use [Get notification schemes paginated](#api-rest-api-2-notificationscheme-get) to get a list of notification scheme IDs. (required)
     * @param expand Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about any custom fields assigned to receive an event.  *  &#x60;group&#x60; Returns information about any groups assigned to receive an event.  *  &#x60;notificationSchemeEvents&#x60; Returns a list of event associations. This list is returned for all expandable information.  *  &#x60;projectRole&#x60; Returns information about any project roles assigned to receive an event.  *  &#x60;user&#x60; Returns information about any users assigned to receive an event. (optional)
     * @return NotificationScheme
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the notification scheme is not found or the user does not have permission to view it. </td><td>  -  </td></tr>
     </table>
     */
    public NotificationScheme getNotificationScheme(Long id, String expand) throws ApiException {
        ApiResponse<NotificationScheme> localVarResp = getNotificationSchemeWithHttpInfo(id, expand);
        return localVarResp.getData();
    }

    /**
     * Get notification scheme
     * Returns a [notification scheme](https://confluence.atlassian.com/x/8YdKLg), including the list of events and the recipients who will receive notifications for those events.  **[Permissions](#permissions) required:** Permission to access Jira, however the user must have permission to administer at least one project associated with the notification scheme.
     * @param id The ID of the notification scheme. Use [Get notification schemes paginated](#api-rest-api-2-notificationscheme-get) to get a list of notification scheme IDs. (required)
     * @param expand Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about any custom fields assigned to receive an event.  *  &#x60;group&#x60; Returns information about any groups assigned to receive an event.  *  &#x60;notificationSchemeEvents&#x60; Returns a list of event associations. This list is returned for all expandable information.  *  &#x60;projectRole&#x60; Returns information about any project roles assigned to receive an event.  *  &#x60;user&#x60; Returns information about any users assigned to receive an event. (optional)
     * @return ApiResponse&lt;NotificationScheme&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the notification scheme is not found or the user does not have permission to view it. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<NotificationScheme> getNotificationSchemeWithHttpInfo(Long id, String expand) throws ApiException {
        okhttp3.Call localVarCall = getNotificationSchemeValidateBeforeCall(id, expand, null);
        Type localVarReturnType = new TypeToken<NotificationScheme>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get notification scheme (asynchronously)
     * Returns a [notification scheme](https://confluence.atlassian.com/x/8YdKLg), including the list of events and the recipients who will receive notifications for those events.  **[Permissions](#permissions) required:** Permission to access Jira, however the user must have permission to administer at least one project associated with the notification scheme.
     * @param id The ID of the notification scheme. Use [Get notification schemes paginated](#api-rest-api-2-notificationscheme-get) to get a list of notification scheme IDs. (required)
     * @param expand Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about any custom fields assigned to receive an event.  *  &#x60;group&#x60; Returns information about any groups assigned to receive an event.  *  &#x60;notificationSchemeEvents&#x60; Returns a list of event associations. This list is returned for all expandable information.  *  &#x60;projectRole&#x60; Returns information about any project roles assigned to receive an event.  *  &#x60;user&#x60; Returns information about any users assigned to receive an event. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the notification scheme is not found or the user does not have permission to view it. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getNotificationSchemeAsync(Long id, String expand, final ApiCallback<NotificationScheme> _callback) throws ApiException {

        okhttp3.Call localVarCall = getNotificationSchemeValidateBeforeCall(id, expand, _callback);
        Type localVarReturnType = new TypeToken<NotificationScheme>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getNotificationSchemes
     * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
     * @param maxResults The maximum number of items to return per page. (optional, default to 50)
     * @param expand Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about any custom fields assigned to receive an event.  *  &#x60;group&#x60; Returns information about any groups assigned to receive an event.  *  &#x60;notificationSchemeEvents&#x60; Returns a list of event associations. This list is returned for all expandable information.  *  &#x60;projectRole&#x60; Returns information about any project roles assigned to receive an event.  *  &#x60;user&#x60; Returns information about any users assigned to receive an event. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. Only returns notification schemes that the user has permission to access. An empty list is returned if the user lacks permission to access all notification schemes. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getNotificationSchemesCall(Long startAt, Integer maxResults, String expand, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/rest/api/2/notificationscheme";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (startAt != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("startAt", startAt));
        }

        if (maxResults != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("maxResults", maxResults));
        }

        if (expand != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("expand", expand));
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
    private okhttp3.Call getNotificationSchemesValidateBeforeCall(Long startAt, Integer maxResults, String expand, final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getNotificationSchemesCall(startAt, maxResults, expand, _callback);
        return localVarCall;

    }

    /**
     * Get notification schemes paginated
     * Returns a [paginated](#pagination) list of [notification schemes](https://confluence.atlassian.com/x/8YdKLg) ordered by display name.  *Note that you should allow for events without recipients to appear in responses.*  **[Permissions](#permissions) required:** Permission to access Jira, however the user must have permission to administer at least one project associated with a notification scheme for it to be returned.
     * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
     * @param maxResults The maximum number of items to return per page. (optional, default to 50)
     * @param expand Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about any custom fields assigned to receive an event.  *  &#x60;group&#x60; Returns information about any groups assigned to receive an event.  *  &#x60;notificationSchemeEvents&#x60; Returns a list of event associations. This list is returned for all expandable information.  *  &#x60;projectRole&#x60; Returns information about any project roles assigned to receive an event.  *  &#x60;user&#x60; Returns information about any users assigned to receive an event. (optional)
     * @return PageBeanNotificationScheme
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. Only returns notification schemes that the user has permission to access. An empty list is returned if the user lacks permission to access all notification schemes. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
     </table>
     */
    public PageBeanNotificationScheme getNotificationSchemes(Long startAt, Integer maxResults, String expand) throws ApiException {
        ApiResponse<PageBeanNotificationScheme> localVarResp = getNotificationSchemesWithHttpInfo(startAt, maxResults, expand);
        return localVarResp.getData();
    }

    /**
     * Get notification schemes paginated
     * Returns a [paginated](#pagination) list of [notification schemes](https://confluence.atlassian.com/x/8YdKLg) ordered by display name.  *Note that you should allow for events without recipients to appear in responses.*  **[Permissions](#permissions) required:** Permission to access Jira, however the user must have permission to administer at least one project associated with a notification scheme for it to be returned.
     * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
     * @param maxResults The maximum number of items to return per page. (optional, default to 50)
     * @param expand Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about any custom fields assigned to receive an event.  *  &#x60;group&#x60; Returns information about any groups assigned to receive an event.  *  &#x60;notificationSchemeEvents&#x60; Returns a list of event associations. This list is returned for all expandable information.  *  &#x60;projectRole&#x60; Returns information about any project roles assigned to receive an event.  *  &#x60;user&#x60; Returns information about any users assigned to receive an event. (optional)
     * @return ApiResponse&lt;PageBeanNotificationScheme&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. Only returns notification schemes that the user has permission to access. An empty list is returned if the user lacks permission to access all notification schemes. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PageBeanNotificationScheme> getNotificationSchemesWithHttpInfo(Long startAt, Integer maxResults, String expand) throws ApiException {
        okhttp3.Call localVarCall = getNotificationSchemesValidateBeforeCall(startAt, maxResults, expand, null);
        Type localVarReturnType = new TypeToken<PageBeanNotificationScheme>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get notification schemes paginated (asynchronously)
     * Returns a [paginated](#pagination) list of [notification schemes](https://confluence.atlassian.com/x/8YdKLg) ordered by display name.  *Note that you should allow for events without recipients to appear in responses.*  **[Permissions](#permissions) required:** Permission to access Jira, however the user must have permission to administer at least one project associated with a notification scheme for it to be returned.
     * @param startAt The index of the first item to return in a page of results (page offset). (optional, default to 0)
     * @param maxResults The maximum number of items to return per page. (optional, default to 50)
     * @param expand Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about any custom fields assigned to receive an event.  *  &#x60;group&#x60; Returns information about any groups assigned to receive an event.  *  &#x60;notificationSchemeEvents&#x60; Returns a list of event associations. This list is returned for all expandable information.  *  &#x60;projectRole&#x60; Returns information about any project roles assigned to receive an event.  *  &#x60;user&#x60; Returns information about any users assigned to receive an event. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. Only returns notification schemes that the user has permission to access. An empty list is returned if the user lacks permission to access all notification schemes. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getNotificationSchemesAsync(Long startAt, Integer maxResults, String expand, final ApiCallback<PageBeanNotificationScheme> _callback) throws ApiException {

        okhttp3.Call localVarCall = getNotificationSchemesValidateBeforeCall(startAt, maxResults, expand, _callback);
        Type localVarReturnType = new TypeToken<PageBeanNotificationScheme>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
