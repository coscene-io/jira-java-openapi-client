/*
 * The Jira Cloud platform REST API
 * Jira Cloud platform REST API documentation
 *
 * The version of the OpenAPI document: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import org.openapitools.client.model.UserApplicationRoles;
import org.openapitools.client.model.UserDetailsAvatarUrls;
import org.openapitools.client.model.UserGroups;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * The user assigned to issues created with this component, when &#x60;assigneeType&#x60; does not identify a valid assignee.
 */
@ApiModel(description = "The user assigned to issues created with this component, when `assigneeType` does not identify a valid assignee.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class ComponentWithIssueCountRealAssignee {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private URI self;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  /**
   * The user account type. Can take the following values:   *  &#x60;atlassian&#x60; regular Atlassian user account  *  &#x60;app&#x60; system account used for Connect applications and OAuth to represent external systems  *  &#x60;customer&#x60; Jira Service Desk account representing an external service desk
   */
  @JsonAdapter(AccountTypeEnum.Adapter.class)
  public enum AccountTypeEnum {
    ATLASSIAN("atlassian"),
    
    APP("app"),
    
    CUSTOMER("customer"),
    
    UNKNOWN("unknown");

    private String value;

    AccountTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccountTypeEnum fromValue(String value) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AccountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AccountTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "accountType";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private AccountTypeEnum accountType;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "emailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_AVATAR_URLS = "avatarUrls";
  @SerializedName(SERIALIZED_NAME_AVATAR_URLS)
  private UserDetailsAvatarUrls avatarUrls;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_TIME_ZONE = "timeZone";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE)
  private String timeZone;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private UserGroups groups;

  public static final String SERIALIZED_NAME_APPLICATION_ROLES = "applicationRoles";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ROLES)
  private UserApplicationRoles applicationRoles;

  public static final String SERIALIZED_NAME_EXPAND = "expand";
  @SerializedName(SERIALIZED_NAME_EXPAND)
  private String expand;

  public ComponentWithIssueCountRealAssignee() {
  }

  
  public ComponentWithIssueCountRealAssignee(
     URI self, 
     AccountTypeEnum accountType, 
     String emailAddress, 
     String displayName, 
     Boolean active, 
     String timeZone, 
     String locale, 
     String expand
  ) {
    this();
    this.self = self;
    this.accountType = accountType;
    this.emailAddress = emailAddress;
    this.displayName = displayName;
    this.active = active;
    this.timeZone = timeZone;
    this.locale = locale;
    this.expand = expand;
  }

   /**
   * The URL of the user.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the user.")

  public URI getSelf() {
    return self;
  }




  public ComponentWithIssueCountRealAssignee key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public ComponentWithIssueCountRealAssignee accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required in requests.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required in requests.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


   /**
   * The user account type. Can take the following values:   *  &#x60;atlassian&#x60; regular Atlassian user account  *  &#x60;app&#x60; system account used for Connect applications and OAuth to represent external systems  *  &#x60;customer&#x60; Jira Service Desk account representing an external service desk
   * @return accountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user account type. Can take the following values:   *  `atlassian` regular Atlassian user account  *  `app` system account used for Connect applications and OAuth to represent external systems  *  `customer` Jira Service Desk account representing an external service desk")

  public AccountTypeEnum getAccountType() {
    return accountType;
  }




  public ComponentWithIssueCountRealAssignee name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


   /**
   * The email address of the user. Depending on the user’s privacy setting, this may be returned as null.
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email address of the user. Depending on the user’s privacy setting, this may be returned as null.")

  public String getEmailAddress() {
    return emailAddress;
  }




  public ComponentWithIssueCountRealAssignee avatarUrls(UserDetailsAvatarUrls avatarUrls) {
    
    this.avatarUrls = avatarUrls;
    return this;
  }

   /**
   * Get avatarUrls
   * @return avatarUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserDetailsAvatarUrls getAvatarUrls() {
    return avatarUrls;
  }


  public void setAvatarUrls(UserDetailsAvatarUrls avatarUrls) {
    this.avatarUrls = avatarUrls;
  }


   /**
   * The display name of the user. Depending on the user’s privacy setting, this may return an alternative value.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display name of the user. Depending on the user’s privacy setting, this may return an alternative value.")

  public String getDisplayName() {
    return displayName;
  }




   /**
   * Whether the user is active.
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the user is active.")

  public Boolean getActive() {
    return active;
  }




   /**
   * The time zone specified in the user&#39;s profile. Depending on the user’s privacy setting, this may be returned as null.
   * @return timeZone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time zone specified in the user's profile. Depending on the user’s privacy setting, this may be returned as null.")

  public String getTimeZone() {
    return timeZone;
  }




   /**
   * The locale of the user. Depending on the user’s privacy setting, this may be returned as null.
   * @return locale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The locale of the user. Depending on the user’s privacy setting, this may be returned as null.")

  public String getLocale() {
    return locale;
  }




  public ComponentWithIssueCountRealAssignee groups(UserGroups groups) {
    
    this.groups = groups;
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserGroups getGroups() {
    return groups;
  }


  public void setGroups(UserGroups groups) {
    this.groups = groups;
  }


  public ComponentWithIssueCountRealAssignee applicationRoles(UserApplicationRoles applicationRoles) {
    
    this.applicationRoles = applicationRoles;
    return this;
  }

   /**
   * Get applicationRoles
   * @return applicationRoles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserApplicationRoles getApplicationRoles() {
    return applicationRoles;
  }


  public void setApplicationRoles(UserApplicationRoles applicationRoles) {
    this.applicationRoles = applicationRoles;
  }


   /**
   * Expand options that include additional user details in the response.
   * @return expand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expand options that include additional user details in the response.")

  public String getExpand() {
    return expand;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentWithIssueCountRealAssignee componentWithIssueCountRealAssignee = (ComponentWithIssueCountRealAssignee) o;
    return Objects.equals(this.self, componentWithIssueCountRealAssignee.self) &&
        Objects.equals(this.key, componentWithIssueCountRealAssignee.key) &&
        Objects.equals(this.accountId, componentWithIssueCountRealAssignee.accountId) &&
        Objects.equals(this.accountType, componentWithIssueCountRealAssignee.accountType) &&
        Objects.equals(this.name, componentWithIssueCountRealAssignee.name) &&
        Objects.equals(this.emailAddress, componentWithIssueCountRealAssignee.emailAddress) &&
        Objects.equals(this.avatarUrls, componentWithIssueCountRealAssignee.avatarUrls) &&
        Objects.equals(this.displayName, componentWithIssueCountRealAssignee.displayName) &&
        Objects.equals(this.active, componentWithIssueCountRealAssignee.active) &&
        Objects.equals(this.timeZone, componentWithIssueCountRealAssignee.timeZone) &&
        Objects.equals(this.locale, componentWithIssueCountRealAssignee.locale) &&
        Objects.equals(this.groups, componentWithIssueCountRealAssignee.groups) &&
        Objects.equals(this.applicationRoles, componentWithIssueCountRealAssignee.applicationRoles) &&
        Objects.equals(this.expand, componentWithIssueCountRealAssignee.expand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, key, accountId, accountType, name, emailAddress, avatarUrls, displayName, active, timeZone, locale, groups, applicationRoles, expand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentWithIssueCountRealAssignee {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    avatarUrls: ").append(toIndentedString(avatarUrls)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    applicationRoles: ").append(toIndentedString(applicationRoles)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("self");
    openapiFields.add("key");
    openapiFields.add("accountId");
    openapiFields.add("accountType");
    openapiFields.add("name");
    openapiFields.add("emailAddress");
    openapiFields.add("avatarUrls");
    openapiFields.add("displayName");
    openapiFields.add("active");
    openapiFields.add("timeZone");
    openapiFields.add("locale");
    openapiFields.add("groups");
    openapiFields.add("applicationRoles");
    openapiFields.add("expand");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ComponentWithIssueCountRealAssignee
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ComponentWithIssueCountRealAssignee.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ComponentWithIssueCountRealAssignee is not found in the empty JSON string", ComponentWithIssueCountRealAssignee.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ComponentWithIssueCountRealAssignee.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ComponentWithIssueCountRealAssignee` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) && !jsonObj.get("self").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonNull()) && !jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      if ((jsonObj.get("accountType") != null && !jsonObj.get("accountType").isJsonNull()) && !jsonObj.get("accountType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountType").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("emailAddress") != null && !jsonObj.get("emailAddress").isJsonNull()) && !jsonObj.get("emailAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emailAddress").toString()));
      }
      // validate the optional field `avatarUrls`
      if (jsonObj.get("avatarUrls") != null && !jsonObj.get("avatarUrls").isJsonNull()) {
        UserDetailsAvatarUrls.validateJsonObject(jsonObj.getAsJsonObject("avatarUrls"));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("timeZone") != null && !jsonObj.get("timeZone").isJsonNull()) && !jsonObj.get("timeZone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeZone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeZone").toString()));
      }
      if ((jsonObj.get("locale") != null && !jsonObj.get("locale").isJsonNull()) && !jsonObj.get("locale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locale").toString()));
      }
      // validate the optional field `groups`
      if (jsonObj.get("groups") != null && !jsonObj.get("groups").isJsonNull()) {
        UserGroups.validateJsonObject(jsonObj.getAsJsonObject("groups"));
      }
      // validate the optional field `applicationRoles`
      if (jsonObj.get("applicationRoles") != null && !jsonObj.get("applicationRoles").isJsonNull()) {
        UserApplicationRoles.validateJsonObject(jsonObj.getAsJsonObject("applicationRoles"));
      }
      if ((jsonObj.get("expand") != null && !jsonObj.get("expand").isJsonNull()) && !jsonObj.get("expand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expand").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ComponentWithIssueCountRealAssignee.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ComponentWithIssueCountRealAssignee' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ComponentWithIssueCountRealAssignee> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ComponentWithIssueCountRealAssignee.class));

       return (TypeAdapter<T>) new TypeAdapter<ComponentWithIssueCountRealAssignee>() {
           @Override
           public void write(JsonWriter out, ComponentWithIssueCountRealAssignee value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ComponentWithIssueCountRealAssignee read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ComponentWithIssueCountRealAssignee given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ComponentWithIssueCountRealAssignee
  * @throws IOException if the JSON string is invalid with respect to ComponentWithIssueCountRealAssignee
  */
  public static ComponentWithIssueCountRealAssignee fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ComponentWithIssueCountRealAssignee.class);
  }

 /**
  * Convert an instance of ComponentWithIssueCountRealAssignee to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

