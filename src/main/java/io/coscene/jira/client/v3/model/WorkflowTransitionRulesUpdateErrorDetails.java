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
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashSet;
import java.util.Map.Entry;

import io.coscene.jira.client.v3.JSON;

/**
 * Details of any errors encountered while updating workflow transition rules for a workflow.
 */
@ApiModel(description = "Details of any errors encountered while updating workflow transition rules for a workflow.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class WorkflowTransitionRulesUpdateErrorDetails {
  public static final String SERIALIZED_NAME_WORKFLOW_ID = "workflowId";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_ID)
  private WorkflowId workflowId;

  public static final String SERIALIZED_NAME_RULE_UPDATE_ERRORS = "ruleUpdateErrors";
  @SerializedName(SERIALIZED_NAME_RULE_UPDATE_ERRORS)
  private Map<String, Set<String>> ruleUpdateErrors = new HashMap<>();

  public static final String SERIALIZED_NAME_UPDATE_ERRORS = "updateErrors";
  @SerializedName(SERIALIZED_NAME_UPDATE_ERRORS)
  private Set<String> updateErrors = new LinkedHashSet<>();

  public WorkflowTransitionRulesUpdateErrorDetails() {
  }

  public WorkflowTransitionRulesUpdateErrorDetails workflowId(WorkflowId workflowId) {
    
    this.workflowId = workflowId;
    return this;
  }

   /**
   * Get workflowId
   * @return workflowId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public WorkflowId getWorkflowId() {
    return workflowId;
  }


  public void setWorkflowId(WorkflowId workflowId) {
    this.workflowId = workflowId;
  }


  public WorkflowTransitionRulesUpdateErrorDetails ruleUpdateErrors(Map<String, Set<String>> ruleUpdateErrors) {
    
    this.ruleUpdateErrors = ruleUpdateErrors;
    return this;
  }

  public WorkflowTransitionRulesUpdateErrorDetails putRuleUpdateErrorsItem(String key, Set<String> ruleUpdateErrorsItem) {
    this.ruleUpdateErrors.put(key, ruleUpdateErrorsItem);
    return this;
  }

   /**
   * A list of transition rule update errors, indexed by the transition rule ID. Any transition rule that appears here wasn&#39;t updated.
   * @return ruleUpdateErrors
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of transition rule update errors, indexed by the transition rule ID. Any transition rule that appears here wasn't updated.")

  public Map<String, Set<String>> getRuleUpdateErrors() {
    return ruleUpdateErrors;
  }


  public void setRuleUpdateErrors(Map<String, Set<String>> ruleUpdateErrors) {
    this.ruleUpdateErrors = ruleUpdateErrors;
  }


  public WorkflowTransitionRulesUpdateErrorDetails updateErrors(Set<String> updateErrors) {
    
    this.updateErrors = updateErrors;
    return this;
  }

  public WorkflowTransitionRulesUpdateErrorDetails addUpdateErrorsItem(String updateErrorsItem) {
    this.updateErrors.add(updateErrorsItem);
    return this;
  }

   /**
   * The list of errors that specify why the workflow update failed. The workflow was not updated if the list contains any entries.
   * @return updateErrors
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The list of errors that specify why the workflow update failed. The workflow was not updated if the list contains any entries.")

  public Set<String> getUpdateErrors() {
    return updateErrors;
  }


  public void setUpdateErrors(Set<String> updateErrors) {
    this.updateErrors = updateErrors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowTransitionRulesUpdateErrorDetails workflowTransitionRulesUpdateErrorDetails = (WorkflowTransitionRulesUpdateErrorDetails) o;
    return Objects.equals(this.workflowId, workflowTransitionRulesUpdateErrorDetails.workflowId) &&
        Objects.equals(this.ruleUpdateErrors, workflowTransitionRulesUpdateErrorDetails.ruleUpdateErrors) &&
        Objects.equals(this.updateErrors, workflowTransitionRulesUpdateErrorDetails.updateErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflowId, ruleUpdateErrors, updateErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowTransitionRulesUpdateErrorDetails {\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    ruleUpdateErrors: ").append(toIndentedString(ruleUpdateErrors)).append("\n");
    sb.append("    updateErrors: ").append(toIndentedString(updateErrors)).append("\n");
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
    openapiFields.add("workflowId");
    openapiFields.add("ruleUpdateErrors");
    openapiFields.add("updateErrors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("workflowId");
    openapiRequiredFields.add("ruleUpdateErrors");
    openapiRequiredFields.add("updateErrors");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkflowTransitionRulesUpdateErrorDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WorkflowTransitionRulesUpdateErrorDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkflowTransitionRulesUpdateErrorDetails is not found in the empty JSON string", WorkflowTransitionRulesUpdateErrorDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WorkflowTransitionRulesUpdateErrorDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkflowTransitionRulesUpdateErrorDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WorkflowTransitionRulesUpdateErrorDetails.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `workflowId`
      if (jsonObj.get("workflowId") != null && !jsonObj.get("workflowId").isJsonNull()) {
        WorkflowId.validateJsonObject(jsonObj.getAsJsonObject("workflowId"));
      }
      // ensure the json data is an array
      if ((jsonObj.get("updateErrors") != null && !jsonObj.get("updateErrors").isJsonNull()) && !jsonObj.get("updateErrors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `updateErrors` to be an array in the JSON string but got `%s`", jsonObj.get("updateErrors").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkflowTransitionRulesUpdateErrorDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkflowTransitionRulesUpdateErrorDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkflowTransitionRulesUpdateErrorDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkflowTransitionRulesUpdateErrorDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkflowTransitionRulesUpdateErrorDetails>() {
           @Override
           public void write(JsonWriter out, WorkflowTransitionRulesUpdateErrorDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkflowTransitionRulesUpdateErrorDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkflowTransitionRulesUpdateErrorDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkflowTransitionRulesUpdateErrorDetails
  * @throws IOException if the JSON string is invalid with respect to WorkflowTransitionRulesUpdateErrorDetails
  */
  public static WorkflowTransitionRulesUpdateErrorDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkflowTransitionRulesUpdateErrorDetails.class);
  }

 /**
  * Convert an instance of WorkflowTransitionRulesUpdateErrorDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

