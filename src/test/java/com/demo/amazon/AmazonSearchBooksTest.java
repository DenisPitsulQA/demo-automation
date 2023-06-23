package com.demo.amazon;

import com.demo.actions.Actions;
import com.demo.core.base.BaseTest;
import com.demo.entities.Book;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static com.demo.core.utils.SelenideTools.getDriver;

public class AmazonSearchBooksTest extends BaseTest {

    public static final String CATEGORY = "Books";
    public static final String SEARCH_TEXT = "Java";

    @Test
    public void searchBooksTest() {
        getDriver().navigate().to("https://www.amazon.com/Head-First-Java-Brain-Friendly-Guide/dp/1491910771/ref=sr_1_1?crid=EQ34NL3OAO7Y&keywords=Java&qid=1687419850&s=books&sprefix=jav%2Cstripbooks-intl-ship%2C604&sr=1-1");
        Book book = Actions.amazonProductDetailsActions().getBook();

        getDriver().navigate().to("https://www.amazon.com/");
        List<Book> bookList = Actions.amazonSearchBooksActions().searchBooks(CATEGORY, SEARCH_TEXT);

        Assert.assertTrue(bookList.contains(book), book.getName() + " was not found on search results page.");
    }
}
