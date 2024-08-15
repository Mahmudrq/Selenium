package day38;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtension {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		
		
		File file= new File("C:\\Users\\mahmu\\Downloads\\crx\\SelectorsHub-XPath-Helper-Chrome-Web-Store.crx");
		
		options.addExtensions(file);
		
		
		WebDriver driver = new ChromeDriver(options);
	    driver.get("https://www.youtube.com/");
		String act_title=driver.getTitle();
		
		  if(act_title.equals("YouTube")){
			  
			  System.out.println("Test Passed....");
		  }
		  else {
			  System.out.println("Test Failed...");
		  }
		     //driver.quit();


	}

}
