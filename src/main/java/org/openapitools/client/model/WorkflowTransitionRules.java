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
import org.openapitools.client.model.ConnectWorkflowTransitionRule;
import org.openapitools.client.model.WorkflowId;

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
 * A workflow with transition rules.
 */
@ApiModel(description = "A workflow with transition rules.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class WorkflowTransitionRules {
  public static final String SERIALIZED_NAME_WORKFLOW_ID = "workflowId";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_ID)
  private WorkflowId workflowId;

  public static final String SERIALIZED_NAME_POST_FUNCTIONS = "postFunctions";
  @SerializedName(SERIALIZED_NAME_POST_FUNCTIONS)
  private List<ConnectWorkflowTransitionRule> postFunctions = null;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<ConnectWorkflowTransitionRule> conditions = null;

  public static final String SERIALIZED_NAME_VALIDATORS = "validators";
  @SerializedName(SERIALIZED_NAME_VALIDATORS)
  private List<ConnectWorkflowTransitionRule> validators = null;

  public WorkflowTransitionRules() {
  }

  public WorkflowTransitionRules workflowId(WorkflowId workflowId) {
    
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


  public WorkflowTransitionRules postFunctions(List<ConnectWorkflowTransitionRule> postFunctions) {
    
    this.postFunctions = postFunctions;
    return this;
  }

  public WorkflowTransitionRules addPostFunctionsItem(ConnectWorkflowTransitionRule postFunctionsItem) {
    if (this.postFunctions == null) {
      this.postFunctions = new ArrayList<>();
    }
    this.postFunctions.add(postFunctionsItem);
    return this;
  }

   /**
   * The list of post functions within the workflow.
   * @return postFunctions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of post functions within the workflow.")

  public List<ConnectWorkflowTransitionRule> getPostFunctions() {
    return postFunctions;
  }


  public void setPostFunctions(List<ConnectWorkflowTransitionRule> postFunctions) {
    this.postFunctions = postFunctions;
  }


  public WorkflowTransitionRules conditions(List<ConnectWorkflowTransitionRule> conditions) {
    
    this.conditions = conditions;
    return this;
  }

  public WorkflowTransitionRules addConditionsItem(ConnectWorkflowTransitionRule conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * The list of conditions within the workflow.
   * @return conditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of conditions within the workflow.")

  public List<ConnectWorkflowTransitionRule> getConditions() {
    return conditions;
  }


  public void setConditions(List<ConnectWorkflowTransitionRule> conditions) {
    this.conditions = conditions;
  }


  public WorkflowTransitionRules validators(List<ConnectWorkflowTransitionRule> validators) {
    
    this.validators = validators;
    return this;
  }

  public WorkflowTransitionRules addValidatorsItem(ConnectWorkflowTransitionRule validatorsItem) {
    if (this.validators == null) {
      this.validators = new ArrayList<>();
    }
    this.validators.add(validatorsItem);
    return this;
  }

   /**
   * The list of validators within the workflow.
   * @return validators
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of validators within the workflow.")

  public List<ConnectWorkflowTransitionRule> getValidators() {
    return validators;
  }


  public void setValidators(List<ConnectWorkflowTransitionRule> validators) {
    this.validators = validators;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowTransitionRules workflowTransitionRules = (WorkflowTransitionRules) o;
    return Objects.equals(this.workflowId, workflowTransitionRules.workflowId) &&
        Objects.equals(this.postFunctions, workflowTransitionRules.postFunctions) &&
        Objects.equals(this.conditions, workflowTransitionRules.conditions) &&
        Objects.equals(this.validators, workflowTransitionRules.validators);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflowId, postFunctions, conditions, validators);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowTransitionRules {\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
    sb.append("    postFunctions: ").append(toIndentedString(postFunctions)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    validators: ").append(toIndentedString(validators)).append("\n");
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
    openapiFields.add("postFunctions");
    openapiFields.add("conditions");
    openapiFields.add("validators");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("workflowId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkflowTransitionRules
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WorkflowTransitionRules.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkflowTransitionRules is not found in the empty JSON string", WorkflowTransitionRules.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WorkflowTransitionRules.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkflowTransitionRules` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WorkflowTransitionRules.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `workflowId`
      if (jsonObj.get("workflowId") != null && !jsonObj.get("workflowId").isJsonNull()) {
        WorkflowId.validateJsonObject(jsonObj.getAsJsonObject("workflowId"));
      }
      if (jsonObj.get("postFunctions") != null && !jsonObj.get("postFunctions").isJsonNull()) {
        JsonArray jsonArraypostFunctions = jsonObj.getAsJsonArray("postFunctions");
        if (jsonArraypostFunctions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("postFunctions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `postFunctions` to be an array in the JSON string but got `%s`", jsonObj.get("postFunctions").toString()));
          }

          // validate the optional field `postFunctions` (array)
          for (int i = 0; i < jsonArraypostFunctions.size(); i++) {
            ConnectWorkflowTransitionRule.validateJsonObject(jsonArraypostFunctions.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("conditions") != null && !jsonObj.get("conditions").isJsonNull()) {
        JsonArray jsonArrayconditions = jsonObj.getAsJsonArray("conditions");
        if (jsonArrayconditions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("conditions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `conditions` to be an array in the JSON string but got `%s`", jsonObj.get("conditions").toString()));
          }

          // validate the optional field `conditions` (array)
          for (int i = 0; i < jsonArrayconditions.size(); i++) {
            ConnectWorkflowTransitionRule.validateJsonObject(jsonArrayconditions.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("validators") != null && !jsonObj.get("validators").isJsonNull()) {
        JsonArray jsonArrayvalidators = jsonObj.getAsJsonArray("validators");
        if (jsonArrayvalidators != null) {
          // ensure the json data is an array
          if (!jsonObj.get("validators").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `validators` to be an array in the JSON string but got `%s`", jsonObj.get("validators").toString()));
          }

          // validate the optional field `validators` (array)
          for (int i = 0; i < jsonArrayvalidators.size(); i++) {
            ConnectWorkflowTransitionRule.validateJsonObject(jsonArrayvalidators.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkflowTransitionRules.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkflowTransitionRules' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkflowTransitionRules> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkflowTransitionRules.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkflowTransitionRules>() {
           @Override
           public void write(JsonWriter out, WorkflowTransitionRules value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkflowTransitionRules read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkflowTransitionRules given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkflowTransitionRules
  * @throws IOException if the JSON string is invalid with respect to WorkflowTransitionRules
  */
  public static WorkflowTransitionRules fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkflowTransitionRules.class);
  }

 /**
  * Convert an instance of WorkflowTransitionRules to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
