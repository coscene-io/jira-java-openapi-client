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
 * Details of the status being created.
 */
@ApiModel(description = "Details of the status being created.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class StatusCreate {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * The category of the status.
   */
  @JsonAdapter(StatusCategoryEnum.Adapter.class)
  public enum StatusCategoryEnum {
    TODO("TODO"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    DONE("DONE");

    private String value;

    StatusCategoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusCategoryEnum fromValue(String value) {
      for (StatusCategoryEnum b : StatusCategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusCategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusCategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusCategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusCategoryEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS_CATEGORY = "statusCategory";
  @SerializedName(SERIALIZED_NAME_STATUS_CATEGORY)
  private StatusCategoryEnum statusCategory;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public StatusCreate() {
  }

  public StatusCreate name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the status.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the status.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public StatusCreate statusCategory(StatusCategoryEnum statusCategory) {
    
    this.statusCategory = statusCategory;
    return this;
  }

   /**
   * The category of the status.
   * @return statusCategory
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The category of the status.")

  public StatusCategoryEnum getStatusCategory() {
    return statusCategory;
  }


  public void setStatusCategory(StatusCategoryEnum statusCategory) {
    this.statusCategory = statusCategory;
  }


  public StatusCreate description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the status.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the status.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusCreate statusCreate = (StatusCreate) o;
    return Objects.equals(this.name, statusCreate.name) &&
        Objects.equals(this.statusCategory, statusCreate.statusCategory) &&
        Objects.equals(this.description, statusCreate.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, statusCategory, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusCreate {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    statusCategory: ").append(toIndentedString(statusCategory)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
    openapiFields.add("statusCategory");
    openapiFields.add("description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("statusCategory");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StatusCreate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (StatusCreate.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in StatusCreate is not found in the empty JSON string", StatusCreate.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StatusCreate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StatusCreate` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StatusCreate.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("statusCategory") != null && !jsonObj.get("statusCategory").isJsonNull()) && !jsonObj.get("statusCategory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusCategory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusCategory").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StatusCreate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StatusCreate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StatusCreate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StatusCreate.class));

       return (TypeAdapter<T>) new TypeAdapter<StatusCreate>() {
           @Override
           public void write(JsonWriter out, StatusCreate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StatusCreate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StatusCreate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StatusCreate
  * @throws IOException if the JSON string is invalid with respect to StatusCreate
  */
  public static StatusCreate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StatusCreate.class);
  }

 /**
  * Convert an instance of StatusCreate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

