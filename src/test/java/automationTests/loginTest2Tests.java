package automationTests;

import base.baseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class loginTest2Tests extends baseTest {

    @Test
    public void loginError(){
        LoginPage loginPage = landingPage.logIn();
        loginPage.enterEmailAddress("JohnDoe99gmail.com");
        loginPage.enterPassword("SmokeTesting123");
        loginPage.clickSignIn();
        Assert.assertTrue(loginPage.getEmailAuthText().contains("Invalid email address."));
    }
}
