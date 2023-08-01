package StepDefination;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;
import PageLayer.RegistrationPage;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepReg extends BaseClass{

	RegistrationPage rp;
	
	
	@Given("User is on home page")
	public void user_is_on_home_page() {
		initailization();
	}
	
	@When("user enter Fisrtname, lastname Emailid and phone")
	public void user_enter_fisrtname_lastname_emailid_and_phone() {
	rp = new RegistrationPage();
	rp.contactInfoFunctionality("Gauri", "Chawathe", "1212121212", "gauri@gmail.com");
		
	}
	
	@Then("Enter Address city")
	public void enter_address_city() {
	
		rp.mailingInfoFunctionality("Pune", "Wakd");
	}
	@Then("enter Username password and ConfirmPassword")
	public void enter_username_password_and_confirm_password() {
	    rp.userInfoFunctionality("gauri@gmail.com", "gauri1234", "gauri1234");
		
	}
	@Then("click on Submit button")
	public void click_on_submit_button() {
		rp.SubmitFunctionality();
	    
	}
	
	
	@AfterStep
	public static void tearDowm(Scenario scenario) {
		if (scenario.isFailed()) {

			byte[] f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			
			scenario.attach(f,"image/png",scenario.getName());
		}
		else {
			byte[] f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(f,"image/png",scenario.getName());
		}
	}

	
}
