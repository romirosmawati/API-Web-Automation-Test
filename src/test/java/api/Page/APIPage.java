package api.Page;

import api.Util.Constans;
import com.github.javafaker.Faker;
import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;

public class APIPage {
    ValidatableResponse validatableResponse;
    RequestSpecification request;
    int userID = 0;
    Response response;
    Faker faker = new Faker();
    String randomName = faker.name().firstName();
    String randomEmail = randomName + "@mail.com";

    public String baseURL() throws InterruptedException {
        Thread.sleep(3000);
        return Constans.host;
    }

    public String url() throws InterruptedException {
        return baseURL() + "/" + userID;
    }

    public final void setHeadder() {
        request = RestAssured.given()
                .header(Constans.CONTENT_TYPE, Constans.APP_JSON)
                .header(Constans.ACCEPT, Constans.APP_JSON)
                .header(Constans.AUTHORIZATION, Constans.BEARER_TOKEN);
    }

    public void apiGetAllUsers() throws InterruptedException {
        response = RestAssured
                .given().when()
                .get(baseURL());
    }

    public void validateResponseStatus(int status_code) {
        assertThat(response.statusCode()).isEqualTo(status_code);
    }

    public void validateResponseBodyWithJSONSchema(String jsonSchema) {
        String jsonPath = Constans.PATH + jsonSchema;
        File jsonFile = new File(jsonPath);
        response.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonFile));
    }

    public void apiCreateUser() throws InterruptedException {
        JSONObject payload = new JSONObject();
        payload.put(Constans.NAME, randomName);
        payload.put(Constans.EMAIL, randomEmail);
        payload.put(Constans.GENDER, Constans.FEMALE);
        payload.put(Constans.STATUS, Constans.ACTIVE);

        setHeadder();
        response = request.body(payload.toString()).when().post(baseURL());

    }

    public void validateBodyResponse() {
        JsonPath jsonPathEvaluator = response.jsonPath();
        Integer id = jsonPathEvaluator.get("id");
        String name = jsonPathEvaluator.get("name");
        String email = jsonPathEvaluator.get("email");
        String gender = jsonPathEvaluator.get("gender");
        String status = jsonPathEvaluator.get("status");

        assertThat(id).isNotNull();
        assertThat(name).isNotNull();
        assertThat(gender).isNotNull();
        assertThat(email).isNotNull();
        assertThat(status).isNotNull();

        userID = id;
    }

    public void hitAPIGetUserByID() throws InterruptedException {
        response = request.when().get(url());
    }

    public void hitAPIUpdateUser() throws InterruptedException {
        JSONObject payload = new JSONObject();
        payload.put(Constans.NAME, randomName);
        payload.put(Constans.EMAIL, randomEmail);
        payload.put(Constans.GENDER, Constans.FEMALE);
        payload.put(Constans.STATUS, Constans.ACTIVE);

        setHeadder();
        response = request.body(payload.toString()).when().put(url());
    }

    public void hitAPIPatchUser() throws InterruptedException {
        JSONObject payload = new JSONObject();;
        payload.put(Constans.STATUS, Constans.INACTIVE);

        setHeadder();
        response = request.body(payload.toString()).when().patch(url());
    }

    public void hitDeleteUSer() throws InterruptedException {
        setHeadder();
        response = request.when().delete(url());
    }
}
