package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class practiseAssetion {

	@Test
	
	public void checkassertion()
	{
		WebDriver w= new ChromeDriver();
		w.get("https://www.browserstack.com/percy/features/component-dynamic-content-testing");
		w.findElement(By.cssSelector("a[href=\"/live-for-teams\"]")).click();
		Assert.assertEquals(w.getTitle(), "Live for Teams");
		w.findElement(By.xpath("//*[@id=\"primary-menu-container\"]/button")).click();
		
		
		
		
	}
}
