/*
 * Echo Server API
 * Echo Server API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter
 */
@JsonPropertyOrder({
  TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter.JSON_PROPERTY_SIZE,
  TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter.JSON_PROPERTY_COLOR,
  TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter.JSON_PROPERTY_ID,
  TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter.JSON_PROPERTY_NAME
})
@JsonTypeName("test_query_style_deepObject_explode_true_object_allOf_query_object_parameter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter {
  public static final String JSON_PROPERTY_SIZE = "size";
  private String size;

  public static final String JSON_PROPERTY_COLOR = "color";
  private String color;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter() {
  }

  public TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter size(String size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSize(String size) {
    this.size = size;
  }


  public TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter color(String color) {
    
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getColor() {
    return color;
  }


  @JsonProperty(JSON_PROPERTY_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setColor(String color) {
    this.color = color;
  }


  public TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(Long id) {
    this.id = id;
  }


  public TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter testQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter = (TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter) o;
    return Objects.equals(this.size, testQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter.size) &&
        Objects.equals(this.color, testQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter.color) &&
        Objects.equals(this.id, testQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter.id) &&
        Objects.equals(this.name, testQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, color, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestQueryStyleDeepObjectExplodeTrueObjectAllOfQueryObjectParameter {\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `size` to the URL query string
    if (getSize() != null) {
      try {
        joiner.add(String.format("%ssize%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSize()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `color` to the URL query string
    if (getColor() != null) {
      try {
        joiner.add(String.format("%scolor%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getColor()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `id` to the URL query string
    if (getId() != null) {
      try {
        joiner.add(String.format("%sid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

