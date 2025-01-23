package ExtraFeatures;

import java.awt.Dimension;
import java.awt.Point;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mavenclass {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriver a = WebDriverManager.chromedriver().create();
		WebDriverManager.chromedriver().setup();
		
		/*DesiredCapabilities caps = new DesiredCapabilities();
		caps.setAcceptInsecureCerts(true);*/
		
		ChromeOptions options = new ChromeOptions();  // Desired capabilities in selenium WebDriver for Chrome
		options.addArguments("start-maximized");      // opens Chrome browser in maximized mode
		Thread.sleep(2000);
		/*options.addArguments("incognito");		// opens Chrome browser in incognito mode
		Thread.sleep(2000);
		options.addArguments("--headless");		 // open the Chrome browser in headless mode.
		Thread.sleep(2000);*/
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		
		WebDriver a = new ChromeDriver(options);
		
		//WebDriver a = new ChromeDriver();
		
		//JavascriptExecutor js = (JavascriptExecutor)a;
		
		//a.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		a.get("https://toolsqa.com/selenium-webdriver/actions-class-in-selenium/");
		Thread.sleep(2000);
		
		/*a.manage().window().maximize();
		Thread.sleep(1000);*/
		
		/*WebElement text = a.findElement(By.xpath("//h1[text()='Actions Class in Selenium']"));
		
		Actions action = new Actions(a);
		action.keyDown(text, Keys.CONTROL).sendKeys("c").build().perform();
		Thread.sleep(2000);
		
		a.navigate().to("https://testautomationpractice.blogspot.com/");
		Thread.sleep(2000);
		
		a.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement name = a.findElement(By.id("name"));
		action.keyDown(name, Keys.CONTROL).sendKeys("v").build().perform();*/
		
		a.close();
		
		

	}

}
