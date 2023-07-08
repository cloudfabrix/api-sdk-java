# PersistentStreamsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addPstream**](PersistentStreamsApi.md#addPstream) | **POST** /api/v2/pstreams | Add a pstream |
| [**deletePstream**](PersistentStreamsApi.md#deletePstream) | **DELETE** /api/v2/pstreams/pstream/{name} | Delete a pstream. |
| [**editPstream**](PersistentStreamsApi.md#editPstream) | **PUT** /api/v2/pstreams/pstream/{name} | Edit attributes of a pstream |
| [**getPstreamData**](PersistentStreamsApi.md#getPstreamData) | **GET** /api/v2/pstreams/pstream/{name}/data | Get data of a pstream |
| [**getPstreams**](PersistentStreamsApi.md#getPstreams) | **GET** /api/v2/pstreams | Fetch meta data about pstreams |


<a id="addPstream"></a>
# **addPstream**
> Object addPstream(pstreamAddModel)

Add a pstream

Add a new pstream to the system

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PersistentStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PersistentStreamsApi apiInstance = new PersistentStreamsApi(defaultClient);
    PstreamAddModel pstreamAddModel = new PstreamAddModel(); // PstreamAddModel | 
    try {
      Object result = apiInstance.addPstream(pstreamAddModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersistentStreamsApi#addPstream");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pstreamAddModel** | [**PstreamAddModel**](PstreamAddModel.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="deletePstream"></a>
# **deletePstream**
> Object deletePstream(name, deleteData)

Delete a pstream.

Delete a persistent stream.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PersistentStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PersistentStreamsApi apiInstance = new PersistentStreamsApi(defaultClient);
    String name = "name_example"; // String | Name of the pstream to be deleted
    Boolean deleteData = false; // Boolean | Delete data as well. If data is not deleted, adding the same pstream again will add the old data back.
    try {
      Object result = apiInstance.deletePstream(name, deleteData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersistentStreamsApi#deletePstream");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| Name of the pstream to be deleted | |
| **deleteData** | **Boolean**| Delete data as well. If data is not deleted, adding the same pstream again will add the old data back. | [optional] [default to false] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="editPstream"></a>
# **editPstream**
> Object editPstream(name, pstreamEditModel)

Edit attributes of a pstream

Edit the attributes of a persistent stream

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PersistentStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PersistentStreamsApi apiInstance = new PersistentStreamsApi(defaultClient);
    String name = "name_example"; // String | Name of the pstream to be edited
    PstreamEditModel pstreamEditModel = new PstreamEditModel(); // PstreamEditModel | 
    try {
      Object result = apiInstance.editPstream(name, pstreamEditModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersistentStreamsApi#editPstream");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| Name of the pstream to be edited | |
| **pstreamEditModel** | [**PstreamEditModel**](PstreamEditModel.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="getPstreamData"></a>
# **getPstreamData**
> TableReportResponse getPstreamData(name, cfxqlQuery, search, sort, offset, limit)

Get data of a pstream

Get data of a persistent stream

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PersistentStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PersistentStreamsApi apiInstance = new PersistentStreamsApi(defaultClient);
    String name = "name_example"; // String | Name of the pstream
    String cfxqlQuery = "cfxqlQuery_example"; // String | <a href='https://bot-docs.cloudfabrix.io/reference_guides/cfxql/'>cfxql query</a> string to filter the results
    String search = "search_example"; // String | search across fields: ['name']
    List<String> sort = Arrays.asList(); // List<String> | Sort the output based on given fields. Prepend '-' to sort descending
    Integer offset = 0; // Integer | Offset to start the results from.
    Integer limit = 100; // Integer | Maximum number of results to return
    try {
      TableReportResponse result = apiInstance.getPstreamData(name, cfxqlQuery, search, sort, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersistentStreamsApi#getPstreamData");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| Name of the pstream | |
| **cfxqlQuery** | **String**| &lt;a href&#x3D;&#39;https://bot-docs.cloudfabrix.io/reference_guides/cfxql/&#39;&gt;cfxql query&lt;/a&gt; string to filter the results | [optional] |
| **search** | **String**| search across fields: [&#39;name&#39;] | [optional] |
| **sort** | [**List&lt;String&gt;**](String.md)| Sort the output based on given fields. Prepend &#39;-&#39; to sort descending | [optional] |
| **offset** | **Integer**| Offset to start the results from. | [optional] [default to 0] |
| **limit** | **Integer**| Maximum number of results to return | [optional] [default to 100] |

### Return type

[**TableReportResponse**](TableReportResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="getPstreams"></a>
# **getPstreams**
> TableReportResponse getPstreams(cfxqlQuery, search, offset, limit, sort)

Fetch meta data about pstreams

Fetch meta data about pstreams

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PersistentStreamsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    PersistentStreamsApi apiInstance = new PersistentStreamsApi(defaultClient);
    String cfxqlQuery = "cfxqlQuery_example"; // String | <a href='https://bot-docs.cloudfabrix.io/reference_guides/cfxql/'>cfxql query</a> string to filter the results
    String search = "search_example"; // String | search across fields: ['name']
    Integer offset = 0; // Integer | Offset to start the results from.
    Integer limit = 100; // Integer | Maximum number of results to return
    List<PstreamsEnum> sort = Arrays.asList(); // List<PstreamsEnum> | Sort the output based on given fields
    try {
      TableReportResponse result = apiInstance.getPstreams(cfxqlQuery, search, offset, limit, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PersistentStreamsApi#getPstreams");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **cfxqlQuery** | **String**| &lt;a href&#x3D;&#39;https://bot-docs.cloudfabrix.io/reference_guides/cfxql/&#39;&gt;cfxql query&lt;/a&gt; string to filter the results | [optional] |
| **search** | **String**| search across fields: [&#39;name&#39;] | [optional] |
| **offset** | **Integer**| Offset to start the results from. | [optional] [default to 0] |
| **limit** | **Integer**| Maximum number of results to return | [optional] [default to 100] |
| **sort** | [**List&lt;PstreamsEnum&gt;**](PstreamsEnum.md)| Sort the output based on given fields | [optional] |

### Return type

[**TableReportResponse**](TableReportResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

