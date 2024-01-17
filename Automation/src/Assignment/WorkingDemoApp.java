package Assignment;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingDemoApp {

	public static void main(String[] args) throws InterruptedException {
		
		//to launch the browser
		WebDriver driver = new ChromeDriver();
		
		//to maximize the browser
		driver.manage().window().maximize();
		
		//implicit
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//to launch the web application
		driver.get("https://demoapps.qspiders.com/dropdown?sublist=0");
		
		driver.findElement(By.name("ph")).sendKeys("8180939135");
		
		driver.findElement(By.id("option12")).click();
		
		WebElement dropdown = driver.findElement(By.id("select3"));
		
		Select s = new Select(dropdown);
		
		for (int i=0 ; i<9 ; i++)
		{
			s.selectByIndex(i);
			Thread.sleep(2000);
		}
	}
}
