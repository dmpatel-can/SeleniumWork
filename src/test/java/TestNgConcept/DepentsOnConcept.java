package TestNgConcept;

import org.testng.annotations.Test;
// Never Use dependencyMethod
// Every Test should have its own Pre-Conditions, Tests Steps, Assertion, Status 
public class DepentsOnConcept
{
	@Test()
	public void test1()
	{
		System.out.println("User Info Test");
	}
	
	@Test(dependsOnMethods = "test1")
	public void test2()
	{
		System.out.println("Account Info Test");
	}

	@Test(dependsOnMethods = "test1", priority = 4)
	public void test3()
	{
		System.out.println("Profile Info Test");
	}
	
	@Test(dependsOnMethods = "test1", priority = 3)
	public void test4()
	{
		System.out.println("Log Info Test");
	}
	
	
	
	
}
