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


package io.coscene.jira.client.v3.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashSet;
import java.util.Map.Entry;

import io.coscene.jira.client.v3.JSON;

/**
 * Details of global permissions to look up and project permissions with associated projects and issues to look up.
 */
@ApiModel(description = "Details of global permissions to look up and project permissions with associated projects and issues to look up.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class BulkPermissionsRequestBean {
  public static final String SERIALIZED_NAME_PROJECT_PERMISSIONS = "projectPermissions";
  @SerializedName(SERIALIZED_NAME_PROJECT_PERMISSIONS)
  private Set<BulkProjectPermissions> projectPermissions = null;

  public static final String SERIALIZED_NAME_GLOBAL_PERMISSIONS = "globalPermissions";
  @SerializedName(SERIALIZED_NAME_GLOBAL_PERMISSIONS)
  private Set<String> globalPermissions = null;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public BulkPermissionsRequestBean() {
  }

  public BulkPermissionsRequestBean projectPermissions(Set<BulkProjectPermissions> projectPermissions) {
    
    this.projectPermissions = projectPermissions;
    return this;
  }

  public BulkPermissionsRequestBean addProjectPermissionsItem(BulkProjectPermissions projectPermissionsItem) {
    if (this.projectPermissions == null) {
      this.projectPermissions = new LinkedHashSet<>();
    }
    this.projectPermissions.add(projectPermissionsItem);
    return this;
  }

   /**
   * Project permissions with associated projects and issues to look up.
   * @return projectPermissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Project permissions with associated projects and issues to look up.")

  public Set<BulkProjectPermissions> getProjectPermissions() {
    return projectPermissions;
  }


  public void setProjectPermissions(Set<BulkProjectPermissions> projectPermissions) {
    this.projectPermissions = projectPermissions;
  }


  public BulkPermissionsRequestBean globalPermissions(Set<String> globalPermissions) {
    
    this.globalPermissions = globalPermissions;
    return this;
  }

  public BulkPermissionsRequestBean addGlobalPermissionsItem(String globalPermissionsItem) {
    if (this.globalPermissions == null) {
      this.globalPermissions = new LinkedHashSet<>();
    }
    this.globalPermissions.add(globalPermissionsItem);
    return this;
  }

   /**
   * Global permissions to look up.
   * @return globalPermissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Global permissions to look up.")

  public Set<String> getGlobalPermissions() {
    return globalPermissions;
  }


  public void setGlobalPermissions(Set<String> globalPermissions) {
    this.globalPermissions = globalPermissions;
  }


  public BulkPermissionsRequestBean accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The account ID of a user.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account ID of a user.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkPermissionsRequestBean bulkPermissionsRequestBean = (BulkPermissionsRequestBean) o;
    return Objects.equals(this.projectPermissions, bulkPermissionsRequestBean.projectPermissions) &&
        Objects.equals(this.globalPermissions, bulkPermissionsRequestBean.globalPermissions) &&
        Objects.equals(this.accountId, bulkPermissionsRequestBean.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectPermissions, globalPermissions, accountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkPermissionsRequestBean {\n");
    sb.append("    projectPermissions: ").append(toIndentedString(projectPermissions)).append("\n");
    sb.append("    globalPermissions: ").append(toIndentedString(globalPermissions)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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
    openapiFields.add("projectPermissions");
    openapiFields.add("globalPermissions");
    openapiFields.add("accountId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BulkPermissionsRequestBean
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BulkPermissionsRequestBean.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BulkPermissionsRequestBean is not found in the empty JSON string", BulkPermissionsRequestBean.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BulkPermissionsRequestBean.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BulkPermissionsRequestBean` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("projectPermissions") != null && !jsonObj.get("projectPermissions").isJsonNull()) {
        JsonArray jsonArrayprojectPermissions = jsonObj.getAsJsonArray("projectPermissions");
        if (jsonArrayprojectPermissions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("projectPermissions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `projectPermissions` to be an array in the JSON string but got `%s`", jsonObj.get("projectPermissions").toString()));
          }

          // validate the optional field `projectPermissions` (array)
          for (int i = 0; i < jsonArrayprojectPermissions.size(); i++) {
            BulkProjectPermissions.validateJsonObject(jsonArrayprojectPermissions.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("globalPermissions") != null && !jsonObj.get("globalPermissions").isJsonNull()) && !jsonObj.get("globalPermissions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `globalPermissions` to be an array in the JSON string but got `%s`", jsonObj.get("globalPermissions").toString()));
      }
      if ((jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonNull()) && !jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BulkPermissionsRequestBean.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BulkPermissionsRequestBean' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BulkPermissionsRequestBean> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BulkPermissionsRequestBean.class));

       return (TypeAdapter<T>) new TypeAdapter<BulkPermissionsRequestBean>() {
           @Override
           public void write(JsonWriter out, BulkPermissionsRequestBean value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BulkPermissionsRequestBean read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BulkPermissionsRequestBean given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BulkPermissionsRequestBean
  * @throws IOException if the JSON string is invalid with respect to BulkPermissionsRequestBean
  */
  public static BulkPermissionsRequestBean fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BulkPermissionsRequestBean.class);
  }

 /**
  * Convert an instance of BulkPermissionsRequestBean to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
