package lekcijaSeptini.labDarbs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceDemoProductsTest extends BaseTest{

    @Test
    public void testAddProductToCart() throws InterruptedException {
        WebElement usernameInputField = browser.findElement(By.id("user-name"));
        usernameInputField.sendKeys("standard_user");

        WebElement passwordInputField = browser.findElement(By.id("password"));
        passwordInputField.sendKeys("secret_sauce");

        WebElement loginButton = browser.findElement(By.id("login-button"));
        loginButton.click();

        WebElement productPageTitle=browser.findElement(By.cssSelector("span.title"));
        String actualProductPageTitle=productPageTitle.getText();
        Assert.assertEquals(actualProductPageTitle,"PRODUCTS");

        Thread.sleep(5000);
    }

}
