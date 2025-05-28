package calls;

import constants.ApiEndpoints;
import models.request.CreateSearchRequest;
import models.response.CreateSearchResponse;
import util.rest.GsonFunctions;
import util.rest.RestAssuredNoAuthFunctions;

public class SearchApi {
    public static CreateSearchResponse searchResponse(CreateSearchRequest searchRequest){
        return GsonFunctions.parseSuccessResponseToModel(
                RestAssuredNoAuthFunctions.post(searchRequest, ApiEndpoints.EXTERNAL_PERSONAL_SEARCH),
                CreateSearchResponse.class
        );
    }
}
