package com.demo.actions;

import com.demo.entities.Book;
import com.demo.pages.Pages;

public class AmazonProductDetailsActions {

    public Book getBook() {
        return Pages.amazonProductDetailPage().getBook();
    }
}
