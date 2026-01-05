package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utills.WaitUtill;

public class updatevalidation {

	public WebDriver driver;

	private WaitUtill waitutill;

	public updatevalidation(WebDriver driver) {
		this.driver = driver;
		waitutill= new WaitUtill(driver);
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()='Application']")
	WebElement application;
	@FindBy(xpath = "//*[text()='Distribute']")
	WebElement distribute;
	@FindBy(xpath = "(//*[text()='Update'])[1]")
	WebElement update;
	@FindBy(xpath = "//*[contains(@class,'modal__GJ05L')]//*[text()='Shashank Dev']")
	WebElement issue;
	@FindBy(xpath = "//*[contains(@class,'modal__GJ05L')]//*[@id='option-3']")
	WebElement pro;
//	@FindBy(xpath = "//*[contains(@class,'modal__WqjNz')]//*[text()='Select City Name']") WebElement city;
//	@FindBy(xpath = "//*[@id='option-1']") WebElement selcity;
	
	@FindBy(xpath = "//*[contains(@class,'modal__GJ05L')]//*[@id = 'applicationCount']")
	WebElement updatappcount;
	@FindBy(xpath = "//*[contains(@class,'modal__GJ05L')]//*[@id='range']")
	WebElement range;
	@FindBy(xpath = "//*[contains(@class,'modal__GJ05L')]//*[@class='Button_button__-WkyD  Button_primary__MFUzc']")
	WebElement finalupdate;
	@FindBy(xpath = "//*[text()='No']")
	WebElement no;

	public void applicationclick() {
		application.click();
	}

	public void distributeclick() {
		distribute.click();
	}

	public void clickupdate() {

		waitutill.waitForClickable(update).click();
	}

	public void issuedd() {
		issue.click();
	}
	public void prodd() {
		pro.click();
	}
//	public void citydd() {
//		city.click();
//	}
//	public void selectcity() {
//		selcity.click();
//	}
	
	public boolean validateRangeNotExceedApplicationCount(String rangeValue) {

	    // Enter the range value
	    //range.clear();
	    range.sendKeys(rangeValue);

	    // Read application count
	    int applicationCount = Integer.parseInt(updatappcount.getAttribute("value"));

	    // Read entered range value
	    int enteredRange = Integer.parseInt(range.getAttribute("value"));

	    // Check: range should not be greater than application count
	    if (enteredRange <= applicationCount) {
	        return true;
	       
	    } else {
	        return false;
	       
	    }
	}
//	public void enterrange() {
//		range.sendKeys("1");
//	}

	public void clickfinalupdate() {
		finalupdate.click();
	}

	public void selectno() {
		no.click();
	}

}
