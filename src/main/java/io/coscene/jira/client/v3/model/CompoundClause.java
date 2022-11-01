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
 * A JQL query clause that consists of nested clauses. For example, &#x60;(labels in (urgent, blocker) OR lastCommentedBy &#x3D; currentUser()). Note that, where nesting is not defined, the parser nests JQL clauses based on the operator precedence. For example, \&quot;A OR B AND C\&quot; is parsed as \&quot;(A OR B) AND C\&quot;. See Setting the precedence of operators for more information about precedence in JQL queries.&#x60;
 */
@ApiModel(description = "A JQL query clause that consists of nested clauses. For example, `(labels in (urgent, blocker) OR lastCommentedBy = currentUser()). Note that, where nesting is not defined, the parser nests JQL clauses based on the operator precedence. For example, \"A OR B AND C\" is parsed as \"(A OR B) AND C\". See Setting the precedence of operators for more information about precedence in JQL queries.`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class CompoundClause {
  public static final String SERIALIZED_NAME_CLAUSES = "clauses";
  @SerializedName(SERIALIZED_NAME_CLAUSES)
  private List<JqlQueryClause> clauses = new ArrayList<>();

  /**
   * The operator between the clauses.
   */
  @JsonAdapter(OperatorEnum.Adapter.class)
  public enum OperatorEnum {
    AND("and"),
    
    OR("or"),
    
    NOT("not");

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

  public CompoundClause() {
  }

  public CompoundClause clauses(List<JqlQueryClause> clauses) {
    
    this.clauses = clauses;
    return this;
  }

  public CompoundClause addClausesItem(JqlQueryClause clausesItem) {
    this.clauses.add(clausesItem);
    return this;
  }

   /**
   * The list of nested clauses.
   * @return clauses
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The list of nested clauses.")

  public List<JqlQueryClause> getClauses() {
    return clauses;
  }


  public void setClauses(List<JqlQueryClause> clauses) {
    this.clauses = clauses;
  }


  public CompoundClause operator(OperatorEnum operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * The operator between the clauses.
   * @return operator
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The operator between the clauses.")

  public OperatorEnum getOperator() {
    return operator;
  }


  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompoundClause compoundClause = (CompoundClause) o;
    return Objects.equals(this.clauses, compoundClause.clauses) &&
        Objects.equals(this.operator, compoundClause.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clauses, operator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompoundClause {\n");
    sb.append("    clauses: ").append(toIndentedString(clauses)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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
    openapiFields.add("clauses");
    openapiFields.add("operator");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("clauses");
    openapiRequiredFields.add("operator");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CompoundClause
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CompoundClause.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CompoundClause is not found in the empty JSON string", CompoundClause.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CompoundClause.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CompoundClause` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CompoundClause.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("clauses") != null && !jsonObj.get("clauses").isJsonNull()) {
        JsonArray jsonArrayclauses = jsonObj.getAsJsonArray("clauses");
        if (jsonArrayclauses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("clauses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `clauses` to be an array in the JSON string but got `%s`", jsonObj.get("clauses").toString()));
          }

          // validate the optional field `clauses` (array)
          for (int i = 0; i < jsonArrayclauses.size(); i++) {
            JqlQueryClause.validateJsonObject(jsonArrayclauses.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("operator") != null && !jsonObj.get("operator").isJsonNull()) && !jsonObj.get("operator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `operator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("operator").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CompoundClause.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CompoundClause' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CompoundClause> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CompoundClause.class));

       return (TypeAdapter<T>) new TypeAdapter<CompoundClause>() {
           @Override
           public void write(JsonWriter out, CompoundClause value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CompoundClause read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CompoundClause given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CompoundClause
  * @throws IOException if the JSON string is invalid with respect to CompoundClause
  */
  public static CompoundClause fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CompoundClause.class);
  }

 /**
  * Convert an instance of CompoundClause to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

