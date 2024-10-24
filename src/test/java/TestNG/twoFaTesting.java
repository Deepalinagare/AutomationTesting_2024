package TestNG;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class twoFaTesting {
	
	WebDriver w ;
	
	@BeforeClass
	public void browserLaunch()
	{
		w= new ChromeDriver();
		w.manage().window().maximize();
		w.get("https://apgvb-customer.uatvkycsbirrb.in/TWOFA/#/auth/login");
		 w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

//	@BeforeMethod
//	
//	public void login()
//	{
//		w.get("https://apgvb-customer.uatvkycsbirrb.in/TWOFA/#/auth/login");
//	}
	
	
	
	@Test (dataProviderClass =TwoFaDataProviderRepo.class, dataProvider="getLoginCre",priority = 1,alwaysRun = true)
	public void loginTwoFa(String usernm, String pass) throws Exception
	{
		Reporter.log("Login to 2FA Portal");
		w.get("https://apgvb-customer.uatvkycsbirrb.in/TWOFA/#/auth/login");
		w.findElement(By.cssSelector("input[placeholder=\"Enter User Id\"]")).sendKeys(usernm);
		w.findElement(By.cssSelector("input[placeholder=\"Password\"]")).sendKeys(pass);
		w.findElement(By.cssSelector("button[type=\"submit\"]")).click();
		Thread.sleep(3000);
	}
	
	
	@Test (dataProviderClass =TwoFaDataProviderRepo.class, dataProvider="OTPpass",priority = 2,alwaysRun = true)
	
	public void verify(String otp1) throws Exception
	{
//		Reporter.log("OTP Verification");
//		String opt="1111111";
		w.findElement(By.cssSelector("input[placeholder=\"Enter Otp\"]")).sendKeys(otp1);
		w.findElement(By.cssSelector("button[type=\"submit\"]")).click();
	}
	
	@Test (priority = 3,alwaysRun = true)
	public void tellermanagementCreateTeller() throws Exception
	{
		
		w.findElement(By.cssSelector("a[href=\"#/teller/list\"]")).click();
//		w.findElement(By.className("nav-link")).click();
		
		w.findElement(By.xpath("/html/body/app-root/app-full/div/div/div/app-teller-list/div/div/div/div[1]/div[2]/div[2]/table/tbody/tr[1]/td[6]/a/a/i")).click();
		
		w.findElement(By.xpath("//*[@class=\"modal-content\"]/app-confirm-modal/div[3]/button[1]")).click();
//		 Actions a= new Actions(w);
//		 WebElement Tellermang= w.findElement(By.xpath();
//		 a.moveToElement(Tellermang).click().perform();
	
//			WebElement e=w.findElement(By.xpath("//*[@id=\"menu-item-218225\"]/a"));
//			a.moveToElement(e).perform();
//			WebElement e1= w.findElement(By.partialLinkText("Free Courses"));
//			a.moveToElement(e1).click().perform();
//			w.navigate().back();
		 
         //w.findElement(By.xpath("//*[@id=\"navbarNav\"]/ul/li[2]/a")).click();
		
//	    w.findElement(By.linkText("Create Teller")).click();
//	    System.out.println("Please enter below details");
//	   // String name,mobile_no,Email;
//	    //int teller_no;
//	    Scanner s= new Scanner(System.in);
//	    System.out.println("Enter name");
//	    String name= s.nextLine();
//	    System.out.println("Teller Number");
//	    String teller_no= s.nextLine();
//	    System.out.println("Mobile Number");
//	    String mobile_no= s.nextLine();
//	    System.out.println("Enter mail ID");
//	    String mail= s.nextLine();
//	    w.findElement(By.cssSelector("input[formcontrolname=\"name\"]")).sendKeys(name);
//	    w.findElement(By.cssSelector("input[formcontrolname=\"teller_no\"]")).sendKeys(teller_no);
	    
	
	    
	}

}
