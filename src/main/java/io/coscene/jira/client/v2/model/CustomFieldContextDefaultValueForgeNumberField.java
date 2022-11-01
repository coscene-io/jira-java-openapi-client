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
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import io.coscene.jira.client.v2.JSON;

/**
 * Default value for a Forge number custom field.
 */
@ApiModel(description = "Default value for a Forge number custom field.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class CustomFieldContextDefaultValueForgeNumberField {
  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private Double number;

  public CustomFieldContextDefaultValueForgeNumberField() {
  }

  public CustomFieldContextDefaultValueForgeNumberField number(Double number) {
    
    this.number = number;
    return this;
  }

   /**
   * The default floating-point number.
   * @return number
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The default floating-point number.")

  public Double getNumber() {
    return number;
  }


  public void setNumber(Double number) {
    this.number = number;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldContextDefaultValueForgeNumberField customFieldContextDefaultValueForgeNumberField = (CustomFieldContextDefaultValueForgeNumberField) o;
    return Objects.equals(this.number, customFieldContextDefaultValueForgeNumberField.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextDefaultValueForgeNumberField {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
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
    openapiFields.add("number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("number");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomFieldContextDefaultValueForgeNumberField
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CustomFieldContextDefaultValueForgeNumberField.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomFieldContextDefaultValueForgeNumberField is not found in the empty JSON string", CustomFieldContextDefaultValueForgeNumberField.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomFieldContextDefaultValueForgeNumberField.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomFieldContextDefaultValueForgeNumberField` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomFieldContextDefaultValueForgeNumberField.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomFieldContextDefaultValueForgeNumberField.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomFieldContextDefaultValueForgeNumberField' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomFieldContextDefaultValueForgeNumberField> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomFieldContextDefaultValueForgeNumberField.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomFieldContextDefaultValueForgeNumberField>() {
           @Override
           public void write(JsonWriter out, CustomFieldContextDefaultValueForgeNumberField value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomFieldContextDefaultValueForgeNumberField read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomFieldContextDefaultValueForgeNumberField given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomFieldContextDefaultValueForgeNumberField
  * @throws IOException if the JSON string is invalid with respect to CustomFieldContextDefaultValueForgeNumberField
  */
  public static CustomFieldContextDefaultValueForgeNumberField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomFieldContextDefaultValueForgeNumberField.class);
  }

 /**
  * Convert an instance of CustomFieldContextDefaultValueForgeNumberField to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

