package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class twoFaDharwadMain {
	public static void main(String[] args) throws Exception
	{
		WebDriver w= new ChromeDriver();
		twoFaDharwadRepo d= new twoFaDharwadRepo( w);
		w.get("https://apgvb-customer.uatvkycsbirrb.in/TWOFA/#/auth/login");
		w.manage().window().maximize();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//d.loginpagefail();
		d.loginPageCorrect();
	   //WebElement error=wdw.until(ExpectedConditions.visibilityOf((WebElement) By.cssSelector("button[type=\"submit\"]"))).click();
        d.otpVerification();
       d.branchFun();
        Thread.sleep(2000);
        d.branchFunActive();
		  Thread.sleep(2000);
       // d.TellerManagemnat();
		Thread.sleep(2000);
		//d.branchFun();
		
	  }	
	}
	


