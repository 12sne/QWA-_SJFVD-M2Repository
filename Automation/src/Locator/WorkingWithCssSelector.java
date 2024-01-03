package Locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCssSelector {
	
	public static void main(String[] args) throws InterruptedException {
		
		//to launch the browser
		WebDriver driver = new ChromeDriver();
		
		//to maximize the browser
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//to launch the web application
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Thread.sleep(2000);
		
		//identify usernmae with css selector
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("Admin");
		
	}

}
