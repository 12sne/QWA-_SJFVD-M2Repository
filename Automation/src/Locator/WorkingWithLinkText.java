package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  //to launch the web application
		WebDriver driver = new ChromeDriver();
		
		//to maximize the browser
		driver.manage().window().maximize();
		
		//to launch the web application
		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.name("FirstName")).sendKeys("Snehal");
		
		driver.findElement(By.name("LastName")).sendKeys("Yadav");
		
		driver.findElement(By.name("Email")).sendKeys("ysnehal331@gmail.com");
		
		driver.findElement(By.name("Password")).sendKeys("Snehal@123");
		
		driver.findElement(By.name("ConfirmPassword")).sendKeys("Snehal@123");
		
		driver.findElement(By.name("Gender")).sendKeys("Female");
		
	    driver.findElement(By.name("register-button")).click();
	}

}
