package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Revert12objects {
public WebDriver driver;
	
	public Revert12objects(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this); 
	}
	
	@FindBy(xpath = "//*[text()='Application']") WebElement application;
	@FindBy(xpath = "//*[text()='Distribute']") WebElement distribute;
	@FindBy(xpath = "(//*[text()='Update'])[1]") WebElement update;
	@FindBy(xpath = "//*[@class='DistributionUpdateForm_modal__zfMFj']//*[@id='availableAppNoFrom']") WebElement appses;
	@FindBy(xpath = "//*[@class='DistributionUpdateForm_modal__zfMFj']//*[text()='Select Application Series']") WebElement appsel;
	@FindBy(xpath = "//*[@class='DistributionUpdateForm_modal__zfMFj']//*[@id='option-0']") WebElement series;
	@FindBy(xpath = "//*[@class='DistributionUpdateForm_modal__zfMFj']//*[@id='applicationCount']") WebElement appcount;
	@FindBy(xpath = "//*[@class='DistributionUpdateForm_modal__zfMFj']//*[@id='range']") WebElement range;
	@FindBy(xpath = "//*[@class='DistributionUpdateForm_modal__zfMFj']//*[text()='Revert']") WebElement revert;
	@FindBy(xpath = "//*[text()='No']") WebElement no;
	//@FindBy(xpath = "//*[text()='Yes']") WebElement yes;
	
	
	public boolean applicationclick() {
	    try {
	        application.click();
	        return true;
	    } catch (Exception e) {
	        return false;
	    }
	}
	
	public void distributeclick() {
		distribute.click();
	}
	public void clickupdate() {
		update.click();
	}
	public void appsesdd() {
		appses.click();
	}
	public void clickapp() {
		appsel.click();
	}
	public void seriessel() {
		series.click();
	}
	public boolean validateRangeNotExceedApplicationCount(String rangeValue) {

	    // Enter the range value
	    //range.clear();
		
	    range.sendKeys(rangeValue);

	    
	    int applicationCount = Integer.parseInt(appcount.getAttribute("value"));

	    
	    int enteredRange = Integer.parseInt(range.getAttribute("value"));

	   
	    if (enteredRange <= applicationCount) {
	        return true;
	       
	    } else {
	        return false;
	       
	    }
	}

	
//	public void enterrange() {
//		range.sendKeys("1");
//	}
	public void revertbtn() {
		revert.click();
	}
	public void selectno() {
		no.click();
	}
//	public void selectyes() {
//		yes.click();
//	}

}
