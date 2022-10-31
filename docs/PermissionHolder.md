

# PermissionHolder

Details of a user, group, field, or project role that holds a permission. See [Holder object](../api-group-permission-schemes/#holder-object) in *Get all permission schemes* for more information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | The type of permission holder. |  |
|**parameter** | **String** | As a group&#39;s name can change, use of &#x60;value&#x60; is recommended. The identifier associated withthe &#x60;type&#x60; value that defines the holder of the permission. |  [optional] |
|**value** | **String** | The identifier associated with the &#x60;type&#x60; value that defines the holder of the permission. |  [optional] |
|**expand** | **String** | Expand options that include additional permission holder details in the response. |  [optional] [readonly] |



