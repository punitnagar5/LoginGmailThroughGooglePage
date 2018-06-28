package http_client.gmail_compose;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;

//import junit.framework.Assert;
public class Gmail_page {
	
	WebDriver driver;
	WebDriverWait wait;
	public Gmail_page(WebDriver driver)
	{
    	System.setProperty("webdriver.chrome.driver", "/home/qainfotech/eclipse-workspace/gmail_compose/src/chromedriver");
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
	
	}
	public void gmailmainpageLaunch(String url)
	{
		driver.get(url);
		System.out.println("gmail page is open");
	}
	private WebElement EnterUserName()
	{
		return this.driver.findElement(By.id("identifierId"));


	}
	private WebElement EnterPassword()
	{
		
		return this.driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input"));
	}
	
	public void login(String username, String password)
	{
		EnterUserName().sendKeys(username);
		driver.findElement(By.id("identifierNext")).click();
		 driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		EnterPassword().sendKeys(password);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"passwordNext\"]/content/span")));
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();

	}
}
