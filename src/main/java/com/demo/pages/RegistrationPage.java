package com.demo.pages;


import com.demo.core.base.PageTools;
import org.openqa.selenium.By;

public class RegistrationPage extends PageTools {
    private By firstNameInput = new By.ById("FirstName");
    private By lastNameInput = new By.ById("LastName");
    private By emailAddressInput = new By.ById("Email");
    private By phoneNumberInput = new By.ById("PhoneNumber");
    private By passwordInput = new By.ById("Password");
    private By confirmPasswordInput = new By.ById("ConfirmPassword");
    private By registrationButton = new By.ByXPath("//div[contains(@class, 'mt-3')]/button");
    private By confirmButton = new By.ByXPath("//div[@class = ' mt-3']/a");

    public void enterFirstName(String firstName) {
        waitForElementVisibility(firstNameInput);
        type(firstName, firstNameInput);
    }

    public void enterLastName(String lastName) {
        waitForElementVisibility(lastNameInput);
        type(lastName, lastNameInput);
    }

    public void enterEmailAddress(String emailAddress) {
        waitForElementVisibility(emailAddressInput);
        type(emailAddress, emailAddressInput);
    }

    public void enterPhoneNumber(String phoneNumber) {
        waitForElementVisibility(phoneNumberInput);
        type(phoneNumber, phoneNumberInput);
    }

    public void enterPassword(String password) {
        waitForElementVisibility(passwordInput);
        type(password, passwordInput);
    }

    public void enterConfirmPassword(String confirmPassword) {
        waitForElementVisibility(confirmPasswordInput);
        type(confirmPassword, confirmPasswordInput);
    }

    public void clickRegisterButton() {
        scrollToElement(registrationButton);
        waitForElementClickable(registrationButton);
        click(registrationButton);
    }

    public void clickConfirmButton() {
        waitForElementClickable(confirmButton);
        click(confirmButton);
    }
}
