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
 * Details of how to filter and list search auto complete information.
 */
@ApiModel(description = "Details of how to filter and list search auto complete information.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class SearchAutoCompleteFilter {
  public static final String SERIALIZED_NAME_PROJECT_IDS = "projectIds";
  @SerializedName(SERIALIZED_NAME_PROJECT_IDS)
  private List<Long> projectIds = null;

  public static final String SERIALIZED_NAME_INCLUDE_COLLAPSED_FIELDS = "includeCollapsedFields";
  @SerializedName(SERIALIZED_NAME_INCLUDE_COLLAPSED_FIELDS)
  private Boolean includeCollapsedFields = false;

  public SearchAutoCompleteFilter() {
  }

  public SearchAutoCompleteFilter projectIds(List<Long> projectIds) {
    
    this.projectIds = projectIds;
    return this;
  }

  public SearchAutoCompleteFilter addProjectIdsItem(Long projectIdsItem) {
    if (this.projectIds == null) {
      this.projectIds = new ArrayList<>();
    }
    this.projectIds.add(projectIdsItem);
    return this;
  }

   /**
   * List of project IDs used to filter the visible field details returned.
   * @return projectIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of project IDs used to filter the visible field details returned.")

  public List<Long> getProjectIds() {
    return projectIds;
  }


  public void setProjectIds(List<Long> projectIds) {
    this.projectIds = projectIds;
  }


  public SearchAutoCompleteFilter includeCollapsedFields(Boolean includeCollapsedFields) {
    
    this.includeCollapsedFields = includeCollapsedFields;
    return this;
  }

   /**
   * Include collapsed fields for fields that have non-unique names.
   * @return includeCollapsedFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Include collapsed fields for fields that have non-unique names.")

  public Boolean getIncludeCollapsedFields() {
    return includeCollapsedFields;
  }


  public void setIncludeCollapsedFields(Boolean includeCollapsedFields) {
    this.includeCollapsedFields = includeCollapsedFields;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchAutoCompleteFilter searchAutoCompleteFilter = (SearchAutoCompleteFilter) o;
    return Objects.equals(this.projectIds, searchAutoCompleteFilter.projectIds) &&
        Objects.equals(this.includeCollapsedFields, searchAutoCompleteFilter.includeCollapsedFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectIds, includeCollapsedFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchAutoCompleteFilter {\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
    sb.append("    includeCollapsedFields: ").append(toIndentedString(includeCollapsedFields)).append("\n");
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
    openapiFields.add("projectIds");
    openapiFields.add("includeCollapsedFields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchAutoCompleteFilter
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SearchAutoCompleteFilter.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchAutoCompleteFilter is not found in the empty JSON string", SearchAutoCompleteFilter.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SearchAutoCompleteFilter.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchAutoCompleteFilter` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
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
       if (!SearchAutoCompleteFilter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchAutoCompleteFilter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchAutoCompleteFilter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchAutoCompleteFilter.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchAutoCompleteFilter>() {
           @Override
           public void write(JsonWriter out, SearchAutoCompleteFilter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchAutoCompleteFilter read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchAutoCompleteFilter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchAutoCompleteFilter
  * @throws IOException if the JSON string is invalid with respect to SearchAutoCompleteFilter
  */
  public static SearchAutoCompleteFilter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchAutoCompleteFilter.class);
  }

 /**
  * Convert an instance of SearchAutoCompleteFilter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

