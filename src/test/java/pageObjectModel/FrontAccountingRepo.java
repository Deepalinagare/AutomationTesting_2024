package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrontAccountingRepo {
	
	WebDriver w;
	public FrontAccountingRepo(WebDriver wd) {
		// TODO Auto-generated constructor stub
				w= wd;
				}

 //1.Store Element to reuse in main code	
	By username= By.name("user_name_entry_field");
	By password= By.name("password");
	By loginBtn= By.name("SubmitUser");
	By SaleQuatationEntry= By.linkText("Sales Quotation Entry");
	By CancelOrder= By.name("CancelOrder");
	By logout = By.partialLinkText("Logout");
	
	
//2.Methods 
	public void ClearValue()
	{
		w.findElement(username).clear();
		w.findElement(password).clear();
		
	}
	public void  enterValues()
	{
		w.findElement(username).sendKeys("demouser ");
		w.findElement(password).sendKeys("password");
		
	}
	public void login()
	{
		w.findElement(loginBtn).click();
	}
	public void saleQuotation()
	{
		w.findElement(SaleQuatationEntry).click();
	}
	public void cancelQuatation()
	{
		w.findElement(CancelOrder).click();
	}
	public void Alert()
	{
		w.switchTo().alert().accept();
		}
	public void Logout()
	{
		w.findElement(logout).click();
		
	}
	
			

}
