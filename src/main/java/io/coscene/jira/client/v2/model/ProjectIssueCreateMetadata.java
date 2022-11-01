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
 * Details of the issue creation metadata for a project.
 */
@ApiModel(description = "Details of the issue creation metadata for a project.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class ProjectIssueCreateMetadata {
  public static final String SERIALIZED_NAME_EXPAND = "expand";
  @SerializedName(SERIALIZED_NAME_EXPAND)
  private String expand;

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

  public static final String SERIALIZED_NAME_AVATAR_URLS = "avatarUrls";
  @SerializedName(SERIALIZED_NAME_AVATAR_URLS)
  private ProjectIssueCreateMetadataAvatarUrls avatarUrls;

  public static final String SERIALIZED_NAME_ISSUETYPES = "issuetypes";
  @SerializedName(SERIALIZED_NAME_ISSUETYPES)
  private List<IssueTypeIssueCreateMetadata> issuetypes = null;

  public ProjectIssueCreateMetadata() {
  }

  
  public ProjectIssueCreateMetadata(
     String expand, 
     String self, 
     String id, 
     String key, 
     String name, 
     List<IssueTypeIssueCreateMetadata> issuetypes
  ) {
    this();
    this.expand = expand;
    this.self = self;
    this.id = id;
    this.key = key;
    this.name = name;
    this.issuetypes = issuetypes;
  }

   /**
   * Expand options that include additional project issue create metadata details in the response.
   * @return expand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expand options that include additional project issue create metadata details in the response.")

  public String getExpand() {
    return expand;
  }




   /**
   * The URL of the project.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the project.")

  public String getSelf() {
    return self;
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




  public ProjectIssueCreateMetadata avatarUrls(ProjectIssueCreateMetadataAvatarUrls avatarUrls) {
    
    this.avatarUrls = avatarUrls;
    return this;
  }

   /**
   * Get avatarUrls
   * @return avatarUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProjectIssueCreateMetadataAvatarUrls getAvatarUrls() {
    return avatarUrls;
  }


  public void setAvatarUrls(ProjectIssueCreateMetadataAvatarUrls avatarUrls) {
    this.avatarUrls = avatarUrls;
  }


   /**
   * List of the issue types supported by the project.
   * @return issuetypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the issue types supported by the project.")

  public List<IssueTypeIssueCreateMetadata> getIssuetypes() {
    return issuetypes;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectIssueCreateMetadata projectIssueCreateMetadata = (ProjectIssueCreateMetadata) o;
    return Objects.equals(this.expand, projectIssueCreateMetadata.expand) &&
        Objects.equals(this.self, projectIssueCreateMetadata.self) &&
        Objects.equals(this.id, projectIssueCreateMetadata.id) &&
        Objects.equals(this.key, projectIssueCreateMetadata.key) &&
        Objects.equals(this.name, projectIssueCreateMetadata.name) &&
        Objects.equals(this.avatarUrls, projectIssueCreateMetadata.avatarUrls) &&
        Objects.equals(this.issuetypes, projectIssueCreateMetadata.issuetypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand, self, id, key, name, avatarUrls, issuetypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectIssueCreateMetadata {\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    avatarUrls: ").append(toIndentedString(avatarUrls)).append("\n");
    sb.append("    issuetypes: ").append(toIndentedString(issuetypes)).append("\n");
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
    openapiFields.add("expand");
    openapiFields.add("self");
    openapiFields.add("id");
    openapiFields.add("key");
    openapiFields.add("name");
    openapiFields.add("avatarUrls");
    openapiFields.add("issuetypes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectIssueCreateMetadata
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProjectIssueCreateMetadata.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectIssueCreateMetadata is not found in the empty JSON string", ProjectIssueCreateMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProjectIssueCreateMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectIssueCreateMetadata` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("expand") != null && !jsonObj.get("expand").isJsonNull()) && !jsonObj.get("expand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expand").toString()));
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
      // validate the optional field `avatarUrls`
      if (jsonObj.get("avatarUrls") != null && !jsonObj.get("avatarUrls").isJsonNull()) {
        ProjectIssueCreateMetadataAvatarUrls.validateJsonObject(jsonObj.getAsJsonObject("avatarUrls"));
      }
      if (jsonObj.get("issuetypes") != null && !jsonObj.get("issuetypes").isJsonNull()) {
        JsonArray jsonArrayissuetypes = jsonObj.getAsJsonArray("issuetypes");
        if (jsonArrayissuetypes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("issuetypes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `issuetypes` to be an array in the JSON string but got `%s`", jsonObj.get("issuetypes").toString()));
          }

          // validate the optional field `issuetypes` (array)
          for (int i = 0; i < jsonArrayissuetypes.size(); i++) {
            IssueTypeIssueCreateMetadata.validateJsonObject(jsonArrayissuetypes.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectIssueCreateMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectIssueCreateMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectIssueCreateMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectIssueCreateMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectIssueCreateMetadata>() {
           @Override
           public void write(JsonWriter out, ProjectIssueCreateMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectIssueCreateMetadata read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectIssueCreateMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectIssueCreateMetadata
  * @throws IOException if the JSON string is invalid with respect to ProjectIssueCreateMetadata
  */
  public static ProjectIssueCreateMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectIssueCreateMetadata.class);
  }

 /**
  * Convert an instance of ProjectIssueCreateMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
