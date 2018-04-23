package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Then;
import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{
	
	public ViewLead() {		
		PageFactory.initElements(driver,this);
	}	
	//Edit lead method to verify first name
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleVisibleFName;
	@Then("Verify First Name as (.*)")
	public ViewLead VerifyFirstName(String expectedText) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		verifyExactText(eleVisibleFName, expectedText);
		return this;		
	}
	//Method to click on edit button 
    @FindBy(how=How.LINK_TEXT, using="Edit")
	private WebElement eleEdit;
    public UpdateLeadForm clickEdit() {
    	click(eleEdit);
    	return new UpdateLeadForm();
    }
    
    
    @FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleVisibleCompanyName;
	
	public ViewLead verifyCompanyName(String expectedText) {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		verifyExactText(eleVisibleCompanyName, expectedText);
		return this;		
	}
	@FindBy(how=How.LINK_TEXT, using="Delete")
	private WebElement eleDeleteLead;
	
	public MyLeads clickDelete() {
		click(eleDeleteLead);
		return new MyLeads();
	}
}
