package day22;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocatorDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		//name
		//driver.findElement(By.name("search_query")).sendKeys("Mac");
		
        // id
		//boolean logoDisplaystatus=driver.findElement(By.id("Layer_1")).isDisplayed();
		//System.out.println(logoDisplaystatus);
		
		//linktext PartialLinktext
		
		//driver.findElement(By.linkText("Downloads")).click();
        //driver.findElement(By.partialLinkText("Download")).click();
		
		
		//class
		
		//List<WebElement>headerLinks=driver.findElements(By.className("nav-link"));
		//System.out.println("Total Numbers of Links :"+headerLinks.size());
		
		//Tagname 
		
		//List<WebElement>Links=driver.findElements(By.tagName("a"));
		//System.out.println("Total Number of Links : "+Links.size());
		
		List<WebElement>images=driver.findElements(By.tagName("img"));
		System.out.println("Total Numbers of Images :"+images.size());
		
	}
	
	

}
