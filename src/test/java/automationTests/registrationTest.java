package automationTests;

import base.baseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegistrationPage;

public class registrationTest extends baseTest {

    @Test
    public void registerError() throws InterruptedException {
        LoginPage loginPage = landingPage.logIn();
        loginPage.createAccountEmailField("oggiagga@7887.com");
        RegistrationPage registrationPage = loginPage.clickAcountCreateButton();
        registrationPage.enterAccountInfo("","","JNA87","FAMOS", "ZaimaSarca23A","Sarajevo","Alabama","00000");
        registrationPage.clickRegistrationButton();
        Assert.assertTrue(registrationPage.errorShown());

    }


}
