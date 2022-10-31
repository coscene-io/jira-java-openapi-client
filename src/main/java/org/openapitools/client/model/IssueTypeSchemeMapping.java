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
 * Issue type scheme item.
 */
@ApiModel(description = "Issue type scheme item.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class IssueTypeSchemeMapping {
  public static final String SERIALIZED_NAME_ISSUE_TYPE_SCHEME_ID = "issueTypeSchemeId";
  @SerializedName(SERIALIZED_NAME_ISSUE_TYPE_SCHEME_ID)
  private String issueTypeSchemeId;

  public static final String SERIALIZED_NAME_ISSUE_TYPE_ID = "issueTypeId";
  @SerializedName(SERIALIZED_NAME_ISSUE_TYPE_ID)
  private String issueTypeId;

  public IssueTypeSchemeMapping() {
  }

  public IssueTypeSchemeMapping issueTypeSchemeId(String issueTypeSchemeId) {
    
    this.issueTypeSchemeId = issueTypeSchemeId;
    return this;
  }

   /**
   * The ID of the issue type scheme.
   * @return issueTypeSchemeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the issue type scheme.")

  public String getIssueTypeSchemeId() {
    return issueTypeSchemeId;
  }


  public void setIssueTypeSchemeId(String issueTypeSchemeId) {
    this.issueTypeSchemeId = issueTypeSchemeId;
  }


  public IssueTypeSchemeMapping issueTypeId(String issueTypeId) {
    
    this.issueTypeId = issueTypeId;
    return this;
  }

   /**
   * The ID of the issue type.
   * @return issueTypeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the issue type.")

  public String getIssueTypeId() {
    return issueTypeId;
  }


  public void setIssueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeSchemeMapping issueTypeSchemeMapping = (IssueTypeSchemeMapping) o;
    return Objects.equals(this.issueTypeSchemeId, issueTypeSchemeMapping.issueTypeSchemeId) &&
        Objects.equals(this.issueTypeId, issueTypeSchemeMapping.issueTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueTypeSchemeId, issueTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeSchemeMapping {\n");
    sb.append("    issueTypeSchemeId: ").append(toIndentedString(issueTypeSchemeId)).append("\n");
    sb.append("    issueTypeId: ").append(toIndentedString(issueTypeId)).append("\n");
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
    openapiFields.add("issueTypeSchemeId");
    openapiFields.add("issueTypeId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("issueTypeSchemeId");
    openapiRequiredFields.add("issueTypeId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IssueTypeSchemeMapping
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IssueTypeSchemeMapping.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssueTypeSchemeMapping is not found in the empty JSON string", IssueTypeSchemeMapping.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IssueTypeSchemeMapping.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IssueTypeSchemeMapping` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IssueTypeSchemeMapping.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("issueTypeSchemeId") != null && !jsonObj.get("issueTypeSchemeId").isJsonNull()) && !jsonObj.get("issueTypeSchemeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issueTypeSchemeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issueTypeSchemeId").toString()));
      }
      if ((jsonObj.get("issueTypeId") != null && !jsonObj.get("issueTypeId").isJsonNull()) && !jsonObj.get("issueTypeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issueTypeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issueTypeId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssueTypeSchemeMapping.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssueTypeSchemeMapping' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssueTypeSchemeMapping> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssueTypeSchemeMapping.class));

       return (TypeAdapter<T>) new TypeAdapter<IssueTypeSchemeMapping>() {
           @Override
           public void write(JsonWriter out, IssueTypeSchemeMapping value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IssueTypeSchemeMapping read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IssueTypeSchemeMapping given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IssueTypeSchemeMapping
  * @throws IOException if the JSON string is invalid with respect to IssueTypeSchemeMapping
  */
  public static IssueTypeSchemeMapping fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssueTypeSchemeMapping.class);
  }

 /**
  * Convert an instance of IssueTypeSchemeMapping to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

