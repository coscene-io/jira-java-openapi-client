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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import io.coscene.jira.client.v2.JSON;

/**
 * Container for a list of registered webhooks. Webhook details are returned in the same order as the request.
 */
@ApiModel(description = "Container for a list of registered webhooks. Webhook details are returned in the same order as the request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class ContainerForRegisteredWebhooks {
  public static final String SERIALIZED_NAME_WEBHOOK_REGISTRATION_RESULT = "webhookRegistrationResult";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_REGISTRATION_RESULT)
  private List<RegisteredWebhook> webhookRegistrationResult = null;

  public ContainerForRegisteredWebhooks() {
  }

  public ContainerForRegisteredWebhooks webhookRegistrationResult(List<RegisteredWebhook> webhookRegistrationResult) {
    
    this.webhookRegistrationResult = webhookRegistrationResult;
    return this;
  }

  public ContainerForRegisteredWebhooks addWebhookRegistrationResultItem(RegisteredWebhook webhookRegistrationResultItem) {
    if (this.webhookRegistrationResult == null) {
      this.webhookRegistrationResult = new ArrayList<>();
    }
    this.webhookRegistrationResult.add(webhookRegistrationResultItem);
    return this;
  }

   /**
   * A list of registered webhooks.
   * @return webhookRegistrationResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of registered webhooks.")

  public List<RegisteredWebhook> getWebhookRegistrationResult() {
    return webhookRegistrationResult;
  }


  public void setWebhookRegistrationResult(List<RegisteredWebhook> webhookRegistrationResult) {
    this.webhookRegistrationResult = webhookRegistrationResult;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerForRegisteredWebhooks containerForRegisteredWebhooks = (ContainerForRegisteredWebhooks) o;
    return Objects.equals(this.webhookRegistrationResult, containerForRegisteredWebhooks.webhookRegistrationResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookRegistrationResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerForRegisteredWebhooks {\n");
    sb.append("    webhookRegistrationResult: ").append(toIndentedString(webhookRegistrationResult)).append("\n");
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
    openapiFields.add("webhookRegistrationResult");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ContainerForRegisteredWebhooks
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ContainerForRegisteredWebhooks.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContainerForRegisteredWebhooks is not found in the empty JSON string", ContainerForRegisteredWebhooks.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ContainerForRegisteredWebhooks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContainerForRegisteredWebhooks` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("webhookRegistrationResult") != null && !jsonObj.get("webhookRegistrationResult").isJsonNull()) {
        JsonArray jsonArraywebhookRegistrationResult = jsonObj.getAsJsonArray("webhookRegistrationResult");
        if (jsonArraywebhookRegistrationResult != null) {
          // ensure the json data is an array
          if (!jsonObj.get("webhookRegistrationResult").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `webhookRegistrationResult` to be an array in the JSON string but got `%s`", jsonObj.get("webhookRegistrationResult").toString()));
          }

          // validate the optional field `webhookRegistrationResult` (array)
          for (int i = 0; i < jsonArraywebhookRegistrationResult.size(); i++) {
            RegisteredWebhook.validateJsonObject(jsonArraywebhookRegistrationResult.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContainerForRegisteredWebhooks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContainerForRegisteredWebhooks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContainerForRegisteredWebhooks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContainerForRegisteredWebhooks.class));

       return (TypeAdapter<T>) new TypeAdapter<ContainerForRegisteredWebhooks>() {
           @Override
           public void write(JsonWriter out, ContainerForRegisteredWebhooks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContainerForRegisteredWebhooks read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ContainerForRegisteredWebhooks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ContainerForRegisteredWebhooks
  * @throws IOException if the JSON string is invalid with respect to ContainerForRegisteredWebhooks
  */
  public static ContainerForRegisteredWebhooks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContainerForRegisteredWebhooks.class);
  }

 /**
  * Convert an instance of ContainerForRegisteredWebhooks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
