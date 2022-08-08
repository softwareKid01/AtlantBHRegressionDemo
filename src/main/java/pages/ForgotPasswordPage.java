    package pages;

    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;

    public class ForgotPasswordPage {
        WebDriver driver;
        private By forgotPasswordField = By.cssSelector("input[class='form-control'] ");
        private By retrievePasswordButton = By.xpath("//form[@id='form_forgotpassword']//button[@type='submit']");
        public ForgotPasswordPage(WebDriver driver) {
            this.driver = driver;
        }
        public void enterEmailField(String email){
            driver.findElement(forgotPasswordField).sendKeys(email);
        }
        public void retrievePasswordButton(){
            driver.findElement(retrievePasswordButton).click();
        }
        public Boolean errorShown(){
            Boolean isDisplaied =  driver.findElement(By.xpath("//div[@class='alert alert-danger']")).isDisplayed();
            return isDisplaied;
        }




    }
