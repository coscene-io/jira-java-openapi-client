

# WorklogVisibility

Details about any restrictions in the visibility of the worklog. Optional when creating or updating a worklog.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Whether visibility of this item is restricted to a group or role. |  [optional] |
|**value** | **String** | The name of the group or role that visibility of this item is restricted to. Please note that the name of a group is mutable, to reliably identify a group use &#x60;identifier&#x60;. |  [optional] |
|**identifier** | **String** | The ID of the group or the name of the role that visibility of this item is restricted to. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| GROUP | &quot;group&quot; |
| ROLE | &quot;role&quot; |



