package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataProCalling_NewsRepo {
	
	WebDriver w;
	@BeforeClass
	public void launchBrowser() throws Exception
	{
		w= new ChromeDriver();
		w.manage().window().maximize();
	}
	
	@BeforeMethod
	public void opnUrl() throws Exception
	{
		w.get("https://www.jagranjosh.com/");
	}
	
	@Test (dataProviderClass = DataProviderRepo.class, dataProvider="newsGetdata")
    public void serachNews(String search) throws Exception
    {
		//w.findElement(By.cssSelector("use[href=\"#search\"]")).sendKeys(Keys.ENTER);
		Actions a= new Actions(w);
		WebElement e = w.findElement(By.cssSelector("use[href=\"#search\"]"));
		a.moveToElement(e).click().perform();
		Thread.sleep(5000);
		w.findElement(By.cssSelector("input[placeholder=\"Search on Jagran Josh\"]")).sendKeys(search,Keys.ENTER);
		Thread.sleep(2000);
	}
	


}
