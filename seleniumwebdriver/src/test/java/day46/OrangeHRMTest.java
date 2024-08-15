package day46;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


//@Listeners(day46.MyListeners.class)
public class OrangeHRMTest {

	WebDriver driver;

	@BeforeClass
	void openadd() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(5000);

	}
	@Test(priority = 1)
	void testlogo() {
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		Assert.assertEquals(status, true);

	}
	
	@Test(priority = 2)
	void testAppUrl() {

		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmahlive.com/web/index.php/auth/login");
	}
	
	@Test(priority = 3,dependsOnMethods= {"testAppUrl"})
	void testTitle() {

		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		

	}
	
	@AfterClass
	void tearDown() {
		driver.quit();
	}
	
}
