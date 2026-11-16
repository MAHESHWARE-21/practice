package webBased.Seleniumproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cleartrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-testid ='loginPopup']/div/div[@class='pb-1 px-1 flex flex-middle nmx-1']/child::*/child::*")).click();
		driver.findElement(By.xpath("//input[@placeholder='Where from?']")).click();
		List<WebElement> l1 = driver.findElements(By.xpath("//ul[@class='airportList']/li"));
		l1.get(0).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Where to?']")).click();
		List<WebElement> l2 = driver.findElements(By.xpath("//ul[@class='airportList']/li"));
		l2.get(1).click();
		driver.findElement(By.xpath("//div[@class='sc-bdfDLd ceXatl mr-2 mt-1']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='DayPicker-wrapper']/div/div[@class='flex-1 ta-right']/child::*/child::*")).click();
		
		List<WebElement> l3 = driver.findElements(By.xpath("//div[@class='Day-grid flex flex-middle flex-column flex-top']"));
		l3.get(5).click();
		
		driver.findElement(By.xpath("//div[@data-testid = 'dateSelectReturn']")).click();
		
		List<WebElement> l4 = driver.findElements(By.xpath("//div[@class='Day-grid flex flex-middle flex-column flex-top']"));
		l4.get(30).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class = 'sc-bdfDLd ijJNif flex flex-row flex-between']/button")).click();
		
		

		
	}

}
