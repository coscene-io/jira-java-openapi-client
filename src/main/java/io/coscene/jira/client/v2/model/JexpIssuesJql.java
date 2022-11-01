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
import com.google.gson.annotations.JsonAdapter;
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
 * The JQL query that specifies the set of issues available in the Jira expression.
 */
@ApiModel(description = "The JQL query that specifies the set of issues available in the Jira expression.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class JexpIssuesJql {
  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;

  public static final String SERIALIZED_NAME_START_AT = "startAt";
  @SerializedName(SERIALIZED_NAME_START_AT)
  private Long startAt;

  public static final String SERIALIZED_NAME_MAX_RESULTS = "maxResults";
  @SerializedName(SERIALIZED_NAME_MAX_RESULTS)
  private Integer maxResults;

  /**
   * Determines how to validate the JQL query and treat the validation results.
   */
  @JsonAdapter(ValidationEnum.Adapter.class)
  public enum ValidationEnum {
    STRICT("strict"),
    
    WARN("warn"),
    
    NONE("none");

    private String value;

    ValidationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ValidationEnum fromValue(String value) {
      for (ValidationEnum b : ValidationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ValidationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ValidationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ValidationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ValidationEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VALIDATION = "validation";
  @SerializedName(SERIALIZED_NAME_VALIDATION)
  private ValidationEnum validation = ValidationEnum.STRICT;

  public JexpIssuesJql() {
  }

  public JexpIssuesJql query(String query) {
    
    this.query = query;
    return this;
  }

   /**
   * The JQL query.
   * @return query
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The JQL query.")

  public String getQuery() {
    return query;
  }


  public void setQuery(String query) {
    this.query = query;
  }


  public JexpIssuesJql startAt(Long startAt) {
    
    this.startAt = startAt;
    return this;
  }

   /**
   * The index of the first issue to return from the JQL query.
   * @return startAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The index of the first issue to return from the JQL query.")

  public Long getStartAt() {
    return startAt;
  }


  public void setStartAt(Long startAt) {
    this.startAt = startAt;
  }


  public JexpIssuesJql maxResults(Integer maxResults) {
    
    this.maxResults = maxResults;
    return this;
  }

   /**
   * The maximum number of issues to return from the JQL query. Inspect &#x60;meta.issues.jql.maxResults&#x60; in the response to ensure the maximum value has not been exceeded.
   * @return maxResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of issues to return from the JQL query. Inspect `meta.issues.jql.maxResults` in the response to ensure the maximum value has not been exceeded.")

  public Integer getMaxResults() {
    return maxResults;
  }


  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }


  public JexpIssuesJql validation(ValidationEnum validation) {
    
    this.validation = validation;
    return this;
  }

   /**
   * Determines how to validate the JQL query and treat the validation results.
   * @return validation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines how to validate the JQL query and treat the validation results.")

  public ValidationEnum getValidation() {
    return validation;
  }


  public void setValidation(ValidationEnum validation) {
    this.validation = validation;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JexpIssuesJql jexpIssuesJql = (JexpIssuesJql) o;
    return Objects.equals(this.query, jexpIssuesJql.query) &&
        Objects.equals(this.startAt, jexpIssuesJql.startAt) &&
        Objects.equals(this.maxResults, jexpIssuesJql.maxResults) &&
        Objects.equals(this.validation, jexpIssuesJql.validation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, startAt, maxResults, validation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JexpIssuesJql {\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
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
    openapiFields.add("query");
    openapiFields.add("startAt");
    openapiFields.add("maxResults");
    openapiFields.add("validation");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JexpIssuesJql
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JexpIssuesJql.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JexpIssuesJql is not found in the empty JSON string", JexpIssuesJql.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JexpIssuesJql.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JexpIssuesJql` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("query") != null && !jsonObj.get("query").isJsonNull()) && !jsonObj.get("query").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `query` to be a primitive type in the JSON string but got `%s`", jsonObj.get("query").toString()));
      }
      if ((jsonObj.get("validation") != null && !jsonObj.get("validation").isJsonNull()) && !jsonObj.get("validation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validation").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JexpIssuesJql.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JexpIssuesJql' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JexpIssuesJql> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JexpIssuesJql.class));

       return (TypeAdapter<T>) new TypeAdapter<JexpIssuesJql>() {
           @Override
           public void write(JsonWriter out, JexpIssuesJql value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JexpIssuesJql read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JexpIssuesJql given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JexpIssuesJql
  * @throws IOException if the JSON string is invalid with respect to JexpIssuesJql
  */
  public static JexpIssuesJql fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JexpIssuesJql.class);
  }

 /**
  * Convert an instance of JexpIssuesJql to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

