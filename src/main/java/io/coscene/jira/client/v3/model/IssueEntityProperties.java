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
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashSet;
import java.util.Map.Entry;

import io.coscene.jira.client.v3.JSON;

/**
 * Lists of issues and entity properties. See [Entity properties](https://developer.atlassian.com/cloud/jira/platform/jira-entity-properties/) for more information.
 */
@ApiModel(description = "Lists of issues and entity properties. See [Entity properties](https://developer.atlassian.com/cloud/jira/platform/jira-entity-properties/) for more information.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class IssueEntityProperties {
  public static final String SERIALIZED_NAME_ENTITIES_IDS = "entitiesIds";
  @SerializedName(SERIALIZED_NAME_ENTITIES_IDS)
  private Set<Long> entitiesIds = null;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, JsonNode> properties = null;

  public IssueEntityProperties() {
  }

  public IssueEntityProperties entitiesIds(Set<Long> entitiesIds) {
    
    this.entitiesIds = entitiesIds;
    return this;
  }

  public IssueEntityProperties addEntitiesIdsItem(Long entitiesIdsItem) {
    if (this.entitiesIds == null) {
      this.entitiesIds = new LinkedHashSet<>();
    }
    this.entitiesIds.add(entitiesIdsItem);
    return this;
  }

   /**
   * A list of entity property IDs.
   * @return entitiesIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of entity property IDs.")

  public Set<Long> getEntitiesIds() {
    return entitiesIds;
  }


  public void setEntitiesIds(Set<Long> entitiesIds) {
    this.entitiesIds = entitiesIds;
  }


  public IssueEntityProperties properties(Map<String, JsonNode> properties) {
    
    this.properties = properties;
    return this;
  }

  public IssueEntityProperties putPropertiesItem(String key, JsonNode propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * A list of entity property keys and values.
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of entity property keys and values.")

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
    IssueEntityProperties issueEntityProperties = (IssueEntityProperties) o;
    return Objects.equals(this.entitiesIds, issueEntityProperties.entitiesIds) &&
        Objects.equals(this.properties, issueEntityProperties.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entitiesIds, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueEntityProperties {\n");
    sb.append("    entitiesIds: ").append(toIndentedString(entitiesIds)).append("\n");
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
    openapiFields.add("entitiesIds");
    openapiFields.add("properties");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IssueEntityProperties
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IssueEntityProperties.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssueEntityProperties is not found in the empty JSON string", IssueEntityProperties.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IssueEntityProperties.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IssueEntityProperties` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("entitiesIds") != null && !jsonObj.get("entitiesIds").isJsonNull()) && !jsonObj.get("entitiesIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `entitiesIds` to be an array in the JSON string but got `%s`", jsonObj.get("entitiesIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssueEntityProperties.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssueEntityProperties' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssueEntityProperties> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssueEntityProperties.class));

       return (TypeAdapter<T>) new TypeAdapter<IssueEntityProperties>() {
           @Override
           public void write(JsonWriter out, IssueEntityProperties value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IssueEntityProperties read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IssueEntityProperties given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IssueEntityProperties
  * @throws IOException if the JSON string is invalid with respect to IssueEntityProperties
  */
  public static IssueEntityProperties fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssueEntityProperties.class);
  }

 /**
  * Convert an instance of IssueEntityProperties to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

