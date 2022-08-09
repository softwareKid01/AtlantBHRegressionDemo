    package pages;

    import org.openqa.selenium.By;
    import org.openqa.selenium.WebDriver;

    public class LoginPage {
        private WebDriver driver;
        private By emailLofin = By.id("email");
        private By passwordLogin = By.id("passwd");
        private By signIn = By.id("SubmitLogin");
        private By authText = By.xpath("//li[normalize-space()='Authentication failed.']");
        private By authEmailText = By.xpath("//li[normalize-space()='Invalid email address.']");
        private By Blankauth = By.xpath("//li[normalize-space()='An email address required.']");
        private By forgotPassword = By.xpath("//a[@title='Recover your forgotten password']");
        private By emailAccountCreationInput = By.xpath("//input[@name='email_create']");
        private By accountCreateButton = By.xpath("//button[@id='SubmitCreate']");
        private By regError = By.xpath("//div[@class='alert alert-danger']");
        public LoginPage(WebDriver driver) {
            this.driver = driver;
        }
        public void enterEmailAddress(String email){
            driver.findElement(emailLofin).sendKeys(email);
        }
        public void enterPassword(String password){
            driver.findElement(passwordLogin).sendKeys(password);
        }
        public MyAccountPage clickSignIn(){
            driver.findElement(signIn).click();
            return new MyAccountPage(driver);
        }
        public String getText(){
        String errorText = driver.findElement(authText).getText();
        return errorText;
        }
        public String getEmailAuthText(){
            String errorText = driver.findElement(authEmailText).getText();
            return errorText;
        }
        public String getBlankAuthText(){
            String errorText = driver.findElement(Blankauth).getText();
            return errorText;
        }
        public ForgotPasswordPage clickForgotPassword(){
            driver.findElement(forgotPassword).click();
            return new ForgotPasswordPage(driver);
        }
        public void createAccountEmailField(String email){
            driver.findElement(emailAccountCreationInput).sendKeys(email);

        }
        public RegistrationPage clickAcountCreateButton(){
            driver.findElement(accountCreateButton).click();
            return new RegistrationPage(driver);
        }
        public Boolean errorShown(){
            Boolean isDisplaied =  driver.findElement(regError).isDisplayed();
            return isDisplaied;
        }
    }
