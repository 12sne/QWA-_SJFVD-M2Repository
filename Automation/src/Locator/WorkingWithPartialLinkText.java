package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithPartialLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//to launch the browser
		WebDriver driver = new ChromeDriver();
		
		//to maximize the browser
		driver.manage().window().maximize();
		
		//to launch the web application
		driver.get("https://demowebshop.tricentis.com/");
		
	    driver.findElement(By.partialLinkText("Reg")).click();
	}

}
