package day36;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowTab {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
        driver .get("https://demo.nopcommerce.com/");
        
        //driver.switchTo().newWindow(WindowType.TAB);// new tab
        
        driver.switchTo().newWindow(WindowType.WINDOW);
        
        driver.get("https://demo.opencart.com/");
		
		
	}

}
