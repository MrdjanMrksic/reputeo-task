package http;

import config.PropertyUtil;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class BaseApi {

    private final RequestSpecification requestSpecification;

    public BaseApi() {
        requestSpecification = RestAssured.given()
                                          .baseUri(PropertyUtil.getConfig().baseUrl())
                                          .filter(new AllureRestAssured());
    }

    protected BaseApi setRequestBody(Object object) {
        this.requestSpecification.body(object);
        return this;
    }

    protected void setBasePath(String basePath) {
        this.requestSpecification.basePath(basePath);
    }

    protected BaseApi setContentType(ContentType contentType) {
        this.requestSpecification.contentType(contentType);
        return this;
    }

    protected Response sendRequest(Method methodType) {
        final RequestSpecification when = this.requestSpecification.when();
        return switch (methodType) {
            case GET -> when.get();
            case PUT -> when.put();
            case POST -> when.post();
            case DELETE -> when.delete();
            case PATCH -> when.patch();
            default -> throw new IllegalArgumentException("Input method type not supported");
        };
    }
}
