package TestNgConcept;

import org.testng.annotations.Test;

public class ExceptionHandling
{
	String name = "Vedant";
	
	@Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class})
	public void loginTest ()
	{
		int i =8/0;
		System.out.println("Arithmetic Exception is Coming");
	}
	
	@Test
	public void logoutTest()
	{
		ExceptionHandling obj = new ExceptionHandling();
		obj = null;
		System.out.println(obj.name);
	}
	
}
