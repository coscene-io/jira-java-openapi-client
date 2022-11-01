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
import com.google.gson.JsonArray;
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
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import io.coscene.jira.client.v2.JSON;

/**
 * A page containing dashboard details.
 */
@ApiModel(description = "A page containing dashboard details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class PageOfDashboards {
  public static final String SERIALIZED_NAME_START_AT = "startAt";
  @SerializedName(SERIALIZED_NAME_START_AT)
  private Integer startAt;

  public static final String SERIALIZED_NAME_MAX_RESULTS = "maxResults";
  @SerializedName(SERIALIZED_NAME_MAX_RESULTS)
  private Integer maxResults;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public static final String SERIALIZED_NAME_PREV = "prev";
  @SerializedName(SERIALIZED_NAME_PREV)
  private String prev;

  public static final String SERIALIZED_NAME_NEXT = "next";
  @SerializedName(SERIALIZED_NAME_NEXT)
  private String next;

  public static final String SERIALIZED_NAME_DASHBOARDS = "dashboards";
  @SerializedName(SERIALIZED_NAME_DASHBOARDS)
  private List<Dashboard> dashboards = null;

  public PageOfDashboards() {
  }

  
  public PageOfDashboards(
     Integer startAt, 
     Integer maxResults, 
     Integer total, 
     String prev, 
     String next, 
     List<Dashboard> dashboards
  ) {
    this();
    this.startAt = startAt;
    this.maxResults = maxResults;
    this.total = total;
    this.prev = prev;
    this.next = next;
    this.dashboards = dashboards;
  }

   /**
   * The index of the first item returned on the page.
   * @return startAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The index of the first item returned on the page.")

  public Integer getStartAt() {
    return startAt;
  }




   /**
   * The maximum number of results that could be on the page.
   * @return maxResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of results that could be on the page.")

  public Integer getMaxResults() {
    return maxResults;
  }




   /**
   * The number of results on the page.
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of results on the page.")

  public Integer getTotal() {
    return total;
  }




   /**
   * The URL of the previous page of results, if any.
   * @return prev
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the previous page of results, if any.")

  public String getPrev() {
    return prev;
  }




   /**
   * The URL of the next page of results, if any.
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the next page of results, if any.")

  public String getNext() {
    return next;
  }




   /**
   * List of dashboards.
   * @return dashboards
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of dashboards.")

  public List<Dashboard> getDashboards() {
    return dashboards;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageOfDashboards pageOfDashboards = (PageOfDashboards) o;
    return Objects.equals(this.startAt, pageOfDashboards.startAt) &&
        Objects.equals(this.maxResults, pageOfDashboards.maxResults) &&
        Objects.equals(this.total, pageOfDashboards.total) &&
        Objects.equals(this.prev, pageOfDashboards.prev) &&
        Objects.equals(this.next, pageOfDashboards.next) &&
        Objects.equals(this.dashboards, pageOfDashboards.dashboards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startAt, maxResults, total, prev, next, dashboards);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageOfDashboards {\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    dashboards: ").append(toIndentedString(dashboards)).append("\n");
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
    openapiFields.add("startAt");
    openapiFields.add("maxResults");
    openapiFields.add("total");
    openapiFields.add("prev");
    openapiFields.add("next");
    openapiFields.add("dashboards");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PageOfDashboards
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PageOfDashboards.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PageOfDashboards is not found in the empty JSON string", PageOfDashboards.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PageOfDashboards.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PageOfDashboards` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("prev") != null && !jsonObj.get("prev").isJsonNull()) && !jsonObj.get("prev").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `prev` to be a primitive type in the JSON string but got `%s`", jsonObj.get("prev").toString()));
      }
      if ((jsonObj.get("next") != null && !jsonObj.get("next").isJsonNull()) && !jsonObj.get("next").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `next` to be a primitive type in the JSON string but got `%s`", jsonObj.get("next").toString()));
      }
      if (jsonObj.get("dashboards") != null && !jsonObj.get("dashboards").isJsonNull()) {
        JsonArray jsonArraydashboards = jsonObj.getAsJsonArray("dashboards");
        if (jsonArraydashboards != null) {
          // ensure the json data is an array
          if (!jsonObj.get("dashboards").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `dashboards` to be an array in the JSON string but got `%s`", jsonObj.get("dashboards").toString()));
          }

          // validate the optional field `dashboards` (array)
          for (int i = 0; i < jsonArraydashboards.size(); i++) {
            Dashboard.validateJsonObject(jsonArraydashboards.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PageOfDashboards.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PageOfDashboards' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PageOfDashboards> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PageOfDashboards.class));

       return (TypeAdapter<T>) new TypeAdapter<PageOfDashboards>() {
           @Override
           public void write(JsonWriter out, PageOfDashboards value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PageOfDashboards read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PageOfDashboards given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PageOfDashboards
  * @throws IOException if the JSON string is invalid with respect to PageOfDashboards
  */
  public static PageOfDashboards fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PageOfDashboards.class);
  }

 /**
  * Convert an instance of PageOfDashboards to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

