package Zomato;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetTitleCurrentUrl {
	
	public static void main(String[] args) {
		
		//to launch the browser
		WebDriver driver = new ChromeDriver();
		
		//to open the web application
		driver.get("https://www.zomato.com/pune");
		
		//to fetch the title
		String actual_title=driver.getTitle();
		
		//System.out.println("The title of current web page is"+actual_title);
		
		if (actual_title.equals("Checkout Best Food Places To Eat In Pune | Zomato")) {
			
			System.out.println("Test case is pass");
			
		}
		else {
			
		System.out.println("Test case is fail");
		}
	}
}
