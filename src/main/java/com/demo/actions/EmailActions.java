package com.demo.actions;

import com.demo.core.base.BaseActions;
import com.demo.pages.Pages;

public class EmailActions {
    public void verifyEmail(){
        Pages.emailPage().clickOnLetter();
        BaseActions.wait(5);
        Pages.emailPage().clickOnVerify();
    }
}
