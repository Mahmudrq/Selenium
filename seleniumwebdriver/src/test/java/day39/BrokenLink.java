package day39;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://deadlinkcity.com/");
		driver.manage().window().maximize();

		// capture all the links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total numbers of Link : " + links.size());

		// reading all the links

		int noOfBrokenLinks = 0;

		for (WebElement linkElement : links) {
			String hrefValue = linkElement.getAttribute("href");

			if (hrefValue == null || hrefValue.isEmpty()) {

				System.out.println("Not Possible to check");
				continue;

			}

			// hit url to server

			try {
				URL linkURL = new URL(hrefValue); // converted href value from string to url format

				HttpURLConnection conn = (HttpURLConnection) linkURL.openConnection();
				conn.connect();
				if (conn.getResponseCode() >= 400) {
					System.out.println(hrefValue + "====> Broken Link ");
					noOfBrokenLinks++;
				} else {
					System.out.println(hrefValue + "====> Not Broken Link");
				}

			}

			catch (Exception e) {

			}

		}

		System.out.println("Numbers of Broken Links " + noOfBrokenLinks);

	}

}
