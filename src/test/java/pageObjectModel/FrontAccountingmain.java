package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrontAccountingmain{

	public static void main(String[] args) throws Exception{
	
	WebDriver w = new ChromeDriver();
	FrontAccountingRepo r= new FrontAccountingRepo(w);
	w.get("https://demo.frontaccounting.eu/index.php");
	Thread.sleep(2000);
	r.ClearValue();
	Thread.sleep(2000);
	r.enterValues();
	Thread.sleep(2000);
	r.login();
	Thread.sleep(2000);
	r.saleQuotation();
	Thread.sleep(2000);
    r.cancelQuatation();
	Thread.sleep(2000);
	r.Alert();
	Thread.sleep(2000);
	r.Logout();
	

		
	}
	}


