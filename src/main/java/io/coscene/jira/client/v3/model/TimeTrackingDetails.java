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
 * Time tracking details.
 */
@ApiModel(description = "Time tracking details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class TimeTrackingDetails {
  public static final String SERIALIZED_NAME_ORIGINAL_ESTIMATE = "originalEstimate";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_ESTIMATE)
  private String originalEstimate;

  public static final String SERIALIZED_NAME_REMAINING_ESTIMATE = "remainingEstimate";
  @SerializedName(SERIALIZED_NAME_REMAINING_ESTIMATE)
  private String remainingEstimate;

  public static final String SERIALIZED_NAME_TIME_SPENT = "timeSpent";
  @SerializedName(SERIALIZED_NAME_TIME_SPENT)
  private String timeSpent;

  public static final String SERIALIZED_NAME_ORIGINAL_ESTIMATE_SECONDS = "originalEstimateSeconds";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_ESTIMATE_SECONDS)
  private Long originalEstimateSeconds;

  public static final String SERIALIZED_NAME_REMAINING_ESTIMATE_SECONDS = "remainingEstimateSeconds";
  @SerializedName(SERIALIZED_NAME_REMAINING_ESTIMATE_SECONDS)
  private Long remainingEstimateSeconds;

  public static final String SERIALIZED_NAME_TIME_SPENT_SECONDS = "timeSpentSeconds";
  @SerializedName(SERIALIZED_NAME_TIME_SPENT_SECONDS)
  private Long timeSpentSeconds;

  public TimeTrackingDetails() {
  }

  
  public TimeTrackingDetails(
     String originalEstimate, 
     String remainingEstimate, 
     String timeSpent, 
     Long originalEstimateSeconds, 
     Long remainingEstimateSeconds, 
     Long timeSpentSeconds
  ) {
    this();
    this.originalEstimate = originalEstimate;
    this.remainingEstimate = remainingEstimate;
    this.timeSpent = timeSpent;
    this.originalEstimateSeconds = originalEstimateSeconds;
    this.remainingEstimateSeconds = remainingEstimateSeconds;
    this.timeSpentSeconds = timeSpentSeconds;
  }

   /**
   * The original estimate of time needed for this issue in readable format.
   * @return originalEstimate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The original estimate of time needed for this issue in readable format.")

  public String getOriginalEstimate() {
    return originalEstimate;
  }




   /**
   * The remaining estimate of time needed for this issue in readable format.
   * @return remainingEstimate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The remaining estimate of time needed for this issue in readable format.")

  public String getRemainingEstimate() {
    return remainingEstimate;
  }




   /**
   * Time worked on this issue in readable format.
   * @return timeSpent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time worked on this issue in readable format.")

  public String getTimeSpent() {
    return timeSpent;
  }




   /**
   * The original estimate of time needed for this issue in seconds.
   * @return originalEstimateSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The original estimate of time needed for this issue in seconds.")

  public Long getOriginalEstimateSeconds() {
    return originalEstimateSeconds;
  }




   /**
   * The remaining estimate of time needed for this issue in seconds.
   * @return remainingEstimateSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The remaining estimate of time needed for this issue in seconds.")

  public Long getRemainingEstimateSeconds() {
    return remainingEstimateSeconds;
  }




   /**
   * Time worked on this issue in seconds.
   * @return timeSpentSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time worked on this issue in seconds.")

  public Long getTimeSpentSeconds() {
    return timeSpentSeconds;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeTrackingDetails timeTrackingDetails = (TimeTrackingDetails) o;
    return Objects.equals(this.originalEstimate, timeTrackingDetails.originalEstimate) &&
        Objects.equals(this.remainingEstimate, timeTrackingDetails.remainingEstimate) &&
        Objects.equals(this.timeSpent, timeTrackingDetails.timeSpent) &&
        Objects.equals(this.originalEstimateSeconds, timeTrackingDetails.originalEstimateSeconds) &&
        Objects.equals(this.remainingEstimateSeconds, timeTrackingDetails.remainingEstimateSeconds) &&
        Objects.equals(this.timeSpentSeconds, timeTrackingDetails.timeSpentSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalEstimate, remainingEstimate, timeSpent, originalEstimateSeconds, remainingEstimateSeconds, timeSpentSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeTrackingDetails {\n");
    sb.append("    originalEstimate: ").append(toIndentedString(originalEstimate)).append("\n");
    sb.append("    remainingEstimate: ").append(toIndentedString(remainingEstimate)).append("\n");
    sb.append("    timeSpent: ").append(toIndentedString(timeSpent)).append("\n");
    sb.append("    originalEstimateSeconds: ").append(toIndentedString(originalEstimateSeconds)).append("\n");
    sb.append("    remainingEstimateSeconds: ").append(toIndentedString(remainingEstimateSeconds)).append("\n");
    sb.append("    timeSpentSeconds: ").append(toIndentedString(timeSpentSeconds)).append("\n");
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
    openapiFields.add("originalEstimate");
    openapiFields.add("remainingEstimate");
    openapiFields.add("timeSpent");
    openapiFields.add("originalEstimateSeconds");
    openapiFields.add("remainingEstimateSeconds");
    openapiFields.add("timeSpentSeconds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TimeTrackingDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TimeTrackingDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimeTrackingDetails is not found in the empty JSON string", TimeTrackingDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TimeTrackingDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TimeTrackingDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("originalEstimate") != null && !jsonObj.get("originalEstimate").isJsonNull()) && !jsonObj.get("originalEstimate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `originalEstimate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("originalEstimate").toString()));
      }
      if ((jsonObj.get("remainingEstimate") != null && !jsonObj.get("remainingEstimate").isJsonNull()) && !jsonObj.get("remainingEstimate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remainingEstimate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remainingEstimate").toString()));
      }
      if ((jsonObj.get("timeSpent") != null && !jsonObj.get("timeSpent").isJsonNull()) && !jsonObj.get("timeSpent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeSpent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeSpent").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimeTrackingDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimeTrackingDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimeTrackingDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimeTrackingDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<TimeTrackingDetails>() {
           @Override
           public void write(JsonWriter out, TimeTrackingDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TimeTrackingDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TimeTrackingDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TimeTrackingDetails
  * @throws IOException if the JSON string is invalid with respect to TimeTrackingDetails
  */
  public static TimeTrackingDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimeTrackingDetails.class);
  }

 /**
  * Convert an instance of TimeTrackingDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

