package pageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignOnPageModel extends PageObjectBase {
	
	public SignOnPageModel(WebDriver driver) {
		super(driver);
		 PageFactory.initElements(driver, this);
	}
	
	// Finding element for Sign On Link
	@FindBy(how=How.LINK_TEXT, using="SIGN-ON")
	WebElement signOnLink;
	
	// Finding element for Username Input Box 
	@FindBy(how=How.XPATH, using="//input[@name='userName']")
	WebElement userNameInputBox;
	
	// Finding element for Password Input Box 
	@FindBy(how=How.XPATH, using="//input[@name='password']")
	WebElement paswordInputBox;
	
	// Finding element for Submit Button 
	@FindBy(how=How.XPATH, using="//input[@value='Login']")
	WebElement submitButton;
	
	public void signOnOperation()
	{
		signOnLink.click();
		userNameInputBox.sendKeys(Constants.username);
		paswordInputBox.sendKeys(Constants.password);
		submitButton.click();
	}
}
