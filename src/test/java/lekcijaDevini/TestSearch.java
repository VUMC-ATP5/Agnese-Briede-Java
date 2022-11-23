package lekcijaDevini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestSearch extends BaseTest {

    @Test
    public void testSearchFunctionality() throws InterruptedException {

        MainPage mainPage = new MainPage(browser);
        mainPage.searchProduct("apelsīni");
        SearchResultsPage searchResultsPage = new SearchResultsPage(browser);
        List<WebElement> searchResultList = searchResultsPage.getSearchResultCount();
        Assert.assertEquals(searchResultList.size(), 6);

        mainPage.searchProduct("burkāni");
        searchResultList = searchResultsPage.getSearchResultCount();


//        @Test
//        public void testRegistrationWindowClosesCorrectly()throws InterruptedException{
//            MainPage mainPage = new MainPage(browser);
//            wait.until(ExpectedCondition.visibilityOfElementLocated);
//            mainPage.clickSignInButton();
//
//        }


//        MainPage mainPage = new MainPage(browser);
//        mainPage.searchProduct("");
//        Thread.sleep(5000);
    }

}
