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
 * Details about the replacement for a deleted version.
 */
@ApiModel(description = "Details about the replacement for a deleted version.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class CustomFieldReplacement {
  public static final String SERIALIZED_NAME_CUSTOM_FIELD_ID = "customFieldId";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELD_ID)
  private Long customFieldId;

  public static final String SERIALIZED_NAME_MOVE_TO = "moveTo";
  @SerializedName(SERIALIZED_NAME_MOVE_TO)
  private Long moveTo;

  public CustomFieldReplacement() {
  }

  public CustomFieldReplacement customFieldId(Long customFieldId) {
    
    this.customFieldId = customFieldId;
    return this;
  }

   /**
   * The ID of the custom field in which to replace the version number.
   * @return customFieldId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the custom field in which to replace the version number.")

  public Long getCustomFieldId() {
    return customFieldId;
  }


  public void setCustomFieldId(Long customFieldId) {
    this.customFieldId = customFieldId;
  }


  public CustomFieldReplacement moveTo(Long moveTo) {
    
    this.moveTo = moveTo;
    return this;
  }

   /**
   * The version number to use as a replacement for the deleted version.
   * @return moveTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The version number to use as a replacement for the deleted version.")

  public Long getMoveTo() {
    return moveTo;
  }


  public void setMoveTo(Long moveTo) {
    this.moveTo = moveTo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldReplacement customFieldReplacement = (CustomFieldReplacement) o;
    return Objects.equals(this.customFieldId, customFieldReplacement.customFieldId) &&
        Objects.equals(this.moveTo, customFieldReplacement.moveTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customFieldId, moveTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldReplacement {\n");
    sb.append("    customFieldId: ").append(toIndentedString(customFieldId)).append("\n");
    sb.append("    moveTo: ").append(toIndentedString(moveTo)).append("\n");
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
    openapiFields.add("customFieldId");
    openapiFields.add("moveTo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomFieldReplacement
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CustomFieldReplacement.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomFieldReplacement is not found in the empty JSON string", CustomFieldReplacement.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomFieldReplacement.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomFieldReplacement` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomFieldReplacement.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomFieldReplacement' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomFieldReplacement> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomFieldReplacement.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomFieldReplacement>() {
           @Override
           public void write(JsonWriter out, CustomFieldReplacement value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomFieldReplacement read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomFieldReplacement given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomFieldReplacement
  * @throws IOException if the JSON string is invalid with respect to CustomFieldReplacement
  */
  public static CustomFieldReplacement fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomFieldReplacement.class);
  }

 /**
  * Convert an instance of CustomFieldReplacement to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

