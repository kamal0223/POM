package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/features/CreateLeadcucumber.feature", 
glue= {"pages", "testrunner"}, tags= {"@smoke, @regression"}, monochrome=true)
public class Runner {
}
