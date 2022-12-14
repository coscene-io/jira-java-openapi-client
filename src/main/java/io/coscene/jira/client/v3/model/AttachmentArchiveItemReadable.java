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
 * Metadata for an item in an attachment archive.
 */
@ApiModel(description = "Metadata for an item in an attachment archive.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class AttachmentArchiveItemReadable {
  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_INDEX = "index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private Long index;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private String size;

  public static final String SERIALIZED_NAME_MEDIA_TYPE = "mediaType";
  @SerializedName(SERIALIZED_NAME_MEDIA_TYPE)
  private String mediaType;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public AttachmentArchiveItemReadable() {
  }

  
  public AttachmentArchiveItemReadable(
     String path, 
     Long index, 
     String size, 
     String mediaType, 
     String label
  ) {
    this();
    this.path = path;
    this.index = index;
    this.size = size;
    this.mediaType = mediaType;
    this.label = label;
  }

   /**
   * The path of the archive item.
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The path of the archive item.")

  public String getPath() {
    return path;
  }




   /**
   * The position of the item within the archive.
   * @return index
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The position of the item within the archive.")

  public Long getIndex() {
    return index;
  }




   /**
   * The size of the archive item.
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The size of the archive item.")

  public String getSize() {
    return size;
  }




   /**
   * The MIME type of the archive item.
   * @return mediaType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The MIME type of the archive item.")

  public String getMediaType() {
    return mediaType;
  }




   /**
   * The label for the archive item.
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The label for the archive item.")

  public String getLabel() {
    return label;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentArchiveItemReadable attachmentArchiveItemReadable = (AttachmentArchiveItemReadable) o;
    return Objects.equals(this.path, attachmentArchiveItemReadable.path) &&
        Objects.equals(this.index, attachmentArchiveItemReadable.index) &&
        Objects.equals(this.size, attachmentArchiveItemReadable.size) &&
        Objects.equals(this.mediaType, attachmentArchiveItemReadable.mediaType) &&
        Objects.equals(this.label, attachmentArchiveItemReadable.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, index, size, mediaType, label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentArchiveItemReadable {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
    openapiFields.add("path");
    openapiFields.add("index");
    openapiFields.add("size");
    openapiFields.add("mediaType");
    openapiFields.add("label");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AttachmentArchiveItemReadable
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AttachmentArchiveItemReadable.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AttachmentArchiveItemReadable is not found in the empty JSON string", AttachmentArchiveItemReadable.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AttachmentArchiveItemReadable.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AttachmentArchiveItemReadable` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull()) && !jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
      if ((jsonObj.get("size") != null && !jsonObj.get("size").isJsonNull()) && !jsonObj.get("size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("size").toString()));
      }
      if ((jsonObj.get("mediaType") != null && !jsonObj.get("mediaType").isJsonNull()) && !jsonObj.get("mediaType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mediaType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mediaType").toString()));
      }
      if ((jsonObj.get("label") != null && !jsonObj.get("label").isJsonNull()) && !jsonObj.get("label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AttachmentArchiveItemReadable.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AttachmentArchiveItemReadable' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AttachmentArchiveItemReadable> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AttachmentArchiveItemReadable.class));

       return (TypeAdapter<T>) new TypeAdapter<AttachmentArchiveItemReadable>() {
           @Override
           public void write(JsonWriter out, AttachmentArchiveItemReadable value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AttachmentArchiveItemReadable read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AttachmentArchiveItemReadable given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AttachmentArchiveItemReadable
  * @throws IOException if the JSON string is invalid with respect to AttachmentArchiveItemReadable
  */
  public static AttachmentArchiveItemReadable fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AttachmentArchiveItemReadable.class);
  }

 /**
  * Convert an instance of AttachmentArchiveItemReadable to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

