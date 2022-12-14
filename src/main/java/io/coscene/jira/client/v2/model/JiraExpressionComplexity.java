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
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import io.coscene.jira.client.v2.JSON;

/**
 * Details about the complexity of the analysed Jira expression.
 */
@ApiModel(description = "Details about the complexity of the analysed Jira expression.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class JiraExpressionComplexity {
  public static final String SERIALIZED_NAME_EXPENSIVE_OPERATIONS = "expensiveOperations";
  @SerializedName(SERIALIZED_NAME_EXPENSIVE_OPERATIONS)
  private String expensiveOperations;

  public static final String SERIALIZED_NAME_VARIABLES = "variables";
  @SerializedName(SERIALIZED_NAME_VARIABLES)
  private Map<String, String> variables = null;

  public JiraExpressionComplexity() {
  }

  public JiraExpressionComplexity expensiveOperations(String expensiveOperations) {
    
    this.expensiveOperations = expensiveOperations;
    return this;
  }

   /**
   * Information that can be used to determine how many [expensive operations](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#expensive-operations) the evaluation of the expression will perform. This information may be a formula or number. For example:   *  &#x60;issues.map(i &#x3D;&gt; i.comments)&#x60; performs as many expensive operations as there are issues on the issues list. So this parameter returns &#x60;N&#x60;, where &#x60;N&#x60; is the size of issue list.  *  &#x60;new Issue(10010).comments&#x60; gets comments for one issue, so its complexity is &#x60;2&#x60; (&#x60;1&#x60; to retrieve issue 10010 from the database plus &#x60;1&#x60; to get its comments).
   * @return expensiveOperations
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Information that can be used to determine how many [expensive operations](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#expensive-operations) the evaluation of the expression will perform. This information may be a formula or number. For example:   *  `issues.map(i => i.comments)` performs as many expensive operations as there are issues on the issues list. So this parameter returns `N`, where `N` is the size of issue list.  *  `new Issue(10010).comments` gets comments for one issue, so its complexity is `2` (`1` to retrieve issue 10010 from the database plus `1` to get its comments).")

  public String getExpensiveOperations() {
    return expensiveOperations;
  }


  public void setExpensiveOperations(String expensiveOperations) {
    this.expensiveOperations = expensiveOperations;
  }


  public JiraExpressionComplexity variables(Map<String, String> variables) {
    
    this.variables = variables;
    return this;
  }

  public JiraExpressionComplexity putVariablesItem(String key, String variablesItem) {
    if (this.variables == null) {
      this.variables = new HashMap<>();
    }
    this.variables.put(key, variablesItem);
    return this;
  }

   /**
   * Variables used in the formula, mapped to the parts of the expression they refer to.
   * @return variables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Variables used in the formula, mapped to the parts of the expression they refer to.")

  public Map<String, String> getVariables() {
    return variables;
  }


  public void setVariables(Map<String, String> variables) {
    this.variables = variables;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraExpressionComplexity jiraExpressionComplexity = (JiraExpressionComplexity) o;
    return Objects.equals(this.expensiveOperations, jiraExpressionComplexity.expensiveOperations) &&
        Objects.equals(this.variables, jiraExpressionComplexity.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expensiveOperations, variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraExpressionComplexity {\n");
    sb.append("    expensiveOperations: ").append(toIndentedString(expensiveOperations)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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
    openapiFields.add("expensiveOperations");
    openapiFields.add("variables");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("expensiveOperations");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JiraExpressionComplexity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JiraExpressionComplexity.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JiraExpressionComplexity is not found in the empty JSON string", JiraExpressionComplexity.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JiraExpressionComplexity.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JiraExpressionComplexity` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : JiraExpressionComplexity.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("expensiveOperations") != null && !jsonObj.get("expensiveOperations").isJsonNull()) && !jsonObj.get("expensiveOperations").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expensiveOperations` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expensiveOperations").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JiraExpressionComplexity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JiraExpressionComplexity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JiraExpressionComplexity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JiraExpressionComplexity.class));

       return (TypeAdapter<T>) new TypeAdapter<JiraExpressionComplexity>() {
           @Override
           public void write(JsonWriter out, JiraExpressionComplexity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JiraExpressionComplexity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JiraExpressionComplexity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JiraExpressionComplexity
  * @throws IOException if the JSON string is invalid with respect to JiraExpressionComplexity
  */
  public static JiraExpressionComplexity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JiraExpressionComplexity.class);
  }

 /**
  * Convert an instance of JiraExpressionComplexity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

