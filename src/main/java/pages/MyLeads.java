package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{
	
	public MyLeads() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleCreateLead;
	@And("click Create Lead")
	public CreateLead clickCreateLead() {
		click(eleCreateLead);
		return new CreateLead();
	}
	//The method that is used for Edit Lead
	@FindBy(how=How.LINK_TEXT, using="Find Leads")
	private WebElement eleFindLead;
	public FindLeads clickFindLeads() {
		click(eleFindLead);
		return new FindLeads();
	}
	

}
