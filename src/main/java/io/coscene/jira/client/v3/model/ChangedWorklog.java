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
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

import io.coscene.jira.client.v3.JSON;

/**
 * Details of a changed worklog.
 */
@ApiModel(description = "Details of a changed worklog.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class ChangedWorklog {
  public static final String SERIALIZED_NAME_WORKLOG_ID = "worklogId";
  @SerializedName(SERIALIZED_NAME_WORKLOG_ID)
  private Long worklogId;

  public static final String SERIALIZED_NAME_UPDATED_TIME = "updatedTime";
  @SerializedName(SERIALIZED_NAME_UPDATED_TIME)
  private Long updatedTime;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private List<EntityProperty> properties = null;

  public ChangedWorklog() {
  }

  
  public ChangedWorklog(
     Long worklogId, 
     Long updatedTime, 
     List<EntityProperty> properties
  ) {
    this();
    this.worklogId = worklogId;
    this.updatedTime = updatedTime;
    this.properties = properties;
  }

   /**
   * The ID of the worklog.
   * @return worklogId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the worklog.")

  public Long getWorklogId() {
    return worklogId;
  }




   /**
   * The datetime of the change.
   * @return updatedTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The datetime of the change.")

  public Long getUpdatedTime() {
    return updatedTime;
  }




   /**
   * Details of properties associated with the change.
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details of properties associated with the change.")

  public List<EntityProperty> getProperties() {
    return properties;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangedWorklog changedWorklog = (ChangedWorklog) o;
    return Objects.equals(this.worklogId, changedWorklog.worklogId) &&
        Objects.equals(this.updatedTime, changedWorklog.updatedTime) &&
        Objects.equals(this.properties, changedWorklog.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(worklogId, updatedTime, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangedWorklog {\n");
    sb.append("    worklogId: ").append(toIndentedString(worklogId)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
    openapiFields.add("worklogId");
    openapiFields.add("updatedTime");
    openapiFields.add("properties");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChangedWorklog
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ChangedWorklog.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChangedWorklog is not found in the empty JSON string", ChangedWorklog.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ChangedWorklog.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChangedWorklog` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("properties") != null && !jsonObj.get("properties").isJsonNull()) {
        JsonArray jsonArrayproperties = jsonObj.getAsJsonArray("properties");
        if (jsonArrayproperties != null) {
          // ensure the json data is an array
          if (!jsonObj.get("properties").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `properties` to be an array in the JSON string but got `%s`", jsonObj.get("properties").toString()));
          }

          // validate the optional field `properties` (array)
          for (int i = 0; i < jsonArrayproperties.size(); i++) {
            EntityProperty.validateJsonObject(jsonArrayproperties.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChangedWorklog.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChangedWorklog' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChangedWorklog> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChangedWorklog.class));

       return (TypeAdapter<T>) new TypeAdapter<ChangedWorklog>() {
           @Override
           public void write(JsonWriter out, ChangedWorklog value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChangedWorklog read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChangedWorklog given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChangedWorklog
  * @throws IOException if the JSON string is invalid with respect to ChangedWorklog
  */
  public static ChangedWorklog fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChangedWorklog.class);
  }

 /**
  * Convert an instance of ChangedWorklog to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

