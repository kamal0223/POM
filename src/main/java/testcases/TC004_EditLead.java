package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName = "TC004_EditLead";
		testDescription = "Edit a lead and verify";
		testNodes="EditLead";
		category="Smoke";
		authors="kamal";
		browserName="chrome";
		dataSheetName="TC004";
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
		.clickFirstResult()
		.clickEdit()
		.enterCompanyName()
		.clickUpdate()
		.VerifyFirstName(fName);
		
	}

}
