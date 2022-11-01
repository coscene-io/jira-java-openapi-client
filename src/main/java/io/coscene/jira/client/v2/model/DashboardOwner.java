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


package io.coscene.jira.client.v2.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import io.coscene.jira.client.v2.JSON;

/**
 * The owner of the dashboard.
 */
@ApiModel(description = "The owner of the dashboard.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class DashboardOwner {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private URI self;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_AVATAR_URLS = "avatarUrls";
  @SerializedName(SERIALIZED_NAME_AVATAR_URLS)
  private UserBeanAvatarUrls avatarUrls;

  public DashboardOwner() {
  }

  public DashboardOwner key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * This property is deprecated in favor of &#x60;accountId&#x60; because of privacy changes. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.   The key of the user.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This property is deprecated in favor of `accountId` because of privacy changes. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.   The key of the user.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public DashboardOwner self(URI self) {
    
    this.self = self;
    return this;
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


  public void setSelf(URI self) {
    this.self = self;
  }


  public DashboardOwner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * This property is deprecated in favor of &#x60;accountId&#x60; because of privacy changes. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.   The username of the user.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This property is deprecated in favor of `accountId` because of privacy changes. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.   The username of the user.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DashboardOwner displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
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


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public DashboardOwner active(Boolean active) {
    
    this.active = active;
    return this;
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


  public void setActive(Boolean active) {
    this.active = active;
  }


  public DashboardOwner accountId(String accountId) {
    
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


  public DashboardOwner avatarUrls(UserBeanAvatarUrls avatarUrls) {
    
    this.avatarUrls = avatarUrls;
    return this;
  }

   /**
   * Get avatarUrls
   * @return avatarUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserBeanAvatarUrls getAvatarUrls() {
    return avatarUrls;
  }


  public void setAvatarUrls(UserBeanAvatarUrls avatarUrls) {
    this.avatarUrls = avatarUrls;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardOwner dashboardOwner = (DashboardOwner) o;
    return Objects.equals(this.key, dashboardOwner.key) &&
        Objects.equals(this.self, dashboardOwner.self) &&
        Objects.equals(this.name, dashboardOwner.name) &&
        Objects.equals(this.displayName, dashboardOwner.displayName) &&
        Objects.equals(this.active, dashboardOwner.active) &&
        Objects.equals(this.accountId, dashboardOwner.accountId) &&
        Objects.equals(this.avatarUrls, dashboardOwner.avatarUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, self, name, displayName, active, accountId, avatarUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardOwner {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    avatarUrls: ").append(toIndentedString(avatarUrls)).append("\n");
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
    openapiFields.add("key");
    openapiFields.add("self");
    openapiFields.add("name");
    openapiFields.add("displayName");
    openapiFields.add("active");
    openapiFields.add("accountId");
    openapiFields.add("avatarUrls");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DashboardOwner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DashboardOwner.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DashboardOwner is not found in the empty JSON string", DashboardOwner.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DashboardOwner.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DashboardOwner` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) && !jsonObj.get("self").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonNull()) && !jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      // validate the optional field `avatarUrls`
      if (jsonObj.get("avatarUrls") != null && !jsonObj.get("avatarUrls").isJsonNull()) {
        UserBeanAvatarUrls.validateJsonObject(jsonObj.getAsJsonObject("avatarUrls"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DashboardOwner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DashboardOwner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DashboardOwner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DashboardOwner.class));

       return (TypeAdapter<T>) new TypeAdapter<DashboardOwner>() {
           @Override
           public void write(JsonWriter out, DashboardOwner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DashboardOwner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DashboardOwner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DashboardOwner
  * @throws IOException if the JSON string is invalid with respect to DashboardOwner
  */
  public static DashboardOwner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DashboardOwner.class);
  }

 /**
  * Convert an instance of DashboardOwner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

