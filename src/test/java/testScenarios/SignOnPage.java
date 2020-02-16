package testScenarios;


import org.testng.annotations.Test;

import pageObject.SignOnPageModel;

public class SignOnPage extends TestBase{
	
	@Test
	public void myAccountLogin()
	{
		SignOnPageModel signOnPageModel=new SignOnPageModel(driver);
		signOnPageModel.signOnOperation();
	}
}
