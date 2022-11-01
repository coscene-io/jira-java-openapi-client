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
 * A list of matched issues or errors for each JQL query, in the order the JQL queries were passed.
 */
@ApiModel(description = "A list of matched issues or errors for each JQL query, in the order the JQL queries were passed.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class IssueMatches {
  public static final String SERIALIZED_NAME_MATCHES = "matches";
  @SerializedName(SERIALIZED_NAME_MATCHES)
  private List<IssueMatchesForJQL> matches = new ArrayList<>();

  public IssueMatches() {
  }

  public IssueMatches matches(List<IssueMatchesForJQL> matches) {
    
    this.matches = matches;
    return this;
  }

  public IssueMatches addMatchesItem(IssueMatchesForJQL matchesItem) {
    this.matches.add(matchesItem);
    return this;
  }

   /**
   * Get matches
   * @return matches
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<IssueMatchesForJQL> getMatches() {
    return matches;
  }


  public void setMatches(List<IssueMatchesForJQL> matches) {
    this.matches = matches;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueMatches issueMatches = (IssueMatches) o;
    return Objects.equals(this.matches, issueMatches.matches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matches);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueMatches {\n");
    sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
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
    openapiFields.add("matches");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("matches");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IssueMatches
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IssueMatches.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssueMatches is not found in the empty JSON string", IssueMatches.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IssueMatches.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IssueMatches` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IssueMatches.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("matches") != null && !jsonObj.get("matches").isJsonNull()) {
        JsonArray jsonArraymatches = jsonObj.getAsJsonArray("matches");
        if (jsonArraymatches != null) {
          // ensure the json data is an array
          if (!jsonObj.get("matches").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `matches` to be an array in the JSON string but got `%s`", jsonObj.get("matches").toString()));
          }

          // validate the optional field `matches` (array)
          for (int i = 0; i < jsonArraymatches.size(); i++) {
            IssueMatchesForJQL.validateJsonObject(jsonArraymatches.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssueMatches.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssueMatches' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssueMatches> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssueMatches.class));

       return (TypeAdapter<T>) new TypeAdapter<IssueMatches>() {
           @Override
           public void write(JsonWriter out, IssueMatches value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IssueMatches read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IssueMatches given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IssueMatches
  * @throws IOException if the JSON string is invalid with respect to IssueMatches
  */
  public static IssueMatches fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssueMatches.class);
  }

 /**
  * Convert an instance of IssueMatches to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

