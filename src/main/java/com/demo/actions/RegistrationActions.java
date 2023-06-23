package com.demo.actions;

import com.demo.core.base.BaseActions;
import com.demo.core.utils.Constants;
import com.demo.entities.User;
import com.demo.pages.Pages;

public class RegistrationActions extends BaseActions {

    public void registrationOfNewUser(User user){
        Pages.visitPage().clickOnRegistrationButton();
        Actions.registrationActions().fulfilRegistrationFields(user);
    }

    public void fulfilRegistrationFields(User user){
        Pages.registrationPage().enterFirstName(user.getFirstName());
        Pages.registrationPage().enterLastName(user.getLastName());
        Pages.registrationPage().enterEmailAddress(user.getEmail());
        Pages.registrationPage().enterPhoneNumber(user.getPhoneNumber());
        Pages.registrationPage().enterPassword(Constants.PASSWORD);
//        Pages.registrationPage().enterConfirmPassword(Constants.PASSWORD);
        Pages.registrationPage().clickRegisterButton();
        BaseActions.wait(5);
        Pages.registrationPage().clickConfirmButton();
    }
}
