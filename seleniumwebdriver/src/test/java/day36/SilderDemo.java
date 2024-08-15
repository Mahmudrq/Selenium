package day36;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SilderDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions act =  new Actions(driver);
		
		//Minimunm Silder
	    WebElement min_silder=driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
	    System.out.println("Location : "+min_silder.getLocation());//59,249
	    act.dragAndDropBy(min_silder, 100, 249).perform();
	    System.out.println("Location After Move : "+min_silder.getLocation()); //158,249
	    
	    //Maximim Silder
	    WebElement max_silder = driver.findElement(By.xpath("//span[2]"));
	    System.out.println("Location : "+max_silder.getLocation());//510,249
	    act.dragAndDropBy(max_silder, -100, 249).perform();
	    System.out.println("Location After Move : "+max_silder.getLocation()); //410,249
	    
	    

	}

}
