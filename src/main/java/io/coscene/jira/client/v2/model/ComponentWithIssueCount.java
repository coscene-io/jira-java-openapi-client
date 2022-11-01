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
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import io.coscene.jira.client.v2.JSON;

/**
 * Details about a component with a count of the issues it contains.
 */
@ApiModel(description = "Details about a component with a count of the issues it contains.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class ComponentWithIssueCount {
  public static final String SERIALIZED_NAME_ISSUE_COUNT = "issueCount";
  @SerializedName(SERIALIZED_NAME_ISSUE_COUNT)
  private Long issueCount;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private URI self;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private String project;

  public static final String SERIALIZED_NAME_LEAD = "lead";
  @SerializedName(SERIALIZED_NAME_LEAD)
  private ComponentWithIssueCountLead lead;

  /**
   * The nominal user type used to determine the assignee for issues created with this component. See &#x60;realAssigneeType&#x60; for details on how the type of the user, and hence the user, assigned to issues is determined. Takes the following values:   *  &#x60;PROJECT_LEAD&#x60; the assignee to any issues created with this component is nominally the lead for the project the component is in.  *  &#x60;COMPONENT_LEAD&#x60; the assignee to any issues created with this component is nominally the lead for the component.  *  &#x60;UNASSIGNED&#x60; an assignee is not set for issues created with this component.  *  &#x60;PROJECT_DEFAULT&#x60; the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.
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

  public static final String SERIALIZED_NAME_REAL_ASSIGNEE = "realAssignee";
  @SerializedName(SERIALIZED_NAME_REAL_ASSIGNEE)
  private ComponentWithIssueCountRealAssignee realAssignee;

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

  public static final String SERIALIZED_NAME_IS_ASSIGNEE_TYPE_VALID = "isAssigneeTypeValid";
  @SerializedName(SERIALIZED_NAME_IS_ASSIGNEE_TYPE_VALID)
  private Boolean isAssigneeTypeValid;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Long projectId;

  public static final String SERIALIZED_NAME_ASSIGNEE = "assignee";
  @SerializedName(SERIALIZED_NAME_ASSIGNEE)
  private ComponentWithIssueCountAssignee assignee;

  public ComponentWithIssueCount() {
  }

  
  public ComponentWithIssueCount(
     Long issueCount, 
     String name, 
     String id, 
     URI self, 
     String project, 
     AssigneeTypeEnum assigneeType, 
     RealAssigneeTypeEnum realAssigneeType, 
     Boolean isAssigneeTypeValid, 
     String description, 
     Long projectId
  ) {
    this();
    this.issueCount = issueCount;
    this.name = name;
    this.id = id;
    this.self = self;
    this.project = project;
    this.assigneeType = assigneeType;
    this.realAssigneeType = realAssigneeType;
    this.isAssigneeTypeValid = isAssigneeTypeValid;
    this.description = description;
    this.projectId = projectId;
  }

   /**
   * Count of issues for the component.
   * @return issueCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Count of issues for the component.")

  public Long getIssueCount() {
    return issueCount;
  }




   /**
   * The name for the component.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name for the component.")

  public String getName() {
    return name;
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




   /**
   * The URL for this count of the issues contained in the component.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL for this count of the issues contained in the component.")

  public URI getSelf() {
    return self;
  }




   /**
   * The key of the project to which the component is assigned.
   * @return project
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the project to which the component is assigned.")

  public String getProject() {
    return project;
  }




  public ComponentWithIssueCount lead(ComponentWithIssueCountLead lead) {
    
    this.lead = lead;
    return this;
  }

   /**
   * Get lead
   * @return lead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComponentWithIssueCountLead getLead() {
    return lead;
  }


  public void setLead(ComponentWithIssueCountLead lead) {
    this.lead = lead;
  }


   /**
   * The nominal user type used to determine the assignee for issues created with this component. See &#x60;realAssigneeType&#x60; for details on how the type of the user, and hence the user, assigned to issues is determined. Takes the following values:   *  &#x60;PROJECT_LEAD&#x60; the assignee to any issues created with this component is nominally the lead for the project the component is in.  *  &#x60;COMPONENT_LEAD&#x60; the assignee to any issues created with this component is nominally the lead for the component.  *  &#x60;UNASSIGNED&#x60; an assignee is not set for issues created with this component.  *  &#x60;PROJECT_DEFAULT&#x60; the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.
   * @return assigneeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The nominal user type used to determine the assignee for issues created with this component. See `realAssigneeType` for details on how the type of the user, and hence the user, assigned to issues is determined. Takes the following values:   *  `PROJECT_LEAD` the assignee to any issues created with this component is nominally the lead for the project the component is in.  *  `COMPONENT_LEAD` the assignee to any issues created with this component is nominally the lead for the component.  *  `UNASSIGNED` an assignee is not set for issues created with this component.  *  `PROJECT_DEFAULT` the assignee to any issues created with this component is nominally the default assignee for the project that the component is in.")

  public AssigneeTypeEnum getAssigneeType() {
    return assigneeType;
  }




  public ComponentWithIssueCount realAssignee(ComponentWithIssueCountRealAssignee realAssignee) {
    
    this.realAssignee = realAssignee;
    return this;
  }

   /**
   * Get realAssignee
   * @return realAssignee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComponentWithIssueCountRealAssignee getRealAssignee() {
    return realAssignee;
  }


  public void setRealAssignee(ComponentWithIssueCountRealAssignee realAssignee) {
    this.realAssignee = realAssignee;
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




   /**
   * Whether a user is associated with &#x60;assigneeType&#x60;. For example, if the &#x60;assigneeType&#x60; is set to &#x60;COMPONENT_LEAD&#x60; but the component lead is not set, then &#x60;false&#x60; is returned.
   * @return isAssigneeTypeValid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether a user is associated with `assigneeType`. For example, if the `assigneeType` is set to `COMPONENT_LEAD` but the component lead is not set, then `false` is returned.")

  public Boolean getIsAssigneeTypeValid() {
    return isAssigneeTypeValid;
  }




   /**
   * The description for the component.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description for the component.")

  public String getDescription() {
    return description;
  }




   /**
   * Not used.
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Not used.")

  public Long getProjectId() {
    return projectId;
  }




  public ComponentWithIssueCount assignee(ComponentWithIssueCountAssignee assignee) {
    
    this.assignee = assignee;
    return this;
  }

   /**
   * Get assignee
   * @return assignee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ComponentWithIssueCountAssignee getAssignee() {
    return assignee;
  }


  public void setAssignee(ComponentWithIssueCountAssignee assignee) {
    this.assignee = assignee;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentWithIssueCount componentWithIssueCount = (ComponentWithIssueCount) o;
    return Objects.equals(this.issueCount, componentWithIssueCount.issueCount) &&
        Objects.equals(this.name, componentWithIssueCount.name) &&
        Objects.equals(this.id, componentWithIssueCount.id) &&
        Objects.equals(this.self, componentWithIssueCount.self) &&
        Objects.equals(this.project, componentWithIssueCount.project) &&
        Objects.equals(this.lead, componentWithIssueCount.lead) &&
        Objects.equals(this.assigneeType, componentWithIssueCount.assigneeType) &&
        Objects.equals(this.realAssignee, componentWithIssueCount.realAssignee) &&
        Objects.equals(this.realAssigneeType, componentWithIssueCount.realAssigneeType) &&
        Objects.equals(this.isAssigneeTypeValid, componentWithIssueCount.isAssigneeTypeValid) &&
        Objects.equals(this.description, componentWithIssueCount.description) &&
        Objects.equals(this.projectId, componentWithIssueCount.projectId) &&
        Objects.equals(this.assignee, componentWithIssueCount.assignee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueCount, name, id, self, project, lead, assigneeType, realAssignee, realAssigneeType, isAssigneeTypeValid, description, projectId, assignee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentWithIssueCount {\n");
    sb.append("    issueCount: ").append(toIndentedString(issueCount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    lead: ").append(toIndentedString(lead)).append("\n");
    sb.append("    assigneeType: ").append(toIndentedString(assigneeType)).append("\n");
    sb.append("    realAssignee: ").append(toIndentedString(realAssignee)).append("\n");
    sb.append("    realAssigneeType: ").append(toIndentedString(realAssigneeType)).append("\n");
    sb.append("    isAssigneeTypeValid: ").append(toIndentedString(isAssigneeTypeValid)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
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
    openapiFields.add("issueCount");
    openapiFields.add("name");
    openapiFields.add("id");
    openapiFields.add("self");
    openapiFields.add("project");
    openapiFields.add("lead");
    openapiFields.add("assigneeType");
    openapiFields.add("realAssignee");
    openapiFields.add("realAssigneeType");
    openapiFields.add("isAssigneeTypeValid");
    openapiFields.add("description");
    openapiFields.add("projectId");
    openapiFields.add("assignee");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ComponentWithIssueCount
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ComponentWithIssueCount.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ComponentWithIssueCount is not found in the empty JSON string", ComponentWithIssueCount.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ComponentWithIssueCount.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ComponentWithIssueCount` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) && !jsonObj.get("self").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self").toString()));
      }
      if ((jsonObj.get("project") != null && !jsonObj.get("project").isJsonNull()) && !jsonObj.get("project").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project").toString()));
      }
      // validate the optional field `lead`
      if (jsonObj.get("lead") != null && !jsonObj.get("lead").isJsonNull()) {
        ComponentWithIssueCountLead.validateJsonObject(jsonObj.getAsJsonObject("lead"));
      }
      if ((jsonObj.get("assigneeType") != null && !jsonObj.get("assigneeType").isJsonNull()) && !jsonObj.get("assigneeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assigneeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assigneeType").toString()));
      }
      // validate the optional field `realAssignee`
      if (jsonObj.get("realAssignee") != null && !jsonObj.get("realAssignee").isJsonNull()) {
        ComponentWithIssueCountRealAssignee.validateJsonObject(jsonObj.getAsJsonObject("realAssignee"));
      }
      if ((jsonObj.get("realAssigneeType") != null && !jsonObj.get("realAssigneeType").isJsonNull()) && !jsonObj.get("realAssigneeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `realAssigneeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("realAssigneeType").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `assignee`
      if (jsonObj.get("assignee") != null && !jsonObj.get("assignee").isJsonNull()) {
        ComponentWithIssueCountAssignee.validateJsonObject(jsonObj.getAsJsonObject("assignee"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ComponentWithIssueCount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ComponentWithIssueCount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ComponentWithIssueCount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ComponentWithIssueCount.class));

       return (TypeAdapter<T>) new TypeAdapter<ComponentWithIssueCount>() {
           @Override
           public void write(JsonWriter out, ComponentWithIssueCount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ComponentWithIssueCount read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ComponentWithIssueCount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ComponentWithIssueCount
  * @throws IOException if the JSON string is invalid with respect to ComponentWithIssueCount
  */
  public static ComponentWithIssueCount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ComponentWithIssueCount.class);
  }

 /**
  * Convert an instance of ComponentWithIssueCount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

