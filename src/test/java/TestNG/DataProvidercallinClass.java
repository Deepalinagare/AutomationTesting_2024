package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataProvidercallinClass {
	
	WebDriver w;
	@BeforeClass 
	public void launchBrowser() throws Exception
	{
		w= new ChromeDriver();
		w.manage().window().maximize();
	}
	@BeforeMethod
	public void openURL() throws Exception
	{
		w.get("https://www.google.com");
	}
	
	@Test (dataProviderClass= DataProviderRepo.class, dataProvider = "getdata")
	public void search(String serach) throws Exception
	{
		w.findElement(By.id("APjFqb")).sendKeys(serach,Keys.ENTER);
		Thread.sleep(2000);
		
	}
	
	@AfterMethod
	public void back() throws Exception
	{
		w.navigate().back();
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void exit()
	{
		w.quit();
	}
	
	

}
