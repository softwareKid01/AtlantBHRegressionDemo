package automationTests;

import base.baseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegistrationPage;

public class registrationCityTest extends baseTest {

    @Test
    public void registerCiryError() throws InterruptedException {
        LoginPage loginPage = landingPage.logIn();
        loginPage.createAccountEmailField("oggiagga@7887.com");
        RegistrationPage registrationPage = loginPage.clickAcountCreateButton();
        registrationPage.enterAccountInfo("Mehmedalija", "Dizdar", "password12345@#", "Energoinvest",
                "ZaimaSarca23A", "", "Alabama", "00000");
        registrationPage.clickRegistrationButton();
        Assert.assertTrue(registrationPage.errorShown());
    }
}
