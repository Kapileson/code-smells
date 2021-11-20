package ui_test_smells;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import ui_test_smells.pages.SearchPage;
import ui_test_smells.utils.PropertyFileHandler;

public class SearchTest extends BaseTest{

    WebDriver driver;
    SearchPage page;

    public SearchTest(){
        driver = getWebDriver();
        page = new SearchPage(driver);
    }

    @Test
    public void testSearchForTitle(){
        String title = PropertyFileHandler.getValue("book_title");
        page.search(title);
        page.checkIsBookVisible(title);
    }

}