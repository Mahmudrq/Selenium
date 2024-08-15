package day44;

import org.testng.annotations.Test;

public class PaymentTest {

	
	@Test(priority = 1,groups= {"sanity","regression","functional"})
	void PaymentbyTk() {
		System.out.println("This is  Payment By TK");
	}

	@Test(priority = 2,groups= {"sanity","regression","functional"})
	void PaymentbyDollar() {
		System.out.println("This is  Payment By Dollar");
	}

	
}
