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
import org.openapitools.client.model.WorkflowCondition;
import org.openapitools.client.model.WorkflowTransitionRule;

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
 * A collection of transition rules.
 */
@ApiModel(description = "A collection of transition rules.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class WorkflowRules {
  public static final String SERIALIZED_NAME_CONDITIONS_TREE = "conditionsTree";
  @SerializedName(SERIALIZED_NAME_CONDITIONS_TREE)
  private WorkflowCondition conditionsTree;

  public static final String SERIALIZED_NAME_VALIDATORS = "validators";
  @SerializedName(SERIALIZED_NAME_VALIDATORS)
  private List<WorkflowTransitionRule> validators = null;

  public static final String SERIALIZED_NAME_POST_FUNCTIONS = "postFunctions";
  @SerializedName(SERIALIZED_NAME_POST_FUNCTIONS)
  private List<WorkflowTransitionRule> postFunctions = null;

  public WorkflowRules() {
  }

  public WorkflowRules conditionsTree(WorkflowCondition conditionsTree) {
    
    this.conditionsTree = conditionsTree;
    return this;
  }

   /**
   * Get conditionsTree
   * @return conditionsTree
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkflowCondition getConditionsTree() {
    return conditionsTree;
  }


  public void setConditionsTree(WorkflowCondition conditionsTree) {
    this.conditionsTree = conditionsTree;
  }


  public WorkflowRules validators(List<WorkflowTransitionRule> validators) {
    
    this.validators = validators;
    return this;
  }

  public WorkflowRules addValidatorsItem(WorkflowTransitionRule validatorsItem) {
    if (this.validators == null) {
      this.validators = new ArrayList<>();
    }
    this.validators.add(validatorsItem);
    return this;
  }

   /**
   * The workflow validators.
   * @return validators
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The workflow validators.")

  public List<WorkflowTransitionRule> getValidators() {
    return validators;
  }


  public void setValidators(List<WorkflowTransitionRule> validators) {
    this.validators = validators;
  }


  public WorkflowRules postFunctions(List<WorkflowTransitionRule> postFunctions) {
    
    this.postFunctions = postFunctions;
    return this;
  }

  public WorkflowRules addPostFunctionsItem(WorkflowTransitionRule postFunctionsItem) {
    if (this.postFunctions == null) {
      this.postFunctions = new ArrayList<>();
    }
    this.postFunctions.add(postFunctionsItem);
    return this;
  }

   /**
   * The workflow post functions.
   * @return postFunctions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The workflow post functions.")

  public List<WorkflowTransitionRule> getPostFunctions() {
    return postFunctions;
  }


  public void setPostFunctions(List<WorkflowTransitionRule> postFunctions) {
    this.postFunctions = postFunctions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowRules workflowRules = (WorkflowRules) o;
    return Objects.equals(this.conditionsTree, workflowRules.conditionsTree) &&
        Objects.equals(this.validators, workflowRules.validators) &&
        Objects.equals(this.postFunctions, workflowRules.postFunctions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionsTree, validators, postFunctions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowRules {\n");
    sb.append("    conditionsTree: ").append(toIndentedString(conditionsTree)).append("\n");
    sb.append("    validators: ").append(toIndentedString(validators)).append("\n");
    sb.append("    postFunctions: ").append(toIndentedString(postFunctions)).append("\n");
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
    openapiFields.add("conditionsTree");
    openapiFields.add("validators");
    openapiFields.add("postFunctions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkflowRules
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WorkflowRules.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkflowRules is not found in the empty JSON string", WorkflowRules.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WorkflowRules.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkflowRules` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `conditionsTree`
      if (jsonObj.get("conditionsTree") != null && !jsonObj.get("conditionsTree").isJsonNull()) {
        WorkflowCondition.validateJsonObject(jsonObj.getAsJsonObject("conditionsTree"));
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
            WorkflowTransitionRule.validateJsonObject(jsonArrayvalidators.get(i).getAsJsonObject());
          };
        }
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
            WorkflowTransitionRule.validateJsonObject(jsonArraypostFunctions.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkflowRules.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkflowRules' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkflowRules> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkflowRules.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkflowRules>() {
           @Override
           public void write(JsonWriter out, WorkflowRules value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkflowRules read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkflowRules given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkflowRules
  * @throws IOException if the JSON string is invalid with respect to WorkflowRules
  */
  public static WorkflowRules fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkflowRules.class);
  }

 /**
  * Convert an instance of WorkflowRules to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

