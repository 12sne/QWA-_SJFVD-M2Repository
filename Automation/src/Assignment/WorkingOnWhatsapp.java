package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingOnWhatsapp {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://web.whatsapp.com/");
		
		driver.findElement(By.xpath("//span[text()='Link with phone number']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("8180939135");
		
		driver.findElement(By.xpath("//div[text()='Next']")).click();
		
		
        driver.findElement(By.xpath("//p[@class='selectable-text copyable-text iq0m558w g0rxnol2']")).sendKeys("Ashu");
        
	}
}
