package TestNGConcepts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Differentannotations {
	@BeforeTest
	public void login() {
		System.out.println("login");
	}
	@AfterTest
public void logout() {
		System.out.println("logout");
	}
	@Test
	public void bookticket()
	{
		System.out.println(" bookticket");
	}
	@Test
	public void cancelticket()
	{
		System.out.println(" cancelticket");
	}
	}


