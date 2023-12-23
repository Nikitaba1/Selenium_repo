package TestScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic.Base_Test;
import Generic.Read_exel;
import pom_script.Register_page;

public class Register_Test extends Base_Test {
	public Register_Test(WebDriver driver) {
		super(driver);
	}
	@Test(dataProvider="Register")
	public void tetscase(String fisrtname,String lastname,String email,String password,String confirmpasswor)
	{
		driver.get("https://demowebshop.tricentis.com/register");
		Register_page r = new Register_page(driver);
		r.getGenderRButton().click();
		r.getFirstname().sendKeys(fisrtname);
		r.getLastname().sendKeys(lastname);
		r.getEmailid().sendKeys(email);
		r.getPassword().sendKeys(password);
		r.getConfirmpassword().sendKeys(confirmpasswor);
		r.getRegister().click();
		
		
	}
	@DataProvider(name="Register")
	public Object[][] Exel() throws Exception
	{
		return Read_exel.fetchexel();
	}

}
