package web.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPage {
    WebDriver driver;

    By loginForm = By.id("logInModal");
    By loginUsername = By.id("loginusername");
    By loginPassword = By.id("loginpassword");
    By loginButton = By.xpath("//button[text()='Log in']");
    By welcomeUserInHomepage = By.id("nameofuser");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void popUpLoginForm() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(loginForm).isDisplayed();
    }

    public void inputUsername(String password) {
        driver.findElement(loginUsername).sendKeys(password);
    }

    public void inputPassword(String password) {
        driver.findElement(loginPassword).sendKeys(password);
    }

    public void loginButton(){
        driver.findElement(loginButton).click();
    }

    public void validateUserLoggedIni(String username) throws InterruptedException {
        Thread.sleep(3000);
        assertEquals("Welcome "+username,driver.findElement(welcomeUserInHomepage).getText());
    }
}
