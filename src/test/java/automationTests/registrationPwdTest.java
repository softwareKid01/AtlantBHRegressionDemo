package automationTests;

import base.baseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegistrationPage;

public class registrationPwdTest extends baseTest {

    @Test
    public void registerPwdError() throws InterruptedException {
        LoginPage loginPage = landingPage.logIn();
        loginPage.createAccountEmailField("oggiagga@7887.com");
        RegistrationPage registrationPage = loginPage.clickAcountCreateButton();
        registrationPage.enterAccountInfo("Mehmedalija","Dizdar","asd","Energoinvest", "PartizanskaProleterska","Titograd","Alabama","00000");
        registrationPage.clickRegistrationButton();
        Assert.assertTrue(registrationPage.errorShown());

    }
}
