package web.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import web.Util.*;

public class HomePage {
    WebDriver driver = BaseTest.setupDriver();

//    By signUpMenu = By.id("signin2");
    By signUpMenu = By.xpath("//*[@id=\"signin2\"]");
    By loginMenu = By.id("login2");
    By logoutMenu = By.id("logout2");
    By contactMenu = By.xpath("//*[@id=\"navbarExample\"]/ul/li[2]");
    By aboutUsMenu = By.xpath("//*[@id=\"navbarExample\"]/ul/li[3]");
    By aboutUsForm = By.xpath("//*[@id=\"videoModal\"]/div/div");
    By video = By.id("example-video_html5_api");

//    public HomePage(WebDriver driver){
//        this.driver = driver;
//    }

    public void homePage() {
        driver.get("https://www.demoblaze.com/");
    }
    public void signUpMenu(){
        driver.findElement(signUpMenu).click();
    }
    public void loginMenu(){
        driver.findElement(loginMenu).click();
    }
    public void logoutMenu(){
        driver.findElement(logoutMenu).click();
    }
    public void contactMenu(){
        driver.findElement(contactMenu).click();
    }
    public void aboutMenu(){
        driver.findElement(aboutUsMenu).click();
    }

    public void homepagePopUpMessage(String homepagePopUpMessage) throws InterruptedException {
        Thread.sleep(3000);
        assertThat(driver.switchTo().alert().getText()).isEqualTo(homepagePopUpMessage);
        driver.switchTo().alert().accept();
    }

    public void validationUserIsLoggedOut() {
        assertTrue(driver.findElement(loginMenu).isDisplayed());
        assertTrue(driver.findElement(signUpMenu).isDisplayed());
    }

    public void validationAboutUsForm() throws InterruptedException {
        Thread.sleep(3000);
        assertTrue(driver.findElement(aboutUsForm).isDisplayed());
    }

    public void playVideo() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].play();",  driver.findElement(video));
        Thread.sleep(4000);
        Boolean isPlaying = (Boolean) js.executeScript(
                "return arguments[0].currentTime > 0 && !arguments[0].paused " +
                        "&& !arguments[0].ended && arguments[0].readyState > 2;",
                driver.findElement(video));
        assertTrue(isPlaying);
    }

}
