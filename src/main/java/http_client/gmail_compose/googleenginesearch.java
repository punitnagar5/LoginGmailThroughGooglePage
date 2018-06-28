package http_client.gmail_compose;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class googleenginesearch {


	WebDriver driver;
	WebDriverWait wait;

	public googleenginesearch(WebDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
	}
	
	public void googlesearchengine(String url)
	{
		driver.get(url);
		driver.findElement(By.xpath("//*[@id=\"gb_70\"]")).click();
	}
	public void searchItem(String searchValue)
	{
		driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("Punit nagar");
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
	
	public void clickOnAccountIcon()
	{
		driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[2]/div[4]/div[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[2]/div[4]/div[2]/div[1]/div/a")).click();
	}



}
