package com.demo.pages;

import com.demo.core.base.PageTools;
import com.demo.entities.Book;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class AmazonProductDetailPage extends PageTools {

    private By productNameElem = new By.ByXPath("//span[@id='productTitle']");
    private By authorElem = new By.ByXPath("//span[contains(@class, 'author')]/a");
    private By bestSellerElemList = new By.ByXPath("//*[text()='#1 Best Seller']");


    @Step("Check if book on product details page is best seller")
    public boolean isBestSeller() {
        return isElementVisible(bestSellerElemList);
    }

    @Step("Get book name on product details page")
    public String getBookName() {
        return getElementText(productNameElem);
    }

    @Step("Get book author on product details page")
    public String getAuthor() {
        return getElementText(authorElem);
    }

    @Step("Get book object on product details page")
    public Book getBook() {
        return new Book(isBestSeller(), getBookName(), getAuthor());
    }
}
