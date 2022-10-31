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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.SecurityScheme;

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
 * List of security schemes.
 */
@ApiModel(description = "List of security schemes.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class SecuritySchemes {
  public static final String SERIALIZED_NAME_ISSUE_SECURITY_SCHEMES = "issueSecuritySchemes";
  @SerializedName(SERIALIZED_NAME_ISSUE_SECURITY_SCHEMES)
  private List<SecurityScheme> issueSecuritySchemes = null;

  public SecuritySchemes() {
  }

  
  public SecuritySchemes(
     List<SecurityScheme> issueSecuritySchemes
  ) {
    this();
    this.issueSecuritySchemes = issueSecuritySchemes;
  }

   /**
   * List of security schemes.
   * @return issueSecuritySchemes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of security schemes.")

  public List<SecurityScheme> getIssueSecuritySchemes() {
    return issueSecuritySchemes;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecuritySchemes securitySchemes = (SecuritySchemes) o;
    return Objects.equals(this.issueSecuritySchemes, securitySchemes.issueSecuritySchemes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueSecuritySchemes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritySchemes {\n");
    sb.append("    issueSecuritySchemes: ").append(toIndentedString(issueSecuritySchemes)).append("\n");
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
    openapiFields.add("issueSecuritySchemes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SecuritySchemes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SecuritySchemes.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SecuritySchemes is not found in the empty JSON string", SecuritySchemes.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SecuritySchemes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SecuritySchemes` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("issueSecuritySchemes") != null && !jsonObj.get("issueSecuritySchemes").isJsonNull()) {
        JsonArray jsonArrayissueSecuritySchemes = jsonObj.getAsJsonArray("issueSecuritySchemes");
        if (jsonArrayissueSecuritySchemes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("issueSecuritySchemes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `issueSecuritySchemes` to be an array in the JSON string but got `%s`", jsonObj.get("issueSecuritySchemes").toString()));
          }

          // validate the optional field `issueSecuritySchemes` (array)
          for (int i = 0; i < jsonArrayissueSecuritySchemes.size(); i++) {
            SecurityScheme.validateJsonObject(jsonArrayissueSecuritySchemes.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SecuritySchemes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SecuritySchemes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SecuritySchemes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SecuritySchemes.class));

       return (TypeAdapter<T>) new TypeAdapter<SecuritySchemes>() {
           @Override
           public void write(JsonWriter out, SecuritySchemes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SecuritySchemes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SecuritySchemes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SecuritySchemes
  * @throws IOException if the JSON string is invalid with respect to SecuritySchemes
  */
  public static SecuritySchemes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SecuritySchemes.class);
  }

 /**
  * Convert an instance of SecuritySchemes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

