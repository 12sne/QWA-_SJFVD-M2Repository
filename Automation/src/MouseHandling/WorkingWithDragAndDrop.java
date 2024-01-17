package MouseHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithDragAndDrop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("https://demoapps.qspiders.com/dragDrop/dragToCorrect?sublist=1");
		
		//drag Web element
		WebElement drag = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		
		//drop Web element
		WebElement drop = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(drag, drop).perform();
		
		WebElement drag1 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		
		WebElement drop2 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		
		Actions act1 = new Actions(driver);
		
	    act1.dragAndDrop(drag1, drop2).perform();
	    
	    WebElement drag3 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
	    
	    WebElement drop4 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
	    
	    Actions act2 = new Actions(driver);
	    
	    act2.dragAndDrop(drag3, drop4).perform();
	    
	    WebElement drag5 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
	    
	    WebElement drop6 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
	    
	    Actions act3 = new Actions(driver);
	    
	    act3.dragAndDrop(drag5, drop6).perform();
	}
}
