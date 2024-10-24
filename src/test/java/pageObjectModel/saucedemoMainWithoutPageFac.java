package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class saucedemoMainWithoutPageFac {

	public static void main(String[] args) throws Exception {
		
		WebDriver w= new ChromeDriver();
		saucedemoRepoWithoutPageFac s= new saucedemoRepoWithoutPageFac(w);
		w.get("https://www.saucedemo.com/v1/index.html");
		Thread.sleep(2000);
		s.insertValues();
		Thread.sleep(2000);
		s.login();
		
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		s.addtoCart();
		Thread.sleep(2000);
		s.LogOut();
		
	}

}
