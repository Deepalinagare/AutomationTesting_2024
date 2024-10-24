package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HybridDrivenFrameWorkRepo {
	
	public HybridDrivenFrameWorkRepo (WebDriver wd) {
		PageFactory.initElements( wd,this);
}

	@FindBy (name="user-name") WebElement username;
	@FindBy (id="password") WebElement password;
	@FindBy (css= "input[value=\"LOGIN\"]") WebElement loginbtn;
	@FindBy (xpath="//*[@id=\"menu_button_container\"]/div/div[3]/div/button") WebElement openmenu;
	@FindBy (partialLinkText ="Logout") WebElement logoutbtn;
	
	public void EnterData(String user, String pass)
	{
		username.sendKeys(user);
		password.sendKeys(pass);
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
	public void clearData()
	{
		username.clear();
		password.clear();
	}
	
}
