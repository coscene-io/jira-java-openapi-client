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
import io.swagger.annotations.ApiModel;
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
 * Details about a project.
 */
@ApiModel(description = "Details about a project.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class ProjectDetails {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private String self;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.
   */
  @JsonAdapter(ProjectTypeKeyEnum.Adapter.class)
  public enum ProjectTypeKeyEnum {
    SOFTWARE("software"),
    
    SERVICE_DESK("service_desk"),
    
    BUSINESS("business");

    private String value;

    ProjectTypeKeyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProjectTypeKeyEnum fromValue(String value) {
      for (ProjectTypeKeyEnum b : ProjectTypeKeyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ProjectTypeKeyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProjectTypeKeyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProjectTypeKeyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ProjectTypeKeyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PROJECT_TYPE_KEY = "projectTypeKey";
  @SerializedName(SERIALIZED_NAME_PROJECT_TYPE_KEY)
  private ProjectTypeKeyEnum projectTypeKey;

  public static final String SERIALIZED_NAME_SIMPLIFIED = "simplified";
  @SerializedName(SERIALIZED_NAME_SIMPLIFIED)
  private Boolean simplified;

  public static final String SERIALIZED_NAME_AVATAR_URLS = "avatarUrls";
  @SerializedName(SERIALIZED_NAME_AVATAR_URLS)
  private ProjectDetailsAvatarUrls avatarUrls;

  public static final String SERIALIZED_NAME_PROJECT_CATEGORY = "projectCategory";
  @SerializedName(SERIALIZED_NAME_PROJECT_CATEGORY)
  private ProjectDetailsProjectCategory projectCategory;

  public ProjectDetails() {
  }

  
  public ProjectDetails(
     String self, 
     String key, 
     String name, 
     ProjectTypeKeyEnum projectTypeKey, 
     Boolean simplified
  ) {
    this();
    this.self = self;
    this.key = key;
    this.name = name;
    this.projectTypeKey = projectTypeKey;
    this.simplified = simplified;
  }

   /**
   * The URL of the project details.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the project details.")

  public String getSelf() {
    return self;
  }




  public ProjectDetails id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the project.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the project.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


   /**
   * The key of the project.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the project.")

  public String getKey() {
    return key;
  }




   /**
   * The name of the project.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the project.")

  public String getName() {
    return name;
  }




   /**
   * The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.
   * @return projectTypeKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The [project type](https://confluence.atlassian.com/x/GwiiLQ#Jiraapplicationsoverview-Productfeaturesandprojecttypes) of the project.")

  public ProjectTypeKeyEnum getProjectTypeKey() {
    return projectTypeKey;
  }




   /**
   * Whether or not the project is simplified.
   * @return simplified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not the project is simplified.")

  public Boolean getSimplified() {
    return simplified;
  }




  public ProjectDetails avatarUrls(ProjectDetailsAvatarUrls avatarUrls) {
    
    this.avatarUrls = avatarUrls;
    return this;
  }

   /**
   * Get avatarUrls
   * @return avatarUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProjectDetailsAvatarUrls getAvatarUrls() {
    return avatarUrls;
  }


  public void setAvatarUrls(ProjectDetailsAvatarUrls avatarUrls) {
    this.avatarUrls = avatarUrls;
  }


  public ProjectDetails projectCategory(ProjectDetailsProjectCategory projectCategory) {
    
    this.projectCategory = projectCategory;
    return this;
  }

   /**
   * Get projectCategory
   * @return projectCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProjectDetailsProjectCategory getProjectCategory() {
    return projectCategory;
  }


  public void setProjectCategory(ProjectDetailsProjectCategory projectCategory) {
    this.projectCategory = projectCategory;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectDetails projectDetails = (ProjectDetails) o;
    return Objects.equals(this.self, projectDetails.self) &&
        Objects.equals(this.id, projectDetails.id) &&
        Objects.equals(this.key, projectDetails.key) &&
        Objects.equals(this.name, projectDetails.name) &&
        Objects.equals(this.projectTypeKey, projectDetails.projectTypeKey) &&
        Objects.equals(this.simplified, projectDetails.simplified) &&
        Objects.equals(this.avatarUrls, projectDetails.avatarUrls) &&
        Objects.equals(this.projectCategory, projectDetails.projectCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, id, key, name, projectTypeKey, simplified, avatarUrls, projectCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectDetails {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projectTypeKey: ").append(toIndentedString(projectTypeKey)).append("\n");
    sb.append("    simplified: ").append(toIndentedString(simplified)).append("\n");
    sb.append("    avatarUrls: ").append(toIndentedString(avatarUrls)).append("\n");
    sb.append("    projectCategory: ").append(toIndentedString(projectCategory)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("key");
    openapiFields.add("name");
    openapiFields.add("projectTypeKey");
    openapiFields.add("simplified");
    openapiFields.add("avatarUrls");
    openapiFields.add("projectCategory");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProjectDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectDetails is not found in the empty JSON string", ProjectDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProjectDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) && !jsonObj.get("self").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("projectTypeKey") != null && !jsonObj.get("projectTypeKey").isJsonNull()) && !jsonObj.get("projectTypeKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectTypeKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectTypeKey").toString()));
      }
      // validate the optional field `avatarUrls`
      if (jsonObj.get("avatarUrls") != null && !jsonObj.get("avatarUrls").isJsonNull()) {
        ProjectDetailsAvatarUrls.validateJsonObject(jsonObj.getAsJsonObject("avatarUrls"));
      }
      // validate the optional field `projectCategory`
      if (jsonObj.get("projectCategory") != null && !jsonObj.get("projectCategory").isJsonNull()) {
        ProjectDetailsProjectCategory.validateJsonObject(jsonObj.getAsJsonObject("projectCategory"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectDetails>() {
           @Override
           public void write(JsonWriter out, ProjectDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectDetails
  * @throws IOException if the JSON string is invalid with respect to ProjectDetails
  */
  public static ProjectDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectDetails.class);
  }

 /**
  * Convert an instance of ProjectDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

