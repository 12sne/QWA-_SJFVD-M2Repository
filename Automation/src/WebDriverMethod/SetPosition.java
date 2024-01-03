package WebDriverMethod;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) {
		
		//to lauch the web application
		WebDriver driver = new ChromeDriver();
		
		Point p = new Point(200,300);
		
		driver.manage().window().setPosition(p);
		
		//to open the web application
	    driver.get("https://www.amazon.in/");
		
	}
}
