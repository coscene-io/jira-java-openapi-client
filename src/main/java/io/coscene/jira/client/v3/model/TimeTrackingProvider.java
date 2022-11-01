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
 * Details about the time tracking provider.
 */
@ApiModel(description = "Details about the time tracking provider.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class TimeTrackingProvider {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public TimeTrackingProvider() {
  }

  
  public TimeTrackingProvider(
     String url
  ) {
    this();
    this.url = url;
  }

  public TimeTrackingProvider key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The key for the time tracking provider. For example, *JIRA*.
   * @return key
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The key for the time tracking provider. For example, *JIRA*.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public TimeTrackingProvider name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the time tracking provider. For example, *JIRA provided time tracking*.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the time tracking provider. For example, *JIRA provided time tracking*.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


   /**
   * The URL of the configuration page for the time tracking provider app. For example, *_/example/config/url*. This property is only returned if the &#x60;adminPageKey&#x60; property is set in the module descriptor of the time tracking provider app.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the configuration page for the time tracking provider app. For example, *_/example/config/url*. This property is only returned if the `adminPageKey` property is set in the module descriptor of the time tracking provider app.")

  public String getUrl() {
    return url;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeTrackingProvider timeTrackingProvider = (TimeTrackingProvider) o;
    return Objects.equals(this.key, timeTrackingProvider.key) &&
        Objects.equals(this.name, timeTrackingProvider.name) &&
        Objects.equals(this.url, timeTrackingProvider.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, name, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeTrackingProvider {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("key");
    openapiFields.add("name");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("key");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TimeTrackingProvider
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TimeTrackingProvider.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimeTrackingProvider is not found in the empty JSON string", TimeTrackingProvider.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TimeTrackingProvider.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TimeTrackingProvider` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TimeTrackingProvider.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimeTrackingProvider.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimeTrackingProvider' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimeTrackingProvider> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimeTrackingProvider.class));

       return (TypeAdapter<T>) new TypeAdapter<TimeTrackingProvider>() {
           @Override
           public void write(JsonWriter out, TimeTrackingProvider value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TimeTrackingProvider read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TimeTrackingProvider given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TimeTrackingProvider
  * @throws IOException if the JSON string is invalid with respect to TimeTrackingProvider
  */
  public static TimeTrackingProvider fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimeTrackingProvider.class);
  }

 /**
  * Convert an instance of TimeTrackingProvider to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
