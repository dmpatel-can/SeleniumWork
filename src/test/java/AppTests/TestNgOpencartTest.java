package AppTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgOpencartTest extends BaseTestNg
{
	@Test(priority = 1)
	public void searchTest()
	{
		Boolean searchBox = driver.findElement(By.cssSelector("input.form-control.input-lg")).isDisplayed();
		Assert.assertTrue(searchBox);
	}
	
	@Test(priority = 2)
	public void searchButtonTest()
	{
		String text = driver.findElement(By.linkText("Desktops")).getText();
		System.out.println(text);
	}
	
	@Test(priority = 3)
	public void urlTest()
	{
		String url = driver.getCurrentUrl();
		Assert.assertTrue(url.contains("opencart"));
	}
	
}
