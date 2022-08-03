package automationTests;

import base.baseTest;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.ProductDetailedPage;

public class addItemsWishlist extends baseTest {

    @Test
    public void addToWishlistSuccessfully(){
     MainPage mainPage =  landingPage.clickWomenLink();
     ProductDetailedPage productDetailedPage =  mainPage.clcikImgdetailed();
     productDetailedPage.addToWishlist();

    }
}
