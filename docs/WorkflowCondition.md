

# WorkflowCondition

The workflow transition rule conditions tree.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | The type of the transition rule. |  |
|**_configuration** | **Object** | EXPERIMENTAL. The configuration of the transition rule. |  [optional] |
|**nodeType** | **String** |  |  |
|**operator** | [**OperatorEnum**](#OperatorEnum) | The compound condition operator. |  |
|**conditions** | [**List&lt;WorkflowCondition&gt;**](WorkflowCondition.md) | The list of workflow conditions. |  |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| AND | &quot;AND&quot; |
| OR | &quot;OR&quot; |



