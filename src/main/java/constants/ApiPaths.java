package constants;

import io.restassured.http.Method;
import lombok.AllArgsConstructor;
import lombok.Getter;

import static io.restassured.http.Method.*;

@AllArgsConstructor
@Getter
public enum ApiPaths {
    POST_SEARCH("/api/v1/external/personal/instant-search", POST);

    private final String apiPath;
    private final Method httpMethodType;
}
