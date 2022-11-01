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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import io.coscene.jira.client.v2.JSON;

/**
 * Details of a field that can be used in advanced searches.
 */
@ApiModel(description = "Details of a field that can be used in advanced searches.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class FieldReferenceData {
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  /**
   * Whether the field can be used in a query&#39;s &#x60;ORDER BY&#x60; clause.
   */
  @JsonAdapter(OrderableEnum.Adapter.class)
  public enum OrderableEnum {
    TRUE("true"),
    
    FALSE("false");

    private String value;

    OrderableEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OrderableEnum fromValue(String value) {
      for (OrderableEnum b : OrderableEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OrderableEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OrderableEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OrderableEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OrderableEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ORDERABLE = "orderable";
  @SerializedName(SERIALIZED_NAME_ORDERABLE)
  private OrderableEnum orderable;

  /**
   * Whether the content of this field can be searched.
   */
  @JsonAdapter(SearchableEnum.Adapter.class)
  public enum SearchableEnum {
    TRUE("true"),
    
    FALSE("false");

    private String value;

    SearchableEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SearchableEnum fromValue(String value) {
      for (SearchableEnum b : SearchableEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SearchableEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SearchableEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SearchableEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SearchableEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SEARCHABLE = "searchable";
  @SerializedName(SERIALIZED_NAME_SEARCHABLE)
  private SearchableEnum searchable;

  /**
   * Whether this field has been deprecated.
   */
  @JsonAdapter(DeprecatedEnum.Adapter.class)
  public enum DeprecatedEnum {
    TRUE("true"),
    
    FALSE("false");

    private String value;

    DeprecatedEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeprecatedEnum fromValue(String value) {
      for (DeprecatedEnum b : DeprecatedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DeprecatedEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeprecatedEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeprecatedEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DeprecatedEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DEPRECATED = "deprecated";
  @SerializedName(SERIALIZED_NAME_DEPRECATED)
  private DeprecatedEnum deprecated;

  public static final String SERIALIZED_NAME_DEPRECATED_SEARCHER_KEY = "deprecatedSearcherKey";
  @SerializedName(SERIALIZED_NAME_DEPRECATED_SEARCHER_KEY)
  private String deprecatedSearcherKey;

  /**
   * Whether the field provide auto-complete suggestions.
   */
  @JsonAdapter(AutoEnum.Adapter.class)
  public enum AutoEnum {
    TRUE("true"),
    
    FALSE("false");

    private String value;

    AutoEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AutoEnum fromValue(String value) {
      for (AutoEnum b : AutoEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AutoEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AutoEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AutoEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AutoEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AUTO = "auto";
  @SerializedName(SERIALIZED_NAME_AUTO)
  private AutoEnum auto;

  public static final String SERIALIZED_NAME_CFID = "cfid";
  @SerializedName(SERIALIZED_NAME_CFID)
  private String cfid;

  public static final String SERIALIZED_NAME_OPERATORS = "operators";
  @SerializedName(SERIALIZED_NAME_OPERATORS)
  private List<String> operators = null;

  public static final String SERIALIZED_NAME_TYPES = "types";
  @SerializedName(SERIALIZED_NAME_TYPES)
  private List<String> types = null;

  public FieldReferenceData() {
  }

  public FieldReferenceData value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The field identifier.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The field identifier.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public FieldReferenceData displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name contains the following:   *  for system fields, the field name. For example, &#x60;Summary&#x60;.  *  for collapsed custom fields, the field name followed by a hyphen and then the field name and field type. For example, &#x60;Component - Component[Dropdown]&#x60;.  *  for other custom fields, the field name followed by a hyphen and then the custom field ID. For example, &#x60;Component - cf[10061]&#x60;.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display name contains the following:   *  for system fields, the field name. For example, `Summary`.  *  for collapsed custom fields, the field name followed by a hyphen and then the field name and field type. For example, `Component - Component[Dropdown]`.  *  for other custom fields, the field name followed by a hyphen and then the custom field ID. For example, `Component - cf[10061]`.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public FieldReferenceData orderable(OrderableEnum orderable) {
    
    this.orderable = orderable;
    return this;
  }

   /**
   * Whether the field can be used in a query&#39;s &#x60;ORDER BY&#x60; clause.
   * @return orderable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the field can be used in a query's `ORDER BY` clause.")

  public OrderableEnum getOrderable() {
    return orderable;
  }


  public void setOrderable(OrderableEnum orderable) {
    this.orderable = orderable;
  }


  public FieldReferenceData searchable(SearchableEnum searchable) {
    
    this.searchable = searchable;
    return this;
  }

   /**
   * Whether the content of this field can be searched.
   * @return searchable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the content of this field can be searched.")

  public SearchableEnum getSearchable() {
    return searchable;
  }


  public void setSearchable(SearchableEnum searchable) {
    this.searchable = searchable;
  }


  public FieldReferenceData deprecated(DeprecatedEnum deprecated) {
    
    this.deprecated = deprecated;
    return this;
  }

   /**
   * Whether this field has been deprecated.
   * @return deprecated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this field has been deprecated.")

  public DeprecatedEnum getDeprecated() {
    return deprecated;
  }


  public void setDeprecated(DeprecatedEnum deprecated) {
    this.deprecated = deprecated;
  }


  public FieldReferenceData deprecatedSearcherKey(String deprecatedSearcherKey) {
    
    this.deprecatedSearcherKey = deprecatedSearcherKey;
    return this;
  }

   /**
   * The searcher key of the field, only passed when the field is deprecated.
   * @return deprecatedSearcherKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The searcher key of the field, only passed when the field is deprecated.")

  public String getDeprecatedSearcherKey() {
    return deprecatedSearcherKey;
  }


  public void setDeprecatedSearcherKey(String deprecatedSearcherKey) {
    this.deprecatedSearcherKey = deprecatedSearcherKey;
  }


  public FieldReferenceData auto(AutoEnum auto) {
    
    this.auto = auto;
    return this;
  }

   /**
   * Whether the field provide auto-complete suggestions.
   * @return auto
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the field provide auto-complete suggestions.")

  public AutoEnum getAuto() {
    return auto;
  }


  public void setAuto(AutoEnum auto) {
    this.auto = auto;
  }


  public FieldReferenceData cfid(String cfid) {
    
    this.cfid = cfid;
    return this;
  }

   /**
   * If the item is a custom field, the ID of the custom field.
   * @return cfid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the item is a custom field, the ID of the custom field.")

  public String getCfid() {
    return cfid;
  }


  public void setCfid(String cfid) {
    this.cfid = cfid;
  }


  public FieldReferenceData operators(List<String> operators) {
    
    this.operators = operators;
    return this;
  }

  public FieldReferenceData addOperatorsItem(String operatorsItem) {
    if (this.operators == null) {
      this.operators = new ArrayList<>();
    }
    this.operators.add(operatorsItem);
    return this;
  }

   /**
   * The valid search operators for the field.
   * @return operators
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The valid search operators for the field.")

  public List<String> getOperators() {
    return operators;
  }


  public void setOperators(List<String> operators) {
    this.operators = operators;
  }


  public FieldReferenceData types(List<String> types) {
    
    this.types = types;
    return this;
  }

  public FieldReferenceData addTypesItem(String typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * The data types of items in the field.
   * @return types
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The data types of items in the field.")

  public List<String> getTypes() {
    return types;
  }


  public void setTypes(List<String> types) {
    this.types = types;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldReferenceData fieldReferenceData = (FieldReferenceData) o;
    return Objects.equals(this.value, fieldReferenceData.value) &&
        Objects.equals(this.displayName, fieldReferenceData.displayName) &&
        Objects.equals(this.orderable, fieldReferenceData.orderable) &&
        Objects.equals(this.searchable, fieldReferenceData.searchable) &&
        Objects.equals(this.deprecated, fieldReferenceData.deprecated) &&
        Objects.equals(this.deprecatedSearcherKey, fieldReferenceData.deprecatedSearcherKey) &&
        Objects.equals(this.auto, fieldReferenceData.auto) &&
        Objects.equals(this.cfid, fieldReferenceData.cfid) &&
        Objects.equals(this.operators, fieldReferenceData.operators) &&
        Objects.equals(this.types, fieldReferenceData.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, displayName, orderable, searchable, deprecated, deprecatedSearcherKey, auto, cfid, operators, types);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldReferenceData {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    orderable: ").append(toIndentedString(orderable)).append("\n");
    sb.append("    searchable: ").append(toIndentedString(searchable)).append("\n");
    sb.append("    deprecated: ").append(toIndentedString(deprecated)).append("\n");
    sb.append("    deprecatedSearcherKey: ").append(toIndentedString(deprecatedSearcherKey)).append("\n");
    sb.append("    auto: ").append(toIndentedString(auto)).append("\n");
    sb.append("    cfid: ").append(toIndentedString(cfid)).append("\n");
    sb.append("    operators: ").append(toIndentedString(operators)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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
    openapiFields.add("value");
    openapiFields.add("displayName");
    openapiFields.add("orderable");
    openapiFields.add("searchable");
    openapiFields.add("deprecated");
    openapiFields.add("deprecatedSearcherKey");
    openapiFields.add("auto");
    openapiFields.add("cfid");
    openapiFields.add("operators");
    openapiFields.add("types");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FieldReferenceData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FieldReferenceData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FieldReferenceData is not found in the empty JSON string", FieldReferenceData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FieldReferenceData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FieldReferenceData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("orderable") != null && !jsonObj.get("orderable").isJsonNull()) && !jsonObj.get("orderable").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `orderable` to be a primitive type in the JSON string but got `%s`", jsonObj.get("orderable").toString()));
      }
      if ((jsonObj.get("searchable") != null && !jsonObj.get("searchable").isJsonNull()) && !jsonObj.get("searchable").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `searchable` to be a primitive type in the JSON string but got `%s`", jsonObj.get("searchable").toString()));
      }
      if ((jsonObj.get("deprecated") != null && !jsonObj.get("deprecated").isJsonNull()) && !jsonObj.get("deprecated").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deprecated` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deprecated").toString()));
      }
      if ((jsonObj.get("deprecatedSearcherKey") != null && !jsonObj.get("deprecatedSearcherKey").isJsonNull()) && !jsonObj.get("deprecatedSearcherKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `deprecatedSearcherKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("deprecatedSearcherKey").toString()));
      }
      if ((jsonObj.get("auto") != null && !jsonObj.get("auto").isJsonNull()) && !jsonObj.get("auto").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auto` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auto").toString()));
      }
      if ((jsonObj.get("cfid") != null && !jsonObj.get("cfid").isJsonNull()) && !jsonObj.get("cfid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cfid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cfid").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("operators") != null && !jsonObj.get("operators").isJsonNull()) && !jsonObj.get("operators").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `operators` to be an array in the JSON string but got `%s`", jsonObj.get("operators").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("types") != null && !jsonObj.get("types").isJsonNull()) && !jsonObj.get("types").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `types` to be an array in the JSON string but got `%s`", jsonObj.get("types").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FieldReferenceData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FieldReferenceData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FieldReferenceData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FieldReferenceData.class));

       return (TypeAdapter<T>) new TypeAdapter<FieldReferenceData>() {
           @Override
           public void write(JsonWriter out, FieldReferenceData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FieldReferenceData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FieldReferenceData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FieldReferenceData
  * @throws IOException if the JSON string is invalid with respect to FieldReferenceData
  */
  public static FieldReferenceData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FieldReferenceData.class);
  }

 /**
  * Convert an instance of FieldReferenceData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

