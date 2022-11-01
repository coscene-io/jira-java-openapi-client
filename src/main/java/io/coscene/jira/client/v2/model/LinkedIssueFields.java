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
 * The fields associated with the issue.
 */
@ApiModel(description = "The fields associated with the issue.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class LinkedIssueFields {
  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private String summary;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private FieldsStatus status;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private FieldsPriority priority;

  public static final String SERIALIZED_NAME_ASSIGNEE = "assignee";
  @SerializedName(SERIALIZED_NAME_ASSIGNEE)
  private FieldsAssignee assignee;

  public static final String SERIALIZED_NAME_TIMETRACKING = "timetracking";
  @SerializedName(SERIALIZED_NAME_TIMETRACKING)
  private FieldsTimetracking timetracking;

  public static final String SERIALIZED_NAME_ISSUETYPE = "issuetype";
  @SerializedName(SERIALIZED_NAME_ISSUETYPE)
  private IssueTypeDetails issuetype;

  public static final String SERIALIZED_NAME_ISSUE_TYPE = "issueType";
  @SerializedName(SERIALIZED_NAME_ISSUE_TYPE)
  private FieldsIssueType issueType;

  public LinkedIssueFields() {
  }

  
  public LinkedIssueFields(
     String summary
  ) {
    this();
    this.summary = summary;
  }

   /**
   * The summary description of the linked issue.
   * @return summary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The summary description of the linked issue.")

  public String getSummary() {
    return summary;
  }




  public LinkedIssueFields status(FieldsStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FieldsStatus getStatus() {
    return status;
  }


  public void setStatus(FieldsStatus status) {
    this.status = status;
  }


  public LinkedIssueFields priority(FieldsPriority priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FieldsPriority getPriority() {
    return priority;
  }


  public void setPriority(FieldsPriority priority) {
    this.priority = priority;
  }


  public LinkedIssueFields assignee(FieldsAssignee assignee) {
    
    this.assignee = assignee;
    return this;
  }

   /**
   * Get assignee
   * @return assignee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FieldsAssignee getAssignee() {
    return assignee;
  }


  public void setAssignee(FieldsAssignee assignee) {
    this.assignee = assignee;
  }


  public LinkedIssueFields timetracking(FieldsTimetracking timetracking) {
    
    this.timetracking = timetracking;
    return this;
  }

   /**
   * Get timetracking
   * @return timetracking
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FieldsTimetracking getTimetracking() {
    return timetracking;
  }


  public void setTimetracking(FieldsTimetracking timetracking) {
    this.timetracking = timetracking;
  }


  public LinkedIssueFields issuetype(IssueTypeDetails issuetype) {
    
    this.issuetype = issuetype;
    return this;
  }

   /**
   * Get issuetype
   * @return issuetype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IssueTypeDetails getIssuetype() {
    return issuetype;
  }


  public void setIssuetype(IssueTypeDetails issuetype) {
    this.issuetype = issuetype;
  }


  public LinkedIssueFields issueType(FieldsIssueType issueType) {
    
    this.issueType = issueType;
    return this;
  }

   /**
   * Get issueType
   * @return issueType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FieldsIssueType getIssueType() {
    return issueType;
  }


  public void setIssueType(FieldsIssueType issueType) {
    this.issueType = issueType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkedIssueFields linkedIssueFields = (LinkedIssueFields) o;
    return Objects.equals(this.summary, linkedIssueFields.summary) &&
        Objects.equals(this.status, linkedIssueFields.status) &&
        Objects.equals(this.priority, linkedIssueFields.priority) &&
        Objects.equals(this.assignee, linkedIssueFields.assignee) &&
        Objects.equals(this.timetracking, linkedIssueFields.timetracking) &&
        Objects.equals(this.issuetype, linkedIssueFields.issuetype) &&
        Objects.equals(this.issueType, linkedIssueFields.issueType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summary, status, priority, assignee, timetracking, issuetype, issueType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedIssueFields {\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    timetracking: ").append(toIndentedString(timetracking)).append("\n");
    sb.append("    issuetype: ").append(toIndentedString(issuetype)).append("\n");
    sb.append("    issueType: ").append(toIndentedString(issueType)).append("\n");
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
    openapiFields.add("summary");
    openapiFields.add("status");
    openapiFields.add("priority");
    openapiFields.add("assignee");
    openapiFields.add("timetracking");
    openapiFields.add("issuetype");
    openapiFields.add("issueType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LinkedIssueFields
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (LinkedIssueFields.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in LinkedIssueFields is not found in the empty JSON string", LinkedIssueFields.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LinkedIssueFields.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LinkedIssueFields` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("summary") != null && !jsonObj.get("summary").isJsonNull()) && !jsonObj.get("summary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `summary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("summary").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        FieldsStatus.validateJsonObject(jsonObj.getAsJsonObject("status"));
      }
      // validate the optional field `priority`
      if (jsonObj.get("priority") != null && !jsonObj.get("priority").isJsonNull()) {
        FieldsPriority.validateJsonObject(jsonObj.getAsJsonObject("priority"));
      }
      // validate the optional field `assignee`
      if (jsonObj.get("assignee") != null && !jsonObj.get("assignee").isJsonNull()) {
        FieldsAssignee.validateJsonObject(jsonObj.getAsJsonObject("assignee"));
      }
      // validate the optional field `timetracking`
      if (jsonObj.get("timetracking") != null && !jsonObj.get("timetracking").isJsonNull()) {
        FieldsTimetracking.validateJsonObject(jsonObj.getAsJsonObject("timetracking"));
      }
      // validate the optional field `issuetype`
      if (jsonObj.get("issuetype") != null && !jsonObj.get("issuetype").isJsonNull()) {
        IssueTypeDetails.validateJsonObject(jsonObj.getAsJsonObject("issuetype"));
      }
      // validate the optional field `issueType`
      if (jsonObj.get("issueType") != null && !jsonObj.get("issueType").isJsonNull()) {
        FieldsIssueType.validateJsonObject(jsonObj.getAsJsonObject("issueType"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LinkedIssueFields.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LinkedIssueFields' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LinkedIssueFields> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LinkedIssueFields.class));

       return (TypeAdapter<T>) new TypeAdapter<LinkedIssueFields>() {
           @Override
           public void write(JsonWriter out, LinkedIssueFields value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LinkedIssueFields read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LinkedIssueFields given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LinkedIssueFields
  * @throws IOException if the JSON string is invalid with respect to LinkedIssueFields
  */
  public static LinkedIssueFields fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LinkedIssueFields.class);
  }

 /**
  * Convert an instance of LinkedIssueFields to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

