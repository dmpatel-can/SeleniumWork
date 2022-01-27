package TestNgConcept;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/****===========================================================****
=> TestNG will Automatically adjust the Execution based on Annotation
=> More Tests: @BeforeMethod & @AfterMethod => All Tests will be executed Separately.
=> Less & Easy Tests: @BeforeSuite => All Tests will be executed Same Time.
*/
public class AnnotationsConcept
{
	@BeforeSuite
	public void connectionToDB()
	{
		System.out.println("BS- Data Base Connection");
	}
	
//	@BeforeTest
//	public void createUser()
//	{
//		System.out.println("CU- Create User");
//	}
	
	@BeforeClass
	public void launchBrowserURL()
	{
		System.out.println("LB- Launch Browser & Url");
	}
	
	@BeforeMethod
	public void logIn()
	{
		System.out.println("login in");
	}
		
	@Test
	public void test1()
	{
		System.out.println("User Info Test");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Account Info Test");
	}
	
	@AfterMethod
	public void logOut()
	{
		System.out.println("LogOut from");
	}
	
	@AfterClass
	public void closeBrowserUrl()
	{
		System.out.println("Close Browser & Url");
	}
	
//	@AfterTest
//	public void deleteUser()
//	{
//		System.out.println("Delete User");
//	}
	
	@AfterSuite
	public void disconnectDB()
	{
		System.out.println("Disconnect with Data Base");
	}
	
}
