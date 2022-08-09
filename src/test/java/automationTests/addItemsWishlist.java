package automationTests;

import base.baseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.ProductDetailedPage;

public class addItemsWishlist extends baseTest {
     @Test
     public void addToWishlistSuccessfully() throws InterruptedException {
          MainPage mainPage =  landingPage.clickWomenLink();
          ProductDetailedPage productDetailedPage =  mainPage.clcikImgdetailed();
          productDetailedPage.addToWishlist();
          Thread.sleep(1000);
          Assert.assertTrue(productDetailedPage.getWishlistTextAdded().contains("Added to your wishlist."));
    }
}
