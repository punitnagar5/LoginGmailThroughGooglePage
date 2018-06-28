package http_client.gmail_compose;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class gmail_test {

	WebDriver driver;
	Gmail_page gmail;

	public gmail_test()
	{
		driver = new ChromeDriver();
		gmail = new Gmail_page(driver);
		
	}
	
	 @Test
	 public void Testgmaillogin()
	 {
		 gmail.gmailmainpageLaunch("https://accounts.google.com/ServiceLogin");
	 }
	@Test(dependsOnMethods = "Testgmaillogin")
	private void TestEntries()
	{
		gmail.login("psnagar259", "Puneet@259");
	}
}
