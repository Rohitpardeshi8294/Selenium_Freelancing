package testScenarios;

import org.testng.annotations.Test;

import pageObject.RegisterPageModel;

public class RegistrationPage extends TestBase{
	
	@Test
	public void registration()
	{
		RegisterPageModel registrationPageModel=new RegisterPageModel(driver);
		registrationPageModel.registration();
	}

}
