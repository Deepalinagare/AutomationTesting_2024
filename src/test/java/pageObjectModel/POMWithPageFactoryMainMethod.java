package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMWithPageFactoryMainMethod {

	public static void main(String[] args) throws Exception {
		
		WebDriver w= new ChromeDriver();
		w.get("https://www.saucedemo.com/v1/index.html");
     	POMwithPageFactoryRepository p= new POMwithPageFactoryRepository(w);
		p.login();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		p.logout();

	}

}
