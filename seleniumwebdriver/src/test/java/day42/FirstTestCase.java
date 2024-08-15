package day42;

import org.testng.annotations.Test;

/*open application
 * log in
 * log out
 * -4 -3 -2 -1 0 1 2 3 4 
 * testng runs from low to higher
 * alphabetic order
*/

public class FirstTestCase {

	@Test(priority=-1)
	void openapp() {

		System.out.println("Opening Appplication...");

	}

	@Test(priority=0)
	void login() {

		System.out.println("Login To Application...");

	}

	@Test(priority=1)
	void logout() {
		System.out.println("Logout From Application...");
	}
}
