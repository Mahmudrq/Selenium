package day33;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/admin/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.name("username"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement password= driver.findElement(By.name("password"));
		password.clear();
		password.sendKeys("demo");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed());
		{
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}
        driver.findElement(By.xpath("//a[@class='parent']")).click(); //customer main menu click
        
        driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]]")).click();//click sub menu
        
        //Showing 1 to 10 of 19081(1909 pages)
        
        String text=driver.findElement(By.xpath("//div[contains(text(),'Pages')")).getText();
        
        int total_pages=Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
        
        //repecting Pages
        
        for(int p=1;p<=total_pages;p++)
        
        {
        	if(p>1) {
        	WebElement active_page=driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
        		active_page.click();
        		Thread.sleep(5000);
        		
        	}
        	//reading data from page
        	
        	
        	int noOfRows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
        	
        	for(int r=1;r<=noOfRows;r++)
        		
        	{
        		
            String customer_Name=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody["+r+"]/td[2]")).getText();
            String customer_Email=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody["+r+"]/td[3]")).getText();
            String customer_status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody["+r+"]/td[4]")).getText();
            
            System.out.println(customer_Name+"\t"+customer_Email+"\t"+customer_status);
        	}

        }        
        
	}

}
