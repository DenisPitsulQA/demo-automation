package com.demo.actions;


import com.demo.core.base.BaseActions;
import com.demo.pages.Pages;

public class AssetActions {
    public void createAssetsForTemplate(){
        Pages.assetPage().clickAssetsButton();
        Pages.assetPage().clickAssetsForTemplateButton();
        Pages.assetPage().clickAssetGroupForTemplateBuildingCheckBox();
        Pages.assetPage().clickSaveButton();
        Pages.assetPage().clickExitButton();
        BaseActions.wait(5);
    }
}
