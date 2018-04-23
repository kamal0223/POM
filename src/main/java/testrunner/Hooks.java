package testrunner;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.SeMethods;

public class Hooks extends SeMethods{
	//public String browserName;
	//public String dataSheetName;
	@Before
	public void before() {
		startResult();
		startTestModule("Create lead", "create lead description");
		test = startTestCase("create test for lead");
		test.assignCategory("smoke");
		test.assignAuthor("kamal");
		startApp("chrome");	
	}
	@After
	public void after() {
		endResult();
		closeAllBrowsers();
		
	}

}
