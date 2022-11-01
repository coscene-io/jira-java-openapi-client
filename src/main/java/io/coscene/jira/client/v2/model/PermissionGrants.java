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
import com.google.gson.JsonArray;
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
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import io.coscene.jira.client.v2.JSON;

/**
 * List of permission grants.
 */
@ApiModel(description = "List of permission grants.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class PermissionGrants {
  public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";
  @SerializedName(SERIALIZED_NAME_PERMISSIONS)
  private List<PermissionGrant> permissions = null;

  public static final String SERIALIZED_NAME_EXPAND = "expand";
  @SerializedName(SERIALIZED_NAME_EXPAND)
  private String expand;

  public PermissionGrants() {
  }

  
  public PermissionGrants(
     List<PermissionGrant> permissions, 
     String expand
  ) {
    this();
    this.permissions = permissions;
    this.expand = expand;
  }

   /**
   * Permission grants list.
   * @return permissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Permission grants list.")

  public List<PermissionGrant> getPermissions() {
    return permissions;
  }




   /**
   * Expand options that include additional permission grant details in the response.
   * @return expand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expand options that include additional permission grant details in the response.")

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
    PermissionGrants permissionGrants = (PermissionGrants) o;
    return Objects.equals(this.permissions, permissionGrants.permissions) &&
        Objects.equals(this.expand, permissionGrants.expand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissions, expand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionGrants {\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
    openapiFields.add("permissions");
    openapiFields.add("expand");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PermissionGrants
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PermissionGrants.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PermissionGrants is not found in the empty JSON string", PermissionGrants.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PermissionGrants.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PermissionGrants` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("permissions") != null && !jsonObj.get("permissions").isJsonNull()) {
        JsonArray jsonArraypermissions = jsonObj.getAsJsonArray("permissions");
        if (jsonArraypermissions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("permissions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `permissions` to be an array in the JSON string but got `%s`", jsonObj.get("permissions").toString()));
          }

          // validate the optional field `permissions` (array)
          for (int i = 0; i < jsonArraypermissions.size(); i++) {
            PermissionGrant.validateJsonObject(jsonArraypermissions.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("expand") != null && !jsonObj.get("expand").isJsonNull()) && !jsonObj.get("expand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expand").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PermissionGrants.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PermissionGrants' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PermissionGrants> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PermissionGrants.class));

       return (TypeAdapter<T>) new TypeAdapter<PermissionGrants>() {
           @Override
           public void write(JsonWriter out, PermissionGrants value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PermissionGrants read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PermissionGrants given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PermissionGrants
  * @throws IOException if the JSON string is invalid with respect to PermissionGrants
  */
  public static PermissionGrants fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PermissionGrants.class);
  }

 /**
  * Convert an instance of PermissionGrants to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
