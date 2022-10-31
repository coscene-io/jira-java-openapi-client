

# IssueLinkOutwardIssue

Provides details about the linked issue. If presenting this link in a user interface, use the `outward` field of the issue link type to label the link.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of an issue. Required if &#x60;key&#x60; isn&#39;t provided. |  [optional] |
|**key** | **String** | The key of an issue. Required if &#x60;id&#x60; isn&#39;t provided. |  [optional] |
|**self** | **URI** | The URL of the issue. |  [optional] [readonly] |
|**fields** | [**LinkedIssueFields**](LinkedIssueFields.md) |  |  [optional] |



