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
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import io.coscene.jira.client.v3.JSON;

/**
 * IssuesUpdateBean
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class IssuesUpdateBean {
  public static final String SERIALIZED_NAME_ISSUE_UPDATES = "issueUpdates";
  @SerializedName(SERIALIZED_NAME_ISSUE_UPDATES)
  private List<IssueUpdateDetails> issueUpdates = null;

  public IssuesUpdateBean() {
  }

  public IssuesUpdateBean issueUpdates(List<IssueUpdateDetails> issueUpdates) {
    
    this.issueUpdates = issueUpdates;
    return this;
  }

  public IssuesUpdateBean addIssueUpdatesItem(IssueUpdateDetails issueUpdatesItem) {
    if (this.issueUpdates == null) {
      this.issueUpdates = new ArrayList<>();
    }
    this.issueUpdates.add(issueUpdatesItem);
    return this;
  }

   /**
   * Get issueUpdates
   * @return issueUpdates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IssueUpdateDetails> getIssueUpdates() {
    return issueUpdates;
  }


  public void setIssueUpdates(List<IssueUpdateDetails> issueUpdates) {
    this.issueUpdates = issueUpdates;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   */
  public IssuesUpdateBean putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuesUpdateBean issuesUpdateBean = (IssuesUpdateBean) o;
    return Objects.equals(this.issueUpdates, issuesUpdateBean.issueUpdates)&&
        Objects.equals(this.additionalProperties, issuesUpdateBean.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueUpdates, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssuesUpdateBean {\n");
    sb.append("    issueUpdates: ").append(toIndentedString(issueUpdates)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("issueUpdates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IssuesUpdateBean
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IssuesUpdateBean.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssuesUpdateBean is not found in the empty JSON string", IssuesUpdateBean.openapiRequiredFields.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("issueUpdates") != null && !jsonObj.get("issueUpdates").isJsonNull()) && !jsonObj.get("issueUpdates").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `issueUpdates` to be an array in the JSON string but got `%s`", jsonObj.get("issueUpdates").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssuesUpdateBean.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssuesUpdateBean' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssuesUpdateBean> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssuesUpdateBean.class));

       return (TypeAdapter<T>) new TypeAdapter<IssuesUpdateBean>() {
           @Override
           public void write(JsonWriter out, IssuesUpdateBean value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public IssuesUpdateBean read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             IssuesUpdateBean instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else { // non-primitive type
                   instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IssuesUpdateBean given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IssuesUpdateBean
  * @throws IOException if the JSON string is invalid with respect to IssuesUpdateBean
  */
  public static IssuesUpdateBean fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssuesUpdateBean.class);
  }

 /**
  * Convert an instance of IssuesUpdateBean to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

