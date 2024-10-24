package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionInTestNg {
  @Test
  public void AssertDemo() {
	  WebDriver w= new ChromeDriver();
	  w.get("https://demo.frontaccounting.eu/index.php");
	  w.findElement(By.name("SubmitUser")).click();
	  //Hard Assertion -- It gives you result after execution
//	  Assert.assertEquals(w.getTitle(), "Main Menu");
//	  String sale=w.findElement(By.cssSelector("a[href=\"./sales/sales_order_entry.php?NewQuotation=Yes\"]")).getText();
//	  Assert.assertEquals(sale, "Sales Quotation Entry");
	  
	  
	  
	  
	  //Soft Assertion where 
	  
	  SoftAssert soft= new SoftAssert();
	  soft.assertEquals(w.getTitle(), "Main Menu");
	  String sale=w.findElement(By.cssSelector("a[href=\"./sales/sales_order_entry.php?NewQuotation=Yes\"]")).getText();
	  soft.assertEquals(sale, "Sales Quotation Entry");
	  soft.assertAll();  //It passes value to listener so at the end it uses
	  
	  
  }
}
