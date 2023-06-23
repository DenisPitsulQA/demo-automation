package com.demo.pages;

import com.demo.core.base.PageTools;
import org.openqa.selenium.By;

public class VisitPage extends PageTools {

    private By registrationButton = new By.ByXPath("//a[contains(@class, 'Login-create')]");
    private By loginButton = new By.ByXPath("//summary[contains(@class, 'Login-heading')]");

    public void clickOnRegistrationButton() {
        waitForElementVisibility(registrationButton);
        waitForElementClickable(registrationButton);
        click(registrationButton);
    }

    public void clickOnSignInButton() {
        waitForElementVisibility(loginButton);
        waitForElementClickable(loginButton);
        click(loginButton);
    }

}
