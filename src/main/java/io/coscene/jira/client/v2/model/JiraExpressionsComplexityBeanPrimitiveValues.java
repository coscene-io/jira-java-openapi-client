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
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import io.coscene.jira.client.v2.JSON;

/**
 * The number of primitive values returned in the response.
 */
@ApiModel(description = "The number of primitive values returned in the response.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class JiraExpressionsComplexityBeanPrimitiveValues {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Integer value;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public JiraExpressionsComplexityBeanPrimitiveValues() {
  }

  public JiraExpressionsComplexityBeanPrimitiveValues value(Integer value) {
    
    this.value = value;
    return this;
  }

   /**
   * The complexity value of the current expression.
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The complexity value of the current expression.")

  public Integer getValue() {
    return value;
  }


  public void setValue(Integer value) {
    this.value = value;
  }


  public JiraExpressionsComplexityBeanPrimitiveValues limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * The maximum allowed complexity. The evaluation will fail if this value is exceeded.
   * @return limit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The maximum allowed complexity. The evaluation will fail if this value is exceeded.")

  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraExpressionsComplexityBeanPrimitiveValues jiraExpressionsComplexityBeanPrimitiveValues = (JiraExpressionsComplexityBeanPrimitiveValues) o;
    return Objects.equals(this.value, jiraExpressionsComplexityBeanPrimitiveValues.value) &&
        Objects.equals(this.limit, jiraExpressionsComplexityBeanPrimitiveValues.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraExpressionsComplexityBeanPrimitiveValues {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
    openapiFields.add("value");
    openapiFields.add("limit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("value");
    openapiRequiredFields.add("limit");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JiraExpressionsComplexityBeanPrimitiveValues
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JiraExpressionsComplexityBeanPrimitiveValues.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JiraExpressionsComplexityBeanPrimitiveValues is not found in the empty JSON string", JiraExpressionsComplexityBeanPrimitiveValues.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JiraExpressionsComplexityBeanPrimitiveValues.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JiraExpressionsComplexityBeanPrimitiveValues` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : JiraExpressionsComplexityBeanPrimitiveValues.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JiraExpressionsComplexityBeanPrimitiveValues.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JiraExpressionsComplexityBeanPrimitiveValues' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JiraExpressionsComplexityBeanPrimitiveValues> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JiraExpressionsComplexityBeanPrimitiveValues.class));

       return (TypeAdapter<T>) new TypeAdapter<JiraExpressionsComplexityBeanPrimitiveValues>() {
           @Override
           public void write(JsonWriter out, JiraExpressionsComplexityBeanPrimitiveValues value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JiraExpressionsComplexityBeanPrimitiveValues read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JiraExpressionsComplexityBeanPrimitiveValues given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JiraExpressionsComplexityBeanPrimitiveValues
  * @throws IOException if the JSON string is invalid with respect to JiraExpressionsComplexityBeanPrimitiveValues
  */
  public static JiraExpressionsComplexityBeanPrimitiveValues fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JiraExpressionsComplexityBeanPrimitiveValues.class);
  }

 /**
  * Convert an instance of JiraExpressionsComplexityBeanPrimitiveValues to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

