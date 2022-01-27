package AppTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgGoogleTest extends BaseTestNg
{
	@Test(priority = 1)
	public void searchTest()
	{
		Boolean searchBox = driver.findElement(By.cssSelector("input.gLFyf.gsfi")).isDisplayed();
		Assert.assertTrue(searchBox);
	}
	
	@Test(priority = 2)
	public void searchButtonTest()
	{	
		String text = driver.findElement(By.name("btnK")).getText();
		System.out.println(text);
	}
	
	@Test(priority = 3)
	public void urlTest()
	{
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("google"));
	}	
}
