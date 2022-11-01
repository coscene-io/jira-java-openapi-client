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
import java.time.OffsetDateTime;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import io.coscene.jira.client.v3.JSON;

/**
 * Details about an attachment.
 */
@ApiModel(description = "Details about an attachment.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class Attachment {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private String self;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename;

  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private AttachmentAuthor author;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size;

  public static final String SERIALIZED_NAME_MIME_TYPE = "mimeType";
  @SerializedName(SERIALIZED_NAME_MIME_TYPE)
  private String mimeType;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_THUMBNAIL = "thumbnail";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL)
  private String thumbnail;

  public Attachment() {
  }

  
  public Attachment(
     String self, 
     String id, 
     String filename, 
     OffsetDateTime created, 
     Long size, 
     String mimeType, 
     String content, 
     String thumbnail
  ) {
    this();
    this.self = self;
    this.id = id;
    this.filename = filename;
    this.created = created;
    this.size = size;
    this.mimeType = mimeType;
    this.content = content;
    this.thumbnail = thumbnail;
  }

   /**
   * The URL of the attachment details response.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the attachment details response.")

  public String getSelf() {
    return self;
  }




   /**
   * The ID of the attachment.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the attachment.")

  public String getId() {
    return id;
  }




   /**
   * The file name of the attachment.
   * @return filename
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The file name of the attachment.")

  public String getFilename() {
    return filename;
  }




  public Attachment author(AttachmentAuthor author) {
    
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AttachmentAuthor getAuthor() {
    return author;
  }


  public void setAuthor(AttachmentAuthor author) {
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
   * The content of the attachment.
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The content of the attachment.")

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



  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  public Attachment putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attachment attachment = (Attachment) o;
    return Objects.equals(this.self, attachment.self) &&
        Objects.equals(this.id, attachment.id) &&
        Objects.equals(this.filename, attachment.filename) &&
        Objects.equals(this.author, attachment.author) &&
        Objects.equals(this.created, attachment.created) &&
        Objects.equals(this.size, attachment.size) &&
        Objects.equals(this.mimeType, attachment.mimeType) &&
        Objects.equals(this.content, attachment.content) &&
        Objects.equals(this.thumbnail, attachment.thumbnail)&&
        Objects.equals(this.additionalProperties, attachment.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, id, filename, author, created, size, mimeType, content, thumbnail, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("self");
    openapiFields.add("id");
    openapiFields.add("filename");
    openapiFields.add("author");
    openapiFields.add("created");
    openapiFields.add("size");
    openapiFields.add("mimeType");
    openapiFields.add("content");
    openapiFields.add("thumbnail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Attachment
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Attachment.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Attachment is not found in the empty JSON string", Attachment.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) && !jsonObj.get("self").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("filename") != null && !jsonObj.get("filename").isJsonNull()) && !jsonObj.get("filename").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `filename` to be a primitive type in the JSON string but got `%s`", jsonObj.get("filename").toString()));
      }
      // validate the optional field `author`
      if (jsonObj.get("author") != null && !jsonObj.get("author").isJsonNull()) {
        AttachmentAuthor.validateJsonObject(jsonObj.getAsJsonObject("author"));
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
       if (!Attachment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Attachment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Attachment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Attachment.class));

       return (TypeAdapter<T>) new TypeAdapter<Attachment>() {
           @Override
           public void write(JsonWriter out, Attachment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public Attachment read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Attachment instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Attachment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Attachment
  * @throws IOException if the JSON string is invalid with respect to Attachment
  */
  public static Attachment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Attachment.class);
  }

 /**
  * Convert an instance of Attachment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
