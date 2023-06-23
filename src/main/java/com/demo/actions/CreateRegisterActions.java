package com.demo.actions;

import com.demo.core.base.BaseActions;
import com.demo.pages.Pages;

public class CreateRegisterActions extends BaseActions {
    public void createNewRegister(){
        String organizationName = "Test";
        Pages.createRegisterPage().enterNewOrganization(organizationName);
        Pages.createRegisterPage().clickCreateButton();
        Pages.createRegisterPage().clickRegisterButton();
        Pages.createRegisterPage().clickNextButton();
        Pages.createRegisterPage().clickTryForFreeButton();
        Pages.createRegisterPage().clickRegisterTestButton();
        Pages.createRegisterPage().chooseTestRegisterTestButton();
    }
}
