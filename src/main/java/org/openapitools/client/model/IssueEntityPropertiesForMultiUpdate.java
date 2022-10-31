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
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.JsonNode;

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
 * An issue ID with entity property values. See [Entity properties](https://developer.atlassian.com/cloud/jira/platform/jira-entity-properties/) for more information.
 */
@ApiModel(description = "An issue ID with entity property values. See [Entity properties](https://developer.atlassian.com/cloud/jira/platform/jira-entity-properties/) for more information.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class IssueEntityPropertiesForMultiUpdate {
  public static final String SERIALIZED_NAME_ISSUE_I_D = "issueID";
  @SerializedName(SERIALIZED_NAME_ISSUE_I_D)
  private Long issueID;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, JsonNode> properties = null;

  public IssueEntityPropertiesForMultiUpdate() {
  }

  public IssueEntityPropertiesForMultiUpdate issueID(Long issueID) {
    
    this.issueID = issueID;
    return this;
  }

   /**
   * The ID of the issue.
   * @return issueID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the issue.")

  public Long getIssueID() {
    return issueID;
  }


  public void setIssueID(Long issueID) {
    this.issueID = issueID;
  }


  public IssueEntityPropertiesForMultiUpdate properties(Map<String, JsonNode> properties) {
    
    this.properties = properties;
    return this;
  }

  public IssueEntityPropertiesForMultiUpdate putPropertiesItem(String key, JsonNode propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * Entity properties to set on the issue. The maximum length of an issue property value is 32768 characters.
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Entity properties to set on the issue. The maximum length of an issue property value is 32768 characters.")

  public Map<String, JsonNode> getProperties() {
    return properties;
  }


  public void setProperties(Map<String, JsonNode> properties) {
    this.properties = properties;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueEntityPropertiesForMultiUpdate issueEntityPropertiesForMultiUpdate = (IssueEntityPropertiesForMultiUpdate) o;
    return Objects.equals(this.issueID, issueEntityPropertiesForMultiUpdate.issueID) &&
        Objects.equals(this.properties, issueEntityPropertiesForMultiUpdate.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueID, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueEntityPropertiesForMultiUpdate {\n");
    sb.append("    issueID: ").append(toIndentedString(issueID)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
    openapiFields.add("issueID");
    openapiFields.add("properties");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IssueEntityPropertiesForMultiUpdate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IssueEntityPropertiesForMultiUpdate.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssueEntityPropertiesForMultiUpdate is not found in the empty JSON string", IssueEntityPropertiesForMultiUpdate.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IssueEntityPropertiesForMultiUpdate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IssueEntityPropertiesForMultiUpdate` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssueEntityPropertiesForMultiUpdate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssueEntityPropertiesForMultiUpdate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssueEntityPropertiesForMultiUpdate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssueEntityPropertiesForMultiUpdate.class));

       return (TypeAdapter<T>) new TypeAdapter<IssueEntityPropertiesForMultiUpdate>() {
           @Override
           public void write(JsonWriter out, IssueEntityPropertiesForMultiUpdate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IssueEntityPropertiesForMultiUpdate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IssueEntityPropertiesForMultiUpdate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IssueEntityPropertiesForMultiUpdate
  * @throws IOException if the JSON string is invalid with respect to IssueEntityPropertiesForMultiUpdate
  */
  public static IssueEntityPropertiesForMultiUpdate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssueEntityPropertiesForMultiUpdate.class);
  }

 /**
  * Convert an instance of IssueEntityPropertiesForMultiUpdate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

