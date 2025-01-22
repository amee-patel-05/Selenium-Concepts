package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});  // remove tester page notification
		
		WebDriver a = new ChromeDriver(options);
		
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		a.get("https://testautomationpractice.blogspot.com/");
		Thread.sleep(1000);
		
		a.manage().window().maximize();
		Thread.sleep(1000);
		
		a.findElement(By.id("name")).sendKeys("Amee");		//	Id locater
		Thread.sleep(2000);
		a.findElement(By.className("form-control")).clear();		// className locator
		Thread.sleep(2000);	
		a.findElement(By.tagName("input")).sendKeys("Bhavya");		// tagName locator		
		Thread.sleep(2000);
		a.findElement(By.cssSelector("input[id='name']")).clear();		// cssSelector locator
		Thread.sleep(2000);
		a.findElement(By.xpath("//input[@id='name']")).sendKeys("Smit");		// Xpath locator
		Thread.sleep(2000);

		System.out.println("Successfully executed locators");

		a.close();
	}

}
