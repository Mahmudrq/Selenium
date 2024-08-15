package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver .get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver .manage().window().maximize();
		
		//single file upload
		
		/*driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("D:\\Test\\Text.txt");
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Text.txt")) {
			
			System.out.println("File is Suceessfully Uploaded");
		}
		else
		{
			System.out.println("File is not uploaded");
		}
		*/
		//Multiple file upload
		
         String file1= "D:\\Test\\Text.txt";
         String file2 = "D:\\Test\\Text2.txt";
         driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
         
         //Valided num of files
         int numOfFiles=driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
         
         if(numOfFiles==2) {
        	 System.out.println("All files are uploaded");
         }
         else {
        	 System.out.println("Files not Uploaded");
         }
         //Valided Names of files
         
         if (driver.findElements(By.xpath("//ul[@id='fileList']//li")).get(0).getText().equals("Text.txt") && 
             driver.findElements(By.xpath("//ul[@id='fileList']//li")).get(1).getText().equals("Text2.txt")) 
        		    
         {
        	 
        	 System.out.println("Matching....");
         }

         else {
        	 System.out.println("Not Matching....");
         }	 
         
	}

}
