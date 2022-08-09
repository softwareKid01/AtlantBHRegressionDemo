package automationTests;

import base.baseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class loginEmailWrongPwd extends baseTest {
    @Test
    public void loginError(){
      LoginPage loginPage = landingPage.logIn();
      loginPage.enterEmailAddress("JohnDoe99@gmail.com");
      loginPage.enterPassword("SmokeTestivggng123");
      loginPage.clickSignIn();
      Assert.assertTrue(loginPage.getText().contains("Authentication failed."));
    }
}
