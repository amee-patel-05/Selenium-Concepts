package WebDriverCommands;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

public class NavigationCommand {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});		// remove tester page notification
		
		WebDriver a = new ChromeDriver(options);
		
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		a.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(1000);
		
		a.manage().window().maximize();
		Thread.sleep(1000);
		
		a.get("https://www.youtube.com/");
		Thread.sleep(1000);
		
		a.navigate().back();		// navigate to previous page
		Thread.sleep(2000);
		
		a.navigate().forward();		// navigate to next page
		Thread.sleep(2000);
		
		a.navigate().refresh();		// Reload current page
		Thread.sleep(2000);

		System.out.println("Successfully executed navigation commands");
		
		a.close();
		
		
	}
}
