

# FilterDetailsOwner

The user who owns the filter. Defaults to the creator of the filter, however, Jira administrators can change the owner of a shared filter in the admin settings.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**self** | **URI** | The URL of the user. |  [optional] [readonly] |
|**key** | **String** | This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. |  [optional] |
|**accountId** | **String** | The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required in requests. |  [optional] |
|**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) | The user account type. Can take the following values:   *  &#x60;atlassian&#x60; regular Atlassian user account  *  &#x60;app&#x60; system account used for Connect applications and OAuth to represent external systems  *  &#x60;customer&#x60; Jira Service Desk account representing an external service desk |  [optional] [readonly] |
|**name** | **String** | This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. |  [optional] |
|**emailAddress** | **String** | The email address of the user. Depending on the user’s privacy setting, this may be returned as null. |  [optional] [readonly] |
|**avatarUrls** | [**UserDetailsAvatarUrls**](UserDetailsAvatarUrls.md) |  |  [optional] |
|**displayName** | **String** | The display name of the user. Depending on the user’s privacy setting, this may return an alternative value. |  [optional] [readonly] |
|**active** | **Boolean** | Whether the user is active. |  [optional] [readonly] |
|**timeZone** | **String** | The time zone specified in the user&#39;s profile. Depending on the user’s privacy setting, this may be returned as null. |  [optional] [readonly] |
|**locale** | **String** | The locale of the user. Depending on the user’s privacy setting, this may be returned as null. |  [optional] [readonly] |
|**groups** | [**UserGroups**](UserGroups.md) |  |  [optional] |
|**applicationRoles** | [**UserApplicationRoles**](UserApplicationRoles.md) |  |  [optional] |
|**expand** | **String** | Expand options that include additional user details in the response. |  [optional] [readonly] |



## Enum: AccountTypeEnum

| Name | Value |
|---- | -----|
| ATLASSIAN | &quot;atlassian&quot; |
| APP | &quot;app&quot; |
| CUSTOMER | &quot;customer&quot; |
| UNKNOWN | &quot;unknown&quot; |



