package ui_test_smells.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class SearchPage {
    WebDriver driver;
    WebDriverWait wait;
    By searchBar = By.id("searchBar");
    By visibleBooks = By.cssSelector("li:not(.ui-screen-hidden)");

    public SearchPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 5);
    }

    public WebElement findAndGetWebElement(By by){
        return driver.findElement(by);
    }

    public List<WebElement> findAndGetWebElements(By by){
        return driver.findElements(by);
    }

    public void search(String text){
        findAndGetWebElement(searchBar).clear();
        findAndGetWebElement(searchBar).sendKeys(text);
        //wait.until(ExpectedConditions.visibilityOf(findAndGetWebElement(visibleBooks)));
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void checkBookVisible(String title){
        boolean isBookVisible = false;

        List<WebElement> books = findAndGetWebElements(visibleBooks);
        for(WebElement book : books){
            String titleId = book.getAttribute("id") + "_title";
            String bookTitle = book.findElement(By.id(titleId)).getText().trim();

            if(title.equalsIgnoreCase(bookTitle)){
                isBookVisible = true;
            }
        }
        assertTrue(title+ " not found", isBookVisible);
    }
}
