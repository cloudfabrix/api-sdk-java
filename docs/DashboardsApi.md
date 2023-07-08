# DashboardsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDashboards**](DashboardsApi.md#getDashboards) | **GET** /api/v2/dashboards | Fetch meta data for dashboards |


<a id="getDashboards"></a>
# **getDashboards**
> TableReportResponse getDashboards(cfxqlQuery, search, offset, limit, sort)

Fetch meta data for dashboards

Fetch meta data for dashboards

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DashboardsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DashboardsApi apiInstance = new DashboardsApi(defaultClient);
    String cfxqlQuery = "cfxqlQuery_example"; // String | <a href='https://bot-docs.cloudfabrix.io/reference_guides/cfxql/'>cfxql query</a> string to filter the results
    String search = "search_example"; // String | search across fields: ['name', 'description', 'usecase', 'category', 'version']
    Integer offset = 0; // Integer | Offset to start the results from.
    Integer limit = 100; // Integer | Maximum number of results to return
    List<DashboardsEnum> sort = Arrays.asList(); // List<DashboardsEnum> | Sort the output based on given fields
    try {
      TableReportResponse result = apiInstance.getDashboards(cfxqlQuery, search, offset, limit, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#getDashboards");
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
| **search** | **String**| search across fields: [&#39;name&#39;, &#39;description&#39;, &#39;usecase&#39;, &#39;category&#39;, &#39;version&#39;] | [optional] |
| **offset** | **Integer**| Offset to start the results from. | [optional] [default to 0] |
| **limit** | **Integer**| Maximum number of results to return | [optional] [default to 100] |
| **sort** | [**List&lt;DashboardsEnum&gt;**](DashboardsEnum.md)| Sort the output based on given fields | [optional] |

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

