package day26;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		//get url
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        //get url
         System.out.println(driver.getTitle());
        //get current url 
       //  System.out.println(driver.getCurrentUrl());
       
       //page source
       
       // System.out.println(driver.getPageSource());
       
        //window id 
        // String windowid = driver.getCurrentUrl();
       //System.out.println("Window ID : "+windowid);
       
       //multiple window id
       
       driver.findElement(By.linkText("OrangeHRM, Inc")).click();
       Set<String>windowsid=driver.getWindowHandles();
       System.out.println(windowsid);
       
       
	}

}
