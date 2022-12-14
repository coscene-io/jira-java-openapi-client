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
 * Details about the configuration of Jira.
 */
@ApiModel(description = "Details about the configuration of Jira.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class ModelConfiguration {
  public static final String SERIALIZED_NAME_VOTING_ENABLED = "votingEnabled";
  @SerializedName(SERIALIZED_NAME_VOTING_ENABLED)
  private Boolean votingEnabled;

  public static final String SERIALIZED_NAME_WATCHING_ENABLED = "watchingEnabled";
  @SerializedName(SERIALIZED_NAME_WATCHING_ENABLED)
  private Boolean watchingEnabled;

  public static final String SERIALIZED_NAME_UNASSIGNED_ISSUES_ALLOWED = "unassignedIssuesAllowed";
  @SerializedName(SERIALIZED_NAME_UNASSIGNED_ISSUES_ALLOWED)
  private Boolean unassignedIssuesAllowed;

  public static final String SERIALIZED_NAME_SUB_TASKS_ENABLED = "subTasksEnabled";
  @SerializedName(SERIALIZED_NAME_SUB_TASKS_ENABLED)
  private Boolean subTasksEnabled;

  public static final String SERIALIZED_NAME_ISSUE_LINKING_ENABLED = "issueLinkingEnabled";
  @SerializedName(SERIALIZED_NAME_ISSUE_LINKING_ENABLED)
  private Boolean issueLinkingEnabled;

  public static final String SERIALIZED_NAME_TIME_TRACKING_ENABLED = "timeTrackingEnabled";
  @SerializedName(SERIALIZED_NAME_TIME_TRACKING_ENABLED)
  private Boolean timeTrackingEnabled;

  public static final String SERIALIZED_NAME_ATTACHMENTS_ENABLED = "attachmentsEnabled";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS_ENABLED)
  private Boolean attachmentsEnabled;

  public static final String SERIALIZED_NAME_TIME_TRACKING_CONFIGURATION = "timeTrackingConfiguration";
  @SerializedName(SERIALIZED_NAME_TIME_TRACKING_CONFIGURATION)
  private ConfigurationTimeTrackingConfiguration timeTrackingConfiguration;

  public ModelConfiguration() {
  }

  
  public ModelConfiguration(
     Boolean votingEnabled, 
     Boolean watchingEnabled, 
     Boolean unassignedIssuesAllowed, 
     Boolean subTasksEnabled, 
     Boolean issueLinkingEnabled, 
     Boolean timeTrackingEnabled, 
     Boolean attachmentsEnabled
  ) {
    this();
    this.votingEnabled = votingEnabled;
    this.watchingEnabled = watchingEnabled;
    this.unassignedIssuesAllowed = unassignedIssuesAllowed;
    this.subTasksEnabled = subTasksEnabled;
    this.issueLinkingEnabled = issueLinkingEnabled;
    this.timeTrackingEnabled = timeTrackingEnabled;
    this.attachmentsEnabled = attachmentsEnabled;
  }

   /**
   * Whether the ability for users to vote on issues is enabled. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.
   * @return votingEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the ability for users to vote on issues is enabled. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.")

  public Boolean getVotingEnabled() {
    return votingEnabled;
  }




   /**
   * Whether the ability for users to watch issues is enabled. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.
   * @return watchingEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the ability for users to watch issues is enabled. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.")

  public Boolean getWatchingEnabled() {
    return watchingEnabled;
  }




   /**
   * Whether the ability to create unassigned issues is enabled. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.
   * @return unassignedIssuesAllowed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the ability to create unassigned issues is enabled. See [Configuring Jira application options](https://confluence.atlassian.com/x/uYXKM) for details.")

  public Boolean getUnassignedIssuesAllowed() {
    return unassignedIssuesAllowed;
  }




   /**
   * Whether the ability to create subtasks for issues is enabled.
   * @return subTasksEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the ability to create subtasks for issues is enabled.")

  public Boolean getSubTasksEnabled() {
    return subTasksEnabled;
  }




   /**
   * Whether the ability to link issues is enabled.
   * @return issueLinkingEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the ability to link issues is enabled.")

  public Boolean getIssueLinkingEnabled() {
    return issueLinkingEnabled;
  }




   /**
   * Whether the ability to track time is enabled. This property is deprecated.
   * @return timeTrackingEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the ability to track time is enabled. This property is deprecated.")

  public Boolean getTimeTrackingEnabled() {
    return timeTrackingEnabled;
  }




   /**
   * Whether the ability to add attachments to issues is enabled.
   * @return attachmentsEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the ability to add attachments to issues is enabled.")

  public Boolean getAttachmentsEnabled() {
    return attachmentsEnabled;
  }




  public ModelConfiguration timeTrackingConfiguration(ConfigurationTimeTrackingConfiguration timeTrackingConfiguration) {
    
    this.timeTrackingConfiguration = timeTrackingConfiguration;
    return this;
  }

   /**
   * Get timeTrackingConfiguration
   * @return timeTrackingConfiguration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConfigurationTimeTrackingConfiguration getTimeTrackingConfiguration() {
    return timeTrackingConfiguration;
  }


  public void setTimeTrackingConfiguration(ConfigurationTimeTrackingConfiguration timeTrackingConfiguration) {
    this.timeTrackingConfiguration = timeTrackingConfiguration;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelConfiguration _configuration = (ModelConfiguration) o;
    return Objects.equals(this.votingEnabled, _configuration.votingEnabled) &&
        Objects.equals(this.watchingEnabled, _configuration.watchingEnabled) &&
        Objects.equals(this.unassignedIssuesAllowed, _configuration.unassignedIssuesAllowed) &&
        Objects.equals(this.subTasksEnabled, _configuration.subTasksEnabled) &&
        Objects.equals(this.issueLinkingEnabled, _configuration.issueLinkingEnabled) &&
        Objects.equals(this.timeTrackingEnabled, _configuration.timeTrackingEnabled) &&
        Objects.equals(this.attachmentsEnabled, _configuration.attachmentsEnabled) &&
        Objects.equals(this.timeTrackingConfiguration, _configuration.timeTrackingConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(votingEnabled, watchingEnabled, unassignedIssuesAllowed, subTasksEnabled, issueLinkingEnabled, timeTrackingEnabled, attachmentsEnabled, timeTrackingConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelConfiguration {\n");
    sb.append("    votingEnabled: ").append(toIndentedString(votingEnabled)).append("\n");
    sb.append("    watchingEnabled: ").append(toIndentedString(watchingEnabled)).append("\n");
    sb.append("    unassignedIssuesAllowed: ").append(toIndentedString(unassignedIssuesAllowed)).append("\n");
    sb.append("    subTasksEnabled: ").append(toIndentedString(subTasksEnabled)).append("\n");
    sb.append("    issueLinkingEnabled: ").append(toIndentedString(issueLinkingEnabled)).append("\n");
    sb.append("    timeTrackingEnabled: ").append(toIndentedString(timeTrackingEnabled)).append("\n");
    sb.append("    attachmentsEnabled: ").append(toIndentedString(attachmentsEnabled)).append("\n");
    sb.append("    timeTrackingConfiguration: ").append(toIndentedString(timeTrackingConfiguration)).append("\n");
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
    openapiFields.add("votingEnabled");
    openapiFields.add("watchingEnabled");
    openapiFields.add("unassignedIssuesAllowed");
    openapiFields.add("subTasksEnabled");
    openapiFields.add("issueLinkingEnabled");
    openapiFields.add("timeTrackingEnabled");
    openapiFields.add("attachmentsEnabled");
    openapiFields.add("timeTrackingConfiguration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelConfiguration
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ModelConfiguration.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelConfiguration is not found in the empty JSON string", ModelConfiguration.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelConfiguration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelConfiguration` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `timeTrackingConfiguration`
      if (jsonObj.get("timeTrackingConfiguration") != null && !jsonObj.get("timeTrackingConfiguration").isJsonNull()) {
        ConfigurationTimeTrackingConfiguration.validateJsonObject(jsonObj.getAsJsonObject("timeTrackingConfiguration"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelConfiguration>() {
           @Override
           public void write(JsonWriter out, ModelConfiguration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelConfiguration read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelConfiguration given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelConfiguration
  * @throws IOException if the JSON string is invalid with respect to ModelConfiguration
  */
  public static ModelConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelConfiguration.class);
  }

 /**
  * Convert an instance of ModelConfiguration to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

