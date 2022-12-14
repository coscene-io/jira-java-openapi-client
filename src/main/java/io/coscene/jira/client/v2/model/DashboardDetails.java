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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import io.coscene.jira.client.v2.JSON;

/**
 * Details of a dashboard.
 */
@ApiModel(description = "Details of a dashboard.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class DashboardDetails {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SHARE_PERMISSIONS = "sharePermissions";
  @SerializedName(SERIALIZED_NAME_SHARE_PERMISSIONS)
  private List<SharePermission> sharePermissions = new ArrayList<>();

  public static final String SERIALIZED_NAME_EDIT_PERMISSIONS = "editPermissions";
  @SerializedName(SERIALIZED_NAME_EDIT_PERMISSIONS)
  private List<SharePermission> editPermissions = new ArrayList<>();

  public DashboardDetails() {
  }

  public DashboardDetails name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the dashboard.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the dashboard.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DashboardDetails description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the dashboard.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the dashboard.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public DashboardDetails sharePermissions(List<SharePermission> sharePermissions) {
    
    this.sharePermissions = sharePermissions;
    return this;
  }

  public DashboardDetails addSharePermissionsItem(SharePermission sharePermissionsItem) {
    this.sharePermissions.add(sharePermissionsItem);
    return this;
  }

   /**
   * The share permissions for the dashboard.
   * @return sharePermissions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The share permissions for the dashboard.")

  public List<SharePermission> getSharePermissions() {
    return sharePermissions;
  }


  public void setSharePermissions(List<SharePermission> sharePermissions) {
    this.sharePermissions = sharePermissions;
  }


  public DashboardDetails editPermissions(List<SharePermission> editPermissions) {
    
    this.editPermissions = editPermissions;
    return this;
  }

  public DashboardDetails addEditPermissionsItem(SharePermission editPermissionsItem) {
    this.editPermissions.add(editPermissionsItem);
    return this;
  }

   /**
   * The edit permissions for the dashboard.
   * @return editPermissions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The edit permissions for the dashboard.")

  public List<SharePermission> getEditPermissions() {
    return editPermissions;
  }


  public void setEditPermissions(List<SharePermission> editPermissions) {
    this.editPermissions = editPermissions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardDetails dashboardDetails = (DashboardDetails) o;
    return Objects.equals(this.name, dashboardDetails.name) &&
        Objects.equals(this.description, dashboardDetails.description) &&
        Objects.equals(this.sharePermissions, dashboardDetails.sharePermissions) &&
        Objects.equals(this.editPermissions, dashboardDetails.editPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, sharePermissions, editPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardDetails {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    sharePermissions: ").append(toIndentedString(sharePermissions)).append("\n");
    sb.append("    editPermissions: ").append(toIndentedString(editPermissions)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("sharePermissions");
    openapiFields.add("editPermissions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("sharePermissions");
    openapiRequiredFields.add("editPermissions");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DashboardDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DashboardDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DashboardDetails is not found in the empty JSON string", DashboardDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DashboardDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DashboardDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DashboardDetails.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("sharePermissions") != null && !jsonObj.get("sharePermissions").isJsonNull()) {
        JsonArray jsonArraysharePermissions = jsonObj.getAsJsonArray("sharePermissions");
        if (jsonArraysharePermissions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("sharePermissions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `sharePermissions` to be an array in the JSON string but got `%s`", jsonObj.get("sharePermissions").toString()));
          }

          // validate the optional field `sharePermissions` (array)
          for (int i = 0; i < jsonArraysharePermissions.size(); i++) {
            SharePermission.validateJsonObject(jsonArraysharePermissions.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("editPermissions") != null && !jsonObj.get("editPermissions").isJsonNull()) {
        JsonArray jsonArrayeditPermissions = jsonObj.getAsJsonArray("editPermissions");
        if (jsonArrayeditPermissions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("editPermissions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `editPermissions` to be an array in the JSON string but got `%s`", jsonObj.get("editPermissions").toString()));
          }

          // validate the optional field `editPermissions` (array)
          for (int i = 0; i < jsonArrayeditPermissions.size(); i++) {
            SharePermission.validateJsonObject(jsonArrayeditPermissions.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DashboardDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DashboardDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DashboardDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DashboardDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<DashboardDetails>() {
           @Override
           public void write(JsonWriter out, DashboardDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DashboardDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DashboardDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DashboardDetails
  * @throws IOException if the JSON string is invalid with respect to DashboardDetails
  */
  public static DashboardDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DashboardDetails.class);
  }

 /**
  * Convert an instance of DashboardDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

