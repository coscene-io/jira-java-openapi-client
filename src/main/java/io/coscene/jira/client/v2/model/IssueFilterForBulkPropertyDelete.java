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
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import io.coscene.jira.client.v2.JSON;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Bulk operation filter details.
 */
@ApiModel(description = "Bulk operation filter details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class IssueFilterForBulkPropertyDelete {
  public static final String SERIALIZED_NAME_ENTITY_IDS = "entityIds";
  @SerializedName(SERIALIZED_NAME_ENTITY_IDS)
  private Set<Long> entityIds = null;

  public static final String SERIALIZED_NAME_CURRENT_VALUE = "currentValue";
  @SerializedName(SERIALIZED_NAME_CURRENT_VALUE)
  private Object currentValue = null;

  public IssueFilterForBulkPropertyDelete() {
  }

  public IssueFilterForBulkPropertyDelete entityIds(Set<Long> entityIds) {
    
    this.entityIds = entityIds;
    return this;
  }

  public IssueFilterForBulkPropertyDelete addEntityIdsItem(Long entityIdsItem) {
    if (this.entityIds == null) {
      this.entityIds = new LinkedHashSet<>();
    }
    this.entityIds.add(entityIdsItem);
    return this;
  }

   /**
   * List of issues to perform the bulk delete operation on.
   * @return entityIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of issues to perform the bulk delete operation on.")

  public Set<Long> getEntityIds() {
    return entityIds;
  }


  public void setEntityIds(Set<Long> entityIds) {
    this.entityIds = entityIds;
  }


  public IssueFilterForBulkPropertyDelete currentValue(Object currentValue) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueFilterForBulkPropertyDelete issueFilterForBulkPropertyDelete = (IssueFilterForBulkPropertyDelete) o;
    return Objects.equals(this.entityIds, issueFilterForBulkPropertyDelete.entityIds) &&
        Objects.equals(this.currentValue, issueFilterForBulkPropertyDelete.currentValue);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityIds, currentValue);
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
    sb.append("class IssueFilterForBulkPropertyDelete {\n");
    sb.append("    entityIds: ").append(toIndentedString(entityIds)).append("\n");
    sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
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

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IssueFilterForBulkPropertyDelete
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IssueFilterForBulkPropertyDelete.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssueFilterForBulkPropertyDelete is not found in the empty JSON string", IssueFilterForBulkPropertyDelete.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IssueFilterForBulkPropertyDelete.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IssueFilterForBulkPropertyDelete` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
       if (!IssueFilterForBulkPropertyDelete.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssueFilterForBulkPropertyDelete' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssueFilterForBulkPropertyDelete> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssueFilterForBulkPropertyDelete.class));

       return (TypeAdapter<T>) new TypeAdapter<IssueFilterForBulkPropertyDelete>() {
           @Override
           public void write(JsonWriter out, IssueFilterForBulkPropertyDelete value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IssueFilterForBulkPropertyDelete read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IssueFilterForBulkPropertyDelete given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IssueFilterForBulkPropertyDelete
  * @throws IOException if the JSON string is invalid with respect to IssueFilterForBulkPropertyDelete
  */
  public static IssueFilterForBulkPropertyDelete fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssueFilterForBulkPropertyDelete.class);
  }

 /**
  * Convert an instance of IssueFilterForBulkPropertyDelete to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

