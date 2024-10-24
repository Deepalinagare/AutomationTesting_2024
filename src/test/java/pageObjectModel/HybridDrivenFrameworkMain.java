package pageObjectModel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class HybridDrivenFrameworkMain {

	public static void main(String[] args) throws Exception {
		
		WebDriver w= new ChromeDriver();
		w.get("https://www.saucedemo.com/v1/");
		w.manage().window().maximize();
		HybridDrivenFrameWorkRepo r = new HybridDrivenFrameWorkRepo(w);
		
		FileInputStream fis= new FileInputStream("C:\\Users\\deepali.n\\Downloads\\demo2.xlsx");
		XSSFWorkbook work= new XSSFWorkbook(fis);
		XSSFSheet sheet1 = work.getSheet("Sheet1");
		
		for(int j=1;j<=sheet1.getLastRowNum();j++)
		{
			XSSFRow data = sheet1.getRow(j);
			XSSFCell username= data.getCell(1);
			XSSFCell password = sheet1.getRow(1).getCell(2); // Password is only one hence its fixed path is given 
			
			for(int i =1; i<=2; i++)    
			{
				XSSFRow row= sheet1.getRow(i);
				XSSFCell teststep= row.getCell(0);
				try {
					if(teststep.toString().equals("Enter Data and click on login button")) 
					{
						r.EnterData(username.toString(),password.toString()); //Whatever data is in the file it will convert it into the string
						r.Loginin();
					}
					else if (teststep.toString().equals("Click on openmenu and click on logout button ")) {
						r.openMenu();
						Thread.sleep(2000);
						r.logout();
					}else {
						System.out.println("Invalid steps");
					}
				}catch(Exception e)
				{
					TakesScreenshot tss = (TakesScreenshot) w;
					FileHandler.copy(tss.getScreenshotAs(OutputType.FILE), new File("C:\\Users\\deepali.n\\Documents"+username.toString()+"   "+password.toString()+".png"));
				//+username.toString() give the same to taken screenshot with Space and again add this name to SS password.toString()
			
					
				}
				
			}
			
			
		}
		
	}

}
