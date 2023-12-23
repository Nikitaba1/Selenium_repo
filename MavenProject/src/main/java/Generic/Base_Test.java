package Generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base_Test extends Utility_methods {
	public Base_Test(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}
	@BeforeSuite
	public void beforesuit()
	{
		Reporter.log("connecting to the server");
	}
	@BeforeTest
	public void beforetest()
	{
		Reporter.log("connecting to the database");
	}
	@BeforeClass
	public void beforeclass()
	{
	 driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}
	@AfterClass
	public void afterclass()
	{
		driver.quit();
	}
	@AfterTest
	public void aftertest()
	{
		Reporter.log("disconnecting to the database");
	}
	@AfterSuite
	public void aftersuite()
	{
		Reporter.log("disconnecting to the server");
	}
	
	}