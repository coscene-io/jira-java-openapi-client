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
 * IncludedFields
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class IncludedFields {
  public static final String SERIALIZED_NAME_INCLUDED = "included";
  @SerializedName(SERIALIZED_NAME_INCLUDED)
  private Set<String> included = null;

  public static final String SERIALIZED_NAME_ACTUALLY_INCLUDED = "actuallyIncluded";
  @SerializedName(SERIALIZED_NAME_ACTUALLY_INCLUDED)
  private Set<String> actuallyIncluded = null;

  public static final String SERIALIZED_NAME_EXCLUDED = "excluded";
  @SerializedName(SERIALIZED_NAME_EXCLUDED)
  private Set<String> excluded = null;

  public IncludedFields() {
  }

  public IncludedFields included(Set<String> included) {
    
    this.included = included;
    return this;
  }

  public IncludedFields addIncludedItem(String includedItem) {
    if (this.included == null) {
      this.included = new LinkedHashSet<>();
    }
    this.included.add(includedItem);
    return this;
  }

   /**
   * Get included
   * @return included
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getIncluded() {
    return included;
  }


  public void setIncluded(Set<String> included) {
    this.included = included;
  }


  public IncludedFields actuallyIncluded(Set<String> actuallyIncluded) {
    
    this.actuallyIncluded = actuallyIncluded;
    return this;
  }

  public IncludedFields addActuallyIncludedItem(String actuallyIncludedItem) {
    if (this.actuallyIncluded == null) {
      this.actuallyIncluded = new LinkedHashSet<>();
    }
    this.actuallyIncluded.add(actuallyIncludedItem);
    return this;
  }

   /**
   * Get actuallyIncluded
   * @return actuallyIncluded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getActuallyIncluded() {
    return actuallyIncluded;
  }


  public void setActuallyIncluded(Set<String> actuallyIncluded) {
    this.actuallyIncluded = actuallyIncluded;
  }


  public IncludedFields excluded(Set<String> excluded) {
    
    this.excluded = excluded;
    return this;
  }

  public IncludedFields addExcludedItem(String excludedItem) {
    if (this.excluded == null) {
      this.excluded = new LinkedHashSet<>();
    }
    this.excluded.add(excludedItem);
    return this;
  }

   /**
   * Get excluded
   * @return excluded
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getExcluded() {
    return excluded;
  }


  public void setExcluded(Set<String> excluded) {
    this.excluded = excluded;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncludedFields includedFields = (IncludedFields) o;
    return Objects.equals(this.included, includedFields.included) &&
        Objects.equals(this.actuallyIncluded, includedFields.actuallyIncluded) &&
        Objects.equals(this.excluded, includedFields.excluded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(included, actuallyIncluded, excluded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncludedFields {\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    actuallyIncluded: ").append(toIndentedString(actuallyIncluded)).append("\n");
    sb.append("    excluded: ").append(toIndentedString(excluded)).append("\n");
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
    openapiFields.add("included");
    openapiFields.add("actuallyIncluded");
    openapiFields.add("excluded");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IncludedFields
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IncludedFields.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IncludedFields is not found in the empty JSON string", IncludedFields.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IncludedFields.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IncludedFields` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("included") != null && !jsonObj.get("included").isJsonNull()) && !jsonObj.get("included").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `included` to be an array in the JSON string but got `%s`", jsonObj.get("included").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("actuallyIncluded") != null && !jsonObj.get("actuallyIncluded").isJsonNull()) && !jsonObj.get("actuallyIncluded").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `actuallyIncluded` to be an array in the JSON string but got `%s`", jsonObj.get("actuallyIncluded").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("excluded") != null && !jsonObj.get("excluded").isJsonNull()) && !jsonObj.get("excluded").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `excluded` to be an array in the JSON string but got `%s`", jsonObj.get("excluded").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IncludedFields.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IncludedFields' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IncludedFields> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IncludedFields.class));

       return (TypeAdapter<T>) new TypeAdapter<IncludedFields>() {
           @Override
           public void write(JsonWriter out, IncludedFields value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IncludedFields read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IncludedFields given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IncludedFields
  * @throws IOException if the JSON string is invalid with respect to IncludedFields
  */
  public static IncludedFields fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IncludedFields.class);
  }

 /**
  * Convert an instance of IncludedFields to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

