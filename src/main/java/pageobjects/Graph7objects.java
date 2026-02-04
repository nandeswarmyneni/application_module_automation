package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Graph7objects {
	
public WebDriver driver;
	
	public Graph7objects(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[text()='Application']") 
	WebElement application;
	@FindBy(xpath = "//*[text()='Distribute']")
	WebElement distribute;
	@FindBy(xpath = "//*[contains(@class,'MuiSvgIcon-root')]")
	WebElement graph;
	@FindBy(xpath = "//*[@class='MuiAccordionDetails-root css-l9xe8y']")
	List<WebElement> graphdata;
	@FindBy(xpath = "(//*[contains(@class,'TableWidget_custom_checkbox__')])[1]")
	WebElement checkbox;
	@FindBy(xpath = "//*[text()='Export']")
	WebElement exportbtn;
	@FindBy(xpath = "//*[text()='PDF']")
	WebElement pdf;
	
	
	
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

	public void clickGraph() {
	    graph.click();
	}
	
	public void getgraphdata() {

	    if (graphdata.isEmpty()) {
	        System.out.println("No graph data found");
	        return;
	    }

	    for (WebElement data : graphdata) {
	        System.out.println(data.getText());
	    }
	}
	
	public void selectcheckbox() {
		checkbox.click();
	}
	
	public void clickexportbtn() {
		exportbtn.click();
	}
	public void selpdf() {
		pdf.click();
	}

	}




