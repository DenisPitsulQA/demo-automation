package com.demo.login;

import com.demo.actions.Actions;
import com.demo.core.base.BaseActions;
import com.demo.core.base.BaseTest;
import com.demo.entities.User;
import com.demo.pages.Pages;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.demo.core.utils.SelenideTools.getDriver;

public class AddingAnAssetGroupFromATemplateTest extends BaseTest {
    User user = new User().setDefaultData();

    @Test(testName = "Adding an asset group from a template test")
    public void creationOfAnApplicationAndIssuanceOfComprehensive4in1ContractTest() {
        getDriver().navigate().to("https://10minutemail.org");
        user.setEmail(Pages.emailPage().getEmail());
        getDriver().navigate().to("https://dev.asset.accountant");
        Actions.registrationActions().registrationOfNewUser(user);
        getDriver().navigate().to("https://10minutemail.org");
        Actions.emailActions().verifyEmail();
        getDriver().switchTo().window(getDriver().getWindowHandle());
        getDriver().navigate().to("https://dev.asset.accountant");
        Actions.loginActions().login(user);
        BaseActions.wait(10);
        Assert.assertTrue(Pages.createRegisterPage().isNewOrganizationFieldVisible(),
                "After login field to enter new organization name invisible");
        Actions.createRegisterActions().createNewRegister();
        BaseActions.wait(10);
        Assert.assertEquals(Pages.createRegisterPage().getRegisterName(), "Test",
                "Register is created incorrectly");
        Actions.assetActions().createAssetsForTemplate();
        Assert.assertEquals(Pages.assetPage().countOfRowInList(),2,"The asset was not created");

    }
}
