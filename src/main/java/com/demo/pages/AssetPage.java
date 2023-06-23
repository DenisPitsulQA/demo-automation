package com.demo.pages;


import com.demo.core.base.PageTools;
import org.openqa.selenium.By;

public class AssetPage extends PageTools {
    private By assetButton = new By.ByXPath("//div/a[contains(text(), 'Assets')]");
    private By assetsForTemplateButton = new By.ByXPath("//div/a[contains(text(), 'Create Asset Group (from template)')]");
    private By assetGroupForTemplateBuildingButton = new By.ByXPath("//input[@id='check[0]']/following::node()[1]");
    private By saveButton = new By.ByXPath("//button[contains(text(), 'Save')]");
    private By exitButton = new By.ByXPath("//div/a[contains(text(), 'Exit')]");
    private By listOfAssets = new By.ByXPath("//div[@ref='leftContainer']/child::node()");

    public void clickAssetsButton() {
        waitForElementClickable(assetButton);
        click(assetButton);
    }

    public void clickAssetsForTemplateButton() {
        waitForElementClickable(assetsForTemplateButton);
        click(assetsForTemplateButton);
    }

    public void clickAssetGroupForTemplateBuildingCheckBox() {
        waitForElementClickable(assetGroupForTemplateBuildingButton);
        click(assetGroupForTemplateBuildingButton);
    }

    public void clickSaveButton() {
        waitForElementClickable(saveButton);
        click(saveButton);
    }

    public void clickExitButton() {
        waitForElementClickable(exitButton);
        click(exitButton);
    }

    public int countOfRowInList(){
        return getElements(listOfAssets).size();
    }
}
