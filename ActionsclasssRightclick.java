package webBased.Seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsclasssRightclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("//a[text()='Coupons']"));
		Actions a1 = new Actions(driver);
		a1.doubleClick(e1).perform();
		Thread.sleep(2000);
		

	}

}
