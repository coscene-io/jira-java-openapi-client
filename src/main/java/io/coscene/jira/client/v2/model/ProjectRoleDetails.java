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
 * Details about a project role.
 */
@ApiModel(description = "Details about a project role.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class ProjectRoleDetails {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private URI self;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ADMIN = "admin";
  @SerializedName(SERIALIZED_NAME_ADMIN)
  private Boolean admin;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private ProjectRoleScope scope;

  public static final String SERIALIZED_NAME_ROLE_CONFIGURABLE = "roleConfigurable";
  @SerializedName(SERIALIZED_NAME_ROLE_CONFIGURABLE)
  private Boolean roleConfigurable;

  public static final String SERIALIZED_NAME_TRANSLATED_NAME = "translatedName";
  @SerializedName(SERIALIZED_NAME_TRANSLATED_NAME)
  private String translatedName;

  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private Boolean _default;

  public ProjectRoleDetails() {
  }

  
  public ProjectRoleDetails(
     URI self, 
     Long id, 
     String description, 
     Boolean admin, 
     Boolean roleConfigurable, 
     Boolean _default
  ) {
    this();
    this.self = self;
    this.id = id;
    this.description = description;
    this.admin = admin;
    this.roleConfigurable = roleConfigurable;
    this._default = _default;
  }

   /**
   * The URL the project role details.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL the project role details.")

  public URI getSelf() {
    return self;
  }




  public ProjectRoleDetails name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the project role.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the project role.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


   /**
   * The ID of the project role.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the project role.")

  public Long getId() {
    return id;
  }




   /**
   * The description of the project role.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the project role.")

  public String getDescription() {
    return description;
  }




   /**
   * Whether this role is the admin role for the project.
   * @return admin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this role is the admin role for the project.")

  public Boolean getAdmin() {
    return admin;
  }




  public ProjectRoleDetails scope(ProjectRoleScope scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProjectRoleScope getScope() {
    return scope;
  }


  public void setScope(ProjectRoleScope scope) {
    this.scope = scope;
  }


   /**
   * Whether the roles are configurable for this project.
   * @return roleConfigurable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the roles are configurable for this project.")

  public Boolean getRoleConfigurable() {
    return roleConfigurable;
  }




  public ProjectRoleDetails translatedName(String translatedName) {
    
    this.translatedName = translatedName;
    return this;
  }

   /**
   * The translated name of the project role.
   * @return translatedName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The translated name of the project role.")

  public String getTranslatedName() {
    return translatedName;
  }


  public void setTranslatedName(String translatedName) {
    this.translatedName = translatedName;
  }


   /**
   * Whether this role is the default role for the project.
   * @return _default
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this role is the default role for the project.")

  public Boolean getDefault() {
    return _default;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectRoleDetails projectRoleDetails = (ProjectRoleDetails) o;
    return Objects.equals(this.self, projectRoleDetails.self) &&
        Objects.equals(this.name, projectRoleDetails.name) &&
        Objects.equals(this.id, projectRoleDetails.id) &&
        Objects.equals(this.description, projectRoleDetails.description) &&
        Objects.equals(this.admin, projectRoleDetails.admin) &&
        Objects.equals(this.scope, projectRoleDetails.scope) &&
        Objects.equals(this.roleConfigurable, projectRoleDetails.roleConfigurable) &&
        Objects.equals(this.translatedName, projectRoleDetails.translatedName) &&
        Objects.equals(this._default, projectRoleDetails._default);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, name, id, description, admin, scope, roleConfigurable, translatedName, _default);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectRoleDetails {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    roleConfigurable: ").append(toIndentedString(roleConfigurable)).append("\n");
    sb.append("    translatedName: ").append(toIndentedString(translatedName)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("description");
    openapiFields.add("admin");
    openapiFields.add("scope");
    openapiFields.add("roleConfigurable");
    openapiFields.add("translatedName");
    openapiFields.add("default");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectRoleDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProjectRoleDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectRoleDetails is not found in the empty JSON string", ProjectRoleDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProjectRoleDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectRoleDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) && !jsonObj.get("self").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `scope`
      if (jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull()) {
        ProjectRoleScope.validateJsonObject(jsonObj.getAsJsonObject("scope"));
      }
      if ((jsonObj.get("translatedName") != null && !jsonObj.get("translatedName").isJsonNull()) && !jsonObj.get("translatedName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `translatedName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("translatedName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectRoleDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectRoleDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectRoleDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectRoleDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectRoleDetails>() {
           @Override
           public void write(JsonWriter out, ProjectRoleDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectRoleDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectRoleDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectRoleDetails
  * @throws IOException if the JSON string is invalid with respect to ProjectRoleDetails
  */
  public static ProjectRoleDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectRoleDetails.class);
  }

 /**
  * Convert an instance of ProjectRoleDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

