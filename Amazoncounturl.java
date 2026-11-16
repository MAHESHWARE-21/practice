package webBased.Seleniumproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazoncounturl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		
		WebElement e1 = driver.findElement(By.xpath("//input[@id ='twotabsearchtextbox']"));
		e1.sendKeys("Flowers");
		Thread.sleep(2000);
		List<WebElement> e2 = driver.findElements(By.xpath("//div[@class='left-pane-results-container']"));
		int count = e2.size();
		
		System.out.println(count);
		//e2.get(count-1).click();
		

	}

}
