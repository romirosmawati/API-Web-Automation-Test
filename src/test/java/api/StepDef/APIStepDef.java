package api.StepDef;

import api.Page.APIPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class APIStepDef {
    APIPage apiPage;

    public APIStepDef() {
        this.apiPage = new APIPage();
    }

    @Given("prepare url")
    public String prepareUrlFor() throws InterruptedException {
        return apiPage.url();
    }

    @And("hit api to get all users")
    public void hitApiToGetAllUsers() throws InterruptedException {
        apiPage.apiGetAllUsers();
    }

    @Then("validation status code is equal to {int}")
    public void validationStatusCodeIsEqualTo(int statusCode) {
        apiPage.validateResponseStatus(statusCode);
    }


    @Then("validation response json with JSONSchema {string}")
    public void validationResponseJsonWithJSONSchema(String jsonSchema) {
        apiPage.validateResponseBodyWithJSONSchema(jsonSchema);
    }

    @And("hit api post create new user")
    public void hitApiPostCreateNewUser() throws InterruptedException {
        apiPage.apiCreateUser();
    }

    @Then("validation response body post for get user ID")
    public void validationResponseBodyPostCreateNewUser() {
        apiPage.validateBodyResponse();
    }

    @Then("prepare url for get user by ID")
    public void prepareValidUrlFor() throws InterruptedException {
        apiPage.url();
    }

    @And("hit api get user by id")
    public void hitApiGetUserById() throws InterruptedException {
        apiPage.hitAPIGetUserByID();
    }

    @And("hit api to update data user by user ID")
    public void hitApiToUpdateDataUseerByUserID() throws InterruptedException {
        apiPage.hitAPIUpdateUser();
    }

    @And("hit api to patch data user by user ID")
    public void hitApiToPatchDataUserByUserID() throws InterruptedException {
        apiPage.hitAPIPatchUser();
    }

    @And("hit api delete user")
    public void hitApiDeleteUser() throws InterruptedException {
        apiPage.hitDeleteUSer();
    }
}
