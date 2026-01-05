package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Campus_Validations {
	
public WebDriver driver;
	
	public Campus_Validations(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this); 
	}
	
	@FindBy(xpath = "//*[text()='Application']") WebElement application;
	@FindBy(xpath = "//*[text()='Distribute']") WebElement distribute;
	@FindBy(xpath = "//*[text()='Select Campaign District']") WebElement campaigndistrict;
	@FindBy(xpath = "//*[text()='GUNTUR']") WebElement guntur;
	@FindBy(xpath = "//*[text()='Select City Name']") WebElement city;
	@FindBy(xpath = "//*[@id='option-1']") WebElement selcity;
	@FindBy(xpath = "//*[text()='Select Branch Name']") WebElement branch;
	@FindBy(xpath = "//*[@id='option-0']") WebElement branchname;
	@FindBy(xpath = "//*[text()='Select Issued To']") WebElement issued;
	@FindBy(xpath = "//*[@id='option-2']") WebElement issuedto;
	@FindBy(xpath = "//*[text()='Select Application Fee']") WebElement appfee;
	@FindBy(xpath = "//*[@id='option-0']") WebElement selappfee;
	@FindBy(xpath = "//*[text()='Select Application Series']") WebElement series;
	@FindBy(xpath = "//*[@id='option-0']") WebElement selseries;
	@FindBy(xpath = "//*[@id='range']") WebElement range;
	@FindBy(xpath = "//*[text()='Insert']") WebElement insert;
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
	public void campaigndistrictdd() {
		campaigndistrict.click();
	}
	public void selectguntur() {
		guntur.click();
	}
	public void citydd() {
		city.click();
	}
	public void selectcity() {
		selcity.click();
	}
	public void branchdd() {
		branch.click();
	}
	public void selectbranch() {
		branchname.click();
	}
	public void issueddd() {
		issued.click();
	}
	public void selectissuedto() {
		issuedto.click();
	}
	public void appfeedd() {
		appfee.click();
	}
	public void selectappfee() {
		selappfee.click();
	}
	public void seriesdd() {
		series.click();
	}
	public void selectseries() {
		selseries.click();
	}
	public void enterrange() {
		range.sendKeys("1");
	}
	public void inserbtn() {
		insert.click();
	}
	public void selectno() {
		no.click();
	}
//	public void selectyes() {
//		yes.click();
//	}
}