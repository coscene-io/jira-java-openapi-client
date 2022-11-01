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
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.GenericType;
import io.coscene.jira.client.v2.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class JqlQueryClauseOperand extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(JqlQueryClauseOperand.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!JqlQueryClauseOperand.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'JqlQueryClauseOperand' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FunctionOperand> adapterFunctionOperand = gson.getDelegateAdapter(this, TypeToken.get(FunctionOperand.class));
            final TypeAdapter<KeywordOperand> adapterKeywordOperand = gson.getDelegateAdapter(this, TypeToken.get(KeywordOperand.class));
            final TypeAdapter<ListOperand> adapterListOperand = gson.getDelegateAdapter(this, TypeToken.get(ListOperand.class));
            final TypeAdapter<ValueOperand> adapterValueOperand = gson.getDelegateAdapter(this, TypeToken.get(ValueOperand.class));

            return (TypeAdapter<T>) new TypeAdapter<JqlQueryClauseOperand>() {
                @Override
                public void write(JsonWriter out, JqlQueryClauseOperand value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `FunctionOperand`
                    if (value.getActualInstance() instanceof FunctionOperand) {
                        JsonObject obj = adapterFunctionOperand.toJsonTree((FunctionOperand)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `KeywordOperand`
                    if (value.getActualInstance() instanceof KeywordOperand) {
                        JsonObject obj = adapterKeywordOperand.toJsonTree((KeywordOperand)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ListOperand`
                    if (value.getActualInstance() instanceof ListOperand) {
                        JsonObject obj = adapterListOperand.toJsonTree((ListOperand)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `ValueOperand`
                    if (value.getActualInstance() instanceof ValueOperand) {
                        JsonObject obj = adapterValueOperand.toJsonTree((ValueOperand)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: FunctionOperand, KeywordOperand, ListOperand, ValueOperand");
                }

                @Override
                public JqlQueryClauseOperand read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    // deserialize FunctionOperand
                    try {
                        // validate the JSON object to see if any exception is thrown
                        FunctionOperand.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'FunctionOperand'");
                        JqlQueryClauseOperand ret = new JqlQueryClauseOperand();
                        ret.setActualInstance(adapterFunctionOperand.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'FunctionOperand'", e);
                    }

                    // deserialize KeywordOperand
                    try {
                        // validate the JSON object to see if any exception is thrown
                        KeywordOperand.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'KeywordOperand'");
                        JqlQueryClauseOperand ret = new JqlQueryClauseOperand();
                        ret.setActualInstance(adapterKeywordOperand.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'KeywordOperand'", e);
                    }

                    // deserialize ListOperand
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ListOperand.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'ListOperand'");
                        JqlQueryClauseOperand ret = new JqlQueryClauseOperand();
                        ret.setActualInstance(adapterListOperand.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'ListOperand'", e);
                    }

                    // deserialize ValueOperand
                    try {
                        // validate the JSON object to see if any exception is thrown
                        ValueOperand.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'ValueOperand'");
                        JqlQueryClauseOperand ret = new JqlQueryClauseOperand();
                        ret.setActualInstance(adapterValueOperand.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'ValueOperand'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for JqlQueryClauseOperand: no class matched. JSON: %s", jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public JqlQueryClauseOperand() {
        super("anyOf", Boolean.FALSE);
    }

    public JqlQueryClauseOperand(FunctionOperand o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public JqlQueryClauseOperand(KeywordOperand o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public JqlQueryClauseOperand(ListOperand o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public JqlQueryClauseOperand(ValueOperand o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("FunctionOperand", new GenericType<FunctionOperand>() {
        });
        schemas.put("KeywordOperand", new GenericType<KeywordOperand>() {
        });
        schemas.put("ListOperand", new GenericType<ListOperand>() {
        });
        schemas.put("ValueOperand", new GenericType<ValueOperand>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return JqlQueryClauseOperand.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * FunctionOperand, KeywordOperand, ListOperand, ValueOperand
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof FunctionOperand) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof KeywordOperand) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ListOperand) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof ValueOperand) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be FunctionOperand, KeywordOperand, ListOperand, ValueOperand");
    }

    /**
     * Get the actual instance, which can be the following:
     * FunctionOperand, KeywordOperand, ListOperand, ValueOperand
     *
     * @return The actual instance (FunctionOperand, KeywordOperand, ListOperand, ValueOperand)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `FunctionOperand`. If the actual instance is not `FunctionOperand`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FunctionOperand`
     * @throws ClassCastException if the instance is not `FunctionOperand`
     */
    public FunctionOperand getFunctionOperand() throws ClassCastException {
        return (FunctionOperand)super.getActualInstance();
    }

    /**
     * Get the actual instance of `KeywordOperand`. If the actual instance is not `KeywordOperand`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `KeywordOperand`
     * @throws ClassCastException if the instance is not `KeywordOperand`
     */
    public KeywordOperand getKeywordOperand() throws ClassCastException {
        return (KeywordOperand)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ListOperand`. If the actual instance is not `ListOperand`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ListOperand`
     * @throws ClassCastException if the instance is not `ListOperand`
     */
    public ListOperand getListOperand() throws ClassCastException {
        return (ListOperand)super.getActualInstance();
    }

    /**
     * Get the actual instance of `ValueOperand`. If the actual instance is not `ValueOperand`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `ValueOperand`
     * @throws ClassCastException if the instance is not `ValueOperand`
     */
    public ValueOperand getValueOperand() throws ClassCastException {
        return (ValueOperand)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JqlQueryClauseOperand
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate anyOf schemas one by one
    int validCount = 0;
    // validate the json string with FunctionOperand
    try {
      FunctionOperand.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with KeywordOperand
    try {
      KeywordOperand.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with ListOperand
    try {
      ListOperand.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with ValueOperand
    try {
      ValueOperand.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount == 0) {
      throw new IOException(String.format("The JSON string is invalid for JqlQueryClauseOperand with anyOf schemas: FunctionOperand, KeywordOperand, ListOperand, ValueOperand. JSON: %s", jsonObj.toString()));
    }
  }

 /**
  * Create an instance of JqlQueryClauseOperand given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JqlQueryClauseOperand
  * @throws IOException if the JSON string is invalid with respect to JqlQueryClauseOperand
  */
  public static JqlQueryClauseOperand fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JqlQueryClauseOperand.class);
  }

 /**
  * Convert an instance of JqlQueryClauseOperand to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
