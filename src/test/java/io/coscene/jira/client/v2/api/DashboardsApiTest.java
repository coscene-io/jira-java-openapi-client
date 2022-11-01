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

import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import io.coscene.jira.client.v2.ApiException;
import io.coscene.jira.client.v2.model.AvailableDashboardGadgetsResponse;
import io.coscene.jira.client.v2.model.Dashboard;
import io.coscene.jira.client.v2.model.DashboardDetails;
import io.coscene.jira.client.v2.model.DashboardGadget;
import io.coscene.jira.client.v2.model.DashboardGadgetResponse;
import io.coscene.jira.client.v2.model.DashboardGadgetSettings;
import io.coscene.jira.client.v2.model.DashboardGadgetUpdateRequest;
import io.coscene.jira.client.v2.model.EntityProperty;
import io.coscene.jira.client.v2.model.PageBeanDashboard;
import io.coscene.jira.client.v2.model.PageOfDashboards;
import io.coscene.jira.client.v2.model.PropertyKeys;

/**
 * API tests for DashboardsApi
 */
@Disabled
public class DashboardsApiTest {

    private final DashboardsApi api = new DashboardsApi();

    /**
     * Add gadget to dashboard
     *
     * Adds a gadget to a dashboard.  **[Permissions](#permissions) required:** None.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addGadgetTest() throws ApiException {
        Long dashboardId = null;
        DashboardGadgetSettings dashboardGadgetSettings = null;
        DashboardGadget response = api.addGadget(dashboardId, dashboardGadgetSettings);
        // TODO: test validations
    }

    /**
     * Copy dashboard
     *
     * Copies a dashboard. Any values provided in the &#x60;dashboard&#x60; parameter replace those in the copied dashboard.  **[Permissions](#permissions) required:** None  The dashboard to be copied must be owned by or shared with the user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void copyDashboardTest() throws ApiException {
        String id = null;
        DashboardDetails dashboardDetails = null;
        Dashboard response = api.copyDashboard(id, dashboardDetails);
        // TODO: test validations
    }

    /**
     * Create dashboard
     *
     * Creates a dashboard.  **[Permissions](#permissions) required:** None.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createDashboardTest() throws ApiException {
        DashboardDetails dashboardDetails = null;
        Dashboard response = api.createDashboard(dashboardDetails);
        // TODO: test validations
    }

    /**
     * Delete dashboard
     *
     * Deletes a dashboard.  **[Permissions](#permissions) required:** None  The dashboard to be deleted must be owned by the user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteDashboardTest() throws ApiException {
        String id = null;
        api.deleteDashboard(id);
        // TODO: test validations
    }

    /**
     * Delete dashboard item property
     *
     * Deletes a dashboard item property.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The user must be the owner of the dashboard. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteDashboardItemPropertyTest() throws ApiException {
        String dashboardId = null;
        String itemId = null;
        String propertyKey = null;
        api.deleteDashboardItemProperty(dashboardId, itemId, propertyKey);
        // TODO: test validations
    }

    /**
     * Get available gadgets
     *
     * Gets a list of all available gadgets that can be added to all dashboards.  **[Permissions](#permissions) required:** None.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllAvailableDashboardGadgetsTest() throws ApiException {
        AvailableDashboardGadgetsResponse response = api.getAllAvailableDashboardGadgets();
        // TODO: test validations
    }

    /**
     * Get all dashboards
     *
     * Returns a list of dashboards owned by or shared with the user. The list may be filtered to include only favorite or owned dashboards.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllDashboardsTest() throws ApiException {
        String filter = null;
        Integer startAt = null;
        Integer maxResults = null;
        PageOfDashboards response = api.getAllDashboards(filter, startAt, maxResults);
        // TODO: test validations
    }

    /**
     * Get gadgets
     *
     * Returns a list of dashboard gadgets on a dashboard.  This operation returns:   *  Gadgets from a list of IDs, when &#x60;id&#x60; is set.  *  Gadgets with a module key, when &#x60;moduleKey&#x60; is set.  *  Gadgets from a list of URIs, when &#x60;uri&#x60; is set.  *  All gadgets, when no other parameters are set.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllGadgetsTest() throws ApiException {
        Long dashboardId = null;
        List<String> moduleKey = null;
        List<String> uri = null;
        List<Long> gadgetId = null;
        DashboardGadgetResponse response = api.getAllGadgets(dashboardId, moduleKey, uri, gadgetId);
        // TODO: test validations
    }

    /**
     * Get dashboard
     *
     * Returns a dashboard.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.  However, to get a dashboard, the dashboard must be shared with the user or the user must own it. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard. The System dashboard is considered to be shared with all other users.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDashboardTest() throws ApiException {
        String id = null;
        Dashboard response = api.getDashboard(id);
        // TODO: test validations
    }

    /**
     * Get dashboard item property
     *
     * Returns the key and value of a dashboard item property.  A dashboard item enables an app to add user-specific information to a user dashboard. Dashboard items are exposed to users as gadgets that users can add to their dashboards. For more information on how users do this, see [Adding and customizing gadgets](https://confluence.atlassian.com/x/7AeiLQ).  When an app creates a dashboard item it registers a callback to receive the dashboard item ID. The callback fires whenever the item is rendered or, where the item is configurable, the user edits the item. The app then uses this resource to store the item&#39;s content or configuration details. For more information on working with dashboard items, see [ Building a dashboard item for a JIRA Connect add-on](https://developer.atlassian.com/server/jira/platform/guide-building-a-dashboard-item-for-a-jira-connect-add-on-33746254/) and the [Dashboard Item](https://developer.atlassian.com/cloud/jira/platform/modules/dashboard-item/) documentation.  There is no resource to set or get dashboard items.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The user must be the owner of the dashboard or have the dashboard shared with them. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard. The System dashboard is considered to be shared with all other users, and is accessible to anonymous users when Jira’s anonymous access is permitted.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDashboardItemPropertyTest() throws ApiException {
        String dashboardId = null;
        String itemId = null;
        String propertyKey = null;
        EntityProperty response = api.getDashboardItemProperty(dashboardId, itemId, propertyKey);
        // TODO: test validations
    }

    /**
     * Get dashboard item property keys
     *
     * Returns the keys of all properties for a dashboard item.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The user must be the owner of the dashboard or have the dashboard shared with them. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard. The System dashboard is considered to be shared with all other users, and is accessible to anonymous users when Jira’s anonymous access is permitted.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDashboardItemPropertyKeysTest() throws ApiException {
        String dashboardId = null;
        String itemId = null;
        PropertyKeys response = api.getDashboardItemPropertyKeys(dashboardId, itemId);
        // TODO: test validations
    }

    /**
     * Search for dashboards
     *
     * Returns a [paginated](#pagination) list of dashboards. This operation is similar to [Get dashboards](#api-rest-api-2-dashboard-get) except that the results can be refined to include dashboards that have specific attributes. For example, dashboards with a particular name. When multiple attributes are specified only filters matching all attributes are returned.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The following dashboards that match the query parameters are returned:   *  Dashboards owned by the user. Not returned for anonymous users.  *  Dashboards shared with a group that the user is a member of. Not returned for anonymous users.  *  Dashboards shared with a private project that the user can browse. Not returned for anonymous users.  *  Dashboards shared with a public project.  *  Dashboards shared with the public.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDashboardsPaginatedTest() throws ApiException {
        String dashboardName = null;
        String accountId = null;
        String owner = null;
        String groupname = null;
        String groupId = null;
        Long projectId = null;
        String orderBy = null;
        Long startAt = null;
        Integer maxResults = null;
        String status = null;
        String expand = null;
        PageBeanDashboard response = api.getDashboardsPaginated(dashboardName, accountId, owner, groupname, groupId, projectId, orderBy, startAt, maxResults, status, expand);
        // TODO: test validations
    }

    /**
     * Remove gadget from dashboard
     *
     * Removes a dashboard gadget from a dashboard.  When a gadget is removed from a dashboard, other gadgets in the same column are moved up to fill the emptied position.  **[Permissions](#permissions) required:** None.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeGadgetTest() throws ApiException {
        Long dashboardId = null;
        Long gadgetId = null;
        Object response = api.removeGadget(dashboardId, gadgetId);
        // TODO: test validations
    }

    /**
     * Set dashboard item property
     *
     * Sets the value of a dashboard item property. Use this resource in apps to store custom data against a dashboard item.  A dashboard item enables an app to add user-specific information to a user dashboard. Dashboard items are exposed to users as gadgets that users can add to their dashboards. For more information on how users do this, see [Adding and customizing gadgets](https://confluence.atlassian.com/x/7AeiLQ).  When an app creates a dashboard item it registers a callback to receive the dashboard item ID. The callback fires whenever the item is rendered or, where the item is configurable, the user edits the item. The app then uses this resource to store the item&#39;s content or configuration details. For more information on working with dashboard items, see [ Building a dashboard item for a JIRA Connect add-on](https://developer.atlassian.com/server/jira/platform/guide-building-a-dashboard-item-for-a-jira-connect-add-on-33746254/) and the [Dashboard Item](https://developer.atlassian.com/cloud/jira/platform/modules/dashboard-item/) documentation.  There is no resource to set or get dashboard items.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The user must be the owner of the dashboard. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setDashboardItemPropertyTest() throws ApiException {
        String dashboardId = null;
        String itemId = null;
        String propertyKey = null;
        Object body = null;
        Object response = api.setDashboardItemProperty(dashboardId, itemId, propertyKey, body);
        // TODO: test validations
    }

    /**
     * Update dashboard
     *
     * Updates a dashboard, replacing all the dashboard details with those provided.  **[Permissions](#permissions) required:** None  The dashboard to be updated must be owned by the user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateDashboardTest() throws ApiException {
        String id = null;
        DashboardDetails dashboardDetails = null;
        Dashboard response = api.updateDashboard(id, dashboardDetails);
        // TODO: test validations
    }

    /**
     * Update gadget on dashboard
     *
     * Changes the title, position, and color of the gadget on a dashboard.  **[Permissions](#permissions) required:** None.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateGadgetTest() throws ApiException {
        Long dashboardId = null;
        Long gadgetId = null;
        DashboardGadgetUpdateRequest dashboardGadgetUpdateRequest = null;
        Object response = api.updateGadget(dashboardId, gadgetId, dashboardGadgetUpdateRequest);
        // TODO: test validations
    }

}
