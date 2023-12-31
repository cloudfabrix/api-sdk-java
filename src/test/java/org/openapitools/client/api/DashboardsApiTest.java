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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.DashboardsEnum;
import org.openapitools.client.model.HTTPValidationError;
import org.openapitools.client.model.TableReportResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DashboardsApi
 */
@Disabled
public class DashboardsApiTest {

    private final DashboardsApi api = new DashboardsApi();

    /**
     * Fetch meta data for dashboards
     *
     * Fetch meta data for dashboards
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDashboardsTest() throws ApiException {
        String cfxqlQuery = null;
        String search = null;
        Integer offset = null;
        Integer limit = null;
        List<DashboardsEnum> sort = null;
        TableReportResponse response = api.getDashboards(cfxqlQuery, search, offset, limit, sort);
        // TODO: test validations
    }

}
