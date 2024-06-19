package web.Page;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class SignUpPage {
    WebDriver driver;
    Faker faker = new Faker();
    String randomName = faker.name().username();
    String username = null;

    By inputUsername = By.id("sign-username");
    By inputPassword = By.id("sign-password");
    By signUpForm = By.id("signInModal");
    By signUpButton = By.xpath("//button[text()='Sign up']");

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void popUpSignUpForm()  {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(signUpForm).isDisplayed();
    }

    public void inputUsername(){
        username = randomName;
        driver.findElement(inputUsername).sendKeys(username);
    }

    public void inputPassword() {
        driver.findElement(inputPassword).sendKeys(username);
    }

    public void inputPassword(String password) {
        driver.findElement(inputPassword).sendKeys(password);
    }

    public void signUpButton(){
        driver.findElement(signUpButton).click();
    }

    public void inputUsername(String username){
        driver.findElement(inputUsername).sendKeys(username);
    }


}
