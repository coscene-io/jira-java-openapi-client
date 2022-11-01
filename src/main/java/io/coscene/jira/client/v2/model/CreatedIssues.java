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
import com.google.gson.JsonArray;
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
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import io.coscene.jira.client.v2.JSON;

/**
 * Details about the issues created and the errors for requests that failed.
 */
@ApiModel(description = "Details about the issues created and the errors for requests that failed.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class CreatedIssues {
  public static final String SERIALIZED_NAME_ISSUES = "issues";
  @SerializedName(SERIALIZED_NAME_ISSUES)
  private List<CreatedIssue> issues = null;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<BulkOperationErrorResult> errors = null;

  public CreatedIssues() {
  }

  
  public CreatedIssues(
     List<CreatedIssue> issues, 
     List<BulkOperationErrorResult> errors
  ) {
    this();
    this.issues = issues;
    this.errors = errors;
  }

   /**
   * Details of the issues created.
   * @return issues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details of the issues created.")

  public List<CreatedIssue> getIssues() {
    return issues;
  }




   /**
   * Error details for failed issue creation requests.
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Error details for failed issue creation requests.")

  public List<BulkOperationErrorResult> getErrors() {
    return errors;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatedIssues createdIssues = (CreatedIssues) o;
    return Objects.equals(this.issues, createdIssues.issues) &&
        Objects.equals(this.errors, createdIssues.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issues, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatedIssues {\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
    openapiFields.add("issues");
    openapiFields.add("errors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreatedIssues
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CreatedIssues.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreatedIssues is not found in the empty JSON string", CreatedIssues.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreatedIssues.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreatedIssues` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("issues") != null && !jsonObj.get("issues").isJsonNull()) {
        JsonArray jsonArrayissues = jsonObj.getAsJsonArray("issues");
        if (jsonArrayissues != null) {
          // ensure the json data is an array
          if (!jsonObj.get("issues").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `issues` to be an array in the JSON string but got `%s`", jsonObj.get("issues").toString()));
          }

          // validate the optional field `issues` (array)
          for (int i = 0; i < jsonArrayissues.size(); i++) {
            CreatedIssue.validateJsonObject(jsonArrayissues.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("errors") != null && !jsonObj.get("errors").isJsonNull()) {
        JsonArray jsonArrayerrors = jsonObj.getAsJsonArray("errors");
        if (jsonArrayerrors != null) {
          // ensure the json data is an array
          if (!jsonObj.get("errors").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
          }

          // validate the optional field `errors` (array)
          for (int i = 0; i < jsonArrayerrors.size(); i++) {
            BulkOperationErrorResult.validateJsonObject(jsonArrayerrors.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreatedIssues.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreatedIssues' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreatedIssues> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreatedIssues.class));

       return (TypeAdapter<T>) new TypeAdapter<CreatedIssues>() {
           @Override
           public void write(JsonWriter out, CreatedIssues value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreatedIssues read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreatedIssues given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreatedIssues
  * @throws IOException if the JSON string is invalid with respect to CreatedIssues
  */
  public static CreatedIssues fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreatedIssues.class);
  }

 /**
  * Convert an instance of CreatedIssues to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

