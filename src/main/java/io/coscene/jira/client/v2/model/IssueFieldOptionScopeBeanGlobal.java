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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import io.coscene.jira.client.v2.JSON;

/**
 * Defines the behavior of the option within the global context. If this property is set, even if set to an empty object, then the option is available in all projects.
 */
@ApiModel(description = "Defines the behavior of the option within the global context. If this property is set, even if set to an empty object, then the option is available in all projects.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class IssueFieldOptionScopeBeanGlobal {
  /**
   * Gets or Sets attributes
   */
  @JsonAdapter(AttributesEnum.Adapter.class)
  public enum AttributesEnum {
    NOTSELECTABLE("notSelectable"),
    
    DEFAULTVALUE("defaultValue");

    private String value;

    AttributesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AttributesEnum fromValue(String value) {
      for (AttributesEnum b : AttributesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AttributesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AttributesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AttributesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AttributesEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
  private Set<AttributesEnum> attributes = null;

  public IssueFieldOptionScopeBeanGlobal() {
  }

  public IssueFieldOptionScopeBeanGlobal attributes(Set<AttributesEnum> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public IssueFieldOptionScopeBeanGlobal addAttributesItem(AttributesEnum attributesItem) {
    if (this.attributes == null) {
      this.attributes = new LinkedHashSet<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

   /**
   * Defines the behavior of the option in the global context.If notSelectable is set, the option cannot be set as the field&#39;s value. This is useful for archiving an option that has previously been selected but shouldn&#39;t be used anymore.If defaultValue is set, the option is selected by default.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defines the behavior of the option in the global context.If notSelectable is set, the option cannot be set as the field's value. This is useful for archiving an option that has previously been selected but shouldn't be used anymore.If defaultValue is set, the option is selected by default.")

  public Set<AttributesEnum> getAttributes() {
    return attributes;
  }


  public void setAttributes(Set<AttributesEnum> attributes) {
    this.attributes = attributes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueFieldOptionScopeBeanGlobal issueFieldOptionScopeBeanGlobal = (IssueFieldOptionScopeBeanGlobal) o;
    return Objects.equals(this.attributes, issueFieldOptionScopeBeanGlobal.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueFieldOptionScopeBeanGlobal {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
    openapiFields.add("attributes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IssueFieldOptionScopeBeanGlobal
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IssueFieldOptionScopeBeanGlobal.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssueFieldOptionScopeBeanGlobal is not found in the empty JSON string", IssueFieldOptionScopeBeanGlobal.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IssueFieldOptionScopeBeanGlobal.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IssueFieldOptionScopeBeanGlobal` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("attributes") != null && !jsonObj.get("attributes").isJsonNull()) && !jsonObj.get("attributes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `attributes` to be an array in the JSON string but got `%s`", jsonObj.get("attributes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssueFieldOptionScopeBeanGlobal.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssueFieldOptionScopeBeanGlobal' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssueFieldOptionScopeBeanGlobal> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssueFieldOptionScopeBeanGlobal.class));

       return (TypeAdapter<T>) new TypeAdapter<IssueFieldOptionScopeBeanGlobal>() {
           @Override
           public void write(JsonWriter out, IssueFieldOptionScopeBeanGlobal value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IssueFieldOptionScopeBeanGlobal read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IssueFieldOptionScopeBeanGlobal given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IssueFieldOptionScopeBeanGlobal
  * @throws IOException if the JSON string is invalid with respect to IssueFieldOptionScopeBeanGlobal
  */
  public static IssueFieldOptionScopeBeanGlobal fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssueFieldOptionScopeBeanGlobal.class);
  }

 /**
  * Convert an instance of IssueFieldOptionScopeBeanGlobal to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

