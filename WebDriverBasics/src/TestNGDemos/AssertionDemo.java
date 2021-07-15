package TestNGDemos;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
	// if want to ignore the testcase or don't want to execute
	@Test(enabled = false)
	public void verifyTitle() {
		String expectedTitle = "title";
		String actualTitle = "Title";

		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Matched!");
		} else {
			System.out.println("Not Matched!");
		}
	}

	@Test(enabled=false)
	public void hardAssertion() {
		System.out.println("Start");

		String expectedTitle = "title";
		String actualTitle = "Title";

		// Assert.assertEquals(actualTitle, expectedTitle,"Expected Title is not matched
		// with Actual one!");// Fail---execution halt

		Assert.assertTrue(true);// pass
		Assert.assertTrue(false);// Fail

		Assert.assertFalse(false);// pass
		Assert.assertFalse(20 > 10);// Fail
	
	}

	@Test
	public void softAssertion() {
		SoftAssert sa = new SoftAssert();
		System.out.println("Start");

		String expectedTitle = "title";
		String actualTitle = "Title";
		sa.assertEquals(actualTitle, expectedTitle);
		
	 
		System.out.println("End execution....");
		sa.assertAll();// should be last stmt
	}

}
