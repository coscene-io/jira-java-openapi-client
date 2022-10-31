

# GroupUsers

A paginated list of the users that are members of the group. A maximum of 50 users is returned in the list, to access additional users append `[start-index:end-index]` to the expand request. For example, to access the next 50 users, use`?expand=users[51:100]`.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**size** | **Integer** | The number of items on the page. |  [optional] [readonly] |
|**items** | [**List&lt;UserDetails&gt;**](UserDetails.md) | The list of items. |  [optional] [readonly] |
|**maxResults** | **Integer** | The maximum number of results that could be on the page. |  [optional] [readonly] |
|**startIndex** | **Integer** | The index of the first item returned on the page. |  [optional] [readonly] |
|**endIndex** | **Integer** | The index of the last item returned on the page. |  [optional] [readonly] |



