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
import java.net.URI;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import io.coscene.jira.client.v2.JSON;

/**
 * List of changed worklogs.
 */
@ApiModel(description = "List of changed worklogs.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class ChangedWorklogs {
  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<ChangedWorklog> values = null;

  public static final String SERIALIZED_NAME_SINCE = "since";
  @SerializedName(SERIALIZED_NAME_SINCE)
  private Long since;

  public static final String SERIALIZED_NAME_UNTIL = "until";
  @SerializedName(SERIALIZED_NAME_UNTIL)
  private Long until;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private URI self;

  public static final String SERIALIZED_NAME_NEXT_PAGE = "nextPage";
  @SerializedName(SERIALIZED_NAME_NEXT_PAGE)
  private URI nextPage;

  public static final String SERIALIZED_NAME_LAST_PAGE = "lastPage";
  @SerializedName(SERIALIZED_NAME_LAST_PAGE)
  private Boolean lastPage;

  public ChangedWorklogs() {
  }

  
  public ChangedWorklogs(
     List<ChangedWorklog> values, 
     Long since, 
     Long until, 
     URI self, 
     URI nextPage
  ) {
    this();
    this.values = values;
    this.since = since;
    this.until = until;
    this.self = self;
    this.nextPage = nextPage;
  }

   /**
   * Changed worklog list.
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Changed worklog list.")

  public List<ChangedWorklog> getValues() {
    return values;
  }




   /**
   * The datetime of the first worklog item in the list.
   * @return since
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The datetime of the first worklog item in the list.")

  public Long getSince() {
    return since;
  }




   /**
   * The datetime of the last worklog item in the list.
   * @return until
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The datetime of the last worklog item in the list.")

  public Long getUntil() {
    return until;
  }




   /**
   * The URL of this changed worklogs list.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of this changed worklogs list.")

  public URI getSelf() {
    return self;
  }




   /**
   * The URL of the next list of changed worklogs.
   * @return nextPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the next list of changed worklogs.")

  public URI getNextPage() {
    return nextPage;
  }




  public ChangedWorklogs lastPage(Boolean lastPage) {
    
    this.lastPage = lastPage;
    return this;
  }

   /**
   * Get lastPage
   * @return lastPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getLastPage() {
    return lastPage;
  }


  public void setLastPage(Boolean lastPage) {
    this.lastPage = lastPage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangedWorklogs changedWorklogs = (ChangedWorklogs) o;
    return Objects.equals(this.values, changedWorklogs.values) &&
        Objects.equals(this.since, changedWorklogs.since) &&
        Objects.equals(this.until, changedWorklogs.until) &&
        Objects.equals(this.self, changedWorklogs.self) &&
        Objects.equals(this.nextPage, changedWorklogs.nextPage) &&
        Objects.equals(this.lastPage, changedWorklogs.lastPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values, since, until, self, nextPage, lastPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangedWorklogs {\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    since: ").append(toIndentedString(since)).append("\n");
    sb.append("    until: ").append(toIndentedString(until)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
    sb.append("    lastPage: ").append(toIndentedString(lastPage)).append("\n");
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
    openapiFields.add("values");
    openapiFields.add("since");
    openapiFields.add("until");
    openapiFields.add("self");
    openapiFields.add("nextPage");
    openapiFields.add("lastPage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChangedWorklogs
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ChangedWorklogs.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChangedWorklogs is not found in the empty JSON string", ChangedWorklogs.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ChangedWorklogs.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChangedWorklogs` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("values") != null && !jsonObj.get("values").isJsonNull()) {
        JsonArray jsonArrayvalues = jsonObj.getAsJsonArray("values");
        if (jsonArrayvalues != null) {
          // ensure the json data is an array
          if (!jsonObj.get("values").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
          }

          // validate the optional field `values` (array)
          for (int i = 0; i < jsonArrayvalues.size(); i++) {
            ChangedWorklog.validateJsonObject(jsonArrayvalues.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) && !jsonObj.get("self").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self").toString()));
      }
      if ((jsonObj.get("nextPage") != null && !jsonObj.get("nextPage").isJsonNull()) && !jsonObj.get("nextPage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextPage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextPage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChangedWorklogs.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChangedWorklogs' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChangedWorklogs> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChangedWorklogs.class));

       return (TypeAdapter<T>) new TypeAdapter<ChangedWorklogs>() {
           @Override
           public void write(JsonWriter out, ChangedWorklogs value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChangedWorklogs read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChangedWorklogs given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChangedWorklogs
  * @throws IOException if the JSON string is invalid with respect to ChangedWorklogs
  */
  public static ChangedWorklogs fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChangedWorklogs.class);
  }

 /**
  * Convert an instance of ChangedWorklogs to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

