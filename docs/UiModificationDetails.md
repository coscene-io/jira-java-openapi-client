

# UiModificationDetails

The details of a UI modification.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The ID of the UI modification. |  [readonly] |
|**name** | **String** | The name of the UI modification. The maximum length is 255 characters. |  [readonly] |
|**description** | **String** | The description of the UI modification. The maximum length is 255 characters. |  [optional] [readonly] |
|**self** | **String** | The URL of the UI modification. |  [readonly] |
|**data** | **String** | The data of the UI modification. The maximum size of the data is 50000 characters. |  [optional] [readonly] |
|**contexts** | [**List&lt;UiModificationContextDetails&gt;**](UiModificationContextDetails.md) | List of contexts of the UI modification. The maximum number of contexts is 1000. |  [optional] [readonly] |



