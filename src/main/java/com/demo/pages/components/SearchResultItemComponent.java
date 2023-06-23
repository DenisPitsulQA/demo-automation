package com.demo.pages.components;

import com.codeborne.selenide.SelenideElement;
import com.demo.core.base.ComponentsTools;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class SearchResultItemComponent extends ComponentsTools {

    private String bestSellerElemListXPath = "//span[text()='Best Seller']";
    private String nameElemXPath = "//h2//span";
    private String authorElemXPath = "//span[contains(text(), 'by')]//following-sibling::*[1]";
    private String priceElemListXPath = "//span[@class='a-price']";

    public SearchResultItemComponent(String baseXPath) {
        super(baseXPath);
    }

    @Step("Check if book is best seller")
    public boolean isBestSeller() {
        return isElementVisible(new By.ByXPath(baseXPath + bestSellerElemListXPath));
    }

    @Step("Get book name")
    public String getBookName() {
        return getElementText(new By.ByXPath(baseXPath + nameElemXPath));
    }

    @Step("Get book author")
    public String getAuthor() {
        return getElementText(new By.ByXPath(baseXPath + authorElemXPath));
    }

    @Step("Get book prices")
    public List<String> getPrices() {
        List<SelenideElement> priceSelenideElements = getElementsWithZeroOption(new By.ByXPath(baseXPath + priceElemListXPath));
        List<String> prices = new ArrayList<>();
        for (SelenideElement priceElem: priceSelenideElements) {
            String[] priceArray = priceElem.getText().split("\n");
            String dollar = priceArray[0];
            String cent = priceArray[1];
            String price = dollar + "." + cent;
            prices.add(price);
        }
        return prices;
    }
}
