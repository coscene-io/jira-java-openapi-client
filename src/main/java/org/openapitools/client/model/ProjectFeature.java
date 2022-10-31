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
import java.util.ArrayList;
import java.util.List;

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
 * Details of a project feature.
 */
@ApiModel(description = "Details of a project feature.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class ProjectFeature {
  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Long projectId;

  /**
   * The state of the feature. When updating the state of a feature, only ENABLED and DISABLED are supported. Responses can contain all values
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    ENABLED("ENABLED"),
    
    DISABLED("DISABLED"),
    
    COMING_SOON("COMING_SOON");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_TOGGLE_LOCKED = "toggleLocked";
  @SerializedName(SERIALIZED_NAME_TOGGLE_LOCKED)
  private Boolean toggleLocked;

  public static final String SERIALIZED_NAME_FEATURE = "feature";
  @SerializedName(SERIALIZED_NAME_FEATURE)
  private String feature;

  public static final String SERIALIZED_NAME_PREREQUISITES = "prerequisites";
  @SerializedName(SERIALIZED_NAME_PREREQUISITES)
  private List<String> prerequisites = null;

  public static final String SERIALIZED_NAME_LOCALISED_NAME = "localisedName";
  @SerializedName(SERIALIZED_NAME_LOCALISED_NAME)
  private String localisedName;

  public static final String SERIALIZED_NAME_LOCALISED_DESCRIPTION = "localisedDescription";
  @SerializedName(SERIALIZED_NAME_LOCALISED_DESCRIPTION)
  private String localisedDescription;

  public static final String SERIALIZED_NAME_IMAGE_URI = "imageUri";
  @SerializedName(SERIALIZED_NAME_IMAGE_URI)
  private String imageUri;

  public ProjectFeature() {
  }

  public ProjectFeature projectId(Long projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * The ID of the project.
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the project.")

  public Long getProjectId() {
    return projectId;
  }


  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }


  public ProjectFeature state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * The state of the feature. When updating the state of a feature, only ENABLED and DISABLED are supported. Responses can contain all values
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The state of the feature. When updating the state of a feature, only ENABLED and DISABLED are supported. Responses can contain all values")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public ProjectFeature toggleLocked(Boolean toggleLocked) {
    
    this.toggleLocked = toggleLocked;
    return this;
  }

   /**
   * Whether the state of the feature can be updated.
   * @return toggleLocked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the state of the feature can be updated.")

  public Boolean getToggleLocked() {
    return toggleLocked;
  }


  public void setToggleLocked(Boolean toggleLocked) {
    this.toggleLocked = toggleLocked;
  }


  public ProjectFeature feature(String feature) {
    
    this.feature = feature;
    return this;
  }

   /**
   * The key of the feature.
   * @return feature
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the feature.")

  public String getFeature() {
    return feature;
  }


  public void setFeature(String feature) {
    this.feature = feature;
  }


  public ProjectFeature prerequisites(List<String> prerequisites) {
    
    this.prerequisites = prerequisites;
    return this;
  }

  public ProjectFeature addPrerequisitesItem(String prerequisitesItem) {
    if (this.prerequisites == null) {
      this.prerequisites = new ArrayList<>();
    }
    this.prerequisites.add(prerequisitesItem);
    return this;
  }

   /**
   * List of keys of the features required to enable the feature.
   * @return prerequisites
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of keys of the features required to enable the feature.")

  public List<String> getPrerequisites() {
    return prerequisites;
  }


  public void setPrerequisites(List<String> prerequisites) {
    this.prerequisites = prerequisites;
  }


  public ProjectFeature localisedName(String localisedName) {
    
    this.localisedName = localisedName;
    return this;
  }

   /**
   * Localized display name for the feature.
   * @return localisedName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Localized display name for the feature.")

  public String getLocalisedName() {
    return localisedName;
  }


  public void setLocalisedName(String localisedName) {
    this.localisedName = localisedName;
  }


  public ProjectFeature localisedDescription(String localisedDescription) {
    
    this.localisedDescription = localisedDescription;
    return this;
  }

   /**
   * Localized display description for the feature.
   * @return localisedDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Localized display description for the feature.")

  public String getLocalisedDescription() {
    return localisedDescription;
  }


  public void setLocalisedDescription(String localisedDescription) {
    this.localisedDescription = localisedDescription;
  }


  public ProjectFeature imageUri(String imageUri) {
    
    this.imageUri = imageUri;
    return this;
  }

   /**
   * URI for the image representing the feature.
   * @return imageUri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URI for the image representing the feature.")

  public String getImageUri() {
    return imageUri;
  }


  public void setImageUri(String imageUri) {
    this.imageUri = imageUri;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectFeature projectFeature = (ProjectFeature) o;
    return Objects.equals(this.projectId, projectFeature.projectId) &&
        Objects.equals(this.state, projectFeature.state) &&
        Objects.equals(this.toggleLocked, projectFeature.toggleLocked) &&
        Objects.equals(this.feature, projectFeature.feature) &&
        Objects.equals(this.prerequisites, projectFeature.prerequisites) &&
        Objects.equals(this.localisedName, projectFeature.localisedName) &&
        Objects.equals(this.localisedDescription, projectFeature.localisedDescription) &&
        Objects.equals(this.imageUri, projectFeature.imageUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, state, toggleLocked, feature, prerequisites, localisedName, localisedDescription, imageUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectFeature {\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    toggleLocked: ").append(toIndentedString(toggleLocked)).append("\n");
    sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
    sb.append("    prerequisites: ").append(toIndentedString(prerequisites)).append("\n");
    sb.append("    localisedName: ").append(toIndentedString(localisedName)).append("\n");
    sb.append("    localisedDescription: ").append(toIndentedString(localisedDescription)).append("\n");
    sb.append("    imageUri: ").append(toIndentedString(imageUri)).append("\n");
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
    openapiFields.add("projectId");
    openapiFields.add("state");
    openapiFields.add("toggleLocked");
    openapiFields.add("feature");
    openapiFields.add("prerequisites");
    openapiFields.add("localisedName");
    openapiFields.add("localisedDescription");
    openapiFields.add("imageUri");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectFeature
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProjectFeature.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectFeature is not found in the empty JSON string", ProjectFeature.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProjectFeature.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectFeature` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      if ((jsonObj.get("feature") != null && !jsonObj.get("feature").isJsonNull()) && !jsonObj.get("feature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `feature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("feature").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("prerequisites") != null && !jsonObj.get("prerequisites").isJsonNull()) && !jsonObj.get("prerequisites").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `prerequisites` to be an array in the JSON string but got `%s`", jsonObj.get("prerequisites").toString()));
      }
      if ((jsonObj.get("localisedName") != null && !jsonObj.get("localisedName").isJsonNull()) && !jsonObj.get("localisedName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `localisedName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("localisedName").toString()));
      }
      if ((jsonObj.get("localisedDescription") != null && !jsonObj.get("localisedDescription").isJsonNull()) && !jsonObj.get("localisedDescription").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `localisedDescription` to be a primitive type in the JSON string but got `%s`", jsonObj.get("localisedDescription").toString()));
      }
      if ((jsonObj.get("imageUri") != null && !jsonObj.get("imageUri").isJsonNull()) && !jsonObj.get("imageUri").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageUri` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageUri").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectFeature.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectFeature' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectFeature> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectFeature.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectFeature>() {
           @Override
           public void write(JsonWriter out, ProjectFeature value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectFeature read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectFeature given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectFeature
  * @throws IOException if the JSON string is invalid with respect to ProjectFeature
  */
  public static ProjectFeature fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectFeature.class);
  }

 /**
  * Convert an instance of ProjectFeature to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

