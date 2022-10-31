

# IssueFieldOptionScopeBeanGlobal

Defines the behavior of the option within the global context. If this property is set, even if set to an empty object, then the option is available in all projects.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**attributes** | [**Set&lt;AttributesEnum&gt;**](#Set&lt;AttributesEnum&gt;) | Defines the behavior of the option in the global context.If notSelectable is set, the option cannot be set as the field&#39;s value. This is useful for archiving an option that has previously been selected but shouldn&#39;t be used anymore.If defaultValue is set, the option is selected by default. |  [optional] |



## Enum: Set&lt;AttributesEnum&gt;

| Name | Value |
|---- | -----|
| NOTSELECTABLE | &quot;notSelectable&quot; |
| DEFAULTVALUE | &quot;defaultValue&quot; |



