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
import java.net.URI;

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
 * The URLs of the project&#39;s avatars.
 */
@ApiModel(description = "The URLs of the project's avatars.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class ProjectDetailsAvatarUrls {
  public static final String SERIALIZED_NAME_16X16 = "16x16";
  @SerializedName(SERIALIZED_NAME_16X16)
  private URI _16x16;

  public static final String SERIALIZED_NAME_24X24 = "24x24";
  @SerializedName(SERIALIZED_NAME_24X24)
  private URI _24x24;

  public static final String SERIALIZED_NAME_32X32 = "32x32";
  @SerializedName(SERIALIZED_NAME_32X32)
  private URI _32x32;

  public static final String SERIALIZED_NAME_48X48 = "48x48";
  @SerializedName(SERIALIZED_NAME_48X48)
  private URI _48x48;

  public ProjectDetailsAvatarUrls() {
  }

  public ProjectDetailsAvatarUrls _16x16(URI _16x16) {
    
    this._16x16 = _16x16;
    return this;
  }

   /**
   * The URL of the item&#39;s 16x16 pixel avatar.
   * @return _16x16
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the item's 16x16 pixel avatar.")

  public URI get16x16() {
    return _16x16;
  }


  public void set16x16(URI _16x16) {
    this._16x16 = _16x16;
  }


  public ProjectDetailsAvatarUrls _24x24(URI _24x24) {
    
    this._24x24 = _24x24;
    return this;
  }

   /**
   * The URL of the item&#39;s 24x24 pixel avatar.
   * @return _24x24
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the item's 24x24 pixel avatar.")

  public URI get24x24() {
    return _24x24;
  }


  public void set24x24(URI _24x24) {
    this._24x24 = _24x24;
  }


  public ProjectDetailsAvatarUrls _32x32(URI _32x32) {
    
    this._32x32 = _32x32;
    return this;
  }

   /**
   * The URL of the item&#39;s 32x32 pixel avatar.
   * @return _32x32
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the item's 32x32 pixel avatar.")

  public URI get32x32() {
    return _32x32;
  }


  public void set32x32(URI _32x32) {
    this._32x32 = _32x32;
  }


  public ProjectDetailsAvatarUrls _48x48(URI _48x48) {
    
    this._48x48 = _48x48;
    return this;
  }

   /**
   * The URL of the item&#39;s 48x48 pixel avatar.
   * @return _48x48
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the item's 48x48 pixel avatar.")

  public URI get48x48() {
    return _48x48;
  }


  public void set48x48(URI _48x48) {
    this._48x48 = _48x48;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectDetailsAvatarUrls projectDetailsAvatarUrls = (ProjectDetailsAvatarUrls) o;
    return Objects.equals(this._16x16, projectDetailsAvatarUrls._16x16) &&
        Objects.equals(this._24x24, projectDetailsAvatarUrls._24x24) &&
        Objects.equals(this._32x32, projectDetailsAvatarUrls._32x32) &&
        Objects.equals(this._48x48, projectDetailsAvatarUrls._48x48);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_16x16, _24x24, _32x32, _48x48);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectDetailsAvatarUrls {\n");
    sb.append("    _16x16: ").append(toIndentedString(_16x16)).append("\n");
    sb.append("    _24x24: ").append(toIndentedString(_24x24)).append("\n");
    sb.append("    _32x32: ").append(toIndentedString(_32x32)).append("\n");
    sb.append("    _48x48: ").append(toIndentedString(_48x48)).append("\n");
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
    openapiFields.add("16x16");
    openapiFields.add("24x24");
    openapiFields.add("32x32");
    openapiFields.add("48x48");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectDetailsAvatarUrls
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProjectDetailsAvatarUrls.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectDetailsAvatarUrls is not found in the empty JSON string", ProjectDetailsAvatarUrls.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProjectDetailsAvatarUrls.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectDetailsAvatarUrls` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("16x16") != null && !jsonObj.get("16x16").isJsonNull()) && !jsonObj.get("16x16").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `16x16` to be a primitive type in the JSON string but got `%s`", jsonObj.get("16x16").toString()));
      }
      if ((jsonObj.get("24x24") != null && !jsonObj.get("24x24").isJsonNull()) && !jsonObj.get("24x24").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `24x24` to be a primitive type in the JSON string but got `%s`", jsonObj.get("24x24").toString()));
      }
      if ((jsonObj.get("32x32") != null && !jsonObj.get("32x32").isJsonNull()) && !jsonObj.get("32x32").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `32x32` to be a primitive type in the JSON string but got `%s`", jsonObj.get("32x32").toString()));
      }
      if ((jsonObj.get("48x48") != null && !jsonObj.get("48x48").isJsonNull()) && !jsonObj.get("48x48").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `48x48` to be a primitive type in the JSON string but got `%s`", jsonObj.get("48x48").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectDetailsAvatarUrls.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectDetailsAvatarUrls' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectDetailsAvatarUrls> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectDetailsAvatarUrls.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectDetailsAvatarUrls>() {
           @Override
           public void write(JsonWriter out, ProjectDetailsAvatarUrls value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectDetailsAvatarUrls read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectDetailsAvatarUrls given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectDetailsAvatarUrls
  * @throws IOException if the JSON string is invalid with respect to ProjectDetailsAvatarUrls
  */
  public static ProjectDetailsAvatarUrls fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectDetailsAvatarUrls.class);
  }

 /**
  * Convert an instance of ProjectDetailsAvatarUrls to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

