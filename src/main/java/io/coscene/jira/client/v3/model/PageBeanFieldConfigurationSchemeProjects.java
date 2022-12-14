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
import java.net.URI;
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
 * A page of items.
 */
@ApiModel(description = "A page of items.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class PageBeanFieldConfigurationSchemeProjects {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private URI self;

  public static final String SERIALIZED_NAME_NEXT_PAGE = "nextPage";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE)
  private URI nextPage;

  public static final String SERIALIZED_NAME_MAX_RESULTS = "maxResults";
  @SerializedName(SERIALIZED_NAME_MAX_RESULTS)
  private Integer maxResults;

  public static final String SERIALIZED_NAME_START_AT = "startAt";
  @SerializedName(SERIALIZED_NAME_START_AT)
  private Long startAt;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Long total;

  public static final String SERIALIZED_NAME_IS_LAST = "isLast";
  @SerializedName(SERIALIZED_NAME_IS_LAST)
  private Boolean isLast;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<FieldConfigurationSchemeProjects> values = null;

  public PageBeanFieldConfigurationSchemeProjects() {
  }

  
  public PageBeanFieldConfigurationSchemeProjects(
     URI self, 
     URI nextPage, 
     Integer maxResults, 
     Long startAt, 
     Long total, 
     Boolean isLast, 
     List<FieldConfigurationSchemeProjects> values
  ) {
    this();
    this.self = self;
    this.nextPage = nextPage;
    this.maxResults = maxResults;
    this.startAt = startAt;
    this.total = total;
    this.isLast = isLast;
    this.values = values;
  }

   /**
   * The URL of the page.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the page.")

  public URI getSelf() {
    return self;
  }




   /**
   * If there is another page of results, the URL of the next page.
   * @return nextPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If there is another page of results, the URL of the next page.")

  public URI getNextPage() {
    return nextPage;
  }




   /**
   * The maximum number of items that could be returned.
   * @return maxResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of items that could be returned.")

  public Integer getMaxResults() {
    return maxResults;
  }




   /**
   * The index of the first item returned.
   * @return startAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The index of the first item returned.")

  public Long getStartAt() {
    return startAt;
  }




   /**
   * The number of items returned.
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of items returned.")

  public Long getTotal() {
    return total;
  }




   /**
   * Whether this is the last page.
   * @return isLast
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this is the last page.")

  public Boolean getIsLast() {
    return isLast;
  }




   /**
   * The list of items.
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of items.")

  public List<FieldConfigurationSchemeProjects> getValues() {
    return values;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageBeanFieldConfigurationSchemeProjects pageBeanFieldConfigurationSchemeProjects = (PageBeanFieldConfigurationSchemeProjects) o;
    return Objects.equals(this.self, pageBeanFieldConfigurationSchemeProjects.self) &&
        Objects.equals(this.nextPage, pageBeanFieldConfigurationSchemeProjects.nextPage) &&
        Objects.equals(this.maxResults, pageBeanFieldConfigurationSchemeProjects.maxResults) &&
        Objects.equals(this.startAt, pageBeanFieldConfigurationSchemeProjects.startAt) &&
        Objects.equals(this.total, pageBeanFieldConfigurationSchemeProjects.total) &&
        Objects.equals(this.isLast, pageBeanFieldConfigurationSchemeProjects.isLast) &&
        Objects.equals(this.values, pageBeanFieldConfigurationSchemeProjects.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, nextPage, maxResults, startAt, total, isLast, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageBeanFieldConfigurationSchemeProjects {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    isLast: ").append(toIndentedString(isLast)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
    openapiFields.add("self");
    openapiFields.add("nextPage");
    openapiFields.add("maxResults");
    openapiFields.add("startAt");
    openapiFields.add("total");
    openapiFields.add("isLast");
    openapiFields.add("values");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PageBeanFieldConfigurationSchemeProjects
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PageBeanFieldConfigurationSchemeProjects.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PageBeanFieldConfigurationSchemeProjects is not found in the empty JSON string", PageBeanFieldConfigurationSchemeProjects.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PageBeanFieldConfigurationSchemeProjects.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PageBeanFieldConfigurationSchemeProjects` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) && !jsonObj.get("self").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self").toString()));
      }
      if ((jsonObj.get("nextPage") != null && !jsonObj.get("nextPage").isJsonNull()) && !jsonObj.get("nextPage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextPage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextPage").toString()));
      }
      if (jsonObj.get("values") != null && !jsonObj.get("values").isJsonNull()) {
        JsonArray jsonArrayvalues = jsonObj.getAsJsonArray("values");
        if (jsonArrayvalues != null) {
          // ensure the json data is an array
          if (!jsonObj.get("values").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
          }

          // validate the optional field `values` (array)
          for (int i = 0; i < jsonArrayvalues.size(); i++) {
            FieldConfigurationSchemeProjects.validateJsonObject(jsonArrayvalues.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PageBeanFieldConfigurationSchemeProjects.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PageBeanFieldConfigurationSchemeProjects' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PageBeanFieldConfigurationSchemeProjects> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PageBeanFieldConfigurationSchemeProjects.class));

       return (TypeAdapter<T>) new TypeAdapter<PageBeanFieldConfigurationSchemeProjects>() {
           @Override
           public void write(JsonWriter out, PageBeanFieldConfigurationSchemeProjects value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PageBeanFieldConfigurationSchemeProjects read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PageBeanFieldConfigurationSchemeProjects given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PageBeanFieldConfigurationSchemeProjects
  * @throws IOException if the JSON string is invalid with respect to PageBeanFieldConfigurationSchemeProjects
  */
  public static PageBeanFieldConfigurationSchemeProjects fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PageBeanFieldConfigurationSchemeProjects.class);
  }

 /**
  * Convert an instance of PageBeanFieldConfigurationSchemeProjects to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

