package day41;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		driver.manage().window().maximize();

		String filepath = "D:\\workplace\\seleniumwebdriver\\testdata\\testdata2.xlsx";

		int rows = ExcelUtlis.getRowCount(filepath, "Sheet1");

		for (int i = 1; i <= rows; i++) {
            //readm data from excel
			String principle = ExcelUtlis.getCellData(filepath, "Sheet1", i, 0);
			String rateofinterest = ExcelUtlis.getCellData(filepath, "Sheet1", i, 1);
			String preiod1 = ExcelUtlis.getCellData(filepath, "Sheet1", i, 2);
			String preiod2 = ExcelUtlis.getCellData(filepath, "Sheet1", i, 3);
			String fre = ExcelUtlis.getCellData(filepath, "Sheet1", i, 4);

			String exp_mvalue = ExcelUtlis.getCellData(filepath, "Sheet1", i, 5);
			
			
			// pass the data appliction
			
			driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(principle);
			driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateofinterest);
			driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(preiod1);
			Select predrp=new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
			predrp.selectByVisibleText(preiod2);
			
			Select fredrp= new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
			fredrp.selectByVisibleText(fre);
			driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();
			
			
			String act_mvalue=driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
			
			if(Double.parseDouble(exp_mvalue)==Double.parseDouble(act_mvalue)) {
				System.out.println("Test Passed...");
				ExcelUtlis.setCellData(filepath, "Sheet1", i, 7, "Passed");
				ExcelUtlis.fillGreenColor(filepath, "Sheet1", i, 7);
				
				
			}
			else
			{
				System.out.println("Test Failed...");
				ExcelUtlis.setCellData(filepath, "Sheet1", i, 7, "Failed");
				ExcelUtlis.fillRedColor(filepath, "Sheet1", i, 7);
				
			}
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//img[@class='PL5']")).click();

		}
		driver.quit();
	}

}
