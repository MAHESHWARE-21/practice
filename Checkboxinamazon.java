package webBased.Seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxinamazon {

	public static void main(String[] args) throws InterruptedException {
		// //div[@id='brandsRefinements']/descendant::span[text()='ASIAN']/preceding-sibling::div/label/i
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement l1 = driver.findElement(By.id("twotabsearchtextbox"));
		l1.sendKeys("Shoe");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(5000);
		WebElement l2 = driver.findElement(By.xpath("//div[@id='brandsRefinements']/descendant::span[text()='ASIAN']/preceding-sibling::div/label/i"));
        l2.click();
	}

}
