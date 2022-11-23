package lekcijaDevini;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class BaseTest {
    public WebDriver browser;
    public static WebDriverWait wait;

    @BeforeMethod
    public void setupBrowser() {
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        wait = new WebDriverWait(browser, Duration.of(10, ChronoUnit.SECONDS));
        browser.navigate().to("https://www.barbora.lv/");

    }

    @AfterMethod
    public void tearDownBrowser() {
        browser.quit();

    }
}
