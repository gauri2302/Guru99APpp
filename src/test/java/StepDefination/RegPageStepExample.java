package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.RegistrationPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegPageStepExample extends BaseClass
{

	RegistrationPage rp;

	@When("user is on home page")
	public void user_is_on_home_page() {
		initailization();
	}

	@When("user enter fname {string} lname {string} MailID {string} and Phone {string}")
	public void user_enter_fname_lname_mail_id_and_phone(String string, String string2, String string3, String string4) {
	rp = new RegistrationPage();
	rp.contactInfoFunctionality(string, string2, string3, string4);
	
	
	}

	@Then("Enter Address {string} and city {string}")
	public void enter_address_and_city(String string, String string2) {
	rp.mailingInfoFunctionality(string, string2);
	
	}
	
	@Then("enter Username {string} password  {string} and confirmPass {string}")
	public void enter_username_password_and_confirm_pass(String string, String string2, String string3) {
	rp.userInfoFunctionality(string, string2, string3);
	}

	
	@Then("refresh page")
	public void refresh_page() throws InterruptedException {
	Thread.sleep(5000);
	driver.quit();	
	//driver.navigate().refresh();
	}

	
}
