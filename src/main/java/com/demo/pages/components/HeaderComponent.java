package com.demo.pages.components;

import com.demo.core.base.ComponentsTools;
import com.demo.pages.AmazonSearchResultsPage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class HeaderComponent extends ComponentsTools {
    private String searchCategoryElemXPath = "//select";
    private String searchCategoryOptionElemXPath = "//option[text()='%s']";
    private String searchInputXpath = "//input[@id='twotabsearchtextbox']";
    private String searchBtn = "//input[@id='nav-search-submit-button']";

    public HeaderComponent(String baseXPath) {
        super(baseXPath);
    }

    @Step("Select search category '{category}'")
    public void selectCategory(String category) {
        clickIfExist(new By.ByXPath(baseXPath + searchCategoryElemXPath));
        clickIfExist(new By.ByXPath(baseXPath + String.format(searchCategoryOptionElemXPath, category)));
    }

    @Step("Type search text '{searchText}' and click search button")
    public void search(String searchText) {
        waitForElementClickable(new By.ByXPath(baseXPath + searchInputXpath));
        type(searchText, new By.ByXPath(baseXPath + searchInputXpath));
        click(new By.ByXPath(baseXPath + searchBtn));
    }

    @Step("Search '{searchText}' with category '{categoryValue}'")
    public AmazonSearchResultsPage searchItemWithCategory(String categoryValue, String searchText) {
        selectCategory(categoryValue);
        search(searchText);
        return new AmazonSearchResultsPage();
    }
}
