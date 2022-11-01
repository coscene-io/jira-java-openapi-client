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
import io.coscene.jira.client.v2.JSON;

/**
 * Details of a remote issue link.
 */
@ApiModel(description = "Details of a remote issue link.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class RemoteIssueLinkRequest {
  public static final String SERIALIZED_NAME_GLOBAL_ID = "globalId";
  @SerializedName(SERIALIZED_NAME_GLOBAL_ID)
  private String globalId;

  public static final String SERIALIZED_NAME_APPLICATION = "application";
  @SerializedName(SERIALIZED_NAME_APPLICATION)
  private RemoteIssueLinkRequestApplication application;

  public static final String SERIALIZED_NAME_RELATIONSHIP = "relationship";
  @SerializedName(SERIALIZED_NAME_RELATIONSHIP)
  private String relationship;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private RemoteIssueLinkObject _object;

  public RemoteIssueLinkRequest() {
  }

  public RemoteIssueLinkRequest globalId(String globalId) {
    
    this.globalId = globalId;
    return this;
  }

   /**
   * An identifier for the remote item in the remote system. For example, the global ID for a remote item in Confluence would consist of the app ID and page ID, like this: &#x60;appId&#x3D;456&amp;pageId&#x3D;123&#x60;.  Setting this field enables the remote issue link details to be updated or deleted using remote system and item details as the record identifier, rather than using the record&#39;s Jira ID.  The maximum length is 255 characters.
   * @return globalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An identifier for the remote item in the remote system. For example, the global ID for a remote item in Confluence would consist of the app ID and page ID, like this: `appId=456&pageId=123`.  Setting this field enables the remote issue link details to be updated or deleted using remote system and item details as the record identifier, rather than using the record's Jira ID.  The maximum length is 255 characters.")

  public String getGlobalId() {
    return globalId;
  }


  public void setGlobalId(String globalId) {
    this.globalId = globalId;
  }


  public RemoteIssueLinkRequest application(RemoteIssueLinkRequestApplication application) {
    
    this.application = application;
    return this;
  }

   /**
   * Get application
   * @return application
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RemoteIssueLinkRequestApplication getApplication() {
    return application;
  }


  public void setApplication(RemoteIssueLinkRequestApplication application) {
    this.application = application;
  }


  public RemoteIssueLinkRequest relationship(String relationship) {
    
    this.relationship = relationship;
    return this;
  }

   /**
   * Description of the relationship between the issue and the linked item. If not set, the relationship description \&quot;links to\&quot; is used in Jira.
   * @return relationship
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the relationship between the issue and the linked item. If not set, the relationship description \"links to\" is used in Jira.")

  public String getRelationship() {
    return relationship;
  }


  public void setRelationship(String relationship) {
    this.relationship = relationship;
  }


  public RemoteIssueLinkRequest _object(RemoteIssueLinkObject _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public RemoteIssueLinkObject getObject() {
    return _object;
  }


  public void setObject(RemoteIssueLinkObject _object) {
    this._object = _object;
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
  public RemoteIssueLinkRequest putAdditionalProperty(String key, Object value) {
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
    RemoteIssueLinkRequest remoteIssueLinkRequest = (RemoteIssueLinkRequest) o;
    return Objects.equals(this.globalId, remoteIssueLinkRequest.globalId) &&
        Objects.equals(this.application, remoteIssueLinkRequest.application) &&
        Objects.equals(this.relationship, remoteIssueLinkRequest.relationship) &&
        Objects.equals(this._object, remoteIssueLinkRequest._object)&&
        Objects.equals(this.additionalProperties, remoteIssueLinkRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(globalId, application, relationship, _object, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteIssueLinkRequest {\n");
    sb.append("    globalId: ").append(toIndentedString(globalId)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
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
    openapiFields.add("globalId");
    openapiFields.add("application");
    openapiFields.add("relationship");
    openapiFields.add("object");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("object");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RemoteIssueLinkRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RemoteIssueLinkRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RemoteIssueLinkRequest is not found in the empty JSON string", RemoteIssueLinkRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RemoteIssueLinkRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("globalId") != null && !jsonObj.get("globalId").isJsonNull()) && !jsonObj.get("globalId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `globalId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("globalId").toString()));
      }
      // validate the optional field `application`
      if (jsonObj.get("application") != null && !jsonObj.get("application").isJsonNull()) {
        RemoteIssueLinkRequestApplication.validateJsonObject(jsonObj.getAsJsonObject("application"));
      }
      if ((jsonObj.get("relationship") != null && !jsonObj.get("relationship").isJsonNull()) && !jsonObj.get("relationship").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `relationship` to be a primitive type in the JSON string but got `%s`", jsonObj.get("relationship").toString()));
      }
      // validate the optional field `object`
      if (jsonObj.get("object") != null && !jsonObj.get("object").isJsonNull()) {
        RemoteIssueLinkObject.validateJsonObject(jsonObj.getAsJsonObject("object"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RemoteIssueLinkRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RemoteIssueLinkRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RemoteIssueLinkRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RemoteIssueLinkRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<RemoteIssueLinkRequest>() {
           @Override
           public void write(JsonWriter out, RemoteIssueLinkRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
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
           public RemoteIssueLinkRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RemoteIssueLinkRequest instance = thisAdapter.fromJsonTree(jsonObj);
             for (Entry<String, JsonElement> entry : jsonObj.entrySet()) {
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
  * Create an instance of RemoteIssueLinkRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RemoteIssueLinkRequest
  * @throws IOException if the JSON string is invalid with respect to RemoteIssueLinkRequest
  */
  public static RemoteIssueLinkRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RemoteIssueLinkRequest.class);
  }

 /**
  * Convert an instance of RemoteIssueLinkRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

