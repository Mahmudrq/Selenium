package day45;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderdemo {
	
	WebDriver driver;
	
	@BeforeClass
	void set() {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	}
	@Test(dataProvider="dp")
	void testLogin(String email,String pwd) throws InterruptedException {
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(5000);
		boolean status = driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed();
		if(status==true) {
			driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).click();
		}
		else
		{
			Assert.fail();
		}
		
		
	}
	
	@AfterClass
	void tearDown() {
		driver.close();
	}
	
	@DataProvider(name="dp",indices= {0,1,2})
	Object[][]loginData() {
		
		Object data[][] = {
				{"rxrainy@gmail.com","test@123"},
				{"abc@gmail.com","test123"},
				{"xyz123@gmail.com","1234"},
				{"pqr@gmail.com","98833"},
				
		}; 
		
		return data;
	}
	

}
