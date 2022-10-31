

# Filter

Details about a filter.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**self** | **URI** | The URL of the filter. |  [optional] [readonly] |
|**id** | **String** | The unique identifier for the filter. |  [optional] [readonly] |
|**name** | **String** | The name of the filter. Must be unique. |  |
|**description** | **String** | A description of the filter. |  [optional] |
|**owner** | [**FilterOwner**](FilterOwner.md) |  |  [optional] |
|**jql** | **String** | The JQL query for the filter. For example, *project &#x3D; SSP AND issuetype &#x3D; Bug*. |  [optional] |
|**viewUrl** | **URI** | A URL to view the filter results in Jira, using the ID of the filter. For example, *https://your-domain.atlassian.net/issues/?filter&#x3D;10100*. |  [optional] [readonly] |
|**searchUrl** | **URI** | A URL to view the filter results in Jira, using the [Search for issues using JQL](#api-rest-api-3-filter-search-get) operation with the filter&#39;s JQL string to return the filter results. For example, *https://your-domain.atlassian.net/rest/api/3/search?jql&#x3D;project+%3D+SSP+AND+issuetype+%3D+Bug*. |  [optional] [readonly] |
|**favourite** | **Boolean** | Whether the filter is selected as a favorite. |  [optional] |
|**favouritedCount** | **Long** | The count of how many users have selected this filter as a favorite, including the filter owner. |  [optional] [readonly] |
|**sharePermissions** | [**List&lt;SharePermission&gt;**](SharePermission.md) | The groups and projects that the filter is shared with. |  [optional] |
|**editPermissions** | [**List&lt;SharePermission&gt;**](SharePermission.md) | The groups and projects that can edit the filter. |  [optional] |
|**sharedUsers** | [**FilterSharedUsers**](FilterSharedUsers.md) |  |  [optional] |
|**subscriptions** | [**FilterSubscriptions**](FilterSubscriptions.md) |  |  [optional] |



