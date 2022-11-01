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
import com.google.gson.annotations.JsonAdapter;
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
 * Details of an entity property.
 */
@ApiModel(description = "Details of an entity property.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class JqlQueryFieldEntityProperty {
  public static final String SERIALIZED_NAME_ENTITY = "entity";
  @SerializedName(SERIALIZED_NAME_ENTITY)
  private String entity;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  /**
   * The type of the property value extraction. Not available if the extraction for the property is not registered on the instance with the [Entity property](https://developer.atlassian.com/cloud/jira/platform/modules/entity-property/) module.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    NUMBER("number"),
    
    STRING("string"),
    
    TEXT("text"),
    
    DATE("date"),
    
    USER("user");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public JqlQueryFieldEntityProperty() {
  }

  public JqlQueryFieldEntityProperty entity(String entity) {
    
    this.entity = entity;
    return this;
  }

   /**
   * The object on which the property is set.
   * @return entity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "issue", required = true, value = "The object on which the property is set.")

  public String getEntity() {
    return entity;
  }


  public void setEntity(String entity) {
    this.entity = entity;
  }


  public JqlQueryFieldEntityProperty key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The key of the property.
   * @return key
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "stats", required = true, value = "The key of the property.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public JqlQueryFieldEntityProperty path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * The path in the property value to query.
   * @return path
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "comments.count", required = true, value = "The path in the property value to query.")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public JqlQueryFieldEntityProperty type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the property value extraction. Not available if the extraction for the property is not registered on the instance with the [Entity property](https://developer.atlassian.com/cloud/jira/platform/modules/entity-property/) module.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "number", value = "The type of the property value extraction. Not available if the extraction for the property is not registered on the instance with the [Entity property](https://developer.atlassian.com/cloud/jira/platform/modules/entity-property/) module.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JqlQueryFieldEntityProperty jqlQueryFieldEntityProperty = (JqlQueryFieldEntityProperty) o;
    return Objects.equals(this.entity, jqlQueryFieldEntityProperty.entity) &&
        Objects.equals(this.key, jqlQueryFieldEntityProperty.key) &&
        Objects.equals(this.path, jqlQueryFieldEntityProperty.path) &&
        Objects.equals(this.type, jqlQueryFieldEntityProperty.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, key, path, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JqlQueryFieldEntityProperty {\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("entity");
    openapiFields.add("key");
    openapiFields.add("path");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("entity");
    openapiRequiredFields.add("key");
    openapiRequiredFields.add("path");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JqlQueryFieldEntityProperty
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (JqlQueryFieldEntityProperty.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in JqlQueryFieldEntityProperty is not found in the empty JSON string", JqlQueryFieldEntityProperty.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!JqlQueryFieldEntityProperty.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `JqlQueryFieldEntityProperty` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : JqlQueryFieldEntityProperty.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("entity") != null && !jsonObj.get("entity").isJsonNull()) && !jsonObj.get("entity").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entity` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entity").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("path") != null && !jsonObj.get("path").isJsonNull()) && !jsonObj.get("path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("path").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JqlQueryFieldEntityProperty.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JqlQueryFieldEntityProperty' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JqlQueryFieldEntityProperty> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JqlQueryFieldEntityProperty.class));

       return (TypeAdapter<T>) new TypeAdapter<JqlQueryFieldEntityProperty>() {
           @Override
           public void write(JsonWriter out, JqlQueryFieldEntityProperty value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public JqlQueryFieldEntityProperty read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of JqlQueryFieldEntityProperty given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JqlQueryFieldEntityProperty
  * @throws IOException if the JSON string is invalid with respect to JqlQueryFieldEntityProperty
  */
  public static JqlQueryFieldEntityProperty fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JqlQueryFieldEntityProperty.class);
  }

 /**
  * Convert an instance of JqlQueryFieldEntityProperty to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

