package MouseHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithMoveToElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		WebElement fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
		
		//create the object of actions class
		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		//use move to element method
		act.moveToElement(fashion).perform();
		
		//close the browser
	    driver.quit();
	    
		
	}
}
