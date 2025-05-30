package util.rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import io.restassured.response.Response;
import org.testng.Assert;


import java.lang.reflect.Type;

public class GsonFunctions {
    public static <T> T parseSuccessResponseToModel(Response jsonResponse, Class<T> classOfT) {
        String json = jsonResponse.body().asString();
        String prettyJsonString = "";
        try {
            prettyJsonString = new GsonBuilder().setPrettyPrinting().create().toJson(new JsonParser().parse(json));
            if (jsonResponse.getStatusCode() >= 400 && jsonResponse.getStatusCode() < 600) {
                Assert.fail("Endpoint for processing " + classOfT + "\n return error: " + prettyJsonString);
            } else {
                return new Gson().fromJson(prettyJsonString, (Type) classOfT);
            }
        } catch (JsonSyntaxException | IllegalStateException e) {
            Assert.fail("Endpoint for processing " + classOfT + "\n return error: " + prettyJsonString
                    + "\n serialization exception error: " + e.getMessage());
        }
        return null;
    }
}
