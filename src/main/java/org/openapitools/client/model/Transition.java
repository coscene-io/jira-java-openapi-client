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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.TransitionScreenDetails;
import org.openapitools.client.model.WorkflowRules;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * Details of a workflow transition.
 */
@ApiModel(description = "Details of a workflow transition.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class Transition {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private List<String> from = new ArrayList<>();

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  /**
   * The type of the transition.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    GLOBAL("global"),
    
    INITIAL("initial"),
    
    DIRECTED("directed");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_SCREEN = "screen";
  @SerializedName(SERIALIZED_NAME_SCREEN)
  private TransitionScreenDetails screen;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private WorkflowRules rules;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, Object> properties = null;

  public Transition() {
  }

  public Transition id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the transition.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the transition.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Transition name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the transition.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the transition.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Transition description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the transition.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The description of the transition.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Transition from(List<String> from) {
    
    this.from = from;
    return this;
  }

  public Transition addFromItem(String fromItem) {
    this.from.add(fromItem);
    return this;
  }

   /**
   * The statuses the transition can start from.
   * @return from
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The statuses the transition can start from.")

  public List<String> getFrom() {
    return from;
  }


  public void setFrom(List<String> from) {
    this.from = from;
  }


  public Transition to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * The status the transition goes to.
   * @return to
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The status the transition goes to.")

  public String getTo() {
    return to;
  }


  public void setTo(String to) {
    this.to = to;
  }


  public Transition type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of the transition.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The type of the transition.")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Transition screen(TransitionScreenDetails screen) {
    
    this.screen = screen;
    return this;
  }

   /**
   * Get screen
   * @return screen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransitionScreenDetails getScreen() {
    return screen;
  }


  public void setScreen(TransitionScreenDetails screen) {
    this.screen = screen;
  }


  public Transition rules(WorkflowRules rules) {
    
    this.rules = rules;
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkflowRules getRules() {
    return rules;
  }


  public void setRules(WorkflowRules rules) {
    this.rules = rules;
  }


  public Transition properties(Map<String, Object> properties) {
    
    this.properties = properties;
    return this;
  }

  public Transition putPropertiesItem(String key, Object propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

   /**
   * The properties of the transition.
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The properties of the transition.")

  public Map<String, Object> getProperties() {
    return properties;
  }


  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transition transition = (Transition) o;
    return Objects.equals(this.id, transition.id) &&
        Objects.equals(this.name, transition.name) &&
        Objects.equals(this.description, transition.description) &&
        Objects.equals(this.from, transition.from) &&
        Objects.equals(this.to, transition.to) &&
        Objects.equals(this.type, transition.type) &&
        Objects.equals(this.screen, transition.screen) &&
        Objects.equals(this.rules, transition.rules) &&
        Objects.equals(this.properties, transition.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, from, to, type, screen, rules, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transition {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    screen: ").append(toIndentedString(screen)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("from");
    openapiFields.add("to");
    openapiFields.add("type");
    openapiFields.add("screen");
    openapiFields.add("rules");
    openapiFields.add("properties");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("from");
    openapiRequiredFields.add("to");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Transition
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Transition.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Transition is not found in the empty JSON string", Transition.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Transition.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Transition` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Transition.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("from") != null && !jsonObj.get("from").isJsonNull()) && !jsonObj.get("from").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `from` to be an array in the JSON string but got `%s`", jsonObj.get("from").toString()));
      }
      if ((jsonObj.get("to") != null && !jsonObj.get("to").isJsonNull()) && !jsonObj.get("to").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be a primitive type in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // validate the optional field `screen`
      if (jsonObj.get("screen") != null && !jsonObj.get("screen").isJsonNull()) {
        TransitionScreenDetails.validateJsonObject(jsonObj.getAsJsonObject("screen"));
      }
      // validate the optional field `rules`
      if (jsonObj.get("rules") != null && !jsonObj.get("rules").isJsonNull()) {
        WorkflowRules.validateJsonObject(jsonObj.getAsJsonObject("rules"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Transition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Transition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Transition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Transition.class));

       return (TypeAdapter<T>) new TypeAdapter<Transition>() {
           @Override
           public void write(JsonWriter out, Transition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Transition read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Transition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Transition
  * @throws IOException if the JSON string is invalid with respect to Transition
  */
  public static Transition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Transition.class);
  }

 /**
  * Convert an instance of Transition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

