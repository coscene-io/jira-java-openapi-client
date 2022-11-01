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
import com.google.gson.JsonArray;
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
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import io.coscene.jira.client.v2.JSON;

/**
 * Container for a list of audit records.
 */
@ApiModel(description = "Container for a list of audit records.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class AuditRecords {
  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Long total;

  public static final String SERIALIZED_NAME_RECORDS = "records";
  @SerializedName(SERIALIZED_NAME_RECORDS)
  private List<AuditRecordBean> records = null;

  public AuditRecords() {
  }

  
  public AuditRecords(
     Integer offset, 
     Integer limit, 
     Long total, 
     List<AuditRecordBean> records
  ) {
    this();
    this.offset = offset;
    this.limit = limit;
    this.total = total;
    this.records = records;
  }

   /**
   * The number of audit items skipped before the first item in this list.
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of audit items skipped before the first item in this list.")

  public Integer getOffset() {
    return offset;
  }




   /**
   * The requested or default limit on the number of audit items to be returned.
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The requested or default limit on the number of audit items to be returned.")

  public Integer getLimit() {
    return limit;
  }




   /**
   * The total number of audit items returned.
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of audit items returned.")

  public Long getTotal() {
    return total;
  }




   /**
   * The list of audit items.
   * @return records
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of audit items.")

  public List<AuditRecordBean> getRecords() {
    return records;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditRecords auditRecords = (AuditRecords) o;
    return Objects.equals(this.offset, auditRecords.offset) &&
        Objects.equals(this.limit, auditRecords.limit) &&
        Objects.equals(this.total, auditRecords.total) &&
        Objects.equals(this.records, auditRecords.records);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, limit, total, records);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditRecords {\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
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
    openapiFields.add("offset");
    openapiFields.add("limit");
    openapiFields.add("total");
    openapiFields.add("records");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuditRecords
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AuditRecords.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuditRecords is not found in the empty JSON string", AuditRecords.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AuditRecords.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuditRecords` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("records") != null && !jsonObj.get("records").isJsonNull()) {
        JsonArray jsonArrayrecords = jsonObj.getAsJsonArray("records");
        if (jsonArrayrecords != null) {
          // ensure the json data is an array
          if (!jsonObj.get("records").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `records` to be an array in the JSON string but got `%s`", jsonObj.get("records").toString()));
          }

          // validate the optional field `records` (array)
          for (int i = 0; i < jsonArrayrecords.size(); i++) {
            AuditRecordBean.validateJsonObject(jsonArrayrecords.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuditRecords.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuditRecords' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuditRecords> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuditRecords.class));

       return (TypeAdapter<T>) new TypeAdapter<AuditRecords>() {
           @Override
           public void write(JsonWriter out, AuditRecords value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuditRecords read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuditRecords given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuditRecords
  * @throws IOException if the JSON string is invalid with respect to AuditRecords
  */
  public static AuditRecords fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuditRecords.class);
  }

 /**
  * Convert an instance of AuditRecords to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

