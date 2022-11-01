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
 * Mapping of an issue type to a context.
 */
@ApiModel(description = "Mapping of an issue type to a context.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class IssueTypeToContextMapping {
  public static final String SERIALIZED_NAME_CONTEXT_ID = "contextId";
  @SerializedName(SERIALIZED_NAME_CONTEXT_ID)
  private String contextId;

  public static final String SERIALIZED_NAME_ISSUE_TYPE_ID = "issueTypeId";
  @SerializedName(SERIALIZED_NAME_ISSUE_TYPE_ID)
  private String issueTypeId;

  public static final String SERIALIZED_NAME_IS_ANY_ISSUE_TYPE = "isAnyIssueType";
  @SerializedName(SERIALIZED_NAME_IS_ANY_ISSUE_TYPE)
  private Boolean isAnyIssueType;

  public IssueTypeToContextMapping() {
  }

  public IssueTypeToContextMapping contextId(String contextId) {
    
    this.contextId = contextId;
    return this;
  }

   /**
   * The ID of the context.
   * @return contextId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the context.")

  public String getContextId() {
    return contextId;
  }


  public void setContextId(String contextId) {
    this.contextId = contextId;
  }


  public IssueTypeToContextMapping issueTypeId(String issueTypeId) {
    
    this.issueTypeId = issueTypeId;
    return this;
  }

   /**
   * The ID of the issue type.
   * @return issueTypeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the issue type.")

  public String getIssueTypeId() {
    return issueTypeId;
  }


  public void setIssueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
  }


  public IssueTypeToContextMapping isAnyIssueType(Boolean isAnyIssueType) {
    
    this.isAnyIssueType = isAnyIssueType;
    return this;
  }

   /**
   * Whether the context is mapped to any issue type.
   * @return isAnyIssueType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the context is mapped to any issue type.")

  public Boolean getIsAnyIssueType() {
    return isAnyIssueType;
  }


  public void setIsAnyIssueType(Boolean isAnyIssueType) {
    this.isAnyIssueType = isAnyIssueType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeToContextMapping issueTypeToContextMapping = (IssueTypeToContextMapping) o;
    return Objects.equals(this.contextId, issueTypeToContextMapping.contextId) &&
        Objects.equals(this.issueTypeId, issueTypeToContextMapping.issueTypeId) &&
        Objects.equals(this.isAnyIssueType, issueTypeToContextMapping.isAnyIssueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextId, issueTypeId, isAnyIssueType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeToContextMapping {\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    issueTypeId: ").append(toIndentedString(issueTypeId)).append("\n");
    sb.append("    isAnyIssueType: ").append(toIndentedString(isAnyIssueType)).append("\n");
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
    openapiFields.add("contextId");
    openapiFields.add("issueTypeId");
    openapiFields.add("isAnyIssueType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("contextId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IssueTypeToContextMapping
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IssueTypeToContextMapping.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssueTypeToContextMapping is not found in the empty JSON string", IssueTypeToContextMapping.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IssueTypeToContextMapping.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IssueTypeToContextMapping` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IssueTypeToContextMapping.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("contextId") != null && !jsonObj.get("contextId").isJsonNull()) && !jsonObj.get("contextId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contextId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contextId").toString()));
      }
      if ((jsonObj.get("issueTypeId") != null && !jsonObj.get("issueTypeId").isJsonNull()) && !jsonObj.get("issueTypeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issueTypeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issueTypeId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssueTypeToContextMapping.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssueTypeToContextMapping' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssueTypeToContextMapping> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssueTypeToContextMapping.class));

       return (TypeAdapter<T>) new TypeAdapter<IssueTypeToContextMapping>() {
           @Override
           public void write(JsonWriter out, IssueTypeToContextMapping value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IssueTypeToContextMapping read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IssueTypeToContextMapping given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IssueTypeToContextMapping
  * @throws IOException if the JSON string is invalid with respect to IssueTypeToContextMapping
  */
  public static IssueTypeToContextMapping fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssueTypeToContextMapping.class);
  }

 /**
  * Convert an instance of IssueTypeToContextMapping to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

