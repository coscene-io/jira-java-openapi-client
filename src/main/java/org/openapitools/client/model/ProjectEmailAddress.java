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
import java.util.ArrayList;
import java.util.List;

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
 * A project&#39;s sender email address.
 */
@ApiModel(description = "A project's sender email address.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class ProjectEmailAddress {
  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "emailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS_STATUS = "emailAddressStatus";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS_STATUS)
  private List<String> emailAddressStatus = null;

  public ProjectEmailAddress() {
  }

  public ProjectEmailAddress emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The email address.
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email address.")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public ProjectEmailAddress emailAddressStatus(List<String> emailAddressStatus) {
    
    this.emailAddressStatus = emailAddressStatus;
    return this;
  }

  public ProjectEmailAddress addEmailAddressStatusItem(String emailAddressStatusItem) {
    if (this.emailAddressStatus == null) {
      this.emailAddressStatus = new ArrayList<>();
    }
    this.emailAddressStatus.add(emailAddressStatusItem);
    return this;
  }

   /**
   * When using a custom domain, the status of the email address.
   * @return emailAddressStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When using a custom domain, the status of the email address.")

  public List<String> getEmailAddressStatus() {
    return emailAddressStatus;
  }


  public void setEmailAddressStatus(List<String> emailAddressStatus) {
    this.emailAddressStatus = emailAddressStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectEmailAddress projectEmailAddress = (ProjectEmailAddress) o;
    return Objects.equals(this.emailAddress, projectEmailAddress.emailAddress) &&
        Objects.equals(this.emailAddressStatus, projectEmailAddress.emailAddressStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress, emailAddressStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectEmailAddress {\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    emailAddressStatus: ").append(toIndentedString(emailAddressStatus)).append("\n");
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
    openapiFields.add("emailAddress");
    openapiFields.add("emailAddressStatus");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectEmailAddress
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProjectEmailAddress.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectEmailAddress is not found in the empty JSON string", ProjectEmailAddress.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProjectEmailAddress.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectEmailAddress` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("emailAddress") != null && !jsonObj.get("emailAddress").isJsonNull()) && !jsonObj.get("emailAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emailAddress").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("emailAddressStatus") != null && !jsonObj.get("emailAddressStatus").isJsonNull()) && !jsonObj.get("emailAddressStatus").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailAddressStatus` to be an array in the JSON string but got `%s`", jsonObj.get("emailAddressStatus").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectEmailAddress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectEmailAddress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectEmailAddress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectEmailAddress.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectEmailAddress>() {
           @Override
           public void write(JsonWriter out, ProjectEmailAddress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectEmailAddress read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectEmailAddress given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectEmailAddress
  * @throws IOException if the JSON string is invalid with respect to ProjectEmailAddress
  */
  public static ProjectEmailAddress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectEmailAddress.class);
  }

 /**
  * Convert an instance of ProjectEmailAddress to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

