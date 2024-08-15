package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		//driver.manage().window().maximize();
		
		WebElement drpCountryEle=driver.findElement(By.xpath("//select[@id='country']"));
		Select drpCountry = new Select(drpCountryEle);
		
		//select option for dropdown
		
	     //drpCountry.selectByVisibleText("China");
		//drpCountry.selectByValue("japan");
		//drpCountry.selectByIndex(4);
		
		
		//capture options from drop down
		
		List<WebElement>options=drpCountry.getOptions();
		System.out.println("Number of options in a dropdown :"+options.size());
		
		//options print 
		/*for(int i = 0; i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
			
		}
		*/
		//enhanced loop
		
		for(WebElement op: options)
		{
			
			System.out.println(op.getText());
		}
		
		
		

	}

}