package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static Utilslayer.UtilsClass.*;

import BaseLayer.BaseClass;

public class RegistrationPage extends BaseClass{
	
	
	@FindBy(name="firstName")
	private WebElement fname;
	
	@FindBy(name="lastName")
	private WebElement lname;
	
	@FindBy(name="phone")
	private WebElement Phone;
	
	@FindBy(name="userName")
	private WebElement userName;
	
	@FindBy(name="address1")
	private WebElement address;
	
	@FindBy(name="city")
	private WebElement city;
	
	@FindBy(name="email")
	private WebElement email1;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="confirmPassword")
	private WebElement confirmPass;
	
	@FindBy(name="submit")
	private WebElement submitbtn;
	
	
	
	public RegistrationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void contactInfoFunctionality(String fname1, String lname1, String phone1, String user1)
	{
		sendKeys(fname,fname1);
		sendKeys(lname, lname1);
		sendKeys(Phone, phone1);
		sendKeys(userName, user1);
		
	}


	public void mailingInfoFunctionality(String address2, String city2)
	{
		sendKeys(address, address2);
		sendKeys(city, city2);
	}

	public void userInfoFunctionality(String user3, String pass3, String cpass3)
	{
		sendKeys(email1, user3);
		sendKeys(password, pass3);
		sendKeys(confirmPass, cpass3);

	}

	public void SubmitFunctionality()
	{
		click(submitbtn);
	}
	
}
