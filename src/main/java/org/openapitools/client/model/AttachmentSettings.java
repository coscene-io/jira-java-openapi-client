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
 * Details of the instance&#39;s attachment settings.
 */
@ApiModel(description = "Details of the instance's attachment settings.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class AttachmentSettings {
  public static final String SERIALIZED_NAME_ENABLED = "enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_UPLOAD_LIMIT = "uploadLimit";
  @SerializedName(SERIALIZED_NAME_UPLOAD_LIMIT)
  private Long uploadLimit;

  public AttachmentSettings() {
  }

  
  public AttachmentSettings(
     Boolean enabled, 
     Long uploadLimit
  ) {
    this();
    this.enabled = enabled;
    this.uploadLimit = uploadLimit;
  }

   /**
   * Whether the ability to add attachments is enabled.
   * @return enabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the ability to add attachments is enabled.")

  public Boolean getEnabled() {
    return enabled;
  }




   /**
   * The maximum size of attachments permitted, in bytes.
   * @return uploadLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum size of attachments permitted, in bytes.")

  public Long getUploadLimit() {
    return uploadLimit;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentSettings attachmentSettings = (AttachmentSettings) o;
    return Objects.equals(this.enabled, attachmentSettings.enabled) &&
        Objects.equals(this.uploadLimit, attachmentSettings.uploadLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, uploadLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentSettings {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    uploadLimit: ").append(toIndentedString(uploadLimit)).append("\n");
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
    openapiFields.add("enabled");
    openapiFields.add("uploadLimit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AttachmentSettings
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AttachmentSettings.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AttachmentSettings is not found in the empty JSON string", AttachmentSettings.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AttachmentSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AttachmentSettings` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AttachmentSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AttachmentSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AttachmentSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AttachmentSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<AttachmentSettings>() {
           @Override
           public void write(JsonWriter out, AttachmentSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AttachmentSettings read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AttachmentSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AttachmentSettings
  * @throws IOException if the JSON string is invalid with respect to AttachmentSettings
  */
  public static AttachmentSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AttachmentSettings.class);
  }

 /**
  * Convert an instance of AttachmentSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

