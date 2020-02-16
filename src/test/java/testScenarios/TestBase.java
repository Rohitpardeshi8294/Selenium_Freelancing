package testScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import pageObject.Constants;

public class TestBase {
public static WebDriver driver;
	
		@BeforeSuite
		public static void setDriver() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver",(System.getProperty("user.dir") + "//src//test//resources//Drivers//chromedriver.exe"));
			driver=new ChromeDriver();
			
			driver.get(Constants.siteURL);
			driver.manage().window().maximize();
		}
		
		@AfterSuite
		public void tearDown()
		{
			try
			{
				Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
}
