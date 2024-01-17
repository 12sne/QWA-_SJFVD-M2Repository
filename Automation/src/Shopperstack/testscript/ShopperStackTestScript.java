package Shopperstack.testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperStackTestScript {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.shoppersstack.com/");
		
		driver.findElement(By.id("loginBtn")).click();
		
		driver.findElement(By.id("Email")).sendKeys("ysnehal331@gmail.com");
		
	    Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("Snehal@123");
		
		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
		
		driver.findElement(By.id("First Name")).sendKeys("Snehal");
		
		driver.findElement(By.id("Last Name")).sendKeys("Yadav");
		
		driver.findElement(By.id("Phone Number")).sendKeys("8180939135");
		
		driver.findElement(By.id("Email Address")).sendKeys("ysnehal331@gmail.com");
		
		driver.findElement(By.id("Password")).sendKeys("Snehal@123");
		
		driver.findElement(By.id("Confirm Password")).sendKeys("Snehal@123");
		
		driver.findElement(By.id("Terms and Conditions")).click();
		
		driver.findElement(By.name("btnDisabled")).click();
		
	}
}
