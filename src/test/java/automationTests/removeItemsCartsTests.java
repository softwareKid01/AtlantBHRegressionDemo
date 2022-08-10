package automationTests;

import base.baseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class removeItemsCartsTests extends baseTest {
    @Test
    public void removeItemCarts() throws InterruptedException {
        landingPage.clickAddToCarts();
        landingPage.clickContinueShopping();
        landingPage.removeFromCarts();
        Assert.assertTrue(landingPage.getCartsQuantity().contains("(empty)"));
    }
}
