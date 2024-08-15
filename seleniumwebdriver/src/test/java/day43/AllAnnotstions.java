package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotstions {

	@BeforeSuite
	void bs() {
		System.out.println("This is Before suite....");
	}

	@AfterSuite
	void as() {
		System.out.println("This is After suite....");
	}

	@BeforeTest
	void bt() {
		System.out.println("This is BeforeTest Method...");
	}

	@AfterTest
	void at() {
		System.out.println("This is AfterTest Method...");
	}

	@BeforeClass
	void bc() {

		System.out.println("This is Before Class....");
	}

	@AfterClass
	void ac() {
		System.out.println("This is After Class...");
	}

	@BeforeMethod
	void bf() {

		System.out.println("This Before Method....");
	}

	@AfterMethod
	void logout() {
		System.out.println("This is After Method...");
	}
	@Test(priority=1)
	void tm1() {
		System.out.println("This is tm1...");
	}

	
	@Test(priority=2)
	void tm2() {
		System.out.println("This is tm2...");
	}

	
}
