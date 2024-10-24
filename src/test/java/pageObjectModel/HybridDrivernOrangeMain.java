package pageObjectModel;

import java.io.File;
import java.io.FileInputStream;

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

public class HybridDrivernOrangeMain {

	public static void main(String[] args) throws Exception{
		
		WebDriver w= new ChromeDriver();
		
		w.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		w.manage().window().maximize();
		HybridDrivernOrangeRepo r= new HybridDrivernOrangeRepo(w);

		FileInputStream fis= new FileInputStream("C:\\Users\\deepali.n\\Downloads\\OrangeDemo.xlsx");
		XSSFWorkbook work= new XSSFWorkbook(fis);
		XSSFSheet sheet1 = work.getSheet("Sheet1");
		
		for(int j=1;j<=sheet1.getLastRowNum();j++) // Excel Rows
		{
			XSSFRow data = sheet1.getRow(j);
			XSSFCell username= data.getCell(1);
			XSSFCell password= data.getCell(2);
			
			for(int i =1;i<=3;i++)  //For number of steps as here steps are 3
			{
				XSSFRow rowStep = sheet1.getRow(i);
				XSSFCell celltestStep= rowStep.getCell(0);
				try {
				 if( celltestStep.toString().equals("login to page"))		
						 {
					       r.EnterLoginData(username.toString(),password.toString());
					       r.SubmitDetails();
						 }
				 
				}catch (Exception e) {
					TakesScreenshot tss = (TakesScreenshot) w;
					FileHandler.copy(tss.getScreenshotAs(OutputType.FILE), new File("C:\\Users\\deepali.n\\Desktop\\TestingScreenshot"+username.toString()+"   "+password.toString()+".png"));
					r.ClearData();
					
					
					
					
//					TakesScreenshot tss = (TakesScreenshot) w;
//					FileHandler.copy(tss.getScreenshotAs(OutputType.FILE), new File("C:\\Users\\deepali.n\\Documents"+username.toString()+"   "+password.toString()+".png"));
//				//+username.toString() give the same to taken screenshot with Space and again add this name to SS password.toString()
//					String errocodeprint= w.findElement(By.cssSelector("h3[data-test=\"error\"]")).getText();
//					System.out.println(errocodeprint);
//				    r.clearData();
//				    w.navigate().refresh();
				}
			
			}
			
		}
		
		
 }
}
		