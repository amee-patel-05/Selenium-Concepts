package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

public class XpathAxes {

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
		
		a.findElement(By.xpath("//label[contains(text(),'Email')]/preceding-sibling::input")).sendKeys("AmeePatel");       // Sibling - preceding-sibing 
		//a.findElement(By.xpath("//label[normalize-space()='Name:']//following::input[@id='name']")).sendKeys("AmeePatel");  // sibling - following-sibling
		Thread.sleep(2000);
		
		a.findElement(By.xpath("//label[contains(text(),'Email')]/following-sibling::input")).sendKeys("ameepatel251@gmail.com");
		//a.findElement(By.xpath("//label[starts-with(text(),'Email')]/following-sibling::input")).sendKeys("Ameepatel251@gmail.com");
		a.findElement(By.xpath("//label[normalize-space()='Email:']//following::input[@id='email']/parent::div")).click();   	// parent
		Thread.sleep(2000);
		
		a.findElement(By.xpath("//div[@class='form-group']/child::input[3]")).sendKeys("+1(382)885-5597");		// child
		//a.findElement(By.xpath("//div[@class='form-group']/child::input[contains(@id,'phone')]")).sendKeys("+1(382)885-5597");		
		Thread.sleep(2000);
		
		a.findElement(By.xpath("//div[@class='form-group'][3]/descendant::input[2]")).click();  // descendant 
		Thread.sleep(2000);
		
		a.findElement(By.xpath("//input[@id='wednesday']/ancestor::div")).click();   // ancestor
		Thread.sleep(2000);

		System.out.println("Successfully executed XpathAxes");

		a.close();
		
	}

}
