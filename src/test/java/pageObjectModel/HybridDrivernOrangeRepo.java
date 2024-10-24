package pageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HybridDrivernOrangeRepo {
	
	public HybridDrivernOrangeRepo (WebDriver wd)
	{
		PageFactory.initElements(wd, this);
	}
	
     @FindBy(name="username") WebElement username;
     @FindBy (name="password") WebElement password;
     @FindBy (css= "button[type=\"submit\"]") WebElement submit;
     //@FindBy (partialLinkText ="PIM") WebElement pimtabBtn;
     @FindBy (xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span") WebElement pimtabBtn;
     @FindBy (xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div/div[2]/i") WebElement dropdownpin;
     @FindBy (xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div[2]/div") List<WebElement> selectiondropdown;
     
     @FindBy (xpath ="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i") WebElement dropdownLogout;
     
     public void EnterLoginData(String user, String pass)
     {
    	 username.sendKeys(user);
    	 password.sendKeys(pass);
    	
     }
     public void SubmitDetails()
     {
    	 submit.click();
     }
     public void pimtabSelection()
     {
    	 pimtabBtn.click();
     }
     
     public void DropdownPIM()
     {
    	 for(WebElement j: selectiondropdown)
    	 {if (j.getText().equals("Finance Manager"))
    	 {
    		 j.click();
    		 break;
    	 }
    		 
    	 }
     }
     
     public void ClearData()
     {
    	 username.clear();
    	 password.clear();
     }
}

