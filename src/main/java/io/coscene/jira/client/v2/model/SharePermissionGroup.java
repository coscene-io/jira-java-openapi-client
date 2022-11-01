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
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import io.coscene.jira.client.v2.JSON;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The group that the filter is shared with. For a request, specify the &#x60;groupId&#x60; or &#x60;name&#x60; property for the group. As a group&#39;s name can change, use of &#x60;groupId&#x60; is recommended.
 */
@ApiModel(description = "The group that the filter is shared with. For a request, specify the `groupId` or `name` property for the group. As a group's name can change, use of `groupId` is recommended.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class SharePermissionGroup {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private URI self;

  public SharePermissionGroup() {
  }

  
  public SharePermissionGroup(
     URI self
  ) {
    this();
    this.self = self;
  }

  public SharePermissionGroup name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of group.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of group.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SharePermissionGroup groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * The ID of the group, which uniquely identifies the group across all Atlassian products. For example, *952d12c3-5b5b-4d04-bb32-44d383afc4b2*.
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the group, which uniquely identifies the group across all Atlassian products. For example, *952d12c3-5b5b-4d04-bb32-44d383afc4b2*.")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


   /**
   * The URL for these group details.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL for these group details.")

  public URI getSelf() {
    return self;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharePermissionGroup sharePermissionGroup = (SharePermissionGroup) o;
    return Objects.equals(this.name, sharePermissionGroup.name) &&
        Objects.equals(this.groupId, sharePermissionGroup.groupId) &&
        Objects.equals(this.self, sharePermissionGroup.self);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, groupId, self);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharePermissionGroup {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("groupId");
    openapiFields.add("self");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SharePermissionGroup
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SharePermissionGroup.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SharePermissionGroup is not found in the empty JSON string", SharePermissionGroup.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SharePermissionGroup.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SharePermissionGroup` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("groupId") != null && !jsonObj.get("groupId").isJsonNull()) && !jsonObj.get("groupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupId").toString()));
      }
      if ((jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) && !jsonObj.get("self").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SharePermissionGroup.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SharePermissionGroup' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SharePermissionGroup> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SharePermissionGroup.class));

       return (TypeAdapter<T>) new TypeAdapter<SharePermissionGroup>() {
           @Override
           public void write(JsonWriter out, SharePermissionGroup value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SharePermissionGroup read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SharePermissionGroup given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SharePermissionGroup
  * @throws IOException if the JSON string is invalid with respect to SharePermissionGroup
  */
  public static SharePermissionGroup fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SharePermissionGroup.class);
  }

 /**
  * Convert an instance of SharePermissionGroup to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

