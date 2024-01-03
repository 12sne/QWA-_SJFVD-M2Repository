package Locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClassNameLocator {

	public static void main(String[] args) throws InterruptedException {
		
		//to launch the browser
		WebDriver driver = new ChromeDriver();
		
		//to maximize the browser
		driver.manage().window().maximize();
		
		//implicit wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//to launch the web application
		driver.get("https://www.google.com/");
		//Thread.sleep(2000);
		
		//active element
		driver.switchTo().activeElement().sendKeys("phoebe buffay",Keys.ENTER);
		
		//identify the guitar
		driver.findElement(By.className("lNPNe")).click();
		//Thread.sleep(2000);
		
	}
}
