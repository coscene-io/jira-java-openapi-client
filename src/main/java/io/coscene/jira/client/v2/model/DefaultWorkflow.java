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
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import io.coscene.jira.client.v2.JSON;

/**
 * Details about the default workflow.
 */
@ApiModel(description = "Details about the default workflow.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class DefaultWorkflow {
  public static final String SERIALIZED_NAME_WORKFLOW = "workflow";
  @SerializedName(SERIALIZED_NAME_WORKFLOW)
  private String workflow;

  public static final String SERIALIZED_NAME_UPDATE_DRAFT_IF_NEEDED = "updateDraftIfNeeded";
  @SerializedName(SERIALIZED_NAME_UPDATE_DRAFT_IF_NEEDED)
  private Boolean updateDraftIfNeeded;

  public DefaultWorkflow() {
  }

  public DefaultWorkflow workflow(String workflow) {
    
    this.workflow = workflow;
    return this;
  }

   /**
   * The name of the workflow to set as the default workflow.
   * @return workflow
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the workflow to set as the default workflow.")

  public String getWorkflow() {
    return workflow;
  }


  public void setWorkflow(String workflow) {
    this.workflow = workflow;
  }


  public DefaultWorkflow updateDraftIfNeeded(Boolean updateDraftIfNeeded) {
    
    this.updateDraftIfNeeded = updateDraftIfNeeded;
    return this;
  }

   /**
   * Whether a draft workflow scheme is created or updated when updating an active workflow scheme. The draft is updated with the new default workflow. Defaults to &#x60;false&#x60;.
   * @return updateDraftIfNeeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether a draft workflow scheme is created or updated when updating an active workflow scheme. The draft is updated with the new default workflow. Defaults to `false`.")

  public Boolean getUpdateDraftIfNeeded() {
    return updateDraftIfNeeded;
  }


  public void setUpdateDraftIfNeeded(Boolean updateDraftIfNeeded) {
    this.updateDraftIfNeeded = updateDraftIfNeeded;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultWorkflow defaultWorkflow = (DefaultWorkflow) o;
    return Objects.equals(this.workflow, defaultWorkflow.workflow) &&
        Objects.equals(this.updateDraftIfNeeded, defaultWorkflow.updateDraftIfNeeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflow, updateDraftIfNeeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultWorkflow {\n");
    sb.append("    workflow: ").append(toIndentedString(workflow)).append("\n");
    sb.append("    updateDraftIfNeeded: ").append(toIndentedString(updateDraftIfNeeded)).append("\n");
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
    openapiFields.add("workflow");
    openapiFields.add("updateDraftIfNeeded");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("workflow");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DefaultWorkflow
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DefaultWorkflow.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DefaultWorkflow is not found in the empty JSON string", DefaultWorkflow.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DefaultWorkflow.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DefaultWorkflow` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DefaultWorkflow.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("workflow") != null && !jsonObj.get("workflow").isJsonNull()) && !jsonObj.get("workflow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `workflow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("workflow").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DefaultWorkflow.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DefaultWorkflow' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DefaultWorkflow> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DefaultWorkflow.class));

       return (TypeAdapter<T>) new TypeAdapter<DefaultWorkflow>() {
           @Override
           public void write(JsonWriter out, DefaultWorkflow value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DefaultWorkflow read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DefaultWorkflow given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DefaultWorkflow
  * @throws IOException if the JSON string is invalid with respect to DefaultWorkflow
  */
  public static DefaultWorkflow fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DefaultWorkflow.class);
  }

 /**
  * Convert an instance of DefaultWorkflow to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

