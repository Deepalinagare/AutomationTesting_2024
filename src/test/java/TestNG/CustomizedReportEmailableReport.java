package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomizedReportEmailableReport {
	@Test
	public void frontAccounting()
	{
		WebDriver w = new ChromeDriver();
		Reporter.log("Website has been lauched");
		w.get("https://demo.frontaccounting.eu/");
		Reporter.log("Login Done Successfully");
		w.findElement(By.name("SubmitUser")).click();
		Reporter.log("Log out Successfully");
		w.findElement(By.linkText("Logout")).click();
	}

}
