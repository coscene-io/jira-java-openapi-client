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
 * The position of the gadget.
 */
@ApiModel(description = "The position of the gadget.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class DashboardGadgetPosition {
  public static final String SERIALIZED_NAME_THE_ROW_POSITION_OF_THE_GADGET = "The row position of the gadget.";
  @SerializedName(SERIALIZED_NAME_THE_ROW_POSITION_OF_THE_GADGET)
  private Integer theRowPositionOfTheGadget;

  public static final String SERIALIZED_NAME_THE_COLUMN_POSITION_OF_THE_GADGET = "The column position of the gadget.";
  @SerializedName(SERIALIZED_NAME_THE_COLUMN_POSITION_OF_THE_GADGET)
  private Integer theColumnPositionOfTheGadget;

  public DashboardGadgetPosition() {
  }

  public DashboardGadgetPosition theRowPositionOfTheGadget(Integer theRowPositionOfTheGadget) {
    
    this.theRowPositionOfTheGadget = theRowPositionOfTheGadget;
    return this;
  }

   /**
   * Get theRowPositionOfTheGadget
   * @return theRowPositionOfTheGadget
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getTheRowPositionOfTheGadget() {
    return theRowPositionOfTheGadget;
  }


  public void setTheRowPositionOfTheGadget(Integer theRowPositionOfTheGadget) {
    this.theRowPositionOfTheGadget = theRowPositionOfTheGadget;
  }


  public DashboardGadgetPosition theColumnPositionOfTheGadget(Integer theColumnPositionOfTheGadget) {
    
    this.theColumnPositionOfTheGadget = theColumnPositionOfTheGadget;
    return this;
  }

   /**
   * Get theColumnPositionOfTheGadget
   * @return theColumnPositionOfTheGadget
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getTheColumnPositionOfTheGadget() {
    return theColumnPositionOfTheGadget;
  }


  public void setTheColumnPositionOfTheGadget(Integer theColumnPositionOfTheGadget) {
    this.theColumnPositionOfTheGadget = theColumnPositionOfTheGadget;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardGadgetPosition dashboardGadgetPosition = (DashboardGadgetPosition) o;
    return Objects.equals(this.theRowPositionOfTheGadget, dashboardGadgetPosition.theRowPositionOfTheGadget) &&
        Objects.equals(this.theColumnPositionOfTheGadget, dashboardGadgetPosition.theColumnPositionOfTheGadget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(theRowPositionOfTheGadget, theColumnPositionOfTheGadget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardGadgetPosition {\n");
    sb.append("    theRowPositionOfTheGadget: ").append(toIndentedString(theRowPositionOfTheGadget)).append("\n");
    sb.append("    theColumnPositionOfTheGadget: ").append(toIndentedString(theColumnPositionOfTheGadget)).append("\n");
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
    openapiFields.add("The row position of the gadget.");
    openapiFields.add("The column position of the gadget.");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("The row position of the gadget.");
    openapiRequiredFields.add("The column position of the gadget.");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DashboardGadgetPosition
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DashboardGadgetPosition.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DashboardGadgetPosition is not found in the empty JSON string", DashboardGadgetPosition.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DashboardGadgetPosition.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DashboardGadgetPosition` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DashboardGadgetPosition.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DashboardGadgetPosition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DashboardGadgetPosition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DashboardGadgetPosition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DashboardGadgetPosition.class));

       return (TypeAdapter<T>) new TypeAdapter<DashboardGadgetPosition>() {
           @Override
           public void write(JsonWriter out, DashboardGadgetPosition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DashboardGadgetPosition read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DashboardGadgetPosition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DashboardGadgetPosition
  * @throws IOException if the JSON string is invalid with respect to DashboardGadgetPosition
  */
  public static DashboardGadgetPosition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DashboardGadgetPosition.class);
  }

 /**
  * Convert an instance of DashboardGadgetPosition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

