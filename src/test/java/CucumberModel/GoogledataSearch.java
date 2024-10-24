package CucumberModel;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogledataSearch {
	
	WebDriver w;
	@Given("Launch the Chrome Browser And Open Google Chrome.")
	public void launch_the_chrome_browser_and_open_google_chrome() {
	    w= new ChromeDriver();
	    w.get("https://www.google.com");
	    
	}

	@When("Serach for {string} value.")
	public void serach_for_value(String search) {
	    w.findElement(By.id("APjFqb")).sendKeys(search,Keys.ENTER);
	   
	}

	@Then("check for title {string}")
	public void check_for_title(String Title) {
		
		String currentTitle= w.getTitle();
		Assert.assertEquals(true,currentTitle.contains(Title) );
	    System.out.println(currentTitle);
	}



}
