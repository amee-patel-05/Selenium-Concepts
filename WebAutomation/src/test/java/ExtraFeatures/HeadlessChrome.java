package ExtraFeatures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		//options.SetHeadless(true);
		options.addArguments("--headless");
		
		WebDriver a = new ChromeDriver(options);
		
		a.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(1000);
		
		System.out.println("Title of the page :  "+a.getTitle());
		Thread.sleep(1000);
		
		System.out.println("URL of the page :  "+a.getCurrentUrl());
		Thread.sleep(1000);
		
		a.close();
		
	}

}
