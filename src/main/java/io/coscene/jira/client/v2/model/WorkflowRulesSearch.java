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
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import io.coscene.jira.client.v2.JSON;

/**
 * Details of the workflow and its transition rules.
 */
@ApiModel(description = "Details of the workflow and its transition rules.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class WorkflowRulesSearch {
  public static final String SERIALIZED_NAME_WORKFLOW_ENTITY_ID = "workflowEntityId";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_ENTITY_ID)
  private UUID workflowEntityId;

  public static final String SERIALIZED_NAME_RULE_IDS = "ruleIds";
  @SerializedName(SERIALIZED_NAME_RULE_IDS)
  private List<UUID> ruleIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_EXPAND = "expand";
  @SerializedName(SERIALIZED_NAME_EXPAND)
  private String expand;

  public WorkflowRulesSearch() {
  }

  public WorkflowRulesSearch workflowEntityId(UUID workflowEntityId) {
    
    this.workflowEntityId = workflowEntityId;
    return this;
  }

   /**
   * The workflow ID.
   * @return workflowEntityId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "a498d711-685d-428d-8c3e-bc03bb450ea7", required = true, value = "The workflow ID.")

  public UUID getWorkflowEntityId() {
    return workflowEntityId;
  }


  public void setWorkflowEntityId(UUID workflowEntityId) {
    this.workflowEntityId = workflowEntityId;
  }


  public WorkflowRulesSearch ruleIds(List<UUID> ruleIds) {
    
    this.ruleIds = ruleIds;
    return this;
  }

  public WorkflowRulesSearch addRuleIdsItem(UUID ruleIdsItem) {
    this.ruleIds.add(ruleIdsItem);
    return this;
  }

   /**
   * The list of workflow rule IDs.
   * @return ruleIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The list of workflow rule IDs.")

  public List<UUID> getRuleIds() {
    return ruleIds;
  }


  public void setRuleIds(List<UUID> ruleIds) {
    this.ruleIds = ruleIds;
  }


  public WorkflowRulesSearch expand(String expand) {
    
    this.expand = expand;
    return this;
  }

   /**
   * Use expand to include additional information in the response. This parameter accepts &#x60;transition&#x60; which, for each rule, returns information about the transition the rule is assigned to.
   * @return expand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "transition", value = "Use expand to include additional information in the response. This parameter accepts `transition` which, for each rule, returns information about the transition the rule is assigned to.")

  public String getExpand() {
    return expand;
  }


  public void setExpand(String expand) {
    this.expand = expand;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowRulesSearch workflowRulesSearch = (WorkflowRulesSearch) o;
    return Objects.equals(this.workflowEntityId, workflowRulesSearch.workflowEntityId) &&
        Objects.equals(this.ruleIds, workflowRulesSearch.ruleIds) &&
        Objects.equals(this.expand, workflowRulesSearch.expand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflowEntityId, ruleIds, expand);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowRulesSearch {\n");
    sb.append("    workflowEntityId: ").append(toIndentedString(workflowEntityId)).append("\n");
    sb.append("    ruleIds: ").append(toIndentedString(ruleIds)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
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
    openapiFields.add("workflowEntityId");
    openapiFields.add("ruleIds");
    openapiFields.add("expand");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("workflowEntityId");
    openapiRequiredFields.add("ruleIds");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkflowRulesSearch
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WorkflowRulesSearch.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkflowRulesSearch is not found in the empty JSON string", WorkflowRulesSearch.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WorkflowRulesSearch.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkflowRulesSearch` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WorkflowRulesSearch.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("workflowEntityId") != null && !jsonObj.get("workflowEntityId").isJsonNull()) && !jsonObj.get("workflowEntityId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workflowEntityId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workflowEntityId").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("ruleIds") != null && !jsonObj.get("ruleIds").isJsonNull()) && !jsonObj.get("ruleIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `ruleIds` to be an array in the JSON string but got `%s`", jsonObj.get("ruleIds").toString()));
      }
      if ((jsonObj.get("expand") != null && !jsonObj.get("expand").isJsonNull()) && !jsonObj.get("expand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expand").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkflowRulesSearch.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkflowRulesSearch' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkflowRulesSearch> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkflowRulesSearch.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkflowRulesSearch>() {
           @Override
           public void write(JsonWriter out, WorkflowRulesSearch value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkflowRulesSearch read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkflowRulesSearch given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkflowRulesSearch
  * @throws IOException if the JSON string is invalid with respect to WorkflowRulesSearch
  */
  public static WorkflowRulesSearch fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkflowRulesSearch.class);
  }

 /**
  * Convert an instance of WorkflowRulesSearch to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

