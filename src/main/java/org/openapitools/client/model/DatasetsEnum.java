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
@JsonAdapter(DatasetsEnum.Adapter.class)
public enum DatasetsEnum {
  
  FOLDER("folder"),
  
  _FOLDER("-folder"),
  
  FORMAT("format"),
  
  _FORMAT("-format"),
  
  MEM_SIZE_MB("mem_size_mb"),
  
  _MEM_SIZE_MB("-mem_size_mb"),
  
  NAME("name"),
  
  _NAME("-name"),
  
  NUM_COLUMNS("num_columns"),
  
  _NUM_COLUMNS("-num_columns"),
  
  NUM_ROWS("num_rows"),
  
  _NUM_ROWS("-num_rows"),
  
  SAVED_TIME("saved_time"),
  
  _SAVED_TIME("-saved_time"),
  
  SCHEMA("schema"),
  
  _SCHEMA("-schema"),
  
  TIMESTAMP("timestamp"),
  
  _TIMESTAMP("-timestamp");

  private String value;

  DatasetsEnum(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DatasetsEnum fromValue(String value) {
    for (DatasetsEnum b : DatasetsEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DatasetsEnum> {
    @Override
    public void write(final JsonWriter jsonWriter, final DatasetsEnum enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DatasetsEnum read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DatasetsEnum.fromValue(value);
    }
  }
}

