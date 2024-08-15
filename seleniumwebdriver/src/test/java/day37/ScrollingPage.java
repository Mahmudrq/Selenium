package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		
		//1.scroll down by pixel value
		
		//js.executeScript("window.scrollBy(0, 1000)");
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		//System.out.println(js.executeScript("return window.pageXOffset;")); for horizontal 
		
		
		//2.scroll the page till element is displayed 
		
		/*WebElement ele = driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
		
		js.executeScript("arguments[0].scrollIntoView();",ele);
		
		System.out.println(js.executeScript("return window.pageYOffset;")); */
		
		// 3.scroll the page till end of the page
		
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		//js.executeScript("window.scrollBy(0, document.body.scrollWidgth)"); for horizontal
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		Thread.sleep(5000);
		
		//4.scrolling upto initial postion
		js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
		
		
		
		

		
		
		

	}

}
