package pageObjectModel;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class twoFaDharwadRepo {
	  WebDriver w;
	  Scanner sc= new Scanner(System.in);
	  public twoFaDharwadRepo(WebDriver wd) {
		  w=wd;
   }
	  By username= By.cssSelector("input[placeholder=\"Enter User Id\"]");
	  By password= By.cssSelector("input[placeholder=\"Password\"]");
	  By loginbtn= By.cssSelector("button[type=\"submit\"]");
	 
	  // By tellermngmntbtn = By.partialLinkText("Teller Management ");
	  By tellerbtn= By.partialLinkText("input[placeholder=\"Search By Teller No/Mobile No\"]");
	  By SerachbtnTeller= By.xpath("/html/body/app-root/app-full/div/div/div/app-teller-list/div/div/div/div[1]/div[1]/form/div[1]/input");
	  
	  //Branch Management
	  By branchbtn= By.partialLinkText("Branch Management");
	  By createBranch= By.partialLinkText("Create Branch");
	  By branchName= By.xpath("/html/body/app-root/app-full/div/div/div/app-create-edit-branch/div/div/div/div/form/div[1]/input");
	  By branchNo = By.xpath("/html/body/app-root/app-full/div/div/div/app-create-edit-branch/div/div/div/div/form/div[2]/input");
	  By ifscB= By.xpath("/html/body/app-root/app-full/div/div/div/app-create-edit-branch/div/div/div/div/form/div[3]/input");
	  By saveBranch= By.xpath("//*[@class=\"ng-star-inserted ng-dirty ng-touched ng-valid\"]/div[4]/button");
	  By firstActiveInactiveBM= By.xpath("//*[@class=\"table-responsive\"]/table/tbody/tr[1]/td[3]");
	  
	  
	  
	  //Teller Management
	  By tellermgnttab = By.xpath("//*[@id=\"navbarNav\"]/ul/li[2]/a");
	  By serachTellerbox = By.cssSelector("input[name=\"search-text\"]");
	  By tellerActiveInactive= By.xpath("/html/body/app-root/app-full/div/div/div/app-teller-list/div/div/div/div[1]/div[2]/div[2]/table/tbody/tr");
	  
	  public void loginPageCorrect()
	  {
		  w.findElement(username).sendKeys("ADMIN");
		  w.findElement(password).sendKeys("Admin@123");
		  w.findElement(loginbtn).click();
	  }
	  public void clearLogin() throws InterruptedException
	  {
		  w.findElement(username).clear();
		  w.findElement(password).clear();  
		  Thread.sleep(2000);
	  }
	  
	  public void loginpagefail() throws InterruptedException
	  {
		  w.findElement(username).sendKeys("ADMIN");
		  w.findElement(password).sendKeys("Admin");
		  w.findElement(loginbtn).click();
		  clearLogin();
		  w.findElement(username).sendKeys("Cedge");
		  w.findElement(password).sendKeys("Admin@123");
		  w.findElement(loginbtn).click();
		  clearLogin();
		  w.findElement(username).sendKeys("Cedge");
		  w.findElement(password).sendKeys("@123");
		  w.findElement(loginbtn).click();
		  clearLogin();
		  }
	  
	  public void accountLocked()
	  {
	  w.findElement(loginbtn).click();
      }
	 
	  public void otpVerification()
	  {
		  w.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  }
	  
	  public void branchFun()
	  {
		  
		  w.findElement(branchbtn).click();
		  w.findElement(createBranch).click();
		  System.out.println("Enter the data to pass it on portal ");
		  System.out.println("Branch name");
		  String brNameStr= sc.nextLine();
		  w.findElement(branchName).sendKeys(brNameStr);
		  System.out.println("branchNo ");
		  String brNumStr= sc.nextLine();
		  w.findElement(branchNo).sendKeys(brNumStr);
		  System.out.println("IFSC");
		  String brifscStr= sc.nextLine();
		  w.findElement(ifscB).sendKeys(brifscStr);
		  w.findElement(saveBranch).click();
		  }
	  
	  public void branchFunActive()
	  {
		  w.findElement(branchbtn).click();
  		  w.findElement(firstActiveInactiveBM).click();
		  
  		WebElement modal = w.findElement(By.cssSelector(".modal-content"));

  	// Switch to the modal frame if necessary
  	// driver.switchTo().frame(modal);

  	WebElement yesButton = modal.findElement(By.cssSelector(".modal-footer button:nth-child(1)"));
  	yesButton.click();
		  
//		  String activeInactive=a.getText();
//		  if(activeInactive.contains("Are you sure you want to Activate"))
//		  {
//		  a.accept();
//		  }
//		  else
//		  {
//			  a.dismiss();
//		  }
		  
	  }

	  public void TellerManagemnat()
	  {
		  //w.findElement(tellermngmntbtn).click();
		  w.findElement(tellerbtn).click();
		  w.findElement(SerachbtnTeller).sendKeys("9874563218",Keys.ENTER);
		  w.findElement(SerachbtnTeller).clear();
		  System.out.println("Serach user for active inactive");
		  String TMActiveInactiveSearch= sc.nextLine();
		  w.findElement(SerachbtnTeller).sendKeys(TMActiveInactiveSearch,Keys.ENTER);
		  
	  }

}
