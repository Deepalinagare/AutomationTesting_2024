package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGSAnotations {
	WebDriver w;
	
  @BeforeClass
  public void openBrowser() 
     {
	  w = new ChromeDriver();
	  w.get("https://apgvb-customer.uatvkycsbirrb.in/TWOFA/#/auth/login");
	  }
}
