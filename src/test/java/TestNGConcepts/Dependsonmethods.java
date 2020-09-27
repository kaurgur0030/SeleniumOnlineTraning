package TestNGConcepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependsonmethods {
@Test(priority =1)
	public void login() {
		System.out.println("login");
		Assert.assertEquals("signin", "login");
	}

@Test(priority =2 ,dependsOnMethods="login")
public void search() {
	
}
@Test (priority =3, dependsOnMethods= {"login", "search"}) // dependsOnMethods is used to skip 2nd method if first one is failed 
//it can also used along with priorities you can use multiple  dependsOnMethods with priorities
public void logout() {
	System.out.println("logout");
	}

}
