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
 * The IDs of the screens for the screen types of the screen scheme.
 */
@ApiModel(description = "The IDs of the screens for the screen types of the screen scheme.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class ScreenTypes {
  public static final String SERIALIZED_NAME_EDIT = "edit";
  @SerializedName(SERIALIZED_NAME_EDIT)
  private Long edit;

  public static final String SERIALIZED_NAME_CREATE = "create";
  @SerializedName(SERIALIZED_NAME_CREATE)
  private Long create;

  public static final String SERIALIZED_NAME_VIEW = "view";
  @SerializedName(SERIALIZED_NAME_VIEW)
  private Long view;

  public static final String SERIALIZED_NAME_DEFAULT = "default";
  @SerializedName(SERIALIZED_NAME_DEFAULT)
  private Long _default;

  public ScreenTypes() {
  }

  public ScreenTypes edit(Long edit) {
    
    this.edit = edit;
    return this;
  }

   /**
   * The ID of the edit screen.
   * @return edit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the edit screen.")

  public Long getEdit() {
    return edit;
  }


  public void setEdit(Long edit) {
    this.edit = edit;
  }


  public ScreenTypes create(Long create) {
    
    this.create = create;
    return this;
  }

   /**
   * The ID of the create screen.
   * @return create
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the create screen.")

  public Long getCreate() {
    return create;
  }


  public void setCreate(Long create) {
    this.create = create;
  }


  public ScreenTypes view(Long view) {
    
    this.view = view;
    return this;
  }

   /**
   * The ID of the view screen.
   * @return view
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the view screen.")

  public Long getView() {
    return view;
  }


  public void setView(Long view) {
    this.view = view;
  }


  public ScreenTypes _default(Long _default) {
    
    this._default = _default;
    return this;
  }

   /**
   * The ID of the default screen. Required when creating a screen scheme.
   * @return _default
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the default screen. Required when creating a screen scheme.")

  public Long getDefault() {
    return _default;
  }


  public void setDefault(Long _default) {
    this._default = _default;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreenTypes screenTypes = (ScreenTypes) o;
    return Objects.equals(this.edit, screenTypes.edit) &&
        Objects.equals(this.create, screenTypes.create) &&
        Objects.equals(this.view, screenTypes.view) &&
        Objects.equals(this._default, screenTypes._default);
  }

  @Override
  public int hashCode() {
    return Objects.hash(edit, create, view, _default);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreenTypes {\n");
    sb.append("    edit: ").append(toIndentedString(edit)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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
    openapiFields.add("edit");
    openapiFields.add("create");
    openapiFields.add("view");
    openapiFields.add("default");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ScreenTypes
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ScreenTypes.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ScreenTypes is not found in the empty JSON string", ScreenTypes.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ScreenTypes.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ScreenTypes` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ScreenTypes.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ScreenTypes' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ScreenTypes> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ScreenTypes.class));

       return (TypeAdapter<T>) new TypeAdapter<ScreenTypes>() {
           @Override
           public void write(JsonWriter out, ScreenTypes value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ScreenTypes read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ScreenTypes given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ScreenTypes
  * @throws IOException if the JSON string is invalid with respect to ScreenTypes
  */
  public static ScreenTypes fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ScreenTypes.class);
  }

 /**
  * Convert an instance of ScreenTypes to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

