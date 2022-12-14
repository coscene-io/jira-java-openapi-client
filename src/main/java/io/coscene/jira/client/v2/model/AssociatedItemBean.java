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
 * Details of an item associated with the changed record.
 */
@ApiModel(description = "Details of an item associated with the changed record.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class AssociatedItemBean {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE_NAME = "typeName";
  @SerializedName(SERIALIZED_NAME_TYPE_NAME)
  private String typeName;

  public static final String SERIALIZED_NAME_PARENT_ID = "parentId";
  @SerializedName(SERIALIZED_NAME_PARENT_ID)
  private String parentId;

  public static final String SERIALIZED_NAME_PARENT_NAME = "parentName";
  @SerializedName(SERIALIZED_NAME_PARENT_NAME)
  private String parentName;

  public AssociatedItemBean() {
  }

  
  public AssociatedItemBean(
     String id, 
     String name, 
     String typeName, 
     String parentId, 
     String parentName
  ) {
    this();
    this.id = id;
    this.name = name;
    this.typeName = typeName;
    this.parentId = parentId;
    this.parentName = parentName;
  }

   /**
   * The ID of the associated record.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the associated record.")

  public String getId() {
    return id;
  }




   /**
   * The name of the associated record.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the associated record.")

  public String getName() {
    return name;
  }




   /**
   * The type of the associated record.
   * @return typeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of the associated record.")

  public String getTypeName() {
    return typeName;
  }




   /**
   * The ID of the associated parent record.
   * @return parentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the associated parent record.")

  public String getParentId() {
    return parentId;
  }




   /**
   * The name of the associated parent record.
   * @return parentName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the associated parent record.")

  public String getParentName() {
    return parentName;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssociatedItemBean associatedItemBean = (AssociatedItemBean) o;
    return Objects.equals(this.id, associatedItemBean.id) &&
        Objects.equals(this.name, associatedItemBean.name) &&
        Objects.equals(this.typeName, associatedItemBean.typeName) &&
        Objects.equals(this.parentId, associatedItemBean.parentId) &&
        Objects.equals(this.parentName, associatedItemBean.parentName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, typeName, parentId, parentName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociatedItemBean {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    parentName: ").append(toIndentedString(parentName)).append("\n");
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
    openapiFields.add("typeName");
    openapiFields.add("parentId");
    openapiFields.add("parentName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AssociatedItemBean
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AssociatedItemBean.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AssociatedItemBean is not found in the empty JSON string", AssociatedItemBean.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AssociatedItemBean.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AssociatedItemBean` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("typeName") != null && !jsonObj.get("typeName").isJsonNull()) && !jsonObj.get("typeName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `typeName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("typeName").toString()));
      }
      if ((jsonObj.get("parentId") != null && !jsonObj.get("parentId").isJsonNull()) && !jsonObj.get("parentId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentId").toString()));
      }
      if ((jsonObj.get("parentName") != null && !jsonObj.get("parentName").isJsonNull()) && !jsonObj.get("parentName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AssociatedItemBean.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AssociatedItemBean' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AssociatedItemBean> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AssociatedItemBean.class));

       return (TypeAdapter<T>) new TypeAdapter<AssociatedItemBean>() {
           @Override
           public void write(JsonWriter out, AssociatedItemBean value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AssociatedItemBean read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AssociatedItemBean given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AssociatedItemBean
  * @throws IOException if the JSON string is invalid with respect to AssociatedItemBean
  */
  public static AssociatedItemBean fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssociatedItemBean.class);
  }

 /**
  * Convert an instance of AssociatedItemBean to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

