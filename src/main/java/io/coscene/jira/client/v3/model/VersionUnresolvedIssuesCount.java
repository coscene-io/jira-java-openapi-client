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
import java.net.URI;

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
 * Count of a version&#39;s unresolved issues.
 */
@ApiModel(description = "Count of a version's unresolved issues.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class VersionUnresolvedIssuesCount {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private URI self;

  public static final String SERIALIZED_NAME_ISSUES_UNRESOLVED_COUNT = "issuesUnresolvedCount";
  @SerializedName(SERIALIZED_NAME_ISSUES_UNRESOLVED_COUNT)
  private Long issuesUnresolvedCount;

  public static final String SERIALIZED_NAME_ISSUES_COUNT = "issuesCount";
  @SerializedName(SERIALIZED_NAME_ISSUES_COUNT)
  private Long issuesCount;

  public VersionUnresolvedIssuesCount() {
  }

  
  public VersionUnresolvedIssuesCount(
     URI self, 
     Long issuesUnresolvedCount, 
     Long issuesCount
  ) {
    this();
    this.self = self;
    this.issuesUnresolvedCount = issuesUnresolvedCount;
    this.issuesCount = issuesCount;
  }

   /**
   * The URL of these count details.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of these count details.")

  public URI getSelf() {
    return self;
  }




   /**
   * Count of unresolved issues.
   * @return issuesUnresolvedCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Count of unresolved issues.")

  public Long getIssuesUnresolvedCount() {
    return issuesUnresolvedCount;
  }




   /**
   * Count of issues.
   * @return issuesCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Count of issues.")

  public Long getIssuesCount() {
    return issuesCount;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionUnresolvedIssuesCount versionUnresolvedIssuesCount = (VersionUnresolvedIssuesCount) o;
    return Objects.equals(this.self, versionUnresolvedIssuesCount.self) &&
        Objects.equals(this.issuesUnresolvedCount, versionUnresolvedIssuesCount.issuesUnresolvedCount) &&
        Objects.equals(this.issuesCount, versionUnresolvedIssuesCount.issuesCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, issuesUnresolvedCount, issuesCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionUnresolvedIssuesCount {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    issuesUnresolvedCount: ").append(toIndentedString(issuesUnresolvedCount)).append("\n");
    sb.append("    issuesCount: ").append(toIndentedString(issuesCount)).append("\n");
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
    openapiFields.add("self");
    openapiFields.add("issuesUnresolvedCount");
    openapiFields.add("issuesCount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VersionUnresolvedIssuesCount
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VersionUnresolvedIssuesCount.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VersionUnresolvedIssuesCount is not found in the empty JSON string", VersionUnresolvedIssuesCount.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VersionUnresolvedIssuesCount.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VersionUnresolvedIssuesCount` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) && !jsonObj.get("self").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VersionUnresolvedIssuesCount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VersionUnresolvedIssuesCount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VersionUnresolvedIssuesCount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VersionUnresolvedIssuesCount.class));

       return (TypeAdapter<T>) new TypeAdapter<VersionUnresolvedIssuesCount>() {
           @Override
           public void write(JsonWriter out, VersionUnresolvedIssuesCount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VersionUnresolvedIssuesCount read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VersionUnresolvedIssuesCount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VersionUnresolvedIssuesCount
  * @throws IOException if the JSON string is invalid with respect to VersionUnresolvedIssuesCount
  */
  public static VersionUnresolvedIssuesCount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VersionUnresolvedIssuesCount.class);
  }

 /**
  * Convert an instance of VersionUnresolvedIssuesCount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

