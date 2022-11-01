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
 * The issue that is available under the &#x60;issue&#x60; variable when evaluating the expression.
 */
@ApiModel(description = "The issue that is available under the `issue` variable when evaluating the expression.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class JiraExpressionEvalContextBeanIssue {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public JiraExpressionEvalContextBeanIssue() {
  }

  public JiraExpressionEvalContextBeanIssue id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the referenced item.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the referenced item.")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public JiraExpressionEvalContextBeanIssue key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The key of the referenced item.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the referenced item.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraExpressionEvalContextBeanIssue jiraExpressionEvalContextBeanIssue = (JiraExpressionEvalContextBeanIssue) o;
    return Objects.equals(this.id, jiraExpressionEvalContextBeanIssue.id) &&
        Objects.equals(this.key, jiraExpressionEvalContextBeanIssue.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraExpressionEvalContextBeanIssue {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
    openapiFields.add("key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JiraExpressionEvalContextBeanIssue
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JiraExpressionEvalContextBeanIssue.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JiraExpressionEvalContextBeanIssue is not found in the empty JSON string", JiraExpressionEvalContextBeanIssue.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JiraExpressionEvalContextBeanIssue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JiraExpressionEvalContextBeanIssue` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JiraExpressionEvalContextBeanIssue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JiraExpressionEvalContextBeanIssue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JiraExpressionEvalContextBeanIssue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JiraExpressionEvalContextBeanIssue.class));

       return (TypeAdapter<T>) new TypeAdapter<JiraExpressionEvalContextBeanIssue>() {
           @Override
           public void write(JsonWriter out, JiraExpressionEvalContextBeanIssue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JiraExpressionEvalContextBeanIssue read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JiraExpressionEvalContextBeanIssue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JiraExpressionEvalContextBeanIssue
  * @throws IOException if the JSON string is invalid with respect to JiraExpressionEvalContextBeanIssue
  */
  public static JiraExpressionEvalContextBeanIssue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JiraExpressionEvalContextBeanIssue.class);
  }

 /**
  * Convert an instance of JiraExpressionEvalContextBeanIssue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

