package ExtraFeatures;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleAuthentication {
	
	public static String username = "admin";
	public static String password = "admin";

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"}); // remove tester page notifications
		
		WebDriver a = new ChromeDriver(options);
		
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		a.manage().window().maximize();
		Thread.sleep(2000);
		
		a.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
		
		//a.get("https://"+username+":"+password+"@the-internet.herokuapp.com/digest_auth");
		Thread.sleep(2000);

		//a.close();
	}

}
