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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.IssueTypeSchemeProjectsIssueTypeScheme;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * Issue type scheme with a list of the projects that use it.
 */
@ApiModel(description = "Issue type scheme with a list of the projects that use it.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class IssueTypeSchemeProjects {
  public static final String SERIALIZED_NAME_ISSUE_TYPE_SCHEME = "issueTypeScheme";
  @SerializedName(SERIALIZED_NAME_ISSUE_TYPE_SCHEME)
  private IssueTypeSchemeProjectsIssueTypeScheme issueTypeScheme;

  public static final String SERIALIZED_NAME_PROJECT_IDS = "projectIds";
  @SerializedName(SERIALIZED_NAME_PROJECT_IDS)
  private List<String> projectIds = new ArrayList<>();

  public IssueTypeSchemeProjects() {
  }

  public IssueTypeSchemeProjects issueTypeScheme(IssueTypeSchemeProjectsIssueTypeScheme issueTypeScheme) {
    
    this.issueTypeScheme = issueTypeScheme;
    return this;
  }

   /**
   * Get issueTypeScheme
   * @return issueTypeScheme
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public IssueTypeSchemeProjectsIssueTypeScheme getIssueTypeScheme() {
    return issueTypeScheme;
  }


  public void setIssueTypeScheme(IssueTypeSchemeProjectsIssueTypeScheme issueTypeScheme) {
    this.issueTypeScheme = issueTypeScheme;
  }


  public IssueTypeSchemeProjects projectIds(List<String> projectIds) {
    
    this.projectIds = projectIds;
    return this;
  }

  public IssueTypeSchemeProjects addProjectIdsItem(String projectIdsItem) {
    this.projectIds.add(projectIdsItem);
    return this;
  }

   /**
   * The IDs of the projects using the issue type scheme.
   * @return projectIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The IDs of the projects using the issue type scheme.")

  public List<String> getProjectIds() {
    return projectIds;
  }


  public void setProjectIds(List<String> projectIds) {
    this.projectIds = projectIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeSchemeProjects issueTypeSchemeProjects = (IssueTypeSchemeProjects) o;
    return Objects.equals(this.issueTypeScheme, issueTypeSchemeProjects.issueTypeScheme) &&
        Objects.equals(this.projectIds, issueTypeSchemeProjects.projectIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueTypeScheme, projectIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeSchemeProjects {\n");
    sb.append("    issueTypeScheme: ").append(toIndentedString(issueTypeScheme)).append("\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
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
    openapiFields.add("issueTypeScheme");
    openapiFields.add("projectIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("issueTypeScheme");
    openapiRequiredFields.add("projectIds");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IssueTypeSchemeProjects
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IssueTypeSchemeProjects.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssueTypeSchemeProjects is not found in the empty JSON string", IssueTypeSchemeProjects.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IssueTypeSchemeProjects.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IssueTypeSchemeProjects` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IssueTypeSchemeProjects.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `issueTypeScheme`
      if (jsonObj.get("issueTypeScheme") != null && !jsonObj.get("issueTypeScheme").isJsonNull()) {
        IssueTypeSchemeProjectsIssueTypeScheme.validateJsonObject(jsonObj.getAsJsonObject("issueTypeScheme"));
      }
      // ensure the json data is an array
      if ((jsonObj.get("projectIds") != null && !jsonObj.get("projectIds").isJsonNull()) && !jsonObj.get("projectIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectIds` to be an array in the JSON string but got `%s`", jsonObj.get("projectIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssueTypeSchemeProjects.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssueTypeSchemeProjects' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssueTypeSchemeProjects> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssueTypeSchemeProjects.class));

       return (TypeAdapter<T>) new TypeAdapter<IssueTypeSchemeProjects>() {
           @Override
           public void write(JsonWriter out, IssueTypeSchemeProjects value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IssueTypeSchemeProjects read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IssueTypeSchemeProjects given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IssueTypeSchemeProjects
  * @throws IOException if the JSON string is invalid with respect to IssueTypeSchemeProjects
  */
  public static IssueTypeSchemeProjects fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssueTypeSchemeProjects.class);
  }

 /**
  * Convert an instance of IssueTypeSchemeProjects to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

