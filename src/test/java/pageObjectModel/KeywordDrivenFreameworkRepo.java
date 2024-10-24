package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class KeywordDrivenFreameworkRepo {
	
	public KeywordDrivenFreameworkRepo(WebDriver w)
	{
		PageFactory.initElements(w,this);
	}
	
	@FindBy (name="user-name") WebElement username;
	@FindBy (id="password") WebElement password;
	@FindBy (css= "input[value=\"LOGIN\"]") WebElement loginbtn;
	@FindBy (xpath="//*[@id=\"menu_button_container\"]/div/div[3]/div/button") WebElement openmenu;
	@FindBy (partialLinkText ="Logout") WebElement logoutbtn;
	
	public void EnterData()
	{
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
	}
	public void Loginin()
	{
		loginbtn.click();
	}
	public void openMenu()
	{
		openmenu.click();
	}
	public void logout()
	{
		logoutbtn.click();
	}
	
	
	
	
	

}
