package automationTests;

import base.baseTest;
import org.testng.annotations.Test;

public class addItemToCartsTest extends baseTest {

        @Test
        public void itemAddedToCarts(){
        landingPage.clickAddToCarts();
        landingPage.clickContinueShopping();
        }
    }
