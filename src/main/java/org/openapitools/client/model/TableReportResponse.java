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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * TableReportResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-08T16:25:40.429196Z[Etc/UTC]")
public class TableReportResponse {
  public static final String SERIALIZED_NAME_LAST_SORT_RESULTS = "last_sort_results";
  @SerializedName(SERIALIZED_NAME_LAST_SORT_RESULTS)
  private List<String> lastSortResults;

  public static final String SERIALIZED_NAME_REPORT_META_DATA = "reportMetaData";
  @SerializedName(SERIALIZED_NAME_REPORT_META_DATA)
  private Object reportMetaData;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  private List<String> sort;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "total_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;

  public static final String SERIALIZED_NAME_NUM_ITEMS = "num_items";
  @SerializedName(SERIALIZED_NAME_NUM_ITEMS)
  private Integer numItems;

  public static final String SERIALIZED_NAME_IS_FIRST = "is_first";
  @SerializedName(SERIALIZED_NAME_IS_FIRST)
  private Boolean isFirst = true;

  public static final String SERIALIZED_NAME_IS_LAST = "is_last";
  @SerializedName(SERIALIZED_NAME_IS_LAST)
  private Boolean isLast = true;

  public TableReportResponse() {
  }

  public TableReportResponse lastSortResults(List<String> lastSortResults) {
    
    this.lastSortResults = lastSortResults;
    return this;
  }

  public TableReportResponse addLastSortResultsItem(String lastSortResultsItem) {
    if (this.lastSortResults == null) {
      this.lastSortResults = new ArrayList<>();
    }
    this.lastSortResults.add(lastSortResultsItem);
    return this;
  }

   /**
   * Last sort tags used for internal puposes
   * @return lastSortResults
  **/
  @javax.annotation.Nullable
  public List<String> getLastSortResults() {
    return lastSortResults;
  }


  public void setLastSortResults(List<String> lastSortResults) {
    this.lastSortResults = lastSortResults;
  }


  public TableReportResponse reportMetaData(Object reportMetaData) {
    
    this.reportMetaData = reportMetaData;
    return this;
  }

   /**
   * Meta information about the report, including columns and types etc
   * @return reportMetaData
  **/
  @javax.annotation.Nullable
  public Object getReportMetaData() {
    return reportMetaData;
  }


  public void setReportMetaData(Object reportMetaData) {
    this.reportMetaData = reportMetaData;
  }


  public TableReportResponse offset(Integer offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * Starting offset in the filtered results
   * @return offset
  **/
  @javax.annotation.Nullable
  public Integer getOffset() {
    return offset;
  }


  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  public TableReportResponse limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * Maximum number of results to be returned per page
   * @return limit
  **/
  @javax.annotation.Nullable
  public Integer getLimit() {
    return limit;
  }


  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public TableReportResponse sort(List<String> sort) {
    
    this.sort = sort;
    return this;
  }

  public TableReportResponse addSortItem(String sortItem) {
    if (this.sort == null) {
      this.sort = new ArrayList<>();
    }
    this.sort.add(sortItem);
    return this;
  }

   /**
   * Sort order passed as part of request
   * @return sort
  **/
  @javax.annotation.Nullable
  public List<String> getSort() {
    return sort;
  }


  public void setSort(List<String> sort) {
    this.sort = sort;
  }


  public TableReportResponse totalCount(Integer totalCount) {
    
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Total number of results that matched the query
   * @return totalCount
  **/
  @javax.annotation.Nullable
  public Integer getTotalCount() {
    return totalCount;
  }


  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }


  public TableReportResponse numItems(Integer numItems) {
    
    this.numItems = numItems;
    return this;
  }

   /**
   * Number of results returned in this page
   * @return numItems
  **/
  @javax.annotation.Nullable
  public Integer getNumItems() {
    return numItems;
  }


  public void setNumItems(Integer numItems) {
    this.numItems = numItems;
  }


  public TableReportResponse isFirst(Boolean isFirst) {
    
    this.isFirst = isFirst;
    return this;
  }

   /**
   * True if this page is first page
   * @return isFirst
  **/
  @javax.annotation.Nullable
  public Boolean getIsFirst() {
    return isFirst;
  }


  public void setIsFirst(Boolean isFirst) {
    this.isFirst = isFirst;
  }


  public TableReportResponse isLast(Boolean isLast) {
    
    this.isLast = isLast;
    return this;
  }

   /**
   * True if this page is last page
   * @return isLast
  **/
  @javax.annotation.Nullable
  public Boolean getIsLast() {
    return isLast;
  }


  public void setIsLast(Boolean isLast) {
    this.isLast = isLast;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableReportResponse tableReportResponse = (TableReportResponse) o;
    return Objects.equals(this.lastSortResults, tableReportResponse.lastSortResults) &&
        Objects.equals(this.reportMetaData, tableReportResponse.reportMetaData) &&
        Objects.equals(this.offset, tableReportResponse.offset) &&
        Objects.equals(this.limit, tableReportResponse.limit) &&
        Objects.equals(this.sort, tableReportResponse.sort) &&
        Objects.equals(this.totalCount, tableReportResponse.totalCount) &&
        Objects.equals(this.numItems, tableReportResponse.numItems) &&
        Objects.equals(this.isFirst, tableReportResponse.isFirst) &&
        Objects.equals(this.isLast, tableReportResponse.isLast);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastSortResults, reportMetaData, offset, limit, sort, totalCount, numItems, isFirst, isLast);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableReportResponse {\n");
    sb.append("    lastSortResults: ").append(toIndentedString(lastSortResults)).append("\n");
    sb.append("    reportMetaData: ").append(toIndentedString(reportMetaData)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    numItems: ").append(toIndentedString(numItems)).append("\n");
    sb.append("    isFirst: ").append(toIndentedString(isFirst)).append("\n");
    sb.append("    isLast: ").append(toIndentedString(isLast)).append("\n");
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
    openapiFields.add("last_sort_results");
    openapiFields.add("reportMetaData");
    openapiFields.add("offset");
    openapiFields.add("limit");
    openapiFields.add("sort");
    openapiFields.add("total_count");
    openapiFields.add("num_items");
    openapiFields.add("is_first");
    openapiFields.add("is_last");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TableReportResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TableReportResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TableReportResponse is not found in the empty JSON string", TableReportResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!TableReportResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `TableReportResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("last_sort_results") != null && !jsonObj.get("last_sort_results").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_sort_results` to be an array in the JSON string but got `%s`", jsonObj.get("last_sort_results").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("sort") != null && !jsonObj.get("sort").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sort` to be an array in the JSON string but got `%s`", jsonObj.get("sort").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TableReportResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TableReportResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TableReportResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TableReportResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<TableReportResponse>() {
           @Override
           public void write(JsonWriter out, TableReportResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public TableReportResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of TableReportResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TableReportResponse
  * @throws IOException if the JSON string is invalid with respect to TableReportResponse
  */
  public static TableReportResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TableReportResponse.class);
  }

 /**
  * Convert an instance of TableReportResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

