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
 * Details about a notification associated with an event.
 */
@ApiModel(description = "Details about a notification associated with an event.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-31T17:36:49.012380+08:00[Asia/Shanghai]")
public class EventNotification {
  public static final String SERIALIZED_NAME_EXPAND = "expand";
  @SerializedName(SERIALIZED_NAME_EXPAND)
  private String expand;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  /**
   * Identifies the recipients of the notification.
   */
  @JsonAdapter(NotificationTypeEnum.Adapter.class)
  public enum NotificationTypeEnum {
    CURRENTASSIGNEE("CurrentAssignee"),
    
    REPORTER("Reporter"),
    
    CURRENTUSER("CurrentUser"),
    
    PROJECTLEAD("ProjectLead"),
    
    COMPONENTLEAD("ComponentLead"),
    
    USER("User"),
    
    GROUP("Group"),
    
    PROJECTROLE("ProjectRole"),
    
    EMAILADDRESS("EmailAddress"),
    
    ALLWATCHERS("AllWatchers"),
    
    USERCUSTOMFIELD("UserCustomField"),
    
    GROUPCUSTOMFIELD("GroupCustomField");

    private String value;

    NotificationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NotificationTypeEnum fromValue(String value) {
      for (NotificationTypeEnum b : NotificationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NotificationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NotificationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NotificationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NotificationTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NOTIFICATION_TYPE = "notificationType";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_TYPE)
  private NotificationTypeEnum notificationType;

  public static final String SERIALIZED_NAME_PARAMETER = "parameter";
  @SerializedName(SERIALIZED_NAME_PARAMETER)
  private String parameter;

  public static final String SERIALIZED_NAME_RECIPIENT = "recipient";
  @SerializedName(SERIALIZED_NAME_RECIPIENT)
  private String recipient;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private EventNotificationGroup group;

  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private EventNotificationField field;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "emailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_PROJECT_ROLE = "projectRole";
  @SerializedName(SERIALIZED_NAME_PROJECT_ROLE)
  private EventNotificationProjectRole projectRole;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private EventNotificationUser user;

  public EventNotification() {
  }

  public EventNotification expand(String expand) {
    
    this.expand = expand;
    return this;
  }

   /**
   * Expand options that include additional event notification details in the response.
   * @return expand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expand options that include additional event notification details in the response.")

  public String getExpand() {
    return expand;
  }


  public void setExpand(String expand) {
    this.expand = expand;
  }


  public EventNotification id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the notification.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the notification.")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public EventNotification notificationType(NotificationTypeEnum notificationType) {
    
    this.notificationType = notificationType;
    return this;
  }

   /**
   * Identifies the recipients of the notification.
   * @return notificationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifies the recipients of the notification.")

  public NotificationTypeEnum getNotificationType() {
    return notificationType;
  }


  public void setNotificationType(NotificationTypeEnum notificationType) {
    this.notificationType = notificationType;
  }


  public EventNotification parameter(String parameter) {
    
    this.parameter = parameter;
    return this;
  }

   /**
   * As a group&#39;s name can change, use of &#x60;recipient&#x60; is recommended. The identifier associated with the &#x60;notificationType&#x60; value that defines the receiver of the notification, where the receiver isn&#39;t implied by &#x60;notificationType&#x60; value. So, when &#x60;notificationType&#x60; is:   *  &#x60;User&#x60; The &#x60;parameter&#x60; is the user account ID.  *  &#x60;Group&#x60; The &#x60;parameter&#x60; is the group name.  *  &#x60;ProjectRole&#x60; The &#x60;parameter&#x60; is the project role ID.  *  &#x60;UserCustomField&#x60; The &#x60;parameter&#x60; is the ID of the custom field.  *  &#x60;GroupCustomField&#x60; The &#x60;parameter&#x60; is the ID of the custom field.
   * @return parameter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "As a group's name can change, use of `recipient` is recommended. The identifier associated with the `notificationType` value that defines the receiver of the notification, where the receiver isn't implied by `notificationType` value. So, when `notificationType` is:   *  `User` The `parameter` is the user account ID.  *  `Group` The `parameter` is the group name.  *  `ProjectRole` The `parameter` is the project role ID.  *  `UserCustomField` The `parameter` is the ID of the custom field.  *  `GroupCustomField` The `parameter` is the ID of the custom field.")

  public String getParameter() {
    return parameter;
  }


  public void setParameter(String parameter) {
    this.parameter = parameter;
  }


  public EventNotification recipient(String recipient) {
    
    this.recipient = recipient;
    return this;
  }

   /**
   * The identifier associated with the &#x60;notificationType&#x60; value that defines the receiver of the notification, where the receiver isn&#39;t implied by the &#x60;notificationType&#x60; value. So, when &#x60;notificationType&#x60; is:   *  &#x60;User&#x60;, &#x60;recipient&#x60; is the user account ID.  *  &#x60;Group&#x60;, &#x60;recipient&#x60; is the group ID.  *  &#x60;ProjectRole&#x60;, &#x60;recipient&#x60; is the project role ID.  *  &#x60;UserCustomField&#x60;, &#x60;recipient&#x60; is the ID of the custom field.  *  &#x60;GroupCustomField&#x60;, &#x60;recipient&#x60; is the ID of the custom field.
   * @return recipient
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The identifier associated with the `notificationType` value that defines the receiver of the notification, where the receiver isn't implied by the `notificationType` value. So, when `notificationType` is:   *  `User`, `recipient` is the user account ID.  *  `Group`, `recipient` is the group ID.  *  `ProjectRole`, `recipient` is the project role ID.  *  `UserCustomField`, `recipient` is the ID of the custom field.  *  `GroupCustomField`, `recipient` is the ID of the custom field.")

  public String getRecipient() {
    return recipient;
  }


  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }


  public EventNotification group(EventNotificationGroup group) {
    
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EventNotificationGroup getGroup() {
    return group;
  }


  public void setGroup(EventNotificationGroup group) {
    this.group = group;
  }


  public EventNotification field(EventNotificationField field) {
    
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EventNotificationField getField() {
    return field;
  }


  public void setField(EventNotificationField field) {
    this.field = field;
  }


  public EventNotification emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The email address.
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email address.")

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public EventNotification projectRole(EventNotificationProjectRole projectRole) {
    
    this.projectRole = projectRole;
    return this;
  }

   /**
   * Get projectRole
   * @return projectRole
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EventNotificationProjectRole getProjectRole() {
    return projectRole;
  }


  public void setProjectRole(EventNotificationProjectRole projectRole) {
    this.projectRole = projectRole;
  }


  public EventNotification user(EventNotificationUser user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EventNotificationUser getUser() {
    return user;
  }


  public void setUser(EventNotificationUser user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventNotification eventNotification = (EventNotification) o;
    return Objects.equals(this.expand, eventNotification.expand) &&
        Objects.equals(this.id, eventNotification.id) &&
        Objects.equals(this.notificationType, eventNotification.notificationType) &&
        Objects.equals(this.parameter, eventNotification.parameter) &&
        Objects.equals(this.recipient, eventNotification.recipient) &&
        Objects.equals(this.group, eventNotification.group) &&
        Objects.equals(this.field, eventNotification.field) &&
        Objects.equals(this.emailAddress, eventNotification.emailAddress) &&
        Objects.equals(this.projectRole, eventNotification.projectRole) &&
        Objects.equals(this.user, eventNotification.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand, id, notificationType, parameter, recipient, group, field, emailAddress, projectRole, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventNotification {\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    projectRole: ").append(toIndentedString(projectRole)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
    openapiFields.add("expand");
    openapiFields.add("id");
    openapiFields.add("notificationType");
    openapiFields.add("parameter");
    openapiFields.add("recipient");
    openapiFields.add("group");
    openapiFields.add("field");
    openapiFields.add("emailAddress");
    openapiFields.add("projectRole");
    openapiFields.add("user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EventNotification
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EventNotification.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EventNotification is not found in the empty JSON string", EventNotification.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EventNotification.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EventNotification` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("expand") != null && !jsonObj.get("expand").isJsonNull()) && !jsonObj.get("expand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expand").toString()));
      }
      if ((jsonObj.get("notificationType") != null && !jsonObj.get("notificationType").isJsonNull()) && !jsonObj.get("notificationType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notificationType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notificationType").toString()));
      }
      if ((jsonObj.get("parameter") != null && !jsonObj.get("parameter").isJsonNull()) && !jsonObj.get("parameter").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parameter` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parameter").toString()));
      }
      if ((jsonObj.get("recipient") != null && !jsonObj.get("recipient").isJsonNull()) && !jsonObj.get("recipient").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recipient` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recipient").toString()));
      }
      // validate the optional field `group`
      if (jsonObj.get("group") != null && !jsonObj.get("group").isJsonNull()) {
        EventNotificationGroup.validateJsonObject(jsonObj.getAsJsonObject("group"));
      }
      // validate the optional field `field`
      if (jsonObj.get("field") != null && !jsonObj.get("field").isJsonNull()) {
        EventNotificationField.validateJsonObject(jsonObj.getAsJsonObject("field"));
      }
      if ((jsonObj.get("emailAddress") != null && !jsonObj.get("emailAddress").isJsonNull()) && !jsonObj.get("emailAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emailAddress").toString()));
      }
      // validate the optional field `projectRole`
      if (jsonObj.get("projectRole") != null && !jsonObj.get("projectRole").isJsonNull()) {
        EventNotificationProjectRole.validateJsonObject(jsonObj.getAsJsonObject("projectRole"));
      }
      // validate the optional field `user`
      if (jsonObj.get("user") != null && !jsonObj.get("user").isJsonNull()) {
        EventNotificationUser.validateJsonObject(jsonObj.getAsJsonObject("user"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventNotification.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventNotification' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventNotification> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventNotification.class));

       return (TypeAdapter<T>) new TypeAdapter<EventNotification>() {
           @Override
           public void write(JsonWriter out, EventNotification value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventNotification read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventNotification given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventNotification
  * @throws IOException if the JSON string is invalid with respect to EventNotification
  */
  public static EventNotification fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventNotification.class);
  }

 /**
  * Convert an instance of EventNotification to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

