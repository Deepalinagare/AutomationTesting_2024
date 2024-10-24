package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMwithPageFactoryRepository {
	
	public POMwithPageFactoryRepository(WebDriver wd) {
	
		PageFactory.initElements(wd, this);
	}

	@FindBy(id="user-name") WebElement username;
	@FindBy(name="password") WebElement password;
	@FindBy(id="login-button") WebElement login;
	@FindBy(xpath="//*[@id=\"menu_button_container\"]/div/div[3]/div/button") WebElement menu;
	@FindBy(partialLinkText="Logout") WebElement logout;
	
	
	public void login()
	{
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
	}
	
	public void logout()
	{
		menu.click();
		logout.click();
		
		
	}
	
}
