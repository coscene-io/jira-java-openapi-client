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
 * Issue security level member.
 */
@ApiModel(description = "Issue security level member.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class IssueSecurityLevelMember {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_ISSUE_SECURITY_LEVEL_ID = "issueSecurityLevelId";
  @SerializedName(SERIALIZED_NAME_ISSUE_SECURITY_LEVEL_ID)
  private Long issueSecurityLevelId;

  public static final String SERIALIZED_NAME_HOLDER = "holder";
  @SerializedName(SERIALIZED_NAME_HOLDER)
  private IssueSecurityLevelMemberHolder holder;

  public IssueSecurityLevelMember() {
  }

  public IssueSecurityLevelMember id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the issue security level member.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the issue security level member.")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public IssueSecurityLevelMember issueSecurityLevelId(Long issueSecurityLevelId) {
    
    this.issueSecurityLevelId = issueSecurityLevelId;
    return this;
  }

   /**
   * The ID of the issue security level.
   * @return issueSecurityLevelId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the issue security level.")

  public Long getIssueSecurityLevelId() {
    return issueSecurityLevelId;
  }


  public void setIssueSecurityLevelId(Long issueSecurityLevelId) {
    this.issueSecurityLevelId = issueSecurityLevelId;
  }


  public IssueSecurityLevelMember holder(IssueSecurityLevelMemberHolder holder) {
    
    this.holder = holder;
    return this;
  }

   /**
   * Get holder
   * @return holder
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public IssueSecurityLevelMemberHolder getHolder() {
    return holder;
  }


  public void setHolder(IssueSecurityLevelMemberHolder holder) {
    this.holder = holder;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueSecurityLevelMember issueSecurityLevelMember = (IssueSecurityLevelMember) o;
    return Objects.equals(this.id, issueSecurityLevelMember.id) &&
        Objects.equals(this.issueSecurityLevelId, issueSecurityLevelMember.issueSecurityLevelId) &&
        Objects.equals(this.holder, issueSecurityLevelMember.holder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, issueSecurityLevelId, holder);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueSecurityLevelMember {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issueSecurityLevelId: ").append(toIndentedString(issueSecurityLevelId)).append("\n");
    sb.append("    holder: ").append(toIndentedString(holder)).append("\n");
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
    openapiFields.add("issueSecurityLevelId");
    openapiFields.add("holder");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("issueSecurityLevelId");
    openapiRequiredFields.add("holder");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IssueSecurityLevelMember
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IssueSecurityLevelMember.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssueSecurityLevelMember is not found in the empty JSON string", IssueSecurityLevelMember.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IssueSecurityLevelMember.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IssueSecurityLevelMember` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IssueSecurityLevelMember.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the optional field `holder`
      if (jsonObj.get("holder") != null && !jsonObj.get("holder").isJsonNull()) {
        IssueSecurityLevelMemberHolder.validateJsonObject(jsonObj.getAsJsonObject("holder"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssueSecurityLevelMember.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssueSecurityLevelMember' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssueSecurityLevelMember> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssueSecurityLevelMember.class));

       return (TypeAdapter<T>) new TypeAdapter<IssueSecurityLevelMember>() {
           @Override
           public void write(JsonWriter out, IssueSecurityLevelMember value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IssueSecurityLevelMember read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IssueSecurityLevelMember given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IssueSecurityLevelMember
  * @throws IOException if the JSON string is invalid with respect to IssueSecurityLevelMember
  */
  public static IssueSecurityLevelMember fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssueSecurityLevelMember.class);
  }

 /**
  * Convert an instance of IssueSecurityLevelMember to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

