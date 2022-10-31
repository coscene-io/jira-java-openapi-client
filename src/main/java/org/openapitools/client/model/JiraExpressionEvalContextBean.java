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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.CustomContextVariable;
import org.openapitools.client.model.JiraExpressionEvalContextBeanIssue;
import org.openapitools.client.model.JiraExpressionEvalContextBeanIssues;
import org.openapitools.client.model.JiraExpressionEvalContextBeanProject;

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
 * JiraExpressionEvalContextBean
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class JiraExpressionEvalContextBean {
  public static final String SERIALIZED_NAME_ISSUE = "issue";
  @SerializedName(SERIALIZED_NAME_ISSUE)
  private JiraExpressionEvalContextBeanIssue issue;

  public static final String SERIALIZED_NAME_ISSUES = "issues";
  @SerializedName(SERIALIZED_NAME_ISSUES)
  private JiraExpressionEvalContextBeanIssues issues;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private JiraExpressionEvalContextBeanProject project;

  public static final String SERIALIZED_NAME_SPRINT = "sprint";
  @SerializedName(SERIALIZED_NAME_SPRINT)
  private Long sprint;

  public static final String SERIALIZED_NAME_BOARD = "board";
  @SerializedName(SERIALIZED_NAME_BOARD)
  private Long board;

  public static final String SERIALIZED_NAME_SERVICE_DESK = "serviceDesk";
  @SerializedName(SERIALIZED_NAME_SERVICE_DESK)
  private Long serviceDesk;

  public static final String SERIALIZED_NAME_CUSTOMER_REQUEST = "customerRequest";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_REQUEST)
  private Long customerRequest;

  public static final String SERIALIZED_NAME_CUSTOM = "custom";
  @SerializedName(SERIALIZED_NAME_CUSTOM)
  private List<CustomContextVariable> custom = null;

  public JiraExpressionEvalContextBean() {
  }

  public JiraExpressionEvalContextBean issue(JiraExpressionEvalContextBeanIssue issue) {
    
    this.issue = issue;
    return this;
  }

   /**
   * Get issue
   * @return issue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JiraExpressionEvalContextBeanIssue getIssue() {
    return issue;
  }


  public void setIssue(JiraExpressionEvalContextBeanIssue issue) {
    this.issue = issue;
  }


  public JiraExpressionEvalContextBean issues(JiraExpressionEvalContextBeanIssues issues) {
    
    this.issues = issues;
    return this;
  }

   /**
   * Get issues
   * @return issues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JiraExpressionEvalContextBeanIssues getIssues() {
    return issues;
  }


  public void setIssues(JiraExpressionEvalContextBeanIssues issues) {
    this.issues = issues;
  }


  public JiraExpressionEvalContextBean project(JiraExpressionEvalContextBeanProject project) {
    
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JiraExpressionEvalContextBeanProject getProject() {
    return project;
  }


  public void setProject(JiraExpressionEvalContextBeanProject project) {
    this.project = project;
  }


  public JiraExpressionEvalContextBean sprint(Long sprint) {
    
    this.sprint = sprint;
    return this;
  }

   /**
   * The ID of the sprint that is available under the &#x60;sprint&#x60; variable when evaluating the expression.
   * @return sprint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the sprint that is available under the `sprint` variable when evaluating the expression.")

  public Long getSprint() {
    return sprint;
  }


  public void setSprint(Long sprint) {
    this.sprint = sprint;
  }


  public JiraExpressionEvalContextBean board(Long board) {
    
    this.board = board;
    return this;
  }

   /**
   * The ID of the board that is available under the &#x60;board&#x60; variable when evaluating the expression.
   * @return board
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the board that is available under the `board` variable when evaluating the expression.")

  public Long getBoard() {
    return board;
  }


  public void setBoard(Long board) {
    this.board = board;
  }


  public JiraExpressionEvalContextBean serviceDesk(Long serviceDesk) {
    
    this.serviceDesk = serviceDesk;
    return this;
  }

   /**
   * The ID of the service desk that is available under the &#x60;serviceDesk&#x60; variable when evaluating the expression.
   * @return serviceDesk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the service desk that is available under the `serviceDesk` variable when evaluating the expression.")

  public Long getServiceDesk() {
    return serviceDesk;
  }


  public void setServiceDesk(Long serviceDesk) {
    this.serviceDesk = serviceDesk;
  }


  public JiraExpressionEvalContextBean customerRequest(Long customerRequest) {
    
    this.customerRequest = customerRequest;
    return this;
  }

   /**
   * The ID of the customer request that is available under the &#x60;customerRequest&#x60; variable when evaluating the expression. This is the same as the ID of the underlying Jira issue, but the customer request context variable will have a different type.
   * @return customerRequest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the customer request that is available under the `customerRequest` variable when evaluating the expression. This is the same as the ID of the underlying Jira issue, but the customer request context variable will have a different type.")

  public Long getCustomerRequest() {
    return customerRequest;
  }


  public void setCustomerRequest(Long customerRequest) {
    this.customerRequest = customerRequest;
  }


  public JiraExpressionEvalContextBean custom(List<CustomContextVariable> custom) {
    
    this.custom = custom;
    return this;
  }

  public JiraExpressionEvalContextBean addCustomItem(CustomContextVariable customItem) {
    if (this.custom == null) {
      this.custom = new ArrayList<>();
    }
    this.custom.add(customItem);
    return this;
  }

   /**
   * Custom context variables and their types. These variable types are available for use in a custom context:   *  &#x60;user&#x60;: A [user](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#user) specified as an Atlassian account ID.  *  &#x60;issue&#x60;: An [issue](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#issue) specified by ID or key. All the fields of the issue object are available in the Jira expression.  *  &#x60;json&#x60;: A JSON object containing custom content.  *  &#x60;list&#x60;: A JSON list of &#x60;user&#x60;, &#x60;issue&#x60;, or &#x60;json&#x60; variable types.
   * @return custom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Custom context variables and their types. These variable types are available for use in a custom context:   *  `user`: A [user](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#user) specified as an Atlassian account ID.  *  `issue`: An [issue](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#issue) specified by ID or key. All the fields of the issue object are available in the Jira expression.  *  `json`: A JSON object containing custom content.  *  `list`: A JSON list of `user`, `issue`, or `json` variable types.")

  public List<CustomContextVariable> getCustom() {
    return custom;
  }


  public void setCustom(List<CustomContextVariable> custom) {
    this.custom = custom;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraExpressionEvalContextBean jiraExpressionEvalContextBean = (JiraExpressionEvalContextBean) o;
    return Objects.equals(this.issue, jiraExpressionEvalContextBean.issue) &&
        Objects.equals(this.issues, jiraExpressionEvalContextBean.issues) &&
        Objects.equals(this.project, jiraExpressionEvalContextBean.project) &&
        Objects.equals(this.sprint, jiraExpressionEvalContextBean.sprint) &&
        Objects.equals(this.board, jiraExpressionEvalContextBean.board) &&
        Objects.equals(this.serviceDesk, jiraExpressionEvalContextBean.serviceDesk) &&
        Objects.equals(this.customerRequest, jiraExpressionEvalContextBean.customerRequest) &&
        Objects.equals(this.custom, jiraExpressionEvalContextBean.custom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issue, issues, project, sprint, board, serviceDesk, customerRequest, custom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraExpressionEvalContextBean {\n");
    sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    sprint: ").append(toIndentedString(sprint)).append("\n");
    sb.append("    board: ").append(toIndentedString(board)).append("\n");
    sb.append("    serviceDesk: ").append(toIndentedString(serviceDesk)).append("\n");
    sb.append("    customerRequest: ").append(toIndentedString(customerRequest)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
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
    openapiFields.add("issue");
    openapiFields.add("issues");
    openapiFields.add("project");
    openapiFields.add("sprint");
    openapiFields.add("board");
    openapiFields.add("serviceDesk");
    openapiFields.add("customerRequest");
    openapiFields.add("custom");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JiraExpressionEvalContextBean
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JiraExpressionEvalContextBean.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JiraExpressionEvalContextBean is not found in the empty JSON string", JiraExpressionEvalContextBean.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JiraExpressionEvalContextBean.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JiraExpressionEvalContextBean` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `issue`
      if (jsonObj.get("issue") != null && !jsonObj.get("issue").isJsonNull()) {
        JiraExpressionEvalContextBeanIssue.validateJsonObject(jsonObj.getAsJsonObject("issue"));
      }
      // validate the optional field `issues`
      if (jsonObj.get("issues") != null && !jsonObj.get("issues").isJsonNull()) {
        JiraExpressionEvalContextBeanIssues.validateJsonObject(jsonObj.getAsJsonObject("issues"));
      }
      // validate the optional field `project`
      if (jsonObj.get("project") != null && !jsonObj.get("project").isJsonNull()) {
        JiraExpressionEvalContextBeanProject.validateJsonObject(jsonObj.getAsJsonObject("project"));
      }
      if (jsonObj.get("custom") != null && !jsonObj.get("custom").isJsonNull()) {
        JsonArray jsonArraycustom = jsonObj.getAsJsonArray("custom");
        if (jsonArraycustom != null) {
          // ensure the json data is an array
          if (!jsonObj.get("custom").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `custom` to be an array in the JSON string but got `%s`", jsonObj.get("custom").toString()));
          }

          // validate the optional field `custom` (array)
          for (int i = 0; i < jsonArraycustom.size(); i++) {
            CustomContextVariable.validateJsonObject(jsonArraycustom.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JiraExpressionEvalContextBean.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JiraExpressionEvalContextBean' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JiraExpressionEvalContextBean> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JiraExpressionEvalContextBean.class));

       return (TypeAdapter<T>) new TypeAdapter<JiraExpressionEvalContextBean>() {
           @Override
           public void write(JsonWriter out, JiraExpressionEvalContextBean value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JiraExpressionEvalContextBean read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JiraExpressionEvalContextBean given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JiraExpressionEvalContextBean
  * @throws IOException if the JSON string is invalid with respect to JiraExpressionEvalContextBean
  */
  public static JiraExpressionEvalContextBean fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JiraExpressionEvalContextBean.class);
  }

 /**
  * Convert an instance of JiraExpressionEvalContextBean to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

