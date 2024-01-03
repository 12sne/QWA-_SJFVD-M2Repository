package Locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIdLocator {
	
	public static void main(String[] args) throws InterruptedException {
		
		//to launch the browser
		WebDriver driver = new ChromeDriver();
		
		//to maximize the browser
		driver.manage().window().maximize();
		
		//implict wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//to launch the web application
		
		driver.get("https://www.instagram.com/");
		//Thread.sleep(2000);
		
		//identify the username textfield and perform any action
		driver.findElement(By.name("username")).sendKeys("ysnehal331@gmail.com");
		
		//to identify the password text field
		driver.findElement(By.name("password")).sendKeys("Snehal@123");
		
		driver.findElement(By.className("_acap")).click();
	}

}
