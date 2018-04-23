package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName = "TC003_CreateLead";
		testDescription = "Create a Lead in Leaftap and verify";
		testNodes="CreateLead";
		category="Sanity";
		authors="kamal";
		browserName="chrome";
		dataSheetName="TC003";
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String uName, String password, String fName, String lName, String cName) {
		new LoginPage().enterUserName(uName)
		.enterPassword(password)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterFirstName(fName)
		.enterLastName(lName)
		.enterCompanyName(cName)
		.clickCreateLead()
		.VerifyFirstName(fName);
		
	}

}
