package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected static WebDriver driver;

    @BeforeClass
    public static void launchApplication(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://automationbookstore.dev/");
        //System.getenv("url")
    }

    @AfterClass
    public static void closeBrowser(){
        driver.close();
    }
}
