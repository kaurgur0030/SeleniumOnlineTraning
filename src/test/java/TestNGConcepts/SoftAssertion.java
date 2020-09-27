package TestNGConcepts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	/*@Test
	public void hardone() {
		// this is how you can write multiple assertion
		Assert.assertEquals(true, true);
		Assert.assertEquals(100, 20);
		Assert.assertEquals(true, false);
		
		
	}
	*/
	@Test
	public void softassert() {
		// in order to use softassertion you need to use class softAssert 
		SoftAssert sa =  new SoftAssert();
		sa.assertEquals(true, true);
		sa.assertEquals(100, 20);
		sa.assertEquals(true, false);
		sa.assertEquals("Simran", "kaur");
		sa.assertAll();
		
	}

}
