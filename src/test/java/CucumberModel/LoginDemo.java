package CucumberModel;

import java.awt.Button;
import java.lang.reflect.Field;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.google.common.base.Verify;

import Loggers.SauceDemo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDemo {

	WebDriver w ;

	@Given("Launch chrome Browser")
	public void launch_chrome_browser() {
	    w= new ChromeDriver();
	   // throw new io.cucumber.java.PendingException();
	}

	@Given("Open SauceDemo Site.")
	public void open_sauce_demo_site() {
	    w.get("https://www.saucedemo.com");
	}

	@When("Enter {string} in username Field.")
	public void enter_in_username_field(String Username) {
	   w.findElement(By.id("user-name")).sendKeys(Username);
	}

	@When("Enter {string} in password field.")
	public void enter_in_password_field(String Password) {
	    w.findElement(By.id("password")).sendKeys(Password);
	}

	@When("Click on Login Button.")
	public void click_on_login_button() {
	    w.findElement(By.id("login-button")).click();
	}

	@Then("Validate login by checking url.")
	public void validate_login_by_checking_url() {
	    String expectedUrl= "https://www.saucedemo.com/v1/inventory.html";
	    String actualUrl= w.getCurrentUrl();
	    Assert.assertEquals(expectedUrl, actualUrl);
	}

	@Then("check  SWAG LAB label should present")
	public void check_swag_lab_label_should_present() {
	   String actulanme=w.findElement(By.xpath("//*[@id=\"header_container\"]/div[1]/div")).getText();
	   String Expname= "Swag Labs";
	   Assert.assertEquals(Expname, actulanme);
	
	}



}
