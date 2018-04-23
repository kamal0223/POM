package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

import wdMethods.ProjectMethods;

//Class that is used for Edit Leads
public class UpdateLeadForm extends ProjectMethods{

	public UpdateLeadForm() {
		PageFactory.initElements(driver, this);
	}
	//A method to enter Company name in the text box //label[text()='Lead ID:']/following::input[2]
	@FindBy(how=How.ID, using="updateLeadForm_companyName")
	private WebElement eleCompanyName;
	public UpdateLeadForm  enterCompanyName() {
		type(eleCompanyName, "ChangedCompanyName");
		return this;
	}
	//A method to click on the update button
	@FindBy(how=How.XPATH, using="//input[@value='Update']") 
	private WebElement eleUpdate;
	public ViewLead clickUpdate() {
		click(eleUpdate);
		return new ViewLead();
	}
	

	
}
