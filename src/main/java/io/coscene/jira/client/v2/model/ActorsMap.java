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
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import io.coscene.jira.client.v2.JSON;

/**
 * ActorsMap
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class ActorsMap {
  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private List<String> user = null;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private List<String> group = null;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private List<String> groupId = null;

  public ActorsMap() {
  }

  public ActorsMap user(List<String> user) {
    
    this.user = user;
    return this;
  }

  public ActorsMap addUserItem(String userItem) {
    if (this.user == null) {
      this.user = new ArrayList<>();
    }
    this.user.add(userItem);
    return this;
  }

   /**
   * The user account ID of the user to add.
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user account ID of the user to add.")

  public List<String> getUser() {
    return user;
  }


  public void setUser(List<String> user) {
    this.user = user;
  }


  public ActorsMap group(List<String> group) {
    
    this.group = group;
    return this;
  }

  public ActorsMap addGroupItem(String groupItem) {
    if (this.group == null) {
      this.group = new ArrayList<>();
    }
    this.group.add(groupItem);
    return this;
  }

   /**
   * The name of the group to add. This parameter cannot be used with the &#x60;groupId&#x60; parameter. As a group&#39;s name can change, use of &#x60;groupId&#x60; is recommended.
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the group to add. This parameter cannot be used with the `groupId` parameter. As a group's name can change, use of `groupId` is recommended.")

  public List<String> getGroup() {
    return group;
  }


  public void setGroup(List<String> group) {
    this.group = group;
  }


  public ActorsMap groupId(List<String> groupId) {
    
    this.groupId = groupId;
    return this;
  }

  public ActorsMap addGroupIdItem(String groupIdItem) {
    if (this.groupId == null) {
      this.groupId = new ArrayList<>();
    }
    this.groupId.add(groupIdItem);
    return this;
  }

   /**
   * The ID of the group to add. This parameter cannot be used with the &#x60;group&#x60; parameter.
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the group to add. This parameter cannot be used with the `group` parameter.")

  public List<String> getGroupId() {
    return groupId;
  }


  public void setGroupId(List<String> groupId) {
    this.groupId = groupId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActorsMap actorsMap = (ActorsMap) o;
    return Objects.equals(this.user, actorsMap.user) &&
        Objects.equals(this.group, actorsMap.group) &&
        Objects.equals(this.groupId, actorsMap.groupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, group, groupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActorsMap {\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
    openapiFields.add("user");
    openapiFields.add("group");
    openapiFields.add("groupId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ActorsMap
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ActorsMap.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ActorsMap is not found in the empty JSON string", ActorsMap.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ActorsMap.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ActorsMap` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) && !jsonObj.get("user").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `user` to be an array in the JSON string but got `%s`", jsonObj.get("user").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("group") != null && !jsonObj.get("group").isJsonNull()) && !jsonObj.get("group").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `group` to be an array in the JSON string but got `%s`", jsonObj.get("group").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("groupId") != null && !jsonObj.get("groupId").isJsonNull()) && !jsonObj.get("groupId").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupId` to be an array in the JSON string but got `%s`", jsonObj.get("groupId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ActorsMap.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ActorsMap' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ActorsMap> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ActorsMap.class));

       return (TypeAdapter<T>) new TypeAdapter<ActorsMap>() {
           @Override
           public void write(JsonWriter out, ActorsMap value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ActorsMap read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ActorsMap given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ActorsMap
  * @throws IOException if the JSON string is invalid with respect to ActorsMap
  */
  public static ActorsMap fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ActorsMap.class);
  }

 /**
  * Convert an instance of ActorsMap to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

