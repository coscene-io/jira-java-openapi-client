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
import org.openapitools.client.model.UserDetailsAvatarUrls;

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
 * The ID of the user who created the comment.
 */
@ApiModel(description = "The ID of the user who created the comment.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class CommentAuthor {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private String self;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

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

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "accountType";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private String accountType;

  public CommentAuthor() {
  }

  
  public CommentAuthor(
     String self, 
     String name, 
     String key, 
     String emailAddress, 
     String displayName, 
     Boolean active, 
     String timeZone, 
     String accountType
  ) {
    this();
    this.self = self;
    this.name = name;
    this.key = key;
    this.emailAddress = emailAddress;
    this.displayName = displayName;
    this.active = active;
    this.timeZone = timeZone;
    this.accountType = accountType;
  }

   /**
   * The URL of the user.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the user.")

  public String getSelf() {
    return self;
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




   /**
   * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.")

  public String getKey() {
    return key;
  }




  public CommentAuthor accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


   /**
   * The email address of the user. Depending on the user’s privacy settings, this may be returned as null.
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email address of the user. Depending on the user’s privacy settings, this may be returned as null.")

  public String getEmailAddress() {
    return emailAddress;
  }




  public CommentAuthor avatarUrls(UserDetailsAvatarUrls avatarUrls) {
    
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
   * The display name of the user. Depending on the user’s privacy settings, this may return an alternative value.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display name of the user. Depending on the user’s privacy settings, this may return an alternative value.")

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
   * The time zone specified in the user&#39;s profile. Depending on the user’s privacy settings, this may be returned as null.
   * @return timeZone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time zone specified in the user's profile. Depending on the user’s privacy settings, this may be returned as null.")

  public String getTimeZone() {
    return timeZone;
  }




   /**
   * The type of account represented by this user. This will be one of &#39;atlassian&#39; (normal users), &#39;app&#39; (application user) or &#39;customer&#39; (Jira Service Desk customer user)
   * @return accountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of account represented by this user. This will be one of 'atlassian' (normal users), 'app' (application user) or 'customer' (Jira Service Desk customer user)")

  public String getAccountType() {
    return accountType;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentAuthor commentAuthor = (CommentAuthor) o;
    return Objects.equals(this.self, commentAuthor.self) &&
        Objects.equals(this.name, commentAuthor.name) &&
        Objects.equals(this.key, commentAuthor.key) &&
        Objects.equals(this.accountId, commentAuthor.accountId) &&
        Objects.equals(this.emailAddress, commentAuthor.emailAddress) &&
        Objects.equals(this.avatarUrls, commentAuthor.avatarUrls) &&
        Objects.equals(this.displayName, commentAuthor.displayName) &&
        Objects.equals(this.active, commentAuthor.active) &&
        Objects.equals(this.timeZone, commentAuthor.timeZone) &&
        Objects.equals(this.accountType, commentAuthor.accountType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, name, key, accountId, emailAddress, avatarUrls, displayName, active, timeZone, accountType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentAuthor {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    avatarUrls: ").append(toIndentedString(avatarUrls)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("key");
    openapiFields.add("accountId");
    openapiFields.add("emailAddress");
    openapiFields.add("avatarUrls");
    openapiFields.add("displayName");
    openapiFields.add("active");
    openapiFields.add("timeZone");
    openapiFields.add("accountType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CommentAuthor
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CommentAuthor.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CommentAuthor is not found in the empty JSON string", CommentAuthor.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CommentAuthor.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CommentAuthor` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) && !jsonObj.get("self").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonNull()) && !jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
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
      if ((jsonObj.get("accountType") != null && !jsonObj.get("accountType").isJsonNull()) && !jsonObj.get("accountType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CommentAuthor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CommentAuthor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CommentAuthor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CommentAuthor.class));

       return (TypeAdapter<T>) new TypeAdapter<CommentAuthor>() {
           @Override
           public void write(JsonWriter out, CommentAuthor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CommentAuthor read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CommentAuthor given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CommentAuthor
  * @throws IOException if the JSON string is invalid with respect to CommentAuthor
  */
  public static CommentAuthor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CommentAuthor.class);
  }

 /**
  * Convert an instance of CommentAuthor to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

