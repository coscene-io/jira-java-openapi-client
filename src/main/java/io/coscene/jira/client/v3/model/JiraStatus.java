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
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashSet;
import java.util.Map.Entry;

import io.coscene.jira.client.v3.JSON;

/**
 * Details of a status.
 */
@ApiModel(description = "Details of a status.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class JiraStatus {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * The category of the status.
   */
  @JsonAdapter(StatusCategoryEnum.Adapter.class)
  public enum StatusCategoryEnum {
    TODO("TODO"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    DONE("DONE");

    private String value;

    StatusCategoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusCategoryEnum fromValue(String value) {
      for (StatusCategoryEnum b : StatusCategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusCategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusCategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusCategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusCategoryEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS_CATEGORY = "statusCategory";
  @SerializedName(SERIALIZED_NAME_STATUS_CATEGORY)
  private StatusCategoryEnum statusCategory;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private StatusScope scope;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_USAGES = "usages";
  @SerializedName(SERIALIZED_NAME_USAGES)
  private Set<ProjectIssueTypes> usages = null;

  public JiraStatus() {
  }

  public JiraStatus id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the status.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the status.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public JiraStatus name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the status.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the status.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public JiraStatus statusCategory(StatusCategoryEnum statusCategory) {
    
    this.statusCategory = statusCategory;
    return this;
  }

   /**
   * The category of the status.
   * @return statusCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The category of the status.")

  public StatusCategoryEnum getStatusCategory() {
    return statusCategory;
  }


  public void setStatusCategory(StatusCategoryEnum statusCategory) {
    this.statusCategory = statusCategory;
  }


  public JiraStatus scope(StatusScope scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StatusScope getScope() {
    return scope;
  }


  public void setScope(StatusScope scope) {
    this.scope = scope;
  }


  public JiraStatus description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the status.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the status.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public JiraStatus usages(Set<ProjectIssueTypes> usages) {
    
    this.usages = usages;
    return this;
  }

  public JiraStatus addUsagesItem(ProjectIssueTypes usagesItem) {
    if (this.usages == null) {
      this.usages = new LinkedHashSet<>();
    }
    this.usages.add(usagesItem);
    return this;
  }

   /**
   * Projects and issue types where the status is used. Only available if the &#x60;usages&#x60; expand is requested.
   * @return usages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Projects and issue types where the status is used. Only available if the `usages` expand is requested.")

  public Set<ProjectIssueTypes> getUsages() {
    return usages;
  }


  public void setUsages(Set<ProjectIssueTypes> usages) {
    this.usages = usages;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraStatus jiraStatus = (JiraStatus) o;
    return Objects.equals(this.id, jiraStatus.id) &&
        Objects.equals(this.name, jiraStatus.name) &&
        Objects.equals(this.statusCategory, jiraStatus.statusCategory) &&
        Objects.equals(this.scope, jiraStatus.scope) &&
        Objects.equals(this.description, jiraStatus.description) &&
        Objects.equals(this.usages, jiraStatus.usages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, statusCategory, scope, description, usages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraStatus {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    statusCategory: ").append(toIndentedString(statusCategory)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    usages: ").append(toIndentedString(usages)).append("\n");
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
    openapiFields.add("statusCategory");
    openapiFields.add("scope");
    openapiFields.add("description");
    openapiFields.add("usages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JiraStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JiraStatus.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JiraStatus is not found in the empty JSON string", JiraStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JiraStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JiraStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("statusCategory") != null && !jsonObj.get("statusCategory").isJsonNull()) && !jsonObj.get("statusCategory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusCategory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusCategory").toString()));
      }
      // validate the optional field `scope`
      if (jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull()) {
        StatusScope.validateJsonObject(jsonObj.getAsJsonObject("scope"));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (jsonObj.get("usages") != null && !jsonObj.get("usages").isJsonNull()) {
        JsonArray jsonArrayusages = jsonObj.getAsJsonArray("usages");
        if (jsonArrayusages != null) {
          // ensure the json data is an array
          if (!jsonObj.get("usages").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `usages` to be an array in the JSON string but got `%s`", jsonObj.get("usages").toString()));
          }

          // validate the optional field `usages` (array)
          for (int i = 0; i < jsonArrayusages.size(); i++) {
            ProjectIssueTypes.validateJsonObject(jsonArrayusages.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JiraStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JiraStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JiraStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JiraStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<JiraStatus>() {
           @Override
           public void write(JsonWriter out, JiraStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JiraStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JiraStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JiraStatus
  * @throws IOException if the JSON string is invalid with respect to JiraStatus
  */
  public static JiraStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JiraStatus.class);
  }

 /**
  * Convert an instance of JiraStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

