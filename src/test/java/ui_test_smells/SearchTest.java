package ui_test_smells;

import base.BaseTest;
import org.junit.Test;
import ui_test_smells.pages.SearchPage;
import ui_test_smells.utils.PropertyFileHandler;

import static org.junit.Assert.assertTrue;

public class SearchTest extends BaseTest {

    @Test
    public void testSearchForTitle(){
        SearchPage searchPage = new SearchPage(driver);
        String title = "Java For Testers";
        //PropertyFileHandler.getValue("book_title")
        searchPage.search(title);
        searchPage.checkBookVisible(title);
    }
}
