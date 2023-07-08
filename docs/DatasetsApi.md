# DatasetsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDataset**](DatasetsApi.md#addDataset) | **POST** /api/v2/datasets | Add a dataset |
| [**deleteDataset**](DatasetsApi.md#deleteDataset) | **DELETE** /api/v2/datasets/dataset/{name} | Delete a dataset |
| [**deleteDatasetAllData**](DatasetsApi.md#deleteDatasetAllData) | **DELETE** /api/v2/datasets/dataset/{name}/data/all | Delete enitre data of a dataset |
| [**deleteDatasetRows**](DatasetsApi.md#deleteDatasetRows) | **DELETE** /api/v2/datasets/dataset/{name}/data | Delete matching dataset rows |
| [**getDatasetData**](DatasetsApi.md#getDatasetData) | **GET** /api/v2/datasets/dataset/{name}/data | Get data of a dataset |
| [**getDatasets**](DatasetsApi.md#getDatasets) | **GET** /api/v2/datasets | Fetch meta data about datasets |
| [**updateDatasetData**](DatasetsApi.md#updateDatasetData) | **PUT** /api/v2/datasets/dataset/{name}/data | Update rows of a dataset |


<a id="addDataset"></a>
# **addDataset**
> Object addDataset(datasetAddModel)

Add a dataset

Add a dataset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DatasetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DatasetsApi apiInstance = new DatasetsApi(defaultClient);
    DatasetAddModel datasetAddModel = new DatasetAddModel(); // DatasetAddModel | 
    try {
      Object result = apiInstance.addDataset(datasetAddModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetsApi#addDataset");
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
| **datasetAddModel** | [**DatasetAddModel**](DatasetAddModel.md)|  | |

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

<a id="deleteDataset"></a>
# **deleteDataset**
> Object deleteDataset(name)

Delete a dataset

Delete a dataset. Please note that all the data of the dataset will be deleted and can not be undone.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DatasetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DatasetsApi apiInstance = new DatasetsApi(defaultClient);
    String name = "name_example"; // String | Dataset name to be deleted.
    try {
      Object result = apiInstance.deleteDataset(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetsApi#deleteDataset");
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
| **name** | **String**| Dataset name to be deleted. | |

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

<a id="deleteDatasetAllData"></a>
# **deleteDatasetAllData**
> Object deleteDatasetAllData(name)

Delete enitre data of a dataset

Delete entire data of a dataset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DatasetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DatasetsApi apiInstance = new DatasetsApi(defaultClient);
    String name = "name_example"; // String | Name of the dataset
    try {
      Object result = apiInstance.deleteDatasetAllData(name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetsApi#deleteDatasetAllData");
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
| **name** | **String**| Name of the dataset | |

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

<a id="deleteDatasetRows"></a>
# **deleteDatasetRows**
> Object deleteDatasetRows(name, keys, requestBody)

Delete matching dataset rows

Delete dataset rows matching the input data     All the rows in existing dataset that match all the keys in input data are deleted.     NOTE: This directly updates the dataset and all drafts are removed.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DatasetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DatasetsApi apiInstance = new DatasetsApi(defaultClient);
    String name = "name_example"; // String | Name of the dataset
    List<String> keys = Arrays.asList(); // List<String> | Array of keys to match for updating rows
    List<Object> requestBody = null; // List<Object> | 
    try {
      Object result = apiInstance.deleteDatasetRows(name, keys, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetsApi#deleteDatasetRows");
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
| **name** | **String**| Name of the dataset | |
| **keys** | [**List&lt;String&gt;**](String.md)| Array of keys to match for updating rows | |
| **requestBody** | [**List&lt;Object&gt;**](Object.md)|  | |

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

<a id="getDatasetData"></a>
# **getDatasetData**
> TableReportResponse getDatasetData(name, cfxqlQuery, search, sort, offset, limit)

Get data of a dataset

Get data of a dataset

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DatasetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DatasetsApi apiInstance = new DatasetsApi(defaultClient);
    String name = "name_example"; // String | Name of the dataset
    String cfxqlQuery = "cfxqlQuery_example"; // String | <a href='https://bot-docs.cloudfabrix.io/reference_guides/cfxql/'>cfxql query</a> string to filter the results
    String search = "search_example"; // String | search across fields: ['name']
    List<String> sort = Arrays.asList(); // List<String> | Sort the output based on given fields. Prepend '-' to sort descending
    Integer offset = 0; // Integer | Offset to start the results from.
    Integer limit = 100; // Integer | Maximum number of results to return
    try {
      TableReportResponse result = apiInstance.getDatasetData(name, cfxqlQuery, search, sort, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetsApi#getDatasetData");
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
| **name** | **String**| Name of the dataset | |
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

<a id="getDatasets"></a>
# **getDatasets**
> TableReportResponse getDatasets(cfxqlQuery, search, offset, limit, sort)

Fetch meta data about datasets

Fetch meta data about datasets

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DatasetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DatasetsApi apiInstance = new DatasetsApi(defaultClient);
    String cfxqlQuery = "cfxqlQuery_example"; // String | <a href='https://bot-docs.cloudfabrix.io/reference_guides/cfxql/'>cfxql query</a> string to filter the results
    String search = "search_example"; // String | search across fields: ['name', 'schema']
    Integer offset = 0; // Integer | Offset to start the results from.
    Integer limit = 100; // Integer | Maximum number of results to return
    List<DatasetsEnum> sort = Arrays.asList(); // List<DatasetsEnum> | Sort the output based on given fields
    try {
      TableReportResponse result = apiInstance.getDatasets(cfxqlQuery, search, offset, limit, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetsApi#getDatasets");
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
| **search** | **String**| search across fields: [&#39;name&#39;, &#39;schema&#39;] | [optional] |
| **offset** | **Integer**| Offset to start the results from. | [optional] [default to 0] |
| **limit** | **Integer**| Maximum number of results to return | [optional] [default to 100] |
| **sort** | [**List&lt;DatasetsEnum&gt;**](DatasetsEnum.md)| Sort the output based on given fields | [optional] |

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

<a id="updateDatasetData"></a>
# **updateDatasetData**
> Object updateDatasetData(name, requestBody, replace, keys)

Update rows of a dataset

Update (merge or replace) existing dataset data.     This function currently does not support deleting rows.&lt;br/&gt;     If replace is true, entire existing dataset data is replaced with the new data in input.&lt;br/&gt;     If replace is false, &lt;br/&gt;     &lt;ul&gt;         &lt;li&gt;If keys are not given, the input data is appened to the existing dataset.         &lt;li&gt;If keys are given then the following flow explains the operation&lt;br/&gt;             For each row in the input data:             &lt;ul&gt;                 &lt;li&gt;The rows with same values for all the keys are replaced with input row.                 &lt;li&gt;Other rows are appended to the existing dataset             &lt;/ul&gt;         Error raised when:             &lt;ul&gt;                 &lt;li&gt;If there are duplicate rows in input data with same key values                 &lt;li&gt;If any key passed in keys is not present as a column in the input data             &lt;/ul&gt;     &lt;/ul&gt;     NOTE: This directly updates the dataset and all drafts are removed.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DatasetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DatasetsApi apiInstance = new DatasetsApi(defaultClient);
    String name = "name_example"; // String | Name of the dataset
    List<Object> requestBody = null; // List<Object> | 
    Boolean replace = false; // Boolean | If set to true, replace the existing data with new data
    List<String> keys = Arrays.asList(); // List<String> | Array of keys to match for updating rows
    try {
      Object result = apiInstance.updateDatasetData(name, requestBody, replace, keys);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetsApi#updateDatasetData");
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
| **name** | **String**| Name of the dataset | |
| **requestBody** | [**List&lt;Object&gt;**](Object.md)|  | |
| **replace** | **Boolean**| If set to true, replace the existing data with new data | [optional] [default to false] |
| **keys** | [**List&lt;String&gt;**](String.md)| Array of keys to match for updating rows | [optional] |

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

