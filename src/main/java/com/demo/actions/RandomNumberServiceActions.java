package com.demo.actions;

import com.demo.pages.Pages;

public class RandomNumberServiceActions {

    public String generateRandomNumber(int minNumber, int maxNumber) {
        return Pages.randomNumberServicePage().generateRandomNumber(minNumber, maxNumber);
    }
}
