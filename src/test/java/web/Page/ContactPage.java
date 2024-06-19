package web.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class ContactPage {
    WebDriver driver;

    By inputEmailContact = By.id("recipient-email");
    By inputNameContact = By.id("recipient-name");
    By inputMessageContact = By.id("message-text");
    By sendMessageButtoon = By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]");

    public ContactPage(WebDriver driver){
        this.driver = driver;
    }

    public void inputContactEmailWith(String email) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(inputEmailContact).sendKeys(email);
    }

    public void inputContactNameWith(String name) {
        driver.findElement(inputNameContact).sendKeys(name);
    }

    public void inputContactMessageWith(String message) {
        driver.findElement(inputMessageContact).sendKeys(message);
    }

    public void clickButton() {
        driver.findElement(sendMessageButtoon).click();
    }

}
