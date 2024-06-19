package web.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import web.Page.ContactPage;
import web.Util.BaseTest;

public class WebContactStepDef extends BaseTest {
    ContactPage contactPage;

    @And("user input contact email with {string}")
    public void userInputContactEmailWith(String email) throws InterruptedException {
        contactPage = new ContactPage(driver);
        contactPage.inputContactEmailWith(email);
    }

    @And("user input contact name with {string}")
    public void userInputContactNameWith(String name) {
        contactPage.inputContactNameWith(name);
    }

    @And("user input contact message with {string}")
    public void userInputContactMessageWith(String mssg) {
        contactPage.inputContactMessageWith(mssg);
    }

    @When("user click Send Message button")
    public void userClickSendMessageButton() {
        contactPage.clickButton();
    }
}
