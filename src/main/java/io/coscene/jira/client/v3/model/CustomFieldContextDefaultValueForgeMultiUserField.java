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
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

import io.coscene.jira.client.v3.JSON;

/**
 * Defaults for a Forge collection of users custom field.
 */
@ApiModel(description = "Defaults for a Forge collection of users custom field.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class CustomFieldContextDefaultValueForgeMultiUserField {
  public static final String SERIALIZED_NAME_CONTEXT_ID = "contextId";
  @SerializedName(SERIALIZED_NAME_CONTEXT_ID)
  private String contextId;

  public static final String SERIALIZED_NAME_ACCOUNT_IDS = "accountIds";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_IDS)
  private List<String> accountIds = new ArrayList<>();

  public CustomFieldContextDefaultValueForgeMultiUserField() {
  }

  public CustomFieldContextDefaultValueForgeMultiUserField contextId(String contextId) {
    
    this.contextId = contextId;
    return this;
  }

   /**
   * The ID of the context.
   * @return contextId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the context.")

  public String getContextId() {
    return contextId;
  }


  public void setContextId(String contextId) {
    this.contextId = contextId;
  }


  public CustomFieldContextDefaultValueForgeMultiUserField accountIds(List<String> accountIds) {
    
    this.accountIds = accountIds;
    return this;
  }

  public CustomFieldContextDefaultValueForgeMultiUserField addAccountIdsItem(String accountIdsItem) {
    this.accountIds.add(accountIdsItem);
    return this;
  }

   /**
   * The IDs of the default users.
   * @return accountIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The IDs of the default users.")

  public List<String> getAccountIds() {
    return accountIds;
  }


  public void setAccountIds(List<String> accountIds) {
    this.accountIds = accountIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldContextDefaultValueForgeMultiUserField customFieldContextDefaultValueForgeMultiUserField = (CustomFieldContextDefaultValueForgeMultiUserField) o;
    return Objects.equals(this.contextId, customFieldContextDefaultValueForgeMultiUserField.contextId) &&
        Objects.equals(this.accountIds, customFieldContextDefaultValueForgeMultiUserField.accountIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextId, accountIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextDefaultValueForgeMultiUserField {\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
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
    openapiFields.add("contextId");
    openapiFields.add("accountIds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("contextId");
    openapiRequiredFields.add("accountIds");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomFieldContextDefaultValueForgeMultiUserField
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CustomFieldContextDefaultValueForgeMultiUserField.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomFieldContextDefaultValueForgeMultiUserField is not found in the empty JSON string", CustomFieldContextDefaultValueForgeMultiUserField.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomFieldContextDefaultValueForgeMultiUserField.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomFieldContextDefaultValueForgeMultiUserField` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomFieldContextDefaultValueForgeMultiUserField.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("contextId") != null && !jsonObj.get("contextId").isJsonNull()) && !jsonObj.get("contextId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contextId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contextId").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("accountIds") != null && !jsonObj.get("accountIds").isJsonNull()) && !jsonObj.get("accountIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountIds` to be an array in the JSON string but got `%s`", jsonObj.get("accountIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomFieldContextDefaultValueForgeMultiUserField.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomFieldContextDefaultValueForgeMultiUserField' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomFieldContextDefaultValueForgeMultiUserField> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomFieldContextDefaultValueForgeMultiUserField.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomFieldContextDefaultValueForgeMultiUserField>() {
           @Override
           public void write(JsonWriter out, CustomFieldContextDefaultValueForgeMultiUserField value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomFieldContextDefaultValueForgeMultiUserField read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomFieldContextDefaultValueForgeMultiUserField given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomFieldContextDefaultValueForgeMultiUserField
  * @throws IOException if the JSON string is invalid with respect to CustomFieldContextDefaultValueForgeMultiUserField
  */
  public static CustomFieldContextDefaultValueForgeMultiUserField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomFieldContextDefaultValueForgeMultiUserField.class);
  }

 /**
  * Convert an instance of CustomFieldContextDefaultValueForgeMultiUserField to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

