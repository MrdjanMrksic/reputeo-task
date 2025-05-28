package functional.tests;

import calls.SearchApi;
import data.provider.SearchProvider;
import functional.asserts.SearchAssert;
import models.request.CreateSearchRequest;
import models.response.CreateSearchResponse;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchTests {

    @BeforeClass
    public void prepareDataForTest() {
        //We would acquire an access token here
    }

    @Test
    public void verifyProfilePage() {
        CreateSearchRequest searchRequest = SearchProvider.generateSearchRequest();
        CreateSearchResponse searchResponse = SearchApi.searchResponse(searchRequest);

        SearchAssert searchAssert = new SearchAssert();
        searchAssert.assertSearchResponse(searchRequest, searchResponse);
    }
}
