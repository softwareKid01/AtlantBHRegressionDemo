package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailedPage {

    WebDriver driver;
    By wishlist = By.xpath("//a[@id='wishlist_button']");
    public ProductDetailedPage(WebDriver driver) {
        this.driver = driver;
    }
    public void addToWishlist(){
        driver.findElement(wishlist).click();
    }


}
