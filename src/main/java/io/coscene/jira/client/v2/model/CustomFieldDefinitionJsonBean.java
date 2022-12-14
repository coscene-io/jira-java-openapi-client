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
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import io.coscene.jira.client.v2.JSON;

/**
 * CustomFieldDefinitionJsonBean
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class CustomFieldDefinitionJsonBean {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  /**
   * The searcher defines the way the field is searched in Jira. For example, *com.atlassian.jira.plugin.system.customfieldtypes:grouppickersearcher*.   The search UI (basic search and JQL search) will display different operations and values for the field, based on the field searcher. You must specify a searcher that is valid for the field type, as listed below (abbreviated values shown):   *  &#x60;cascadingselect&#x60;: &#x60;cascadingselectsearcher&#x60;  *  &#x60;datepicker&#x60;: &#x60;daterange&#x60;  *  &#x60;datetime&#x60;: &#x60;datetimerange&#x60;  *  &#x60;float&#x60;: &#x60;exactnumber&#x60; or &#x60;numberrange&#x60;  *  &#x60;grouppicker&#x60;: &#x60;grouppickersearcher&#x60;  *  &#x60;importid&#x60;: &#x60;exactnumber&#x60; or &#x60;numberrange&#x60;  *  &#x60;labels&#x60;: &#x60;labelsearcher&#x60;  *  &#x60;multicheckboxes&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;multigrouppicker&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;multiselect&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;multiuserpicker&#x60;: &#x60;userpickergroupsearcher&#x60;  *  &#x60;multiversion&#x60;: &#x60;versionsearcher&#x60;  *  &#x60;project&#x60;: &#x60;projectsearcher&#x60;  *  &#x60;radiobuttons&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;readonlyfield&#x60;: &#x60;textsearcher&#x60;  *  &#x60;select&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;textarea&#x60;: &#x60;textsearcher&#x60;  *  &#x60;textfield&#x60;: &#x60;textsearcher&#x60;  *  &#x60;url&#x60;: &#x60;exacttextsearcher&#x60;  *  &#x60;userpicker&#x60;: &#x60;userpickergroupsearcher&#x60;  *  &#x60;version&#x60;: &#x60;versionsearcher&#x60;  If no searcher is provided, the field isn&#39;t searchable. However, [Forge custom fields](https://developer.atlassian.com/platform/forge/manifest-reference/modules/#jira-custom-field-type--beta-) have a searcher set automatically, so are always searchable.
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

  public CustomFieldDefinitionJsonBean() {
  }

  public CustomFieldDefinitionJsonBean name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the custom field, which is displayed in Jira. This is not the unique identifier.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the custom field, which is displayed in Jira. This is not the unique identifier.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CustomFieldDefinitionJsonBean description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the custom field, which is displayed in Jira.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the custom field, which is displayed in Jira.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public CustomFieldDefinitionJsonBean type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the custom field. These built-in custom field types are available:   *  &#x60;cascadingselect&#x60;: Enables values to be selected from two levels of select lists (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:cascadingselect&#x60;)  *  &#x60;datepicker&#x60;: Stores a date using a picker control (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:datepicker&#x60;)  *  &#x60;datetime&#x60;: Stores a date with a time component (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:datetime&#x60;)  *  &#x60;float&#x60;: Stores and validates a numeric (floating point) input (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:float&#x60;)  *  &#x60;grouppicker&#x60;: Stores a user group using a picker control (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:grouppicker&#x60;)  *  &#x60;importid&#x60;: A read-only field that stores the ID the issue had in the system it was imported from (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:importid&#x60;)  *  &#x60;labels&#x60;: Stores labels (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:labels&#x60;)  *  &#x60;multicheckboxes&#x60;: Stores multiple values using checkboxes (value: &#x60;&#x60;)  *  &#x60;multigrouppicker&#x60;: Stores multiple user groups using a picker control (value: &#x60;&#x60;)  *  &#x60;multiselect&#x60;: Stores multiple values using a select list (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:multicheckboxes&#x60;)  *  &#x60;multiuserpicker&#x60;: Stores multiple users using a picker control (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:multigrouppicker&#x60;)  *  &#x60;multiversion&#x60;: Stores multiple versions from the versions available in a project using a picker control (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:multiversion&#x60;)  *  &#x60;project&#x60;: Stores a project from a list of projects that the user is permitted to view (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:project&#x60;)  *  &#x60;radiobuttons&#x60;: Stores a value using radio buttons (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:radiobuttons&#x60;)  *  &#x60;readonlyfield&#x60;: Stores a read-only text value, which can only be populated via the API (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:readonlyfield&#x60;)  *  &#x60;select&#x60;: Stores a value from a configurable list of options (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:select&#x60;)  *  &#x60;textarea&#x60;: Stores a long text string using a multiline text area (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:textarea&#x60;)  *  &#x60;textfield&#x60;: Stores a text string using a single-line text box (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:textfield&#x60;)  *  &#x60;url&#x60;: Stores a URL (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:url&#x60;)  *  &#x60;userpicker&#x60;: Stores a user using a picker control (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:userpicker&#x60;)  *  &#x60;version&#x60;: Stores a version using a picker control (value: &#x60;com.atlassian.jira.plugin.system.customfieldtypes:version&#x60;)  To create a field based on a [Forge custom field type](https://developer.atlassian.com/platform/forge/manifest-reference/modules/#jira-custom-field-type--beta-), use the ID of the Forge custom field type as the value. For example, &#x60;ari:cloud:ecosystem::extension/e62f20a2-4b61-4dbe-bfb9-9a88b5e3ac84/548c5df1-24aa-4f7c-bbbb-3038d947cb05/static/my-cf-type-key&#x60;.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of the custom field. These built-in custom field types are available:   *  `cascadingselect`: Enables values to be selected from two levels of select lists (value: `com.atlassian.jira.plugin.system.customfieldtypes:cascadingselect`)  *  `datepicker`: Stores a date using a picker control (value: `com.atlassian.jira.plugin.system.customfieldtypes:datepicker`)  *  `datetime`: Stores a date with a time component (value: `com.atlassian.jira.plugin.system.customfieldtypes:datetime`)  *  `float`: Stores and validates a numeric (floating point) input (value: `com.atlassian.jira.plugin.system.customfieldtypes:float`)  *  `grouppicker`: Stores a user group using a picker control (value: `com.atlassian.jira.plugin.system.customfieldtypes:grouppicker`)  *  `importid`: A read-only field that stores the ID the issue had in the system it was imported from (value: `com.atlassian.jira.plugin.system.customfieldtypes:importid`)  *  `labels`: Stores labels (value: `com.atlassian.jira.plugin.system.customfieldtypes:labels`)  *  `multicheckboxes`: Stores multiple values using checkboxes (value: ``)  *  `multigrouppicker`: Stores multiple user groups using a picker control (value: ``)  *  `multiselect`: Stores multiple values using a select list (value: `com.atlassian.jira.plugin.system.customfieldtypes:multicheckboxes`)  *  `multiuserpicker`: Stores multiple users using a picker control (value: `com.atlassian.jira.plugin.system.customfieldtypes:multigrouppicker`)  *  `multiversion`: Stores multiple versions from the versions available in a project using a picker control (value: `com.atlassian.jira.plugin.system.customfieldtypes:multiversion`)  *  `project`: Stores a project from a list of projects that the user is permitted to view (value: `com.atlassian.jira.plugin.system.customfieldtypes:project`)  *  `radiobuttons`: Stores a value using radio buttons (value: `com.atlassian.jira.plugin.system.customfieldtypes:radiobuttons`)  *  `readonlyfield`: Stores a read-only text value, which can only be populated via the API (value: `com.atlassian.jira.plugin.system.customfieldtypes:readonlyfield`)  *  `select`: Stores a value from a configurable list of options (value: `com.atlassian.jira.plugin.system.customfieldtypes:select`)  *  `textarea`: Stores a long text string using a multiline text area (value: `com.atlassian.jira.plugin.system.customfieldtypes:textarea`)  *  `textfield`: Stores a text string using a single-line text box (value: `com.atlassian.jira.plugin.system.customfieldtypes:textfield`)  *  `url`: Stores a URL (value: `com.atlassian.jira.plugin.system.customfieldtypes:url`)  *  `userpicker`: Stores a user using a picker control (value: `com.atlassian.jira.plugin.system.customfieldtypes:userpicker`)  *  `version`: Stores a version using a picker control (value: `com.atlassian.jira.plugin.system.customfieldtypes:version`)  To create a field based on a [Forge custom field type](https://developer.atlassian.com/platform/forge/manifest-reference/modules/#jira-custom-field-type--beta-), use the ID of the Forge custom field type as the value. For example, `ari:cloud:ecosystem::extension/e62f20a2-4b61-4dbe-bfb9-9a88b5e3ac84/548c5df1-24aa-4f7c-bbbb-3038d947cb05/static/my-cf-type-key`.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public CustomFieldDefinitionJsonBean searcherKey(SearcherKeyEnum searcherKey) {
    
    this.searcherKey = searcherKey;
    return this;
  }

   /**
   * The searcher defines the way the field is searched in Jira. For example, *com.atlassian.jira.plugin.system.customfieldtypes:grouppickersearcher*.   The search UI (basic search and JQL search) will display different operations and values for the field, based on the field searcher. You must specify a searcher that is valid for the field type, as listed below (abbreviated values shown):   *  &#x60;cascadingselect&#x60;: &#x60;cascadingselectsearcher&#x60;  *  &#x60;datepicker&#x60;: &#x60;daterange&#x60;  *  &#x60;datetime&#x60;: &#x60;datetimerange&#x60;  *  &#x60;float&#x60;: &#x60;exactnumber&#x60; or &#x60;numberrange&#x60;  *  &#x60;grouppicker&#x60;: &#x60;grouppickersearcher&#x60;  *  &#x60;importid&#x60;: &#x60;exactnumber&#x60; or &#x60;numberrange&#x60;  *  &#x60;labels&#x60;: &#x60;labelsearcher&#x60;  *  &#x60;multicheckboxes&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;multigrouppicker&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;multiselect&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;multiuserpicker&#x60;: &#x60;userpickergroupsearcher&#x60;  *  &#x60;multiversion&#x60;: &#x60;versionsearcher&#x60;  *  &#x60;project&#x60;: &#x60;projectsearcher&#x60;  *  &#x60;radiobuttons&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;readonlyfield&#x60;: &#x60;textsearcher&#x60;  *  &#x60;select&#x60;: &#x60;multiselectsearcher&#x60;  *  &#x60;textarea&#x60;: &#x60;textsearcher&#x60;  *  &#x60;textfield&#x60;: &#x60;textsearcher&#x60;  *  &#x60;url&#x60;: &#x60;exacttextsearcher&#x60;  *  &#x60;userpicker&#x60;: &#x60;userpickergroupsearcher&#x60;  *  &#x60;version&#x60;: &#x60;versionsearcher&#x60;  If no searcher is provided, the field isn&#39;t searchable. However, [Forge custom fields](https://developer.atlassian.com/platform/forge/manifest-reference/modules/#jira-custom-field-type--beta-) have a searcher set automatically, so are always searchable.
   * @return searcherKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The searcher defines the way the field is searched in Jira. For example, *com.atlassian.jira.plugin.system.customfieldtypes:grouppickersearcher*.   The search UI (basic search and JQL search) will display different operations and values for the field, based on the field searcher. You must specify a searcher that is valid for the field type, as listed below (abbreviated values shown):   *  `cascadingselect`: `cascadingselectsearcher`  *  `datepicker`: `daterange`  *  `datetime`: `datetimerange`  *  `float`: `exactnumber` or `numberrange`  *  `grouppicker`: `grouppickersearcher`  *  `importid`: `exactnumber` or `numberrange`  *  `labels`: `labelsearcher`  *  `multicheckboxes`: `multiselectsearcher`  *  `multigrouppicker`: `multiselectsearcher`  *  `multiselect`: `multiselectsearcher`  *  `multiuserpicker`: `userpickergroupsearcher`  *  `multiversion`: `versionsearcher`  *  `project`: `projectsearcher`  *  `radiobuttons`: `multiselectsearcher`  *  `readonlyfield`: `textsearcher`  *  `select`: `multiselectsearcher`  *  `textarea`: `textsearcher`  *  `textfield`: `textsearcher`  *  `url`: `exacttextsearcher`  *  `userpicker`: `userpickergroupsearcher`  *  `version`: `versionsearcher`  If no searcher is provided, the field isn't searchable. However, [Forge custom fields](https://developer.atlassian.com/platform/forge/manifest-reference/modules/#jira-custom-field-type--beta-) have a searcher set automatically, so are always searchable.")

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
    CustomFieldDefinitionJsonBean customFieldDefinitionJsonBean = (CustomFieldDefinitionJsonBean) o;
    return Objects.equals(this.name, customFieldDefinitionJsonBean.name) &&
        Objects.equals(this.description, customFieldDefinitionJsonBean.description) &&
        Objects.equals(this.type, customFieldDefinitionJsonBean.type) &&
        Objects.equals(this.searcherKey, customFieldDefinitionJsonBean.searcherKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, type, searcherKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldDefinitionJsonBean {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("searcherKey");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CustomFieldDefinitionJsonBean
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CustomFieldDefinitionJsonBean.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CustomFieldDefinitionJsonBean is not found in the empty JSON string", CustomFieldDefinitionJsonBean.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CustomFieldDefinitionJsonBean.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CustomFieldDefinitionJsonBean` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CustomFieldDefinitionJsonBean.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("searcherKey") != null && !jsonObj.get("searcherKey").isJsonNull()) && !jsonObj.get("searcherKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `searcherKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("searcherKey").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CustomFieldDefinitionJsonBean.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CustomFieldDefinitionJsonBean' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CustomFieldDefinitionJsonBean> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CustomFieldDefinitionJsonBean.class));

       return (TypeAdapter<T>) new TypeAdapter<CustomFieldDefinitionJsonBean>() {
           @Override
           public void write(JsonWriter out, CustomFieldDefinitionJsonBean value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CustomFieldDefinitionJsonBean read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CustomFieldDefinitionJsonBean given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CustomFieldDefinitionJsonBean
  * @throws IOException if the JSON string is invalid with respect to CustomFieldDefinitionJsonBean
  */
  public static CustomFieldDefinitionJsonBean fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CustomFieldDefinitionJsonBean.class);
  }

 /**
  * Convert an instance of CustomFieldDefinitionJsonBean to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

