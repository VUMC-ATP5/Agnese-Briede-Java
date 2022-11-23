package lekcijaSeptini.labDarbs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstSeleniumTest extends BaseTest {



    @Test
    public void testFirstWebPage(){
        System.out.println("Pirmais Selenium tests");


    }

    @Test
    public void testPageTitle(){

        String title = browser.getTitle();
        Assert.assertEquals(title,"Latvijas Universitāte");
    }

    @Test

    public void testRandom(){

    }

}
