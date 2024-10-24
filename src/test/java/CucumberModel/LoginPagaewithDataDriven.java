package CucumberModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPagaewithDataDriven {
	
	WebDriver w;
	@Given("Lauch Chrome Browser And open saucedemo site in chrome browser.")
	public void lauch_chrome_browser_and_open_saucedemo_site_in_chrome_browser() {
	w= new ChromeDriver();
	w.get("https://www.saucedemo.com/v1/");
	
	}

	@When("Enter {string} in username field And Enter Password {string} And click on sumbmit button.")
	public void enter_in_username_field_and_enter_password_and_click_on_sumbmit_button(String username, String pass) {
	   
		w.findElement(By.id("user-name")).sendKeys(username);
		w.findElement(By.id("password")).sendKeys(pass);
		w.findElement(By.id("login-button")).click();
	}

	@Then("I verify the user is login by checking the url site.")
	public void i_verify_the_user_is_login_by_checking_the_url_site() {
	    
		String actualResult= w.getCurrentUrl();
		String expctedurl= "https://www.saucedemo.com/v1/inventory.html";
		Assert.assertEquals(expctedurl, actualResult);
	
	}
}
