package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{
	
	public CreateLead() {
		PageFactory.initElements(driver,this);
	}
	

	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	@And("Enter Company Name as (.*)")
	public CreateLead enterCompanyName(String data) {
		type(eleCompanyName, data);
		return this;
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	@And("Enter Last Name as (.*)")
	public CreateLead enterLastName(String data) {
		type(eleLastName, data);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName1")
	public WebElement eleFirstName;
	@And("Enter First Name as (.*)")
	public CreateLead enterFirstName(String data) {
		type(eleFirstName, data);
		return this;
	}
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleCreateLeadBtn;
	@When("Click on Create Lead button")
	public ViewLead clickCreateLead() {
		click(eleCreateLeadBtn);
		return new ViewLead();		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
