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
 * Details about the analysed Jira expression.
 */
@ApiModel(description = "Details about the analysed Jira expression.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class JiraExpressionAnalysis {
  public static final String SERIALIZED_NAME_EXPRESSION = "expression";
  @SerializedName(SERIALIZED_NAME_EXPRESSION)
  private String expression;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<JiraExpressionValidationError> errors = null;

  public static final String SERIALIZED_NAME_VALID = "valid";
  @SerializedName(SERIALIZED_NAME_VALID)
  private Boolean valid;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_COMPLEXITY = "complexity";
  @SerializedName(SERIALIZED_NAME_COMPLEXITY)
  private JiraExpressionComplexity complexity;

  public JiraExpressionAnalysis() {
  }

  public JiraExpressionAnalysis expression(String expression) {
    
    this.expression = expression;
    return this;
  }

   /**
   * The analysed expression.
   * @return expression
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The analysed expression.")

  public String getExpression() {
    return expression;
  }


  public void setExpression(String expression) {
    this.expression = expression;
  }


  public JiraExpressionAnalysis errors(List<JiraExpressionValidationError> errors) {
    
    this.errors = errors;
    return this;
  }

  public JiraExpressionAnalysis addErrorsItem(JiraExpressionValidationError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * A list of validation errors. Not included if the expression is valid.
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of validation errors. Not included if the expression is valid.")

  public List<JiraExpressionValidationError> getErrors() {
    return errors;
  }


  public void setErrors(List<JiraExpressionValidationError> errors) {
    this.errors = errors;
  }


  public JiraExpressionAnalysis valid(Boolean valid) {
    
    this.valid = valid;
    return this;
  }

   /**
   * Whether the expression is valid and the interpreter will evaluate it. Note that the expression may fail at runtime (for example, if it executes too many expensive operations).
   * @return valid
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Whether the expression is valid and the interpreter will evaluate it. Note that the expression may fail at runtime (for example, if it executes too many expensive operations).")

  public Boolean getValid() {
    return valid;
  }


  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  public JiraExpressionAnalysis type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * EXPERIMENTAL. The inferred type of the expression.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "EXPERIMENTAL. The inferred type of the expression.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public JiraExpressionAnalysis complexity(JiraExpressionComplexity complexity) {
    
    this.complexity = complexity;
    return this;
  }

   /**
   * Get complexity
   * @return complexity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JiraExpressionComplexity getComplexity() {
    return complexity;
  }


  public void setComplexity(JiraExpressionComplexity complexity) {
    this.complexity = complexity;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraExpressionAnalysis jiraExpressionAnalysis = (JiraExpressionAnalysis) o;
    return Objects.equals(this.expression, jiraExpressionAnalysis.expression) &&
        Objects.equals(this.errors, jiraExpressionAnalysis.errors) &&
        Objects.equals(this.valid, jiraExpressionAnalysis.valid) &&
        Objects.equals(this.type, jiraExpressionAnalysis.type) &&
        Objects.equals(this.complexity, jiraExpressionAnalysis.complexity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expression, errors, valid, type, complexity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraExpressionAnalysis {\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    complexity: ").append(toIndentedString(complexity)).append("\n");
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
    openapiFields.add("expression");
    openapiFields.add("errors");
    openapiFields.add("valid");
    openapiFields.add("type");
    openapiFields.add("complexity");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("expression");
    openapiRequiredFields.add("valid");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JiraExpressionAnalysis
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JiraExpressionAnalysis.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JiraExpressionAnalysis is not found in the empty JSON string", JiraExpressionAnalysis.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JiraExpressionAnalysis.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JiraExpressionAnalysis` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : JiraExpressionAnalysis.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("expression") != null && !jsonObj.get("expression").isJsonNull()) && !jsonObj.get("expression").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expression` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expression").toString()));
      }
      if (jsonObj.get("errors") != null && !jsonObj.get("errors").isJsonNull()) {
        JsonArray jsonArrayerrors = jsonObj.getAsJsonArray("errors");
        if (jsonArrayerrors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("errors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
          }

          // validate the optional field `errors` (array)
          for (int i = 0; i < jsonArrayerrors.size(); i++) {
            JiraExpressionValidationError.validateJsonObject(jsonArrayerrors.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `complexity`
      if (jsonObj.get("complexity") != null && !jsonObj.get("complexity").isJsonNull()) {
        JiraExpressionComplexity.validateJsonObject(jsonObj.getAsJsonObject("complexity"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JiraExpressionAnalysis.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JiraExpressionAnalysis' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JiraExpressionAnalysis> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JiraExpressionAnalysis.class));

       return (TypeAdapter<T>) new TypeAdapter<JiraExpressionAnalysis>() {
           @Override
           public void write(JsonWriter out, JiraExpressionAnalysis value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JiraExpressionAnalysis read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JiraExpressionAnalysis given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JiraExpressionAnalysis
  * @throws IOException if the JSON string is invalid with respect to JiraExpressionAnalysis
  */
  public static JiraExpressionAnalysis fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JiraExpressionAnalysis.class);
  }

 /**
  * Convert an instance of JiraExpressionAnalysis to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
