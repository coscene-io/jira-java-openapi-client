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
 * The collection of issues that is available under the &#x60;issues&#x60; variable when evaluating the expression.
 */
@ApiModel(description = "The collection of issues that is available under the `issues` variable when evaluating the expression.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class JiraExpressionEvalContextBeanIssues {
  public static final String SERIALIZED_NAME_JQL = "jql";
  @SerializedName(SERIALIZED_NAME_JQL)
  private JexpIssuesJql jql;

  public JiraExpressionEvalContextBeanIssues() {
  }

  public JiraExpressionEvalContextBeanIssues jql(JexpIssuesJql jql) {
    
    this.jql = jql;
    return this;
  }

   /**
   * Get jql
   * @return jql
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JexpIssuesJql getJql() {
    return jql;
  }


  public void setJql(JexpIssuesJql jql) {
    this.jql = jql;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraExpressionEvalContextBeanIssues jiraExpressionEvalContextBeanIssues = (JiraExpressionEvalContextBeanIssues) o;
    return Objects.equals(this.jql, jiraExpressionEvalContextBeanIssues.jql);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jql);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraExpressionEvalContextBeanIssues {\n");
    sb.append("    jql: ").append(toIndentedString(jql)).append("\n");
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
    openapiFields.add("jql");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JiraExpressionEvalContextBeanIssues
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JiraExpressionEvalContextBeanIssues.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JiraExpressionEvalContextBeanIssues is not found in the empty JSON string", JiraExpressionEvalContextBeanIssues.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JiraExpressionEvalContextBeanIssues.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JiraExpressionEvalContextBeanIssues` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `jql`
      if (jsonObj.get("jql") != null && !jsonObj.get("jql").isJsonNull()) {
        JexpIssuesJql.validateJsonObject(jsonObj.getAsJsonObject("jql"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JiraExpressionEvalContextBeanIssues.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JiraExpressionEvalContextBeanIssues' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JiraExpressionEvalContextBeanIssues> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JiraExpressionEvalContextBeanIssues.class));

       return (TypeAdapter<T>) new TypeAdapter<JiraExpressionEvalContextBeanIssues>() {
           @Override
           public void write(JsonWriter out, JiraExpressionEvalContextBeanIssues value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JiraExpressionEvalContextBeanIssues read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JiraExpressionEvalContextBeanIssues given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JiraExpressionEvalContextBeanIssues
  * @throws IOException if the JSON string is invalid with respect to JiraExpressionEvalContextBeanIssues
  */
  public static JiraExpressionEvalContextBeanIssues fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JiraExpressionEvalContextBeanIssues.class);
  }

 /**
  * Convert an instance of JiraExpressionEvalContextBeanIssues to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

