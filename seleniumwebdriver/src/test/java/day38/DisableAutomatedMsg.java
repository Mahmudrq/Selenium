package day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableAutomatedMsg {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
		
		
		WebDriver driver = new ChromeDriver(options);
	    driver.get("https://www.youtube.com/");
		String act_title=driver.getTitle();
		
		  if(act_title.equals("YouTube")){
			  
			  System.out.println("Test Passed....");
		  }
		  else {
			  System.out.println("Test Failed...");
		  }
		     driver.quit();

	}

}
