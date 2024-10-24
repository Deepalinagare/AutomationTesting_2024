package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMmainMethod {

	public static void main(String[] args) {
		
		WebDriver w= new ChromeDriver();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		w.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		OrangeHRMRepo o= new OrangeHRMRepo(w);
		o.login();
		o.pimFunction();
		o.dropdownSelection();
				
	}

}
