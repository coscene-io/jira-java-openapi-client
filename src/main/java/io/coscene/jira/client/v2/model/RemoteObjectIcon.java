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
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import io.coscene.jira.client.v2.JSON;

/**
 * Details of the icon for the item. If no icon is defined, the default link icon is used in Jira.
 */
@ApiModel(description = "Details of the icon for the item. If no icon is defined, the default link icon is used in Jira.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-01T09:11:13.378435+08:00[Asia/Shanghai]")
public class RemoteObjectIcon {
  public static final String SERIALIZED_NAME_URL16X16 = "url16x16";
  @SerializedName(SERIALIZED_NAME_URL16X16)
  private String url16x16;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public RemoteObjectIcon() {
  }

  public RemoteObjectIcon url16x16(String url16x16) {
    
    this.url16x16 = url16x16;
    return this;
  }

   /**
   * The URL of an icon that displays at 16x16 pixel in Jira.
   * @return url16x16
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of an icon that displays at 16x16 pixel in Jira.")

  public String getUrl16x16() {
    return url16x16;
  }


  public void setUrl16x16(String url16x16) {
    this.url16x16 = url16x16;
  }


  public RemoteObjectIcon title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * The title of the icon. This is used as follows:   *  For a status icon it is used as a tooltip on the icon. If not set, the status icon doesn&#39;t display a tooltip in Jira.  *  For the remote object icon it is used in conjunction with the application name to display a tooltip for the link&#39;s icon. The tooltip takes the format \&quot;\\[application name\\] icon title\&quot;. Blank itemsare excluded from the tooltip title. If both items are blank, the icon tooltop displays as \&quot;Web Link\&quot;.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The title of the icon. This is used as follows:   *  For a status icon it is used as a tooltip on the icon. If not set, the status icon doesn't display a tooltip in Jira.  *  For the remote object icon it is used in conjunction with the application name to display a tooltip for the link's icon. The tooltip takes the format \"\\[application name\\] icon title\". Blank itemsare excluded from the tooltip title. If both items are blank, the icon tooltop displays as \"Web Link\".")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public RemoteObjectIcon link(String link) {
    
    this.link = link;
    return this;
  }

   /**
   * The URL of the tooltip, used only for a status icon. If not set, the status icon in Jira is not clickable.
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the tooltip, used only for a status icon. If not set, the status icon in Jira is not clickable.")

  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    this.link = link;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteObjectIcon remoteObjectIcon = (RemoteObjectIcon) o;
    return Objects.equals(this.url16x16, remoteObjectIcon.url16x16) &&
        Objects.equals(this.title, remoteObjectIcon.title) &&
        Objects.equals(this.link, remoteObjectIcon.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url16x16, title, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RemoteObjectIcon {\n");
    sb.append("    url16x16: ").append(toIndentedString(url16x16)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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
    openapiFields.add("url16x16");
    openapiFields.add("title");
    openapiFields.add("link");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RemoteObjectIcon
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RemoteObjectIcon.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RemoteObjectIcon is not found in the empty JSON string", RemoteObjectIcon.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RemoteObjectIcon.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RemoteObjectIcon` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("url16x16") != null && !jsonObj.get("url16x16").isJsonNull()) && !jsonObj.get("url16x16").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url16x16` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url16x16").toString()));
      }
      if ((jsonObj.get("title") != null && !jsonObj.get("title").isJsonNull()) && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if ((jsonObj.get("link") != null && !jsonObj.get("link").isJsonNull()) && !jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RemoteObjectIcon.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RemoteObjectIcon' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RemoteObjectIcon> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RemoteObjectIcon.class));

       return (TypeAdapter<T>) new TypeAdapter<RemoteObjectIcon>() {
           @Override
           public void write(JsonWriter out, RemoteObjectIcon value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RemoteObjectIcon read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RemoteObjectIcon given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RemoteObjectIcon
  * @throws IOException if the JSON string is invalid with respect to RemoteObjectIcon
  */
  public static RemoteObjectIcon fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RemoteObjectIcon.class);
  }

 /**
  * Convert an instance of RemoteObjectIcon to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

