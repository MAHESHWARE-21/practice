package examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	WebDriver driver;
//step 1
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountandlist;
	@FindBy(xpath="//span[@class='nav-action-inner']")
	WebElement signin;
	
	//step 2
	public void hoveroveraccountandlist(WebDriver driver) {
		Actions a =new Actions(driver);
		a.moveToElement(accountandlist);
	}
	public void signin() {
		signin.click();
	}
// step 3
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
}
