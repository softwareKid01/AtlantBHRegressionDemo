import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pages.LandingPage;

import java.util.concurrent.TimeUnit;

public class hhhh {
    public static void main(String[] args) throws InterruptedException {

       WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver3.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");

         By womenLink = By.linkText("Women");
         By img = By.xpath("//img[@title='Faded Short Sleeve T-shirts']");
         By wishlist = By.xpath("//a[@id='wishlist_button']");

        driver.manage().window().fullscreen();

        driver.findElement(womenLink).click();

        driver.findElement(img).click();

        driver.findElement(wishlist);
    }
}
