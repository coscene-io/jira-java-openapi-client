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
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

import io.coscene.jira.client.v3.JSON;

/**
 * SharePermissionInputBean
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class SharePermissionInputBean {
  /**
   * The type of the share permission.Specify the type as follows:   *  &#x60;user&#x60; Share with a user.  *  &#x60;group&#x60; Share with a group. Specify &#x60;groupname&#x60; as well.  *  &#x60;project&#x60; Share with a project. Specify &#x60;projectId&#x60; as well.  *  &#x60;projectRole&#x60; Share with a project role in a project. Specify &#x60;projectId&#x60; and &#x60;projectRoleId&#x60; as well.  *  &#x60;global&#x60; Share globally, including anonymous users. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.  *  &#x60;authenticated&#x60; Share with all logged-in users. This shows as &#x60;loggedin&#x60; in the response. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    USER("user"),
    
    PROJECT("project"),
    
    GROUP("group"),
    
    PROJECTROLE("projectRole"),
    
    GLOBAL("global"),
    
    AUTHENTICATED("authenticated");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_GROUPNAME = "groupname";
  @SerializedName(SERIALIZED_NAME_GROUPNAME)
  private String groupname;

  public static final String SERIALIZED_NAME_PROJECT_ROLE_ID = "projectRoleId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ROLE_ID)
  private String projectRoleId;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_RIGHTS = "rights";
  @SerializedName(SERIALIZED_NAME_RIGHTS)
  private Integer rights;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public SharePermissionInputBean() {
  }

  public SharePermissionInputBean type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the share permission.Specify the type as follows:   *  &#x60;user&#x60; Share with a user.  *  &#x60;group&#x60; Share with a group. Specify &#x60;groupname&#x60; as well.  *  &#x60;project&#x60; Share with a project. Specify &#x60;projectId&#x60; as well.  *  &#x60;projectRole&#x60; Share with a project role in a project. Specify &#x60;projectId&#x60; and &#x60;projectRoleId&#x60; as well.  *  &#x60;global&#x60; Share globally, including anonymous users. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.  *  &#x60;authenticated&#x60; Share with all logged-in users. This shows as &#x60;loggedin&#x60; in the response. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of the share permission.Specify the type as follows:   *  `user` Share with a user.  *  `group` Share with a group. Specify `groupname` as well.  *  `project` Share with a project. Specify `projectId` as well.  *  `projectRole` Share with a project role in a project. Specify `projectId` and `projectRoleId` as well.  *  `global` Share globally, including anonymous users. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.  *  `authenticated` Share with all logged-in users. This shows as `loggedin` in the response. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public SharePermissionInputBean projectId(String projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * The ID of the project to share the filter with. Set &#x60;type&#x60; to &#x60;project&#x60;.
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the project to share the filter with. Set `type` to `project`.")

  public String getProjectId() {
    return projectId;
  }


  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  public SharePermissionInputBean groupname(String groupname) {
    
    this.groupname = groupname;
    return this;
  }

   /**
   * The name of the group to share the filter with. Set &#x60;type&#x60; to &#x60;group&#x60;. Please note that the name of a group is mutable, to reliably identify a group use &#x60;groupId&#x60;.
   * @return groupname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the group to share the filter with. Set `type` to `group`. Please note that the name of a group is mutable, to reliably identify a group use `groupId`.")

  public String getGroupname() {
    return groupname;
  }


  public void setGroupname(String groupname) {
    this.groupname = groupname;
  }


  public SharePermissionInputBean projectRoleId(String projectRoleId) {
    
    this.projectRoleId = projectRoleId;
    return this;
  }

   /**
   * The ID of the project role to share the filter with. Set &#x60;type&#x60; to &#x60;projectRole&#x60; and the &#x60;projectId&#x60; for the project that the role is in.
   * @return projectRoleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the project role to share the filter with. Set `type` to `projectRole` and the `projectId` for the project that the role is in.")

  public String getProjectRoleId() {
    return projectRoleId;
  }


  public void setProjectRoleId(String projectRoleId) {
    this.projectRoleId = projectRoleId;
  }


  public SharePermissionInputBean accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The user account ID that the filter is shared with. For a request, specify the &#x60;accountId&#x60; property for the user.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user account ID that the filter is shared with. For a request, specify the `accountId` property for the user.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public SharePermissionInputBean rights(Integer rights) {
    
    this.rights = rights;
    return this;
  }

   /**
   * The rights for the share permission.
   * @return rights
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The rights for the share permission.")

  public Integer getRights() {
    return rights;
  }


  public void setRights(Integer rights) {
    this.rights = rights;
  }


  public SharePermissionInputBean groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * The ID of the group, which uniquely identifies the group across all Atlassian products.For example, *952d12c3-5b5b-4d04-bb32-44d383afc4b2*. Cannot be provided with &#x60;groupname&#x60;.
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the group, which uniquely identifies the group across all Atlassian products.For example, *952d12c3-5b5b-4d04-bb32-44d383afc4b2*. Cannot be provided with `groupname`.")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
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
    SharePermissionInputBean sharePermissionInputBean = (SharePermissionInputBean) o;
    return Objects.equals(this.type, sharePermissionInputBean.type) &&
        Objects.equals(this.projectId, sharePermissionInputBean.projectId) &&
        Objects.equals(this.groupname, sharePermissionInputBean.groupname) &&
        Objects.equals(this.projectRoleId, sharePermissionInputBean.projectRoleId) &&
        Objects.equals(this.accountId, sharePermissionInputBean.accountId) &&
        Objects.equals(this.rights, sharePermissionInputBean.rights) &&
        Objects.equals(this.groupId, sharePermissionInputBean.groupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, projectId, groupname, projectRoleId, accountId, rights, groupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharePermissionInputBean {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    groupname: ").append(toIndentedString(groupname)).append("\n");
    sb.append("    projectRoleId: ").append(toIndentedString(projectRoleId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    rights: ").append(toIndentedString(rights)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("projectId");
    openapiFields.add("groupname");
    openapiFields.add("projectRoleId");
    openapiFields.add("accountId");
    openapiFields.add("rights");
    openapiFields.add("groupId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SharePermissionInputBean
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SharePermissionInputBean.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SharePermissionInputBean is not found in the empty JSON string", SharePermissionInputBean.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SharePermissionInputBean.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SharePermissionInputBean` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SharePermissionInputBean.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("projectId") != null && !jsonObj.get("projectId").isJsonNull()) && !jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      if ((jsonObj.get("groupname") != null && !jsonObj.get("groupname").isJsonNull()) && !jsonObj.get("groupname").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupname` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupname").toString()));
      }
      if ((jsonObj.get("projectRoleId") != null && !jsonObj.get("projectRoleId").isJsonNull()) && !jsonObj.get("projectRoleId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectRoleId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectRoleId").toString()));
      }
      if ((jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonNull()) && !jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      if ((jsonObj.get("groupId") != null && !jsonObj.get("groupId").isJsonNull()) && !jsonObj.get("groupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SharePermissionInputBean.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SharePermissionInputBean' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SharePermissionInputBean> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SharePermissionInputBean.class));

       return (TypeAdapter<T>) new TypeAdapter<SharePermissionInputBean>() {
           @Override
           public void write(JsonWriter out, SharePermissionInputBean value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SharePermissionInputBean read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SharePermissionInputBean given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SharePermissionInputBean
  * @throws IOException if the JSON string is invalid with respect to SharePermissionInputBean
  */
  public static SharePermissionInputBean fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SharePermissionInputBean.class);
  }

 /**
  * Convert an instance of SharePermissionInputBean to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

