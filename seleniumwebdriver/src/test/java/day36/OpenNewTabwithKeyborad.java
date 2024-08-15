package day36;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenNewTabwithKeyborad {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		WebElement reglink=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		//Control+Registration
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click(reglink).keyUp(Keys.CONTROL).perform();
		
		//switching to Registration Page
		List<String> ids = new ArrayList(driver.getWindowHandles());
		
		//Registration
		driver.switchTo().window(ids.get(1));
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("John Cena");
		
		//HomePage
	    driver.switchTo().window(ids.get(0)); //switch
	    driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Mac");
	    
		
		

	}

}
