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
 * The details of a created custom field context.
 */
@ApiModel(description = "The details of a created custom field context.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class CreateCustomFieldContext {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PROJECT_IDS = "projectIds";
  @SerializedName(SERIALIZED_NAME_PROJECT_IDS)
  private List<String> projectIds = null;

  public static final String SERIALIZED_NAME_ISSUE_TYPE_IDS = "issueTypeIds";
  @SerializedName(SERIALIZED_NAME_ISSUE_TYPE_IDS)
  private List<String> issueTypeIds = null;

  public CreateCustomFieldContext() {
  }

  
  public CreateCustomFieldContext(
     String id
  ) {
    this();
    this.id = id;
  }

   /**
   * The ID of the context.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the context.")

  public String getId() {
    return id;
  }




  public CreateCustomFieldContext name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the context.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the context.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateCustomFieldContext description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the context.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the context.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CreateCustomFieldContext projectIds(List<String> projectIds) {
    
    this.projectIds = projectIds;
    return this;
  }

  public CreateCustomFieldContext addProjectIdsItem(String projectIdsItem) {
    if (this.projectIds == null) {
      this.projectIds = new ArrayList<>();
    }
    this.projectIds.add(projectIdsItem);
    return this;
  }

   /**
   * The list of project IDs associated with the context. If the list is empty, the context is global.
   * @return projectIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of project IDs associated with the context. If the list is empty, the context is global.")

  public List<String> getProjectIds() {
    return projectIds;
  }


  public void setProjectIds(List<String> projectIds) {
    this.projectIds = projectIds;
  }


  public CreateCustomFieldContext issueTypeIds(List<String> issueTypeIds) {
    
    this.issueTypeIds = issueTypeIds;
    return this;
  }

  public CreateCustomFieldContext addIssueTypeIdsItem(String issueTypeIdsItem) {
    if (this.issueTypeIds == null) {
      this.issueTypeIds = new ArrayList<>();
    }
    this.issueTypeIds.add(issueTypeIdsItem);
    return this;
  }

   /**
   * The list of issue types IDs for the context. If the list is empty, the context refers to all issue types.
   * @return issueTypeIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of issue types IDs for the context. If the list is empty, the context refers to all issue types.")

  public List<String> getIssueTypeIds() {
    return issueTypeIds;
  }


  public void setIssueTypeIds(List<String> issueTypeIds) {
    this.issueTypeIds = issueTypeIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateCustomFieldContext createCustomFieldContext = (CreateCustomFieldContext) o;
    return Objects.equals(this.id, createCustomFieldContext.id) &&
        Objects.equals(this.name, createCustomFieldContext.name) &&
        Objects.equals(this.description, createCustomFieldContext.description) &&
        Objects.equals(this.projectIds, createCustomFieldContext.projectIds) &&
        Objects.equals(this.issueTypeIds, createCustomFieldContext.issueTypeIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, projectIds, issueTypeIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCustomFieldContext {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
    sb.append("    issueTypeIds: ").append(toIndentedString(issueTypeIds)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("projectIds");
    openapiFields.add("issueTypeIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateCustomFieldContext
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateCustomFieldContext.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateCustomFieldContext is not found in the empty JSON string", CreateCustomFieldContext.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateCustomFieldContext.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateCustomFieldContext` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateCustomFieldContext.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("projectIds") != null && !jsonObj.get("projectIds").isJsonNull()) && !jsonObj.get("projectIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectIds` to be an array in the JSON string but got `%s`", jsonObj.get("projectIds").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("issueTypeIds") != null && !jsonObj.get("issueTypeIds").isJsonNull()) && !jsonObj.get("issueTypeIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `issueTypeIds` to be an array in the JSON string but got `%s`", jsonObj.get("issueTypeIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateCustomFieldContext.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateCustomFieldContext' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateCustomFieldContext> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateCustomFieldContext.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateCustomFieldContext>() {
           @Override
           public void write(JsonWriter out, CreateCustomFieldContext value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateCustomFieldContext read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateCustomFieldContext given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateCustomFieldContext
  * @throws IOException if the JSON string is invalid with respect to CreateCustomFieldContext
  */
  public static CreateCustomFieldContext fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateCustomFieldContext.class);
  }

 /**
  * Convert an instance of CreateCustomFieldContext to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

