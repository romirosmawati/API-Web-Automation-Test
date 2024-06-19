package web.StepDef;

import web.Page.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.Util.BaseTest;

public class WebHomePageStepDef extends BaseTest {
    HomePage homePage;

    public WebHomePageStepDef(){
        this.homePage = new HomePage();
    }

    @Given("user is on home page")
    public void userIsOnHomePage() {
//        homePage = new HomePage(driver);
        homePage.homePage();
    }

    @When("user click Sign Up menu")
    public void userClickSignUpMenu() {
        homePage.signUpMenu();
    }

    @When("user click Log In menu")
    public void userClickLogInMenu() {
        homePage.loginMenu();
    }

    @Then("user get alert {string}")
    public void userGetAlert(String msg) throws InterruptedException {
        homePage.homepagePopUpMessage(msg);
    }

    @Then("user is logged out")
    public void userIsLoggedOut() {
        homePage.validationUserIsLoggedOut();
    }

    @Then("user click Log Out menu")
    public void userClickLogOutMenu() {
        homePage.logoutMenu();
    }
    @Then("user click Contact menu")
    public void userClickContactMenu() {
        homePage.contactMenu();
    }

    @When("user click About us menu")
    public void userClickAboutUsMenu() {
        homePage.aboutMenu();
    }

    @Then("user see About us modal")
    public void userSeeAboutUsModal() throws InterruptedException {
        homePage.validationAboutUsForm();
    }

    @And("user play the video")
    public void userPlayTheVideo() throws InterruptedException {
        homePage.playVideo();
    }
}
