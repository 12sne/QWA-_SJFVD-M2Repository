package Shopperstack.testscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithShopperStack {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Thread.sleep(2000);
		driver.get("https://www.shoppersstack.com/");
		
		WebElement men = driver.findElement(By.xpath("//a[text()='Men']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(men).perform();
		
		driver.findElement(By.xpath("//a[text()='T-shirts']")).click();
		
		Thread.sleep(2000);
		
		
	}
}
