package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo {
	
	WebDriver w;

	@Test (invocationCount=2)
	public void google()
	{
		//WebDriver w= new ChromeDriver();   //open browser in  different browser
		w= new ChromeDriver();
		
		w.get("https://www.google.com/?safe=active&ssui=on");
	}
	
	@Test (priority=1)
	public void testing()
	{
		//WebDriver w= new ChromeDriver();
		w.get("https://testng.org/");
	}

}
