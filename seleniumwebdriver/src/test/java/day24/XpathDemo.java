package day24;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class XpathDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//xpath with single attribute
		
		//driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Realme");
		
		
		//xpath with multiple attribute
		
		//driver.findElement(By.xpath("//input[@name='q'][@placeholder='Search store']")).sendKeys("Mi");
		
		//xpath with and or operator
		
		//driver.findElement(By.xpath("//input[@name='q'and @ placeholder='Search store']")).sendKeys("Realme");
		//driver.findElement(By.xpath("//input[@name='q'or @ placeholder='Search store']")).sendKeys("Mi");
		
		//xpath with inner text - text()
		//driver.findElement(By.xpath("//*[text()=' Electronics ']")).click();
		
		/*boolean displaystatus=driver.findElement(By.xpath(" //h3[text()='Featured']")).isDisplayed();
		System.out.println(displaystatus);
		String value=driver .findElement(By.xpath(" //h3[text()='Featured']")).getText();
		System.out.println(value);*/
		
		//xpath with contains method
		
		 //driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("Mobile");
		
		//xpath with starts-with
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("Mi");
		
		//chained xpath
		
		boolean imgstatus = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
        System.out.println(imgstatus);
		

		

	}

}
