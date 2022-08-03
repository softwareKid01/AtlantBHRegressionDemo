import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MyAccountPage;

import java.util.concurrent.TimeUnit;

public class removeFromWishlist {
    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver3.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");

        By signInLink = By.cssSelector("a[title='Log in to your customer account']");
        By emailLofin = By.id("email");
        By passwordLogin = By.id("passwd");
        By signIn = By.id("SubmitLogin");

        driver.findElement(signInLink).click();





            driver.findElement(emailLofin).sendKeys("JohnDoe99@gmail.com");



            driver.findElement(passwordLogin).sendKeys("SmokeTesting123");



            driver.findElement(signIn).click();


    }

}
