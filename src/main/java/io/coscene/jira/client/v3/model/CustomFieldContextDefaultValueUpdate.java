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
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

import io.coscene.jira.client.v3.JSON;

/**
 * Default values to update.
 */
@ApiModel(description = "Default values to update.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class CustomFieldContextDefaultValueUpdate {
  public static final String SERIALIZED_NAME_DEFAULT_VALUES = "defaultValues";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUES)
  private List<CustomFieldContextDefaultValue> defaultValues = null;

  public CustomFieldContextDefaultValueUpdate() {
  }

  public CustomFieldContextDefaultValueUpdate defaultValues(List<CustomFieldContextDefaultValue> defaultValues) {
    
    this.defaultValues = defaultValues;
    return this;
  }

  public CustomFieldContextDefaultValueUpdate addDefaultValuesItem(CustomFieldContextDefaultValue defaultValuesItem) {
    if (this.defaultValues == null) {
      this.defaultValues = new ArrayList<>();
    }
    this.defaultValues.add(defaultValuesItem);
    return this;
  }

   /**
   * Get defaultValues
   * @return defaultValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<CustomFieldContextDefaultValue> getDefaultValues() {
    return defaultValues;
  }


  public void setDefaultValues(List<CustomFieldContextDefaultValue> defaultValues) {
    this.defaultValues = defaultValues;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldContextDefaultValueUpdate customFieldContextDefaultValueUpdate = (CustomFieldContextDefaultValueUpdate) o;
    return Objects.equals(this.defaultValues, customFieldContextDefaultValueUpdate.defaultValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextDefaultValueUpdate {\n");
    sb.append("    defaultValues: ").append(toIndentedString(defaultValues)).append("\n");
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
    openapiFields.add("defaultValues");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomFieldContextDefaultValueUpdate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CustomFieldContextDefaultValueUpdate.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomFieldContextDefaultValueUpdate is not found in the empty JSON string", CustomFieldContextDefaultValueUpdate.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomFieldContextDefaultValueUpdate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomFieldContextDefaultValueUpdate` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("defaultValues") != null && !jsonObj.get("defaultValues").isJsonNull()) {
        JsonArray jsonArraydefaultValues = jsonObj.getAsJsonArray("defaultValues");
        if (jsonArraydefaultValues != null) {
          // ensure the json data is an array
          if (!jsonObj.get("defaultValues").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `defaultValues` to be an array in the JSON string but got `%s`", jsonObj.get("defaultValues").toString()));
          }

          // validate the optional field `defaultValues` (array)
          for (int i = 0; i < jsonArraydefaultValues.size(); i++) {
            CustomFieldContextDefaultValue.validateJsonObject(jsonArraydefaultValues.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomFieldContextDefaultValueUpdate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomFieldContextDefaultValueUpdate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomFieldContextDefaultValueUpdate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomFieldContextDefaultValueUpdate.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomFieldContextDefaultValueUpdate>() {
           @Override
           public void write(JsonWriter out, CustomFieldContextDefaultValueUpdate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomFieldContextDefaultValueUpdate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomFieldContextDefaultValueUpdate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomFieldContextDefaultValueUpdate
  * @throws IOException if the JSON string is invalid with respect to CustomFieldContextDefaultValueUpdate
  */
  public static CustomFieldContextDefaultValueUpdate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomFieldContextDefaultValueUpdate.class);
  }

 /**
  * Convert an instance of CustomFieldContextDefaultValueUpdate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

