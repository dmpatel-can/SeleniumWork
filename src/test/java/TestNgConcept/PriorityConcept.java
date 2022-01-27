package TestNgConcept;

import org.testng.annotations.Test;

public class PriorityConcept
{
	@Test(priority = 1)
	public void aTest()
	{
		System.out.println("1 Test");
	}
	
	@Test(priority = 2)
	public void bTest()
	{
		System.out.println("2 Test");
	}
	
	@Test(priority = 3)
	public void cTest()
	{
		System.out.println("3 Test");
	}
	
	@Test(priority = 0)
	public void oTest()
	{
		System.out.println("0 Test");
	}
	
	@Test
	public void dTest()
	{
		System.out.println("4 Test");
	}
	
	@Test(priority = -2)
	public void yTest()
	{
		System.out.println("-2 Test");
	}
	
	@Test(priority = -8)
	public void zTest()
	{
		System.out.println("-8 Test");
	}
	
	
	
	
	
	
	
	
}
