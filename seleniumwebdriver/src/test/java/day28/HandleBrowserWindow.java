package day28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandleBrowserWindow {

    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
        Set<String> windowIds = driver.getWindowHandles();
        
        //Approch1
        /*List<String> windowList = new ArrayList<>(windowIds);
        
        String parentId = windowList.get(0);
        String childId = windowList.get(1);
        
        driver.switchTo().window(childId);
        System.out.println(driver.getTitle());
        
        driver.switchTo().window(parentId);
        System.out.println(driver.getTitle()); */
        
        for(String winId : windowIds)
        {
        	String title = driver.switchTo().window(winId).getTitle();
        	if(title.equals("OrangeHRM"));
        	{
        		System.out.println(driver.getCurrentUrl());
        	}
        	
        }
        
    }
}
