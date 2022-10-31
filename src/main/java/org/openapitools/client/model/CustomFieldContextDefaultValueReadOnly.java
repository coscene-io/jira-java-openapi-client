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
 * The default text for a read only custom field.
 */
@ApiModel(description = "The default text for a read only custom field.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class CustomFieldContextDefaultValueReadOnly {
  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public CustomFieldContextDefaultValueReadOnly() {
  }

  public CustomFieldContextDefaultValueReadOnly text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * The default text. The maximum length is 255 characters.
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The default text. The maximum length is 255 characters.")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public CustomFieldContextDefaultValueReadOnly type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldContextDefaultValueReadOnly customFieldContextDefaultValueReadOnly = (CustomFieldContextDefaultValueReadOnly) o;
    return Objects.equals(this.text, customFieldContextDefaultValueReadOnly.text) &&
        Objects.equals(this.type, customFieldContextDefaultValueReadOnly.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextDefaultValueReadOnly {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("text");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomFieldContextDefaultValueReadOnly
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CustomFieldContextDefaultValueReadOnly.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomFieldContextDefaultValueReadOnly is not found in the empty JSON string", CustomFieldContextDefaultValueReadOnly.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomFieldContextDefaultValueReadOnly.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomFieldContextDefaultValueReadOnly` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomFieldContextDefaultValueReadOnly.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomFieldContextDefaultValueReadOnly.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomFieldContextDefaultValueReadOnly' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomFieldContextDefaultValueReadOnly> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomFieldContextDefaultValueReadOnly.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomFieldContextDefaultValueReadOnly>() {
           @Override
           public void write(JsonWriter out, CustomFieldContextDefaultValueReadOnly value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomFieldContextDefaultValueReadOnly read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomFieldContextDefaultValueReadOnly given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomFieldContextDefaultValueReadOnly
  * @throws IOException if the JSON string is invalid with respect to CustomFieldContextDefaultValueReadOnly
  */
  public static CustomFieldContextDefaultValueReadOnly fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomFieldContextDefaultValueReadOnly.class);
  }

 /**
  * Convert an instance of CustomFieldContextDefaultValueReadOnly to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

