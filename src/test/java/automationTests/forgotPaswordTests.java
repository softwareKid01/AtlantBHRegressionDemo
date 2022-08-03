package automationTests;

import base.baseTest;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.LoginPage;

public class forgotPaswordTests extends baseTest {
    @Test
    public void forgotPassword(){
       LoginPage loginPage = landingPage.logIn();
       ForgotPasswordPage forgotPasswordPage = loginPage.clickForgotPassword();
       forgotPasswordPage.enterEmailField("tarikdedic18@gmail.com");
       forgotPasswordPage.retrievePasswordButton();
    }
}
