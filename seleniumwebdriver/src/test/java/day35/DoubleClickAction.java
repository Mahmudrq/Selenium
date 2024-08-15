package day35;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("");
		driver.manage().window().maximize();
         
		
		// Double click
		
		Actions act = new Actions(driver);
		act.doubleClick().build().perform();
	}

}
