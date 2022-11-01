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
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import io.coscene.jira.client.v2.JSON;

/**
 * Provides details about the linked issue. If presenting this link in a user interface, use the &#x60;inward&#x60; field of the issue link type to label the link.
 */
@ApiModel(description = "Provides details about the linked issue. If presenting this link in a user interface, use the `inward` field of the issue link type to label the link.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class IssueLinkInwardIssue {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private URI self;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private LinkedIssueFields fields;

  public IssueLinkInwardIssue() {
  }

  
  public IssueLinkInwardIssue(
     URI self
  ) {
    this();
    this.self = self;
  }

  public IssueLinkInwardIssue id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of an issue. Required if &#x60;key&#x60; isn&#39;t provided.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of an issue. Required if `key` isn't provided.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public IssueLinkInwardIssue key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The key of an issue. Required if &#x60;id&#x60; isn&#39;t provided.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of an issue. Required if `id` isn't provided.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


   /**
   * The URL of the issue.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the issue.")

  public URI getSelf() {
    return self;
  }




  public IssueLinkInwardIssue fields(LinkedIssueFields fields) {
    
    this.fields = fields;
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkedIssueFields getFields() {
    return fields;
  }


  public void setFields(LinkedIssueFields fields) {
    this.fields = fields;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueLinkInwardIssue issueLinkInwardIssue = (IssueLinkInwardIssue) o;
    return Objects.equals(this.id, issueLinkInwardIssue.id) &&
        Objects.equals(this.key, issueLinkInwardIssue.key) &&
        Objects.equals(this.self, issueLinkInwardIssue.self) &&
        Objects.equals(this.fields, issueLinkInwardIssue.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, self, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueLinkInwardIssue {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
    openapiFields.add("self");
    openapiFields.add("fields");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IssueLinkInwardIssue
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IssueLinkInwardIssue.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssueLinkInwardIssue is not found in the empty JSON string", IssueLinkInwardIssue.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IssueLinkInwardIssue.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IssueLinkInwardIssue` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) && !jsonObj.get("self").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self").toString()));
      }
      // validate the optional field `fields`
      if (jsonObj.get("fields") != null && !jsonObj.get("fields").isJsonNull()) {
        LinkedIssueFields.validateJsonObject(jsonObj.getAsJsonObject("fields"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssueLinkInwardIssue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssueLinkInwardIssue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssueLinkInwardIssue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssueLinkInwardIssue.class));

       return (TypeAdapter<T>) new TypeAdapter<IssueLinkInwardIssue>() {
           @Override
           public void write(JsonWriter out, IssueLinkInwardIssue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IssueLinkInwardIssue read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IssueLinkInwardIssue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IssueLinkInwardIssue
  * @throws IOException if the JSON string is invalid with respect to IssueLinkInwardIssue
  */
  public static IssueLinkInwardIssue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssueLinkInwardIssue.class);
  }

 /**
  * Convert an instance of IssueLinkInwardIssue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

