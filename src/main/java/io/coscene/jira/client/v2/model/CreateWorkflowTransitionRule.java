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
 * A workflow transition rule.
 */
@ApiModel(description = "A workflow transition rule.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class CreateWorkflowTransitionRule {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_CONFIGURATION = "configuration";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION)
  private Map<String, Object> _configuration = null;

  public CreateWorkflowTransitionRule() {
  }

  public CreateWorkflowTransitionRule type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the transition rule.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of the transition rule.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public CreateWorkflowTransitionRule _configuration(Map<String, Object> _configuration) {
    
    this._configuration = _configuration;
    return this;
  }

  public CreateWorkflowTransitionRule putConfigurationItem(String key, Object _configurationItem) {
    if (this._configuration == null) {
      this._configuration = new HashMap<>();
    }
    this._configuration.put(key, _configurationItem);
    return this;
  }

   /**
   * EXPERIMENTAL. The configuration of the transition rule.
   * @return _configuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "EXPERIMENTAL. The configuration of the transition rule.")

  public Map<String, Object> getConfiguration() {
    return _configuration;
  }


  public void setConfiguration(Map<String, Object> _configuration) {
    this._configuration = _configuration;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateWorkflowTransitionRule createWorkflowTransitionRule = (CreateWorkflowTransitionRule) o;
    return Objects.equals(this.type, createWorkflowTransitionRule.type) &&
        Objects.equals(this._configuration, createWorkflowTransitionRule._configuration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, _configuration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateWorkflowTransitionRule {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("configuration");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateWorkflowTransitionRule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreateWorkflowTransitionRule.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateWorkflowTransitionRule is not found in the empty JSON string", CreateWorkflowTransitionRule.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateWorkflowTransitionRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateWorkflowTransitionRule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateWorkflowTransitionRule.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateWorkflowTransitionRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateWorkflowTransitionRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateWorkflowTransitionRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateWorkflowTransitionRule.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateWorkflowTransitionRule>() {
           @Override
           public void write(JsonWriter out, CreateWorkflowTransitionRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateWorkflowTransitionRule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateWorkflowTransitionRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateWorkflowTransitionRule
  * @throws IOException if the JSON string is invalid with respect to CreateWorkflowTransitionRule
  */
  public static CreateWorkflowTransitionRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateWorkflowTransitionRule.class);
  }

 /**
  * Convert an instance of CreateWorkflowTransitionRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

