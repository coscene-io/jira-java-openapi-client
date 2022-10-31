

# Workflow

Details about a workflow.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | [**PublishedWorkflowId**](PublishedWorkflowId.md) |  |  |
|**description** | **String** | The description of the workflow. |  |
|**transitions** | [**List&lt;Transition&gt;**](Transition.md) | The transitions of the workflow. |  [optional] |
|**statuses** | [**List&lt;WorkflowStatus&gt;**](WorkflowStatus.md) | The statuses of the workflow. |  [optional] |
|**isDefault** | **Boolean** | Whether this is the default workflow. |  [optional] |
|**schemes** | [**List&lt;WorkflowSchemeIdName&gt;**](WorkflowSchemeIdName.md) | The workflow schemes the workflow is assigned to. |  [optional] |
|**projects** | [**List&lt;ProjectDetails&gt;**](ProjectDetails.md) | The projects the workflow is assigned to, through workflow schemes. |  [optional] |
|**hasDraftWorkflow** | **Boolean** | Whether the workflow has a draft version. |  [optional] |
|**operations** | [**WorkflowOperations**](WorkflowOperations.md) |  |  [optional] |
|**created** | **OffsetDateTime** | The creation date of the workflow. |  [optional] |
|**updated** | **OffsetDateTime** | The last edited date of the workflow. |  [optional] |



