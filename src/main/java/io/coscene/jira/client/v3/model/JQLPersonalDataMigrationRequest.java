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
import java.util.ArrayList;
import java.util.List;

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
 * The JQL queries to be converted.
 */
@ApiModel(description = "The JQL queries to be converted.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class JQLPersonalDataMigrationRequest {
  public static final String SERIALIZED_NAME_QUERY_STRINGS = "queryStrings";
  @SerializedName(SERIALIZED_NAME_QUERY_STRINGS)
  private List<String> queryStrings = null;

  public JQLPersonalDataMigrationRequest() {
  }

  public JQLPersonalDataMigrationRequest queryStrings(List<String> queryStrings) {
    
    this.queryStrings = queryStrings;
    return this;
  }

  public JQLPersonalDataMigrationRequest addQueryStringsItem(String queryStringsItem) {
    if (this.queryStrings == null) {
      this.queryStrings = new ArrayList<>();
    }
    this.queryStrings.add(queryStringsItem);
    return this;
  }

   /**
   * A list of queries with user identifiers. Maximum of 100 queries.
   * @return queryStrings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of queries with user identifiers. Maximum of 100 queries.")

  public List<String> getQueryStrings() {
    return queryStrings;
  }


  public void setQueryStrings(List<String> queryStrings) {
    this.queryStrings = queryStrings;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JQLPersonalDataMigrationRequest jqLPersonalDataMigrationRequest = (JQLPersonalDataMigrationRequest) o;
    return Objects.equals(this.queryStrings, jqLPersonalDataMigrationRequest.queryStrings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryStrings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JQLPersonalDataMigrationRequest {\n");
    sb.append("    queryStrings: ").append(toIndentedString(queryStrings)).append("\n");
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
    openapiFields.add("queryStrings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JQLPersonalDataMigrationRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JQLPersonalDataMigrationRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JQLPersonalDataMigrationRequest is not found in the empty JSON string", JQLPersonalDataMigrationRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JQLPersonalDataMigrationRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JQLPersonalDataMigrationRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("queryStrings") != null && !jsonObj.get("queryStrings").isJsonNull()) && !jsonObj.get("queryStrings").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `queryStrings` to be an array in the JSON string but got `%s`", jsonObj.get("queryStrings").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JQLPersonalDataMigrationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JQLPersonalDataMigrationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JQLPersonalDataMigrationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JQLPersonalDataMigrationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<JQLPersonalDataMigrationRequest>() {
           @Override
           public void write(JsonWriter out, JQLPersonalDataMigrationRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JQLPersonalDataMigrationRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JQLPersonalDataMigrationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JQLPersonalDataMigrationRequest
  * @throws IOException if the JSON string is invalid with respect to JQLPersonalDataMigrationRequest
  */
  public static JQLPersonalDataMigrationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JQLPersonalDataMigrationRequest.class);
  }

 /**
  * Convert an instance of JQLPersonalDataMigrationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
