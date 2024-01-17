package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class WorkingWithPaytmApp {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		driver.get("https://paytm.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,900)");
		
		Thread.sleep(2000);
		driver.get("https://tickets.paytm.com/flights/");
		
		//Entering the value in from text field
		driver.findElement(By.id("srcCode")).click();
		driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
		driver.findElement(By.id("text-box")).sendKeys("PNQ");
		driver.findElement(By.xpath("//div[text()='Pune, Maharashtra, India']")).click();
		
		//Entering the value in To text field
		driver.findElement(By.id("destCode")).click();
		driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
		driver.findElement(By.id("text-box")).sendKeys("DEL");
		driver.findElement(By.xpath("//div[text()='Delhi, India']")).click();
		
		//click on departure date
		driver.findElement(By.xpath("//span[text()='Departure Date']")).click();
		driver.findElement(By.xpath("(//div[text()='22'])[1]")).click();
		
		//click on traveller 
		driver.findElement(By.id("travellerClass")).click();
		
		for(int i=0;i<2;i++)
		{
			driver.findElement(By.xpath("(//img[@alt='add-icon'])[1]")).click();
			Thread.sleep(2000);
		}
		driver.findElement(By.id("flightSearch")).click();
		
		//All the flight in your console
		List<WebElement> allFlights = driver.findElements(By.xpath("//div[@class='_1gMv6']"));
		
		for(WebElement flight : allFlights)
		{
			System.out.println(flight.getText());
			System.out.println("-----------------------------------------------------------");

		}
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/flights.png");
		Files.copy(src, dest);
	}
}
