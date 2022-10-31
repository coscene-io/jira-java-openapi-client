

# UpdateUiModificationDetails

The details of a UI modification.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the UI modification. The maximum length is 255 characters. |  [optional] |
|**description** | **String** | The description of the UI modification. The maximum length is 255 characters. |  [optional] |
|**data** | **String** | The data of the UI modification. The maximum size of the data is 50000 characters. |  [optional] |
|**contexts** | [**List&lt;UiModificationContextDetails&gt;**](UiModificationContextDetails.md) | List of contexts of the UI modification. The maximum number of contexts is 1000. If provided, replaces all existing contexts. |  [optional] |



