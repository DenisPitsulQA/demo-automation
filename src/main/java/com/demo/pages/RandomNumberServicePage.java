package com.demo.pages;

import com.codeborne.selenide.Selenide;
import com.demo.core.base.PageTools;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RandomNumberServicePage extends PageTools {

    private By iframeGenerator = new By.ByXPath("//div[@id='homepage-generator']/iframe");
    private By minNumberInput = new By.ByXPath("//label[contains(text(), 'Min')]//following-sibling::input");
    private By maxNumberInput = new By.ByXPath("//label[contains(text(), 'Max')]//following-sibling::input");
    private By generateBtn = new By.ByXPath("//input[@value='Generate']");
    private By resultNumberSpan = new By.ByXPath("//label[contains(text(), 'Result')]//following-sibling::span/center/span[1]");

    public void enterMinNumber(int minNumber) {
        clearAndType(String.valueOf(minNumber), minNumberInput);
    }

    public void enterMaxNumber(int maxNumber) {
        clearAndType(String.valueOf(maxNumber), maxNumberInput);
    }

    public void clickGenerateBtn() {
        click(generateBtn);
    }

    public String getResultNumber() {
        return getElementText(resultNumberSpan);
    }

    public String generateRandomNumber(int minNumber, int maxNumber) {
        Selenide.switchTo().frame($(iframeGenerator));
        enterMinNumber(minNumber);
        enterMaxNumber(maxNumber);
        clickGenerateBtn();
        return getResultNumber();
    }
}
