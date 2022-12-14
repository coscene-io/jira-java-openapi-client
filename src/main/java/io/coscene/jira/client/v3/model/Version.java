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
import java.net.URI;
import java.time.LocalDate;
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
 * Details about a project version.
 */
@ApiModel(description = "Details about a project version.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class Version {
  public static final String SERIALIZED_NAME_EXPAND = "expand";
  @SerializedName(SERIALIZED_NAME_EXPAND)
  private String expand;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private URI self;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ARCHIVED = "archived";
  @SerializedName(SERIALIZED_NAME_ARCHIVED)
  private Boolean archived;

  public static final String SERIALIZED_NAME_RELEASED = "released";
  @SerializedName(SERIALIZED_NAME_RELEASED)
  private Boolean released;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_RELEASE_DATE = "releaseDate";
  @SerializedName(SERIALIZED_NAME_RELEASE_DATE)
  private LocalDate releaseDate;

  public static final String SERIALIZED_NAME_OVERDUE = "overdue";
  @SerializedName(SERIALIZED_NAME_OVERDUE)
  private Boolean overdue;

  public static final String SERIALIZED_NAME_USER_START_DATE = "userStartDate";
  @SerializedName(SERIALIZED_NAME_USER_START_DATE)
  private String userStartDate;

  public static final String SERIALIZED_NAME_USER_RELEASE_DATE = "userReleaseDate";
  @SerializedName(SERIALIZED_NAME_USER_RELEASE_DATE)
  private String userReleaseDate;

  public static final String SERIALIZED_NAME_PROJECT = "project";
  @SerializedName(SERIALIZED_NAME_PROJECT)
  private String project;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Long projectId;

  public static final String SERIALIZED_NAME_MOVE_UNFIXED_ISSUES_TO = "moveUnfixedIssuesTo";
  @SerializedName(SERIALIZED_NAME_MOVE_UNFIXED_ISSUES_TO)
  private URI moveUnfixedIssuesTo;

  public static final String SERIALIZED_NAME_OPERATIONS = "operations";
  @SerializedName(SERIALIZED_NAME_OPERATIONS)
  private List<SimpleLink> operations = null;

  public static final String SERIALIZED_NAME_ISSUES_STATUS_FOR_FIX_VERSION = "issuesStatusForFixVersion";
  @SerializedName(SERIALIZED_NAME_ISSUES_STATUS_FOR_FIX_VERSION)
  private VersionIssuesStatusForFixVersion issuesStatusForFixVersion;

  public Version() {
  }

  
  public Version(
     URI self, 
     String id, 
     Boolean overdue, 
     String userStartDate, 
     String userReleaseDate, 
     List<SimpleLink> operations
  ) {
    this();
    this.self = self;
    this.id = id;
    this.overdue = overdue;
    this.userStartDate = userStartDate;
    this.userReleaseDate = userReleaseDate;
    this.operations = operations;
  }

  public Version expand(String expand) {
    
    this.expand = expand;
    return this;
  }

   /**
   * Use [expand](em&gt;#expansion) to include additional information about version in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;operations&#x60; Returns the list of operations available for this version.  *  &#x60;issuesstatus&#x60; Returns the count of issues in this version for each of the status categories *to do*, *in progress*, *done*, and *unmapped*. The *unmapped* property contains a count of issues with a status other than *to do*, *in progress*, and *done*.  Optional for create and update.
   * @return expand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use [expand](em>#expansion) to include additional information about version in the response. This parameter accepts a comma-separated list. Expand options include:   *  `operations` Returns the list of operations available for this version.  *  `issuesstatus` Returns the count of issues in this version for each of the status categories *to do*, *in progress*, *done*, and *unmapped*. The *unmapped* property contains a count of issues with a status other than *to do*, *in progress*, and *done*.  Optional for create and update.")

  public String getExpand() {
    return expand;
  }


  public void setExpand(String expand) {
    this.expand = expand;
  }


   /**
   * The URL of the version.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the version.")

  public URI getSelf() {
    return self;
  }




   /**
   * The ID of the version.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the version.")

  public String getId() {
    return id;
  }




  public Version description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the version. Optional when creating or updating a version.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the version. Optional when creating or updating a version.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Version name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The unique name of the version. Required when creating a version. Optional when updating a version. The maximum length is 255 characters.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique name of the version. Required when creating a version. Optional when updating a version. The maximum length is 255 characters.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Version archived(Boolean archived) {
    
    this.archived = archived;
    return this;
  }

   /**
   * Indicates that the version is archived. Optional when creating or updating a version.
   * @return archived
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates that the version is archived. Optional when creating or updating a version.")

  public Boolean getArchived() {
    return archived;
  }


  public void setArchived(Boolean archived) {
    this.archived = archived;
  }


  public Version released(Boolean released) {
    
    this.released = released;
    return this;
  }

   /**
   * Indicates that the version is released. If the version is released a request to release again is ignored. Not applicable when creating a version. Optional when updating a version.
   * @return released
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates that the version is released. If the version is released a request to release again is ignored. Not applicable when creating a version. Optional when updating a version.")

  public Boolean getReleased() {
    return released;
  }


  public void setReleased(Boolean released) {
    this.released = released;
  }


  public Version startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date of the version. Expressed in ISO 8601 format (yyyy-mm-dd). Optional when creating or updating a version.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The start date of the version. Expressed in ISO 8601 format (yyyy-mm-dd). Optional when creating or updating a version.")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public Version releaseDate(LocalDate releaseDate) {
    
    this.releaseDate = releaseDate;
    return this;
  }

   /**
   * The release date of the version. Expressed in ISO 8601 format (yyyy-mm-dd). Optional when creating or updating a version.
   * @return releaseDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The release date of the version. Expressed in ISO 8601 format (yyyy-mm-dd). Optional when creating or updating a version.")

  public LocalDate getReleaseDate() {
    return releaseDate;
  }


  public void setReleaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
  }


   /**
   * Indicates that the version is overdue.
   * @return overdue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicates that the version is overdue.")

  public Boolean getOverdue() {
    return overdue;
  }




   /**
   * The date on which work on this version is expected to start, expressed in the instance&#39;s *Day/Month/Year Format* date format.
   * @return userStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date on which work on this version is expected to start, expressed in the instance's *Day/Month/Year Format* date format.")

  public String getUserStartDate() {
    return userStartDate;
  }




   /**
   * The date on which work on this version is expected to finish, expressed in the instance&#39;s *Day/Month/Year Format* date format.
   * @return userReleaseDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date on which work on this version is expected to finish, expressed in the instance's *Day/Month/Year Format* date format.")

  public String getUserReleaseDate() {
    return userReleaseDate;
  }




  public Version project(String project) {
    
    this.project = project;
    return this;
  }

   /**
   * Deprecated. Use &#x60;projectId&#x60;.
   * @return project
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deprecated. Use `projectId`.")

  public String getProject() {
    return project;
  }


  public void setProject(String project) {
    this.project = project;
  }


  public Version projectId(Long projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * The ID of the project to which this version is attached. Required when creating a version. Not applicable when updating a version.
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the project to which this version is attached. Required when creating a version. Not applicable when updating a version.")

  public Long getProjectId() {
    return projectId;
  }


  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }


  public Version moveUnfixedIssuesTo(URI moveUnfixedIssuesTo) {
    
    this.moveUnfixedIssuesTo = moveUnfixedIssuesTo;
    return this;
  }

   /**
   * The URL of the self link to the version to which all unfixed issues are moved when a version is released. Not applicable when creating a version. Optional when updating a version.
   * @return moveUnfixedIssuesTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the self link to the version to which all unfixed issues are moved when a version is released. Not applicable when creating a version. Optional when updating a version.")

  public URI getMoveUnfixedIssuesTo() {
    return moveUnfixedIssuesTo;
  }


  public void setMoveUnfixedIssuesTo(URI moveUnfixedIssuesTo) {
    this.moveUnfixedIssuesTo = moveUnfixedIssuesTo;
  }


   /**
   * If the expand option &#x60;operations&#x60; is used, returns the list of operations available for this version.
   * @return operations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the expand option `operations` is used, returns the list of operations available for this version.")

  public List<SimpleLink> getOperations() {
    return operations;
  }




  public Version issuesStatusForFixVersion(VersionIssuesStatusForFixVersion issuesStatusForFixVersion) {
    
    this.issuesStatusForFixVersion = issuesStatusForFixVersion;
    return this;
  }

   /**
   * Get issuesStatusForFixVersion
   * @return issuesStatusForFixVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VersionIssuesStatusForFixVersion getIssuesStatusForFixVersion() {
    return issuesStatusForFixVersion;
  }


  public void setIssuesStatusForFixVersion(VersionIssuesStatusForFixVersion issuesStatusForFixVersion) {
    this.issuesStatusForFixVersion = issuesStatusForFixVersion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Version version = (Version) o;
    return Objects.equals(this.expand, version.expand) &&
        Objects.equals(this.self, version.self) &&
        Objects.equals(this.id, version.id) &&
        Objects.equals(this.description, version.description) &&
        Objects.equals(this.name, version.name) &&
        Objects.equals(this.archived, version.archived) &&
        Objects.equals(this.released, version.released) &&
        Objects.equals(this.startDate, version.startDate) &&
        Objects.equals(this.releaseDate, version.releaseDate) &&
        Objects.equals(this.overdue, version.overdue) &&
        Objects.equals(this.userStartDate, version.userStartDate) &&
        Objects.equals(this.userReleaseDate, version.userReleaseDate) &&
        Objects.equals(this.project, version.project) &&
        Objects.equals(this.projectId, version.projectId) &&
        Objects.equals(this.moveUnfixedIssuesTo, version.moveUnfixedIssuesTo) &&
        Objects.equals(this.operations, version.operations) &&
        Objects.equals(this.issuesStatusForFixVersion, version.issuesStatusForFixVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand, self, id, description, name, archived, released, startDate, releaseDate, overdue, userStartDate, userReleaseDate, project, projectId, moveUnfixedIssuesTo, operations, issuesStatusForFixVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Version {\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    released: ").append(toIndentedString(released)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    overdue: ").append(toIndentedString(overdue)).append("\n");
    sb.append("    userStartDate: ").append(toIndentedString(userStartDate)).append("\n");
    sb.append("    userReleaseDate: ").append(toIndentedString(userReleaseDate)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    moveUnfixedIssuesTo: ").append(toIndentedString(moveUnfixedIssuesTo)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    issuesStatusForFixVersion: ").append(toIndentedString(issuesStatusForFixVersion)).append("\n");
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
    openapiFields.add("expand");
    openapiFields.add("self");
    openapiFields.add("id");
    openapiFields.add("description");
    openapiFields.add("name");
    openapiFields.add("archived");
    openapiFields.add("released");
    openapiFields.add("startDate");
    openapiFields.add("releaseDate");
    openapiFields.add("overdue");
    openapiFields.add("userStartDate");
    openapiFields.add("userReleaseDate");
    openapiFields.add("project");
    openapiFields.add("projectId");
    openapiFields.add("moveUnfixedIssuesTo");
    openapiFields.add("operations");
    openapiFields.add("issuesStatusForFixVersion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Version
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Version.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Version is not found in the empty JSON string", Version.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Version.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Version` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("expand") != null && !jsonObj.get("expand").isJsonNull()) && !jsonObj.get("expand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expand").toString()));
      }
      if ((jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) && !jsonObj.get("self").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("userStartDate") != null && !jsonObj.get("userStartDate").isJsonNull()) && !jsonObj.get("userStartDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userStartDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userStartDate").toString()));
      }
      if ((jsonObj.get("userReleaseDate") != null && !jsonObj.get("userReleaseDate").isJsonNull()) && !jsonObj.get("userReleaseDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userReleaseDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userReleaseDate").toString()));
      }
      if ((jsonObj.get("project") != null && !jsonObj.get("project").isJsonNull()) && !jsonObj.get("project").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project").toString()));
      }
      if ((jsonObj.get("moveUnfixedIssuesTo") != null && !jsonObj.get("moveUnfixedIssuesTo").isJsonNull()) && !jsonObj.get("moveUnfixedIssuesTo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `moveUnfixedIssuesTo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("moveUnfixedIssuesTo").toString()));
      }
      if (jsonObj.get("operations") != null && !jsonObj.get("operations").isJsonNull()) {
        JsonArray jsonArrayoperations = jsonObj.getAsJsonArray("operations");
        if (jsonArrayoperations != null) {
          // ensure the json data is an array
          if (!jsonObj.get("operations").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `operations` to be an array in the JSON string but got `%s`", jsonObj.get("operations").toString()));
          }

          // validate the optional field `operations` (array)
          for (int i = 0; i < jsonArrayoperations.size(); i++) {
            SimpleLink.validateJsonObject(jsonArrayoperations.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `issuesStatusForFixVersion`
      if (jsonObj.get("issuesStatusForFixVersion") != null && !jsonObj.get("issuesStatusForFixVersion").isJsonNull()) {
        VersionIssuesStatusForFixVersion.validateJsonObject(jsonObj.getAsJsonObject("issuesStatusForFixVersion"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Version.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Version' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Version> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Version.class));

       return (TypeAdapter<T>) new TypeAdapter<Version>() {
           @Override
           public void write(JsonWriter out, Version value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Version read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Version given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Version
  * @throws IOException if the JSON string is invalid with respect to Version
  */
  public static Version fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Version.class);
  }

 /**
  * Convert an instance of Version to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

