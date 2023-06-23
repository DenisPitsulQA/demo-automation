package com.demo.pages;

import com.demo.core.base.PageTools;
import com.demo.entities.Book;
import org.openqa.selenium.By;

public class AmazonProductDetailPage extends PageTools {

    private By productNameElem = new By.ByXPath("//span[@id='productTitle']");
    private By authorElem = new By.ByXPath("//span[contains(@class, 'author')]/a");
    private By bestSellerElemList = new By.ByXPath("//*[text()='#1 Best Seller']");

    public boolean isBestSeller() {
        return isElementVisible(bestSellerElemList);
    }

    public String getBookName() {
        return getElementText(productNameElem);
    }

    public String getAuthor() {
        return getElementText(authorElem);
    }

    public Book getBook() {
        return new Book(isBestSeller(), getBookName(), getAuthor());
    }
}
