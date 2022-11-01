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
 * A screen scheme.
 */
@ApiModel(description = "A screen scheme.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class ScreenScheme {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SCREENS = "screens";
  @SerializedName(SERIALIZED_NAME_SCREENS)
  private ScreenSchemeScreens screens;

  public static final String SERIALIZED_NAME_ISSUE_TYPE_SCREEN_SCHEMES = "issueTypeScreenSchemes";
  @SerializedName(SERIALIZED_NAME_ISSUE_TYPE_SCREEN_SCHEMES)
  private ScreenSchemeIssueTypeScreenSchemes issueTypeScreenSchemes;

  public ScreenScheme() {
  }

  public ScreenScheme id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the screen scheme.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the screen scheme.")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public ScreenScheme name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the screen scheme.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the screen scheme.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ScreenScheme description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the screen scheme.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the screen scheme.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ScreenScheme screens(ScreenSchemeScreens screens) {
    
    this.screens = screens;
    return this;
  }

   /**
   * Get screens
   * @return screens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScreenSchemeScreens getScreens() {
    return screens;
  }


  public void setScreens(ScreenSchemeScreens screens) {
    this.screens = screens;
  }


  public ScreenScheme issueTypeScreenSchemes(ScreenSchemeIssueTypeScreenSchemes issueTypeScreenSchemes) {
    
    this.issueTypeScreenSchemes = issueTypeScreenSchemes;
    return this;
  }

   /**
   * Get issueTypeScreenSchemes
   * @return issueTypeScreenSchemes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ScreenSchemeIssueTypeScreenSchemes getIssueTypeScreenSchemes() {
    return issueTypeScreenSchemes;
  }


  public void setIssueTypeScreenSchemes(ScreenSchemeIssueTypeScreenSchemes issueTypeScreenSchemes) {
    this.issueTypeScreenSchemes = issueTypeScreenSchemes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreenScheme screenScheme = (ScreenScheme) o;
    return Objects.equals(this.id, screenScheme.id) &&
        Objects.equals(this.name, screenScheme.name) &&
        Objects.equals(this.description, screenScheme.description) &&
        Objects.equals(this.screens, screenScheme.screens) &&
        Objects.equals(this.issueTypeScreenSchemes, screenScheme.issueTypeScreenSchemes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, screens, issueTypeScreenSchemes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreenScheme {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    screens: ").append(toIndentedString(screens)).append("\n");
    sb.append("    issueTypeScreenSchemes: ").append(toIndentedString(issueTypeScreenSchemes)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("screens");
    openapiFields.add("issueTypeScreenSchemes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ScreenScheme
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ScreenScheme.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ScreenScheme is not found in the empty JSON string", ScreenScheme.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ScreenScheme.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ScreenScheme` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `screens`
      if (jsonObj.get("screens") != null && !jsonObj.get("screens").isJsonNull()) {
        ScreenSchemeScreens.validateJsonObject(jsonObj.getAsJsonObject("screens"));
      }
      // validate the optional field `issueTypeScreenSchemes`
      if (jsonObj.get("issueTypeScreenSchemes") != null && !jsonObj.get("issueTypeScreenSchemes").isJsonNull()) {
        ScreenSchemeIssueTypeScreenSchemes.validateJsonObject(jsonObj.getAsJsonObject("issueTypeScreenSchemes"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ScreenScheme.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ScreenScheme' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ScreenScheme> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ScreenScheme.class));

       return (TypeAdapter<T>) new TypeAdapter<ScreenScheme>() {
           @Override
           public void write(JsonWriter out, ScreenScheme value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ScreenScheme read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ScreenScheme given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ScreenScheme
  * @throws IOException if the JSON string is invalid with respect to ScreenScheme
  */
  public static ScreenScheme fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ScreenScheme.class);
  }

 /**
  * Convert an instance of ScreenScheme to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

