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
import java.net.URI;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import io.coscene.jira.client.v2.JSON;

/**
 * Details of a link between issues.
 */
@ApiModel(description = "Details of a link between issues.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class IssueLink {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private URI self;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private IssueLinkType type;

  public static final String SERIALIZED_NAME_INWARD_ISSUE = "inwardIssue";
  @SerializedName(SERIALIZED_NAME_INWARD_ISSUE)
  private IssueLinkInwardIssue inwardIssue;

  public static final String SERIALIZED_NAME_OUTWARD_ISSUE = "outwardIssue";
  @SerializedName(SERIALIZED_NAME_OUTWARD_ISSUE)
  private IssueLinkOutwardIssue outwardIssue;

  public IssueLink() {
  }

  
  public IssueLink(
     String id, 
     URI self
  ) {
    this();
    this.id = id;
    this.self = self;
  }

   /**
   * The ID of the issue link.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the issue link.")

  public String getId() {
    return id;
  }




   /**
   * The URL of the issue link.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the issue link.")

  public URI getSelf() {
    return self;
  }




  public IssueLink type(IssueLinkType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public IssueLinkType getType() {
    return type;
  }


  public void setType(IssueLinkType type) {
    this.type = type;
  }


  public IssueLink inwardIssue(IssueLinkInwardIssue inwardIssue) {
    
    this.inwardIssue = inwardIssue;
    return this;
  }

   /**
   * Get inwardIssue
   * @return inwardIssue
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public IssueLinkInwardIssue getInwardIssue() {
    return inwardIssue;
  }


  public void setInwardIssue(IssueLinkInwardIssue inwardIssue) {
    this.inwardIssue = inwardIssue;
  }


  public IssueLink outwardIssue(IssueLinkOutwardIssue outwardIssue) {
    
    this.outwardIssue = outwardIssue;
    return this;
  }

   /**
   * Get outwardIssue
   * @return outwardIssue
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public IssueLinkOutwardIssue getOutwardIssue() {
    return outwardIssue;
  }


  public void setOutwardIssue(IssueLinkOutwardIssue outwardIssue) {
    this.outwardIssue = outwardIssue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueLink issueLink = (IssueLink) o;
    return Objects.equals(this.id, issueLink.id) &&
        Objects.equals(this.self, issueLink.self) &&
        Objects.equals(this.type, issueLink.type) &&
        Objects.equals(this.inwardIssue, issueLink.inwardIssue) &&
        Objects.equals(this.outwardIssue, issueLink.outwardIssue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, self, type, inwardIssue, outwardIssue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueLink {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    inwardIssue: ").append(toIndentedString(inwardIssue)).append("\n");
    sb.append("    outwardIssue: ").append(toIndentedString(outwardIssue)).append("\n");
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
    openapiFields.add("self");
    openapiFields.add("type");
    openapiFields.add("inwardIssue");
    openapiFields.add("outwardIssue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("inwardIssue");
    openapiRequiredFields.add("outwardIssue");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IssueLink
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (IssueLink.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssueLink is not found in the empty JSON string", IssueLink.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IssueLink.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IssueLink` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IssueLink.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) && !jsonObj.get("self").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        IssueLinkType.validateJsonObject(jsonObj.getAsJsonObject("type"));
      }
      // validate the optional field `inwardIssue`
      if (jsonObj.get("inwardIssue") != null && !jsonObj.get("inwardIssue").isJsonNull()) {
        IssueLinkInwardIssue.validateJsonObject(jsonObj.getAsJsonObject("inwardIssue"));
      }
      // validate the optional field `outwardIssue`
      if (jsonObj.get("outwardIssue") != null && !jsonObj.get("outwardIssue").isJsonNull()) {
        IssueLinkOutwardIssue.validateJsonObject(jsonObj.getAsJsonObject("outwardIssue"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssueLink.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssueLink' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssueLink> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssueLink.class));

       return (TypeAdapter<T>) new TypeAdapter<IssueLink>() {
           @Override
           public void write(JsonWriter out, IssueLink value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IssueLink read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IssueLink given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IssueLink
  * @throws IOException if the JSON string is invalid with respect to IssueLink
  */
  public static IssueLink fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssueLink.class);
  }

 /**
  * Convert an instance of IssueLink to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

