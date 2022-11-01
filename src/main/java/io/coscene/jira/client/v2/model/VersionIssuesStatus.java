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
 * Counts of the number of issues in various statuses.
 */
@ApiModel(description = "Counts of the number of issues in various statuses.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class VersionIssuesStatus {
  public static final String SERIALIZED_NAME_UNMAPPED = "unmapped";
  @SerializedName(SERIALIZED_NAME_UNMAPPED)
  private Long unmapped;

  public static final String SERIALIZED_NAME_TO_DO = "toDo";
  @SerializedName(SERIALIZED_NAME_TO_DO)
  private Long toDo;

  public static final String SERIALIZED_NAME_IN_PROGRESS = "inProgress";
  @SerializedName(SERIALIZED_NAME_IN_PROGRESS)
  private Long inProgress;

  public static final String SERIALIZED_NAME_DONE = "done";
  @SerializedName(SERIALIZED_NAME_DONE)
  private Long done;

  public VersionIssuesStatus() {
  }

  
  public VersionIssuesStatus(
     Long unmapped, 
     Long toDo, 
     Long inProgress, 
     Long done
  ) {
    this();
    this.unmapped = unmapped;
    this.toDo = toDo;
    this.inProgress = inProgress;
    this.done = done;
  }

   /**
   * Count of issues with a status other than *to do*, *in progress*, and *done*.
   * @return unmapped
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Count of issues with a status other than *to do*, *in progress*, and *done*.")

  public Long getUnmapped() {
    return unmapped;
  }




   /**
   * Count of issues with status *to do*.
   * @return toDo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Count of issues with status *to do*.")

  public Long getToDo() {
    return toDo;
  }




   /**
   * Count of issues with status *in progress*.
   * @return inProgress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Count of issues with status *in progress*.")

  public Long getInProgress() {
    return inProgress;
  }




   /**
   * Count of issues with status *done*.
   * @return done
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Count of issues with status *done*.")

  public Long getDone() {
    return done;
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
  public VersionIssuesStatus putAdditionalProperty(String key, Object value) {
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
    VersionIssuesStatus versionIssuesStatus = (VersionIssuesStatus) o;
    return Objects.equals(this.unmapped, versionIssuesStatus.unmapped) &&
        Objects.equals(this.toDo, versionIssuesStatus.toDo) &&
        Objects.equals(this.inProgress, versionIssuesStatus.inProgress) &&
        Objects.equals(this.done, versionIssuesStatus.done)&&
        Objects.equals(this.additionalProperties, versionIssuesStatus.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unmapped, toDo, inProgress, done, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionIssuesStatus {\n");
    sb.append("    unmapped: ").append(toIndentedString(unmapped)).append("\n");
    sb.append("    toDo: ").append(toIndentedString(toDo)).append("\n");
    sb.append("    inProgress: ").append(toIndentedString(inProgress)).append("\n");
    sb.append("    done: ").append(toIndentedString(done)).append("\n");
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
    openapiFields.add("unmapped");
    openapiFields.add("toDo");
    openapiFields.add("inProgress");
    openapiFields.add("done");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VersionIssuesStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VersionIssuesStatus.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VersionIssuesStatus is not found in the empty JSON string", VersionIssuesStatus.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VersionIssuesStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VersionIssuesStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VersionIssuesStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VersionIssuesStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<VersionIssuesStatus>() {
           @Override
           public void write(JsonWriter out, VersionIssuesStatus value) throws IOException {
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
           public VersionIssuesStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VersionIssuesStatus instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VersionIssuesStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VersionIssuesStatus
  * @throws IOException if the JSON string is invalid with respect to VersionIssuesStatus
  */
  public static VersionIssuesStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VersionIssuesStatus.class);
  }

 /**
  * Convert an instance of VersionIssuesStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

