package day23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//1.tag id  tag#id
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Mac");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Mac");
		
        //2.tag class  tag.class
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Iphone");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Iphone");
		
		//3.tag attribute tag[attribute=value]
		
		//driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("Samsung");
		//driver.findElement(By.cssSelector("[placeholder=\"Search store\"]")).sendKeys("Samsung");
		
		//4.tag class attribute  tag.class[attribute=value]
		
	  //  driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Mi");
		driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("Mi");
		
		
		
	}

}
