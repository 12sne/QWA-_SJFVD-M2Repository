package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithFacebook {

	public static void main(String[] args) {
		
		//to launch the browser
		WebDriver driver = new ChromeDriver();
		
		//to maximize 
		driver.manage().window().maximize();
		
		//implicit
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//to launch the web application
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("firstname")).sendKeys("Snehal");
		
		driver.findElement(By.name("lastname")).sendKeys("Yadav");
		
		driver.findElement(By.name("reg_email__")).sendKeys("ysnehal331@gmail.com");
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("ysnehal331@gmail.com");
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("Snehal@123");
		
		//identify the dropdown
		WebElement dropdown = driver.findElement(By.id("day"));
		
		//Create the object of select class
		Select s = new Select(dropdown);
		
		//use select by visible text
		s.deselectByVisibleText("21");		
		
		
		
		
		
		
		
		
	}
}
