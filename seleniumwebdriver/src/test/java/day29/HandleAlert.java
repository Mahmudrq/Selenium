package day29;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
       
		//1.1st alert ok button
		
		/*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		//Thread.sleep(5000);
		//driver.switchTo().alert().accept();
		Alert myalert = driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();*/
		
		//2.Confirmation alert msg
		
		/* driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		 Thread.sleep(2000);
		//driver.switchTo().alert().accept();
		 driver.switchTo().alert().dismiss(); */
		
		
		 //3.prompt alert
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		Alert myPromptAlert= driver.switchTo().alert();
		myPromptAlert.sendKeys("Welcome");
		myPromptAlert.accept();
		

	}

}

