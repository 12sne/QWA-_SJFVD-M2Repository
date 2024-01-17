package MouseHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.navigate().to("https://demoapps.qspiders.com/button/buttonDoubleClick?sublist=2");
		
		//create the object of actions class
		Actions act = new Actions(driver);
		
		//use double click method
		act.doubleClick(driver.findElement(By.id("btn21"))).perform();
		
		Thread.sleep(2000);
		act.doubleClick(driver.findElement(By.id("btn23"))).perform();
		
		Thread.sleep(2000);
		act.doubleClick(driver.findElement(By.xpath("//button[text()='2']"))).perform();
		
		Thread.sleep(2000);
		//close the browser
		driver.quit();
		
		
	}
}
