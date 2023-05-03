/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
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
import java.io.IOException;

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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * IsoscelesTriangle
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class IsoscelesTriangle {
  public static final String SERIALIZED_NAME_SHAPE_TYPE = "shapeType";
  @SerializedName(SERIALIZED_NAME_SHAPE_TYPE)
  private String shapeType;

  public static final String SERIALIZED_NAME_TRIANGLE_TYPE = "triangleType";
  @SerializedName(SERIALIZED_NAME_TRIANGLE_TYPE)
  private String triangleType;

  public IsoscelesTriangle() {
  }

  public IsoscelesTriangle shapeType(String shapeType) {
    
    this.shapeType = shapeType;
    return this;
  }

   /**
   * Get shapeType
   * @return shapeType
  **/
  @javax.annotation.Nonnull

  public String getShapeType() {
    return shapeType;
  }


  public void setShapeType(String shapeType) {
    this.shapeType = shapeType;
  }


  public IsoscelesTriangle triangleType(String triangleType) {
    
    this.triangleType = triangleType;
    return this;
  }

   /**
   * Get triangleType
   * @return triangleType
  **/
  @javax.annotation.Nonnull

  public String getTriangleType() {
    return triangleType;
  }


  public void setTriangleType(String triangleType) {
    this.triangleType = triangleType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IsoscelesTriangle isoscelesTriangle = (IsoscelesTriangle) o;
    return Objects.equals(this.shapeType, isoscelesTriangle.shapeType) &&
        Objects.equals(this.triangleType, isoscelesTriangle.triangleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shapeType, triangleType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IsoscelesTriangle {\n");
    sb.append("    shapeType: ").append(toIndentedString(shapeType)).append("\n");
    sb.append("    triangleType: ").append(toIndentedString(triangleType)).append("\n");
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
    openapiFields.add("shapeType");
    openapiFields.add("triangleType");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("shapeType");
    openapiRequiredFields.add("triangleType");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IsoscelesTriangle
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!IsoscelesTriangle.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IsoscelesTriangle is not found in the empty JSON string", IsoscelesTriangle.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!IsoscelesTriangle.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IsoscelesTriangle` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IsoscelesTriangle.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("shapeType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shapeType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shapeType").toString()));
      }
      if (!jsonObj.get("triangleType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `triangleType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("triangleType").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IsoscelesTriangle.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IsoscelesTriangle' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IsoscelesTriangle> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IsoscelesTriangle.class));

       return (TypeAdapter<T>) new TypeAdapter<IsoscelesTriangle>() {
           @Override
           public void write(JsonWriter out, IsoscelesTriangle value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IsoscelesTriangle read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of IsoscelesTriangle given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IsoscelesTriangle
  * @throws IOException if the JSON string is invalid with respect to IsoscelesTriangle
  */
  public static IsoscelesTriangle fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IsoscelesTriangle.class);
  }

 /**
  * Convert an instance of IsoscelesTriangle to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

