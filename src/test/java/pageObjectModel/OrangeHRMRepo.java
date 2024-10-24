package pageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMRepo {
	

	public OrangeHRMRepo(WebDriver w)
	{
	PageFactory.initElements(w,this);
	}

//@FindBy(css = "input[placeholder=\"Username\"]") WebElement username;
@FindBy(name="username") WebElement usernm;

//WebElement user= we.findElement(By.cssSelector("input[placeholder=\"Username\"]"));
//@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input") WebElement user; 
	
//@FindBy(id="user-name") WebElement user;
	
@FindBy(name="password") WebElement Pass;
@FindBy(xpath="//*[@class=\"oxd-form-actions orangehrm-login-action\"]/button") WebElement loginbtn;
@FindBy(partialLinkText ="PIM") WebElement pimbtn;
@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div/div[2]/i") WebElement arrow;
@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div[1]/div[2]/div") List<WebElement>  DropDown;
	public void login() {
		
		usernm.sendKeys("Admin");
		Pass.sendKeys("admin123");
		loginbtn.click();
		
	}
	
	public void pimFunction()
	{
		pimbtn.click();
		arrow.click();
		
	}
	public void dropdownSelection()
	{
		//arrow.click();
	
		for (WebElement j :DropDown)	
		{
			if(j.getText().equals("Content Specialist"))
			{
				j.click();
			}
		}
	}
	
}
