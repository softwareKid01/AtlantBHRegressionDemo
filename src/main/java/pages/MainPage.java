package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    WebDriver driver;
    By img = By.xpath("//img[@title='Faded Short Sleeve T-shirts']");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductDetailedPage clcikImgdetailed(){
        driver.findElement(img).click();
        return new ProductDetailedPage(driver);
    }


}
