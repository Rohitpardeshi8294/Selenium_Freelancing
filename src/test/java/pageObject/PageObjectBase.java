package pageObject;

import org.openqa.selenium.WebDriver;

public abstract class PageObjectBase {
	public static WebDriver driver;
	
	public PageObjectBase(WebDriver driver) 
	{
		PageObjectBase.driver = driver;
	}

}
