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

import io.coscene.jira.client.v3.ApiException;
import io.coscene.jira.client.v3.model.FoundGroups;
import io.coscene.jira.client.v3.model.Group;
import io.coscene.jira.client.v3.model.PageBeanGroupDetails;
import io.coscene.jira.client.v3.model.PageBeanUserDetails;
import java.util.Set;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

/**
 * API tests for GroupsApi
 */
@Disabled
public class GroupsApiTest {

    private final GroupsApi api = new GroupsApi();

    /**
     * Add user to group
     *
     * Adds a user to a group.  **[Permissions](#permissions) required:** Site administration (that is, member of the *site-admin* [group](https://confluence.atlassian.com/x/24xjL)).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addUserToGroupTest() throws ApiException {
        Map<String, Object> requestBody = null;
        String groupname = null;
        String groupId = null;
        Group response = api.addUserToGroup(requestBody, groupname, groupId);
        // TODO: test validations
    }

    /**
     * Bulk get groups
     *
     * Returns a [paginated](#pagination) list of groups.  **[Permissions](#permissions) required:** *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void bulkGetGroupsTest() throws ApiException {
        Long startAt = null;
        Integer maxResults = null;
        Set<String> groupId = null;
        Set<String> groupName = null;
        String accessType = null;
        String applicationKey = null;
        PageBeanGroupDetails response = api.bulkGetGroups(startAt, maxResults, groupId, groupName, accessType, applicationKey);
        // TODO: test validations
    }

    /**
     * Create group
     *
     * Creates a group.  **[Permissions](#permissions) required:** Site administration (that is, member of the *site-admin* [group](https://confluence.atlassian.com/x/24xjL)).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createGroupTest() throws ApiException {
        Map<String, Object> requestBody = null;
        Group response = api.createGroup(requestBody);
        // TODO: test validations
    }

    /**
     * Find groups
     *
     * Returns a list of groups whose names contain a query string. A list of group names can be provided to exclude groups from the results.  The primary use case for this resource is to populate a group picker suggestions list. To this end, the returned object includes the &#x60;html&#x60; field where the matched query term is highlighted in the group name with the HTML strong tag. Also, the groups list is wrapped in a response object that contains a header for use in the picker, specifically *Showing X of Y matching groups*.  The list returns with the groups sorted. If no groups match the list criteria, an empty list is returned.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg). Anonymous calls and calls by users without the required permission return an empty list.  *Browse users and groups* [global permission](https://confluence.atlassian.com/x/x4dKLg). Without this permission, calls where query is not an exact match to an existing group will return an empty list.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findGroupsTest() throws ApiException {
        String accountId = null;
        String query = null;
        List<String> exclude = null;
        List<String> excludeId = null;
        Integer maxResults = null;
        String userName = null;
        FoundGroups response = api.findGroups(accountId, query, exclude, excludeId, maxResults, userName);
        // TODO: test validations
    }

    /**
     * Get group
     *
     * This operation is deprecated, use [&#x60;group/member&#x60;](#api-rest-api-3-group-member-get).  Returns all users in a group.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getGroupTest() throws ApiException {
        String groupname = null;
        String groupId = null;
        String expand = null;
        Group response = api.getGroup(groupname, groupId, expand);
        // TODO: test validations
    }

    /**
     * Get users from group
     *
     * Returns a [paginated](#pagination) list of all users in a group.  Note that users are ordered by username, however the username is not returned in the results due to privacy reasons.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUsersFromGroupTest() throws ApiException {
        String groupname = null;
        String groupId = null;
        Boolean includeInactiveUsers = null;
        Long startAt = null;
        Integer maxResults = null;
        PageBeanUserDetails response = api.getUsersFromGroup(groupname, groupId, includeInactiveUsers, startAt, maxResults);
        // TODO: test validations
    }

    /**
     * Remove group
     *
     * Deletes a group.  **[Permissions](#permissions) required:** Site administration (that is, member of the *site-admin* strategic [group](https://confluence.atlassian.com/x/24xjL)).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeGroupTest() throws ApiException {
        String groupname = null;
        String groupId = null;
        String swapGroup = null;
        String swapGroupId = null;
        api.removeGroup(groupname, groupId, swapGroup, swapGroupId);
        // TODO: test validations
    }

    /**
     * Remove user from group
     *
     * Removes a user from a group.  **[Permissions](#permissions) required:** Site administration (that is, member of the *site-admin* [group](https://confluence.atlassian.com/x/24xjL)).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeUserFromGroupTest() throws ApiException {
        String accountId = null;
        String groupname = null;
        String groupId = null;
        String username = null;
        api.removeUserFromGroup(accountId, groupname, groupId, username);
        // TODO: test validations
    }

}
