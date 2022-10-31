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
 * Details of user or system associated with a issue history metadata item.
 */
@ApiModel(description = "Details of user or system associated with a issue history metadata item.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class HistoryMetadataParticipant {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DISPLAY_NAME_KEY = "displayNameKey";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME_KEY)
  private String displayNameKey;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_AVATAR_URL = "avatarUrl";
  @SerializedName(SERIALIZED_NAME_AVATAR_URL)
  private String avatarUrl;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public HistoryMetadataParticipant() {
  }

  public HistoryMetadataParticipant id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the user or system associated with a history record.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the user or system associated with a history record.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public HistoryMetadataParticipant displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name of the user or system associated with a history record.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display name of the user or system associated with a history record.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public HistoryMetadataParticipant displayNameKey(String displayNameKey) {
    
    this.displayNameKey = displayNameKey;
    return this;
  }

   /**
   * The key of the display name of the user or system associated with a history record.
   * @return displayNameKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the display name of the user or system associated with a history record.")

  public String getDisplayNameKey() {
    return displayNameKey;
  }


  public void setDisplayNameKey(String displayNameKey) {
    this.displayNameKey = displayNameKey;
  }


  public HistoryMetadataParticipant type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the user or system associated with a history record.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the user or system associated with a history record.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public HistoryMetadataParticipant avatarUrl(String avatarUrl) {
    
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * The URL to an avatar for the user or system associated with a history record.
   * @return avatarUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL to an avatar for the user or system associated with a history record.")

  public String getAvatarUrl() {
    return avatarUrl;
  }


  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }


  public HistoryMetadataParticipant url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The URL of the user or system associated with a history record.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the user or system associated with a history record.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
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
  public HistoryMetadataParticipant putAdditionalProperty(String key, Object value) {
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
    HistoryMetadataParticipant historyMetadataParticipant = (HistoryMetadataParticipant) o;
    return Objects.equals(this.id, historyMetadataParticipant.id) &&
        Objects.equals(this.displayName, historyMetadataParticipant.displayName) &&
        Objects.equals(this.displayNameKey, historyMetadataParticipant.displayNameKey) &&
        Objects.equals(this.type, historyMetadataParticipant.type) &&
        Objects.equals(this.avatarUrl, historyMetadataParticipant.avatarUrl) &&
        Objects.equals(this.url, historyMetadataParticipant.url)&&
        Objects.equals(this.additionalProperties, historyMetadataParticipant.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayName, displayNameKey, type, avatarUrl, url, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoryMetadataParticipant {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    displayNameKey: ").append(toIndentedString(displayNameKey)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("displayName");
    openapiFields.add("displayNameKey");
    openapiFields.add("type");
    openapiFields.add("avatarUrl");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to HistoryMetadataParticipant
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (HistoryMetadataParticipant.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in HistoryMetadataParticipant is not found in the empty JSON string", HistoryMetadataParticipant.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("displayNameKey") != null && !jsonObj.get("displayNameKey").isJsonNull()) && !jsonObj.get("displayNameKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayNameKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayNameKey").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("avatarUrl") != null && !jsonObj.get("avatarUrl").isJsonNull()) && !jsonObj.get("avatarUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatarUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatarUrl").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HistoryMetadataParticipant.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HistoryMetadataParticipant' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HistoryMetadataParticipant> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HistoryMetadataParticipant.class));

       return (TypeAdapter<T>) new TypeAdapter<HistoryMetadataParticipant>() {
           @Override
           public void write(JsonWriter out, HistoryMetadataParticipant value) throws IOException {
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
           public HistoryMetadataParticipant read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             HistoryMetadataParticipant instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of HistoryMetadataParticipant given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of HistoryMetadataParticipant
  * @throws IOException if the JSON string is invalid with respect to HistoryMetadataParticipant
  */
  public static HistoryMetadataParticipant fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HistoryMetadataParticipant.class);
  }

 /**
  * Convert an instance of HistoryMetadataParticipant to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

