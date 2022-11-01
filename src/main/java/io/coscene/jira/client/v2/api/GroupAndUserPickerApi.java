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
import io.coscene.jira.client.v2.model.FoundUsersAndGroups;

public class GroupAndUserPickerApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public GroupAndUserPickerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public GroupAndUserPickerApi(ApiClient apiClient) {
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
     * Build call for findUsersAndGroups
     * @param query The search string. (required)
     * @param maxResults The maximum number of items to return in each list. (optional, default to 50)
     * @param showAvatar Whether the user avatar should be returned. If an invalid value is provided, the default value is used. (optional, default to false)
     * @param fieldId The custom field ID of the field this request is for. (optional)
     * @param projectId The ID of a project that returned users and groups must have permission to view. To include multiple projects, provide an ampersand-separated list. For example, &#x60;projectId&#x3D;10000&amp;projectId&#x3D;10001&#x60;. This parameter is only used when &#x60;fieldId&#x60; is present. (optional)
     * @param issueTypeId The ID of an issue type that returned users and groups must have permission to view. To include multiple issue types, provide an ampersand-separated list. For example, &#x60;issueTypeId&#x3D;10000&amp;issueTypeId&#x3D;10001&#x60;. Special values, such as &#x60;-1&#x60; (all standard issue types) and &#x60;-2&#x60; (all subtask issue types), are supported. This parameter is only used when &#x60;fieldId&#x60; is present. (optional)
     * @param avatarSize The size of the avatar to return. If an invalid value is provided, the default value is used. (optional, default to xsmall)
     * @param caseInsensitive Whether the search for groups should be case insensitive. (optional, default to false)
     * @param excludeConnectAddons Whether Connect app users and groups should be excluded from the search results. If an invalid value is provided, the default value is used. (optional, default to false)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the query parameter is not provided. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user does not have the necessary permission. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Returned if the rate limit is exceeded. User search endpoints share a collective rate limit for the tenant, in addition to Jira&#39;s normal rate limiting you may receive a rate limit for user search. Please respect the Retry-After header. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findUsersAndGroupsCall(String query, Integer maxResults, Boolean showAvatar, String fieldId, List<String> projectId, List<String> issueTypeId, String avatarSize, Boolean caseInsensitive, Boolean excludeConnectAddons, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/rest/api/2/groupuserpicker";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (query != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("query", query));
        }

        if (maxResults != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("maxResults", maxResults));
        }

        if (showAvatar != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("showAvatar", showAvatar));
        }

        if (fieldId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("fieldId", fieldId));
        }

        if (projectId != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "projectId", projectId));
        }

        if (issueTypeId != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "issueTypeId", issueTypeId));
        }

        if (avatarSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("avatarSize", avatarSize));
        }

        if (caseInsensitive != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("caseInsensitive", caseInsensitive));
        }

        if (excludeConnectAddons != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("excludeConnectAddons", excludeConnectAddons));
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
    private okhttp3.Call findUsersAndGroupsValidateBeforeCall(String query, Integer maxResults, Boolean showAvatar, String fieldId, List<String> projectId, List<String> issueTypeId, String avatarSize, Boolean caseInsensitive, Boolean excludeConnectAddons, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'query' is set
        if (query == null) {
            throw new ApiException("Missing the required parameter 'query' when calling findUsersAndGroups(Async)");
        }
        

        okhttp3.Call localVarCall = findUsersAndGroupsCall(query, maxResults, showAvatar, fieldId, projectId, issueTypeId, avatarSize, caseInsensitive, excludeConnectAddons, _callback);
        return localVarCall;

    }

    /**
     * Find users and groups
     * Returns a list of users and groups matching a string. The string is used:   *  for users, to find a case-insensitive match with display name and e-mail address. Note that if a user has hidden their email address in their user profile, partial matches of the email address will not find the user. An exact match is required.  *  for groups, to find a case-sensitive match with group name.  For example, if the string *tin* is used, records with the display name *Tina*, email address *sarah@tinplatetraining.com*, and the group *accounting* would be returned.  Optionally, the search can be refined to:   *  the projects and issue types associated with a custom field, such as a user picker. The search can then be further refined to return only users and groups that have permission to view specific:           *  projects.      *  issue types.          If multiple projects or issue types are specified, they must be a subset of those enabled for the custom field or no results are returned. For example, if a field is enabled for projects A, B, and C then the search could be limited to projects B and C. However, if the search is limited to projects B and D, nothing is returned.  *  not return Connect app users and groups.  *  return groups that have a case-insensitive match with the query.  The primary use case for this resource is to populate a picker field suggestion list with users or groups. To this end, the returned object includes an &#x60;html&#x60; field for each list. This field highlights the matched query term in the item name with the HTML strong tag. Also, each list is wrapped in a response object that contains a header for use in a picker, specifically *Showing X of Y matching groups*.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/yodKLg).
     * @param query The search string. (required)
     * @param maxResults The maximum number of items to return in each list. (optional, default to 50)
     * @param showAvatar Whether the user avatar should be returned. If an invalid value is provided, the default value is used. (optional, default to false)
     * @param fieldId The custom field ID of the field this request is for. (optional)
     * @param projectId The ID of a project that returned users and groups must have permission to view. To include multiple projects, provide an ampersand-separated list. For example, &#x60;projectId&#x3D;10000&amp;projectId&#x3D;10001&#x60;. This parameter is only used when &#x60;fieldId&#x60; is present. (optional)
     * @param issueTypeId The ID of an issue type that returned users and groups must have permission to view. To include multiple issue types, provide an ampersand-separated list. For example, &#x60;issueTypeId&#x3D;10000&amp;issueTypeId&#x3D;10001&#x60;. Special values, such as &#x60;-1&#x60; (all standard issue types) and &#x60;-2&#x60; (all subtask issue types), are supported. This parameter is only used when &#x60;fieldId&#x60; is present. (optional)
     * @param avatarSize The size of the avatar to return. If an invalid value is provided, the default value is used. (optional, default to xsmall)
     * @param caseInsensitive Whether the search for groups should be case insensitive. (optional, default to false)
     * @param excludeConnectAddons Whether Connect app users and groups should be excluded from the search results. If an invalid value is provided, the default value is used. (optional, default to false)
     * @return FoundUsersAndGroups
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the query parameter is not provided. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user does not have the necessary permission. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Returned if the rate limit is exceeded. User search endpoints share a collective rate limit for the tenant, in addition to Jira&#39;s normal rate limiting you may receive a rate limit for user search. Please respect the Retry-After header. </td><td>  -  </td></tr>
     </table>
     */
    public FoundUsersAndGroups findUsersAndGroups(String query, Integer maxResults, Boolean showAvatar, String fieldId, List<String> projectId, List<String> issueTypeId, String avatarSize, Boolean caseInsensitive, Boolean excludeConnectAddons) throws ApiException {
        ApiResponse<FoundUsersAndGroups> localVarResp = findUsersAndGroupsWithHttpInfo(query, maxResults, showAvatar, fieldId, projectId, issueTypeId, avatarSize, caseInsensitive, excludeConnectAddons);
        return localVarResp.getData();
    }

    /**
     * Find users and groups
     * Returns a list of users and groups matching a string. The string is used:   *  for users, to find a case-insensitive match with display name and e-mail address. Note that if a user has hidden their email address in their user profile, partial matches of the email address will not find the user. An exact match is required.  *  for groups, to find a case-sensitive match with group name.  For example, if the string *tin* is used, records with the display name *Tina*, email address *sarah@tinplatetraining.com*, and the group *accounting* would be returned.  Optionally, the search can be refined to:   *  the projects and issue types associated with a custom field, such as a user picker. The search can then be further refined to return only users and groups that have permission to view specific:           *  projects.      *  issue types.          If multiple projects or issue types are specified, they must be a subset of those enabled for the custom field or no results are returned. For example, if a field is enabled for projects A, B, and C then the search could be limited to projects B and C. However, if the search is limited to projects B and D, nothing is returned.  *  not return Connect app users and groups.  *  return groups that have a case-insensitive match with the query.  The primary use case for this resource is to populate a picker field suggestion list with users or groups. To this end, the returned object includes an &#x60;html&#x60; field for each list. This field highlights the matched query term in the item name with the HTML strong tag. Also, each list is wrapped in a response object that contains a header for use in a picker, specifically *Showing X of Y matching groups*.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/yodKLg).
     * @param query The search string. (required)
     * @param maxResults The maximum number of items to return in each list. (optional, default to 50)
     * @param showAvatar Whether the user avatar should be returned. If an invalid value is provided, the default value is used. (optional, default to false)
     * @param fieldId The custom field ID of the field this request is for. (optional)
     * @param projectId The ID of a project that returned users and groups must have permission to view. To include multiple projects, provide an ampersand-separated list. For example, &#x60;projectId&#x3D;10000&amp;projectId&#x3D;10001&#x60;. This parameter is only used when &#x60;fieldId&#x60; is present. (optional)
     * @param issueTypeId The ID of an issue type that returned users and groups must have permission to view. To include multiple issue types, provide an ampersand-separated list. For example, &#x60;issueTypeId&#x3D;10000&amp;issueTypeId&#x3D;10001&#x60;. Special values, such as &#x60;-1&#x60; (all standard issue types) and &#x60;-2&#x60; (all subtask issue types), are supported. This parameter is only used when &#x60;fieldId&#x60; is present. (optional)
     * @param avatarSize The size of the avatar to return. If an invalid value is provided, the default value is used. (optional, default to xsmall)
     * @param caseInsensitive Whether the search for groups should be case insensitive. (optional, default to false)
     * @param excludeConnectAddons Whether Connect app users and groups should be excluded from the search results. If an invalid value is provided, the default value is used. (optional, default to false)
     * @return ApiResponse&lt;FoundUsersAndGroups&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the query parameter is not provided. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user does not have the necessary permission. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Returned if the rate limit is exceeded. User search endpoints share a collective rate limit for the tenant, in addition to Jira&#39;s normal rate limiting you may receive a rate limit for user search. Please respect the Retry-After header. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FoundUsersAndGroups> findUsersAndGroupsWithHttpInfo(String query, Integer maxResults, Boolean showAvatar, String fieldId, List<String> projectId, List<String> issueTypeId, String avatarSize, Boolean caseInsensitive, Boolean excludeConnectAddons) throws ApiException {
        okhttp3.Call localVarCall = findUsersAndGroupsValidateBeforeCall(query, maxResults, showAvatar, fieldId, projectId, issueTypeId, avatarSize, caseInsensitive, excludeConnectAddons, null);
        Type localVarReturnType = new TypeToken<FoundUsersAndGroups>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Find users and groups (asynchronously)
     * Returns a list of users and groups matching a string. The string is used:   *  for users, to find a case-insensitive match with display name and e-mail address. Note that if a user has hidden their email address in their user profile, partial matches of the email address will not find the user. An exact match is required.  *  for groups, to find a case-sensitive match with group name.  For example, if the string *tin* is used, records with the display name *Tina*, email address *sarah@tinplatetraining.com*, and the group *accounting* would be returned.  Optionally, the search can be refined to:   *  the projects and issue types associated with a custom field, such as a user picker. The search can then be further refined to return only users and groups that have permission to view specific:           *  projects.      *  issue types.          If multiple projects or issue types are specified, they must be a subset of those enabled for the custom field or no results are returned. For example, if a field is enabled for projects A, B, and C then the search could be limited to projects B and C. However, if the search is limited to projects B and D, nothing is returned.  *  not return Connect app users and groups.  *  return groups that have a case-insensitive match with the query.  The primary use case for this resource is to populate a picker field suggestion list with users or groups. To this end, the returned object includes an &#x60;html&#x60; field for each list. This field highlights the matched query term in the item name with the HTML strong tag. Also, each list is wrapped in a response object that contains a header for use in a picker, specifically *Showing X of Y matching groups*.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/yodKLg).
     * @param query The search string. (required)
     * @param maxResults The maximum number of items to return in each list. (optional, default to 50)
     * @param showAvatar Whether the user avatar should be returned. If an invalid value is provided, the default value is used. (optional, default to false)
     * @param fieldId The custom field ID of the field this request is for. (optional)
     * @param projectId The ID of a project that returned users and groups must have permission to view. To include multiple projects, provide an ampersand-separated list. For example, &#x60;projectId&#x3D;10000&amp;projectId&#x3D;10001&#x60;. This parameter is only used when &#x60;fieldId&#x60; is present. (optional)
     * @param issueTypeId The ID of an issue type that returned users and groups must have permission to view. To include multiple issue types, provide an ampersand-separated list. For example, &#x60;issueTypeId&#x3D;10000&amp;issueTypeId&#x3D;10001&#x60;. Special values, such as &#x60;-1&#x60; (all standard issue types) and &#x60;-2&#x60; (all subtask issue types), are supported. This parameter is only used when &#x60;fieldId&#x60; is present. (optional)
     * @param avatarSize The size of the avatar to return. If an invalid value is provided, the default value is used. (optional, default to xsmall)
     * @param caseInsensitive Whether the search for groups should be case insensitive. (optional, default to false)
     * @param excludeConnectAddons Whether Connect app users and groups should be excluded from the search results. If an invalid value is provided, the default value is used. (optional, default to false)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the query parameter is not provided. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user does not have the necessary permission. </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Returned if the rate limit is exceeded. User search endpoints share a collective rate limit for the tenant, in addition to Jira&#39;s normal rate limiting you may receive a rate limit for user search. Please respect the Retry-After header. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call findUsersAndGroupsAsync(String query, Integer maxResults, Boolean showAvatar, String fieldId, List<String> projectId, List<String> issueTypeId, String avatarSize, Boolean caseInsensitive, Boolean excludeConnectAddons, final ApiCallback<FoundUsersAndGroups> _callback) throws ApiException {

        okhttp3.Call localVarCall = findUsersAndGroupsValidateBeforeCall(query, maxResults, showAvatar, fieldId, projectId, issueTypeId, avatarSize, caseInsensitive, excludeConnectAddons, _callback);
        Type localVarReturnType = new TypeToken<FoundUsersAndGroups>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
