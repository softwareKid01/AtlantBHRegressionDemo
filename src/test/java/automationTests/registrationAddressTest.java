package automationTests;

import base.baseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegistrationPage;

public class registrationAddressTest extends baseTest {

    @Test
    public void registerAddressError() throws InterruptedException {
        LoginPage loginPage = landingPage.logIn();
        loginPage.createAccountEmailField("oggiagga@7887.com");
        RegistrationPage registrationPage = loginPage.clickAcountCreateButton();
        registrationPage.enterAccountInfo("Mehmedalija", "Dizdar", "password12345@#", "Energoinvest", "", "Titograd", "Alabama", "00000");
        registrationPage.clickRegistrationButton();
        Assert.assertTrue(registrationPage.errorShown());
    }
}
