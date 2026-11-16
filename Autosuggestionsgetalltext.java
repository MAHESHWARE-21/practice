package webBased.Seleniumproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Autosuggestionsgetalltext {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		WebElement l1 = driver.findElement(By.id("twotabsearchtextbox"));
		l1.sendKeys("flowers");
		Thread.sleep(5000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='left-pane-results-container']"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			WebElement e2 = list.get(i);
			String text = e2.getText();
			System.out.println(text);
		}
		
}
	}


