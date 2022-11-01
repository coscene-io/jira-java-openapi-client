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


package io.coscene.jira.client.v3.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

import io.coscene.jira.client.v3.JSON;

/**
 * Details of a custom field.
 */
@ApiModel(description = "Details of a custom field.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class UpdateCustomFieldDetails {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * The searcher that defines the way the field is searched in Jira. It can be set to &#x60;null&#x60;, otherwise you must specify the valid searcher for the field type, as listed below (abbreviated values shown):   *  &#x60;cascadingselect&#x60;: &#x60;cascadingselectsearcher&#x60;  *  &#x60;datepicker&#x60;: &#x60;daterange&#x60;  *  &#x60;datetime&#x60;: &#x60;datetimerange&#x60;  *  &#x60;float&#x60;: &#x60;exactnumber&#x60; or &#x60;numberrange&#x60;  *  &#x60;grouppicker&#x60;: &#x60;grouppickersearcher&#x60;  *  &#x60;importid&#x60;: &#x60;exactnumber&#x60; or &#x60;numberrange&#x60;  *  &#x60;labels&#x60;: &#x60;labelsearcher&#x60;  *  &#x60;multicheckboxes&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;multigrouppicker&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;multiselect&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;multiuserpicker&#x60;: &#x60;userpickergroupsearcher&#x60;  *  &#x60;multiversion&#x60;: &#x60;versionsearcher&#x60;  *  &#x60;project&#x60;: &#x60;projectsearcher&#x60;  *  &#x60;radiobuttons&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;readonlyfield&#x60;: &#x60;textsearcher&#x60;  *  &#x60;select&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;textarea&#x60;: &#x60;textsearcher&#x60;  *  &#x60;textfield&#x60;: &#x60;textsearcher&#x60;  *  &#x60;url&#x60;: &#x60;exacttextsearcher&#x60;  *  &#x60;userpicker&#x60;: &#x60;userpickergroupsearcher&#x60;  *  &#x60;version&#x60;: &#x60;versionsearcher&#x60;
   */
  @JsonAdapter(SearcherKeyEnum.Adapter.class)
  public enum SearcherKeyEnum {
    CASCADINGSELECTSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:cascadingselectsearcher"),
    
    DATERANGE("com.atlassian.jira.plugin.system.customfieldtypes:daterange"),
    
    DATETIMERANGE("com.atlassian.jira.plugin.system.customfieldtypes:datetimerange"),
    
    EXACTNUMBER("com.atlassian.jira.plugin.system.customfieldtypes:exactnumber"),
    
    EXACTTEXTSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:exacttextsearcher"),
    
    GROUPPICKERSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:grouppickersearcher"),
    
    LABELSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:labelsearcher"),
    
    MULTISELECTSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:multiselectsearcher"),
    
    NUMBERRANGE("com.atlassian.jira.plugin.system.customfieldtypes:numberrange"),
    
    PROJECTSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:projectsearcher"),
    
    TEXTSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:textsearcher"),
    
    USERPICKERGROUPSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:userpickergroupsearcher"),
    
    VERSIONSEARCHER("com.atlassian.jira.plugin.system.customfieldtypes:versionsearcher");

    private String value;

    SearcherKeyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SearcherKeyEnum fromValue(String value) {
      for (SearcherKeyEnum b : SearcherKeyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SearcherKeyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SearcherKeyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SearcherKeyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SearcherKeyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SEARCHER_KEY = "searcherKey";
  @SerializedName(SERIALIZED_NAME_SEARCHER_KEY)
  private SearcherKeyEnum searcherKey;

  public UpdateCustomFieldDetails() {
  }

  public UpdateCustomFieldDetails name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the custom field. It doesn&#39;t have to be unique. The maximum length is 255 characters.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the custom field. It doesn't have to be unique. The maximum length is 255 characters.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UpdateCustomFieldDetails description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the custom field. The maximum length is 40000 characters.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the custom field. The maximum length is 40000 characters.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public UpdateCustomFieldDetails searcherKey(SearcherKeyEnum searcherKey) {
    
    this.searcherKey = searcherKey;
    return this;
  }

   /**
   * The searcher that defines the way the field is searched in Jira. It can be set to &#x60;null&#x60;, otherwise you must specify the valid searcher for the field type, as listed below (abbreviated values shown):   *  &#x60;cascadingselect&#x60;: &#x60;cascadingselectsearcher&#x60;  *  &#x60;datepicker&#x60;: &#x60;daterange&#x60;  *  &#x60;datetime&#x60;: &#x60;datetimerange&#x60;  *  &#x60;float&#x60;: &#x60;exactnumber&#x60; or &#x60;numberrange&#x60;  *  &#x60;grouppicker&#x60;: &#x60;grouppickersearcher&#x60;  *  &#x60;importid&#x60;: &#x60;exactnumber&#x60; or &#x60;numberrange&#x60;  *  &#x60;labels&#x60;: &#x60;labelsearcher&#x60;  *  &#x60;multicheckboxes&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;multigrouppicker&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;multiselect&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;multiuserpicker&#x60;: &#x60;userpickergroupsearcher&#x60;  *  &#x60;multiversion&#x60;: &#x60;versionsearcher&#x60;  *  &#x60;project&#x60;: &#x60;projectsearcher&#x60;  *  &#x60;radiobuttons&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;readonlyfield&#x60;: &#x60;textsearcher&#x60;  *  &#x60;select&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;textarea&#x60;: &#x60;textsearcher&#x60;  *  &#x60;textfield&#x60;: &#x60;textsearcher&#x60;  *  &#x60;url&#x60;: &#x60;exacttextsearcher&#x60;  *  &#x60;userpicker&#x60;: &#x60;userpickergroupsearcher&#x60;  *  &#x60;version&#x60;: &#x60;versionsearcher&#x60;
   * @return searcherKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The searcher that defines the way the field is searched in Jira. It can be set to `null`, otherwise you must specify the valid searcher for the field type, as listed below (abbreviated values shown):   *  `cascadingselect`: `cascadingselectsearcher`  *  `datepicker`: `daterange`  *  `datetime`: `datetimerange`  *  `float`: `exactnumber` or `numberrange`  *  `grouppicker`: `grouppickersearcher`  *  `importid`: `exactnumber` or `numberrange`  *  `labels`: `labelsearcher`  *  `multicheckboxes`: `multiselectsearcher`  *  `multigrouppicker`: `multiselectsearcher`  *  `multiselect`: `multiselectsearcher`  *  `multiuserpicker`: `userpickergroupsearcher`  *  `multiversion`: `versionsearcher`  *  `project`: `projectsearcher`  *  `radiobuttons`: `multiselectsearcher`  *  `readonlyfield`: `textsearcher`  *  `select`: `multiselectsearcher`  *  `textarea`: `textsearcher`  *  `textfield`: `textsearcher`  *  `url`: `exacttextsearcher`  *  `userpicker`: `userpickergroupsearcher`  *  `version`: `versionsearcher`")

  public SearcherKeyEnum getSearcherKey() {
    return searcherKey;
  }


  public void setSearcherKey(SearcherKeyEnum searcherKey) {
    this.searcherKey = searcherKey;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCustomFieldDetails updateCustomFieldDetails = (UpdateCustomFieldDetails) o;
    return Objects.equals(this.name, updateCustomFieldDetails.name) &&
        Objects.equals(this.description, updateCustomFieldDetails.description) &&
        Objects.equals(this.searcherKey, updateCustomFieldDetails.searcherKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, searcherKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCustomFieldDetails {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    searcherKey: ").append(toIndentedString(searcherKey)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("searcherKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateCustomFieldDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdateCustomFieldDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateCustomFieldDetails is not found in the empty JSON string", UpdateCustomFieldDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateCustomFieldDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateCustomFieldDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("searcherKey") != null && !jsonObj.get("searcherKey").isJsonNull()) && !jsonObj.get("searcherKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `searcherKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("searcherKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateCustomFieldDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateCustomFieldDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateCustomFieldDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateCustomFieldDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateCustomFieldDetails>() {
           @Override
           public void write(JsonWriter out, UpdateCustomFieldDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateCustomFieldDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateCustomFieldDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateCustomFieldDetails
  * @throws IOException if the JSON string is invalid with respect to UpdateCustomFieldDetails
  */
  public static UpdateCustomFieldDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateCustomFieldDetails.class);
  }

 /**
  * Convert an instance of UpdateCustomFieldDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

