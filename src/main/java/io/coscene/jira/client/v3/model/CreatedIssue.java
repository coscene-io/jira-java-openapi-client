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
 * Details about a created issue or subtask.
 */
@ApiModel(description = "Details about a created issue or subtask.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class CreatedIssue {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private String self;

  public static final String SERIALIZED_NAME_TRANSITION = "transition";
  @SerializedName(SERIALIZED_NAME_TRANSITION)
  private CreatedIssueTransition transition;

  public CreatedIssue() {
  }

  
  public CreatedIssue(
     String id, 
     String key, 
     String self
  ) {
    this();
    this.id = id;
    this.key = key;
    this.self = self;
  }

   /**
   * The ID of the created issue or subtask.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the created issue or subtask.")

  public String getId() {
    return id;
  }




   /**
   * The key of the created issue or subtask.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the created issue or subtask.")

  public String getKey() {
    return key;
  }




   /**
   * The URL of the created issue or subtask.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the created issue or subtask.")

  public String getSelf() {
    return self;
  }




  public CreatedIssue transition(CreatedIssueTransition transition) {
    
    this.transition = transition;
    return this;
  }

   /**
   * Get transition
   * @return transition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreatedIssueTransition getTransition() {
    return transition;
  }


  public void setTransition(CreatedIssueTransition transition) {
    this.transition = transition;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatedIssue createdIssue = (CreatedIssue) o;
    return Objects.equals(this.id, createdIssue.id) &&
        Objects.equals(this.key, createdIssue.key) &&
        Objects.equals(this.self, createdIssue.self) &&
        Objects.equals(this.transition, createdIssue.transition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, self, transition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatedIssue {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    transition: ").append(toIndentedString(transition)).append("\n");
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
    openapiFields.add("key");
    openapiFields.add("self");
    openapiFields.add("transition");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreatedIssue
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreatedIssue.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreatedIssue is not found in the empty JSON string", CreatedIssue.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreatedIssue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreatedIssue` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) && !jsonObj.get("self").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self").toString()));
      }
      // validate the optional field `transition`
      if (jsonObj.get("transition") != null && !jsonObj.get("transition").isJsonNull()) {
        CreatedIssueTransition.validateJsonObject(jsonObj.getAsJsonObject("transition"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreatedIssue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreatedIssue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreatedIssue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreatedIssue.class));

       return (TypeAdapter<T>) new TypeAdapter<CreatedIssue>() {
           @Override
           public void write(JsonWriter out, CreatedIssue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreatedIssue read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreatedIssue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreatedIssue
  * @throws IOException if the JSON string is invalid with respect to CreatedIssue
  */
  public static CreatedIssue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreatedIssue.class);
  }

 /**
  * Convert an instance of CreatedIssue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

