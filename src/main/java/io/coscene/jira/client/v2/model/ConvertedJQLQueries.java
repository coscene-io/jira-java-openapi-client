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


package io.coscene.jira.client.v2.model;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import io.coscene.jira.client.v2.JSON;

/**
 * The converted JQL queries.
 */
@ApiModel(description = "The converted JQL queries.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class ConvertedJQLQueries {
  public static final String SERIALIZED_NAME_QUERY_STRINGS = "queryStrings";
  @SerializedName(SERIALIZED_NAME_QUERY_STRINGS)
  private List<String> queryStrings = null;

  public static final String SERIALIZED_NAME_QUERIES_WITH_UNKNOWN_USERS = "queriesWithUnknownUsers";
  @SerializedName(SERIALIZED_NAME_QUERIES_WITH_UNKNOWN_USERS)
  private List<JQLQueryWithUnknownUsers> queriesWithUnknownUsers = null;

  public ConvertedJQLQueries() {
  }

  public ConvertedJQLQueries queryStrings(List<String> queryStrings) {
    
    this.queryStrings = queryStrings;
    return this;
  }

  public ConvertedJQLQueries addQueryStringsItem(String queryStringsItem) {
    if (this.queryStrings == null) {
      this.queryStrings = new ArrayList<>();
    }
    this.queryStrings.add(queryStringsItem);
    return this;
  }

   /**
   * The list of converted query strings with account IDs in place of user identifiers.
   * @return queryStrings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of converted query strings with account IDs in place of user identifiers.")

  public List<String> getQueryStrings() {
    return queryStrings;
  }


  public void setQueryStrings(List<String> queryStrings) {
    this.queryStrings = queryStrings;
  }


  public ConvertedJQLQueries queriesWithUnknownUsers(List<JQLQueryWithUnknownUsers> queriesWithUnknownUsers) {
    
    this.queriesWithUnknownUsers = queriesWithUnknownUsers;
    return this;
  }

  public ConvertedJQLQueries addQueriesWithUnknownUsersItem(JQLQueryWithUnknownUsers queriesWithUnknownUsersItem) {
    if (this.queriesWithUnknownUsers == null) {
      this.queriesWithUnknownUsers = new ArrayList<>();
    }
    this.queriesWithUnknownUsers.add(queriesWithUnknownUsersItem);
    return this;
  }

   /**
   * List of queries containing user information that could not be mapped to an existing user
   * @return queriesWithUnknownUsers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of queries containing user information that could not be mapped to an existing user")

  public List<JQLQueryWithUnknownUsers> getQueriesWithUnknownUsers() {
    return queriesWithUnknownUsers;
  }


  public void setQueriesWithUnknownUsers(List<JQLQueryWithUnknownUsers> queriesWithUnknownUsers) {
    this.queriesWithUnknownUsers = queriesWithUnknownUsers;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConvertedJQLQueries convertedJQLQueries = (ConvertedJQLQueries) o;
    return Objects.equals(this.queryStrings, convertedJQLQueries.queryStrings) &&
        Objects.equals(this.queriesWithUnknownUsers, convertedJQLQueries.queriesWithUnknownUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryStrings, queriesWithUnknownUsers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvertedJQLQueries {\n");
    sb.append("    queryStrings: ").append(toIndentedString(queryStrings)).append("\n");
    sb.append("    queriesWithUnknownUsers: ").append(toIndentedString(queriesWithUnknownUsers)).append("\n");
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
    openapiFields.add("queriesWithUnknownUsers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConvertedJQLQueries
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ConvertedJQLQueries.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConvertedJQLQueries is not found in the empty JSON string", ConvertedJQLQueries.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConvertedJQLQueries.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConvertedJQLQueries` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("queryStrings") != null && !jsonObj.get("queryStrings").isJsonNull()) && !jsonObj.get("queryStrings").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `queryStrings` to be an array in the JSON string but got `%s`", jsonObj.get("queryStrings").toString()));
      }
      if (jsonObj.get("queriesWithUnknownUsers") != null && !jsonObj.get("queriesWithUnknownUsers").isJsonNull()) {
        JsonArray jsonArrayqueriesWithUnknownUsers = jsonObj.getAsJsonArray("queriesWithUnknownUsers");
        if (jsonArrayqueriesWithUnknownUsers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("queriesWithUnknownUsers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `queriesWithUnknownUsers` to be an array in the JSON string but got `%s`", jsonObj.get("queriesWithUnknownUsers").toString()));
          }

          // validate the optional field `queriesWithUnknownUsers` (array)
          for (int i = 0; i < jsonArrayqueriesWithUnknownUsers.size(); i++) {
            JQLQueryWithUnknownUsers.validateJsonObject(jsonArrayqueriesWithUnknownUsers.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConvertedJQLQueries.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConvertedJQLQueries' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConvertedJQLQueries> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConvertedJQLQueries.class));

       return (TypeAdapter<T>) new TypeAdapter<ConvertedJQLQueries>() {
           @Override
           public void write(JsonWriter out, ConvertedJQLQueries value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConvertedJQLQueries read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConvertedJQLQueries given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConvertedJQLQueries
  * @throws IOException if the JSON string is invalid with respect to ConvertedJQLQueries
  */
  public static ConvertedJQLQueries fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConvertedJQLQueries.class);
  }

 /**
  * Convert an instance of ConvertedJQLQueries to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

