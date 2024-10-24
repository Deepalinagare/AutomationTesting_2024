package Loggers;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SauceDemo {

	@Test
	
	public void login() {
		
		Logger log= LogManager.getFormatterLogger();
		WebDriver w= new ChromeDriver();
		log.info("Browser has been lauched");
		w.manage().window().maximize();  
		log.info("Browser Maximize");
		w.get("https://www.saucedemo.com/v1/");
		log.info("Browser directed to site Sauce");
		//w.findElement(By.id("user-name")).sendKeys("standard_user");
		w.findElement(By.id("user-name")).sendKeys("standard_");
		log.info("Username entred");
		w.findElement(By.id("password")).sendKeys("secret_sauce");
		log.info("Password entred");
		w.findElement(By.id("login-button")).click();
		log.info("clicked on submot button");
		try {
			w.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button")).click();
			log.info("Clicked on Open menu");
			TimeUnit.SECONDS.sleep(2);
			w.findElement(By.partialLinkText("Logout")).click();
			log.info("Logout Succssfully");
			
			
		} catch ( Exception e) {
			log.error("Login unsuccssful");
		}
		
	}
	
	


}
