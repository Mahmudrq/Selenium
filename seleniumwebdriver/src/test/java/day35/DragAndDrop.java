package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver .get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
	   //drag and drop
		WebElement rome = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement italy = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		act.dragAndDrop(rome, italy).perform();
		

	}

}
