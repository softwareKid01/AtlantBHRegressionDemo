package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailedPage {

    WebDriver driver;
    By wishlist = By.xpath("//a[@id='wishlist_button']");
    private By wishListAddedText = By.xpath("//div[@class='fancybox-inner'] /p[@class='fancybox-error']");
    public ProductDetailedPage(WebDriver driver) {
        this.driver = driver;
    }
    public void addToWishlist(){
        driver.findElement(wishlist).click();
    }
    public String getWishlistTextAdded(){
        String text = driver.findElement(wishListAddedText).getText();
        return text;
    }
}
