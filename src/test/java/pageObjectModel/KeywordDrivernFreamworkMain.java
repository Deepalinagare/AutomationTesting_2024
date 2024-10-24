package pageObjectModel;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeywordDrivernFreamworkMain {

	public static void main(String[] args) throws Exception{

		WebDriver w = new ChromeDriver();
		KeywordDrivenFreameworkRepo r = new KeywordDrivenFreameworkRepo(w);
        w.get("https://www.saucedemo.com/v1/index.html");	
    	w.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		w.manage().window().maximize();
		FileInputStream fis= new FileInputStream("C:\\Users\\deepali.n\\Downloads\\demo1.xlsx");
		XSSFWorkbook work= new XSSFWorkbook(fis);
		XSSFSheet sheet= work.getSheet("Sheet1");
		
		for(int i =1; i<= sheet.getLastRowNum();i++)
		{
			XSSFRow row= sheet.getRow(i);
			XSSFCell teststep= row.getCell(0);
			
			if(teststep.toString().equals("Enter Data and click on login button"))
			{
				r.EnterData();
				r.Loginin();
			}
			else if(teststep.toString().equals("Click on openmenu and click on logout button "))
			{
				r.openMenu();
				Thread.sleep(2000);
				r.logout();
			}
			else {
				System.out.println("Invalid Steps");
			}
		}
		

	}

}
