package com.demo.pages.components;

import com.codeborne.selenide.SelenideElement;
import com.demo.core.base.ComponentsTools;
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
    public boolean isBestSeller() {
        return isElementVisible(new By.ByXPath(baseXPath + bestSellerElemListXPath));
    }

    public String getBookName() {
        return getElementText(new By.ByXPath(baseXPath + nameElemXPath));
    }

    public String getAuthor() {
        return getElementText(new By.ByXPath(baseXPath + authorElemXPath));
    }

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
