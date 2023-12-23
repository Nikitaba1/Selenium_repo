package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic.Base_Test;

public class Register_page extends Base_Test {
	
	public Register_page(WebDriver driver) {
		super(driver);
	}
	@FindBy(id = "gender-female")
	private WebElement GenderRButton;
	@FindBy(id = "FirstName")
	private WebElement Firstname;
	@FindBy(id = "LastName")
	private WebElement Lastname;
	@FindBy(id = "Email")
	private WebElement Emailid;
	@FindBy(id = "Password")
	private WebElement password;
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmpassword;
	@FindBy(id = "register-button")
	private WebElement register;
	public WebElement getGenderRButton() {
		return GenderRButton;
	}

	public void setGenderRButton(WebElement genderRButton) {
		GenderRButton = genderRButton;
	}

	public WebElement getRegister() {
		return register;
	}

	public void setRegister(WebElement register) {
		this.register = register;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(WebElement confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	public WebElement getEmailid() {
		return Emailid;
	}

	public void setEmailid(WebElement emailid) {
		this.Emailid = emailid;
	}

	public WebElement getLastname() {
		return Lastname;
	}

	public void setLastname(WebElement lastname) {
		this.Lastname = lastname;
	}
	public WebElement getFirstname() {
		return Firstname;
	}

	public void setFirstname(WebElement firstname) {
		this.Firstname = firstname;
	}
	


}
