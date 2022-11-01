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
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

import io.coscene.jira.client.v3.JSON;

/**
 * SimpleListWrapperGroupName
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class SimpleListWrapperGroupName {
  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Integer size;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<GroupName> items = null;

  public static final String SERIALIZED_NAME_PAGING_CALLBACK = "pagingCallback";
  @SerializedName(SERIALIZED_NAME_PAGING_CALLBACK)
  private Object pagingCallback;

  public static final String SERIALIZED_NAME_CALLBACK = "callback";
  @SerializedName(SERIALIZED_NAME_CALLBACK)
  private Object callback;

  public static final String SERIALIZED_NAME_MAX_RESULTS = "max-results";
  @SerializedName(SERIALIZED_NAME_MAX_RESULTS)
  private Integer maxResults;

  public SimpleListWrapperGroupName() {
  }

  public SimpleListWrapperGroupName size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  public SimpleListWrapperGroupName items(List<GroupName> items) {
    
    this.items = items;
    return this;
  }

  public SimpleListWrapperGroupName addItemsItem(GroupName itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GroupName> getItems() {
    return items;
  }


  public void setItems(List<GroupName> items) {
    this.items = items;
  }


  public SimpleListWrapperGroupName pagingCallback(Object pagingCallback) {
    
    this.pagingCallback = pagingCallback;
    return this;
  }

   /**
   * Get pagingCallback
   * @return pagingCallback
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getPagingCallback() {
    return pagingCallback;
  }


  public void setPagingCallback(Object pagingCallback) {
    this.pagingCallback = pagingCallback;
  }


  public SimpleListWrapperGroupName callback(Object callback) {
    
    this.callback = callback;
    return this;
  }

   /**
   * Get callback
   * @return callback
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getCallback() {
    return callback;
  }


  public void setCallback(Object callback) {
    this.callback = callback;
  }


  public SimpleListWrapperGroupName maxResults(Integer maxResults) {
    
    this.maxResults = maxResults;
    return this;
  }

   /**
   * Get maxResults
   * @return maxResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMaxResults() {
    return maxResults;
  }


  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleListWrapperGroupName simpleListWrapperGroupName = (SimpleListWrapperGroupName) o;
    return Objects.equals(this.size, simpleListWrapperGroupName.size) &&
        Objects.equals(this.items, simpleListWrapperGroupName.items) &&
        Objects.equals(this.pagingCallback, simpleListWrapperGroupName.pagingCallback) &&
        Objects.equals(this.callback, simpleListWrapperGroupName.callback) &&
        Objects.equals(this.maxResults, simpleListWrapperGroupName.maxResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, items, pagingCallback, callback, maxResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleListWrapperGroupName {\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    pagingCallback: ").append(toIndentedString(pagingCallback)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
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
    openapiFields.add("size");
    openapiFields.add("items");
    openapiFields.add("pagingCallback");
    openapiFields.add("callback");
    openapiFields.add("max-results");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SimpleListWrapperGroupName
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SimpleListWrapperGroupName.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SimpleListWrapperGroupName is not found in the empty JSON string", SimpleListWrapperGroupName.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SimpleListWrapperGroupName.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SimpleListWrapperGroupName` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("items") != null && !jsonObj.get("items").isJsonNull()) {
        JsonArray jsonArrayitems = jsonObj.getAsJsonArray("items");
        if (jsonArrayitems != null) {
          // ensure the json data is an array
          if (!jsonObj.get("items").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `items` to be an array in the JSON string but got `%s`", jsonObj.get("items").toString()));
          }

          // validate the optional field `items` (array)
          for (int i = 0; i < jsonArrayitems.size(); i++) {
            GroupName.validateJsonObject(jsonArrayitems.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SimpleListWrapperGroupName.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SimpleListWrapperGroupName' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SimpleListWrapperGroupName> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SimpleListWrapperGroupName.class));

       return (TypeAdapter<T>) new TypeAdapter<SimpleListWrapperGroupName>() {
           @Override
           public void write(JsonWriter out, SimpleListWrapperGroupName value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SimpleListWrapperGroupName read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SimpleListWrapperGroupName given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SimpleListWrapperGroupName
  * @throws IOException if the JSON string is invalid with respect to SimpleListWrapperGroupName
  */
  public static SimpleListWrapperGroupName fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SimpleListWrapperGroupName.class);
  }

 /**
  * Convert an instance of SimpleListWrapperGroupName to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

