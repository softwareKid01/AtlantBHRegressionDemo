package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
    WebDriver driver;
    private By fname = By.xpath("//input[@id='customer_firstname']");
    private By lastName = By.xpath("//input[@id='customer_lastname']");
    //private By email = By.id();
    private By password = By.xpath("//input[@id='passwd']");
    private By company = By.xpath("//input[@id='company']");
    private By address1 = By.xpath("//input[@id='address1']");
    private By cityName = By.xpath("//input[@id='city']");
    private By state = By.xpath("//select[@id='id_state']");
    private By postalCode = By.xpath("//input[@id='postcode']");
    private By registratioButton = By.xpath("//button[@id='submitAccount']");
    private By homeNumber = By.xpath("//input[@id='phone']");
    private By alias = By.xpath("//input[@id='alias']");


    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterAccountInfo(String name,String lname,String pwd,
                                 String comp,String address,String city,String stat,String postal) throws InterruptedException {
        driver.findElement(fname).sendKeys(name);
        driver.findElement(lastName).sendKeys(lname);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(company).sendKeys(comp);
        driver.findElement(address1).sendKeys(address);
        driver.findElement(cityName).sendKeys(city);
        Select dropdownElement = new Select(driver.findElement(state));
        dropdownElement.selectByVisibleText("California");
        driver.findElement(postalCode).sendKeys(postal);
        driver.findElement(homeNumber).sendKeys("4168975642");
        driver.findElement(alias).sendKeys("SarajevoCentar");



    }

    public void clickRegistrationButton(){
        driver.findElement(registratioButton).click();

    }

    public Boolean errorShown(){
       Boolean isDisplaied =  driver.findElement(By.xpath("//div[@class='alert alert-danger']")).isDisplayed();
       return isDisplaied;
    }


}
