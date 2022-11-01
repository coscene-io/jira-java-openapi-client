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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import io.coscene.jira.client.v2.JSON;

/**
 * Details of Jira expressions for analysis.
 */
@ApiModel(description = "Details of Jira expressions for analysis.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class JiraExpressionForAnalysis {
  public static final String SERIALIZED_NAME_EXPRESSIONS = "expressions";
  @SerializedName(SERIALIZED_NAME_EXPRESSIONS)
  private List<String> expressions = new ArrayList<>();

  public static final String SERIALIZED_NAME_CONTEXT_VARIABLES = "contextVariables";
  @SerializedName(SERIALIZED_NAME_CONTEXT_VARIABLES)
  private Map<String, String> contextVariables = null;

  public JiraExpressionForAnalysis() {
  }

  public JiraExpressionForAnalysis expressions(List<String> expressions) {
    
    this.expressions = expressions;
    return this;
  }

  public JiraExpressionForAnalysis addExpressionsItem(String expressionsItem) {
    this.expressions.add(expressionsItem);
    return this;
  }

   /**
   * The list of Jira expressions to analyse.
   * @return expressions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "issues.map(issue => issue.properties['property_key'])", required = true, value = "The list of Jira expressions to analyse.")

  public List<String> getExpressions() {
    return expressions;
  }


  public void setExpressions(List<String> expressions) {
    this.expressions = expressions;
  }


  public JiraExpressionForAnalysis contextVariables(Map<String, String> contextVariables) {
    
    this.contextVariables = contextVariables;
    return this;
  }

  public JiraExpressionForAnalysis putContextVariablesItem(String key, String contextVariablesItem) {
    if (this.contextVariables == null) {
      this.contextVariables = new HashMap<>();
    }
    this.contextVariables.put(key, contextVariablesItem);
    return this;
  }

   /**
   * Context variables and their types. The type checker assumes that [common context variables](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#context-variables), such as &#x60;issue&#x60; or &#x60;project&#x60;, are available in context and sets their type. Use this property to override the default types or provide details of new variables.
   * @return contextVariables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Context variables and their types. The type checker assumes that [common context variables](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#context-variables), such as `issue` or `project`, are available in context and sets their type. Use this property to override the default types or provide details of new variables.")

  public Map<String, String> getContextVariables() {
    return contextVariables;
  }


  public void setContextVariables(Map<String, String> contextVariables) {
    this.contextVariables = contextVariables;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraExpressionForAnalysis jiraExpressionForAnalysis = (JiraExpressionForAnalysis) o;
    return Objects.equals(this.expressions, jiraExpressionForAnalysis.expressions) &&
        Objects.equals(this.contextVariables, jiraExpressionForAnalysis.contextVariables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expressions, contextVariables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraExpressionForAnalysis {\n");
    sb.append("    expressions: ").append(toIndentedString(expressions)).append("\n");
    sb.append("    contextVariables: ").append(toIndentedString(contextVariables)).append("\n");
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
    openapiFields.add("expressions");
    openapiFields.add("contextVariables");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("expressions");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JiraExpressionForAnalysis
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JiraExpressionForAnalysis.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JiraExpressionForAnalysis is not found in the empty JSON string", JiraExpressionForAnalysis.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JiraExpressionForAnalysis.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JiraExpressionForAnalysis` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : JiraExpressionForAnalysis.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("expressions") != null && !jsonObj.get("expressions").isJsonNull()) && !jsonObj.get("expressions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `expressions` to be an array in the JSON string but got `%s`", jsonObj.get("expressions").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JiraExpressionForAnalysis.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JiraExpressionForAnalysis' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JiraExpressionForAnalysis> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JiraExpressionForAnalysis.class));

       return (TypeAdapter<T>) new TypeAdapter<JiraExpressionForAnalysis>() {
           @Override
           public void write(JsonWriter out, JiraExpressionForAnalysis value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JiraExpressionForAnalysis read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JiraExpressionForAnalysis given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JiraExpressionForAnalysis
  * @throws IOException if the JSON string is invalid with respect to JiraExpressionForAnalysis
  */
  public static JiraExpressionForAnalysis fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JiraExpressionForAnalysis.class);
  }

 /**
  * Convert an instance of JiraExpressionForAnalysis to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

