package day44;

import org.testng.annotations.Test;

public class LoginTest {

	@Test(priority = 1,groups= {"sanity"})
	void loginbyEmail() {
		System.out.println("This is  login by email");
	}

	@Test(priority = 2,groups= {"sanity"})
	void loginbyfacebook() {
		System.out.println("This is  login by facebook");
	}

	@Test(priority = 3,groups= {"sanity"})
	void loginbytwitter() {
		System.out.println("This is  login by twitter");
	}
}
