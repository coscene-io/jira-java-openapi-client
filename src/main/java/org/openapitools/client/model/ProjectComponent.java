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
import java.net.URI;
import org.openapitools.client.model.ProjectComponentAssignee;
import org.openapitools.client.model.ProjectComponentLead;
import org.openapitools.client.model.ProjectComponentRealAssignee;

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
 * Details about a project component.
 */
@ApiModel(description = "Details about a project component.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class ProjectComponent {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private URI self;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_LEAD = "lead";
  @SerializedName(SERIALIZED_NAME_LEAD)
  private ProjectComponentLead lead;

  public static final String SERIALIZED_NAME_LEAD_USER_NAME = "leadUserName";
  @SerializedName(SERIALIZED_NAME_LEAD_USER_NAME)
  private String leadUserName;

  public static final String SERIALIZED_NAME_LEAD_ACCOUNT_ID = "leadAccountId";
  @SerializedName(SERIALIZED_NAME_LEAD_ACCOUNT_ID)
  private String leadAccountId;

  /**
   * The nominal user type used to determine the assignee for issues created with this component. See &#x60;realAssigneeType&#x60; for details on how the type of the user, and hence the user, assigned to issues is determined. Can take the following values:   *  &#x60;PROJECT_LEAD&#x60; the assignee to any issues created with this component is nominally the lead for the project the component is in.  *  &#x60;COMPONENT_LEAD&#x60; the assignee to any issues created with this component is nominally the lead for the component.  *  &#x60;UNASSIGNED&#x60; an assignee is not set for issues created with this component.  *  &#x60;PROJECT_DEFAULT&#x60; the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.  Default value: &#x60;PROJECT_DEFAULT&#x60;.   Optional when creating or updating a component.
   */
  @JsonAdapter(AssigneeTypeEnum.Adapter.class)
  public enum AssigneeTypeEnum {
    PROJECT_DEFAULT("PROJECT_DEFAULT"),
    
    COMPONENT_LEAD("COMPONENT_LEAD"),
    
    PROJECT_LEAD("PROJECT_LEAD"),
    
    UNASSIGNED("UNASSIGNED");

    private String value;

    AssigneeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AssigneeTypeEnum fromValue(String value) {
      for (AssigneeTypeEnum b : AssigneeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AssigneeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AssigneeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AssigneeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AssigneeTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ASSIGNEE_TYPE = "assigneeType";
  @SerializedName(SERIALIZED_NAME_ASSIGNEE_TYPE)
  private AssigneeTypeEnum assigneeType;

  public static final String SERIALIZED_NAME_ASSIGNEE = "assignee";
  @SerializedName(SERIALIZED_NAME_ASSIGNEE)
  private ProjectComponentAssignee assignee;

  /**
   * The type of the assignee that is assigned to issues created with this component, when an assignee cannot be set from the &#x60;assigneeType&#x60;. For example, &#x60;assigneeType&#x60; is set to &#x60;COMPONENT_LEAD&#x60; but no component lead is set. This property is set to one of the following values:   *  &#x60;PROJECT_LEAD&#x60; when &#x60;assigneeType&#x60; is &#x60;PROJECT_LEAD&#x60; and the project lead has permission to be assigned issues in the project that the component is in.  *  &#x60;COMPONENT_LEAD&#x60; when &#x60;assignee&#x60;Type is &#x60;COMPONENT_LEAD&#x60; and the component lead has permission to be assigned issues in the project that the component is in.  *  &#x60;UNASSIGNED&#x60; when &#x60;assigneeType&#x60; is &#x60;UNASSIGNED&#x60; and Jira is configured to allow unassigned issues.  *  &#x60;PROJECT_DEFAULT&#x60; when none of the preceding cases are true.
   */
  @JsonAdapter(RealAssigneeTypeEnum.Adapter.class)
  public enum RealAssigneeTypeEnum {
    PROJECT_DEFAULT("PROJECT_DEFAULT"),
    
    COMPONENT_LEAD("COMPONENT_LEAD"),
    
    PROJECT_LEAD("PROJECT_LEAD"),
    
    UNASSIGNED("UNASSIGNED");

    private String value;

    RealAssigneeTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RealAssigneeTypeEnum fromValue(String value) {
      for (RealAssigneeTypeEnum b : RealAssigneeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RealAssigneeTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RealAssigneeTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RealAssigneeTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RealAssigneeTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_REAL_ASSIGNEE_TYPE = "realAssigneeType";
  @SerializedName(SERIALIZED_NAME_REAL_ASSIGNEE_TYPE)
  private RealAssigneeTypeEnum realAssigneeType;

  public static final String SERIALIZED_NAME_REAL_ASSIGNEE = "realAssignee";
  @SerializedName(SERIALIZED_NAME_REAL_ASSIGNEE)
  private ProjectComponentRealAssignee realAssignee;

  public static final String SERIALIZED_NAME_IS_ASSIGNEE_TYPE_VALID = "isAssigneeTypeValid";
  @SerializedName(SERIALIZED_NAME_IS_ASSIGNEE_TYPE_VALID)
  private Boolean isAssigneeTypeValid;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private String project;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Long projectId;

  public ProjectComponent() {
  }

  
  public ProjectComponent(
     URI self, 
     String id, 
     RealAssigneeTypeEnum realAssigneeType, 
     Boolean isAssigneeTypeValid, 
     Long projectId
  ) {
    this();
    this.self = self;
    this.id = id;
    this.realAssigneeType = realAssigneeType;
    this.isAssigneeTypeValid = isAssigneeTypeValid;
    this.projectId = projectId;
  }

   /**
   * The URL of the component.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the component.")

  public URI getSelf() {
    return self;
  }




   /**
   * The unique identifier for the component.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier for the component.")

  public String getId() {
    return id;
  }




  public ProjectComponent name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The unique name for the component in the project. Required when creating a component. Optional when updating a component. The maximum length is 255 characters.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique name for the component in the project. Required when creating a component. Optional when updating a component. The maximum length is 255 characters.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ProjectComponent description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description for the component. Optional when creating or updating a component.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description for the component. Optional when creating or updating a component.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ProjectComponent lead(ProjectComponentLead lead) {
    
    this.lead = lead;
    return this;
  }

   /**
   * Get lead
   * @return lead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProjectComponentLead getLead() {
    return lead;
  }


  public void setLead(ProjectComponentLead lead) {
    this.lead = lead;
  }


  public ProjectComponent leadUserName(String leadUserName) {
    
    this.leadUserName = leadUserName;
    return this;
  }

   /**
   * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
   * @return leadUserName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.")

  public String getLeadUserName() {
    return leadUserName;
  }


  public void setLeadUserName(String leadUserName) {
    this.leadUserName = leadUserName;
  }


  public ProjectComponent leadAccountId(String leadAccountId) {
    
    this.leadAccountId = leadAccountId;
    return this;
  }

   /**
   * The accountId of the component&#39;s lead user. The accountId uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
   * @return leadAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The accountId of the component's lead user. The accountId uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.")

  public String getLeadAccountId() {
    return leadAccountId;
  }


  public void setLeadAccountId(String leadAccountId) {
    this.leadAccountId = leadAccountId;
  }


  public ProjectComponent assigneeType(AssigneeTypeEnum assigneeType) {
    
    this.assigneeType = assigneeType;
    return this;
  }

   /**
   * The nominal user type used to determine the assignee for issues created with this component. See &#x60;realAssigneeType&#x60; for details on how the type of the user, and hence the user, assigned to issues is determined. Can take the following values:   *  &#x60;PROJECT_LEAD&#x60; the assignee to any issues created with this component is nominally the lead for the project the component is in.  *  &#x60;COMPONENT_LEAD&#x60; the assignee to any issues created with this component is nominally the lead for the component.  *  &#x60;UNASSIGNED&#x60; an assignee is not set for issues created with this component.  *  &#x60;PROJECT_DEFAULT&#x60; the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.  Default value: &#x60;PROJECT_DEFAULT&#x60;.   Optional when creating or updating a component.
   * @return assigneeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The nominal user type used to determine the assignee for issues created with this component. See `realAssigneeType` for details on how the type of the user, and hence the user, assigned to issues is determined. Can take the following values:   *  `PROJECT_LEAD` the assignee to any issues created with this component is nominally the lead for the project the component is in.  *  `COMPONENT_LEAD` the assignee to any issues created with this component is nominally the lead for the component.  *  `UNASSIGNED` an assignee is not set for issues created with this component.  *  `PROJECT_DEFAULT` the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.  Default value: `PROJECT_DEFAULT`.   Optional when creating or updating a component.")

  public AssigneeTypeEnum getAssigneeType() {
    return assigneeType;
  }


  public void setAssigneeType(AssigneeTypeEnum assigneeType) {
    this.assigneeType = assigneeType;
  }


  public ProjectComponent assignee(ProjectComponentAssignee assignee) {
    
    this.assignee = assignee;
    return this;
  }

   /**
   * Get assignee
   * @return assignee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProjectComponentAssignee getAssignee() {
    return assignee;
  }


  public void setAssignee(ProjectComponentAssignee assignee) {
    this.assignee = assignee;
  }


   /**
   * The type of the assignee that is assigned to issues created with this component, when an assignee cannot be set from the &#x60;assigneeType&#x60;. For example, &#x60;assigneeType&#x60; is set to &#x60;COMPONENT_LEAD&#x60; but no component lead is set. This property is set to one of the following values:   *  &#x60;PROJECT_LEAD&#x60; when &#x60;assigneeType&#x60; is &#x60;PROJECT_LEAD&#x60; and the project lead has permission to be assigned issues in the project that the component is in.  *  &#x60;COMPONENT_LEAD&#x60; when &#x60;assignee&#x60;Type is &#x60;COMPONENT_LEAD&#x60; and the component lead has permission to be assigned issues in the project that the component is in.  *  &#x60;UNASSIGNED&#x60; when &#x60;assigneeType&#x60; is &#x60;UNASSIGNED&#x60; and Jira is configured to allow unassigned issues.  *  &#x60;PROJECT_DEFAULT&#x60; when none of the preceding cases are true.
   * @return realAssigneeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the assignee that is assigned to issues created with this component, when an assignee cannot be set from the `assigneeType`. For example, `assigneeType` is set to `COMPONENT_LEAD` but no component lead is set. This property is set to one of the following values:   *  `PROJECT_LEAD` when `assigneeType` is `PROJECT_LEAD` and the project lead has permission to be assigned issues in the project that the component is in.  *  `COMPONENT_LEAD` when `assignee`Type is `COMPONENT_LEAD` and the component lead has permission to be assigned issues in the project that the component is in.  *  `UNASSIGNED` when `assigneeType` is `UNASSIGNED` and Jira is configured to allow unassigned issues.  *  `PROJECT_DEFAULT` when none of the preceding cases are true.")

  public RealAssigneeTypeEnum getRealAssigneeType() {
    return realAssigneeType;
  }




  public ProjectComponent realAssignee(ProjectComponentRealAssignee realAssignee) {
    
    this.realAssignee = realAssignee;
    return this;
  }

   /**
   * Get realAssignee
   * @return realAssignee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProjectComponentRealAssignee getRealAssignee() {
    return realAssignee;
  }


  public void setRealAssignee(ProjectComponentRealAssignee realAssignee) {
    this.realAssignee = realAssignee;
  }


   /**
   * Whether a user is associated with &#x60;assigneeType&#x60;. For example, if the &#x60;assigneeType&#x60; is set to &#x60;COMPONENT_LEAD&#x60; but the component lead is not set, then &#x60;false&#x60; is returned.
   * @return isAssigneeTypeValid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether a user is associated with `assigneeType`. For example, if the `assigneeType` is set to `COMPONENT_LEAD` but the component lead is not set, then `false` is returned.")

  public Boolean getIsAssigneeTypeValid() {
    return isAssigneeTypeValid;
  }




  public ProjectComponent project(String project) {
    
    this.project = project;
    return this;
  }

   /**
   * The key of the project the component is assigned to. Required when creating a component. Can&#39;t be updated.
   * @return project
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the project the component is assigned to. Required when creating a component. Can't be updated.")

  public String getProject() {
    return project;
  }


  public void setProject(String project) {
    this.project = project;
  }


   /**
   * The ID of the project the component is assigned to.
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the project the component is assigned to.")

  public Long getProjectId() {
    return projectId;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectComponent projectComponent = (ProjectComponent) o;
    return Objects.equals(this.self, projectComponent.self) &&
        Objects.equals(this.id, projectComponent.id) &&
        Objects.equals(this.name, projectComponent.name) &&
        Objects.equals(this.description, projectComponent.description) &&
        Objects.equals(this.lead, projectComponent.lead) &&
        Objects.equals(this.leadUserName, projectComponent.leadUserName) &&
        Objects.equals(this.leadAccountId, projectComponent.leadAccountId) &&
        Objects.equals(this.assigneeType, projectComponent.assigneeType) &&
        Objects.equals(this.assignee, projectComponent.assignee) &&
        Objects.equals(this.realAssigneeType, projectComponent.realAssigneeType) &&
        Objects.equals(this.realAssignee, projectComponent.realAssignee) &&
        Objects.equals(this.isAssigneeTypeValid, projectComponent.isAssigneeTypeValid) &&
        Objects.equals(this.project, projectComponent.project) &&
        Objects.equals(this.projectId, projectComponent.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, id, name, description, lead, leadUserName, leadAccountId, assigneeType, assignee, realAssigneeType, realAssignee, isAssigneeTypeValid, project, projectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectComponent {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lead: ").append(toIndentedString(lead)).append("\n");
    sb.append("    leadUserName: ").append(toIndentedString(leadUserName)).append("\n");
    sb.append("    leadAccountId: ").append(toIndentedString(leadAccountId)).append("\n");
    sb.append("    assigneeType: ").append(toIndentedString(assigneeType)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    realAssigneeType: ").append(toIndentedString(realAssigneeType)).append("\n");
    sb.append("    realAssignee: ").append(toIndentedString(realAssignee)).append("\n");
    sb.append("    isAssigneeTypeValid: ").append(toIndentedString(isAssigneeTypeValid)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
    openapiFields.add("self");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("lead");
    openapiFields.add("leadUserName");
    openapiFields.add("leadAccountId");
    openapiFields.add("assigneeType");
    openapiFields.add("assignee");
    openapiFields.add("realAssigneeType");
    openapiFields.add("realAssignee");
    openapiFields.add("isAssigneeTypeValid");
    openapiFields.add("project");
    openapiFields.add("projectId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectComponent
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProjectComponent.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectComponent is not found in the empty JSON string", ProjectComponent.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProjectComponent.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectComponent` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) && !jsonObj.get("self").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `lead`
      if (jsonObj.get("lead") != null && !jsonObj.get("lead").isJsonNull()) {
        ProjectComponentLead.validateJsonObject(jsonObj.getAsJsonObject("lead"));
      }
      if ((jsonObj.get("leadUserName") != null && !jsonObj.get("leadUserName").isJsonNull()) && !jsonObj.get("leadUserName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `leadUserName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("leadUserName").toString()));
      }
      if ((jsonObj.get("leadAccountId") != null && !jsonObj.get("leadAccountId").isJsonNull()) && !jsonObj.get("leadAccountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `leadAccountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("leadAccountId").toString()));
      }
      if ((jsonObj.get("assigneeType") != null && !jsonObj.get("assigneeType").isJsonNull()) && !jsonObj.get("assigneeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assigneeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assigneeType").toString()));
      }
      // validate the optional field `assignee`
      if (jsonObj.get("assignee") != null && !jsonObj.get("assignee").isJsonNull()) {
        ProjectComponentAssignee.validateJsonObject(jsonObj.getAsJsonObject("assignee"));
      }
      if ((jsonObj.get("realAssigneeType") != null && !jsonObj.get("realAssigneeType").isJsonNull()) && !jsonObj.get("realAssigneeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `realAssigneeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("realAssigneeType").toString()));
      }
      // validate the optional field `realAssignee`
      if (jsonObj.get("realAssignee") != null && !jsonObj.get("realAssignee").isJsonNull()) {
        ProjectComponentRealAssignee.validateJsonObject(jsonObj.getAsJsonObject("realAssignee"));
      }
      if ((jsonObj.get("project") != null && !jsonObj.get("project").isJsonNull()) && !jsonObj.get("project").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectComponent.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectComponent' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectComponent> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectComponent.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectComponent>() {
           @Override
           public void write(JsonWriter out, ProjectComponent value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectComponent read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectComponent given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectComponent
  * @throws IOException if the JSON string is invalid with respect to ProjectComponent
  */
  public static ProjectComponent fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectComponent.class);
  }

 /**
  * Convert an instance of ProjectComponent to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

