package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import examples.Homepage;
import examples.Loginpage;
import utility.BaseTest;

public class TC_1LogintoAmazon extends BaseTest {
	
@Test
public void withvalidcreditials() {
	Homepage homepage=new Homepage(driver);
	homepage.hoveroveraccountandlist(driver);
	homepage.signin();
	Loginpage loginpage=new Loginpage();
	loginpage.email();
	loginpage.password();
	loginpage.continueelement();
	loginpage.signin();
	
	
	
	
	
}
}
