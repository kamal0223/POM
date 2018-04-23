package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName = "TC005_DeleteLead";
		testDescription = "Delete a lead and verify";
		testNodes="DeleteLead";
		category="Smoke";
		authors="kamal";
		browserName="chrome";
		dataSheetName="TC005";
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String uName, String password, String fName) {
		new LoginPage().enterUserName(uName)
		.enterPassword(password)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.enterFirstName()
		.clickFindLeads()
		.getFirstLeadId()
		.clickFirstResult()
		.clickDelete()
		.clickFindLeads()
		.enterLeadId()
		.clickFindLeads()
		.verifyNoRecords();
		
		
	}

}
