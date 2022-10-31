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
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Bulk operation filter details.
 */
@ApiModel(description = "Bulk operation filter details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class IssueFilterForBulkPropertySet {
  public static final String SERIALIZED_NAME_ENTITY_IDS = "entityIds";
  @SerializedName(SERIALIZED_NAME_ENTITY_IDS)
  private Set<Long> entityIds = null;

  public static final String SERIALIZED_NAME_CURRENT_VALUE = "currentValue";
  @SerializedName(SERIALIZED_NAME_CURRENT_VALUE)
  private Object currentValue = null;

  public static final String SERIALIZED_NAME_HAS_PROPERTY = "hasProperty";
  @SerializedName(SERIALIZED_NAME_HAS_PROPERTY)
  private Boolean hasProperty;

  public IssueFilterForBulkPropertySet() {
  }

  public IssueFilterForBulkPropertySet entityIds(Set<Long> entityIds) {
    
    this.entityIds = entityIds;
    return this;
  }

  public IssueFilterForBulkPropertySet addEntityIdsItem(Long entityIdsItem) {
    if (this.entityIds == null) {
      this.entityIds = new LinkedHashSet<>();
    }
    this.entityIds.add(entityIdsItem);
    return this;
  }

   /**
   * List of issues to perform the bulk operation on.
   * @return entityIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of issues to perform the bulk operation on.")

  public Set<Long> getEntityIds() {
    return entityIds;
  }


  public void setEntityIds(Set<Long> entityIds) {
    this.entityIds = entityIds;
  }


  public IssueFilterForBulkPropertySet currentValue(Object currentValue) {
    
    this.currentValue = currentValue;
    return this;
  }

   /**
   * The value of properties to perform the bulk operation on.
   * @return currentValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value of properties to perform the bulk operation on.")

  public Object getCurrentValue() {
    return currentValue;
  }


  public void setCurrentValue(Object currentValue) {
    this.currentValue = currentValue;
  }


  public IssueFilterForBulkPropertySet hasProperty(Boolean hasProperty) {
    
    this.hasProperty = hasProperty;
    return this;
  }

   /**
   * Whether the bulk operation occurs only when the property is present on or absent from an issue.
   * @return hasProperty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the bulk operation occurs only when the property is present on or absent from an issue.")

  public Boolean getHasProperty() {
    return hasProperty;
  }


  public void setHasProperty(Boolean hasProperty) {
    this.hasProperty = hasProperty;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueFilterForBulkPropertySet issueFilterForBulkPropertySet = (IssueFilterForBulkPropertySet) o;
    return Objects.equals(this.entityIds, issueFilterForBulkPropertySet.entityIds) &&
        Objects.equals(this.currentValue, issueFilterForBulkPropertySet.currentValue) &&
        Objects.equals(this.hasProperty, issueFilterForBulkPropertySet.hasProperty);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityIds, currentValue, hasProperty);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueFilterForBulkPropertySet {\n");
    sb.append("    entityIds: ").append(toIndentedString(entityIds)).append("\n");
    sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
    sb.append("    hasProperty: ").append(toIndentedString(hasProperty)).append("\n");
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
    openapiFields.add("entityIds");
    openapiFields.add("currentValue");
    openapiFields.add("hasProperty");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IssueFilterForBulkPropertySet
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IssueFilterForBulkPropertySet.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssueFilterForBulkPropertySet is not found in the empty JSON string", IssueFilterForBulkPropertySet.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IssueFilterForBulkPropertySet.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IssueFilterForBulkPropertySet` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("entityIds") != null && !jsonObj.get("entityIds").isJsonNull()) && !jsonObj.get("entityIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `entityIds` to be an array in the JSON string but got `%s`", jsonObj.get("entityIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssueFilterForBulkPropertySet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssueFilterForBulkPropertySet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssueFilterForBulkPropertySet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssueFilterForBulkPropertySet.class));

       return (TypeAdapter<T>) new TypeAdapter<IssueFilterForBulkPropertySet>() {
           @Override
           public void write(JsonWriter out, IssueFilterForBulkPropertySet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IssueFilterForBulkPropertySet read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IssueFilterForBulkPropertySet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IssueFilterForBulkPropertySet
  * @throws IOException if the JSON string is invalid with respect to IssueFilterForBulkPropertySet
  */
  public static IssueFilterForBulkPropertySet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssueFilterForBulkPropertySet.class);
  }

 /**
  * Convert an instance of IssueFilterForBulkPropertySet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

