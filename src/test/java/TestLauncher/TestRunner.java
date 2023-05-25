package TestLauncher;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@Listeners(com.generics.CustomReporter.class)
@CucumberOptions(features = ("src\\test\\java\\com\\feature\\SauceDemoDash\\Web"),
//@CucumberOptions(features = ("src\\test\\java\\com\\feature\\sauceDemo\\mobile"),
//@CucumberOptions(features = ("src\\test\\java\\com\\feature\\Books\\API"),
     // tags = "@TC_001_SauceDemo", 
		glue = { "com.stepDefination" }, plugin = {
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"json:target/custom-reports/cucumber-reports/cucumber-jsonreports.json",
				"junit:target/custom-reports/cucumber-reports/cucumber-junitreports.xml",
				"rerun:rerun/failed_scenarios.txt" }

  
		//	, monochrome = true 
		//	, dryRun = true
  
 )
public class TestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}