package day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver;

public class FirstTestCase {

	public static void main(String[] args) {
	 // 1. Launch Browser(Chrome)
		
		//ChromeDriver driver = new ChromeDriver ();
		// WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver (); 
		   WebDriver driver = new EdgeDriver ();
         //2.open url 
		 driver.get("https://www.youtube.com/");
		 //3. validate the title 
		  String act_title=driver.getTitle();
		  if(act_title.equals("YouTube")){
			  System.out.println("Test Passed....");
		  }
		  else {
			  System.out.println("Test Failed...");
		  }
		  //4.close Browser
		   // driver.close();
		     driver.quit();
	}

}
