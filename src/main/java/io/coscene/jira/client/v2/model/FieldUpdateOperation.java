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
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import io.coscene.jira.client.v2.JSON;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Details of an operation to perform on a field.
 */
@ApiModel(description = "Details of an operation to perform on a field.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class FieldUpdateOperation {
  public static final String SERIALIZED_NAME_ADD = "add";
  @SerializedName(SERIALIZED_NAME_ADD)
  private Object add = null;

  public static final String SERIALIZED_NAME_SET = "set";
  @SerializedName(SERIALIZED_NAME_SET)
  private Object set = null;

  public static final String SERIALIZED_NAME_REMOVE = "remove";
  @SerializedName(SERIALIZED_NAME_REMOVE)
  private Object remove = null;

  public static final String SERIALIZED_NAME_EDIT = "edit";
  @SerializedName(SERIALIZED_NAME_EDIT)
  private Object edit = null;

  public static final String SERIALIZED_NAME_COPY = "copy";
  @SerializedName(SERIALIZED_NAME_COPY)
  private Object copy = null;

  public FieldUpdateOperation() {
  }

  public FieldUpdateOperation add(Object add) {
    
    this.add = add;
    return this;
  }

   /**
   * The value to add to the field.
   * @return add
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "triaged", value = "The value to add to the field.")

  public Object getAdd() {
    return add;
  }


  public void setAdd(Object add) {
    this.add = add;
  }


  public FieldUpdateOperation set(Object set) {
    
    this.set = set;
    return this;
  }

   /**
   * The value to set in the field.
   * @return set
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A new summary", value = "The value to set in the field.")

  public Object getSet() {
    return set;
  }


  public void setSet(Object set) {
    this.set = set;
  }


  public FieldUpdateOperation remove(Object remove) {
    
    this.remove = remove;
    return this;
  }

   /**
   * The value to removed from the field.
   * @return remove
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "blocker", value = "The value to removed from the field.")

  public Object getRemove() {
    return remove;
  }


  public void setRemove(Object remove) {
    this.remove = remove;
  }


  public FieldUpdateOperation edit(Object edit) {
    
    this.edit = edit;
    return this;
  }

   /**
   * The value to edit in the field.
   * @return edit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"remainingEstimate\":\"4d\",\"originalEstimate\":\"1w 1d\"}", value = "The value to edit in the field.")

  public Object getEdit() {
    return edit;
  }


  public void setEdit(Object edit) {
    this.edit = edit;
  }


  public FieldUpdateOperation copy(Object copy) {
    
    this.copy = copy;
    return this;
  }

   /**
   * The field value to copy from another issue.
   * @return copy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"issuelinks\":{\"sourceIssues\":[{\"key\":\"FP-5\"}]}}", value = "The field value to copy from another issue.")

  public Object getCopy() {
    return copy;
  }


  public void setCopy(Object copy) {
    this.copy = copy;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldUpdateOperation fieldUpdateOperation = (FieldUpdateOperation) o;
    return Objects.equals(this.add, fieldUpdateOperation.add) &&
        Objects.equals(this.set, fieldUpdateOperation.set) &&
        Objects.equals(this.remove, fieldUpdateOperation.remove) &&
        Objects.equals(this.edit, fieldUpdateOperation.edit) &&
        Objects.equals(this.copy, fieldUpdateOperation.copy);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(add, set, remove, edit, copy);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldUpdateOperation {\n");
    sb.append("    add: ").append(toIndentedString(add)).append("\n");
    sb.append("    set: ").append(toIndentedString(set)).append("\n");
    sb.append("    remove: ").append(toIndentedString(remove)).append("\n");
    sb.append("    edit: ").append(toIndentedString(edit)).append("\n");
    sb.append("    copy: ").append(toIndentedString(copy)).append("\n");
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
    openapiFields.add("add");
    openapiFields.add("set");
    openapiFields.add("remove");
    openapiFields.add("edit");
    openapiFields.add("copy");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FieldUpdateOperation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (FieldUpdateOperation.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in FieldUpdateOperation is not found in the empty JSON string", FieldUpdateOperation.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FieldUpdateOperation.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FieldUpdateOperation` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FieldUpdateOperation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FieldUpdateOperation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FieldUpdateOperation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FieldUpdateOperation.class));

       return (TypeAdapter<T>) new TypeAdapter<FieldUpdateOperation>() {
           @Override
           public void write(JsonWriter out, FieldUpdateOperation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FieldUpdateOperation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FieldUpdateOperation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FieldUpdateOperation
  * @throws IOException if the JSON string is invalid with respect to FieldUpdateOperation
  */
  public static FieldUpdateOperation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FieldUpdateOperation.class);
  }

 /**
  * Convert an instance of FieldUpdateOperation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

