package com.demo.pages;


import com.demo.core.base.PageTools;
import org.openqa.selenium.By;

public class EmailPage extends PageTools {
    private By emailAddressText = new By.ById("fe_text");
    private By clickOnLetter = new By.ByXPath("//table[@id='maillist']//a[contains(text(),'AssetAccountant')]");
    private By verifyEmailHref = new By.ByXPath("//a[text()='Verify Email']");

    public String getEmail(){
        return getElementAttributeValue("value",emailAddressText);
    }

    public void clickOnLetter(){
        scrollToElement(clickOnLetter);
        waitForElementClickable(clickOnLetter);
        click (clickOnLetter);
    }

    public void clickOnVerify(){
        scrollToElement(verifyEmailHref);
        waitForElementClickable(verifyEmailHref);
        click(verifyEmailHref);
    }
}
