package lekcijaAstoni;

import lekcijaAstoni.pageObjects.CartPage;
import lekcijaAstoni.pageObjects.CheckoutPage;
import lekcijaAstoni.pageObjects.LoginPage;
import lekcijaAstoni.pageObjects.ProductsPage;
import lekcijaSeptini.labDarbs.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Base64;

public class TestScenarijsDivi extends BaseTest {

    @Test

    public void testCheckoutPageMandatoryFields() throws InterruptedException {
        System.out.println("1. Navigēt uz saiti https://www.saucedemo.com/");

        System.out.println("2. Ielogoties ar pareizu lietotāja vārdu/paroli");
        LoginPage loginPage = new LoginPage(browser);
        ProductsPage productPage = new ProductsPage(browser);
        loginPage.login("standard_user","secret_sauce");
        Assert.assertEquals(productPage.getPageTitle().getText(), "PRODUCTS");

        System.out.println("3. Doties uz grozu");
        CartPage cartPage = new CartPage(browser);
        productPage.getCartButton().click();
        Assert.assertEquals(cartPage.getPageTitle().getText(),"YOUR CART");

        System.out.println("4. Doties uz Checkout");
        cartPage.getCheckoutButton().click();

        System.out.println("5. Pārbaudīt vai FirstName/LastName/Zip code ir obligaats");

        //taisam checkout lapu, jo mums taas veel nav
        CheckoutPage checkoutPage = new CheckoutPage(browser);
        Assert.assertEquals(checkoutPage.getPageTitle().getText(),"CHECKOUT: YOUR INFORMATION");
        checkoutPage.clickContinueButton();

        Assert.assertEquals(checkoutPage.getErrorText(), "Error: First Name is required");

        checkoutPage.inputFirstName("Agnese");
        checkoutPage.clickContinueButton();
        Assert.assertEquals(checkoutPage.getErrorText(), "Error: Last Name is required");




        Thread.sleep(5000);

    }
}
