package com.demo.pages;

import com.codeborne.selenide.SelenideElement;
import com.demo.core.base.PageTools;
import com.demo.entities.Book;
import com.demo.pages.components.SearchResultItemComponent;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class AmazonSearchResultsPage extends PageTools {

    private List<SearchResultItemComponent> searchResultItemComponentList;

    private String searchResultItemsXPath = "//span[@data-component-type='s-search-results']//div[@data-component-type='s-search-result']";

    public AmazonSearchResultsPage() {
        List<SelenideElement> searchResultItems = getElements(new By.ByXPath(searchResultItemsXPath));
        searchResultItemComponentList = new ArrayList<>();
        for (int i = 1; i <= searchResultItems.size(); i++) {
            searchResultItemComponentList.add(new SearchResultItemComponent(searchResultItemsXPath + "[" + i + "]"));
        }
    }

    public List<Book> getBookList() {
        List<Book> bookList = new ArrayList<>();
        for (SearchResultItemComponent searchResultItemComponent: searchResultItemComponentList) {
            boolean isBestSeller = searchResultItemComponent.isBestSeller();
            String bookName = searchResultItemComponent.getBookName();
            String author = searchResultItemComponent.getAuthor();
            List<String> prices = searchResultItemComponent.getPrices();
            Book book = new Book(isBestSeller, bookName, author, prices);
            bookList.add(book);
        }
        return bookList;
    }
}
