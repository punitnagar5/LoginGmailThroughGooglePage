package http_client.gmail_compose;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class googlesearch {
	WebDriver driver;
	googleenginesearch search;
	
	public googlesearch()
	{
		driver = new ChromeDriver();
		search = new googleenginesearch(driver);
	}
	@Test
	public void opensearchEngine()
	{
		search.googlesearchengine("https://www.google.com/");
	}
	
	@Test (dependsOnMethods = "opensearchEngine")
	private void TestEntries()
	{
		search.login("psnagar259", "Puneet@259");
	}
	
	@Test (dependsOnMethods = "TestEntries")
	public void checkloginComplete()
	{
		search.clickOnAccountIcon();
	}
}
