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
import java.util.HashMap;
import java.util.Map;

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
 * The data schema for the field.
 */
@ApiModel(description = "The data schema for the field.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class FieldDetailsSchema {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private String items;

  public static final String SERIALIZED_NAME_SYSTEM = "system";
  @SerializedName(SERIALIZED_NAME_SYSTEM)
  private String system;

  public static final String SERIALIZED_NAME_CUSTOM = "custom";
  @SerializedName(SERIALIZED_NAME_CUSTOM)
  private String custom;

  public static final String SERIALIZED_NAME_CUSTOM_ID = "customId";
  @SerializedName(SERIALIZED_NAME_CUSTOM_ID)
  private Long customId;

  public static final String SERIALIZED_NAME_CONFIGURATION = "configuration";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION)
  private Map<String, Object> _configuration = null;

  public FieldDetailsSchema() {
  }

  
  public FieldDetailsSchema(
     String type, 
     String items, 
     String system, 
     String custom, 
     Long customId, 
     Map<String, Object> _configuration
  ) {
    this();
    this.type = type;
    this.items = items;
    this.system = system;
    this.custom = custom;
    this.customId = customId;
    this._configuration = _configuration;
  }

   /**
   * The data type of the field.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The data type of the field.")

  public String getType() {
    return type;
  }




   /**
   * When the data type is an array, the name of the field items within the array.
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the data type is an array, the name of the field items within the array.")

  public String getItems() {
    return items;
  }




   /**
   * If the field is a system field, the name of the field.
   * @return system
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the field is a system field, the name of the field.")

  public String getSystem() {
    return system;
  }




   /**
   * If the field is a custom field, the URI of the field.
   * @return custom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the field is a custom field, the URI of the field.")

  public String getCustom() {
    return custom;
  }




   /**
   * If the field is a custom field, the custom ID of the field.
   * @return customId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the field is a custom field, the custom ID of the field.")

  public Long getCustomId() {
    return customId;
  }




   /**
   * If the field is a custom field, the configuration of the field.
   * @return _configuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the field is a custom field, the configuration of the field.")

  public Map<String, Object> getConfiguration() {
    return _configuration;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldDetailsSchema fieldDetailsSchema = (FieldDetailsSchema) o;
    return Objects.equals(this.type, fieldDetailsSchema.type) &&
        Objects.equals(this.items, fieldDetailsSchema.items) &&
        Objects.equals(this.system, fieldDetailsSchema.system) &&
        Objects.equals(this.custom, fieldDetailsSchema.custom) &&
        Objects.equals(this.customId, fieldDetailsSchema.customId) &&
        Objects.equals(this._configuration, fieldDetailsSchema._configuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, items, system, custom, customId, _configuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldDetailsSchema {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    customId: ").append(toIndentedString(customId)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
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
    openapiFields.add("items");
    openapiFields.add("system");
    openapiFields.add("custom");
    openapiFields.add("customId");
    openapiFields.add("configuration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FieldDetailsSchema
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FieldDetailsSchema.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FieldDetailsSchema is not found in the empty JSON string", FieldDetailsSchema.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FieldDetailsSchema.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FieldDetailsSchema` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FieldDetailsSchema.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) && !jsonObj.get("items").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `items` to be a primitive type in the JSON string but got `%s`", jsonObj.get("items").toString()));
      }
      if ((jsonObj.get("system") != null && !jsonObj.get("system").isJsonNull()) && !jsonObj.get("system").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `system` to be a primitive type in the JSON string but got `%s`", jsonObj.get("system").toString()));
      }
      if ((jsonObj.get("custom") != null && !jsonObj.get("custom").isJsonNull()) && !jsonObj.get("custom").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `custom` to be a primitive type in the JSON string but got `%s`", jsonObj.get("custom").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FieldDetailsSchema.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FieldDetailsSchema' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FieldDetailsSchema> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FieldDetailsSchema.class));

       return (TypeAdapter<T>) new TypeAdapter<FieldDetailsSchema>() {
           @Override
           public void write(JsonWriter out, FieldDetailsSchema value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FieldDetailsSchema read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FieldDetailsSchema given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FieldDetailsSchema
  * @throws IOException if the JSON string is invalid with respect to FieldDetailsSchema
  */
  public static FieldDetailsSchema fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FieldDetailsSchema.class);
  }

 /**
  * Convert an instance of FieldDetailsSchema to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

