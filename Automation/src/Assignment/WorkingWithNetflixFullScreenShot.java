package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class WorkingWithNetflixFullScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.netflix.com/in/");
		
		Thread.sleep(1000);
		driver.findElement(By.id("signIn")).click();
		
		driver.findElement(By.name("userLoginId")).sendKeys("ysnehal331@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("snehal");
		
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		Thread.sleep(2000);
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshot/netflix.png");
		
		Files.copy(src, dest);
		
	}
}
