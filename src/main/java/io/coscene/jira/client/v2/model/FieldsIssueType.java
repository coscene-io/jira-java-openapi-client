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
import java.util.UUID;
import io.coscene.jira.client.v2.JSON;

/**
 * The type of the linked issue.
 */
@ApiModel(description = "The type of the linked issue.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class FieldsIssueType {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private String self;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ICON_URL = "iconUrl";
  @SerializedName(SERIALIZED_NAME_ICON_URL)
  private String iconUrl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SUBTASK = "subtask";
  @SerializedName(SERIALIZED_NAME_SUBTASK)
  private Boolean subtask;

  public static final String SERIALIZED_NAME_AVATAR_ID = "avatarId";
  @SerializedName(SERIALIZED_NAME_AVATAR_ID)
  private Long avatarId;

  public static final String SERIALIZED_NAME_ENTITY_ID = "entityId";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private UUID entityId;

  public static final String SERIALIZED_NAME_HIERARCHY_LEVEL = "hierarchyLevel";
  @SerializedName(SERIALIZED_NAME_HIERARCHY_LEVEL)
  private Integer hierarchyLevel;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private IssueTypeDetailsScope scope;

  public FieldsIssueType() {
  }

  
  public FieldsIssueType(
     String self, 
     String id, 
     String description, 
     String iconUrl, 
     String name, 
     Boolean subtask, 
     Long avatarId, 
     UUID entityId, 
     Integer hierarchyLevel
  ) {
    this();
    this.self = self;
    this.id = id;
    this.description = description;
    this.iconUrl = iconUrl;
    this.name = name;
    this.subtask = subtask;
    this.avatarId = avatarId;
    this.entityId = entityId;
    this.hierarchyLevel = hierarchyLevel;
  }

   /**
   * The URL of these issue type details.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of these issue type details.")

  public String getSelf() {
    return self;
  }




   /**
   * The ID of the issue type.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the issue type.")

  public String getId() {
    return id;
  }




   /**
   * The description of the issue type.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the issue type.")

  public String getDescription() {
    return description;
  }




   /**
   * The URL of the issue type&#39;s avatar.
   * @return iconUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the issue type's avatar.")

  public String getIconUrl() {
    return iconUrl;
  }




   /**
   * The name of the issue type.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the issue type.")

  public String getName() {
    return name;
  }




   /**
   * Whether this issue type is used to create subtasks.
   * @return subtask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this issue type is used to create subtasks.")

  public Boolean getSubtask() {
    return subtask;
  }




   /**
   * The ID of the issue type&#39;s avatar.
   * @return avatarId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the issue type's avatar.")

  public Long getAvatarId() {
    return avatarId;
  }




   /**
   * Unique ID for next-gen projects.
   * @return entityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique ID for next-gen projects.")

  public UUID getEntityId() {
    return entityId;
  }




   /**
   * Hierarchy level of the issue type.
   * @return hierarchyLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Hierarchy level of the issue type.")

  public Integer getHierarchyLevel() {
    return hierarchyLevel;
  }




  public FieldsIssueType scope(IssueTypeDetailsScope scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IssueTypeDetailsScope getScope() {
    return scope;
  }


  public void setScope(IssueTypeDetailsScope scope) {
    this.scope = scope;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldsIssueType fieldsIssueType = (FieldsIssueType) o;
    return Objects.equals(this.self, fieldsIssueType.self) &&
        Objects.equals(this.id, fieldsIssueType.id) &&
        Objects.equals(this.description, fieldsIssueType.description) &&
        Objects.equals(this.iconUrl, fieldsIssueType.iconUrl) &&
        Objects.equals(this.name, fieldsIssueType.name) &&
        Objects.equals(this.subtask, fieldsIssueType.subtask) &&
        Objects.equals(this.avatarId, fieldsIssueType.avatarId) &&
        Objects.equals(this.entityId, fieldsIssueType.entityId) &&
        Objects.equals(this.hierarchyLevel, fieldsIssueType.hierarchyLevel) &&
        Objects.equals(this.scope, fieldsIssueType.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, id, description, iconUrl, name, subtask, avatarId, entityId, hierarchyLevel, scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldsIssueType {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subtask: ").append(toIndentedString(subtask)).append("\n");
    sb.append("    avatarId: ").append(toIndentedString(avatarId)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    hierarchyLevel: ").append(toIndentedString(hierarchyLevel)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("iconUrl");
    openapiFields.add("name");
    openapiFields.add("subtask");
    openapiFields.add("avatarId");
    openapiFields.add("entityId");
    openapiFields.add("hierarchyLevel");
    openapiFields.add("scope");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FieldsIssueType
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FieldsIssueType.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FieldsIssueType is not found in the empty JSON string", FieldsIssueType.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FieldsIssueType.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FieldsIssueType` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
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
      if ((jsonObj.get("iconUrl") != null && !jsonObj.get("iconUrl").isJsonNull()) && !jsonObj.get("iconUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iconUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iconUrl").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("entityId") != null && !jsonObj.get("entityId").isJsonNull()) && !jsonObj.get("entityId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entityId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entityId").toString()));
      }
      // validate the optional field `scope`
      if (jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull()) {
        IssueTypeDetailsScope.validateJsonObject(jsonObj.getAsJsonObject("scope"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FieldsIssueType.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FieldsIssueType' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FieldsIssueType> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FieldsIssueType.class));

       return (TypeAdapter<T>) new TypeAdapter<FieldsIssueType>() {
           @Override
           public void write(JsonWriter out, FieldsIssueType value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FieldsIssueType read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FieldsIssueType given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FieldsIssueType
  * @throws IOException if the JSON string is invalid with respect to FieldsIssueType
  */
  public static FieldsIssueType fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FieldsIssueType.class);
  }

 /**
  * Convert an instance of FieldsIssueType to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

