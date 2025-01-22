package WebDriverCommands;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserCommand {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});		// remove tester page notification
		
		WebDriver a = new ChromeDriver(options);
		
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		a.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		
		a.manage().window().maximize();
		Thread.sleep(2000);
		
		System.out.println(a.getClass());     // get class name
		Thread.sleep(2000);
		
		System.out.println(a.getCurrentUrl());		// get current URL of the web page
		Thread.sleep(2000);
		
		System.out.println(a.getTitle());		// get title of the web page
		Thread.sleep(2000);
		
		System.out.println(a.getPageSource());    // get the current page source  code
		Thread.sleep(2000); 
		
		a.close();
		

	}

}
