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
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import io.coscene.jira.client.v2.JSON;

/**
 * The ID of an issue type scheme.
 */
@ApiModel(description = "The ID of an issue type scheme.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class IssueTypeSchemeID {
  public static final String SERIALIZED_NAME_ISSUE_TYPE_SCHEME_ID = "issueTypeSchemeId";
  @SerializedName(SERIALIZED_NAME_ISSUE_TYPE_SCHEME_ID)
  private String issueTypeSchemeId;

  public IssueTypeSchemeID() {
  }

  
  public IssueTypeSchemeID(
     String issueTypeSchemeId
  ) {
    this();
    this.issueTypeSchemeId = issueTypeSchemeId;
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





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeSchemeID issueTypeSchemeID = (IssueTypeSchemeID) o;
    return Objects.equals(this.issueTypeSchemeId, issueTypeSchemeID.issueTypeSchemeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueTypeSchemeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeSchemeID {\n");
    sb.append("    issueTypeSchemeId: ").append(toIndentedString(issueTypeSchemeId)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("issueTypeSchemeId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IssueTypeSchemeID
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IssueTypeSchemeID.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssueTypeSchemeID is not found in the empty JSON string", IssueTypeSchemeID.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IssueTypeSchemeID.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IssueTypeSchemeID` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IssueTypeSchemeID.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("issueTypeSchemeId") != null && !jsonObj.get("issueTypeSchemeId").isJsonNull()) && !jsonObj.get("issueTypeSchemeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issueTypeSchemeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issueTypeSchemeId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssueTypeSchemeID.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssueTypeSchemeID' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssueTypeSchemeID> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssueTypeSchemeID.class));

       return (TypeAdapter<T>) new TypeAdapter<IssueTypeSchemeID>() {
           @Override
           public void write(JsonWriter out, IssueTypeSchemeID value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IssueTypeSchemeID read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IssueTypeSchemeID given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IssueTypeSchemeID
  * @throws IOException if the JSON string is invalid with respect to IssueTypeSchemeID
  */
  public static IssueTypeSchemeID fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssueTypeSchemeID.class);
  }

 /**
  * Convert an instance of IssueTypeSchemeID to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

