package day26;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class ConditionalMethod {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		
		//is display
		//WebElement logo =driver.findElement(By.xpath("//img[@title='Your Store']"));
		//System.out.println("Display Stauts: "+ logo.isDisplayed());

		
		//boolean status= driver.findElement(By.xpath("//img[@title='Your Store']")).isDisplayed();
		//System.out.println("Display Status: "+status);
		
		//isEnable 
		//boolean status=driver.findElement(By.xpath("//input[@placeholder='Search']")).isEnabled();
		//System.out.println("Status :" +status);
		
		//WebElement box = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		//System.out.println("Enable Status: "+box.isEnabled());
		
		
		//isSelected
		
		WebElement male_button = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_button=driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println("Before Select......");
		
		System.out.println("Select Status: "+male_button.isSelected());
		System.out.println("Select Status: "+female_button.isSelected());
		
		
		System.out.println("After Select.....");
		female_button.click();
		System.out.println("Select Status: "+male_button.isSelected());
		System.out.println("Select Status: "+female_button.isSelected());
		
		boolean status = driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		System.out.println("Status :"+status);
		
		
		
		
	}

}
