package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Generic.Utility_methods;

public class Base_page extends Utility_methods {
	public Base_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
