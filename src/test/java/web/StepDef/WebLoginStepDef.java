package web.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.Page.LoginPage;
import web.Util.BaseTest;

public class WebLoginStepDef extends BaseTest {
    LoginPage loginPage;

    @Then("user see login form")
    public void userSeeLoginForm() throws InterruptedException {
        loginPage = new LoginPage(driver);
        loginPage.popUpLoginForm();
    }

    @When("user click Log in button")
    public void userClickLogInButton() {
        loginPage.loginButton();
    }

    @And("user input username with {string} in login form")
    public void userInputUsernameWithInLoginForm(String username) {
        loginPage.inputUsername(username);
    }

    @And("user input password with {string} in login form")
    public void userInputPasswordWithInLoginForm(String pass) {
        loginPage.inputPassword(pass);
    }

    @Then("user is logged in with name {string}")
    public void userIsLoggedInWithName(String username) throws InterruptedException {
        loginPage.validateUserLoggedIni(username);
    }
}
