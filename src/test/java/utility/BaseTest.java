package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest extends ListenerLogic {

	@Parameters("browser")
	@BeforeMethod
	public void launchBrowser(String nameofbrowser) throws InterruptedException {
		if(nameofbrowser.equals("edge")) {
		 driver=new EdgeDriver();
		 driver.get("https://www.amazon.in/");
		 Thread.sleep(2000);
		driver.manage().window().maximize();
	}
		if(nameofbrowser.equals("chrome")) {
			 driver=new ChromeDriver();
			 driver.get("https://www.amazon.in/");
			 Thread.sleep(2000);
			driver.manage().window().maximize();
		}
	}
	@AfterMethod
	public void quitBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	}


