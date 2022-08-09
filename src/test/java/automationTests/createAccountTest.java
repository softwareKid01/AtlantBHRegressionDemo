package automationTests;

import base.baseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class createAccountTest extends baseTest {
    @Test
    public void cantCreateAccount(){
       LoginPage loginPage = landingPage.logIn();
       loginPage.createAccountEmailField("JohnDoe99gmail.com");
       loginPage.clickAcountCreateButton();
       Assert.assertTrue(loginPage.errorShown());
    }
}
