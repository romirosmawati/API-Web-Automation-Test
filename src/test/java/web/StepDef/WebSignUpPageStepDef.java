package web.StepDef;

import org.openqa.selenium.WebDriver;
import web.Page.SignUpPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.Util.BaseTest;

public class WebSignUpPageStepDef extends BaseTest {
    SignUpPage signUpPage;

    @Then("user see sign up form")
    public void userSeeSignUpForm() {
        signUpPage = new SignUpPage(driver);
        signUpPage.popUpSignUpForm();
    }

    @And("user input username in sign up form")
    public void userInputUsername() {
        signUpPage.inputUsername();
    }

    @And("user input password in sign up form")
    public void userInputPassword() {
        signUpPage.inputPassword();
    }

    @When("user click Sign Up button")
    public void userClickSignUpButton() {
        signUpPage.signUpButton();
    }


    @And("user input password with {string} in sign up form")
    public void userInputPasswordWith(String pass) {
        signUpPage.inputPassword(pass);
    }

    @And("user input username with {string} in sign up form")
    public void userInputUsernameWith(String username) {
        signUpPage.inputUsername(username);
    }
}
