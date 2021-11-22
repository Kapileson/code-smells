package ui_test_smells.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ui_test_smells.pages.SearchPage;

public class BaseTest {

    static WebDriver webDriver;
    static SearchPage searchPage;

    @BeforeClass
    public static void launchApplication(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.get("https://automationbookstore.dev/");
        //System.getenv("url")
        searchPage = new SearchPage(webDriver);
    }

    @AfterClass
    public static void closeBrowser(){
        webDriver.quit();
    }

    public static WebDriver getWebDriver(){
        return webDriver;
    }
}
