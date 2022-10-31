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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
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
import org.openapitools.client.model.FieldDetailsSchema;
import org.openapitools.client.model.FieldDetailsScope;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * The custom user or group field.
 */
@ApiModel(description = "The custom user or group field.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class EventNotificationField {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CUSTOM = "custom";
  @SerializedName(SERIALIZED_NAME_CUSTOM)
  private Boolean custom;

  public static final String SERIALIZED_NAME_ORDERABLE = "orderable";
  @SerializedName(SERIALIZED_NAME_ORDERABLE)
  private Boolean orderable;

  public static final String SERIALIZED_NAME_NAVIGABLE = "navigable";
  @SerializedName(SERIALIZED_NAME_NAVIGABLE)
  private Boolean navigable;

  public static final String SERIALIZED_NAME_SEARCHABLE = "searchable";
  @SerializedName(SERIALIZED_NAME_SEARCHABLE)
  private Boolean searchable;

  public static final String SERIALIZED_NAME_CLAUSE_NAMES = "clauseNames";
  @SerializedName(SERIALIZED_NAME_CLAUSE_NAMES)
  private Set<String> clauseNames = null;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private FieldDetailsScope scope;

  public static final String SERIALIZED_NAME_SCHEMA = "schema";
  @SerializedName(SERIALIZED_NAME_SCHEMA)
  private FieldDetailsSchema schema;

  public EventNotificationField() {
  }

  public EventNotificationField id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the field.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the field.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public EventNotificationField key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The key of the field.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the field.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public EventNotificationField name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the field.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the field.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public EventNotificationField custom(Boolean custom) {
    
    this.custom = custom;
    return this;
  }

   /**
   * Whether the field is a custom field.
   * @return custom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the field is a custom field.")

  public Boolean getCustom() {
    return custom;
  }


  public void setCustom(Boolean custom) {
    this.custom = custom;
  }


  public EventNotificationField orderable(Boolean orderable) {
    
    this.orderable = orderable;
    return this;
  }

   /**
   * Whether the content of the field can be used to order lists.
   * @return orderable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the content of the field can be used to order lists.")

  public Boolean getOrderable() {
    return orderable;
  }


  public void setOrderable(Boolean orderable) {
    this.orderable = orderable;
  }


  public EventNotificationField navigable(Boolean navigable) {
    
    this.navigable = navigable;
    return this;
  }

   /**
   * Whether the field can be used as a column on the issue navigator.
   * @return navigable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the field can be used as a column on the issue navigator.")

  public Boolean getNavigable() {
    return navigable;
  }


  public void setNavigable(Boolean navigable) {
    this.navigable = navigable;
  }


  public EventNotificationField searchable(Boolean searchable) {
    
    this.searchable = searchable;
    return this;
  }

   /**
   * Whether the content of the field can be searched.
   * @return searchable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the content of the field can be searched.")

  public Boolean getSearchable() {
    return searchable;
  }


  public void setSearchable(Boolean searchable) {
    this.searchable = searchable;
  }


  public EventNotificationField clauseNames(Set<String> clauseNames) {
    
    this.clauseNames = clauseNames;
    return this;
  }

  public EventNotificationField addClauseNamesItem(String clauseNamesItem) {
    if (this.clauseNames == null) {
      this.clauseNames = new LinkedHashSet<>();
    }
    this.clauseNames.add(clauseNamesItem);
    return this;
  }

   /**
   * The names that can be used to reference the field in an advanced search. For more information, see [Advanced searching - fields reference](https://confluence.atlassian.com/x/gwORLQ).
   * @return clauseNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The names that can be used to reference the field in an advanced search. For more information, see [Advanced searching - fields reference](https://confluence.atlassian.com/x/gwORLQ).")

  public Set<String> getClauseNames() {
    return clauseNames;
  }


  public void setClauseNames(Set<String> clauseNames) {
    this.clauseNames = clauseNames;
  }


  public EventNotificationField scope(FieldDetailsScope scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FieldDetailsScope getScope() {
    return scope;
  }


  public void setScope(FieldDetailsScope scope) {
    this.scope = scope;
  }


  public EventNotificationField schema(FieldDetailsSchema schema) {
    
    this.schema = schema;
    return this;
  }

   /**
   * Get schema
   * @return schema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FieldDetailsSchema getSchema() {
    return schema;
  }


  public void setSchema(FieldDetailsSchema schema) {
    this.schema = schema;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventNotificationField eventNotificationField = (EventNotificationField) o;
    return Objects.equals(this.id, eventNotificationField.id) &&
        Objects.equals(this.key, eventNotificationField.key) &&
        Objects.equals(this.name, eventNotificationField.name) &&
        Objects.equals(this.custom, eventNotificationField.custom) &&
        Objects.equals(this.orderable, eventNotificationField.orderable) &&
        Objects.equals(this.navigable, eventNotificationField.navigable) &&
        Objects.equals(this.searchable, eventNotificationField.searchable) &&
        Objects.equals(this.clauseNames, eventNotificationField.clauseNames) &&
        Objects.equals(this.scope, eventNotificationField.scope) &&
        Objects.equals(this.schema, eventNotificationField.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, name, custom, orderable, navigable, searchable, clauseNames, scope, schema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventNotificationField {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    orderable: ").append(toIndentedString(orderable)).append("\n");
    sb.append("    navigable: ").append(toIndentedString(navigable)).append("\n");
    sb.append("    searchable: ").append(toIndentedString(searchable)).append("\n");
    sb.append("    clauseNames: ").append(toIndentedString(clauseNames)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("custom");
    openapiFields.add("orderable");
    openapiFields.add("navigable");
    openapiFields.add("searchable");
    openapiFields.add("clauseNames");
    openapiFields.add("scope");
    openapiFields.add("schema");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EventNotificationField
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EventNotificationField.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventNotificationField is not found in the empty JSON string", EventNotificationField.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EventNotificationField.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventNotificationField` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("clauseNames") != null && !jsonObj.get("clauseNames").isJsonNull()) && !jsonObj.get("clauseNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `clauseNames` to be an array in the JSON string but got `%s`", jsonObj.get("clauseNames").toString()));
      }
      // validate the optional field `scope`
      if (jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull()) {
        FieldDetailsScope.validateJsonObject(jsonObj.getAsJsonObject("scope"));
      }
      // validate the optional field `schema`
      if (jsonObj.get("schema") != null && !jsonObj.get("schema").isJsonNull()) {
        FieldDetailsSchema.validateJsonObject(jsonObj.getAsJsonObject("schema"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventNotificationField.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventNotificationField' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventNotificationField> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventNotificationField.class));

       return (TypeAdapter<T>) new TypeAdapter<EventNotificationField>() {
           @Override
           public void write(JsonWriter out, EventNotificationField value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventNotificationField read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventNotificationField given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventNotificationField
  * @throws IOException if the JSON string is invalid with respect to EventNotificationField
  */
  public static EventNotificationField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventNotificationField.class);
  }

 /**
  * Convert an instance of EventNotificationField to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

