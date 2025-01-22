package ExtraFeatures;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenLinks {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});		// remove tester page notification
		Thread.sleep(1000);
		
		WebDriver a = new ChromeDriver(options);
		
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		a.get("https://demo.guru99.com/test/newtours/");
		Thread.sleep(2000);
		
		a.manage().window().maximize();
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) a;
		js.executeScript("window.scrollBy(0,150)");
		Thread.sleep(1000);
		
		// Capture links from a webpage
		
		List<WebElement> links = a.findElements(By.tagName("a"));
		Thread.sleep(1000);
		
		//Count number of link(size)
		
		System.out.println(links.size());
		
		for(int i=0 ; i<links.size() ; i++)
		{
			// by using href attrubite we can get URL of required link
			WebElement element = links.get(i);
			String url =element.getAttribute("href");
			
			@SuppressWarnings("deprecation")
			URL link = new URL(url);
			
			// Create connection using URL object'link'
			HttpURLConnection connection = (HttpURLConnection) link.openConnection();
			Thread.sleep(1000);
			
			connection.connect(); // establish connection
			
			int rescode = connection.getResponseCode(); // return response code if res code is above 400: broken link 
			
			if(rescode>=400)
			{
				System.out.println(url +" - "+ "is broken link");
			}
			else
			{
				System.out.println(url +" - "+ "is valid link");
			}
			
		}
		
		a.close();
		
	}

}
