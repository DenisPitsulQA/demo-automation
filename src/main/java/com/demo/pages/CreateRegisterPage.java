package com.demo.pages;

import com.demo.core.base.PageTools;
import org.openqa.selenium.By;

public class CreateRegisterPage extends PageTools {
    private By createRegisterButton = new By.ByXPath("//button[contains(text(), 'Create Register')]");
    private By nextButton = new By.ByXPath("//button[contains(text(), 'Next')]");
    private By tryForFree = new By.ByXPath("//button[contains(text(), 'Try For Free')]");
    private By newOrganizationInput = new By.ByXPath("//div[@class='Control-input']/input");
    private By createButton = new By.ByXPath("//div/button[contains(text(), 'Create')]");
    private By clickRegister = new By.ByXPath("//button[@id='register-selection' and contains(text(), 'Test')]");
    private By chooseTestRegister = new By.ByXPath("//button[@id='register-selection']/following::node()[1]/button[contains(text(), 'Test')]");
    private By menuButton = new By.ById("user-profile");
    private By logOutButton = new By.ByXPath("//button[contains(text(),'Logout')]");
    private By registerName = new By.ByXPath("//button[@id='register-selection']");

    public void clickRegisterButton() {
        waitForElementClickable(createRegisterButton);
        click(createRegisterButton);
    }

    public void clickNextButton() {
        waitForElementClickable(nextButton);
        click(nextButton);
    }

    public void clickTryForFreeButton() {
        waitForElementClickable(tryForFree);
        click(tryForFree);
    }

    public void enterNewOrganization(String organizationName) {
        waitForElementVisibility(newOrganizationInput);
        click(newOrganizationInput);
        type(organizationName, newOrganizationInput);
    }

    public boolean isNewOrganizationFieldVisible(){
        return isElementVisible(newOrganizationInput);
    }

    public void clickCreateButton() {
        waitForElementClickable(createButton);
        click(createButton);
    }

    public void clickMenuButton() {
        waitForElementClickable(menuButton);
        click(menuButton);
    }

    public void clickRegisterTestButton() {
        waitForElementClickable(clickRegister);
        click(clickRegister);
    }

    public void chooseTestRegisterTestButton() {
        waitForElementClickable(chooseTestRegister);
        click(chooseTestRegister);
    }

    public void getTestRegisterName() {
        waitForElementClickable(chooseTestRegister);
        click(chooseTestRegister);
    }

    public void clickOnLogoutButton() {
        waitForElementClickable(logOutButton);
        click(logOutButton);
    }

    public String getRegisterName(){
        return getElementText(registerName);
    }
}
