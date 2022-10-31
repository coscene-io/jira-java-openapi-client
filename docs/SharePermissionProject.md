

# SharePermissionProject

The project that the filter is shared with. This is similar to the project object returned by [Get project](#api-rest-api-3-project-projectIdOrKey-get) but it contains a subset of the properties, which are: `self`, `id`, `key`, `assigneeType`, `name`, `roles`, `avatarUrls`, `projectType`, `simplified`.   For a request, specify the `id` for the project.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**expand** | **String** | Expand options that include additional project details in the response. |  [optional] [readonly] |
|**self** | **URI** | The URL of the project details. |  [optional] [readonly] |
|**id** | **String** | The ID of the project. |  [optional] |
|**key** | **String** | The key of the project. |  [optional] [readonly] |
|**description** | **String** | A brief description of the project. |  [optional] [readonly] |
|**lead** | [**ProjectLead**](ProjectLead.md) |  |  [optional] |
|**components** | [**List&lt;ProjectComponent&gt;**](ProjectComponent.md) | List of the components contained in the project. |  [optional] [readonly] |
|**issueTypes** | [**List&lt;IssueTypeDetails&gt;**](IssueTypeDetails.md) | List of the issue types available in the project. |  [optional] [readonly] |
|**url** | **String** | A link to information about this project, such as project documentation. |  [optional] [readonly] |
|**email** | **String** | An email address associated with the project. |  [optional] |
|**assigneeType** | [**AssigneeTypeEnum**](#AssigneeTypeEnum) | The default assignee when creating issues for this project. |  [optional] [readonly] |
|**versions** | [**List&lt;Version&gt;**](Version.md) | The versions defined in the project. For more information, see [Create version](#api-rest-api-3-version-post). |  [optional] [readonly] |
|**name** | **String** | The name of the project. |  [optional] [readonly] |
|**roles** | **Map&lt;String, URI&gt;** | The name and self URL for each role defined in the project. For more information, see [Create project role](#api-rest-api-3-role-post). |  [optional] [readonly] |
|**avatarUrls** | [**ProjectDetailsAvatarUrls**](ProjectDetailsAvatarUrls.md) |  |  [optional] |
|**projectCategory** | [**ProjectProjectCategory**](ProjectProjectCategory.md) |  |  [optional] |
|**projectTypeKey** | [**ProjectTypeKeyEnum**](#ProjectTypeKeyEnum) | The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project. |  [optional] [readonly] |
|**simplified** | **Boolean** | Whether the project is simplified. |  [optional] [readonly] |
|**style** | [**StyleEnum**](#StyleEnum) | The type of the project. |  [optional] [readonly] |
|**favourite** | **Boolean** | Whether the project is selected as a favorite. |  [optional] |
|**isPrivate** | **Boolean** | Whether the project is private. |  [optional] [readonly] |
|**issueTypeHierarchy** | [**ProjectIssueTypeHierarchy**](ProjectIssueTypeHierarchy.md) |  |  [optional] |
|**permissions** | [**ProjectPermissions**](ProjectPermissions.md) |  |  [optional] |
|**properties** | **Map&lt;String, Object&gt;** | Map of project properties |  [optional] [readonly] |
|**uuid** | **UUID** | Unique ID for next-gen projects. |  [optional] [readonly] |
|**insight** | [**ProjectInsight**](ProjectInsight.md) |  |  [optional] |
|**deleted** | **Boolean** | Whether the project is marked as deleted. |  [optional] [readonly] |
|**retentionTillDate** | **OffsetDateTime** | The date when the project is deleted permanently. |  [optional] [readonly] |
|**deletedDate** | **OffsetDateTime** | The date when the project was marked as deleted. |  [optional] [readonly] |
|**deletedBy** | [**ProjectDeletedBy**](ProjectDeletedBy.md) |  |  [optional] |
|**archived** | **Boolean** | Whether the project is archived. |  [optional] [readonly] |
|**archivedDate** | **OffsetDateTime** | The date when the project was archived. |  [optional] [readonly] |
|**archivedBy** | [**ProjectArchivedBy**](ProjectArchivedBy.md) |  |  [optional] |
|**landingPageInfo** | [**ProjectLandingPageInfo**](ProjectLandingPageInfo.md) |  |  [optional] |



## Enum: AssigneeTypeEnum

| Name | Value |
|---- | -----|
| PROJECT_LEAD | &quot;PROJECT_LEAD&quot; |
| UNASSIGNED | &quot;UNASSIGNED&quot; |



## Enum: ProjectTypeKeyEnum

| Name | Value |
|---- | -----|
| SOFTWARE | &quot;software&quot; |
| SERVICE_DESK | &quot;service_desk&quot; |
| BUSINESS | &quot;business&quot; |



## Enum: StyleEnum

| Name | Value |
|---- | -----|
| CLASSIC | &quot;classic&quot; |
| NEXT_GEN | &quot;next-gen&quot; |



