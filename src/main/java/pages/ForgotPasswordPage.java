    package pages;

    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;

    public class ForgotPasswordPage {
        WebDriver driver;
        private By forgotPasswordField = By.cssSelector("input[class='form-control'] ");
        private By retrievePasswordButton = By.xpath("//form[@id='form_forgotpassword']//button[@type='submit']");
        private By forgotPwdMessageShow = By.xpath("//p[@class='alert alert-success']");
        private By pwdErrorMsg = By.xpath("//div[@class='alert alert-danger']");
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
            Boolean isDisplaied =  driver.findElement(pwdErrorMsg).isDisplayed();
            return isDisplaied;
        }
        public Boolean forgotPwdMessageShow(){
            Boolean isMsgDisplaied =  driver.findElement(forgotPwdMessageShow).isDisplayed();
            return isMsgDisplaied;
        }
    }
