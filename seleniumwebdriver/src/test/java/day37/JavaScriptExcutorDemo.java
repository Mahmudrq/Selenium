package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExcutorDemo {

    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        
        //ChromeDriver driver = new ChromeDriver();
        
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement inputbox = driver.findElement(By.xpath("//input[@id='name']"));
            
        // Passing the value to the input box---> alternate of sendkeys method
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //JavascriptExecutor js = driver;
        js.executeScript("arguments[0].setAttribute('value', 'John')", inputbox);
        
        
       WebElement rdbtn= driver .findElement(By.xpath("//input[@id='male']"));
       js.executeScript("arguments[0].click()", rdbtn);
       
        
    }
}
