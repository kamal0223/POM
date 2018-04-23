package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

import wdMethods.ProjectMethods;

//Class that is used for Edit Leads
public class FindLeads extends ProjectMethods{

	public FindLeads() {
		PageFactory.initElements(driver, this);
	}
	//A method to enter first name in the text box //label[text()='Lead ID:']/following::input[2]
	@FindBy(how=How.XPATH, using="//label[text()='Lead ID:']/following::input[2]")
	private WebElement eleFirstName;
	public FindLeads enterFirstName() {
		type(eleFirstName, "kamal");
		return this;
	}
	@FindBy(how=How.XPATH, using="//button[text()='Find Leads']") private WebElement eleFindLeads;
	public FindLeads clickFindLeads() {
		click(eleFindLeads);
		return this;
	}
	//A method to click the first resulting lead
	@FindBy(how=How.XPATH, using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a") 
	private WebElement eleFirstResult;
	public ViewLead clickFirstResult() {
		click(eleFirstResult);
		return new ViewLead();
	}
	//To get the first lead Id from the result. I am adding this line to show jenkins there is a change
	public FindLeads getFirstLeadId() {
		firstID = getText(eleFirstResult);
		System.out.println(firstID);
		return this;
	}
	
	//A method to verify No records found
	@FindBy(how=How.XPATH, using="//div[text()='No records to display']")
	private WebElement eleNoRecords;
	public FindLeads verifyNoRecords() {
		verifyExactText(eleNoRecords, "No records to display");
		return this;
	}
	//A method to enter Lead ID in the text box (//label[text()='Lead ID:']/following::input[1])
		@FindBy(how=How.XPATH, using="(//label[text()='Lead ID:']/following::input[1])")
		private WebElement eleLeadId;
		public FindLeads enterLeadId() {
			type(eleLeadId, firstID);
			return this;
		}
}
