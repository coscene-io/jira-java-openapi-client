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
import com.google.gson.annotations.JsonAdapter;
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
 * Details of the time tracking configuration.
 */
@ApiModel(description = "Details of the time tracking configuration.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class TimeTrackingConfiguration {
  public static final String SERIALIZED_NAME_WORKING_HOURS_PER_DAY = "workingHoursPerDay";
  @SerializedName(SERIALIZED_NAME_WORKING_HOURS_PER_DAY)
  private Double workingHoursPerDay;

  public static final String SERIALIZED_NAME_WORKING_DAYS_PER_WEEK = "workingDaysPerWeek";
  @SerializedName(SERIALIZED_NAME_WORKING_DAYS_PER_WEEK)
  private Double workingDaysPerWeek;

  /**
   * The format that will appear on an issue&#39;s *Time Spent* field.
   */
  @JsonAdapter(TimeFormatEnum.Adapter.class)
  public enum TimeFormatEnum {
    PRETTY("pretty"),
    
    DAYS("days"),
    
    HOURS("hours");

    private String value;

    TimeFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TimeFormatEnum fromValue(String value) {
      for (TimeFormatEnum b : TimeFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TimeFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TimeFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TimeFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TimeFormatEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TIME_FORMAT = "timeFormat";
  @SerializedName(SERIALIZED_NAME_TIME_FORMAT)
  private TimeFormatEnum timeFormat;

  /**
   * The default unit of time applied to logged time.
   */
  @JsonAdapter(DefaultUnitEnum.Adapter.class)
  public enum DefaultUnitEnum {
    MINUTE("minute"),
    
    HOUR("hour"),
    
    DAY("day"),
    
    WEEK("week");

    private String value;

    DefaultUnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DefaultUnitEnum fromValue(String value) {
      for (DefaultUnitEnum b : DefaultUnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DefaultUnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DefaultUnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DefaultUnitEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DefaultUnitEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DEFAULT_UNIT = "defaultUnit";
  @SerializedName(SERIALIZED_NAME_DEFAULT_UNIT)
  private DefaultUnitEnum defaultUnit;

  public TimeTrackingConfiguration() {
  }

  public TimeTrackingConfiguration workingHoursPerDay(Double workingHoursPerDay) {
    
    this.workingHoursPerDay = workingHoursPerDay;
    return this;
  }

   /**
   * The number of hours in a working day.
   * @return workingHoursPerDay
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The number of hours in a working day.")

  public Double getWorkingHoursPerDay() {
    return workingHoursPerDay;
  }


  public void setWorkingHoursPerDay(Double workingHoursPerDay) {
    this.workingHoursPerDay = workingHoursPerDay;
  }


  public TimeTrackingConfiguration workingDaysPerWeek(Double workingDaysPerWeek) {
    
    this.workingDaysPerWeek = workingDaysPerWeek;
    return this;
  }

   /**
   * The number of days in a working week.
   * @return workingDaysPerWeek
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The number of days in a working week.")

  public Double getWorkingDaysPerWeek() {
    return workingDaysPerWeek;
  }


  public void setWorkingDaysPerWeek(Double workingDaysPerWeek) {
    this.workingDaysPerWeek = workingDaysPerWeek;
  }


  public TimeTrackingConfiguration timeFormat(TimeFormatEnum timeFormat) {
    
    this.timeFormat = timeFormat;
    return this;
  }

   /**
   * The format that will appear on an issue&#39;s *Time Spent* field.
   * @return timeFormat
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The format that will appear on an issue's *Time Spent* field.")

  public TimeFormatEnum getTimeFormat() {
    return timeFormat;
  }


  public void setTimeFormat(TimeFormatEnum timeFormat) {
    this.timeFormat = timeFormat;
  }


  public TimeTrackingConfiguration defaultUnit(DefaultUnitEnum defaultUnit) {
    
    this.defaultUnit = defaultUnit;
    return this;
  }

   /**
   * The default unit of time applied to logged time.
   * @return defaultUnit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The default unit of time applied to logged time.")

  public DefaultUnitEnum getDefaultUnit() {
    return defaultUnit;
  }


  public void setDefaultUnit(DefaultUnitEnum defaultUnit) {
    this.defaultUnit = defaultUnit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeTrackingConfiguration timeTrackingConfiguration = (TimeTrackingConfiguration) o;
    return Objects.equals(this.workingHoursPerDay, timeTrackingConfiguration.workingHoursPerDay) &&
        Objects.equals(this.workingDaysPerWeek, timeTrackingConfiguration.workingDaysPerWeek) &&
        Objects.equals(this.timeFormat, timeTrackingConfiguration.timeFormat) &&
        Objects.equals(this.defaultUnit, timeTrackingConfiguration.defaultUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workingHoursPerDay, workingDaysPerWeek, timeFormat, defaultUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeTrackingConfiguration {\n");
    sb.append("    workingHoursPerDay: ").append(toIndentedString(workingHoursPerDay)).append("\n");
    sb.append("    workingDaysPerWeek: ").append(toIndentedString(workingDaysPerWeek)).append("\n");
    sb.append("    timeFormat: ").append(toIndentedString(timeFormat)).append("\n");
    sb.append("    defaultUnit: ").append(toIndentedString(defaultUnit)).append("\n");
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
    openapiFields.add("workingHoursPerDay");
    openapiFields.add("workingDaysPerWeek");
    openapiFields.add("timeFormat");
    openapiFields.add("defaultUnit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("workingHoursPerDay");
    openapiRequiredFields.add("workingDaysPerWeek");
    openapiRequiredFields.add("timeFormat");
    openapiRequiredFields.add("defaultUnit");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TimeTrackingConfiguration
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (TimeTrackingConfiguration.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimeTrackingConfiguration is not found in the empty JSON string", TimeTrackingConfiguration.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TimeTrackingConfiguration.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TimeTrackingConfiguration` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TimeTrackingConfiguration.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("timeFormat") != null && !jsonObj.get("timeFormat").isJsonNull()) && !jsonObj.get("timeFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeFormat").toString()));
      }
      if ((jsonObj.get("defaultUnit") != null && !jsonObj.get("defaultUnit").isJsonNull()) && !jsonObj.get("defaultUnit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultUnit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("defaultUnit").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimeTrackingConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimeTrackingConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimeTrackingConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimeTrackingConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<TimeTrackingConfiguration>() {
           @Override
           public void write(JsonWriter out, TimeTrackingConfiguration value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TimeTrackingConfiguration read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TimeTrackingConfiguration given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TimeTrackingConfiguration
  * @throws IOException if the JSON string is invalid with respect to TimeTrackingConfiguration
  */
  public static TimeTrackingConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimeTrackingConfiguration.class);
  }

 /**
  * Convert an instance of TimeTrackingConfiguration to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
