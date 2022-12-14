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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import io.coscene.jira.client.v2.JSON;

/**
 * Paginated list of worklog details
 */
@ApiModel(description = "Paginated list of worklog details")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class PageOfWorklogs {
  public static final String SERIALIZED_NAME_START_AT = "startAt";
  @SerializedName(SERIALIZED_NAME_START_AT)
  private Integer startAt;

  public static final String SERIALIZED_NAME_MAX_RESULTS = "maxResults";
  @SerializedName(SERIALIZED_NAME_MAX_RESULTS)
  private Integer maxResults;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public static final String SERIALIZED_NAME_WORKLOGS = "worklogs";
  @SerializedName(SERIALIZED_NAME_WORKLOGS)
  private List<Worklog> worklogs = null;

  public PageOfWorklogs() {
  }

  
  public PageOfWorklogs(
     Integer startAt, 
     Integer maxResults, 
     Integer total, 
     List<Worklog> worklogs
  ) {
    this();
    this.startAt = startAt;
    this.maxResults = maxResults;
    this.total = total;
    this.worklogs = worklogs;
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
   * List of worklogs.
   * @return worklogs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of worklogs.")

  public List<Worklog> getWorklogs() {
    return worklogs;
  }



  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  public PageOfWorklogs putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageOfWorklogs pageOfWorklogs = (PageOfWorklogs) o;
    return Objects.equals(this.startAt, pageOfWorklogs.startAt) &&
        Objects.equals(this.maxResults, pageOfWorklogs.maxResults) &&
        Objects.equals(this.total, pageOfWorklogs.total) &&
        Objects.equals(this.worklogs, pageOfWorklogs.worklogs)&&
        Objects.equals(this.additionalProperties, pageOfWorklogs.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startAt, maxResults, total, worklogs, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageOfWorklogs {\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    worklogs: ").append(toIndentedString(worklogs)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("worklogs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PageOfWorklogs
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PageOfWorklogs.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PageOfWorklogs is not found in the empty JSON string", PageOfWorklogs.openapiRequiredFields.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("worklogs") != null && !jsonObj.get("worklogs").isJsonNull()) && !jsonObj.get("worklogs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `worklogs` to be an array in the JSON string but got `%s`", jsonObj.get("worklogs").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PageOfWorklogs.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PageOfWorklogs' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PageOfWorklogs> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PageOfWorklogs.class));

       return (TypeAdapter<T>) new TypeAdapter<PageOfWorklogs>() {
           @Override
           public void write(JsonWriter out, PageOfWorklogs value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public PageOfWorklogs read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PageOfWorklogs instance = thisAdapter.fromJsonTree(jsonObj);
             for (Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PageOfWorklogs given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PageOfWorklogs
  * @throws IOException if the JSON string is invalid with respect to PageOfWorklogs
  */
  public static PageOfWorklogs fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PageOfWorklogs.class);
  }

 /**
  * Convert an instance of PageOfWorklogs to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

