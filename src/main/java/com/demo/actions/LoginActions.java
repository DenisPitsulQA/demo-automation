package com.demo.actions;

import com.demo.core.base.BaseActions;
import com.demo.core.utils.Constants;
import com.demo.entities.User;
import com.demo.pages.Pages;

public class LoginActions extends BaseActions {
    public void login(User user) {
        Pages.createRegisterPage().clickMenuButton();
        Pages.createRegisterPage().clickOnLogoutButton();
        Pages.visitPage().clickOnSignInButton();
        Pages.loginPage().enterUsername(user.getEmail());
        Pages.loginPage().clickOnNextButton();
        Pages.loginPage().enterPassword(Constants.PASSWORD);
        Pages.loginPage().clickOnSignInButton();
        BaseActions.wait(3);
    }
}
