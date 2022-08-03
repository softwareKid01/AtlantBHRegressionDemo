package automationTests;

import base.baseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class loginTest3Tests extends baseTest {

    @Test
    public void loginError(){
        LoginPage loginPage = landingPage.logIn();
        loginPage.enterEmailAddress("");
        loginPage.enterPassword("");
        loginPage.clickSignIn();
        Assert.assertTrue(loginPage.getBlankAuthText().contains("An email address required."));
    }
}
