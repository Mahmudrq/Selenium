package day36;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboradAction {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        
        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcome");
        
        Actions act = new Actions(driver);
        
        // Ctrl + A (Select All)
        act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
        
        // Ctrl + C (Copy)
        act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
        
        // Tab (Switch to the second textarea)
        act.sendKeys(Keys.TAB).perform();
        
        // Ctrl + V (Paste)
        act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
    }
}
