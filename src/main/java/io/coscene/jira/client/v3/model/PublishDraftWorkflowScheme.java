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
import java.util.LinkedHashSet;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashSet;
import java.util.Map.Entry;

import io.coscene.jira.client.v3.JSON;

/**
 * Details about the status mappings for publishing a draft workflow scheme.
 */
@ApiModel(description = "Details about the status mappings for publishing a draft workflow scheme.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class PublishDraftWorkflowScheme {
  public static final String SERIALIZED_NAME_STATUS_MAPPINGS = "statusMappings";
  @SerializedName(SERIALIZED_NAME_STATUS_MAPPINGS)
  private Set<StatusMapping> statusMappings = null;

  public PublishDraftWorkflowScheme() {
  }

  public PublishDraftWorkflowScheme statusMappings(Set<StatusMapping> statusMappings) {
    
    this.statusMappings = statusMappings;
    return this;
  }

  public PublishDraftWorkflowScheme addStatusMappingsItem(StatusMapping statusMappingsItem) {
    if (this.statusMappings == null) {
      this.statusMappings = new LinkedHashSet<>();
    }
    this.statusMappings.add(statusMappingsItem);
    return this;
  }

   /**
   * Mappings of statuses to new statuses for issue types.
   * @return statusMappings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Mappings of statuses to new statuses for issue types.")

  public Set<StatusMapping> getStatusMappings() {
    return statusMappings;
  }


  public void setStatusMappings(Set<StatusMapping> statusMappings) {
    this.statusMappings = statusMappings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublishDraftWorkflowScheme publishDraftWorkflowScheme = (PublishDraftWorkflowScheme) o;
    return Objects.equals(this.statusMappings, publishDraftWorkflowScheme.statusMappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusMappings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublishDraftWorkflowScheme {\n");
    sb.append("    statusMappings: ").append(toIndentedString(statusMappings)).append("\n");
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
    openapiFields.add("statusMappings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PublishDraftWorkflowScheme
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PublishDraftWorkflowScheme.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PublishDraftWorkflowScheme is not found in the empty JSON string", PublishDraftWorkflowScheme.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PublishDraftWorkflowScheme.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PublishDraftWorkflowScheme` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("statusMappings") != null && !jsonObj.get("statusMappings").isJsonNull()) {
        JsonArray jsonArraystatusMappings = jsonObj.getAsJsonArray("statusMappings");
        if (jsonArraystatusMappings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("statusMappings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `statusMappings` to be an array in the JSON string but got `%s`", jsonObj.get("statusMappings").toString()));
          }

          // validate the optional field `statusMappings` (array)
          for (int i = 0; i < jsonArraystatusMappings.size(); i++) {
            StatusMapping.validateJsonObject(jsonArraystatusMappings.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PublishDraftWorkflowScheme.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PublishDraftWorkflowScheme' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PublishDraftWorkflowScheme> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PublishDraftWorkflowScheme.class));

       return (TypeAdapter<T>) new TypeAdapter<PublishDraftWorkflowScheme>() {
           @Override
           public void write(JsonWriter out, PublishDraftWorkflowScheme value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PublishDraftWorkflowScheme read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PublishDraftWorkflowScheme given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PublishDraftWorkflowScheme
  * @throws IOException if the JSON string is invalid with respect to PublishDraftWorkflowScheme
  */
  public static PublishDraftWorkflowScheme fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PublishDraftWorkflowScheme.class);
  }

 /**
  * Convert an instance of PublishDraftWorkflowScheme to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
