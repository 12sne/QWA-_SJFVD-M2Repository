package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithNameLocator {
	
	public static void main(String[] args) {
		
		//to launch the browser
		WebDriver driver = new ChromeDriver();
		
		//to maximize the browser
		driver.manage().window().maximize();
		
		//to launch the web application
		driver.get("https://demowebshop.tricentis.com/login");
		
		//identify username
		driver.findElement(By.name("Email")).sendKeys("ysnehal331@gmail.com");
		
		driver.findElement(By.name("Password")).sendKeys("Snehal@123");
	}

}
