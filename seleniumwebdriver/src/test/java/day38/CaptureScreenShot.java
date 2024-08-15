package day38;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShot {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		
		//1.Full page screenshot
		
	 /*	TakesScreenshot ts =(TakesScreenshot) driver ;
		File sourcefile=ts.getScreenshotAs(OutputType.FILE);
		//D:\workplace\seleniumwebdriver (Actual Path)
		File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\fullpage.png");
		sourcefile.renameTo(targetfile);  // copy source file to target file  */
		
		
		//2.Capture specfic parts screenshot
		
	  /*WebElement featuredProducts=driver.findElement(By.xpath("//div[@class='row row-cols-1 row-cols-sm-2 row-cols-md-3 row-cols-xl-4']"));
		File sourcefile = featuredProducts.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\featuredProducts.png");
		sourcefile.renameTo(targetfile); // copy source file to target file
		
		driver.quit(); */
		
		//3. capture screenshot of webelement 
		
		WebElement logo=driver.findElement(By.xpath("//img[@title='Your Store']"));
		File sourcefile = logo.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
		sourcefile.renameTo(targetfile); 
		
		driver.quit();
		
		
		
		

	}

}
