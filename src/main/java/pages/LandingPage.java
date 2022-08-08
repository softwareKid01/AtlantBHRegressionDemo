    package pages;

    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.interactions.Action;
    import org.openqa.selenium.interactions.Actions;

    public class LandingPage {


        WebDriver driver;
        private By addToCartsButton2 = By.cssSelector("a[title='Add to cart']");
        private By continueShopping = By.cssSelector("span[title='Continue shopping'] span:nth-child(1)");
        private By carts = By.cssSelector("a[title='View my shopping cart']");
        private By carts2 = By.xpath("//b[normalize-space()='Cart']");
        private By xRemove = By.xpath("//span[@class='remove_link']");
        private By signInLink = By.cssSelector("a[title='Log in to your customer account']");
        By womenLink = By.linkText("Women");



        public LandingPage(WebDriver driver) {
            this.driver = driver;
        }
        public void clickAddToCarts(){
            driver.findElements(addToCartsButton2).get(1).click();
            System.out.println("asdrrrr");
        }

        public void clickContinueShopping(){
            driver.findElement(continueShopping).click();
        }

        public void removeFromCarts() throws InterruptedException {
            Actions actions = new Actions(driver);
            actions.moveToElement(driver.findElement(By.cssSelector("a[title='View my shopping cart']"))).build().perform();

            driver.findElement(By.xpath("//span[@class='remove_link']")).click();

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




    }


