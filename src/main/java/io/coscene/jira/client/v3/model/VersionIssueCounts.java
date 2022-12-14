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
 * Various counts of issues within a version.
 */
@ApiModel(description = "Various counts of issues within a version.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class VersionIssueCounts {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private URI self;

  public static final String SERIALIZED_NAME_ISSUES_FIXED_COUNT = "issuesFixedCount";
  @SerializedName(SERIALIZED_NAME_ISSUES_FIXED_COUNT)
  private Long issuesFixedCount;

  public static final String SERIALIZED_NAME_ISSUES_AFFECTED_COUNT = "issuesAffectedCount";
  @SerializedName(SERIALIZED_NAME_ISSUES_AFFECTED_COUNT)
  private Long issuesAffectedCount;

  public static final String SERIALIZED_NAME_ISSUE_COUNT_WITH_CUSTOM_FIELDS_SHOWING_VERSION = "issueCountWithCustomFieldsShowingVersion";
  @SerializedName(SERIALIZED_NAME_ISSUE_COUNT_WITH_CUSTOM_FIELDS_SHOWING_VERSION)
  private Long issueCountWithCustomFieldsShowingVersion;

  public static final String SERIALIZED_NAME_CUSTOM_FIELD_USAGE = "customFieldUsage";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELD_USAGE)
  private List<VersionUsageInCustomField> customFieldUsage = null;

  public VersionIssueCounts() {
  }

  
  public VersionIssueCounts(
     URI self, 
     Long issuesFixedCount, 
     Long issuesAffectedCount, 
     Long issueCountWithCustomFieldsShowingVersion, 
     List<VersionUsageInCustomField> customFieldUsage
  ) {
    this();
    this.self = self;
    this.issuesFixedCount = issuesFixedCount;
    this.issuesAffectedCount = issuesAffectedCount;
    this.issueCountWithCustomFieldsShowingVersion = issueCountWithCustomFieldsShowingVersion;
    this.customFieldUsage = customFieldUsage;
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
   * Count of issues where the &#x60;fixVersion&#x60; is set to the version.
   * @return issuesFixedCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Count of issues where the `fixVersion` is set to the version.")

  public Long getIssuesFixedCount() {
    return issuesFixedCount;
  }




   /**
   * Count of issues where the &#x60;affectedVersion&#x60; is set to the version.
   * @return issuesAffectedCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Count of issues where the `affectedVersion` is set to the version.")

  public Long getIssuesAffectedCount() {
    return issuesAffectedCount;
  }




   /**
   * Count of issues where a version custom field is set to the version.
   * @return issueCountWithCustomFieldsShowingVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Count of issues where a version custom field is set to the version.")

  public Long getIssueCountWithCustomFieldsShowingVersion() {
    return issueCountWithCustomFieldsShowingVersion;
  }




   /**
   * List of custom fields using the version.
   * @return customFieldUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of custom fields using the version.")

  public List<VersionUsageInCustomField> getCustomFieldUsage() {
    return customFieldUsage;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionIssueCounts versionIssueCounts = (VersionIssueCounts) o;
    return Objects.equals(this.self, versionIssueCounts.self) &&
        Objects.equals(this.issuesFixedCount, versionIssueCounts.issuesFixedCount) &&
        Objects.equals(this.issuesAffectedCount, versionIssueCounts.issuesAffectedCount) &&
        Objects.equals(this.issueCountWithCustomFieldsShowingVersion, versionIssueCounts.issueCountWithCustomFieldsShowingVersion) &&
        Objects.equals(this.customFieldUsage, versionIssueCounts.customFieldUsage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, issuesFixedCount, issuesAffectedCount, issueCountWithCustomFieldsShowingVersion, customFieldUsage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionIssueCounts {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    issuesFixedCount: ").append(toIndentedString(issuesFixedCount)).append("\n");
    sb.append("    issuesAffectedCount: ").append(toIndentedString(issuesAffectedCount)).append("\n");
    sb.append("    issueCountWithCustomFieldsShowingVersion: ").append(toIndentedString(issueCountWithCustomFieldsShowingVersion)).append("\n");
    sb.append("    customFieldUsage: ").append(toIndentedString(customFieldUsage)).append("\n");
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
    openapiFields.add("issuesFixedCount");
    openapiFields.add("issuesAffectedCount");
    openapiFields.add("issueCountWithCustomFieldsShowingVersion");
    openapiFields.add("customFieldUsage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VersionIssueCounts
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VersionIssueCounts.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VersionIssueCounts is not found in the empty JSON string", VersionIssueCounts.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VersionIssueCounts.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VersionIssueCounts` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) && !jsonObj.get("self").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self").toString()));
      }
      if (jsonObj.get("customFieldUsage") != null && !jsonObj.get("customFieldUsage").isJsonNull()) {
        JsonArray jsonArraycustomFieldUsage = jsonObj.getAsJsonArray("customFieldUsage");
        if (jsonArraycustomFieldUsage != null) {
          // ensure the json data is an array
          if (!jsonObj.get("customFieldUsage").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `customFieldUsage` to be an array in the JSON string but got `%s`", jsonObj.get("customFieldUsage").toString()));
          }

          // validate the optional field `customFieldUsage` (array)
          for (int i = 0; i < jsonArraycustomFieldUsage.size(); i++) {
            VersionUsageInCustomField.validateJsonObject(jsonArraycustomFieldUsage.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VersionIssueCounts.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VersionIssueCounts' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VersionIssueCounts> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VersionIssueCounts.class));

       return (TypeAdapter<T>) new TypeAdapter<VersionIssueCounts>() {
           @Override
           public void write(JsonWriter out, VersionIssueCounts value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VersionIssueCounts read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VersionIssueCounts given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VersionIssueCounts
  * @throws IOException if the JSON string is invalid with respect to VersionIssueCounts
  */
  public static VersionIssueCounts fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VersionIssueCounts.class);
  }

 /**
  * Convert an instance of VersionIssueCounts to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

