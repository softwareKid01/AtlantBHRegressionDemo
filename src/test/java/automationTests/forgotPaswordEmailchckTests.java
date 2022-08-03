package automationTests;

import base.baseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.LoginPage;

public class forgotPaswordEmailchckTests extends baseTest {
    @Test
    public void forgotPassword(){
       LoginPage loginPage = landingPage.logIn();
       ForgotPasswordPage forgotPasswordPage = loginPage.clickForgotPassword();
       forgotPasswordPage.enterEmailField("tarikdedic18vrata.com");
       forgotPasswordPage.retrievePasswordButton();
        Assert.assertTrue(forgotPasswordPage.errorShown());
    }
}
