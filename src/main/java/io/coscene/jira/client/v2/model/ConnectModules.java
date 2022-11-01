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
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import io.coscene.jira.client.v2.JSON;

/**
 * ConnectModules
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class ConnectModules {
  public static final String SERIALIZED_NAME_MODULES = "modules";
  @SerializedName(SERIALIZED_NAME_MODULES)
  private List<Object> modules = new ArrayList<>();

  public ConnectModules() {
  }

  public ConnectModules modules(List<Object> modules) {
    
    this.modules = modules;
    return this;
  }

  public ConnectModules addModulesItem(Object modulesItem) {
    this.modules.add(modulesItem);
    return this;
  }

   /**
   * A list of app modules in the same format as the &#x60;modules&#x60; property in the [app descriptor](https://developer.atlassian.com/cloud/jira/platform/app-descriptor/).
   * @return modules
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of app modules in the same format as the `modules` property in the [app descriptor](https://developer.atlassian.com/cloud/jira/platform/app-descriptor/).")

  public List<Object> getModules() {
    return modules;
  }


  public void setModules(List<Object> modules) {
    this.modules = modules;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectModules connectModules = (ConnectModules) o;
    return Objects.equals(this.modules, connectModules.modules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectModules {\n");
    sb.append("    modules: ").append(toIndentedString(modules)).append("\n");
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
    openapiFields.add("modules");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("modules");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConnectModules
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ConnectModules.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConnectModules is not found in the empty JSON string", ConnectModules.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConnectModules.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConnectModules` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ConnectModules.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("modules") != null && !jsonObj.get("modules").isJsonNull()) && !jsonObj.get("modules").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `modules` to be an array in the JSON string but got `%s`", jsonObj.get("modules").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConnectModules.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConnectModules' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConnectModules> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConnectModules.class));

       return (TypeAdapter<T>) new TypeAdapter<ConnectModules>() {
           @Override
           public void write(JsonWriter out, ConnectModules value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConnectModules read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConnectModules given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConnectModules
  * @throws IOException if the JSON string is invalid with respect to ConnectModules
  */
  public static ConnectModules fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConnectModules.class);
  }

 /**
  * Convert an instance of ConnectModules to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

