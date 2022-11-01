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
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import io.coscene.jira.client.v2.JSON;

/**
 * A list of the issues matched to a JQL query or details of errors encountered during matching.
 */
@ApiModel(description = "A list of the issues matched to a JQL query or details of errors encountered during matching.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class IssueMatchesForJQL {
  public static final String SERIALIZED_NAME_MATCHED_ISSUES = "matchedIssues";
  @SerializedName(SERIALIZED_NAME_MATCHED_ISSUES)
  private Set<Long> matchedIssues = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private Set<String> errors = new LinkedHashSet<>();

  public IssueMatchesForJQL() {
  }

  public IssueMatchesForJQL matchedIssues(Set<Long> matchedIssues) {
    
    this.matchedIssues = matchedIssues;
    return this;
  }

  public IssueMatchesForJQL addMatchedIssuesItem(Long matchedIssuesItem) {
    this.matchedIssues.add(matchedIssuesItem);
    return this;
  }

   /**
   * A list of issue IDs.
   * @return matchedIssues
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of issue IDs.")

  public Set<Long> getMatchedIssues() {
    return matchedIssues;
  }


  public void setMatchedIssues(Set<Long> matchedIssues) {
    this.matchedIssues = matchedIssues;
  }


  public IssueMatchesForJQL errors(Set<String> errors) {
    
    this.errors = errors;
    return this;
  }

  public IssueMatchesForJQL addErrorsItem(String errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * A list of errors.
   * @return errors
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of errors.")

  public Set<String> getErrors() {
    return errors;
  }


  public void setErrors(Set<String> errors) {
    this.errors = errors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueMatchesForJQL issueMatchesForJQL = (IssueMatchesForJQL) o;
    return Objects.equals(this.matchedIssues, issueMatchesForJQL.matchedIssues) &&
        Objects.equals(this.errors, issueMatchesForJQL.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchedIssues, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueMatchesForJQL {\n");
    sb.append("    matchedIssues: ").append(toIndentedString(matchedIssues)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
    openapiFields.add("matchedIssues");
    openapiFields.add("errors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("matchedIssues");
    openapiRequiredFields.add("errors");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IssueMatchesForJQL
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IssueMatchesForJQL.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssueMatchesForJQL is not found in the empty JSON string", IssueMatchesForJQL.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IssueMatchesForJQL.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IssueMatchesForJQL` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IssueMatchesForJQL.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("matchedIssues") != null && !jsonObj.get("matchedIssues").isJsonNull()) && !jsonObj.get("matchedIssues").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `matchedIssues` to be an array in the JSON string but got `%s`", jsonObj.get("matchedIssues").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("errors") != null && !jsonObj.get("errors").isJsonNull()) && !jsonObj.get("errors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssueMatchesForJQL.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssueMatchesForJQL' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssueMatchesForJQL> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssueMatchesForJQL.class));

       return (TypeAdapter<T>) new TypeAdapter<IssueMatchesForJQL>() {
           @Override
           public void write(JsonWriter out, IssueMatchesForJQL value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IssueMatchesForJQL read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IssueMatchesForJQL given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IssueMatchesForJQL
  * @throws IOException if the JSON string is invalid with respect to IssueMatchesForJQL
  */
  public static IssueMatchesForJQL fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssueMatchesForJQL.class);
  }

 /**
  * Convert an instance of IssueMatchesForJQL to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

