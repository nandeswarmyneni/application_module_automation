package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginobjects {

    public WebDriver driver;

    public Loginobjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "emailId")
    WebElement inputEmail;

    @FindBy(id = "password")
    WebElement inputPassword;

    @FindBy(xpath = "//*[text()='Login']")
    WebElement lgnBtn;

    public void sendUsernameAndPassword(String uName, String password) {
        inputEmail.sendKeys(uName);
        inputPassword.sendKeys(password);
        lgnBtn.click();
    }



}