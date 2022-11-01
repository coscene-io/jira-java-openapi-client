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
 * Details of the custom field options for a context.
 */
@ApiModel(description = "Details of the custom field options for a context.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class CustomFieldContextOption {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_OPTION_ID = "optionId";
  @SerializedName(SERIALIZED_NAME_OPTION_ID)
  private String optionId;

  public static final String SERIALIZED_NAME_DISABLED = "disabled";
  @SerializedName(SERIALIZED_NAME_DISABLED)
  private Boolean disabled;

  public CustomFieldContextOption() {
  }

  public CustomFieldContextOption id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the custom field option.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the custom field option.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CustomFieldContextOption value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The value of the custom field option.
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The value of the custom field option.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public CustomFieldContextOption optionId(String optionId) {
    
    this.optionId = optionId;
    return this;
  }

   /**
   * For cascading options, the ID of the custom field option containing the cascading option.
   * @return optionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For cascading options, the ID of the custom field option containing the cascading option.")

  public String getOptionId() {
    return optionId;
  }


  public void setOptionId(String optionId) {
    this.optionId = optionId;
  }


  public CustomFieldContextOption disabled(Boolean disabled) {
    
    this.disabled = disabled;
    return this;
  }

   /**
   * Whether the option is disabled.
   * @return disabled
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Whether the option is disabled.")

  public Boolean getDisabled() {
    return disabled;
  }


  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldContextOption customFieldContextOption = (CustomFieldContextOption) o;
    return Objects.equals(this.id, customFieldContextOption.id) &&
        Objects.equals(this.value, customFieldContextOption.value) &&
        Objects.equals(this.optionId, customFieldContextOption.optionId) &&
        Objects.equals(this.disabled, customFieldContextOption.disabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, value, optionId, disabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextOption {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    optionId: ").append(toIndentedString(optionId)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
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
    openapiFields.add("value");
    openapiFields.add("optionId");
    openapiFields.add("disabled");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("value");
    openapiRequiredFields.add("disabled");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomFieldContextOption
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CustomFieldContextOption.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomFieldContextOption is not found in the empty JSON string", CustomFieldContextOption.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomFieldContextOption.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomFieldContextOption` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomFieldContextOption.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if ((jsonObj.get("optionId") != null && !jsonObj.get("optionId").isJsonNull()) && !jsonObj.get("optionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `optionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("optionId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomFieldContextOption.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomFieldContextOption' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomFieldContextOption> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomFieldContextOption.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomFieldContextOption>() {
           @Override
           public void write(JsonWriter out, CustomFieldContextOption value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomFieldContextOption read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomFieldContextOption given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomFieldContextOption
  * @throws IOException if the JSON string is invalid with respect to CustomFieldContextOption
  */
  public static CustomFieldContextOption fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomFieldContextOption.class);
  }

 /**
  * Convert an instance of CustomFieldContextOption to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

