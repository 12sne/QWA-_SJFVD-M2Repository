package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithScrollDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.zomato.com/india");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,1000)");
		
		js.executeScript("window.scrollBy(0,2500)");
		
		driver.findElement(By.xpath("//p[text()='Zomaland']")).click();
		
		driver.findElement(By.xpath("//span[text()='Buy ticket on app']")).click();
		
		
	}
}
