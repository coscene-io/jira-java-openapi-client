

# UiModificationContextDetails

The details of a UI modification's context, which define where to activate the UI modification.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the UI modification context. |  [optional] [readonly] |
|**projectId** | **String** | The project ID of the context. |  |
|**issueTypeId** | **String** | The issue type ID of the context. |  |
|**viewType** | **String** | The view type of the context. Only &#x60;GIC&#x60; (Global Issue Create) is supported. |  |
|**isAvailable** | **Boolean** | Whether a context is available. For example, when a project is deleted the context becomes unavailable. |  [optional] [readonly] |


