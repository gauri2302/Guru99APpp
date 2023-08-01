package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
				features= {"AllFeatureFiles/TC-001_RegExamples.feature"},
				glue= {"StepDefination"},
				dryRun=false,
				plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

		)

public class TestRunner extends AbstractTestNGCucumberTests{

}
