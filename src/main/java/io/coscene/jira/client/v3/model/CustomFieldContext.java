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
 * The details of a custom field context.
 */
@ApiModel(description = "The details of a custom field context.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class CustomFieldContext {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IS_GLOBAL_CONTEXT = "isGlobalContext";
  @SerializedName(SERIALIZED_NAME_IS_GLOBAL_CONTEXT)
  private Boolean isGlobalContext;

  public static final String SERIALIZED_NAME_IS_ANY_ISSUE_TYPE = "isAnyIssueType";
  @SerializedName(SERIALIZED_NAME_IS_ANY_ISSUE_TYPE)
  private Boolean isAnyIssueType;

  public CustomFieldContext() {
  }

  public CustomFieldContext id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the context.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the context.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CustomFieldContext name(String name) {
    
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


  public CustomFieldContext description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the context.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The description of the context.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CustomFieldContext isGlobalContext(Boolean isGlobalContext) {
    
    this.isGlobalContext = isGlobalContext;
    return this;
  }

   /**
   * Whether the context is global.
   * @return isGlobalContext
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Whether the context is global.")

  public Boolean getIsGlobalContext() {
    return isGlobalContext;
  }


  public void setIsGlobalContext(Boolean isGlobalContext) {
    this.isGlobalContext = isGlobalContext;
  }


  public CustomFieldContext isAnyIssueType(Boolean isAnyIssueType) {
    
    this.isAnyIssueType = isAnyIssueType;
    return this;
  }

   /**
   * Whether the context apply to all issue types.
   * @return isAnyIssueType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Whether the context apply to all issue types.")

  public Boolean getIsAnyIssueType() {
    return isAnyIssueType;
  }


  public void setIsAnyIssueType(Boolean isAnyIssueType) {
    this.isAnyIssueType = isAnyIssueType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldContext customFieldContext = (CustomFieldContext) o;
    return Objects.equals(this.id, customFieldContext.id) &&
        Objects.equals(this.name, customFieldContext.name) &&
        Objects.equals(this.description, customFieldContext.description) &&
        Objects.equals(this.isGlobalContext, customFieldContext.isGlobalContext) &&
        Objects.equals(this.isAnyIssueType, customFieldContext.isAnyIssueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, isGlobalContext, isAnyIssueType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContext {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isGlobalContext: ").append(toIndentedString(isGlobalContext)).append("\n");
    sb.append("    isAnyIssueType: ").append(toIndentedString(isAnyIssueType)).append("\n");
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
    openapiFields.add("isGlobalContext");
    openapiFields.add("isAnyIssueType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("isGlobalContext");
    openapiRequiredFields.add("isAnyIssueType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomFieldContext
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CustomFieldContext.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomFieldContext is not found in the empty JSON string", CustomFieldContext.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomFieldContext.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomFieldContext` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomFieldContext.openapiRequiredFields) {
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
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomFieldContext.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomFieldContext' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomFieldContext> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomFieldContext.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomFieldContext>() {
           @Override
           public void write(JsonWriter out, CustomFieldContext value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomFieldContext read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomFieldContext given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomFieldContext
  * @throws IOException if the JSON string is invalid with respect to CustomFieldContext
  */
  public static CustomFieldContext fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomFieldContext.class);
  }

 /**
  * Convert an instance of CustomFieldContext to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

