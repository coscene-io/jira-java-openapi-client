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
 * Details of workflows and their transition rules to delete.
 */
@ApiModel(description = "Details of workflows and their transition rules to delete.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class WorkflowsWithTransitionRulesDetails {
  public static final String SERIALIZED_NAME_WORKFLOWS = "workflows";
  @SerializedName(SERIALIZED_NAME_WORKFLOWS)
  private List<WorkflowTransitionRulesDetails> workflows = new ArrayList<>();

  public WorkflowsWithTransitionRulesDetails() {
  }

  public WorkflowsWithTransitionRulesDetails workflows(List<WorkflowTransitionRulesDetails> workflows) {
    
    this.workflows = workflows;
    return this;
  }

  public WorkflowsWithTransitionRulesDetails addWorkflowsItem(WorkflowTransitionRulesDetails workflowsItem) {
    this.workflows.add(workflowsItem);
    return this;
  }

   /**
   * The list of workflows with transition rules to delete.
   * @return workflows
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The list of workflows with transition rules to delete.")

  public List<WorkflowTransitionRulesDetails> getWorkflows() {
    return workflows;
  }


  public void setWorkflows(List<WorkflowTransitionRulesDetails> workflows) {
    this.workflows = workflows;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowsWithTransitionRulesDetails workflowsWithTransitionRulesDetails = (WorkflowsWithTransitionRulesDetails) o;
    return Objects.equals(this.workflows, workflowsWithTransitionRulesDetails.workflows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowsWithTransitionRulesDetails {\n");
    sb.append("    workflows: ").append(toIndentedString(workflows)).append("\n");
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
    openapiFields.add("workflows");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("workflows");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkflowsWithTransitionRulesDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WorkflowsWithTransitionRulesDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkflowsWithTransitionRulesDetails is not found in the empty JSON string", WorkflowsWithTransitionRulesDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WorkflowsWithTransitionRulesDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkflowsWithTransitionRulesDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WorkflowsWithTransitionRulesDetails.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("workflows") != null && !jsonObj.get("workflows").isJsonNull()) {
        JsonArray jsonArrayworkflows = jsonObj.getAsJsonArray("workflows");
        if (jsonArrayworkflows != null) {
          // ensure the json data is an array
          if (!jsonObj.get("workflows").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `workflows` to be an array in the JSON string but got `%s`", jsonObj.get("workflows").toString()));
          }

          // validate the optional field `workflows` (array)
          for (int i = 0; i < jsonArrayworkflows.size(); i++) {
            WorkflowTransitionRulesDetails.validateJsonObject(jsonArrayworkflows.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkflowsWithTransitionRulesDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkflowsWithTransitionRulesDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkflowsWithTransitionRulesDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkflowsWithTransitionRulesDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkflowsWithTransitionRulesDetails>() {
           @Override
           public void write(JsonWriter out, WorkflowsWithTransitionRulesDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkflowsWithTransitionRulesDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkflowsWithTransitionRulesDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkflowsWithTransitionRulesDetails
  * @throws IOException if the JSON string is invalid with respect to WorkflowsWithTransitionRulesDetails
  */
  public static WorkflowsWithTransitionRulesDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkflowsWithTransitionRulesDetails.class);
  }

 /**
  * Convert an instance of WorkflowsWithTransitionRulesDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

