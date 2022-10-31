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
 * The list of issue type IDs to be removed from the field configuration scheme.
 */
@ApiModel(description = "The list of issue type IDs to be removed from the field configuration scheme.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class IssueTypeIdsToRemove {
  public static final String SERIALIZED_NAME_ISSUE_TYPE_IDS = "issueTypeIds";
  @SerializedName(SERIALIZED_NAME_ISSUE_TYPE_IDS)
  private List<String> issueTypeIds = new ArrayList<>();

  public IssueTypeIdsToRemove() {
  }

  public IssueTypeIdsToRemove issueTypeIds(List<String> issueTypeIds) {
    
    this.issueTypeIds = issueTypeIds;
    return this;
  }

  public IssueTypeIdsToRemove addIssueTypeIdsItem(String issueTypeIdsItem) {
    this.issueTypeIds.add(issueTypeIdsItem);
    return this;
  }

   /**
   * The list of issue type IDs. Must contain unique values not longer than 255 characters and not be empty. Maximum of 100 IDs.
   * @return issueTypeIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The list of issue type IDs. Must contain unique values not longer than 255 characters and not be empty. Maximum of 100 IDs.")

  public List<String> getIssueTypeIds() {
    return issueTypeIds;
  }


  public void setIssueTypeIds(List<String> issueTypeIds) {
    this.issueTypeIds = issueTypeIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeIdsToRemove issueTypeIdsToRemove = (IssueTypeIdsToRemove) o;
    return Objects.equals(this.issueTypeIds, issueTypeIdsToRemove.issueTypeIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueTypeIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeIdsToRemove {\n");
    sb.append("    issueTypeIds: ").append(toIndentedString(issueTypeIds)).append("\n");
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
    openapiFields.add("issueTypeIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("issueTypeIds");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IssueTypeIdsToRemove
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IssueTypeIdsToRemove.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssueTypeIdsToRemove is not found in the empty JSON string", IssueTypeIdsToRemove.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IssueTypeIdsToRemove.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IssueTypeIdsToRemove` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IssueTypeIdsToRemove.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("issueTypeIds") != null && !jsonObj.get("issueTypeIds").isJsonNull()) && !jsonObj.get("issueTypeIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `issueTypeIds` to be an array in the JSON string but got `%s`", jsonObj.get("issueTypeIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssueTypeIdsToRemove.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssueTypeIdsToRemove' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssueTypeIdsToRemove> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssueTypeIdsToRemove.class));

       return (TypeAdapter<T>) new TypeAdapter<IssueTypeIdsToRemove>() {
           @Override
           public void write(JsonWriter out, IssueTypeIdsToRemove value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IssueTypeIdsToRemove read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IssueTypeIdsToRemove given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IssueTypeIdsToRemove
  * @throws IOException if the JSON string is invalid with respect to IssueTypeIdsToRemove
  */
  public static IssueTypeIdsToRemove fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssueTypeIdsToRemove.class);
  }

 /**
  * Convert an instance of IssueTypeIdsToRemove to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

