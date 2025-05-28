package calls;

import constants.ApiPaths;
import model.request.CreateSearchRequest;
import model.response.CreateSearchResponse;
import util.rest.GsonFunctions;
import util.rest.RestAssuredNoAuthFunctions;

public class SearchApi {
    public static CreateSearchResponse searchResponse(CreateSearchRequest searchRequest){
        return GsonFunctions.parseSuccessResponseToModel(
                RestAssuredNoAuthFunctions.post(searchRequest, ApiPaths.POST_SEARCH.getApiPath()),
                CreateSearchResponse.class
        );
    }
}
