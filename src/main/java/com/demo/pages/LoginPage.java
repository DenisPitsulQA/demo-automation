package com.demo.pages;

import com.demo.core.base.PageTools;
import org.openqa.selenium.By;

public class LoginPage extends PageTools {
    private By usernameInput = new By.ById("Username");
    private By passwordInput = new By.ById("Password");
    private By signInButton = new By.ByXPath("//div[contains(@class, 'mt-3')]/button");
    private By nextButton = new By.ByXPath("//div[contains(@class, 'mt-3')]/button[contains(text(), 'Next')]");

    public void enterUsername(String username) {
        waitForElementVisibility(usernameInput);
        type(username, usernameInput);
    }

    public void enterPassword(String password) {
        waitForElementVisibility(passwordInput);
        type(password, passwordInput);
    }

    public void clickOnSignInButton() {

        waitForElementClickable(signInButton);
        click(signInButton);
    }

    public void clickOnNextButton() {
        waitForElementClickable(nextButton);
        click(nextButton);
    }
}
