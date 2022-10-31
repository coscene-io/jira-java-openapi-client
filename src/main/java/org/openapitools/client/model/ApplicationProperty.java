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
 * Details of an application property.
 */
@ApiModel(description = "Details of an application property.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class ApplicationProperty {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESC = "desc";
  @SerializedName(SERIALIZED_NAME_DESC)
  private String desc;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_DEFAULT_VALUE = "defaultValue";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUE)
  private String defaultValue;

  public static final String SERIALIZED_NAME_EXAMPLE = "example";
  @SerializedName(SERIALIZED_NAME_EXAMPLE)
  private String example;

  public static final String SERIALIZED_NAME_ALLOWED_VALUES = "allowedValues";
  @SerializedName(SERIALIZED_NAME_ALLOWED_VALUES)
  private List<String> allowedValues = null;

  public ApplicationProperty() {
  }

  public ApplicationProperty id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the application property. The ID and key are the same.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the application property. The ID and key are the same.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ApplicationProperty key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The key of the application property. The ID and key are the same.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the application property. The ID and key are the same.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public ApplicationProperty value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The new value.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The new value.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public ApplicationProperty name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the application property.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the application property.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ApplicationProperty desc(String desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * The description of the application property.
   * @return desc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the application property.")

  public String getDesc() {
    return desc;
  }


  public void setDesc(String desc) {
    this.desc = desc;
  }


  public ApplicationProperty type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The data type of the application property.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The data type of the application property.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ApplicationProperty defaultValue(String defaultValue) {
    
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * The default value of the application property.
   * @return defaultValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The default value of the application property.")

  public String getDefaultValue() {
    return defaultValue;
  }


  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }


  public ApplicationProperty example(String example) {
    
    this.example = example;
    return this;
  }

   /**
   * Get example
   * @return example
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExample() {
    return example;
  }


  public void setExample(String example) {
    this.example = example;
  }


  public ApplicationProperty allowedValues(List<String> allowedValues) {
    
    this.allowedValues = allowedValues;
    return this;
  }

  public ApplicationProperty addAllowedValuesItem(String allowedValuesItem) {
    if (this.allowedValues == null) {
      this.allowedValues = new ArrayList<>();
    }
    this.allowedValues.add(allowedValuesItem);
    return this;
  }

   /**
   * The allowed values, if applicable.
   * @return allowedValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The allowed values, if applicable.")

  public List<String> getAllowedValues() {
    return allowedValues;
  }


  public void setAllowedValues(List<String> allowedValues) {
    this.allowedValues = allowedValues;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationProperty applicationProperty = (ApplicationProperty) o;
    return Objects.equals(this.id, applicationProperty.id) &&
        Objects.equals(this.key, applicationProperty.key) &&
        Objects.equals(this.value, applicationProperty.value) &&
        Objects.equals(this.name, applicationProperty.name) &&
        Objects.equals(this.desc, applicationProperty.desc) &&
        Objects.equals(this.type, applicationProperty.type) &&
        Objects.equals(this.defaultValue, applicationProperty.defaultValue) &&
        Objects.equals(this.example, applicationProperty.example) &&
        Objects.equals(this.allowedValues, applicationProperty.allowedValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, value, name, desc, type, defaultValue, example, allowedValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationProperty {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    example: ").append(toIndentedString(example)).append("\n");
    sb.append("    allowedValues: ").append(toIndentedString(allowedValues)).append("\n");
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
    openapiFields.add("key");
    openapiFields.add("value");
    openapiFields.add("name");
    openapiFields.add("desc");
    openapiFields.add("type");
    openapiFields.add("defaultValue");
    openapiFields.add("example");
    openapiFields.add("allowedValues");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ApplicationProperty
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ApplicationProperty.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApplicationProperty is not found in the empty JSON string", ApplicationProperty.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ApplicationProperty.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ApplicationProperty` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("desc") != null && !jsonObj.get("desc").isJsonNull()) && !jsonObj.get("desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("desc").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("defaultValue") != null && !jsonObj.get("defaultValue").isJsonNull()) && !jsonObj.get("defaultValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("defaultValue").toString()));
      }
      if ((jsonObj.get("example") != null && !jsonObj.get("example").isJsonNull()) && !jsonObj.get("example").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `example` to be a primitive type in the JSON string but got `%s`", jsonObj.get("example").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("allowedValues") != null && !jsonObj.get("allowedValues").isJsonNull()) && !jsonObj.get("allowedValues").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `allowedValues` to be an array in the JSON string but got `%s`", jsonObj.get("allowedValues").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApplicationProperty.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApplicationProperty' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApplicationProperty> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApplicationProperty.class));

       return (TypeAdapter<T>) new TypeAdapter<ApplicationProperty>() {
           @Override
           public void write(JsonWriter out, ApplicationProperty value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ApplicationProperty read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ApplicationProperty given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApplicationProperty
  * @throws IOException if the JSON string is invalid with respect to ApplicationProperty
  */
  public static ApplicationProperty fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApplicationProperty.class);
  }

 /**
  * Convert an instance of ApplicationProperty to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

