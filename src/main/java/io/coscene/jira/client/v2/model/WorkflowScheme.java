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
import java.net.URI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import io.coscene.jira.client.v2.JSON;

/**
 * Details about a workflow scheme.
 */
@ApiModel(description = "Details about a workflow scheme.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class WorkflowScheme {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DEFAULT_WORKFLOW = "defaultWorkflow";
  @SerializedName(SERIALIZED_NAME_DEFAULT_WORKFLOW)
  private String defaultWorkflow;

  public static final String SERIALIZED_NAME_ISSUE_TYPE_MAPPINGS = "issueTypeMappings";
  @SerializedName(SERIALIZED_NAME_ISSUE_TYPE_MAPPINGS)
  private Map<String, String> issueTypeMappings = null;

  public static final String SERIALIZED_NAME_ORIGINAL_DEFAULT_WORKFLOW = "originalDefaultWorkflow";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_DEFAULT_WORKFLOW)
  private String originalDefaultWorkflow;

  public static final String SERIALIZED_NAME_ORIGINAL_ISSUE_TYPE_MAPPINGS = "originalIssueTypeMappings";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_ISSUE_TYPE_MAPPINGS)
  private Map<String, String> originalIssueTypeMappings = null;

  public static final String SERIALIZED_NAME_DRAFT = "draft";
  @SerializedName(SERIALIZED_NAME_DRAFT)
  private Boolean draft;

  public static final String SERIALIZED_NAME_LAST_MODIFIED_USER = "lastModifiedUser";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED_USER)
  private WorkflowSchemeLastModifiedUser lastModifiedUser;

  public static final String SERIALIZED_NAME_LAST_MODIFIED = "lastModified";
  @SerializedName(SERIALIZED_NAME_LAST_MODIFIED)
  private String lastModified;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private URI self;

  public static final String SERIALIZED_NAME_UPDATE_DRAFT_IF_NEEDED = "updateDraftIfNeeded";
  @SerializedName(SERIALIZED_NAME_UPDATE_DRAFT_IF_NEEDED)
  private Boolean updateDraftIfNeeded;

  public static final String SERIALIZED_NAME_ISSUE_TYPES = "issueTypes";
  @SerializedName(SERIALIZED_NAME_ISSUE_TYPES)
  private Map<String, IssueTypeDetails> issueTypes = null;

  public WorkflowScheme() {
  }

  
  public WorkflowScheme(
     Long id, 
     String originalDefaultWorkflow, 
     Map<String, String> originalIssueTypeMappings, 
     Boolean draft, 
     String lastModified, 
     URI self, 
     Map<String, IssueTypeDetails> issueTypes
  ) {
    this();
    this.id = id;
    this.originalDefaultWorkflow = originalDefaultWorkflow;
    this.originalIssueTypeMappings = originalIssueTypeMappings;
    this.draft = draft;
    this.lastModified = lastModified;
    this.self = self;
    this.issueTypes = issueTypes;
  }

   /**
   * The ID of the workflow scheme.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the workflow scheme.")

  public Long getId() {
    return id;
  }




  public WorkflowScheme name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the workflow scheme. The name must be unique. The maximum length is 255 characters. Required when creating a workflow scheme.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the workflow scheme. The name must be unique. The maximum length is 255 characters. Required when creating a workflow scheme.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public WorkflowScheme description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the workflow scheme.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the workflow scheme.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public WorkflowScheme defaultWorkflow(String defaultWorkflow) {
    
    this.defaultWorkflow = defaultWorkflow;
    return this;
  }

   /**
   * The name of the default workflow for the workflow scheme. The default workflow has *All Unassigned Issue Types* assigned to it in Jira. If &#x60;defaultWorkflow&#x60; is not specified when creating a workflow scheme, it is set to *Jira Workflow (jira)*.
   * @return defaultWorkflow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the default workflow for the workflow scheme. The default workflow has *All Unassigned Issue Types* assigned to it in Jira. If `defaultWorkflow` is not specified when creating a workflow scheme, it is set to *Jira Workflow (jira)*.")

  public String getDefaultWorkflow() {
    return defaultWorkflow;
  }


  public void setDefaultWorkflow(String defaultWorkflow) {
    this.defaultWorkflow = defaultWorkflow;
  }


  public WorkflowScheme issueTypeMappings(Map<String, String> issueTypeMappings) {
    
    this.issueTypeMappings = issueTypeMappings;
    return this;
  }

  public WorkflowScheme putIssueTypeMappingsItem(String key, String issueTypeMappingsItem) {
    if (this.issueTypeMappings == null) {
      this.issueTypeMappings = new HashMap<>();
    }
    this.issueTypeMappings.put(key, issueTypeMappingsItem);
    return this;
  }

   /**
   * The issue type to workflow mappings, where each mapping is an issue type ID and workflow name pair. Note that an issue type can only be mapped to one workflow in a workflow scheme.
   * @return issueTypeMappings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The issue type to workflow mappings, where each mapping is an issue type ID and workflow name pair. Note that an issue type can only be mapped to one workflow in a workflow scheme.")

  public Map<String, String> getIssueTypeMappings() {
    return issueTypeMappings;
  }


  public void setIssueTypeMappings(Map<String, String> issueTypeMappings) {
    this.issueTypeMappings = issueTypeMappings;
  }


   /**
   * For draft workflow schemes, this property is the name of the default workflow for the original workflow scheme. The default workflow has *All Unassigned Issue Types* assigned to it in Jira.
   * @return originalDefaultWorkflow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For draft workflow schemes, this property is the name of the default workflow for the original workflow scheme. The default workflow has *All Unassigned Issue Types* assigned to it in Jira.")

  public String getOriginalDefaultWorkflow() {
    return originalDefaultWorkflow;
  }




   /**
   * For draft workflow schemes, this property is the issue type to workflow mappings for the original workflow scheme, where each mapping is an issue type ID and workflow name pair. Note that an issue type can only be mapped to one workflow in a workflow scheme.
   * @return originalIssueTypeMappings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "For draft workflow schemes, this property is the issue type to workflow mappings for the original workflow scheme, where each mapping is an issue type ID and workflow name pair. Note that an issue type can only be mapped to one workflow in a workflow scheme.")

  public Map<String, String> getOriginalIssueTypeMappings() {
    return originalIssueTypeMappings;
  }




   /**
   * Whether the workflow scheme is a draft or not.
   * @return draft
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the workflow scheme is a draft or not.")

  public Boolean getDraft() {
    return draft;
  }




  public WorkflowScheme lastModifiedUser(WorkflowSchemeLastModifiedUser lastModifiedUser) {
    
    this.lastModifiedUser = lastModifiedUser;
    return this;
  }

   /**
   * Get lastModifiedUser
   * @return lastModifiedUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkflowSchemeLastModifiedUser getLastModifiedUser() {
    return lastModifiedUser;
  }


  public void setLastModifiedUser(WorkflowSchemeLastModifiedUser lastModifiedUser) {
    this.lastModifiedUser = lastModifiedUser;
  }


   /**
   * The date-time that the draft workflow scheme was last modified. A modification is a change to the issue type-project mappings only. This property does not apply to non-draft workflows.
   * @return lastModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date-time that the draft workflow scheme was last modified. A modification is a change to the issue type-project mappings only. This property does not apply to non-draft workflows.")

  public String getLastModified() {
    return lastModified;
  }




   /**
   * Get self
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public URI getSelf() {
    return self;
  }




  public WorkflowScheme updateDraftIfNeeded(Boolean updateDraftIfNeeded) {
    
    this.updateDraftIfNeeded = updateDraftIfNeeded;
    return this;
  }

   /**
   * Whether to create or update a draft workflow scheme when updating an active workflow scheme. An active workflow scheme is a workflow scheme that is used by at least one project. The following examples show how this property works:   *  Update an active workflow scheme with &#x60;updateDraftIfNeeded&#x60; set to &#x60;true&#x60;: If a draft workflow scheme exists, it is updated. Otherwise, a draft workflow scheme is created.  *  Update an active workflow scheme with &#x60;updateDraftIfNeeded&#x60; set to &#x60;false&#x60;: An error is returned, as active workflow schemes cannot be updated.  *  Update an inactive workflow scheme with &#x60;updateDraftIfNeeded&#x60; set to &#x60;true&#x60;: The workflow scheme is updated, as inactive workflow schemes do not require drafts to update.  Defaults to &#x60;false&#x60;.
   * @return updateDraftIfNeeded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to create or update a draft workflow scheme when updating an active workflow scheme. An active workflow scheme is a workflow scheme that is used by at least one project. The following examples show how this property works:   *  Update an active workflow scheme with `updateDraftIfNeeded` set to `true`: If a draft workflow scheme exists, it is updated. Otherwise, a draft workflow scheme is created.  *  Update an active workflow scheme with `updateDraftIfNeeded` set to `false`: An error is returned, as active workflow schemes cannot be updated.  *  Update an inactive workflow scheme with `updateDraftIfNeeded` set to `true`: The workflow scheme is updated, as inactive workflow schemes do not require drafts to update.  Defaults to `false`.")

  public Boolean getUpdateDraftIfNeeded() {
    return updateDraftIfNeeded;
  }


  public void setUpdateDraftIfNeeded(Boolean updateDraftIfNeeded) {
    this.updateDraftIfNeeded = updateDraftIfNeeded;
  }


   /**
   * The issue types available in Jira.
   * @return issueTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The issue types available in Jira.")

  public Map<String, IssueTypeDetails> getIssueTypes() {
    return issueTypes;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowScheme workflowScheme = (WorkflowScheme) o;
    return Objects.equals(this.id, workflowScheme.id) &&
        Objects.equals(this.name, workflowScheme.name) &&
        Objects.equals(this.description, workflowScheme.description) &&
        Objects.equals(this.defaultWorkflow, workflowScheme.defaultWorkflow) &&
        Objects.equals(this.issueTypeMappings, workflowScheme.issueTypeMappings) &&
        Objects.equals(this.originalDefaultWorkflow, workflowScheme.originalDefaultWorkflow) &&
        Objects.equals(this.originalIssueTypeMappings, workflowScheme.originalIssueTypeMappings) &&
        Objects.equals(this.draft, workflowScheme.draft) &&
        Objects.equals(this.lastModifiedUser, workflowScheme.lastModifiedUser) &&
        Objects.equals(this.lastModified, workflowScheme.lastModified) &&
        Objects.equals(this.self, workflowScheme.self) &&
        Objects.equals(this.updateDraftIfNeeded, workflowScheme.updateDraftIfNeeded) &&
        Objects.equals(this.issueTypes, workflowScheme.issueTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, defaultWorkflow, issueTypeMappings, originalDefaultWorkflow, originalIssueTypeMappings, draft, lastModifiedUser, lastModified, self, updateDraftIfNeeded, issueTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowScheme {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    defaultWorkflow: ").append(toIndentedString(defaultWorkflow)).append("\n");
    sb.append("    issueTypeMappings: ").append(toIndentedString(issueTypeMappings)).append("\n");
    sb.append("    originalDefaultWorkflow: ").append(toIndentedString(originalDefaultWorkflow)).append("\n");
    sb.append("    originalIssueTypeMappings: ").append(toIndentedString(originalIssueTypeMappings)).append("\n");
    sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
    sb.append("    lastModifiedUser: ").append(toIndentedString(lastModifiedUser)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    updateDraftIfNeeded: ").append(toIndentedString(updateDraftIfNeeded)).append("\n");
    sb.append("    issueTypes: ").append(toIndentedString(issueTypes)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("defaultWorkflow");
    openapiFields.add("issueTypeMappings");
    openapiFields.add("originalDefaultWorkflow");
    openapiFields.add("originalIssueTypeMappings");
    openapiFields.add("draft");
    openapiFields.add("lastModifiedUser");
    openapiFields.add("lastModified");
    openapiFields.add("self");
    openapiFields.add("updateDraftIfNeeded");
    openapiFields.add("issueTypes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkflowScheme
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (WorkflowScheme.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkflowScheme is not found in the empty JSON string", WorkflowScheme.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WorkflowScheme.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorkflowScheme` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("defaultWorkflow") != null && !jsonObj.get("defaultWorkflow").isJsonNull()) && !jsonObj.get("defaultWorkflow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultWorkflow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("defaultWorkflow").toString()));
      }
      if ((jsonObj.get("originalDefaultWorkflow") != null && !jsonObj.get("originalDefaultWorkflow").isJsonNull()) && !jsonObj.get("originalDefaultWorkflow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `originalDefaultWorkflow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("originalDefaultWorkflow").toString()));
      }
      // validate the optional field `lastModifiedUser`
      if (jsonObj.get("lastModifiedUser") != null && !jsonObj.get("lastModifiedUser").isJsonNull()) {
        WorkflowSchemeLastModifiedUser.validateJsonObject(jsonObj.getAsJsonObject("lastModifiedUser"));
      }
      if ((jsonObj.get("lastModified") != null && !jsonObj.get("lastModified").isJsonNull()) && !jsonObj.get("lastModified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastModified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastModified").toString()));
      }
      if ((jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) && !jsonObj.get("self").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkflowScheme.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkflowScheme' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkflowScheme> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkflowScheme.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkflowScheme>() {
           @Override
           public void write(JsonWriter out, WorkflowScheme value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorkflowScheme read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorkflowScheme given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkflowScheme
  * @throws IOException if the JSON string is invalid with respect to WorkflowScheme
  */
  public static WorkflowScheme fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkflowScheme.class);
  }

 /**
  * Convert an instance of WorkflowScheme to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

