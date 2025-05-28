package util.rest;

import com.google.gson.GsonBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RestAssuredNoAuthFunctions {
    public static Response post(Object body, String uri) {
        String json = new GsonBuilder().setPrettyPrinting().create().toJson(body);
        return given().contentType(ContentType.JSON).body(json).when()
                      .post(uri).then().extract().response();
    }
}
