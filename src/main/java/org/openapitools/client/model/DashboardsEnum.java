/*
 * CloudFabrix RDA Platform API
 * CloudFabrix RDA Platform API
 *
 * The version of the OpenAPI document: 3.2.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * An enumeration.
 */
@JsonAdapter(DashboardsEnum.Adapter.class)
public enum DashboardsEnum {
  
  CATEGORY("category"),
  
  _CATEGORY("-category"),
  
  DESCRIPTION("description"),
  
  _DESCRIPTION("-description"),
  
  FOLDER("folder"),
  
  _FOLDER("-folder"),
  
  NAME("name"),
  
  _NAME("-name"),
  
  SAVED_TIME("saved_time"),
  
  _SAVED_TIME("-saved_time"),
  
  TIMESTAMP("timestamp"),
  
  _TIMESTAMP("-timestamp"),
  
  USECASE("usecase"),
  
  _USECASE("-usecase"),
  
  VERSION("version"),
  
  _VERSION("-version"),
  
  VERSIONS_COUNT("versions_count"),
  
  _VERSIONS_COUNT("-versions_count");

  private String value;

  DashboardsEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DashboardsEnum fromValue(String value) {
    for (DashboardsEnum b : DashboardsEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DashboardsEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final DashboardsEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DashboardsEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DashboardsEnum.fromValue(value);
    }
  }
}

