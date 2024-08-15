package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {
   
	SoftAssert sa;
	
	@Test
	void test_hardAssertion() {

		System.out.println("Testing.....");
		System.out.println("Testing.....");

		Assert.assertEquals(1, 2);// hardAssertions

		System.out.println("Testing.....");
		System.out.println("Testing.....");

	}

	@Test
	void test_softAssertion() {

		System.out.println("Testing.....");
		System.out.println("Testing.....");

		SoftAssert sa = new SoftAssert();

		Assert.assertEquals(1, 2);// SoftAssertion

		System.out.println("Testing.....");
		System.out.println("Testing.....");

		sa.assertAll(); // mandatory

	}

}
