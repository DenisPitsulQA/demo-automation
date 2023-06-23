package com.demo.actions;

import com.demo.entities.Book;
import com.demo.pages.Pages;

import java.util.List;

public class AmazonSearchBooksActions {

    public List<Book> searchBooks(String categoryValue, String searchText) {
        return Pages.amazonHomePage()
                .getHeader()
                .searchItemWithCategory(categoryValue, searchText)
                .getBookList();
    }
}
