package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});  // remove tester page notification
		
		WebDriver a = new ChromeDriver(options);
		
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Simple Selectors
		
//		a.get("https://testautomationpractice.blogspot.com/");
//		Thread.sleep(1000);
//
//		a.manage().window().maximize();
//		Thread.sleep(1000);
//
//		a.findElement(By.cssSelector("input[id='name']")).sendKeys("Amee Patel");  // element
//		Thread.sleep(2000);
//
//		a.findElement(By.cssSelector("#email")).sendKeys("ameepatel251@gmail.com");  // id
//		Thread.sleep(2000);
//
//		//a.findElement(By.cssSelector(".form-control[3]")).sendKeys("+1(382)885-5597"); // must be unique class name //class
//
//		System.out.println("Display the size of the screen:  "+a.findElement(By.cssSelector("*")).getSize());  // universal
//		Thread.sleep(2000);
				
		// Attribute Selectors
				
		a.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		Thread.sleep(2000);

		a.manage().window().maximize();
		Thread.sleep(2000);

		System.out.println(a.findElement(By.cssSelector(" input[placeholder]")).isDisplayed());						// AttributeName
		System.out.println(a.findElement(By.cssSelector(" input[placeholder='First Name']")).isEnabled());			// AttributeValue
		System.out.println(a.findElement(By.cssSelector("input[placeholder~='security']")).isSelected());			// AttributeValue - partial text - whole word
		System.out.println(a.findElement(By.cssSelector("input[placeholder*='curi']")).getAccessibleName());		// AttributeValue - partial text - text
		System.out.println(a.findElement(By.cssSelector("p[class|='top']")).getClass());							// AttributeValue - starts-with - whole word
		System.out.println(a.findElement(By.cssSelector("p[class^='top']")).getText());								// AttributeValue - starts-with - text
		System.out.println(a.findElement(By.cssSelector("input[placeholder$='answer']")).getTagName());			// AttributeValue - end-with

		System.out.println("Successfully executed css selector");

		a.close();

	}

}
