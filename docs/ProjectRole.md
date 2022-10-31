

# ProjectRole

Details about the roles in a project.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**self** | **URI** | The URL the project role details. |  [optional] [readonly] |
|**name** | **String** | The name of the project role. |  [optional] |
|**id** | **Long** | The ID of the project role. |  [optional] [readonly] |
|**description** | **String** | The description of the project role. |  [optional] [readonly] |
|**actors** | [**List&lt;RoleActor&gt;**](RoleActor.md) | The list of users who act in this role. |  [optional] [readonly] |
|**scope** | [**ProjectRoleScope**](ProjectRoleScope.md) |  |  [optional] |
|**translatedName** | **String** | The translated name of the project role. |  [optional] |
|**currentUserRole** | **Boolean** | Whether the calling user is part of this role. |  [optional] |
|**_default** | **Boolean** | Whether this role is the default role for the project |  [optional] [readonly] |
|**admin** | **Boolean** | Whether this role is the admin role for the project. |  [optional] [readonly] |
|**roleConfigurable** | **Boolean** | Whether the roles are configurable for this project. |  [optional] [readonly] |



