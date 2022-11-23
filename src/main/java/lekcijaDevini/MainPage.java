package lekcijaDevini;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    WebDriver driver;
    WebDriverWait wait;

    public MainPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    private By searchInputField = By.cssSelector("div.b-header-bottom");

    private By signInButton = By.id("fti-header-login");


    public void searchProduct(String productName){
        driver.findElement(searchInputField).sendKeys(productName);

        //to press button on keyboard - tastatur
        driver.findElement(searchInputField).sendKeys(Keys.ENTER);
    }

    public void clickSignInButton(){
        driver.findElement(signInButton).click();
    }

}
