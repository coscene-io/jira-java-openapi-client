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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import io.coscene.jira.client.v2.JSON;

/**
 * The project landing page info.
 */
@ApiModel(description = "The project landing page info.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class ProjectLandingPageInfo {
  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_PROJECT_KEY = "projectKey";
  @SerializedName(SERIALIZED_NAME_PROJECT_KEY)
  private String projectKey;

  public static final String SERIALIZED_NAME_PROJECT_TYPE = "projectType";
  @SerializedName(SERIALIZED_NAME_PROJECT_TYPE)
  private String projectType;

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Map<String, String> attributes = null;

  public static final String SERIALIZED_NAME_SIMPLIFIED = "simplified";
  @SerializedName(SERIALIZED_NAME_SIMPLIFIED)
  private Boolean simplified;

  public static final String SERIALIZED_NAME_BOARD_NAME = "boardName";
  @SerializedName(SERIALIZED_NAME_BOARD_NAME)
  private String boardName;

  public static final String SERIALIZED_NAME_BOARD_ID = "boardId";
  @SerializedName(SERIALIZED_NAME_BOARD_ID)
  private Long boardId;

  public static final String SERIALIZED_NAME_SIMPLE_BOARD = "simpleBoard";
  @SerializedName(SERIALIZED_NAME_SIMPLE_BOARD)
  private Boolean simpleBoard;

  public static final String SERIALIZED_NAME_QUEUE_ID = "queueId";
  @SerializedName(SERIALIZED_NAME_QUEUE_ID)
  private Long queueId;

  public static final String SERIALIZED_NAME_QUEUE_NAME = "queueName";
  @SerializedName(SERIALIZED_NAME_QUEUE_NAME)
  private String queueName;

  public static final String SERIALIZED_NAME_QUEUE_CATEGORY = "queueCategory";
  @SerializedName(SERIALIZED_NAME_QUEUE_CATEGORY)
  private String queueCategory;

  public ProjectLandingPageInfo() {
  }

  public ProjectLandingPageInfo url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public ProjectLandingPageInfo projectKey(String projectKey) {
    
    this.projectKey = projectKey;
    return this;
  }

   /**
   * Get projectKey
   * @return projectKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProjectKey() {
    return projectKey;
  }


  public void setProjectKey(String projectKey) {
    this.projectKey = projectKey;
  }


  public ProjectLandingPageInfo projectType(String projectType) {
    
    this.projectType = projectType;
    return this;
  }

   /**
   * Get projectType
   * @return projectType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProjectType() {
    return projectType;
  }


  public void setProjectType(String projectType) {
    this.projectType = projectType;
  }


  public ProjectLandingPageInfo attributes(Map<String, String> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public ProjectLandingPageInfo putAttributesItem(String key, String attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getAttributes() {
    return attributes;
  }


  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }


  public ProjectLandingPageInfo simplified(Boolean simplified) {
    
    this.simplified = simplified;
    return this;
  }

   /**
   * Get simplified
   * @return simplified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSimplified() {
    return simplified;
  }


  public void setSimplified(Boolean simplified) {
    this.simplified = simplified;
  }


  public ProjectLandingPageInfo boardName(String boardName) {
    
    this.boardName = boardName;
    return this;
  }

   /**
   * Get boardName
   * @return boardName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBoardName() {
    return boardName;
  }


  public void setBoardName(String boardName) {
    this.boardName = boardName;
  }


  public ProjectLandingPageInfo boardId(Long boardId) {
    
    this.boardId = boardId;
    return this;
  }

   /**
   * Get boardId
   * @return boardId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getBoardId() {
    return boardId;
  }


  public void setBoardId(Long boardId) {
    this.boardId = boardId;
  }


  public ProjectLandingPageInfo simpleBoard(Boolean simpleBoard) {
    
    this.simpleBoard = simpleBoard;
    return this;
  }

   /**
   * Get simpleBoard
   * @return simpleBoard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSimpleBoard() {
    return simpleBoard;
  }


  public void setSimpleBoard(Boolean simpleBoard) {
    this.simpleBoard = simpleBoard;
  }


  public ProjectLandingPageInfo queueId(Long queueId) {
    
    this.queueId = queueId;
    return this;
  }

   /**
   * Get queueId
   * @return queueId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getQueueId() {
    return queueId;
  }


  public void setQueueId(Long queueId) {
    this.queueId = queueId;
  }


  public ProjectLandingPageInfo queueName(String queueName) {
    
    this.queueName = queueName;
    return this;
  }

   /**
   * Get queueName
   * @return queueName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getQueueName() {
    return queueName;
  }


  public void setQueueName(String queueName) {
    this.queueName = queueName;
  }


  public ProjectLandingPageInfo queueCategory(String queueCategory) {
    
    this.queueCategory = queueCategory;
    return this;
  }

   /**
   * Get queueCategory
   * @return queueCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getQueueCategory() {
    return queueCategory;
  }


  public void setQueueCategory(String queueCategory) {
    this.queueCategory = queueCategory;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectLandingPageInfo projectLandingPageInfo = (ProjectLandingPageInfo) o;
    return Objects.equals(this.url, projectLandingPageInfo.url) &&
        Objects.equals(this.projectKey, projectLandingPageInfo.projectKey) &&
        Objects.equals(this.projectType, projectLandingPageInfo.projectType) &&
        Objects.equals(this.attributes, projectLandingPageInfo.attributes) &&
        Objects.equals(this.simplified, projectLandingPageInfo.simplified) &&
        Objects.equals(this.boardName, projectLandingPageInfo.boardName) &&
        Objects.equals(this.boardId, projectLandingPageInfo.boardId) &&
        Objects.equals(this.simpleBoard, projectLandingPageInfo.simpleBoard) &&
        Objects.equals(this.queueId, projectLandingPageInfo.queueId) &&
        Objects.equals(this.queueName, projectLandingPageInfo.queueName) &&
        Objects.equals(this.queueCategory, projectLandingPageInfo.queueCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, projectKey, projectType, attributes, simplified, boardName, boardId, simpleBoard, queueId, queueName, queueCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectLandingPageInfo {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    projectKey: ").append(toIndentedString(projectKey)).append("\n");
    sb.append("    projectType: ").append(toIndentedString(projectType)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    simplified: ").append(toIndentedString(simplified)).append("\n");
    sb.append("    boardName: ").append(toIndentedString(boardName)).append("\n");
    sb.append("    boardId: ").append(toIndentedString(boardId)).append("\n");
    sb.append("    simpleBoard: ").append(toIndentedString(simpleBoard)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
    sb.append("    queueCategory: ").append(toIndentedString(queueCategory)).append("\n");
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
    openapiFields.add("url");
    openapiFields.add("projectKey");
    openapiFields.add("projectType");
    openapiFields.add("attributes");
    openapiFields.add("simplified");
    openapiFields.add("boardName");
    openapiFields.add("boardId");
    openapiFields.add("simpleBoard");
    openapiFields.add("queueId");
    openapiFields.add("queueName");
    openapiFields.add("queueCategory");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectLandingPageInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProjectLandingPageInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectLandingPageInfo is not found in the empty JSON string", ProjectLandingPageInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProjectLandingPageInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectLandingPageInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("projectKey") != null && !jsonObj.get("projectKey").isJsonNull()) && !jsonObj.get("projectKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectKey").toString()));
      }
      if ((jsonObj.get("projectType") != null && !jsonObj.get("projectType").isJsonNull()) && !jsonObj.get("projectType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectType").toString()));
      }
      if ((jsonObj.get("boardName") != null && !jsonObj.get("boardName").isJsonNull()) && !jsonObj.get("boardName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `boardName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("boardName").toString()));
      }
      if ((jsonObj.get("queueName") != null && !jsonObj.get("queueName").isJsonNull()) && !jsonObj.get("queueName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `queueName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("queueName").toString()));
      }
      if ((jsonObj.get("queueCategory") != null && !jsonObj.get("queueCategory").isJsonNull()) && !jsonObj.get("queueCategory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `queueCategory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("queueCategory").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectLandingPageInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectLandingPageInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectLandingPageInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectLandingPageInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectLandingPageInfo>() {
           @Override
           public void write(JsonWriter out, ProjectLandingPageInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectLandingPageInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectLandingPageInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectLandingPageInfo
  * @throws IOException if the JSON string is invalid with respect to ProjectLandingPageInfo
  */
  public static ProjectLandingPageInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectLandingPageInfo.class);
  }

 /**
  * Convert an instance of ProjectLandingPageInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
