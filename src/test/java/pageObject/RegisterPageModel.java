package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegisterPageModel extends PageObjectBase {

	public RegisterPageModel(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	// Finding element for Register Link
	@FindBy(how=How.LINK_TEXT, using="REGISTER")
	WebElement registerLink;
		
	// Finding element for Fist Name Input Box
	@FindBy(how=How.XPATH, using="//input[@name='firstName']")
	WebElement firstNameInputBox;
	
	// Finding element for last Name Input Box
	@FindBy(how=How.XPATH, using="//input[@name='lastName']")
	WebElement lastNameInputBox;
		
	// Finding element for phone Input Box
	@FindBy(how=How.XPATH, using="//input[@name='phone']")
	WebElement phoneInputBox;
	
	// Finding element for Email Input Box
	@FindBy(how=How.ID, using="userName")
	WebElement emailInputBox;
	
	// Finding element for Address
	@FindBy(how=How.XPATH, using="//input[@name='address1']")
	WebElement addressInputBox;
	
	// Finding element for City
	@FindBy(how=How.XPATH, using="//input[@name='city']")
	WebElement cityInputBox;
	
	// Finding element for State/Provience
	@FindBy(how=How.XPATH, using="//input[@name='state']")
	WebElement state_ProvienceInputBox;
	
	// Finding element for Postal Code
	@FindBy(how=How.XPATH, using="//input[@name='postalCode']")
	WebElement postalCodeInputBox;
	
	// Finding element for email
	@FindBy(how=How.ID, using="email")
	WebElement userNameInputBox;
	
	// Finding element for password
	@FindBy(how=How.XPATH, using="//input[@name='password']")
	WebElement passwordInputBox;
	
	// Finding element for confirm Password
	@FindBy(how=How.XPATH, using="//input[@name='confirmPassword']")
	WebElement confirmPasswordInputBox;
	
	public void registration()
	{
		registerLink.click();
		firstNameInputBox.sendKeys("TestFirstName");
		lastNameInputBox.sendKeys("TestLastName");
		phoneInputBox.sendKeys("123456789");
		emailInputBox.sendKeys("testingemail@gmail.com");
		addressInputBox.sendKeys("This Address1");
		cityInputBox.sendKeys("Testing City");
		state_ProvienceInputBox.sendKeys("TestingState");
		postalCodeInputBox.sendKeys("12121");
		userNameInputBox.sendKeys("TestingUserName");
		passwordInputBox.sendKeys("Test123");
		confirmPasswordInputBox.sendKeys("Test123");
	}
}
