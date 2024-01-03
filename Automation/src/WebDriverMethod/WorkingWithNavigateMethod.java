package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithNavigateMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		//to launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//to maximise the window
		driver.manage().window().maximize();
		
		//to open the web application
		driver.get("https://www.amazon.in/");
		
		//to navigate the application
		driver.navigate().to("https://www.zomato.com/pune");
		
		//to go back
		Thread.sleep(2000);
		driver.navigate().back();
		
		//to go forward
		Thread.sleep(2000);
		driver.navigate().forward();
		
		//to refresh
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		
	}

}
