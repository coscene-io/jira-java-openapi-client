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
import java.util.LinkedHashSet;
import java.util.Set;

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
 * Filter for a User Picker (single) custom field.
 */
@ApiModel(description = "Filter for a User Picker (single) custom field.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class UserFilter {
  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private Set<String> groups = null;

  public static final String SERIALIZED_NAME_ROLE_IDS = "roleIds";
  @SerializedName(SERIALIZED_NAME_ROLE_IDS)
  private Set<Long> roleIds = null;

  public UserFilter() {
  }

  public UserFilter enabled(Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether the filter is enabled.
   * @return enabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Whether the filter is enabled.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public UserFilter groups(Set<String> groups) {
    
    this.groups = groups;
    return this;
  }

  public UserFilter addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new LinkedHashSet<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * User groups autocomplete suggestion users must belong to. If not provided, the default values are used. A maximum of 10 groups can be provided.
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User groups autocomplete suggestion users must belong to. If not provided, the default values are used. A maximum of 10 groups can be provided.")

  public Set<String> getGroups() {
    return groups;
  }


  public void setGroups(Set<String> groups) {
    this.groups = groups;
  }


  public UserFilter roleIds(Set<Long> roleIds) {
    
    this.roleIds = roleIds;
    return this;
  }

  public UserFilter addRoleIdsItem(Long roleIdsItem) {
    if (this.roleIds == null) {
      this.roleIds = new LinkedHashSet<>();
    }
    this.roleIds.add(roleIdsItem);
    return this;
  }

   /**
   * Roles that autocomplete suggestion users must belong to. If not provided, the default values are used. A maximum of 10 roles can be provided.
   * @return roleIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Roles that autocomplete suggestion users must belong to. If not provided, the default values are used. A maximum of 10 roles can be provided.")

  public Set<Long> getRoleIds() {
    return roleIds;
  }


  public void setRoleIds(Set<Long> roleIds) {
    this.roleIds = roleIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserFilter userFilter = (UserFilter) o;
    return Objects.equals(this.enabled, userFilter.enabled) &&
        Objects.equals(this.groups, userFilter.groups) &&
        Objects.equals(this.roleIds, userFilter.roleIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, groups, roleIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserFilter {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    roleIds: ").append(toIndentedString(roleIds)).append("\n");
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
    openapiFields.add("enabled");
    openapiFields.add("groups");
    openapiFields.add("roleIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("enabled");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserFilter
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UserFilter.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserFilter is not found in the empty JSON string", UserFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UserFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserFilter` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserFilter.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("groups") != null && !jsonObj.get("groups").isJsonNull()) && !jsonObj.get("groups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groups` to be an array in the JSON string but got `%s`", jsonObj.get("groups").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("roleIds") != null && !jsonObj.get("roleIds").isJsonNull()) && !jsonObj.get("roleIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `roleIds` to be an array in the JSON string but got `%s`", jsonObj.get("roleIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<UserFilter>() {
           @Override
           public void write(JsonWriter out, UserFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserFilter read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserFilter
  * @throws IOException if the JSON string is invalid with respect to UserFilter
  */
  public static UserFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserFilter.class);
  }

 /**
  * Convert an instance of UserFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

