

# CreateWorkflowCondition

A workflow transition condition.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**operator** | [**OperatorEnum**](#OperatorEnum) | The compound condition operator. |  [optional] |
|**conditions** | [**List&lt;CreateWorkflowCondition&gt;**](CreateWorkflowCondition.md) | The list of workflow conditions. |  [optional] |
|**type** | **String** | The type of the transition rule. |  [optional] |
|**_configuration** | **Map&lt;String, Object&gt;** | EXPERIMENTAL. The configuration of the transition rule. |  [optional] |



## Enum: OperatorEnum

| Name | Value |
|---- | -----|
| AND | &quot;AND&quot; |
| OR | &quot;OR&quot; |



