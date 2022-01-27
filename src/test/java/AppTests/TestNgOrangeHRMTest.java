package AppTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgOrangeHRMTest extends BaseTestNg
{		
	@Test(priority = 1)
	public void searchTest()
	{
		Boolean emailBox = driver.findElement(By.cssSelector("INPUT.home-tril-email")).isDisplayed();
		Assert.assertTrue(emailBox);
	}
	
	@Test(priority = 2)
	public void contactButton()
	{
		String text = driver.findElement(By.linkText("CONTACT SALES")).getText();
		System.out.println(text);
	}
	
}
