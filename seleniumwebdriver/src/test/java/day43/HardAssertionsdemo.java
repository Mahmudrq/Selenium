package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionsdemo {

	@Test
	void test() {

		// Assert.assertEquals("xyz","xyz1");
		// Assert.assertEquals("123","1234");
		
		// Assert.assertEquals("xyz",123);
		// Assert.assertEquals("123",1234);
		
		// Assert.assertNotEquals(123, 123); //failed
		// Assert.assertNotEquals(123, 1234); //Passed
		
		// Assert.assertTrue(true);
		// Assert.assertTrue(false);
		
		// Assert.assertTrue(1==2);
		// Assert.assertTrue(1==1);
		
		//Assert.assertFalse(1 == 2);
		//Assert.assertFalse(1 == 1);
		
		Assert.fail();

	}
}
