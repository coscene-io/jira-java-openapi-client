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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import io.coscene.jira.client.v2.JSON;

/**
 * Change the order of issue resolutions.
 */
@ApiModel(description = "Change the order of issue resolutions.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class ReorderIssueResolutionsRequest {
  public static final String SERIALIZED_NAME_IDS = "ids";
  @SerializedName(SERIALIZED_NAME_IDS)
  private List<String> ids = new ArrayList<>();

  public static final String SERIALIZED_NAME_AFTER = "after";
  @SerializedName(SERIALIZED_NAME_AFTER)
  private String after;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private String position;

  public ReorderIssueResolutionsRequest() {
  }

  public ReorderIssueResolutionsRequest ids(List<String> ids) {
    
    this.ids = ids;
    return this;
  }

  public ReorderIssueResolutionsRequest addIdsItem(String idsItem) {
    this.ids.add(idsItem);
    return this;
  }

   /**
   * The list of resolution IDs to be reordered. Cannot contain duplicates nor after ID.
   * @return ids
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The list of resolution IDs to be reordered. Cannot contain duplicates nor after ID.")

  public List<String> getIds() {
    return ids;
  }


  public void setIds(List<String> ids) {
    this.ids = ids;
  }


  public ReorderIssueResolutionsRequest after(String after) {
    
    this.after = after;
    return this;
  }

   /**
   * The ID of the resolution. Required if &#x60;position&#x60; isn&#39;t provided.
   * @return after
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the resolution. Required if `position` isn't provided.")

  public String getAfter() {
    return after;
  }


  public void setAfter(String after) {
    this.after = after;
  }


  public ReorderIssueResolutionsRequest position(String position) {
    
    this.position = position;
    return this;
  }

   /**
   * The position for issue resolutions to be moved to. Required if &#x60;after&#x60; isn&#39;t provided.
   * @return position
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The position for issue resolutions to be moved to. Required if `after` isn't provided.")

  public String getPosition() {
    return position;
  }


  public void setPosition(String position) {
    this.position = position;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReorderIssueResolutionsRequest reorderIssueResolutionsRequest = (ReorderIssueResolutionsRequest) o;
    return Objects.equals(this.ids, reorderIssueResolutionsRequest.ids) &&
        Objects.equals(this.after, reorderIssueResolutionsRequest.after) &&
        Objects.equals(this.position, reorderIssueResolutionsRequest.position);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, after, position);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReorderIssueResolutionsRequest {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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
    openapiFields.add("ids");
    openapiFields.add("after");
    openapiFields.add("position");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ids");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReorderIssueResolutionsRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ReorderIssueResolutionsRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReorderIssueResolutionsRequest is not found in the empty JSON string", ReorderIssueResolutionsRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ReorderIssueResolutionsRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReorderIssueResolutionsRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ReorderIssueResolutionsRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("ids") != null && !jsonObj.get("ids").isJsonNull()) && !jsonObj.get("ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ids` to be an array in the JSON string but got `%s`", jsonObj.get("ids").toString()));
      }
      if ((jsonObj.get("after") != null && !jsonObj.get("after").isJsonNull()) && !jsonObj.get("after").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `after` to be a primitive type in the JSON string but got `%s`", jsonObj.get("after").toString()));
      }
      if ((jsonObj.get("position") != null && !jsonObj.get("position").isJsonNull()) && !jsonObj.get("position").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `position` to be a primitive type in the JSON string but got `%s`", jsonObj.get("position").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReorderIssueResolutionsRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReorderIssueResolutionsRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReorderIssueResolutionsRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReorderIssueResolutionsRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ReorderIssueResolutionsRequest>() {
           @Override
           public void write(JsonWriter out, ReorderIssueResolutionsRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReorderIssueResolutionsRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReorderIssueResolutionsRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReorderIssueResolutionsRequest
  * @throws IOException if the JSON string is invalid with respect to ReorderIssueResolutionsRequest
  */
  public static ReorderIssueResolutionsRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReorderIssueResolutionsRequest.class);
  }

 /**
  * Convert an instance of ReorderIssueResolutionsRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

