package lekcijaAstoni.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage{


    private By pageTitleLocator = By.className("title");
    private By continueButton = By.id("continue");

    private By firstNameInputField = By.id("first-name");

    private By errorText = By.cssSelector("h3");


    //metoode, kas uzreiz nospiež continue button, tad kad klikshcinam, neko nevajag atgriezt
    public void clickContinueButton(){
        driver.findElement(continueButton).click();
    }

    public String getErrorText(){
        return driver.findElement(errorText).getText();
    }

    public void inputFirstName(String name){
        driver.findElement(firstNameInputField).sendKeys(name);
    }

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }
}
