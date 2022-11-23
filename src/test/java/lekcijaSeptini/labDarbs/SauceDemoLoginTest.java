package lekcijaSeptini.labDarbs;

import lekcijaAstoni.pageObjects.LoginPage;
import lekcijaAstoni.pageObjects.ProductsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SauceDemoLoginTest extends BaseTest {

    @Test
    public void testLoginPageObjectExample(){
        LoginPage loginPage = new LoginPage(browser);
        loginPage.getPasswordField().sendKeys("secret_sauce");
        loginPage.getUsernameField().sendKeys("asdasada");
        loginPage.getLoginButton().click();
        Assert.assertEquals(loginPage.getErrorText(),"Epic sadface: Username and password do not match any user in this service");

    }

    @Test
    public void testLoginEmptyUsernameAndPassword() throws InterruptedException {
        WebElement usernameInputField = browser.findElement(By.id("user-name"));
        usernameInputField.sendKeys("username");

        WebElement passwordInputField = browser.findElement(By.id("password"));
        passwordInputField.sendKeys("password");

        WebElement loginButton = browser.findElement(By.id("login-button"));
        loginButton.click();

        WebElement errorTextField= browser.findElement(By.cssSelector("div.error-message-container h3 "));

        String errorText=errorTextField.getText();
        Assert.assertEquals(errorText,"Epic sadface: Username and password do not match any user in this service");

        //TDD - Test driven development

        Thread.sleep(5000);

    }

    @Test
    public void testLoginWrongUsernameAndPassword() {
        testLogin("jkfjkfjfk", "jkdjkjdkljdl", "Epic sadface: Username and password do not match any user in this service");

    }

    @Test
    public void testLoginEmptyUsernameFilledPassword(){
        testLogin("","jfkjfkjf", "Epic sadface: Username is required");
    }

    @Test
    public void testLoginFilledUsernameEmptyPassword(){
        testLogin("fjkjfkjfk", "", "Epic sadface: Password is required");
    }

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = new LoginPage(browser);
        loginPage.login("standard_user", "secret_sauce");
        ProductsPage productsPage = new ProductsPage(browser);
        Assert.assertEquals(productsPage.getPageTitle().getText(),"PRODUCTS");

    }




    //vienkaarsi metode
    private void testLogin(String username, String password, String expectedErrorMessage){

        WebElement usernameInputField = browser.findElement(By.id("user-name"));
        usernameInputField.sendKeys(username);

        WebElement passwordInputField = browser.findElement(By.id("password"));
        passwordInputField.sendKeys(password);

        WebElement loginButton = browser.findElement(By.id("login-button"));
        loginButton.click();

        WebElement errorTextField= browser.findElement(By.cssSelector("div.error-message-container h3 "));

        String errorText=errorTextField.getText();
        Assert.assertEquals(errorText,expectedErrorMessage);

    }

}
