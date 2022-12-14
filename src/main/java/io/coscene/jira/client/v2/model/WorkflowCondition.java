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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.GenericType;
import io.coscene.jira.client.v2.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class WorkflowCondition extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(WorkflowCondition.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!WorkflowCondition.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'WorkflowCondition' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<WorkflowCompoundCondition> adapterWorkflowCompoundCondition = gson.getDelegateAdapter(this, TypeToken.get(WorkflowCompoundCondition.class));
            final TypeAdapter<WorkflowSimpleCondition> adapterWorkflowSimpleCondition = gson.getDelegateAdapter(this, TypeToken.get(WorkflowSimpleCondition.class));

            return (TypeAdapter<T>) new TypeAdapter<WorkflowCondition>() {
                @Override
                public void write(JsonWriter out, WorkflowCondition value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `WorkflowCompoundCondition`
                    if (value.getActualInstance() instanceof WorkflowCompoundCondition) {
                        JsonObject obj = adapterWorkflowCompoundCondition.toJsonTree((WorkflowCompoundCondition)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `WorkflowSimpleCondition`
                    if (value.getActualInstance() instanceof WorkflowSimpleCondition) {
                        JsonObject obj = adapterWorkflowSimpleCondition.toJsonTree((WorkflowSimpleCondition)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: WorkflowCompoundCondition, WorkflowSimpleCondition");
                }

                @Override
                public WorkflowCondition read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize WorkflowCompoundCondition
                    try {
                        // validate the JSON object to see if any exception is thrown
                        WorkflowCompoundCondition.validateJsonObject(jsonObject);
                        actualAdapter = adapterWorkflowCompoundCondition;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'WorkflowCompoundCondition'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for WorkflowCompoundCondition failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'WorkflowCompoundCondition'", e);
                    }

                    // deserialize WorkflowSimpleCondition
                    try {
                        // validate the JSON object to see if any exception is thrown
                        WorkflowSimpleCondition.validateJsonObject(jsonObject);
                        actualAdapter = adapterWorkflowSimpleCondition;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'WorkflowSimpleCondition'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for WorkflowSimpleCondition failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'WorkflowSimpleCondition'", e);
                    }

                    if (match == 1) {
                        WorkflowCondition ret = new WorkflowCondition();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonObject));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for WorkflowCondition: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public WorkflowCondition() {
        super("oneOf", Boolean.FALSE);
    }

    public WorkflowCondition(WorkflowCompoundCondition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public WorkflowCondition(WorkflowSimpleCondition o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("WorkflowCompoundCondition", new GenericType<WorkflowCompoundCondition>() {
        });
        schemas.put("WorkflowSimpleCondition", new GenericType<WorkflowSimpleCondition>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return WorkflowCondition.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * WorkflowCompoundCondition, WorkflowSimpleCondition
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof WorkflowCompoundCondition) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof WorkflowSimpleCondition) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be WorkflowCompoundCondition, WorkflowSimpleCondition");
    }

    /**
     * Get the actual instance, which can be the following:
     * WorkflowCompoundCondition, WorkflowSimpleCondition
     *
     * @return The actual instance (WorkflowCompoundCondition, WorkflowSimpleCondition)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `WorkflowCompoundCondition`. If the actual instance is not `WorkflowCompoundCondition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WorkflowCompoundCondition`
     * @throws ClassCastException if the instance is not `WorkflowCompoundCondition`
     */
    public WorkflowCompoundCondition getWorkflowCompoundCondition() throws ClassCastException {
        return (WorkflowCompoundCondition)super.getActualInstance();
    }

    /**
     * Get the actual instance of `WorkflowSimpleCondition`. If the actual instance is not `WorkflowSimpleCondition`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `WorkflowSimpleCondition`
     * @throws ClassCastException if the instance is not `WorkflowSimpleCondition`
     */
    public WorkflowSimpleCondition getWorkflowSimpleCondition() throws ClassCastException {
        return (WorkflowSimpleCondition)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkflowCondition
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate oneOf schemas one by one
    int validCount = 0;
    ArrayList<String> errorMessages = new ArrayList<>();
    // validate the json string with WorkflowCompoundCondition
    try {
      WorkflowCompoundCondition.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for WorkflowCompoundCondition failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    // validate the json string with WorkflowSimpleCondition
    try {
      WorkflowSimpleCondition.validateJsonObject(jsonObj);
      validCount++;
    } catch (Exception e) {
      errorMessages.add(String.format("Deserialization for WorkflowSimpleCondition failed with `%s`.", e.getMessage()));
      // continue to the next one
    }
    if (validCount != 1) {
      throw new IOException(String.format("The JSON string is invalid for WorkflowCondition with oneOf schemas: WorkflowCompoundCondition, WorkflowSimpleCondition. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonObj.toString()));
    }
  }

 /**
  * Create an instance of WorkflowCondition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkflowCondition
  * @throws IOException if the JSON string is invalid with respect to WorkflowCondition
  */
  public static WorkflowCondition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkflowCondition.class);
  }

 /**
  * Convert an instance of WorkflowCondition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

