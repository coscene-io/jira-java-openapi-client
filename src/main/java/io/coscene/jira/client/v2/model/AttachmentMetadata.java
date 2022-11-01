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
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import io.coscene.jira.client.v2.JSON;

/**
 * Metadata for an issue attachment.
 */
@ApiModel(description = "Metadata for an issue attachment.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class AttachmentMetadata {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private URI self;

  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename;

  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private AttachmentMetadataAuthor author;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_MIME_TYPE = "mimeType";
  @SerializedName(SERIALIZED_NAME_MIME_TYPE)
  private String mimeType;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, Object> properties = null;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_THUMBNAIL = "thumbnail";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL)
  private String thumbnail;

  public AttachmentMetadata() {
  }

  
  public AttachmentMetadata(
     Long id, 
     URI self, 
     String filename, 
     OffsetDateTime created, 
     Long size, 
     String mimeType, 
     Map<String, Object> properties, 
     String content, 
     String thumbnail
  ) {
    this();
    this.id = id;
    this.self = self;
    this.filename = filename;
    this.created = created;
    this.size = size;
    this.mimeType = mimeType;
    this.properties = properties;
    this.content = content;
    this.thumbnail = thumbnail;
  }

   /**
   * The ID of the attachment.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the attachment.")

  public Long getId() {
    return id;
  }




   /**
   * The URL of the attachment metadata details.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the attachment metadata details.")

  public URI getSelf() {
    return self;
  }




   /**
   * The name of the attachment file.
   * @return filename
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the attachment file.")

  public String getFilename() {
    return filename;
  }




  public AttachmentMetadata author(AttachmentMetadataAuthor author) {
    
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AttachmentMetadataAuthor getAuthor() {
    return author;
  }


  public void setAuthor(AttachmentMetadataAuthor author) {
    this.author = author;
  }


   /**
   * The datetime the attachment was created.
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The datetime the attachment was created.")

  public OffsetDateTime getCreated() {
    return created;
  }




   /**
   * The size of the attachment.
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The size of the attachment.")

  public Long getSize() {
    return size;
  }




   /**
   * The MIME type of the attachment.
   * @return mimeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The MIME type of the attachment.")

  public String getMimeType() {
    return mimeType;
  }




   /**
   * Additional properties of the attachment.
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional properties of the attachment.")

  public Map<String, Object> getProperties() {
    return properties;
  }




   /**
   * The URL of the attachment.
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the attachment.")

  public String getContent() {
    return content;
  }




   /**
   * The URL of a thumbnail representing the attachment.
   * @return thumbnail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of a thumbnail representing the attachment.")

  public String getThumbnail() {
    return thumbnail;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentMetadata attachmentMetadata = (AttachmentMetadata) o;
    return Objects.equals(this.id, attachmentMetadata.id) &&
        Objects.equals(this.self, attachmentMetadata.self) &&
        Objects.equals(this.filename, attachmentMetadata.filename) &&
        Objects.equals(this.author, attachmentMetadata.author) &&
        Objects.equals(this.created, attachmentMetadata.created) &&
        Objects.equals(this.size, attachmentMetadata.size) &&
        Objects.equals(this.mimeType, attachmentMetadata.mimeType) &&
        Objects.equals(this.properties, attachmentMetadata.properties) &&
        Objects.equals(this.content, attachmentMetadata.content) &&
        Objects.equals(this.thumbnail, attachmentMetadata.thumbnail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, self, filename, author, created, size, mimeType, properties, content, thumbnail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentMetadata {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
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
    openapiFields.add("self");
    openapiFields.add("filename");
    openapiFields.add("author");
    openapiFields.add("created");
    openapiFields.add("size");
    openapiFields.add("mimeType");
    openapiFields.add("properties");
    openapiFields.add("content");
    openapiFields.add("thumbnail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AttachmentMetadata
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AttachmentMetadata.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AttachmentMetadata is not found in the empty JSON string", AttachmentMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AttachmentMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AttachmentMetadata` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) && !jsonObj.get("self").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self").toString()));
      }
      if ((jsonObj.get("filename") != null && !jsonObj.get("filename").isJsonNull()) && !jsonObj.get("filename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filename").toString()));
      }
      // validate the optional field `author`
      if (jsonObj.get("author") != null && !jsonObj.get("author").isJsonNull()) {
        AttachmentMetadataAuthor.validateJsonObject(jsonObj.getAsJsonObject("author"));
      }
      if ((jsonObj.get("mimeType") != null && !jsonObj.get("mimeType").isJsonNull()) && !jsonObj.get("mimeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mimeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mimeType").toString()));
      }
      if ((jsonObj.get("content") != null && !jsonObj.get("content").isJsonNull()) && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if ((jsonObj.get("thumbnail") != null && !jsonObj.get("thumbnail").isJsonNull()) && !jsonObj.get("thumbnail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thumbnail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thumbnail").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AttachmentMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AttachmentMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AttachmentMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AttachmentMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<AttachmentMetadata>() {
           @Override
           public void write(JsonWriter out, AttachmentMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AttachmentMetadata read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AttachmentMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AttachmentMetadata
  * @throws IOException if the JSON string is invalid with respect to AttachmentMetadata
  */
  public static AttachmentMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AttachmentMetadata.class);
  }

 /**
  * Convert an instance of AttachmentMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

