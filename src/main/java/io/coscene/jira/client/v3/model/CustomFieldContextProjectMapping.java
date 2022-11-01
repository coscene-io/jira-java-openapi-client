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
 * Details of a context to project association.
 */
@ApiModel(description = "Details of a context to project association.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class CustomFieldContextProjectMapping {
  public static final String SERIALIZED_NAME_CONTEXT_ID = "contextId";
  @SerializedName(SERIALIZED_NAME_CONTEXT_ID)
  private String contextId;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_IS_GLOBAL_CONTEXT = "isGlobalContext";
  @SerializedName(SERIALIZED_NAME_IS_GLOBAL_CONTEXT)
  private Boolean isGlobalContext;

  public CustomFieldContextProjectMapping() {
  }

  
  public CustomFieldContextProjectMapping(
     String contextId, 
     String projectId, 
     Boolean isGlobalContext
  ) {
    this();
    this.contextId = contextId;
    this.projectId = projectId;
    this.isGlobalContext = isGlobalContext;
  }

   /**
   * The ID of the context.
   * @return contextId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the context.")

  public String getContextId() {
    return contextId;
  }




   /**
   * The ID of the project.
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the project.")

  public String getProjectId() {
    return projectId;
  }




   /**
   * Whether context is global.
   * @return isGlobalContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether context is global.")

  public Boolean getIsGlobalContext() {
    return isGlobalContext;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldContextProjectMapping customFieldContextProjectMapping = (CustomFieldContextProjectMapping) o;
    return Objects.equals(this.contextId, customFieldContextProjectMapping.contextId) &&
        Objects.equals(this.projectId, customFieldContextProjectMapping.projectId) &&
        Objects.equals(this.isGlobalContext, customFieldContextProjectMapping.isGlobalContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextId, projectId, isGlobalContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextProjectMapping {\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    isGlobalContext: ").append(toIndentedString(isGlobalContext)).append("\n");
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
    openapiFields.add("contextId");
    openapiFields.add("projectId");
    openapiFields.add("isGlobalContext");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("contextId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomFieldContextProjectMapping
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CustomFieldContextProjectMapping.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomFieldContextProjectMapping is not found in the empty JSON string", CustomFieldContextProjectMapping.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomFieldContextProjectMapping.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomFieldContextProjectMapping` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomFieldContextProjectMapping.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("contextId") != null && !jsonObj.get("contextId").isJsonNull()) && !jsonObj.get("contextId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contextId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contextId").toString()));
      }
      if ((jsonObj.get("projectId") != null && !jsonObj.get("projectId").isJsonNull()) && !jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomFieldContextProjectMapping.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomFieldContextProjectMapping' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomFieldContextProjectMapping> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomFieldContextProjectMapping.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomFieldContextProjectMapping>() {
           @Override
           public void write(JsonWriter out, CustomFieldContextProjectMapping value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomFieldContextProjectMapping read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomFieldContextProjectMapping given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomFieldContextProjectMapping
  * @throws IOException if the JSON string is invalid with respect to CustomFieldContextProjectMapping
  */
  public static CustomFieldContextProjectMapping fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomFieldContextProjectMapping.class);
  }

 /**
  * Convert an instance of CustomFieldContextProjectMapping to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
