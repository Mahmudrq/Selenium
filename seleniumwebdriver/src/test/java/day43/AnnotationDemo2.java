package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationDemo2 {

	@BeforeClass
	void login() {

		System.out.println("Log in....");
	}

	@AfterClass
	void logout() {
		System.out.println("Log out...");
	}

	@Test(priority = 1)
	void search() {
		System.out.println("Search...");
	}

	@Test(priority = 2)
	void advancesearch() {
		System.out.println("Advance search....");
	}

}
