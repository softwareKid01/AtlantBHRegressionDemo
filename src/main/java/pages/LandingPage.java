    package pages;

    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.interactions.Action;
    import org.openqa.selenium.interactions.Actions;

    public class LandingPage {
        WebDriver driver;
        private By addToCartsButton2 = By.cssSelector("a[title='Add to cart']");
        private By continueShopping = By.cssSelector("span[title='Continue shopping'] span:nth-child(1)");
        private By signInLink = By.cssSelector("a[title='Log in to your customer account']");
        private By womenLink = By.linkText("Women");
        private WebElement cartsBar = driver.findElement(By.cssSelector("a[title='View my shopping cart']"));
        private By removeLinkX = By.xpath("//span[@class='remove_link']");
        private By cartsQuantity = By.xpath("//span[@class='ajax_cart_quantity']");
        private By cartsEmpty = By.xpath("//span[@class='ajax_cart_no_product']");
        public LandingPage(WebDriver driver) {
            this.driver = driver;
        }
        public void clickAddToCarts(){
            driver.findElements(addToCartsButton2).get(1).click();
        }
        public void clickContinueShopping(){
            driver.findElement(continueShopping).click();
        }
        public void removeFromCarts() throws InterruptedException {
            Actions actions = new Actions(driver);
            actions.moveToElement(cartsBar).build().perform();
            driver.findElement(removeLinkX).click();
        }
        public MainPage clickWomenLink(){
            driver.manage().window().fullscreen();
            driver.findElement(womenLink).click();
            return new MainPage(driver);
        }
        public LoginPage logIn(){
            driver.findElement(signInLink).click();
            return new LoginPage(driver);
        }
        public String getCartsQuantity(){
          String text = driver.findElement(cartsQuantity).getText();
            return text;
        }
        public String getEmptyCarts(){
            String text = driver.findElement(cartsEmpty).getText();
            return text;
        }
    }


