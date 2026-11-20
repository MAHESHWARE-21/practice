package examples;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
// step 1
	@FindBy(name="email")
	WebElement email;
	@FindBy(id="continue")
	WebElement continuebtn;
	@FindBy(name="password")
	WebElement password;
	@FindBy(id="auth-signin-button")
	WebElement signin;
	
	//step 2
	public void email() {
		email.sendKeys("maheshware21@gmail.com");
	}
	public void continueelement() {
		continuebtn.click();
	}
	public void password() {
		password.sendKeys("Maheshware@21");
	}
	public void signin() {
		signin.click();
	}
	//step 3
	
}
