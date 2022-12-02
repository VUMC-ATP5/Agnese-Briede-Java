package lekcijaAstoni.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductsPage extends BasePage {



    private By pageTitle = By.cssSelector("span.title");

    private By linkedinButton = By.cssSelector("li.social_linkedin >a");
    private By cartButton = By.id("shopping_cart_container");

    public ProductsPage(WebDriver browser) {
        super(browser);
    }

    public WebElement getCartButton(){
        wait.until(ExpectedConditions.elementToBeClickable(cartButton));
        return driver.findElement(cartButton);
    }

    public WebElement getLinkedinButton(){
        return driver.findElement(linkedinButton);
    }

}
