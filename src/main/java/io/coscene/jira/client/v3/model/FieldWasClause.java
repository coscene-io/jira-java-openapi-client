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
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

import io.coscene.jira.client.v3.JSON;

/**
 * A clause that asserts a previous value of a field. For example, &#x60;status WAS \&quot;Resolved\&quot; BY currentUser() BEFORE \&quot;2019/02/02\&quot;&#x60;. See [WAS](https://confluence.atlassian.com/x/dgiiLQ#Advancedsearching-operatorsreference-WASWAS) for more information about the WAS operator.
 */
@ApiModel(description = "A clause that asserts a previous value of a field. For example, `status WAS \"Resolved\" BY currentUser() BEFORE \"2019/02/02\"`. See [WAS](https://confluence.atlassian.com/x/dgiiLQ#Advancedsearching-operatorsreference-WASWAS) for more information about the WAS operator.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class FieldWasClause {
  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private JqlQueryField field;

  /**
   * The operator between the field and operand.
   */
  @JsonAdapter(OperatorEnum.Adapter.class)
  public enum OperatorEnum {
    WAS("was"),
    
    WAS_IN("was in"),
    
    WAS_NOT_IN("was not in"),
    
    WAS_NOT("was not");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OperatorEnum fromValue(String value) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OperatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OperatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OperatorEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OperatorEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private OperatorEnum operator;

  public static final String SERIALIZED_NAME_OPERAND = "operand";
  @SerializedName(SERIALIZED_NAME_OPERAND)
  private JqlQueryClauseOperand operand;

  public static final String SERIALIZED_NAME_PREDICATES = "predicates";
  @SerializedName(SERIALIZED_NAME_PREDICATES)
  private List<JqlQueryClauseTimePredicate> predicates = new ArrayList<>();

  public FieldWasClause() {
  }

  public FieldWasClause field(JqlQueryField field) {
    
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JqlQueryField getField() {
    return field;
  }


  public void setField(JqlQueryField field) {
    this.field = field;
  }


  public FieldWasClause operator(OperatorEnum operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * The operator between the field and operand.
   * @return operator
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The operator between the field and operand.")

  public OperatorEnum getOperator() {
    return operator;
  }


  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  public FieldWasClause operand(JqlQueryClauseOperand operand) {
    
    this.operand = operand;
    return this;
  }

   /**
   * Get operand
   * @return operand
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public JqlQueryClauseOperand getOperand() {
    return operand;
  }


  public void setOperand(JqlQueryClauseOperand operand) {
    this.operand = operand;
  }


  public FieldWasClause predicates(List<JqlQueryClauseTimePredicate> predicates) {
    
    this.predicates = predicates;
    return this;
  }

  public FieldWasClause addPredicatesItem(JqlQueryClauseTimePredicate predicatesItem) {
    this.predicates.add(predicatesItem);
    return this;
  }

   /**
   * The list of time predicates.
   * @return predicates
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The list of time predicates.")

  public List<JqlQueryClauseTimePredicate> getPredicates() {
    return predicates;
  }


  public void setPredicates(List<JqlQueryClauseTimePredicate> predicates) {
    this.predicates = predicates;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldWasClause fieldWasClause = (FieldWasClause) o;
    return Objects.equals(this.field, fieldWasClause.field) &&
        Objects.equals(this.operator, fieldWasClause.operator) &&
        Objects.equals(this.operand, fieldWasClause.operand) &&
        Objects.equals(this.predicates, fieldWasClause.predicates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, operator, operand, predicates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldWasClause {\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    operand: ").append(toIndentedString(operand)).append("\n");
    sb.append("    predicates: ").append(toIndentedString(predicates)).append("\n");
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
    openapiFields.add("field");
    openapiFields.add("operator");
    openapiFields.add("operand");
    openapiFields.add("predicates");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("field");
    openapiRequiredFields.add("operator");
    openapiRequiredFields.add("operand");
    openapiRequiredFields.add("predicates");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FieldWasClause
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FieldWasClause.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FieldWasClause is not found in the empty JSON string", FieldWasClause.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FieldWasClause.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FieldWasClause` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FieldWasClause.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `field`
      if (jsonObj.get("field") != null && !jsonObj.get("field").isJsonNull()) {
        JqlQueryField.validateJsonObject(jsonObj.getAsJsonObject("field"));
      }
      if ((jsonObj.get("operator") != null && !jsonObj.get("operator").isJsonNull()) && !jsonObj.get("operator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operator").toString()));
      }
      // validate the optional field `operand`
      if (jsonObj.get("operand") != null && !jsonObj.get("operand").isJsonNull()) {
        JqlQueryClauseOperand.validateJsonObject(jsonObj.getAsJsonObject("operand"));
      }
      if (jsonObj.get("predicates") != null && !jsonObj.get("predicates").isJsonNull()) {
        JsonArray jsonArraypredicates = jsonObj.getAsJsonArray("predicates");
        if (jsonArraypredicates != null) {
          // ensure the json data is an array
          if (!jsonObj.get("predicates").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `predicates` to be an array in the JSON string but got `%s`", jsonObj.get("predicates").toString()));
          }

          // validate the optional field `predicates` (array)
          for (int i = 0; i < jsonArraypredicates.size(); i++) {
            JqlQueryClauseTimePredicate.validateJsonObject(jsonArraypredicates.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FieldWasClause.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FieldWasClause' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FieldWasClause> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FieldWasClause.class));

       return (TypeAdapter<T>) new TypeAdapter<FieldWasClause>() {
           @Override
           public void write(JsonWriter out, FieldWasClause value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FieldWasClause read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FieldWasClause given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FieldWasClause
  * @throws IOException if the JSON string is invalid with respect to FieldWasClause
  */
  public static FieldWasClause fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FieldWasClause.class);
  }

 /**
  * Convert an instance of FieldWasClause to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
