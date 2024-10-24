package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class saucedemoRepoWithoutPageFac {
	
	WebDriver w;
	
	public saucedemoRepoWithoutPageFac( WebDriver wd)
	{
	   	w=wd;
	}
	
	By username= By.id("user-name");
	By password = By.name("password");
	By login = By.id("login-button");
	By addcart= By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button");
	By menu= By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button");
	By logout= By.partialLinkText("Logout");
	
	
	public void insertValues()
	{
		w.findElement(username).sendKeys("standard_user");
		w.findElement(password).sendKeys("secret_sauce");
	}
	public void login()
	{
		w.findElement(login).click();
		
	}
	
	public void addtoCart()
	{
		w.findElement(addcart).click();
	}
	
	public void LogOut()
	{
		w.findElement(menu).click();
		w.findElement(logout).click();
	}

}



