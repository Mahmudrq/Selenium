package day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	
	
	static void futureDate(WebDriver driver,String month,String year,String date) {
		
		while(true) {
		    String current_Month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); //month
		    String current_Year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();//year
		    if(current_Month.equals(month)&&current_Year.equals(year)) {
		        break;
		    }
		    driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//Next 
		    //driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//previous
		}
		 List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
	        
			for(WebElement dt : allDates) {
			    if (dt.getText().equals(date)) {
			        dt.click();
			        break;
			    }
			}
		
	}

	
	/* static void selectDate (WebDriver driver ,String date) {
		 List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
	        
			for(WebElement dt : allDates) {
			    if (dt.getText().equals(date)) {
			        dt.click();
			        break;
			    }
			}
	 }*/
	
	
	static void pastDate(WebDriver driver,String month,String year,String date) {
		
		while(true) {
		    String current_Month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); //month
		    String current_Year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();//year
		    if(current_Month.equals(month)&&current_Year.equals(year)) {
		        break;
		    }
		   // driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//Next 
		    driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//previous
		}
		 List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
	        
			for(WebElement dt : allDates) {
			    if (dt.getText().equals(date)) {
			        dt.click();
			        break;
			    }
			}
	}
	
	 
	public static void main(String[] args) {
            
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		
		//switch to frame 
		driver.switchTo().frame(0);
		
		//using sendKeys method1
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("04/05/2024");
		
		//method2
		
		/*String year = "2021";
		String month = "April";
		String date = "2";*/
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		//futureDate(driver,month,year,date);
		
		pastDate(driver,"May","2020","21");
		futureDate(driver,"May","2025","21");
		
		//selectDate(driver,date);
		
		
		//select month and year
		/*while(true) {
		    String current_Month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); //month
		    String current_Year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();//year
		    if(current_Month.equals(month)&&current_Year.equals(year)) {
		        break;
		    }
		    driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//Next 
		    //driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//previous
		} */
		
		
	      //select the date
		/*List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));
        
		for(WebElement dt : allDates) {
		    if (dt.getText().equals(date)) {
		        dt.click();
		        break;
		    }
		} */

	}

}
