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
import org.openapitools.client.model.BulkIssuePropertyUpdateRequestFilter;
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
 * Bulk issue property update request details.
 */
@ApiModel(description = "Bulk issue property update request details.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class BulkIssuePropertyUpdateRequest {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Object value = null;

  public static final String SERIALIZED_NAME_EXPRESSION = "expression";
  @SerializedName(SERIALIZED_NAME_EXPRESSION)
  private String expression;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private BulkIssuePropertyUpdateRequestFilter filter;

  public BulkIssuePropertyUpdateRequest() {
  }

  public BulkIssuePropertyUpdateRequest value(Object value) {
    
    this.value = value;
    return this;
  }

   /**
   * The value of the property. The value must be a [valid](https://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value of the property. The value must be a [valid](https://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.")

  public Object getValue() {
    return value;
  }


  public void setValue(Object value) {
    this.value = value;
  }


  public BulkIssuePropertyUpdateRequest expression(String expression) {
    
    this.expression = expression;
    return this;
  }

   /**
   * EXPERIMENTAL. The Jira expression to calculate the value of the property. The value of the expression must be an object that can be converted to JSON, such as a number, boolean, string, list, or map. The context variables available to the expression are &#x60;issue&#x60; and &#x60;user&#x60;. Issues for which the expression returns a value whose JSON representation is longer than 32768 characters are ignored.
   * @return expression
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "EXPERIMENTAL. The Jira expression to calculate the value of the property. The value of the expression must be an object that can be converted to JSON, such as a number, boolean, string, list, or map. The context variables available to the expression are `issue` and `user`. Issues for which the expression returns a value whose JSON representation is longer than 32768 characters are ignored.")

  public String getExpression() {
    return expression;
  }


  public void setExpression(String expression) {
    this.expression = expression;
  }


  public BulkIssuePropertyUpdateRequest filter(BulkIssuePropertyUpdateRequestFilter filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BulkIssuePropertyUpdateRequestFilter getFilter() {
    return filter;
  }


  public void setFilter(BulkIssuePropertyUpdateRequestFilter filter) {
    this.filter = filter;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkIssuePropertyUpdateRequest bulkIssuePropertyUpdateRequest = (BulkIssuePropertyUpdateRequest) o;
    return Objects.equals(this.value, bulkIssuePropertyUpdateRequest.value) &&
        Objects.equals(this.expression, bulkIssuePropertyUpdateRequest.expression) &&
        Objects.equals(this.filter, bulkIssuePropertyUpdateRequest.filter);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, expression, filter);
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
    sb.append("class BulkIssuePropertyUpdateRequest {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
    openapiFields.add("expression");
    openapiFields.add("filter");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BulkIssuePropertyUpdateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BulkIssuePropertyUpdateRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BulkIssuePropertyUpdateRequest is not found in the empty JSON string", BulkIssuePropertyUpdateRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BulkIssuePropertyUpdateRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BulkIssuePropertyUpdateRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("expression") != null && !jsonObj.get("expression").isJsonNull()) && !jsonObj.get("expression").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expression` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expression").toString()));
      }
      // validate the optional field `filter`
      if (jsonObj.get("filter") != null && !jsonObj.get("filter").isJsonNull()) {
        BulkIssuePropertyUpdateRequestFilter.validateJsonObject(jsonObj.getAsJsonObject("filter"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BulkIssuePropertyUpdateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BulkIssuePropertyUpdateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BulkIssuePropertyUpdateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BulkIssuePropertyUpdateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<BulkIssuePropertyUpdateRequest>() {
           @Override
           public void write(JsonWriter out, BulkIssuePropertyUpdateRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BulkIssuePropertyUpdateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BulkIssuePropertyUpdateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BulkIssuePropertyUpdateRequest
  * @throws IOException if the JSON string is invalid with respect to BulkIssuePropertyUpdateRequest
  */
  public static BulkIssuePropertyUpdateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BulkIssuePropertyUpdateRequest.class);
  }

 /**
  * Convert an instance of BulkIssuePropertyUpdateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

