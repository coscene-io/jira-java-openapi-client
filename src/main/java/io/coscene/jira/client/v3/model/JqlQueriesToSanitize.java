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
 * The list of JQL queries to sanitize for the given account IDs.
 */
@ApiModel(description = "The list of JQL queries to sanitize for the given account IDs.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class JqlQueriesToSanitize {
  public static final String SERIALIZED_NAME_QUERIES = "queries";
  @SerializedName(SERIALIZED_NAME_QUERIES)
  private List<JqlQueryToSanitize> queries = new ArrayList<>();

  public JqlQueriesToSanitize() {
  }

  public JqlQueriesToSanitize queries(List<JqlQueryToSanitize> queries) {
    
    this.queries = queries;
    return this;
  }

  public JqlQueriesToSanitize addQueriesItem(JqlQueryToSanitize queriesItem) {
    this.queries.add(queriesItem);
    return this;
  }

   /**
   * The list of JQL queries to sanitize. Must contain unique values. Maximum of 20 queries.
   * @return queries
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The list of JQL queries to sanitize. Must contain unique values. Maximum of 20 queries.")

  public List<JqlQueryToSanitize> getQueries() {
    return queries;
  }


  public void setQueries(List<JqlQueryToSanitize> queries) {
    this.queries = queries;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JqlQueriesToSanitize jqlQueriesToSanitize = (JqlQueriesToSanitize) o;
    return Objects.equals(this.queries, jqlQueriesToSanitize.queries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JqlQueriesToSanitize {\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
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
    openapiFields.add("queries");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("queries");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JqlQueriesToSanitize
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JqlQueriesToSanitize.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JqlQueriesToSanitize is not found in the empty JSON string", JqlQueriesToSanitize.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JqlQueriesToSanitize.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JqlQueriesToSanitize` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : JqlQueriesToSanitize.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("queries") != null && !jsonObj.get("queries").isJsonNull()) {
        JsonArray jsonArrayqueries = jsonObj.getAsJsonArray("queries");
        if (jsonArrayqueries != null) {
          // ensure the json data is an array
          if (!jsonObj.get("queries").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `queries` to be an array in the JSON string but got `%s`", jsonObj.get("queries").toString()));
          }

          // validate the optional field `queries` (array)
          for (int i = 0; i < jsonArrayqueries.size(); i++) {
            JqlQueryToSanitize.validateJsonObject(jsonArrayqueries.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JqlQueriesToSanitize.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JqlQueriesToSanitize' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JqlQueriesToSanitize> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JqlQueriesToSanitize.class));

       return (TypeAdapter<T>) new TypeAdapter<JqlQueriesToSanitize>() {
           @Override
           public void write(JsonWriter out, JqlQueriesToSanitize value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JqlQueriesToSanitize read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JqlQueriesToSanitize given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JqlQueriesToSanitize
  * @throws IOException if the JSON string is invalid with respect to JqlQueriesToSanitize
  */
  public static JqlQueriesToSanitize fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JqlQueriesToSanitize.class);
  }

 /**
  * Convert an instance of JqlQueriesToSanitize to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

