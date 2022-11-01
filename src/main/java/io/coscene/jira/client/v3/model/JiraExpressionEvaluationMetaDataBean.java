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

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

import io.coscene.jira.client.v3.JSON;

/**
 * JiraExpressionEvaluationMetaDataBean
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class JiraExpressionEvaluationMetaDataBean {
  public static final String SERIALIZED_NAME_COMPLEXITY = "complexity";
  @SerializedName(SERIALIZED_NAME_COMPLEXITY)
  private JiraExpressionEvaluationMetaDataBeanComplexity complexity;

  public static final String SERIALIZED_NAME_ISSUES = "issues";
  @SerializedName(SERIALIZED_NAME_ISSUES)
  private JiraExpressionEvaluationMetaDataBeanIssues issues;

  public JiraExpressionEvaluationMetaDataBean() {
  }

  public JiraExpressionEvaluationMetaDataBean complexity(JiraExpressionEvaluationMetaDataBeanComplexity complexity) {
    
    this.complexity = complexity;
    return this;
  }

   /**
   * Get complexity
   * @return complexity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JiraExpressionEvaluationMetaDataBeanComplexity getComplexity() {
    return complexity;
  }


  public void setComplexity(JiraExpressionEvaluationMetaDataBeanComplexity complexity) {
    this.complexity = complexity;
  }


  public JiraExpressionEvaluationMetaDataBean issues(JiraExpressionEvaluationMetaDataBeanIssues issues) {
    
    this.issues = issues;
    return this;
  }

   /**
   * Get issues
   * @return issues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JiraExpressionEvaluationMetaDataBeanIssues getIssues() {
    return issues;
  }


  public void setIssues(JiraExpressionEvaluationMetaDataBeanIssues issues) {
    this.issues = issues;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraExpressionEvaluationMetaDataBean jiraExpressionEvaluationMetaDataBean = (JiraExpressionEvaluationMetaDataBean) o;
    return Objects.equals(this.complexity, jiraExpressionEvaluationMetaDataBean.complexity) &&
        Objects.equals(this.issues, jiraExpressionEvaluationMetaDataBean.issues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complexity, issues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraExpressionEvaluationMetaDataBean {\n");
    sb.append("    complexity: ").append(toIndentedString(complexity)).append("\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
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
    openapiFields.add("complexity");
    openapiFields.add("issues");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JiraExpressionEvaluationMetaDataBean
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JiraExpressionEvaluationMetaDataBean.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JiraExpressionEvaluationMetaDataBean is not found in the empty JSON string", JiraExpressionEvaluationMetaDataBean.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JiraExpressionEvaluationMetaDataBean.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JiraExpressionEvaluationMetaDataBean` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `complexity`
      if (jsonObj.get("complexity") != null && !jsonObj.get("complexity").isJsonNull()) {
        JiraExpressionEvaluationMetaDataBeanComplexity.validateJsonObject(jsonObj.getAsJsonObject("complexity"));
      }
      // validate the optional field `issues`
      if (jsonObj.get("issues") != null && !jsonObj.get("issues").isJsonNull()) {
        JiraExpressionEvaluationMetaDataBeanIssues.validateJsonObject(jsonObj.getAsJsonObject("issues"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JiraExpressionEvaluationMetaDataBean.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JiraExpressionEvaluationMetaDataBean' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JiraExpressionEvaluationMetaDataBean> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JiraExpressionEvaluationMetaDataBean.class));

       return (TypeAdapter<T>) new TypeAdapter<JiraExpressionEvaluationMetaDataBean>() {
           @Override
           public void write(JsonWriter out, JiraExpressionEvaluationMetaDataBean value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JiraExpressionEvaluationMetaDataBean read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JiraExpressionEvaluationMetaDataBean given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JiraExpressionEvaluationMetaDataBean
  * @throws IOException if the JSON string is invalid with respect to JiraExpressionEvaluationMetaDataBean
  */
  public static JiraExpressionEvaluationMetaDataBean fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JiraExpressionEvaluationMetaDataBean.class);
  }

 /**
  * Convert an instance of JiraExpressionEvaluationMetaDataBean to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

