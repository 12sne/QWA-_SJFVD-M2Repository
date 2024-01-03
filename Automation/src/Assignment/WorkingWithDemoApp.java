package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDemoApp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
	    driver.manage().window().maximize();
	    
	    driver.get("https://demoapps.qspiders.com/formValidation");
	    
	    driver.findElement(By.xpath("//input[@name='requiredfield']")).sendKeys("XYZ");
	    
	    driver.findElement(By.xpath("//input[@name='minLength']")).sendKeys("Snehal");
	    
	    driver.findElement(By.xpath("//input[@name='maxLength']")).sendKeys("Ashu");
	    
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Snehal@123");
	    
	    driver.findElement(By.xpath("//input[@name='confirmpass']")).sendKeys("Snehal@123");
	    
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ysnehal331@gmail.com");
	    
	    driver.findElement(By.xpath("//input[@name='minValue']")).sendKeys("35000");
	    
	    driver.findElement(By.xpath("//input[@name='url']")).sendKeys("https://wwww.amazon.in");
	    
	    driver.findElement(By.xpath("//input[@name='maxValue']")).sendKeys("2346");
	    
	    driver.findElement(By.xpath("//input[@name='digits']")).sendKeys("712");
	    
	    driver.findElement(By.xpath("//input[@name='rangeValue']")).sendKeys("45");
	    
	    driver.findElement(By.xpath("//input[@name='number']")).sendKeys("8234567");
	    
	    driver.findElement(By.xpath("//input[@name='alphanum']")).sendKeys("Sneh712");
	    
	    driver.findElement(By.xpath("//input[@name='submit']")).click();
	    
	}
}
